public abstract class ntl
{
    public static final ygm a;
    public static final jtl b;
    public static final tmf c;
    
    static {
        a = ri2.A0(0.0f, 400.0f, eep.a, 1);
        b = (jtl)new Object();
        c = new tmf();
    }
    
    public static final void a(igf v, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(646379026);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)v)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        int n6 = n4;
        if ((n & 0x30) == 0x0) {
            int n7;
            if (gva.h((Object)ye6)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x13) != 0x12)) {
            if (n3 != 0) {
                v = (igf)fgf.v;
            }
            b(uuj.t0(1948801580, new ktl(ye6, v), gva), gva, 6);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ltl(v, ye6, n, n2);
        }
    }
    
    public static final void b(final ye6 ye6, final gva gva, final int n) {
        gva.i0(1908320054);
        if (gva.W(n & 0x1, (n & 0x3) != 0x2)) {
            yi2.f(uuj.t0(2062852661, new mtl(ye6), gva), gva, 6);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new k79(n, ye6);
        }
    }
}
