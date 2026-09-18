package com.anthropic.claude.api.project;

@jzk
public final class Pagination
{
    public static final tog Companion;
    public final boolean a = a;
    public final int b = b;
    public final int c = c;
    public final int d = d;
    
    static {
        Companion = (tog)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pagination)) {
            return false;
        }
        final Pagination pagination = (Pagination)o;
        return this.a == pagination.a && this.b == pagination.b && this.c == pagination.c && this.d == pagination.d;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.d) + hia.y(this.c, hia.y(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Pagination(has_more=");
        sb.append(this.a);
        sb.append(", limit=");
        sb.append(this.b);
        sb.append(", offset=");
        return rua.h(this.c, this.d, ", total=", ")", sb);
    }
}
