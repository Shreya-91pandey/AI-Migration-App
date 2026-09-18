package com.anthropic.claude.api.events;

import java.util.List;

@jzk
public final class HealthMetricEventConfig
{
    public static final dhb Companion;
    public static final d2d[] c;
    public final boolean a;
    public final List b;
    
    static {
        Companion = (dhb)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new geb((byte)3)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthMetricEventConfig)) {
            return false;
        }
        final HealthMetricEventConfig healthMetricEventConfig = (HealthMetricEventConfig)o;
        return this.a == healthMetricEventConfig.a && mlc.q((Object)this.b, (Object)healthMetricEventConfig.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Boolean.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("HealthMetricEventConfig(enabled=");
        sb.append(this.a);
        sb.append(", allowed_actions=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
