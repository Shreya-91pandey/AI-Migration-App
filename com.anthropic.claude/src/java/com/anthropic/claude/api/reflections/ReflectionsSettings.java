package com.anthropic.claude.api.reflections;

import java.util.List;

@jzk
public final class ReflectionsSettings
{
    public static final e5j Companion;
    public static final d2d[] c;
    public final Integer a;
    public final List b;
    
    static {
        Companion = (e5j)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new lih((byte)20)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReflectionsSettings)) {
            return false;
        }
        final ReflectionsSettings reflectionsSettings = (ReflectionsSettings)o;
        return mlc.q((Object)this.a, (Object)reflectionsSettings.a) && mlc.q((Object)this.b, (Object)reflectionsSettings.b);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Integer a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final List b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ReflectionsSettings(time_alert_daily_minutes=");
        sb.append((Object)this.a);
        sb.append(", quiet_hours=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
