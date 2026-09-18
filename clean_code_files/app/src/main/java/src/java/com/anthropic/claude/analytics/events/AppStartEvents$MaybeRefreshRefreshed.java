package com.anthropic.claude.analytics.events;

@jzk
public final class AppStartEvents$MaybeRefreshRefreshed implements v10
{
    public static final lq0 Companion;
    public final String a = a;
    
    static {
        Companion = (lq0)new Object();
    }
    
    public AppStartEvents$MaybeRefreshRefreshed(final String a) {
        this.a = a;
    }
    
    public final String a() {
        return "claudeai.app_start.maybe_refresh.refreshed";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof AppStartEvents$MaybeRefreshRefreshed && mlc.q((Object)this.a, (Object)((AppStartEvents$MaybeRefreshRefreshed)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("MaybeRefreshRefreshed(organization_uuid=", this.a, ")");
    }
}
