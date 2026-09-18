package com.anthropic.claude.analytics.events;

@jzk
public final class PushEvents$PushRegistrationFailure implements v10
{
    public static final xki Companion;
    public static final d2d[] f;
    public final PushEvents$FailureCause a = a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    
    static {
        Companion = (xki)new Object();
        f = new d2d[] { ncq.F(2, (jta)new lih((byte)4)), null, null, null, null };
    }
    
    public PushEvents$PushRegistrationFailure(final PushEvents$FailureCause a, final Integer b, final String c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final String a() {
        return "mobile.push.registration_failure";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PushEvents$PushRegistrationFailure)) {
            return false;
        }
        final PushEvents$PushRegistrationFailure pushEvents$PushRegistrationFailure = (PushEvents$PushRegistrationFailure)o;
        return this.a == pushEvents$PushRegistrationFailure.a && mlc.q((Object)this.b, (Object)pushEvents$PushRegistrationFailure.b) && mlc.q((Object)this.c, (Object)pushEvents$PushRegistrationFailure.c) && mlc.q((Object)this.d, (Object)pushEvents$PushRegistrationFailure.d) && mlc.q((Object)this.e, (Object)pushEvents$PushRegistrationFailure.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final Integer b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
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
        if (e != null) {
            hashCode2 = e.hashCode();
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PushRegistrationFailure(failure_cause=");
        sb.append((Object)this.a);
        sb.append(", http_error_code=");
        sb.append((Object)this.b);
        sb.append(", error_message=");
        oz1.A(sb, this.c, ", organization_uuid=", this.d, ", account_uuid=");
        return oz1.p(sb, this.e, ")");
    }
}
