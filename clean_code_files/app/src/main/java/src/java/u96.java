public abstract class u96
{
    public static final v96 a;
    
    static {
        a = new v96((jv0)t08.c, (dx)wab.J);
    }
    
    public static final v96 a(final jv0 jv0, final dx dx, final gva gva, final int n) {
        if (jv0.equals(t08.c) && mlc.q((Object)dx, (Object)wab.J)) {
            gva.g0(-1446604504);
            gva.q(false);
            return u96.a;
        }
        gva.g0(-1446550657);
        final boolean b = true;
        final boolean b2 = (((n & 0xE) ^ 0x6) > 4 && gva.f((Object)jv0)) || (n & 0x6) == 0x4;
        boolean b3 = false;
        Label_0123: {
            if (((n & 0x70) ^ 0x30) > 32) {
                b3 = b;
                if (gva.f((Object)dx)) {
                    break Label_0123;
                }
            }
            b3 = ((n & 0x30) == 0x20 && b);
        }
        final Object r = gva.R();
        v96 v96;
        if ((b2 | b3) || (v96 = (v96)r) == bi6.a) {
            v96 = new v96(jv0, dx);
            gva.q0((Object)v96);
        }
        final v96 v97 = v96;
        gva.q(false);
        return v97;
    }
}
