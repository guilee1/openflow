package com.ltln.modules.openflow.controller.manager;

import java.util.Collection;

/**
 * A marker interface indicating that this Collection defines a particular
 * iteration order. The details about the iteration order are specified by
 * the concrete implementation.
 * @author gregor
 *
 * @param <E>
 */
public interface OrderedCollection<E> extends Collection<E> {

}
