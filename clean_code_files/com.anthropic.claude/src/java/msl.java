import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import android.content.SharedPreferences;
import java.util.Set;
import android.content.Context;

public final class msl
{
    public final rf0 a;
    public final m45 b;
    public final Context c;
    public final String d;
    public final l7n e;
    public final Set f;
    
    public msl(final Context c, final String d, final Set set, final rf0 a, final m45 b) {
        final kkk kkk = new kkk(c, d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new l7n((jta)kkk);
        Set v1;
        if (set == osl.a) {
            v1 = null;
        }
        else {
            v1 = c86.v1((Iterable)set);
        }
        this.f = v1;
    }
    
    public final Object a(Object o, final h07 h07) {
        lsl lsl2 = null;
        Label_0051: {
            if (h07 instanceof lsl) {
                final lsl lsl = (lsl)h07;
                final int x = lsl.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    lsl.x = x + Integer.MIN_VALUE;
                    lsl2 = lsl;
                    break Label_0051;
                }
            }
            lsl2 = new lsl(this, h07);
        }
        final Object v = lsl2.v;
        final int x2 = lsl2.x;
        boolean b = true;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            o = v;
        }
        else {
            vt4.g0(v);
            lsl2.x = 1;
            final Object d = this.a.d(o, (Object)lsl2);
            final pc7 v2 = pc7.v;
            if ((o = d) == v2) {
                return v2;
            }
        }
        if (!(boolean)o) {
            return Boolean.FALSE;
        }
        final l7n e = this.e;
        final Set f = this.f;
        if (f == null) {
            final Map all = ((SharedPreferences)e.getValue()).getAll();
            all.getClass();
            if (!all.isEmpty()) {
                return b;
            }
        }
        else {
            final Iterable iterable = (Iterable)f;
            final SharedPreferences sharedPreferences = (SharedPreferences)e.getValue();
            if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
                final Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    if (sharedPreferences.contains((String)iterator.next())) {
                        return b;
                    }
                }
            }
        }
        b = false;
        return b;
    }
}
