package com.anthropic.claude.api.account;

import java.util.List;
import java.util.Map;

@jzk
public final class AppStartResponse
{
    public static final nr0 Companion;
    public static final d2d[] h;
    public final Account a = a;
    public final GrowthBookSchema b;
    public final Map c;
    public final CurrentUserAccess d;
    public final List e;
    public final List f;
    public final List g;
    
    static {
        Companion = (nr0)new Object();
        h = new d2d[] { null, null, ncq.F(2, (jta)new kh0((byte)14)), null, ncq.F(2, (jta)new kh0((byte)15)), ncq.F(2, (jta)new kh0((byte)16)), ncq.F(2, (jta)new kh0((byte)17)) };
    }
    
    public AppStartResponse(final Account a, final GrowthBookSchema b, final Map c, final CurrentUserAccess d, final List e, final List f, final List g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static AppStartResponse a(final AppStartResponse appStartResponse, Account a, List f, final int n) {
        if ((n & 0x1) != 0x0) {
            a = appStartResponse.a;
        }
        final GrowthBookSchema b = appStartResponse.b;
        final Map c = appStartResponse.c;
        final CurrentUserAccess d = appStartResponse.d;
        final List e = appStartResponse.e;
        if ((n & 0x20) != 0x0) {
            f = appStartResponse.f;
        }
        return new AppStartResponse(a, b, c, d, e, f, appStartResponse.g);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppStartResponse)) {
            return false;
        }
        final AppStartResponse appStartResponse = (AppStartResponse)o;
        return mlc.q((Object)this.a, (Object)appStartResponse.a) && mlc.q((Object)this.b, (Object)appStartResponse.b) && mlc.q((Object)this.c, (Object)appStartResponse.c) && mlc.q((Object)this.d, (Object)appStartResponse.d) && mlc.q((Object)this.e, (Object)appStartResponse.e) && mlc.q((Object)this.f, (Object)appStartResponse.f) && mlc.q((Object)this.g, (Object)appStartResponse.g);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final GrowthBookSchema b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Map c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final CurrentUserAccess d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final List e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final List f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final List g = this.g;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        return (((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AppStartResponse(account=");
        sb.append((Object)this.a);
        sb.append(", org_growthbook=");
        sb.append((Object)this.b);
        sb.append(", server_localizations=");
        sb.append((Object)this.c);
        sb.append(", current_user_access=");
        sb.append((Object)this.d);
        sb.append(", personalized_greeting=");
        sb.append((Object)this.e);
        sb.append(", model_selector_state=");
        sb.append((Object)this.f);
        sb.append(", model_selector_config=");
        return p3g.e(sb, this.g, ")");
    }
}
