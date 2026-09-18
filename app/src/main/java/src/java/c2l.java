import java.util.concurrent.ThreadPoolExecutor;
import java.util.AbstractMap;
import java.util.Map;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.Function;
import android.os.Handler;
import android.os.Bundle;
import java.util.Iterator;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.HashSet;
import java.util.Set;
import com.arkivanov.essenty.statekeeper.b;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import android.util.Log;
import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentHashMap;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayDeque;

public final class c2l implements ru7, rxo, k9m, r6p, gfi
{
    public static c2l A;
    public final byte v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;
    
    public c2l(final byte v) {
        switch (this.v = v) {
            default: {
                this.w = null;
                this.x = null;
                this.y = null;
                this.z = new ArrayDeque();
                return;
            }
            case 11: {
                final AtomicInteger w = new AtomicInteger(0);
                final AtomicInteger x = new AtomicInteger(0);
                final AtomicInteger y = new AtomicInteger(0);
                final AtomicInteger z = new AtomicInteger(0);
                this.w = w;
                this.x = x;
                this.y = y;
                this.z = z;
                return;
            }
            case 7: {
                this.w = new ArrayList();
                this.x = new HashMap();
                this.y = new HashMap();
            }
        }
    }
    
    public c2l(final int n, final bz6 bz6, final vv7 vv7, final rjc y, final ctf ctf, final btm btm, final h8n h8n, final String w, final ScheduledThreadPoolExecutor x, final jmq jmq) {
        this.v = 4;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = new uv7(n, bz6, vv7, y, ctf, btm, h8n, w, x, jmq);
    }
    
    public c2l(final long n, final long n2, final long n3) {
        this.v = 18;
        this.w = o50.Q(new yzl(n));
        this.x = o50.Q(new l6g(n2));
        this.y = o50.Q(new l6g(n3));
        this.z = o50.Q(new l6g(n2));
    }
    
    public c2l(final a0 w, final a0 x, final m54 y) {
        this.v = 17;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = new HashMap();
    }
    
    public c2l(final fz6 w, final i1 i1, final rg6 rg6, final p10 x) {
        this.v = 15;
        this.w = w;
        this.x = x;
        this.y = ao2.c(Integer.MAX_VALUE, 0, 6);
        this.z = new v2b((byte)4);
        final opc opc = (opc)w.v.M0((gc7)o55.z);
        if (opc != null) {
            opc.U0((lta)new rx1((Object)i1, (Object)this, (Object)rg6, (byte)27));
        }
    }
    
    public c2l(final fz6 w, final oll x) {
        this.v = 1;
        this.w = w;
        this.x = x;
        this.y = new x8m();
        this.z = new LinkedHashSet();
    }
    
    public c2l(final j9j w, final vhk x) {
        this.v = 19;
        this.w = w;
        this.x = x;
        this.y = new Object();
        this.z = new LinkedHashMap();
    }
    
    public c2l(final Socket w) {
        this.v = 6;
        this.w = w;
        this.x = new AtomicInteger();
        this.y = new u68(this);
        this.z = new t68(this);
    }
    
    public c2l(final jg0 w) {
        this.v = 20;
        this.w = w;
    }
    
    public c2l(final mia mia) {
        this.v = 20;
        this(new hdk(mia));
    }
    
    public c2l(final r8 x, final String w, final jqc y, final wo8 wo8) {
        this.v = 13;
        this.x = x;
        this.w = w;
        this.y = y;
        this.z = new ConcurrentHashMap();
    }
    
    public c2l(final re w) {
        this.v = 10;
        this.w = w;
        this.x = new grf();
        new LinkedHashSet();
        this.y = new LinkedHashSet();
        this.z = new LinkedHashSet();
    }
    
    public c2l(final rjc w, final dyc x) {
        this.v = 8;
        new(bd.class)();
        this.w = w;
        this.x = x;
        this.y = new LinkedHashMap();
        this.z = new LinkedHashMap();
    }
    
    public c2l(final xcp w, final vcp x, final im7 y) {
        this.v = 21;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = new awp((byte)25);
    }
    
