public enum h9a
{
    w("DOUBLE_LIST_PACKED", 35, 35, 3, a), 
    x("SINT64_LIST_PACKED", 48, 48, 3, y2);
    
    public static final h9a[] y;
    public static final h9a[] z;
    public final byte v;
    
    static {
        final kpc a = kpc.A;
        final h9a h9a = new h9a("DOUBLE", 0, 0, 1, a);
        final kpc z2 = kpc.z;
        final h9a h9a2 = new h9a("FLOAT", 1, 1, 1, z2);
        final kpc y2 = kpc.y;
        final h9a h9a3 = new h9a("INT64", 2, 2, 1, y2);
        final h9a h9a4 = new h9a("UINT64", 3, 3, 1, y2);
        final kpc x2 = kpc.x;
        final h9a h9a5 = new h9a("INT32", 4, 4, 1, x2);
        final h9a h9a6 = new h9a("FIXED64", 5, 5, 1, y2);
        final h9a h9a7 = new h9a("FIXED32", 6, 6, 1, x2);
        final kpc b = kpc.B;
        final h9a h9a8 = new h9a("BOOL", 7, 7, 1, b);
        final kpc c = kpc.C;
        final h9a h9a9 = new h9a("STRING", 8, 8, 1, c);
        final kpc f = kpc.F;
        final h9a h9a10 = new h9a("MESSAGE", 9, 9, 1, f);
        final kpc d = kpc.D;
        final h9a h9a11 = new h9a("BYTES", 10, 10, 1, d);
        final h9a h9a12 = new h9a("UINT32", 11, 11, 1, x2);
        final kpc e = kpc.E;
        final h9a[] values = values();
        y = new h9a[values.length];
        for (final h9a h9a13 : values) {
            h9a.y[h9a13.v] = h9a13;
        }
    }
    
    public h9a(final String s, int d, final int v, final int n, final kpc kpc) {
        this.v = (byte)v;
        d = ge9.D(n);
        if (d != 1) {
            if (d == 3) {
                final Class v2 = kpc.v;
            }
        }
        else {
            final Class v3 = kpc.v;
        }
        if (n == 1) {
            kpc.ordinal();
        }
    }
}
