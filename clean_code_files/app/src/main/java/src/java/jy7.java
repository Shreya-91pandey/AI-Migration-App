import java.util.Map$Entry;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemTimeRange;
import java.util.Set;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResult;
import java.util.List;
import java.time.temporal.TemporalUnit;
import java.time.temporal.Temporal;
import java.time.temporal.ChronoUnit;
import java.time.OffsetDateTime;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItem;
import java.util.ArrayList;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryError;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType;
import java.util.Collection;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Input;
import java.util.concurrent.CancellationException;
import com.anthropic.claude.tool.model.EventUpdateV0Input;
import android.os.Bundle;
import android.util.Log;
import android.view.Window$Callback;
import android.view.Window;
import java.util.concurrent.CopyOnWriteArraySet;
import android.app.Activity;
import java.util.StringTokenizer;
import java.util.Iterator;
import android.os.Trace;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.EnumMap;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import android.os.Build$VERSION;
import java.util.WeakHashMap;

public class jy7 implements t45, a1k, cmm, be, rb2, mjc, rpj, uad
{
    public static final jy7 x;
    public static final nwa y;
    public final byte v;
    public Object w;
    
    public jy7(final byte v) {
        switch (this.v = v) {
            default: {
                Object y;
                try {
                    y = Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])null).invoke((Object)null, (Object[])null);
                }
                catch (final Exception ex) {
                    y = jy7.y;
                }
                final nwa b = nwa.b;
                final Object w = new Object();
                ((h1e)w).a = new r5f[] { (r5f)b, (r5f)y };
                final Charset a = djc.a;
                this.w = w;
                return;
            }
            case 29: {
                this.w = new WeakHashMap();
                return;
            }
            case 25: {
                Object w2;
                if (Build$VERSION.SDK_INT >= 28) {
                    w2 = new vzq((byte)22);
                }
                else {
                    w2 = new qm8((byte)10);
                }
                this.w = w2;
                return;
            }
            case 22: {
                final d1e w3 = new d1e();
                this.w = w3;
                if (!w3.w) {
                    if (w3.x) {
                        qih.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    w3.a();
                    w3.x = true;
                }
                return;
            }
            case 16: {
                this.w = new ConcurrentHashMap(16);
                return;
            }
            case 15: {
                this.w = new gb0();
                return;
            }
            case 3: {
                this.w = new y4(this);
            }
        }
    }
    
    public jy7(final int n) {
        this.v = 24;
        this.w = bpm.a((Object)new int[n]);
    }
    
    public jy7(final InputStream inputStream) {
        this.v = 21;
        this.w = new ti3(inputStream, ui3.a);
    }
    
    public jy7(final uad uad, final kbd kbd) {
        this.v = 23;
        final Object w = new Object();
        ((kbd)w).v = (Set)z89.v;
        Object w2 = sad.w;
        ((kbd)w).w = (sad)w2;
        this.w = w;
        final Object o = new Object();
        final sad c = uad.c();
        final sad v = sad.v;
        sad v2;
        if (c == v) {
            v2 = v;
        }
        else {
            v2 = (sad)w2;
        }
        ((b4j)o).v = v2;
        final Object o2 = new Object();
        if (kbd.w == v) {
            w2 = v;
        }
        ((b4j)o2).v = w2;
        this.v((sad)oc6.n0((Comparable)((b4j)o).v, (Comparable)w2));
        if (((b4j)o).v != v && ((b4j)o2).v != v) {
            final iq4 iq4 = new iq4((Object)new b1f((b4j)o, this, (b4j)o2, (byte)0), (byte)3);
            final iq4 iq5 = new iq4((Object)new b1f((b4j)o2, this, (b4j)o, (byte)1), (byte)3);
            uad.h((oad)iq4);
            kbd.h((oad)iq5);
            if (((kbd)w).w == v) {
                uad.e((oad)iq4);
                kbd.e((oad)iq5);
            }
            else {
                ((kbd)w).h((oad)new c1f(uad, iq4, kbd, iq5));
            }
        }
    }
    
    public jy7(final yob w, final EnumMap enumMap) {
        this.v = 12;
        this.w = w;
    }
    
    public jy7(final boolean b) {
        this.v = 5;
        this.w = new AtomicBoolean(b);
    }
    
    public static jy7 B(qha qha, final String s, final boolean b) {
        xzg.n("Cronet ResolvedFlags#resolve");
        try {
            x(s);
            final HashMap hashMap = new HashMap();
            final Iterator iterator = Collections.unmodifiableMap((Map)qha.e).entrySet().iterator();
            while (iterator.hasNext()) {
                qha = (qha)iterator.next();
                try {
                    Label_0107: {
                        for (final mha mha : ((nha)((Map$Entry)qha).getValue()).e) {
                            if (b) {
                                break Label_0107;
                            }
                            mha.getClass();
                        }
                        continue;
                    }
                    final mha mha;
                    mha.getClass();
                    continue;
                }
                catch (final RuntimeException ex) {
                    final String s2 = (String)((Map$Entry)qha).getKey();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to resolve HTTP flag `");
                    sb.append(s2);
                    sb.append("`");
                    throw new IllegalArgumentException(sb.toString(), (Throwable)ex);
                }
                break;
            }
            final jy7 jy7 = new jy7(hashMap, (byte)28);
            Trace.endSection();
            return jy7;
        }
        finally {
            try {
                Trace.endSection();
            }
            finally {
                final Throwable t;
                ((Throwable)s).addSuppressed(t);
            }
        }
    }
    
    public static void x(final String s) {
        try {
            if (s.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            final StringTokenizer stringTokenizer = new StringTokenizer(s, ".");
            final int countTokens = stringTokenizer.countTokens();
            final int[] array = new int[countTokens];
            for (int i = 0; i < countTokens; ++i) {
                array[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        catch (final RuntimeException ex) {
            throw new IllegalArgumentException(hia.k("Unable to parse HTTP flags version string: `", s, "`"), (Throwable)ex);
        }
    }
    
    public void A(final Activity activity, final p0k p0k) {
        final WeakHashMap weakHashMap = (WeakHashMap)this.w;
        final v1k v1k = (v1k)weakHashMap.get((Object)activity);
        if (v1k != null) {
            v1k.c(p0k);
            if (((CopyOnWriteArraySet)v1k.a().w).size() == 0) {
                final Window window = activity.getWindow();
                window.getClass();
                final Window$Callback callback = window.getCallback();
                if (callback instanceof v1k && weakHashMap.values().contains((Object)callback)) {
                    window.setCallback(((v1k)callback).b());
                }
                weakHashMap.remove((Object)activity);
            }
        }
    }
    
    public void C(final float n, final long n2) {
        final x13 t = ((zn0)this.w).t();
        final int n3 = (int)(n2 >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n3);
        final int n4 = (int)(n2 & 0xFFFFFFFFL);
        t.n(intBitsToFloat, Float.intBitsToFloat(n4));
        t.b(n);
        t.n(-Float.intBitsToFloat(n3), -Float.intBitsToFloat(n4));
    }
    
    public void D(final long n, final float n2, final float n3) {
        final x13 t = ((zn0)this.w).t();
        final int n4 = (int)(n >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n4);
        final int n5 = (int)(n & 0xFFFFFFFFL);
        t.n(intBitsToFloat, Float.intBitsToFloat(n5));
        t.a(n2, n3);
        t.n(-Float.intBitsToFloat(n4), -Float.intBitsToFloat(n5));
    }
    
    public void E() {
        final gt7 c = ((ft7)this.w).c;
        if (c.J <= 0) {
            c.I = true;
            c.J = 0;
        }
    }
    
    public void F(final String s, final String s2) {
        final gt7 c = ((ft7)this.w).c;
        if (s2 != null && !s2.isEmpty()) {
            c.X((Object)s2, s);
            return;
        }
        c.X((Object)null, s);
    }
    
    public void G(final float n, final float n2) {
        ((zn0)this.w).t().n(n, n2);
    }
    
    public int a(final char[] array, final int n, final int n2) {
        return ((ti3)this.w).a(array, n, n2);
    }
    
    public void b(final lta lta, final zta zta) {
        ((gb0)this.w).a((Object)new bmm(lta, zta));
    }
    
    public sad c() {
        return ((kbd)this.w).w;
    }
    
    public gnf d(final i1 i1) {
        return ((gb0)this.w).f((lta)i1);
    }
    
    public void e(final oad oad) {
        ((kbd)this.w).e(oad);
    }
    
    public void f(final Object o) {
        final ae ae = (ae)o;
        final vra vra = (vra)this.w;
        final rra rra = (rra)vra.F.pollFirst();
        if (rra == null) {
            final StringBuilder sb = new StringBuilder("No IntentSenders were started for ");
            sb.append((Object)this);
            Log.w("FragmentManager", sb.toString());
            return;
        }
        final String v = rra.v;
        final int w = rra.w;
        final hra x = vra.c.x(v);
        if (x == null) {
            final StringBuilder sb2 = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
            sb2.append(v);
            Log.w("FragmentManager", sb2.toString());
            return;
        }
        x.r(w, ae.v, ae.w);
    }
    
    public void g(final gc2 gc2) {
        ((x4b)this.w).b.n((Object)null, (Object)(gc2.a == 0));
    }
    
    public void h(final oad oad) {
        ((kbd)this.w).h(oad);
    }
    
    public void i(final String s, final boolean b) {
        final a1k[] array = (a1k[])this.w;
        for (int i = 0; i < 2; ++i) {
            array[i].i(s, b);
        }
    }
    
    public void j(final int n, final x4 x4, final String s, final Bundle bundle) {
    }
    
    public void k(final g90 g90) {
        ((zn0)this.w).t().l(g90);
    }
    
    public void l() {
        ((x4b)this.w).b.n((Object)null, (Object)Boolean.FALSE);
    }
    
    public void m(final float n, final float n2, final float n3, final float n4, final int n5) {
        ((zn0)this.w).t().m(n, n2, n3, n4, n5);
    }
    
    public iy7 n() {
        return new iy7(((ft7)this.w).c);
    }
    
    public x4 o(final int n) {
        return null;
    }
    
    public Object p(final EventUpdateV0Input eventUpdateV0Input, final h07 h07) {
        final gy2 gy2 = (gy2)this.w;
        fy2 fy3 = null;
        Label_0062: {
            if (h07 instanceof fy2) {
                final fy2 fy2 = (fy2)h07;
                final int y = fy2.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    fy2.y = y + Integer.MIN_VALUE;
                    fy3 = fy2;
                    break Label_0062;
                }
            }
            fy3 = new fy2(this, h07);
        }
        final Object w = fy3.w;
        final int y2 = fy3.y;
        final pc7 v = pc7.v;
        if (y2 == 0 || (y2 == 1 || y2 != 2)) {
            goto Label_0125;
        }
        try {
            vt4.g0(w);
            goto Label_0261;
        }
        catch (final CancellationException ex) {
            throw ex;
        }
        finally {
            goto Label_0272;
        }
    }
    
    public Object q(final HealthConnectQueryV0Input healthConnectQueryV0Input, final h07 h07) {
        HealthConnectQueryV0Input v = healthConnectQueryV0Input;
        final kfb kfb = (kfb)this.w;
        jfb jfb = null;
        Label_0059: {
            if (h07 instanceof jfb) {
                jfb = (jfb)h07;
                final int f = jfb.F;
                if ((f & Integer.MIN_VALUE) != 0x0) {
                    jfb.F = f + Integer.MIN_VALUE;
                    break Label_0059;
                }
            }
            jfb = new jfb(this, h07);
        }
        Object o = jfb.D;
        final int f2 = jfb.F;
        final String s = null;
        final pc7 v2 = pc7.v;
        while (true) {
            Collection collection = null;
            Label_0889: {
                int n = 0;
                boolean b;
                if (f2 != 0) {
                    if (f2 != 1) {
                        if (f2 == 2) {
                            n = jfb.C;
                            b = jfb.B;
                            collection = jfb.A;
                            final Iterator z = jfb.z;
                            final Object o2 = jfb.y;
                            final kfb x = jfb.x;
                            final m2h w = jfb.w;
                            vt4.g0(o);
                            final jfb jfb2 = jfb;
                            break Label_0889;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        n = jfb.C;
                        b = jfb.B;
                        v = jfb.v;
                        vt4.g0(o);
                    }
                }
                else {
                    vt4.g0(o);
                    final int k = kfb.h.k();
                    b = (k == 3);
                    String s2;
                    if (k != 1) {
                        if (k != 2) {
                            if (k != 3) {
                                s2 = "";
                            }
                            else {
                                s2 = "The Health Connect SDK APIs are available.";
                            }
                        }
                        else {
                            s2 = "The Health Connect SDK APIs are currently unavailable, the provider is either not installed or needs to be updated";
                        }
                    }
                    else {
                        s2 = "Health Connect is unavailable on this device at this time.";
                    }
                    if (!b) {
                        return sdr.j((Object)new HealthConnectQueryV0OutputHealthConnectQueryError(HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType.x, s2));
                    }
                    final List a = v.a;
                    final ArrayList list = new ArrayList();
                    for (final HealthConnectQueryV0InputQueriesItem healthConnectQueryV0InputQueriesItem : a) {
                        final l7n h8 = ahb.h;
                        final ahb i = a4r.k(healthConnectQueryV0InputQueriesItem.b());
                        if (i != null) {
                            list.add((Object)i);
                        }
                    }
                    final Set w2 = c86.w1((Iterable)list);
                    if (w2.isEmpty()) {
                        return sdr.j((Object)new HealthConnectQueryV0OutputHealthConnectQueryError(HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType.z, "No valid record types provided. All record types are unsupported."));
                    }
                    final OffsetDateTime now = OffsetDateTime.now();
                    final List a2 = v.a;
                    Label_0574: {
                        if (a2 == null || !((Collection)a2).isEmpty()) {
                            for (final HealthConnectQueryV0InputQueriesItem healthConnectQueryV0InputQueriesItem2 : a2) {
                                final HealthConnectQueryV0InputQueriesItemTimeRange d = healthConnectQueryV0InputQueriesItem2.d();
                                final long n2 = 0L;
                                long until = 0L;
                                Label_0485: {
                                    if (d != null) {
                                        final OffsetDateTime b2 = d.b();
                                        if (b2 != null) {
                                            until = b2.until((Temporal)now, (TemporalUnit)ChronoUnit.DAYS);
                                            break Label_0485;
                                        }
                                    }
                                    until = 0L;
                                }
                                final boolean b3 = until >= 30L;
                                final HealthConnectQueryV0InputQueriesItemTimeRange d2 = healthConnectQueryV0InputQueriesItem2.d();
                                long until2 = n2;
                                if (d2 != null) {
                                    final OffsetDateTime a3 = d2.a();
                                    until2 = n2;
                                    if (a3 != null) {
                                        until2 = a3.until((Temporal)now, (TemporalUnit)ChronoUnit.DAYS);
                                    }
                                }
                                final boolean b4 = until2 >= 30L;
                                if (b3 || b4) {
                                    n = 1;
                                    break Label_0574;
                                }
                            }
                        }
                        n = 0;
                    }
                    final xd g = kfb.g;
                    final Iterable iterable = (Iterable)w2;
                    final ArrayList list2 = new ArrayList(d86.p0(iterable, 10));
                    final Iterator iterator3 = iterable.iterator();
                    while (iterator3.hasNext()) {
                        list2.add((Object)((ahb)iterator3.next()).f());
                    }
                    final Set w3 = c86.w1((Iterable)list2);
                    jfb.v = v;
                    jfb.B = b;
                    jfb.C = n;
                    jfb.F = 1;
                    if ((o = g.c(w3, (boolean)(n != 0), (h07)jfb)) == v2) {
                        return v2;
                    }
                }
                final m2h w = (m2h)o;
                if (w.a().isEmpty()) {
                    return sdr.j((Object)new HealthConnectQueryV0OutputHealthConnectQueryError(HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType.y, "Health Connect permission denied."));
                }
                final List a4 = v.a;
                Object o2 = new ArrayList(d86.p0((Iterable)a4, 10));
                final Iterator iterator4 = ((Iterable)a4).iterator();
                final kfb x = kfb;
                final Iterator z = iterator4;
                final jfb jfb2 = jfb;
                final Object o3 = o2;
                if (!z.hasNext()) {
                    final List list3 = (List)o3;
                    String s3 = s;
                    if (n != 0) {
                        s3 = s;
                        if (!w.b()) {
                            s3 = "A permission to read data older than 30 days was not granted.";
                        }
                    }
                    return sdr.t((Object)new HealthConnectQueryV0OutputHealthConnectQueryResult(s3, list3));
                }
                final HealthConnectQueryV0InputQueriesItem healthConnectQueryV0InputQueriesItem3 = (HealthConnectQueryV0InputQueriesItem)z.next();
                final web h9 = x.h;
                jfb2.v = null;
                jfb2.w = w;
                jfb2.x = x;
                final Collection collection2 = (Collection)o3;
                jfb2.y = collection2;
                jfb2.z = z;
                jfb2.A = collection2;
                jfb2.B = b;
                jfb2.C = n;
                jfb2.F = 2;
                o = h9.h(healthConnectQueryV0InputQueriesItem3, (h07)jfb2);
                if (o != v2) {
                    o2 = o3;
                    collection = (Collection)o3;
                    break Label_0889;
                }
                return v2;
            }
            collection.add((Object)o);
            continue;
        }
    }
    
    public x4 r(final int n) {
        return null;
    }
    
    public void s() {
        final ft7 ft7 = (ft7)this.w;
        final long e = ft7.e;
        final boolean d = ft7.d;
        final gt7 c = ft7.c;
        final szg v = c.v;
        if (!d) {
            ft7.a(v.j() - e);
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        final long micros = milliseconds.toMicros(currentTimeMillis);
        final TimeUnit microseconds = TimeUnit.MICROSECONDS;
        long n;
        if (!d) {
            n = microseconds.toNanos(micros - milliseconds.toMicros(System.currentTimeMillis())) + milliseconds.toNanos((c.v.j() - e) / 1000000L);
        }
        else {
            final long nanos = microseconds.toNanos(micros);
            c.v.n = System.nanoTime();
            n = nanos - e;
        }
        ft7.a(n);
    }
    
    public xom t() {
        final q69 a = q69.a();
        if (a.c() == 1) {
            return (xom)new b5c(true);
        }
        final ksg q = o50.Q((Object)Boolean.FALSE);
        a.i((n69)new a58(this, q));
        return (xom)q;
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 1: {
                return "Bradford";
            }
        }
    }
    
    public void u(final float n, final float n2, final float n3, final float n4) {
        final zn0 zn0 = (zn0)this.w;
        final x13 t = zn0.t();
        final long n5 = ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(zn0.A() & 0xFFFFFFFFL)) - (n4 + n2)) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(zn0.A() >> 32)) - (n3 + n)) << 32;
        if (Float.intBitsToFloat((int)(n5 >> 32)) < 0.0f || Float.intBitsToFloat((int)(n5 & 0xFFFFFFFFL)) < 0.0f) {
            fac.a("Width and height must be greater than or equal to zero");
        }
        zn0.J(n5);
        t.n(n, n2);
    }
    
    public void v(sad y) {
        final kbd kbd = (kbd)this.w;
        final int ordinal = ((Enum)y).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                final sad z = sad.z;
                y = sad.y;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            en9.r();
                            return;
                        }
                        final int ordinal2 = ((Enum)kbd.w).ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    en9.r();
                                }
                            }
                            else {
                                mlc.i0(kbd);
                                if (kbd.w == y) {
                                    kbd.onResume();
                                }
                            }
                        }
                    }
                    else {
                        final int ordinal3 = ((Enum)kbd.w).ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 == 1 || ordinal3 == 2) {
                                mlc.i0(kbd);
                                return;
                            }
                            if (ordinal3 != 3) {
                                if (ordinal3 != 4) {
                                    en9.r();
                                    return;
                                }
                                if (kbd.w == z) {
                                    kbd.onPause();
                                }
                            }
                        }
                    }
                }
                else {
                    final int ordinal4 = ((Enum)kbd.w).ordinal();
                    if (ordinal4 != 0) {
                        if (ordinal4 == 1) {
                            mlc.y(kbd);
                            return;
                        }
                        if (ordinal4 != 2) {
                            if (ordinal4 != 3 && ordinal4 != 4) {
                                en9.r();
                                return;
                            }
                            if (kbd.w == z) {
                                kbd.onPause();
                            }
                            if (kbd.w == y) {
                                kbd.a();
                            }
                        }
                    }
                }
            }
        }
        else {
            final int ordinal5 = ((Enum)kbd.w).ordinal();
            if (ordinal5 != 0) {
                if (ordinal5 != 1) {
                    if (ordinal5 != 2 && ordinal5 != 3 && ordinal5 != 4) {
                        en9.r();
                        return;
                    }
                    mlc.C(kbd);
                }
                else {
                    mlc.y(kbd);
                    mlc.C(kbd);
                }
            }
        }
    }
    
    public void w() {
        ((jra)this.w).A.P();
    }
    
    public boolean y(final int n, final int n2, final Bundle bundle) {
        return false;
    }
}
