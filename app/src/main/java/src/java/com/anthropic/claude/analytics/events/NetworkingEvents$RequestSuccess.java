package com.anthropic.claude.analytics.events;

@jzk
public final class NetworkingEvents$RequestSuccess implements v10
{
    public static final guf Companion;
    public final String a = a;
    public final long b = b;
    public final int c = c;
    
    static {
        Companion = (guf)new Object();
    }
    
    public NetworkingEvents$RequestSuccess(final String a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final String a() {
        return "mobile.networking.request_success";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkingEvents$RequestSuccess)) {
            return false;
        }
        final NetworkingEvents$RequestSuccess networkingEvents$RequestSuccess = (NetworkingEvents$RequestSuccess)o;
        return mlc.q((Object)this.a, (Object)networkingEvents$RequestSuccess.a) && this.b == networkingEvents$RequestSuccess.b && this.c == networkingEvents$RequestSuccess.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + hia.d(this.a.hashCode() * 31, this.b, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder q = hia.q(this.b, "RequestSuccess(endpoint=", this.a, ", duration_ms=");
        q.append(", status_code=");
        q.append(this.c);
        q.append(")");
        return q.toString();
    }
}
