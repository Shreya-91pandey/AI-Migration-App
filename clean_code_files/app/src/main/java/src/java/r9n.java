import java.lang.ref.Reference;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.content.res.TypedArray;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ExecutorService;
import com.anthropic.claude.analytics.events.AppStartEvents$InstallSource;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import kotlinx.coroutines.DispatchException;
import android.os.LocaleList;
import java.util.Arrays;
import java.util.Locale;
import android.content.res.Configuration;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.view.View;

public abstract class r9n
{
    public static final ye6 a;
    public static final ga0 b;
    public static final Object c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;
    
    public static final zh6 A(final View view) {
        final Object tag = view.getTag(2131296322);
        Object o;
        if (tag instanceof WeakReference) {
            o = tag;
        }
        else {
            o = null;
        }
        if (o != null) {
            return (zh6)((Reference)o).get();
        }
        return null;
    }
    
    public static final Object B(final i3c i3c, final o3a o3a) {
        final Object value = i3c.i().a.get((Object)o3a);
        if (value == null) {
            Object o;
            if ((o = i3c.f().n.a.get((Object)o3a)) == null) {
                o = o3a.v;
            }
            return o;
        }
        return value;
    }
    
    public static final Object C(final pfg pfg, final o3a o3a) {
        Object o;
        if ((o = pfg.c().a.get((Object)o3a)) == null) {
            o = o3a.v;
        }
        return o;
    }
    
    public static final Object D(Object o, final Object o2, final Object o3) {
        dqc dqc;
        if (o instanceof dqc) {
            dqc = (dqc)o;
        }
        else {
            dqc = null;
        }
        if (dqc == null) {
            return null;
        }
        final Object b = dqc.b;
        final Object a = dqc.a;
        if (mlc.q(a, o2) && mlc.q(b, o3)) {
            return o;
        }
        if ((o = D(a, o2, o3)) == null) {
            o = D(b, o2, o3);
        }
        return o;
    }
    
    public static final npm E(final a9m a9m) {
        return (npm)g8m.s((lpm)a9m.v, (jpm)a9m);
    }
    
    public static final String F(final r98 r98, final int n) {
        uoo.z((zl6)r98, (sei)q50.a);
        return ((Context)uoo.z((zl6)r98, (sei)q50.b)).getResources().getString(n);
    }
    
    public static final String G(final r98 r98, final int n, Object... copy) {
        final String f = F(r98, n);
        final LocaleList locales = ((Configuration)uoo.z((zl6)r98, (sei)q50.a)).getLocales();
        new(kpd.class)();
        Locale locale;
        if ((locale = locales.get(0)) == null) {
            locale = Locale.getDefault();
        }
        copy = Arrays.copyOf(copy, copy.length);
        return String.format(locale, f, Arrays.copyOf(copy, copy.length));
    }
    
    public static final void H(final hc7 hc7, Throwable o) {
        Object v = o;
        if (o instanceof DispatchException) {
            v = ((DispatchException)o).v;
        }
        Label_0047: {
            try {
                final jc7 jc7 = (jc7)hc7.M0((gc7)o55.x);
                if (jc7 != null) {
                    jc7.Q(hc7, (Throwable)v);
                    return;
                }
                break Label_0047;
            }
            finally {
                if (v == o) {
                    o = v;
                }
                else {
                    o = new RuntimeException("Exception while trying to handle coroutine exception", (Throwable)o);
                    soh.j((Throwable)o, (Throwable)v);
                }
                a3r.j(hc7, (Throwable)o);
                return;
                a3r.j(hc7, (Throwable)v);
            }
        }
    }
    
    public static final String I(final String s) {
        if (rym.E0(s, "https://", false)) {
            return "wss://".concat(kym.g1(s, "https://"));
        }
        if (rym.E0(s, "http://", false)) {
            return "ws://".concat(kym.g1(s, "http://"));
        }
        en9.s("Unknown protocol in URL: ".concat(s));
        return null;
    }
    
