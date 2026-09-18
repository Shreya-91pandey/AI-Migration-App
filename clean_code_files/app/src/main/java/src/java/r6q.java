import java.util.concurrent.ExecutorService;
import java.util.Iterator;
import android.util.Log;
import java.util.concurrent.Executor;
import androidx.work.WorkerParameters;
import java.util.HashSet;
import java.util.UUID;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.List;
import androidx.work.OverwritingInputMerger;
import java.util.concurrent.CancellationException;
import java.util.ArrayList;
import androidx.work.impl.WorkDatabase;
import android.content.Context;

public final class r6q
{
    public final v5q a;
    public final Context b;
    public final String c;
    public final f5q d;
    public final wn6 e;
    public final frh f;
    public final WorkDatabase g;
    public final z5q h;
    public final gd8 i;
    public final ArrayList j;
    public final String k;
    public final ppc l;
    
    public r6q(final ve6 ve6) {
        final v5q a = (v5q)ve6.z;
        this.a = a;
        this.b = (Context)ve6.B;
        final String a2 = a.a;
        this.c = a2;
        this.d = (f5q)ve6.w;
        final wn6 e = (wn6)ve6.v;
        this.e = e;
        final y7j d = e.d;
        this.f = (frh)ve6.x;
        final WorkDatabase g = (WorkDatabase)ve6.y;
        this.g = g;
        this.h = g.v();
        this.i = g.f();
        final ArrayList j = (ArrayList)ve6.A;
        this.j = j;
        this.k = oz1.p(ge9.u("Work [ id=", a2, ", tags={ "), c86.N0((Iterable)j, (CharSequence)",", (String)null, (String)null, (lta)null, 62), " } ]");
        this.l = x90.d();
    }
    
    public final void a(final int n) {
        final z5q h = this.h;
        final x4q v = x4q.v;
        final String c = this.c;
        h.g(v, c);
        final long currentTimeMillis = System.currentTimeMillis();
        final WorkDatabase a = h.a;
        xp7.L(a, false, true, (lta)new thm(currentTimeMillis, c));
        xp7.L(a, false, true, (lta)new yyh(c, this.a.v, (byte)1));
        h.f(-1L, c);
        h.h(n, c);
    }
    
    public final void b() {
        final long currentTimeMillis = System.currentTimeMillis();
        final z5q h = this.h;
        final WorkDatabase a = h.a;
        final String c = this.c;
        xp7.L(a, false, true, (lta)new thm(currentTimeMillis, c));
        h.g(x4q.v, c);
        final WorkDatabase a2 = h.a;
        ((Number)xp7.L(a2, false, true, (lta)new uhm(c, (byte)22))).intValue();
        xp7.L(a2, false, true, (lta)new yyh(c, this.a.v, (byte)1));
        xp7.L(a2, false, true, (lta)new uhm(c, (byte)23));
        h.f(-1L, c);
    }
    
