public interface cw8 extends xc8
{
    default void C(final cw8 cw8, final long n, long n2, final long n3, final long n4, dw8 a, float n5, int n6) {
        if ((n6 & 0x2) != 0x0) {
            n2 = 0L;
        }
        if ((n6 & 0x10) != 0x0) {
            a = gea.a;
        }
        if ((n6 & 0x20) != 0x0) {
            n5 = 1.0f;
        }
        if ((n6 & 0x80) != 0x0) {
            n6 = 3;
        }
        else {
            n6 = 0;
        }
        cw8.p0(n, n2, n3, n4, a, n5, n6);
    }
    
    default void C0(final cw8 cw8, final long n, final float n2, long p6, dw8 a, int n3) {
        if ((n3 & 0x4) != 0x0) {
            p6 = cw8.P0();
        }
        if ((n3 & 0x10) != 0x0) {
            a = gea.a;
        }
        if ((n3 & 0x40) != 0x0) {
            n3 = 3;
        }
        else {
            n3 = 0;
        }
        cw8.N0(n, n2, p6, a, n3);
    }
    
    default void K0(final cw8 cw8, final long n, final long n2, final long n3, float n4, int n5, final int n6) {
        if ((n6 & 0x8) != 0x0) {
            n4 = 0.0f;
        }
        if ((n6 & 0x10) != 0x0) {
            n5 = 0;
        }
        cw8.R(n, n2, n3, n4, n5);
    }
    
