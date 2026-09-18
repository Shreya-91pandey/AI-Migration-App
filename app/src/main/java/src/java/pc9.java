import java.util.LinkedHashMap;

public abstract class pc9
{
    public static final elo a;
    public static final ygm b;
    public static final ygm c;
    public static final ygm d;
    public static final ygm e;
    
    static {
        a = new elo(n10.Q, n10.R);
        b = ri2.A0(0.0f, 400.0f, null, 5);
        c = ri2.A0(0.0f, 400.0f, null, 5);
        final k2j a2 = eep.a;
        d = ri2.A0(0.0f, 400.0f, new ugc(4294967297L), 1);
        e = ri2.A0(0.0f, 400.0f, new chc(4294967297L), 1);
    }
    
    public static final void a(final efo efo, final jta jta, final gva gva, final int n) {
        gva.i0(-1186853286);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)efo)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)jta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final ksg e = efo.e;
            final ksg d = efo.d;
            final boolean b = e.getValue() != null;
            if (mlc.q(efo.a.i(), d.getValue()) && !b) {
                jta.a();
            }
            final Object r = gva.R();
            final cib a = bi6.a;
            boolean[] array;
            if ((array = (boolean[])r) == a) {
                array = new boolean[] { b };
                gva.q0((Object)array);
            }
            final boolean[] array2 = array;
            Object r2;
            if ((r2 = gva.R()) == a) {
                r2 = new Object[] { null };
                gva.q0(r2);
            }
            final Object[] array3 = (Object[])r2;
            if (!mlc.q(array3[0], d.getValue())) {
                if (!b && !array2[0]) {
                    jta.a();
                }
                array3[0] = d.getValue();
            }
            array2[0] = b;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = new hc9(efo, jta, n);
        }
    }
    
    public static final igf b(final efo efo, final id9 id9, ev9 v, final jta jta, final hsl hsl, final String s, final gva gva, int n, int n2) {
        final elo k = yi2.k;
        if ((n2 & 0x4) != 0x0) {
            n = 1;
        }
        else {
            n = 0;
        }
        final cib a = bi6.a;
        jta jta2;
        if ((n2 & 0x8) != 0x0) {
            Object o;
            if ((o = gva.R()) == a) {
                o = rn6.E;
                gva.q0(o);
            }
            jta2 = (jta)o;
        }
        else {
            jta2 = jta;
        }
        hsl hsl2;
        if ((n2 & 0x10) != 0x0) {
            hsl2 = null;
        }
        else {
            hsl2 = hsl;
        }
        id9 u;
        if (n != 0) {
            gva.g0(-1491184033);
            u = u(efo, id9, gva, 0);
        }
        else {
            gva.g0(-1491182875);
            u = id9;
        }
        gva.q(false);
        if (n != 0) {
            gva.g0(-1491181156);
            v = v(efo, v, gva, 0);
        }
        else {
            gva.g0(-1491180092);
        }
        gva.q(false);
        hsl hsl4;
        if (hsl2 == null) {
            gva.g0(-968938819);
            final boolean f = gva.f((Object)efo);
            final Object r = gva.R();
            hsl hsl3;
            if (f || (hsl3 = (hsl)r) == a) {
                hsl3 = new hsl();
                gva.q0((Object)hsl3);
            }
            hsl4 = hsl3;
        }
        else {
            gva.g0(-31257052);
            hsl4 = hsl2;
        }
        gva.q(false);
        hsl4.e(efo.e.getValue() != null);
        final boolean h = gva.h((Object)hsl4);
        final Object r2 = gva.R();
        jta jta3;
        if (h || (jta3 = (jta)r2) == a) {
            jta3 = new lc9(hsl4, (byte)1);
            gva.q0((Object)jta3);
        }
        a(efo, jta3, gva, 0);
        final dfo a2 = u.a;
        final dfo a3 = v.a;
        final boolean a4 = foo.a(hsl4.f, j86.g);
        final dfo a5 = u.a;
        final rd3 c = a5.c;
        if (a5.b == null && v.a.b == null && ugc.b(hsl4.j, 0L)) {
            n = 0;
        }
        else {
            n = 1;
        }
        if (c == null && v.a.c == null) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        veo t;
        if (n != 0) {
            gva.g0(1018653691);
            Object o2;
            if ((o2 = gva.R()) == a) {
                o2 = s.concat(" slide");
                gva.q0(o2);
            }
            t = xp7.t(efo, k, (String)o2, gva, 384, 0);
            gva.q(false);
        }
        else {
            gva.g0(1018759494);
            gva.q(false);
            t = null;
        }
        veo t2;
        if (n2 != 0) {
            gva.g0(1018851285);
            final elo l = yi2.l;
            Object o3;
            if ((o3 = gva.R()) == a) {
                o3 = s.concat(" shrink/expand");
                gva.q0(o3);
            }
            t2 = xp7.t(efo, l, (String)o3, gva, 384, 0);
            gva.q(false);
        }
        else {
            gva.g0(1018962109);
            gva.q(false);
            t2 = null;
        }
        veo t3;
        if (n2 != 0) {
            gva.g0(1019035735);
            Object o4;
            if ((o4 = gva.R()) == a) {
                o4 = s.concat(" InterruptionHandlingOffset");
                gva.q0(o4);
            }
            t3 = xp7.t(efo, k, (String)o4, gva, 384, 0);
            gva.q(false);
        }
        else {
            gva.g0(1019206141);
            gva.q(false);
            t3 = null;
        }
        boolean b = false;
        Label_0762: {
            if (c == null || c.d) {
                final rd3 c2 = v.a.c;
                if (c2 == null || c2.d) {
                    if (n2 != 0) {
                        b = false;
                        break Label_0762;
                    }
                }
            }
            b = true;
        }
        final dfo a6 = v.a;
        final yrj e = x86.e;
        final fgf v2 = fgf.v;
        Object o6;
        if (!a4) {
            gva.g0(1019733235);
            final elo elo = new elo(n10.F, new k10(e, (byte)3));
            Object o5;
            if ((o5 = gva.R()) == a) {
                o5 = s.concat(" veil");
                gva.q0(o5);
            }
            o6 = new w6p(efo, xp7.t(efo, elo, (String)o5, gva, 384, 0), u, v, hsl4);
            gva.q(false);
        }
        else {
            gva.g0(1020031362);
            gva.q(false);
            o6 = v2;
        }
        final dfo a7 = v.a;
        final elo e2 = yi2.e;
        if (a5.a == null && a7.a == null && hsl4.g == 1.0f) {
            n = 0;
        }
        else {
            n = 1;
        }
        if (a5.d == null && a7.d == null && hsl4.h == 1.0f) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        veo t4;
        if (n != 0) {
            gva.g0(-1511865571);
            Object o7;
            if ((o7 = gva.R()) == a) {
                o7 = s.concat(" alpha");
                gva.q0(o7);
            }
            t4 = xp7.t(efo, e2, (String)o7, gva, 384, 0);
            gva.q(false);
        }
        else {
            gva.g0(-1511696126);
            gva.q(false);
            t4 = null;
        }
        final hsl hsl5 = hsl4;
        veo t5;
        if (n2 != 0) {
            gva.g0(-1511628483);
            Object o8;
            if ((o8 = gva.R()) == a) {
                o8 = s.concat(" scale");
                gva.q0(o8);
            }
            t5 = xp7.t(efo, e2, (String)o8, gva, 384, 0);
            gva.q(false);
        }
        else {
            gva.g0(-1511459038);
            gva.q(false);
            t5 = null;
        }
        veo t6;
        if (n2 != 0) {
            gva.g0(-1511381382);
            t6 = xp7.t(efo, pc9.a, "TransformOriginInterruptionHandling", gva, 384, 0);
            gva.q(false);
        }
        else {
            gva.g0(-1511209054);
            gva.q(false);
            t6 = null;
        }
        final boolean h2 = gva.h((Object)t4);
        final boolean f2 = gva.f((Object)u);
        final boolean f3 = gva.f((Object)v);
        final boolean h3 = gva.h((Object)hsl5);
        final boolean h4 = gva.h((Object)t5);
        final boolean f4 = gva.f((Object)efo);
        final boolean h5 = gva.h((Object)t6);
        final Object r3 = gva.R();
        gc9 gc9;
        if (!(h2 | f2 | f3 | h3 | h4 | f4 | h5) && r3 != a) {
            gc9 = (gc9)r3;
        }
        else {
            gc9 = new gc9(t4, hsl5, t5, efo, u, v, t6);
            gva.q0((Object)gc9);
        }
        final hsl hsl6 = hsl4;
        final gc9 gc10 = gc9;
        final tei a8 = e98.a;
        final boolean h6 = gva.h((Object)hsl6);
        final Object r4 = gva.R();
        jta jta4;
        if (h6 || (jta4 = (jta)r4) == a) {
            jta4 = new lc9(hsl6, (byte)0);
            gva.q0((Object)jta4);
        }
        final igf e3 = ((igf)new ngf((jta)jta4)).E((igf)v2);
        final boolean g = gva.g(b);
        final boolean f5 = gva.f((Object)jta2);
        final Object r5 = gva.R();
        lta lta;
        if ((g | f5) || (lta = (lta)r5) == a) {
            lta = new mc9(jta2, b);
            gva.q0((Object)lta);
        }
        return e3.E(zrn.F((igf)v2, (lta)lta)).E(new fc9(efo, t2, t3, t, u, v, hsl6, jta2, gc10)).E((igf)o6);
    }
    
    public static id9 c(final bfa bfa, kb2 kb2, final int n) {
        final kb2 l = wab.L;
        bfa a0 = bfa;
        if ((n & 0x1) != 0x0) {
            final k2j a2 = eep.a;
            a0 = ri2.A0(0.0f, 400.0f, new chc(4294967297L), 1);
        }
        if ((n & 0x2) != 0x0) {
            kb2 = l;
        }
        final boolean b = (n & 0x4) != 0x0;
        mb2 mb2;
        if (mlc.q(kb2, wab.J)) {
            mb2 = wab.A;
        }
        else if (mlc.q(kb2, l)) {
            mb2 = wab.C;
        }
        else {
            mb2 = wab.B;
        }
        return d((gx)mb2, a0, (lta)new d80(1, (byte)4), b);
    }
    
    public static final id9 d(final gx gx, final bfa bfa, final lta lta, final boolean b) {
        return new id9(new dfo(null, null, new rd3(gx, bfa, lta, b), null, null, 123));
    }
    
    public static id9 e(final int n) {
        mb2 mb2 = wab.B;
        final k2j a = eep.a;
        final ygm a2 = ri2.A0(0.0f, 400.0f, new chc(4294967297L), 1);
        if ((n & 0x2) != 0x0) {
            mb2 = wab.F;
        }
        return d((gx)mb2, a2, n10.S, true);
    }
    
    public static id9 f(final bfa bfa, es t, final int n) {
        final lb2 i = wab.I;
        final lb2 g = wab.G;
        bfa a0 = bfa;
        if ((n & 0x1) != 0x0) {
            final k2j a2 = eep.a;
            a0 = ri2.A0(0.0f, 400.0f, new chc(4294967297L), 1);
        }
        lb2 lb2;
        if ((n & 0x2) != 0x0) {
            lb2 = i;
        }
        else {
            lb2 = g;
        }
        if ((n & 0x8) != 0x0) {
            t = (es)n10.T;
        }
        mb2 mb2;
        if (mlc.q(lb2, g)) {
            mb2 = wab.y;
        }
        else if (mlc.q(lb2, i)) {
            mb2 = wab.E;
        }
        else {
            mb2 = wab.B;
        }
        return d((gx)mb2, a0, new nc9((lta)t, (byte)0), true);
    }
    
    public static id9 g(bfa a0, final int n) {
        if ((n & 0x1) != 0x0) {
            a0 = ri2.A0(0.0f, 400.0f, null, 5);
        }
        return new id9(new dfo(new w3a(0.0f, a0), null, null, null, null, 126));
    }
    
    public static ev9 h(bfa a0, final int n) {
        if ((n & 0x1) != 0x0) {
            a0 = ri2.A0(0.0f, 400.0f, null, 5);
        }
        return new ev9(new dfo(new w3a(0.0f, a0), null, null, null, null, 126));
    }
    
    public static id9 i(bfa a0, float n, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            a0 = ri2.A0(0.0f, 400.0f, null, 5);
        }
        if ((n2 & 0x2) != 0x0) {
            n = 0.0f;
        }
        return new id9(new dfo(null, null, null, new aak(n, jeo.b, a0), null, 119));
    }
    
    public static ev9 j(bfa a0, float n, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            a0 = ri2.A0(0.0f, 400.0f, null, 5);
        }
        if ((n2 & 0x2) != 0x0) {
            n = 0.0f;
        }
        return new ev9(new dfo(null, null, null, new aak(n, jeo.b, a0), null, 119));
    }
    
    public static ev9 k(final bfa bfa, kb2 kb2, final int n) {
        final kb2 l = wab.L;
        bfa a0 = bfa;
        if ((n & 0x1) != 0x0) {
            final k2j a2 = eep.a;
            a0 = ri2.A0(0.0f, 400.0f, new chc(4294967297L), 1);
        }
        if ((n & 0x2) != 0x0) {
            kb2 = l;
        }
        final boolean b = (n & 0x4) != 0x0;
        mb2 mb2;
        if (mlc.q(kb2, wab.J)) {
            mb2 = wab.A;
        }
        else if (mlc.q(kb2, l)) {
            mb2 = wab.C;
        }
        else {
            mb2 = wab.B;
        }
        return l((gx)mb2, a0, (lta)new d80(1, (byte)5), b);
    }
    
    public static final ev9 l(final gx gx, final bfa bfa, final lta lta, final boolean b) {
        return new ev9(new dfo(null, null, new rd3(gx, bfa, lta, b), null, null, 123));
    }
    
    public static ev9 m(final int n) {
        mb2 mb2 = wab.B;
        final k2j a = eep.a;
        final ygm a2 = ri2.A0(0.0f, 400.0f, new chc(4294967297L), 1);
        if ((n & 0x2) != 0x0) {
            mb2 = wab.F;
        }
        return l((gx)mb2, a2, n10.U, true);
    }
    
    public static ev9 n(final bfa bfa, es v, final int n) {
        final lb2 i = wab.I;
        final lb2 g = wab.G;
        bfa a0 = bfa;
        if ((n & 0x1) != 0x0) {
            final k2j a2 = eep.a;
            a0 = ri2.A0(0.0f, 400.0f, new chc(4294967297L), 1);
        }
        lb2 lb2;
        if ((n & 0x2) != 0x0) {
            lb2 = i;
        }
        else {
            lb2 = g;
        }
        if ((n & 0x8) != 0x0) {
            v = (es)n10.V;
        }
        mb2 mb2;
        if (mlc.q(lb2, g)) {
            mb2 = wab.y;
        }
        else if (mlc.q(lb2, i)) {
            mb2 = wab.E;
        }
        else {
            mb2 = wab.B;
        }
        return l((gx)mb2, a0, new nc9((lta)v, (byte)1), true);
    }
    
    public static final id9 o(final bfa bfa, final lta lta) {
        return new id9(new dfo(null, new m4m(bfa, (lta)new oc9(lta, (byte)0)), null, null, null, 125));
    }
    
    public static final id9 p(final bfa bfa, final lta lta) {
        return new id9(new dfo(null, new m4m(bfa, new nc9(lta, (byte)2)), null, null, null, 125));
    }
    
    public static final ev9 r(final bfa bfa, final lta lta) {
        return new ev9(new dfo(null, new m4m(bfa, (lta)new oc9(lta, (byte)1)), null, null, null, 125));
    }
    
    public static final ev9 s(final bfa bfa, final lta lta) {
        return new ev9(new dfo(null, new m4m(bfa, new nc9(lta, (byte)3)), null, null, null, 125));
    }
    
    public static final id9 u(final efo efo, final id9 value, final gva gva, int n) {
        if ((((n & 0xE) ^ 0x6) > 4 && gva.f((Object)efo)) || (n & 0x6) == 0x4) {
            n = 1;
        }
        else {
            n = 0;
        }
        final Object r = gva.R();
        Object q;
        if (n != 0 || (q = r) == bi6.a) {
            q = o50.Q(value);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        final r1 a = efo.a;
        final ksg d = efo.d;
        if (a.i() == d.getValue() && efo.a.i() == ec9.w) {
            if (efo.h()) {
                bnf.setValue((Object)value);
            }
            else {
                bnf.setValue((Object)id9.b);
            }
        }
        else if (d.getValue() != ec9.x) {
            bnf.setValue((Object)((id9)((xom)bnf).getValue()).a(value));
        }
        return (id9)((xom)bnf).getValue();
    }
    
    public static final ev9 v(final efo efo, final ev9 value, final gva gva, int n) {
        if ((((n & 0xE) ^ 0x6) > 4 && gva.f((Object)efo)) || (n & 0x6) == 0x4) {
            n = 1;
        }
        else {
            n = 0;
        }
        final Object r = gva.R();
        final cib a = bi6.a;
        ksg q;
        if (n != 0 || (q = (ksg)r) == a) {
            q = o50.Q(value);
            gva.q0((Object)q);
        }
        final bnf bnf = (bnf)q;
        final r1 a2 = efo.a;
        final ksg d = efo.d;
        final Object i = a2.i();
        final Object value2 = d.getValue();
        final ec9 w = ec9.w;
        if (i == value2 && efo.a.i() == w) {
            gva.g0(-505142498);
            gva.q(false);
            if (efo.h()) {
                bnf.setValue((Object)value);
            }
            else {
                bnf.setValue((Object)ev9.b);
            }
        }
        else if (d.getValue() != w) {
            gva.g0(-504838512);
            final w3a a3 = ((ev9)((xom)bnf).getValue()).a.a;
            w3a w3a;
            if (a3 != null) {
                w3a = new w3a(1.0f, a3.b);
            }
            else {
                w3a = null;
            }
            final aak d2 = ((ev9)((xom)bnf).getValue()).a.d;
            aak aak;
            if (d2 != null) {
                aak = new aak(1.0f, d2.b, d2.c);
            }
            else {
                aak = null;
            }
            final m4m b = ((ev9)((xom)bnf).getValue()).a.b;
            m4m m4m;
            if (b == null) {
                gva.g0(-504119809);
                gva.q(false);
                m4m = null;
            }
            else {
                gva.g0(-708998590);
                Object o;
                if ((o = gva.R()) == a) {
                    o = q10.G;
                    gva.q0(o);
                }
                m4m = new m4m(b.b, (lta)o);
                gva.q(false);
            }
            final rd3 c = ((ev9)((xom)bnf).getValue()).a.c;
            rd3 rd3;
            if (c == null) {
                gva.g0(-504024174);
                gva.q(false);
                rd3 = null;
            }
            else {
                gva.g0(-708995505);
                Object o2;
                if ((o2 = gva.R()) == a) {
                    o2 = q10.H;
                    gva.q0(o2);
                }
                rd3 = new rd3(c.a, c.c, (lta)o2, c.d);
                gva.q(false);
            }
            final dfo a4 = ((ev9)((xom)bnf).getValue()).a;
            bnf.setValue((Object)new ev9(new dfo(w3a, m4m, rd3, aak, null, 96)).a(value));
            gva.q(false);
        }
        else {
            gva.g0(-503833306);
            gva.q(false);
        }
        return (ev9)((xom)bnf).getValue();
    }
}
