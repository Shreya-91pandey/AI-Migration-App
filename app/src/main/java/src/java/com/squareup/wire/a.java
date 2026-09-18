package com.squareup.wire;

import java.io.OutputStream;
import java.io.Serializable;

public abstract class a implements Serializable
{
    public static final l1f Companion;
    private static final long serialVersionUID = 0L;
    private final transient ProtoAdapter<a> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient is2 unknownFields;
    
    static {
        Companion = (l1f)new Object();
    }
    
    public a(final ProtoAdapter adapter, final is2 unknownFields) {
        this.adapter = adapter;
        this.unknownFields = unknownFields;
    }
    
    public final ProtoAdapter<a> adapter() {
        return this.adapter;
    }
    
    public final void encode(final OutputStream outputStream) {
        this.adapter.encode(outputStream, this);
    }
    
    public final void encode(final pn2 pn2) {
        this.adapter.encode(pn2, this);
    }
    
    public final byte[] encode() {
        return this.adapter.encode(this);
    }
    
    public final is2 encodeByteString() {
        return this.adapter.encodeByteString(this);
    }
    
    public final int getCachedSerializedSize$wire_runtime() {
        return this.cachedSerializedSize;
    }
    
    public /* synthetic */ j1f newBuilder() {
        throw new AssertionError((Object)"Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }
    
    public final void setCachedSerializedSize$wire_runtime(final int cachedSerializedSize) {
        this.cachedSerializedSize = cachedSerializedSize;
    }
    
    public is2 unknownFields() {
        is2 is2;
        if ((is2 = this.unknownFields) == null) {
            is2 = is2.y;
        }
        return is2;
    }
    
    public final a withoutUnknownFields() {
        final j1f builder = this.newBuilder();
        builder.a = is2.y;
        final an2 b = builder.b;
        if (b != null) {
            b.c();
            builder.b = null;
        }
        builder.c = null;
        return builder.a();
    }
    
    public final Object writeReplace() {
        this.encode();
        return new n7f();
    }
}
