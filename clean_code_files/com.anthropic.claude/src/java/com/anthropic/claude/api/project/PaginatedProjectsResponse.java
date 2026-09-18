package com.anthropic.claude.api.project;

import java.util.List;

@jzk
public final class PaginatedProjectsResponse
{
    public static final rog Companion;
    public static final d2d[] c;
    public final List a = a;
    public final Pagination b = b;
    
    static {
        Companion = (rog)new Object();
        c = new d2d[] { ncq.F(2, (jta)new mff((byte)17)), null };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaginatedProjectsResponse)) {
            return false;
        }
        final PaginatedProjectsResponse paginatedProjectsResponse = (PaginatedProjectsResponse)o;
        return mlc.q((Object)this.a, (Object)paginatedProjectsResponse.a) && mlc.q((Object)this.b, (Object)paginatedProjectsResponse.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PaginatedProjectsResponse(data=");
        sb.append((Object)this.a);
        sb.append(", pagination=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
