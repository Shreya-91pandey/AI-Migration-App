import java.util.Map;

public final class fln extends hgf implements zl6, a0d
{
    public final mnn J;
    public cno K;
    public dln L;
    
    public fln(final mnn j) {
        this.J = j;
    }
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final dln l = this.L;
        if (l == null) {
            throw hia.s("Min size state is not set.");
        }
        final ksg f = l.f;
        final cno k = this.K;
        if (k != null) {
            final Object value = ((xom)k).getValue();
            if (!mlc.q(value, l.e)) {
                l.e = value;
                f.setValue((Object)Boolean.TRUE);
            }
            if (f.getValue()) {
                l.g = bin.a(l.d, l.b, l.c);
                f.setValue((Object)Boolean.FALSE);
            }
            final long g = l.g;
            final o8h u = goe.u(hv6.e(n, hv6.b((int)(g >> 32), 0, (int)(g & 0xFFFFFFFFL), 0, 10)));
            return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new t40(u, (byte)10));
        }
        throw hia.s("Font resolution state is not set.");
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final void f() {
        final dln l = this.L;
        if (l != null) {
            dln.a(l, null, soh.L((t98)this).U, null, 29);
        }
        soh.L((t98)this).R();
    }
    
    public final void g1() {
        final mnn f = k8e.F(this.J, soh.L((t98)this).V);
        final tna tna = (tna)uoo.z((zl6)this, (sei)hm6.k);
        this.o1(f, tna);
        final qzc v = soh.L((t98)this).V;
        final xc8 u = soh.L((t98)this).U;
        final cno k = this.K;
        if (k != null) {
            this.L = new dln(v, u, tna, f, ((xom)k).getValue());
            return;
        }
        throw hia.s("Font resolution state is not set.");
    }
    
    public final void h0() {
        final dln l = this.L;
        if (l != null) {
            dln.a(l, soh.L((t98)this).V, null, null, 30);
        }
        soh.L((t98)this).R();
    }
    
    public final void h1() {
        this.K = null;
        this.L = null;
    }
    
    public final void o1(final mnn mnn, final tna tna) {
        final hcm a = mnn.a;
        final una f = a.f;
        zoa zoa;
        if ((zoa = a.c) == null) {
            zoa = zoa.A;
        }
        final soa d = a.d;
        int a2;
        if (d != null) {
            a2 = d.a;
        }
        else {
            a2 = 0;
        }
        final toa e = a.e;
        int a3;
        if (e != null) {
            a3 = e.a;
        }
        else {
            a3 = 65535;
        }
        this.K = ((wna)tna).b(f, zoa, a2, a3);
        soh.L((t98)this).R();
    }
}
