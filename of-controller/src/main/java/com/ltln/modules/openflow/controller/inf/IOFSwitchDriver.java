/**
 *    Copyright 2013, Big Switch Networks, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License"); you may
 *    not use this file except in compliance with the License. You may obtain
 *    a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *    License for the specific language governing permissions and limitations
 *    under the License.
 **/

package com.ltln.modules.openflow.controller.inf;


import com.ltln.modules.openflow.core.protocol.OFFactory;

public interface IOFSwitchDriver {
    /**
     * Return an IOFSwitch object based on switch's manufacturer description
     * from OFDescriptionStatitics.
     * @param description DescriptionStatistics from the switch instance
     * @return A IOFSwitch instance if the driver found an implementation
     * for the given description. Null otherwise
     */
    public IOFSwitchBackend getOFSwitchImpl(SwitchDescription description, OFFactory factory);
}