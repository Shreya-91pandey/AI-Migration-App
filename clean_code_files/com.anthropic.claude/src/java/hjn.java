import java.util.concurrent.CancellationException;
import android.os.Build$VERSION;

public final class hjn extends fjn implements zl6
{
    public peo L;
    public ykn M;
    public qmn N;
    public boolean O;
    public final ksg P;
    public final id0 Q;
    public final c0e R;
    public wmm S;
    
    public hjn(final peo l, final ykn m, final qmn n, final boolean o) {
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        final ksg q = o50.Q((Object)new chc(0L));
        this.P = q;
        this.Q = new id0((Object)new l6g(vt4.r(this.L, this.M, this.N, ((chc)q.getValue()).a)), sqk.b, (Object)new l6g(sqk.c), 8);
        final gjn gjn = new gjn(this, (byte)0);
        final gjn gjn2 = new gjn(this, (byte)1);
        if (d0e.a()) {
            Object o2;
            if (Build$VERSION.SDK_INT == 28) {
                o2 = dbh.v;
            }
            else {
                o2 = o4a.w;
            }
            final c0e r = new c0e((lta)gjn, (lta)gjn2, (bbh)o2);
            this.o1((t98)r);
            this.R = r;
            return;
        }
        oyl.s("Magnifier is only supported on API level 28 and higher.");
        throw null;
    }
    
    @Override
    public final void I0(final k0d k0d) {
        k0d.a();
        this.R.I0(k0d);
    }
    
    public final void g1() {
        this.s1();
    }
    
    @Override
    public final void j(final itk itk) {
        this.R.j(itk);
    }
    
    @Override
    public final void r1(final peo l, final ykn m, final qmn n, final boolean o) {
        final peo i = this.L;
        final ykn j = this.M;
        final qmn n2 = this.N;
        final boolean o2 = this.O;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        if (mlc.q((Object)l, (Object)i)) {
            if (m == j) {
                if (mlc.q((Object)n, (Object)n2)) {
                    if (o == o2) {
                        return;
                    }
                }
            }
        }
        this.s1();
    }
    
    public final void s1() {
        final wmm s = this.S;
        if (s != null) {
            ((bqc)s).g((CancellationException)null);
        }
        this.S = null;
        if (!d0e.a()) {
            return;
        }
        if (!this.O && (((l6g)this.Q.e()).a & 0x7FFFFFFF7FFFFFFFL) != 0x7FC000007FC00000L) {
            rhc.G(((hgf)this).c1(), (hc7)null, 4, (zta)new v8n((byte)3, (f07)null, (Object)this), 1);
        }
        this.S = rhc.G(((hgf)this).c1(), (hc7)null, 0, (zta)new frd((byte)19, null, this), 3);
    }
    
    @Override
    public final void u0(final yxf yxf) {
        this.R.u0(yxf);
    }
}
