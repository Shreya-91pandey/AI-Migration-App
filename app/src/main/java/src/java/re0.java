import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import android.os.BaseBundle;
import java.util.Random;
import java.util.concurrent.RejectedExecutionException;
import io.sentry.android.core.l;
import com.anthropic.claude.types.strings.ChatMemoryMode;
import io.sentry.m0;
import io.sentry.e6;
import io.sentry.d6;
import java.util.HashMap;
import java.util.List;
import io.sentry.v5;
import java.util.concurrent.TimeUnit;
import io.sentry.transport.p;
import java.io.IOException;
import java.util.concurrent.Executor;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.io.Serializable;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpToolKey;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.types.strings.McpServerId;
import java.util.concurrent.ExecutionException;
import android.text.TextUtils;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import java.security.MessageDigest;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import java.io.File;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import io.sentry.y6;
import io.sentry.o5;
import java.util.concurrent.ConcurrentLinkedQueue;
import io.sentry.d;
import java.util.concurrent.atomic.AtomicBoolean;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import io.sentry.metrics.a;

public class re0 implements b9f, jqh, rjc, a
{
    public Object A;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;
    
    public re0(final byte b) {
        switch (b) {
            default: {
                final LinkedHashSet v = new LinkedHashSet();
                final LinkedHashSet w = new LinkedHashSet();
                final LinkedHashSet x = new LinkedHashSet();
                final LinkedHashSet y = new LinkedHashSet();
                final LinkedHashMap z = new LinkedHashMap();
                this.v = v;
                this.w = w;
                this.x = x;
                this.y = y;
                this.z = z;
                this.A = null;
                return;
            }
            case 11: {
                this.v = new ArrayList();
                this.w = new ArrayList();
                this.x = new ArrayList();
                this.y = new ArrayList();
                this.z = new ArrayList();
                this.A = new ArrayList();
            }
        }
    }
    
    public re0(final SentryAndroidOptions v, final vee w) {
        this.z = new AtomicBoolean(false);
        this.A = new d((byte)8);
        this.v = v;
        this.w = w;
        this.x = new ConcurrentLinkedQueue();
        this.y = new o5((y6)v);
    }
    
    public re0(final String x, final String y, Set v) {
        if (v == null) {
            v = Collections.EMPTY_SET;
        }
        else {
            v = Collections.unmodifiableSet(v);
        }
        this.v = v;
        final Map empty_MAP = Collections.EMPTY_MAP;
        this.x = x;
        this.y = y;
        this.z = gyl.v;
        final HashSet set = new HashSet((Collection)v);
        final Iterator iterator = empty_MAP.values().iterator();
        if (!iterator.hasNext()) {
            this.w = Collections.unmodifiableSet((Set)set);
            return;
        }
        iterator.next().getClass();
        fvd.c();
        throw null;
    }
    
    public re0(final nkc a, final Object v, final lta w, final zta x, final lta y) {
        this.A = a;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = new l7n((jta)new nob((Object)this, (Object)a, (byte)3));
    }
    
    public re0(final tjc v) {
        final rn6 j = rn6.J;
        this.v = v;
        this.w = j.a();
        this.x = null;
        this.y = new LinkedHashSet();
        this.z = new LinkedHashSet();
        this.A = new LinkedHashSet();
    }
    
