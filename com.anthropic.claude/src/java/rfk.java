import java.util.Map;

public final class rfk extends hgf implements a0d, xsk
{
    public ufk J;
    public boolean K;
    
    @Override
    public final int M0(final wxd wxd, final goe goe, int n) {
        if (this.K) {
            n = Integer.MAX_VALUE;
        }
        return goe.n(n);
    }
    
    @Override
    public final noe b(final ooe ooe, final goe goe, final long n) {
        zhg zhg;
        if (this.K) {
            zhg = zhg.v;
        }
        else {
            zhg = zhg.w;
        }
        eqi.S(n, zhg);
        final boolean k = this.K;
        int i = Integer.MAX_VALUE;
        int h;
        if (k) {
            h = Integer.MAX_VALUE;
        }
        else {
            h = gv6.h(n);
        }
        if (this.K) {
            i = gv6.i(n);
        }
        final o8h u = goe.u(gv6.b(n, 0, i, 0, h, 5));
        final int v = u.v;
        final int j = gv6.i(n);
        int n2;
        if ((n2 = v) > j) {
            n2 = j;
        }
        final int w = u.w;
        final int h2 = gv6.h(n);
        int n3;
        if ((n3 = w) > h2) {
            n3 = h2;
        }
        int n4 = u.w - n3;
        final int v2 = u.v;
        if (!this.K) {
            n4 = v2 - n2;
        }
        this.J.h(n4);
        final ufk l = this.J;
        int n5;
        if (this.K) {
            n5 = n3;
        }
        else {
            n5 = n2;
        }
        l.b.i(n5);
        final ufk m = this.J;
        int n6;
        if (this.K) {
            n6 = u.w;
        }
        else {
            n6 = u.v;
        }
        m.c.i(n6);
        this.J.d.setValue((Object)Boolean.FALSE);
        return ooe.Y(n2, n3, (Map)s89.v, (lta)new df0(this, n4, u));
    }
    
    @Override
    public final int g(final wxd wxd, final goe goe, int n) {
        if (!this.K) {
            n = Integer.MAX_VALUE;
        }
        return goe.a(n);
    }
    
    @Override
    public final int h(final wxd wxd, final goe goe, int n) {
        if (!this.K) {
            n = Integer.MAX_VALUE;
        }
        return goe.Q(n);
    }
    
    @Override
    public final void j(final itk itk) {
        ftk.z(itk);
        final dfk dfk = new dfk((jta)new qfk(this, (byte)0), (jta)new qfk(this, (byte)1), false);
        if (this.K) {
            final htk w = etk.w;
            final auc auc = ftk.a[13];
            w.getClass();
            itk.a(w, (Object)dfk);
            return;
        }
        ftk.o(itk, dfk);
    }
    
    @Override
    public final int k(final wxd wxd, final goe goe, int n) {
        if (this.K) {
            n = Integer.MAX_VALUE;
        }
        return goe.s(n);
    }
}
