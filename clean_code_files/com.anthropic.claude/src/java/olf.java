import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.Map$Entry;
import android.os.Looper;

public class olf
{
    public static final Object k;
    public final Object a;
    public final w6k b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final h j;
    
    static {
        k = new Object();
    }
    
    public olf() {
        this.a = new Object();
        this.b = new w6k();
        this.c = 0;
        final Object k = olf.k;
        this.f = k;
        this.j = new h(this, (byte)3);
        this.e = k;
        this.g = -1;
    }
    
    public olf(final int n) {
        final afg y = j9j.y;
        this.a = new Object();
        this.b = new w6k();
        this.c = 0;
        this.f = olf.k;
        this.j = new h(this, (byte)3);
        this.e = y;
        this.g = 0;
    }
    
    public static void a(final String s) {
        pu0.O().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        en9.q(hia.k("Cannot invoke ", s, " on a background thread"));
    }
    
    public final void b(final dmd dmd) {
        if (dmd.w) {
            if (!dmd.d()) {
                dmd.a(false);
                return;
            }
            final int x = dmd.x;
            final int g = this.g;
            if (x < g) {
                dmd.x = g;
                dmd.v.v(this.e);
            }
        }
    }
    
    public final void c(dmd dmd) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            dmd dmd2 = null;
            Label_0105: {
                if (dmd != null) {
                    this.b(dmd);
                    dmd2 = null;
                }
                else {
                    final w6k b = this.b;
                    b.getClass();
                    final u6k u6k = new u6k(b);
                    b.x.put((Object)u6k, (Object)Boolean.FALSE);
                    do {
                        dmd2 = dmd;
                        if (!u6k.hasNext()) {
                            break Label_0105;
                        }
                        this.b((dmd)((Map$Entry)u6k.next()).getValue());
                    } while (!this.i);
                    dmd2 = dmd;
                }
            }
            dmd = dmd2;
        } while (this.i);
        this.h = false;
    }
    
    public final void d(final gbd gbd, final j5g j5g) {
        a("observe");
        if (gbd.d().b() != tad.v) {
            final cmd cmd = new cmd(this, gbd, j5g);
            final dmd dmd = (dmd)this.b.a(j5g, (dmd)cmd);
            if (dmd != null && !dmd.c(gbd)) {
                en9.s("Cannot add the same observer with different lifecycles");
                return;
            }
            if (dmd == null) {
                gbd.d().a((fbd)cmd);
            }
        }
    }
    
    public void e() {
    }
    
    public void f() {
    }
    
    public final void g(final Object f) {
        final Object a = this.a;
        synchronized (a) {
            final boolean b = this.f == olf.k;
            this.f = f;
            monitorexit(a);
            if (!b) {
                return;
            }
            final pu0 o = pu0.O();
            final h j = this.j;
            final s78 i = o.i;
            if (i.k == null) {
                monitorenter(i.i);
                Label_0100: {
                    try {
                        if (i.k == null) {
                            i.k = s78.O(Looper.getMainLooper());
                        }
                        break Label_0100;
                    }
                    finally {
                        monitorexit(a);
                        monitorexit(a);
                    }
                }
            }
            i.k.post((Runnable)j);
        }
    }
    
    public void h(final j5g obj) {
        a("removeObserver");
        final w6k b = this.b;
        final WeakHashMap x = b.x;
        t6k t6k;
        for (t6k = b.v; t6k != null && !t6k.v.equals(obj); t6k = t6k.x) {}
        dmd w = null;
        if (t6k != null) {
            --b.y;
            if (!x.isEmpty()) {
                final Iterator iterator = x.keySet().iterator();
                while (iterator.hasNext()) {
                    ((v6k)iterator.next()).a(t6k);
                }
            }
            final t6k y = t6k.y;
            final t6k x2 = t6k.x;
            if (y != null) {
                y.x = x2;
            }
            else {
                b.v = x2;
            }
            final t6k x3 = t6k.x;
            if (x3 != null) {
                x3.y = y;
            }
            else {
                b.w = y;
            }
            t6k.x = null;
            t6k.y = null;
            w = t6k.w;
        }
        if (w == null) {
            return;
        }
        w.b();
        w.a(false);
    }
    
    public void i(final Object e) {
        a("setValue");
        ++this.g;
        this.e = e;
        this.c(null);
    }
}
