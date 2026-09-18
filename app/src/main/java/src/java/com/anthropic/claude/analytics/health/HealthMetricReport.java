package com.anthropic.claude.analytics.health;

@jzk
public final class HealthMetricReport
{
    public static final rhb Companion;
    public static final d2d[] k;
    public final HealthMetricOutcome a = a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final HealthMetricAction g;
    public final String h;
    public final String i;
    public final String j;
    
    static {
        Companion = (rhb)new Object();
        k = new d2d[] { ncq.F(2, (jta)new geb((byte)5)), null, null, null, null, null, ncq.F(2, (jta)new geb((byte)6)), null, null, null };
    }
    
    public HealthMetricReport(final HealthMetricOutcome a, final String b, final String c, final String d, final String e, final Long f, final HealthMetricAction g, final String h, final String i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthMetricReport)) {
            return false;
        }
        final HealthMetricReport healthMetricReport = (HealthMetricReport)o;
        return this.a == healthMetricReport.a && mlc.q((Object)this.b, (Object)healthMetricReport.b) && mlc.q((Object)this.c, (Object)healthMetricReport.c) && mlc.q((Object)this.d, (Object)healthMetricReport.d) && mlc.q((Object)this.e, (Object)healthMetricReport.e) && mlc.q((Object)this.f, (Object)healthMetricReport.f) && this.g == healthMetricReport.g && mlc.q((Object)this.h, (Object)healthMetricReport.h) && mlc.q((Object)this.i, (Object)healthMetricReport.i) && mlc.q((Object)this.j, (Object)healthMetricReport.j);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final String b = this.b;
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
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Long f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final int hashCode8 = this.g.hashCode();
        final String h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final String i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final String j = this.j;
        if (j != null) {
            hashCode2 = j.hashCode();
        }
        return (((hashCode8 + (((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("HealthMetricReport(outcome=");
        sb.append((Object)this.a);
        sb.append(", variant=");
        sb.append(this.b);
        sb.append(", error_type=");
        oz1.A(sb, this.c, ", error_code=", this.d, ", model=");
        tj0.s(sb, this.e, ", duration_ms=", this.f, ", action=");
        sb.append((Object)this.g);
        sb.append(", session_id=");
        sb.append(this.h);
        sb.append(", conversation_id=");
        return oz1.q(sb, this.i, ", chat_kind=", this.j, ")");
    }
}
