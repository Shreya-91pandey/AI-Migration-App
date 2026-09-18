import java.util.Collection;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.LinkedList;

public final class a09 implements vu6
{
    public static final uy8 A;
    public static final uy8 y;
    public static final uy8 z;
    public final byte v;
    public Object w;
    public volatile Object x;
    
    static {
        y = new uy8((byte)4);
        z = new uy8((byte)5);
        A = new uy8((byte)6);
    }
    
    public a09(final byte v) {
        switch (this.v = v) {
            default: {
                return;
            }
            case 2: {
                final fdo x = fdo.x;
                this.w = new LinkedList();
                this.x = x;
                return;
            }
            case 1: {
                this.w = new CopyOnWriteArraySet();
            }
        }
    }
    
    public a09(final y4g w) {
        this.v = 3;
        this.w = w;
        ((Number)w.a()).longValue();
        this.x = new hep(0L, (Long)null);
    }
    
    public static HashMap a(final Set set, final iua iua) {
        final HashMap hashMap = new HashMap(((Collection)set).size() * 4 / 3);
        for (final Map$Entry map$Entry : set) {
            hashMap.put((Object)a09.y.apply((Object)map$Entry), (Object)iua.apply((Object)map$Entry));
        }
        return new HashMap((Map)hashMap);
    }
    
    public void b(final Context x) {
        this.x = x;
        final Iterator iterator = ((CopyOnWriteArraySet)this.w).iterator();
        while (iterator.hasNext()) {
            ((ae6)iterator.next()).a();
        }
    }
    
    public void c() {
        hep x = (hep)this.x;
        final long longValue = ((Number)((y4g)this.w).a()).longValue();
        final Long a = x.a;
        if (a != null) {
            x = new hep(longValue - a + x.b, (Long)null);
        }
        this.x = x;
    }
    
    public void d() {
        hep x = (hep)this.x;
        final long longValue = ((Number)((y4g)this.w).a()).longValue();
        if (x.a == null) {
            x = new hep(x.b, Long.valueOf(longValue));
        }
        this.x = x;
    }
    
    @Override
    public void f() {
        synchronized (this) {
            ((LinkedList)this.w).clear();
        }
    }
    
    @Override
    public void g(final eu6 eu6) {
        synchronized (this) {
            ((LinkedList)this.w).remove((Object)eu6);
        }
    }
    
    @Override
    public void l(final fdo x) {
        synchronized (this) {
            if (x == this.x) {
                return;
            }
            final fdo fdo = (fdo)this.x;
            this.x = x;
            for (final eu6 eu6 : (LinkedList)this.w) {
                ljq.D((Executor)eu6.y, "Data migration", eu6.z, (Runnable)new cu6(eu6, fdo, eu6.a(fdo), x, eu6.a(x)));
            }
        }
    }
    
    @Override
    public fdo m() {
        return (fdo)this.x;
    }
    
    @Override
    public void p(final eu6 eu6) {
        synchronized (this) {
            ((LinkedList)this.w).add((Object)eu6);
        }
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 0: {
                return ((yb7)this.x).toString();
            }
        }
    }
}
