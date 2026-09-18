import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Locale;

public final class l0k extends qxc implements lta
{
    public static final l0k A;
    public static final l0k B;
    public static final l0k x;
    public static final l0k y;
    public static final l0k z;
    public final byte w;
    
    public l0k(final kx7 kx7) {
        this.w = 8;
        super(1);
    }
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        final boolean b = true;
        final boolean b2 = true;
        boolean contains = false;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                String s = (String)o;
                final int v0 = kym.V0((CharSequence)s, ':', 0, 6);
                if (v0 > 0) {
                    contains = kx7.b.contains((Object)s.substring(0, v0));
                }
                if (contains) {
                    s = null;
                }
                return s;
            }
            case 7: {
                final deh deh = (deh)o;
                return a;
            }
            case 6: {
                final deh deh2 = (deh)o;
                return a;
            }
            case 5: {
                final deh deh3 = (deh)o;
                return a;
            }
            case 4: {
                final ak ak = (ak)o;
                return a;
            }
            case 3: {
                return ((Reference)((rtm)o).b).get() == null && b2;
            }
            case 2: {
                return o == ec9.w && b;
            }
            case 1: {
                return String.format(Locale.US, "%02x", Arrays.copyOf(new Object[] { ((Number)o).byteValue() }, 1));
            }
            case 0: {
                return new xx7((tjc)o);
            }
        }
    }
}
