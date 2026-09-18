package com.anthropic.claude.api.notification;

@jzk
public final class Preferences
{
    public static final jjh Companion;
    public final FeaturePreference a;
    
    static {
        Companion = (jjh)new Object();
    }
    
    public Preferences(final FeaturePreference a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof Preferences && mlc.q((Object)this.a, (Object)((Preferences)o).a));
    }
    
    @Override
    public final int hashCode() {
        final FeaturePreference a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Preferences(feature_preference=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
