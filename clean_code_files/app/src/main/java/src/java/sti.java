import java.util.AbstractMap;
import java.util.Map;
import java.util.Collection;
import java.lang.ref.Reference;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public final class sti
{
    public final gui a;
    public final qd6 b;
    public final Object c;
    
    public sti(final gui a, final qd6 b) {
        this.a = a;
        this.b = b;
        this.c = new Object();
    }
    
    public final wse a(final vse vse) {
        final Object c;
        monitorenter(c = this.c);
        Label_0339: {
            Object o = null;
            Label_0206: {
                try {
                    o = ((fui)this.a.c).a.get((Object)vse);
                    wse wse;
                    if (o != null) {
                        wse = new wse(((eui)o).b(), ((eui)o).a());
                    }
                    else {
                        wse = null;
                    }
                    o = wse;
                    if (wse == null) {
                        final qd6 b = this.b;
                        final ArrayList list = (ArrayList)((LinkedHashMap)b.x).get((Object)vse);
                        if (list != null) {
                            while (true) {
                                for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
                                    final jui jui = (jui)((List)list).get(i);
                                    final a1c a1c = (a1c)((Reference)jui.b()).get();
                                    if (a1c != null) {
                                        o = new wse(a1c, jui.a());
                                    }
                                    else {
                                        o = null;
                                    }
                                    if (o != null) {
                                        b.f();
                                        break Label_0206;
                                    }
                                }
                                o = null;
                                continue;
                            }
                        }
                        o = null;
                    }
                }
                finally {
                    break Label_0339;
                }
            }
            if (o != null && !((wse)o).b().d()) {
                final Object c2 = this.c;
                synchronized (c2) {
                    final fui fui = (fui)this.a.c;
                    final Throwable t;
                    final Object remove = ((Map)fui.a).remove((Object)t);
                    if (remove != null) {
                        fui.c = fui.b() - fui.c(t, remove);
                        fui.a(t, remove, null);
                    }
                    if (remove != null) {}
                    if (((AbstractMap)this.b.x).remove((Object)t) != null) {}
                }
            }
            monitorexit(c);
            return (wse)o;
        }
        monitorexit(c);
    }
    
    public final void b(final vse vse, final wse wse) {
        final Object c;
        monitorenter(c = this.c);
        Label_0088: {
            long c2;
            try {
                c2 = wse.b().c();
                if (c2 >= 0L) {
                    this.a.c(vse, wse.b(), wse.a(), c2);
                    monitorexit(c);
                    return;
                }
            }
            finally {
                break Label_0088;
            }
            final StringBuilder sb = new StringBuilder("Image size must be non-negative: ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString().toString());
        }
        monitorexit(c);
    }
    
    public final void c(final long b) {
        final Object c = this.c;
        synchronized (c) {
            final fui fui = (fui)this.a.c;
            fui.d(fui.b = b);
        }
    }
}
