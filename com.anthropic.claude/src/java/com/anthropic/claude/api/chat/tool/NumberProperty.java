package com.anthropic.claude.api.chat.tool;

@jzk
public final class NumberProperty implements PropertyDefinition
{
    public static final s3g Companion;
    public final String a;
    public final Double b;
    public final Double c;
    
    static {
        Companion = (s3g)new Object();
    }
    
    public NumberProperty(String a, final int n) {
        if ((n & 0x1) != 0x0) {
            a = null;
        }
        this.a = a;
        this.b = null;
        this.c = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NumberProperty)) {
            return false;
        }
        final NumberProperty numberProperty = (NumberProperty)o;
        return mlc.q((Object)this.a, (Object)numberProperty.a) && mlc.q((Object)this.b, (Object)numberProperty.b) && mlc.q((Object)this.c, (Object)numberProperty.c);
    }
    
    @Override
    public final String getDescription() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Double b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Double c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NumberProperty(description=");
        sb.append(this.a);
        sb.append(", minimum=");
        sb.append((Object)this.b);
        sb.append(", maximum=");
        sb.append((Object)this.c);
        sb.append(")");
        return sb.toString();
    }
}
