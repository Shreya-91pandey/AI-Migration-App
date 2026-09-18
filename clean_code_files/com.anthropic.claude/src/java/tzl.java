public abstract class tzl
{
    public static final ygm a;
    
    static {
        a = ri2.A0(0.0f, 0.0f, null, 7);
    }
    
    public static final xom a(final long n, bfa a, String s, final gva gva, final int n2, int n3) {
        if ((n3 & 0x2) != 0x0) {
            a = tzl.a;
        }
        if ((n3 & 0x4) != 0x0) {
            s = "ColorAnimation";
        }
        final boolean f = gva.f((Object)j86.e(n));
        final Object r = gva.R();
        dlo dlo;
        if (f || (dlo = (dlo)r) == bi6.a) {
            dlo = new elo(n10.F, new k10(j86.e(n), (byte)3));
            gva.q0((Object)dlo);
        }
        final dlo dlo2 = dlo;
        final j86 j86 = new j86(n);
        n3 = n2 << 6;
        return md0.c(j86, dlo2, a, null, s, gva, (n2 & 0xE) | (n2 << 3 & 0x380) | (0xE000 & n3) | (n3 & 0x70000), 8);
    }
}
