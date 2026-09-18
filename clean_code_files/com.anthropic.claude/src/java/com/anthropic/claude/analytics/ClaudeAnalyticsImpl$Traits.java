package com.anthropic.claude.analytics;

import com.anthropic.claude.types.strings.EmailAddress;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.AccountId;

@jzk
final class ClaudeAnalyticsImpl$Traits
{
    public static final tt4 Companion;
    public final String a = a;
    public final String b = b;
    public final String c = c;
    public final String d = d;
    public final String e;
    
    static {
        Companion = (tt4)new Object();
    }
    
    public ClaudeAnalyticsImpl$Traits(final String a, final String b, final String c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClaudeAnalyticsImpl$Traits)) {
            return false;
        }
        final ClaudeAnalyticsImpl$Traits claudeAnalyticsImpl$Traits = (ClaudeAnalyticsImpl$Traits)o;
        return mlc.q((Object)this.a, (Object)claudeAnalyticsImpl$Traits.a) && mlc.q((Object)this.b, (Object)claudeAnalyticsImpl$Traits.b) && mlc.q((Object)this.c, (Object)claudeAnalyticsImpl$Traits.c) && mlc.q((Object)this.d, (Object)claudeAnalyticsImpl$Traits.d) && mlc.q((Object)this.e, (Object)claudeAnalyticsImpl$Traits.e);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(smk.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int hashCode = 0;
        final String d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (j + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = AccountId.a(this.a);
        final String a2 = OrganizationId.a(this.b);
        final String a3 = EmailAddress.a(this.c);
        final StringBuilder t = oz1.t("Traits(account_uuid=", a, ", organization_uuid=", a2, ", email=");
        oz1.A(t, a3, ", subscription_level=", this.d, ", subscription_plan=");
        return oz1.p(t, this.e, ")");
    }
}
