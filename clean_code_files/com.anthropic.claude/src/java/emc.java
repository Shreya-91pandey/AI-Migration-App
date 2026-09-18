import java.util.concurrent.atomic.AtomicBoolean;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class emc
{
    public final quj a;
    public final cho b;
    public final AtomicInteger c;
    public final cmc d;
    public final cmc e;
    public final Object f;
    
    public emc(final quj a, final LinkedHashMap linkedHashMap, final LinkedHashMap linkedHashMap2, final String... array) {
        this.a = a;
        final cho b = new cho(a, linkedHashMap, linkedHashMap2, array, a.i);
        this.b = b;
        this.c = new AtomicInteger(0);
        this.d = new cmc(this, (byte)0);
        this.e = new cmc(this, (byte)1);
        this.f = new Object();
        b.i = new cmc(this, (byte)2);
    }
    
    public final Object a(final t2k t2k, final h07 h07) {
        dmc dmc2 = null;
        Label_0051: {
            if (h07 instanceof dmc) {
                final dmc dmc = (dmc)h07;
                final int x = dmc.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    dmc.x = x + Integer.MIN_VALUE;
                    dmc2 = dmc;
                    break Label_0051;
                }
            }
            dmc2 = new dmc(this, h07);
        }
        final Object v = dmc2.v;
        final pc7 v2 = pc7.v;
        final int x2 = dmc2.x;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            final cho b = this.b;
            dmc2.x = 1;
            if (b.b(t2k, dmc2) == v2) {
                return v2;
            }
        }
        final Object f;
        monitorenter(f = this.f);
        monitorexit(f);
        return lqo.a;
    }
    
    public final void b() {
        if (!((AtomicBoolean)this.a.e.z).get()) {
            final cho b = this.b;
            if (((AtomicBoolean)b.h).compareAndSet(false, true)) {
                this.d.a();
                final fz6 a = ((quj)b.b).a;
                if (a != null) {
                    rhc.G((oc7)a, (hc7)new lc7("Room Invalidation Tracker Refresh"), 0, (zta)new frd((Object)b, (Object)this.e, (f07)null, (byte)22), 2);
                    return;
                }
                mlc.j0("coroutineScope");
                throw null;
            }
        }
    }
}
