public final class wq7 implements u09
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    
    public wq7(float a, final float b, float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final boolean naN = Float.isNaN(a);
        int i = 0;
        if (naN || Float.isNaN(b) || Float.isNaN(c) || Float.isNaN(d)) {
            final StringBuilder r = hia.r("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", a, ", ", b, ", ");
            r.append(c);
            r.append(", ");
            r.append(d);
            r.append(".");
            rih.a(r.toString());
        }
        final float[] array = new float[5];
        final float n = (b - 0.0f) * 3.0f;
        a = (d - b) * 3.0f;
        c = (1.0f - d) * 3.0f;
        final double n2 = n;
        final double n3 = a;
        final double n4 = c;
        final double n5 = n3 * 2.0;
        final double n6 = n2 - n5 + n4;
        int c2;
        if (n6 == 0.0) {
            if (n3 == n4) {
                c2 = 0;
            }
            else {
                c2 = xp7.c0((float)((n5 - n4) / (n5 - n4 * 2.0)), array, 0);
            }
        }
        else {
            final double n7 = -Math.sqrt(n3 * n3 - n4 * n2);
            final double n8 = -n2 + n3;
            final int c3 = xp7.c0((float)(-(n7 + n8) / n6), array, 0);
            c2 = xp7.c0((float)((n7 - n8) / n6), array, c3) + c3;
            if (c2 > 1) {
                final float n9 = array[0];
                final float n10 = array[1];
                if (n9 > n10) {
                    array[0] = n10;
                    array[1] = n9;
                }
                else if (n9 == n10) {
                    --c2;
                }
            }
        }
        final float n11 = (a - n) * 2.0f;
        final int c4 = xp7.c0(-n11 / ((c - a) * 2.0f - n11), array, c2);
        c = Math.min(0.0f, 1.0f);
        a = Math.max(0.0f, 1.0f);
        while (i < c4 + c2) {
            final float n12 = array[i];
            final float n13 = ((((b - d) * 3.0f + 1.0f - 0.0f) * n12 + (d - b * 2.0f + 0.0f) * 3.0f) * n12 + n) * n12 + 0.0f;
            c = Math.min(c, n13);
            a = Math.max(a, n13);
            ++i;
        }
        final long n14 = (long)Float.floatToRawIntBits(c) << 32 | ((long)Float.floatToRawIntBits(a) & 0xFFFFFFFFL);
        this.e = Float.intBitsToFloat((int)(n14 >> 32));
        this.f = Float.intBitsToFloat((int)(n14 & 0xFFFFFFFFL));
    }
    
    @Override
    public final float a(float n) {
        if (n <= 0.0f || n >= 1.0f) {
            return n;
        }
        final float max = Math.max(n, 1.1920929E-7f);
        final float n2 = 0.0f - max;
        final float a = this.a;
        final float n3 = a - max;
        final float c = this.c;
        final float n4 = c - max;
        final double n5 = n2;
        final double n6 = n3;
        final float n7 = 0.0f;
        final float n8 = 0.0f;
        final float n9 = 0.0f;
        float n10 = 0.0f;
        final float n11 = 0.0f;
        final double n12 = (n5 - n6 * 2.0 + n4) * 3.0;
        final double n13 = (n3 - n2) * 3.0;
        final double n14 = (n3 - n4) * 3.0 + -n2 + (1.0f - max);
        final double abs = Math.abs(n14 - 0.0);
        final float n15 = Float.NaN;
        float n16 = 0.0f;
        Label_0257: {
            if (abs < 1.0E-7) {
                if (Math.abs(n12 - 0.0) < 1.0E-7) {
                    if (Math.abs(n13 - 0.0) < 1.0E-7) {
                        n16 = n15;
                    }
                    else {
                        final float n17 = (float)(-n5 / n13);
                        float n18;
                        if (n17 < 0.0f) {
                            n18 = n11;
                        }
                        else {
                            n18 = n17;
                        }
                        float n19;
                        if (n18 > 1.0f) {
                            n19 = 1.0f;
                        }
                        else {
                            n19 = n18;
                        }
                        n16 = n19;
                        if (Math.abs(n19 - n17) > 1.05E-6f) {
                            n16 = n15;
                        }
                    }
                }
                else {
                    final double sqrt = Math.sqrt(n13 * n13 - 4.0 * n12 * n5);
                    final double n20 = n12 * 2.0;
                    final float n21 = (float)((sqrt - n13) / n20);
                    float n22;
                    if (n21 < 0.0f) {
                        n22 = 0.0f;
                    }
                    else {
                        n22 = n21;
                    }
                    float n23 = n22;
                    if (n22 > 1.0f) {
                        n23 = 1.0f;
                    }
                    float n24 = n23;
                    if (Math.abs(n23 - n21) > 1.05E-6f) {
                        n24 = Float.NaN;
                    }
                    if (!Float.isNaN(n24)) {
                        n16 = n24;
                    }
                    else {
                        final float n25 = (float)((-n13 - sqrt) / n20);
                        float n26;
                        if (n25 < 0.0f) {
                            n26 = n7;
                        }
                        else {
                            n26 = n25;
                        }
                        float n27;
                        if (n26 > 1.0f) {
                            n27 = 1.0f;
                        }
                        else {
                            n27 = n26;
                        }
                        n16 = n27;
                        if (Math.abs(n27 - n25) > 1.05E-6f) {
                            n16 = n15;
                        }
                    }
                }
            }
            else {
                final double n28 = n12 / n14;
                final double n29 = n13 / n14;
                final double n30 = n5 / n14;
                final double n31 = (n29 * 3.0 - n28 * n28) / 9.0;
                final double n32 = (n30 * 27.0 + (2.0 * n28 * n28 * n28 - 9.0 * n28 * n29)) / 54.0;
                final double n33 = n31 * (n31 * n31);
                final double n34 = n32 * n32 + n33;
                final double n35 = n28 / 3.0;
                final double n36 = dcmpg(n34, 0.0);
                if (n36 < 0) {
                    final double sqrt2 = Math.sqrt(-n33);
                    double n37;
                    if ((n37 = -n32 / sqrt2) < -1.0) {
                        n37 = -1.0;
                    }
                    double n38 = n37;
                    if (n37 > 1.0) {
                        n38 = 1.0;
                    }
                    final double acos = Math.acos(n38);
                    final double n39 = vt4.y((float)sqrt2) * 2.0f;
                    final float n40 = (float)(Math.cos(acos / 3.0) * n39 - n35);
                    float n41;
                    if (n40 < 0.0f) {
                        n41 = 0.0f;
                    }
                    else {
                        n41 = n40;
                    }
                    float n42 = n41;
                    if (n41 > 1.0f) {
                        n42 = 1.0f;
                    }
                    float n43 = n42;
                    if (Math.abs(n42 - n40) > 1.05E-6f) {
                        n43 = Float.NaN;
                    }
                    if (Float.isNaN(n43)) {
                        final float n44 = (float)(Math.cos((6.283185307179586 + acos) / 3.0) * n39 - n35);
                        float n45;
                        if (n44 < 0.0f) {
                            n45 = 0.0f;
                        }
                        else {
                            n45 = n44;
                        }
                        float n46 = n45;
                        if (n45 > 1.0f) {
                            n46 = 1.0f;
                        }
                        n43 = n46;
                        if (Math.abs(n46 - n44) > 1.05E-6f) {
                            n43 = Float.NaN;
                        }
                        if (Float.isNaN(n43)) {
                            final float n47 = (float)(Math.cos((acos + 12.566370614359172) / 3.0) * n39 - n35);
                            float n48;
                            if (n47 < 0.0f) {
                                n48 = n8;
                            }
                            else {
                                n48 = n47;
                            }
                            float n49;
                            if (n48 > 1.0f) {
                                n49 = 1.0f;
                            }
                            else {
                                n49 = n48;
                            }
                            n16 = n49;
                            if (Math.abs(n49 - n47) > 1.05E-6f) {
                                n16 = n15;
                            }
                            break Label_0257;
                        }
                    }
                    n16 = n43;
                }
                else if (n36 == 0) {
                    final float n50 = -vt4.y((float)n32);
                    final float n51 = (float)n35;
                    final float n52 = n50 * 2.0f - n51;
                    float n53;
                    if (n52 < 0.0f) {
                        n53 = 0.0f;
                    }
                    else {
                        n53 = n52;
                    }
                    float n54 = n53;
                    if (n53 > 1.0f) {
                        n54 = 1.0f;
                    }
                    float n55 = n54;
                    if (Math.abs(n54 - n52) > 1.05E-6f) {
                        n55 = Float.NaN;
                    }
                    if (!Float.isNaN(n55)) {
                        n16 = n55;
                    }
                    else {
                        final float n56 = -n50 - n51;
                        float n57;
                        if (n56 < 0.0f) {
                            n57 = n9;
                        }
                        else {
                            n57 = n56;
                        }
                        float n58;
                        if (n57 > 1.0f) {
                            n58 = 1.0f;
                        }
                        else {
                            n58 = n57;
                        }
                        n16 = n58;
                        if (Math.abs(n58 - n56) > 1.05E-6f) {
                            n16 = n15;
                        }
                    }
                }
                else {
                    final double sqrt3 = Math.sqrt(n34);
                    final float n59 = (float)(vt4.y((float)(-n32 + sqrt3)) - vt4.y((float)(n32 + sqrt3)) - n35);
                    if (n59 >= 0.0f) {
                        n10 = n59;
                    }
                    float n60;
                    if (n10 > 1.0f) {
                        n60 = 1.0f;
                    }
                    else {
                        n60 = n10;
                    }
                    n16 = n60;
                    if (Math.abs(n60 - n59) > 1.05E-6f) {
                        n16 = n15;
                    }
                }
            }
        }
        final boolean naN = Float.isNaN(n16);
        final float d = this.d;
        final float b = this.b;
        if (naN) {
            final StringBuilder r = hia.r("The cubic curve with parameters (", a, ", ", b, ", ");
            oz1.z(r, c, ", ", d, ") has no solution at ");
            r.append(n);
            throw new IllegalArgumentException(r.toString());
        }
        final float n61 = (((b - d + 0.33333334f) * n16 + (d - 2.0f * b)) * n16 + b) * 3.0f * n16;
        final float e = this.e;
        n = n61;
        if (n61 < e) {
            n = e;
        }
        final float f = this.f;
        if (n > f) {
            return f;
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof wq7) {
            final wq7 wq7 = (wq7)o;
            if (this.a == wq7.a && this.b == wq7.b && this.c == wq7.c && this.d == wq7.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.d) + oz1.d(this.c, oz1.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = hia.r("CubicBezierEasing(a=", this.a, ", b=", this.b, ", c=");
        r.append(this.c);
        r.append(", d=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}
