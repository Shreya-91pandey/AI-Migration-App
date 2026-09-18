import java.util.HashMap;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import android.view.View;
import java.util.WeakHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import androidx.compose.ui.node.LayoutNode;
import android.content.SharedPreferences$Editor;
import com.anthropic.claude.bell.tts.f;
import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudOutcome;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import android.content.res.Configuration;
import androidx.compose.ui.graphics.vector.VectorPainter;
import com.anthropic.claude.api.account.RateLimitUpsell;
import com.anthropic.claude.api.account.BillingType;
import com.anthropic.claude.api.account.Organization;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.chat.ratelimits.PersistedRateLimit;
import android.content.SharedPreferences;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import com.datadog.trace.bootstrap.config.provider.b;

public abstract class ljq
{
    public static gfk a;
    public static final b b;
    public static final StackTraceElement[] c;
    
    public static final void A(final f7b f7b, final k6p k6p) {
        final ArrayList e = k6p.E;
        for (int size = e.size(), i = 0; i < size; ++i) {
            final m6p m6p = (m6p)e.get(i);
            if (m6p instanceof n6p) {
                final hvg hvg = new hvg();
                final n6p n6p = (n6p)m6p;
                hvg.d = n6p.w;
                hvg.n = true;
                ((s5p)hvg).c();
                hvg.s.m(n6p.x);
                ((s5p)hvg).c();
                ((s5p)hvg).c();
                hvg.b = n6p.y;
                ((s5p)hvg).c();
                hvg.c = n6p.z;
                ((s5p)hvg).c();
                hvg.g = n6p.A;
                ((s5p)hvg).c();
                hvg.e = n6p.B;
                ((s5p)hvg).c();
                hvg.f = n6p.C;
                hvg.o = true;
                ((s5p)hvg).c();
                hvg.h = n6p.D;
                hvg.o = true;
                ((s5p)hvg).c();
                hvg.i = n6p.E;
                hvg.o = true;
                ((s5p)hvg).c();
                hvg.j = n6p.F;
                hvg.o = true;
                ((s5p)hvg).c();
                hvg.k = n6p.G;
                hvg.p = true;
                ((s5p)hvg).c();
                hvg.l = n6p.H;
                hvg.p = true;
                ((s5p)hvg).c();
                hvg.m = n6p.I;
                hvg.p = true;
                ((s5p)hvg).c();
                f7b.e(i, (s5p)hvg);
            }
            else if (m6p instanceof k6p) {
                final f7b f7b2 = new f7b();
                final k6p k6p2 = (k6p)m6p;
                f7b2.k = k6p2.v;
                ((s5p)f7b2).c();
                f7b2.l = k6p2.w;
                f7b2.s = true;
                ((s5p)f7b2).c();
                f7b2.o = k6p2.z;
                f7b2.s = true;
                ((s5p)f7b2).c();
                f7b2.p = k6p2.A;
                f7b2.s = true;
                ((s5p)f7b2).c();
                f7b2.q = k6p2.B;
                f7b2.s = true;
                ((s5p)f7b2).c();
                f7b2.r = k6p2.C;
                f7b2.s = true;
                ((s5p)f7b2).c();
                f7b2.m = k6p2.x;
                f7b2.s = true;
                ((s5p)f7b2).c();
                f7b2.n = k6p2.y;
                f7b2.s = true;
                ((s5p)f7b2).c();
                f7b2.f = k6p2.D;
                f7b2.g = true;
                ((s5p)f7b2).c();
                A(f7b2, k6p2);
                f7b.e(i, (s5p)f7b2);
            }
        }
    }
    
    public static EnumMap B(final jn6 jn6, final Set set, final Map map) {
        final EnumMap enumMap = new EnumMap((Class)xbo.class);
        for (final xbo xbo : set) {
            switch (((Enum)xbo).ordinal()) {
                default: {
                    continue;
                }
                case 6: {
                    enumMap.put((Enum)xbo, (Object)twl.z);
                    continue;
                }
                case 5: {
                    enumMap.put((Enum)xbo, (Object)new ox7((Object)map, (byte)2));
                    continue;
                }
                case 4: {
                    enumMap.put((Enum)xbo, (Object)new ox7((Object)map, (byte)3));
                    continue;
                }
                case 3: {
                    enumMap.put((Enum)xbo, (Object)new ox7((Object)map, (byte)1));
                    continue;
                }
                case 2: {
                    final boolean z = jn6.Z;
                    final String a = ao1.a;
                    enumMap.put((Enum)xbo, (Object)new zn1((byte)0, z));
                    continue;
                }
                case 1: {
                    final boolean z2 = jn6.Z;
                    final String a2 = ao1.a;
                    enumMap.put((Enum)xbo, (Object)new zn1((byte)1, z2));
                    continue;
                }
                case 0: {
                    enumMap.put((Enum)xbo, (Object)new ox7((Object)map, (byte)0));
                    continue;
                }
            }
        }
        return enumMap;
    }
    
    public static final Object C(t2k v, final h07 h07) {
        us7 us8 = null;
        Label_0052: {
            if (h07 instanceof us7) {
                final us7 us7 = (us7)h07;
                final int y = us7.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    us7.y = y + Integer.MIN_VALUE;
                    us8 = us7;
                    break Label_0052;
                }
            }
            us8 = new us7(h07);
        }
        final Object x = us8.x;
        final int y2 = us8.y;
        Label_0256: {
            Object w = null;
            ygd a;
            b3k d1;
            if (y2 != 0) {
                if (y2 == 1) {
                    w = us8.w;
                    v = us8.v;
                    vt4.g0(x);
                    break Label_0256;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                vt4.g0(x);
                a = lq6.A();
                d1 = v.d1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
            }
            Label_0151: {
                try {
                    while (d1.Z0()) {
                        a.add((Object)d1.t0(0));
                    }
                    break Label_0151;
                }
                finally {
                    try {}
                    finally {
                        r9n.m((AutoCloseable)d1, (Throwable)h07);
                    }
                    while (true) {
                    Label_0168:
                        while (true) {
                            final String s;
                            final String concat = "DROP TRIGGER IF EXISTS ".concat(s);
                            us8.v = v;
                            us8.w = (Iterator)w;
                            us8.y = 1;
                            ncq.x(v, concat);
                            final pc7 v2 = pc7.v;
                            final lqo a2;
                            iftrue(Label_0256:)(a2 != v2);
                            return v2;
                            r9n.m((AutoCloseable)d1, (Throwable)null);
                            w = lq6.n(a).listIterator(0);
                            break Label_0168;
                            Label_0259: {
                                return a2;
                            }
                            break Label_0168;
                            s = (String)((Iterator)w).next();
                            iftrue(Label_0168:)(!rym.E0(s, "room_fts_content_sync_", false));
                            continue;
                        }
                        final boolean hasNext = ((Iterator)w).hasNext();
                        final lqo a2 = lqo.a;
                        iftrue(Label_0259:)(!hasNext);
                        continue;
                    }
                }
            }
        }
    }
    
    public static final void D(final Executor executor, final String s, final rjc rjc, final Runnable runnable) {
        Label_0071: {
            Object o = null;
            Label_0062: {
                try {
                    if (!(executor instanceof wo1)) {
                        o = runnable;
                        if (!(executor instanceof ThreadPoolExecutor)) {
                            break Label_0062;
                        }
                        o = runnable;
                        if (!(((ThreadPoolExecutor)executor).getQueue() instanceof bp1)) {
                            break Label_0062;
                        }
                    }
                    o = runnable;
                    if (!(runnable instanceof uof)) {
                        o = new uof(runnable, s);
                    }
                }
                catch (final RejectedExecutionException ex) {
                    break Label_0071;
                }
            }
            executor.execute((Runnable)o);
            return;
        }
        final RejectedExecutionException ex;
        c5q.F(rjc, 5, lq6.Y(qjc.w, qjc.x), (jta)new zo1(s, (byte)2), (Throwable)ex, 48);
    }
    
