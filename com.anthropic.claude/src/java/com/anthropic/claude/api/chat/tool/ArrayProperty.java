package com.anthropic.claude.api.chat.tool;

@jzk
public final class ArrayProperty implements PropertyDefinition
{
    public static final dw0 Companion;
    public static final d2d[] e;
    public final String a;
    public final PropertyDefinition b;
    public final Integer c;
    public final Integer d;
    
    static {
        Companion = (dw0)new Object();
        e = new d2d[] { null, ncq.F(2, (jta)new kh0((byte)18)), null, null };
    }
    
    public ArrayProperty(final String a, final PropertyDefinition b) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArrayProperty)) {
            return false;
        }
        final ArrayProperty arrayProperty = (ArrayProperty)o;
        return mlc.q((Object)this.a, (Object)arrayProperty.a) && mlc.q((Object)this.b, (Object)arrayProperty.b) && mlc.q((Object)this.c, (Object)arrayProperty.c) && mlc.q((Object)this.d, (Object)arrayProperty.d);
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
        final PropertyDefinition b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Integer d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ArrayProperty(description=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append((Object)this.b);
        sb.append(", minItems=");
        sb.append((Object)this.c);
        sb.append(", maxItems=");
        sb.append((Object)this.d);
        sb.append(")");
        return sb.toString();
    }
}
