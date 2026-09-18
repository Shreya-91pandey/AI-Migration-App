import android.view.ViewParent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Set;
import java.util.Map$Entry;
import android.content.SharedPreferences;
import java.lang.reflect.Method;
import androidx.compose.foundation.layout.b;
import java.util.List;
import android.graphics.PorterDuff$Mode;
import coil3.compose.AsyncImagePainter$State$Success;
import java.nio.charset.StandardCharsets;
import android.graphics.BlendMode;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import androidx.compose.ui.node.Owner;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import android.content.res.Resources;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import android.content.Context;

public abstract class soh
{
    public static boolean a = true;
    public static final ye6 b;
    public static final ye6 c;
    public static final ye6 d;
    public static final ye6 e;
    public static final ye6 f;
    public static final ye6 g;
    public static final sfa h;
    public static final rg6 i;
    public static final byte[] j;
    public static final htk k;
    public static final htk l;
    public static final htk m;
    public static Context n;
    
    public static final float A(final float n, final gva gva) {
        return ((xc8)gva.j((sei)hm6.h)).I(tsf.Q(n, 4294967296L));
    }
    
    public static final float B(final int n, final gva gva) {
        return ((xc8)gva.j((sei)hm6.h)).I(tsf.K(n));
    }
    
    public static final void C(final Runnable ex, Throwable ex2, final rjc rjc) {
        CancellationException ex3 = ex2;
        Label_0051: {
            if (ex2 != null) {
                break Label_0051;
            }
            ex3 = ex2;
            if (!(ex instanceof Future)) {
                break Label_0051;
            }
            ex3 = ex2;
            if (!((Future)ex).isDone()) {
                break Label_0051;
            }
            try {
                try {
                    final Future future = (Future)ex;
                    try {
                        future.get();
                        ex3 = ex2;
                    }
                    catch (final ExecutionException ex) {
                        goto Label_0090;
                    }
                    catch (final CancellationException ex4) {}
                    ex2 = ex3;
                }
                catch (final InterruptedException ex) {
                    try {
                        Thread.currentThread().interrupt();
                        ex3 = ex2;
                    }
                    catch (final SecurityException ex) {
                        c5q.E(rjc, 5, qjc.w, (jta)s0k.P, (Throwable)ex, false, 48);
                    }
                }
            }
            catch (final ExecutionException ex5) {}
            catch (final CancellationException ex2) {
                goto Label_0095;
            }
        }
        if (ex2 != null) {
            c5q.F(rjc, 5, lq6.Y(qjc.v, qjc.x), (jta)s0k.Q, (Throwable)ex2, 48);
        }
    }
    
    public static long D(CharSequence subSequence, int n, final int n2, final boolean b) {
        if (n2 <= 0 || n < 0 || n + n2 > subSequence.length()) {
            throw new NumberFormatException("Empty input string");
        }
        if (n2 > 16) {
            int n3;
            for (n3 = n; n3 < subSequence.length() && subSequence.charAt(n3) == '0'; ++n3) {}
            if (n2 - n3 > 16) {
                throw new NumberFormatException(String.format("String value %s exceeds range of unsigned long.", new Object[] { subSequence }));
            }
        }
        int n4 = 0;
        long n5 = 0L;
        final int n6 = 0;
        int n7;
        char char1;
        int digit;
        int n8;
        for (n7 = n, n = n6; n4 < n2 && n >= 0; n = (n8 | digit), n5 = (n5 << 4 | (long)digit), ++n4, ++n7) {
            char1 = subSequence.charAt(n7);
            digit = Character.digit(char1, 16);
            n8 = n;
            if (b) {
                n8 = n;
                if (Character.isUpperCase(char1)) {
                    n8 = -1;
                }
            }
        }
        if (n >= 0) {
            return n5;
        }
        subSequence = subSequence.subSequence(n7, n2);
        final StringBuilder sb = new StringBuilder("Illegal character in ");
        sb.append((Object)subSequence);
        throw new NumberFormatException(sb.toString());
    }
    
    public static final String E(final int n, final int n2, final gva gva) {
        return ((Resources)gva.j((sei)q50.c)).getQuantityString(n, n2);
    }
    
    public static final String F(final int n, final int n2, final Object[] array, final gva gva) {
        return ((Resources)gva.j((sei)q50.c)).getQuantityString(n, n2, Arrays.copyOf(array, array.length));
    }
    
    public static final hgf G(final inf inf) {
        if (inf != null) {
            final int x = inf.x;
            if (x != 0) {
                return (hgf)inf.l(x - 1);
            }
        }
        return null;
    }
    
    public static final Object H(final gbd gbd, final zta zta, final m6n m6n) {
        final vad d = gbd.d();
        final tad b = d.b();
        final tad v = tad.v;
        final pc7 v2 = pc7.v;
        final lqo a = lqo.a;
        Object m = null;
        Label_0062: {
            if (b != v) {
                m = ien.m((f07)m6n, (zta)new djh(d, zta, null, (byte)4));
                if (m == v2) {
                    break Label_0062;
                }
            }
            m = a;
        }
        if (m == v2) {
            return m;
        }
        return a;
    }
    
    public static final void I(final t98 t98) {
        final LayoutNode l = L(t98);
        if (!l.P) {
            final c40 autofillManager = ((AndroidComposeView)l0d.a(l)).getAutofillManager();
            if (autofillManager != null) {
                final Rect a = autofillManager.A;
                final m2j y = autofillManager.y;
                final LayoutNode layoutNode = (LayoutNode)y.a.b(l.w);
                if (layoutNode != null && layoutNode.B != -4) {
                    final mlf c = y.c;
                    final int d = y.d(layoutNode);
                    final long[] array = (long[])c.c;
                    final long n = array[d];
                    final long n2 = array[d + 1];
                    a.set((int)(n >> 32), (int)n, (int)(n2 >> 32), (int)n2);
                    autofillManager.v.C().requestAutofill((View)autofillManager.x, l.w, a);
                }
            }
        }
    }
    
    public static final yxf J(final t98 t98, final int n) {
        final yxf c = t98.z0().C;
        c.getClass();
        if (c.h1() == t98) {
            if (zxf.g(n)) {
                final yxf s = c.S;
                s.getClass();
                return s;
            }
        }
        return c;
    }
    
