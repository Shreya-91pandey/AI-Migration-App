import java.util.List;
import androidx.compose.ui.node.LayoutNode;

public final class c88
{
    public static final c88 a;
    
    static {
        a = (c88)new Object();
    }
    
    public final void a(final rxf rxf, final gva gva, final int n) {
        final pqg value = (pqg)rxf.x;
        final mun mun = (mun)rxf.F;
        final gun gun = (gun)rxf.z;
        gva.i0(-59484306);
        int n2;
        if (gva.h((Object)rxf)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final qzc qzc = (qzc)gva.j((sei)hm6.n);
            final v4a f = mun.f;
            final tze tze = (tze)rxf.y;
            final boolean f2 = gva.f((Object)gun);
            final boolean d = gva.d(((Enum)qzc).ordinal());
            final Object r = gva.R();
            final cib a = bi6.a;
            gun gun2;
            if ((f2 | d) || (gun2 = (gun)r) == a) {
                gun2 = gun;
                if (qzc == qzc.w) {
                    gun2 = new gun(gun.b, gun.a);
                }
                gva.q0((Object)gun2);
            }
            final gun value2 = gun2;
            final tun j = tze.j();
            final ye6 ye6 = (ye6)rxf.A;
            final ye6 ye7 = (ye6)rxf.B;
            Object a2;
            if ((a2 = rxf.C) == null) {
                a2 = fcr.a;
            }
            final List y = lq6.Y((Object[])new zta[] { (zta)ye6, (zta)ye7, (zta)a2, (zta)uuj.t0(-1040725425, (aua)new l0((Object)rxf, (byte)8), gva), (zta)uuj.t0(-2077735826, (aua)new l0((Object)j, (byte)9), gva) });
            final boolean f3 = gva.f((Object)rxf.D);
            final Object r2 = gva.R();
            eun eun;
            if (f3 || (eun = (eun)r2) == a) {
                eun = new eun(value, j, (ypg)rxf.D, value2, mun);
                gva.q0((Object)eun);
            }
            final eun eun2 = eun;
            eun2.c.setValue((Object)value);
            eun2.d.setValue((Object)j);
            eun2.e.setValue((Object)value2);
            t08.a(tze, f, gva, 0);
            final igf f4 = zrn.F((igf)rxf.w, (lta)new p8a((Object)f, (byte)25));
            final ye6 k = ien.k(y);
            final boolean f5 = gva.f((Object)eun2);
            final Object r3 = gva.R();
            Object o;
            if (f5 || (o = r3) == a) {
                o = new pjf((ojf)eun2);
                gva.q0(o);
            }
            final moe moe = (moe)o;
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, f4);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)moe);
            k8e.P((zta)awp.z, gva, (Object)l);
            final rg6 b2 = awp.B;
            if (gva.S || !mlc.q(gva.R(), (Object)hashCode)) {
                gva.q0((Object)hashCode);
                gva.b((zta)b2, (Object)hashCode);
            }
            k8e.P((zta)awp.y, gva, (Object)b);
            hia.t(0, k, gva, true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)this, (Object)rxf, n, (byte)19);
        }
    }
}
