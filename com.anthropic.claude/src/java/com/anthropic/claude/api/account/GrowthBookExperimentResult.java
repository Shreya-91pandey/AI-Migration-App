package com.anthropic.claude.api.account;

import kotlinx.serialization.json.JsonElement;

@jzk
public final class GrowthBookExperimentResult
{
    public static final q8b Companion;
    public final Boolean a;
    public final Integer b;
    public final JsonElement c;
    public final Boolean d;
    
    static {
        Companion = (q8b)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrowthBookExperimentResult)) {
            return false;
        }
        final GrowthBookExperimentResult growthBookExperimentResult = (GrowthBookExperimentResult)o;
        return mlc.q((Object)this.a, (Object)growthBookExperimentResult.a) && mlc.q((Object)this.b, (Object)growthBookExperimentResult.b) && mlc.q((Object)this.c, (Object)growthBookExperimentResult.c) && mlc.q((Object)this.d, (Object)growthBookExperimentResult.d);
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
        final Integer b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final JsonElement c = this.c;
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
        final StringBuilder sb = new StringBuilder("GrowthBookExperimentResult(inExperiment=");
        sb.append((Object)this.a);
        sb.append(", variationId=");
        sb.append((Object)this.b);
        sb.append(", value=");
        sb.append((Object)this.c);
        sb.append(", hashUsed=");
        sb.append((Object)this.d);
        sb.append(")");
        return sb.toString();
    }
}
