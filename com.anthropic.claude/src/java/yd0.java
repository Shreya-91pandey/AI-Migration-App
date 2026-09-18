public final class yd0 extends qxc implements bua
{
    public final Object w;
    public final v8m x;
    public final le0 y;
    public final ye6 z;
    
    public yd0(final Object w, final v8m x, final le0 y, final ye6 z) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        super(3);
    }
    
    @Override
    public final Object h(Object o, Object o2, Object w) {
        final af0 af0 = (af0)o;
        final gva gva = (gva)o2;
        int intValue;
        final int n = intValue = ((Number)w).intValue();
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)af0);
            }
            else {
                b = gva.h((Object)af0);
            }
            int n2;
            if (b) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            intValue = (n | n2);
        }
        if (gva.W(intValue & 0x1, (intValue & 0x13) != 0x12)) {
            final v8m x = this.x;
            final boolean f = gva.f((Object)x);
            w = this.w;
            final boolean h = gva.h(w);
            final le0 y = this.y;
            final boolean h2 = gva.h((Object)y);
            o2 = gva.R();
            final cib a = bi6.a;
            if ((f | h | h2) || (o = o2) == a) {
                o = new xd0(x, w, y, (byte)0);
                gva.q0(o);
            }
            mlc.b(af0, w, (lta)o, gva);
            final tmf e = y.e;
            af0.getClass();
            e.m(w, ((bf0)af0).b);
            o2 = gva.R();
            if ((o = o2) == a) {
                o = new de0(af0);
                gva.q0(o);
            }
            this.z.m((Object)o, w, (Object)gva, (Object)0);
        }
        else {
            gva.Z();
        }
        return lqo.a;
    }
}
