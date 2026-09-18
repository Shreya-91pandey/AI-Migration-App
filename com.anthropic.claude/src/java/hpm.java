import io.sentry.c2;
import java.util.Map$Entry;
import java.util.Iterator;

public final class hpm extends g1 implements Iterator, stc
{
    public final byte B;
    
    public final Object next() {
        final byte b = this.B;
        final gpm gpm = null;
        Object value = null;
        switch (b) {
            default: {
                final Map$Entry map$Entry = (Map$Entry)super.A;
                if (map$Entry != null) {
                    this.a();
                    value = map$Entry.getValue();
                }
                else {
                    c2.c();
                }
                return value;
            }
            case 0: {
                this.a();
                gpm gpm2;
                if (super.z != null) {
                    gpm2 = new gpm(this);
                }
                else {
                    c2.c();
                    gpm2 = gpm;
                }
                return gpm2;
            }
        }
    }
}
