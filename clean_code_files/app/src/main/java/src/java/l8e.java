import java.util.Arrays;

public final class l8e
{
    public final float[] a = a;
    
    public static float[] a() {
        return new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f };
    }
    
    public static final long b(final long n, final float[] array) {
        if (array.length < 16) {
            return n;
        }
        final float n2 = array[0];
        final float n3 = array[1];
        final float n4 = array[3];
        final float n5 = array[4];
        final float n6 = array[5];
        final float n7 = array[7];
        final float n8 = array[12];
        final float n9 = array[13];
        final float n10 = array[15];
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        float n11 = 1.0f / (n7 * intBitsToFloat2 + n4 * intBitsToFloat + n10);
        if ((Float.floatToRawIntBits(n11) & Integer.MAX_VALUE) >= 2139095040) {
            n11 = 0.0f;
        }
        return (long)Float.floatToRawIntBits((n5 * intBitsToFloat2 + n2 * intBitsToFloat + n8) * n11) << 32 | ((long)Float.floatToRawIntBits((n6 * intBitsToFloat2 + n3 * intBitsToFloat + n9) * n11) & 0xFFFFFFFFL);
    }
    
    public static final void c(final float[] array, final smf smf) {
        if (array.length < 16) {
            return;
        }
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[3];
        final float n4 = array[4];
        final float n5 = array[5];
        final float n6 = array[7];
        final float n7 = array[12];
        final float n8 = array[13];
        final float n9 = array[15];
        final float a = smf.a;
        final float b = smf.b;
        final float c = smf.c;
        final float d = smf.d;
        final float n10 = n3 * a;
        final float n11 = n6 * b;
        float n12 = 1.0f / (n10 + n11 + n9);
        final int floatToRawIntBits = Float.floatToRawIntBits(n12);
        final float n13 = 0.0f;
        if ((floatToRawIntBits & Integer.MAX_VALUE) >= 2139095040) {
            n12 = 0.0f;
        }
        final float n14 = n * a;
        final float n15 = n4 * b;
        final float n16 = (n14 + n15 + n7) * n12;
        final float n17 = a * n2;
        final float n18 = b * n5;
        final float n19 = (n17 + n18 + n8) * n12;
        final float n20 = n6 * d;
        float n21 = 1.0f / (n10 + n20 + n9);
        if ((Float.floatToRawIntBits(n21) & Integer.MAX_VALUE) >= 2139095040) {
            n21 = 0.0f;
        }
        final float n22 = n4 * d;
        final float n23 = (n14 + n22 + n7) * n21;
        final float n24 = n5 * d;
        final float n25 = (n17 + n24 + n8) * n21;
        final float n26 = n3 * c;
        float n27 = 1.0f / (n11 + n26 + n9);
        if ((Float.floatToRawIntBits(n27) & Integer.MAX_VALUE) >= 2139095040) {
            n27 = 0.0f;
        }
        final float n28 = n * c;
        final float n29 = (n28 + n15 + n7) * n27;
        final float n30 = c * n2;
        final float n31 = (n18 + n30 + n8) * n27;
        final float n32 = 1.0f / (n26 + n20 + n9);
        float n33 = n13;
        if ((Float.floatToRawIntBits(n32) & Integer.MAX_VALUE) < 2139095040) {
            n33 = n32;
        }
        final float n34 = (n28 + n22 + n7) * n33;
        final float n35 = (n30 + n24 + n8) * n33;
        smf.a = Math.min(n16, Math.min(n23, Math.min(n29, n34)));
        smf.b = Math.min(n19, Math.min(n25, Math.min(n31, n35)));
        smf.c = Math.max(n16, Math.max(n23, Math.max(n29, n34)));
        smf.d = Math.max(n19, Math.max(n25, Math.max(n31, n35)));
    }
    
    public static final void d(final float[] array) {
        if (array.length < 16) {
            return;
        }
        array[0] = 1.0f;
        array[2] = (array[1] = 0.0f);
        array[4] = (array[3] = 0.0f);
        array[5] = 1.0f;
        array[7] = (array[6] = 0.0f);
        array[9] = (array[8] = 0.0f);
        array[10] = 1.0f;
        array[12] = (array[11] = 0.0f);
        array[14] = (array[13] = 0.0f);
        array[15] = 1.0f;
    }
    
    public static void e(final float[] array, final float n, final float n2, float n3, float n4, float n5, float n6, float n7, float n8, float n9, final int n10) {
        if ((n10 & 0x4) != 0x0) {
            n3 = 0.0f;
        }
        if ((n10 & 0x8) != 0x0) {
            n4 = 0.0f;
        }
        float n11;
        if ((n10 & 0x20) != 0x0) {
            n11 = 0.0f;
        }
        else {
            n11 = n5;
        }
        if ((n10 & 0x40) != 0x0) {
            n6 = 0.0f;
        }
        if ((n10 & 0x80) != 0x0) {
            n5 = 0.0f;
        }
        else {
            n5 = n7;
        }
        final double n12 = n11 * 0.017453292519943295;
        final float n13 = (float)Math.sin(n12);
        n7 = (float)Math.cos(n12);
        final float n14 = -n13;
        final float n15 = 0.0f * n7 + n4 * n13;
        final double n16 = n6 * 0.017453292519943295;
        final float n17 = (float)Math.sin(n16);
        final float n18 = (float)Math.cos(n16);
        final float n19 = -n17;
        final float n20 = n13 * n17;
        final float n21 = n13 * n18;
        n6 = -n3;
        final double n22 = n5 * 0.017453292519943295;
        final float n23 = (float)Math.sin(n22);
        final float n24 = (float)Math.cos(n22);
        final float n25 = -n23;
        final float n26 = (n20 * n23 + n18 * n24) * n8;
        n5 = n23 * n7 * n8;
        n8 *= n23 * n21 + n24 * n19;
        final float n27 = (n24 * n20 + n25 * n18) * n9;
        final float n28 = n7 * n24 * n9;
        n9 *= n24 * n21 + n25 * n19;
        if (array.length < 16) {
            return;
        }
        array[0] = n26;
        array[1] = n5;
        array[2] = n8;
        array[3] = 0.0f;
        array[4] = n27;
        array[5] = n28;
        array[6] = n9;
        array[7] = 0.0f;
        array[8] = n7 * n17 * 1.0f;
        array[9] = n14 * 1.0f;
        array[10] = n7 * n18 * 1.0f;
        array[11] = 0.0f;
        final float n29 = -n;
        array[12] = n26 * n29 - n27 * n2 + (n15 * n17 + n3 * n18) + n;
        array[13] = n5 * n29 - n28 * n2 + (n4 * n7 - 0.0f * n13) + n2;
        array[14] = n29 * n8 - n2 * n9 + (n15 * n18 + n6 * n17);
        array[15] = 1.0f;
    }
    
    public static final void f(final float[] array, final float[] array2) {
        if (array.length >= 16) {
            if (array2.length >= 16) {
                final float n = array[0];
                final float n2 = array2[0];
                final float n3 = array[1];
                final float n4 = array2[4];
                final float n5 = array[2];
                final float n6 = array2[8];
                final float n7 = array[3];
                final float n8 = array2[12];
                final float n9 = array2[1];
                final float n10 = array2[5];
                final float n11 = array2[9];
                final float n12 = array2[13];
                final float n13 = array2[2];
                final float n14 = array2[6];
                final float n15 = array2[10];
                final float n16 = array2[14];
                final float n17 = array2[3];
                final float n18 = array2[7];
                final float n19 = array2[11];
                final float n20 = array2[15];
                final float n21 = array[4];
                final float n22 = array[5];
                final float n23 = array[6];
                final float n24 = array[7];
                final float n25 = array[8];
                final float n26 = array[9];
                final float n27 = array[10];
                final float n28 = array[11];
                final float n29 = array[12];
                final float n30 = array[13];
                final float n31 = array[14];
                final float n32 = array[15];
                array[0] = n7 * n8 + (n5 * n6 + (n3 * n4 + n * n2));
                array[1] = n7 * n12 + (n5 * n11 + (n3 * n10 + n * n9));
                array[2] = n7 * n16 + (n5 * n15 + (n3 * n14 + n * n13));
                array[3] = n7 * n20 + (n5 * n19 + (n3 * n18 + n * n17));
                array[4] = n24 * n8 + (n23 * n6 + (n22 * n4 + n21 * n2));
                array[5] = n24 * n12 + (n23 * n11 + (n22 * n10 + n21 * n9));
                array[6] = n24 * n16 + (n23 * n15 + (n22 * n14 + n21 * n13));
                array[7] = n24 * n20 + (n23 * n19 + (n22 * n18 + n21 * n17));
                array[8] = n28 * n8 + (n27 * n6 + (n26 * n4 + n25 * n2));
                array[9] = n28 * n12 + (n27 * n11 + (n26 * n10 + n25 * n9));
                array[10] = n28 * n16 + (n27 * n15 + (n26 * n14 + n25 * n13));
                array[11] = n28 * n20 + (n27 * n19 + (n26 * n18 + n25 * n17));
                array[12] = n8 * n32 + (n6 * n31 + (n4 * n30 + n2 * n29));
                array[13] = n12 * n32 + (n11 * n31 + (n10 * n30 + n9 * n29));
                array[14] = n16 * n32 + (n15 * n31 + (n14 * n30 + n13 * n29));
                array[15] = n32 * n20 + (n31 * n19 + (n30 * n18 + n29 * n17));
            }
        }
    }
    
    public static final void g(final float[] array, final float n, final float n2) {
        if (array.length < 16) {
            return;
        }
        final float n3 = array[0];
        final float n4 = array[4];
        final float n5 = array[8];
        final float n6 = array[12];
        final float n7 = array[1];
        final float n8 = array[5];
        final float n9 = array[9];
        final float n10 = array[13];
        final float n11 = array[2];
        final float n12 = array[6];
        final float n13 = array[10];
        final float n14 = array[14];
        final float n15 = array[3];
        final float n16 = array[7];
        final float n17 = array[11];
        final float n18 = array[15];
        array[12] = n5 * 0.0f + (n4 * n2 + n3 * n) + n6;
        array[13] = n9 * 0.0f + (n8 * n2 + n7 * n) + n10;
        array[14] = n13 * 0.0f + (n12 * n2 + n11 * n) + n14;
        array[15] = n17 * 0.0f + (n16 * n2 + n15 * n) + n18;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof l8e) {
            if (mlc.q((Object)this.a, (Object)((l8e)o).a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final float[] a = this.a;
        final float n = a[0];
        final float n2 = a[1];
        final float n3 = a[2];
        final float n4 = a[3];
        final float n5 = a[4];
        final float n6 = a[5];
        final float n7 = a[6];
        final float n8 = a[7];
        final float n9 = a[8];
        final float n10 = a[9];
        final float n11 = a[10];
        final float n12 = a[11];
        final float n13 = a[12];
        final float n14 = a[13];
        final float n15 = a[14];
        final float n16 = a[15];
        final StringBuilder r = hia.r("\n            |", n, " ", n2, " ");
        oz1.z(r, n3, " ", n4, "|\n            |");
        oz1.z(r, n5, " ", n6, " ");
        oz1.z(r, n7, " ", n8, "|\n            |");
        oz1.z(r, n9, " ", n10, " ");
        oz1.z(r, n11, " ", n12, "|\n            |");
        oz1.z(r, n13, " ", n14, " ");
        r.append(n15);
        r.append(" ");
        r.append(n16);
        r.append("|\n        ");
        return lym.p0(r.toString());
    }
}