    default void M(final cw8 cw8, final coi coi, float n, long p5, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            n = yzl.c(cw8.i()) / 2.0f;
        }
        if ((n2 & 0x4) != 0x0) {
            p5 = cw8.P0();
        }
        cw8.A0(coi, n, p5);
    }
    
    default void Q0(final k0d k0d, final g6b g6b, final lta lta) {
        final long i = k0d.v.i();
        g6b.f((xc8)k0d, k0d.getLayoutDirection(), (long)(int)Float.intBitsToFloat((int)(i >> 32)) << 32 | ((long)(int)Float.intBitsToFloat((int)(i & 0xFFFFFFFFL)) & 0xFFFFFFFFL), (lta)new rx1((byte)14, lta, (Object)k0d, (Object)k0d.w));
    }
    
    default void U(final cw8 cw8, final long n, final float n2, final float n3, final long n4, final long n5, float n6, final dw8 dw8, final int n7) {
        if ((n7 & 0x40) != 0x0) {
            n6 = 1.0f;
        }
        cw8.F(n, n2, n3, n4, n5, n6, dw8);
    }
    
    default void U0(final cw8 cw8, final qm2 qm2, long n, long j0, float n2, dw8 a, int n3, final int n4) {
        if ((n4 & 0x2) != 0x0) {
            n = 0L;
        }
        if ((n4 & 0x4) != 0x0) {
            j0 = j0(cw8.i(), n);
        }
        if ((n4 & 0x8) != 0x0) {
            n2 = 1.0f;
        }
        if ((n4 & 0x10) != 0x0) {
            a = gea.a;
        }
        if ((n4 & 0x40) != 0x0) {
            n3 = 3;
        }
        cw8.l0(qm2, n, j0, n2, a, n3);
    }
    
    default void Z0(final cw8 cw8, final g90 g90, final long n, float n2, dw8 a, final int n3) {
        if ((n3 & 0x4) != 0x0) {
            n2 = 1.0f;
        }
        if ((n3 & 0x8) != 0x0) {
            a = gea.a;
        }
        cw8.m(g90, n, n2, a);
    }
    
    default void b1(final cw8 cw8, final qm2 qm2, long n, long j0, final long n2, dw8 a, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n = 0L;
        }
        if ((n3 & 0x4) != 0x0) {
            j0 = j0(cw8.i(), n);
        }
        if ((n3 & 0x20) != 0x0) {
            a = gea.a;
        }
        cw8.t0(qm2, n, j0, n2, 1.0f, a);
    }
    
    default void g0(final cw8 cw8, final n70 n70, long n71, float n72, final he2 he2, int n73, final int n74) {
        if ((n74 & 0x2) != 0x0) {
            n71 = 0L;
        }
        if ((n74 & 0x4) != 0x0) {
            n72 = 1.0f;
        }
        if ((n74 & 0x20) != 0x0) {
            n73 = 3;
        }
        cw8.B(n70, n71, n72, he2, n73);
    }
    
    default long j0(final long n, final long n2) {
        return (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n >> 32)) - Float.intBitsToFloat((int)(n2 >> 32))) << 32 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) - Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL))) & 0xFFFFFFFFL);
    }
    
    default void k0(final cw8 cw8, final n70 n70, long n71, long n72, long n73, final long n74, float n75, he2 he2, int n76, final int n77) {
        final long n78 = 0L;
        long n79;
        if ((n77 & 0x2) != 0x0) {
            n79 = 0L;
        }
        else {
            n79 = n71;
        }
        if ((n77 & 0x4) != 0x0) {
            n71 = ((long)n70.a.getWidth() << 32 | ((long)n70.a.getHeight() & 0xFFFFFFFFL));
        }
        else {
            n71 = n72;
        }
        if ((n77 & 0x8) != 0x0) {
            n72 = n78;
        }
        else {
            n72 = n73;
        }
        if ((n77 & 0x10) != 0x0) {
            n73 = n71;
        }
        else {
            n73 = n74;
        }
        if ((n77 & 0x20) != 0x0) {
            n75 = 1.0f;
        }
        if ((n77 & 0x80) != 0x0) {
            he2 = null;
        }
        if ((n77 & 0x200) != 0x0) {
            n76 = 1;
        }
        cw8.q(n70, n79, n71, n72, n73, n75, he2, n76);
    }
    
    default void r(final cw8 cw8, final long n, long n2, long j0, float n3, tym a, he2 he2, int n4) {
        if ((n4 & 0x2) != 0x0) {
            n2 = 0L;
        }
        if ((n4 & 0x4) != 0x0) {
            j0 = j0(cw8.i(), n2);
        }
        if ((n4 & 0x8) != 0x0) {
            n3 = 1.0f;
        }
        if ((n4 & 0x10) != 0x0) {
            a = (tym)gea.a;
        }
        if ((n4 & 0x20) != 0x0) {
            he2 = null;
        }
        if ((n4 & 0x40) != 0x0) {
            n4 = 3;
        }
        else {
            n4 = 0;
        }
        cw8.S0(n, n2, j0, n3, a, he2, n4);
    }
    
    default void s0(final cw8 cw8, final g90 g90, final qm2 qm2, float n, tym a, int n2) {
        if ((n2 & 0x4) != 0x0) {
            n = 1.0f;
        }
        if ((n2 & 0x8) != 0x0) {
            a = (tym)gea.a;
        }
        if ((n2 & 0x20) != 0x0) {
            n2 = 3;
        }
        else {
            n2 = 0;
        }
        cw8.l(g90, qm2, n, a, n2);
    }
    
    void A0(final coi p0, final float p1, final long p2);
    
    void B(final n70 p0, final long p1, final float p2, final he2 p3, final int p4);
    
    zn0 B0();
    
    void F(final long p0, final float p1, final float p2, final long p3, final long p4, final float p5, final dw8 p6);
    
    void N0(final long p0, final float p1, final long p2, final dw8 p3, final int p4);
    
    default long P0() {
        return ach.K(this.B0().A());
    }
    
    void R(final long p0, final long p1, final long p2, final float p3, final int p4);
    
    void S0(final long p0, final long p1, final long p2, final float p3, final dw8 p4, final he2 p5, final int p6);
    
    qzc getLayoutDirection();
    
    default long i() {
        return this.B0().A();
    }
    
    void l(final g90 p0, final qm2 p1, final float p2, final dw8 p3, final int p4);
    
    void l0(final qm2 p0, final long p1, final long p2, final float p3, final dw8 p4, final int p5);
    
    void m(final g90 p0, final long p1, final float p2, final dw8 p3);
    
    void p0(final long p0, final long p1, final long p2, final long p3, final dw8 p4, final float p5, final int p6);
    
    void q(final n70 p0, final long p1, final long p2, final long p3, final long p4, final float p5, final he2 p6, final int p7);
    
    void t0(final qm2 p0, final long p1, final long p2, final long p3, final float p4, final dw8 p5);
}
