import java.util.AbstractCollection;
import android.text.Layout$Alignment;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.SubscriptSpan;
import android.text.style.StyleSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.AlignmentSpan;
import android.text.style.AbsoluteSizeSpan;
import android.text.Html$TagHandler;
import android.text.Html$ImageGetter;
import android.text.Html;
import android.util.Base64;
import java.util.Iterator;
import com.google.firebase.components.DependencyCycleException;
import java.util.Collection;
import io.sentry.c2;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import com.anthropic.claude.types.strings.EmailAddress;
import java.util.List;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.layout.b;
import android.os.Build$VERSION;
import java.io.IOException;
import androidx.datastore.core.CorruptionException;
import java.io.File;
import android.content.Context;
import sun.misc.Unsafe;
import java.util.NoSuchElementException;

public abstract class ncq
{
    public static xzj a;
    public static final Object b;
    public static final ynb c;
    public static final String[] d;
    
    public static plj A(final zrc zrc) {
        Label_0164: {
            Label_0156: {
                Label_0148: {
                    dmj d = null;
                    Label_0050: {
                        try {
                            final irc o = zrc.o("plan");
                            if (o != null) {
                                final String i = o.i();
                                if (i != null) {
                                    d = nbr.d(i);
                                    break Label_0050;
                                }
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0148;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0156;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0164;
                        }
                        d = null;
                    }
                    final irc o2 = zrc.o("session_precondition");
                    final int n = 0;
                    final int n2 = 0;
                    int n3 = n;
                    if (o2 != null) {
                        final String j = o2.i();
                        n3 = n;
                        if (j != null) {
                            final int[] f = ge9.F(7);
                            for (int length = f.length, k = n2; k < length; ++k) {
                                final int n4 = f[k];
                                if (lmf.m(n4).equals(j)) {
                                    n3 = n4;
                                    return new plj(d, n3);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    return new plj(d, n3);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type DdSession", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type DdSession", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type DdSession", (Throwable)ex3);
        return null;
    }
    
    public static final l13 B(final f07 f07) {
        if (!(f07 instanceof oo8)) {
            return new l13(1, f07);
        }
        final oo8 oo8 = (oo8)f07;
        final long c = oo8.C;
        Unsafe unsafe = null;
        l13 l13 = null;
        l13 l14 = null;
    Label_0102:
        while (true) {
            unsafe = u51.a;
            final Object objectVolatile = unsafe.getObjectVolatile((Object)oo8, c);
            l13 = null;
            final dxm b = po8.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile((Object)oo8, c, (Object)b);
                l14 = null;
                break;
            }
            if (objectVolatile instanceof l13) {
                do {
                    unsafe = u51.a;
                    if (unsafe.compareAndSwapObject((Object)oo8, oo8.C, objectVolatile, (Object)b)) {
                        l14 = (l13)objectVolatile;
                        break Label_0102;
                    }
                } while (unsafe.getObjectVolatile((Object)oo8, c) == objectVolatile);
            }
            else {
                if (objectVolatile == b) {
                    continue;
                }
                if (objectVolatile instanceof Throwable) {
                    continue;
                }
                en9.q(oz1.m(objectVolatile, "Inconsistent state "));
                return null;
            }
        }
        if (l14 != null) {
            final long c2 = l13.C;
            final Object objectVolatile2 = unsafe.getObjectVolatile((Object)l14, c2);
            if (objectVolatile2 instanceof ad6 && ((ad6)objectVolatile2).d != null) {
                l14.m();
                l14 = l13;
            }
            else {
                unsafe.putIntVolatile((Object)l14, l13.A, 536870911);
                unsafe.putObjectVolatile((Object)l14, c2, (Object)cd.v);
            }
            if (l14 != null) {
                return l14;
            }
        }
        return new l13(2, f07);
    }
    
    public static final boolean C(final t2h t2h) {
        if (t2h.equals(s2h.a)) {
            return false;
        }
        if (t2h instanceof r2h) {
            return ((r2h)t2h).a;
        }
        en9.r();
        return false;
    }
    
    public static int D(final int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 4) {
            return 2;
        }
        if (n == 8) {
            return 3;
        }
        if (n == 16) {
            return 4;
        }
        if (n == 32) {
            return 5;
        }
        if (n == 64) {
            return 6;
        }
        if (n == 128) {
            return 7;
        }
        if (n == 256) {
            return 8;
        }
        if (n == 512) {
            return 9;
        }
        en9.s(smk.p(n, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }
    
    public static vyk E(final zta zta) {
        final vyk vyk = new vyk();
        vyk.d(ljq.z((f07)vyk, (f07)vyk, zta));
        return vyk;
    }
    
    public static d2d F(int d, final jta jta) {
        final o55 d2 = o55.D;
        d = ge9.D(d);
        if (d == 0) {
            return (d2d)new l7n(jta);
        }
        if (d == 1) {
            final Object o = new Object();
            ((a7k)o).v = jta;
            ((a7k)o).w = d2;
            return (d2d)o;
        }
        if (d == 2) {
            final Object o2 = new Object();
            ((uro)o2).v = jta;
            ((uro)o2).w = d2;
            return (d2d)o2;
        }
        en9.r();
        return null;
    }
    
    public static final bnf G(final zta zta, final gva gva, Object o) {
        final Object r = gva.R();
        final cib a = bi6.a;
        Object q = r;
        if (r == a) {
            q = o50.Q(o);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        final boolean h = gva.h((Object)zta);
        final Object r2 = gva.R();
        if (h || (o = r2) == a) {
            o = new s8m(zta, bnf, (f07)null, (byte)0);
            gva.q0(o);
        }
        mlc.f((zta)o, gva, lqo.a);
        return bnf;
    }
    
    public static final bnf H(Object o, final Object o2, final zta zta, final gva gva, final int n) {
        final Object r = gva.R();
        final cib a = bi6.a;
        Object q = r;
        if (r == a) {
            q = o50.Q(o);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        final boolean h = gva.h((Object)zta);
        final Object r2 = gva.R();
        if (h || (o = r2) == a) {
            o = new t8m(zta, bnf, (f07)null, (byte)0);
            gva.q0(o);
        }
        mlc.f((zta)o, gva, o2);
        return bnf;
    }
    
    public static final bnf I(Object o, final Object o2, final Object o3, final zta zta, final gva gva, final int n) {
        final Object r = gva.R();
        final cib a = bi6.a;
        Object q = r;
        if (r == a) {
            q = o50.Q(o);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        final boolean h = gva.h((Object)zta);
        final Object r2 = gva.R();
        if (h || (o = r2) == a) {
            o = new s8m(zta, bnf, (f07)null, (byte)1);
            gva.q0(o);
        }
        mlc.g(o2, o3, (zta)o, gva);
        return bnf;
    }
    
    public static final bnf J(Object o, final Object o2, final Object o3, final Object o4, final zta zta, final gva gva, final int n) {
        final Object r = gva.R();
        final cib a = bi6.a;
        Object q = r;
        if (r == a) {
            q = o50.Q(o);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        final boolean h = gva.h((Object)zta);
        final Object r2 = gva.R();
        if (h || (o = r2) == a) {
            o = new t8m(zta, bnf, (f07)null, (byte)1);
            gva.q0(o);
        }
        mlc.h(o2, o3, o4, (zta)o, gva);
        return bnf;
    }
    
    public static final Object K(final e3h e3h, final sei sei) {
        sei.getClass();
        Object o;
        if ((o = e3h.get((Object)sei)) == null) {
            o = sei.b();
        }
        return ((a6p)o).a(e3h);
    }
    
    public static final q7h L(final int n, final int n2, final int n3, final lta lta, final gva gva, boolean b) {
        if ((n3 & 0x2) != 0x0) {
            b = false;
        }
        final bnf w = o50.W(n, gva);
        final boolean f = gva.f((Object)w);
        final Object r = gva.R();
        Object o;
        if (f || (o = r) == bi6.a) {
            o = new wkg(w, (byte)8);
            gva.q0(o);
        }
        return M((jta)o, b, lta, gva, n2 & 0x3F0, 0);
    }
    
    public static final q7h M(final jta jta, boolean b, final lta lta, final gva gva, final int n, int n2) {
        if ((n2 & 0x2) != 0x0) {
            b = false;
        }
        final Context applicationContext = ((Context)gva.j((sei)q50.b)).getApplicationContext();
        final bnf w = o50.W(jta, gva);
        final int n3 = (n & 0x70) ^ 0x30;
        final int n4 = 1;
        if ((n3 > 32 && gva.g(b)) || (n & 0x30) == 0x20) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Object r = gva.R();
        final String[] d = ncq.d;
        final cib a = bi6.a;
        Object o;
        if (n2 != 0 || (o = r) == a) {
            if (b) {
                o = new txa(d);
            }
            else {
                o = new Object();
            }
            gva.q0(o);
        }
        final de de = (de)o;
        if ((n3 > 32 && gva.g(b)) || (n & 0x30) == 0x20) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Object r2 = gva.R();
        Object o2;
        if (n2 != 0 || (o2 = r2) == a) {
            if (b) {
                o2 = new zxa(d);
            }
            else {
                o2 = new Object();
            }
            gva.q0(o2);
        }
        final ee ee = (ee)o2;
        String s;
        if (b) {
            s = "*/*";
        }
        else {
            s = "image/*";
        }
        final int n5 = (n & 0x380) ^ 0x180;
        if ((n5 > 256 && gva.f((Object)lta)) || (n & 0x180) == 0x100) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Object r3 = gva.R();
        Object o3;
        if (n2 != 0 || (o3 = r3) == a) {
            o3 = new mv2(lta, (byte)6);
            gva.q0(o3);
        }
        final a1e d2 = k8e.D(de, (lta)o3, gva, 0);
        final boolean f = gva.f((Object)w);
        final boolean h = gva.h((Object)applicationContext);
        Label_0416: {
            if (n5 > 256) {
                n2 = n4;
                if (gva.f((Object)lta)) {
                    break Label_0416;
                }
            }
            if ((n & 0x180) == 0x100) {
                n2 = n4;
            }
            else {
                n2 = 0;
            }
        }
        final Object r4 = gva.R();
        Object o4;
        if ((((f | h) ? 1 : 0) | n2) != 0x0 || (o4 = r4) == a) {
            o4 = new rx1(applicationContext, lta, w);
            gva.q0(o4);
        }
        final a1e d3 = k8e.D(ee, (lta)o4, gva, 0);
        final boolean f2 = gva.f((Object)s);
        final Object r5 = gva.R();
        q7h q7h;
        if (f2 || (q7h = (q7h)r5) == a) {
            q7h = new q7h(new ny1(w, (byte)17), d2, d3, s);
            gva.q0((Object)q7h);
        }
        return q7h;
    }
    
    public static final Object N(final File v, final lta lta, h07 v2) {
        Object o = null;
        Label_0050: {
            if (v2 instanceof wca) {
                o = v2;
                final int x = ((wca)o).x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    ((wca)o).x = x + Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            o = new h07(v2);
        }
        final Object w = ((wca)o).w;
        final int x2 = ((wca)o).x;
        Label_0098: {
            if (x2 == 0) {
                break Label_0098;
            }
            Label_0090: {
                if (x2 != 1) {
                    break Label_0090;
                }
                v2 = (h07)((wca)o).v;
                try {
                    vt4.g0(w);
                    return w;
                }
                catch (final IOException ex) {
                    if (ex instanceof CorruptionException) {
                        throw ex;
                    }
                    throw ikq.d((File)v2, ex);
                    vt4.g0(w);
                    ((wca)o).v = v;
                    ((wca)o).x = 1;
                    final Object b = lta.b(o);
                    final pc7 v3 = pc7.v;
                    iftrue(Label_0141:)(b != v3);
                    return v3;
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                    Label_0141: {
                        return b;
                    }
                }
            }
        }
    }
    
    public static vgc O(int n, final xgc xgc) {
        if (n > 0) {
            final int v = ((vgc)xgc).v;
            final int w = ((vgc)xgc).w;
            if (((vgc)xgc).x <= 0) {
                n = -n;
            }
            return new vgc(v, w, n);
        }
        fvd.x((Object)n, "Step must be positive, was: ");
        return null;
    }
    
    public static final igf P(final igf igf) {
        if (Build$VERSION.SDK_INT < 29) {
            return igf;
        }
        return igf.E((igf)new Object());
    }
    
    public static final long Q(final String s, long longValue, final long n, final long n2) {
        final int a = m8n.a;
        String property;
        try {
            property = System.getProperty(s);
        }
        catch (final SecurityException ex) {
            property = null;
        }
        if (property == null) {
            return longValue;
        }
        final Long h0 = rym.H0(property);
        if (h0 == null) {
            final StringBuilder sb = new StringBuilder("System property '");
            sb.append(s);
            sb.append("' has unrecognized value '");
            sb.append(property);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        longValue = h0;
        if (n <= longValue && longValue <= n2) {
            return longValue;
        }
        final StringBuilder q = hia.q(n, "System property '", s, "' should be in range ");
        smk.y(q, "..", n2, ", but is '");
        q.append(longValue);
        q.append('\'');
        throw new IllegalStateException(q.toString().toString());
    }
    
    public static int R(final int n, int n2, final String s) {
        if ((n2 & 0x8) != 0x0) {
            n2 = Integer.MAX_VALUE;
        }
        else {
            n2 = 2097150;
        }
        return (int)Q(s, n, 1L, n2);
    }
    
    public static final void S(final long n, final String s) {
        if (Build$VERSION.SDK_INT >= 29) {
            d40.g(n, s);
        }
    }
    
    public static xgc T(final int n, final int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            final xgc y = xgc.y;
            return xgc.y;
        }
        return (xgc)new vgc(n, n2 - 1, 1);
    }
    
    public static final e3h U(final ffi[] array, final e3h e3h, final e3h e3h2) {
        final e3h y = e3h.y;
        final k3h k3h = new k3h((g3h)y);
        ((d3h)k3h).B = y;
        for (final ffi ffi : array) {
            final sei a = ffi.a;
            if (ffi.g || !e3h.containsKey((Object)a)) {
                k3h.put((Object)a, (Object)a.d(ffi, (a6p)e3h2.get((Object)a)));
            }
        }
        return ((d3h)k3h).n();
    }
    
    public static final void a(igf igf, String s, zta b, zta c, zta d, zta zta, int n, long n2, long b2, d1q d1q, float n3, final ye6 ye6, final gva gva, final int n4, final int n5) {
        gva.i0(-915483069);
        final int n6 = n5 & 0x1;
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0x6);
        }
        else if ((n4 & 0x6) == 0x0) {
            int n8;
            if (gva.f((Object)igf)) {
                n8 = 4;
            }
            else {
                n8 = 2;
            }
            n7 = (n8 | n4);
        }
        else {
            n7 = n4;
        }
        final int n9 = n5 & 0x2;
        int n12 = 0;
        Label_0134: {
            int n10;
            if (n9 != 0) {
                n10 = (n7 | 0x30);
            }
            else {
                n10 = n7;
                if ((n4 & 0x30) == 0x0) {
                    int n11;
                    if (gva.f((Object)s)) {
                        n11 = 32;
                    }
                    else {
                        n11 = 16;
                    }
                    n12 = (n7 | n11);
                    break Label_0134;
                }
            }
            n12 = n10;
        }
        final int n13 = n5 & 0x4;
        int n16 = 0;
        Label_0202: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0x180);
            }
            else {
                n14 = n12;
                if ((n4 & 0x180) == 0x0) {
                    int n15;
                    if (gva.h((Object)b)) {
                        n15 = 256;
                    }
                    else {
                        n15 = 128;
                    }
                    n16 = (n12 | n15);
                    break Label_0202;
                }
            }
            n16 = n14;
        }
        final int n17 = n5 & 0x8;
        int n20 = 0;
        Label_0271: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0xC00);
            }
            else {
                n18 = n16;
                if ((n4 & 0xC00) == 0x0) {
                    int n19;
                    if (gva.h(c)) {
                        n19 = 2048;
                    }
                    else {
                        n19 = 1024;
                    }
                    n20 = (n16 | n19);
                    break Label_0271;
                }
            }
            n20 = n18;
        }
        final int n21 = n5 & 0x10;
        int n22;
        if (n21 != 0) {
            n22 = (n20 | 0x6000);
        }
        else {
            n22 = n20;
            if ((n4 & 0x6000) == 0x0) {
                int n23;
                if (gva.h((Object)d)) {
                    n23 = 16384;
                }
                else {
                    n23 = 8192;
                }
                n22 = (n20 | n23);
            }
        }
        final int n24 = n5 & 0x20;
        int n25;
        if (n24 != 0) {
            n25 = (n22 | 0x30000);
        }
        else {
            n25 = n22;
            if ((n4 & 0x30000) == 0x0) {
                int n26;
                if (gva.h((Object)zta)) {
                    n26 = 131072;
                }
                else {
                    n26 = 65536;
                }
                n25 = (n22 | n26);
            }
        }
        int n27 = n25;
        if ((n4 & 0x180000) == 0x0) {
            n27 = (n25 | 0x80000);
        }
        if ((n4 & 0xC00000) == 0x0) {
            int n28;
            if ((n5 & 0x80) == 0x0 && gva.e(n2)) {
                n28 = 8388608;
            }
            else {
                n28 = 4194304;
            }
            n27 |= n28;
        }
        if ((n4 & 0x6000000) == 0x0) {
            int n29;
            if ((n5 & 0x100) == 0x0 && gva.e(b2)) {
                n29 = 67108864;
            }
            else {
                n29 = 33554432;
            }
            n27 |= n29;
        }
        if ((n4 & 0x30000000) == 0x0) {
            int n30;
            if ((n5 & 0x200) == 0x0 && gva.f((Object)d1q)) {
                n30 = 536870912;
            }
            else {
                n30 = 268435456;
            }
            n27 |= n30;
        }
        final int n31 = 1;
        if (gva.W(n27 & 0x1, (0x12492493 & n27) != 0x12492492)) {
            gva.b0();
            Object o = fgf.v;
            int n34;
            Object a;
            String s3;
            if ((n4 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n32 = n27 & 0xFFC7FFFF;
                if ((n5 & 0x80) != 0x0) {
                    n32 = (n27 & 0xFE07FFFF);
                }
                int n33 = n32;
                if ((n5 & 0x100) != 0x0) {
                    n33 = (n32 & 0xF1FFFFFF);
                }
                n34 = n33;
                if ((n5 & 0x200) != 0x0) {
                    n34 = (n33 & 0x8FFFFFFF);
                }
                final String s2 = s;
                a = b;
                final Object o2 = c;
                c = d;
                s3 = s2;
                d = (zta)o2;
            }
            else {
                if (n6 != 0) {
                    igf = (igf)o;
                }
                String s4;
                if (n9 != 0) {
                    s4 = null;
                }
                else {
                    s4 = s;
                }
                if (n13 != 0) {
                    a = r6k.a;
                }
                else {
                    a = b;
                }
                if (n17 != 0) {
                    b = (zta)r6k.b;
                }
                else {
                    b = (zta)c;
                }
                if (n21 != 0) {
                    c = r6k.c;
                }
                else {
                    c = d;
                }
                if (n24 != 0) {
                    d = (zta)r6k.d;
                }
                else {
                    d = zta;
                }
                if ((n5 & 0x80) != 0x0) {
                    n2 = ((e8e)gva.j((sei)h8e.a)).a.n;
                    n = (n27 & 0xFE07FFFF);
                }
                else {
                    n = (n27 & 0xFFC7FFFF);
                }
                if ((n5 & 0x100) != 0x0) {
                    b2 = s86.b(n2, gva);
                    n &= 0xF1FFFFFF;
                }
                Object b3;
                if ((n5 & 0x200) != 0x0) {
                    b3 = c5q.B(gva);
                    n &= 0x8FFFFFFF;
                }
                else {
                    b3 = d1q;
                }
                final cy4 a2 = qy4.a;
                n3 = 144.0f;
                final zta zta2 = d;
                final int n35 = 2;
                n34 = n;
                d1q = (d1q)b3;
                d = b;
                n = n35;
                zta = zta2;
                s3 = s4;
            }
            gva.r();
            final igf o3 = b.o(igf, n3);
            if (s3 != null) {
                gva.g0(689092043);
                int n36;
                if ((n34 & 0x70) == 0x20) {
                    n36 = n31;
                }
                else {
                    n36 = 0;
                }
                Object r = gva.R();
                if (n36 != 0 || r == bi6.a) {
                    r = new jy4(s3, (byte)0);
                    gva.q0(r);
                }
                o = wsk.b((lta)r, (igf)o, false);
            }
            else {
                gva.g0(689093483);
            }
            gva.q(false);
            qt7.g(o3.E((igf)o), (zta)a, d, (zta)c, zta, n, n2, b2, d1q, ye6, gva, (n34 >> 3 & 0xFFFFFF0) | 0x30000000, 0);
            final zta zta3 = (zta)a;
            s = s3;
            b = zta3;
        }
        else {
            gva.Z();
            final Object o4 = c;
            c = d;
            d = (zta)o4;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ky4(igf, s, b, d, (zta)c, zta, n, n2, b2, d1q, n3, ye6, n4, n5);
        }
    }
    
    public static final long b(final float n, final float n2) {
        return ((long)Float.floatToRawIntBits(n2) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(n) << 32;
    }
    
    public static final void c(final int n, final jta jta, final gva gva, igf v, final boolean b) {
        gva.i0(2029327411);
        int n2;
        if (gva.g(b)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)jta)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n | n2 | n3 | 0x180;
        if (gva.W(n4 & 0x1, (n4 & 0x93) != 0x92)) {
            final cy4 a = qy4.a;
            final aql m = qy4.b(gva).m;
            final long o = qy4.a(gva).O;
            final long q = qy4.a(gva).q;
            final long h = j86.h;
            final xzb xzb = new xzb(o, q, h, h);
            v = (igf)fgf.v;
            qt7.c((n4 >> 3 & 0xE) | 0x180000, 36, uuj.t0(-1966249133, (aua)new au((byte)5, b), gva), jta, gva, xzb, omo.X(v, 0.0f, 8.0f, 8.0f, 8.0f), m, false);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ez9(b, jta, v, n, (byte)1);
        }
    }
    
    public static final void d(final int n, final int n2, final jta jta, final gva gva, igf igf, final boolean b, final boolean b2) {
        gva.i0(564607323);
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
            if (gva.g(b2)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.h((Object)jta)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n5 |= n7;
        }
        final int n8 = n2 & 0x8;
        int n9;
        if (n8 != 0) {
            n9 = (n5 | 0xC00);
        }
        else {
            n9 = n5;
            if ((n & 0xC00) == 0x0) {
                int n10;
                if (gva.f((Object)igf)) {
                    n10 = 2048;
                }
                else {
                    n10 = 1024;
                }
                n9 = (n5 | n10);
            }
        }
        if (gva.W(n9 & 0x1, (n9 & 0x493) != 0x492)) {
            final Object v = fgf.v;
            if (n8 != 0) {
                igf = (igf)v;
            }
            final boolean d = x90.D(gva);
            final v96 a = u96.a((jv0)t08.c, (dx)wab.J, gva, 0);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b3 = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n11 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n11);
            }
            else {
                gva.t0();
            }
            final rg6 a2 = awp.A;
            k8e.P((zta)a2, gva, a);
            final rg6 z = awp.z;
            k8e.P((zta)z, gva, l);
            final rg6 b4 = awp.B;
            k8e.P((zta)b4, gva, hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, b3);
            final hng a3 = gp2.a;
            long n12;
            if (d) {
                n12 = y2a.a;
            }
            else {
                n12 = y2a.b;
            }
            long n13;
            if (d) {
                n13 = z2a.a;
            }
            else {
                n13 = z2a.b;
            }
            soh.b(jta, b.d((igf)v, 1.0f), b, null, gp2.a(n12, n13, 0L, 0L, gva, 12), null, null, null, null, (bua)uuj.t0(1051058369, (aua)new wrd(b2), gva), gva, (n9 >> 6 & 0xE) | 0x30000030 | (n9 << 6 & 0x380), 488);
            final lb2 h = wab.H;
            final igf w = omo.W(b.d((igf)v, 1.0f), 0.0f, 16.0f, 1);
            final jzj a4 = hzj.a((gv0)t08.a, h, gva, 48);
            final int hashCode2 = Long.hashCode(gva.T);
            final e3h i = gva.l();
            final igf b5 = ien.B(gva, w);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n11);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, a4);
            k8e.P((zta)z, gva, i);
            oz1.v(hashCode2, gva, b4, gva);
            k8e.P((zta)y, gva, b5);
            final cy4 a5 = qy4.a;
            final long y2 = qy4.a(gva).y;
            if (1.0f <= 0.0) {
                eac.a("invalid weight; must be greater than zero");
            }
            float n14;
            if (1.0f > Float.MAX_VALUE) {
                n14 = Float.MAX_VALUE;
            }
            else {
                n14 = 1.0f;
            }
            c5q.f(0.0f, 0, 2, y2, gva, (igf)new a2d(n14, true));
            final String s2 = soh.S(2131757418, gva);
            final String s3 = soh.S(2131757417, gva);
            final mnn mnn = (mnn)((uy4)qy4.c(gva).k.v).F;
            final long q = qy4.a(gva).Q;
            final boolean f = gva.f((Object)s2);
            final Object r = gva.R();
            Object o;
            if (f || (o = r) == bi6.a) {
                o = new jy4(s2, (byte)8);
                gva.q0(o);
            }
            lmn.b(s3, omo.W(wsk.a((igf)v, (lta)o), 8.0f, 0.0f, 2), q, 0L, (zoa)null, (una)null, 0L, (wgn)null, (kfn)null, 0L, 0, false, 0, 0, (lta)null, mnn, gva, 0, 0, 131064);
            final long y3 = qy4.a(gva).y;
            if (1.0f <= 0.0) {
                eac.a("invalid weight; must be greater than zero");
            }
            float n15;
            if (1.0f > Float.MAX_VALUE) {
                n15 = Float.MAX_VALUE;
            }
            else {
                n15 = 1.0f;
            }
            c5q.f(0.0f, 0, 2, y3, gva, (igf)new a2d(n15, true));
            gva.q(true);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new xrd(jta, igf, b, b2, n, n2);
        }
    }
    
    public static final void e(final boolean b, final jta jta, igf v, final dji dji, dng dng, bua t0, final sx4 sx4, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(1178407382);
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
                    if (gva.f((Object)v)) {
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
        if ((n & 0xC00) == 0x0) {
            int n11;
            if ((n2 & 0x8) == 0x0 && gva.f((Object)dji)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n10 |= n11;
        }
        final int n12 = n2 & 0x10;
        int n15 = 0;
        Label_0275: {
            int n13;
            if (n12 != 0) {
                n13 = (n10 | 0x6000);
            }
            else {
                n13 = n10;
                if ((n & 0x6000) == 0x0) {
                    int n14;
                    if (gva.f((Object)dng)) {
                        n14 = 16384;
                    }
                    else {
                        n14 = 8192;
                    }
                    n15 = (n10 | n14);
                    break Label_0275;
                }
            }
            n15 = n13;
        }
        final int n16 = n2 & 0x20;
        int n19 = 0;
        Label_0345: {
            int n17;
            if (n16 != 0) {
                n17 = (n15 | 0x30000);
            }
            else {
                n17 = n15;
                if ((0x30000 & n) == 0x0) {
                    int n18;
                    if (gva.h((Object)t0)) {
                        n18 = 131072;
                    }
                    else {
                        n18 = 65536;
                    }
                    n19 = (n15 | n18);
                    break Label_0345;
                }
            }
            n19 = n17;
        }
        int n20 = n19;
        if ((0x180000 & n) == 0x0) {
            n20 = (n19 | 0x80000);
        }
        int n21 = n20;
        if ((0xC00000 & n) == 0x0) {
            int n22;
            if (gva.h((Object)ye6)) {
                n22 = 8388608;
            }
            else {
                n22 = 4194304;
            }
            n21 = (n20 | n22);
        }
        dji dji2;
        dng dng2;
        sx4 sx6;
        if (gva.W(n21 & 0x1, (0x492493 & n21) != 0x492492)) {
            gva.b0();
            final cib a = bi6.a;
            int n24;
            dji w;
            sx4 sx5;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n23 = n21;
                if ((n2 & 0x8) != 0x0) {
                    n23 = (n21 & 0xFFFFE3FF);
                }
                n24 = (n23 & 0xFFC7FFFF);
                w = dji;
                sx5 = sx4;
            }
            else {
                if (n7 != 0) {
                    v = (igf)fgf.v;
                }
                int n25 = n21;
                w = dji;
                if ((n2 & 0x8) != 0x0) {
                    w = uoo.W(gva);
                    n25 = (n21 & 0xFFFFE3FF);
                }
                if (n12 != 0) {
                    dng = (dng)new hng(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (n16 != 0) {
                    t0 = (bua)uuj.t0(-534314192, (aua)new us2((Object)w, b, (Object)dng, (byte)7), gva);
                }
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                Object o;
                if ((f | f2) || (o = r) == a) {
                    o = a2.d((Class)sx4.class, (emi)null);
                    gva.q0(o);
                }
                sx5 = (sx4)o;
                n24 = (n25 & 0xFFC7FFFF);
            }
            gva.r();
            final View view = (View)gva.j((sei)q50.f);
            final boolean h = gva.h((Object)sx5);
            final boolean h2 = gva.h((Object)view);
            final boolean b2 = (n24 & 0x70) == 0x20;
            final Object r2 = gva.R();
            Object o2;
            if ((h | h2 | b2) || (o2 = r2) == a) {
                o2 = new t32(sx5, view, jta, (byte)3);
                gva.q0(o2);
            }
            final jta jta2 = (jta)o2;
            final String s = soh.S(2131757944, gva);
            final boolean booleanValue = (boolean)((xom)ien.F(gva)).getValue();
            final boolean f3 = gva.f((Object)s);
            final boolean f4 = gva.f((Object)jta2);
            Object r3 = gva.R();
            if ((f3 | f4) || r3 == a) {
                r3 = new ecb(s, jta2, (byte)0);
                gva.q0(r3);
            }
            uoo.f(b, jta2, wsk.b((lta)r3, v, false), w, null, t0, booleanValue ^ true, 0.0f, uuj.t0(1031587122, (aua)new gl6(ye6, (byte)1), gva), gva, (n24 & 0x70000) | ((n24 & 0xE) | 0x6000000 | (n24 & 0x1C00)), 144);
            dji2 = w;
            dng2 = dng;
            sx6 = sx5;
        }
        else {
            gva.Z();
            final dng dng3 = dng;
            sx6 = sx4;
            dng2 = dng3;
            dji2 = dji;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new kp2(b, jta, v, dji2, dng2, t0, sx6, ye6, n, n2);
        }
    }
    
    public static final void f(final jmf jmf, rad rad, final gva gva, final int n) {
        gva.i0(-1770945943);
        int n2;
        if (gva.f((Object)jmf)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n | 0x30;
        if ((n3 & 0x13) == 0x12 && gva.F()) {
            gva.Z();
        }
        else {
            final rad on_RESUME = rad.ON_RESUME;
            gva.g0(-2101357749);
            final boolean b = (n3 & 0xE) == 0x4;
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if (b || (o = r) == a) {
                o = new xd6((Object)on_RESUME, (Object)jmf, (byte)1);
                gva.q0(o);
            }
            final cbd cbd = (cbd)o;
            gva.q(false);
            final vad d = ((gbd)gva.j((sei)uod.a)).d();
            gva.g0(-2101338711);
            final boolean h = gva.h((Object)d);
            final boolean h2 = gva.h((Object)cbd);
            final Object r2 = gva.R();
            Object o2;
            if ((h | h2) || (o2 = r2) == a) {
                o2 = new tt8((Object)d, (Object)cbd, (byte)21);
                gva.q0(o2);
            }
            final lta lta = (lta)o2;
            gva.q(false);
            mlc.b(d, cbd, lta, gva);
            rad = on_RESUME;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new txf((Object)jmf, (Object)rad, n, (byte)2);
        }
    }
    
    public static final void g(final List list, rad rad, final gva gva, final int n) {
        gva.i0(1533427666);
        int n2;
        if (gva.h((Object)list)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        if (((n2 | n | 0x30) & 0x13) == 0x12 && gva.F()) {
            gva.Z();
        }
        else {
            final rad on_RESUME = rad.ON_RESUME;
            gva.g0(-67706430);
            final boolean f = gva.f((Object)list);
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if (f || (o = r) == a) {
                o = new yx4((Object)on_RESUME, (Object)list, (byte)2);
                gva.q0(o);
            }
            final cbd cbd = (cbd)o;
            gva.q(false);
            final vad d = ((gbd)gva.j((sei)uod.a)).d();
            gva.g0(-67685064);
            final boolean h = gva.h((Object)d);
            final boolean h2 = gva.h((Object)cbd);
            final Object r2 = gva.R();
            Object o2;
            if ((h | h2) || (o2 = r2) == a) {
                o2 = new l0e((Object)d, (Object)cbd, (byte)24);
                gva.q0(o2);
            }
            final lta lta = (lta)o2;
            gva.q(false);
            mlc.b(d, cbd, lta, gva);
            rad = on_RESUME;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new s1h((Object)list, (Object)rad, n, (byte)3);
        }
    }
    
    public static final long h(final float n, final float n2) {
        final long n3 = Float.floatToRawIntBits(n);
        final long n4 = Float.floatToRawIntBits(n2);
        final int c = jeo.c;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static final void i(final zup zup, final igf igf, final gva gva, final int n) {
        gva.i0(-1477019823);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)zup)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n | n2);
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
        final int n6 = 0;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final String a = ((EmailAddress)zup.O.getValue()).a;
            final int n7 = n4 & 0xE;
            final boolean b = n7 == 4;
            Object r = gva.R();
            final cib a2 = bi6.a;
            if (b || r == a2) {
                r = new d3a(1, (Object)zup, (Class)zup.class, "updateEmail", "updateEmail(Ljava/lang/String;)V", 0, (byte)19);
                gva.q0(r);
            }
            final lua lua = (lua)r;
            final boolean booleanValue = (boolean)zup.M.getValue();
            final mvc mvc = new mvc(0, 6, 7, 112);
            int n8 = n6;
            if (n7 == 4) {
                n8 = 1;
            }
            final Object r2 = gva.R();
            Object o;
            if (n8 != 0 || (o = r2) == a2) {
                o = new p8a((Object)zup, (byte)14);
                gva.q0(o);
            }
            final lta lta = (lta)o;
            x90.i(a, (lta)lua, soh.S(2131757413, gva), igf, booleanValue ^ true, null, (zta)uuj.t0(266667209, (aua)new l0((Object)zup, (byte)23), gva), null, mvc, new gvc(lta, lta, lta, lta, lta, lta), 0L, null, 0, gva, 12582912, 14688);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6((Object)zup, (Object)igf, n, (byte)7);
        }
    }
    
    public static final int j(final int n, final inf inf) {
        int n2 = inf.x - 1;
        int i = 0;
        while (i < n2) {
            final int n3 = (n2 - i) / 2 + i;
            final Object[] v = inf.v;
            final int a = ((zkc)v[n3]).a;
            if (a != n) {
                if (a >= n) {
                    n2 = n3 - 1;
                    continue;
                }
                if (n >= ((zkc)v[i = n3 + 1]).a) {
                    continue;
                }
            }
            return n3;
        }
        return i;
    }
    
    public static Comparable k(final Comparable comparable, final Comparable comparable2) {
        if (comparable.compareTo((Object)comparable2) < 0) {
            return comparable2;
        }
        return comparable;
    }
    
    public static double l(final double n, final double n2) {
        if (n > n2) {
            return n2;
        }
        return n;
    }
    
    public static double m(final double n, final double n2, final double n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static float n(final float n, final float n2, final float n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static int o(final int n, final int n2, final int n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static int p(final int n, final xgc xgc) {
        final int w = ((vgc)xgc).w;
        final int v = ((vgc)xgc).v;
        if (xgc instanceof v55) {
            return ((Number)s((Comparable)n, (v55)xgc)).intValue();
        }
        if (xgc.isEmpty()) {
            fvd.x((Object)xgc, "Cannot coerce value to an empty range: ");
            return 0;
        }
        if (n < ((Number)Integer.valueOf(v)).intValue()) {
            return ((Number)Integer.valueOf(v)).intValue();
        }
        int intValue;
        if ((intValue = n) > ((Number)Integer.valueOf(w)).intValue()) {
            intValue = ((Number)Integer.valueOf(w)).intValue();
        }
        return intValue;
    }
    
    public static long q(final long n, final long n2, final long n3) {
        if (n2 > n3) {
            final StringBuilder u = smk.u(n3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
            u.append(n2);
            u.append('.');
            throw new IllegalArgumentException(u.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static long r(final long n, final nwd nwd) {
        if (nwd instanceof v55) {
            return ((Number)s((Comparable)n, (v55)nwd)).longValue();
        }
        if (nwd.isEmpty()) {
            fvd.x((Object)nwd, "Cannot coerce value to an empty range: ");
            return 0L;
        }
        if (n < ((Number)nwd.d()).longValue()) {
            return ((Number)nwd.d()).longValue();
        }
        long longValue = n;
        if (n > ((Number)nwd.f()).longValue()) {
            longValue = ((Number)nwd.f()).longValue();
        }
        return longValue;
    }
    
    public static Comparable s(final Comparable comparable, final v55 v55) {
        if (((w55)v55).isEmpty()) {
            fvd.x((Object)v55, "Cannot coerce value to an empty range: ");
            return null;
        }
        if (v55.a(comparable, ((w55)v55).d()) && !v55.a(((w55)v55).d(), comparable)) {
            return ((w55)v55).d();
        }
        Comparable f = comparable;
        if (v55.a(((w55)v55).f(), comparable)) {
            f = comparable;
            if (!v55.a(comparable, ((w55)v55).f())) {
                f = ((w55)v55).f();
            }
        }
        return f;
    }
    
    public static Comparable t(final Comparable comparable, final Comparable comparable2, final Comparable comparable3) {
        if (comparable2.compareTo((Object)comparable3) > 0) {
            final StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append((Object)comparable3);
            sb.append(" is less than minimum ");
            sb.append((Object)comparable2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (comparable.compareTo((Object)comparable2) < 0) {
            return comparable2;
        }
        if (comparable.compareTo((Object)comparable3) > 0) {
            return comparable3;
        }
        return comparable;
    }
    
    public static void u(final ArrayList list) {
        final HashMap hashMap = new HashMap(list.size());
        for (final ud6 ud6 : list) {
            final ps7 ps7 = new ps7(ud6);
            for (final bmi bmi : ud6.b) {
                final boolean e = ud6.e;
                final qs7 qs7 = new qs7(bmi, e);
                if (!hashMap.containsKey((Object)qs7)) {
                    hashMap.put((Object)qs7, (Object)new HashSet());
                }
                final Set set = (Set)hashMap.get((Object)qs7);
                if (!set.isEmpty() && !e) {
                    c2.i((Object)bmi, (Object)".", "Multiple components provide ");
                    return;
                }
                set.add((Object)ps7);
            }
        }
        final Iterator iterator3 = hashMap.values().iterator();
        int n;
        while (true) {
            final boolean hasNext = iterator3.hasNext();
            n = 0;
            if (!hasNext) {
                break;
            }
            for (final ps7 ps8 : (Set)iterator3.next()) {
                for (final dd8 dd8 : ps8.a.c) {
                    if (dd8.c) {
                        continue;
                    }
                    final Set set2 = (Set)hashMap.get((Object)new qs7(dd8.a, dd8.b == 2));
                    if (set2 == null) {
                        continue;
                    }
                    for (final ps7 ps9 : set2) {
                        ps8.b.add((Object)ps9);
                        ps9.c.add((Object)ps8);
                    }
                }
            }
        }
        final HashSet set3 = new HashSet();
        final Iterator iterator7 = hashMap.values().iterator();
        while (iterator7.hasNext()) {
            ((AbstractCollection)set3).addAll((Collection)iterator7.next());
        }
        final HashSet set4 = new HashSet();
        final Iterator iterator8 = set3.iterator();
        int n2;
        while (true) {
            n2 = n;
            if (!iterator8.hasNext()) {
                break;
            }
            final ps7 ps10 = (ps7)iterator8.next();
            if (!ps10.c.isEmpty()) {
                continue;
            }
            set4.add((Object)ps10);
        }
        while (!set4.isEmpty()) {
            final ps7 ps11 = (ps7)set4.iterator().next();
            set4.remove((Object)ps11);
            final int n3 = n2 + 1;
            final Iterator iterator9 = ps11.b.iterator();
            while (true) {
                n2 = n3;
                if (!iterator9.hasNext()) {
                    break;
                }
                final ps7 ps12 = (ps7)iterator9.next();
                ps12.c.remove((Object)ps11);
                if (!ps12.c.isEmpty()) {
                    continue;
                }
                set4.add((Object)ps12);
            }
        }
        if (n2 == list.size()) {
            return;
        }
        final ArrayList list2 = new ArrayList();
        for (final ps7 ps13 : set3) {
            if (!ps13.c.isEmpty() && !ps13.b.isEmpty()) {
                list2.add((Object)ps13.a);
            }
        }
        throw new DependencyCycleException(list2);
    }
    
    public static String v(final byte[] array) {
        if (array == null) {
            return null;
        }
        return Base64.encodeToString(array, 11);
    }
    
    public static final boolean w(final long n, final long n2) {
        return n == n2;
    }
    
    public static final void x(t2k d1, final String s) {
        d1 = (t2k)d1.d1(s);
        try {
            ((b3k)d1).Z0();
            r9n.m((AutoCloseable)d1, (Throwable)null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                r9n.m((AutoCloseable)d1, t);
            }
        }
    }
    
    public static og0 y(String s, vmn vmn, int n) {
        final vln vln = null;
        if ((n & 0x2) != 0x0) {
            vmn = null;
        }
        final Spanned fromHtml = Html.fromHtml(smk.s("<ContentHandlerReplacementTag />", s), 63, (Html$ImageGetter)null, (Html$TagHandler)ncq.c);
        final mg0 mg0 = new mg0(((CharSequence)fromHtml).length());
        mg0.g((CharSequence)fromHtml);
        final Object[] spans = fromHtml.getSpans(0, mg0.v.length(), (Class)Object.class);
        final int length = spans.length;
        int i = 0;
        vln vln2 = vln;
        while (i < length) {
            final Object o = spans[i];
            final long c = rhc.c(fromHtml.getSpanStart(o), fromHtml.getSpanEnd(o));
            n = dnn.c;
            final int n2 = (int)(c >> 32);
            final int n3 = (int)(c & 0xFFFFFFFFL);
            Label_1208: {
                if (!(o instanceof AbsoluteSizeSpan)) {
                    final boolean b = o instanceof AlignmentSpan;
                    final ArrayList x = mg0.x;
                    n = 3;
                    if (b) {
                        final Layout$Alignment alignment = ((AlignmentSpan)o).getAlignment();
                        int n4;
                        if (alignment == null) {
                            n4 = -1;
                        }
                        else {
                            n4 = znb.a[((Enum)alignment).ordinal()];
                        }
                        if (n4 != 1) {
                            if (n4 != 2) {
                                if (n4 != 3) {
                                    n = 0;
                                }
                                else {
                                    n = 6;
                                }
                            }
                        }
                        else {
                            n = 5;
                        }
                        x.add((Object)new lg0(n2, n3, 8, (Object)new mrg(n, vln2, 510), (String)null));
                    }
                    else if (o instanceof tg0) {
                        final tg0 tg0 = (tg0)o;
                        x.add((Object)new lg0(n2, n3, (Object)sxm.a(tg0.b()), tg0.a()));
                    }
                    else if (o instanceof BackgroundColorSpan) {
                        mg0.b(new hcm(0L, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, t08.c(((BackgroundColorSpan)o).getBackgroundColor()), (wgn)null, (rpl)null, 63487), n2, n3);
                    }
                    else {
                        if (o instanceof jo2) {
                            final ho2 e = ho2.e;
                            final long g = o1r.g();
                            final jo2 jo2 = (jo2)o;
                            n = jo2.b();
                            tsf.s(g);
                            final long q = tsf.Q(vnn.c(g) * n, g & 0xFF00000000L);
                            final ho2 a = jo2.a();
                            x.add((Object)new lg0(n2, n3, 8, (Object)new mrg(0, new vln(q, q), 503), (String)null));
                            x.add((Object)new lg0(n2, n3, 8, (Object)a, (String)null));
                        }
                        else if (o instanceof ForegroundColorSpan) {
                            mg0.b(new hcm(t08.c(((ForegroundColorSpan)o).getForegroundColor()), 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, (wgn)null, (rpl)null, 65534), n2, n3);
                        }
                        else if (o instanceof RelativeSizeSpan) {
                            mg0.b(new hcm(0L, tsf.Q(((RelativeSizeSpan)o).getSizeChange(), 8589934592L), (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, (wgn)null, (rpl)null, 65533), n2, n3);
                        }
                        else if (o instanceof StrikethroughSpan) {
                            mg0.b(new hcm(0L, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, wgn.d, (rpl)null, 61439), n2, n3);
                        }
                        else if (o instanceof StyleSpan) {
                            n = ((StyleSpan)o).getStyle();
                            hcm hcm;
                            if (n != 1) {
                                if (n != 2) {
                                    if (n != 3) {
                                        hcm = null;
                                    }
                                    else {
                                        hcm = new hcm(0L, 0L, zoa.D, new soa(1), (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, (wgn)null, (rpl)null, 65523);
                                    }
                                }
                                else {
                                    hcm = new hcm(0L, 0L, (zoa)null, new soa(1), (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, (wgn)null, (rpl)null, 65527);
                                }
                            }
                            else {
                                hcm = new hcm(0L, 0L, zoa.D, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, (wgn)null, (rpl)null, 65531);
                            }
                            if (hcm != null) {
                                mg0.b(hcm, n2, n3);
                            }
                        }
                        else if (o instanceof SubscriptSpan) {
                            mg0.b(new hcm(0L, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, new zw1(-0.5f), (tln)null, (jpd)null, 0L, (wgn)null, (rpl)null, 65279), n2, n3);
                        }
                        else if (o instanceof SuperscriptSpan) {
                            mg0.b(new hcm(0L, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, new zw1(0.5f), (tln)null, (jpd)null, 0L, (wgn)null, (rpl)null, 65279), n2, n3);
                        }
                        else if (o instanceof TypefaceSpan) {
                            final TypefaceSpan typefaceSpan = (TypefaceSpan)o;
                            s = typefaceSpan.getFamily();
                            Object o2 = null;
                            Label_0952: {
                                if (mlc.q(s, "cursive")) {
                                    o2 = una.z;
                                }
                                else if (mlc.q(s, "monospace")) {
                                    o2 = una.y;
                                }
                                else if (mlc.q(s, "sans-serif")) {
                                    o2 = una.w;
                                }
                                else if (mlc.q(s, "serif")) {
                                    o2 = una.x;
                                }
                                else {
                                    s = typefaceSpan.getFamily();
                                    if (s != null) {
                                        if (s.length() != 0) {
                                            Typeface create = Typeface.create(s, 0);
                                            final Typeface default1 = Typeface.DEFAULT;
                                            if (mlc.q(create, default1) || mlc.q(create, Typeface.create(default1, 0))) {
                                                create = null;
                                            }
                                            if (create != null) {
                                                o2 = m9r.d(create);
                                                break Label_0952;
                                            }
                                        }
                                    }
                                    o2 = null;
                                }
                            }
                            mg0.b(new hcm(0L, 0L, (zoa)null, (soa)null, (toa)null, (una)o2, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, (wgn)null, (rpl)null, 65503), n2, n3);
                        }
                        else if (o instanceof UnderlineSpan) {
                            mg0.b(new hcm(0L, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, wgn.c, (rpl)null, 61439), n2, n3);
                        }
                        else if (o instanceof URLSpan) {
                            final String url = ((URLSpan)o).getURL();
                            if (url != null) {
                                vln2 = null;
                                mg0.a(new udd(url, vmn, (eed)null), n2, n3);
                                break Label_1208;
                            }
                        }
                        vln2 = null;
                    }
                }
            }
            ++i;
        }
        return mg0.n();
    }
    
    public static fb z(final zrc zrc) {
        Label_0155: {
            Label_0146: {
                Label_0137: {
                    String i = null;
                    int n2 = 0;
                    Boolean value;
                    while (true) {
                    Label_0099:
                        while (true) {
                            int n = 0;
                            Label_0119: {
                                try {
                                    i = zrc.o("id").i();
                                    final String j = zrc.o("type").i();
                                    j.getClass();
                                    final int[] f = ge9.F(3);
                                    final int length = f.length;
                                    n = 0;
                                    if (n >= length) {
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    n2 = f[n];
                                    if (!ge9.d(n2).equals(j)) {
                                        break Label_0119;
                                    }
                                    final irc o = zrc.o("has_replay");
                                    if (o != null) {
                                        value = o.a();
                                        break;
                                    }
                                }
                                catch (final NullPointerException ex) {
                                    break Label_0137;
                                }
                                catch (final NumberFormatException ex2) {
                                    break Label_0146;
                                }
                                catch (final IllegalStateException ex3) {
                                    break Label_0155;
                                }
                                break Label_0099;
                            }
                            ++n;
                            continue;
                        }
                        value = null;
                        break;
                    }
                    i.getClass();
                    return new fb(n2, value, i);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ActionEventSession", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ActionEventSession", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ActionEventSession", (Throwable)ex3);
        return null;
    }
}
