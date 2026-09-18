package com.anthropic.claude.api.account;

import java.util.List;
import kotlinx.serialization.json.JsonElement;

@jzk
public final class GrowthBookFeature
{
    public static final u8b Companion;
    public static final d2d[] c;
    public final JsonElement a = a;
    public final List b;
    
    static {
        Companion = (u8b)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new ux8((byte)27)) };
    }
    
    public GrowthBookFeature(final JsonElement a) {
        this.a = a;
        this.b = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrowthBookFeature)) {
            return false;
        }
        final GrowthBookFeature growthBookFeature = (GrowthBookFeature)o;
        return mlc.q((Object)this.a, (Object)growthBookFeature.a) && mlc.q((Object)this.b, (Object)growthBookFeature.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final List b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GrowthBookFeature(defaultValue=");
        sb.append((Object)this.a);
        sb.append(", rules=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
