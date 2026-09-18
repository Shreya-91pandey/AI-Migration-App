package com.anthropic.claude.app.appstart;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@jzk
public final class CachedData<T>
{
    public static final uw2 Companion;
    public static final PluginGeneratedSerialDescriptor d;
    public final Object a = a;
    public final long b = b;
    public final String c;
    
    static {
        Companion = (uw2)new Object();
        final PluginGeneratedSerialDescriptor d2 = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.appstart.CachedData", (axa)null, 3);
        d2.l("response", false);
        d2.l("cachedAtMillis", false);
        d2.l("variant", true);
        d = d2;
    }
    
    public CachedData(final Object a, final long b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CachedData)) {
            return false;
        }
        final CachedData cachedData = (CachedData)o;
        return mlc.q(this.a, cachedData.a) && this.b == cachedData.b && mlc.q((Object)this.c, (Object)cachedData.c);
    }
    
    @Override
    public final int hashCode() {
        final int n = 0;
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int d = hia.d(hashCode * 31, this.b, 31);
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return d + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CachedData(response=");
        sb.append(this.a);
        sb.append(", cachedAtMillis=");
        sb.append(this.b);
        return lmf.u(sb, ", variant=", this.c, ")");
    }
}
