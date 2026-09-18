import android.os.LocaleList;
import java.util.Locale;

public final class kpd
{
    public static final kpd b;
    public final lpd a;
    
    static {
        b = new kpd(new lpd(new LocaleList(new Locale[0])));
    }
    
    public kpd(final lpd a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kpd && this.a.equals(((kpd)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.a.toString();
    }
}
