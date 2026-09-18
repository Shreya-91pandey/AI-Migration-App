package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings._ServerLocalizedString;

@jzk
public final class Badge
{
    public static final bs1 Companion;
    public static final d2d[] c;
    public final _ServerLocalizedString a;
    public final BadgeVariant b;
    
    static {
        Companion = (bs1)new Object();
        c = new d2d[] { ncq.F(2, (jta)new kh0((byte)22)), null };
    }
    
    public Badge(final _ServerLocalizedString a, final BadgeVariant b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Badge)) {
            return false;
        }
        final Badge badge = (Badge)o;
        return mlc.q((Object)this.a, (Object)badge.a) && this.b == badge.b;
    }
    
    @Override
    public final int hashCode() {
        final _ServerLocalizedString a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Badge(message=");
        sb.append((Object)this.a);
        sb.append(", variant=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
