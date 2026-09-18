package com.anthropic.claude.analytics.events;

@jzk
public final class CronetAnalyticsEvents$RequestSuccess implements v10
{
    public static final fp7 Companion;
    public final String a = a;
    public final long b = b;
    public final int c = c;
    public final String d = d;
    public final Boolean e = e;
    
    static {
        Companion = (fp7)new Object();
    }
    
    public CronetAnalyticsEvents$RequestSuccess(final int c, final long b, final Boolean e, final String a, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final String a() {
        return "claudeai.networking.cronet.request_success";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CronetAnalyticsEvents$RequestSuccess)) {
            return false;
        }
        final CronetAnalyticsEvents$RequestSuccess cronetAnalyticsEvents$RequestSuccess = (CronetAnalyticsEvents$RequestSuccess)o;
        return mlc.q((Object)this.a, (Object)cronetAnalyticsEvents$RequestSuccess.a) && this.b == cronetAnalyticsEvents$RequestSuccess.b && this.c == cronetAnalyticsEvents$RequestSuccess.c && mlc.q((Object)this.d, (Object)cronetAnalyticsEvents$RequestSuccess.d) && mlc.q((Object)this.e, (Object)cronetAnalyticsEvents$RequestSuccess.e);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(hia.y(this.c, hia.d(this.a.hashCode() * 31, this.b, 31), 31), 31, this.d);
        final Boolean e = this.e;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        return j + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder q = hia.q(this.b, "RequestSuccess(endpoint=", this.a, ", duration_ms=");
        q.append(", status_code=");
        q.append(this.c);
        q.append(", protocol=");
        q.append(this.d);
        q.append(", experiment_enabled=");
        q.append((Object)this.e);
        q.append(")");
        return q.toString();
    }
}
