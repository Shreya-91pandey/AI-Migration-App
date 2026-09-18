package com.anthropic.claude.api.login;

@jzk
public final class VerifyGoogleMobileRequest
{
    public static final q7p Companion;
    public final String a = a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    
    static {
        Companion = new q7p();
    }
    
    public VerifyGoogleMobileRequest(final String a, final String d, final String e, final String f) {
        this.a = a;
        this.b = null;
        this.c = null;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = "claude";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerifyGoogleMobileRequest)) {
            return false;
        }
        final VerifyGoogleMobileRequest verifyGoogleMobileRequest = (VerifyGoogleMobileRequest)o;
        return mlc.q((Object)this.a, (Object)verifyGoogleMobileRequest.a) && mlc.q((Object)this.b, (Object)verifyGoogleMobileRequest.b) && mlc.q((Object)this.c, (Object)verifyGoogleMobileRequest.c) && mlc.q((Object)this.d, (Object)verifyGoogleMobileRequest.d) && mlc.q((Object)this.e, (Object)verifyGoogleMobileRequest.e) && mlc.q((Object)this.f, (Object)verifyGoogleMobileRequest.f) && mlc.q((Object)this.g, (Object)verifyGoogleMobileRequest.g);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int n = 0;
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final int j = smk.j(smk.j(((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31, 31, this.d), 31, this.e);
        final String f = this.f;
        int hashCode4;
        if (f == null) {
            hashCode4 = n;
        }
        else {
            hashCode4 = f.hashCode();
        }
        return this.g.hashCode() + (j + hashCode4) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("VerifyGoogleMobileRequest(token=", this.a, ", join_token=", this.b, ", login_token=");
        oz1.A(t, this.c, ", recaptcha_token=", this.d, ", recaptcha_site_key=");
        oz1.A(t, this.e, ", play_integrity_token=", this.f, ", source=");
        return oz1.p(t, this.g, ")");
    }
}