    public static final yxf K(final t98 t98) {
        if (!t98.z0().I) {
            gac.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        final yxf j = J(t98, 2);
        if (!j.h1().I) {
            gac.c("LayoutCoordinates is not attached.");
        }
        return j;
    }
    
    public static final LayoutNode L(final t98 t98) {
        final yxf c = t98.z0().C;
        if (c != null) {
            return c.P;
        }
        throw ge9.x("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }
    
    public static final Owner M(final t98 t98) {
        final Owner j = L(t98).J;
        if (j != null) {
            return j;
        }
        throw ge9.x("This node does not have an owner.");
    }
    
    public static final int N(final int n) {
        return (n & 0xFF) << 24 | ((0xFF000000 & n) >>> 24 | (0xFF0000 & n) >>> 8 | (0xFF00 & n) << 8);
    }
    
    public static final long O(final long n) {
        return (n & 0xFFL) << 56 | ((0xFF00000000000000L & n) >>> 56 | (0xFF000000000000L & n) >>> 40 | (0xFF0000000000L & n) >>> 24 | (0xFF00000000L & n) >>> 8 | (0xFF000000L & n) << 8 | (0xFF0000L & n) << 24 | (0xFF00L & n) << 40);
    }
    
    public static final Object P(final mgk mgk, final float n, final h07 h07) {
        Object o = null;
        Label_0052: {
            if (h07 instanceof kfk) {
                final kfk kfk = (kfk)h07;
                final int x = kfk.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    kfk.x = x + Integer.MIN_VALUE;
                    o = kfk;
                    break Label_0052;
                }
            }
            o = new h07(h07);
        }
        final Object w = ((kfk)o).w;
        final int x2 = ((kfk)o).x;
        y3j v;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((kfk)o).v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            final Object v2 = new Object();
            final lfk lfk = new lfk((y3j)v2, n, (f07)null);
            ((kfk)o).v = (y3j)v2;
            ((kfk)o).x = 1;
            final Object b = mgk.b(lnf.v, (zta)lfk, (f07)o);
            final pc7 v3 = pc7.v;
            if (b == v3) {
                return v3;
            }
            v = (y3j)v2;
        }
        return new Float(v.v);
    }
    
    public static String Q(final Throwable t) {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter((Writer)stringWriter);
        t.printStackTrace(printWriter);
        printWriter.flush();
        final String string = stringWriter.toString();
        string.getClass();
        return string;
    }
    
    public static final String[] R(final int n, final gva gva) {
        return ((Resources)gva.j((sei)q50.c)).getStringArray(n);
    }
    
    public static final String S(final int n, final gva gva) {
        return ((Resources)gva.j((sei)q50.c)).getString(n);
    }
    
    public static final String T(final int n, final Object[] array, final gva gva) {
        return ((Resources)gva.j((sei)q50.c)).getString(n, Arrays.copyOf(array, array.length));
    }
    
    public static final void U(final Throwable t, final f07 f07) {
        zwc zwc2 = null;
        Label_0048: {
            if (f07 instanceof zwc) {
                final zwc zwc = (zwc)f07;
                final int w = zwc.w;
                if ((w & Integer.MIN_VALUE) != 0x0) {
                    zwc.w = w + Integer.MIN_VALUE;
                    zwc2 = zwc;
                    break Label_0048;
                }
            }
            zwc2 = new zwc(f07);
        }
        final Object v = zwc2.v;
        final int w2 = zwc2.w;
        if (w2 == 0) {
            vt4.g0(v);
            zwc2.w = 1;
            vo8.a.g1(((f07)zwc2).getContext(), (Runnable)new qua((Object)zwc2, (Object)t, (byte)6));
            return;
        }
        if (w2 != 1) {
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        throw ge9.w(v);
    }
    
    public static final Object V(int i, final Object o, final f70 f70, final zoa zoa, final int n) {
        if (!(o instanceof Typeface)) {
            return o;
        }
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        Label_0073: {
            if ((i & 0x1) != 0x0 && !mlc.q(f70.b(), zoa)) {
                final zoa y = zoa.y;
                if (zoa.a(y) >= 0 && mlc.u(f70.b().v, y.v) < 0) {
                    b3 = true;
                    break Label_0073;
                }
            }
            b3 = false;
        }
        if ((i & 0x2) != 0x0 && n != f70.a()) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i == 0 && !b3) {
            return o;
        }
        if (Build$VERSION.SDK_INT < 28) {
            boolean b4 = b2;
            if (i != 0) {
                b4 = b2;
                if (n == 1) {
                    b4 = true;
                }
            }
            i = w8r.i(b3, b4);
            return Typeface.create((Typeface)o, i);
        }
        int n2;
        if (b3) {
            n2 = zoa.v;
        }
        else {
            n2 = f70.b().v;
        }
        if (i != 0) {
            final boolean b5 = b;
            if (n != 1) {
                return u6r.r((Typeface)o, n2, b5);
            }
        }
        else {
            final boolean b5 = b;
            if (f70.a() != 1) {
                return u6r.r((Typeface)o, n2, b5);
            }
        }
        final boolean b5 = true;
        return u6r.r((Typeface)o, n2, b5);
    }
    
    public static final int W(final ilf ilf) {
        final int b = ilf.b;
        final int c = ilf.c(0);
        while (ilf.b != 0 && ilf.c(0) == c) {
            ilf.f(0, ilf.d());
            ilf.e(ilf.b - 1);
            final int b2 = ilf.b;
            int i = 0;
            while (i < b2 >>> 1) {
                final int c2 = ilf.c(i);
                final int n = (i + 1) * 2;
                final int n2 = n - 1;
                final int c3 = ilf.c(n2);
                if (n < b2) {
                    final int c4 = ilf.c(n);
                    if (c4 > c3) {
                        if (c4 > c2) {
                            ilf.f(i, c4);
                            ilf.f(n, c2);
                            i = n;
                            continue;
                        }
                        break;
                    }
                }
                if (c3 <= c2) {
                    break;
                }
                ilf.f(i, c3);
                ilf.f(n2, c2);
                i = n2;
            }
        }
        return c;
    }
    
    public static final BlendMode X(final int n) {
        if (n == 0) {
            return m4.a();
        }
        if (n == 1) {
            return m4.s();
        }
        if (n == 2) {
            return m4.m();
        }
        if (n == 3) {
            return m4.l();
        }
        if (n == 4) {
            return m4.n();
        }
        if (n == 5) {
            return m4.o();
        }
        if (n == 6) {
            return m4.p();
        }
        if (n == 7) {
            return m4.q();
        }
        if (n == 8) {
            return m4.r();
        }
        if (n == 9) {
            return m4.u();
        }
        if (n == 10) {
            return m4.j();
        }
        if (n == 11) {
            return m4.v();
        }
        if (n == 12) {
            return d40.c();
        }
        if (n == 13) {
            return d40.q();
        }
        if (n == 14) {
            return d40.u();
        }
        if (n == 15) {
            return d40.w();
        }
        if (n == 16) {
            return d40.x();
        }
        if (n == 17) {
            return d40.y();
        }
        if (n == 18) {
            return d40.z();
        }
        if (n == 19) {
            return m4.g();
        }
        if (n == 20) {
            return m4.w();
        }
        if (n == 21) {
            return m4.y();
        }
        if (n == 22) {
            return m4.z();
        }
        if (n == 23) {
            return m4.A();
        }
        if (n == 24) {
            return m4.B();
        }
        if (n == 25) {
            return m4.C();
        }
        if (n == 26) {
            return m4.D();
        }
        if (n == 27) {
            return m4.i();
        }
        if (n == 28) {
            return m4.k();
        }
        return m4.l();
    }
    
    public static final String Y(int n) {
        if (n == 0) {
            return "0";
        }
        final char[] b = o50.b;
        final char c = b[n >> 28 & 0xF];
        final char c2 = b[n >> 24 & 0xF];
        final char c3 = b[n >> 20 & 0xF];
        final char c4 = b[n >> 16 & 0xF];
        final char c5 = b[n >> 12 & 0xF];
        final char c6 = b[n >> 8 & 0xF];
        final char c7 = b[n >> 4 & 0xF];
        final char c8 = b[n & 0xF];
        final char[] array = new char[8];
        n = 0;
        array[0] = c;
        array[1] = c2;
        array[2] = c3;
        array[3] = c4;
        array[4] = c5;
        array[5] = c6;
        array[6] = c7;
        array[7] = c8;
        while (n < 8 && array[n] == '0') {
            ++n;
        }
        twl.k(n, 8, 8);
        return new String(array, n, 8 - n);
    }
    
    public static String Z(final int n, final long n2) {
        int n3;
        if (n > 16) {
            n3 = 32;
        }
        else if ((n3 = n) < 16) {
            n3 = 16;
        }
        final byte[] array = new byte[n3];
        w(n2, array, 0, n3);
        return new String(array, StandardCharsets.US_ASCII);
    }
    
    public static final void a(final String s, final String s2, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-2112896006);
        final dk2 a = dk2.a;
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)a)) {
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
            if (gva.f((Object)s)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.f((Object)s2)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n4 |= n6;
        }
        int n7 = n4;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)ye6)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n4 | n8);
        }
        final boolean b = true;
        while (true) {
            Label_0700: {
                if (!gva.W(n7 & 0x1, (n7 & 0x493) != 0x492)) {
                    gva.Z();
                    break Label_0700;
                }
                if (s != null) {
                    gva.g0(1755970856);
                    gva.q(false);
                    final Object r = gva.R();
                    final cib a2 = bi6.a;
                    Object q;
                    if ((q = r) == a2) {
                        q = o50.Q(hb1.a);
                        gva.q0(q);
                    }
                    final bnf bnf = (bnf)q;
                    final int n9 = n7 & 0x70;
                    final boolean b2 = n9 == 32;
                    final Object r2 = gva.R();
                    vse b3;
                    if (b2 || (b3 = (vse)r2) == a2) {
                        final ib1 ib1 = (ib1)((xom)bnf).getValue();
                        AsyncImagePainter$State$Success asyncImagePainter$State$Success;
                        if (ib1 instanceof AsyncImagePainter$State$Success) {
                            asyncImagePainter$State$Success = (AsyncImagePainter$State$Success)ib1;
                        }
                        else {
                            asyncImagePainter$State$Success = null;
                        }
                        if (asyncImagePainter$State$Success != null) {
                            b3 = asyncImagePainter$State$Success.b().b();
                        }
                        else {
                            b3 = null;
                        }
                        gva.q0((Object)b3);
                    }
                    final vse vse = b3;
                    if (((ib1)((xom)bnf).getValue()).a() == null) {
                        gva.g0(1026496868);
                        hia.t(n7 >> 9 & 0xE, ye6, gva, false);
                    }
                    else {
                        gva.g0(1756641448);
                        gva.q(false);
                    }
                    final Context context = (Context)gva.j((sei)q50.b);
                    final boolean f = gva.f((Object)context);
                    final boolean b4 = n9 == 32 && b;
                    final boolean f2 = gva.f((Object)vse);
                    final Object r3 = gva.R();
                    i3c a3;
                    if ((f | b4 | f2) || (a3 = (i3c)r3) == a2) {
                        final e3c e3c = new e3c(context);
                        e3c.b(s);
                        e3c.e(vse);
                        a3 = e3c.a();
                        gva.q0((Object)a3);
                    }
                    final i3c i3c = a3;
                    final igf b5 = a.b((igf)fgf.v);
                    Object r4;
                    if ((r4 = gva.R()) == a2) {
                        r4 = new xln(bnf, (byte)5);
                        gva.q0(r4);
                    }
                    jkq.c((Object)i3c, s2, b5, (p2c)null, (lta)null, (lta)r4, (gx)null, (by6)zx6.a, 0.0f, 0, false, gva, (n7 >> 3 & 0x70) | 0xC30000, 3928);
                    break Label_0700;
                }
                gva.g0(1755931455);
                ye6.d((Object)gva, (Object)(n7 >> 9 & 0xE));
                gva.q(false);
                final b0j v = gva.v();
                if (v == null) {
                    return;
                }
                final a2p d = new a2p(s, s2, ye6, n, (byte)0);
                final b0j b0j = v;
                b0j.d = (zta)d;
                return;
            }
            final b0j v2 = gva.v();
            if (v2 != null) {
                final a2p d = new a2p(s, s2, ye6, n, (byte)1);
                final b0j b0j = v2;
                continue;
            }
            break;
        }
    }
    
    public static final PorterDuff$Mode a0(final int n) {
        if (n == 0) {
            return PorterDuff$Mode.CLEAR;
        }
        if (n == 1) {
            return PorterDuff$Mode.SRC;
        }
        if (n == 2) {
            return PorterDuff$Mode.DST;
        }
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 4) {
            return PorterDuff$Mode.DST_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 6) {
            return PorterDuff$Mode.DST_IN;
        }
        if (n == 7) {
            return PorterDuff$Mode.SRC_OUT;
        }
        if (n == 8) {
            return PorterDuff$Mode.DST_OUT;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        if (n == 10) {
            return PorterDuff$Mode.DST_ATOP;
        }
        if (n == 11) {
            return PorterDuff$Mode.XOR;
        }
        if (n == 12) {
            return PorterDuff$Mode.ADD;
        }
        if (n == 14) {
            return PorterDuff$Mode.SCREEN;
        }
        if (n == 15) {
            return PorterDuff$Mode.OVERLAY;
        }
        if (n == 16) {
            return PorterDuff$Mode.DARKEN;
        }
        if (n == 17) {
            return PorterDuff$Mode.LIGHTEN;
        }
        if (n == 13) {
            return PorterDuff$Mode.MULTIPLY;
        }
        return PorterDuff$Mode.SRC_OVER;
    }
    
    public static final void b(final jta jta, igf v, boolean b, aql l, final cp2 cp2, ip2 b2, bi2 bi2, dng a, final llf llf, final bua bua, final gva gva, final int n, final int n2) {
        gva.i0(-1310015664);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)jta)) {
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
        int n10;
        if (n9 != 0) {
            n10 = (n8 | 0x180);
        }
        else {
            n10 = n8;
            if ((n & 0x180) == 0x0) {
                int n11;
                if (gva.g(b)) {
                    n11 = 256;
                }
                else {
                    n11 = 128;
                }
                n10 = (n8 | n11);
            }
        }
        if ((n & 0xC00) == 0x0) {
            int n12;
            if ((n2 & 0x8) == 0x0 && gva.f((Object)l)) {
                n12 = 2048;
            }
            else {
                n12 = 1024;
            }
            n10 |= n12;
        }
        int n13 = n10;
        if ((n & 0x6000) == 0x0) {
            int n14;
            if (gva.f((Object)cp2)) {
                n14 = 16384;
            }
            else {
                n14 = 8192;
            }
            n13 = (n10 | n14);
        }
        if ((0x30000 & n) == 0x0) {
            int n15;
            if ((n2 & 0x20) == 0x0 && gva.f((Object)b2)) {
                n15 = 131072;
            }
            else {
                n15 = 65536;
            }
            n13 |= n15;
        }
        final int n16 = n2 & 0x40;
        int n17;
        if (n16 != 0) {
            n17 = (n13 | 0x180000);
        }
        else {
            n17 = n13;
            if ((0x180000 & n) == 0x0) {
                int n18;
                if (gva.f((Object)bi2)) {
                    n18 = 1048576;
                }
                else {
                    n18 = 524288;
                }
                n17 = (n13 | n18);
            }
        }
        final int n19 = n2 & 0x80;
        int n20;
        if (n19 != 0) {
            n20 = (n17 | 0xC00000);
        }
        else {
            n20 = n17;
            if ((n & 0xC00000) == 0x0) {
                int n21;
                if (gva.f((Object)a)) {
                    n21 = 8388608;
                }
                else {
                    n21 = 4194304;
                }
                n20 = (n17 | n21);
            }
        }
        final int n22 = n2 & 0x100;
        int n23;
        if (n22 != 0) {
            n23 = (n20 | 0x6000000);
        }
        else {
            n23 = n20;
            if ((n & 0x6000000) == 0x0) {
                int n24;
                if (gva.f((Object)llf)) {
                    n24 = 67108864;
                }
                else {
                    n24 = 33554432;
                }
                n23 = (n20 | n24);
            }
        }
        int n25 = n23;
        if ((n & 0x30000000) == 0x0) {
            int n26;
            if (gva.h((Object)bua)) {
                n26 = 536870912;
            }
            else {
                n26 = 268435456;
            }
            n25 = (n23 | n26);
        }
        final boolean b3 = true;
        dng dng2 = null;
        bi2 bi4 = null;
        llf llf5;
        if (gva.W(n25 & 0x1, (n25 & 0x12492493) != 0x12492492)) {
            gva.b0();
            int n28 = 0;
            igf igf2 = null;
            ip2 ip3 = null;
            llf llf3 = null;
            Label_0845: {
                dng dng;
                if ((n & 0x1) != 0x0 && !gva.C()) {
                    gva.Z();
                    int n27 = n25;
                    if ((n2 & 0x8) != 0x0) {
                        n27 = (n25 & 0xFFFFE3FF);
                    }
                    n28 = n27;
                    if ((n2 & 0x20) != 0x0) {
                        n28 = (n27 & 0xFFF8FFFF);
                    }
                    dng = a;
                }
                else {
                    if (n5 != 0) {
                        v = (igf)fgf.v;
                    }
                    if (n9 != 0) {
                        b = true;
                    }
                    int n29 = n25;
                    if ((n2 & 0x8) != 0x0) {
                        final hng a2 = gp2.a;
                        l = vt4.L(6, gva);
                        n29 = (n25 & 0xFFFFE3FF);
                    }
                    n28 = n29;
                    if ((n2 & 0x20) != 0x0) {
                        b2 = gp2.b(31);
                        n28 = (n29 & 0xFFF8FFFF);
                    }
                    if (n16 != 0) {
                        bi2 = null;
                    }
                    if (n19 != 0) {
                        a = (dng)gp2.a;
                    }
                    if (n22 != 0) {
                        dng2 = a;
                        final igf igf = v;
                        final ip2 ip2 = b2;
                        final bi2 bi3 = bi2;
                        final llf llf2 = null;
                        igf2 = igf;
                        ip3 = ip2;
                        bi4 = bi3;
                        llf3 = llf2;
                        break Label_0845;
                    }
                    dng = a;
                }
                final igf igf3 = v;
                final ip2 ip4 = b2;
                bi4 = bi2;
                igf2 = igf3;
                ip3 = ip4;
                dng2 = dng;
                llf3 = llf;
            }
            gva.r();
            final cib a3 = bi6.a;
            llf llf4;
            if (llf3 == null) {
                gva.g0(1691726283);
                Object o;
                if ((o = gva.R()) == a3) {
                    o = oz1.g(gva);
                }
                llf4 = (llf)o;
                gva.q(false);
            }
            else {
                gva.g0(-499618164);
                gva.q(false);
                llf4 = llf3;
            }
            long n30;
            if (b) {
                n30 = cp2.a;
            }
            else {
                n30 = cp2.c;
            }
            long n31;
            if (b) {
                n31 = cp2.b;
            }
            else {
                n31 = cp2.d;
            }
            final float n32 = 0.0f;
            dg0 c;
            if (ip3 == null) {
                gva.g0(1691909926);
                gva.q(false);
                c = null;
            }
            else {
                gva.g0(-499611589);
                final int n33 = (n28 >> 6 & 0xE) | (n28 >> 9 & 0x380);
                Object r;
                if ((r = gva.R()) == a3) {
                    r = new v8m();
                    gva.q0(r);
                }
                final v8m v8m = (v8m)r;
                final boolean f = gva.f((Object)llf4);
                final Object r2 = gva.R();
                Object o2;
                if (f || (o2 = r2) == a3) {
                    o2 = new p10((Object)llf4, (Object)v8m, (f07)null, (byte)6);
                    gva.q0(o2);
                }
                mlc.f((zta)o2, gva, llf4);
                final eic eic = (eic)c86.R0((List)v8m);
                float n34 = 0.0f;
                Label_1207: {
                    if (b) {
                        if (eic instanceof vlh) {
                            n34 = ip3.b;
                            break Label_1207;
                        }
                        if (eic instanceof wmb) {
                            n34 = 1.0f;
                            break Label_1207;
                        }
                        if (!(eic instanceof gma)) {
                            n34 = ip3.a;
                            break Label_1207;
                        }
                    }
                    n34 = 0.0f;
                }
                Object r3 = gva.R();
                if (r3 == a3) {
                    r3 = new id0(new qs8(n34), yi2.g, null, 12);
                    gva.q0(r3);
                }
                final id0 id0 = (id0)r3;
                final qs8 qs8 = new qs8(n34);
                final boolean h = gva.h((Object)id0);
                final boolean c2 = gva.c(n34);
                final boolean b4 = (((n33 & 0xE) ^ 0x6) > 4 && gva.g(b)) || (n33 & 0x6) == 0x4;
                boolean b5 = false;
                Label_1382: {
                    if (((n33 & 0x380) ^ 0x180) > 256) {
                        b5 = b3;
                        if (gva.f((Object)ip3)) {
                            break Label_1382;
                        }
                    }
                    b5 = ((n33 & 0x180) == 0x100 && b3);
                }
                final boolean h2 = gva.h((Object)eic);
                Object r4 = gva.R();
                if ((h | c2 | b4 | b5 | h2) || r4 == a3) {
                    r4 = new hp2(id0, n34, b, ip3, eic, (f07)null);
                    gva.q0(r4);
                }
                mlc.f((zta)r4, gva, qs8);
                c = id0.c;
                gva.q(false);
            }
            float v2 = n32;
            if (c != null) {
                v2 = ((qs8)c.w.getValue()).v;
            }
            Object r5;
            if ((r5 = gva.R()) == a3) {
                r5 = new mx1((byte)27);
                gva.q0(r5);
            }
            a6n.c(jta, wsk.b((lta)r5, igf2, false), b, l, n30, n31, 0.0f, v2, bi4, llf4, uuj.t0(-535639973, (aua)new fin(n31, (Object)dng2, (aua)bua, (byte)2), gva), gva, (n28 & 0x1F8E) | (0xE000000 & n28 << 6), 64);
            final igf igf4 = igf2;
            b2 = ip3;
            llf5 = llf3;
            v = igf4;
        }
        else {
            gva.Z();
            final bi2 bi5 = bi2;
            llf5 = llf;
            dng2 = a;
            bi4 = bi5;
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new lp2(jta, v, b, l, cp2, b2, bi4, dng2, llf5, bua, n, n2);
        }
    }
    
    public static final Object b0(final lta lta, final h07 h07) {
        if (h07.getContext().M0((gc7)p3.z) == null) {
            return ien.v(h07.getContext()).p0((f07)h07, lta);
        }
        fvd.c();
        return null;
    }
    
    public static vc6 c() {
        final bqc bqc = new bqc(true);
        bqc.O((opc)null);
        return (vc6)bqc;
    }
    
    public static int c0(final byte[] array, int a, final uxq uxq) {
        final int i0 = i0(array, a, uxq);
        a = uxq.a;
        if (a < 0) {
            ehq.c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (a > array.length - i0) {
            ehq.c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (a == 0) {
            uxq.c = xyq.w;
            return i0;
        }
        uxq.c = xyq.l(array, i0, a);
        return i0 + a;
    }
    
    public static final void d(final pqg pqg, final tze tze, final ye6 ye6, final ye6 ye7, final igf igf, final bua bua, final cua cua, final ypg ypg, final gva gva, final int n) {
        gva.i0(238076615);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)pqg)) {
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
            if (gva.f((Object)tze)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.h((Object)ye6)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n4 |= n6;
        }
        int n7 = n4;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)ye7)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n4 | n8);
        }
        int n9 = n7;
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.f((Object)igf)) {
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
            if (gva.h((Object)bua)) {
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
            if (gva.h((Object)cua)) {
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
            if (gva.f((Object)ypg)) {
                n16 = 8388608;
            }
            else {
                n16 = 4194304;
            }
            n15 = (n13 | n16);
        }
        final boolean b = true;
        if (gva.W(n15 & 0x1, (0x492493 & n15) != 0x492492)) {
            ypg u0;
            if (ypg == null) {
                gva.g0(1158379279);
                final boolean b2 = (n15 & 0x70) == 0x20;
                final Object r = gva.R();
                Object o;
                if (b2 || (o = r) == bi6.a) {
                    o = new uhd(tze, (byte)0);
                    gva.q0(o);
                }
                u0 = uuj.u0((jta)o, cua != null && b, gva);
                gva.q(false);
            }
            else {
                gva.g0(1158378225);
                gva.q(false);
                u0 = ypg;
            }
            final igf e = igf.E((igf)androidx.compose.foundation.layout.b.c);
            final gun a = thd.a;
            final int n17 = n15 << 3;
            kun.a(e, pqg, tze, a, ye6, bua, u0, cua, ye7, gva, (n17 & 0x1C00000) | ((n17 & 0x70) | 0xC00 | (n17 & 0x380) | (n15 << 6 & 0xE000) | (0x70000 & n15)) | (n15 << 15 & 0xE000000));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new t24((Object)pqg, (Object)tze, (aua)ye6, (aua)ye7, (Object)igf, (aua)bua, (Object)cua, (Object)ypg, n, (byte)2);
        }
    }
    
    public static int d0(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n + 1] & 0xFF) << 8 | (array[n] & 0xFF) | (array[n + 2] & 0xFF) << 16);
    }
    
    public static final void e(final int n, final int n2, jta jta, final gva gva, igf v, final boolean b) {
        gva.i0(-826005988);
        int n3;
        if (gva.g(b)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        final int n4 = n3 | n;
        final int n5 = n4 | 0x30;
        final int n6 = n2 & 0x4;
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0x1B0);
        }
        else {
            n7 = n5;
            if ((n & 0x180) == 0x0) {
                int n8;
                if (gva.h((Object)jta)) {
                    n8 = 256;
                }
                else {
                    n8 = 128;
                }
                n7 = (n5 | n8);
            }
        }
        if (gva.W(n7 & 0x1, (n7 & 0x93) != 0x92)) {
            if (n6 != 0) {
                jta = null;
            }
            final alo i0 = ri2.I0(100, 0, null, 6);
            ljq.h(b, null, pc9.g(i0, 2), pc9.h(i0, 2), null, (bua)uuj.t0(-310792636, (aua)new uo1(jta, (byte)1), gva), gva, (n7 & 0xE) | 0x30D80, 18);
            v = (igf)fgf.v;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new bkg(n, n2, jta, v, b);
        }
    }
    
    public static int e0(final t5r t5r, final int n, final byte[] array, int i, final int n2, final g2r g2r, final uxq uxq) {
        final q1r b = t5r.b();
        i = n0(b, t5r, array, i, n2, uxq);
        t5r.c((Object)b);
        ((List)g2r).add(uxq.c = b);
        while (i < n2) {
            final int i2 = i0(array, i, uxq);
            if (n != uxq.a) {
                break;
            }
            final q1r b2 = t5r.b();
            i = n0(b2, t5r, array, i2, n2, uxq);
            t5r.c((Object)b2);
            ((List)g2r).add(uxq.c = b2);
        }
        return i;
    }
    
    public static final void f(final jta jta, igf v, boolean b, aql l, final cp2 cp2, final bi2 bi2, final dng dng, final bua bua, final gva gva, final int n, final int n2) {
        gva.i0(-1061374109);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)jta)) {
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
        int n10;
        if (n9 != 0) {
            n10 = (n8 | 0x180);
        }
        else {
            n10 = n8;
            if ((n & 0x180) == 0x0) {
                int n11;
                if (gva.g(b)) {
                    n11 = 256;
                }
                else {
                    n11 = 128;
                }
                n10 = (n8 | n11);
            }
        }
        if ((n & 0xC00) == 0x0) {
            int n12;
            if ((n2 & 0x8) == 0x0 && gva.f((Object)l)) {
                n12 = 2048;
            }
            else {
                n12 = 1024;
            }
            n10 |= n12;
        }
        if ((n & 0x6000) == 0x0) {
            int n13;
            if ((n2 & 0x10) == 0x0 && gva.f((Object)cp2)) {
                n13 = 16384;
            }
            else {
                n13 = 8192;
            }
            n10 |= n13;
        }
        final bi2 bi3 = null;
        int n14;
        if ((n2 & 0x20) != 0x0) {
            n14 = (n10 | 0x30000);
        }
        else {
            n14 = n10;
            if ((n & 0x30000) == 0x0) {
                int n15;
                if (gva.f((Object)null)) {
                    n15 = 131072;
                }
                else {
                    n15 = 65536;
                }
                n14 = (n10 | n15);
            }
        }
        final int n16 = n2 & 0x40;
        int n17;
        if (n16 != 0) {
            n17 = (n14 | 0x180000);
        }
        else {
            n17 = n14;
            if ((0x180000 & n) == 0x0) {
                int n18;
                if (gva.f((Object)bi2)) {
                    n18 = 1048576;
                }
                else {
                    n18 = 524288;
                }
                n17 = (n14 | n18);
            }
        }
        final int n19 = n17 | 0x6C00000;
        int n21;
        if ((0x30000000 & n) == 0x0) {
            int n20;
            if (gva.h((Object)bua)) {
                n20 = 536870912;
            }
            else {
                n20 = 268435456;
            }
            n21 = (n19 | n20);
        }
        else {
            n21 = n19;
        }
        aql aql2;
        cp2 cp3;
        igf igf3;
        bi2 bi6;
        dng dng3;
        if (gva.W(n21 & 0x1, (0x12492493 & n21) != 0x12492492)) {
            gva.b0();
            int n23;
            igf igf;
            bi2 bi4;
            cp2 c;
            dng dng2;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n22 = n21;
                if ((n2 & 0x8) != 0x0) {
                    n22 = (n21 & 0xFFFFE3FF);
                }
                n23 = n22;
                if ((n2 & 0x10) != 0x0) {
                    n23 = (n22 & 0xFFFF1FFF);
                }
                igf = v;
                final aql aql = l;
                bi4 = bi2;
                aql2 = aql;
                c = cp2;
                dng2 = dng;
            }
            else {
                if (n5 != 0) {
                    v = (igf)fgf.v;
                }
                if (n9 != 0) {
                    b = true;
                }
                int n24 = n21;
                if ((n2 & 0x8) != 0x0) {
                    final hng a = gp2.a;
                    l = vt4.L(6, gva);
                    n24 = (n21 & 0xFFFFE3FF);
                }
                n23 = n24;
                c = cp2;
                if ((n2 & 0x10) != 0x0) {
                    final hng a2 = gp2.a;
                    c = gp2.c(((e8e)gva.j((sei)h8e.a)).a);
                    n23 = (n24 & 0xFFFF1FFF);
                }
                bi2 bi5;
                if (n16 != 0) {
                    bi5 = bi3;
                }
                else {
                    bi5 = bi2;
                }
                final hng c2 = gp2.c;
                final igf igf2 = v;
                dng2 = (dng)c2;
                aql2 = l;
                bi4 = bi5;
                igf = igf2;
            }
            gva.r();
            b(jta, igf, b, aql2, c, null, bi4, dng2, null, bua, gva, n23 & 0x7FFFFFFE, 0);
            cp3 = c;
            igf3 = igf;
            bi6 = bi4;
            dng3 = dng2;
        }
        else {
            gva.Z();
            cp3 = cp2;
            bi6 = bi2;
            dng3 = dng;
            aql2 = l;
            igf3 = v;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new tt(jta, igf3, b, aql2, (Object)cp3, (Object)bi6, (Object)dng3, bua, n, n2, (byte)1);
        }
    }
    
    public static int f0(final byte[] array, int i, final g2r g2r, final uxq uxq) {
        final t1r t1r = (t1r)g2r;
        i = i0(array, i, uxq);
        final int a = uxq.a;
        if (a < 0) {
            ehq.c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (a > array.length - i) {
            ehq.c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        final int n = a + i;
        while (i < n) {
            i = i0(array, i, uxq);
            t1r.e(uxq.a);
        }
        if (i == n) {
            return i;
        }
        ehq.c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }
    
    public static final void g(final String s, final boolean b, final jta jta, igf igf, final float n, String s2, final String s3, final mnn mnn, d93 d93, final gva gva, final int n2, final int n3) {
        gva.i0(848392739);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            int n4;
            if (gva.f((Object)s)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n2);
        }
        else {
            n5 = n2;
        }
        int n6 = n5;
        if ((n2 & 0x30) == 0x0) {
            int n7;
            if (gva.g(b)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n2 & 0x180) == 0x0) {
            int n9;
            if (gva.h((Object)jta)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n6 | n9);
        }
        final int n10 = n3 & 0x8;
        int n13 = 0;
        Label_0199: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0xC00);
            }
            else {
                n11 = n8;
                if ((n2 & 0xC00) == 0x0) {
                    int n12;
                    if (gva.f((Object)igf)) {
                        n12 = 2048;
                    }
                    else {
                        n12 = 1024;
                    }
                    n13 = (n8 | n12);
                    break Label_0199;
                }
            }
            n13 = n11;
        }
        int n14 = n13;
        if ((n2 & 0x6000) == 0x0) {
            int n15;
            if (gva.c(n)) {
                n15 = 16384;
            }
            else {
                n15 = 8192;
            }
            n14 = (n13 | n15);
        }
        int n17;
        if ((n2 & 0x30000) == 0x0) {
            int n16;
            if ((n3 & 0x20) == 0x0 && gva.f((Object)s2)) {
                n16 = 131072;
            }
            else {
                n16 = 65536;
            }
            n17 = (n14 | n16);
        }
        else {
            n17 = n14;
        }
        int n18 = n17;
        if ((n2 & 0x180000) == 0x0) {
            int n19;
            if (gva.f((Object)s3)) {
                n19 = 1048576;
            }
            else {
                n19 = 524288;
            }
            n18 = (n17 | n19);
        }
        int n21;
        if ((0xC00000 & n2) == 0x0) {
            int n20;
            if ((n3 & 0x80) == 0x0 && gva.f((Object)mnn)) {
                n20 = 8388608;
            }
            else {
                n20 = 4194304;
            }
            n21 = (n18 | n20);
        }
        else {
            n21 = n18;
        }
        final int n22 = n3 & 0x100;
        int n25 = 0;
        Label_0486: {
            int n23;
            if (n22 != 0) {
                n23 = (n21 | 0x6000000);
            }
            else {
                n23 = n21;
                if ((n2 & 0x6000000) == 0x0) {
                    int ordinal;
                    if (d93 == null) {
                        ordinal = -1;
                    }
                    else {
                        ordinal = ((Enum)d93).ordinal();
                    }
                    int n24;
                    if (gva.d(ordinal)) {
                        n24 = 67108864;
                    }
                    else {
                        n24 = 33554432;
                    }
                    n25 = (n21 | n24);
                    break Label_0486;
                }
            }
            n25 = n23;
        }
        mnn mnn4;
        String s8;
        if (gva.W(n25 & 0x1, (0x2492493 & n25) != 0x2492492)) {
            gva.b0();
            final fgf v = fgf.v;
            Object o;
            mnn mnn2;
            d93 d95;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n26 = n25;
                if ((n3 & 0x20) != 0x0) {
                    n26 = (n25 & 0xFFF8FFFF);
                }
                n25 = n26;
                if ((n3 & 0x80) != 0x0) {
                    n25 = (n26 & 0xFE3FFFFF);
                }
                final d93 d94 = d93;
                o = igf;
                mnn2 = mnn;
                d95 = d94;
            }
            else {
                igf igf2 = igf;
                if (n10 != 0) {
                    igf2 = (igf)v;
                }
                String s4;
                if ((n3 & 0x20) != 0x0) {
                    s4 = S(2131758674, gva);
                    n25 &= 0xFFF8FFFF;
                }
                else {
                    s4 = s2;
                }
                mnn mnn3;
                if ((n3 & 0x80) != 0x0) {
                    final cy4 a = qy4.a;
                    mnn3 = (mnn)((uy4)qy4.c(gva).k.v).L;
                    n25 &= 0xFE3FFFFF;
                }
                else {
                    mnn3 = mnn;
                }
                if (n22 != 0) {
                    final d93 y = d93.y;
                    final String s5 = s4;
                    mnn2 = mnn3;
                    o = igf2;
                    s2 = s5;
                    d95 = y;
                }
                else {
                    d95 = d93;
                    final String s6 = s4;
                    mnn2 = mnn3;
                    s2 = s6;
                    o = igf2;
                }
            }
            gva.r();
            long n27;
            if (b) {
                gva.g0(-738342193);
                final cy4 a2 = qy4.a;
                n27 = qy4.a(gva).i;
            }
            else {
                gva.g0(-738340601);
                final cy4 a3 = qy4.a;
                final vk2 r = qy4.a(gva).R;
                vk2.b.getClass();
                n27 = uk2.b;
            }
            gva.q(false);
            final long b2 = qy4.a(gva).a.b();
            if (s3 != null || jta == null) {
                gva.g0(-1413347049);
                final mb2 b3 = wab.B;
                final igf h = rhc.h(rml.k(b.p((igf)o, n), (aql)ovj.a), n27, zn2.k);
                igf igf3;
                if (jta != null) {
                    gva.g0(-1413127383);
                    gva.q(false);
                    igf3 = m3r.j(androidx.compose.foundation.b.c((igf)v, false, (String)null, new iuj(0), (llf)null, jta, 11));
                }
                else {
                    gva.g0(-1413001182);
                    final boolean b4 = (((n25 & 0x70000) ^ 0x30000) > 131072 && gva.f((Object)s2)) || (n25 & 0x30000) == 0x20000;
                    final Object r2 = gva.R();
                    Object o2;
                    if (b4 || (o2 = r2) == bi6.a) {
                        o2 = new jy4(s2, (byte)18);
                        gva.q0(o2);
                    }
                    igf3 = wsk.a((igf)v, (lta)o2);
                    gva.q(false);
                }
                final igf e = h.E(igf3);
                final moe c = rj2.c((gx)b3, false);
                final int hashCode = Long.hashCode(gva.T);
                final e3h l = gva.l();
                final igf b5 = ien.B(gva, e);
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
                k8e.P((zta)awp.y, gva, b5);
                a(s3, s2, uuj.t0(1433958518, (aua)new y1p(s, b2, mnn2, d95), gva), gva, (n25 >> 15 & 0x70) | 0xC06 | (n25 >> 9 & 0x380));
                gva.q(true);
                gva.q(false);
                final b0j v2 = gva.v();
                if (v2 != null) {
                    v2.d = (zta)new z1p(s, b, jta, (igf)o, n, s2, s3, mnn2, d95, n2, n3, (byte)0);
                }
                return;
            }
            else {
                gva.g0(-1411832513);
                gva.q(false);
                qt7.c((n25 >> 6 & 0xE) | 0x180000, 44, uuj.t0(265039619, (aua)new cj4((Object)s, (Object)s2, (Object)mnn2, (Object)d95, (byte)10), gva), jta, gva, lq6.J(n27, b2, 0L, 0L, gva, 24576, 12), m3r.j(b.p((igf)o, n)), null, false);
                final igf igf4 = (igf)o;
                final String s7 = s2;
                mnn4 = mnn2;
                d93 = d95;
                igf = igf4;
                s8 = s7;
            }
        }
        else {
            gva.Z();
            final String s9 = s2;
            mnn4 = mnn;
            s8 = s9;
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new z1p(s, b, jta, igf, n, s8, s3, mnn4, d93, n2, n3, (byte)1);
        }
    }
    
    public static int g0(final byte[] array, int i, final uxq uxq) {
        i = i0(array, i, uxq);
        final int a = uxq.a;
        if (a < 0) {
            ehq.c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (a == 0) {
            uxq.c = "";
            return i;
        }
        final int a2 = i8r.a;
        final int length = array.length;
        if ((length - i - a | (i | a)) >= 0) {
            int n;
            char[] array2;
            int n2;
            byte b;
            for (n = i + a, array2 = new char[a], n2 = 0; i < n; ++i, array2[n2] = (char)b, ++n2) {
                b = array[i];
                if (!l4r.m(b)) {
                    break;
                }
            }
            while (i < n) {
                int n3 = i + 1;
                final byte b2 = array[i];
                if (l4r.m(b2)) {
                    array2[n2] = (char)b2;
                    int n4 = n2 + 1;
                    while (true) {
                        n2 = n4;
                        i = n3;
                        if (n3 >= n) {
                            break;
                        }
                        final byte b3 = array[n3];
                        n2 = n4;
                        i = n3;
                        if (!l4r.m(b3)) {
                            break;
                        }
                        ++n3;
                        array2[n4] = (char)b3;
                        ++n4;
                    }
                }
                else if (b2 < -32) {
                    if (n3 >= n) {
                        ehq.c("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    final int n5 = n2 + 1;
                    i += 2;
                    l4r.l(b2, array[n3], array2, n2);
                    n2 = n5;
                }
                else if (b2 < -16) {
                    if (n3 >= n - 1) {
                        ehq.c("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    final int n6 = n2 + 1;
                    final byte b4 = array[n3];
                    final int n7 = i + 3;
                    l4r.k(b2, b4, array[i + 2], array2, n2);
                    n2 = n6;
                    i = n7;
                }
                else {
                    if (n3 >= n - 2) {
                        ehq.c("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    final byte b5 = array[n3];
                    final byte b6 = array[i + 2];
                    final int n8 = i + 4;
                    l4r.j(b2, b5, b6, array[i + 3], array2, n2);
                    n2 += 2;
                    i = n8;
                }
            }
            uxq.c = new String(array2, 0, n2);
            return n;
        }
        oyl.o("buffer length=%d, index=%d, size=%d", new Object[] { length, i, a });
        return 0;
    }
    
    public static final void h(final ilf ilf, final int n) {
        if (ilf.b != 0 && (ilf.c(0) == n || ilf.c(ilf.b - 1) == n)) {
            return;
        }
        int i = ilf.b;
        ilf.a(n);
        while (i > 0) {
            final int n2 = (i + 1 >>> 1) - 1;
            final int c = ilf.c(n2);
            if (n <= c) {
                break;
            }
            ilf.f(i, c);
            i = n2;
        }
        ilf.f(i, n);
    }
    
    public static int h0(final int n, final byte[] array, int n2, int a, final h7r h7r, final uxq uxq) {
        if (n >>> 3 == 0) {
            ehq.c("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        final int n3 = n & 0x7;
        if (n3 == 0) {
            n2 = l0(array, n2, uxq);
            h7r.c(n, (Object)uxq.b);
            return n2;
        }
        if (n3 == 1) {
            h7r.c(n, (Object)p0(array, n2));
            return n2 + 8;
        }
        if (n3 != 2) {
            if (n3 != 3) {
                if (n3 == 5) {
                    h7r.c(n, (Object)d0(array, n2));
                    return n2 + 4;
                }
                ehq.c("Protocol message contained an invalid tag (zero).");
                return 0;
            }
            else {
                final int n4 = (n & 0xFFFFFFF8) | 0x4;
                final h7r b = h7r.b();
                q0(++uxq.d);
                int n5 = 0;
                int n6;
                int i0;
                while (true) {
                    n6 = n5;
                    i0 = n2;
                    if (n2 >= a) {
                        break;
                    }
                    i0 = i0(array, n2, uxq);
                    n2 = uxq.a;
                    if (n2 == n4) {
                        n6 = n2;
                        break;
                    }
                    final int h0 = h0(n2, array, i0, a, b, uxq);
                    n5 = n2;
                    n2 = h0;
                }
                --uxq.d;
                if (i0 <= a && n6 == n4) {
                    h7r.c(n, (Object)b);
                    return i0;
                }
                ehq.c("Failed to parse the message.");
                return 0;
            }
        }
        else {
            n2 = i0(array, n2, uxq);
            a = uxq.a;
            if (a < 0) {
                ehq.c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (a <= array.length - n2) {
                if (a == 0) {
                    h7r.c(n, (Object)xyq.w);
                }
                else {
                    h7r.c(n, (Object)xyq.l(array, n2, a));
                }
                return n2 + a;
            }
            ehq.c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
    }
    
    public static final void i(final inf inf, final hgf hgf) {
        final inf m = L(hgf).M();
        int i = m.x - 1;
        final Object[] v = m.v;
        if (i < v.length) {
            while (i >= 0) {
                inf.b((Object)((LayoutNode)v[i]).Z.B);
                --i;
            }
        }
    }
    
    public static int i0(final byte[] array, int a, final uxq uxq) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            uxq.a = a;
            return n;
        }
        return j0(a, array, n, uxq);
    }
    
    public static void j(final Throwable t, final Throwable t2) {
        if (t != t2) {
            final Integer a = aoc.a;
            if (a == null || a >= 19) {
                t.addSuppressed(t2);
                return;
            }
            final Method a2 = yah.a;
            if (a2 != null) {
                a2.invoke((Object)t, new Object[] { t2 });
            }
        }
    }
    
    public static int j0(int n, final byte[] array, int n2, final uxq uxq) {
        final byte b = array[n2];
        final int n3 = n2 + 1;
        n &= 0x7F;
        if (b >= 0) {
            uxq.a = (n | b << 7);
            return n3;
        }
        final int n4 = n | (b & 0x7F) << 7;
        n = n2 + 2;
        final byte b2 = array[n3];
        if (b2 >= 0) {
            uxq.a = (n4 | b2 << 14);
            return n;
        }
        final int n5 = n4 | (b2 & 0x7F) << 14;
        final int n6 = n2 + 3;
        n = array[n];
        if (n >= 0) {
            uxq.a = (n5 | n << 21);
            return n6;
        }
        final int n7 = n5 | (n & 0x7F) << 21;
        n = n2 + 4;
        final byte b3 = array[n6];
        if (b3 >= 0) {
            uxq.a = (n7 | b3 << 28);
            return n;
        }
        while (true) {
            n2 = n + 1;
            if (array[n] >= 0) {
                break;
            }
            n = n2;
        }
        uxq.a = (n7 | (b3 & 0x7F) << 28);
        return n2;
    }
    
    public static final Object k(final mgk mgk, final float n, final cg0 cg0, final h07 h07) {
        Object o = null;
        Label_0055: {
            if (h07 instanceof jfk) {
                final jfk jfk = (jfk)h07;
                final int x = jfk.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    jfk.x = x + Integer.MIN_VALUE;
                    o = jfk;
                    break Label_0055;
                }
            }
            o = new jfk(h07);
        }
        final Object w = ((jfk)o).w;
        final int x2 = ((jfk)o).x;
        y3j v;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((jfk)o).v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            final Object v2 = new Object();
            final g53 g53 = new g53(n, cg0, (y3j)v2, (f07)null);
            ((jfk)o).v = (y3j)v2;
            ((jfk)o).x = 1;
            final Object b = mgk.b(lnf.v, (zta)g53, (f07)o);
            final pc7 v3 = pc7.v;
            if (b == v3) {
                return v3;
            }
            v = (y3j)v2;
        }
        return new Float(v.v);
    }
    
    public static int k0(final int n, final byte[] array, int i, final int n2, final g2r g2r, final uxq uxq) {
        final t1r t1r = (t1r)g2r;
        i = i0(array, i, uxq);
        t1r.e(uxq.a);
        while (i < n2) {
            final int i2 = i0(array, i, uxq);
            if (n != uxq.a) {
                break;
            }
            i = i0(array, i2, uxq);
            t1r.e(uxq.a);
        }
        return i;
    }
    
    public static int l0(final byte[] array, int n, final uxq uxq) {
        final long b = array[n];
        final int n2 = n + 1;
        if (b >= 0L) {
            uxq.b = b;
            return n2;
        }
        n += 2;
        byte b2 = array[n2];
        long b3 = (b & 0x7FL) | (long)(b2 & 0x7F) << 7;
        for (int n3 = 7; b2 < 0; b2 = array[n], n3 += 7, b3 |= (long)(b2 & 0x7F) << n3, ++n) {}
        uxq.b = b3;
        return n;
    }
    
    public static final boolean m(final int n, final int n2, final int n3, final byte[] array, final byte[] array2) {
        for (int i = 0; i < n3; ++i) {
            if (array[i + n] != array2[i + n2]) {
                return false;
            }
        }
        return true;
    }
    
    public static int m0(final Object c, final t5r t5r, final byte[] array, int s, final int n, final int n2, final uxq uxq) {
        final y4r y4r = (y4r)t5r;
        q0(++uxq.d);
        s = y4r.s(c, array, s, n, n2, uxq);
        --uxq.d;
        uxq.c = c;
        return s;
    }
    
    public static final a0d n(hgf hgf) {
        if ((hgf.x & 0x2) != 0x0) {
            if (hgf instanceof a0d) {
                return (a0d)hgf;
            }
            if (hgf instanceof v98) {
                hgf = ((v98)hgf).K;
                while (hgf != null) {
                    if (hgf instanceof a0d) {
                        return (a0d)hgf;
                    }
                    if (hgf instanceof v98 && (hgf.x & 0x2) != 0x0) {
                        hgf = ((v98)hgf).K;
                    }
                    else {
                        hgf = hgf.A;
                    }
                }
            }
        }
        return null;
    }
    
    public static int n0(final Object c, final t5r t5r, final byte[] array, int a, int d, final uxq uxq) {
        final int n = a + 1;
        final int n2 = array[a];
        int j0 = n;
        a = n2;
        if (n2 < 0) {
            j0 = j0(n2, array, n, uxq);
            a = uxq.a;
        }
        if (a >= 0 && a <= d - j0) {
            d = uxq.d + 1;
            q0(uxq.d = d);
            a += j0;
            t5r.e(c, array, j0, a, uxq);
            --uxq.d;
            uxq.c = c;
            return a;
        }
        ehq.c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }
    
    public static final Object o(final c03 c03, final f07 f07) {
        final l13 l13 = new l13(1, ljq.K(f07));
        l13.r();
        l13.v((lta)new dr0((Object)c03, (byte)2));
        c03.t((m03)new xwc(l13));
        return l13.p();
    }
    
    public static int o0(int a, final byte[] array, int o0, final int n, final uxq uxq) {
        if (a >>> 3 == 0) {
            ehq.c("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        final int n2 = a & 0x7;
        if (n2 == 0) {
            return l0(array, o0, uxq);
        }
        if (n2 == 1) {
            return o0 + 8;
        }
        if (n2 == 2) {
            return i0(array, o0, uxq) + uxq.a;
        }
        if (n2 != 3) {
            if (n2 == 5) {
                return o0 + 4;
            }
            ehq.c("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        else {
            final int n3 = (a & 0xFFFFFFF8) | 0x4;
            a = uxq.d + 1;
            q0(uxq.d = a);
            a = 0;
            int i0;
            while (true) {
                i0 = o0;
                if (o0 >= n) {
                    break;
                }
                i0 = i0(array, o0, uxq);
                a = uxq.a;
                if (a == n3) {
                    break;
                }
                o0 = o0(a, array, i0, n, uxq);
            }
            --uxq.d;
            if (i0 <= n && a == n3) {
                return i0;
            }
            ehq.c("Failed to parse the message.");
            return 0;
        }
    }
    
    public static final Object p(final c03 c03, final f07 f07) {
        final l13 l13 = new l13(1, ljq.K(f07));
        l13.r();
        l13.v((lta)new ywc(c03, (byte)0));
        c03.t((m03)new f03(l13));
        return l13.p();
    }
    
    public static long p0(final byte[] array, final int n) {
        return ((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48 | ((long)array[n + 7] & 0xFFL) << 56;
    }
    
    public static final void q(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        final StringBuilder u = smk.u(n, "size=", " offset=");
        u.append(n2);
        u.append(" byteCount=");
        u.append(n3);
        throw new ArrayIndexOutOfBoundsException(u.toString());
    }
    
    public static void q0(final int n) {
        if (n < 100) {
            return;
        }
        ehq.c("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
    
    public static final void r(final SharedPreferences sharedPreferences, final SharedPreferences sharedPreferences2) {
        final SharedPreferences$Editor edit = sharedPreferences2.edit();
        for (final Map$Entry map$Entry : sharedPreferences.getAll().entrySet()) {
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            if (value instanceof String) {
                edit.putString((String)map$Entry.getKey(), (String)value);
            }
            else if (value instanceof Set) {
                edit.putStringSet((String)map$Entry.getKey(), (Set)value);
            }
            else if (value instanceof Integer) {
                edit.putInt((String)map$Entry.getKey(), ((Number)value).intValue());
            }
            else if (value instanceof Long) {
                edit.putLong((String)map$Entry.getKey(), ((Number)value).longValue());
            }
            else if (value instanceof Float) {
                edit.putFloat((String)map$Entry.getKey(), ((Number)value).floatValue());
            }
            else if (value instanceof Boolean) {
                edit.putBoolean((String)map$Entry.getKey(), (boolean)value);
            }
            else {
                SilentException.a(new SilentException(smk.r(map$Entry.getKey(), "Unsupported value type for preference key: ")), (lpl)null, (List)null, 7);
            }
        }
        edit.apply();
    }
    
    public static j78 s(final gwj gwj, final gva gva, final int n) {
        return ao2.c0((ylm)new l78((Object)new l78((Object)ien.q(), (Object)new l78((Object)ri2.I0(0, 0, null, 7), (Object)new z3a((byte)1), (byte)0), (byte)1), (Object)twl.Q(3), (byte)1), t(gwj, ((hwj)gva.j((sei)iwj.a)).a.g(), gva, n & 0x3FE, 0), 2);
    }
    
    public static lta t(final gwj gwj, ho1 g, final gva gva, final int n, int n2) {
        gva.g0(-625238808);
        if ((n2 & 0x2) != 0x0) {
            g = ((hwj)gva.j((sei)iwj.a)).a.g();
        }
        final mwj c = mwj.C;
        gva.g0(440934525);
        gva.q(false);
        final int n3 = 1;
        if ((((n & 0x70) ^ 0x30) > 32 && gva.h((Object)g)) || (n & 0x30) == 0x20) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        int n4 = 0;
        Label_0132: {
            if (((n & 0xE) ^ 0x6) > 4) {
                n4 = n3;
                if (gva.h((Object)gwj)) {
                    break Label_0132;
                }
            }
            if ((n & 0x6) == 0x4) {
                n4 = n3;
            }
            else {
                n4 = 0;
            }
        }
        final boolean f = gva.f((Object)c);
        final Object r = gva.R();
        Object o;
        if ((n2 | n4 | (f ? 1 : 0)) != 0x0 || (o = r) == bi6.a) {
            o = new tt8(g, gwj);
            gva.q0(o);
        }
        final lta lta = (lta)o;
        gva.q(false);
        return lta;
    }
    
    public static final ija u(final ija ija) {
        if (ija instanceof yom) {
            return ija;
        }
        return (ija)v(ija, (lta)soh.h, (zta)soh.i);
    }
    
    public static final jq8 v(final ija ija, final lta lta, final zta zta) {
        if (ija instanceof jq8) {
            final jq8 jq8 = (jq8)ija;
            if (jq8.w == lta && jq8.x == zta) {
                return jq8;
            }
        }
        return new jq8(ija, lta, zta);
    }
    
    public static void w(long n, final byte[] array, final int n2, final int n3) {
        final int n4 = Long.numberOfLeadingZeros(n) >>> 2;
        Arrays.fill(array, n2, n3 - 16 + n2 + n4, (byte)48);
        for (int i = 0; i < 16 - n4; ++i) {
            array[n2 + n3 - 1 - i] = soh.j[(int)(0xFL & n)];
            n >>>= 4;
        }
    }
    
    public static final List x(final n48 n48, int n49, final int n50) {
        if (n49 == n50) {
            return (List)r89.v;
        }
        final boolean b = n50 > n49;
        final ArrayList list = new ArrayList();
        int i;
    Label_0274:
        do {
            if (b) {
                if (n49 >= n50) {
                    return (List)list;
                }
            }
            else if (n49 <= n50) {
                return (List)list;
            }
            final LinkedHashMap a = n48.a;
            yog yog = null;
            Label_0139: {
                if (b) {
                    final TreeMap treeMap = (TreeMap)a.get((Object)n49);
                    if (treeMap != null) {
                        yog = new yog((Object)treeMap, (Object)treeMap.descendingKeySet());
                        break Label_0139;
                    }
                }
                else {
                    final TreeMap treeMap2 = (TreeMap)a.get((Object)n49);
                    if (treeMap2 != null) {
                        yog = new yog((Object)treeMap2, (Object)treeMap2.keySet());
                        break Label_0139;
                    }
                }
                yog = null;
            }
            if (yog == null) {
                break;
            }
            final Map map = (Map)yog.v;
            final Iterator iterator = ((Iterable)yog.w).iterator();
            while (iterator.hasNext()) {
                final int intValue = ((Number)iterator.next()).intValue();
                if (b) {
                    if (n49 + 1 > intValue || intValue > n50) {
                        continue;
                    }
                }
                else if (n50 > intValue || intValue >= n49) {
                    continue;
                }
                final Object value = map.get((Object)intValue);
                value.getClass();
                list.add(value);
                final int n51 = 1;
                n49 = intValue;
                i = n51;
                continue Label_0274;
            }
            i = 0;
        } while (i != 0);
        return null;
    }
    
    public static final String y(final pm4 pm4) {
        if (pm4 instanceof nm4) {
            return ((nm4)pm4).a;
        }
        if (pm4 instanceof om4) {
            return zn2.D(((om4)pm4).a);
        }
        en9.r();
        return null;
    }
    
    public static final ViewParent z(final View view) {
        final ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        final Object tag = view.getTag(2131297127);
        if (tag instanceof ViewParent) {
            return (ViewParent)tag;
        }
        return null;
    }
}
