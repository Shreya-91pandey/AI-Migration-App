import java.util.Set;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.layout.b;

public abstract class zul
{
    public static final int a = 0;
    
    static {
        ri2.I0(300, 0, (u09)x09.a, 2);
    }
    
    public static final void a(final igf igf, final zta zta, final gva gva, final int n) {
        gva.i0(1361920385);
        int n2;
        if (gva.f((Object)igf)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)zta)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final String d = twl.D(2131757444, gva);
            final igf d2 = b.d((igf)fgf.v, 1.0f);
            final moe c = rj2.c((gx)wab.B, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, d2);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)c);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b);
            nao.c((sgh)jao.a(gva), uuj.t0(1497042086, (aua)new zg(d, (byte)21), gva), nao.d(gva), igf, false, zta, gva, (n4 << 9 & 0x1C00) | 0x30 | (n4 << 21 & 0xE000000), 240);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new n60(igf, zta, n, (byte)2);
        }
    }
    
    public static final zvl b(final Set set, final lta lta, final gva gva, final int n, int n2) {
        final int n3 = 1;
        final boolean b = (n2 & 0x20) != 0x0;
        final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
        final boolean f = gva.f((Object)xc8);
        if ((((n & 0x1C00) ^ 0xC00) > 2048 && gva.c(56.0f)) || (n & 0xC00) == 0x800) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Object r = gva.R();
        final cib a = bi6.a;
        t20 t20;
        if (((f ? 1 : 0) | n2) != 0x0 || (t20 = (t20)r) == a) {
            t20 = new t20(xc8, (byte)1);
            gva.q0((Object)t20);
        }
        final jta jta = (jta)t20;
        final boolean f2 = gva.f((Object)xc8);
        if ((((0xE000 & n) ^ 0x6000) > 16384 && gva.c(125.0f)) || (n & 0x6000) == 0x4000) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Object r2 = gva.R();
        Object o;
        if (((f2 ? 1 : 0) | n2) != 0x0 || (o = r2) == a) {
            o = new t20(xc8, (byte)2);
            gva.q0(o);
        }
        final jta jta2 = (jta)o;
        final n9k n9k = new n9k((lta)new fv4(set, jta, jta2, lta, b), (zta)new dtk((byte)10));
        final boolean h = gva.h((Object)set);
        final boolean f3 = gva.f((Object)jta);
        final boolean f4 = gva.f((Object)jta2);
        if ((((n & 0x380) ^ 0x180) > 256 && gva.d(fwl.v.ordinal())) || (n & 0x180) == 0x100) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final boolean b2 = (((n & 0x70) ^ 0x30) > 32 && gva.f((Object)lta)) || (n & 0x30) == 0x20;
        int n4 = 0;
        Label_0435: {
            if (((0x70000 & n) ^ 0x30000) > 131072) {
                n4 = n3;
                if (gva.g(b)) {
                    break Label_0435;
                }
            }
            if ((n & 0x30000) == 0x20000) {
                n4 = n3;
            }
            else {
                n4 = 0;
            }
        }
        final Object r3 = gva.R();
        Object o2;
        if ((((h | f3 | f4) ? 1 : 0) | n2 | (b2 ? 1 : 0) | n4) != 0x0 || (o2 = r3) == a) {
            o2 = new vul(set, jta, jta2, lta, b);
            gva.q0(o2);
        }
        return (zvl)mlc.b0(new Object[] { set, lta, b }, (m9k)n9k, (jta)o2, gva, 0);
    }
}
