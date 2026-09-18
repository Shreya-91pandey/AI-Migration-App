public final class x86
{
    public static final float[] a;
    public static final float[] b;
    public static final ieo c;
    public static final ieo d;
    public static final yrj e;
    public static final yrj f;
    public static final yrj g;
    public static final yrj h;
    public static final yrj i;
    public static final yrj j;
    public static final yrj k;
    public static final yrj l;
    public static final yrj m;
    public static final yrj n;
    public static final yrj o;
    public static final yrj p;
    public static final yrj q;
    public static final yrj r;
    public static final ixc s;
    public static final ixc t;
    public static final yrj u;
    public static final yrj v;
    public static final yrj w;
    public static final s7g x;
    public static final u86[] y;
    
    static {
        final float[] array;
        final float[] a2 = array = new float[6];
        array[0] = 0.64f;
        array[1] = 0.33f;
        array[2] = 0.3f;
        array[3] = 0.6f;
        array[4] = 0.15f;
        array[5] = 0.06f;
        a = a2;
        final float[] array2;
        final float[] b2 = array2 = new float[6];
        array2[0] = 0.67f;
        array2[1] = 0.33f;
        array2[2] = 0.21f;
        array2[3] = 0.71f;
        array2[4] = 0.14f;
        array2[5] = 0.08f;
        b = b2;
        final float[] array4;
        final float[] array3 = array4 = new float[6];
        array4[0] = 0.708f;
        array4[1] = 0.292f;
        array4[2] = 0.17f;
        array4[3] = 0.797f;
        array4[4] = 0.131f;
        array4[5] = 0.046f;
        final ieo ieo = new ieo(2.4, 0.9478672985781991, 0.05213270142180095, 0.07739938080495357, 0.04045);
        final ieo ieo2 = new ieo(2.2, 0.9478672985781991, 0.05213270142180095, 0.07739938080495357, 0.04045);
        final ieo ieo3 = c = new ieo(-3.0, 2.0, 2.0, 5.591816309728916, 0.28466892, 0.55991073, -0.685490157);
        final ieo ieo4 = d = new ieo(-2.0, -1.555223, 1.860454, 0.012683313515655966, 18.8515625, -18.6875, 6.277394636015326);
        final jvp h2 = xp7.h;
        final yrj yrj = e = new yrj("sRGB IEC61966-2.1", a2, h2, ieo, 0);
        final yrj yrj2 = f = new yrj("sRGB IEC61966-2.1 (Linear)", a2, h2, 1.0, 0.0f, 1.0f, 1);
        final yrj yrj3 = g = new yrj("scRGB-nl IEC 61966-2-2:2003", a2, h2, null, (kr8)new en9((byte)13), (kr8)new en9((byte)14), -0.799f, 2.399f, ieo, 2);
        final yrj yrj4 = h = new yrj("scRGB IEC 61966-2-2:2003", a2, h2, 1.0, -0.5f, 7.499f, 3);
        final yrj yrj5 = i = new yrj("Rec. ITU-R BT.709-5", new float[] { 0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f }, h2, new ieo(2.2222222222222223, 0.9099181073703367, 0.09008189262966333, 0.2222222222222222, 0.081), 4);
        final yrj yrj6 = j = new yrj("Rec. ITU-R BT.2020-1", new float[] { 0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f }, h2, new ieo(2.2222222222222223, 0.9096697898662786, 0.09033021013372146, 0.2222222222222222, 0.08145), 5);
        final yrj yrj7 = k = new yrj("SMPTE RP 431-2-2007 DCI (P3)", new float[] { 0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f }, new jvp(0.314f, 0.351f), 2.6, 0.0f, 1.0f, 6);
        final yrj yrj8 = l = new yrj("Display P3", new float[] { 0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f }, h2, ieo, 7);
        final yrj yrj9 = m = new yrj("NTSC (1953)", b2, xp7.e, new ieo(2.2222222222222223, 0.9099181073703367, 0.09008189262966333, 0.2222222222222222, 0.081), 8);
        final yrj yrj10 = n = new yrj("SMPTE-C RGB", new float[] { 0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f }, h2, new ieo(2.2222222222222223, 0.9099181073703367, 0.09008189262966333, 0.2222222222222222, 0.081), 9);
        final yrj yrj11 = o = new yrj("Adobe RGB (1998)", new float[] { 0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f }, h2, 2.2, 0.0f, 1.0f, 10);
        final yrj yrj12 = p = new yrj("ROMM RGB ISO 22028-2:2013", new float[] { 0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f }, xp7.f, new ieo(1.8, 1.0, 0.0, 0.0625, 0.031248), 11);
        final jvp g2 = xp7.g;
        y = new u86[] { yrj, yrj2, yrj3, yrj4, yrj5, yrj6, yrj7, yrj8, yrj9, yrj10, yrj11, yrj12, q = new yrj("SMPTE ST 2065-1:2012 ACES", new float[] { 0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f }, g2, 1.0, -65504.0f, 65504.0f, 12), r = new yrj("Academy S-2014-004 ACEScg", new float[] { 0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f }, g2, 1.0, -65504.0f, 65504.0f, 13), s = new ixc("Generic XYZ", 12884901889L, 14, (byte)1), t = new ixc("Generic L*a*b*", 12884901890L, 15, (byte)0), u = new yrj("None", a2, h2, ieo2, 16), v = new yrj("Hybrid Log Gamma encoding", array3, h2, null, (kr8)new en9((byte)15), (kr8)new en9((byte)16), 0.0f, 1.0f, ieo3, 17), w = new yrj("Perceptual Quantizer encoding", array3, h2, null, (kr8)new en9((byte)17), (kr8)new en9((byte)18), 0.0f, 1.0f, ieo4, 18), x = (s7g)new u86("Oklab", 12884901890L, 19) };
    }
    
    public static double a(final ieo ieo, double n) {
        double n2;
        if (n < 0.0) {
            n2 = -1.0;
        }
        else {
            n2 = 1.0;
        }
        final double n3 = n * n2;
        final double b = ieo.b;
        final double c = ieo.c;
        n = ieo.d;
        final double e = ieo.e;
        final double f = ieo.f;
        final double g = ieo.g;
        final double n4 = b * n3;
        if (n4 <= 1.0) {
            n = Math.pow(n4, c);
        }
        else {
            n = Math.exp((n3 - f) * n) + e;
        }
        return (g + 1.0) * n2 * n;
    }
    
    public static double b(final ieo ieo, double n) {
        double n2;
        if (n < 0.0) {
            n2 = -1.0;
        }
        else {
            n2 = 1.0;
        }
        final double n3 = 1.0 / ieo.b;
        final double n4 = 1.0 / ieo.c;
        final double n5 = 1.0 / ieo.d;
        final double e = ieo.e;
        final double f = ieo.f;
        n = n * n2 / (ieo.g + 1.0);
        if (n <= 1.0) {
            n = Math.pow(n, n4) * n3;
        }
        else {
            n = Math.log(n - e) * n5 + f;
        }
        return n2 * n;
    }
    
    public static double c(final ieo ieo, double c) {
        final double n = 0.0;
        double n2;
        if (c < 0.0) {
            n2 = -1.0;
        }
        else {
            n2 = 1.0;
        }
        final double n3 = c * n2;
        final double b = ieo.b;
        final double d = ieo.d;
        c = ieo.c;
        c = Math.pow(n3, d) * c + b;
        if (c < 0.0) {
            c = n;
        }
        return Math.pow(c / (Math.pow(n3, d) * ieo.f + ieo.e), ieo.g) * n2;
    }
    
    public static double d(final ieo ieo, double n) {
        double n2;
        if (n < 0.0) {
            n2 = -1.0;
        }
        else {
            n2 = 1.0;
        }
        final double n3 = n * n2;
        final double n4 = -ieo.b;
        final double e = ieo.e;
        final double n5 = 1.0 / ieo.g;
        final double c = ieo.c;
        n = -ieo.f;
        return Math.pow(Math.max(Math.pow(n3, n5) * e + n4, 0.0) / (Math.pow(n3, n5) * n + c), 1.0 / ieo.d) * n2;
    }
}