    public static boolean B(float floatValue) {
        final e3a e3a = new e3a(floatValue);
        floatValue = e3a.D();
        if (floatValue != 0.0f) {
            if (floatValue != 100.0f) {
                if (((Random)((l7n)e3a.x).getValue()).nextFloat() * 100.0f > floatValue) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static int H(int d) {
        d = ge9.D(d);
        if (d == 0) {
            return 2;
        }
        if (d == 1) {
            return 3;
        }
        if (d == 2) {
            return 4;
        }
        if (d == 3) {
            return 5;
        }
        if (d == 4) {
            return 6;
        }
        en9.r();
        return 0;
    }
    
    public static Long y(final File file, final rjc rjc) {
        final String name = file.getName();
        name.getClass();
        final Long h0 = rym.H0(name);
        if (h0 == null) {
            c5q.E(rjc, 5, qjc.w, (jta)new kz1(file, (byte)1), (Throwable)null, false, 56);
        }
        return h0;
    }
    
    public static String z(File parentFile) {
        parentFile = parentFile.getParentFile();
        Object name;
        if (parentFile != null) {
            name = parentFile.getName();
        }
        else {
            name = null;
        }
        if (name != null) {
            String s;
            Locale locale;
            if (d6a.D.g((CharSequence)name)) {
                s = "PENDING";
                locale = Locale.US;
            }
            else {
                if (!d6a.C.g((CharSequence)name)) {
                    return null;
                }
                s = "GRANTED";
                locale = Locale.US;
            }
            return oz1.r(locale, s, locale);
        }
        return null;
    }
    
    public void A(final h07 h07) {
        ize ize2 = null;
        Label_0049: {
            if (h07 instanceof ize) {
                final ize ize = (ize)h07;
                final int x = ize.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    ize.x = x + Integer.MIN_VALUE;
                    ize2 = ize;
                    break Label_0049;
                }
            }
            ize2 = new ize(this, h07);
        }
        final Object v = ize2.v;
        final int x2 = ize2.x;
        if (x2 == 0) {
            vt4.g0(v);
            final bsl f = ((gze)this.v).f;
            final wb0 wb0 = new wb0(this, (byte)14);
            ize2.x = 1;
            f.a((jja)wb0, (f07)ize2);
            return;
        }
        if (x2 != 1) {
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        throw ge9.w(v);
    }
    
    public void C(final y7j y7j, int n, final jta jta, final Throwable t, final boolean b, final LinkedHashSet set) {
        final int h = H(n);
        y7j.getClass();
        final int c = zw7.c;
        final int n2 = 0;
        if (h >= c) {
            final String s = (String)jta.a();
            final tjc tjc = (tjc)this.v;
            String name;
            if (tjc != null) {
                name = tjc.getName();
            }
            else {
                name = null;
            }
            String s2 = s;
            if (name != null) {
                s2 = lmf.s("[", name, "]: ", s);
            }
            if (b) {
                if (((Set)set).contains((Object)s2)) {
                    return;
                }
                ((Set)set).add((Object)s2);
            }
            final int h2 = H(n);
            n = n2;
            if (h2 >= zw7.c) {
                n = 1;
            }
            if (n != 0) {
                Log.println(h2, "Datadog", s2);
                if (t != null) {
                    Log.println(h2, "Datadog", Log.getStackTraceString(t));
                }
            }
        }
    }
    
    public void D(String s, final Bundle bundle, final boolean b) {
        ((BaseBundle)bundle).putString("scope", "*");
        ((BaseBundle)bundle).putString("sender", s);
        ((BaseBundle)bundle).putString("subtype", s);
        final ffa ffa = (ffa)this.v;
        ffa.a();
        ((BaseBundle)bundle).putString("gmp_app_id", ffa.c.b);
        ((BaseBundle)bundle).putString("gmsv", Integer.toString(((m8f)this.w).c()));
        ((BaseBundle)bundle).putString("osv", Integer.toString(Build$VERSION.SDK_INT));
        ((BaseBundle)bundle).putString("app_ver", ((m8f)this.w).a());
        final m8f m8f = (m8f)this.w;
        final m8f m8f2;
        monitorenter(m8f2 = m8f);
        Label_0133: {
            try {
                if (m8f.c == null) {
                    m8f.f();
                }
                break Label_0133;
            }
            finally {
                monitorexit(m8f2);
                final InterruptedException ex;
                eib eib;
                v48 v48;
                long currentTimeMillis;
                fib fib;
                boolean e;
                int n;
                int n2;
                t88 t88;
                String c;
                ffa ffa2;
                ffa ffa3;
                Block_7_Outer:Block_6_Outer:
                while (true) {
                    Label_0306: {
                        Label_0282: {
                            while (true) {
                                Label_0195: {
                                    while (true) {
                                        while (true) {
                                            Log.e("FirebaseMessaging", "Failed to get FIS auth token", (Throwable)ex);
                                            break Label_0306;
                                            v48 = (v48)eib;
                                            synchronized (v48) {
                                                currentTimeMillis = System.currentTimeMillis();
                                                fib = (fib)v48.a.get();
                                                synchronized (fib) {
                                                    e = fib.e(currentTimeMillis);
                                                    monitorexit(fib);
                                                    n = 1;
                                                    Label_0504: {
                                                        if (e) {
                                                            synchronized (fib) {
                                                                fib.a.a((lta)new c8b((Object)fib, (Object)fib.b(System.currentTimeMillis()), (byte)3));
                                                                monitorexit(fib);
                                                                monitorexit(v48);
                                                                n2 = 3;
                                                                break Label_0504;
                                                            }
                                                        }
                                                        monitorexit(v48);
                                                        n2 = 1;
                                                    }
                                                    if (n2 != 1) {
                                                        if (n2 != 1) {
                                                            if (n2 != 2) {
                                                                if (n2 != 3) {
                                                                    throw null;
                                                                }
                                                                n = 2;
                                                            }
                                                        }
                                                        else {
                                                            n = 0;
                                                        }
                                                        ((BaseBundle)bundle).putString("Firebase-Client-Log-Type", Integer.toString(n));
                                                        ((BaseBundle)bundle).putString("Firebase-Client", t88.a());
                                                    }
                                                    return;
                                                }
                                            }
                                            return;
                                            c = m8f.c;
                                            monitorexit(m8f2);
                                            ((BaseBundle)bundle).putString("app_ver_name", c);
                                            ffa2 = (ffa)this.v;
                                            ffa2.a();
                                            s = ffa2.b;
                                            try {
                                                s = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(s.getBytes()), 11);
                                            }
                                            catch (final NoSuchAlgorithmException ex2) {
                                                s = "[HASH-ERROR]";
                                            }
                                            break Label_0195;
                                            try {
                                                Label_0233: {
                                                    s = ((jl1)ri2.n(((kfa)this.A).d())).a;
                                                }
                                                if (!TextUtils.isEmpty((CharSequence)s)) {
                                                    ((BaseBundle)bundle).putString("Goog-Firebase-Installations-Auth", s);
                                                    break Label_0306;
                                                }
                                            }
                                            catch (final InterruptedException ex) {
                                                continue Block_7_Outer;
                                            }
                                            catch (final ExecutionException ex) {
                                                continue Block_7_Outer;
                                            }
                                            break;
                                        }
                                        break Label_0282;
                                        ffa3 = (ffa)this.v;
                                        ffa3.a();
                                        ((BaseBundle)bundle).putString("Goog-Api-Key", ffa3.c.a);
                                        continue Block_6_Outer;
                                    }
                                    Label_0578: {
                                        return;
                                    }
                                }
                                ((BaseBundle)bundle).putString("firebase-app-name-hash", s);
                                iftrue(Label_0233:)(!b);
                                continue;
                            }
                        }
                        Log.w("FirebaseMessaging", "FIS auth token is empty");
                    }
                    ((BaseBundle)bundle).putString("appid", (String)ri2.n(((kfa)this.A).c()));
                    ((BaseBundle)bundle).putString("cliv", "fcm-25.1.1");
                    eib = (eib)((hfi)this.z).get();
                    t88 = (t88)((hfi)this.y).get();
                    iftrue(Label_0578:)(eib == null || t88 == null);
                    continue;
                }
            }
        }
    }
    
    public Object E(final String s, final wne wne, final xr5 xr5, final m6n m6n) {
        final ArrayList list = new ArrayList();
        final o1e o1e = new o1e();
        final Iterator iterator = ((Iterable)((r8o)this.x).b((Object)new McpServerId(s))).iterator();
        Object o;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            o = null;
            final wne wne2 = null;
            if (!hasNext) {
                break;
            }
            final McpTool mcpTool = (McpTool)iterator.next();
            if (wp7.n(mcpTool)) {
                continue;
            }
            final Iterator iterator2 = wp7.k(mcpTool).iterator();
            Object next;
            do {
                next = wne2;
                if (!iterator2.hasNext()) {
                    break;
                }
                next = iterator2.next();
            } while (((Enum)next).compareTo((Enum)wne) < 0);
            final wne wne3 = (wne)next;
            if (wne3 == null) {
                continue;
            }
            o1e.putAll((Map)wp7.u(mcpTool, wne3));
            final String f = mcpTool.f;
            if (f == null) {
                continue;
            }
            list.add((Object)new McpToolKey(f));
        }
        final o1e c = o1e.c();
        if (!c.isEmpty()) {
            final o4m o4m = (o4m)this.A;
            String k;
            if (xr5 != null) {
                k = xr5.k();
            }
            else {
                k = null;
            }
            if (k != null) {
                o = new ChatId(k);
            }
            o4m.m(o, (Object)new McpServerId(s), (Object)list, (Object)(wne != wne.x));
            final Object y = ((vhk)this.y).y((Serializable)c, xr5, m6n);
            if (y == pc7.v) {
                return y;
            }
        }
        return lqo.a;
    }
    
    public void F(Object b, final auc auc, final Object o) {
        b = ((lta)this.y).b(o);
        ((bnf)((l7n)this.z).getValue()).setValue(b);
        final SharedPreferences$Editor edit = ((SharedPreferences)((nkc)this.A).b.getValue()).edit();
        edit.getClass();
        ((zta)this.x).d((Object)edit, b);
        edit.apply();
    }
    
    public cgr G(final String s, final Bundle bundle, final boolean b) {
        try {
            this.D(s, bundle, b);
            final szj szj = (szj)this.x;
            final bfq z = bfq.z;
            final egr c = szj.c;
            if (c.b() >= 12000000) {
                return agr.s(szj.b).u(1, bundle).f((Executor)z, (g07)s88.w);
            }
            if (c.a() != 0) {
                return szj.b(bundle).g((Executor)z, (g07)new hjo((Object)szj, (Object)bundle, false, (byte)17));
            }
            return ri2.H((Exception)new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        catch (final InterruptedException | ExecutionException ex) {
            return ri2.H((Exception)ex);
        }
    }
    
    public Object I(final McpTool mcpTool, final wne wne, final xr5 xr5, final m6n m6n) {
        final String f = mcpTool.f;
        if (f != null) {
            final vrd vrd = (vrd)this.z;
            Object o = null;
            String k;
            if (xr5 != null) {
                k = xr5.k();
            }
            else {
                k = null;
            }
            if (k != null) {
                o = new ChatId(k);
            }
            vrd.h(o, (Object)new McpToolKey(f), (Object)(wne != wne.x));
        }
        final Object y = ((vhk)this.y).y((Serializable)wp7.u(mcpTool, wne), xr5, m6n);
        if (y == pc7.v) {
            return y;
        }
        return lqo.a;
    }
    
    @Override
    public void a(final boolean b) {
        final o5 o5 = (o5)this.y;
        if (b) {
            this.x(true);
            o5.submit((Runnable)new rtj((Object)this, (byte)23));
            return;
        }
        o5.a(((y6)this.v).getShutdownTimeoutMillis());
        while (!((ConcurrentLinkedQueue)this.x).isEmpty()) {
            this.m();
        }
    }
    
    @Override
    public void b(final long n) {
        this.x(true);
        try {
            ((AbstractQueuedSynchronizer)((d)this.A).v).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(n));
        }
        catch (final InterruptedException ex) {
            ((y6)this.v).getLogger().f(v5.ERROR, "Failed to flush metrics events", (Throwable)ex);
            Thread.currentThread().interrupt();
        }
    }
    
    @Override
    public void c() {
        ((AtomicBoolean)this.A).set(true);
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public void e(final File file, final bz1 bz1) {
        final rjc rjc = (rjc)this.x;
        final String s = (String)this.z;
        if (s != null) {
            if (uoo.E(file, rjc)) {
                final Long y = y(file, rjc);
                final hx7 hx7 = null;
                Map z = null;
                Label_0256: {
                    if (y != null) {
                        final long n = bz1.b() - y;
                        if (n >= 0L) {
                            z = y5e.Z(new yog[] { new yog((Object)"track", (Object)s), new yog((Object)"metric_type", (Object)"batch closed"), new yog((Object)"batch_duration", (Object)n), new yog((Object)"uploader_window", (Object)((gca)this.w).a), new yog((Object)"batch_size", (Object)uoo.Q(file, rjc)), new yog((Object)"batch_events_count", (Object)bz1.a()), new yog((Object)"consent", (Object)z(file)), new yog((Object)"filename", (Object)file.getName()), new yog((Object)"thread", (Object)Thread.currentThread().getName()) });
                            break Label_0256;
                        }
                    }
                    z = null;
                }
                if (z != null) {
                    final tjc tjc = (tjc)((re0)rjc).v;
                    hx7 hx8 = hx7;
                    if (tjc instanceof hx7) {
                        hx8 = (hx7)tjc;
                    }
                    if (hx8 != null) {
                        hx8.c();
                    }
                    if (B(1.5f)) {
                        if (tjc != null) {
                            final aik feature = tjc.getFeature("rum");
                            if (feature != null) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap(z);
                                zrn.A((Map)linkedHashMap, 2, 1.5f);
                                feature.a((Object)new tkc("[Mobile Metric] Batch Closed", linkedHashMap));
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void f() {
        ((AtomicBoolean)this.A).set(false);
    }
    
    @Override
    public void h() {
    }
    
    public void i(final long b, final long n, final List list, ArrayList list2) {
        int n2 = list2.size() - 1;
        if (n2 >= 0) {
            while (true) {
                final int n3 = n2 - 1;
                final d1h d1h = (d1h)list2.get(n2);
                final long b2 = d1h.b;
                Label_0194: {
                    if (b2 > 0L && b2 < b) {
                        final d1h d1h2 = (d1h)list2.remove(n2);
                        final ArrayList list3;
                        monitorenter(list3 = (ArrayList)this.A);
                        try {
                            try {
                                ((ArrayList)this.A).add((Object)d1h2);
                            }
                            finally {}
                        }
                        catch (final OutOfMemoryError outOfMemoryError) {
                            ((ArrayList)this.A).clear();
                            ((ArrayList)this.A).add((Object)d1h2);
                        }
                        monitorexit(list3);
                        break Label_0194;
                        monitorexit(list3);
                    }
                    else if (d1h.a < n) {
                        ((ArrayList)this.x).add((Object)d1h);
                        if (list2.equals(this.w) && d1h.b == -1L) {
                            d1h.b = b;
                        }
                    }
                }
                if (n3 < 0) {
                    break;
                }
                n2 = n3;
            }
        }
        if (((ArrayList)this.x).size() > 0) {
            final int size = ((ArrayList)this.x).size();
            final int n4 = 0;
            for (int i = 0; i < size; ++i) {
                if (((ArrayList)this.z).contains((Object)i)) {
                    ((ArrayList)this.y).add((Object)i);
                }
                else {
                    final d1h d1h3 = (d1h)((ArrayList)this.x).get(i);
                    for (int j = i + 1; j < ((ArrayList)this.x).size(); ++j) {
                        final d1h d1h4 = (d1h)((ArrayList)this.x).get(j);
                        if (mlc.q((Object)d1h3.c.a, (Object)d1h4.c.a)) {
                            if (d1h3.a < d1h4.a) {
                                ((ArrayList)this.y).add((Object)i);
                                break;
                            }
                            ((ArrayList)this.z).add((Object)j);
                        }
                    }
                }
            }
            int n5 = ((ArrayList)this.y).size() - 1;
            while (true) {
                list2 = (ArrayList)this.x;
                if (-1 >= n5) {
                    break;
                }
                list2.remove(((Number)((ArrayList)this.y).get(n5)).intValue());
                --n5;
            }
            final int size2 = list2.size();
            int n6 = n4;
            while (true) {
                list2 = (ArrayList)this.x;
                if (n6 >= size2) {
                    break;
                }
                list.add((Object)((d1h)list2.get(n6)).c);
                ++n6;
            }
            list2.clear();
            ((ArrayList)this.y).clear();
            ((ArrayList)this.z).clear();
        }
    }
    
    public void j(final String s, final String s2) {
        final HashMap hashMap = (HashMap)this.A;
        if (hashMap != null) {
            hashMap.put((Object)s, (Object)s2);
            return;
        }
        en9.q("Property \"autoMetadata\" has not been set");
    }
    
    public fl1 k() {
        String s;
        if (this.v == null) {
            s = " transportName";
        }
        else {
            s = "";
        }
        String concat = s;
        if (this.x == null) {
            concat = s.concat(" encodedPayload");
        }
        String concat2 = concat;
        if (this.y == null) {
            concat2 = concat.concat(" eventMillis");
        }
        String concat3 = concat2;
        if (this.z == null) {
            concat3 = concat2.concat(" uptimeMillis");
        }
        String concat4 = concat3;
        if (this.A == null) {
            concat4 = concat3.concat(" autoMetadata");
        }
        if (concat4.isEmpty()) {
            return new fl1((String)this.v, (Integer)this.w, (n99)this.x, (long)this.y, (long)this.z, (HashMap)this.A);
        }
        en9.q("Missing required properties:".concat(concat4));
        return null;
    }
    
    public int l(final String s, final String s2) {
        Map map;
        if (s == null || (map = (Map)((r8o)this.w).b((Object)new ChatId(s))) == null) {
            map = (Map)((m8o)this.v).a();
        }
        final Iterable iterable = (Iterable)((r8o)this.x).b((Object)new McpServerId(s2));
        if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
            return 0;
        }
        final Iterator iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final McpTool mcpTool = (McpTool)iterator.next();
            if (!wp7.n(mcpTool)) {
                final String f = mcpTool.f;
                if (f != null && mlc.q((Object)map.get((Object)new McpToolKey(f)), (Object)Boolean.FALSE)) {
                    continue;
                }
                if (++n >= 0) {
                    continue;
                }
                lq6.m0();
                throw null;
            }
        }
        return n;
    }
    
    public void m() {
        final ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue)this.x;
        final ArrayList list = new ArrayList(1000);
        do {
            final d6 d6 = (d6)concurrentLinkedQueue.poll();
            if (d6 != null) {
                list.add((Object)d6);
            }
        } while (!concurrentLinkedQueue.isEmpty() && list.size() < 1000);
        if (!list.isEmpty()) {
            final vee vee = (vee)this.w;
            final e6 e6 = new e6((List)list);
            int i = 0;
            try {
                vee.D(vee.n(e6), (m0)null);
            }
            catch (final IOException ex) {
                ((y6)vee.b).getLogger().e(v5.WARNING, (Throwable)ex, "Capturing metrics failed.", new Object[0]);
            }
            while (i < list.size()) {
                final p p = (p)((d)this.A).v;
                final int v = io.sentry.transport.p.v;
                ((AbstractQueuedSynchronizer)p).releaseShared(1);
                ++i;
            }
        }
    }
    
    @Override
    public void n(final File file, final m9r m9r, final int n) {
        final rjc rjc = (rjc)this.x;
        final String s = (String)this.z;
        if (s != null) {
            final tv7 tv7 = (tv7)this.v;
            final Long y = y(file, rjc);
            final hx7 hx7 = null;
            Map z = null;
            Label_0354: {
                if (y != null) {
                    final long longValue = y;
                    this.y.getClass();
                    final long n2 = System.currentTimeMillis() - longValue;
                    if (n2 >= 0L) {
                        z = y5e.Z(new yog[] { new yog((Object)"track", (Object)s), new yog((Object)"metric_type", (Object)"batch deleted"), new yog((Object)"batch_age", (Object)n2), new yog((Object)"uploader_delay", (Object)y5e.Z(new yog[] { new yog((Object)"min", (Object)(long)tv7.c), new yog((Object)"max", (Object)tv7.d) })), new yog((Object)"uploader_window", (Object)((gca)this.w).a), new yog((Object)"batch_removal_reason", (Object)m9r.toString()), new yog((Object)"in_background", (Object)((AtomicBoolean)this.A).get()), new yog((Object)"consent", (Object)z(file)), new yog((Object)"filename", (Object)file.getName()), new yog((Object)"pending_batches", (Object)n), new yog((Object)"thread", (Object)Thread.currentThread().getName()) });
                        break Label_0354;
                    }
                }
                z = null;
            }
            if (z != null) {
                final tjc tjc = (tjc)((re0)rjc).v;
                hx7 hx8 = hx7;
                if (tjc instanceof hx7) {
                    hx8 = (hx7)tjc;
                }
                if (hx8 != null) {
                    hx8.c();
                }
                if (B(1.5f)) {
                    if (tjc != null) {
                        final aik feature = tjc.getFeature("rum");
                        if (feature != null) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap(z);
                            zrn.A((Map)linkedHashMap, 2, 1.5f);
                            feature.a((Object)new tkc("[Mobile Metric] Batch Deleted", linkedHashMap));
                        }
                    }
                }
            }
        }
    }
    
    public void o(final long n, final long n2, final ArrayList list) {
        final ArrayList list2 = (ArrayList)this.w;
        synchronized (list2) {
            list.clear();
            this.i(n, n2, (List)list, (ArrayList)this.v);
            this.i(n, n2, (List)list, (ArrayList)this.w);
        }
    }
    
    public String q() {
        if (((ca4)this.v).a()) {
            if (!(boolean)((ca4)this.y).a()) {
                if (((ksg)this.A).getValue()) {
                    ChatMemoryMode.Companion.getClass();
                    return "disabled";
                }
                if (((ca4)this.x).a()) {
                    ChatMemoryMode.Companion.getClass();
                    return "enabled";
                }
            }
        }
        return null;
    }
    
    public d1h r(final long n, final dpm c) {
        final ArrayList list;
        monitorenter(list = (ArrayList)this.A);
        Label_0110: {
            try {
                if (((ArrayList)this.A).isEmpty()) {
                    final Object o = new Object();
                    ((d1h)o).a = n;
                    ((d1h)o).b = -1L;
                    ((d1h)o).c = c;
                    monitorexit(list);
                    return (d1h)o;
                }
            }
            finally {
                break Label_0110;
            }
            final d1h d1h = (d1h)((ArrayList)this.A).remove(0);
            d1h.a = n;
            d1h.b = -1L;
            final dpm c2;
            d1h.c = c2;
            monitorexit(list);
            return d1h;
        }
        monitorexit(list);
    }
    
    public wne s(final String s, final McpTool mcpTool) {
        if (wp7.n(mcpTool)) {
            return wne.x;
        }
        final o1e o1e = new o1e();
        Map map;
        if (s != null) {
            map = (Map)((r8o)this.w).b((Object)new ChatId(s));
        }
        else {
            map = null;
        }
        final Map map2 = (Map)((m8o)this.v).a();
        final String f = mcpTool.f;
        if (f != null) {
            final McpToolKey mcpToolKey = new McpToolKey(f);
            Map map3;
            if (map == null) {
                map3 = map2;
            }
            else {
                map3 = map;
            }
            final Boolean b = (Boolean)map3.get((Object)mcpToolKey);
            if (b != null) {
                final Boolean b2 = (Boolean)o1e.put((Object)mcpToolKey, (Object)b);
            }
        }
        final String g = mcpTool.g;
        if (g != null) {
            final McpToolKey mcpToolKey2 = new McpToolKey(g);
            Boolean b3;
            if (map == null || (b3 = (Boolean)map.get((Object)mcpToolKey2)) == null) {
                b3 = (Boolean)map2.get((Object)mcpToolKey2);
            }
            if (b3 != null) {
                o1e.put((Object)mcpToolKey2, (Object)b3);
            }
        }
        final wne w = wp7.w(mcpTool, o1e.c());
        final ArrayList k = wp7.k(mcpTool);
        if (!k.contains((Object)w)) {
            final wne wne = (wne)c86.I0((List)k);
            if (wne != null) {
                return wne;
            }
        }
        return w;
    }
    
    public Object t(final Object o) {
        if (((nkc)this.A).a.get()) {
            return ((xom)((l7n)this.z).getValue()).getValue();
        }
        return this.v;
    }
    
    public void u(final int n, final qjc qjc, final jta jta, final Throwable t, final boolean b, final Map map) {
        final int ordinal = ((Enum)qjc).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    final LinkedHashSet set = (LinkedHashSet)this.A;
                    final tjc tjc = (tjc)this.v;
                    if (tjc != null) {
                        final aik feature = tjc.getFeature("rum");
                        if (feature != null) {
                            final String s = (String)jta.a();
                            if (b) {
                                if (((Set)set).contains((Object)s)) {
                                    return;
                                }
                                ((Set)set).add((Object)s);
                            }
                            Object o;
                            if (n != 5 && n != 4 && t == null) {
                                o = new qkc(s, map);
                            }
                            else {
                                o = new rkc(s, map, t);
                            }
                            feature.a(o);
                        }
                    }
                }
            }
            else {
                final y7j y7j = (y7j)this.x;
                if (y7j != null) {
                    this.C(y7j, n, jta, t, b, (LinkedHashSet)this.z);
                }
            }
            return;
        }
        this.C((y7j)this.w, n, jta, t, b, (LinkedHashSet)this.y);
    }
    
    public void v(final int n, final List list, final jta jta, final Throwable t, final boolean b, final Map map) {
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            this.u(n, (qjc)iterator.next(), jta, t, b, map);
        }
    }
    
    public void w(final long b, final String s, final ArrayList list) {
        while (true) {
            final ArrayList list2;
            monitorenter(list2 = (ArrayList)this.w);
            Label_0092: {
            Label_0088:
                while (true) {
                    int n;
                    try {
                        final int size = list.size();
                        n = 0;
                        if (n >= size) {
                            break Label_0088;
                        }
                        final d1h d1h = (d1h)list.get(n);
                        if (mlc.q((Object)d1h.c.a, (Object)s) && d1h.b < 0L) {
                            d1h.b = b;
                        }
                    }
                    finally {
                        break Label_0092;
                    }
                    ++n;
                    continue;
                }
                monitorexit(list2);
                return;
            }
            monitorexit(list2);
        }
    }
    
    public void x(final boolean b) {
        final AtomicBoolean atomicBoolean = (AtomicBoolean)this.z;
        if (b) {
            atomicBoolean.set(true);
        }
        else if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        int n;
        if (b) {
            n = 0;
        }
        else {
            n = 5000;
        }
        try {
            ((o5)this.y).b((long)n, (Runnable)new l((Object)this, (byte)10));
        }
        catch (final RejectedExecutionException ex) {
            atomicBoolean.set(false);
            ((y6)this.v).getLogger().f(v5.WARNING, "Metrics batch processor flush task rejected", (Throwable)ex);
        }
    }
}
