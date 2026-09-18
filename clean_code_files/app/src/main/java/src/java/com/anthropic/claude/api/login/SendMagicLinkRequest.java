package com.anthropic.claude.api.login;

import com.anthropic.claude.types.strings.EmailAddress;

@jzk
public final class SendMagicLinkRequest
{
    public static final iuk Companion;
    public final String a = a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    
    static {
        Companion = new iuk();
    }
    
    public SendMagicLinkRequest(final String a, final int d, final String g) {
        this.a = a;
        this.b = "xxx";
        this.c = "xxx";
        this.d = d;
        this.e = "claude";
        this.f = "android";
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SendMagicLinkRequest)) {
            return false;
        }
        final SendMagicLinkRequest sendMagicLinkRequest = (SendMagicLinkRequest)o;
        return mlc.q((Object)this.a, (Object)sendMagicLinkRequest.a) && mlc.q((Object)this.b, (Object)sendMagicLinkRequest.b) && mlc.q((Object)this.c, (Object)sendMagicLinkRequest.c) && this.d == sendMagicLinkRequest.d && mlc.q((Object)this.e, (Object)sendMagicLinkRequest.e) && mlc.q((Object)this.f, (Object)sendMagicLinkRequest.f) && mlc.q((Object)this.g, (Object)sendMagicLinkRequest.g);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(smk.j(hia.y(this.d, smk.j(smk.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
        final String g = this.g;
        int hashCode;
        if (g == null) {
            hashCode = 0;
        }
        else {
            hashCode = g.hashCode();
        }
        return j + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("SendMagicLinkRequest(email_address=", EmailAddress.a(this.a), ", recaptcha_token=", this.b, ", recaptcha_site_key=");
        gcp.f(t, this.c, ", utc_offset=", this.d, ", source=");
        oz1.A(t, this.e, ", client=", this.f, ", login_intent=");
        return oz1.p(t, this.g, ")");
    }
}
