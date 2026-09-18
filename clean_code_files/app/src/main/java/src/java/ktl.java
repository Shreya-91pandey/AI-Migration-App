import androidx.compose.ui.node.LayoutNode;

public final class ktl extends qxc implements cua
{
    public final igf w;
    public final ye6 x;
    
    public ktl(final ye6 x, final igf w) {
        this.w = w;
        this.x = x;
        super(4);
    }
    
    @Override
    public final Object m(final Object o, final Object o2, final Object o3, final Object o4) {
        final itl itl = (itl)o;
        final igf igf = (igf)o2;
        final gva gva = (gva)o3;
        final int intValue = ((Number)o4).intValue();
        int n2;
        if ((intValue & 0x6) == 0x0) {
            int n;
            if (gva.f((Object)itl)) {
                n = 4;
            }
            else {
                n = 2;
            }
            n2 = (n | intValue);
        }
        else {
            n2 = intValue;
        }
        int n3 = n2;
        if ((intValue & 0x30) == 0x0) {
            int n4;
            if (gva.f((Object)igf)) {
                n4 = 32;
            }
            else {
                n4 = 16;
            }
            n3 = (n2 | n4);
        }
        if (gva.W(n3 & 0x1, (n3 & 0x93) != 0x92)) {
            final igf e = this.w.E(igf);
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, e);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.x(gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b);
            this.x.h((Object)itl, (Object)gva, (Object)(n3 & 0xE));
            gva.q(true);
        }
        else {
            gva.Z();
        }
        return lqo.a;
    }
}
