import androidx.work.impl.WorkDatabase;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.LinkedHashMap;
import androidx.work.impl.WorkDatabase_Impl;

public final class fmc
{
    public final WorkDatabase_Impl a;
    public final dho b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final geb e;
    public final geb f;
    public final Object g;
    
    public fmc(final WorkDatabase_Impl a, final LinkedHashMap linkedHashMap, final LinkedHashMap linkedHashMap2, final String... array) {
        this.a = a;
        final dho b = new dho(a, linkedHashMap, linkedHashMap2, array, ((WorkDatabase)a).k, new a0(1, (Object)this, (Class)fmc.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte)17));
        this.b = b;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new geb(this, (byte)24);
        this.f = new geb(this, (byte)25);
        Collections.newSetFromMap((Map)new IdentityHashMap()).getClass();
        this.g = new Object();
        b.k = new h87((Object)this, (byte)23);
    }
}
