package com.anthropic.claude.api.notification;

@jzk
public final class TrackPushOpenRequest
{
    public static final tco Companion;
    public final int a = a;
    public final String b = b;
    public final Integer c;
    
    static {
        Companion = new tco();
    }
    
    public TrackPushOpenRequest(final int a, final Integer c, final String b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrackPushOpenRequest)) {
            return false;
        }
        final TrackPushOpenRequest trackPushOpenRequest = (TrackPushOpenRequest)o;
        return this.a == trackPushOpenRequest.a && mlc.q((Object)this.b, (Object)trackPushOpenRequest.b) && mlc.q((Object)this.c, (Object)trackPushOpenRequest.c);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(Integer.hashCode(this.a) * 31, 31, this.b);
        final Integer c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return j + hashCode;
    }
    
    @Override
    public final String toString() {
        return ju4.c(lmf.w(this.a, "TrackPushOpenRequest(campaign_id=", ", message_id=", this.b, ", template_id="), this.c, ")");
    }
}