    public c2l(final y4g w) {
        this.v = 2;
        this.w = w;
        this.x = new AtomicInteger(0);
        this.y = new AtomicBoolean(false);
        this.z = new AtomicBoolean(false);
    }
    
    public static c2l B() {
        final Class<c2l> clazz;
        monitorenter(clazz = c2l.class);
        Label_0035: {
            try {
                c2l a;
                if ((a = c2l.A) == null) {
                    a = (c2l.A = new c2l((byte)0));
                }
                break Label_0035;
            }
            finally {
                monitorexit(clazz);
                monitorexit(clazz);
                return;
            }
        }
    }
    
    public static IllegalStateException K(final Exception ex, final String s) {
        return new IllegalStateException(lmf.s("Failed to ", s, ": ", v4j.a((Class)ex.getClass()).c()));
    }
    
    public static void f(final c2l c, final drf drf) {
        c.getClass();
        if (((Set)c.y).add((Object)drf)) {
            final grf grf = (grf)c.x;
            if (drf.c == null) {
                grf.e.addFirst((Object)drf);
                drf.c = c;
                grf.b();
                return;
            }
            uy8.m((Object)drf, (Object)"' is already registered with a dispatcher", "Handler '");
        }
    }
    
    public List A() {
        if (((ArrayList)this.w).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        final ArrayList list = (ArrayList)this.w;
        synchronized (list) {
            return (List)new ArrayList((Collection)this.w);
        }
    }
    
    public ncp C(String p) {
        final Long o = this.O(p);
        final dyc dyc = (dyc)this.x;
        int n;
        if (dyc != null) {
            if (!(dyc instanceof nvn)) {
                n = 4;
            }
            else {
                n = 2;
            }
        }
        else {
            n = 1;
        }
        Object o2;
        if (o == null) {
            if (dyc == null) {
                o2 = kxf.v;
            }
            else {
                final Long m = this.M(p);
                final kxf z = kxf.z;
                if (m != null) {
                    final long longValue = m;
                    p = this.P(p);
                    if (p == null) {
                        o2 = kxf.y;
                        return new ncp(o, n, (mxf)o2);
                    }
                    if (((LinkedHashMap)this.y).get((Object)p) == null) {
                        o2 = kxf.w;
                        return new ncp(o, n, (mxf)o2);
                    }
                    if (this.N(longValue, p) == null) {
                        o2 = kxf.x;
                        return new ncp(o, n, (mxf)o2);
                    }
                }
                o2 = z;
            }
        }
        else {
            o2 = null;
        }
        return new ncp(o, n, (mxf)o2);
    }
    
    public tcp D(us4 us4, final String s) {
        final awp awp;
        monitorenter(awp = (awp)this.z);
        Label_0213: {
            Object o = null;
            Label_0208: {
                Label_0088: {
                    tcp tcp;
                    try {
                        tcp = (tcp)((xcp)this.w).a.get((Object)s);
                        if (!us4.d((Object)tcp)) {
                            break Label_0088;
                        }
                        final vcp vcp = (vcp)this.x;
                        if (vcp instanceof k9k) {
                            final k9k k9k = (k9k)vcp;
                            tcp.getClass();
                            k9k.e(tcp);
                        }
                    }
                    finally {
                        break Label_0213;
                    }
                    tcp.getClass();
                    o = tcp;
                    break Label_0208;
                }
                final elf elf = new elf((im7)this.y);
                elf.a((hm7)zn2.l, (Object)s);
                final vcp vcp2 = (vcp)this.x;
                try {
                    us4 = (us4)vcp2.c(us4, elf);
                }
                catch (final AbstractMethodError abstractMethodError) {
                    try {
                        us4 = (us4)vcp2.b(qt7.z((rtc)us4), elf);
                    }
                    catch (final AbstractMethodError abstractMethodError2) {
                        us4 = (us4)vcp2.a(qt7.z((rtc)us4));
                    }
                }
                final tcp tcp2 = (tcp)((Map)((xcp)this.w).a).put((Object)s, (Object)us4);
                o = us4;
                if (tcp2 != null) {
                    tcp2.b();
                    o = us4;
                }
            }
            monitorexit(awp);
            return (tcp)o;
        }
        monitorexit(awp);
    }
    
    public boolean E(final Context context) {
        if (this.y == null) {
            this.y = (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!(boolean)this.x) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return (boolean)this.y;
    }
    
    public boolean F(final Context context) {
        Boolean value;
        if ((value = (Boolean)this.x) == null) {
            value = (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.x = value;
        }
        if (!value) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return (boolean)this.x;
    }
    
    public mp4 G(final Object o, final String s, final SerializableContainer serializableContainer, final ci6 ci6) {
        final Object o2 = new Object();
        ((kbd)o2).v = (Set)z89.v;
        ((kbd)o2).w = sad.w;
        final jy7 jy7 = new jy7((uad)this.x, (kbd)o2);
        final b b = new b(serializableContainer);
        ci6 ci7 = ci6;
        if (ci6 == null) {
            ci7 = new ci6();
        }
        final m38 m38 = new m38((ho1)this.y, true, 0);
        final zta zta = (zta)this.z;
        this.w.getClass();
        return new mp4(o, s, zta.d(o, new o38((uad)jy7, b, ci7, (ho1)m38)), (kbd)o2, b, ci7, m38);
    }
    
    public void H(final asa asa) {
        final hra j = asa.j();
        final String z = j.z;
        final HashMap hashMap = (HashMap)this.x;
        if (hashMap.get((Object)z) != null) {
            return;
        }
        hashMap.put((Object)j.z, (Object)asa);
        if (vra.I(2)) {
            j.toString();
        }
    }
    
    public void I(final asa asa) {
        final HashMap hashMap = (HashMap)this.x;
        final hra j = asa.j();
        if (j.X) {
            ((xra)this.z).f(j);
        }
        if (hashMap.get((Object)j.z) == asa) {
            if (hashMap.put((Object)j.z, (Object)null) != null) {
                if (vra.I(2)) {
                    j.toString();
                }
            }
        }
    }
    
    public void J() {
        final LinkedHashMap linkedHashMap = (LinkedHashMap)this.z;
        final LinkedHashMap linkedHashMap2 = (LinkedHashMap)this.y;
        while (linkedHashMap2.entrySet().size() > 4) {
            final Set entrySet = linkedHashMap2.entrySet();
            final Set entrySet2 = linkedHashMap2.entrySet();
            entrySet2.getClass();
            entrySet.remove(c86.F0((Iterable)entrySet2));
        }
        while (linkedHashMap.entrySet().size() > 4) {
            final Set keySet = linkedHashMap.keySet();
            keySet.getClass();
            ((AbstractMap)linkedHashMap).remove(c86.F0((Iterable)keySet));
        }
    }
    
    public void L(final i6j i6j, Object[] value, final String s) {
        final List m1 = iw0.m1(value);
        final HashMap hashMap;
        monitorenter(hashMap = (HashMap)this.z);
        Label_0164: {
            try {
                final HashMap hashMap2 = (HashMap)this.z;
                if ((value = (Object[])hashMap2.get((Object)i6j)) == null) {
                    value = (Object[])(Object)new HashSet();
                    hashMap2.put((Object)i6j, (Object)value);
                }
            }
            finally {
                break Label_0164;
            }
            final Set set = (Set)value;
            if (set.contains((Object)m1)) {
                monitorexit(hashMap);
                return;
            }
            if (set.size() >= 64) {
                monitorexit(hashMap);
                return;
            }
            set.add((Object)m1);
            monitorexit(hashMap);
            final Enum enum1;
            SilentException.a(new SilentException(s), lpl.w, lq6.Y("strict_claim_refusal", enum1.name(), s), 2);
            return;
        }
        monitorexit(hashMap);
    }
    
    public Long M(final String s) {
        final Long n = (Long)((LinkedHashMap)this.z).get((Object)s);
        if (n == null) {
            c5q.E((rjc)this.w, 4, qjc.w, (jta)new zo1(s, (byte)14), null, false, 56);
        }
        return n;
    }
    
    public ljc N(final long n, final String s) {
        final dyc dyc = (dyc)this.x;
        if (dyc != null) {
            final ljc ljc = (ljc)((LinkedHashMap)this.y).get((Object)s);
            if (ljc != null && dyc.i(new lnh(ljc.b, ljc.c, Long.valueOf(n)))) {
                return ljc;
            }
        }
        return null;
    }
    
    public Long O(final String s) {
        this.J();
        final Long m = this.M(s);
        if (m != null) {
            final long longValue = m;
            final String p = this.P(s);
            ljc n;
            if (p != null) {
                n = this.N(longValue, p);
            }
            else {
                n = null;
            }
            if (n != null) {
                final long n2 = longValue - n.c;
                if (n2 > 0L) {
                    return n2;
                }
                c5q.E((rjc)this.w, 4, qjc.w, (jta)new zo1(s, (byte)15), null, false, 56);
            }
        }
        return null;
    }
    
    public String P(final String s) {
        final LinkedHashMap linkedHashMap = (LinkedHashMap)this.z;
        final Set keySet = linkedHashMap.keySet();
        keySet.getClass();
        final int k0 = c86.K0((Iterable)keySet, (Object)s);
        final Set keySet2 = linkedHashMap.keySet();
        keySet2.getClass();
        final Iterable iterable = (Iterable)keySet2;
        final int n = k0 - 1;
        Object o;
        if (iterable instanceof List) {
            o = c86.J0(n, (List)iterable);
        }
        else {
            if (n >= 0) {
                final Iterator iterator = iterable.iterator();
                int n2 = 0;
                while (iterator.hasNext()) {
                    o = iterator.next();
                    if (n == n2) {
                        return (String)o;
                    }
                    ++n2;
                }
            }
            o = null;
        }
        return (String)o;
    }
    
    public Bundle Q(final Bundle bundle, final String s) {
        final HashMap hashMap = (HashMap)this.y;
        if (bundle != null) {
            return (Bundle)hashMap.put((Object)s, (Object)bundle);
        }
        return (Bundle)hashMap.remove((Object)s);
    }
    
    public void R(final com com) {
        final ab1 ab1 = new ab1((Object)this, (Object)com, (byte)16);
        final Object y = this.y;
        synchronized (y) {
            final Runnable runnable = (Runnable)((Map)this.z).put((Object)com, (Object)ab1);
            monitorexit(y);
            ((Handler)((j9j)this.w).w).postDelayed((Runnable)ab1, 5400000L);
        }
    }
    
    public void S() {
        synchronized (this) {
            ((AtomicInteger)this.x).decrementAndGet();
            if (((AtomicInteger)this.x).get() >= 0) {
                return;
            }
            throw new IllegalStateException("Unbalanced call to unblock() detected.");
        }
    }
    
    public Object T(String s, boolean z, final jta w, lta x, final h07 h07) {
        while (true) {
            Label_0049: {
                if (!(h07 instanceof dek)) {
                    break Label_0049;
                }
                final dek dek = (dek)h07;
                final int c = dek.C;
                if ((c & Integer.MIN_VALUE) == 0x0) {
                    break Label_0049;
                }
                dek.C = c + Integer.MIN_VALUE;
                final dek dek2 = dek;
                final Object a = dek2.A;
                final int c2 = dek2.C;
                final pc7 v = pc7.v;
                Object f0 = null;
                Label_0385: {
                    String v2;
                    jta jta;
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 == 2) {
                                s = (String)dek2.y;
                                try {
                                    vt4.g0(a);
                                    break Label_0385;
                                }
                                finally {
                                    break Label_0385;
                                }
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = dek2.z;
                        s = (String)dek2.y;
                        x = dek2.x;
                        final jta w2 = dek2.w;
                        v2 = dek2.v;
                        vt4.g0(a);
                        jta = w2;
                    }
                    else {
                        vt4.g0(a);
                        if (!mlc.O(s)) {
                            return w.a();
                        }
                        final Object computeIfAbsent = ((ConcurrentHashMap)this.z).computeIfAbsent((Object)s, (Function)new w67((lta)new smj((byte)25), (byte)3));
                        computeIfAbsent.getClass();
                        final aof y = (aof)computeIfAbsent;
                        dek2.v = s;
                        dek2.w = w;
                        dek2.x = x;
                        dek2.y = y;
                        dek2.z = z;
                        dek2.C = 1;
                        if (y.c((f07)dek2) == v) {
                            return v;
                        }
                        final String s2 = s;
                        s = (String)y;
                        jta = w;
                        v2 = s2;
                    }
                    try {
                        final o68 a2 = vo8.a;
                        final d58 w3 = d58.w;
                        final kee kee = new kee(this, z, v2, jta, x, (f07)null);
                        dek2.v = null;
                        dek2.w = null;
                        dek2.x = null;
                        dek2.y = (aof)s;
                        dek2.z = z;
                        dek2.C = 2;
                        f0 = rhc.f0((hc7)w3, (zta)kee, (f07)dek2);
                        if (f0 == v) {
                            return v;
                        }
                        ((aof)s).g((Object)null);
                        return f0;
                    }
                    finally {}
                }
                ((aof)s).g((Object)null);
                throw f0;
            }
            final dek dek2 = new dek(this, h07);
            continue;
        }
    }
    
    public void b(final hra hra) {
        if (!((ArrayList)this.w).contains((Object)hra)) {
            final ArrayList list = (ArrayList)this.w;
            synchronized (list) {
                ((ArrayList)this.w).add((Object)hra);
                monitorexit(list);
                hra.F = true;
                return;
            }
        }
        uy8.n((Object)hra, "Fragment already added: ");
    }
    
    public nam c() {
        return (nam)this.y;
    }
    
    public void cancel() {
        ((Socket)this.w).close();
    }
    
    public long d(final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        final int b = ig0.b();
        long max = 0L;
        for (int i = 0; i < b; ++i) {
            max = Math.max(max, ((jg0)this.w).get(i).c(ig0.a(i), ig2.a(i), ig3.a(i)));
        }
        return max;
    }
    
    public ig0 e(final long n, final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        ig0 c;
        if ((c = (ig0)this.y) == null) {
            c = ig3.c();
            this.y = c;
        }
        final int b = c.b();
        int n2 = 0;
        while (true) {
            final ig0 ig4 = (ig0)this.y;
            if (n2 < b) {
                if (ig4 == null) {
                    mlc.j0("velocityVector");
                    throw null;
                }
                ig4.e(n2, ((jg0)this.w).get(n2).b(n, ig0.a(n2), ig2.a(n2), ig3.a(n2)));
                ++n2;
            }
            else {
                if (ig4 != null) {
                    return ig4;
                }
                mlc.j0("velocityVector");
                throw null;
            }
        }
    }
    
    public Object get() {
        return new c2l(((gfi)this.w).get(), ((gfi)this.x).get(), ((tze)this.y).get(), ((gfi)this.z).get(), (byte)22);
    }
    
    public ig0 i(final long n, final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        ig0 c;
        if ((c = (ig0)this.x) == null) {
            c = ig0.c();
            this.x = c;
        }
        final int b = c.b();
        int n2 = 0;
        while (true) {
            final ig0 ig4 = (ig0)this.x;
            if (n2 < b) {
                if (ig4 == null) {
                    mlc.j0("valueVector");
                    throw null;
                }
                ig4.e(n2, ((jg0)this.w).get(n2).e(n, ig0.a(n2), ig2.a(n2), ig3.a(n2)));
                ++n2;
            }
            else {
                if (ig4 != null) {
                    return ig4;
                }
                mlc.j0("valueVector");
                throw null;
            }
        }
    }
    
    public void j() {
        ljq.D((Executor)this.x, smk.z((String)this.w, ": data upload"), (rjc)this.y, (Runnable)this.z);
    }
    
    public ig0 k(final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        ig0 c;
        if ((c = (ig0)this.z) == null) {
            c = ig3.c();
            this.z = c;
        }
        final int b = c.b();
        int n = 0;
        while (true) {
            final ig0 ig4 = (ig0)this.z;
            if (n < b) {
                if (ig4 == null) {
                    mlc.j0("endVelocityVector");
                    throw null;
                }
                ig4.e(n, ((jg0)this.w).get(n).d(ig0.a(n), ig2.a(n), ig3.a(n)));
                ++n;
            }
            else {
                if (ig4 != null) {
                    return ig4;
                }
                mlc.j0("endVelocityVector");
                throw null;
            }
        }
    }
    
    @Override
    public void l(final jy7 jy7, final y7j y7j) {
        ljq.D((Executor)this.w, "dataStoreRead", (rjc)this.x, (Runnable)new ab1(this, y7j, jy7));
    }
    
    public vzl m() {
        return (vzl)this.z;
    }
    
    public void n(final frf frf) {
        if (((Set)this.z).add((Object)frf)) {
            ((grf)this.x).a(this, frf, -1);
        }
    }
    
    public void o() {
        ((ThreadPoolExecutor)this.x).remove((Runnable)this.z);
    }
    
    public void p(final v7g v7g, final int n) {
        if (n != 1 && n != 0) {
            oyl.g((Object)smk.p(n, "Unsupported priority value: "));
            return;
        }
        if (((Set)this.z).add((Object)v7g)) {
            ((grf)this.x).a(this, (frf)v7g, n);
        }
    }
    
    public boolean q() {
        synchronized (this) {
            if (((AtomicBoolean)this.y).get()) {
                return false;
            }
            ((AtomicInteger)this.x).incrementAndGet();
            return true;
        }
    }
    
    public void r(final com com) {
        final Object y = this.y;
        synchronized (y) {
            final Runnable runnable = (Runnable)((Map)this.z).remove((Object)com);
            monitorexit(y);
            if (runnable != null) {
                ((Handler)((j9j)this.w).w).removeCallbacks(runnable);
            }
        }
    }
    
    @Override
    public void s(final UUID uuid, final ier ier) {
        ljq.D((Executor)this.w, "dataStoreWrite", (rjc)this.x, (Runnable)new nb0((Object)this, (Object)uuid, (Object)ier, (byte)2));
    }
    
    public boolean t(final ToolUseBlock toolUseBlock) {
        final a0 a0 = (a0)this.w;
        final String c = toolUseBlock.c;
        return (boolean)a0.b(c) && (!(boolean)((a0)this.x).b(c) || k1r.j(toolUseBlock.p)) && !(boolean)((m54)this.y).d(c, toolUseBlock.e.a());
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 6: {
                final String string = ((Socket)this.w).toString();
                string.getClass();
                return string;
            }
        }
    }
    
    public Object u(final String s, final h07 h07) {
        return this.T(s, false, (jta)new rv3((byte)17), (lta)new jwj((Object)this, (byte)6), h07);
    }
    
    public void v(final frf h, final brf brf) {
        final grf grf = (grf)this.x;
        if (grf.g == 0) {
            final drf c = grf.c(-1);
            grf.f = c;
            grf.g = -1;
            grf.h = h;
            if (brf != null) {
                if (c != null) {
                    c.d(brf);
                }
                grf.a.n((Object)null, (Object)new irf(brf));
            }
        }
    }
    
    public hra w(final String s) {
        final asa asa = (asa)((HashMap)this.x).get((Object)s);
        if (asa != null) {
            return asa.j();
        }
        return null;
    }
    
    public hra x(final String s) {
        for (final asa asa : ((HashMap)this.x).values()) {
            if (asa != null) {
                hra hra = asa.j();
                if (!s.equals((Object)hra.z)) {
                    hra = hra.Q.c.x(s);
                }
                if (hra != null) {
                    return hra;
                }
                continue;
            }
        }
        return null;
    }
    
    public ArrayList y() {
        final ArrayList list = new ArrayList();
        for (final asa asa : ((HashMap)this.x).values()) {
            if (asa != null) {
                list.add((Object)asa);
            }
        }
        return list;
    }
    
    public ArrayList z() {
        final ArrayList list = new ArrayList();
        for (final asa asa : ((HashMap)this.x).values()) {
            if (asa != null) {
                list.add((Object)asa.j());
            }
            else {
                list.add((Object)null);
            }
        }
        return list;
    }
}
