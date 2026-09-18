public abstract class nrg
{
    public static final long a;
    public static final int b = 0;
    
    static {
        final wnn[] b = vnn.b;
        a = vnn.c;
    }
    
    public static final mrg a(final mrg mrg, int a, int b, long c, vln d, final fbh fbh, final idd idd, int h, final int n, final ymn ymn) {
        final int n2 = a;
        final int n3 = b;
        final long n4 = c;
        final vln vln = d;
        Label_0185: {
            if (n2 != 0) {
                if (n2 != mrg.a) {
                    break Label_0185;
                }
            }
            final wnn[] b2 = vnn.b;
            if ((n4 & 0xFF00000000L) != 0x0L) {
                if (!vnn.a(n4, mrg.c)) {
                    break Label_0185;
                }
            }
            if (vln == null || vln.equals(mrg.d)) {
                if (n3 != 0) {
                    if (n3 != mrg.b) {
                        break Label_0185;
                    }
                }
                if ((fbh == null || fbh.equals(mrg.e)) && (idd == null || idd.equals(mrg.f))) {
                    if (h != 0) {
                        if (h != mrg.g) {
                            break Label_0185;
                        }
                    }
                    if (n != 0) {
                        if (n != mrg.h) {
                            break Label_0185;
                        }
                    }
                    if (ymn == null || ymn.equals(mrg.i)) {
                        return mrg;
                    }
                }
            }
        }
        final wnn[] b3 = vnn.b;
        c = n4;
        if ((n4 & 0xFF00000000L) == 0x0L) {
            c = mrg.c;
        }
        if ((d = vln) == null) {
            d = mrg.d;
        }
        if ((a = n2) == 0) {
            a = mrg.a;
        }
        if ((b = n3) == 0) {
            b = mrg.b;
        }
        final fbh e = mrg.e;
        fbh fbh2;
        if (e == null) {
            fbh2 = fbh;
        }
        else if ((fbh2 = fbh) == null) {
            fbh2 = e;
        }
        idd f;
        if ((f = idd) == null) {
            f = mrg.f;
        }
        int g;
        if ((g = h) == 0) {
            g = mrg.g;
        }
        if ((h = n) == 0) {
            h = mrg.h;
        }
        ymn i;
        if ((i = ymn) == null) {
            i = mrg.i;
        }
        return new mrg(a, b, c, d, fbh2, f, g, h, i);
    }
}
