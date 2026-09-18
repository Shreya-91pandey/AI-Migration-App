public final class dd0 implements d1q
{
    public final short a;
    public final String b;
    public final ksg c;
    public final ksg d;
    
    public dd0(final int a, final String b) {
        this.a = (short)a;
        this.b = b;
        this.c = o50.Q((Object)dec.e);
        this.d = o50.Q((Object)Boolean.TRUE);
    }
    
    @Override
    public final int a(final xc8 xc8) {
        return this.e().b;
    }
    
    @Override
    public final int b(final xc8 xc8, final qzc qzc) {
        return this.e().c;
    }
    
    @Override
    public final int c(final xc8 xc8) {
        return this.e().d;
    }
    
    @Override
    public final int d(final xc8 xc8, final qzc qzc) {
        return this.e().a;
    }
    
    public final dec e() {
        return (dec)this.c.getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof dd0) {
                if (this.a == ((dd0)o).a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final void f(final boolean b) {
        this.d.setValue((Object)b);
    }
    
    public final void g(final h2q h2q, final int n) {
        final short a = this.a;
        if (n != 0 && (n & a) == 0x0) {
            return;
        }
        this.c.setValue((Object)h2q.a.i((int)a));
        this.f(h2q.a.u((int)a));
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final int a = this.e().a;
        final int b = this.e().b;
        final int c = this.e().c;
        final int d = this.e().d;
        final StringBuilder sb = new StringBuilder(this.b);
        sb.append("(");
        sb.append(a);
        sb.append(", ");
        sb.append(b);
        t.p(c, d, ", ", ", ", sb);
        sb.append(")");
        return sb.toString();
    }
}
