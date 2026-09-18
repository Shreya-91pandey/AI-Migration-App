package com.anthropic.claude.analytics.events;

@jzk
public final class AppStartEvents$AppLaunchCompleted implements v10
{
    public static final tp0 Companion;
    public static final d2d[] i;
    public final AppStartEvents$AppLaunchStartType a = a;
    public final long b = b;
    public final Long c;
    public final AppStartEvents$AppLaunchDestination d;
    public final DrawerEvents$DrawerItem e;
    public final AppStartEvents$InstallSource f;
    public final AppStartEvents$PlayServicesStatus g;
    public final Boolean h;
    
    static {
        Companion = (tp0)new Object();
        i = new d2d[] { ncq.F(2, (jta)new kh0((byte)5)), null, null, ncq.F(2, (jta)new kh0((byte)6)), ncq.F(2, (jta)new kh0((byte)7)), ncq.F(2, (jta)new kh0((byte)8)), ncq.F(2, (jta)new kh0((byte)9)), null };
    }
    
    public AppStartEvents$AppLaunchCompleted(final AppStartEvents$AppLaunchStartType a, final long b, final Long c, final AppStartEvents$AppLaunchDestination d, final AppStartEvents$InstallSource f, final AppStartEvents$PlayServicesStatus g, final Boolean h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = null;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final String a() {
        return "mobile.app_start.launch_completed";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppStartEvents$AppLaunchCompleted)) {
            return false;
        }
        final AppStartEvents$AppLaunchCompleted appStartEvents$AppLaunchCompleted = (AppStartEvents$AppLaunchCompleted)o;
        return this.a == appStartEvents$AppLaunchCompleted.a && this.b == appStartEvents$AppLaunchCompleted.b && mlc.q((Object)this.c, (Object)appStartEvents$AppLaunchCompleted.c) && this.d == appStartEvents$AppLaunchCompleted.d && this.e == appStartEvents$AppLaunchCompleted.e && this.f == appStartEvents$AppLaunchCompleted.f && this.g == appStartEvents$AppLaunchCompleted.g && mlc.q((Object)this.h, (Object)appStartEvents$AppLaunchCompleted.h);
    }
    
    @Override
    public final int hashCode() {
        final int d = hia.d(this.a.hashCode() * 31, this.b, 31);
        int hashCode = 0;
        final Long c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final int hashCode3 = this.d.hashCode();
        final DrawerEvents$DrawerItem e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final int hashCode5 = this.f.hashCode();
        final int hashCode6 = this.g.hashCode();
        final Boolean h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return (hashCode6 + (hashCode5 + ((hashCode3 + (d + hashCode2) * 31) * 31 + hashCode4) * 31) * 31) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AppLaunchCompleted(start_type=");
        sb.append((Object)this.a);
        sb.append(", duration_ms=");
        sb.append(this.b);
        sb.append(", app_on_create_ms=");
        sb.append((Object)this.c);
        sb.append(", destination=");
        sb.append((Object)this.d);
        sb.append(", initial_tab=");
        sb.append((Object)this.e);
        sb.append(", install_source=");
        sb.append((Object)this.f);
        sb.append(", play_services_status=");
        sb.append((Object)this.g);
        sb.append(", car_platform_connected=");
        sb.append((Object)this.h);
        sb.append(")");
        return sb.toString();
    }
}
