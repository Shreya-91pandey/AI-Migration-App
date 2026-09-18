package com.anthropic.claude.api.events;

@jzk
public final class HealthMetricEventData
{
    public static final fhb Companion;
    public final String a = a;
    public final hfc b = b;
    public final String c = c;
    public final String d = d;
    public final String e = e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final Long l;
    public final String m;
    public final String n;
    
    static {
        Companion = (fhb)new Object();
    }
    
    public HealthMetricEventData(final String a, final hfc b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final String k, final Long l, final String m, final String n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthMetricEventData)) {
            return false;
        }
        final HealthMetricEventData healthMetricEventData = (HealthMetricEventData)o;
        return mlc.q((Object)this.a, (Object)healthMetricEventData.a) && mlc.q((Object)this.b, (Object)healthMetricEventData.b) && mlc.q((Object)this.c, (Object)healthMetricEventData.c) && mlc.q((Object)this.d, (Object)healthMetricEventData.d) && mlc.q((Object)this.e, (Object)healthMetricEventData.e) && mlc.q((Object)this.f, (Object)healthMetricEventData.f) && mlc.q((Object)this.g, (Object)healthMetricEventData.g) && mlc.q((Object)this.h, (Object)healthMetricEventData.h) && mlc.q((Object)this.i, (Object)healthMetricEventData.i) && mlc.q((Object)this.j, (Object)healthMetricEventData.j) && mlc.q((Object)this.k, (Object)healthMetricEventData.k) && mlc.q((Object)this.l, (Object)healthMetricEventData.l) && mlc.q((Object)this.m, (Object)healthMetricEventData.m) && mlc.q((Object)this.n, (Object)healthMetricEventData.n);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(smk.j(smk.j(t.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        final int n = 0;
        final String f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        final String g = this.g;
        int hashCode2;
        if (g == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g.hashCode();
        }
        final String h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = h.hashCode();
        }
        final String i = this.i;
        int hashCode4;
        if (i == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = i.hashCode();
        }
        final int k = smk.j(smk.j(((((j + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31, 31, this.j), 31, this.k);
        final Long l = this.l;
        int hashCode5;
        if (l == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = l.hashCode();
        }
        final String m = this.m;
        int hashCode6;
        if (m == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = m.hashCode();
        }
        final String n2 = this.n;
        int hashCode7;
        if (n2 == null) {
            hashCode7 = n;
        }
        else {
            hashCode7 = n2.hashCode();
        }
        return ((k + hashCode5) * 31 + hashCode6) * 31 + hashCode7;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("HealthMetricEventData(event_id=");
        sb.append(this.a);
        sb.append(", event_timestamp=");
        sb.append((Object)this.b);
        sb.append(", action=");
        oz1.A(sb, this.c, ", surface=", this.d, ", outcome=");
        oz1.A(sb, this.e, ", error_type=", this.f, ", error_code=");
        oz1.A(sb, this.g, ", variant=", this.h, ", model=");
        oz1.A(sb, this.i, ", app_version=", this.j, ", platform=");
        tj0.s(sb, this.k, ", duration_ms=", this.l, ", session_id=");
        return oz1.q(sb, this.m, ", conversation_id=", this.n, ")");
    }
}
