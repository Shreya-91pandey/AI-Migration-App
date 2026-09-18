package com.anthropic.claude.api.login;

@jzk
public final class VerifyMagicLinkRequest
{
    public static final r7p Companion;
    public static final d2d[] g;
    public final VerifyMagicLinkRequest.VerifyMagicLinkRequest$Credentials a = a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ClientAttestation f;
    
    static {
        Companion = new r7p();
        g = new d2d[] { ncq.F(2, (jta)new m7p((byte)2)), null, null, null, null, null };
    }
    
    public VerifyMagicLinkRequest(final VerifyMagicLinkRequest.VerifyMagicLinkRequest$Credentials a, final String e, final ClientAttestation f) {
        this.a = a;
        this.b = "xxx";
        this.c = "xxx";
        this.d = "claude";
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerifyMagicLinkRequest)) {
            return false;
        }
        final VerifyMagicLinkRequest verifyMagicLinkRequest = (VerifyMagicLinkRequest)o;
        return mlc.q((Object)this.a, (Object)verifyMagicLinkRequest.a) && mlc.q((Object)this.b, (Object)verifyMagicLinkRequest.b) && mlc.q((Object)this.c, (Object)verifyMagicLinkRequest.c) && mlc.q((Object)this.d, (Object)verifyMagicLinkRequest.d) && mlc.q((Object)this.e, (Object)verifyMagicLinkRequest.e) && mlc.q((Object)this.f, (Object)verifyMagicLinkRequest.f);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(smk.j(smk.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        int hashCode = 0;
        final String e = this.e;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final ClientAttestation f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return (j + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("VerifyMagicLinkRequest(credentials=");
        sb.append((Object)this.a);
        sb.append(", recaptcha_token=");
        sb.append(this.b);
        sb.append(", recaptcha_site_key=");
        oz1.A(sb, this.c, ", source=", this.d, ", play_integrity_token=");
        sb.append(this.e);
        sb.append(", client_attestation=");
        sb.append((Object)this.f);
        sb.append(")");
        return sb.toString();
    }
}
