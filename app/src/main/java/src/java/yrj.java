import java.util.Arrays;

public final class yrj extends u86
{
    public static final fvd r;
    public final jvp d;
    public final float e;
    public final float f;
    public final ieo g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final kr8 k;
    public final xrj l;
    public final urj m;
    public final kr8 n;
    public final xrj o;
    public final urj p;
    public final boolean q;
    
    static {
        r = (fvd)new Object();
    }
    
    public yrj(final String s, final float[] array, final jvp jvp, final double n, final float n2, final float n3, final int n4) {
        final double n5 = dcmpg(n, 1.0);
        Object r = yrj.r;
        Object o;
        if (n5 == 0) {
            o = r;
        }
        else {
            o = new vrj(n, (byte)0);
        }
        if (n5 != 0) {
            r = new vrj(n, (byte)1);
        }
        this(s, array, jvp, null, (kr8)o, (kr8)r, n2, n3, new ieo(n, 1.0, 0.0, 0.0, 0.0), n4);
    }
    
    public yrj(final String s, final float[] array, final jvp jvp, final ieo ieo, final int n) {
        final double a = ieo.a;
        final boolean b = a == -3.0;
        final double g = ieo.g;
        final double f = ieo.f;
        wrj wrj;
        if (b) {
            wrj = new wrj(ieo, (byte)4);
        }
        else if (a == -2.0) {
            wrj = new wrj(ieo, (byte)5);
        }
        else if (f == 0.0 && g == 0.0) {
            wrj = new wrj(ieo, (byte)6);
        }
        else {
            wrj = new wrj(ieo, (byte)7);
        }
        wrj wrj2;
        if (a == -3.0) {
            wrj2 = new wrj(ieo, (byte)0);
        }
        else if (a == -2.0) {
            wrj2 = new wrj(ieo, (byte)1);
        }
        else if (f == 0.0 && g == 0.0) {
            wrj2 = new wrj(ieo, (byte)2);
        }
        else {
            wrj2 = new wrj(ieo, (byte)3);
        }
        this(s, array, jvp, null, (kr8)wrj, (kr8)wrj2, 0.0f, 1.0f, ieo, n);
    }
    
