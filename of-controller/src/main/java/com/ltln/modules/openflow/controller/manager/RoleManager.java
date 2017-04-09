package com.ltln.modules.openflow.controller.manager;

import java.util.Date;

import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;
import com.ltln.modules.openflow.controller.inf.HARole;
import com.ltln.modules.openflow.controller.inf.RoleInfo;
import com.ltln.modules.openflow.core.protocol.OFControllerRole;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * A utility class to manage the <i>controller roles</i>.
 *
 * A utility class to manage the <i>controller roles</i>  as opposed
 * to the switch roles. The class manages the controllers current role,
 * handles role change requests, and maintains the list of connected
 * switch(-channel) so it can notify the switches of role changes.
 *
 * We need to ensure that every connected switch is always send the
 * correct role. Therefore, switch add, sending of the initial role, and
 * changing role need to use mutexes to ensure this. This has the ugly
 * side-effect of requiring calls between controller and OFChannelHandler
 *
 * This class is fully thread safe. Its method can safely be called from
 * any thread.
 *
 * @author gregor
 *
 */
public class RoleManager {
    private volatile RoleInfo currentRoleInfo;

    private static final Logger log =
            LoggerFactory.getLogger(RoleManager.class);

    /**
     * @param role initial role
     * @param roleChangeDescription initial value of the change description
     * @throws NullPointerException if role or roleChangeDescription is null
     */
    public RoleManager(
            @Nonnull HARole role,
            @Nonnull String roleChangeDescription) {
        Preconditions.checkNotNull(role, "role must not be null");
        Preconditions.checkNotNull(roleChangeDescription, "roleChangeDescription must not be null");

        this.currentRoleInfo = new RoleInfo(role,
                                       roleChangeDescription,
                                       new Date());
    }

    /**
     * Re-assert a role for the given channel handler.
     *
     * The caller specifies the role that should be reasserted. We only
     * reassert the role if the controller's current role matches the
     * reasserted role and there is no role request for the reasserted role
     * pending.
     * @param ofSwitchHandshakeHandler The OFChannelHandler on which we should reassert.
     * @param role The role to reassert
     */
    public synchronized void reassertRole(OFSwitchHandshakeHandler ofSwitchHandshakeHandler, HARole role) {
        // check if the requested reassertion actually makes sense
        if (this.getRole() != role)
            return;
        ofSwitchHandshakeHandler.sendRoleRequestIfNotPending(this.getRole().getOFRole());
    }

    /**
     * Set the controller's new role and notify switches.
     *
     * This method updates the controllers current role and notifies all
     * connected switches of the new role is different from the current
     * role. We dampen calls to this method. See class description for
     * details.
     *
     * @param role The new role.
     * @param roleChangeDescription A textual description of why the role
     * was changed. For information purposes only.
     * @throws NullPointerException if role or roleChangeDescription is null
     */
    public synchronized void setRole(@Nonnull HARole role, @Nonnull String roleChangeDescription) {
        Preconditions.checkNotNull(role, "role must not be null");
        Preconditions.checkNotNull(roleChangeDescription, "roleChangeDescription must not be null");

        if (role == getRole()) {
            log.debug("Received role request for {} but controller is "
                    + "already {}. Ignoring it.", role, this.getRole());
            return;
        }

        if (this.getRole() == HARole.STANDBY && role == HARole.ACTIVE) {
            // At this point we are guaranteed that we will execute the code
            // below exactly once during the lifetime of this process! And
            // it will be a to MASTER transition
        }

        log.info("Received role request for {} (reason: {})."
                + " Initiating transition", role, roleChangeDescription);

        currentRoleInfo =
                new RoleInfo(role, roleChangeDescription, new Date());

//        controller.addUpdateToQueue(new HARoleUpdate(role));
//        controller.addUpdateToQueue(new SwitchRoleUpdate(role));

    }

    @SuppressFBWarnings(value="UG_SYNC_SET_UNSYNC_GET",
                        justification = "setter is synchronized for mutual exclusion, "
                                + "currentRoleInfo is volatile, so no sync on getter needed")
    public synchronized HARole getRole() {
        return currentRoleInfo.getRole();
    }

    public synchronized OFControllerRole getOFControllerRole() {
        return getRole().getOFRole();
    }

    /**
     * Return the RoleInfo object describing the current role.
     *
     * Return the RoleInfo object describing the current role. The
     * RoleInfo object is used by REST API users.
     * @return the current RoleInfo object
     */
    public RoleInfo getRoleInfo() {
        return currentRoleInfo;
    }


    public void notifyControllerConnectionUpdate() {
        if(currentRoleInfo.getRole() != HARole.ACTIVE) {
//            attemptActiveTransition();
        }
    }

}
