package com.anthropic.claude.analytics.events;

@jzk
public final class CronetAnalyticsEvents$InitializationFailed implements v10
{
    public static final vo7 Companion;
    public static final d2d[] j;
    public final String a = a;
    public final String b = b;
    public final Integer c = c;
    public final long d = d;
    public final AppStartEvents$PlayServicesStatus e = e;
    public final Integer f = f;
    public final boolean g = g;
    public final String h = h;
    public final Boolean i = i;
    
    static {
        Companion = (vo7)new Object();
        j = new d2d[] { null, null, null, null, ncq.F(2, (jta)new cm6((byte)18)), null, null, null, null };
    }
    
    public CronetAnalyticsEvents$InitializationFailed(final String a, final String b, final Integer c, final long d, final AppStartEvents$PlayServicesStatus e, final Integer f, final boolean g, final String h, final Boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final String a() {
        return "claudeai.networking.cronet.initialization_failed";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CronetAnalyticsEvents$InitializationFailed)) {
            return false;
        }
        final CronetAnalyticsEvents$InitializationFailed cronetAnalyticsEvents$InitializationFailed = (CronetAnalyticsEvents$InitializationFailed)o;
        return mlc.q((Object)this.a, (Object)cronetAnalyticsEvents$InitializationFailed.a) && mlc.q((Object)this.b, (Object)cronetAnalyticsEvents$InitializationFailed.b) && mlc.q((Object)this.c, (Object)cronetAnalyticsEvents$InitializationFailed.c) && this.d == cronetAnalyticsEvents$InitializationFailed.d && this.e == cronetAnalyticsEvents$InitializationFailed.e && mlc.q((Object)this.f, (Object)cronetAnalyticsEvents$InitializationFailed.f) && this.g == cronetAnalyticsEvents$InitializationFailed.g && mlc.q((Object)this.h, (Object)cronetAnalyticsEvents$InitializationFailed.h) && mlc.q((Object)this.i, (Object)cronetAnalyticsEvents$InitializationFailed.i);
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
        final Integer c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final int d = hia.d(((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31, this.d, 31);
        final int hashCode4 = this.e.hashCode();
        final Integer f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final int l = smk.l(((hashCode4 + d) * 31 + hashCode5) * 31, 31, this.g);
        final String h = this.h;
        int hashCode6;
        if (h == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = h.hashCode();
        }
        final Boolean i = this.i;
        int hashCode7;
        if (i == null) {
            hashCode7 = n;
        }
        else {
            hashCode7 = i.hashCode();
        }
        return (l + hashCode6) * 31 + hashCode7;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("InitializationFailed(failure_reason=", this.a, ", error_class_chain=", this.b, ", connection_result_code=");
        t.append((Object)this.c);
        t.append(", init_duration_ms=");
        t.append(this.d);
        t.append(", play_services_status=");
        t.append((Object)this.e);
        t.append(", s_extension_version=");
        t.append((Object)this.f);
        t.append(", http_engine_available=");
        t.append(this.g);
        t.append(", platform_http_engine_version=");
        t.append(this.h);
        t.append(", google_http_engine_override=");
        t.append((Object)this.i);
        t.append(")");
        return t.toString();
    }
}
