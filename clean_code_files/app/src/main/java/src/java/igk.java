public final class igk implements xrf
{
    public final chk v;
    public boolean w;
    
    public igk(final chk v, final boolean w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final long K(final long n, final int n2, final long n3) {
        if (this.w) {
            final chk v = this.v;
            if (!v.a.a()) {
                return v.i(v.e(v.a.e(v.e(v.h(n3)))));
            }
        }
        return 0L;
    }
    
    @Override
    public final Object L(long n, long v, final f07 f07) {
        Object o = null;
        Label_0062: {
            if (f07 instanceof hgk) {
                final hgk hgk = (hgk)f07;
                final int y = hgk.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    hgk.y = y + Integer.MIN_VALUE;
                    o = hgk;
                    break Label_0062;
                }
            }
            o = new hgk(this, (h07)f07);
        }
        final Object w = ((hgk)o).w;
        final int y2 = ((hgk)o).y;
        Label_0204: {
            f7p f7p;
            if (y2 != 0) {
                if (y2 != 1) {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v = ((hgk)o).v;
                vt4.g0(w);
                f7p = (f7p)w;
            }
            else {
                vt4.g0(w);
                final boolean w2 = this.w;
                final long n2 = n = 0L;
                if (!w2) {
                    return f7p.a(n);
                }
                final chk v2 = this.v;
                if (v2.i) {
                    n = n2;
                    break Label_0204;
                }
                ((hgk)o).v = v;
                ((hgk)o).y = 1;
                final Object a = v2.a(v, (h07)o);
                final pc7 v3 = pc7.v;
                if ((f7p = (f7p)a) == v3) {
                    return v3;
                }
            }
            n = f7p.j();
        }
        n = f7p.f(v, n);
        return f7p.a(n);
    }
}
