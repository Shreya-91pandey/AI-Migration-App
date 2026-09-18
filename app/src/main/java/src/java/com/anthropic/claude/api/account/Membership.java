package com.anthropic.claude.api.account;

import com.anthropic.claude.api.notification.Preferences;

@jzk
public final class Membership
{
    public static final rse Companion;
    public final Organization a = a;
    public final String b = b;
    public final hfc c = c;
    public final hfc d = d;
    public final Preferences e = e;
    
    static {
        Companion = (rse)new Object();
    }
    
    public Membership(final Organization a, final String b, final hfc c, final hfc d, final Preferences e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static Membership a(final Membership membership, final Preferences preferences) {
        return new Membership(membership.a, membership.b, membership.c, membership.d, preferences);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Membership)) {
            return false;
        }
        final Membership membership = (Membership)o;
        return mlc.q((Object)this.a, (Object)membership.a) && mlc.q((Object)this.b, (Object)membership.b) && mlc.q((Object)this.c, (Object)membership.c) && mlc.q((Object)this.d, (Object)membership.d) && mlc.q((Object)this.e, (Object)membership.e);
    }
    
    @Override
    public final int hashCode() {
        final int e = t.e(t.e(smk.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        final Preferences e2 = this.e;
        int hashCode;
        if (e2 == null) {
            hashCode = 0;
        }
        else {
            hashCode = e2.hashCode();
        }
        return e + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Membership(organization=");
        sb.append((Object)this.a);
        sb.append(", role=");
        sb.append(this.b);
        sb.append(", created_at=");
        sb.append((Object)this.c);
        sb.append(", updated_at=");
        sb.append((Object)this.d);
        sb.append(", notification_preferences=");
        sb.append((Object)this.e);
        sb.append(")");
        return sb.toString();
    }
}
