package com.anthropic.claude.api.recents;

import java.util.ArrayList;
import java.util.List;

@jzk
public final class RecentsSectionsResponse
{
    public static final hyi Companion;
    public static final d2d[] d;
    public final List a = a;
    public final List b;
    public final List c;
    
    static {
        Companion = (hyi)new Object();
        d = new d2d[] { ncq.F(2, (jta)new lih((byte)13)), ncq.F(2, (jta)new lih((byte)14)), ncq.F(2, (jta)new lih((byte)15)) };
    }
    
    public RecentsSectionsResponse(final ArrayList a, final ArrayList b, final ArrayList c) {
        this.a = (List)a;
        this.b = (List)b;
        this.c = (List)c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecentsSectionsResponse)) {
            return false;
        }
        final RecentsSectionsResponse recentsSectionsResponse = (RecentsSectionsResponse)o;
        return mlc.q((Object)this.a, (Object)recentsSectionsResponse.a) && mlc.q((Object)this.b, (Object)recentsSectionsResponse.b) && mlc.q((Object)this.c, (Object)recentsSectionsResponse.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + smk.k(this.a.hashCode() * 31, 31, this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RecentsSectionsResponse(sections=");
        sb.append((Object)this.a);
        sb.append(", degraded_surfaces=");
        sb.append((Object)this.b);
        sb.append(", incomplete_surfaces=");
        return p3g.e(sb, this.c, ")");
    }
}