    public yrj(final String s, final float[] array, final jvp d, final float[] i, final kr8 k, final kr8 n, final float e, final float f, final ieo g, int j) {
        super(s, 12884901888L, j);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = k;
        this.l = new xrj(this, (byte)1);
        this.m = new urj(this, (byte)0);
        this.n = n;
        this.o = new xrj(this, (byte)0);
        this.p = new urj(this, (byte)1);
        if (array.length != 6 && array.length != 9) {
            en9.s("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (e < f) {
            final float[] h = new float[6];
            if (array.length == 9) {
                final float n2 = array[0];
                final float n3 = array[1];
                final float n4 = n2 + n3 + array[2];
                h[0] = n2 / n4;
                h[1] = n3 / n4;
                final float n5 = array[3];
                final float n6 = array[4];
                final float n7 = n5 + n6 + array[5];
                h[2] = n5 / n7;
                h[3] = n6 / n7;
                final float n8 = array[6];
                final float n9 = array[7];
                final float n10 = n8 + n9 + array[8];
                h[4] = n8 / n10;
                h[5] = n9 / n10;
            }
            else {
                System.arraycopy((Object)array, 0, (Object)h, 0, 6);
            }
            this.h = h;
            float[] l;
            if (i == null) {
                final float n11 = h[0];
                final float n12 = h[1];
                final float n13 = h[2];
                final float n14 = h[3];
                final float n15 = h[4];
                final float n16 = h[5];
                final float a = d.a;
                final float b = d.b;
                final float n17 = 1.0f - n11;
                final float n18 = n17 / n12;
                final float n19 = 1.0f - n13;
                final float n20 = n19 / n14;
                final float n21 = 1.0f - n15;
                final float n22 = n21 / n16;
                final float n23 = (1.0f - a) / b;
                final float n24 = n11 / n12;
                final float n25 = n13 / n14;
                final float n26 = n15 / n16;
                final float n27 = a / b;
                final float n28 = n25 - n24;
                final float n29 = n27 - n24;
                final float n30 = n20 - n18;
                final float n31 = n26 - n24;
                final float n32 = ((n23 - n18) * n28 - n29 * n30) / ((n22 - n18) * n28 - n30 * n31);
                final float n33 = (n29 - n31 * n32) / n28;
                final float n34 = 1.0f - n33 - n32;
                final float n35 = n34 / n12;
                final float n36 = n33 / n14;
                final float n37 = n32 / n16;
                l = new float[] { n11 * n35, n34, (n17 - n12) * n35, n13 * n36, n33, (n19 - n14) * n36, n15 * n37, n32, (n21 - n16) * n37 };
                this.i = l;
            }
            else {
                if (i.length != 9) {
                    en9.s(smk.p(i.length, "Transform must have 9 entries! Has "));
                    throw null;
                }
                this.i = i;
                l = i;
            }
            this.j = mlc.M(l);
            final float f2 = lq6.f(h);
            final float[] a2 = x86.a;
            if (f2 / lq6.f(x86.b) > 0.9f) {
                final float[] a3 = x86.a;
                final float n38 = h[0];
                final float n39 = a3[0];
                final float n40 = h[1];
                final float n41 = a3[1];
                final float n42 = h[2];
                final float n43 = a3[2];
                final float n44 = h[3];
                final float n45 = a3[3];
                final float n46 = h[4];
                final float n47 = a3[4];
                final float n48 = h[5];
                final float n49 = a3[5];
                final float[] array2 = { n38 - n39, n40 - n41, n42 - n43, n44 - n45, n46 - n47, n48 - n49 };
                final float n50 = array2[0];
                final float n51 = array2[1];
                if ((n41 - n49) * n50 - (n39 - n47) * n51 >= 0.0f) {
                    if ((n39 - n43) * n51 - (n41 - n45) * n50 >= 0.0f) {
                        final float n52 = array2[2];
                        final float n53 = array2[3];
                        if ((n45 - n41) * n52 - (n43 - n39) * n53 >= 0.0f) {
                            if ((n43 - n47) * n53 - (n45 - n49) * n52 >= 0.0f) {
                                final float n54 = array2[4];
                                final float n55 = array2[5];
                                if ((n49 - n45) * n54 - (n47 - n43) * n55 < 0.0f || (n47 - n39) * n55 - (n49 - n41) * n54 >= 0.0f) {}
                            }
                        }
                    }
                }
            }
            boolean q = false;
            Label_1147: {
                if (j != 0) {
                    final float[] a4 = x86.a;
                Label_1013:
                    while (true) {
                        Label_1025: {
                            if (h == a4) {
                                break Label_1025;
                            }
                            for (j = 0; j < 6; ++j) {
                                if (Float.compare(h[j], a4[j]) != 0 && Math.abs(h[j] - a4[j]) > 0.001f) {
                                    break Label_1013;
                                }
                            }
                            break Label_1025;
                            q = false;
                            break Label_1147;
                        }
                        if (!mlc.w(d, xp7.h)) {
                            continue Label_1013;
                        }
                        if (e != 0.0f || f != 1.0f) {
                            continue Label_1013;
                        }
                        final float[] a5 = x86.a;
                        final yrj e2 = x86.e;
                        for (double n56 = 0.0; n56 <= 1.0; n56 += 0.00392156862745098) {
                            if (Math.abs(k.b(n56) - e2.k.b(n56)) > 0.001 || Math.abs(n.b(n56) - e2.n.b(n56)) > 0.001) {
                                continue Label_1013;
                            }
                        }
                        break;
                    }
                }
                q = true;
            }
            this.q = q;
            return;
        }
        en9.s(ge9.s("Invalid range: min=", e, ", max=", f, "; min must be strictly < max"));
        throw null;
    }
    
    @Override
    public final float a(final int n) {
        return this.f;
    }
    
    @Override
    public final float b(final int n) {
        return this.e;
    }
    
    @Override
    public final boolean c() {
        return this.q;
    }
    
    @Override
    public final long d(float n, float n2, float n3) {
        final double n4 = n;
        final urj p3 = this.p;
        n = (float)p3.b(n4);
        n2 = (float)p3.b((double)n2);
        final float n5 = (float)p3.b((double)n3);
        final float[] i = this.i;
        if (i.length < 9) {
            return 0L;
        }
        final float n6 = i[0];
        final float n7 = i[3];
        n3 = i[6];
        return (long)Float.floatToRawIntBits(n3 * n5 + (n7 * n2 + n6 * n)) << 32 | (0xFFFFFFFFL & (long)Float.floatToRawIntBits(i[7] * n5 + (i[4] * n2 + i[1] * n)));
    }
    
    @Override
    public final float e(float n, float n2, float n3) {
        final double n4 = n;
        final urj p3 = this.p;
        n = (float)p3.b(n4);
        n2 = (float)p3.b((double)n2);
        n3 = (float)p3.b((double)n3);
        final float[] i = this.i;
        return i[8] * n3 + (i[5] * n2 + i[2] * n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || yrj.class != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final yrj yrj = (yrj)o;
        if (Float.compare(yrj.e, this.e) != 0) {
            return false;
        }
        if (Float.compare(yrj.f, this.f) != 0) {
            return false;
        }
        if (!mlc.q((Object)this.d, (Object)yrj.d)) {
            return false;
        }
        if (!Arrays.equals(this.h, yrj.h)) {
            return false;
        }
        final ieo g = yrj.g;
        final ieo g2 = this.g;
        if (g2 != null) {
            return mlc.q((Object)g2, (Object)g);
        }
        return g == null || (mlc.q((Object)this.k, (Object)yrj.k) && mlc.q((Object)this.n, (Object)yrj.n));
    }
    
    @Override
    public final long f(final float n, final float n2, final float n3, final float n4, final u86 u86) {
        final float[] j = this.j;
        final float n5 = j[0];
        final float n6 = j[3];
        final float n7 = j[6];
        final float n8 = j[1];
        final float n9 = j[4];
        final float n10 = j[7];
        final float n11 = j[2];
        final float n12 = j[5];
        final float n13 = j[8];
        final double n14 = n7 * n3 + (n6 * n2 + n5 * n);
        final urj m = this.m;
        return t08.b((float)m.b(n14), (float)m.b((double)(n10 * n3 + (n9 * n2 + n8 * n))), (float)m.b((double)(n13 * n3 + (n12 * n2 + n11 * n))), n4, u86);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = super.hashCode();
        final int hashCode2 = this.d.hashCode();
        final int hashCode3 = Arrays.hashCode(this.h);
        final float e = this.e;
        int hashCode4 = 0;
        int floatToIntBits;
        if (e == 0.0f) {
            floatToIntBits = 0;
        }
        else {
            floatToIntBits = Float.floatToIntBits(e);
        }
        final float f = this.f;
        int floatToIntBits2;
        if (f == 0.0f) {
            floatToIntBits2 = 0;
        }
        else {
            floatToIntBits2 = Float.floatToIntBits(f);
        }
        final ieo g = this.g;
        if (g != null) {
            hashCode4 = g.hashCode();
        }
        final int n = (((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + floatToIntBits) * 31 + floatToIntBits2) * 31 + hashCode4;
        if (g == null) {
            return this.n.hashCode() + (this.k.hashCode() + n * 31) * 31;
        }
        return n;
    }
}
