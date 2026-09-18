import java.util.Collection;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

public abstract class rg0
{
    public static final yog a;
    
    static {
        final r89 v = r89.v;
        a = new yog((Object)v, (Object)v);
    }
    
    public static final void a(final og0 og0, final List list, final gva gva, final int n) {
        gva.i0(-1794596951);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)og0)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)list)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
                final ng0 ng0 = (ng0)list.get(i);
                final bua bua = (bua)ng0.a;
                final int b = ng0.b;
                final int c = ng0.c;
                Object o;
                if ((o = gva.R()) == bi6.a) {
                    o = p60.d;
                    gva.q0(o);
                }
                final moe moe = (moe)o;
                final int hashCode = Long.hashCode(gva.T);
                final e3h l = gva.l();
                final igf b2 = ien.B(gva, (igf)fgf.v);
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
                k8e.P((zta)awp.B, gva, (Object)hashCode);
                k8e.C(gva);
                k8e.P((zta)awp.y, gva, (Object)b2);
                bua.h((Object)og0.g(b, c).w, (Object)gva, (Object)0);
                gva.q(true);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new qg0((Object)og0, (Object)list, n, (byte)0);
        }
    }
}
