package com.anthropic.claude.api.experience;

@jzk
public final class RefreshCacheAction implements ExperienceClientAction
{
    public static final q5j Companion;
    public static final d2d[] b;
    public final CacheType a = a;
    
    static {
        Companion = new q5j();
        b = new d2d[] { ncq.F(2, (jta)new iki((byte)19)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof RefreshCacheAction && this.a == ((RefreshCacheAction)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RefreshCacheAction(cache=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
