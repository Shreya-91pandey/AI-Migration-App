public final class px6 extends hgf implements zl6, qoe
{
    public zhg J;
    public final chk K;
    public boolean L;
    public yl2 M;
    public final jgk N;
    public final j9j O;
    public boolean P;
    public long Q;
    public boolean R;
    
    public px6(final zhg j, final chk k, final boolean l, final yl2 m, final jgk n) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = new j9j((byte)4);
        this.Q = -1L;
    }
    
    public static boolean q1(final px6 px6, final k2j k2j, long n, long n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = px6.p1();
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0L;
        }
        n = px6.s1(k2j, n, n2);
        return Math.abs(Float.intBitsToFloat((int)(n >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL))) <= 0.5f;
    }
    
    @Override
    public final void c(long q) {
        final long p = this.p1();
        this.Q = q;
        final int ordinal = ((Enum)this.J).ordinal();
        int n;
        if (ordinal != 0) {
            if (ordinal != 1) {
                en9.r();
                return;
            }
            n = mlc.u((int)(q >> 32), (int)(p >> 32));
        }
        else {
            n = mlc.u((int)(q & 0xFFFFFFFFL), (int)(p & 0xFFFFFFFFL));
        }
        if (n < 0) {
            if (!this.L) {
                if (this.J == zhg.v) {
                    q = ((long)((int)(p & 0xFFFFFFFFL) - (int)(q & 0xFFFFFFFFL)) & 0xFFFFFFFFL);
                }
                else {
                    q = (long)((int)(p >> 32) - (int)(q >> 32)) << 32;
                }
            }
            else {
                q = 0L;
            }
            final k2j k2j = (k2j)this.N.a();
            if (k2j != null && !this.R && !this.P && q1(this, k2j, p, 0L, 2) && !q1(this, k2j, 0L, q, 1)) {
                this.P = true;
                this.r1(q);
            }
        }
    }
    
    @Override
    public final boolean d1() {
        return false;
    }
    
    public final float o1(final yl2 yl2, final long n) {
        final long q = this.Q;
        final inf inf = (inf)this.O.w;
        int i = inf.x - 1;
        final Object[] v = inf.v;
        final int length = v.length;
        final k2j k2j = null;
        k2j k2j4 = null;
        Label_0217: {
            if (i < length) {
                k2j k2j2 = null;
                while (i >= 0) {
                    final k2j k2j3 = (k2j)((mx6)v[i]).a.a();
                    if (k2j3 != null) {
                        final long g = k2j3.g();
                        final long z = uoo.Z(this.p1());
                        final int ordinal = ((Enum)this.J).ordinal();
                        int n2;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                en9.r();
                                return 0.0f;
                            }
                            n2 = Float.compare(Float.intBitsToFloat((int)(g >> 32)), Float.intBitsToFloat((int)(z >> 32)));
                        }
                        else {
                            n2 = Float.compare(Float.intBitsToFloat((int)(g & 0xFFFFFFFFL)), Float.intBitsToFloat((int)(z & 0xFFFFFFFFL)));
                        }
                        if (n2 <= 0) {
                            k2j2 = k2j3;
                        }
                        else {
                            if ((k2j4 = k2j2) == null) {
                                k2j4 = k2j3;
                            }
                            break Label_0217;
                        }
                    }
                    --i;
                }
                k2j4 = k2j2;
            }
            else {
                k2j4 = null;
            }
        }
        k2j k2j5;
        if ((k2j5 = k2j4) == null) {
            k2j k2j6 = k2j;
            if (this.P) {
                k2j6 = (k2j)this.N.a();
            }
            if (k2j6 == null) {
                return 0.0f;
            }
            k2j5 = k2j6;
        }
        final long z2 = uoo.Z(q);
        final int ordinal2 = ((Enum)this.J).ordinal();
        if (ordinal2 == 0) {
            final float b = k2j5.b;
            return yl2.a(b - (int)(n & 0xFFFFFFFFL), k2j5.d - b, Float.intBitsToFloat((int)(z2 & 0xFFFFFFFFL)));
        }
        if (ordinal2 == 1) {
            final float a = k2j5.a;
            return yl2.a(a - (int)(n >> 32), k2j5.c - a, Float.intBitsToFloat((int)(z2 >> 32)));
        }
        en9.r();
        return 0.0f;
    }
    
    public final long p1() {
        long q;
        if (chc.b(q = this.Q, -1L)) {
            q = 0L;
        }
        return q;
    }
    
    public final void r1(final long n) {
        yl2 m;
        if ((m = this.M) == null) {
            m = (yl2)uoo.z(this, (sei)am2.a);
        }
        if (this.R) {
            jac.c("launchAnimation called when previous animation was running");
        }
        yl2 i;
        if ((i = this.M) == null) {
            i = (yl2)uoo.z(this, (sei)am2.a);
        }
        i.getClass();
        yl2.a.getClass();
        rhc.G(this.c1(), null, 4, (zta)new ox6(this, new kto((cg0)xl2.b), m, n, (f07)null), 1);
    }
    
    public final long s1(final k2j k2j, long z, final long n) {
        z = uoo.Z(z);
        final int ordinal = ((Enum)this.J).ordinal();
        if (ordinal == 0) {
            yl2 m;
            if ((m = this.M) == null) {
                m = (yl2)uoo.z(this, (sei)am2.a);
            }
            final float b = k2j.b;
            return (long)Float.floatToRawIntBits(0.0f) << 32 | ((long)Float.floatToRawIntBits(m.a(b - (int)(n & 0xFFFFFFFFL), k2j.d - b, Float.intBitsToFloat((int)(z & 0xFFFFFFFFL)))) & 0xFFFFFFFFL);
        }
        if (ordinal == 1) {
            yl2 i;
            if ((i = this.M) == null) {
                i = (yl2)uoo.z(this, (sei)am2.a);
            }
            final float a = k2j.a;
            return (long)Float.floatToRawIntBits(i.a(a - (int)(n >> 32), k2j.c - a, Float.intBitsToFloat((int)(z >> 32)))) << 32 | ((long)Float.floatToRawIntBits(0.0f) & 0xFFFFFFFFL);
        }
        en9.r();
        return 0L;
    }
}
