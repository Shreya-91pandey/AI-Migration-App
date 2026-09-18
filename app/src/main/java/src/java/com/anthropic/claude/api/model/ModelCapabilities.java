package com.anthropic.claude.api.model;

@jzk
public final class ModelCapabilities
{
    public static final hdf Companion;
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    
    static {
        Companion = (hdf)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelCapabilities)) {
            return false;
        }
        final ModelCapabilities modelCapabilities = (ModelCapabilities)o;
        return mlc.q((Object)this.a, (Object)modelCapabilities.a) && mlc.q((Object)this.b, (Object)modelCapabilities.b) && mlc.q((Object)this.c, (Object)modelCapabilities.c) && mlc.q((Object)this.d, (Object)modelCapabilities.d);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Boolean a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ModelCapabilities(mm_pdf=");
        sb.append((Object)this.a);
        sb.append(", mm_images=");
        sb.append((Object)this.b);
        sb.append(", web_search=");
        sb.append((Object)this.c);
        sb.append(", compass=");
        sb.append((Object)this.d);
        sb.append(")");
        return sb.toString();
    }
}
