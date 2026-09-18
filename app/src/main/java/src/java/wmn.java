import java.util.List;

public final class wmn
{
    public final tna a;
    public final xc8 b;
    public final qzc c;
    public final tze d;
    
    public wmn(final tna a, final xc8 b, final qzc c, final int n) {
        this.a = a;
        this.b = b;
        this.c = c;
        tze d;
        if (n > 0) {
            d = new tze(n);
        }
        else {
            d = null;
        }
        this.d = d;
    }
    
    public static omn a(final wmn wmn, final String s, final mnn mnn, long b, final int n) {
        int n2 = 1;
        int n3;
        if ((n & 0x4) != 0x0) {
            n3 = 1;
        }
        else {
            n3 = 2;
        }
        final boolean b2 = (n & 0x8) != 0x0;
        if ((n & 0x10) != 0x0) {
            n2 = Integer.MAX_VALUE;
        }
        if ((n & 0x20) != 0x0) {
            b = hv6.b(0, 0, 0, 0, 15);
        }
        final qzc c = wmn.c;
        final xc8 b3 = wmn.b;
        final tna a = wmn.a;
        wmn.getClass();
        return b(wmn, new og0(s), mnn, n3, b2, n2, b, c, b3, a, 32);
    }
    
    public static omn b(final wmn wmn, final og0 og0, final mnn mnn, int n, boolean b, int n2, long b2, qzc c, xc8 b3, tna a, int k) {
        final int n3 = 1;
        int n4;
        if ((k & 0x4) != 0x0) {
            n4 = 1;
        }
        else {
            n4 = n;
        }
        if ((k & 0x8) != 0x0) {
            b = true;
        }
        final int n5 = Integer.MAX_VALUE;
        if ((k & 0x10) != 0x0) {
            n = Integer.MAX_VALUE;
        }
        else {
            n = n2;
        }
        if ((k & 0x40) != 0x0) {
            b2 = hv6.b(0, 0, 0, 0, 15);
        }
        if ((k & 0x80) != 0x0) {
            c = wmn.c;
        }
        if ((k & 0x100) != 0x0) {
            b3 = wmn.b;
        }
        if ((k & 0x200) != 0x0) {
            a = wmn.a;
        }
        final tze d = wmn.d;
        final r89 v = r89.v;
        final nmn nmn = new nmn(og0, mnn, (List)v, n, b, n4, b3, c, a, b2);
        omn omn2;
        final omn omn = omn2 = null;
        Label_0272: {
            if (d != null) {
                final uv2 uv2 = new uv2(nmn);
                final lyd lyd = (lyd)d.w;
                if (lyd != null) {
                    omn2 = (omn)lyd.c((Object)uv2);
                }
                else {
                    omn2 = omn;
                    if (!mlc.q((Object)d.x, (Object)uv2)) {
                        break Label_0272;
                    }
                    omn2 = (omn)d.y;
                }
                if (omn2 == null) {
                    omn2 = omn;
                }
                else if (omn2.b.a.e()) {
                    omn2 = omn;
                }
            }
        }
        if (omn2 != null) {
            final vjf b4 = omn2.b;
            n2 = (int)(float)Math.ceil((double)b4.d);
            n = (int)(float)Math.ceil((double)b4.e);
            return new omn(nmn, b4, hv6.d(b2, ((long)n & 0xFFFFFFFFL) | (long)n2 << 32));
        }
        final uy7 uy7 = new uy7(og0, b3, a, k8e.F(mnn, c), (List)v, b);
        k = gv6.k(b2);
        Label_0403: {
            if (!b) {
                n2 = n5;
                if (!kkq.d(n4)) {
                    break Label_0403;
                }
            }
            n2 = n5;
            if (gv6.e(b2)) {
                n2 = gv6.i(b2);
            }
        }
        if (!b && kkq.d(n4)) {
            n = n3;
        }
        if (k != n2) {
            n2 = ncq.o((int)(float)Math.ceil((double)uy7.y()), k, n2);
        }
        final vjf vjf = new vjf(uy7, ri2.F(0, n2, 0, gv6.h(b2)), n, n4);
        n = (int)(float)Math.ceil((double)vjf.d);
        n2 = (int)(float)Math.ceil((double)vjf.e);
        final omn y = new omn(nmn, vjf, hv6.d(b2, ((long)n2 & 0xFFFFFFFFL) | (long)n << 32));
        if (d != null) {
            final lyd lyd2 = (lyd)d.w;
            if (lyd2 != null) {
                lyd2.d((Object)new uv2(nmn), (Object)y);
                return y;
            }
            d.x = new uv2(nmn);
            d.y = y;
        }
        return y;
    }
}
