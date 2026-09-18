import java.util.Map;

public final class ze2 extends hgf implements a0d, xsk
{
    public lta J;
    
    public ze2(final lta j) {
        this.J = j;
    }
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final o8h u = goe.u(n);
        return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new e4((Object)u, (Object)this, (byte)5));
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final void j(final itk itk) {
        final yxf j = soh.J((t98)this, 2);
        Object o = null;
        boolean b2 = false;
        Label_0163: {
            if (!j.k0) {
                final jqj c = zrn.c;
                if (c == null) {
                    zrn.c = new jqj();
                }
                else {
                    c.a();
                }
                final jqj c2 = zrn.c;
                c2.getClass();
                c2.M = j.P.U;
                c2.K = uoo.Z(j.x);
                final r7m a = q7m.a();
                if (a != null) {
                    o = a.e();
                }
                else {
                    o = null;
                }
                final r7m b = q7m.b(a);
                try {
                    this.J.b((Object)c2);
                    q7m.d(a, b, (lta)o);
                    o = c2.H;
                    b2 = c2.I;
                    break Label_0163;
                }
                finally {
                    q7m.d(a, b, (lta)o);
                }
            }
            o = j.g0;
            b2 = j.j0;
        }
        if (!b2) {
            return;
        }
        ftk.u(itk, (aql)o);
    }
    
    public final boolean o() {
        return false;
    }
    
    public final String toString() {
        final lta j = this.J;
        final StringBuilder sb = new StringBuilder("BlockGraphicsLayerModifier(block=");
        sb.append((Object)j);
        sb.append(")");
        return sb.toString();
    }
}
