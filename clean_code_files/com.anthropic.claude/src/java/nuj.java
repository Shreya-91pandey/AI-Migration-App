import java.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import android.app.ActivityManager;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import android.content.Context;

public final class nuj
{
    public final us4 a;
    public final Context b;
    public final String c;
    public final jta d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final myd h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final ArrayList k;
    public boolean l;
    public boolean m;
    public boolean n;
    public v2k o;
    
    public nuj(final us4 a, final String c, final jta d, final Context b) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new myd((byte)1);
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new ArrayList();
        this.l = true;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final quj a() {
        final LinkedHashSet j = this.j;
        final boolean empty = ((Collection)j).isEmpty();
        final LinkedHashSet i = this.i;
        if (!empty) {
            final Iterator iterator = ((Set)j).iterator();
            while (iterator.hasNext()) {
                final int intValue = ((Number)iterator.next()).intValue();
                if (!((Set)i).contains((Object)intValue)) {
                    continue;
                }
                oyl.g((Object)smk.p(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                return null;
            }
        }
        if (this.o == null) {
            this.o = (v2k)new sdr((byte)23);
        }
        ge9.a(1);
        final Context b = this.b;
        final Object systemService = b.getSystemService("activity");
        ActivityManager activityManager;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager)systemService;
        }
        else {
            activityManager = null;
        }
        int n;
        if (activityManager != null && activityManager.isLowRamDevice()) {
            n = 2;
        }
        else {
            n = 3;
        }
        Object a;
        if (n == 2) {
            a = gzl.a;
        }
        else {
            a = new Object();
        }
        final boolean l = this.l;
        final boolean m = this.m;
        final boolean n2 = this.n;
        final v2k o = this.o;
        if (o == null) {
            en9.s("Required value was null.");
            return null;
        }
        final o68 a2 = vo8.a;
        final d58 w = d58.w;
        final String c = this.c;
        final myd h = this.h;
        final ArrayList e = this.e;
        final ArrayList f = this.f;
        final ArrayList g = this.g;
        final ArrayList k = this.k;
        final zv7 zv7 = new zv7(b, c, h, (List)e, n, l, m, i, (List)f, (List)g, (List)k, n2, o, (hc7)w, (fp6)a);
        quj quj;
        if ((quj = (quj)this.d.a()) == null) {
            quj = (quj)mlc.D(qt7.z((rtc)this.a));
        }
        quj.i = true;
        final ox4 d = quj.d();
        d.getClass();
        quj.c = new muj(zv7, d, new gw4(2, quj, zrn.class, "withTransactionContext", "withTransactionContext(Landroidx/room3/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte)1));
        quj.d = quj.c();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set f2 = quj.f();
        final int size = ((List)k).size();
        final boolean[] array = new boolean[size];
        final Iterator iterator2 = f2.iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            final int n3 = -1;
            if (hasNext) {
                final rtc rtc = (rtc)iterator2.next();
                final int n4 = ((Collection)k).size() - 1;
                int n5 = n3;
                if (n4 >= 0) {
                    n5 = n4;
                    while (true) {
                        final int n6 = n5 - 1;
                        if (((us4)rtc).d(((List)k).get(n5))) {
                            array[n5] = true;
                            break;
                        }
                        if (n6 < 0) {
                            n5 = n3;
                            break;
                        }
                        n5 = n6;
                    }
                }
                if (n5 < 0) {
                    oyl.g((Object)hia.k("A required auto migration spec (", war.q(rtc), ") is missing in the database configuration."));
                    return null;
                }
                ((Map)linkedHashMap).put((Object)rtc, ((List)k).get(n5));
            }
            else {
                int n7 = ((Collection)k).size() - 1;
                if (n7 >= 0) {
                    while (true) {
                        final int n8 = n7 - 1;
                        if (n7 >= size || !array[n7]) {
                            en9.s("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            return null;
                        }
                        if (n8 < 0) {
                            break;
                        }
                        n7 = n8;
                    }
                }
                final Iterator iterator3 = quj.b().iterator();
                if (!iterator3.hasNext()) {
                    qt7.a0(quj.g(), zv7.i, (zta)new cqg((byte)14), (lta)new drj((byte)5), (zta)new ruj(quj, (byte)1));
                    qt7.a0(quj.h(), zv7.j, (zta)new cqg((byte)13), (lta)new drj((byte)4), (zta)new ruj(quj, (byte)0));
                    quj.a = ien.a(((hc7)w).F0((hc7)new ppc((opc)((hc7)w).M0((gc7)o55.z))));
                    final fc7 m2 = ((hc7)w).M0((gc7)p3.x);
                    m2.getClass();
                    quj.b = eqi.O((ic7)m2);
                    return quj;
                }
                iterator3.next().getClass();
                fvd.c();
                return null;
            }
        }
    }
}
