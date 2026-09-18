import java.util.Map;
import java.util.Map$Entry;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import android.view.inputmethod.CursorAnchorInfo$Builder;
import io.sentry.p7;
import io.sentry.compose.c;
import io.sentry.o7;
import io.sentry.l4;
import io.sentry.v4;
import io.sentry.q1;
import androidx.compose.ui.node.LayoutNode;
import android.graphics.Paint;
import androidx.concurrent.futures.b;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import android.content.Context;
import java.util.ArrayList;

public abstract class uoo
{
    public static final ye6 a;
    public static final elo b;
    public static final vs8 c;
    public static volatile boolean d = true;
    
    public static final m0q A(final gva gva) {
        gva.g0(760658738);
        final long y = ((xc8)gva.j((sei)hm6.h)).y(Z(((n6d)gva.j((sei)hm6.v)).a()));
        gva.q(false);
        final int c = c3q.c;
        final Set a = ws8.a;
        final Set a2 = ss8.a;
        final Iterable iterable = (Iterable)a;
        final ArrayList list = new ArrayList();
        for (final Object next : iterable) {
            if (qs8.b(us8.d(y), ((qs8)next).v) >= 0) {
                list.add(next);
            }
        }
        final Iterator iterator2 = list.iterator();
        if (!iterator2.hasNext()) {
            oyl.r();
            return null;
        }
        float n = ((qs8)iterator2.next()).v;
        while (iterator2.hasNext()) {
            n = Math.max(n, ((qs8)iterator2.next()).v);
        }
        final Iterable iterable2 = (Iterable)a2;
        final ArrayList list2 = new ArrayList();
        for (final Object next2 : iterable2) {
            if (qs8.b(us8.c(y), ((qs8)next2).v) >= 0) {
                list2.add(next2);
            }
        }
        final Iterator iterator4 = list2.iterator();
        if (iterator4.hasNext()) {
            float n2 = ((qs8)iterator4.next()).v;
            while (iterator4.hasNext()) {
                n2 = Math.max(n2, ((qs8)iterator4.next()).v);
            }
            final c3q c3q = new c3q((int)n, (int)n2);
            final Context context = (Context)gva.j((sei)q50.b);
            final boolean f = gva.f((Object)context);
            final Object r = gva.R();
            Object o;
            if (f || (o = r) == bi6.a) {
                c1q.t.getClass();
                Object u;
                if ((u = b1q.b.getValue()) == null) {
                    final qxl c2 = qxl.c;
                    u = v6r.u(context);
                }
                lq6.g(1, 2, 4, 8, 16, 32, 64, 128);
                u2a.a();
                final hdk hdk = new hdk(u);
                b1q.c.getClass();
                final p03 r2 = o50.r(new djh(hdk, context, null, (byte)15));
                final o68 a3 = vo8.a;
                o = new cd0(ri2.G((ija)r2, (hc7)w0e.a), (byte)0);
                gva.q0(o);
            }
            final List list3 = (List)((xom)ljq.v((ija)o, r89.v, gva, 48, 2)).getValue();
            final ArrayList list4 = new ArrayList();
            final Iterator iterator5 = ((Iterable)list3).iterator();
            boolean b = false;
            while (iterator5.hasNext()) {
                final kcb kcb = (kcb)iterator5.next();
                if (kcb.c() == ml.B) {
                    if (kcb.d() == xl.j) {
                        b = true;
                    }
                }
                list4.add((Object)new yjb(yi2.b0(kcb.a()), kcb.d() == xl.i, kcb.c() == ml.A, kcb.e(), kcb.b() == pk.F));
            }
            return new m0q(c3q, new bhh(list4, b));
        }
        oyl.r();
        return null;
    }
    
