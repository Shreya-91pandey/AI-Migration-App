package com.anthropic.claude.analytics.events;

@jzk
public final class AppStartEvents$DeviceClockSkew implements v10
{
    public static final iq0 Companion;
    public final long a = a;
    public final long b = b;
    
    static {
        Companion = (iq0)new Object();
    }
    
    public AppStartEvents$DeviceClockSkew(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final String a() {
        return "mobile.app_start.device_clock_skew";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppStartEvents$DeviceClockSkew)) {
            return false;
        }
        final AppStartEvents$DeviceClockSkew appStartEvents$DeviceClockSkew = (AppStartEvents$DeviceClockSkew)o;
        return this.a == appStartEvents$DeviceClockSkew.a && this.b == appStartEvents$DeviceClockSkew.b;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + Long.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return hia.n(smk.u(this.a, "DeviceClockSkew(offset_ms=", ", round_trip_ms="), this.b, ")");
    }
}
