public abstract class hzj
{
    public static final jzj a;
    
    static {
        a = new jzj((gv0)t08.a, wab.G);
    }
    
    public static final jzj a(final gv0 gv0, final lb2 lb2, final gva gva, final int n) {
        if (mlc.q((Object)gv0, (Object)t08.a) && mlc.q((Object)lb2, (Object)wab.G)) {
            gva.g0(-1073830487);
            gva.q(false);
            return hzj.a;
        }
        gva.g0(-1073779616);
        final boolean b = true;
        final boolean b2 = (((n & 0xE) ^ 0x6) > 4 && gva.f((Object)gv0)) || (n & 0x6) == 0x4;
        boolean b3 = false;
        Label_0123: {
            if (((n & 0x70) ^ 0x30) > 32) {
                b3 = b;
                if (gva.f((Object)lb2)) {
                    break Label_0123;
                }
            }
            b3 = ((n & 0x30) == 0x20 && b);
        }
        final Object r = gva.R();
        jzj jzj;
        if ((b2 | b3) || (jzj = (jzj)r) == bi6.a) {
            jzj = new jzj(gv0, lb2);
            gva.q0((Object)jzj);
        }
        final jzj jzj2 = jzj;
        gva.q(false);
        return jzj2;
    }
}
