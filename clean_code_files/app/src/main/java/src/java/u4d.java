public final class u4d implements s4d
{
    public final sd8 a;
    public final v5d b;
    public final boolean c;
    
    public u4d(final v5d b, final boolean c) {
        this.b = b;
        this.c = c;
        this.a = r8m.b((jta)new r94(b, (byte)2));
    }
    
    @Override
    public final int a() {
        final v5d b = this.b;
        long n;
        if (b.i().q == zhg.v) {
            n = (b.i().i() & 0xFFFFFFFFL);
        }
        else {
            n = b.i().i() >> 32;
        }
        return (int)n;
    }
    
    @Override
    public final float b() {
        final v5d b = this.b;
        return (float)(((hsg)b.e.w).h() * 500 + ((hsg)b.e.x).h());
    }
    
    @Override
    public final int c() {
        final v5d b = this.b;
        return -b.i().m + b.i().r;
    }
    
    @Override
    public final float d() {
        final v5d b = this.b;
        final int h = ((hsg)b.e.w).h();
        final int h2 = ((hsg)b.e.x).h();
        if (b.d()) {
            return h * 500 + h2 + 100.0f;
        }
        return (float)(h * 500 + h2);
    }
    
    @Override
    public final u76 e() {
        final boolean c = this.c;
        final sd8 a = this.a;
        if (c) {
            return new u76(((Number)a.getValue()).intValue(), 1);
        }
        return new u76(1, ((Number)a.getValue()).intValue());
    }
    
    @Override
    public final Object f(final int n, final xf1 xf1) {
        final Object l = v5d.l(this.b, n, (h07)xf1);
        if (l == pc7.v) {
            return l;
        }
        return lqo.a;
    }
}
