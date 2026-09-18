public final class tun
{
    public final dpg a;
    public final dpg b;
    public final l7n c;
    public final l7n d;
    
    public tun(final dpg a, final dpg b) {
        this.a = a;
        this.b = b;
        this.c = new l7n((jta)new sun(this, (byte)0));
        this.d = new l7n((jta)new sun(this, (byte)1));
    }
    
    public final dpg a(final oun oun) {
        final int ordinal = oun.ordinal();
        if (ordinal == 0) {
            return this.a;
        }
        if (ordinal == 1) {
            return awp.F;
        }
        if (ordinal == 2) {
            return this.b;
        }
        en9.r();
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tun)) {
            return false;
        }
        final tun tun = (tun)o;
        return this.a == tun.a && this.b == tun.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + (awp.F.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final dpg f = awp.F;
        final StringBuilder sb = new StringBuilder("ThreePaneScaffoldValue(primary=");
        sb.append((Object)this.a);
        sb.append(", secondary=");
        sb.append((Object)f);
        sb.append(", tertiary=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
