public final class j3d
{
    public hsg a;
    public hsg b;
    
    public static igf a(final j3d j3d, final igf igf, bfa a0, final int n) {
        Object a2 = null;
        Object a3;
        if ((n & 0x1) != 0x0) {
            a3 = ri2.A0(0.0f, 400.0f, (Object)null, 5);
        }
        else {
            a3 = null;
        }
        if ((n & 0x2) != 0x0) {
            final k2j a4 = eep.a;
            a0 = (bfa)ri2.A0(0.0f, 400.0f, (Object)new ugc(4294967297L), 1);
        }
        if ((n & 0x4) != 0x0) {
            a2 = ri2.A0(0.0f, 400.0f, (Object)null, 5);
        }
        j3d.getClass();
        if (a3 == null && a0 == null && a2 == null) {
            return igf;
        }
        return igf.E((igf)new k3d((bfa)a3, a0, (bfa)a2));
    }
    
    public static igf c(final j3d j3d) {
        return (igf)new psg(1.0f, (xom)j3d.a, (xom)j3d.b);
    }
    
    public static igf d(final j3d j3d) {
        return (igf)new psg(1.0f, j3d.a, (hsg)null, 4);
    }
    
    public final igf b(final float n) {
        return (igf)new psg(n, (hsg)null, this.b, 2);
    }
}
