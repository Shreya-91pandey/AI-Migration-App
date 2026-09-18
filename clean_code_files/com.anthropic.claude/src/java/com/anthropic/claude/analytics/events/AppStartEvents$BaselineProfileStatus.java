package com.anthropic.claude.analytics.events;

@jzk
public final class AppStartEvents$BaselineProfileStatus implements v10
{
    public static final xp0 Companion;
    public final int a = a;
    public final boolean b = b;
    public final boolean c = c;
    
    static {
        Companion = (xp0)new Object();
    }
    
    public AppStartEvents$BaselineProfileStatus(final int a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final String a() {
        return "mobile.app_start.baseline_profile_status";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppStartEvents$BaselineProfileStatus)) {
            return false;
        }
        final AppStartEvents$BaselineProfileStatus appStartEvents$BaselineProfileStatus = (AppStartEvents$BaselineProfileStatus)o;
        return this.a == appStartEvents$BaselineProfileStatus.a && this.b == appStartEvents$BaselineProfileStatus.b && this.c == appStartEvents$BaselineProfileStatus.c;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.c) + smk.l(Integer.hashCode(this.a) * 31, 31, this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("BaselineProfileStatus(result_code=");
        sb.append(this.a);
        sb.append(", is_compiled_with_profile=");
        sb.append(this.b);
        sb.append(", has_profile_enqueued=");
        return ge9.t(sb, this.c, ")");
    }
}
