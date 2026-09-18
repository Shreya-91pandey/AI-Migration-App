import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import android.util.Log;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.Map$Entry;
import kotlin.NotImplementedError;
import java.util.concurrent.Callable;
import java.util.Set;
import android.content.Intent;
import android.app.ActivityManager;
import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.CopyOption;
import java.io.File;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.layout.b;
import android.graphics.Shader$TileMode;
import android.os.Build$VERSION;
import android.view.Window;
import com.anthropic.claude.core.telemetry.SilentException;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class c5q
{
    public static final ye6 a;
    public static final eup b;
    public static final Object c;
    
    public static final long A(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) | (((long)array[n] & 0xFFL) << 56 | ((long)array[n + 1] & 0xFFL) << 48 | ((long)array[n + 2] & 0xFFL) << 40 | ((long)array[n + 3] & 0xFFL) << 32 | ((long)array[n + 4] & 0xFFL) << 24 | ((long)array[n + 5] & 0xFFL) << 16 | ((long)array[n + 6] & 0xFFL) << 8);
    }
    
    public static final iqo B(final gva gva) {
        final WeakHashMap x = l2q.x;
        return new iqo((d1q)o50.w(gva).g, (d1q)o50.w(gva).b);
    }
    
    public static final boolean C(final l2p l2p) {
        return l2p.b != null || l2p.a != null || l2p.c != null || l2p.d != null || !l2p.e.isEmpty();
    }
    
    public static igf D(final igf igf, final llf llf) {
        return igf.E(new ymb(llf));
    }
    
    public static void G(final rjc rjc, final jta jta, final Map map, final float n) {
        final tjc tjc = (tjc)((re0)rjc).v;
        hx7 hx7;
        if (tjc instanceof hx7) {
            hx7 = (hx7)tjc;
        }
        else {
            hx7 = null;
        }
        if (hx7 != null) {
            hx7.c();
        }
        if (re0.B(n)) {
            if (tjc != null) {
                final aik feature = tjc.getFeature("rum");
                if (feature != null) {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    zrn.A((Map)linkedHashMap, 2, Float.valueOf(n));
                    feature.a((Object)new tkc((String)jta.a(), linkedHashMap));
                }
            }
        }
    }
    
    public static final q2h H(final String s, lta lta, final gva gva, final int n) {
        gva.g0(923020361);
        if ((n & 0x2) != 0x0) {
            gva.g0(1537041123);
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new kmg((byte)17);
                gva.q0(r);
            }
            lta = (lta)r;
            gva.q(false);
        }
        final q2h i = I(s, lta, (t2h)s2h.a, gva, 390, 0);
        gva.q(false);
        return i;
    }
    
    public static final q2h I(final String s, lta lta, final t2h t2h, final gva gva, final int n, final int n2) {
        gva.g0(-1732095526);
        final cib a = bi6.a;
        if ((n2 & 0x2) != 0x0) {
            gva.g0(1537068707);
            Object r;
            if ((r = gva.R()) == a) {
                r = new kmg((byte)18);
                gva.q0(r);
            }
            lta = (lta)r;
            gva.q(false);
        }
        Object o;
        if (gva.j((sei)nec.a)) {
            o = new enh(t2h);
        }
        else {
            gva.g0(1424240517);
            final Context context = (Context)gva.j((sei)q50.b);
            gva.g0(1134374053);
            Object r2 = null;
            Label_0191: {
                if ((r2 = gva.R()) == a) {
                    for (Object baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper)baseContext).getBaseContext()) {
                        if (baseContext instanceof Activity) {
                            r2 = new jmf(s, context, (Activity)baseContext);
                            gva.q0(r2);
                            break Label_0191;
                        }
                    }
                    en9.q("Permissions should be called in the context of an Activity");
                    return null;
                }
            }
            final jmf jmf = (jmf)r2;
            gva.q(false);
            ncq.f(jmf, null, gva, 0);
            final ke ke = new ke((byte)1);
            gva.g0(1134386901);
            final boolean f = gva.f((Object)jmf);
            final boolean f2 = gva.f((Object)lta);
            final Object r3 = gva.R();
            Object o2;
            if ((f | f2) || (o2 = r3) == a) {
                o2 = new tt8(jmf, lta);
                gva.q0(o2);
            }
            final lta lta2 = (lta)o2;
            gva.q(false);
            final a1e d = k8e.D(ke, lta2, gva, 0);
            gva.g0(1134391322);
            final boolean f3 = gva.f((Object)jmf);
            final boolean h = gva.h((Object)d);
            final Object r4 = gva.R();
            Object o3;
            if ((f3 | h) || (o3 = r4) == a) {
                o3 = new tt8((Object)jmf, (Object)d, (byte)14);
                gva.q0(o3);
            }
            final lta lta3 = (lta)o3;
            gva.q(false);
            mlc.b(jmf, d, lta3, gva);
            gva.q(false);
            o = jmf;
        }
        gva.q(false);
        return (q2h)o;
    }
    
    public static void J(final Context context) {
        final lqo a = lqo.a;
        jpj jpj = null;
        try {
            twl.P(context, (List)eni.e);
        }
        finally {
            final Throwable t;
            jpj = new jpj(t);
        }
        final Throwable a2 = kpj.a((Object)jpj);
        final lpl w = lpl.w;
        if (a2 != null) {
            SilentException.a(new SilentException("Failed to remove long-lived launcher quick actions", a2), w, (List)null, 6);
        }
        jpj jpj2 = null;
        try {
            twl.O(context, (List)eni.e);
        }
        finally {
            final Throwable t2;
            jpj2 = new jpj(t2);
        }
        final Throwable a3 = kpj.a((Object)jpj2);
        if (a3 != null) {
            SilentException.a(new SilentException("Failed to remove launcher quick actions", a3), w, (List)null, 6);
        }
    }
    
    public static final l5p K() {
        final byte[] array = new byte[16];
        jmk.a.nextBytes(array);
        final byte b = (byte)(array[6] & 0xF);
        array[6] = b;
        array[6] = (byte)(b | 0x40);
        final byte b2 = (byte)(array[8] & 0x3F);
        array[8] = b2;
        array[8] = (byte)(b2 | 0x80);
        final long a = A(array, 0);
        final long a2 = A(array, 8);
        if (a == 0L && a2 == 0L) {
            return l5p.x;
        }
        return new l5p(a, a2);
    }
    
    public static void L(final Window window, final boolean b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 35) {
            r4.e(window, b);
            return;
        }
        if (sdk_INT >= 30) {
            a0c.b(window, b);
            return;
        }
        dlq.l(window, b);
    }
    
    public static final Shader$TileMode M(final int n) {
        if (n == 0) {
            return Shader$TileMode.CLAMP;
        }
        if (n == 1) {
            return Shader$TileMode.REPEAT;
        }
        if (n == 2) {
            return Shader$TileMode.MIRROR;
        }
        if (n != 3) {
            return Shader$TileMode.CLAMP;
        }
        if (Build$VERSION.SDK_INT >= 31) {
            return n1r.g();
        }
        return Shader$TileMode.CLAMP;
    }
    
    public static final String N(final String s) {
        if (s.length() <= 64) {
            return s;
        }
        return s.substring(0, 64).concat("...");
    }
    
    public static final l5p O(final String s) {
        int i = 0;
        long n = 0L;
        while (i < 8) {
            final char char1 = s.charAt(i);
            if (char1 >>> 8 == 0) {
                final long n2 = ljb.b[char1];
                if (n2 >= 0L) {
                    n = (n << 4 | n2);
                    ++i;
                    continue;
                }
            }
            P(i, s, "a hexadecimal digit");
            throw null;
        }
        if (s.charAt(8) != '-') {
            P(8, s, "'-' (hyphen)");
            throw null;
        }
        int j = 9;
        long n3 = 0L;
        while (j < 13) {
            final char char2 = s.charAt(j);
            if (char2 >>> 8 == 0) {
                final long n4 = ljb.b[char2];
                if (n4 >= 0L) {
                    n3 = (n3 << 4 | n4);
                    ++j;
                    continue;
                }
            }
            P(j, s, "a hexadecimal digit");
            throw null;
        }
        if (s.charAt(13) != '-') {
            P(13, s, "'-' (hyphen)");
            throw null;
        }
        int k = 14;
        long n5 = 0L;
        while (k < 18) {
            final char char3 = s.charAt(k);
            if (char3 >>> 8 == 0) {
                final long n6 = ljb.b[char3];
                if (n6 >= 0L) {
                    n5 = (n5 << 4 | n6);
                    ++k;
                    continue;
                }
            }
            P(k, s, "a hexadecimal digit");
            throw null;
        }
        if (s.charAt(18) != '-') {
            P(18, s, "'-' (hyphen)");
            throw null;
        }
        int l = 19;
        long n7 = 0L;
        while (l < 23) {
            final char char4 = s.charAt(l);
            if (char4 >>> 8 == 0) {
                final long n8 = ljb.b[char4];
                if (n8 >= 0L) {
                    n7 = (n7 << 4 | n8);
                    ++l;
                    continue;
                }
            }
            P(l, s, "a hexadecimal digit");
            throw null;
        }
        if (s.charAt(23) != '-') {
            P(23, s, "'-' (hyphen)");
            throw null;
        }
        int n9 = 24;
        long n10 = 0L;
        while (n9 < 36) {
            final char char5 = s.charAt(n9);
            if (char5 >>> 8 == 0) {
                final long n11 = ljb.b[char5];
                if (n11 >= 0L) {
                    n10 = (n10 << 4 | n11);
                    ++n9;
                    continue;
                }
            }
            P(n9, s, "a hexadecimal digit");
            throw null;
        }
        final long n12 = n << 32 | n3 << 16 | n5;
        final long n13 = n7 << 48 | n10;
        if (n12 == 0L && n13 == 0L) {
            return l5p.x;
        }
        return new l5p(n12, n13);
    }
    
    public static final void P(final int n, final String s, final String s2) {
        final StringBuilder s3 = oz1.s(n, "Expected ", s2, " at index ", ", but was '");
        s3.append(s.charAt(n));
        s3.append('\'');
        throw new IllegalArgumentException(s3.toString());
    }
    
    public static final void a(final int n, final jta jta, final gva gva, igf v, final boolean b) {
        gva.i0(1959372976);
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
        int n4;
        if (gva.h((Object)jta)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        final int n5 = n3 | n4 | 0x180;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            ljq.h(b, null, pc9.g(null, 3).a(pc9.e(13)), pc9.h(null, 3).a(pc9.m(13)), null, (bua)uuj.t0(378599304, (aua)new uo1(jta, (byte)0), gva), gva, (n5 & 0xE) | 0x30D80, 18);
            v = (igf)fgf.v;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new vo1(n, jta, v, b);
        }
    }
    
    public static final void b(final jta jta, igf v, xzb s, float b, final gva gva, final int n, final int n2) {
        gva.i0(-1916797120);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)jta)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n | n3);
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
            int n7;
            if (gva.f((Object)v)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n4 | n7);
        }
        final int n8 = n6 | 0x480;
        if (gva.W(n8 & 0x1, (n8 & 0x493) != 0x492)) {
            gva.b0();
            int n9;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n9 = (n8 & 0xFFFFE07F);
            }
            else {
                if (n5 != 0) {
                    v = (igf)fgf.v;
                }
                s = lq6.S(0L, ((j86)gva.j((sei)dx6.a)).a, 0L, 0L, gva, 13);
                b = soh.B(24, gva);
                n9 = (n8 & 0xFFFFE07F);
            }
            gva.r();
            qt7.d((n9 & 0xE) | 0x180000, 52, uuj.t0(1620912862, (aua)new vd1(b, (byte)1), gva), jta, gva, s, m3r.j(v), null, false);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new to1(jta, v, s, b, n, n2);
        }
    }
    
    public static final void c(final ffi ffi, final zta zta, final gva gva, final int n) {
        gva.i0(-149765515);
        final dhc x = gva.x;
        final e3h l = gva.l();
        gva.c0(201, ti6.c);
        final Object r = gva.R();
        a6p obj;
        if (mlc.q(r, bi6.a)) {
            obj = null;
        }
        else {
            r.getClass();
            obj = (a6p)r;
        }
        final sei a = ffi.a;
        final a6p d = a.d(ffi, obj);
        final boolean equals = d.equals(obj);
        if (!equals) {
            gva.q0((Object)d);
        }
        final boolean s = gva.S;
        final boolean b = true;
        e3h n3 = null;
        boolean w = false;
        Label_0307: {
            e3h e3h;
            if (s) {
                e3h n2 = null;
                Label_0148: {
                    if (!ffi.g) {
                        n2 = l;
                        if (l.containsKey((Object)a)) {
                            break Label_0148;
                        }
                    }
                    n2 = l.n(a, d);
                }
                gva.J = true;
                e3h = n2;
            }
            else {
                final u5m g = gva.G;
                final Object b2 = g.b(g.b, g.g);
                b2.getClass();
                final e3h e3h2 = (e3h)b2;
                Label_0286: {
                    if ((!gva.F() || !equals) && (ffi.g || !l.containsKey((Object)a))) {
                        n3 = l.n(a, d);
                    }
                    else {
                        if (!equals || gva.w) {
                            if (gva.w) {
                                n3 = l;
                                break Label_0286;
                            }
                        }
                        n3 = e3h2;
                    }
                }
                if (gva.y || e3h2 != (e3h = n3)) {
                    w = true;
                    break Label_0307;
                }
            }
            w = false;
            n3 = e3h;
        }
        if (w && !gva.S) {
            gva.P(n3);
        }
        x.e((int)(gva.w ? 1 : 0));
        gva.w = w;
        gva.K = n3;
        gva.a0(202, 0, (Object)ti6.d, (Object)n3);
        smk.w(n >> 3 & 0xE, zta, gva, false, false);
        gva.w = (x.d() != 0 && b);
        gva.K = null;
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6((Object)ffi, (Object)zta, n, (byte)2);
        }
    }
    
    public static final void d(final ffi[] array, final zta zta, final gva gva, final int n) {
        gva.i0(415205898);
        final dhc x = gva.x;
        final e3h l = gva.l();
        gva.c0(201, ti6.c);
        final boolean s = gva.S;
        final sbg e = ti6.e;
        final boolean b = false;
        e3h n2 = null;
        boolean w = false;
        Label_0375: {
            Label_0139: {
                if (s) {
                    final e3h u = ncq.U(array, l, e3h.y);
                    l.getClass();
                    final k3h k3h = new k3h((g3h)l);
                    ((d3h)k3h).B = l;
                    k3h.putAll((Map)u);
                    n2 = ((d3h)k3h).n();
                    gva.c0(204, e);
                    gva.J();
                    gva.r0((Object)n2);
                    gva.J();
                    gva.r0((Object)u);
                    gva.q(false);
                    gva.J = true;
                }
                else {
                    final u5m g = gva.G;
                    final Object h = g.h(g.g, 0);
                    h.getClass();
                    final e3h e3h = (e3h)h;
                    final u5m g2 = gva.G;
                    final Object h2 = g2.h(g2.g, 1);
                    h2.getClass();
                    final e3h e3h2 = (e3h)h2;
                    final e3h u2 = ncq.U(array, l, e3h2);
                    if (!gva.F() || gva.y || !((s1)e3h2).equals((Object)u2)) {
                        l.getClass();
                        final k3h k3h2 = new k3h((g3h)l);
                        ((d3h)k3h2).B = l;
                        k3h2.putAll((Map)u2);
                        final e3h n3 = ((d3h)k3h2).n();
                        gva.c0(204, e);
                        gva.J();
                        gva.r0((Object)n3);
                        gva.J();
                        gva.r0((Object)u2);
                        gva.q(false);
                        if (!gva.y) {
                            n2 = n3;
                            if (((s1)n3).equals((Object)e3h)) {
                                break Label_0139;
                            }
                        }
                        w = true;
                        n2 = n3;
                        break Label_0375;
                    }
                    gva.l += gva.G.s();
                    n2 = e3h;
                }
            }
            w = false;
        }
        if (w && !gva.S) {
            gva.P(n2);
        }
        x.e((int)(gva.w ? 1 : 0));
        gva.w = w;
        gva.K = n2;
        gva.a0(202, 0, (Object)ti6.d, (Object)n2);
        smk.w(n >> 3 & 0xE, zta, gva, false, false);
        boolean w2 = b;
        if (x.d() != 0) {
            w2 = true;
        }
        gva.w = w2;
        gva.K = null;
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6((Object)array, (Object)zta, n, (byte)1);
        }
    }
    
    public static final void e(final int n, final int n2, final jta jta, final gva gva, boolean b) {
        gva.i0(1377896914);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0x6) == 0x0) {
            int n5;
            if (gva.g(b)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        int n6 = n4;
        if ((n & 0x30) == 0x0) {
            int n7;
            if (gva.h((Object)jta)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n4 | n7);
        }
        int n8 = false ? 1 : 0;
        if (gva.W(n6 & 0x1, (n6 & 0x13) != 0x12)) {
            if (n3 != 0) {
                b = true;
            }
            final bnf w = o50.W(jta, gva);
            final Object r = gva.R();
            final cib a = bi6.a;
            Object c;
            if ((c = r) == a) {
                c = zrn.c(30, (jta)new ny1(w, (byte)9), b);
                gva.q0(c);
            }
            final co1 co1 = (co1)c;
            final boolean h = gva.h((Object)co1);
            if ((n6 & 0xE) == 0x4) {
                n8 = (true ? 1 : 0);
            }
            final Object r2 = gva.R();
            Object o;
            if (((h ? 1 : 0) | n8) || (o = r2) == a) {
                o = new vx1(co1, b);
                gva.q0(o);
            }
            mlc.l((jta)o, gva);
            final ho1 g = ((hwj)gva.j((sei)iwj.a)).a.g();
            final boolean h2 = gva.h((Object)g);
            final boolean h3 = gva.h((Object)co1);
            final Object r3 = gva.R();
            Object o2;
            if ((h2 | h3) || (o2 = r3) == a) {
                o2 = new e4((Object)g, (Object)co1, (byte)28);
                gva.q0(o2);
            }
            mlc.a(g, (lta)o2, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new oo1(b, jta, n, n2, (byte)1);
        }
    }
    
    public static final void f(float n, final int n2, final int n3, long d, final gva gva, igf igf) {
        gva.i0(75144485);
        final int n4 = n3 & 0x1;
        int n5;
        if (n4 != 0) {
            n5 = (n2 | 0x6);
        }
        else if ((n2 & 0x6) == 0x0) {
            int n6;
            if (gva.f((Object)igf)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n2);
        }
        else {
            n5 = n2;
        }
        final int n7 = n3 & 0x2;
        int n8;
        if (n7 != 0) {
            n8 = (n5 | 0x30);
        }
        else {
            n8 = n5;
            if ((n2 & 0x30) == 0x0) {
                int n9;
                if (gva.c(n)) {
                    n9 = 32;
                }
                else {
                    n9 = 16;
                }
                n8 = (n5 | n9);
            }
        }
        if ((n2 & 0x180) == 0x0) {
            int n10;
            if ((n3 & 0x4) == 0x0 && gva.e(d)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n8 |= n10;
        }
        final boolean b = true;
        float n12;
        if (gva.W(n8 & 0x1, (n8 & 0x93) != 0x92)) {
            gva.b0();
            int n11;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n11 = n8;
                if ((n3 & 0x4) != 0x0) {
                    n11 = (n8 & 0xFFFFFC7F);
                }
                n12 = n;
            }
            else {
                Object v;
                if (n4 != 0) {
                    v = fgf.v;
                }
                else {
                    v = igf;
                }
                if (n7 != 0) {
                    n = 1.0f;
                }
                igf = (igf)v;
                n11 = n8;
                n12 = n;
                if ((n3 & 0x4) != 0x0) {
                    d = s86.d(24, gva);
                    n11 = (n8 & 0xFFFFFC7F);
                    n12 = n;
                    igf = (igf)v;
                }
            }
            gva.r();
            final igf f = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.d(igf, 1.0f), n12);
            final boolean b2 = (n11 & 0x70) == 0x20;
            boolean b3 = false;
            Label_0414: {
                if (((n11 & 0x380) ^ 0x180) > 256) {
                    b3 = b;
                    if (gva.e(d)) {
                        break Label_0414;
                    }
                }
                b3 = ((n11 & 0x180) == 0x100 && b);
            }
            final Object r = gva.R();
            Object o;
            if ((b2 | b3) || (o = r) == bi6.a) {
                o = new mq8(n12, d);
                gva.q0(o);
            }
            ljq.j(f, (lta)o, gva, 0);
        }
        else {
            gva.Z();
            n12 = n;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new nq8(n12, n2, n3, d, igf);
        }
    }
    
    public static final void g(igf v, v5d a, dng dng, boolean b, jv0 jv0, dx j, final gia gia, boolean b2, final w60 w60, final lta lta, final gva gva, final int n, final int n2) {
        gva.i0(53695811);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)v)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        if ((n & 0x30) == 0x0) {
            int n6;
            if ((n2 & 0x2) == 0x0 && gva.f((Object)a)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n4 |= n6;
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0183: {
            int n8;
            if (n7 != 0) {
                n8 = (n4 | 0x180);
            }
            else {
                n8 = n4;
                if ((n & 0x180) == 0x0) {
                    int n9;
                    if (gva.f((Object)dng)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n4 | n9);
                    break Label_0183;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0252: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0xC00) == 0x0) {
                    int n13;
                    if (gva.g(b)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0252;
                }
            }
            n14 = n12;
        }
        if ((n & 0x6000) == 0x0) {
            int n15;
            if ((n2 & 0x10) == 0x0 && gva.f((Object)jv0)) {
                n15 = 16384;
            }
            else {
                n15 = 8192;
            }
            n14 |= n15;
        }
        final int n16 = n2 & 0x20;
        int n17;
        if (n16 != 0) {
            n17 = (n14 | 0x30000);
        }
        else {
            n17 = n14;
            if ((0x30000 & n) == 0x0) {
                int n18;
                if (gva.f((Object)j)) {
                    n18 = 131072;
                }
                else {
                    n18 = 65536;
                }
                n17 = (n14 | n18);
            }
        }
        int n19 = n17;
        if ((0x180000 & n) == 0x0) {
            n19 = (n17 | 0x80000);
        }
        int n20 = 0xC00000 | n19;
        if ((0x6000000 & n) == 0x0) {
            n20 = (0x2C00000 | n19);
        }
        if ((0x30000000 & n) == 0x0) {
            int n21;
            if (gva.h((Object)lta)) {
                n21 = 536870912;
            }
            else {
                n21 = 268435456;
            }
            n20 |= n21;
        }
        Object o;
        w60 w61;
        if (gva.W(n20 & 0x1, (0x12492493 & n20) != 0x12492492)) {
            gva.b0();
            w60 b3;
            int n24;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n22 = n20;
                if ((n2 & 0x2) != 0x0) {
                    n22 = (n20 & 0xFFFFFF8F);
                }
                int n23 = n22;
                if ((n2 & 0x10) != 0x0) {
                    n23 = (n22 & 0xFFFF1FFF);
                }
                b3 = w60;
                n24 = (n23 & 0xF1C7FFFF);
                o = gia;
            }
            else {
                if (n3 != 0) {
                    v = (igf)fgf.v;
                }
                int n25 = n20;
                if ((n2 & 0x2) != 0x0) {
                    a = y5d.a(0, 3, gva);
                    n25 = (n20 & 0xFFFFFF8F);
                }
                if (n7 != 0) {
                    dng = (dng)new hng(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (n11 != 0) {
                    b = false;
                }
                int n26 = n25;
                if ((n2 & 0x10) != 0x0) {
                    if (!b) {
                        jv0 = (jv0)t08.c;
                    }
                    else {
                        jv0 = (jv0)t08.d;
                    }
                    n26 = (n25 & 0xFFFF1FFF);
                }
                if (n16 != 0) {
                    j = (dx)wab.J;
                }
                final v08 a2 = fgm.a(gva);
                final boolean f = gva.f((Object)a2);
                final Object r = gva.R();
                p48 p13;
                if (f || (p13 = (p48)r) == bi6.a) {
                    p13 = new p48(a2);
                    gva.q0((Object)p13);
                }
                o = p13;
                b3 = hkg.b(gva);
                n24 = (n26 & 0xF1C7FFFF);
                b2 = true;
            }
            gva.r();
            ao2.o(v, a, dng, b, true, (gia)o, b2, b3, j, jv0, null, null, lta, gva, (n24 & 0xE) | 0x6000 | (n24 & 0x70) | (n24 & 0x380) | (n24 & 0x1C00) | (n24 >> 3 & 0x380000) | (n24 << 12 & 0x70000000), (n24 >> 12 & 0xE) | (n24 >> 18 & 0x1C00), 6400);
            w61 = b3;
        }
        else {
            gva.Z();
            w61 = w60;
            o = gia;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new l2d(v, a, dng, b, jv0, j, (gia)o, b2, w61, lta, n, n2);
        }
    }
    
    public static final void h(igf v, v5d a, dng dng, gv0 a2, lb2 g, gia gia, boolean b, w60 b2, final lta lta, final gva gva, final int n, final int n2) {
        gva.i0(-1884325601);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)v)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        if ((n & 0x30) == 0x0) {
            int n6;
            if ((n2 & 0x2) == 0x0 && gva.f((Object)a)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n4 |= n6;
        }
        final int n7 = n2 & 0x4;
        int n8;
        if (n7 != 0) {
            n8 = (n4 | 0x180);
        }
        else {
            n8 = n4;
            if ((n & 0x180) == 0x0) {
                int n9;
                if (gva.f((Object)dng)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n4 | n9);
            }
        }
        final int n10 = n8 | 0xC00;
        int n12;
        if ((n & 0x6000) == 0x0) {
            int n11;
            if ((n2 & 0x10) == 0x0 && gva.f((Object)a2)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n12 = (n10 | n11);
        }
        else {
            n12 = n10;
        }
        final int n13 = n2 & 0x20;
        int n16 = 0;
        Label_0310: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0x30000);
            }
            else {
                n14 = n12;
                if ((0x30000 & n) == 0x0) {
                    int n15;
                    if (gva.f((Object)g)) {
                        n15 = 131072;
                    }
                    else {
                        n15 = 65536;
                    }
                    n16 = (n12 | n15);
                    break Label_0310;
                }
            }
            n16 = n14;
        }
        if ((0x180000 & n) == 0x0) {
            int n17;
            if ((n2 & 0x40) == 0x0 && gva.f((Object)gia)) {
                n17 = 1048576;
            }
            else {
                n17 = 524288;
            }
            n16 |= n17;
        }
        int n18 = 0xC00000 | n16;
        if ((0x6000000 & n) == 0x0) {
            n18 = (0x2C00000 | n16);
        }
        int n19 = n18;
        if ((0x30000000 & n) == 0x0) {
            int n20;
            if (gva.h((Object)lta)) {
                n20 = 536870912;
            }
            else {
                n20 = 268435456;
            }
            n19 = (n18 | n20);
        }
        w60 w60;
        dng dng3;
        gv0 gv3;
        gia gia3;
        if (gva.W(n19 & 0x1, (0x12492493 & n19) != 0x12492492)) {
            gva.b0();
            int n24;
            gv0 gv0;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n21 = n19;
                if ((n2 & 0x2) != 0x0) {
                    n21 = (n19 & 0xFFFFFF8F);
                }
                int n22 = n21;
                if ((n2 & 0x10) != 0x0) {
                    n22 = (n21 & 0xFFFF1FFF);
                }
                int n23 = n22;
                if ((n2 & 0x40) != 0x0) {
                    n23 = (n22 & 0xFFC7FFFF);
                }
                n24 = (n23 & 0xF1FFFFFF);
                final dng dng2 = dng;
                gv0 = a2;
                w60 = b2;
                dng3 = dng2;
            }
            else {
                if (n3 != 0) {
                    v = (igf)fgf.v;
                }
                int n25 = n19;
                if ((n2 & 0x2) != 0x0) {
                    a = y5d.a(0, 3, gva);
                    n25 = (n19 & 0xFFFFFF8F);
                }
                if (n7 != 0) {
                    dng = (dng)new hng(0.0f, 0.0f, 0.0f, 0.0f);
                }
                int n26 = n25;
                if ((n2 & 0x10) != 0x0) {
                    a2 = (gv0)t08.a;
                    n26 = (n25 & 0xFFFF1FFF);
                }
                if (n13 != 0) {
                    g = wab.G;
                }
                int n27 = n26;
                if ((n2 & 0x40) != 0x0) {
                    final v08 a3 = fgm.a(gva);
                    final boolean f = gva.f((Object)a3);
                    final Object r = gva.R();
                    p48 p12;
                    if (f || (p12 = (p48)r) == bi6.a) {
                        p12 = new p48(a3);
                        gva.q0((Object)p12);
                    }
                    gia = (gia)p12;
                    n27 = (n26 & 0xFFC7FFFF);
                }
                b2 = hkg.b(gva);
                n24 = (n27 & 0xF1FFFFFF);
                final gv0 gv2 = a2;
                w60 = b2;
                b = true;
                dng3 = dng;
                gv0 = gv2;
            }
            gva.r();
            final int n28 = n24 >> 3;
            ao2.o(v, a, dng3, false, false, gia, b, w60, null, null, g, gv0, lta, gva, (n24 & 0xE) | 0x6000 | (n24 & 0x70) | (n24 & 0x380) | (n24 & 0x1C00) | (0x70000 & n28) | (n28 & 0x380000), (n24 >> 12 & 0x70) | (n24 >> 6 & 0x380) | (n24 >> 18 & 0x1C00), 1792);
            final gia gia2 = gia;
            gv3 = gv0;
            gia3 = gia2;
        }
        else {
            gva.Z();
            final w60 w61 = b2;
            dng3 = dng;
            final gv0 gv4 = a2;
            gia3 = gia;
            w60 = w61;
            gv3 = gv4;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ep2(v, a, dng3, gv3, g, gia3, b, w60, lta, n, n2);
        }
    }
    
    public static final void i(final String s, final mnn mnn, igf igf, final dng dng, final gva gva, final int n) {
        gva.i0(1903367325);
        int n2;
        if (gva.f((Object)s)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)mnn)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n | n2 | n3 | 0x6D80;
        if (gva.W(n4 & 0x1, (0x12493 & n4) != 0x12492)) {
            gva.b0();
            final Object v = fgf.v;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                igf = (igf)v;
            }
            gva.r();
            final lb2 h = wab.H;
            final igf d = androidx.compose.foundation.layout.b.d(igf, 1.0f);
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new gfe((byte)11);
                gva.q0(r);
            }
            final igf t = omo.T(wsk.b((lta)r, d, true), dng);
            final jzj a = hzj.a((gv0)t08.a, h, gva, 48);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, t);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, a);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b);
            x90.l(gva, androidx.compose.foundation.layout.b.u((igf)v, 8.0f));
            final cy4 a2 = qy4.a;
            lmn.b(s, (igf)null, qy4.a(gva).Q, 0L, (zoa)null, (una)null, 0L, (wgn)null, (kfn)null, 0L, 1, false, 1, 0, (lta)null, mnn, gva, n4 & 0xE, (n4 << 18 & 0x1C00000) | 0x6180, 110586);
            gva.g0(-197677719);
            gva.q(false);
            gva.g0(-197530903);
            gva.q(false);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new cj4((byte)7, n, (Object)s, (Object)mnn, (Object)igf, (Object)dng);
        }
    }
    
    public static final void j(igf v, final zta zta, final gva gva, final int n, final int n2) {
        gva.i0(-1298353104);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)v)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        int n6 = n4;
        if ((n & 0x30) == 0x0) {
            int n7;
            if (gva.h((Object)zta)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x13) != 0x12)) {
            if (n3 != 0) {
                v = (igf)fgf.v;
            }
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new f1n((i1n)def.A);
                gva.q0(r);
            }
            k((f1n)r, v, zta, gva, n6 << 3 & 0x3F0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new nj4(v, zta, n, n2);
        }
    }
    
    public static final void k(final f1n f1n, final igf igf, final zta zta, final gva gva, final int n) {
        gva.i0(-511989831);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)f1n)) {
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
            int n7;
            if (gva.h((Object)zta)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final int hashCode = Long.hashCode(gva.T);
            final eva v = r6k.V(gva);
            final igf b = ien.B(gva, igf);
            final e3h l = gva.l();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)f1n.c, gva, f1n);
            k8e.P((zta)f1n.d, gva, v);
            k8e.P((zta)f1n.e, gva, zta);
            vh6.e.getClass();
            k8e.P((zta)awp.z, gva, l);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b);
            k8e.P((zta)awp.B, gva, hashCode);
            gva.q(true);
            if (!gva.F()) {
                gva.g0(-1259245908);
                final boolean h = gva.h((Object)f1n);
                final Object r = gva.R();
                Object o;
                if (h || (o = r) == bi6.a) {
                    o = new wfk((Object)f1n, (byte)11);
                    gva.q0(o);
                }
                mlc.l((jta)o, gva);
                gva.q(false);
            }
            else {
                gva.g0(-1259187287);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new wf0((Object)f1n, igf, zta, n, (byte)15);
        }
    }
    
    public static final void l(final gwj gwj, final String s, igf v, vlm vlm, lta lta, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(-1981110646);
        int n4;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)gwj);
            }
            else {
                b = gva.h((Object)gwj);
            }
            int n3;
            if (b) {
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
            if (gva.f((Object)s)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        final int n7 = n2 & 0x4;
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
                n8 = (n5 | n9);
            }
        }
        final int n10 = n2 & 0x8;
        int n11;
        if (n10 != 0) {
            n11 = (n8 | 0xC00);
        }
        else {
            n11 = n8;
            if ((n & 0xC00) == 0x0) {
                boolean b2;
                if ((n & 0x1000) == 0x0) {
                    b2 = gva.f((Object)vlm);
                }
                else {
                    b2 = gva.h((Object)vlm);
                }
                int n12;
                if (b2) {
                    n12 = 2048;
                }
                else {
                    n12 = 1024;
                }
                n11 = (n8 | n12);
            }
        }
        final int n13 = n2 & 0x10;
        int n16 = 0;
        Label_0334: {
            int n14;
            if (n13 != 0) {
                n14 = (n11 | 0x6000);
            }
            else {
                n14 = n11;
                if ((n & 0x6000) == 0x0) {
                    int n15;
                    if (gva.h((Object)lta)) {
                        n15 = 16384;
                    }
                    else {
                        n15 = 8192;
                    }
                    n16 = (n11 | n15);
                    break Label_0334;
                }
            }
            n16 = n14;
        }
        int n17 = n16;
        if ((0x30000 & n) == 0x0) {
            int n18;
            if (gva.h((Object)ye6)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n17 = (n16 | n18);
        }
        boolean b3 = false;
        vlm vlm2;
        lta lta3;
        if (gva.W(n17 & 0x1, (0x12493 & n17) != 0x12492)) {
            if (n7 != 0) {
                v = (igf)fgf.v;
            }
            if (n10 != 0) {
                vlm = null;
            }
            final cib a = bi6.a;
            if (n13 != 0) {
                Object r;
                if ((r = gva.R()) == a) {
                    r = new p9k((byte)20);
                    gva.q0(r);
                }
                lta = (lta)r;
            }
            final String concat = "nav_listener.".concat(s);
            if ((n17 & 0x70) == 0x20) {
                b3 = true;
            }
            final Object r2 = gva.R();
            Object o;
            if (b3 || (o = r2) == a) {
                o = new jy4(s, (byte)14);
                gva.q0(o);
            }
            final nyk nyk = (nyk)rhc.S(v4j.a((Class)nyk.class), concat, (lta)o, gva);
            final bnf w = o50.W(lta, gva);
            final dq4 dq4 = (dq4)gwj.w.getValue();
            final boolean h = gva.h((Object)nyk);
            final Object r3 = gva.R();
            Object o2;
            if (h || (o2 = r3) == a) {
                o2 = new e0j((Object)nyk, (byte)8);
                gva.q0(o2);
            }
            mlc.j(dq4, t08.G(v, (lta)o2), vlm, uuj.t0(-156490436, (aua)new ryk(nyk, w, ye6), gva), gva, (n17 >> 3 & 0x380) | 0xC00);
            final lta lta2 = lta;
            vlm2 = vlm;
            lta3 = lta2;
        }
        else {
            gva.Z();
            final vlm vlm3 = vlm;
            lta3 = lta;
            vlm2 = vlm3;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new syk(gwj, s, v, vlm2, lta3, ye6, n, n2);
        }
    }
    
    public static final void m(final igf igf, float n, final long n2, final gva gva, final int n3) {
        gva.i0(-1534852205);
        int n4;
        if (gva.e(n2)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n3 | 0x30 | n4;
        final int n6 = 1;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            gva.b0();
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                n = 1.0f;
            }
            gva.r();
            final igf u = androidx.compose.foundation.layout.b.u(igf.E((igf)androidx.compose.foundation.layout.b.b), n);
            int n7 = 0;
            Label_0183: {
                if (((n5 & 0x380) ^ 0x180) > 256) {
                    n7 = n6;
                    if (gva.e(n2)) {
                        break Label_0183;
                    }
                }
                if ((n5 & 0x180) == 0x100) {
                    n7 = n6;
                }
                else {
                    n7 = 0;
                }
            }
            final Object r = gva.R();
            Object o;
            if (n7 != 0 || (o = r) == bi6.a) {
                o = new oq8(n, n2, (byte)0);
                gva.q0(o);
            }
            ljq.j(u, (lta)o, gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new pq8(igf, n, n2, n3);
        }
    }
    
    public static final igf n(final igf igf) {
        return igf.E((igf)oe0.v);
    }
    
    public static final void o(File path, final File ex) {
        path = (File)path.toPath();
        final Path path2 = ((File)ex).toPath();
        try {
            Files.move((Path)path, path2, new CopyOption[] { (CopyOption)StandardCopyOption.ATOMIC_MOVE, (CopyOption)StandardCopyOption.REPLACE_EXISTING });
            return;
        }
        catch (final FileAlreadyExistsException ex) {
            path.getClass();
            path2.getClass();
            try {
                Files.move((Path)path, path2, new CopyOption[] { (CopyOption)StandardCopyOption.REPLACE_EXISTING });
            }
            catch (final IOException ex2) {
                soh.j((Throwable)ex2, (Throwable)ex);
                throw ex2;
            }
        }
        catch (final AtomicMoveNotSupportedException ex3) {
            path.getClass();
            path2.getClass();
            final File file = path;
            final Path path3 = path2;
            final int n = 1;
            final CopyOption[] array = new CopyOption[n];
            final int n2 = 0;
            final StandardCopyOption standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            array[n2] = (CopyOption)standardCopyOption;
            Files.move((Path)file, path3, array);
        }
        try {
            final File file = path;
            final Path path3 = path2;
            final int n = 1;
            final CopyOption[] array = new CopyOption[n];
            final int n2 = 0;
            final StandardCopyOption standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            array[n2] = (CopyOption)standardCopyOption;
            Files.move((Path)file, path3, array);
        }
        catch (final IOException ex4) {
            soh.j((Throwable)ex4, (Throwable)ex);
            throw ex4;
        }
    }
    
    public static final int p(final long[] array, final long n) {
        int n2 = array.length - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final long n4 = lcmp(n, array[n3]);
            if (n4 > 0) {
                i = n3 + 1;
            }
            else {
                if (n4 >= 0) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final pqg q(jta jta, final gva gva, int c) {
        final m0q a = uoo.A(gva);
        if ((c & 0x2) != 0x0) {
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new kh0((byte)27);
                gva.q0(r);
            }
            jta = (jta)r;
        }
        final c3q a2 = a.a;
        final int a3 = a2.a;
        final bhh b = a.b;
        final int b2 = a2.b;
        final float n = (float)a3;
        c = c3q.c;
        float n2;
        float n3;
        if (!qs8.e(n, 0.0f) && !qs8.e(n, 600.0f)) {
            if (qs8.e(n, 840.0f)) {
                c = 2;
                n2 = 360.0f;
            }
            else {
                c = 3;
                n2 = 412.0f;
            }
            n3 = 24.0f;
        }
        else {
            n3 = 0.0f;
            n2 = 360.0f;
            c = 1;
        }
        final boolean a4 = b.a;
        final ArrayList b3 = b.b;
        float n4;
        int n5;
        if (!a4 && (c != 1 || !qs8.e((float)b2, 900.0f))) {
            n4 = 0.0f;
            n5 = 1;
        }
        else {
            n5 = 2;
            n4 = 24.0f;
        }
        final ArrayList list = new ArrayList();
        for (final yjb yjb : b3) {
            k2j a5;
            if (yjb.c() && yjb.b()) {
                a5 = yjb.a();
            }
            else {
                a5 = null;
            }
            if (a5 != null) {
                list.add((Object)a5);
            }
        }
        if (c > 2) {
            c = 2;
        }
        if ((0x6E & 0x2) == 0x0) {
            n3 = 0.0f;
        }
        if ((0x6E & 0x10) == 0x0) {
            n2 = 360.0f;
        }
        Object v;
        if ((0x6E & 0x20) != 0x0) {
            v = list;
        }
        else {
            v = r89.v;
        }
        final pqg pqg = new pqg(c, n3, n5, n4, n2, (List)v);
        if (b2 >= 480) {
            c = 1;
        }
        else {
            c = 0;
        }
        if (pqg.a > 1) {
            if (c == 0) {
                return pqg.a(pqg, 1, 0.0f, 124);
            }
        }
        else {
            if (a3 < 600) {
                return pqg;
            }
            if (c != 0) {
                if (jta.a()) {
                    return pqg.a(pqg, 2, 24.0f, 124);
                }
            }
        }
        return pqg;
    }
    
    public static final void r(final a5q a5q, final String s) {
        final WorkDatabase c = a5q.c;
        c.getClass();
        final z5q v = c.v();
        final gd8 f = c.f();
        final ArrayList a0 = lq6.a0(s);
        while (!a0.isEmpty()) {
            final String s2 = (String)h86.x0((List)a0);
            final x4q c2 = v.c(s2);
            if (c2 != x4q.x && c2 != x4q.y) {
                ((Number)xp7.L(v.a, false, true, (lta)new uhm(s2, (byte)21))).intValue();
            }
            a0.addAll((Collection)f.a(s2));
        }
        final frh f2 = a5q.f;
        f2.getClass();
        final Object k = f2.k;
        synchronized (k) {
            krd.c().getClass();
            f2.i.add((Object)s);
            final r6q b = f2.b(s);
            monitorexit(k);
            frh.d(b, 1);
            final Iterator iterator = a5q.e.iterator();
            while (iterator.hasNext()) {
                ((tck)iterator.next()).d(s);
            }
        }
    }
    
    public static final a5q s(final Context context, final wn6 wn6) {
        final f5q f5q = new f5q(wn6.c);
        final Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        final gzk a = f5q.a;
        a.getClass();
        final y7j d = wn6.d;
        ouj ouj;
        if (context.getResources().getBoolean(2131034118)) {
            ouj = new ouj(applicationContext, (String)null);
            ouj.i = true;
        }
        else {
            if (kym.Y0((CharSequence)"androidx.work.workdb")) {
                en9.s("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            ouj = new ouj(applicationContext, "androidx.work.workdb");
            ouj.h = new re((Object)applicationContext, (byte)15);
        }
        ouj.f = (Executor)a;
        final Object o = new Object();
        final ArrayList d2 = ouj.d;
        d2.add(o);
        ouj.a(new m9f[] { (m9f)n9f.h });
        ouj.a(new m9f[] { (m9f)new yfj(applicationContext, 2, 3) });
        ouj.a(new m9f[] { (m9f)n9f.i });
        ouj.a(new m9f[] { (m9f)n9f.j });
        ouj.a(new m9f[] { (m9f)new yfj(applicationContext, 5, 6) });
        ouj.a(new m9f[] { (m9f)n9f.k });
        ouj.a(new m9f[] { (m9f)n9f.l });
        ouj.a(new m9f[] { (m9f)n9f.m });
        ouj.a(new m9f[] { (m9f)new yfj(applicationContext) });
        ouj.a(new m9f[] { (m9f)new yfj(applicationContext, 10, 11) });
        ouj.a(new m9f[] { (m9f)n9f.d });
        ouj.a(new m9f[] { (m9f)n9f.e });
        ouj.a(new m9f[] { (m9f)n9f.f });
        ouj.a(new m9f[] { (m9f)n9f.g });
        ouj.a(new m9f[] { (m9f)new yfj(applicationContext, 21, 22) });
        ouj.n = false;
        ouj.o = true;
        ouj.p = true;
        final Executor f = ouj.f;
        if (f == null && ouj.g == null) {
            final ou0 k = pu0.k;
            ouj.g = (Executor)k;
            ouj.f = (Executor)k;
        }
        else if (f != null && ouj.g == null) {
            ouj.g = f;
        }
        else if (f == null) {
            ouj.f = ouj.g;
        }
        final LinkedHashSet l = ouj.l;
        final boolean empty = ((Collection)l).isEmpty();
        final LinkedHashSet i = ouj.k;
        if (!empty) {
            final Iterator iterator = ((Set)l).iterator();
            while (iterator.hasNext()) {
                final int intValue = ((Number)iterator.next()).intValue();
                if (!((Set)i).contains((Object)intValue)) {
                    continue;
                }
                oyl.g((Object)smk.p(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                return null;
            }
        }
        Object h;
        if ((h = ouj.h) == null) {
            h = new y7j((byte)17);
        }
        final int n = 2;
        final boolean j = ouj.i;
        ge9.a(1);
        final Context b = ouj.b;
        final Object systemService = b.getSystemService("activity");
        ActivityManager activityManager;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager)systemService;
        }
        else {
            activityManager = null;
        }
        int n2 = n;
        if (activityManager != null) {
            n2 = n;
            if (!activityManager.isLowRamDevice()) {
                n2 = 3;
            }
        }
        final Executor f2 = ouj.f;
        if (f2 == null) {
            en9.s("Required value was null.");
            return null;
        }
        final Executor g = ouj.g;
        if (g != null) {
            final aw7 aw7 = new aw7(b, ouj.c, (h5n)h, ouj.j, (List)d2, j, n2, f2, g, (Intent)null, ouj.n, ouj.o, (Set)i, (String)null, (File)null, (Callable)null, (List)ouj.e, (List)ouj.m, ouj.p, (v2k)null, (hc7)null);
            Object z = qt7.z((rtc)ouj.a);
            final Package package1 = ((Class)z).getPackage();
            String name;
            if (package1 == null || (name = package1.getName()) == null) {
                name = "";
            }
            String s = ((Class)z).getCanonicalName();
            s.getClass();
            if (name.length() != 0) {
                s = s.substring(name.length() + 1);
            }
            Object o2 = rym.D0(s, '.', '_').concat("_Impl");
            Label_2218: {
                Label_2197: {
                    try {
                        Object string;
                        if (name.length() == 0) {
                            string = o2;
                        }
                        else {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(name);
                            sb.append('.');
                            sb.append((String)o2);
                            string = sb.toString();
                        }
                        final Class<?> forName = Class.forName((String)string, true, ((Class)z).getClassLoader());
                        forName.getClass();
                        z = forName.getDeclaredConstructor((Class<?>[])null).newInstance((Object[])null);
                        ((WorkDatabase)z).k = true;
                        xuj e;
                        try {
                            e = ((WorkDatabase)z).e();
                            e.getClass();
                        }
                        catch (final NotImplementedError notImplementedError) {
                            e = null;
                        }
                        if (e == null) {
                            final uba uba = new uba(aw7, new drj((WorkDatabase)z), new rr((WorkDatabase)z));
                            throw null;
                        }
                        ((WorkDatabase)z).e = new uba(aw7, e, new gw4(2, z, (Class)uuj.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte)2));
                        ((WorkDatabase)z).f = ((WorkDatabase)z).d();
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        final Set m = ((WorkDatabase)z).i();
                        final List n3 = aw7.n;
                        final int size = n3.size();
                        o2 = new boolean[size];
                        final Iterator iterator2 = m.iterator();
                        while (true) {
                            final boolean hasNext = iterator2.hasNext();
                            final int n4 = -1;
                            if (hasNext) {
                                final rtc rtc = (rtc)iterator2.next();
                                final int n5 = ((Collection)n3).size() - 1;
                                int n6 = n4;
                                if (n5 >= 0) {
                                    n6 = n5;
                                    while (true) {
                                        final int n7 = n6 - 1;
                                        if (((us4)rtc).d(n3.get(n6))) {
                                            o2[n6] = true;
                                            break;
                                        }
                                        if (n7 < 0) {
                                            n6 = n4;
                                            break;
                                        }
                                        n6 = n7;
                                    }
                                }
                                if (n6 < 0) {
                                    uy8.m((Object)((us4)rtc).b(), (Object)") is missing in the database configuration.", "A required auto migration spec (");
                                    return null;
                                }
                                ((Map)linkedHashMap).put((Object)rtc, n3.get(n6));
                            }
                            else {
                                int n8 = ((Collection)n3).size() - 1;
                                if (n8 >= 0) {
                                    while (true) {
                                        final int n9 = n8 - 1;
                                        if (n8 >= size || !o2[n8]) {
                                            en9.s("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                            return null;
                                        }
                                        if (n9 < 0) {
                                            break;
                                        }
                                        n8 = n9;
                                    }
                                }
                                for (final m9f m9f : ((WorkDatabase)z).c(linkedHashMap)) {
                                    final byte a2 = m9f.a;
                                    final byte b2 = m9f.b;
                                    final n48 d3 = aw7.d;
                                    final LinkedHashMap a3 = d3.a;
                                    boolean containsKey;
                                    if (((Map)a3).containsKey((Object)(int)a2)) {
                                        o2 = a3.get((Object)(int)a2);
                                        Object v;
                                        if ((v = o2) == null) {
                                            v = s89.v;
                                        }
                                        containsKey = ((Map)v).containsKey((Object)(int)b2);
                                    }
                                    else {
                                        containsKey = false;
                                    }
                                    if (!containsKey) {
                                        d3.a(m9f);
                                    }
                                }
                                final LinkedHashMap j2 = ((WorkDatabase)z).j();
                                o2 = aw7.m;
                                final boolean[] array = new boolean[((List)o2).size()];
                                for (final Map$Entry map$Entry : j2.entrySet()) {
                                    final rtc rtc2 = (rtc)map$Entry.getKey();
                                    for (final rtc rtc3 : (List)map$Entry.getValue()) {
                                        int n10 = ((Collection)o2).size() - 1;
                                        Label_1627: {
                                            if (n10 >= 0) {
                                                while (true) {
                                                    final int n11 = n10 - 1;
                                                    if (((us4)rtc3).d(((List)o2).get(n10))) {
                                                        array[n10] = true;
                                                        break Label_1627;
                                                    }
                                                    if (n11 < 0) {
                                                        break;
                                                    }
                                                    n10 = n11;
                                                }
                                            }
                                            n10 = -1;
                                        }
                                        if (n10 < 0) {
                                            oyl.l("A required type converter (", (Object)((us4)rtc3).b(), (Object)") for ", (Object)((us4)rtc2).b(), (Object)" is missing in the database configuration.");
                                            return null;
                                        }
                                        ((Map)((WorkDatabase)z).j).put((Object)rtc3, ((List)o2).get(n10));
                                    }
                                }
                                int n12 = ((Collection)o2).size() - 1;
                                if (n12 >= 0) {
                                    while (true) {
                                        final int n13 = n12 - 1;
                                        if (!array[n12]) {
                                            en9.s(lmf.r(((List)o2).get(n12), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                                            return null;
                                        }
                                        if (n13 < 0) {
                                            break;
                                        }
                                        n12 = n13;
                                    }
                                }
                                ((WorkDatabase)z).c = aw7.h;
                                ((WorkDatabase)z).d = new gzk(aw7.i);
                                final Executor c = ((WorkDatabase)z).c;
                                if (c == null) {
                                    mlc.j0("internalQueryExecutor");
                                    throw null;
                                }
                                final fz6 a4 = ien.a(uuj.s0((hc7)eqi.W(c), (hc7)omo.o()));
                                ((WorkDatabase)z).a = a4;
                                o2 = a4.v;
                                final gzk d4 = ((WorkDatabase)z).d;
                                if (d4 == null) {
                                    mlc.j0("internalTransactionExecutor");
                                    throw null;
                                }
                                ((WorkDatabase)z).b = ((hc7)o2).F0((hc7)eqi.W((Executor)d4));
                                ((WorkDatabase)z).h = aw7.f;
                                final uba e2 = ((WorkDatabase)z).e;
                                if (e2 == null) {
                                    mlc.j0("connectionManager");
                                    throw null;
                                }
                                o2 = e2.h;
                                Object c2 = null;
                                Label_1930: {
                                    Label_1890: {
                                        if ((c2 = o2) != null) {
                                            while (!(c2 instanceof gih)) {
                                                if (!(c2 instanceof x98)) {
                                                    break Label_1890;
                                                }
                                                c2 = ((x98)c2).c();
                                            }
                                            break Label_1930;
                                        }
                                    }
                                    c2 = null;
                                }
                                final gih gih = (gih)c2;
                                final uba e3 = ((WorkDatabase)z).e;
                                if (e3 != null) {
                                    o2 = e3.h;
                                    Object c3 = null;
                                    Label_2008: {
                                        Label_1968: {
                                            if ((c3 = o2) != null) {
                                                while (!(c3 instanceof zj1)) {
                                                    if (!(c3 instanceof x98)) {
                                                        break Label_1968;
                                                    }
                                                    c3 = ((x98)c3).c();
                                                }
                                                break Label_2008;
                                            }
                                        }
                                        c3 = null;
                                    }
                                    final zj1 zj1 = (zj1)c3;
                                    final Context applicationContext2 = context.getApplicationContext();
                                    applicationContext2.getClass();
                                    final ddo ddo = new ddo(applicationContext2, f5q);
                                    o2 = new frh(context.getApplicationContext(), wn6, f5q, (WorkDatabase)z);
                                    return new a5q(context.getApplicationContext(), wn6, f5q, (WorkDatabase)z, (List)b5q.C.o((Object)context, (Object)wn6, (Object)f5q, z, (Object)ddo, o2), (frh)o2, ddo);
                                }
                                mlc.j0("connectionManager");
                                throw null;
                            }
                        }
                    }
                    catch (final InstantiationException ex) {}
                    catch (final IllegalAccessException ex2) {
                        break Label_2197;
                    }
                    catch (final ClassNotFoundException ex3) {
                        break Label_2218;
                    }
                    final InstantiationException ex;
                    fvd.v(gcp.d((Class)z, new StringBuilder("Failed to create an instance of ")), (Throwable)ex);
                    return null;
                }
                final IllegalAccessException ex2;
                fvd.v(gcp.d((Class)z, new StringBuilder("Cannot access the constructor ")), (Throwable)ex2);
                return null;
            }
            final String canonicalName = ((Class)z).getCanonicalName();
            final StringBuilder sb2 = new StringBuilder("Cannot find implementation for ");
            sb2.append(canonicalName);
            sb2.append(". ");
            sb2.append((String)o2);
            sb2.append(" does not exist. Is Room annotation processor correctly configured?");
            final ClassNotFoundException ex3;
            throw new RuntimeException(sb2.toString(), (Throwable)ex3);
        }
        en9.s("Required value was null.");
        return null;
    }
    
    public static void t(final Object o, final String s, final String s2) {
        if (Log.isLoggable("TRuntime.".concat(s), 3)) {
            String.format(s2, new Object[] { o });
        }
    }
    
    public static void u(final Exception ex, String concat, final String s) {
        concat = "TRuntime.".concat(concat);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, s, (Throwable)ex);
        }
    }
    
    public static final Object v(final vfh vfh, final String s, final h07 h07) {
        final Object b = vfh.b(s, (lta)new jkn((byte)28), h07);
        if (b == pc7.v) {
            return b;
        }
        return lqo.a;
    }
    
    public static final void w(final long n, final byte[] array, int n2, int n3, int n4) {
        n3 = 7 - n3;
        final int n5 = 8 - n4;
        if (n5 <= n3) {
            while (true) {
                n4 = (int)(n >> (n3 << 3) & 0xFFL);
                final int n6 = ljb.a[n4];
                array[n2] = (byte)(n6 >> 8);
                n4 = n2 + 2;
                array[n2 + 1] = (byte)n6;
                if (n3 == n5) {
                    break;
                }
                --n3;
                n2 = n4;
            }
        }
    }
    
    public static db x(final zrc zrc) {
        Label_0057: {
            Label_0048: {
                try {
                    final String i = zrc.o("name").i();
                    i.getClass();
                    return new db(i);
                }
                catch (final NullPointerException ex) {}
                catch (final NumberFormatException ex2) {
                    break Label_0048;
                }
                catch (final IllegalStateException ex3) {
                    break Label_0057;
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ActionEventActionTarget", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ActionEventActionTarget", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ActionEventActionTarget", (Throwable)ex3);
        return null;
    }
    
    public static olj y(final zrc zrc) {
        Label_0328: {
            Label_0319: {
                Label_0310: {
                    long f = 0L;
                    plj a = null;
                    Label_0048: {
                        try {
                            f = zrc.o("format_version").f();
                            final irc o = zrc.o("session");
                            if (o != null) {
                                a = ncq.A(o.e());
                                break Label_0048;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0310;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0319;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0328;
                        }
                        a = null;
                    }
                    final irc o2 = zrc.o("configuration");
                    ilj c;
                    if (o2 != null) {
                        c = zrn.C(o2.e());
                    }
                    else {
                        c = null;
                    }
                    final irc o3 = zrc.o("browser_sdk_version");
                    String i;
                    if (o3 != null) {
                        i = o3.i();
                    }
                    else {
                        i = null;
                    }
                    final irc o4 = zrc.o("sdk_name");
                    String j;
                    if (o4 != null) {
                        j = o4.i();
                    }
                    else {
                        j = null;
                    }
                    final irc o5 = zrc.o("span_id");
                    String k;
                    if (o5 != null) {
                        k = o5.i();
                    }
                    else {
                        k = null;
                    }
                    final irc o6 = zrc.o("parent_span_id");
                    String l;
                    if (o6 != null) {
                        l = o6.i();
                    }
                    else {
                        l = null;
                    }
                    final irc o7 = zrc.o("trace_id");
                    String m;
                    if (o7 != null) {
                        m = o7.i();
                    }
                    else {
                        m = null;
                    }
                    final irc o8 = zrc.o("rule_psr");
                    Number h;
                    if (o8 != null) {
                        h = o8.h();
                    }
                    else {
                        h = null;
                    }
                    final irc o9 = zrc.o("discarded");
                    Boolean value;
                    if (o9 != null) {
                        value = o9.a();
                    }
                    else {
                        value = null;
                    }
                    if (f == 2L) {
                        return new olj(a, c, i, j, k, l, m, h, value);
                    }
                    throw new IllegalStateException("Check failed.");
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Dd", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Dd", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Dd", (Throwable)ex3);
        return null;
    }
    
    public static ybb z(final SSLSession sslSession) {
        final String cipherSuite = sslSession.getCipherSuite();
        if (cipherSuite == null) {
            en9.q("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            uy8.h("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        final ir4 k = ir4.b.K(cipherSuite);
        final String protocol = sslSession.getProtocol();
        if (protocol == null) {
            en9.q("tlsVersion == null");
            return null;
        }
        if (!"NONE".equals(protocol)) {
            final d0o u = twl.u(protocol);
            Object o;
            try {
                o = icq.l((Object[])sslSession.getPeerCertificates());
            }
            catch (final SSLPeerUnverifiedException ex) {
                o = r89.v;
            }
            return new ybb(u, k, icq.l((Object[])sslSession.getLocalCertificates()), (jta)new h87(o, (byte)15));
        }
        uy8.h("tlsVersion == NONE");
        return null;
    }
}
