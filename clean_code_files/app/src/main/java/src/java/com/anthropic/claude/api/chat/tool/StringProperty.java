package com.anthropic.claude.api.chat.tool;

import java.util.List;

@jzk
public final class StringProperty implements PropertyDefinition
{
    public static final bym Companion;
    public static final d2d[] f;
    public final String a;
    public final List b;
    public final String c;
    public final Integer d;
    public final Integer e;
    
    static {
        Companion = (bym)new Object();
        f = new d2d[] { null, ncq.F(2, (jta)new s8k((byte)18)), null, null, null };
    }
    
    public StringProperty(final int n, List b, String a) {
        if ((n & 0x1) != 0x0) {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = null;
        }
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
        this.e = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StringProperty)) {
            return false;
        }
        final StringProperty stringProperty = (StringProperty)o;
        return mlc.q((Object)this.a, (Object)stringProperty.a) && mlc.q((Object)this.b, (Object)stringProperty.b) && mlc.q((Object)this.c, (Object)stringProperty.c) && mlc.q((Object)this.d, (Object)stringProperty.d) && mlc.q((Object)this.e, (Object)stringProperty.e);
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
        final List b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Integer e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder l = guc.l("StringProperty(description=", this.a, ", enum=", this.b, ", pattern=");
        o47.c(this.d, this.c, ", minLength=", ", maxLength=", l);
        return ju4.c(l, this.e, ")");
    }
}