    public static boolean J(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (r9n.d == null) {
            r9n.d = packageManager.hasSystemFeature("android.hardware.type.watch");
        }
        Boolean e;
        if ((e = r9n.e) == null) {
            e = (r9n.e = context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return e && Build$VERSION.SDK_INT >= 30;
    }
    
    public static t03 K(final hc7 hc7, final zta zta) {
        return uoo.K((r03)new gld(hc7, 1, zta));
    }
    
    public static final igf L(final igf igf, final lta lta) {
        return igf.E((igf)new r6g(lta, true));
    }
    
    public static final igf M(final igf igf, final float n, final float n2) {
        return igf.E((igf)new m6g(n, n2));
    }
    
    public static igf N(final igf igf, float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 0.0f;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        return M(igf, n, n2);
    }
    
    public static kv2 O(final fdb fdb) {
        int size = fdb.size();
        int i = 0;
        int n = 1;
        String s = null;
        boolean b = false;
        boolean b2 = false;
        int n2 = -1;
        int n3 = -1;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        int n4 = -1;
        int n5 = -1;
        boolean b6 = false;
        boolean b7 = false;
        boolean b8 = false;
        while (i < size) {
            final String w = t08.w(fdb, i);
            final String y = t08.y(fdb, i);
            int n6 = 0;
            int n7 = 0;
            String s2 = null;
            boolean b9 = false;
            boolean b10 = false;
            int n8 = 0;
            int n9 = 0;
            boolean b11 = false;
            boolean b12 = false;
            boolean b13 = false;
            int n10 = 0;
            int n11 = 0;
            boolean b14 = false;
            boolean b15 = false;
            boolean b16 = false;
            Label_0852: {
                Label_0171: {
                    if (w.equalsIgnoreCase("Cache-Control")) {
                        if (s == null) {
                            s = y;
                            break Label_0171;
                        }
                    }
                    else {
                        n6 = size;
                        n7 = n;
                        s2 = s;
                        b9 = b;
                        b10 = b2;
                        n8 = n2;
                        n9 = n3;
                        b11 = b3;
                        b12 = b4;
                        b13 = b5;
                        n10 = n4;
                        n11 = n5;
                        b14 = b6;
                        b15 = b7;
                        b16 = b8;
                        if (!w.equalsIgnoreCase("Pragma")) {
                            break Label_0852;
                        }
                    }
                    n = 0;
                }
                int n12 = 0;
            Label_0174:
                while (true) {
                    n6 = size;
                    n7 = n;
                    s2 = s;
                    b9 = b;
                    b10 = b2;
                    n8 = n2;
                    n9 = n3;
                    b11 = b3;
                    b12 = b4;
                    b13 = b5;
                    n10 = n4;
                    n11 = n5;
                    b14 = b6;
                    b15 = b7;
                    b16 = b8;
                    if (n12 < y.length()) {
                        final int length = y.length();
                        int j = n12;
                        final int n13 = size;
                        while (true) {
                            while (j < length) {
                                if (kym.J0((CharSequence)"=,;", y.charAt(j))) {
                                    final String string = kym.B1((CharSequence)y.substring(n12, j)).toString();
                                    int v0 = 0;
                                    String s3 = null;
                                    Label_0553: {
                                        if (j != y.length() && y.charAt(j) != ',' && y.charAt(j) != ';') {
                                            int k = j + 1;
                                            final byte[] a = gcq.a;
                                            while (true) {
                                                while (k < y.length()) {
                                                    final char char1 = y.charAt(k);
                                                    if (char1 != ' ' && char1 != '\t') {
                                                        if (k < y.length() && y.charAt(k) == '\"') {
                                                            final int n14 = k + 1;
                                                            v0 = kym.V0((CharSequence)y, '\"', n14, 4);
                                                            s3 = y.substring(n14, v0);
                                                            ++v0;
                                                            break Label_0553;
                                                        }
                                                        while (true) {
                                                            for (int length2 = y.length(), l = k; l < length2; ++l) {
                                                                if (kym.J0((CharSequence)",;", y.charAt(l))) {
                                                                    s3 = kym.B1((CharSequence)y.substring(k, l)).toString();
                                                                    v0 = l;
                                                                    break Label_0553;
                                                                }
                                                            }
                                                            int l = y.length();
                                                            continue;
                                                        }
                                                    }
                                                    else {
                                                        ++k;
                                                    }
                                                }
                                                k = y.length();
                                                continue;
                                            }
                                        }
                                        v0 = j + 1;
                                        s3 = null;
                                    }
                                    Label_0567: {
                                        if ("no-cache".equalsIgnoreCase(string)) {
                                            b = true;
                                        }
                                        else if ("no-store".equalsIgnoreCase(string)) {
                                            b2 = true;
                                        }
                                        else {
                                            int n15;
                                            int n16;
                                            int n17;
                                            int n18;
                                            if ("max-age".equalsIgnoreCase(string)) {
                                                n15 = gcq.n(-1, s3);
                                                n16 = n5;
                                                n17 = n4;
                                                n18 = n3;
                                            }
                                            else if ("s-maxage".equalsIgnoreCase(string)) {
                                                n18 = gcq.n(-1, s3);
                                                n15 = n2;
                                                n17 = n4;
                                                n16 = n5;
                                            }
                                            else {
                                                if ("private".equalsIgnoreCase(string)) {
                                                    b3 = true;
                                                    break Label_0567;
                                                }
                                                if ("public".equalsIgnoreCase(string)) {
                                                    b4 = true;
                                                    break Label_0567;
                                                }
                                                if ("must-revalidate".equalsIgnoreCase(string)) {
                                                    b5 = true;
                                                    break Label_0567;
                                                }
                                                if ("max-stale".equalsIgnoreCase(string)) {
                                                    n17 = gcq.n(Integer.MAX_VALUE, s3);
                                                    n15 = n2;
                                                    n18 = n3;
                                                    n16 = n5;
                                                }
                                                else if ("min-fresh".equalsIgnoreCase(string)) {
                                                    n16 = gcq.n(-1, s3);
                                                    n15 = n2;
                                                    n18 = n3;
                                                    n17 = n4;
                                                }
                                                else {
                                                    if ("only-if-cached".equalsIgnoreCase(string)) {
                                                        b6 = true;
                                                        break Label_0567;
                                                    }
                                                    if ("no-transform".equalsIgnoreCase(string)) {
                                                        b7 = true;
                                                        break Label_0567;
                                                    }
                                                    n15 = n2;
                                                    n18 = n3;
                                                    n17 = n4;
                                                    n16 = n5;
                                                    if ("immutable".equalsIgnoreCase(string)) {
                                                        b8 = true;
                                                        break Label_0567;
                                                    }
                                                }
                                            }
                                            n2 = n15;
                                            n3 = n18;
                                            n4 = n17;
                                            n5 = n16;
                                        }
                                    }
                                    n12 = v0;
                                    size = n13;
                                    continue Label_0174;
                                }
                                ++j;
                            }
                            j = y.length();
                            continue;
                        }
                    }
                    break;
                }
            }
            ++i;
            size = n6;
            n = n7;
            s = s2;
            b = b9;
            b2 = b10;
            n2 = n8;
            n3 = n9;
            b3 = b11;
            b4 = b12;
            b5 = b13;
            n4 = n10;
            n5 = n11;
            b6 = b14;
            b7 = b15;
            b8 = b16;
        }
        if (n == 0) {
            s = null;
        }
        return new kv2(b, b2, n2, n3, b3, b4, b5, n4, n5, b6, b7, b8, s);
    }
    
    public static final void R(final y5m y5m, int g, final Object o) {
        g = y5m.g(g);
        final Object[] c = y5m.c;
        final Object o2 = c[g];
        c[g] = bi6.a;
        if (o == o2) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Slot table is out of sync (expected ");
        sb.append(o);
        sb.append(", got ");
        sb.append(o2);
        sb.append(")");
        ti6.a(sb.toString());
    }
    
    public static final void S(int s, final int n, final List list) {
        final int n2 = s = s(s, list);
        if (n2 < 0) {
            s = -(n2 + 1);
        }
        while (s < list.size() && ((bmc)list.get(s)).b < n) {
            final bmc bmc = (bmc)list.remove(s);
        }
    }
    
    public static final void T(final q8k q8k, final HashSet a, final gva gva, final int n) {
        gva.i0(-2131060952);
        int n2;
        if (gva.h((Object)q8k)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)a)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        if (((n2 | n | n3) & 0x13) == 0x12 && gva.F()) {
            gva.Z();
        }
        else {
            gva.g0(941409598);
            final boolean f = gva.f((Object)q8k);
            final Object r = gva.R();
            final cib a2 = bi6.a;
            Object o;
            if (f || (o = r) == a2) {
                o = new Object();
                ((svc)o).a = a;
                gva.q0(o);
            }
            final svc svc = (svc)o;
            gva.q(false);
            gva.g0(941412240);
            final boolean h = gva.h((Object)svc);
            final boolean h2 = gva.h((Object)a);
            final boolean h3 = gva.h((Object)q8k);
            final Object r2 = gva.R();
            Object o2;
            if ((h | h2 | h3) || (o2 = r2) == a2) {
                o2 = new rx1((Object)svc, (Object)a, (Object)q8k, (byte)4);
                gva.q0(o2);
            }
            final lta lta = (lta)o2;
            gva.q(false);
            mlc.b((Object)q8k, (Object)a, lta, gva);
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)q8k, (Object)a, n, (byte)5);
        }
    }
    