    public static gb E(final zrc zrc) {
        Label_0149: {
            Label_0140: {
                Label_0131: {
                    String i = null;
                    String j = null;
                    Label_0045: {
                        try {
                            i = zrc.o("id").i();
                            final irc o = zrc.o("referrer");
                            if (o != null) {
                                j = o.i();
                                break Label_0045;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0131;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0140;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0149;
                        }
                        j = null;
                    }
                    final String k = zrc.o("url").i();
                    final irc o2 = zrc.o("name");
                    String l;
                    if (o2 != null) {
                        l = o2.i();
                    }
                    else {
                        l = null;
                    }
                    final irc o3 = zrc.o("in_foreground");
                    Boolean value;
                    if (o3 != null) {
                        value = o3.a();
                    }
                    else {
                        value = null;
                    }
                    i.getClass();
                    k.getClass();
                    return new gb(i, j, k, l, value);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ActionEventView", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ActionEventView", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ActionEventView", (Throwable)ex3);
        return null;
    }
    
    public static qlj F(final zrc zrc) {
        Label_0569: {
            Label_0560: {
                Label_0551: {
                    int n3 = 0;
                    Label_0105: {
                        try {
                            final irc o = zrc.o("type");
                            final int n = 0;
                            final int n2 = 0;
                            n3 = n;
                            if (o != null) {
                                final String i = o.i();
                                n3 = n;
                                if (i != null) {
                                    final int[] f = ge9.F(7);
                                    for (int length = f.length, j = n2; j < length; ++j) {
                                        final int n4 = f[j];
                                        if (lmf.f(n4).equals(i)) {
                                            n3 = n4;
                                            break Label_0105;
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0551;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0560;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0569;
                        }
                    }
                    final irc o2 = zrc.o("name");
                    String k;
                    if (o2 != null) {
                        k = o2.i();
                    }
                    else {
                        k = null;
                    }
                    final irc o3 = zrc.o("model");
                    String l;
                    if (o3 != null) {
                        l = o3.i();
                    }
                    else {
                        l = null;
                    }
                    final irc o4 = zrc.o("brand");
                    String m;
                    if (o4 != null) {
                        m = o4.i();
                    }
                    else {
                        m = null;
                    }
                    final irc o5 = zrc.o("architecture");
                    String i2;
                    if (o5 != null) {
                        i2 = o5.i();
                    }
                    else {
                        i2 = null;
                    }
                    final irc o6 = zrc.o("locale");
                    String i3;
                    if (o6 != null) {
                        i3 = o6.i();
                    }
                    else {
                        i3 = null;
                    }
                    final irc o7 = zrc.o("locales");
                    Object o8;
                    if (o7 != null) {
                        final ArrayList v = o7.d().v;
                        final ArrayList list = new ArrayList(v.size());
                        final Iterator iterator = v.iterator();
                        while (true) {
                            o8 = list;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            list.add((Object)((irc)iterator.next()).i());
                        }
                    }
                    else {
                        o8 = null;
                    }
                    final irc o9 = zrc.o("time_zone");
                    String i4;
                    if (o9 != null) {
                        i4 = o9.i();
                    }
                    else {
                        i4 = null;
                    }
                    final irc o10 = zrc.o("battery_level");
                    Number h;
                    if (o10 != null) {
                        h = o10.h();
                    }
                    else {
                        h = null;
                    }
                    final irc o11 = zrc.o("power_saving_mode");
                    Boolean value;
                    if (o11 != null) {
                        value = o11.a();
                    }
                    else {
                        value = null;
                    }
                    final irc o12 = zrc.o("brightness_level");
                    Number h2;
                    if (o12 != null) {
                        h2 = o12.h();
                    }
                    else {
                        h2 = null;
                    }
                    final irc o13 = zrc.o("logical_cpu_count");
                    Number h3;
                    if (o13 != null) {
                        h3 = o13.h();
                    }
                    else {
                        h3 = null;
                    }
                    final irc o14 = zrc.o("total_ram");
                    Number h4;
                    if (o14 != null) {
                        h4 = o14.h();
                    }
                    else {
                        h4 = null;
                    }
                    final irc o15 = zrc.o("is_low_ram");
                    Boolean value2;
                    if (o15 != null) {
                        value2 = o15.a();
                    }
                    else {
                        value2 = null;
                    }
                    return new qlj(n3, k, l, m, i2, i3, (List)o8, i4, h, value, h2, h3, h4, value2);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Device", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Device", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Device", (Throwable)ex3);
        return null;
    }
    
    public static final List G(final SharedPreferences sharedPreferences) {
        final List list = null;
        final String string = sharedPreferences.getString("rate_limits", (String)null);
        if (string != null) {
            Object o = null;
            try {
                final iqc d = jqc.d;
                d.getClass();
                final List list2 = (List)((jqc)d).b(string, (KSerializer)new uv0(PersistedRateLimit.Companion.serializer(), (byte)0));
            }
            finally {
                final Throwable t;
                o = new jpj(t);
            }
            if (o instanceof jpj) {
                o = list;
            }
            final Object v = o;
            if (v != null) {
                return (List)v;
            }
        }
        final Object v = r89.v;
        return (List)v;
    }
    
    public static final Object H(final Future future, final String s, final rjc rjc) {
        final qjc x = qjc.x;
        final qjc v = qjc.v;
        if (future != null) {
            try {
                return future.get();
            }
            catch (final ExecutionException ex) {
                c5q.F(rjc, 5, lq6.Y(v, x), (jta)new zo1(s, (byte)5), (Throwable)ex, 48);
            }
            catch (final CancellationException ex2) {
                c5q.F(rjc, 5, lq6.Y(v, x), (jta)new zo1(s, (byte)4), (Throwable)ex2, 48);
            }
            catch (final InterruptedException ex3) {
                c5q.F(rjc, 5, lq6.Y(v, x), (jta)new zo1(s, (byte)3), (Throwable)ex3, 48);
            }
        }
        return null;
    }
    
    public static final int J(t2k d1) {
        d1 = (t2k)d1.d1("SELECT changes()");
        try {
            ((b3k)d1).Z0();
            final int n = (int)((b3k)d1).getLong(0);
            r9n.m((AutoCloseable)d1, (Throwable)null);
            return n;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                r9n.m((AutoCloseable)d1, t);
            }
        }
    }
    
    public static f07 K(final f07 f07) {
        h07 h07;
        if (f07 instanceof h07) {
            h07 = (h07)f07;
        }
        else {
            h07 = null;
        }
        if (h07 != null) {
            final f07<Object> intercepted = h07.intercepted();
            if (intercepted != null) {
                return intercepted;
            }
        }
        return f07;
    }
    
    public static long M(final long n, final dhc dhc) {
        final int c = dnn.c;
        final long a = dhc.a((int)(n >> 32), false);
        long a2;
        if (dnn.d(n)) {
            a2 = a;
        }
        else {
            a2 = dhc.a((int)(0xFFFFFFFFL & n), false);
        }
        final int min = Math.min(dnn.g(a), dnn.g(a2));
        final int max = Math.max(dnn.f(a), dnn.f(a2));
        if (dnn.h(n)) {
            return rhc.c(max, min);
        }
        return rhc.c(min, max);
    }
    
    public static long N(final long n, final dhc dhc, final jrk jrk) {
        final int c = dnn.c;
        final long a = dhc.a((int)(n >> 32), true);
        long a2;
        if (dnn.d(n)) {
            a2 = a;
        }
        else {
            a2 = dhc.a((int)(n & 0xFFFFFFFFL), true);
        }
        int b = 0;
        int a3;
        if (jrk != null) {
            a3 = jrk.a;
        }
        else {
            a3 = 0;
        }
        if (dnn.d(n)) {
            b = a3;
        }
        else if (jrk != null) {
            b = jrk.b;
        }
        long n2 = a;
        if (a3 != 0) {
            n2 = a;
            if (!dnn.d(a)) {
                final int d = ge9.D(a3);
                if (d != 0) {
                    if (d != 1) {
                        en9.r();
                        return 0L;
                    }
                    final int n3 = (int)(a & 0xFFFFFFFFL);
                    n2 = rhc.c(n3, n3);
                }
                else {
                    final int n4 = (int)(a >> 32);
                    n2 = rhc.c(n4, n4);
                }
            }
        }
        long n5 = a2;
        if (b != 0) {
            n5 = a2;
            if (!dnn.d(a2)) {
                final int d2 = ge9.D(b);
                long n7;
                if (d2 != 0) {
                    if (d2 != 1) {
                        en9.r();
                        return 0L;
                    }
                    final int n6 = (int)(a2 & 0xFFFFFFFFL);
                    n7 = rhc.c(n6, n6);
                }
                else {
                    final int n8 = (int)(a2 >> 32);
                    n7 = rhc.c(n8, n8);
                }
                n5 = n7;
            }
        }
        final int min = Math.min(dnn.g(n2), dnn.g(n5));
        final int max = Math.max(dnn.f(n2), dnn.f(n5));
        if (dnn.h(n)) {
            return rhc.c(max, min);
        }
        return rhc.c(min, max);
    }
    
    public static final igf O(final igf igf) {
        return igf.E((igf)oif.v);
    }
    
    public static fdb P(String... array) {
        final String[] array2 = (String[])Arrays.copyOf((Object[])array, array.length);
        if (array2.length % 2 == 0) {
            array = (String[])Arrays.copyOf((Object[])array2, array2.length);
            final int length = array.length;
            final int n = 0;
            for (int i = 0; i < length; ++i) {
                if (array[i] == null) {
                    en9.s("Headers cannot be null");
                    return null;
                }
                array[i] = kym.B1((CharSequence)array2[i]).toString();
            }
            final int v = r6k.v(0, array.length - 1, 2);
            if (v >= 0) {
                int n2 = n;
                while (true) {
                    final String s = array[n2];
                    final String s2 = array[n2 + 1];
                    t08.R(s);
                    t08.S(s2, s);
                    if (n2 == v) {
                        break;
                    }
                    n2 += 2;
                }
            }
            return new fdb(array);
        }
        en9.s("Expected alternating header names and values");
        return null;
    }
    
    public static final Object Q(quj v, lta lta, final h07 h07) {
        Object o = null;
        Label_0052: {
            if (h07 instanceof vs7) {
                final vs7 vs7 = (vs7)h07;
                final int z = vs7.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    vs7.z = z + Integer.MIN_VALUE;
                    o = vs7;
                    break Label_0052;
                }
            }
            o = new h07(h07);
        }
        Object o2 = ((vs7)o).y;
        final int z2 = ((vs7)o).z;
        final pc7 v2 = pc7.v;
        u13 x;
        if (z2 != 0) {
            if (z2 != 1) {
                if (z2 == 2) {
                    vt4.g0(o2);
                    return o2;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                x = ((vs7)o).x;
                lta = (lta)((vs7)o).w;
                v = ((vs7)o).v;
                vt4.g0(o2);
            }
        }
        else {
            vt4.g0(o2);
            x = u13.x;
            ((vs7)o).v = v;
            ((vs7)o).w = (m6n)lta;
            ((vs7)o).x = x;
            ((vs7)o).z = 1;
            o2 = o50.C(v, (h07)o);
            if (o2 == v2) {
                return v2;
            }
        }
        final hc7 hc7 = (hc7)o2;
        x.getClass();
        final hc7 s0 = uuj.s0((hc7)x, hc7);
        final p10 p3 = new p10((Object)v, (Object)lta, (f07)null, (byte)20);
        ((vs7)o).v = null;
        ((vs7)o).w = null;
        ((vs7)o).x = null;
        ((vs7)o).z = 2;
        final Object f0 = rhc.f0(s0, (zta)p3, (f07)o);
        if (f0 != v2) {
            return f0;
        }
        return v2;
    }
    
    public static final Object R(final f07 f07, zta zta, quj v, final boolean x, boolean y) {
        Object o = null;
        Label_0055: {
            if (f07 instanceof ws7) {
                final ws7 ws7 = (ws7)f07;
                final int a = ws7.A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    ws7.A = a + Integer.MIN_VALUE;
                    o = ws7;
                    break Label_0055;
                }
            }
            o = new h07(f07);
        }
        Object o2 = ((ws7)o).z;
        final int a2 = ((ws7)o).A;
        final pc7 v2 = pc7.v;
        boolean x2;
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 == 2) {
                    vt4.g0(o2);
                    return o2;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                final boolean y2 = ((ws7)o).y;
                x2 = ((ws7)o).x;
                zta = (zta)((ws7)o).w;
                v = ((ws7)o).v;
                vt4.g0(o2);
                y = y2;
            }
        }
        else {
            vt4.g0(o2);
            ((ws7)o).v = v;
            ((ws7)o).w = (m6n)zta;
            ((ws7)o).x = x;
            ((ws7)o).y = y;
            ((ws7)o).A = 1;
            o2 = o50.C(v, (h07)o);
            if (o2 == v2) {
                return v2;
            }
            x2 = x;
        }
        final hc7 hc7 = (hc7)o2;
        final at7 at7 = new at7((Object)v, x2, y, (aua)zta, (f07)null, (byte)2);
        ((ws7)o).v = null;
        ((ws7)o).w = null;
        ((ws7)o).A = 2;
        final Object f8 = rhc.f0(hc7, (zta)at7, (f07)o);
        if (f8 != v2) {
            return f8;
        }
        return v2;
    }
    
    public static final mpi S(final Organization organization, final boolean b, final boolean b2, final boolean b3) {
        final String g = organization.g;
        final RateLimitUpsell h = organization.h;
        boolean b4 = false;
        final int n = 1;
        boolean b5 = false;
        Label_0051: {
            if (b) {
                final lc2 companion = BillingType.Companion;
                if (mlc.q(g, "google_play_subscription") && b2) {
                    b5 = true;
                    break Label_0051;
                }
            }
            b5 = false;
        }
        if (r6k.z(organization) == w1n.w) {
            b4 = true;
        }
        Object o;
        if (b3) {
            o = h;
        }
        else {
            o = null;
        }
        int n2;
        if (o == null) {
            n2 = -1;
        }
        else {
            n2 = kpi.a[((Enum)o).ordinal()];
        }
        final int n3 = 5;
        int n4 = 0;
        Label_0194: {
            while (true) {
                Label_0174: {
                    if (n2 == -1) {
                        break Label_0174;
                    }
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 == 3) {
                                n4 = 4;
                                break Label_0194;
                            }
                            if (n2 == 4) {
                                break Label_0174;
                            }
                            en9.r();
                            return null;
                        }
                        else {
                            if (b5) {
                                n4 = 2;
                                break Label_0194;
                            }
                            n4 = 3;
                            break Label_0194;
                        }
                    }
                    else {
                        n4 = n3;
                        if (!b) {
                            break Label_0194;
                        }
                    }
                    n4 = 1;
                    break Label_0194;
                }
                n4 = n3;
                if (b4) {
                    n4 = n3;
                    if (b) {
                        continue;
                    }
                }
                break;
            }
        }
        final lc2 companion2 = BillingType.Companion;
        int n5;
        if (mlc.q(g, "google_play_subscription")) {
            n5 = 2;
        }
        else {
            n5 = n;
            if (mlc.q(g, "apple_subscription")) {
                n5 = 3;
            }
        }
        return new mpi(n4, n5);
    }
    
    public static final VectorPainter T(final o4c o4c, final gva gva) {
        final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
        final boolean e = gva.e(((long)Float.floatToRawIntBits(xc8.getDensity()) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits((float)o4c.j) << 32);
        final Object r = gva.R();
        VectorPainter vectorPainter;
        if (e || (vectorPainter = (VectorPainter)r) == bi6.a) {
            final f7b f7b = new f7b();
            A(f7b, o4c.f);
            final long n = (long)Float.floatToRawIntBits(xc8.w0(o4c.b)) << 32 | ((long)Float.floatToRawIntBits(xc8.w0(o4c.c)) & 0xFFFFFFFFL);
            final float d = o4c.d;
            final float e2 = o4c.e;
            float intBitsToFloat = d;
            if (Float.isNaN(d)) {
                intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
            }
            float intBitsToFloat2 = e2;
            if (Float.isNaN(e2)) {
                intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
            }
            final long n2 = Float.floatToRawIntBits(intBitsToFloat);
            final long n3 = Float.floatToRawIntBits(intBitsToFloat2);
            final VectorPainter vectorPainter2 = new VectorPainter(f7b);
            final String a = o4c.a;
            final long g = o4c.g;
            final int h = o4c.h;
            Object value;
            if (g != 16L) {
                value = new he2(g, h);
            }
            else {
                value = null;
            }
            final boolean i = o4c.i;
            vectorPainter2.A.setValue((Object)new yzl(n));
            vectorPainter2.B.setValue((Object)i);
            final h6p c = vectorPainter2.C;
            c.g.setValue(value);
            c.i.setValue((Object)new yzl(n2 << 32 | (0xFFFFFFFFL & n3)));
            c.c = a;
            gva.q0((Object)vectorPainter2);
            vectorPainter = vectorPainter2;
        }
        return vectorPainter;
    }
    
    public static final igf U(final igf igf, final xma xma, final gva gva, final int n) {
        final Configuration configuration = (Configuration)gva.j((sei)q50.a);
        int n2 = false ? 1 : 0;
        final Object r = gva.R();
        final cib a = bi6.a;
        Object o = r;
        if (r == a) {
            o = new s8k((byte)28);
            gva.q0(o);
        }
        final bnf bnf = (bnf)mlc.a0(new Object[0], (jta)o, gva, 48);
        Object o2;
        if ((o2 = gva.R()) == a) {
            o2 = mlc.z((hc7)o89.v, gva);
            gva.q0(o2);
        }
        final oc7 oc7 = (oc7)o2;
        final boolean f = gva.f((Object)bnf);
        final boolean h = gva.h((Object)configuration);
        final boolean h2 = gva.h((Object)oc7);
        final boolean b = (((n & 0x380) ^ 0x180) > 256 && gva.h((Object)y38.a)) || (n & 0x180) == 0x100;
        if ((((n & 0x70) ^ 0x30) > 32 && gva.f((Object)xma)) || (n & 0x30) == 0x20) {
            n2 = (true ? 1 : 0);
        }
        final Object r2 = gva.R();
        Object o3;
        if ((((f | h | h2 | b) ? 1 : 0) | n2) || (o3 = r2) == a) {
            o3 = new fd0((Object)bnf, (Object)configuration, (Object)oc7, (Object)xma, (byte)12);
            gva.q0(o3);
        }
        return eqi.h0(igf, (lta)o3);
    }
    
    public static final void V(final ScheduledExecutorService scheduledExecutorService, final String s, final long n, final rjc rjc, final Runnable runnable) {
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        try {
            scheduledExecutorService.schedule(runnable, n, milliseconds);
        }
        catch (final RejectedExecutionException ex) {
            c5q.F(rjc, 5, lq6.Y(qjc.w, qjc.x), (jta)new zo1(s, (byte)6), (Throwable)ex, 48);
        }
    }
    
    public static ReadAloudEvents$ReadAloudOutcome W(final a9n a9n) {
        final f p = a9n.p();
        if (p != null) {
            final Integer u = p.u();
            boolean b = false;
            Label_0060: {
                Label_0058: {
                    if (u != null) {
                        if (u == 4029) {
                            break Label_0058;
                        }
                    }
                    if (!mlc.q(p.x(), au4.z.a())) {
                        b = false;
                        break Label_0060;
                    }
                }
                b = true;
            }
            final Integer u2 = p.u();
            if (u2 != null) {
                if (u2 == 4422) {
                    return ReadAloudEvents$ReadAloudOutcome.H;
                }
            }
            if (b) {
                return ReadAloudEvents$ReadAloudOutcome.E;
            }
        }
        return null;
    }
    
    public static final void Z(final SharedPreferences sharedPreferences, final List list) {
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        edit.getClass();
        if (list.isEmpty()) {
            edit.remove("rate_limits");
        }
        else {
            final iqc d = jqc.d;
            d.getClass();
            edit.putString("rate_limits", ((jqc)d).c((Object)list, (KSerializer)new uv0(PersistedRateLimit.Companion.serializer(), (byte)0)));
        }
        edit.apply();
    }
    
    public static final void a(final efo efo, final lta lta, final igf igf, final id9 id9, final ev9 ev9, final zta zta, final bua bua, final gva gva, final int n) {
        gva.i0(-1310802509);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)efo)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)lta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.f((Object)igf)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.f((Object)id9)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n & 0x6000) == 0x0) {
            int n11;
            if (gva.f((Object)ev9)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((0x30000 & n) == 0x0) {
            int n13;
            if (gva.h((Object)zta)) {
                n13 = 131072;
            }
            else {
                n13 = 65536;
            }
            n12 = (n10 | n13);
        }
        int n15;
        final int n14 = n15 = (n12 | 0x180000);
        if ((0xC00000 & n) == 0x0) {
            int n16;
            if (gva.h((Object)null)) {
                n16 = 8388608;
            }
            else {
                n16 = 4194304;
            }
            n15 = (n14 | n16);
        }
        int n17 = n15;
        if ((0x6000000 & n) == 0x0) {
            int n18;
            if (gva.h((Object)bua)) {
                n18 = 67108864;
            }
            else {
                n18 = 33554432;
            }
            n17 = (n15 | n18);
        }
        if (gva.W(n17 & 0x1, (n17 & 0x2492493) != 0x2492492)) {
            final ksg e = efo.e;
            final ksg d = efo.d;
            final r1 a = efo.a;
            final Object value = e.getValue();
            final Object r = gva.R();
            final cib a2 = bi6.a;
            Object q;
            if ((q = r) == a2) {
                q = o50.Q(Boolean.FALSE);
                gva.q0(q);
            }
            final bnf bnf = (bnf)q;
            Object r2;
            if ((r2 = gva.R()) == a2) {
                r2 = new ve(bnf, (byte)2);
                gva.q0(r2);
            }
            final jta jta = (jta)r2;
            final int n19 = n17 & 0xE;
            final int n20 = n19 | 0x30;
            pc9.a(efo, jta, gva, n20);
            if (value != null && (boolean)lta.b(value)) {
                bnf.setValue((Object)Boolean.TRUE);
            }
            if (!(boolean)lta.b(d.getValue()) && !(boolean)lta.b(a.i()) && (value == null || !(boolean)lta.b(value)) && (!(boolean)((xom)bnf).getValue() || mlc.q(a.i(), d.getValue())) && !efo.h() && !efo.d()) {
                gva.g0(-270514673);
                gva.q(false);
            }
            else {
                gva.g0(-273709037);
                final int n21 = n20 & 0xE;
                final boolean b = ((n21 ^ 0x6) > 4 && gva.f((Object)efo)) || (n20 & 0x6) == 0x4;
                final Object r3 = gva.R();
                Object o;
                if (b || (o = r3) == a2) {
                    o = a.i();
                    gva.q0(o);
                }
                if (efo.h()) {
                    o = a.i();
                }
                gva.g0(2016262395);
                final ec9 c0 = c0(efo, lta, o, gva);
                gva.q(false);
                final Object value2 = d.getValue();
                gva.g0(2016262395);
                final ec9 c2 = c0(efo, lta, value2, gva);
                gva.q(false);
                final efo s = xp7.s(efo, c0, c2, "EnterExitTransition", gva, n21 | 0xC00);
                if (!efo.h()) {
                    gva.g0(782386797);
                    final Object value3 = efo.e.getValue();
                    Object c3;
                    if (value3 == null) {
                        gva.g0(782437481);
                        gva.q(false);
                        c3 = null;
                    }
                    else {
                        gva.g0(782437482);
                        gva.g0(2016262395);
                        c3 = c0(efo, lta, value3, gva);
                        gva.q(false);
                        gva.q(false);
                    }
                    s.r(c3);
                    gva.q(false);
                }
                else {
                    gva.g0(782538635);
                    gva.q(false);
                }
                final id9 u = pc9.u(s, id9, gva, n17 >> 6 & 0x70);
                final ksg d2 = s.d;
                final r1 a3 = s.a;
                final ev9 v = pc9.v(s, ev9, gva, n17 >> 9 & 0x70);
                final bnf w = o50.W(zta, gva);
                final Object d3 = zta.d(a3.i(), d2.getValue());
                final boolean f = gva.f((Object)s);
                final boolean f2 = gva.f((Object)w);
                Object r4 = gva.R();
                if ((f | f2) || r4 == a2) {
                    r4 = new o10(s, w, null, (byte)1);
                    gva.q0(r4);
                }
                final bnf g = ncq.G((zta)r4, gva, d3);
                final Object i = a3.i();
                final ec9 x = ec9.x;
                if (i != x || d2.getValue() != x || !(boolean)((xom)g).getValue()) {
                    gva.g0(-272022668);
                    final boolean b2 = n19 == 4;
                    final Object r5 = gva.R();
                    bf0 bf0;
                    if (b2 || (bf0 = (bf0)r5) == a2) {
                        bf0 = new bf0(s);
                        gva.q0((Object)bf0);
                    }
                    final bf0 bf2 = bf0;
                    final igf b3 = pc9.b(s, u, v, null, bf2.c, "Built-in", gva, 1575936, 8);
                    gva.g0(-1255657861);
                    gva.q(false);
                    final igf e2 = igf.E(b3.E((igf)fgf.v));
                    Object r6;
                    if ((r6 = gva.R()) == a2) {
                        r6 = new me0(bf2);
                        gva.q0(r6);
                    }
                    final me0 me0 = (me0)r6;
                    final int hashCode = Long.hashCode(gva.T);
                    final e3h l = gva.l();
                    final igf b4 = ien.B(gva, e2);
                    vh6.e.getClass();
                    gva.k0();
                    if (gva.S) {
                        gva.k((jta)LayoutNode.n0);
                    }
                    else {
                        gva.t0();
                    }
                    k8e.P((zta)awp.A, gva, me0);
                    k8e.P((zta)awp.z, gva, l);
                    k8e.x(gva, hashCode);
                    k8e.C(gva);
                    k8e.P((zta)awp.y, gva, b4);
                    bua.h(bf2, gva, n17 >> 21 & 0x70);
                    gva.q(true);
                    gva.q(false);
                }
                else {
                    gva.g0(-270520625);
                    gva.q(false);
                }
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = new ud0(efo, lta, igf, id9, ev9, zta, bua, n);
        }
    }
    
    public static final n6k a0(final jta jta) {
        return new n6k((zta)new hw7(jta, (f07)null));
    }
    
    public static final void b(final x96 x96, final boolean b, igf igf, id9 id9, ev9 a, String s, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(1799879339);
        int n4;
        if ((n & 0x30) == 0x0) {
            int n3;
            if (gva.g(b)) {
                n3 = 32;
            }
            else {
                n3 = 16;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n4 | 0x180;
        final int n6 = n2 & 0x4;
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0xD80);
        }
        else {
            n7 = n5;
            if ((n & 0xC00) == 0x0) {
                int n8;
                if (gva.f((Object)id9)) {
                    n8 = 2048;
                }
                else {
                    n8 = 1024;
                }
                n7 = (n5 | n8);
            }
        }
        final int n9 = n2 & 0x8;
        int n10;
        if (n9 != 0) {
            n10 = (n7 | 0x6000);
        }
        else {
            n10 = n7;
            if ((n & 0x6000) == 0x0) {
                int n11;
                if (gva.f((Object)a)) {
                    n11 = 16384;
                }
                else {
                    n11 = 8192;
                }
                n10 = (n7 | n11);
            }
        }
        int n13;
        final int n12 = n13 = (n10 | 0x30000);
        if ((0x180000 & n) == 0x0) {
            int n14;
            if (gva.h((Object)ye6)) {
                n14 = 1048576;
            }
            else {
                n14 = 524288;
            }
            n13 = (n12 | n14);
        }
        if (gva.W(n13 & 0x1, (0x92491 & n13) != 0x92490)) {
            id9 a2 = id9;
            if (n6 != 0) {
                a2 = pc9.g(null, 3).a(pc9.f(null, null, 15));
            }
            if (n9 != 0) {
                a = pc9.h(null, 3).a(pc9.n(null, null, 15));
            }
            final efo z = xp7.Z(b, "AnimatedVisibility", gva, (n13 >> 3 & 0xE) | (n13 >> 12 & 0x70), 0);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = n10.C;
                gva.q0(o);
            }
            final lta lta = (lta)o;
            final Object v = fgf.v;
            i(z, lta, (igf)v, a2, a, (bua)ye6, gva, (n13 & 0x380000) | ((n13 & 0x380) | 0x30 | (n13 & 0x1C00) | (0xE000 & n13)), 32);
            s = "AnimatedVisibility";
            id9 = a2;
            igf = (igf)v;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = new xe0(x96, b, igf, id9, a, s, ye6, n, n2, (byte)1);
        }
    }
    
    public static final Future b0(final ExecutorService executorService, final String s, final rjc rjc, final Callable callable) {
        try {
            return executorService.submit(callable);
        }
        catch (final RejectedExecutionException ex) {
            c5q.F(rjc, 5, lq6.Y(qjc.w, qjc.x), (jta)new zo1(s, (byte)7), (Throwable)ex, 48);
            return null;
        }
    }
    
    public static final void c(final enf enf, igf v, final id9 id9, final ev9 ev9, String s, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-1238803325);
        int n2;
        if (gva.f((Object)enf)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | n2 | 0x30180;
        if (gva.W(n3 & 0x1, (0x92491 & n3) != 0x92490)) {
            final efo r = xp7.R(enf, "AnimatedVisibility", gva, (n3 >> 3 & 0xE) | 0x30, 0);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = q10.A;
                gva.q0(o);
            }
            final lta lta = (lta)o;
            v = (igf)fgf.v;
            i(r, lta, v, id9, ev9, (bua)ye6, gva, 1600944, 32);
            s = "AnimatedVisibility";
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ve0(enf, v, id9, ev9, s, ye6, n);
        }
    }
    
    public static final ec9 c0(final efo efo, final lta lta, final Object o, final gva gva) {
        gva.d0(-422486566, (Object)efo);
        final boolean h = efo.h();
        final r1 a = efo.a;
        final ec9 x = ec9.x;
        final ec9 w = ec9.w;
        final ec9 v = ec9.v;
        ec9 ec9;
        if (h) {
            gva.g0(-212166497);
            gva.q(false);
            if (lta.b(o)) {
                ec9 = w;
            }
            else if (lta.b(a.i())) {
                ec9 = x;
            }
            else {
                ec9 = v;
            }
        }
        else {
            gva.g0(-211886815);
            Object o2;
            if ((o2 = gva.R()) == bi6.a) {
                o2 = o50.Q(Boolean.FALSE);
                gva.q0(o2);
            }
            final bnf bnf = (bnf)o2;
            final Object value = efo.e.getValue();
            if ((boolean)lta.b(a.i()) || (value != null && (boolean)lta.b(value))) {
                bnf.setValue((Object)Boolean.TRUE);
            }
            if (lta.b(o)) {
                ec9 = w;
            }
            else if ((value == null || !(boolean)lta.b(value)) && (boolean)((xom)bnf).getValue()) {
                ec9 = x;
            }
            else {
                ec9 = v;
            }
            gva.q(false);
        }
        gva.q(false);
        return ec9;
    }
    
    public static final void d(final enf enf, igf v, final id9 id9, ev9 a, String s, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(657024243);
        int n3;
        if (gva.f((Object)enf)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        final int n4 = n3 | n;
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n4 | 0x30);
        }
        else {
            int n7;
            if (gva.f((Object)v)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0x180) == 0x0) {
            int n9;
            if (gva.f((Object)id9)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n6 | n9);
        }
        final int n10 = n2 & 0x8;
        int n11;
        if (n10 != 0) {
            n11 = (n8 | 0xC00);
        }
        else {
            n11 = n8;
            if ((n & 0xC00) == 0x0) {
                int n12;
                if (gva.f((Object)a)) {
                    n12 = 2048;
                }
                else {
                    n12 = 1024;
                }
                n11 = (n8 | n12);
            }
        }
        final int n13 = n11 | 0x6000;
        if (gva.W(n13 & 0x1, (0x12493 & n13) != 0x12492)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            if (n10 != 0) {
                a = pc9.h(null, 3).a(pc9.m(15));
            }
            final efo r = xp7.R(enf, "AnimatedVisibility", gva, (n13 & 0xE) | 0x30, 0);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = q10.B;
                gva.q0(o);
            }
            final lta lta = (lta)o;
            final int n14 = n13 << 3;
            i(r, lta, v, id9, a, (bua)ye6, gva, (n14 & 0xE000) | ((n14 & 0x380) | 0x30 | (n14 & 0x1C00)) | 0x180000, 32);
            s = "AnimatedVisibility";
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new td0(enf, v, id9, a, s, ye6, n, n2);
        }
    }
    
    public static final void e(final kzj kzj, final enf enf, igf v, final id9 id9, final ev9 ev9, String s, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(1763490971);
        int n4;
        if ((n & 0x30) == 0x0) {
            boolean b;
            if ((n & 0x40) == 0x0) {
                b = gva.f((Object)enf);
            }
            else {
                b = gva.h((Object)enf);
            }
            int n3;
            if (b) {
                n3 = 32;
            }
            else {
                n3 = 16;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n4 | 0x180);
        }
        else {
            n6 = n4;
            if ((n & 0x180) == 0x0) {
                int n7;
                if (gva.f((Object)v)) {
                    n7 = 256;
                }
                else {
                    n7 = 128;
                }
                n6 = (n4 | n7);
            }
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.f((Object)id9)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n & 0x6000) == 0x0) {
            int n11;
            if (gva.f((Object)ev9)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        int n13;
        final int n12 = n13 = (n10 | 0x30000);
        if ((0x180000 & n) == 0x0) {
            int n14;
            if (gva.h((Object)ye6)) {
                n14 = 1048576;
            }
            else {
                n14 = 524288;
            }
            n13 = (n12 | n14);
        }
        igf igf;
        String s2;
        if (gva.W(n13 & 0x1, (0x92491 & n13) != 0x92490)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            final efo r = xp7.R(enf, "AnimatedVisibility", gva, (n13 >> 3 & 0xE) | (n13 >> 12 & 0x70), 0);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = q10.C;
                gva.q0(o);
            }
            i(r, (lta)o, v, id9, ev9, (bua)ye6, gva, (n13 & 0x380000) | ((n13 & 0x380) | 0x30 | (n13 & 0x1C00) | (0xE000 & n13)), 32);
            s = "AnimatedVisibility";
            igf = v;
            s2 = s;
        }
        else {
            gva.Z();
            igf = v;
            s2 = s;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ue0(kzj, enf, igf, id9, ev9, s2, ye6, n, n2);
        }
    }
    
    public static final void f(final kzj kzj, final boolean b, igf v, id9 a, ev9 a2, String s, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(234057107);
        int n4;
        if ((n & 0x30) == 0x0) {
            int n3;
            if (gva.g(b)) {
                n3 = 32;
            }
            else {
                n3 = 16;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0119: {
            int n6;
            if (n5 != 0) {
                n6 = (n4 | 0x180);
            }
            else {
                n6 = n4;
                if ((n & 0x180) == 0x0) {
                    int n7;
                    if (gva.f((Object)v)) {
                        n7 = 256;
                    }
                    else {
                        n7 = 128;
                    }
                    n8 = (n4 | n7);
                    break Label_0119;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0187: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0xC00);
            }
            else {
                n10 = n8;
                if ((n & 0xC00) == 0x0) {
                    int n11;
                    if (gva.f((Object)a)) {
                        n11 = 2048;
                    }
                    else {
                        n11 = 1024;
                    }
                    n12 = (n8 | n11);
                    break Label_0187;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0257: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0x6000);
            }
            else {
                n14 = n12;
                if ((n & 0x6000) == 0x0) {
                    int n15;
                    if (gva.f((Object)a2)) {
                        n15 = 16384;
                    }
                    else {
                        n15 = 8192;
                    }
                    n16 = (n12 | n15);
                    break Label_0257;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0327: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x30000);
            }
            else {
                n18 = n16;
                if ((0x30000 & n) == 0x0) {
                    int n19;
                    if (gva.f((Object)s)) {
                        n19 = 131072;
                    }
                    else {
                        n19 = 65536;
                    }
                    n20 = (n16 | n19);
                    break Label_0327;
                }
            }
            n20 = n18;
        }
        if ((0x180000 & n) == 0x0) {
            int n21;
            if (gva.h((Object)ye6)) {
                n21 = 1048576;
            }
            else {
                n21 = 524288;
            }
            n20 |= n21;
        }
        if (gva.W(n20 & 0x1, (0x92491 & n20) != 0x92490)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            if (n9 != 0) {
                a = pc9.g(null, 3).a(pc9.c(null, null, 15));
            }
            if (n13 != 0) {
                a2 = pc9.h(null, 3).a(pc9.k(null, null, 15));
            }
            if (n17 != 0) {
                s = "AnimatedVisibility";
            }
            final efo z = xp7.Z(b, s, gva, (n20 >> 3 & 0xE) | (n20 >> 12 & 0x70), 0);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = n10.B;
                gva.q0(o);
            }
            i(z, (lta)o, v, a, a2, (bua)ye6, gva, (n20 & 0x380) | 0x30 | (n20 & 0x1C00) | (0xE000 & n20) | (n20 & 0x380000), 32);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = new xe0(kzj, b, v, a, a2, s, ye6, n, n2, (byte)0);
        }
    }
    
    public static final void g(final efo efo, final lta lta, igf v, final id9 id9, final ev9 ev9, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(-1699747442);
        int n3;
        if (gva.f((Object)efo)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n5;
        final int n4 = n5 = (n3 | n);
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.h((Object)lta)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        final int n7 = n2 & 0x2;
        int n8;
        if (n7 != 0) {
            n8 = (n5 | 0x180);
        }
        else {
            int n9;
            if (gva.f((Object)v)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n5 | n9);
        }
        int n10 = n8;
        if ((n & 0xC00) == 0x0) {
            int n11;
            if (gva.f((Object)id9)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((n & 0x6000) == 0x0) {
            int n13;
            if (gva.f((Object)ev9)) {
                n13 = 16384;
            }
            else {
                n13 = 8192;
            }
            n12 = (n10 | n13);
        }
        if (gva.W(n12 & 0x1, (0x12493 & n12) != 0x12492)) {
            if (n7 != 0) {
                v = (igf)fgf.v;
            }
            i(efo, lta, v, id9, ev9, (bua)ye6, gva, (n12 & 0xE) | 0x30000 | (n12 & 0x70) | (n12 & 0x380) | (n12 & 0x1C00) | (n12 & 0xE000) | 0x180000, 0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new td0(efo, lta, v, id9, ev9, (bua)ye6, n, n2, (byte)1);
        }
    }
    
    public static final void h(final boolean b, igf v, id9 a, ev9 a2, String s, final bua bua, final gva gva, final int n, final int n2) {
        gva.i0(-1448730565);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.g(b)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0113: {
            int n6;
            if (n5 != 0) {
                n6 = (n4 | 0x30);
            }
            else {
                n6 = n4;
                if ((n & 0x30) == 0x0) {
                    int n7;
                    if (gva.f((Object)v)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n4 | n7);
                    break Label_0113;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0181: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x180) == 0x0) {
                    int n11;
                    if (gva.f((Object)a)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0181;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0250: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0xC00) == 0x0) {
                    int n15;
                    if (gva.f((Object)a2)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0250;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0320: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n & 0x6000) == 0x0) {
                    int n19;
                    if (gva.f((Object)s)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0320;
                }
            }
            n20 = n18;
        }
        if ((0x30000 & n) == 0x0) {
            int n21;
            if (gva.h((Object)bua)) {
                n21 = 131072;
            }
            else {
                n21 = 65536;
            }
            n20 |= n21;
        }
        if (gva.W(n20 & 0x1, (0x12493 & n20) != 0x12492)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            if (n9 != 0) {
                a = pc9.g(null, 3).a(pc9.e(15));
            }
            if (n13 != 0) {
                a2 = pc9.m(15).a(pc9.h(null, 3));
            }
            if (n17 != 0) {
                s = "AnimatedVisibility";
            }
            final efo z = xp7.Z(b, s, gva, (n20 & 0xE) | (n20 >> 9 & 0x70), 0);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = n10.A;
                gva.q0(o);
            }
            final lta lta = (lta)o;
            final int n22 = n20 << 3;
            i(z, lta, v, a, a2, bua, gva, (n22 & 0x380) | 0x30 | (n22 & 0x1C00) | (0xE000 & n22) | (n22 & 0x380000), 32);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = new we0(b, v, a, a2, s, bua, n, n2);
        }
    }
    
    public static final void i(final efo efo, final lta lta, final igf igf, final id9 id9, final ev9 ev9, final bua bua, final gva gva, final int n, final int n2) {
        gva.i0(-497872534);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)efo)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        int n5 = n4;
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.h((Object)lta)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n & 0x180) == 0x0) {
            int n8;
            if (gva.f((Object)igf)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.f((Object)id9)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n7 |= n9;
        }
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.f((Object)ev9)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n7 |= n10;
        }
        int n11;
        if ((n2 & 0x20) != 0x0) {
            n11 = (n7 | 0x30000);
        }
        else {
            n11 = n7;
            if ((n & 0x30000) == 0x0) {
                int n12;
                if (gva.h((Object)null)) {
                    n12 = 131072;
                }
                else {
                    n12 = 65536;
                }
                n11 = (n7 | n12);
            }
        }
        if ((0x180000 & n) == 0x0) {
            int n13;
            if (gva.h((Object)bua)) {
                n13 = 1048576;
            }
            else {
                n13 = 524288;
            }
            n11 |= n13;
        }
        boolean b = false;
        if (gva.W(n11 & 0x1, (0x92493 & n11) != 0x92492)) {
            final int n14 = n11 & 0x70;
            final boolean b2 = n14 == 32;
            final int n15 = n11 & 0xE;
            if (n15 == 4) {
                b = true;
            }
            final Object r = gva.R();
            final cib a = bi6.a;
            ze0 ze0;
            if ((b2 | b) || (ze0 = (ze0)r) == a) {
                ze0 = new ze0(lta, efo);
                gva.q0((Object)ze0);
            }
            final igf w = lq6.W(igf, ze0);
            Object o;
            if ((o = gva.R()) == a) {
                o = ae0.y;
                gva.q0(o);
            }
            final zta zta = (zta)o;
            final int n16 = n11 << 6;
            a(efo, lta, w, id9, ev9, zta, bua, gva, (n16 & 0xE000000) | (0x30000 | n15 | n14 | (n11 & 0x1C00) | (0xE000 & n11) | (0x1C00000 & n16)));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new td0(efo, lta, igf, id9, ev9, bua, n, n2, (byte)3);
        }
    }
    
    public static final void j(final igf igf, final lta lta, final gva gva, final int n) {
        gva.i0(-932836462);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)igf)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4;
        if (gva.h((Object)lta)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        final int n5 = n3 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x13) != 0x12)) {
            x90.l(gva, t08.E(igf, lta));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new b23(n, lta, igf);
        }
    }
    
    public static final void k(final x6m x6m, igf v, final gva gva, final int n, final int n2) {
        gva.i0(1670685431);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)x6m)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x30) == 0x0) {
                int n7;
                if (gva.f((Object)v)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        if (gva.W(n6 & 0x1, (n6 & 0x13) != 0x12)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            zrn.x(x6m, v, twl.x, gva, (n6 & 0x70) | ((n6 & 0xE) | 0x180));
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ny4(x6m, v, n, n2);
        }
    }
    
    public static final void l(igf v, float n, final gva gva, final int n2, final int n3) {
        gva.i0(-686949628);
        final int n4 = n3 & 0x1;
        int n5;
        if (n4 != 0) {
            n5 = (n2 | 0x6);
        }
        else {
            int n6;
            if (gva.f((Object)v)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n2);
        }
        int n7 = n5;
        if ((n2 & 0x30) == 0x0) {
            int n8;
            if ((n3 & 0x2) == 0x0 && gva.c(n)) {
                n8 = 32;
            }
            else {
                n8 = 16;
            }
            n7 = (n5 | n8);
        }
        if (gva.W(n7 & 0x1, (n7 & 0x13) != 0x12)) {
            gva.b0();
            igf igf;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                igf = v;
            }
            else {
                if (n4 != 0) {
                    v = (igf)fgf.v;
                }
                igf = v;
                if ((n3 & 0x2) != 0x0) {
                    n = 28.0f;
                    igf = v;
                }
            }
            gva.r();
            k8e.f(eqi.i0(2131231279, gva), soh.S(2131756464, gva), androidx.compose.foundation.layout.b.h(igf, 0.0f, n, 1), null, null, 0.0f, null, gva, 8, 120);
            v = igf;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new yrd(v, n, n2, n3);
        }
    }
    
    public static final void m(final boolean b, final jta jta, jta jta2, final boolean b2, final igf igf, zta a, final gva gva, final int n, final int n2) {
        gva.i0(-2079217913);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.g(b)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        int n5 = n4;
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.h((Object)jta)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0156: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x180);
            }
            else {
                n8 = n5;
                if ((n & 0x180) == 0x0) {
                    int n9;
                    if (gva.h((Object)jta2)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n5 | n9);
                    break Label_0156;
                }
            }
            n10 = n8;
        }
        int n11 = n10;
        if ((n & 0xC00) == 0x0) {
            int n12;
            if (gva.g(b2)) {
                n12 = 2048;
            }
            else {
                n12 = 1024;
            }
            n11 = (n10 | n12);
        }
        int n14;
        if ((n & 0x6000) == 0x0) {
            int n13;
            if (gva.f((Object)igf)) {
                n13 = 16384;
            }
            else {
                n13 = 8192;
            }
            n14 = (n11 | n13);
        }
        else {
            n14 = n11;
        }
        final int n15 = n2 & 0x20;
        int n16;
        if (n15 != 0) {
            n16 = (n14 | 0x30000);
        }
        else {
            n16 = n14;
            if ((0x30000 & n) == 0x0) {
                int n17;
                if (gva.h((Object)a)) {
                    n17 = 131072;
                }
                else {
                    n17 = 65536;
                }
                n16 = (n14 | n17);
            }
        }
        if (gva.W(n16 & 0x1, (0x12493 & n16) != 0x12492)) {
            if (n7 != 0) {
                jta2 = null;
            }
            if (n15 != 0) {
                a = (zta)g6r.a;
            }
            final float b3 = yao.b;
            final xao q = xp7.q(48, 1, 0L, gva);
            final ye6 t0 = uuj.t0(-988238393, (aua)new uf0(jta, b), gva);
            final ye6 t2 = uuj.t0(1428017712, (aua)new zrd(jta2, b2), gva);
            final int n18 = n16 >> 12;
            zrn.s(igf, a, (zta)t0, (bua)t2, 26.0f + b3, (d1q)null, q, false, gva, (n18 & 0xE) | 0xD80 | (n18 & 0x70), 416);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new asd(b, jta, jta2, b2, igf, a, n, n2);
        }
    }
    
    public static final noh n(final String s, final foh foh) {
        if (!kym.Y0((CharSequence)s)) {
            final Iterator iterator = ((q1e)roh.a.values()).iterator();
            while (((m1e)iterator).hasNext()) {
                final KSerializer kSerializer = (KSerializer)((m1e)iterator).next();
                if (!s.equals(kSerializer.getDescriptor().a())) {
                    continue;
                }
                final StringBuilder u = ge9.u("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", s, " there already exists ");
                u.append(v4j.a((Class)kSerializer.getClass()).c());
                u.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                en9.s(lym.p0(u.toString()));
                return null;
            }
            return new noh(s, foh);
        }
        en9.s("Blank serial names are prohibited");
        return null;
    }
    
    public static final ezk o(final String s, final SerialDescriptor[] array, final lta lta) {
        if (!kym.Y0((CharSequence)s)) {
            final vs4 vs4 = new vs4(s);
            lta.b(vs4);
            return new ezk(s, (o50)xym.k, vs4.c.size(), iw0.m1((Object[])array), vs4);
        }
        en9.s("Blank serial names are prohibited");
        return null;
    }
    
    public static final ezk p(final String s, final o50 o50, final SerialDescriptor[] array, final lta lta) {
        if (kym.Y0((CharSequence)s)) {
            en9.s("Blank serial names are prohibited");
            return null;
        }
        if (!o50.equals(xym.k)) {
            final vs4 vs4 = new vs4(s);
            lta.b(vs4);
            return new ezk(s, o50, vs4.c.size(), iw0.m1((Object[])array), vs4);
        }
        en9.s("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        return null;
    }
    
    public static ezk q(final String s, final o50 o50, final SerialDescriptor[] array) {
        if (kym.Y0((CharSequence)s)) {
            en9.s("Blank serial names are prohibited");
            return null;
        }
        if (!o50.equals(xym.k)) {
            final vs4 vs4 = new vs4(s);
            return new ezk(s, o50, vs4.c.size(), iw0.m1((Object[])array), vs4);
        }
        en9.s("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        return null;
    }
    
    public static final ilf r(final c4d c4d, final m4d m4d, final v2b v2b) {
        final p2 c = r6k.w(m4d.v).c;
        final inf inf = (inf)v2b.w;
        final int x = inf.x;
        final int n = 1;
        if (x == 0 && ((j0)c).isEmpty()) {
            return qgc.a;
        }
        final ilf ilf = new ilf();
        int a;
        int min;
        if (((inf)v2b.w).x != 0) {
            final int x2 = inf.x;
            if (x2 == 0) {
                oyl.i("MutableVector is empty.");
                return null;
            }
            final Object[] v = inf.v;
            a = ((m3d)v[0]).a;
            int n2;
            for (int i = 0; i < x2; ++i, a = n2) {
                final int a2 = ((m3d)v[i]).a;
                if (a2 < (n2 = a)) {
                    n2 = a2;
                }
            }
            if (a < 0) {
                jac.a("negative minIndex");
            }
            final int x3 = inf.x;
            if (x3 == 0) {
                oyl.i("MutableVector is empty.");
                return null;
            }
            final Object[] v2 = inf.v;
            int b = ((m3d)v2[0]).b;
            int n3;
            for (int j = 0; j < x3; ++j, b = n3) {
                final int b2 = ((m3d)v2[j]).b;
                if (b2 > (n3 = b)) {
                    n3 = b2;
                }
            }
            min = Math.min(b, c4d.a() - 1);
        }
        else {
            min = 0;
            a = n;
        }
        for (int a3 = ((j0)c).a(), k = 0; k < a3; ++k) {
            final k4d k4d = (k4d)((List)c).get(k);
            final int d = ri2.D(k4d.c, c4d, k4d.a);
            if (a > d || d > min) {
                if (d >= 0 && d < c4d.a()) {
                    ilf.a(d);
                }
            }
        }
        if (a <= min) {
            while (true) {
                ilf.a(a);
                if (a == min) {
                    break;
                }
                ++a;
            }
        }
        final int b3 = ilf.b;
        if (b3 == 0) {
            return ilf;
        }
        Arrays.sort(ilf.a, 0, b3);
        return ilf;
    }
    
    public static neo s(final hhn hhn, final na6 na6, final jrk jrk) {
        final dhc dhc = new dhc((byte)2);
        final ghn ghn = new ghn(hhn, (jmq)null, (hhn)null, dhc, 6);
        final jta a = na6.a;
        final hcm b = na6.b;
        final Set set = (Set)a.a();
        final boolean empty = set.isEmpty();
        final neo neo = null;
        Object v;
        if (empty) {
            v = r89.v;
        }
        else {
            final ArrayList list = new ArrayList();
            int w = 0;
            while (true) {
                final oug x = ghn.x;
                if (w >= x.length()) {
                    break;
                }
                Object n0;
                if (x.charAt(w) == '/') {
                    n0 = eqi.n0((CharSequence)x, w + 1, set);
                }
                else {
                    n0 = null;
                }
                if (n0 != null) {
                    w = ((vgc)n0).w;
                    int n2;
                    if (x.charAt(w) == ' ') {
                        n2 = w - 1;
                    }
                    else {
                        n2 = w;
                    }
                    list.add((Object)new vgc(((vgc)n0).v, n2, 1));
                }
                ++w;
            }
            v = list;
        }
        final Iterator iterator = ((List)v).iterator();
        dnn dnn = (dnn)neo;
        while (iterator.hasNext()) {
            final xgc xgc = (xgc)iterator.next();
            final long c = rhc.c(((vgc)xgc).v, ((vgc)xgc).w + 1);
            ghn.e(c);
            if (dnn.h(c)) {
                final String i = dnn.i(c);
                final StringBuilder sb = new StringBuilder("Expected ");
                sb.append(i);
                sb.append(" to not be reversed.");
                jac.a(sb.toString());
            }
            final int n3 = (int)(c >> 32);
            final int n4 = (int)(c & 0xFFFFFFFFL);
            ghn.a().E(n3, n4, n4 - n3, false);
            nnn y;
            if ((y = ghn.y) == null) {
                y = new nnn((nnn)dnn, 3);
                ghn.y = y;
            }
            final long d = gar.d(n3, n4, false, true);
            if (!y.a) {
                jac.c("This TextStyleBuffer is immutable");
            }
            final int h = gar.h(d);
            final boolean g = nkq.g(d);
            final int d2 = y.d;
            int n5 = 0;
            Label_0459: {
                if (h < d2) {
                    n5 = h;
                }
                else {
                    int n6;
                    if (h == d2) {
                        n5 = h;
                        if (g) {
                            break Label_0459;
                        }
                        n6 = y.c();
                    }
                    else {
                        n6 = y.c();
                    }
                    n5 = h + n6;
                }
            }
            final int g2 = gar.g(d);
            final boolean f = nkq.f(d);
            final int d3 = y.d;
            int n7 = 0;
            Label_0537: {
                if (g2 < d3) {
                    n7 = g2;
                }
                else {
                    int n8;
                    if (g2 == d3) {
                        n7 = g2;
                        if (!f) {
                            break Label_0537;
                        }
                        n8 = y.c();
                    }
                    else {
                        n8 = y.c();
                    }
                    n7 = g2 + n8;
                }
            }
            y.c.h(gar.d(n5, n7, nkq.g(d), nkq.f(d)), (Object)b);
        }
        if (((inf)ghn.a().w).x == 0) {
            return (neo)dnn;
        }
        final long n9 = N(hhn.y, dhc, jrk);
        final dnn z = hhn.z;
        if (z != null) {
            dnn = new dnn(N(z.a, dhc, jrk));
        }
        return new neo(ghn.i(ghn, n9, dnn, (List)null, 4), dhc);
    }
    
    public static final igf t(final gva gva, final igf igf) {
        final mma mma = (mma)gva.j((sei)hm6.i);
        final WeakHashMap x = l2q.x;
        final Boolean b = (Boolean)o50.w(gva).c.d.getValue();
        final boolean booleanValue = b;
        final boolean b2 = ((n6d)gva.j((sei)hm6.v)).b();
        final Object r = gva.R();
        final cib a = bi6.a;
        Object q = r;
        if (r == a) {
            q = o50.Q(Boolean.FALSE);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        Object o;
        if ((o = gva.R()) == a) {
            o = o50.Q(o9m.v);
            gva.q0(o);
        }
        final bnf bnf2 = (bnf)o;
        final Boolean b3 = (Boolean)((xom)bnf).getValue();
        b3.booleanValue();
        final boolean g = gva.g(booleanValue);
        final boolean g2 = gva.g(b2);
        final boolean h = gva.h((Object)mma);
        final Object r2 = gva.R();
        Object o2;
        if ((g | g2 | h) || (o2 = r2) == a) {
            o2 = new ix4(booleanValue, b2, mma, bnf2, bnf, (f07)null);
            gva.q0(o2);
        }
        mlc.h(b3, b, b2, (zta)o2, gva);
        Object r3;
        if ((r3 = gva.R()) == a) {
            r3 = new xln(bnf, (byte)0);
            gva.q0(r3);
        }
        return eqi.h0(igf, (lta)r3);
    }
    
    public static final igf u(final int n, final jta jta, final gva gva, final igf igf) {
        final mma mma = (mma)gva.j((sei)hm6.i);
        final View view = (View)gva.j((sei)q50.f);
        final WeakHashMap x = l2q.x;
        final Boolean b = (Boolean)o50.w(gva).c.d.getValue();
        b.getClass();
        final bnf w = o50.W(b, gva);
        final bnf w2 = o50.W(jta, gva);
        final boolean f = gva.f((Object)w);
        final boolean h = gva.h((Object)view);
        final boolean f2 = gva.f((Object)w2);
        final boolean h2 = gva.h((Object)mma);
        final Object r = gva.R();
        Object o;
        if ((f | h | f2 | h2) || (o = r) == bi6.a) {
            o = new zln(view, mma, w, w2);
            gva.q0(o);
        }
        return p6n.b(igf, (Object)mma, (PointerInputEventHandler)o);
    }
    
    public static final bnf v(final ija ija, final Object o, final gva gva, final int n, final int n2) {
        final o89 v = o89.v;
        final boolean h = gva.h((Object)v);
        final boolean h2 = gva.h((Object)ija);
        final Object r = gva.R();
        Object o2;
        if ((h | h2) || (o2 = r) == bi6.a) {
            o2 = new av7((Object)v, (Object)ija, (f07)null, (byte)7);
            gva.q0(o2);
        }
        return ncq.I(o, ija, v, (zta)o2, gva, (n >> 3 & 0xE) | (n & 0x380));
    }
    
    public static final bnf w(final yom yom, final gva gva) {
        return v((ija)yom, yom.getValue(), gva, 0, 0);
    }
    
    public static fs1 x(final gt7 gt7) {
        final fs1 fs1 = new fs1();
        final String s = (String)gt7.n().get((Object)"session_id");
        final HashMap a = fs1.a;
        if (s != null) {
            a.put((Object)"session.id", (Object)s);
        }
        final String s2 = (String)gt7.n().get((Object)"user_id");
        if (s2 != null) {
            a.put((Object)"user.id", (Object)s2);
        }
        final String s3 = (String)gt7.n().get((Object)"account_id");
        if (s3 != null) {
            a.put((Object)"account.id", (Object)s3);
        }
        return fs1;
    }
    
    public static final boolean y(final st8 st8, final long n) {
        if (((hgf)st8).v.I) {
            final lcc lcc = (lcc)soh.L((t98)st8).Z.y;
            if (((hgf)lcc.z0).I) {
                final long n2 = ((yxf)lcc).N(0L);
                final float intBitsToFloat = Float.intBitsToFloat((int)(n2 >> 32));
                final float intBitsToFloat2 = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL));
                final long m = st8.M;
                final float n3 = (float)(int)(m >> 32);
                final float n4 = (float)(int)(m & 0xFFFFFFFFL);
                final float intBitsToFloat3 = Float.intBitsToFloat((int)(n >> 32));
                if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= n3 + intBitsToFloat) {
                    final float intBitsToFloat4 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
                    if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= n4 + intBitsToFloat2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static f07 z(final f07 f07, final f07 f8, final zta zta) {
        if (zta instanceof wv1) {
            return ((wv1)zta).create(f07, f8);
        }
        final hc7 context = f8.getContext();
        if (context == o89.v) {
            return (f07)new nlc(f8, f07, zta);
        }
        return (f07)new olc(f8, context, zta, f07);
    }
    
    public long I() {
        return System.currentTimeMillis();
    }
    
    public abstract boolean L();
    
    public abstract void X(final boolean p0);
    
    public abstract void Y(final boolean p0);
}
