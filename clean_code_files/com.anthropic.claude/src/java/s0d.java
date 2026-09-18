import java.util.List;

public final class s0d extends h0d
{
    public final v0d b;
    public final zta c;
    
    public s0d(final v0d b, final zta c, final String s) {
        this.b = b;
        this.c = c;
        super(s);
    }
    
    public final noe b(final ooe ooe, final List list, final long n) {
        final v0d b = this.b;
        final q0d c = b.C;
        c.v = ((flc)ooe).getLayoutDirection();
        c.w = ((xc8)ooe).getDensity();
        c.x = ((xc8)ooe).o0();
        final boolean r0 = ((flc)ooe).r0();
        final zta c2 = this.c;
        if (!r0 && b.v.D != null) {
            b.z = 0;
            final noe noe = (noe)c2.d((Object)b.D, (Object)new gv6(n));
            return (noe)new r0d(noe, b, b.z, noe, (byte)0);
        }
        b.y = 0;
        final noe noe2 = (noe)c2.d((Object)c, (Object)new gv6(n));
        return (noe)new r0d(noe2, b, b.y, noe2, (byte)1);
    }
}