    public static final boolean B(File value, final rjc rjc) {
        final Object false = Boolean.FALSE;
        final qjc x = qjc.x;
        final qjc w = qjc.w;
        Label_0074: {
            try {
                value = (File)Boolean.valueOf(value.delete());
                return (boolean)value;
            }
            catch (final Exception ex) {}
            catch (final SecurityException ex2) {
                break Label_0074;
            }
            final Exception ex;
            c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)5), (Throwable)ex, 48);
            value = (File)false;
            return (boolean)value;
        }
        final SecurityException ex2;
        c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)4), (Throwable)ex2, 48);
        value = (File)false;
        return (boolean)value;
    }
    
    public static final void C(final bg0 bg0, final long g, final float n, final xf0 xf0, final dg0 dg0, final lta lta) {
        long b;
        if (n == 0.0f) {
            b = xf0.b();
        }
        else {
            b = (long)((g - bg0.c) / n);
        }
        bg0.g = g;
        bg0.e.setValue(xf0.f(b));
        bg0.f = xf0.d(b);
        if (xf0.e(b)) {
            bg0.h = bg0.g;
            bg0.i.setValue((Object)Boolean.FALSE);
        }
        a0(bg0, dg0);
        lta.b(bg0);
    }
    
    public static final void D(final cw8 cw8, final g90 g90, k2j b0, final long n, final float n2, final pw0 pw0) {
        g90.k();
        g90.i(0.0f, 0.0f);
        g90.h(pw0.e() * ((xc8)cw8).w0(10.0f) / 2.0f, pw0.e() * ((xc8)cw8).w0(5.0f));
        g90.h(pw0.e() * ((xc8)cw8).w0(10.0f), 0.0f);
        g90.n(((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(b0.f() & 0xFFFFFFFFL)) - ((xc8)cw8).w0(2.5f)) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(b0.f() >> 32)) + Math.min(b0.c - b0.a, b0.d - b0.b) / 2.0f - pw0.e() * ((xc8)cw8).w0(10.0f) / 2.0f) << 32);
        final float c = pw0.c();
        final float w0 = ((xc8)cw8).w0(2.5f);
        final long p6 = cw8.P0();
        b0 = (k2j)cw8.B0();
        final long a = ((zn0)b0).A();
        ((zn0)b0).t().g();
        try {
            ((jy7)((zn0)b0).v).C(c - w0, p6);
            cw8.Z0(cw8, g90, n, n2, (dw8)new tym(((xc8)cw8).w0(2.5f), 0.0f, 0, 0, (h90)null, 30), 48);
        }
        finally {
            oz1.w((zn0)b0, a);
        }
    }
    
    public static final boolean E(File value, final rjc rjc) {
        final Object false = Boolean.FALSE;
        final qjc x = qjc.x;
        final qjc w = qjc.w;
        Label_0074: {
            try {
                value = (File)Boolean.valueOf(value.exists());
                return (boolean)value;
            }
            catch (final Exception ex) {}
            catch (final SecurityException ex2) {
                break Label_0074;
            }
            final Exception ex;
            c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)5), (Throwable)ex, 48);
            value = (File)false;
            return (boolean)value;
        }
        final SecurityException ex2;
        c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)4), (Throwable)ex2, 48);
        value = (File)false;
        return (boolean)value;
    }
    
    public static final long F(final long n, final boolean b, int n2, final float n3) {
        Label_0044: {
            Label_0040: {
                if (!b) {
                    if (n2 != 2) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                break Label_0040;
                            }
                        }
                    }
                }
                if (gv6.e(n)) {
                    n2 = gv6.i(n);
                    break Label_0044;
                }
            }
            n2 = Integer.MAX_VALUE;
        }
        if (gv6.k(n) != n2) {
            n2 = ncq.o(zn2.q(n3), gv6.k(n), n2);
        }
        return ri2.F(0, n2, 0, gv6.h(n));
    }
    
    public static cb G(zrc e) {
        Label_0681: {
            Label_0672: {
                Label_0663: {
                    eb eb = null;
                    String j;
                    while (true) {
                    Label_0089:
                        while (true) {
                            int n = 0;
                            Label_0644: {
                                try {
                                    final String i = e.o("type").i();
                                    i.getClass();
                                    final eb[] values = eb.values();
                                    final int length = values.length;
                                    n = 0;
                                    if (n >= length) {
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    eb = values[n];
                                    if (!eb.v.equals(i)) {
                                        break Label_0644;
                                    }
                                    final irc o = e.o("id");
                                    if (o != null) {
                                        j = o.i();
                                        break;
                                    }
                                }
                                catch (final NullPointerException ex) {
                                    break Label_0663;
                                }
                                catch (final NumberFormatException ex2) {
                                    break Label_0672;
                                }
                                catch (final IllegalStateException ex3) {
                                    break Label_0681;
                                }
                                break Label_0089;
                            }
                            ++n;
                            continue;
                        }
                        j = null;
                        break;
                    }
                    final irc o2 = e.o("loading_time");
                    Long value;
                    if (o2 != null) {
                        value = o2.f();
                    }
                    else {
                        value = null;
                    }
                    final irc o3 = e.o("target");
                    db x;
                    if (o3 != null) {
                        x = c5q.x(o3.e());
                    }
                    else {
                        x = null;
                    }
                    final irc o4 = e.o("frustration");
                    xb f;
                    if (o4 != null) {
                        f = c6r.f(o4.e());
                    }
                    else {
                        f = null;
                    }
                    final irc o5 = e.o("error");
                    wb wb = null;
                    Label_0294: {
                        if (o5 != null) {
                            final zrc e2 = o5.e();
                            try {
                                wb = new wb(e2.o("count").f());
                                break Label_0294;
                            }
                            catch (final NullPointerException ex4) {}
                            catch (final NumberFormatException ex5) {
                                throw new RuntimeException("Unable to parse json into type Error", (Throwable)ex5);
                            }
                            catch (final IllegalStateException ex6) {
                                throw new RuntimeException("Unable to parse json into type Error", (Throwable)ex6);
                            }
                            final NullPointerException ex4;
                            throw new RuntimeException("Unable to parse json into type Error", (Throwable)ex4);
                        }
                        wb = null;
                    }
                    final irc o6 = e.o("crash");
                    pb pb = null;
                    Label_0405: {
                        if (o6 != null) {
                            final zrc e3 = o6.e();
                            try {
                                pb = new pb(e3.o("count").f());
                                break Label_0405;
                            }
                            catch (final NullPointerException ex7) {}
                            catch (final NumberFormatException ex8) {
                                throw new RuntimeException("Unable to parse json into type Crash", (Throwable)ex8);
                            }
                            catch (final IllegalStateException ex9) {
                                throw new RuntimeException("Unable to parse json into type Crash", (Throwable)ex9);
                            }
                            final NullPointerException ex7;
                            throw new RuntimeException("Unable to parse json into type Crash", (Throwable)ex7);
                        }
                        pb = null;
                    }
                    final irc o7 = e.o("long_task");
                    zb zb = null;
                    Label_0516: {
                        if (o7 != null) {
                            final zrc e4 = o7.e();
                            try {
                                zb = new zb(e4.o("count").f());
                                break Label_0516;
                            }
                            catch (final NullPointerException ex10) {}
                            catch (final NumberFormatException ex11) {
                                throw new RuntimeException("Unable to parse json into type LongTask", (Throwable)ex11);
                            }
                            catch (final IllegalStateException ex12) {
                                throw new RuntimeException("Unable to parse json into type LongTask", (Throwable)ex12);
                            }
                            final NullPointerException ex10;
                            throw new RuntimeException("Unable to parse json into type LongTask", (Throwable)ex10);
                        }
                        zb = null;
                    }
                    final irc o8 = e.o("resource");
                    if (o8 != null) {
                        e = o8.e();
                        try {
                            final dc dc = new dc(e.o("count").f());
                            return new cb(eb, j, value, x, f, wb, pb, zb, dc);
                        }
                        catch (final NullPointerException ex13) {}
                        catch (final NumberFormatException ex14) {
                            throw new RuntimeException("Unable to parse json into type Resource", (Throwable)ex14);
                        }
                        catch (final IllegalStateException ex15) {
                            throw new RuntimeException("Unable to parse json into type Resource", (Throwable)ex15);
                        }
                        final NullPointerException ex13;
                        throw new RuntimeException("Unable to parse json into type Resource", (Throwable)ex13);
                    }
                    final dc dc = null;
                    return new cb(eb, j, value, x, f, wb, pb, zb, dc);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ActionEventAction", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ActionEventAction", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ActionEventAction", (Throwable)ex3);
        return null;
    }
    
    public static nlj H(final zrc zrc) {
        Label_0110: {
            Label_0101: {
                Label_0092: {
                    LinkedHashMap linkedHashMap;
                    try {
                        linkedHashMap = new LinkedHashMap();
                        final Iterator iterator = ((hgd)zrc.v.entrySet()).iterator();
                        while (((jgd)iterator).hasNext()) {
                            final kgd a = ((jgd)iterator).a();
                            final Object key = ((Map$Entry)a).getKey();
                            key.getClass();
                            ((Map)linkedHashMap).put(key, ((Map$Entry)a).getValue());
                        }
                    }
                    catch (final NullPointerException ex) {
                        break Label_0092;
                    }
                    catch (final NumberFormatException ex2) {
                        break Label_0101;
                    }
                    catch (final IllegalStateException ex3) {
                        break Label_0110;
                    }
                    return new nlj(linkedHashMap);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Context", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Context", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Context", (Throwable)ex3);
        return null;
    }
    
    public static final long I(final long n) {
        return (n << 32 >> 33 & 0xFFFFFFFFL) | n >> 33 << 32;
    }
    
    public static final float J(final hc7 hc7) {
        final phf phf = (phf)hc7.M0((gc7)y7j.A);
        float e0;
        if (phf != null) {
            e0 = phf.e0();
        }
        else {
            e0 = 1.0f;
        }
        if (e0 >= 0.0f) {
            return e0;
        }
        rih.b("negative scale factor");
        return e0;
    }
    
    public static t03 K(final r03 r03) {
        final Object o = new Object();
        ((b)o).c = (ekj)new Object();
        final t03 b = new t03((b)o);
        ((b)o).b = b;
        ((b)o).a = r03.getClass();
        Label_0066: {
            try {
                final Object g = r03.g((b)o);
                if (g != null) {
                    ((b)o).a = g;
                    return b;
                }
            }
            catch (final Exception ex) {
                break Label_0066;
            }
            return b;
        }
        final Exception ex;
        ((b3)b.w).o((Throwable)ex);
        return b;
    }
    
    public static final Paint L(final y80 y80) {
        if (y80 == null) {
            final String b = v4j.a((Class)y80.getClass()).b();
            final StringBuilder sb = new StringBuilder("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received ");
            sb.append(b);
            fac.a(sb.toString());
        }
        return y80.a;
    }
    
    public static final int M(final mun mun) {
        int n = mun.h - 1;
        lqg lqg = null;
        while (-1 < n) {
            mun.c(n);
            final lqg a = mun.a(n);
            if (mlc.q(a.a(), wab.U) || mlc.q(a.a(), wab.W)) {
                int o;
                if (lqg != null) {
                    o = (int)(lqg.e >> 32);
                }
                else {
                    o = O(a);
                }
                return -o;
            }
            Label_0082: {
                if (a.a().b != 3) {
                    if (a.a().b != 2) {
                        break Label_0082;
                    }
                }
                lqg = a;
            }
            --n;
        }
        return 0;
    }
    
    public static final int N(final mun mun) {
        final byte h = mun.h;
        lqg lqg = null;
        for (byte b = 0; b < h; ++b) {
            mun.c((int)b);
            final lqg a = mun.a((int)b);
            if (mlc.q(a.a(), wab.V) || mlc.q(a.a(), wab.X)) {
                final int n = (int)(mun.g >> 32);
                int o;
                if (lqg != null) {
                    o = O(lqg);
                }
                else {
                    o = (int)(a.e >> 32);
                }
                return n - o;
            }
            if (a.a().b != 3) {
                if (a.a().b != 2) {
                    continue;
                }
            }
            lqg = a;
        }
        return 0;
    }
    
    public static final int O(final lqg lqg) {
        return (int)(lqg.e >> 32) + (int)(lqg.d >> 32);
    }
    
    public static final boolean P(File value, final rjc rjc) {
        final Object false = Boolean.FALSE;
        final qjc x = qjc.x;
        final qjc w = qjc.w;
        Label_0074: {
            try {
                value = (File)Boolean.valueOf(value.isDirectory());
                return (boolean)value;
            }
            catch (final Exception ex) {}
            catch (final SecurityException ex2) {
                break Label_0074;
            }
            final Exception ex;
            c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)5), (Throwable)ex, 48);
            value = (File)false;
            return (boolean)value;
        }
        final SecurityException ex2;
        c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)4), (Throwable)ex2, 48);
        value = (File)false;
        return (boolean)value;
    }
    
    public static final long Q(File value, final rjc rjc) {
        final Object value2 = 0L;
        final qjc x = qjc.x;
        final qjc w = qjc.w;
        Label_0075: {
            try {
                value = (File)Long.valueOf(value.length());
                return ((Number)value).longValue();
            }
            catch (final Exception ex) {}
            catch (final SecurityException ex2) {
                break Label_0075;
            }
            final Exception ex;
            c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)5), (Throwable)ex, 48);
            value = (File)value2;
            return ((Number)value).longValue();
        }
        final SecurityException ex2;
        c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)4), (Throwable)ex2, 48);
        value = (File)value2;
        return ((Number)value).longValue();
    }
    
    public static final File[] R(final File file, final rjc rjc) {
        final qjc x = qjc.x;
        final qjc w = qjc.w;
        try {
            return file.listFiles();
        }
        catch (final Exception ex) {
            c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(file, (byte)5), (Throwable)ex, 48);
        }
        catch (final SecurityException ex2) {
            c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(file, (byte)4), (Throwable)ex2, 48);
        }
        return null;
    }
    
    public static final String S(final vqd vqd) {
        String c;
        if ((c = v4j.a((Class)vqd.getClass()).c()) == null) {
            c = "unknown";
        }
        return c;
    }
    
    public static final boolean T(File value, final rjc rjc) {
        final Object false = Boolean.FALSE;
        final qjc x = qjc.x;
        final qjc w = qjc.w;
        Label_0074: {
            try {
                value = (File)Boolean.valueOf(value.mkdirs());
                return (boolean)value;
            }
            catch (final Exception ex) {}
            catch (final SecurityException ex2) {
                break Label_0074;
            }
            final Exception ex;
            c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)5), (Throwable)ex, 48);
            value = (File)false;
            return (boolean)value;
        }
        final SecurityException ex2;
        c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)4), (Throwable)ex2, 48);
        value = (File)false;
        return (boolean)value;
    }
    
    public static l5p U(final String s) {
        if (s.length() == 36) {
            int i = 0;
            long n = 0L;
            while (i < 8) {
                final char char1 = s.charAt(i);
                if (char1 >>> 8 != 0) {
                    return null;
                }
                final long n2 = ljb.b[char1];
                if (n2 < 0L) {
                    return null;
                }
                n = (n << 4 | n2);
                ++i;
            }
            if (s.charAt(8) == '-') {
                int j = 9;
                long n3 = 0L;
                while (j < 13) {
                    final char char2 = s.charAt(j);
                    if (char2 >>> 8 != 0) {
                        return null;
                    }
                    final long n4 = ljb.b[char2];
                    if (n4 < 0L) {
                        return null;
                    }
                    n3 = (n3 << 4 | n4);
                    ++j;
                }
                if (s.charAt(13) == '-') {
                    int k = 14;
                    long n5 = 0L;
                    while (k < 18) {
                        final char char3 = s.charAt(k);
                        if (char3 >>> 8 != 0) {
                            return null;
                        }
                        final long n6 = ljb.b[char3];
                        if (n6 < 0L) {
                            return null;
                        }
                        n5 = (n5 << 4 | n6);
                        ++k;
                    }
                    if (s.charAt(18) == '-') {
                        int l = 19;
                        long n7 = 0L;
                        while (l < 23) {
                            final char char4 = s.charAt(l);
                            if (char4 >>> 8 != 0) {
                                return null;
                            }
                            final long n8 = ljb.b[char4];
                            if (n8 < 0L) {
                                return null;
                            }
                            n7 = (n7 << 4 | n8);
                            ++l;
                        }
                        if (s.charAt(23) == '-') {
                            int n9 = 24;
                            long n10 = 0L;
                            while (n9 < 36) {
                                final char char5 = s.charAt(n9);
                                if (char5 >>> 8 != 0) {
                                    return null;
                                }
                                final long n11 = ljb.b[char5];
                                if (n11 < 0L) {
                                    return null;
                                }
                                n10 = (n10 << 4 | n11);
                                ++n9;
                            }
                            final long n12 = n << 32 | n3 << 16 | n5;
                            final long n13 = n7 << 48 | n10;
                            if (n12 == 0L && n13 == 0L) {
                                return l5p.x;
                            }
                            return new l5p(n12, n13);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static tdo V(final List list, final boolean b) {
        if (!b) {
            return new tdo(list);
        }
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        for (final Object next : list) {
            final uqh uqh = (uqh)next;
            final igf a = th4.a;
            final sdo p2 = uqh.p();
            rdo rdo;
            if (p2 instanceof rdo) {
                rdo = (rdo)p2;
            }
            else {
                rdo = null;
            }
            if (rdo != null && !rdo.c()) {
                list2.add(next);
            }
            else {
                list3.add(next);
            }
        }
        return new tdo((List)list2, (List)list3, true);
    }
    
    public static final dji W(final gva gva) {
        Object r;
        if ((r = gva.R()) == bi6.a) {
            r = new lih((byte)2);
            gva.q0(r);
        }
        return (dji)mlc.b0(new Object[0], (m9k)dji.b, (jta)r, gva, 384);
    }
    
    public static final long X(long n) {
        final int round = Math.round(Float.intBitsToFloat((int)(n >> 32)));
        final int round2 = Math.round(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)));
        n = round;
        return ((long)round2 & 0xFFFFFFFFL) | n << 32;
    }
    
    public static final igf Y(final igf igf, final boolean b, final boolean b2, final jta jta) {
        igf e = igf;
        if (b) {
            e = igf;
            if (v0n.a) {
                igf e2 = igf;
                if (b2) {
                    e2 = igf.E((igf)new w0n(uoo.c));
                }
                e = e2.E((igf)new t0n(jta));
            }
        }
        return e;
    }
    
    public static final long Z(long n) {
        final float n2 = (float)(int)(n >> 32);
        final float n3 = (float)(int)(n & 0xFFFFFFFFL);
        n = Float.floatToRawIntBits(n2);
        return ((long)Float.floatToRawIntBits(n3) & 0xFFFFFFFFL) | n << 32;
    }
    
    public static final void a(final int n, final jta jta, final gva gva, final boolean b) {
        gva.i0(-1339183247);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.g(b)) {
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
            if (gva.h((Object)jta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            omo.a(n4 & 0x7E, 0, jta, gva, b);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new so1(n, jta, b);
        }
    }
    
    public static final void a0(final bg0 bg0, final dg0 dg0) {
        dg0.w.setValue(bg0.e.getValue());
        final ig0 x = dg0.x;
        final ig0 f = bg0.f;
        for (int b = x.b(), i = 0; i < b; ++i) {
            x.e(i, f.a(i));
        }
        dg0.z = bg0.h;
        dg0.y = bg0.g;
        dg0.A = (boolean)bg0.i.getValue();
    }
    
    public static final void b(final tia tia, final long n, final gva gva, final int n2) {
        gva.i0(-1353562852);
        int n3;
        if (gva.f((Object)tia)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.e(n)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        final int n5 = n3 | n2 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x13) != 0x12)) {
            final Object r = gva.R();
            final cib a = bi6.a;
            g90 a2;
            if ((a2 = (g90)r) == a) {
                a2 = j90.a();
                a2.m(1);
                gva.q0((Object)a2);
            }
            final g90 g90 = a2;
            Object o;
            if ((o = gva.R()) == a) {
                o = r8m.b((jta)new lce((Object)tia, (byte)13));
                gva.q0(o);
            }
            final xom b = md0.b(((Number)((xom)o).getValue()).floatValue(), zrn.X(3, gva), null, gva, 0, 28);
            final int n6 = n5 & 0xE;
            final boolean b2 = n6 == 4;
            final Object r2 = gva.R();
            Object o2;
            if (b2 || (o2 = r2) == a) {
                o2 = new p8a((Object)tia, (byte)26);
                gva.q0(o2);
            }
            final igf p4 = androidx.compose.foundation.layout.b.p(wsk.a((igf)fgf.v, (lta)o2), 16.0f);
            final boolean b3 = n6 == 4;
            final boolean f = gva.f((Object)b);
            final boolean b4 = (n5 & 0x70) == 0x20;
            final boolean h = gva.h((Object)g90);
            final Object r3 = gva.R();
            Object o3;
            if ((b3 | f | b4 | h) || (o3 = r3) == a) {
                o3 = new oa6(tia, b, n, g90);
                gva.q0(o3);
            }
            ljq.j(p4, (lta)o3, gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new gin(tia, n, n2);
        }
    }
    
    public static final void c(final String s, final jta jta, igf igf, final boolean b, final zta zta, final zta zta2, final e48 e48, final mnn mnn, final gva gva, final int n) {
        gva.i0(1437209492);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)s)) {
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
            if (gva.h((Object)jta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n7;
        final int n6 = n7 = (n4 | 0x180);
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.g(b)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n6 | n8);
        }
        int n9 = n7;
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.h((Object)zta)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n9 = (n7 | n10);
        }
        int n11 = n9;
        if ((0x30000 & n) == 0x0) {
            int n12;
            if (gva.h((Object)zta2)) {
                n12 = 131072;
            }
            else {
                n12 = 65536;
            }
            n11 = (n9 | n12);
        }
        int n13 = n11;
        if ((0x180000 & n) == 0x0) {
            int n14;
            if (gva.f((Object)e48)) {
                n14 = 1048576;
            }
            else {
                n14 = 524288;
            }
            n13 = (n11 | n14);
        }
        int n15 = n13;
        if ((0xC00000 & n) == 0x0) {
            int n16;
            if (gva.f((Object)mnn)) {
                n16 = 8388608;
            }
            else {
                n16 = 4194304;
            }
            n15 = (n13 | n16);
        }
        if (gva.W(n15 & 0x1, (0x492493 & n15) != 0x492492)) {
            gva.b0();
            final Object v = fgf.v;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                igf = (igf)v;
            }
            gva.r();
            final ye6 t0 = uuj.t0(-1822876387, (aua)new ah0((Object)s, (Object)mnn, (byte)28), gva);
            final igf j = m3r.j(omo.W((igf)v, 8.0f, 0.0f, 2).E(igf));
            final ye6 t2 = uuj.t0(-1180638791, (aua)new ah0((Object)zta2, (Object)t0, (byte)29), gva);
            final int n17 = n15 << 3;
            arf.e(t2, b, jta, j, zta, (aql)null, e48, gva, (n15 & 0xE000) | ((n15 >> 6 & 0x70) | 0x6 | (n17 & 0x380)) | (0x1C00000 & n17));
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new oz3(s, jta, igf, b, zta, zta2, e48, mnn, n);
        }
    }
    
    public static final y80 d() {
        return new y80(new Paint(7));
    }
    
    public static final void e(final int n, final zta zta, final gva gva, final boolean b) {
        gva.i0(-1437916225);
        int n2;
        if (gva.g(b)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)zta)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            qt7.f(n4 & 0x7E, zta, gva, b);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ro1(b, zta, n);
        }
    }
    
    public static final void f(final boolean b, final jta jta, final igf igf, dji w, gx x, bua t0, boolean b2, float c, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(492221845);
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
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)jta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 |= n5;
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
        if ((n & 0xC00) == 0x0) {
            int n8;
            if ((n2 & 0x8) == 0x0 && gva.f((Object)w)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n6 |= n8;
        }
        final int n9 = n6 | 0x6000;
        final int n10 = n2 & 0x20;
        int n11;
        if (n10 != 0) {
            n11 = (0x36000 | n6);
        }
        else {
            n11 = n9;
            if ((0x30000 & n) == 0x0) {
                int n12;
                if (gva.h((Object)t0)) {
                    n12 = 131072;
                }
                else {
                    n12 = 65536;
                }
                n11 = (n9 | n12);
            }
        }
        final int n13 = n2 & 0x40;
        int n14;
        if (n13 != 0) {
            n14 = (n11 | 0x180000);
        }
        else {
            n14 = n11;
            if ((0x180000 & n) == 0x0) {
                int n15;
                if (gva.g(b2)) {
                    n15 = 1048576;
                }
                else {
                    n15 = 524288;
                }
                n14 = (n11 | n15);
            }
        }
        int n17;
        final int n16 = n17 = (n14 | 0xC00000);
        if ((0x6000000 & n) == 0x0) {
            int n18;
            if (gva.h((Object)ye6)) {
                n18 = 67108864;
            }
            else {
                n18 = 33554432;
            }
            n17 = (n16 | n18);
        }
        gx gx;
        bua bua;
        if (gva.W(n17 & 0x1, (0x2492493 & n17) != 0x2492492)) {
            gva.b0();
            int n20;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n19 = n17;
                if ((n2 & 0x8) != 0x0) {
                    n19 = (n17 & 0xFFFFE3FF);
                }
                n20 = n19;
            }
            else {
                int n21 = n17;
                if ((n2 & 0x8) != 0x0) {
                    w = W(gva);
                    n21 = (n17 & 0xFFFFE3FF);
                }
                x = (gx)wab.x;
                if (n10 != 0) {
                    t0 = (bua)uuj.t0(419143791, (aua)new zrd(w, b), gva);
                }
                if (n13 != 0) {
                    b2 = true;
                }
                c = vii.c;
                n20 = n21;
            }
            gva.r();
            final igf e = igf.E((igf)new wii(b, jta, b2, w, c));
            final moe c2 = rj2.c(x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b3 = ien.B(gva, e);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c2);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b3);
            final dk2 a = dk2.a;
            ye6.h((Object)a, (Object)gva, (Object)((n20 >> 21 & 0x70) | 0x6));
            t0.h(a, gva, (n20 >> 12 & 0x70) | 0x6);
            gva.q(true);
            gx = x;
            bua = t0;
        }
        else {
            gva.Z();
            gx = x;
            bua = t0;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new xii(b, jta, igf, w, gx, bua, b2, c, ye6, n, n2);
        }
    }
    
    public static final void g(final int n, final gva gva) {
        final cib a = bi6.a;
        gva.i0(-1121540169);
        final int n2 = n & 0x1;
        while (true) {
            Label_0294: {
                if (!gva.W(n2, n2 != 0)) {
                    gva.Z();
                    break Label_0294;
                }
                final ita a2 = rod.a(gva);
                Object o = null;
                Label_0109: {
                    if (a2 != null) {
                        final hta hta = (hta)((ge6)a2).B.getValue();
                        if (hta != null) {
                            o = hta.c;
                            synchronized (o) {
                                final boolean f = hta.f;
                                monitorexit(o);
                                o = f;
                                break Label_0109;
                            }
                        }
                    }
                    o = null;
                }
                if (!mlc.q(o, Boolean.TRUE)) {
                    uuj.S(0, gva);
                    final odk a3 = ii8.a(gva);
                    final boolean f2 = gva.f((Object)null);
                    final boolean f3 = gva.f((Object)a3);
                    final Object r = gva.R();
                    Object o2;
                    if ((f2 | f3) || (o2 = r) == a) {
                        o2 = a3.d((Class)voc.class, (emi)null);
                        gva.q0(o2);
                    }
                    final voc voc = (voc)o2;
                    final lqo a4 = lqo.a;
                    final boolean h = gva.h((Object)voc);
                    final Object r2 = gva.R();
                    Object o3;
                    if (h || (o3 = r2) == a) {
                        o3 = new h80((byte)15, (f07)null, (Object)voc);
                        gva.q0(o3);
                    }
                    mlc.f((zta)o3, gva, a4);
                    break Label_0294;
                }
                final b0j b0j = gva.v();
                if (b0j == null) {
                    return;
                }
                final cqg d = new cqg(n, (byte)4);
                b0j.d = (zta)d;
                return;
            }
            final b0j b0j = gva.v();
            if (b0j != null) {
                final cqg d = new cqg(n, (byte)5);
                continue;
            }
            break;
        }
    }
    
    public static final void h(final String s, igf v, boolean b, q1 q1, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(1837697637);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)s)) {
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
        int n8 = n6 | 0x180;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if ((n2 & 0x8) == 0x0 && gva.h((Object)q1)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 |= n9;
        }
        int n10 = n8;
        if ((n & 0x6000) == 0x0) {
            int n11;
            if (gva.h((Object)ye6)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        if (gva.W(n10 & 0x1, (n10 & 0x2493) != 0x2492)) {
            gva.b0();
            int n13;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n12 = n10;
                if ((n2 & 0x8) != 0x0) {
                    n12 = (n10 & 0xFFFFE3FF);
                }
                n13 = n12;
            }
            else {
                if (n5 != 0) {
                    v = (igf)fgf.v;
                }
                int n14 = n10;
                if ((n2 & 0x8) != 0x0) {
                    final Object o = new Object();
                    v4.d((l4)new re(o, (byte)11));
                    q1 = (q1)((b4j)o).v;
                    n14 = (n10 & 0xFFFFE3FF);
                }
                n13 = n14;
                b = true;
            }
            gva.r();
            q1 p8;
            if (q1 != null) {
                final o7 o2 = new o7();
                o2.c = true;
                o2.d = true;
                o2.e = true;
                p8 = q1.p("ui.compose.composition", "Jetpack Compose Initial Composition", o2);
                p8.y().D = "auto.ui.jetpack_compose";
            }
            else {
                p8 = null;
            }
            q1 p9;
            if (q1 != null) {
                final o7 o3 = new o7();
                o3.c = true;
                o3.d = true;
                o3.e = true;
                p9 = q1.p("ui.compose.rendering", "Jetpack Compose Initial Render", o3);
                p9.y().D = "auto.ui.jetpack_compose";
            }
            else {
                p9 = null;
            }
            final g5c g5c = new g5c((Object)p9);
            q1 b2;
            if (p8 != null) {
                b2 = p8.B("ui.compose", s);
                b2.y().D = "auto.ui.jetpack_compose";
            }
            else {
                b2 = null;
            }
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o4 = r;
            if (r == a) {
                o4 = new g5c((Object)Boolean.FALSE);
                gva.q0(o4);
            }
            final g5c g5c2 = (g5c)o4;
            igf a2;
            if (b) {
                a2 = io.sentry.compose.c.a(v, s);
            }
            else {
                a2 = v;
            }
            final boolean f = gva.f((Object)g5c);
            final boolean b3 = (n13 & 0xE) == 0x4;
            final Object r2 = gva.R();
            Object o5;
            if ((f | b3) || (o5 = r2) == a) {
                o5 = new rx1((Object)g5c2, (Object)g5c, (Object)s, (byte)25);
                gva.q0(o5);
            }
            final igf g = t08.G(a2, (lta)o5);
            final moe c = rj2.c((gx)wab.x, true);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b4 = ien.B(gva, g);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b4);
            ye6.h((Object)dk2.a, (Object)gva, (Object)((n13 >> 9 & 0x70) | 0x6));
            gva.q(true);
            if (b2 != null) {
                b2.k(p7.OK);
            }
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new li6(s, v, b, q1, ye6, n, n2);
        }
    }
    
    public static final void i(final String s, igf v, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-2128954573);
        final int n2 = n | 0x180;
        if (gva.W(n2 & 0x1, (n2 & 0x491) != 0x490)) {
            final ye6 t0 = uuj.t0(1952503083, (aua)new gl6(ye6, (byte)2), gva);
            v = (igf)fgf.v;
            h(s, v, false, null, t0, gva, 24630, 12);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new up4(n, (Object)s, (Object)v, (Object)ye6, (byte)16);
        }
    }
    
    public static final void j(final CursorAnchorInfo$Builder cursorAnchorInfo$Builder, final omn omn, final k2j k2j) {
        if (!k2j.j()) {
            final vjf b = omn.b;
            int n;
            if ((n = b.f - 1) < 0) {
                n = 0;
            }
            final int o = ncq.o(b.e(k2j.b), 0, n);
            final int o2 = ncq.o(b.e(k2j.d), 0, n);
            if (o <= o2) {
                int n2 = o;
                while (true) {
                    ws4.h(cursorAnchorInfo$Builder, omn.g(n2), b.f(n2), omn.h(n2), b.b(n2));
                    if (n2 == o2) {
                        break;
                    }
                    ++n2;
                }
            }
        }
    }
    
    public static final Object k(final float n, final float n2, final float n3, final cg0 cg0, final zta zta, final h07 h07) {
        final Object m = m(yi2.e, (Comparable)new Float(n), (Comparable)new Float(n2), (Comparable)new Float(n3), cg0, zta, h07);
        if (m == pc7.v) {
            return m;
        }
        return lqo.a;
    }
    
    public static final Object l(dg0 v, xf0 y, final long n, lta x, h07 y2) {
    Label_0322_Outer:
        while (true) {
            Label_0045: {
                if (!(y2 instanceof k6n)) {
                    break Label_0045;
                }
                final Object o = y2;
                final int a = ((k6n)o).A;
                if ((a & Integer.MIN_VALUE) == 0x0) {
                    break Label_0045;
                }
                ((k6n)o).A = a + Integer.MIN_VALUE;
                final Object z = ((k6n)o).z;
                final int a2 = ((k6n)o).A;
                final pc7 v2 = pc7.v;
                Label_0434: {
                    if (a2 != 0) {
                        if (a2 == 1 || a2 == 2) {
                            y = (CancellationException)((k6n)o).y;
                            final lta x2 = ((k6n)o).x;
                            final Object w = ((k6n)o).w;
                            v = (CancellationException)((k6n)o).v;
                            y2 = (h07)y;
                            x = (lta)v;
                            try {
                                vt4.g0(z);
                                break Label_0434;
                            }
                            catch (final CancellationException v) {
                                break Label_0434;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(z);
                    final Object f = ((xf0)y).f(0L);
                    final ig0 d = ((xf0)y).d(0L);
                    y2 = (h07)new Object();
                    Label_0347: {
                        if (n != Long.MIN_VALUE) {
                            break Label_0347;
                        }
                        Label_0424: {
                            while (true) {
                                while (true) {
                                    try {
                                        final float j = J(((f07)o).getContext());
                                        try {
                                            final i6n i6n = new i6n((b4j)y2, f, (xf0)y, d, (dg0)v, j, x);
                                            try {
                                                ((k6n)o).v = (dg0)v;
                                                ((k6n)o).w = (xf0)y;
                                                ((k6n)o).x = x;
                                                ((k6n)o).y = (b4j)y2;
                                                ((k6n)o).A = 1;
                                                Object o2;
                                                if (((xf0)y).a()) {
                                                    o2 = soh.b0((lta)i6n, (h07)o);
                                                }
                                                else {
                                                    o2 = ien.v(((f07)o).getContext()).p0((f07)o, (lta)new mv2((lta)i6n, (byte)8));
                                                }
                                                if (o2 == v2) {
                                                    return v2;
                                                }
                                                break Label_0424;
                                                x = (lta)v;
                                                v = y;
                                            }
                                            catch (final CancellationException y) {}
                                        }
                                        catch (final CancellationException ex) {}
                                        x = (lta)v;
                                        v = y;
                                        break Label_0434;
                                    }
                                    catch (final CancellationException y) {
                                        continue;
                                    }
                                    break;
                                }
                                try {
                                    final bg0 v3 = new bg0(f, ((xf0)y).c(), d, n, ((xf0)y).g(), n, (jta)new h6n((dg0)v, (byte)1));
                                    C(v3, n, J(((f07)o).getContext()), (xf0)y, (dg0)v, x);
                                    ((b4j)y2).v = v3;
                                    final Object w = y;
                                    final lta x2 = x;
                                    y = (CancellationException)y2;
                                    while (true) {
                                        y2 = (h07)y;
                                        final Object v4 = ((b4j)y).v;
                                        y2 = (h07)y;
                                        v4.getClass();
                                        y2 = (h07)y;
                                        if (((bg0)v4).i.getValue()) {
                                            y2 = (h07)y;
                                            final float i = J(((f07)o).getContext());
                                            y2 = (h07)y;
                                            try {
                                                final j6n j6n = new j6n((b4j)y, i, (xf0)w, (dg0)v, x2);
                                                y2 = (h07)y;
                                                ((k6n)o).v = (dg0)v;
                                                y2 = (h07)y;
                                                ((k6n)o).w = (xf0)w;
                                                y2 = (h07)y;
                                                ((k6n)o).x = x2;
                                                y2 = (h07)y;
                                                ((k6n)o).y = (b4j)y;
                                                y2 = (h07)y;
                                                ((k6n)o).A = 2;
                                                y2 = (h07)y;
                                                Object o3;
                                                if (((xf0)w).a()) {
                                                    y2 = (h07)y;
                                                    o3 = soh.b0((lta)j6n, (h07)o);
                                                }
                                                else {
                                                    y2 = (h07)y;
                                                    y2 = (h07)y;
                                                    final mv2 mv2 = new mv2((lta)j6n, (byte)8);
                                                    y2 = (h07)y;
                                                    o3 = ien.v(((f07)o).getContext()).p0((f07)o, (lta)mv2);
                                                }
                                                if (o3 == v2) {
                                                    return v2;
                                                }
                                                continue Label_0322_Outer;
                                            }
                                            catch (final CancellationException ex2) {
                                                final Object o4 = v;
                                                v = ex2;
                                                y2 = (h07)y;
                                                x = (lta)o4;
                                                break Label_0434;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    return lqo.a;
                                }
                                catch (final CancellationException y) {
                                    continue;
                                }
                                break;
                            }
                        }
                    }
                }
                final bg0 bg0 = (bg0)((b4j)y2).v;
                if (bg0 != null) {
                    bg0.i.setValue((Object)Boolean.FALSE);
                }
                final bg0 bg2 = (bg0)((b4j)y2).v;
                if (bg2 != null && bg2.g == ((dg0)x).y) {
                    ((dg0)x).A = false;
                }
                throw v;
            }
            final Object o = new h07(y2);
            continue;
        }
    }
    
    public static final Object m(final elo elo, final Comparable comparable, final Comparable comparable2, final Comparable comparable3, final cg0 cg0, final zta zta, final h07 h07) {
        final lta a = elo.a;
        ig0 c;
        if ((c = (ig0)a.b(comparable3)) == null) {
            c = ((ig0)a.b(comparable)).c();
        }
        final Object l = l(new dg0(elo, comparable, c, 56), new jcn(cg0, elo, comparable, comparable2, c), Long.MIN_VALUE, (lta)new u9l((Object)zta, (Object)elo, (byte)28), h07);
        if (l == pc7.v) {
            return l;
        }
        return lqo.a;
    }
    
    public static final Object o(final dg0 dg0, final v08 v08, final boolean b, final lta lta, final h07 h07) {
        final u08 u08 = new u08(v08, dg0.v, dg0.w.getValue(), dg0.x);
        long y;
        if (b) {
            y = dg0.y;
        }
        else {
            y = Long.MIN_VALUE;
        }
        final Object l = l(dg0, (xf0)u08, y, lta, h07);
        if (l == pc7.v) {
            return l;
        }
        return lqo.a;
    }
    
    public static final Object p(final dg0 dg0, final Float n, final cg0 cg0, final boolean b, final lta lta, final h07 h07) {
        final jcn jcn = new jcn(cg0, dg0.v, dg0.w.getValue(), n, dg0.x);
        long y;
        if (b) {
            y = dg0.y;
        }
        else {
            y = Long.MIN_VALUE;
        }
        final Object l = l(dg0, jcn, y, lta, h07);
        if (l == pc7.v) {
            return l;
        }
        return lqo.a;
    }
    
    public static final src r(final vee vee) {
        return ao2.n((jqc)jqc.d, (lta)new i1((Object)vee, (byte)18));
    }
    
    public static final String s(final cx7 cx7) {
        final StringBuilder sb = new StringBuilder(smk.s("service:", cx7.c));
        sb.append(",");
        final String e = cx7.e;
        final StringBuilder sb2 = new StringBuilder("version:");
        sb2.append(e);
        sb.append(sb2.toString());
        sb.append(",");
        final String i = cx7.i;
        final StringBuilder sb3 = new StringBuilder("sdk_version:");
        sb3.append(i);
        sb.append(sb3.toString());
        sb.append(",");
        final String d = cx7.d;
        final StringBuilder sb4 = new StringBuilder("env:");
        sb4.append(d);
        sb.append(sb4.toString());
        final String g = cx7.g;
        if (((CharSequence)g).length() > 0) {
            sb.append(",");
            final StringBuilder sb5 = new StringBuilder("variant:");
            sb5.append(g);
            sb.append(sb5.toString());
        }
        return sb.toString();
    }
    
    public static final boolean t(File value, final rjc rjc) {
        final Object false = Boolean.FALSE;
        final qjc x = qjc.x;
        final qjc w = qjc.w;
        Label_0074: {
            try {
                value = (File)Boolean.valueOf(value.canRead());
                return (boolean)value;
            }
            catch (final Exception ex) {}
            catch (final SecurityException ex2) {
                break Label_0074;
            }
            final Exception ex;
            c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)5), (Throwable)ex, 48);
            value = (File)false;
            return (boolean)value;
        }
        final SecurityException ex2;
        c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)4), (Throwable)ex2, 48);
        value = (File)false;
        return (boolean)value;
    }
    
    public static final boolean u(File value, final rjc rjc) {
        final Object false = Boolean.FALSE;
        final qjc x = qjc.x;
        final qjc w = qjc.w;
        Label_0074: {
            try {
                value = (File)Boolean.valueOf(value.canWrite());
                return (boolean)value;
            }
            catch (final Exception ex) {}
            catch (final SecurityException ex2) {
                break Label_0074;
            }
            final Exception ex;
            c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)5), (Throwable)ex, 48);
            value = (File)false;
            return (boolean)value;
        }
        final SecurityException ex2;
        c5q.F(rjc, 5, lq6.Y(w, x), (jta)new kz1(value, (byte)4), (Throwable)ex2, 48);
        value = (File)false;
        return (boolean)value;
    }
    
    public static String w(final long n) {
        final String format = String.format("%016x", new Object[] { n });
        final StringBuilder sb = new StringBuilder("44617461-646f-6721-");
        sb.append(format.substring(0, 4));
        sb.append("-");
        sb.append(format.substring(4));
        return sb.toString();
    }
    
    public static String x(final String s) {
        Label_0074: {
            try {
                if (!s.contains((CharSequence)"-")) {
                    break Label_0074;
                }
                final String[] split = s.split("-");
                if (split.length == 5) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(split[3]);
                    sb.append(split[4]);
                    return sb.toString();
                }
            }
            catch (final Exception ex) {
                throw new IllegalArgumentException("Exception when converting UUID to BigInteger: ".concat(s), (Throwable)ex);
            }
            throw new NumberFormatException("Invalid UUID format: ".concat(s));
        }
        String substring = s;
        if (s.length() == 32) {
            substring = s.substring(16);
        }
        return substring;
    }
    
    public static Handler y(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return zh0.b(looper);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(new Object[] { looper, null, Boolean.TRUE });
        }
        catch (final InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (!(cause instanceof Error)) {
                uy8.i(cause);
                return null;
            }
            throw (Error)cause;
        }
        catch (final NoSuchMethodException ex2) {}
        catch (final InstantiationException ex3) {}
        catch (final IllegalAccessException ex4) {}
        final Throwable t;
        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", t);
        return new Handler(looper);
    }
    
    public static final Object z(final zl6 zl6, final sei sei) {
        if (!zl6.z0().I) {
            gac.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        final e3h e3h = (e3h)soh.L(zl6).X;
        e3h.getClass();
        return ncq.K(e3h, sei);
    }
    
    public void v() {
    }
}
