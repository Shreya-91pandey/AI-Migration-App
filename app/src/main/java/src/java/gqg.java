public abstract class gqg
{
    public static final b09 a;
    
    static {
        a = new b09((jta)new mff((byte)18), (byte)0);
    }
    
    public static final void a(final nun nun, final igf igf, final id9 id9, final ev9 ev9, final bfa bfa, final ye6 ye6, final gva gva, final int n) {
        final kb2 k = wab.K;
        gva.i0(-1101649866);
        int n2;
        if (gva.f((Object)nun)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)ye6)) {
            n3 = 1048576;
        }
        else {
            n3 = 524288;
        }
        final int n4 = n | n2 | 0x324B0 | n3;
        Object v;
        id9 id10;
        ev9 ev11;
        bfa bfa3;
        if (gva.W(n4 & 0x1, (0x92493 & n4) != 0x92492)) {
            gva.b0();
            bfa bfa2;
            ev9 ev10;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                bfa2 = bfa;
                v = igf;
                id10 = id9;
                ev10 = ev9;
            }
            else {
                final mun g = nun.v.g();
                final oun w = nun.w;
                final jqg a = g.b(w).a();
                id9 id11;
                if (mlc.q((Object)a, (Object)wab.U)) {
                    id11 = pc9.o((bfa)mqg.c, (lta)new nqg(g, (byte)5));
                }
                else if (mlc.q((Object)a, (Object)wab.W)) {
                    id11 = pc9.o((bfa)mqg.e, (lta)new nqg(g, (byte)0));
                }
                else if (mlc.q((Object)a, (Object)wab.V)) {
                    id11 = pc9.o((bfa)mqg.c, (lta)new nqg(g, (byte)1));
                }
                else if (mlc.q((Object)a, (Object)wab.X)) {
                    id11 = pc9.o((bfa)mqg.e, (lta)new nqg(g, (byte)2));
                }
                else if (mlc.q((Object)a, (Object)wab.a0)) {
                    id11 = pc9.c((bfa)mqg.d, k, 12).a(pc9.o((bfa)mqg.c, (lta)new oqg(g, w, (byte)0)));
                }
                else if (mlc.q((Object)a, (Object)wab.c0)) {
                    id11 = pc9.g((bfa)mqg.b, 2);
                }
                else {
                    id11 = id9.b;
                }
                final mun g2 = nun.v.g();
                final oun w2 = nun.w;
                final jqg a2 = g2.b(w2).a();
                if (mlc.q((Object)a2, (Object)wab.Y)) {
                    ev10 = pc9.r((bfa)mqg.c, (lta)new nqg(g2, (byte)3));
                }
                else if (mlc.q((Object)a2, (Object)wab.Z)) {
                    ev10 = pc9.r((bfa)mqg.c, (lta)new nqg(g2, (byte)4));
                }
                else if (mlc.q((Object)a2, (Object)wab.b0)) {
                    ev10 = pc9.k((bfa)mqg.d, k, 12).a(pc9.r((bfa)mqg.c, (lta)new oqg(g2, w2, (byte)1)));
                }
                else if (mlc.q((Object)a2, (Object)wab.d0)) {
                    ev10 = pc9.h((bfa)mqg.b, 2);
                }
                else {
                    ev10 = ev9.b;
                }
                final ygm a3 = mqg.a;
                v = fgf.v;
                id10 = id11;
                bfa2 = (bfa)a3;
            }
            gva.r();
            ((qe0)gva.j((sei)gqg.a)).a(new re0(nun, v, id10, ev10, bfa2, (cua)ye6), gva, 0);
            ev11 = ev10;
            bfa3 = bfa2;
        }
        else {
            gva.Z();
            bfa3 = bfa;
            ev11 = ev9;
            id10 = id9;
            v = igf;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new cf0(nun, (igf)v, id10, ev11, bfa3, ye6, n);
        }
    }
}
