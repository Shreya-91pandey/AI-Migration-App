import java.util.AbstractMap;
import java.util.Map;

public final class z3e
{
    public final u3e a(final Object o, final Object o2) {
        final u3e u3e = (u3e)o;
        final u3e u3e2 = (u3e)o2;
        u3e u3e3 = u3e;
        if (!((AbstractMap)u3e2).isEmpty()) {
            u3e c = u3e;
            if (!u3e.v) {
                c = u3e.c();
            }
            c.a();
            u3e3 = c;
            if (!((AbstractMap)u3e2).isEmpty()) {
                c.putAll((Map)u3e2);
                u3e3 = c;
            }
        }
        return u3e3;
    }
}
