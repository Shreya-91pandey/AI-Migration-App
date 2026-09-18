package com.anthropic.claude.api.account;

import com.anthropic.claude.types.strings.OrganizationId;
import java.util.List;

@jzk
public final class Organization
{
    public static final ogg Companion;
    public static final d2d[] p;
    public final String a = a;
    public final String b = b;
    public final OrganizationSettings c = c;
    public final List d = d;
    public final RavenType e;
    public final String f;
    public final String g;
    public final RateLimitUpsell h;
    public final String i;
    public final String j;
    public final hfc k;
    public final hfc l;
    public final SubscriptionPauseHint m;
    public final BillingIssue n;
    public final List o;
    
    static {
        Companion = (ogg)new Object();
        p = new d2d[] { null, null, null, ncq.F(2, (jta)new mff((byte)12)), null, null, null, null, null, null, null, null, null, null, ncq.F(2, (jta)new mff((byte)13)) };
    }
    
    public Organization(final String a, final String b, final OrganizationSettings c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (List)r89.v;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = SubscriptionPauseHint.v;
        this.n = null;
        this.o = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Organization)) {
            return false;
        }
        final Organization organization = (Organization)o;
        return mlc.q((Object)this.a, (Object)organization.a) && mlc.q((Object)this.b, (Object)organization.b) && mlc.q((Object)this.c, (Object)organization.c) && mlc.q((Object)this.d, (Object)organization.d) && this.e == organization.e && mlc.q((Object)this.f, (Object)organization.f) && mlc.q((Object)this.g, (Object)organization.g) && this.h == organization.h && mlc.q((Object)this.i, (Object)organization.i) && mlc.q((Object)this.j, (Object)organization.j) && mlc.q((Object)this.k, (Object)organization.k) && mlc.q((Object)this.l, (Object)organization.l) && this.m == organization.m && mlc.q((Object)this.n, (Object)organization.n) && mlc.q((Object)this.o, (Object)organization.o);
    }
    
    @Override
    public final int hashCode() {
        final int k = smk.k((this.c.hashCode() + smk.j(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        int hashCode = 0;
        final RavenType e = this.e;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final String f = this.f;
        int hashCode3;
        if (f == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = f.hashCode();
        }
        final String g = this.g;
        int hashCode4;
        if (g == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = g.hashCode();
        }
        final RateLimitUpsell h = this.h;
        int hashCode5;
        if (h == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = h.hashCode();
        }
        final String i = this.i;
        int hashCode6;
        if (i == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = i.hashCode();
        }
        final String j = this.j;
        int hashCode7;
        if (j == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = j.hashCode();
        }
        final hfc l = this.k;
        int hashCode8;
        if (l == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = l.hashCode();
        }
        final hfc m = this.l;
        int hashCode9;
        if (m == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = m.hashCode();
        }
        final int hashCode10 = this.m.hashCode();
        final BillingIssue n = this.n;
        int hashCode11;
        if (n == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = n.hashCode();
        }
        final List o = this.o;
        if (o != null) {
            hashCode = o.hashCode();
        }
        return ((hashCode10 + ((((((((k + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31) * 31 + hashCode11) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("Organization(uuid=", OrganizationId.a(this.a), ", name=", this.b, ", settings=");
        t.append((Object)this.c);
        t.append(", capabilities=");
        t.append((Object)this.d);
        t.append(", raven_type=");
        t.append((Object)this.e);
        t.append(", analytics_subscription_plan=");
        t.append(this.f);
        t.append(", billing_type=");
        t.append(this.g);
        t.append(", rate_limit_upsell=");
        t.append((Object)this.h);
        t.append(", free_credits_status=");
        oz1.A(t, this.i, ", api_disabled_reason=", this.j, ", api_disabled_until=");
        t.append((Object)this.k);
        t.append(", billable_usage_paused_until=");
        t.append((Object)this.l);
        t.append(", subscription_pause=");
        t.append((Object)this.m);
        t.append(", billing_issue=");
        t.append((Object)this.n);
        t.append(", claude_ai_bootstrap_models_config=");
        return p3g.e(t, this.o, ")");
    }
}
