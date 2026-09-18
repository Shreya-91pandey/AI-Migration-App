import com.anthropic.claude.analytics.events.ChatAskEvents$ChatQuestionAnswerSource;
import com.google.firebase.components.MissingDependencyException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import android.view.Menu;
import java.util.List;
import java.util.Iterator;
import com.google.firebase.components.InvalidRegistrarException;
import java.util.Collection;
import com.google.firebase.components.ComponentRegistrar;
import java.util.concurrent.atomic.AtomicReference;
import java.util.HashSet;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import androidx.work.impl.WorkDatabase;
import android.content.Context;

public final class ve6 implements ie6, gfi
{
    public static final te6 C;
    public Object A;
    public Object B;
    public final Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;
    
    static {
        C = new te6((byte)0);
    }
    
    public ve6(Context applicationContext, final wn6 v, final f5q w, final frh x, final WorkDatabase y, final v5q z, final ArrayList a) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        applicationContext = applicationContext.getApplicationContext();
        applicationContext.getClass();
        this.B = applicationContext;
    }
    
    public ve6(final fn3 v, final j7 w) {
        this.v = v;
        this.w = w;
        this.x = o50.Q((Object)null);
        this.y = o50.Q((Object)null);
        this.z = o50.Q((Object)null);
        this.A = o50.Q((Object)null);
        final def d = def.D;
        final wfk wfk = new wfk((Object)this, (byte)5);
        final tze a = r8m.a;
        this.B = new sd8((jta)wfk, (q8m)d);
    }
    
    public ve6(Executor executor, ArrayList list, ArrayList iterator, final pe6 b) {
        this.v = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        this.y = new HashSet();
        this.A = new AtomicReference();
        final pi9 z = new pi9(executor);
        this.z = z;
        this.B = b;
        executor = (Executor)new ArrayList();
        ((ArrayList)executor).add((Object)ud6.c((Object)z, (Class)pi9.class, new Class[] { t1n.class, lhi.class }));
        ((ArrayList)executor).add((Object)ud6.c((Object)this, (Class)ve6.class, new Class[0]));
        for (final ud6 ud6 : iterator) {
            if (ud6 != null) {
                ((ArrayList)executor).add((Object)ud6);
            }
        }
        iterator = new ArrayList();
        final Iterator iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            iterator.add(iterator3.next());
        }
        list = new ArrayList();
        monitorenter(this);
    Block_17_Outer:
        while (true) {
            hfi hfi = null;
            Label_0314: {
                try {
                    iterator = (ArrayList)iterator.iterator();
                    while (((Iterator)iterator).hasNext()) {
                        final hfi hfi2;
                        hfi = (hfi2 = (hfi)((Iterator)iterator).next());
                        final Object o = hfi2.get();
                        final ComponentRegistrar componentRegistrar = (ComponentRegistrar)o;
                        final ComponentRegistrar componentRegistrar3;
                        final ComponentRegistrar componentRegistrar2 = componentRegistrar3 = componentRegistrar;
                        if (componentRegistrar3 != null) {
                            final Executor executor2 = executor;
                            final ve6 ve6 = this;
                            final Object o2 = ve6.B;
                            final pe6 pe6 = (pe6)o2;
                            final ComponentRegistrar componentRegistrar4 = componentRegistrar2;
                            final List list2 = pe6.a(componentRegistrar4);
                            ((ArrayList)executor2).addAll((Collection)list2);
                            final ArrayList list3 = iterator;
                            ((Iterator)list3).remove();
                        }
                    }
                    break Label_0314;
                }
                finally {
                    final Executor executor3;
                    executor = executor3;
                    monitorexit(this);
                    while (true) {
                        Iterator iterator4 = null;
                        Iterator iterator5 = null;
                        Object o3;
                        Boolean b2;
                        Iterator iterator6;
                        ud6 ud7;
                        int n;
                        int length;
                        Object[] array;
                        ArrayList list4;
                        Label_0579:Block_16_Outer:Label_0355_Outer:
                        while (true) {
                            iftrue(Label_0431:)(!iterator4.hasNext());
                        Label_0355:
                            while (true) {
                                Block_11: {
                                    break Block_11;
                                    ((Runnable)iterator5.next()).run();
                                    break Label_0579;
                                    while (true) {
                                        while (true) {
                                            Label_0485: {
                                                Label_0425: {
                                                    while (true) {
                                                        iftrue(Label_0409:)(!((HashSet)this.y).contains((Object)o3.toString()));
                                                        Block_14: {
                                                            break Block_14;
                                                            Label_0605: {
                                                                b2 = (Boolean)((AtomicReference)this.A).get();
                                                            }
                                                            iftrue(Label_0638:)(b2 == null);
                                                            this.c((HashMap)this.v, b2);
                                                            return;
                                                            Label_0409:
                                                            ((HashSet)this.y).add((Object)o3.toString());
                                                            break Label_0425;
                                                        }
                                                        iterator4.remove();
                                                        continue Block_17_Outer;
                                                        Label_0548: {
                                                            list.addAll((Collection)this.j((ArrayList)executor));
                                                        }
                                                        list.addAll((Collection)this.k());
                                                        this.h();
                                                        monitorexit(this);
                                                        iterator5 = list.iterator();
                                                        break Label_0579;
                                                        ud7 = (ud6)iterator6.next();
                                                        ((HashMap)this.v).put((Object)ud7, (Object)new e2d((hfi)new ue6((Object)this, (Object)ud7, (byte)0)));
                                                        break Label_0485;
                                                        Label_0638:
                                                        return;
                                                        iftrue(Label_0319:)(n >= length);
                                                        o3 = array[n];
                                                        iftrue(Label_0425:)(!o3.toString().contains((CharSequence)"kotlinx.coroutines.CoroutineDispatcher"));
                                                        continue Block_16_Outer;
                                                    }
                                                    Label_0451: {
                                                        list4 = new ArrayList((Collection)((HashMap)this.v).keySet());
                                                    }
                                                    list4.addAll((Collection)executor);
                                                    ncq.u(list4);
                                                    iterator6 = ((ArrayList)executor).iterator();
                                                    break Label_0485;
                                                }
                                                ++n;
                                                continue Label_0355;
                                            }
                                            iftrue(Label_0548:)(!iterator6.hasNext());
                                            continue Label_0355_Outer;
                                        }
                                        Label_0431: {
                                            iftrue(Label_0451:)(!((HashMap)this.v).isEmpty());
                                        }
                                        ncq.u((ArrayList)executor);
                                        continue;
                                    }
                                }
                                array = ((ud6)iterator4.next()).b.toArray();
                                length = array.length;
                                n = 0;
                                continue Label_0355;
                            }
                            iterator4 = ((ArrayList)executor).iterator();
                            continue Block_17_Outer;
                        }
                        iftrue(Label_0605:)(!iterator5.hasNext());
                        continue;
                    }
                }
            }
            try {
                final hfi hfi2 = hfi;
                final Object o = hfi2.get();
                final ComponentRegistrar componentRegistrar = (ComponentRegistrar)o;
                final ComponentRegistrar componentRegistrar3;
                final ComponentRegistrar componentRegistrar2 = componentRegistrar3 = componentRegistrar;
                if (componentRegistrar3 != null) {
                    final Executor executor2 = executor;
                    final ve6 ve6 = this;
                    final Object o2 = ve6.B;
                    final pe6 pe6 = (pe6)o2;
                    final ComponentRegistrar componentRegistrar4 = componentRegistrar2;
                    final List list2 = pe6.a(componentRegistrar4);
                    ((ArrayList)executor2).addAll((Collection)list2);
                    final ArrayList list3 = iterator;
                    ((Iterator)list3).remove();
                    continue;
                }
                continue;
            }
            catch (final InvalidRegistrarException ex) {}
            break;
        }
    }
    
    public ve6(final p1 v) {
        this.v = v;
        this.w = k2j.e;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
    }
    
    public ve6(final vy4 vy4) {
        final vna a = vy4.a;
        final una a2 = a.a(4.0f);
        final long k = tsf.K(4);
        final zoa a3 = zoa.A;
        this.v = new mnn(0L, k, vy4.a(a3), null, a2, 0L, 0L, 0, 0, 0L, null, 16777177);
        final vna b = vy4.b;
        this.w = new mnn(0L, tsf.K(4), vy4.a(a3), null, b.a(4.0f), 0L, 0L, 0, 0, 0L, null, 16777177);
        final una a4 = a.a(14.0f);
        final long i = tsf.K(14);
        final zoa b2 = zoa.B;
        this.x = new mnn(0L, i, vy4.a(b2), null, a4, 0L, 0L, 0, 0, 0L, null, 16777177);
        this.y = new mnn(0L, tsf.K(17), vy4.a(b2), null, b.a(17.0f), 0L, 0L, 0, 0, 0L, null, 16777177);
        this.z = new mnn(0L, tsf.K(28), vy4.a(b2), null, a.a(28.0f), 0L, 0L, 0, 0, tsf.D(1.1), vy4.j, 15597529);
        this.A = new mnn(0L, tsf.K(10), vy4.a(zoa.D), null, a.a(10.0f), 0L, 0L, 0, 0, 0L, null, 16777177);
        this.B = new mnn(0L, tsf.K(20), vy4.a(b2), null, a.a(20.0f), 0L, 0L, 0, 0, tsf.D(1.35), vy4.j, 15597529);
    }
    
    public static void a(final int n, final Menu menu) {
        menu.add(0, wbe.b(n), wbe.c(n), wbe.d(n)).setShowAsAction(1);
    }
    
    public static void b(final Menu menu, final int n, final jta jta) {
        if (jta != null && menu.findItem(wbe.b(n)) == null) {
            a(n, menu);
            return;
        }
        if (jta == null && menu.findItem(wbe.b(n)) != null) {
            menu.removeItem(wbe.b(n));
        }
    }
    
    public static l1l e(final p39 p) {
        return new l1l(p.a, p.b);
    }
    
    public void c(final HashMap hashMap, final boolean b) {
        for (final Map$Entry map$Entry : hashMap.entrySet()) {
            final ud6 ud6 = (ud6)map$Entry.getKey();
            final hfi hfi = (hfi)map$Entry.getValue();
            final boolean d = ud6.d;
            if (!d) {
                if ((d ? 1 : 0) != 2 || !b) {
                    continue;
                }
            }
            hfi.get();
        }
        final pi9 pi9 = (pi9)this.z;
        final pi9 pi10;
        monitorenter(pi10 = pi9);
    Block_8_Outer:
        while (true) {
            Label_0127: {
                try {
                    final Object b2 = pi9.b;
                    if (b2 != null) {
                        pi9.b = null;
                        break Label_0129;
                    }
                    break Label_0127;
                }
                finally {
                    monitorexit(pi10);
                    Label_0168: {
                        return;
                    }
                    Iterator iterator2;
                    while (true) {
                        final Object b2;
                        iterator2 = ((Collection)b2).iterator();
                        iftrue(Label_0155:)(iterator2.hasNext());
                        return;
                        monitorexit(pi10);
                        iftrue(Label_0168:)(b2 == null);
                        continue;
                    }
                    Label_0155:
                    iterator2.next().getClass();
                    fvd.c();
                    return;
                    final Object b2 = null;
                    continue Block_8_Outer;
                }
            }
            break;
        }
    }
    
    public void f(final boolean b) {
        final AtomicReference atomicReference = (AtomicReference)this.A;
        do {
            if (atomicReference.compareAndSet((Object)null, (Object)b)) {
                synchronized (this) {
                    final HashMap hashMap = new HashMap((Map)this.v);
                    monitorexit(this);
                    this.c(hashMap, b);
                }
            }
        } while (atomicReference.get() == null);
    }
    
    public Object get() {
        return new nq((Object)((gfi)this.v).get(), (Object)((gfi)this.w).get(), (Object)((gfi)this.x).get(), (Object)((tze)this.y).get(), (Object)((gfi)this.z).get(), (Object)((gfi)this.A).get(), (Object)new eup((byte)27), (Object)new p3((byte)27), (Object)((gfi)this.B).get());
    }
    
    public void h() {
        for (final ud6 ud6 : ((HashMap)this.v).keySet()) {
            for (final dd8 dd8 : ud6.c) {
                if (dd8.b == 2 && !((HashMap)this.x).containsKey((Object)dd8.a)) {
                    final HashMap hashMap = (HashMap)this.x;
                    final bmi a = dd8.a;
                    final Set set = Collections.EMPTY_SET;
                    final Object o = new Object();
                    ((d6d)o).b = null;
                    (((d6d)o).a = Collections.newSetFromMap((Map)new ConcurrentHashMap())).addAll((Collection)set);
                    hashMap.put((Object)a, o);
                }
                else {
                    if (((HashMap)this.w).containsKey((Object)dd8.a)) {
                        continue;
                    }
                    final byte b = dd8.b;
                    if (b == 1) {
                        final bmi a2 = dd8.a;
                        final StringBuilder sb = new StringBuilder("Unsatisfied dependency for component ");
                        sb.append((Object)ud6);
                        sb.append(": ");
                        sb.append((Object)a2);
                        throw new MissingDependencyException(sb.toString());
                    }
                    if (b == 2) {
                        continue;
                    }
                    final HashMap hashMap2 = (HashMap)this.w;
                    final bmi a3 = dd8.a;
                    final fvd c = nfg.c;
                    final te6 d = nfg.d;
                    final Object o2 = new Object();
                    ((nfg)o2).a = c;
                    ((nfg)o2).b = (hfi)d;
                    hashMap2.put((Object)a3, o2);
                }
            }
        }
    }
    
    public ArrayList j(final ArrayList list) {
        final HashMap hashMap = (HashMap)this.w;
        final ArrayList list2 = new ArrayList();
        for (final ud6 ud6 : list) {
            if (ud6.e) {
                continue;
            }
            final hfi hfi = (hfi)((HashMap)this.v).get((Object)ud6);
            for (final bmi bmi : ud6.b) {
                if (!hashMap.containsKey((Object)bmi)) {
                    hashMap.put((Object)bmi, (Object)hfi);
                }
                else {
                    list2.add((Object)new ab1((Object)hashMap.get((Object)bmi), (Object)hfi, (byte)2));
                }
            }
        }
        return list2;
    }
    
    public ArrayList k() {
        final HashMap hashMap = (HashMap)this.x;
        final ArrayList list = new ArrayList();
        final HashMap hashMap2 = new HashMap();
        for (final Map$Entry map$Entry : ((HashMap)this.v).entrySet()) {
            final ud6 ud6 = (ud6)map$Entry.getKey();
            if (!ud6.e) {
                continue;
            }
            final hfi hfi = (hfi)map$Entry.getValue();
            for (final bmi bmi : ud6.b) {
                if (!hashMap2.containsKey((Object)bmi)) {
                    hashMap2.put((Object)bmi, (Object)new HashSet());
                }
                ((Set)hashMap2.get((Object)bmi)).add((Object)hfi);
            }
        }
        for (final Map$Entry map$Entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(map$Entry2.getKey())) {
                final bmi bmi2 = (bmi)map$Entry2.getKey();
                final Set set = (Set)map$Entry2.getValue();
                final Object o = new Object();
                ((d6d)o).b = null;
                (((d6d)o).a = Collections.newSetFromMap((Map)new ConcurrentHashMap())).addAll((Collection)set);
                hashMap.put((Object)bmi2, o);
            }
            else {
                final d6d d6d = (d6d)hashMap.get(map$Entry2.getKey());
                final Iterator iterator4 = ((Set)map$Entry2.getValue()).iterator();
                while (iterator4.hasNext()) {
                    list.add((Object)new ab1((Object)d6d, (Object)iterator4.next(), (byte)3));
                }
            }
        }
        return list;
    }
    
    public void l(final p39 p3, final g59 g59, final ChatAskEvents$ChatQuestionAnswerSource chatAskEvents$ChatQuestionAnswerSource) {
        final t1l t1l = (t1l)((sd8)this.B).getValue();
        r1l r1l;
        if (t1l instanceof r1l) {
            r1l = (r1l)t1l;
        }
        else {
            r1l = null;
        }
        p1l b;
        if (r1l != null) {
            b = r1l.b();
        }
        else {
            b = null;
        }
        if (mlc.q((Object)b, (Object)o1l.a)) {
            return;
        }
        ((ksg)this.x).setValue((Object)e(p3));
        ((ksg)this.A).setValue((Object)null);
        ((j7)this.w).h((Object)p3, (Object)g59, (Object)chatAskEvents$ChatQuestionAnswerSource);
    }
    
    public hfi r(final bmi bmi) {
        synchronized (this) {
            final d6d d6d = (d6d)((HashMap)this.x).get((Object)bmi);
            if (d6d != null) {
                return (hfi)d6d;
            }
            return (hfi)ve6.C;
        }
    }
    
    public hfi v(final bmi bmi) {
        synchronized (this) {
            vt4.u((Object)bmi, "Null interface requested.");
            return (hfi)((HashMap)this.w).get((Object)bmi);
        }
    }
}