    public static long U(final String s) {
        final int length = s.length();
        long n = 0L;
        if (length < 0) {
            oyl.g((Object)oz1.n("endIndex < beginIndex: ", length, " < 0"));
            return 0L;
        }
        if (length <= s.length()) {
            int i = 0;
            while (i < length) {
                final char char1 = s.charAt(i);
                if (char1 < '\u0080') {
                    ++n;
                }
                else {
                    long n2;
                    if (char1 < '\u0800') {
                        n2 = 2L;
                    }
                    else if (char1 >= '\ud800' && char1 <= '\udfff') {
                        final int n3 = i + 1;
                        char char2;
                        if (n3 < length) {
                            char2 = s.charAt(n3);
                        }
                        else {
                            char2 = '\0';
                        }
                        if (char1 <= '\udbff' && char2 >= '\udc00' && char2 <= '\udfff') {
                            n += 4L;
                            i += 2;
                            continue;
                        }
                        ++n;
                        i = n3;
                        continue;
                    }
                    else {
                        n2 = 3L;
                    }
                    n += n2;
                }
                ++i;
            }
            return n;
        }
        oyl.e(s.length(), hia.p(length, "endIndex > string.length: ", " > "));
        return 0L;
    }
    
    public static void V(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                en9.s(smk.p(n2, "negative size: "));
                return;
            }
            s = wp7.x("%s (%s) must be less than size (%s)", new Object[] { "index", n, n2 });
        }
        else {
            s = wp7.x("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void W(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = wp7.x("end index (%s) must not be less than start index (%s)", new Object[] { n2, n });
            }
            else {
                s = X(n2, n3, "end index");
            }
        }
        else {
            s = X(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static String X(final int n, final int n2, final String s) {
        if (n < 0) {
            return wp7.x("%s (%s) must not be negative", new Object[] { s, n });
        }
        if (n2 >= 0) {
            return wp7.x("%s (%s) must not be greater than size (%s)", new Object[] { s, n, n2 });
        }
        en9.s(smk.p(n2, "negative size: "));
        return null;
    }
    
    public static final void a(final dq4 dq4, final igf igf, final vlm vlm, final ye6 ye6, final gva gva, final int n) {
        gva.i0(1655887121);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)dq4)) {
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
            if (gva.f((Object)igf)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            boolean b;
            if ((n & 0x200) == 0x0) {
                b = gva.f((Object)vlm);
            }
            else {
                b = gva.h((Object)vlm);
            }
            int n7;
            if (b) {
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
            if (gva.h((Object)ye6)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        if ((n8 & 0x493) == 0x492 && gva.F()) {
            gva.Z();
        }
        else {
            final r8k f0 = lq6.f0(gva);
            final sya c = dq4.c;
            final HashSet set = new HashSet();
            final Iterator iterator = ((n1)c).iterator();
            while (iterator.hasNext()) {
                set.add((Object)((hp4)iterator.next()).b());
            }
            T((q8k)f0, set, gva, 0);
            final wlm wlm = (wlm)gva.j((sei)xlm.a);
            gva.g0(1536070947);
            vlm vlm3;
            if (vlm == null) {
                gva.g0(1536071350);
                final boolean f2 = gva.f((Object)wlm);
                final Object r = gva.R();
                vlm vlm2;
                if (f2 || (vlm2 = (vlm)r) == bi6.a) {
                    wlm.getClass();
                    vlm2 = null;
                    gva.q0((Object)null);
                }
                vlm3 = vlm2;
                gva.q(false);
            }
            else {
                vlm3 = vlm;
            }
            gva.q(false);
            Object o = vlm3;
            if (vlm3 == null) {
                o = new Object();
            }
            ((vlm)o).a(dq4, igf, uuj.t0(-995173764, (aua)new gq4(f0, ye6), gva), gva, (n8 & 0xE) | 0x180 | (n8 & 0x70));
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new fq4(dq4, igf, vlm, ye6, n, (byte)0);
        }
    }
    
    public static final cd8 b(final Context context) {
        final float fontScale = context.getResources().getConfiguration().fontScale;
        final float density = context.getResources().getDisplayMetrics().density;
        Object a;
        if ((a = qoa.a(fontScale)) == null) {
            a = new kdd(fontScale);
        }
        return new cd8(density, fontScale, (poa)a);
    }
    
    public static final igf c(final igf igf, final lta lta) {
        return igf.E((igf)new r6g(lta, false));
    }
    
    public static final boolean e(final npm npm, final int n, final n4h c) {
        final Object c2;
        monitorenter(c2 = r9n.c);
        Label_0052: {
            boolean b = false;
            Label_0046: {
                try {
                    final int d = npm.d;
                    if (d == n) {
                        npm.c = c;
                        b = true;
                        npm.d = d + 1;
                        break Label_0046;
                    }
                }
                finally {
                    break Label_0052;
                }
                b = false;
            }
            monitorexit(c2);
            return b;
        }
        monitorexit(c2);
    }
    
    public static final k2j f(final nzc nzc) {
        final nzc d = nzc.D();
        if (d != null) {
            return d.L(nzc, true);
        }
        return new k2j(0.0f, 0.0f, (float)(int)(nzc.k() >> 32), (float)(int)(nzc.k() & 0xFFFFFFFFL));
    }
    
    public static final k2j g(final nzc nzc, final boolean b) {
        final nzc t = t(nzc);
        final float n = (float)(int)(t.k() >> 32);
        final float n2 = (float)(int)(t.k() & 0xFFFFFFFFL);
        final k2j l = t.L(nzc, b);
        final float a = l.a;
        final float n3 = 0.0f;
        float n4 = a;
        if (b) {
            float n5 = a;
            if (a < 0.0f) {
                n5 = 0.0f;
            }
            n4 = n5;
            if (n5 > n) {
                n4 = n;
            }
        }
        float b2;
        final float n6 = b2 = l.b;
        if (b) {
            float n7 = n6;
            if (n6 < 0.0f) {
                n7 = 0.0f;
            }
            b2 = n7;
            if (n7 > n2) {
                b2 = n2;
            }
        }
        float c;
        final float n8 = c = l.c;
        if (b) {
            float n9 = n8;
            if (n8 < 0.0f) {
                n9 = 0.0f;
            }
            if (n9 > n) {
                n9 = n;
            }
            c = n9;
        }
        float d;
        final float n10 = d = l.d;
        if (b) {
            if (n10 < 0.0f) {
                d = n3;
            }
            else {
                d = n10;
            }
            if (d > n2) {
                d = n2;
            }
        }
        if (n4 != c) {
            if (b2 != d) {
                final long b3 = t.b((long)Float.floatToRawIntBits(n4) << 32 | ((long)Float.floatToRawIntBits(b2) & 0xFFFFFFFFL));
                final long b4 = t.b((long)Float.floatToRawIntBits(c) << 32 | ((long)Float.floatToRawIntBits(b2) & 0xFFFFFFFFL));
                final long b5 = t.b((long)Float.floatToRawIntBits(c) << 32 | ((long)Float.floatToRawIntBits(d) & 0xFFFFFFFFL));
                final long b6 = t.b(((long)Float.floatToRawIntBits(d) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(n4) << 32);
                final float intBitsToFloat = Float.intBitsToFloat((int)(b3 >> 32));
                final float intBitsToFloat2 = Float.intBitsToFloat((int)(b4 >> 32));
                final float intBitsToFloat3 = Float.intBitsToFloat((int)(b6 >> 32));
                final float intBitsToFloat4 = Float.intBitsToFloat((int)(b5 >> 32));
                final float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
                final float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
                final float intBitsToFloat5 = Float.intBitsToFloat((int)(b3 & 0xFFFFFFFFL));
                final float intBitsToFloat6 = Float.intBitsToFloat((int)(b4 & 0xFFFFFFFFL));
                final float intBitsToFloat7 = Float.intBitsToFloat((int)(b6 & 0xFFFFFFFFL));
                final float intBitsToFloat8 = Float.intBitsToFloat((int)(b5 & 0xFFFFFFFFL));
                return new k2j(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
            }
        }
        return k2j.e;
    }
    
    public static AppStartEvents$InstallSource h(String string) {
        if (string != null) {
            string = kym.B1((CharSequence)string).toString();
        }
        else {
            string = null;
        }
        if (string != null) {
            switch (string.hashCode()) {
                default: {
                    return AppStartEvents$InstallSource.D;
                }
                case 560468770: {
                    if (!string.equals((Object)"com.xiaomi.market")) {
                        return AppStartEvents$InstallSource.D;
                    }
                    break;
                }
                case 421787184: {
                    if (!string.equals((Object)"com.xiaomi.mipicks")) {
                        return AppStartEvents$InstallSource.D;
                    }
                    break;
                }
                case 394871662: {
                    if (!string.equals((Object)"com.android.packageinstaller")) {
                        return AppStartEvents$InstallSource.D;
                    }
                    return AppStartEvents$InstallSource.C;
                }
                case 307846473: {
                    if (!string.equals((Object)"com.google.android.packageinstaller")) {
                        return AppStartEvents$InstallSource.D;
                    }
                    return AppStartEvents$InstallSource.C;
                }
                case 0: {
                    if (!string.equals((Object)"")) {
                        return AppStartEvents$InstallSource.D;
                    }
                    return AppStartEvents$InstallSource.C;
                }
                case -1046965711: {
                    if (!string.equals((Object)"com.android.vending")) {
                        return AppStartEvents$InstallSource.D;
                    }
                    return AppStartEvents$InstallSource.x;
                }
                case -1225090538: {
                    if (!string.equals((Object)"com.sec.android.app.samsungapps")) {
                        return AppStartEvents$InstallSource.D;
                    }
                    return AppStartEvents$InstallSource.z;
                }
                case -1637701853: {
                    if (!string.equals((Object)"com.huawei.appmarket")) {
                        return AppStartEvents$InstallSource.D;
                    }
                    return AppStartEvents$InstallSource.A;
                }
                case -1859733809: {
                    if (!string.equals((Object)"com.amazon.venezia")) {
                        return AppStartEvents$InstallSource.D;
                    }
                    return AppStartEvents$InstallSource.y;
                }
            }
            return AppStartEvents$InstallSource.B;
        }
        return AppStartEvents$InstallSource.C;
    }
    
    public static final void l(final int n, final int n2) {
        if (n > 0 && n2 > 0) {
            return;
        }
        String s;
        if (n != n2) {
            s = hia.g(n, n2, "Both size ", " and step ", " must be greater than zero.");
        }
        else {
            s = oz1.n("size ", n, " must be greater than zero.");
        }
        oyl.g((Object)s);
    }
    
    public static final void m(AutoCloseable autoCloseable, final Throwable t) {
        if (autoCloseable != null) {
            if (t == null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                }
                else if (autoCloseable instanceof ExecutorService) {
                    autoCloseable = autoCloseable;
                    if (autoCloseable != ForkJoinPool.commonPool()) {
                        int n = ((ExecutorService)autoCloseable).isTerminated() ? 1 : 0;
                        if (n == 0) {
                            ((ExecutorService)autoCloseable).shutdown();
                            int n2 = 0;
                            while (true) {
                                final int n3 = n;
                                if (n3 != 0) {
                                    break;
                                }
                                try {
                                    n = (((ExecutorService)autoCloseable).awaitTermination(1L, TimeUnit.DAYS) ? 1 : 0);
                                }
                                catch (final InterruptedException ex) {
                                    n = n3;
                                    if (n2 != 0) {
                                        continue;
                                    }
                                    ((ExecutorService)autoCloseable).shutdownNow();
                                    n2 = 1;
                                    n = n3;
                                }
                            }
                            if (n2 != 0) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
                else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray)autoCloseable).recycle();
                }
                else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever)autoCloseable).release();
                }
                else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        fvd.w();
                        return;
                    }
                    ((MediaDrm)autoCloseable).release();
                }
            }
            else {
                try {
                    gcp.e(autoCloseable);
                }
                finally {
                    final Throwable t2;
                    soh.j(t, t2);
                }
            }
        }
    }
    
    public static final void n(final u5m u5m, final ArrayList list, final int n) {
        final boolean l = u5m.l(n);
        final int[] b = u5m.b;
        if (l) {
            list.add(u5m.n(n));
            return;
        }
        for (int i = n + 1; i < b[n * 5 + 3] + n; i += b[i * 5 + 3]) {
            n(u5m, list, i);
        }
    }
    
    public static final void p(final cw8 cw8, final g6b g6b) {
        g6b.c(cw8.B0().t(), (g6b)cw8.B0().w);
    }
    
    public static final k2j q(final hgf hgf, final boolean b, final boolean b2) {
        if (!hgf.v.I) {
            return k2j.e;
        }
        if (!b) {
            final yxf j = soh.J((t98)hgf, 8);
            return t((nzc)j).L((nzc)j, b2);
        }
        return soh.J((t98)hgf, 8).E1();
    }
    
    public static final int r(final View view, final int n) {
        int n2 = 0;
        int n3 = Integer.MAX_VALUE;
        final Object o = null;
        View view2 = view;
        Object obj = o;
        while (view2 != null) {
            final Object tag = view2.getTag(n);
            int n4 = n3;
            Object o2 = obj;
            if (tag != null) {
                if (obj == null) {
                    o2 = tag;
                }
                else {
                    o2 = obj;
                    if (!tag.equals(obj)) {
                        break;
                    }
                }
                n4 = n2;
            }
            ++n2;
            final ViewParent z = soh.z(view2);
            if (z instanceof View) {
                view2 = (View)z;
                n3 = n4;
                obj = o2;
            }
            else {
                view2 = null;
                n3 = n4;
                obj = o2;
            }
        }
        return n3;
    }
    
    public static final int s(final int n, final List list) {
        int n2 = list.size() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int u = mlc.u(((bmc)list.get(n3)).b, n);
            if (u < 0) {
                i = n3 + 1;
            }
            else {
                if (u <= 0) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final nzc t(nzc d) {
        final nzc d2 = d.D();
        nzc nzc = d;
        d = d2;
        yxf yxf;
        while (true) {
            yxf = (yxf)nzc;
            nzc = d;
            if (nzc == null) {
                break;
            }
            d = nzc.D();
        }
        yxf yxf2;
        if (yxf instanceof yxf) {
            yxf2 = yxf;
        }
        else {
            yxf2 = null;
        }
        if (yxf2 == null) {
            return (nzc)yxf;
        }
        final yxf t = yxf2.T;
        Object o = yxf2;
        yxf t2 = t;
        Object o2;
        while (true) {
            o2 = o;
            o = t2;
            if (o == null) {
                break;
            }
            t2 = ((yxf)o).T;
        }
        return (nzc)o2;
    }
    
    public static final xgc u(int i, final CharSequence charSequence) {
        if (i != 0) {
            final int n = --i;
            while (i >= 0) {
                final char char1 = charSequence.charAt(i);
                if (char1 == '/') {
                    if (i == 0 || lq6.V(charSequence.charAt(i - 1))) {
                        return (xgc)new vgc(i, n, 1);
                    }
                    break;
                }
                else {
                    if (lq6.V(char1)) {
                        break;
                    }
                    --i;
                }
            }
        }
        return null;
    }
    
    public static final View v(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        final int min = Math.min(r(view, 2131297128), r(view, 2131297131));
        View view2 = view;
        int n = 0;
        View view3 = view2;
        while (true) {
            final View view4 = view2;
            if (view == null) {
                return view3;
            }
            if (n == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view4;
                }
                break;
            }
            else {
                if (A(view) != null) {
                    break;
                }
                ++n;
                final ViewParent z = soh.z(view);
                View view5;
                if (z instanceof View) {
                    view5 = (View)z;
                }
                else {
                    view5 = null;
                }
                final View view6 = view;
                view = view5;
                view3 = view4;
                view2 = view6;
            }
        }
        return view;
    }
    
    public static j0k w(String s, final rjc rjc) {
        Label_0172: {
            Label_0163: {
                Label_0154: {
                    Label_0145: {
                        try {
                            final zrc e = vt4.Z(s).e();
                            s = e.o("type").i();
                            if (mlc.q((Object)s, (Object)"view")) {
                                s = e.o("viewId").i();
                                final long f = e.o("documentVersion").f();
                                final irc o = e.o("hasAccessibility");
                                final boolean b = o != null && o.a();
                                s.getClass();
                                return new j0k(s, f, Boolean.valueOf(b));
                            }
                        }
                        catch (final NumberFormatException ex) {
                            break Label_0145;
                        }
                        catch (final IllegalStateException ex2) {
                            break Label_0154;
                        }
                        catch (final ClassCastException ex3) {
                            break Label_0163;
                        }
                        catch (final NullPointerException ex4) {
                            break Label_0172;
                        }
                        c5q.E(rjc, 5, qjc.v, (jta)new h0k(s, (byte)2), (Throwable)null, false, 56);
                        return null;
                    }
                    final NumberFormatException ex;
                    oyl.n("Unable to parse json into RUM event meta", (Throwable)ex);
                    return null;
                }
                final IllegalStateException ex2;
                oyl.n("Unable to parse json into RUM event meta", (Throwable)ex2);
                return null;
            }
            final ClassCastException ex3;
            oyl.n("Unable to parse json into RUM event meta", (Throwable)ex3);
            return null;
        }
        final NullPointerException ex4;
        oyl.n("Unable to parse json into RUM event meta", (Throwable)ex4);
        return null;
    }
    
    public static flj x(final zrc zrc) {
        Label_0080: {
            Label_0071: {
                Label_0062: {
                    String i = null;
                    String j = null;
                    Label_0045: {
                        try {
                            i = zrc.o("id").i();
                            final irc o = zrc.o("current_locale");
                            if (o != null) {
                                j = o.i();
                                break Label_0045;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0062;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0071;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0080;
                        }
                        j = null;
                    }
                    i.getClass();
                    return new flj(i, j);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Application", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Application", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Application", (Throwable)ex3);
        return null;
    }
    
    public static mei y(final String s) {
        if (s.equals("http/1.0")) {
            return mei.w;
        }
        if (s.equals("http/1.1")) {
            return mei.x;
        }
        if (s.equals("h2_prior_knowledge")) {
            return mei.A;
        }
        if (s.equals("h2")) {
            return mei.z;
        }
        if (s.equals("spdy/3.1")) {
            return mei.y;
        }
        if (s.equals("quic")) {
            return mei.B;
        }
        if (rym.E0(s, "h3", false)) {
            return mei.C;
        }
        uy8.h("Unexpected protocol: ".concat(s));
        return null;
    }
    
    public void P(final a3 a3, final a3 b) {
        a3.b = b;
    }
    
    public void Q(final a3 a3, final Thread a4) {
        a3.a = a4;
    }
    
    public void d(final afj afj, final Object o) {
        final okf okf = (okf)o;
        if (okf != null) {
            afj.i.f(okf);
        }
    }
    
    public boolean i(final b3 b3, final x2 x2, final x2 w) {
        monitorenter(b3);
        Label_0027: {
            try {
                if (b3.w == x2) {
                    b3.w = w;
                    monitorexit(b3);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(b3);
                monitorexit(b3);
                return false;
            }
        }
    }
    
    public boolean j(final b3 b3, final Object o, final Object v) {
        monitorenter(b3);
        Label_0027: {
            try {
                if (b3.v == o) {
                    b3.v = v;
                    monitorexit(b3);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(b3);
                monitorexit(b3);
                return false;
            }
        }
    }
    
    public boolean k(final b3 b3, final a3 a3, final a3 x) {
        monitorenter(b3);
        Label_0027: {
            try {
                if (b3.x == a3) {
                    b3.x = x;
                    monitorexit(b3);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(b3);
                monitorexit(b3);
                return false;
            }
        }
    }
    
    public boolean o(final tei tei) {
        return false;
    }
    
    public Object z(final tei tei) {
        throw new IllegalStateException("");
    }
}
