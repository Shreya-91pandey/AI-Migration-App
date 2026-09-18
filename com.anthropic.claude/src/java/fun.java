public final class fun
{
    public static final fun d;
    public final jqg a;
    public final jqg b;
    public final jqg c;
    
    static {
        final jqg s = wab.S;
        d = new fun(s, s, s);
    }
    
    public fun(final jqg a, final jqg b, final jqg c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final jqg a(final oun oun) {
        final int ordinal = oun.ordinal();
        if (ordinal == 0) {
            return this.a;
        }
        if (ordinal == 1) {
            return this.b;
        }
        if (ordinal == 2) {
            return this.c;
        }
        en9.r();
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fun)) {
            return false;
        }
        final fun fun = (fun)o;
        return mlc.q((Object)this.a, (Object)fun.a) && mlc.q((Object)this.b, (Object)fun.b) && mlc.q((Object)this.c, (Object)fun.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ThreePaneMotion(primaryPaneMotion=");
        sb.append((Object)this.a);
        sb.append(", secondaryPaneMotion=");
        sb.append((Object)this.b);
        sb.append(", tertiaryPaneMotion=");
        sb.append((Object)this.c);
        sb.append(")");
        return sb.toString();
    }
}