    public final Object c(h07 k) {
        final v5q a = this.a;
        Object o = a.c;
        final String d = a.d;
        while (true) {
            Label_0058: {
                if (!(k instanceof q6q)) {
                    break Label_0058;
                }
                final Object o2 = k;
                final int x = ((q6q)o2).x;
                if ((x & Integer.MIN_VALUE) == 0x0) {
                    break Label_0058;
                }
                ((q6q)o2).x = x + Integer.MIN_VALUE;
                final Object v = ((q6q)o2).v;
                final int x2 = ((q6q)o2).x;
                k = (h07)this.k;
                final wn6 e = this.e;
                Label_0870: {
                    if (x2 != 0) {
                        if (x2 == 1) {
                            try {
                                vt4.g0(v);
                                break Label_0870;
                            }
                            catch (final CancellationException ex) {
                                break Label_0870;
                            }
                            finally {
                                break Label_0870;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(v);
                    final eup g = e.g;
                    final boolean p = omo.P();
                    final String x3 = a.x;
                    if (p && x3 != null) {
                        omo.w(a.hashCode(), x3);
                    }
                    final lce lce = new lce((Object)new k6q(this, (byte)0), (byte)20);
                    final WorkDatabase g2 = this.g;
                    if (g2.p((jta)lce)) {
                        return new n6q();
                    }
                    final boolean c = a.c();
                    final String c2 = this.c;
                    nt7 b;
                    if (c) {
                        b = a.e;
                    }
                    else {
                        final String a2 = ucc.a;
                        OverwritingInputMerger overwritingInputMerger;
                        try {
                            final Object instance = Class.forName(d).getDeclaredConstructor((Class<?>[])null).newInstance((Object[])null);
                            instance.getClass();
                            overwritingInputMerger = (OverwritingInputMerger)instance;
                        }
                        catch (final Exception ex2) {
                            krd.c().b(ucc.a, "Trouble instantiating ".concat(d), (Throwable)ex2);
                            overwritingInputMerger = null;
                        }
                        if (overwritingInputMerger == null) {
                            final String a3 = s6q.a;
                            final krd c3 = krd.c();
                            final StringBuilder sb = new StringBuilder("Could not create Input Merger ");
                            sb.append(d);
                            c3.a(a3, sb.toString());
                            return new l6q();
                        }
                        final ArrayList z0 = c86.Z0((Collection)lq6.X((Object)a.e), (Iterable)xp7.L(this.h.a, true, false, (lta)new jy4(c2, (byte)24)));
                        final ap2 ap2 = new ap2((byte)1);
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        final Iterator iterator = z0.iterator();
                        while (iterator.hasNext()) {
                            final Map unmodifiableMap = Collections.unmodifiableMap((Map)((nt7)iterator.next()).a);
                            unmodifiableMap.getClass();
                            ((Map)linkedHashMap).putAll(unmodifiableMap);
                        }
                        ap2.c((HashMap)linkedHashMap);
                        b = ap2.a();
                    }
                    final UUID fromString = UUID.fromString(c2);
                    final int i = a.k;
                    final ExecutorService a4 = e.a;
                    final o68 b2 = e.b;
                    new(o5q.class)();
                    final frh f = this.f;
                    final f5q d2 = this.d;
                    final u4q u4q = new u4q(g2, f, d2);
                    final Object o3 = new Object();
                    ((WorkerParameters)o3).a = fromString;
                    ((WorkerParameters)o3).b = b;
                    ((WorkerParameters)o3).c = new HashSet((Collection)this.j);
                    ((WorkerParameters)o3).d = i;
                    ((WorkerParameters)o3).e = a4;
                    ((WorkerParameters)o3).f = (hc7)b2;
                    try {
                        final nld b3 = e.e.b(this.b, (String)o, (WorkerParameters)o3);
                        b3.d = true;
                        o = ((f07)o2).getContext().M0((gc7)o55.z);
                        o.getClass();
                        o = o;
                        ((opc)o).U0((lta)new fv4(b3, p, x3, this));
                        final Object p2 = g2.p((jta)new lce((Object)new k6q(this, (byte)1), (byte)20));
                        p2.getClass();
                        if (!(boolean)p2) {
                            return new n6q();
                        }
                        if (((opc)o).isCancelled()) {
                            return new n6q();
                        }
                        o = d2.d;
                        o.getClass();
                        final ic7 w = eqi.W((Executor)o);
                        Object o4;
                        try {
                            o = new av7((Object)this, (Object)b3, (Object)u4q, (f07)null, (byte)9);
                            ((q6q)o2).x = 1;
                            final Object f2 = rhc.f0((hc7)w, (zta)o, (f07)o2);
                            o = pc7.v;
                            o4 = f2;
                            if (f2 == o) {
                                return o;
                            }
                            final mld mld = (mld)o4;
                            mld.getClass();
                            return new m6q(mld);
                        }
                        catch (final CancellationException ex3) {
                            break Label_0870;
                        }
                        krd.c().b(s6q.a, ((String)k).concat(" failed because it threw an exception/error"), (Throwable)o4);
                        e.getClass();
                        return new l6q();
                        final String a5 = s6q.a;
                        final krd c4 = krd.c();
                        final String concat = ((String)k).concat(" was cancelled");
                        if (c4.a <= 4) {
                            Log.i(a5, concat, (Throwable)o4);
                        }
                    }
                    finally {
                        final String a6 = s6q.a;
                        final krd c5 = krd.c();
                        final StringBuilder sb2 = new StringBuilder("Could not create Worker ");
                        sb2.append((String)o);
                        c5.a(a6, sb2.toString());
                        return new l6q();
                    }
                }
            }
            final Object o2 = new q6q(this, k);
            continue;
        }
    }
    
    public final void d(final mld mld) {
        final String c = this.c;
        final ArrayList a0 = lq6.a0((Object[])new String[] { c });
        z5q h;
        while (true) {
            final boolean empty = a0.isEmpty();
            h = this.h;
            if (empty) {
                break;
            }
            final String s = (String)h86.x0((List)a0);
            if (h.c(s) != x4q.A) {
                h.g(x4q.y, s);
            }
            a0.addAll((Collection)this.i.a(s));
        }
        final nt7 b = ((jld)mld).b();
        b.getClass();
        xp7.L(h.a, false, true, (lta)new yyh(c, this.a.v, (byte)1));
        xp7.L(h.a, false, true, (lta)new tyl((Object)b, (Object)c, (byte)22));
    }
}
