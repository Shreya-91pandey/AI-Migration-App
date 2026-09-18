public final class rze
{
    public static final tgh a;
    public static final hng b;
    
    static {
        a = new tgh(true, false, 30);
        omo.m(12.0f, 0.0f, 4.0f, 0.0f, 10);
        final int a2 = f0f.a;
        b = new hng(12.0f, 0.0f, 12.0f, 0.0f);
    }
    
    public static uze a(final r86 r86) {
        final uze g0 = r86.g0;
        if (g0 == null) {
            return r86.g0 = new uze(0, s86.c(r86, 17), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), j86.b(0.38f, s86.c(r86, 17)), j86.b(0.38f, s86.c(r86, 17)));
        }
        return g0;
    }
    
    public static uze b(final gva gva) {
        return a(((e8e)gva.j((sei)h8e.a)).a);
    }
    
    public static uze c(long h, long h2, long h3, final gva gva, final int n) {
        if ((n & 0x1) != 0x0) {
            h = j86.h;
        }
        if ((n & 0x2) != 0x0) {
            h2 = j86.h;
        }
        if ((n & 0x4) != 0x0) {
            h3 = j86.h;
        }
        final long h4 = j86.h;
        return uze.a(a(((e8e)gva.j((sei)h8e.a)).a), h, h2, h3, h4, h4, h4);
    }
}
