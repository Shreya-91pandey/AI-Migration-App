package com.anthropic.claude.analytics.events;

@jzk
public final class OfflineEvents$PrefetchCompleted implements v10
{
    public static final h6g Companion;
    public final int a = a;
    public final int b = b;
    public final int c = c;
    public final long d = d;
    public final Integer e;
    
    static {
        Companion = (h6g)new Object();
    }
    
    public OfflineEvents$PrefetchCompleted(final int a, final int b, final int c, final long d, final Integer e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final String a() {
        return "claudeai.offline.prefetch.completed";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OfflineEvents$PrefetchCompleted)) {
            return false;
        }
        final OfflineEvents$PrefetchCompleted offlineEvents$PrefetchCompleted = (OfflineEvents$PrefetchCompleted)o;
        return this.a == offlineEvents$PrefetchCompleted.a && this.b == offlineEvents$PrefetchCompleted.b && this.c == offlineEvents$PrefetchCompleted.c && this.d == offlineEvents$PrefetchCompleted.d && mlc.q((Object)this.e, (Object)offlineEvents$PrefetchCompleted.e);
    }
    
    @Override
    public final int hashCode() {
        final int d = hia.d(hia.y(this.c, hia.y(this.b, Integer.hashCode(this.a) * 31, 31), 31), this.d, 31);
        final Integer e = this.e;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        return d + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder o = hia.o(this.a, this.b, "PrefetchCompleted(conversations_synced=", ", conversations_needing_sync=", ", recent_count=");
        o.append(this.c);
        o.append(", duration_ms=");
        o.append(this.d);
        o.append(", conversations_skipped_unfinished=");
        o.append((Object)this.e);
        o.append(")");
        return o.toString();
    }
}
