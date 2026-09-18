import androidx.compose.ui.node.LayoutNode;

public abstract class rj2
{
    public static final tmf a;
    public static final tmf b;
    public static final qj2 c;
    
    static {
        a = b(true);
        b = b(false);
        c = qj2.b;
    }
    
    public static final void a(final igf igf, final gva gva, final int n) {
        gva.i0(-211209833);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)igf)) {
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
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final int hashCode = Long.hashCode(gva.T);
            final igf b = ien.B(gva, igf);
            final e3h l = gva.l();
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)rj2.c);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new oj2((Object)igf, n, (byte)0);
        }
    }
    
    public static final tmf b(final boolean b) {
        final tmf tmf = new tmf(9);
        final mb2 x = wab.x;
        tmf.m((Object)x, (Object)new uj2((gx)x, b));
        final mb2 y = wab.y;
        tmf.m((Object)y, (Object)new uj2((gx)y, b));
        final mb2 z = wab.z;
        tmf.m((Object)z, (Object)new uj2((gx)z, b));
        final mb2 a = wab.A;
        tmf.m((Object)a, (Object)new uj2((gx)a, b));
        final mb2 b2 = wab.B;
        tmf.m((Object)b2, (Object)new uj2((gx)b2, b));
        final mb2 c = wab.C;
        tmf.m((Object)c, (Object)new uj2((gx)c, b));
        final mb2 d = wab.D;
        tmf.m((Object)d, (Object)new uj2((gx)d, b));
        final mb2 e = wab.E;
        tmf.m((Object)e, (Object)new uj2((gx)e, b));
        final mb2 f = wab.F;
        tmf.m((Object)f, (Object)new uj2((gx)f, b));
        return tmf;
    }
    
    public static final moe c(final gx gx, final boolean b) {
        tmf tmf;
        if (b) {
            tmf = rj2.a;
        }
        else {
            tmf = rj2.b;
        }
        Object o;
        if ((o = tmf.g((Object)gx)) == null) {
            o = new uj2(gx, b);
        }
        return (moe)o;
    }
    
    public static final void d(final n8h n8h, final o8h o8h, final goe goe, final qzc qzc, final int n, final int n2, final gx gx) {
        final Object z = goe.z();
        mj2 mj2;
        if (z instanceof mj2) {
            mj2 = (mj2)z;
        }
        else {
            mj2 = null;
        }
        gx j = null;
        Label_0046: {
            if (mj2 != null) {
                j = mj2.J;
                if (j != null) {
                    break Label_0046;
                }
            }
            j = gx;
        }
        n8h.h(n8h, o8h, j.a((long)o8h.v << 32 | ((long)o8h.w & 0xFFFFFFFFL), (long)n << 32 | ((long)n2 & 0xFFFFFFFFL), qzc));
    }
}
