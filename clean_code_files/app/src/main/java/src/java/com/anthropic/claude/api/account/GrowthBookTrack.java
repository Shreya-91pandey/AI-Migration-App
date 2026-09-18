package com.anthropic.claude.api.account;

@jzk
public final class GrowthBookTrack
{
    public static final gab Companion;
    public final GrowthBookExperiment a = a;
    public final GrowthBookExperimentResult b = b;
    
    static {
        Companion = (gab)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrowthBookTrack)) {
            return false;
        }
        final GrowthBookTrack growthBookTrack = (GrowthBookTrack)o;
        return mlc.q((Object)this.a, (Object)growthBookTrack.a) && mlc.q((Object)this.b, (Object)growthBookTrack.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GrowthBookTrack(experiment=");
        sb.append((Object)this.a);
        sb.append(", result=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
