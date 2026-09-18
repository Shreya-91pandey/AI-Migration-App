import java.util.List;

public abstract class y5d
{
    public static final l5d a;
    
    static {
        a = new l5d(null, 0, false, 0.0f, (noe)new Object(), 0.0f, false, (oc7)ien.a((hc7)o89.v), (xc8)r6k.a(), hv6.b(0, 0, 0, 0, 15), 0, (List)r89.v, 0, 0, 0, false, zhg.v, 0, 0);
    }
    
    public static final v5d a(int n, final int n2, final gva gva) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        final n9k y = v5d.y;
        final boolean d = gva.d(n);
        final boolean d2 = gva.d(0);
        final Object r = gva.R();
        Object o;
        if ((d | d2) || (o = r) == bi6.a) {
            o = new w5d(n, (byte)0);
            gva.q0(o);
        }
        return (v5d)mlc.b0(new Object[0], (m9k)y, (jta)o, gva, 0);
    }
}
