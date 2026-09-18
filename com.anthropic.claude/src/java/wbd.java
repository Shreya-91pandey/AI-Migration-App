public final class wbd implements d1q
{
    public final d1q a;
    public final int b;
    
    public wbd(final d1q a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final xc8 xc8) {
        if ((this.b & 0x10) != 0x0) {
            return this.a.a(xc8);
        }
        return 0;
    }
    
    @Override
    public final int b(final xc8 xc8, final qzc qzc) {
        int n;
        if (qzc == qzc.v) {
            n = 4;
        }
        else {
            n = 1;
        }
        if ((n & this.b) != 0x0) {
            return this.a.b(xc8, qzc);
        }
        return 0;
    }
    
    @Override
    public final int c(final xc8 xc8) {
        if ((this.b & 0x20) != 0x0) {
            return this.a.c(xc8);
        }
        return 0;
    }
    
    @Override
    public final int d(final xc8 xc8, final qzc qzc) {
        int n;
        if (qzc == qzc.v) {
            n = 8;
        }
        else {
            n = 2;
        }
        if ((n & this.b) != 0x0) {
            return this.a.d(xc8, qzc);
        }
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wbd)) {
            return false;
        }
        final wbd wbd = (wbd)o;
        return mlc.q((Object)this.a, (Object)wbd.a) && this.b == wbd.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final int m = xp7.m;
        final int b = this.b;
        if ((b & m) == m) {
            xp7.b0(sb, "Start");
        }
        final int o = xp7.o;
        if ((b & o) == o) {
            xp7.b0(sb, "Left");
        }
        if ((b & 0x10) == 0x10) {
            xp7.b0(sb, "Top");
        }
        final int n = xp7.n;
        if ((b & n) == n) {
            xp7.b0(sb, "End");
        }
        final int p = xp7.p;
        if ((b & p) == p) {
            xp7.b0(sb, "Right");
        }
        if ((b & 0x20) == 0x20) {
            xp7.b0(sb, "Bottom");
        }
        final String k = hia.k("WindowInsetsSides(", sb.toString(), ")");
        final StringBuilder sb2 = new StringBuilder("(");
        sb2.append((Object)this.a);
        sb2.append(" only ");
        sb2.append(k);
        sb2.append(")");
        return sb2.toString();
    }
}
