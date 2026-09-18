import java.util.List;

public abstract class bin
{
    public static final String a;
    
    static {
        a = rym.B0(10, "H");
    }
    
    public static long a(final mnn mnn, final xc8 xc8, final tna tna) {
        final a90 b = b(mnn, xc8, tna, 1, false);
        return (long)zn2.q(b.a.p()) << 32 | ((long)zn2.q(b.f) & 0xFFFFFFFFL);
    }
    
    public static final a90 b(final mnn mnn, final xc8 xc8, final tna tna, final int n, final boolean b) {
        final String n2 = c86.N0((Iterable)ncq.T(0, n), (CharSequence)"\n", (String)null, (String)null, (lta)new cyl((byte)26), 30);
        final r89 v = r89.v;
        return new a90(new e90(n2, mnn, (List)v, (List)v, tna, xc8, b), n, 1, hv6.b(0, 0, 0, 0, 15));
    }
}
