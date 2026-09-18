public abstract class md0
{
    public static final ygm a;
    public static final ygm b;
    public static final ygm c;
    
    static {
        a = ri2.A0(0.0f, 0.0f, null, 7);
        final k2j a2 = eep.a;
        b = ri2.A0(0.0f, 0.0f, new qs8(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        c = ri2.A0(0.0f, 0.0f, new ugc(4294967297L), 3);
    }
    
    public static final xom a(final float n, bfa b, String s, final gva gva, final int n2, int n3) {
        if ((n3 & 0x2) != 0x0) {
            b = md0.b;
        }
        if ((n3 & 0x4) != 0x0) {
            s = "DpAnimation";
        }
        final qs8 qs8 = new qs8(n);
        final elo g = yi2.g;
        n3 = n2 << 6;
        return c(qs8, g, b, null, s, gva, (n2 & 0xE) | (n2 << 3 & 0x380) | (0xE000 & n3) | (n3 & 0x70000), 8);
    }
    
    public static final xom b(final float n, bfa bfa, String s, final gva gva, final int n2, final int n3) {
        final ygm a = md0.a;
        if ((n3 & 0x2) != 0x0) {
            bfa = a;
        }
        if ((n3 & 0x8) != 0x0) {
            s = "FloatAnimation";
        }
        if (bfa == a) {
            gva.g0(1144115775);
            final boolean c = gva.c(0.01f);
            final Object r = gva.R();
            ygm a2;
            if (c || (a2 = (ygm)r) == bi6.a) {
                a2 = ri2.A0(0.0f, 0.0f, 0.01f, 3);
                gva.q0((Object)a2);
            }
            bfa = a2;
            gva.q(false);
        }
        else {
            gva.g0(1144225701);
            gva.q(false);
        }
        return c(n, yi2.e, bfa, null, s, gva, n2 << 3 & 0xE000, 0);
    }
    
    public static final xom c(Object o, final dlo dlo, final cg0 cg0, Float n, final String s, final gva gva, int n2, final int n3) {
        if ((n3 & 0x8) != 0x0) {
            n = null;
        }
        final Object r = gva.R();
        final cib a = bi6.a;
        Object q;
        if ((q = r) == a) {
            q = o50.Q(null);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        Object r2;
        if ((r2 = gva.R()) == a) {
            r2 = new id0(o, dlo, n);
            gva.q0(r2);
        }
        final id0 id0 = (id0)r2;
        final bnf w = o50.W(null, gva);
        cg0 cg2 = cg0;
        if (n != null) {
            cg2 = cg0;
            if (cg0 instanceof ygm) {
                final ygm ygm = (ygm)cg0;
                cg2 = cg0;
                if (!mlc.q(ygm.c, n)) {
                    cg2 = new ygm(ygm.a, ygm.b, n);
                }
            }
        }
        final bnf w2 = o50.W(cg2, gva);
        Object o2;
        if ((o2 = gva.R()) == a) {
            o2 = ao2.c(-1, 0, 6);
            gva.q0(o2);
        }
        final xd3 xd3 = (xd3)o2;
        final boolean h = gva.h((Object)xd3);
        if ((((n2 & 0xE) ^ 0x6) > 4 && gva.h(o)) || (0x6 & n2) == 0x4) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Object r3 = gva.R();
        Object o3;
        if (((h ? 1 : 0) | n2) != 0x0 || (o3 = r3) == a) {
            o3 = new jd0((Object)xd3, o, (byte)0);
            gva.q0(o3);
        }
        mlc.l((jta)o3, gva);
        final boolean h2 = gva.h((Object)xd3);
        final boolean h3 = gva.h((Object)id0);
        final boolean f = gva.f((Object)w2);
        final boolean f2 = gva.f((Object)w);
        final Object r4 = gva.R();
        if ((h2 | h3 | f | f2) || (o = r4) == a) {
            o = new ld0(xd3, id0, w2, w, null);
            gva.q0(o);
        }
        mlc.f((zta)o, gva, xd3);
        xom c;
        if ((c = (xom)((xom)bnf).getValue()) == null) {
            c = id0.c;
        }
        return c;
    }
}
