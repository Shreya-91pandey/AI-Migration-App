package com.anthropic.claude.api.account;

import java.util.List;
import kotlinx.serialization.json.JsonElement;

@jzk
public final class GrowthBookRule
{
    public static final bab Companion;
    public static final d2d[] d;
    public final JsonElement a;
    public final List b;
    public final String c;
    
    static {
        Companion = (bab)new Object();
        d = new d2d[] { null, ncq.F(2, (jta)new ux8((byte)29)), null };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrowthBookRule)) {
            return false;
        }
        final GrowthBookRule growthBookRule = (GrowthBookRule)o;
        return mlc.q((Object)this.a, (Object)growthBookRule.a) && mlc.q((Object)this.b, (Object)growthBookRule.b) && mlc.q((Object)this.c, (Object)growthBookRule.c);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final JsonElement a = this.a;
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
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GrowthBookRule(force=");
        sb.append((Object)this.a);
        sb.append(", tracks=");
        sb.append((Object)this.b);
        sb.append(", id=");
        return oz1.p(sb, this.c, ")");
    }
}
