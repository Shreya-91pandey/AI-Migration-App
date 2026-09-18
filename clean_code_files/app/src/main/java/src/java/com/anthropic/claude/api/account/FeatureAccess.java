package com.anthropic.claude.api.account;

@jzk
public final class FeatureAccess
{
    public static final q5a Companion;
    public final String a = a;
    public final FeatureAccessStatus b = b;
    
    static {
        Companion = (q5a)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FeatureAccess)) {
            return false;
        }
        final FeatureAccess featureAccess = (FeatureAccess)o;
        return mlc.q((Object)this.a, (Object)featureAccess.a) && this.b == featureAccess.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FeatureAccess(feature=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
