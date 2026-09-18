package com.anthropic.claude.api.account;

import java.util.Iterator;
import com.anthropic.claude.api.feature.Feature;
import java.util.List;

@jzk
public final class CurrentUserAccess
{
    public static final jr7 Companion;
    public static final d2d[] c;
    public final List a;
    public final List b;
    
    static {
        Companion = (jr7)new Object();
        c = new d2d[] { ncq.F(2, (jta)new cm6((byte)23)), ncq.F(2, (jta)new cm6((byte)24)) };
    }
    
    public final FeatureAccessStatus a(final Feature feature) {
        while (true) {
            for (final Object next : this.a) {
                if (mlc.q((Object)((FeatureAccess)next).a, (Object)feature.v)) {
                    final FeatureAccess featureAccess = (FeatureAccess)next;
                    final FeatureAccess featureAccess2 = featureAccess;
                    if (featureAccess2 != null) {
                        return featureAccess2.b;
                    }
                    return null;
                }
            }
            final FeatureAccess featureAccess = null;
            continue;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CurrentUserAccess)) {
            return false;
        }
        final CurrentUserAccess currentUserAccess = (CurrentUserAccess)o;
        return mlc.q((Object)this.a, (Object)currentUserAccess.a) && mlc.q((Object)this.b, (Object)currentUserAccess.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CurrentUserAccess(features=");
        sb.append((Object)this.a);
        sb.append(", account_features=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
