package com.anthropic.claude.api.account;

import kotlinx.serialization.json.JsonObject;
import java.util.Map;

@jzk
public final class GrowthBookSchema
{
    public static final dab Companion;
    public final Map a = a;
    public final String b;
    public final JsonObject c;
    
    static {
        Companion = (dab)new Object();
    }
    
    public GrowthBookSchema() {
        this.a = (Map)s89.v;
        this.b = null;
        this.c = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrowthBookSchema)) {
            return false;
        }
        final GrowthBookSchema growthBookSchema = (GrowthBookSchema)o;
        return mlc.q((Object)this.a, (Object)growthBookSchema.a) && mlc.q((Object)this.b, (Object)growthBookSchema.b) && mlc.q((Object)this.c, (Object)growthBookSchema.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final JsonObject c = this.c;
        if (c != null) {
            hashCode2 = c.v.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GrowthBookSchema(features=");
        sb.append((Object)this.a);
        sb.append(", hashing_algorithm=");
        sb.append(this.b);
        sb.append(", user=");
        sb.append((Object)this.c);
        sb.append(")");
        return sb.toString();
    }
}
