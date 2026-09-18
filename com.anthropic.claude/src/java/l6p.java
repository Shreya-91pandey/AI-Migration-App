import java.util.ArrayList;
import java.util.List;

public abstract class l6p
{
    public static final int a = 0;
    
    static {
        final int i = j86.i;
    }
    
    public static final List a(final String s) {
        if (s != null) {
            final e3a e3a = new e3a((byte)19);
            ArrayList w = (ArrayList)e3a.w;
            if (w == null) {
                w = new ArrayList();
                e3a.w = w;
            }
            else {
                w.clear();
            }
            e3a.L(s, w);
            final ArrayList list = (ArrayList)e3a.w;
            if (list != null) {
                return (List)list;
            }
        }
        return (List)r89.v;
    }
}
