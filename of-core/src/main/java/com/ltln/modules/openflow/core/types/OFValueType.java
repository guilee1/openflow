package com.ltln.modules.openflow.core.types;




public interface OFValueType<T extends OFValueType<T>> extends Comparable<T>, PrimitiveSinkable {
    public int getLength();

    public T applyMask(T mask);

}
