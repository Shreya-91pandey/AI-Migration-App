import java.util.Map;
import java.util.LinkedHashMap;

public final class it9
{
    public static final o55 c;
    public static final LinkedHashMap d;
    public final aof a;
    public final e3a b;
    
    static {
        c = new o55((byte)16);
        d = new LinkedHashMap();
    }
    
    public it9(final String s, final boolean b) {
        final o55 c;
        monitorenter(c = it9.c);
        Label_0098: {
            Object value;
            try {
                final LinkedHashMap d = it9.d;
                if ((value = d.get((Object)s)) == null) {
                    value = new cof();
                    ((Map)d).put((Object)s, value);
                }
            }
            finally {
                break Label_0098;
            }
            final aof a = (aof)value;
            monitorexit(c);
            this.a = a;
            e3a b2;
            if (b) {
                final String s2;
                b2 = new e3a(s2);
            }
            else {
                b2 = null;
            }
            this.b = b2;
            return;
        }
        monitorexit(c);
    }
}
