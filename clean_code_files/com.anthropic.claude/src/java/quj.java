import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;

public abstract class quj
{
    public fz6 a;
    public Executor b;
    public muj c;
    public emc d;
    public final c2l e;
    public final ThreadLocal f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public boolean i;
    
    public quj() {
        this.e = new c2l(new y4g(0, this, quj.class, "onClosed", "onClosed()V", 0, (byte)1));
        this.f = new ThreadLocal();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = true;
    }
    
    public final void a() {
        final c2l e = this.e;
        synchronized (e) {
            if (!((AtomicBoolean)e.y).compareAndSet(false, true)) {
                return;
            }
            monitorexit(e);
            while (((AtomicInteger)e.x).get() != 0) {}
            ((y4g)e.w).a();
            ((AtomicBoolean)e.z).compareAndSet(false, true);
        }
    }
    
    public List b() {
        return (List)r89.v;
    }
    
    public emc c() {
        throw new Error("This function should be implemented by Room's generated database implementation.");
    }
    
    public ox4 d() {
        throw new Error("This function should be implemented by Room's generated database implementation.");
    }
    
    public final emc e() {
        final emc d = this.d;
        if (d != null) {
            return d;
        }
        mlc.j0("internalTracker");
        throw null;
    }
    
    public Set f() {
        return (Set)z89.v;
    }
    
    public Map g() {
        return (Map)s89.v;
    }
    
    public Map h() {
        return (Map)s89.v;
    }
    
    public final Object i(final boolean b, final zta zta, final h07 h07) {
        if (((AtomicBoolean)this.e.z).get()) {
            en9.q("Database is closed");
            return null;
        }
        final muj c = this.c;
        if (c != null) {
            return c.n(b, zta, h07);
        }
        mlc.j0("connectionManager");
        throw null;
    }
}
