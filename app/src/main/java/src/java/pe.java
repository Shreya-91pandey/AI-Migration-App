import java.util.LinkedHashMap;
import java.util.ArrayList;

public final class pe extends mlc
{
    public final byte g;
    public final ee6 h;
    public final String i;
    public final rhc j;
    
    @Override
    public final void Q(final Object o, final cvj cvj) {
        final byte g = this.g;
        final rhc j = this.j;
        final String i = this.i;
        final ee6 h = this.h;
        switch (g) {
            default: {
                final ArrayList d = h.d;
                final Object value = h.b.get((Object)i);
                if (value != null) {
                    final int intValue = ((Number)value).intValue();
                    d.add((Object)i);
                    try {
                        h.b(intValue, j, o, cvj);
                        return;
                    }
                    catch (final Exception ex) {
                        d.remove((Object)i);
                        throw ex;
                    }
                }
                fvd.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", (Object)j, (Object)" and input ", o, (Object)". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            }
            case 0: {
                final LinkedHashMap b = h.b;
                final ArrayList d2 = h.d;
                final Object value2 = b.get((Object)i);
                if (value2 != null) {
                    final int intValue2 = ((Number)value2).intValue();
                    d2.add((Object)i);
                    try {
                        h.b(intValue2, j, o, cvj);
                        return;
                    }
                    catch (final Exception ex2) {
                        d2.remove((Object)i);
                        throw ex2;
                    }
                }
                fvd.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", (Object)j, (Object)" and input ", o, (Object)". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }
    }
    
    public void r0() {
        this.h.e(this.i);
    }
}
