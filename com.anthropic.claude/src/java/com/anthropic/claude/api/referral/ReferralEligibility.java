package com.anthropic.claude.api.referral;

@jzk
public final class ReferralEligibility
{
    public static final i4j Companion;
    public final boolean a = a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final ReferrerReward f;
    
    static {
        Companion = (i4j)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReferralEligibility)) {
            return false;
        }
        final ReferralEligibility referralEligibility = (ReferralEligibility)o;
        return this.a == referralEligibility.a && mlc.q((Object)this.b, (Object)referralEligibility.b) && mlc.q((Object)this.c, (Object)referralEligibility.c) && mlc.q((Object)this.d, (Object)referralEligibility.d) && mlc.q((Object)this.e, (Object)referralEligibility.e) && mlc.q((Object)this.f, (Object)referralEligibility.f);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = Boolean.hashCode(this.a);
        int hashCode2 = 0;
        final Integer b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final ReferrerReward f = this.f;
        if (f != null) {
            hashCode2 = f.hashCode();
        }
        return ((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ReferralEligibility(eligible=");
        sb.append(this.a);
        sb.append(", remaining_passes=");
        sb.append((Object)this.b);
        sb.append(", limit=");
        xc2.n(this.c, ", share_link=", this.d, ", terms_url=", sb);
        sb.append(this.e);
        sb.append(", referrer_reward=");
        sb.append((Object)this.f);
        sb.append(")");
        return sb.toString();
    }
}
