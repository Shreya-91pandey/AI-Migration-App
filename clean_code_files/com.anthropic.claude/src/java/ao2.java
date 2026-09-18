import android.os.BaseBundle;
import java.util.Collection;
import java.util.Map$Entry;
import android.text.TextUtils;
import android.os.Looper;
import android.os.Handler;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.os.LocaleList;
import java.util.Arrays;
import java.util.Locale;
import android.view.inputmethod.EditorInfo;
import com.anthropic.claude.artifact.frame.k;
import com.anthropic.claude.artifact.frame.CodeArtifactViewerParams;
import com.anthropic.claude.artifact.frame.ArtifactLink;
import java.util.Map;
import java.util.Collections;
import com.anthropic.claude.core.telemetry.SilentException;
import android.webkit.RenderProcessGoneDetail;
import java.util.AbstractList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import io.sentry.c2;
import android.util.SizeF;
import android.util.Size;
import android.os.Binder;
import android.util.SparseArray;
import android.os.Parcelable;
import java.io.Serializable;

public abstract class ao2 implements w97
{
    public static final ygc v;
    public static final Class[] w;
    public static final fuj x;
    public static final sga y;
    
    public static void A(final Object o, final String s) {
        if (o != null) {
            return;
        }
        fvd.k(s);
    }
    
    public static void B(final String s, final boolean b) {
        if (b) {
            return;
        }
        en9.q(s);
    }
    
    public static void C(final boolean b) {
        if (b) {
            return;
        }
        c2.c();
    }
    
    public static tnj D(final is2 is2, final ire ire) {
        final Object o = new Object();
        ((an2)o).R0(is2);
        return new tnj(ire, (long)is2.h(), (qn2)o);
    }
    
    public static final igf E(final igf igf, final boolean b, final String s) {
        igf b2 = igf;
        if (b) {
            b2 = wsk.b((lta)new jy4(s, (byte)15), igf, false);
        }
        return b2;
    }
    
    public static final igf F(final igf igf, final aql aql, final qpl qpl) {
        return igf.E((igf)new ryl(aql, qpl));
    }
    
    public static final void G(final jja jja, final Object o, Object v, final h07 h07) {
        dka dka2 = null;
        Label_0053: {
            if (h07 instanceof dka) {
                final dka dka = (dka)h07;
                final int x = dka.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    dka.x = x + Integer.MIN_VALUE;
                    dka2 = dka;
                    break Label_0053;
                }
            }
            dka2 = new dka(h07);
        }
        final Object w = dka2.w;
        final int x2 = dka2.x;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            v = dka2.v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            dka2.v = v;
            dka2.x = 1;
            if (jja.l(o, (f07)dka2) == pc7.v) {
                return;
            }
        }
        throw new AbortFlowException(v);
    }
    
    public static ub H(final zrc zrc) {
        Label_0558: {
            Label_0549: {
                Label_0540: {
                    int n3 = 0;
                    Label_0103: {
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
                                        if (ge9.f(n4).equals(i)) {
                                            n3 = n4;
                                            break Label_0103;
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0540;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0549;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0558;
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
                    return new ub(n3, k, l, m, i2, i3, (List)o8, i4, h, value, h2, h3, h4, value2);
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
    
    public static uap I(final zrc zrc) {
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
                    return new uap(linkedHashMap);
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
    
    public static lh0 J(final String s) {
        return (lh0)lh0.O2.get((Object)s);
    }
    
    public static final v4q K(final v5q v5q) {
        return new v4q(v5q.a, v5q.t);
    }
    
    public static final rtc L(final SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof oy6) {
            return ((oy6)serialDescriptor).b;
        }
        if (serialDescriptor instanceof dzk) {
            return L(((dzk)serialDescriptor).a);
        }
        return null;
    }
    
    public static final dx M(final riq riq) {
        if (riq instanceof win) {
            return (dx)wab.J;
        }
        if (riq instanceof vin) {
            return (dx)((vin)riq).e;
        }
        uy8.l((Object)riq, "Unknown position: ");
        return null;
    }
    
    public static void N(final ArrayList list) {
        final Iterator iterator = list.iterator();
        if (!iterator.hasNext()) {
            return;
        }
        iterator.next().getClass();
        fvd.c();
    }
    
    public static final Object O(final goe goe) {
        final Object z = goe.z();
        uzc uzc;
        if (z instanceof uzc) {
            uzc = (uzc)z;
        }
        else {
            uzc = null;
        }
        if (uzc != null) {
            return uzc.J;
        }
        return null;
    }
    
    public static final dx P(final riq riq) {
        if (riq instanceof win) {
            return (dx)wab.J;
        }
        if (riq instanceof vin) {
            return (dx)((vin)riq).d;
        }
        uy8.l((Object)riq, "Unknown position: ");
        return null;
    }
    
    public static boolean Q(final String s) {
        final List h = sx7.h;
        if (h == null || !((Collection)h).isEmpty()) {
            for (final String obj : h) {
                if (!s.equals(obj)) {
                    final StringBuilder sb = new StringBuilder(".");
                    sb.append(obj);
                    if (!rym.y0(s, sb.toString(), false)) {
                        continue;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public static final igf R(final igf igf, final Object o) {
        return igf.E((igf)new tzc(o));
    }
    
    public static final float S(final mnn mnn, final gva gva) {
        final hcm a = mnn.a;
        gva.g0(1835341855);
        final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
        final mrg b = mnn.b;
        final long c = b.c;
        final long c2 = b.c;
        float n;
        if (vnn.e(c)) {
            gva.g0(-445749249);
            gva.q(false);
            n = xc8.I(c2);
        }
        else if (vnn.d(c2)) {
            gva.g0(-445747958);
            final long b2 = a.b;
            long b3 = ((mnn)gva.j((sei)lmn.a)).a.b;
            if (!vnn.a(b2, vnn.c)) {
                b3 = b2;
            }
            n = xc8.I(b3) * vnn.c(c2);
            gva.q(false);
        }
        else {
            gva.g0(-445742977);
            final long b4 = a.b;
            long b5 = ((mnn)gva.j((sei)lmn.a)).a.b;
            if (!vnn.a(b4, vnn.c)) {
                b5 = b4;
            }
            n = xc8.I(b5);
            gva.q(false);
        }
        gva.q(false);
        return n;
    }
    
    public static final float T(final gva gva) {
        final long c = ((e8e)gva.j((sei)h8e.a)).b.l.b.c;
        long j = tsf.J(16.0);
        if (vnn.e(c)) {
            j = c;
        }
        return ((xc8)gva.j((sei)hm6.h)).I(j) / 2.0f;
    }
    
    public static final void U(final aok aok, final long n, final lta lta) {
        final c9g c9g = new c9g(n);
        final b9g c = b9g.C;
        omo.v(3, c);
        final ynk ynk = new ynk(aok, (Object)c9g, (bua)c, (bua)bok.v, (Object)cok.e, (m6n)lta, (bua)null);
        final AtomicReferenceFieldUpdater a = aok.A;
        aok.h(ynk, false);
    }
    
    public static final boolean V(final String s) {
        return !s.equals("GET") && !s.equals("HEAD");
    }
    
    public static final vy4 W(final int n, final gva gva, boolean b) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        Object o;
        if (b) {
            gva.g0(-994381826);
            gva.q(false);
            final bpa a = dpa.a;
            o = dpa.a;
        }
        else {
            gva.g0(-994381024);
            final bpa a2 = dpa.a;
            o = dpa.a(xo2.z, gva, 54);
            gva.q(false);
        }
        Object o2;
        if (b) {
            gva.g0(-994378754);
            gva.q(false);
            o2 = dpa.a;
        }
        else {
            gva.g0(-994377951);
            o2 = dpa.a(xo2.A, gva, 54);
            gva.q(false);
        }
        final cib a3 = bi6.a;
        Object b2;
        if (b) {
            gva.g0(-994375685);
            gva.q(false);
            b2 = dpa.b;
        }
        else {
            gva.g0(-994374976);
            final xo2 b3 = xo2.B;
            gva.g0(-670957987);
            final c4j l0 = eqi.l0(new Object[] { b3, clj.c(gva) }, gva);
            b2 = l0.a;
            if (b2 != null) {
                gva.q(false);
            }
            else {
                final zna zna = new zna((AbstractList)dpa.b(b3, (Float)null, dpa.d, gva));
                final boolean f = gva.f((Object)zna);
                final Object r = gva.R();
                Object o3;
                if (f || (o3 = r) == a3) {
                    o3 = new cpa((Object)zna, (byte)0);
                    gva.q0(o3);
                }
                b2 = o3;
                l0.a = b2;
                gva.q(false);
            }
            gva.q(false);
        }
        final boolean f2 = gva.f(o);
        final boolean f3 = gva.f(o2);
        final boolean f4 = gva.f(b2);
        final boolean g = gva.g(b);
        final Object r2 = gva.R();
        vy4 vy4;
        if ((f2 | f3 | f4 | g) || (vy4 = (vy4)r2) == a3) {
            vy4 = new vy4((vna)o, (vna)o2, (vna)b2, b, new ms9(o2, b, b2));
            gva.q0((Object)vy4);
        }
        return vy4;
    }
    
    public static final q65 X(final gva gva) {
        final odk a = ii8.a(gva);
        final boolean f = gva.f((Object)null);
        final boolean f2 = gva.f((Object)a);
        final Object r = gva.R();
        final cib a2 = bi6.a;
        Object o;
        if ((f | f2) || (o = r) == a2) {
            o = a.d((Class)c51.class, (emi)null);
            gva.q0(o);
        }
        final c51 c51 = (c51)o;
        final odk a3 = ii8.a(gva);
        final boolean f3 = gva.f((Object)null);
        final boolean f4 = gva.f((Object)a3);
        final Object r2 = gva.R();
        Object o2;
        if ((f3 | f4) || (o2 = r2) == a2) {
            o2 = a3.d((Class)oi0.class, (emi)null);
            gva.q0(o2);
        }
        final oi0 oi0 = (oi0)o2;
        final bnf w = o50.W(q8r.g(gva), gva);
        final boolean f5 = gva.f((Object)c51);
        final boolean f6 = gva.f((Object)oi0);
        final Object r3 = gva.R();
        q65 q65;
        if ((f5 | f6) || (q65 = (q65)r3) == a2) {
            q65 = new q65(c51, x01.a(oi0), new lz4(w, (byte)3));
            gva.q0((Object)q65);
        }
        return q65;
    }
    
    public static final void Y(final String s, final RenderProcessGoneDetail renderProcessGoneDetail, final int n, final String s2) {
        final boolean b = renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash();
        Label_0051: {
            if (!b) {
                final int d = ge9.D(n);
                if (d != 0) {
                    if (d != 1) {
                        if (d == 2) {
                            break Label_0051;
                        }
                        en9.r();
                    }
                    return;
                }
            }
        }
        final List a = adn.a;
        final Map map = null;
        Integer value;
        if (renderProcessGoneDetail != null) {
            value = renderProcessGoneDetail.rendererPriorityAtExit();
        }
        else {
            value = null;
        }
        final StringBuilder sb = new StringBuilder(s);
        sb.append(" render process gone: didCrash=");
        sb.append(b);
        sb.append(", foreground=");
        sb.append(ca9.v(n));
        sb.append(", rendererPriority=");
        sb.append((Object)value);
        final SilentException ex = new SilentException(sb.toString());
        lpl lpl;
        if (b) {
            lpl = lpl.x;
        }
        else {
            lpl = lpl.w;
        }
        Map singletonMap = map;
        if (s2 != null) {
            singletonMap = Collections.singletonMap((Object)"host_view_session_id", (Object)s2);
            singletonMap.getClass();
        }
        Object v;
        if ((v = singletonMap) == null) {
            v = s89.v;
        }
        String s3;
        if (b) {
            s3 = "crash";
        }
        else {
            s3 = "reclaim";
        }
        adn.f((Throwable)ex, (String)null, lpl, (Map)v, lq6.Y("webview_render_process_gone", s, s3), 18);
    }
    
    public static final boolean Z(final String s) {
        return s.equals("POST") || s.equals("PUT") || s.equals("PATCH") || s.equals("PROPPATCH") || s.equals("QUERY") || s.equals("REPORT");
    }
    
    public static final bi2 a(final float n, final long n2) {
        return new bi2(n, new cam(n2));
    }
    
    public static igf a0(final igf igf, final float n, final aql aql, long a, long a2, final int n2) {
        boolean b2;
        final boolean b = b2 = false;
        if ((n2 & 0x4) != 0x0) {
            b2 = b;
            if (qs8.b(n, 0.0f) > 0) {
                b2 = true;
            }
        }
        if ((n2 & 0x8) != 0x0) {
            a = k6b.a;
        }
        if ((n2 & 0x10) != 0x0) {
            a2 = k6b.a;
        }
        if (qs8.b(n, 0.0f) <= 0 && !b2) {
            return igf;
        }
        return igf.E((igf)new spl(n, aql, b2, a, a2));
    }
    
    public static final mn2 b(final int n, final int n2, final lta lta) {
        if (n != -2) {
            if (n != -1) {
                if (n != 0) {
                    if (n == Integer.MAX_VALUE) {
                        return new mn2(Integer.MAX_VALUE, lta);
                    }
                    if (n2 == 1) {
                        return new mn2(n, lta);
                    }
                    return (mn2)new yn6(n, n2, lta);
                }
                else {
                    if (n2 == 1) {
                        return new mn2(0, lta);
                    }
                    return (mn2)new yn6(1, n2, lta);
                }
            }
            else {
                if (n2 == 1) {
                    return (mn2)new yn6(1, 2, lta);
                }
                en9.s("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                return null;
            }
        }
        else {
            if (n2 == 1) {
                xd3.c.getClass();
                return new mn2(wd3.b, lta);
            }
            return (mn2)new yn6(1, n2, lta);
        }
    }
    
    public static j78 b0(final int n, lta m, final cua cua) {
        if ((n & 0x2) != 0x0) {
            m = (lta)hr0.M;
        }
        return new j78(m, cua);
    }
    
    public static j78 c0(final ylm ylm, lta n, final int n2) {
        if ((n2 & 0x4) != 0x0) {
            n = (lta)hr0.N;
        }
        return new j78(n, (cua)new d90((Object)ylm, (byte)3));
    }
    
    public static final void d(final p65 p4, final jta jta, final gva gva, final int n) {
        gva.i0(-1671123217);
        int n2;
        if (gva.f((Object)p4)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n4;
        final int n3 = n4 = (n2 | n);
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
            final q65 x = X(gva);
            final ArtifactLink artifactLink = (ArtifactLink)p4.a.getValue();
            if (artifactLink == null) {
                gva.g0(-1465654126);
                gva.q(false);
            }
            else {
                gva.g0(-1465654125);
                final String a = artifactLink.a();
                final int n6 = n4 & 0xE;
                final boolean b = n6 == 4;
                final Object r = gva.R();
                final cib a2 = bi6.a;
                Object o;
                if (b || (o = r) == a2) {
                    o = new ii4((Object)p4, (byte)22);
                    gva.q0(o);
                }
                final jta jta2 = (jta)o;
                final boolean b2 = n6 == 4;
                final boolean f = gva.f((Object)x);
                final boolean b3 = (n4 & 0x70) == 0x20;
                final Object r2 = gva.R();
                Object o2;
                if ((b3 | (b2 | f)) || (o2 = r2) == a2) {
                    o2 = new je4((Object)p4, (Object)x, (Object)jta, (byte)15);
                    gva.q0(o2);
                }
                i9r.b(a, jta2, (jta)o2, gva, 0);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new q41((Object)p4, (Object)jta, n, (byte)1);
        }
    }
    
    public static final fka d0(final ija ija, final int n) {
        if (n > 0) {
            return new fka(ija, n);
        }
        oyl.g((Object)oz1.n("Requested element count ", n, " should be positive"));
        return null;
    }
    
    public static final void e(final CodeArtifactViewerParams codeArtifactViewerParams, final c51 c51, final wo8 wo8, final jta jta, final gva gva, final int n) {
        final ye6 a = p1r.a;
        gva.i0(-1107729535);
        int n2;
        if (gva.f((Object)codeArtifactViewerParams)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)c51)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.f((Object)wo8)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5 = n2 | n | n3 | n4;
        if ((n & 0xC00) == 0x0) {
            int n6;
            if (gva.h((Object)jta)) {
                n6 = 2048;
            }
            else {
                n6 = 1024;
            }
            n5 |= n6;
        }
        if (gva.W(n5 & 0x1, (n5 & 0x2493) != 0x2492)) {
            final bnf w = o50.W(jta, gva);
            final int d = ge9.D(k.a(codeArtifactViewerParams.a.a(), c51.b));
            final cib a2 = bi6.a;
            if (d != 0) {
                if (d != 1) {
                    throw ge9.y(623816232, gva, false);
                }
                gva.g0(-2136380673);
                final boolean b = (n5 & 0xE) == 0x4;
                final boolean b2 = (n5 & 0x70) == 0x20;
                final boolean b3 = (n5 & 0x380) == 0x100;
                final Object r = gva.R();
                Object o;
                if ((b3 | (b | b2)) || (o = r) == a2) {
                    o = new o64((Object)codeArtifactViewerParams, (Object)c51, (Object)wo8, (byte)16);
                    gva.q0(o);
                }
                final y65 y65 = (y65)rhc.S(v4j.a((Class)y65.class), tsf.E(v4j.a((Class)y65.class)), (lta)o, gva);
                final boolean f = gva.f((Object)w);
                final Object r2 = gva.R();
                Object o2;
                if (f || (o2 = r2) == a2) {
                    o2 = new u05(w, (byte)1);
                    gva.q0(o2);
                }
                a.m((Object)y65, (Object)o2, (Object)gva, (Object)384);
                gva.q(false);
            }
            else {
                gva.g0(623818380);
                final boolean f2 = gva.f((Object)w);
                final Object r3 = gva.R();
                Object o3;
                if (f2 || (o3 = r3) == a2) {
                    o3 = new c54(w, (f07)null, (byte)2);
                    gva.q0(o3);
                }
                mlc.f((zta)o3, gva, lqo.a);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new c44(codeArtifactViewerParams, c51, wo8, jta, n);
        }
    }
    
    public static final float e0(final gva gva) {
        float v;
        if (Float.isNaN(v = ((qs8)gva.j((sei)hic.c)).v)) {
            v = 0.0f;
        }
        final float n = (v - 24.0f) / 2.0f;
        if (n < 0.0f) {
            return 0.0f;
        }
        return n;
    }
    
    public static final void f(final CodeArtifactViewerParams codeArtifactViewerParams, final jta jta, final gva gva, final int n) {
        gva.i0(-1949222161);
        int n2;
        if (gva.f((Object)codeArtifactViewerParams)) {
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
        final int n4 = n2 | n | n3;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final odk a = ii8.a(gva);
            final boolean f = gva.f((Object)null);
            final boolean f2 = gva.f((Object)a);
            final Object r = gva.R();
            final cib a2 = bi6.a;
            Object o;
            if ((f | f2) || (o = r) == a2) {
                o = a.d((Class)c51.class, (emi)null);
                gva.q0(o);
            }
            final c51 c51 = (c51)o;
            final odk a3 = ii8.a(gva);
            final boolean f3 = gva.f((Object)null);
            final boolean f4 = gva.f((Object)a3);
            final Object r2 = gva.R();
            Object o2;
            if ((f3 | f4) || (o2 = r2) == a2) {
                o2 = a3.d((Class)wo8.class, (emi)null);
                gva.q0(o2);
            }
            e(codeArtifactViewerParams, c51, (wo8)o2, jta, gva, (n4 & 0xE) | 0x6000 | (n4 << 6 & 0x1C00));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new n84((Object)codeArtifactViewerParams, (Object)jta, n, (byte)16);
        }
    }
    
    public static final igf f0(final igf igf, final boolean b, final riq riq, final gva gva) {
        final fgf v = fgf.v;
        Object y;
        if (b && riq instanceof vin) {
            gva.g0(-2119688641);
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new cyl((byte)27);
                gva.q0(r);
            }
            y = omo.Y(wsk.b((lta)r, (igf)v, true), 0.0f, T(gva), 0.0f, 0.0f, 13);
            gva.q(false);
        }
        else {
            gva.g0(-2119398202);
            gva.q(false);
            y = v;
        }
        return igf.E((igf)y);
    }
    
    public static final void g0(final EditorInfo editorInfo, final CharSequence charSequence, final long n, final y4c y4c, final String[] contentMimeTypes) {
        final int e = y4c.e;
        final int d = y4c.d;
        final boolean a = y4c.a;
        int imeOptions = 0;
        Label_0128: {
            if (e == 1) {
                if (!a) {
                    imeOptions = 0;
                    break Label_0128;
                }
            }
            else {
                if (e == 0) {
                    imeOptions = 1;
                    break Label_0128;
                }
                if (e == 2) {
                    imeOptions = 2;
                    break Label_0128;
                }
                if (e == 6) {
                    imeOptions = 5;
                    break Label_0128;
                }
                if (e == 5) {
                    imeOptions = 7;
                    break Label_0128;
                }
                if (e == 3) {
                    imeOptions = 3;
                    break Label_0128;
                }
                if (e == 4) {
                    imeOptions = 4;
                    break Label_0128;
                }
                if (e != 7) {
                    en9.q("invalid ImeAction");
                    return;
                }
            }
            imeOptions = 6;
        }
        editorInfo.imeOptions = imeOptions;
        final jpd f = y4c.f;
        if (mlc.q(f, jpd.x)) {
            editorInfo.hintLocales = null;
        }
        else {
            final ArrayList list = new ArrayList(d86.p0((Iterable)f, 10));
            final Iterator iterator = f.v.iterator();
            while (iterator.hasNext()) {
                list.add((Object)((hpd)iterator.next()).a);
            }
            final Locale[] array = (Locale[])list.toArray((Object[])new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[])Arrays.copyOf((Object[])array, array.length));
        }
        int inputType = 0;
        Label_0611: {
            if (d != 1) {
                if (d == 2) {
                    editorInfo.imeOptions |= Integer.MIN_VALUE;
                }
                else {
                    if (d == 3) {
                        inputType = 2;
                        break Label_0611;
                    }
                    if (d == 4) {
                        inputType = 3;
                        break Label_0611;
                    }
                    inputType = 17;
                    if (d == 5) {
                        break Label_0611;
                    }
                    if (d == 6) {
                        inputType = 33;
                        break Label_0611;
                    }
                    if (d == 7) {
                        inputType = 129;
                        break Label_0611;
                    }
                    if (d == 8) {
                        inputType = 18;
                        break Label_0611;
                    }
                    if (d == 9) {
                        inputType = 8194;
                        break Label_0611;
                    }
                    if (d == 10) {
                        inputType = 145;
                        break Label_0611;
                    }
                    if (d == 11) {
                        inputType = 113;
                        break Label_0611;
                    }
                    if (d == 12) {
                        inputType = 97;
                        break Label_0611;
                    }
                    if (d == 13) {
                        inputType = 49;
                        break Label_0611;
                    }
                    if (d == 14) {
                        inputType = 65;
                        break Label_0611;
                    }
                    if (d == 15) {
                        inputType = 81;
                        break Label_0611;
                    }
                    if (d == 16) {
                        inputType = 177;
                        break Label_0611;
                    }
                    if (d == 17) {
                        inputType = 193;
                        break Label_0611;
                    }
                    if (d == 18) {
                        inputType = 4;
                        break Label_0611;
                    }
                    inputType = 20;
                    if (d == 19) {
                        break Label_0611;
                    }
                    if (d == 20) {
                        inputType = 36;
                        break Label_0611;
                    }
                    if (d == 21) {
                        inputType = 4098;
                        break Label_0611;
                    }
                    if (d == 22) {
                        inputType = 12290;
                        break Label_0611;
                    }
                    if (d == 23) {
                        inputType = 8210;
                        break Label_0611;
                    }
                    if (d == 24) {
                        inputType = 4114;
                        break Label_0611;
                    }
                    if (d == 25) {
                        inputType = 12306;
                        break Label_0611;
                    }
                    en9.q("Invalid Keyboard Type");
                    return;
                }
            }
            inputType = 1;
        }
        editorInfo.inputType = inputType;
        int n2 = inputType;
        if (!a) {
            n2 = inputType;
            if ((inputType & 0xF) == 0x1) {
                final int inputType2 = inputType | 0x20000;
                editorInfo.inputType = inputType2;
                n2 = inputType2;
                if (y4c.e == 1) {
                    editorInfo.imeOptions |= 0x40000000;
                    n2 = inputType2;
                }
            }
        }
        if ((n2 & 0xF) == 0x1) {
            final int b = y4c.b;
            int inputType3;
            if (b == 1) {
                inputType3 = (n2 | 0x1000);
                editorInfo.inputType = inputType3;
            }
            else if (b == 2) {
                inputType3 = (n2 | 0x2000);
                editorInfo.inputType = inputType3;
            }
            else {
                inputType3 = n2;
                if (b == 3) {
                    inputType3 = (n2 | 0x4000);
                    editorInfo.inputType = inputType3;
                }
            }
            if (y4c.c) {
                editorInfo.inputType = (0x8000 | inputType3);
            }
            if (Build$VERSION.SDK_INT >= 37) {
                ear.r(editorInfo);
            }
        }
        final int c = dnn.c;
        editorInfo.initialSelStart = (int)(n >> 32);
        editorInfo.initialSelEnd = (int)(n & 0xFFFFFFFFL);
        zn2.N(editorInfo, charSequence);
        if (contentMimeTypes != null) {
            editorInfo.contentMimeTypes = contentMimeTypes;
        }
        editorInfo.imeOptions |= 0x2000000;
        if (v0n.a) {
            if (d != 7) {
                if (d != 10) {
                    if (d != 8) {
                        if (d != 23) {
                            if (d != 24) {
                                if (d != 25) {
                                    if (Build$VERSION.SDK_INT >= 35) {
                                        g29.a(editorInfo, true);
                                    }
                                    Bundle extras;
                                    if ((extras = editorInfo.extras) == null) {
                                        extras = new Bundle();
                                        editorInfo.extras = extras;
                                    }
                                    ((BaseBundle)extras).putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
                                    ws4.i(editorInfo, lq6.Y(ws4.d(), ws4.m(), ws4.k(), ws4.l(), ws4.n(), ws4.o(), ws4.p()));
                                    ws4.j(editorInfo, iw0.n1((Object[])new Class[] { ws4.d(), ws4.m(), ws4.k(), ws4.l() }));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Build$VERSION.SDK_INT >= 35) {
            g29.a(editorInfo, false);
        }
        Bundle extras2;
        if ((extras2 = editorInfo.extras) == null) {
            extras2 = new Bundle();
            editorInfo.extras = extras2;
        }
        ((BaseBundle)extras2).putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
    }
    
    public static final void h(final CharSequence charSequence, final zta zta, final riq riq, final bua bua, final zta zta2, final zta zta3, final zta zta4, final zta zta5, final zta zta6, final boolean b, final boolean b2, final boolean b3, final llf llf, final dng dng, final ihn ihn, final zta zta7, gva gva, final int n, final int n2) {
        final gva gva2 = gva;
        final def d = def.D;
        final elo e = yi2.e;
        final Integer value = 0;
        gva2.i0(-1478429597);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva2.h((Object)charSequence)) {
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
        final int n5 = 32;
        int n6 = n4;
        if ((n & 0x30) == 0x0) {
            int n7;
            if (gva2.h((Object)zta)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n4 | n7);
        }
        final int n8 = 128;
        int n9 = n6;
        if ((n & 0x180) == 0x0) {
            int n10;
            if (gva2.f((Object)riq)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n9 = (n6 | n10);
        }
        final int n11 = 1024;
        int n12 = n9;
        if ((n & 0xC00) == 0x0) {
            int n13;
            if (gva2.h((Object)bua)) {
                n13 = 2048;
            }
            else {
                n13 = 1024;
            }
            n12 = (n9 | n13);
        }
        final int n14 = 8192;
        int n15 = n12;
        if ((n & 0x6000) == 0x0) {
            int n16;
            if (gva2.h((Object)zta2)) {
                n16 = 16384;
            }
            else {
                n16 = 8192;
            }
            n15 = (n12 | n16);
        }
        final int n17 = 65536;
        int n18 = n15;
        if ((n & 0x30000) == 0x0) {
            int n19;
            if (gva2.h((Object)zta3)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 = (n15 | n19);
        }
        final int n20 = 524288;
        int n21 = n18;
        if ((n & 0x180000) == 0x0) {
            int n22;
            if (gva2.h((Object)zta4)) {
                n22 = 1048576;
            }
            else {
                n22 = 524288;
            }
            n21 = (n18 | n22);
        }
        int n23 = n21;
        if ((n & 0xC00000) == 0x0) {
            int n24;
            if (gva2.h((Object)zta5)) {
                n24 = 8388608;
            }
            else {
                n24 = 4194304;
            }
            n23 = (n21 | n24);
        }
        if ((n & 0x6000000) == 0x0) {
            int n25;
            if (gva2.h((Object)null)) {
                n25 = 67108864;
            }
            else {
                n25 = 33554432;
            }
            n23 |= n25;
        }
        int n26 = n23;
        if ((0x30000000 & n) == 0x0) {
            int n27;
            if (gva2.h((Object)zta6)) {
                n27 = 536870912;
            }
            else {
                n27 = 268435456;
            }
            n26 = (n23 | n27);
        }
        int n29;
        if ((n2 & 0x6) == 0x0) {
            int n28;
            if (gva2.g(b)) {
                n28 = 4;
            }
            else {
                n28 = 2;
            }
            n29 = (n2 | n28);
        }
        else {
            n29 = n2;
        }
        int n30 = n29;
        if ((n2 & 0x30) == 0x0) {
            int n31;
            if (gva2.g(b2)) {
                n31 = n5;
            }
            else {
                n31 = 16;
            }
            n30 = (n29 | n31);
        }
        int n32 = n30;
        if ((n2 & 0x180) == 0x0) {
            int n33 = n8;
            if (gva2.g(b3)) {
                n33 = 256;
            }
            n32 = (n30 | n33);
        }
        int n34 = n32;
        if ((n2 & 0xC00) == 0x0) {
            int n35 = n11;
            if (gva2.f((Object)llf)) {
                n35 = 2048;
            }
            n34 = (n32 | n35);
        }
        int n37;
        if ((n2 & 0x6000) == 0x0) {
            int n36 = n14;
            if (gva2.f((Object)dng)) {
                n36 = 16384;
            }
            n37 = (n34 | n36);
        }
        else {
            n37 = n34;
        }
        int n38 = n37;
        if ((n2 & 0x30000) == 0x0) {
            int n39 = n17;
            if (gva2.f((Object)ihn)) {
                n39 = 131072;
            }
            n38 = (n37 | n39);
        }
        int n40 = n38;
        if ((n2 & 0x180000) == 0x0) {
            int n41 = n20;
            if (gva2.h((Object)zta7)) {
                n41 = 1048576;
            }
            n40 = (n38 | n41);
        }
        if (gva2.W(n26 & 0x1, (n26 & 0x12492493) != 0x12492492 || (n40 & 0x92493) != 0x92492)) {
            final boolean booleanValue = (boolean)((xom)t08.t(llf, gva2, n40 >> 9 & 0xE)).getValue();
            final edc x = edc.x;
            final edc w = edc.w;
            final edc v = edc.v;
            edc edc;
            if (booleanValue) {
                edc = v;
            }
            else if (charSequence.length() == 0) {
                edc = w;
            }
            else {
                edc = x;
            }
            final tno b4 = ((e8e)gva2.j((sei)h8e.a)).b;
            final mnn j = b4.j;
            final mnn l = b4.l;
            final long c = j.c();
            final long h = j86.h;
            final boolean b5 = (foo.a(c, h) && !foo.a(l.c(), h)) || (!foo.a(j.c(), h) && foo.a(l.c(), h));
            final efo z = xp7.Z(edc, "TextFieldInputState", gva2, 48, 0);
            final r1 a = z.a;
            boolean b6 = false;
            Label_1033: {
                Label_1030: {
                    if (bua != null) {
                        if (!(riq instanceof win)) {
                            if (!(riq instanceof vin)) {
                                break Label_1030;
                            }
                        }
                        b6 = true;
                        break Label_1033;
                    }
                }
                b6 = false;
            }
            final float n42 = 1.0f;
            final cib a2 = bi6.a;
            zeo u;
            if (bua != null) {
                gva2.g0(994993276);
                final Object o = new d0f(zrn.X(1, gva2), (byte)3);
                Object o2 = null;
                Label_1229: {
                    if (!z.h()) {
                        gva2.g0(1666573488);
                        final boolean f = gva2.f((Object)z);
                        final Object r = gva2.R();
                        while (true) {
                            if (!f && (o2 = r) != a2) {
                                break Label_1124;
                            }
                            final Object o3 = q7m.a();
                            Label_1187: {
                                Label_1150: {
                                    if (o3 != null) {
                                        o2 = ((r7m)o3).e();
                                        break Label_1150;
                                    }
                                    o2 = null;
                                    break Label_1150;
                                    break Label_1187;
                                }
                                final r7m b7 = q7m.b((r7m)o3);
                                try {
                                    final Object i = a.i();
                                    q7m.d((r7m)o3, b7, (lta)o2);
                                    gva2.q0(i);
                                    o2 = i;
                                    continue;
                                    gva2.q(false);
                                    break Label_1229;
                                }
                                finally {
                                    q7m.d((r7m)o3, b7, (lta)o2);
                                }
                            }
                            break;
                        }
                    }
                    gva2.g0(1666827533);
                    gva2.q(false);
                    o2 = a.i();
                }
                final edc edc2 = (edc)o2;
                gva2.g0(1071902915);
                final int ordinal = ((Enum)edc2).ordinal();
                float n43 = 0.0f;
                Label_1271: {
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                en9.r();
                                return;
                            }
                        }
                        else if (b6) {
                            n43 = 0.0f;
                            break Label_1271;
                        }
                    }
                    n43 = 1.0f;
                }
                gva2.q(false);
                final boolean f2 = gva2.f((Object)z);
                final Object r2 = gva2.R();
                Object b8;
                if (f2 || (b8 = r2) == a2) {
                    b8 = r8m.b((jta)new dp4(z, (byte)16));
                    gva2.q0(b8);
                }
                final edc edc3 = (edc)((xom)b8).getValue();
                gva2.g0(1071902915);
                final int ordinal2 = ((Enum)edc3).ordinal();
                float n44 = 0.0f;
                Label_1400: {
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                en9.r();
                                return;
                            }
                        }
                        else if (b6) {
                            n44 = 0.0f;
                            break Label_1400;
                        }
                    }
                    n44 = 1.0f;
                }
                gva2.q(false);
                final boolean f3 = gva2.f((Object)z);
                final Object r3 = gva2.R();
                Object b9;
                if (f3 || (b9 = r3) == a2) {
                    b9 = r8m.b((jta)new dp4(z, (byte)17));
                    gva2.q0(b9);
                }
                u = xp7.u(z, n43, n44, (bfa)((d0f)o).h(((xom)b9).getValue(), (Object)gva2, (Object)value), e, gva2, 196608);
                gva2.q(false);
            }
            else {
                gva2.g0(995064483);
                gva2.q(false);
                u = null;
            }
            zeo u2 = null;
            Label_2138: {
                if (zta2 != null) {
                    gva2.g0(995155127);
                    final Object o3 = zrn.X(4, gva2);
                    final Object o = zrn.X(5, gva2);
                    Object o4 = null;
                    Label_1735: {
                        if (!z.h()) {
                            gva2.g0(1666573488);
                            final boolean f4 = gva2.f((Object)z);
                            o4 = gva2.R();
                            while (true) {
                                if (!f4 && o4 != a2) {
                                    break Label_1627;
                                }
                                final r7m a3 = q7m.a();
                                Label_1693: {
                                    Label_1647: {
                                        if (a3 != null) {
                                            o4 = a3.e();
                                            break Label_1647;
                                        }
                                        o4 = null;
                                        break Label_1647;
                                        break Label_1693;
                                    }
                                    final r7m b10 = q7m.b(a3);
                                    try {
                                        final Object k = a.i();
                                        q7m.d(a3, b10, (lta)o4);
                                        gva2.q0(k);
                                        o4 = k;
                                        continue;
                                        gva2.q(false);
                                        break Label_1735;
                                    }
                                    finally {
                                        q7m.d(a3, b10, (lta)o4);
                                    }
                                }
                                break;
                            }
                        }
                        gva2.g0(1666827533);
                        gva2.q(false);
                        o4 = a.i();
                    }
                    final edc edc4 = (edc)o4;
                    gva2.g0(-2037958114);
                    final int ordinal3 = ((Enum)edc4).ordinal();
                    while (true) {
                        Label_1792: {
                            if (ordinal3 == 0) {
                                break Label_1792;
                            }
                            if (ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    en9.r();
                                    return;
                                }
                            }
                            else if (!b6) {
                                break Label_1792;
                            }
                            final float n45 = 0.0f;
                            gva2.q(false);
                            final boolean f5 = gva2.f((Object)z);
                            Object o5 = gva2.R();
                            if (f5 || o5 == a2) {
                                o5 = r8m.b((jta)new gj4(z, (byte)8));
                                gva2.q0(o5);
                            }
                            final edc edc5 = (edc)((xom)o5).getValue();
                            gva2.g0(-2037958114);
                            final int ordinal4 = ((Enum)edc5).ordinal();
                            while (true) {
                                Label_1926: {
                                    if (ordinal4 == 0) {
                                        break Label_1926;
                                    }
                                    if (ordinal4 != 1) {
                                        if (ordinal4 != 2) {
                                            en9.r();
                                            return;
                                        }
                                    }
                                    else if (!b6) {
                                        break Label_1926;
                                    }
                                    final float n46 = 0.0f;
                                    gva2.q(false);
                                    final boolean f6 = gva2.f((Object)z);
                                    Object o6 = gva2.R();
                                    if (f6 || o6 == a2) {
                                        o6 = r8m.b((jta)new gj4(z, (byte)9));
                                        gva2.q0(o6);
                                    }
                                    final xeo xeo = (xeo)((xom)o6).getValue();
                                    gva2.g0(-1370891590);
                                    Object o7 = null;
                                    Label_2070: {
                                        if (!xeo.e(v, w)) {
                                            if (xeo.e(w, v) || xeo.e(x, w)) {
                                                o7 = o;
                                                break Label_2070;
                                            }
                                        }
                                        o7 = o3;
                                    }
                                    gva2.q(false);
                                    u2 = xp7.u(z, n45, n46, (bfa)o7, e, gva2, 196608);
                                    gva2.q(false);
                                    break Label_2138;
                                }
                                final float n46 = 1.0f;
                                continue;
                            }
                        }
                        final float n45 = 1.0f;
                        continue;
                    }
                }
                gva2.g0(995231139);
                gva2.q(false);
                u2 = null;
            }
            xom xom;
            if (zta5 == null) {
                gva2.g0(995398787);
                gva2.q(false);
                xom = null;
            }
            else {
                gva2.g0(995328541);
                final d0f d0f = new d0f(zrn.X(4, gva2), (byte)2);
                Object o8 = null;
                Label_2343: {
                    if (!z.h()) {
                        gva2.g0(1666573488);
                        final boolean f7 = gva2.f((Object)z);
                        final Object r4 = gva2.R();
                        while (true) {
                            if (!f7 && (o8 = r4) != a2) {
                                break Label_2238;
                            }
                            final Object o = q7m.a();
                            Label_2301: {
                                Label_2264: {
                                    if (o != null) {
                                        o8 = ((r7m)o).e();
                                        break Label_2264;
                                    }
                                    o8 = null;
                                    break Label_2264;
                                    break Label_2301;
                                }
                                final Object o3 = q7m.b((r7m)o);
                                try {
                                    final Object m = a.i();
                                    q7m.d((r7m)o, (r7m)o3, (lta)o8);
                                    gva2.q0(m);
                                    o8 = m;
                                    continue;
                                    gva2.q(false);
                                    break Label_2343;
                                }
                                finally {
                                    q7m.d((r7m)o, (r7m)o3, (lta)o8);
                                }
                            }
                            break;
                        }
                    }
                    gva2.g0(1666827533);
                    gva2.q(false);
                    o8 = a.i();
                }
                final edc edc6 = (edc)o8;
                gva2.g0(-2144425951);
                final int ordinal5 = ((Enum)edc6).ordinal();
                float n47 = 0.0f;
                Label_2385: {
                    if (ordinal5 != 0) {
                        if (ordinal5 != 1) {
                            if (ordinal5 != 2) {
                                en9.r();
                                return;
                            }
                        }
                        else if (b6) {
                            n47 = 0.0f;
                            break Label_2385;
                        }
                    }
                    n47 = 1.0f;
                }
                gva2.q(false);
                final boolean f8 = gva2.f((Object)z);
                final Object r5 = gva2.R();
                Object b11;
                if (f8 || (b11 = r5) == a2) {
                    b11 = r8m.b((jta)new dp4(z, (byte)12));
                    gva2.q0(b11);
                }
                final edc edc7 = (edc)((xom)b11).getValue();
                gva2.g0(-2144425951);
                final int ordinal6 = ((Enum)edc7).ordinal();
                float n48;
                if (ordinal6 != 0) {
                    if (ordinal6 != 1) {
                        if (ordinal6 != 2) {
                            en9.r();
                            return;
                        }
                        n48 = n42;
                    }
                    else {
                        n48 = n42;
                        if (b6) {
                            n48 = 0.0f;
                        }
                    }
                }
                else {
                    n48 = n42;
                }
                gva2.q(false);
                final boolean f9 = gva2.f((Object)z);
                final Object r6 = gva2.R();
                Object b12;
                if (f9 || (b12 = r6) == a2) {
                    b12 = r8m.b((jta)new dp4(z, (byte)13));
                    gva2.q0(b12);
                }
                final zeo u3 = xp7.u(z, n47, n48, (bfa)d0f.h(((xom)b12).getValue(), (Object)gva2, (Object)value), e, gva2, 196608);
                gva2.q(false);
                xom = u3;
            }
            zta zta8;
            if (bua == null) {
                gva.g0(995485028);
                gva.q(false);
                zta8 = null;
            }
            else {
                gva.g0(995485029);
                final gva gva3 = gva;
                final ye6 t0 = uuj.t0(-568812970, (aua)new kin(u, ihn, b2, b3, booleanValue, b5, z, l, j, bua), gva3);
                gva3.q(false);
                zta8 = (zta)t0;
            }
            long n49;
            if (!b2) {
                n49 = ihn.D;
            }
            else if (b3) {
                n49 = ihn.E;
            }
            else if (booleanValue) {
                n49 = ihn.B;
            }
            else {
                n49 = ihn.C;
            }
            Object r7;
            if ((r7 = gva.R()) == a2) {
                final iem iem = new iem((xom)u2, (byte)2);
                final tze a4 = r8m.a;
                r7 = new sd8((jta)iem, (q8m)d);
                gva.q0(r7);
            }
            final xom xom2 = (xom)r7;
            Object t2;
            if (zta2 != null && charSequence.length() == 0 && (boolean)xom2.getValue()) {
                gva.g0(996556513);
                t2 = uuj.t0(1789869489, (aua)new ein(n49, j, zta2), gva);
                gva.q(false);
            }
            else {
                gva.g0(996868186);
                gva.q(false);
                t2 = null;
            }
            long n50;
            if (!b2) {
                n50 = ihn.L;
            }
            else if (b3) {
                n50 = ihn.M;
            }
            else if (booleanValue) {
                n50 = ihn.J;
            }
            else {
                n50 = ihn.K;
            }
            Object r8 = gva.R();
            if (r8 == a2) {
                final iem iem2 = new iem(xom, (byte)3);
                final tze a5 = r8m.a;
                r8 = new sd8((jta)iem2, (q8m)d);
                gva.q0(r8);
            }
            final xom xom3 = (xom)r8;
            Object t3;
            if (zta5 != null && (boolean)xom3.getValue()) {
                gva.g0(997164268);
                t3 = uuj.t0(863320535, (aua)new fin(n50, (Object)j, (aua)zta5, (byte)0), gva);
                gva.q(false);
            }
            else {
                gva.g0(997311610);
                gva.q(false);
                t3 = null;
            }
            gva.g0(997632026);
            gva.q(false);
            long n51;
            if (!b2) {
                n51 = ihn.r;
            }
            else if (b3) {
                n51 = ihn.s;
            }
            else if (booleanValue) {
                n51 = ihn.p;
            }
            else {
                n51 = ihn.q;
            }
            Object t4;
            if (zta3 == null) {
                gva.g0(997794745);
                gva.q(false);
                t4 = null;
            }
            else {
                gva.g0(997794746);
                t4 = uuj.t0(-341635739, (aua)new gin(n51, zta3, (byte)0), gva);
                gva.q(false);
            }
            long n52;
            if (!b2) {
                n52 = ihn.v;
            }
            else if (b3) {
                n52 = ihn.w;
            }
            else if (booleanValue) {
                n52 = ihn.t;
            }
            else {
                n52 = ihn.u;
            }
            Object t5;
            if (zta4 == null) {
                gva.g0(998054680);
                gva.q(false);
                t5 = null;
            }
            else {
                gva.g0(998054681);
                t5 = uuj.t0(-1014805251, (aua)new gin(n52, zta4, (byte)1), gva);
                gva.q(false);
            }
            long n53;
            if (!b2) {
                n53 = ihn.H;
            }
            else if (b3) {
                n53 = ihn.I;
            }
            else if (booleanValue) {
                n53 = ihn.F;
            }
            else {
                n53 = ihn.G;
            }
            Object t6;
            if (zta6 == null) {
                gva.g0(998325155);
                gva.q(false);
                t6 = null;
            }
            else {
                gva.g0(998325156);
                t6 = uuj.t0(-1718586554, (aua)new fin(n53, (Object)l, (aua)zta6, (byte)1), gva);
                gva.q(false);
            }
            final boolean f10 = gva.f((Object)u);
            final Object r9 = gva.R();
            Object o9;
            if (!f10 && r9 != a2) {
                o9 = r9;
            }
            else {
                o9 = new iem((xom)u, (byte)4);
                gva.q0(o9);
            }
            final jta jta = (jta)o9;
            final boolean f11 = gva.f((Object)u2);
            final Object r10 = gva.R();
            Object o10;
            if (f11 || (o10 = r10) == a2) {
                o10 = new iem((xom)u2, (byte)5);
                gva.q0(o10);
            }
            final jta jta2 = (jta)o10;
            final boolean f12 = gva.f((Object)xom);
            final Object r11 = gva.R();
            Object o11;
            if (f12 || (o11 = r11) == a2) {
                o11 = new iem(xom, (byte)6);
                gva.q0(o11);
            }
            final jta jta3 = (jta)o11;
            if (riq instanceof vin) {
                gva.g0(998774501);
                Object o12;
                if ((o12 = gva.R()) == a2) {
                    o12 = o50.Q(new yzl(0L));
                    gva.q0(o12);
                }
                final bnf bnf = (bnf)o12;
                final ye6 t7 = uuj.t0(-852893942, (aua)new cj4((Object)bnf, (Object)riq, (Object)dng, (Object)zta7, (byte)8), gva);
                final vin vin = (vin)riq;
                final oin oin = new oin(jta);
                final oin oin2 = new oin(jta2);
                final oin oin3 = new oin(jta3);
                final boolean f13 = gva.f((Object)jta);
                final Object r12 = gva.R();
                Object o13;
                if (f13 || (o13 = r12) == a2) {
                    o13 = new tyl((Object)jta, (Object)bnf, (byte)8);
                    gva.q0(o13);
                }
                i(zta, charSequence, (bua)t2, zta8, (zta)t4, (zta)t5, (zta)t3, null, b, (riq)vin, oin, oin2, oin3, (lta)o13, t7, (zta)t6, dng, gva, (n26 & 0x70) | 0x6 | (n26 << 6 & 0x380) | (n40 << 27 & 0x70000000), (n26 >> 6 & 0xE) | 0x30000 | (n40 << 9 & 0x1C00000));
                gva.q(false);
            }
            else {
                gva.g0(1000494784);
                m(zta, charSequence, zta8, (bua)t2, (zta)t4, (zta)t5, (zta)t3, null, b, riq, new oin(jta), new oin(jta2), new oin(jta3), uuj.t0(590261845, (aua)new xp4(zta7, (byte)4), gva), (zta)t6, dng, gva, (n26 & 0x70) | 0x6 | (n26 << 6 & 0x380) | (n40 << 27 & 0x70000000), (n26 >> 6 & 0xE) | 0x6000 | (0x380000 & n40 << 6));
                gva.q(false);
            }
        }
        else {
            gva2.Z();
            gva = gva2;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new lin(charSequence, zta, riq, bua, zta2, zta3, zta4, zta5, zta6, b, b2, b3, llf, dng, ihn, zta7, n, n2);
        }
    }
    
    public static final igf h0(final igf igf, final CharSequence charSequence, final boolean b) {
        Object o;
        final fgf fgf = (fgf)(o = fgf.v);
        if (b) {
            o = fgf;
            if (charSequence.length() > 0) {
                o = wsk.b((lta)new e0j((Object)charSequence, (byte)19), (igf)fgf, false);
            }
        }
        return igf.E((igf)o);
    }
    
    public static final void i(final zta zta, final CharSequence charSequence, final bua bua, final zta zta2, final zta zta3, final zta zta4, final zta zta5, final zta zta6, final boolean b, final riq riq, final oin oin, final oin oin2, final oin oin3, final lta lta, final ye6 ye6, final zta zta7, final dng dng, final gva gva, final int n, final int n2) {
        final mb2 x = wab.x;
        gva.i0(720589198);
        final fgf v = fgf.v;
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)v)) {
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
        final int n5 = 16;
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
        final int n8 = 128;
        int n9 = n6;
        if ((n & 0x180) == 0x0) {
            int n10;
            if (gva.h((Object)charSequence)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n9 = (n6 | n10);
        }
        final int n11 = 1024;
        int n12 = n9;
        if ((n & 0xC00) == 0x0) {
            int n13;
            if (gva.h((Object)bua)) {
                n13 = 2048;
            }
            else {
                n13 = 1024;
            }
            n12 = (n9 | n13);
        }
        final int n14 = 8192;
        int n15 = n12;
        if ((n & 0x6000) == 0x0) {
            int n16;
            if (gva.h((Object)zta2)) {
                n16 = 16384;
            }
            else {
                n16 = 8192;
            }
            n15 = (n12 | n16);
        }
        final int n17 = 65536;
        int n18 = n15;
        if ((n & 0x30000) == 0x0) {
            int n19;
            if (gva.h((Object)zta3)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 = (n15 | n19);
        }
        final int n20 = 524288;
        int n21 = n18;
        if ((n & 0x180000) == 0x0) {
            int n22;
            if (gva.h((Object)zta4)) {
                n22 = 1048576;
            }
            else {
                n22 = 524288;
            }
            n21 = (n18 | n22);
        }
        final int n23 = 4194304;
        int n24 = n21;
        if ((n & 0xC00000) == 0x0) {
            int n25;
            if (gva.h((Object)zta5)) {
                n25 = 8388608;
            }
            else {
                n25 = 4194304;
            }
            n24 = (n21 | n25);
        }
        int n26 = n24;
        if ((n & 0x6000000) == 0x0) {
            int n27;
            if (gva.h((Object)zta6)) {
                n27 = 67108864;
            }
            else {
                n27 = 33554432;
            }
            n26 = (n24 | n27);
        }
        int n28 = n26;
        if ((n & 0x30000000) == 0x0) {
            int n29;
            if (gva.g(b)) {
                n29 = 536870912;
            }
            else {
                n29 = 268435456;
            }
            n28 = (n26 | n29);
        }
        int n31;
        if ((n2 & 0x6) == 0x0) {
            int n30;
            if (gva.f((Object)riq)) {
                n30 = 4;
            }
            else {
                n30 = 2;
            }
            n31 = (n2 | n30);
        }
        else {
            n31 = n2;
        }
        int n32 = n31;
        if ((n2 & 0x30) == 0x0) {
            boolean b2;
            if ((n2 & 0x40) == 0x0) {
                b2 = gva.f((Object)oin);
            }
            else {
                b2 = gva.h((Object)oin);
            }
            int n33 = n5;
            if (b2) {
                n33 = 32;
            }
            n32 = (n31 | n33);
        }
        int n34 = n32;
        if ((n2 & 0x180) == 0x0) {
            boolean b3;
            if ((n2 & 0x200) == 0x0) {
                b3 = gva.f((Object)oin2);
            }
            else {
                b3 = gva.h((Object)oin2);
            }
            int n35 = n8;
            if (b3) {
                n35 = 256;
            }
            n34 = (n32 | n35);
        }
        int n36 = n34;
        if ((n2 & 0xC00) == 0x0) {
            boolean b4;
            if ((n2 & 0x1000) == 0x0) {
                b4 = gva.f((Object)oin3);
            }
            else {
                b4 = gva.h((Object)oin3);
            }
            int n37 = n11;
            if (b4) {
                n37 = 2048;
            }
            n36 = (n34 | n37);
        }
        if ((n2 & 0x6000) == 0x0) {
            int n38 = n14;
            if (gva.h((Object)lta)) {
                n38 = 16384;
            }
            n36 |= n38;
        }
        int n39 = n36;
        if ((n2 & 0x30000) == 0x0) {
            int n40 = n17;
            if (gva.h((Object)ye6)) {
                n40 = 131072;
            }
            n39 = (n36 | n40);
        }
        if ((n2 & 0x180000) == 0x0) {
            int n41 = n20;
            if (gva.h((Object)zta7)) {
                n41 = 1048576;
            }
            n39 |= n41;
        }
        int n42 = n39;
        if ((n2 & 0xC00000) == 0x0) {
            int n43 = n23;
            if (gva.f((Object)dng)) {
                n43 = 8388608;
            }
            n42 = (n39 | n43);
        }
        if (gva.W(n28 & 0x1, (n28 & 0x12492493) != 0x12492492 || (0x492493 & n42) != 0x492492)) {
            final float e0 = e0(gva);
            final boolean b5 = (0xE000 & n42) == 0x4000;
            final boolean b6 = (n28 & 0x70000000) == 0x20000000;
            final boolean b7 = (n42 & 0xE) == 0x4;
            final int n44 = n42 & 0x70;
            final boolean b8 = n44 == 32 || ((n42 & 0x40) != 0x0 && gva.f((Object)oin));
            final boolean b9 = (n42 & 0x380) == 0x100 || ((n42 & 0x200) != 0x0 && gva.f((Object)oin2));
            final boolean b10 = (n42 & 0x1C00) == 0x800 || ((n42 & 0x1000) != 0x0 && gva.f((Object)oin3));
            final boolean b11 = (0x1C00000 & n42) == 0x800000;
            final boolean c = gva.c(e0);
            Object r = gva.R();
            final cib a = bi6.a;
            if ((b5 | b6 | b7 | b8 | b9 | b10 | b11 | c) || r == a) {
                r = new fjg(lta, b, riq, oin, oin2, oin3, dng, e0);
                gva.q0(r);
            }
            final fjg fjg = (fjg)r;
            final qzc qzc = (qzc)gva.j((sei)hm6.n);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b12 = ien.B(gva, (igf)v);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n45 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n45);
            }
            else {
                gva.t0();
            }
            final rg6 a2 = awp.A;
            k8e.P((zta)a2, gva, fjg);
            final rg6 z = awp.z;
            k8e.P((zta)z, gva, l);
            final rg6 b13 = awp.B;
            k8e.P((zta)b13, gva, hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, b12);
            ye6.d((Object)gva, (Object)(n42 >> 15 & 0xE));
            final w9f v2 = w9f.v;
            if (zta3 != null) {
                gva.g0(1958829341);
                final igf e2 = R((igf)v, "Leading").E((igf)v2);
                final moe c2 = rj2.c((gx)wab.B, false);
                final int hashCode2 = Long.hashCode(gva.T);
                final e3h i = gva.l();
                final igf b14 = ien.B(gva, e2);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n45);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c2);
                k8e.P((zta)z, gva, i);
                oz1.v(hashCode2, gva, b13, gva);
                k8e.P((zta)y, gva, b14);
                smk.w(n28 >> 15 & 0xE, zta3, gva, true, false);
            }
            else {
                gva.g0(1959075357);
                gva.q(false);
            }
            if (zta4 != null) {
                gva.g0(1959118075);
                final igf e3 = R((igf)v, "Trailing").E((igf)v2);
                final moe c3 = rj2.c((gx)wab.B, false);
                final int hashCode3 = Long.hashCode(gva.T);
                final e3h j = gva.l();
                final igf b15 = ien.B(gva, e3);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n45);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c3);
                k8e.P((zta)z, gva, j);
                oz1.v(hashCode3, gva, b13, gva);
                k8e.P((zta)y, gva, b15);
                smk.w(n28 >> 18 & 0xE, zta4, gva, true, false);
            }
            else {
                gva.g0(1959366013);
                gva.q(false);
            }
            final float z2 = omo.z(dng, qzc);
            final float y2 = omo.y(dng, qzc);
            float n46 = z2;
            if (zta3 != null && (n46 = z2 - e0) < 0.0f) {
                n46 = 0.0f;
            }
            float n47 = y2;
            if (zta4 != null && (n47 = y2 - e0) < 0.0f) {
                n47 = 0.0f;
            }
            if (zta5 != null) {
                gva.g0(1960069992);
                final igf y3 = omo.Y(b.y(b.h(R((igf)v, "Prefix"), 24.0f, 0.0f, 2), (lb2)null, 3), n46, 0.0f, 2.0f, 0.0f, 10);
                final moe c4 = rj2.c((gx)x, false);
                final int hashCode4 = Long.hashCode(gva.T);
                final e3h k = gva.l();
                final igf b16 = ien.B(gva, y3);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n45);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c4);
                k8e.P((zta)z, gva, k);
                oz1.v(hashCode4, gva, b13, gva);
                k8e.P((zta)y, gva, b16);
                smk.w(n28 >> 21 & 0xE, zta5, gva, true, false);
            }
            else {
                gva.g0(1960397693);
                gva.q(false);
            }
            if (zta6 != null) {
                gva.g0(1960440938);
                final igf y4 = omo.Y(b.y(b.h(R((igf)v, "Suffix"), 24.0f, 0.0f, 2), (lb2)null, 3), 2.0f, 0.0f, n47, 0.0f, 10);
                final moe c5 = rj2.c((gx)x, false);
                final int hashCode5 = Long.hashCode(gva.T);
                final e3h m = gva.l();
                final igf b17 = ien.B(gva, y4);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n45);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c5);
                k8e.P((zta)z, gva, m);
                oz1.v(hashCode5, gva, b13, gva);
                k8e.P((zta)y, gva, b17);
                smk.w(n28 >> 24 & 0xE, zta6, gva, true, false);
            }
            else {
                gva.g0(1960766717);
                gva.q(false);
            }
            final igf y5 = b.y(b.h((igf)v, 24.0f, 0.0f, 2), (lb2)null, 3);
            if (zta5 != null) {
                n46 = 0.0f;
            }
            if (zta6 != null) {
                n47 = 0.0f;
            }
            final igf y6 = omo.Y(y5, n46, 0.0f, n47, 0.0f, 10);
            if (bua != null) {
                gva.g0(1961136702);
                bua.h(R((igf)v, "Hint").E(y6), gva, n28 >> 6 & 0x70);
                gva.q(false);
            }
            else {
                gva.g0(1961227997);
                gva.q(false);
            }
            final igf e4 = h0(R((igf)v, "TextField"), charSequence, zta5 != null || zta6 != null).E(y6);
            final moe c6 = rj2.c((gx)x, true);
            final int hashCode6 = Long.hashCode(gva.T);
            final e3h l2 = gva.l();
            final igf b18 = ien.B(gva, e4);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n45);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, c6);
            k8e.P((zta)z, gva, l2);
            oz1.v(hashCode6, gva, b13, gva);
            k8e.P((zta)y, gva, b18);
            ge9.A(n28 >> 3 & 0xE, zta, gva, true);
            if (zta2 != null) {
                gva.g0(1962015552);
                final boolean b19 = n44 == 32 || ((n42 & 0x40) != 0x0 && gva.h((Object)oin));
                final Object r2 = gva.R();
                Object o;
                if (b19 || (o = r2) == a) {
                    o = new wfk((Object)oin, (byte)14);
                    gva.q0(o);
                }
                final igf e5 = R(b.y(lq6.W((igf)v, (bua)new ytl((jta)o, (byte)1)), (lb2)null, 3), "Label").E((igf)v);
                final moe c7 = rj2.c((gx)x, false);
                final int hashCode7 = Long.hashCode(gva.T);
                final e3h l3 = gva.l();
                final igf b20 = ien.B(gva, e5);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n45);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c7);
                k8e.P((zta)z, gva, l3);
                oz1.v(hashCode7, gva, b13, gva);
                k8e.P((zta)y, gva, b20);
                smk.w(n28 >> 12 & 0xE, zta2, gva, true, false);
            }
            else {
                gva.g0(1962412445);
                gva.q(false);
            }
            if (zta7 != null) {
                gva.g0(1962460960);
                final igf t = omo.T(b.y(b.h(R((igf)v, "Supporting"), 16.0f, 0.0f, 2), (lb2)null, 3), (dng)new hng(16.0f, 4.0f, 16.0f, 0.0f));
                final moe c8 = rj2.c((gx)x, false);
                final int hashCode8 = Long.hashCode(gva.T);
                final e3h l4 = gva.l();
                final igf b21 = ien.B(gva, t);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n45);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c8);
                k8e.P((zta)z, gva, l4);
                oz1.v(hashCode8, gva, b13, gva);
                k8e.P((zta)y, gva, b21);
                smk.w(n42 >> 18 & 0xE, zta7, gva, true, false);
            }
            else {
                gva.g0(1962796349);
                gva.q(false);
            }
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new hin(zta, charSequence, bua, zta2, zta3, zta4, zta5, zta6, b, riq, oin, oin2, oin3, lta, ye6, zta7, dng, n, n2);
        }
    }
    
    public static final void j(final xom xom, final ihn ihn, final boolean b, final boolean b2, final boolean b3, final boolean b4, final efo efo, final mnn mnn, final mnn mnn2, final bua bua, final gva gva, final int n) {
        final r1 a = efo.a;
        final ksg d = efo.d;
        final n10 f = n10.F;
        final Integer value = 0;
        gva.i0(376119213);
        int n2;
        if (gva.f((Object)xom)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)ihn)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.g(b)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.g(b2)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        int n6;
        if (gva.g(b3)) {
            n6 = 16384;
        }
        else {
            n6 = 8192;
        }
        int n7;
        if (gva.g(b4)) {
            n7 = 131072;
        }
        else {
            n7 = 65536;
        }
        int n8;
        if (gva.f((Object)efo)) {
            n8 = 1048576;
        }
        else {
            n8 = 524288;
        }
        int n9;
        if (gva.f((Object)mnn)) {
            n9 = 8388608;
        }
        else {
            n9 = 4194304;
        }
        int n10;
        if (gva.f((Object)mnn2)) {
            n10 = 67108864;
        }
        else {
            n10 = 33554432;
        }
        int n11;
        if (gva.h((Object)bua)) {
            n11 = 536870912;
        }
        else {
            n11 = 268435456;
        }
        final int n12 = n | n2 | n3 | n4 | n5 | n6 | n7 | n8 | n9 | n10 | n11;
        if (gva.W(n12 & 0x1, (n12 & 0x12492493) != 0x12492492)) {
            final Object r = gva.R();
            final cib a2 = bi6.a;
            min min;
            if ((min = (min)r) == a2) {
                min = new min();
                gva.q0((Object)min);
            }
            final min min2 = min;
            long n13;
            if (!b) {
                n13 = ihn.z;
            }
            else if (b2) {
                n13 = ihn.A;
            }
            else if (b3) {
                n13 = ihn.x;
            }
            else {
                n13 = ihn.y;
            }
            zeo u;
            if (b4) {
                gva.g0(-601510006);
                long c;
                final long n14 = c = mnn.c();
                if (b4) {
                    if (n14 != 16L) {
                        c = n14;
                    }
                    else {
                        c = n13;
                    }
                }
                long c2;
                final long n15 = c2 = mnn2.c();
                if (b4) {
                    if (n15 != 16L) {
                        c2 = n15;
                    }
                    else {
                        c2 = n13;
                    }
                }
                final d0f d0f = new d0f(zrn.X(4, gva), (byte)4);
                final edc edc = (edc)d.getValue();
                gva.g0(-759924327);
                final int[] a3 = nin.a;
                long n16;
                if (a3[((Enum)edc).ordinal()] == 1) {
                    n16 = c;
                }
                else {
                    n16 = c2;
                }
                gva.q(false);
                final u86 e = j86.e(n16);
                final boolean f2 = gva.f((Object)e);
                Object r2 = gva.R();
                if (f2 || r2 == a2) {
                    r2 = new elo(f, new k10(e, (byte)3));
                    gva.q0(r2);
                }
                final dlo dlo = (dlo)r2;
                final int n17 = (((n12 >> 18 & 0xE) | 0x180) & 0xE) | 0xC00;
                Object o = null;
                Label_0854: {
                    if (!efo.h()) {
                        gva.g0(1666573488);
                        final boolean b5 = (((n17 & 0xE) ^ 0x6) > 4 && gva.f((Object)efo)) || (n17 & 0x6) == 0x4;
                        o = gva.R();
                        while (true) {
                            if (!b5 && o != a2) {
                                break Label_0746;
                            }
                            final r7m a4 = q7m.a();
                            Label_0812: {
                                Label_0766: {
                                    if (a4 != null) {
                                        o = a4.e();
                                        break Label_0766;
                                    }
                                    o = null;
                                    break Label_0766;
                                    break Label_0812;
                                }
                                final r7m b6 = q7m.b(a4);
                                try {
                                    final Object i = a.i();
                                    q7m.d(a4, b6, (lta)o);
                                    gva.q0(i);
                                    o = i;
                                    continue;
                                    gva.q(false);
                                    break Label_0854;
                                }
                                finally {
                                    q7m.d(a4, b6, (lta)o);
                                }
                            }
                            break;
                        }
                    }
                    gva.g0(1666827533);
                    gva.q(false);
                    o = a.i();
                }
                final edc edc2 = (edc)o;
                gva.g0(-759924327);
                long n18;
                if (a3[((Enum)edc2).ordinal()] == 1) {
                    n18 = c;
                }
                else {
                    n18 = c2;
                }
                final j86 e2 = a6l.e(gva, false, n18);
                final int n19 = n17 & 0xE;
                final int n20 = n19 ^ 0x6;
                boolean b7 = false;
                Label_0956: {
                    if (n20 <= 4 || !gva.f((Object)efo)) {
                        if ((n17 & 0x6) != 0x4) {
                            b7 = false;
                            break Label_0956;
                        }
                    }
                    b7 = true;
                }
                final Object r3 = gva.R();
                Object b8;
                if (b7 || (b8 = r3) == a2) {
                    b8 = r8m.b((jta)new dp4(efo, (byte)18));
                    gva.q0(b8);
                }
                final edc edc3 = (edc)((xom)b8).getValue();
                gva.g0(-759924327);
                if (a3[((Enum)edc3).ordinal()] != 1) {
                    c = c2;
                }
                final Object o2 = a6l.e(gva, false, c);
                final boolean b9 = (n20 > 4 && gva.f((Object)efo)) || (n17 & 0x6) == 0x4;
                final Object r4 = gva.R();
                Object b10;
                if (b9 || (b10 = r4) == a2) {
                    b10 = r8m.b((jta)new dp4(efo, (byte)19));
                    gva.q0(b10);
                }
                u = xp7.u(efo, e2, o2, (bfa)d0f.h(((xom)b10).getValue(), (Object)gva, (Object)value), dlo, gva, n19 | 0x30000);
                gva.q(false);
            }
            else {
                gva.g0(-601031335);
                gva.q(false);
                u = null;
            }
            final min min3 = min2;
            final n10 n21 = f;
            final d0f d0f2 = new d0f(zrn.X(4, gva), (byte)5);
            final edc edc4 = (edc)d.getValue();
            gva.g0(1139343725);
            gva.q(false);
            Object o3 = j86.e(n13);
            final boolean f3 = gva.f(o3);
            final Object r5 = gva.R();
            dlo dlo2;
            if (f3 || (dlo2 = (dlo)r5) == a2) {
                dlo2 = new elo(n21, new k10(o3, (byte)3));
                gva.q0((Object)dlo2);
            }
            final dlo dlo3 = dlo2;
            final int n22 = (((n12 >> 18 & 0xE) | 0x180) & 0xE) | 0xC00;
            Object o4 = null;
            Label_1555: {
                if (!efo.h()) {
                    gva.g0(1666573488);
                    final boolean b11 = (((n22 & 0xE) ^ 0x6) > 4 && gva.f((Object)efo)) || (n22 & 0x6) == 0x4;
                    o4 = gva.R();
                    while (true) {
                        if (!b11 && o4 != a2) {
                            break Label_1450;
                        }
                        o3 = q7m.a();
                        Label_1513: {
                            Label_1476: {
                                if (o3 != null) {
                                    o4 = ((r7m)o3).e();
                                    break Label_1476;
                                }
                                o4 = null;
                                break Label_1476;
                                break Label_1513;
                            }
                            final Object o2 = q7m.b((r7m)o3);
                            try {
                                final Object j = a.i();
                                q7m.d((r7m)o3, (r7m)o2, (lta)o4);
                                gva.q0(j);
                                o4 = j;
                                continue;
                                gva.q(false);
                                break Label_1555;
                            }
                            finally {
                                q7m.d((r7m)o3, (r7m)o2, (lta)o4);
                            }
                        }
                        break;
                    }
                }
                gva.g0(1666827533);
                gva.q(false);
                o4 = a.i();
            }
            final edc edc5 = (edc)o4;
            gva.g0(1139343725);
            gva.q(false);
            final j86 j2 = new j86(n13);
            final int n23 = n22 & 0xE;
            final int n24 = n23 ^ 0x6;
            boolean b12 = false;
            Label_1641: {
                if (n24 <= 4 || !gva.f((Object)efo)) {
                    if ((n22 & 0x6) != 0x4) {
                        b12 = false;
                        break Label_1641;
                    }
                }
                b12 = true;
            }
            final Object r6 = gva.R();
            Object b13;
            if (b12 || (b13 = r6) == a2) {
                b13 = r8m.b((jta)new dp4(efo, (byte)14));
                gva.q0(b13);
            }
            final edc edc6 = (edc)((xom)b13).getValue();
            gva.g0(1139343725);
            boolean b14 = false;
            gva.q(false);
            final j86 j3 = new j86(n13);
            if ((n24 > 4 && gva.f((Object)efo)) || (n22 & 0x6) == 0x4) {
                b14 = true;
            }
            final Object r7 = gva.R();
            Object b15;
            if (b14 || (b15 = r7) == a2) {
                b15 = r8m.b((jta)new dp4(efo, (byte)15));
                gva.q0(b15);
            }
            final zeo u2 = xp7.u(efo, j2, j3, (bfa)d0f2.h(((xom)b15).getValue(), (Object)gva, (Object)value), dlo3, gva, n23 | 0x30000);
            float floatValue;
            if (xom != null) {
                floatValue = ((Number)xom.getValue()).floatValue();
            }
            else {
                floatValue = 1.0f;
            }
            final hcm a5 = mnn2.a;
            final hcm a6 = mnn.a;
            final oln d2 = icm.d;
            final oln x = nsk.x(a5.a, a6.a, floatValue);
            final una una = (una)icm.b((Object)a5.f, (Object)a6.f, floatValue);
            final long c3 = icm.c(floatValue, a5.b, a6.b);
            zoa zoa;
            if ((zoa = a5.c) == null) {
                zoa = zoa.A;
            }
            zoa zoa2;
            if ((zoa2 = a6.c) == null) {
                zoa2 = zoa.A;
            }
            final zoa f4 = jlq.f(zoa, zoa2, floatValue);
            final soa soa = (soa)icm.b((Object)a5.d, (Object)a6.d, floatValue);
            final toa toa = (toa)icm.b((Object)a5.e, (Object)a6.e, floatValue);
            final String s = (String)icm.b((Object)a5.g, (Object)a6.g, floatValue);
            final long c4 = icm.c(floatValue, a5.h, a6.h);
            final zw1 k = a5.i;
            float a7;
            if (k != null) {
                a7 = k.a;
            }
            else {
                a7 = 0.0f;
            }
            final zw1 l = a6.i;
            float a8;
            if (l != null) {
                a8 = l.a;
            }
            else {
                a8 = 0.0f;
            }
            final float g = rjq.g(a7, a8, floatValue);
            final tln m = a5.j;
            tln c5 = tln.c;
            tln tln = m;
            if (m == null) {
                tln = c5;
            }
            final tln j4 = a6.j;
            if (j4 != null) {
                c5 = j4;
            }
            final tln p12 = vjq.p(tln, c5, floatValue);
            final jpd jpd = (jpd)icm.b((Object)a5.k, (Object)a6.k, floatValue);
            final long v = t08.V(floatValue, a5.l, a6.l);
            final wgn wgn = (wgn)icm.b((Object)a5.m, (Object)a6.m, floatValue);
            final rpl n25 = a5.n;
            final rpl n26 = a6.n;
            rpl rpl;
            if (n25 == null && n26 == null) {
                rpl = null;
            }
            else {
                rpl rpl2;
                if (n25 == null) {
                    n26.getClass();
                    rpl2 = p5r.i(new rpl(n26.c, j86.b(0.0f, n26.a), n26.b), n26, floatValue);
                }
                else if (n26 == null) {
                    rpl2 = p5r.i(n25, new rpl(n25.c, j86.b(0.0f, n25.a), n25.b), floatValue);
                }
                else {
                    rpl2 = p5r.i(n25, n26, floatValue);
                }
                rpl = rpl2;
            }
            final nbh o5 = a5.o;
            final nbh o6 = a6.o;
            nbh a9;
            if (o5 == null && o6 == null) {
                a9 = null;
            }
            else if ((a9 = o5) == null) {
                a9 = nbh.a;
            }
            final hcm hcm = new hcm(x, c3, f4, soa, toa, una, s, c4, new zw1(g), p12, jpd, v, wgn, rpl, a9, (dw8)icm.b((Object)a5.p, (Object)a6.p, floatValue));
            final mrg b16 = mnn2.b;
            final mrg b17 = mnn.b;
            final int b18 = nrg.b;
            final int a10 = ((kfn)icm.b((Object)new kfn(b16.a), (Object)new kfn(b17.a), floatValue)).a;
            final int a11 = ((ahn)icm.b((Object)new ahn(b16.b), (Object)new ahn(b17.b), floatValue)).a;
            final long c6 = icm.c(floatValue, b16.c, b17.c);
            vln vln;
            if ((vln = b16.d) == null) {
                vln = vln.c;
            }
            vln vln2;
            if ((vln2 = b17.d) == null) {
                vln2 = vln.c;
            }
            final vln p13 = xjq.p(vln, vln2, floatValue);
            final fbh e3 = b16.e;
            final fbh e4 = b17.e;
            fbh fbh;
            if (e3 == null && e4 == null) {
                fbh = null;
            }
            else {
                final fbh c7 = fbh.c;
                if ((fbh = e3) == null) {
                    fbh = c7;
                }
                final boolean a12 = fbh.a;
                fbh fbh2;
                if ((fbh2 = e4) == null) {
                    fbh2 = c7;
                }
                final boolean a13 = fbh2.a;
                if (a12 != a13) {
                    fbh = new fbh(((v79)icm.b((Object)new v79(fbh.b), (Object)new v79(fbh2.b), floatValue)).a, (boolean)icm.b((Object)a12, (Object)a13, floatValue));
                }
            }
            mnn a14 = new mnn(hcm, new mrg(a10, a11, c6, p13, fbh, (idd)icm.b((Object)b16.f, (Object)b17.f, floatValue), ((icd)icm.b((Object)new icd(b16.g), (Object)new icd(b17.g), floatValue)).a, ((mxb)icm.b((Object)new mxb(b16.h), (Object)new mxb(b17.h), floatValue)).a, (ymn)icm.b((Object)b16.i, (Object)b17.i, floatValue)));
            if (b4) {
                u.getClass();
                a14 = mnn.a(a14, ((j86)u.E.getValue()).a, 0L, (zoa)null, (soa)null, (una)null, 0L, (wgn)null, 0, 0L, (idd)null, 0, 16777214);
            }
            k(((j86)u2.E.getValue()).a, a14, (zta)uuj.t0(57043598, (aua)new etj((Object)bua, (Object)min3, (byte)28), gva), gva, 384);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new q23(xom, ihn, b, b2, b3, b4, efo, mnn, mnn2, bua, n);
        }
    }
    
    public static final void k(final long n, final mnn mnn, final zta zta, final gva gva, final int n2) {
        gva.i0(396611577);
        int n3;
        if (gva.e(n)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.f((Object)mnn)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        int n6;
        final int n5 = n6 = (n3 | n2 | n4);
        if ((n2 & 0x180) == 0x0) {
            int n7;
            if (gva.h((Object)zta)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n5 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            ien.f(n, mnn, zta, gva, n6 & 0x3FE);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new iin(n, mnn, zta, n2);
        }
    }
    
    public static final void l(final long n, final zta zta, final gva gva, final int n2) {
        gva.i0(590397809);
        int n3;
        if (gva.e(n)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.h((Object)zta)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        final int n5 = n3 | n2 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x13) != 0x12)) {
            c5q.c(ge9.n(n, dx6.a), zta, gva, (n5 & 0x70) | 0x8);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new gin(n, zta, n2);
        }
    }
    
    public static final void m(final zta zta, final CharSequence charSequence, final zta zta2, final bua bua, final zta zta3, final zta zta4, final zta zta5, final zta zta6, final boolean b, final riq riq, final oin oin, final oin oin2, final oin oin3, final ye6 ye6, final zta zta7, final dng dng, final gva gva, final int n, final int n2) {
        final mb2 b2 = wab.B;
        final mb2 x = wab.x;
        gva.i0(908032139);
        final fgf v = fgf.v;
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)v)) {
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
        final int n5 = 16;
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
        final int n8 = 128;
        int n9 = n6;
        if ((n & 0x180) == 0x0) {
            int n10;
            if (gva.h((Object)charSequence)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n9 = (n6 | n10);
        }
        final int n11 = 1024;
        int n12 = n9;
        if ((n & 0xC00) == 0x0) {
            int n13;
            if (gva.h((Object)zta2)) {
                n13 = 2048;
            }
            else {
                n13 = 1024;
            }
            n12 = (n9 | n13);
        }
        final int n14 = 8192;
        int n15 = n12;
        if ((n & 0x6000) == 0x0) {
            int n16;
            if (gva.h((Object)bua)) {
                n16 = 16384;
            }
            else {
                n16 = 8192;
            }
            n15 = (n12 | n16);
        }
        final int n17 = 65536;
        int n18 = n15;
        if ((n & 0x30000) == 0x0) {
            int n19;
            if (gva.h((Object)zta3)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 = (n15 | n19);
        }
        final int n20 = 524288;
        int n21 = n18;
        if ((n & 0x180000) == 0x0) {
            int n22;
            if (gva.h((Object)zta4)) {
                n22 = 1048576;
            }
            else {
                n22 = 524288;
            }
            n21 = (n18 | n22);
        }
        int n23 = n21;
        if ((n & 0xC00000) == 0x0) {
            int n24;
            if (gva.h((Object)zta5)) {
                n24 = 8388608;
            }
            else {
                n24 = 4194304;
            }
            n23 = (n21 | n24);
        }
        int n25 = n23;
        if ((n & 0x6000000) == 0x0) {
            int n26;
            if (gva.h((Object)zta6)) {
                n26 = 67108864;
            }
            else {
                n26 = 33554432;
            }
            n25 = (n23 | n26);
        }
        int n27 = n25;
        if ((n & 0x30000000) == 0x0) {
            int n28;
            if (gva.g(b)) {
                n28 = 536870912;
            }
            else {
                n28 = 268435456;
            }
            n27 = (n25 | n28);
        }
        int n30;
        if ((n2 & 0x6) == 0x0) {
            int n29;
            if (gva.f((Object)riq)) {
                n29 = 4;
            }
            else {
                n29 = 2;
            }
            n30 = (n2 | n29);
        }
        else {
            n30 = n2;
        }
        int n31 = n30;
        if ((n2 & 0x30) == 0x0) {
            boolean b3;
            if ((n2 & 0x40) == 0x0) {
                b3 = gva.f((Object)oin);
            }
            else {
                b3 = gva.h((Object)oin);
            }
            int n32 = n5;
            if (b3) {
                n32 = 32;
            }
            n31 = (n30 | n32);
        }
        int n33 = n31;
        if ((n2 & 0x180) == 0x0) {
            boolean b4;
            if ((n2 & 0x200) == 0x0) {
                b4 = gva.f((Object)oin2);
            }
            else {
                b4 = gva.h((Object)oin2);
            }
            int n34 = n8;
            if (b4) {
                n34 = 256;
            }
            n33 = (n31 | n34);
        }
        int n35 = n33;
        if ((n2 & 0xC00) == 0x0) {
            boolean b5;
            if ((n2 & 0x1000) == 0x0) {
                b5 = gva.f((Object)oin3);
            }
            else {
                b5 = gva.h((Object)oin3);
            }
            int n36 = n11;
            if (b5) {
                n36 = 2048;
            }
            n35 = (n33 | n36);
        }
        if ((n2 & 0x6000) == 0x0) {
            int n37 = n14;
            if (gva.h((Object)ye6)) {
                n37 = 16384;
            }
            n35 |= n37;
        }
        if ((n2 & 0x30000) == 0x0) {
            int n38 = n17;
            if (gva.h((Object)zta7)) {
                n38 = 131072;
            }
            n35 |= n38;
        }
        int n39 = n35;
        if ((n2 & 0x180000) == 0x0) {
            int n40 = n20;
            if (gva.f((Object)dng)) {
                n40 = 1048576;
            }
            n39 = (n35 | n40);
        }
        if (gva.W(n27 & 0x1, (n27 & 0x12492493) != 0x12492492 || (0x92493 & n39) != 0x92492)) {
            final float t = T(gva);
            final boolean b6 = (n27 & 0x70000000) == 0x20000000;
            final boolean b7 = (n39 & 0xE) == 0x4;
            final int n41 = n39 & 0x70;
            final boolean b8 = n41 == 32 || ((n39 & 0x40) != 0x0 && gva.f((Object)oin));
            final boolean b9 = (n39 & 0x380) == 0x100 || ((n39 & 0x200) != 0x0 && gva.f((Object)oin2));
            final boolean b10 = (n39 & 0x1C00) == 0x800 || ((n39 & 0x1000) != 0x0 && gva.f((Object)oin3));
            final boolean b11 = (0x380000 & n39) == 0x100000;
            final boolean c = gva.c(t);
            Object r = gva.R();
            final cib a = bi6.a;
            if ((b11 | (b6 | b7 | b8 | b9 | b10) | c) || r == a) {
                r = new ljn(b, riq, oin, oin2, oin3, dng, t);
                gva.q0(r);
            }
            final ljn ljn = (ljn)r;
            final qzc qzc = (qzc)gva.j((sei)hm6.n);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b12 = ien.B(gva, (igf)v);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n42 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n42);
            }
            else {
                gva.t0();
            }
            final rg6 a2 = awp.A;
            k8e.P((zta)a2, gva, ljn);
            final rg6 z = awp.z;
            k8e.P((zta)z, gva, l);
            final rg6 b13 = awp.B;
            k8e.P((zta)b13, gva, hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, b12);
            ye6.d((Object)gva, (Object)(n39 >> 12 & 0xE));
            final w9f v2 = w9f.v;
            if (zta3 != null) {
                gva.g0(-556998400);
                final igf r2 = R((igf)v, "Leading");
                final olb a3 = hic.a;
                final igf e = r2.E((igf)v2);
                final moe c2 = rj2.c((gx)b2, false);
                final int hashCode2 = Long.hashCode(gva.T);
                final e3h i = gva.l();
                final igf b14 = ien.B(gva, e);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n42);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c2);
                k8e.P((zta)z, gva, i);
                oz1.v(hashCode2, gva, b13, gva);
                k8e.P((zta)y, gva, b14);
                smk.w(n27 >> 15 & 0xE, zta3, gva, true, false);
            }
            else {
                gva.g0(-556752384);
                gva.q(false);
            }
            if (zta4 != null) {
                gva.g0(-556709666);
                final igf r3 = R((igf)v, "Trailing");
                final olb a4 = hic.a;
                final igf e2 = r3.E((igf)v2);
                final moe c3 = rj2.c((gx)b2, false);
                final int hashCode3 = Long.hashCode(gva.T);
                final e3h j = gva.l();
                final igf b15 = ien.B(gva, e2);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n42);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c3);
                k8e.P((zta)z, gva, j);
                oz1.v(hashCode3, gva, b13, gva);
                k8e.P((zta)y, gva, b15);
                smk.w(n27 >> 18 & 0xE, zta4, gva, true, false);
            }
            else {
                gva.g0(-556461728);
                gva.q(false);
            }
            final float z2 = omo.z(dng, qzc);
            final float y2 = omo.y(dng, qzc);
            final float e3 = e0(gva);
            float n43 = z2;
            if (zta3 != null && (n43 = z2 - e3) < 0.0f) {
                n43 = 0.0f;
            }
            float n44 = y2;
            if (zta4 != null && (n44 = y2 - e3) < 0.0f) {
                n44 = 0.0f;
            }
            if (zta5 != null) {
                gva.g0(-555685333);
                final igf y3 = omo.Y(b.y(b.h(R((igf)v, "Prefix"), 24.0f, 0.0f, 2), (lb2)null, 3), n43, 0.0f, 2.0f, 0.0f, 10);
                final moe c4 = rj2.c((gx)x, false);
                final int hashCode4 = Long.hashCode(gva.T);
                final e3h k = gva.l();
                final igf b16 = ien.B(gva, y3);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n42);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c4);
                k8e.P((zta)z, gva, k);
                oz1.v(hashCode4, gva, b13, gva);
                k8e.P((zta)y, gva, b16);
                smk.w(n27 >> 21 & 0xE, zta5, gva, true, false);
            }
            else {
                gva.g0(-555357632);
                gva.q(false);
            }
            if (zta6 != null) {
                gva.g0(-555314387);
                final igf y4 = omo.Y(b.y(b.h(R((igf)v, "Suffix"), 24.0f, 0.0f, 2), (lb2)null, 3), 2.0f, 0.0f, n44, 0.0f, 10);
                final moe c5 = rj2.c((gx)x, false);
                final int hashCode5 = Long.hashCode(gva.T);
                final e3h m = gva.l();
                final igf b17 = ien.B(gva, y4);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n42);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c5);
                k8e.P((zta)z, gva, m);
                oz1.v(hashCode5, gva, b13, gva);
                k8e.P((zta)y, gva, b17);
                smk.w(n27 >> 24 & 0xE, zta6, gva, true, false);
            }
            else {
                gva.g0(-554988608);
                gva.q(false);
            }
            final igf y5 = omo.Y((igf)v, n43, 0.0f, n44, 0.0f, 10);
            if (zta2 != null) {
                gva.g0(-554488733);
                final igf r4 = R((igf)v, "Label");
                final boolean b18 = n41 == 32 || ((n39 & 0x40) != 0x0 && gva.h((Object)oin));
                final Object r5 = gva.R();
                Object o;
                if (b18 || (o = r5) == a) {
                    o = new q9m((Object)oin, (byte)15);
                    gva.q0(o);
                }
                final igf e4 = b.y(lq6.W(r4, (bua)new ytl((jta)o, (byte)1)), (lb2)null, 3).E(y5);
                final moe c6 = rj2.c((gx)x, false);
                final int hashCode6 = Long.hashCode(gva.T);
                final e3h l2 = gva.l();
                final igf b19 = ien.B(gva, e4);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n42);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c6);
                k8e.P((zta)z, gva, l2);
                oz1.v(hashCode6, gva, b13, gva);
                k8e.P((zta)y, gva, b19);
                smk.w(n27 >> 9 & 0xE, zta2, gva, true, false);
            }
            else {
                gva.g0(-554091840);
                gva.q(false);
            }
            final igf y6 = b.y(b.h((igf)v, 24.0f, 0.0f, 2), (lb2)null, 3);
            if (zta5 != null) {
                n43 = 0.0f;
            }
            if (zta6 != null) {
                n44 = 0.0f;
            }
            final igf y7 = omo.Y(y6, n43, 0.0f, n44, 0.0f, 10);
            if (bua != null) {
                gva.g0(-553721855);
                bua.h(R((igf)v, "Hint").E(y7), gva, n27 >> 9 & 0x70);
                gva.q(false);
            }
            else {
                gva.g0(-553630560);
                gva.q(false);
            }
            final igf e5 = h0(R((igf)v, "TextField"), charSequence, zta5 != null || zta6 != null).E(y7);
            final moe c7 = rj2.c((gx)x, true);
            final int hashCode7 = Long.hashCode(gva.T);
            final e3h l3 = gva.l();
            final igf b20 = ien.B(gva, e5);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n42);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, c7);
            k8e.P((zta)z, gva, l3);
            oz1.v(hashCode7, gva, b13, gva);
            k8e.P((zta)y, gva, b20);
            ge9.A(n27 >> 3 & 0xE, zta, gva, true);
            if (zta7 != null) {
                gva.g0(-553246997);
                final igf t2 = omo.T(b.y(b.h(R((igf)v, "Supporting"), 16.0f, 0.0f, 2), (lb2)null, 3), (dng)new hng(16.0f, 4.0f, 16.0f, 0.0f));
                final moe c8 = rj2.c((gx)x, false);
                final int hashCode8 = Long.hashCode(gva.T);
                final e3h l4 = gva.l();
                final igf b21 = ien.B(gva, t2);
                gva.k0();
                if (gva.S) {
                    gva.k((jta)n42);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)a2, gva, c8);
                k8e.P((zta)z, gva, l4);
                oz1.v(hashCode8, gva, b13, gva);
                k8e.P((zta)y, gva, b21);
                smk.w(n39 >> 15 & 0xE, zta7, gva, true, false);
            }
            else {
                gva.g0(-552857792);
                gva.q(false);
            }
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new jin(zta, charSequence, zta2, bua, zta3, zta4, zta5, zta6, b, riq, oin, oin2, oin3, ye6, zta7, dng, n, n2);
        }
    }
    
    public static final src n(final jqc jqc, final lta lta) {
        final Object o = new Object();
        final zqc a = jqc.a;
        ((wqc)o).a = a.a;
        ((wqc)o).b = a.f;
        ((wqc)o).c = a.b;
        ((wqc)o).d = a.c;
        ((wqc)o).e = a.e;
        ((wqc)o).f = a.g;
        ((wqc)o).g = a.h;
        ((wqc)o).h = a.k;
        ((wqc)o).i = a.j;
        ((wqc)o).j = a.i;
        ((wqc)o).k = a.d;
        ((wqc)o).l = jqc.b;
        ((wqc)o).m = a.l;
        lta.b(o);
        final boolean e = ((wqc)o).e;
        final String f = ((wqc)o).f;
        boolean v = false;
        if (!e) {
            if (!mlc.q(f, "    ")) {
                en9.s("Indent should not be specified when default printing mode is used");
                return null;
            }
        }
        else if (!mlc.q(f, "    ")) {
            final String f2 = ((wqc)o).f;
            for (int i = 0; i < f2.length(); ++i) {
                final char char1 = f2.charAt(i);
                if (char1 != ' ' && char1 != '\t' && char1 != '\r' && char1 != '\n') {
                    fvd.t((Object)((wqc)o).f, "Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ");
                    return null;
                }
            }
        }
        final zqc zqc = new zqc(((wqc)o).a, ((wqc)o).c, ((wqc)o).d, ((wqc)o).k, ((wqc)o).e, ((wqc)o).b, ((wqc)o).f, ((wqc)o).g, ((wqc)o).j, ((wqc)o).i, ((wqc)o).h, ((wqc)o).m);
        final vee l = ((wqc)o).l;
        final jqc jqc2 = new jqc(zqc, l);
        if (l.equals(a0l.a)) {
            return (src)jqc2;
        }
        final Object o2 = new Object();
        if (zqc.k != 1) {
            v = true;
        }
        ((xs8)o2).v = v;
        l.q((zzk)o2);
        return (src)jqc2;
    }
    
    public static final void o(final igf igf, final v5d v5d, final dng dng, final boolean b, final boolean b2, final gia gia, final boolean b3, final w60 w60, dx dx, jv0 jv0, lb2 lb2, final gv0 gv0, final lta lta, final gva gva, final int n, final int n2, final int n3) {
        gva.i0(924924659);
        int n5;
        if ((n & 0x6) == 0x0) {
            int n4;
            if (gva.f((Object)igf)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n);
        }
        else {
            n5 = n;
        }
        int n6 = n5;
        if ((n & 0x30) == 0x0) {
            int n7;
            if (gva.f((Object)v5d)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        final int n8 = 128;
        int n9 = n6;
        if ((n & 0x180) == 0x0) {
            int n10;
            if (gva.f((Object)dng)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n9 = (n6 | n10);
        }
        final int n11 = 1024;
        int n12 = n9;
        if ((n & 0xC00) == 0x0) {
            int n13;
            if (gva.g(b)) {
                n13 = 2048;
            }
            else {
                n13 = 1024;
            }
            n12 = (n9 | n13);
        }
        int n14 = n12;
        if ((n & 0x6000) == 0x0) {
            int n15;
            if (gva.g(b2)) {
                n15 = 16384;
            }
            else {
                n15 = 8192;
            }
            n14 = (n12 | n15);
        }
        if ((0x30000 & n) == 0x0) {
            int n16;
            if (gva.f((Object)gia)) {
                n16 = 131072;
            }
            else {
                n16 = 65536;
            }
            n14 |= n16;
        }
        int n17 = n14;
        if ((n & 0x180000) == 0x0) {
            int n18;
            if (gva.g(b3)) {
                n18 = 1048576;
            }
            else {
                n18 = 524288;
            }
            n17 = (n14 | n18);
        }
        int n19 = n17;
        if ((n & 0xC00000) == 0x0) {
            int n20;
            if (gva.f((Object)w60)) {
                n20 = 8388608;
            }
            else {
                n20 = 4194304;
            }
            n19 = (n17 | n20);
        }
        int n21 = n19;
        if ((n & 0x6000000) == 0x0) {
            n21 = (n19 | 0x2000000);
        }
        final int n22 = n3 & 0x200;
        int n23;
        if (n22 != 0) {
            n23 = (n21 | 0x30000000);
        }
        else {
            n23 = n21;
            if ((n & 0x30000000) == 0x0) {
                int n24;
                if (gva.f((Object)dx)) {
                    n24 = 536870912;
                }
                else {
                    n24 = 268435456;
                }
                n23 = (n21 | n24);
            }
        }
        final int n25 = n3 & 0x400;
        int n26;
        if (n25 != 0) {
            n26 = (n2 | 0x6);
        }
        else if ((n2 & 0x6) == 0x0) {
            int n27;
            if (gva.f((Object)jv0)) {
                n27 = 4;
            }
            else {
                n27 = 2;
            }
            n26 = (n2 | n27);
        }
        else {
            n26 = n2;
        }
        final int n28 = n3 & 0x800;
        if (n28 != 0) {
            n26 |= 0x30;
        }
        else if ((n2 & 0x30) == 0x0) {
            int n29;
            if (gva.f((Object)lb2)) {
                n29 = 32;
            }
            else {
                n29 = 16;
            }
            n26 |= n29;
        }
        final int n30 = n3 & 0x1000;
        if (n30 != 0) {
            n26 |= 0x180;
        }
        else if ((n2 & 0x180) == 0x0) {
            int n31 = n8;
            if (gva.f((Object)gv0)) {
                n31 = 256;
            }
            n26 |= n31;
        }
        int n33;
        if ((n2 & 0xC00) == 0x0) {
            int n32 = n11;
            if (gva.h((Object)lta)) {
                n32 = 2048;
            }
            n33 = (n26 | n32);
        }
        else {
            n33 = n26;
        }
        final int n34 = 1;
        lb2 lb4;
        gv0 gv4;
        if (gva.W(n23 & 0x1, (n23 & 0x12492493) != 0x12492492 || (n33 & 0x493) != 0x492)) {
            gva.b0();
            final def def = null;
            int n35 = 0;
            gv0 gv3 = null;
            jv0 jv4 = null;
            Label_0878: {
                dx dx2;
                jv0 jv2;
                if ((n & 0x1) != 0x0 && !gva.C()) {
                    gva.Z();
                    n35 = (n23 & 0xF1FFFFFF);
                    dx2 = dx;
                    jv2 = jv0;
                }
                else {
                    final int n36 = n23 & 0xF1FFFFFF;
                    if (n22 != 0) {
                        dx = null;
                    }
                    jv0 jv3;
                    if (n25 != 0) {
                        jv3 = null;
                    }
                    else {
                        jv3 = jv0;
                    }
                    lb2 lb3;
                    if (n28 != 0) {
                        lb3 = null;
                    }
                    else {
                        lb3 = lb2;
                    }
                    n35 = n36;
                    jv2 = jv3;
                    dx2 = dx;
                    lb2 = lb3;
                    if (n30 != 0) {
                        final gv0 gv2 = null;
                        lb2 = lb3;
                        gv3 = gv2;
                        jv4 = jv3;
                        n35 = n36;
                        break Label_0878;
                    }
                }
                gv3 = gv0;
                jv4 = jv2;
                dx = dx2;
            }
            gva.r();
            final int n37 = n35 >> 3;
            final int n38 = n37 & 0xE;
            final int n39 = (n33 >> 6 & 0x70) | n38;
            final bnf w61 = o50.W(lta, gva);
            final boolean b4 = (((n39 & 0xE) ^ 0x6) > 4 && gva.f((Object)v5d)) || (n39 & 0x6) == 0x4;
            Object r = gva.R();
            final cib a = bi6.a;
            if (b4 || r == a) {
                final Object o = new Object();
                ((j3d)o).a = new hsg(Integer.MAX_VALUE);
                ((j3d)o).b = new hsg(Integer.MAX_VALUE);
                final awp h = awp.H;
                final ny1 ny1 = new ny1(w61, (byte)15);
                final tze a2 = r8m.a;
                r = new bkc((Object)new sd8((jta)new qn1((Object)new sd8((jta)ny1, (q8m)h), (Object)v5d, o, (byte)16), (q8m)h), (Class)xom.class, "value", "getValue()Ljava/lang/Object;", 0, (byte)1);
                gva.q0(r);
            }
            final ytc ytc = (ytc)r;
            final int n40 = n35 >> 9;
            final int n41 = n38 | (n40 & 0x70);
            final boolean b5 = (((n41 & 0xE) ^ 0x6) > 4 && gva.f((Object)v5d)) || (n41 & 0x6) == 0x4;
            final boolean b6 = (((n41 & 0x70) ^ 0x30) > 32 && gva.g(b2)) || (n41 & 0x30) == 0x20;
            final Object r2 = gva.R();
            Object o2;
            if ((b6 | b5) || (o2 = r2) == a) {
                o2 = new u4d(v5d, b2);
                gva.q0(o2);
            }
            final s4d s4d = (s4d)o2;
            Object o3;
            if ((o3 = gva.R()) == a) {
                o3 = mlc.z((hc7)o89.v, gva);
                gva.q0(o3);
            }
            final oc7 oc7 = (oc7)o3;
            final d6b d6b = (d6b)gva.j((sei)hm6.g);
            def a3 = def;
            if (!(boolean)gva.j((sei)hm6.y)) {
                a3 = trm.a;
            }
            final int n42 = n35 & 0x70;
            final int n43 = n33 << 18;
            final int n44 = (n35 & 0xFFF0) | (n40 & 0x380000) | (n43 & 0x1C00000) | (n43 & 0xE000000) | (n33 << 27 & 0x70000000);
            final boolean b7 = (((n44 & 0x70) ^ 0x30) > 32 && gva.f((Object)v5d)) || (n44 & 0x30) == 0x20;
            final boolean b8 = (((n44 & 0x380) ^ 0x180) > 256 && gva.f((Object)dng)) || (n44 & 0x180) == 0x100;
            final boolean b9 = (((n44 & 0x1C00) ^ 0xC00) > 2048 && gva.g(b)) || (n44 & 0xC00) == 0x800;
            final boolean b10 = (((0xE000 & n44) ^ 0x6000) > 16384 && gva.g(b2)) || (n44 & 0x6000) == 0x4000;
            final boolean d = gva.d(0);
            final boolean b11 = (((n44 & 0x380000) ^ 0x180000) > 1048576 && gva.f((Object)dx)) || (n44 & 0x180000) == 0x100000;
            final boolean b12 = (((n44 & 0x1C00000) ^ 0xC00000) > 8388608 && gva.f((Object)lb2)) || (n44 & 0xC00000) == 0x800000;
            final boolean b13 = (((n44 & 0xE000000) ^ 0x6000000) > 67108864 && gva.f((Object)gv3)) || (n44 & 0x6000000) == 0x4000000;
            final boolean b14 = (((n44 & 0x70000000) ^ 0x30000000) > 536870912 && gva.f((Object)jv4)) || (n44 & 0x30000000) == 0x20000000;
            final boolean f = gva.f((Object)d6b);
            final boolean f2 = gva.f((Object)a3);
            final Object r3 = gva.R();
            Object o4;
            if (!(b14 | (b8 | b7 | b9 | b10 | d | b11 | b12 | b13) | f | f2) && r3 != a) {
                o4 = r3;
            }
            else {
                o4 = new k5d(v5d, b2, dng, b, ytc, jv4, gv3, oc7, d6b, a3, dx, lb2);
                gva.q0(o4);
            }
            final e4d e4d = (e4d)o4;
            zhg zhg;
            if (b2) {
                zhg = zhg.v;
            }
            else {
                zhg = zhg.w;
            }
            Object o5;
            if (b3) {
                gva.g0(-2077147368);
                final boolean b15 = (((n37 & 0xE) ^ 0x6) > 4 && gva.f((Object)v5d)) || (n37 & 0x6) == 0x4;
                final boolean d2 = gva.d(0);
                final Object r4 = gva.R();
                z4d z4d;
                if ((b15 | d2) || (z4d = (z4d)r4) == a) {
                    z4d = new z4d(v5d);
                    gva.q0((Object)z4d);
                }
                o5 = qt7.K((r3d)z4d, v5d.p, b, zhg);
                gva.q(false);
            }
            else {
                gva.g0(-2076718545);
                gva.q(false);
                o5 = fgf.v;
            }
            int n45;
            if (n42 == 32) {
                n45 = n34;
            }
            else {
                n45 = 0;
            }
            final Object r5 = gva.R();
            Object o6;
            if (n45 != 0 || (o6 = r5) == a) {
                o6 = new r94(v5d, (byte)3);
                gva.q0(o6);
            }
            yi2.e((jta)ytc, mlc.h0(rhc.H(k8e.z(igf.E((igf)v5d.m).E((igf)v5d.n), ytc, s4d, zhg, b3, b).E((igf)o5), v5d.o), (mgk)v5d, zhg, w60, b3, b, gia, v5d.g, (yl2)o50.V(b, b2, (jta)o6, gva, n40 & 0x7E)), v5d.q, e4d, gva, 0);
            lb4 = lb2;
            gv4 = gv3;
            jv0 = jv4;
        }
        else {
            gva.Z();
            lb4 = lb2;
            gv4 = gv0;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new e5d(igf, v5d, dng, b, b2, gia, b3, w60, dx, jv0, lb4, gv4, lta, n, n2, n3);
        }
    }
    
    public static final void p(final lta lta, final gva gva, final int n) {
        gva.i0(286839309);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        while (true) {
            Label_0270: {
                if (!gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
                    gva.Z();
                    break Label_0270;
                }
                final odk a = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a);
                final Object r = gva.R();
                final cib a2 = bi6.a;
                Object o;
                if ((f | f2) || (o = r) == a2) {
                    o = a.d((Class)c51.class, (emi)null);
                    gva.q0(o);
                }
                final c51 c51 = (c51)o;
                final bnf w = o50.W(lta, gva);
                final CodeArtifactViewerParams codeArtifactViewerParams = (CodeArtifactViewerParams)c51.h.getValue();
                if (codeArtifactViewerParams != null) {
                    final boolean f3 = gva.f((Object)c51);
                    final boolean f4 = gva.f((Object)w);
                    final Object r2 = gva.R();
                    Object o2;
                    if ((f3 | f4) || (o2 = r2) == a2) {
                        o2 = new hi4((Object)c51, (Object)w, (f07)null, (byte)2);
                        gva.q0(o2);
                    }
                    mlc.f((zta)o2, gva, codeArtifactViewerParams);
                    break Label_0270;
                }
                final b0j v = gva.v();
                if (v == null) {
                    return;
                }
                final v65 v2 = new v65((byte)0, n, lta);
                final b0j b0j = v;
                final v65 d = v2;
                b0j.d = (zta)d;
                return;
            }
            final b0j v3 = gva.v();
            if (v3 != null) {
                final v65 d = new v65((byte)1, n, lta);
                final b0j b0j = v3;
                continue;
            }
            break;
        }
    }
    
    public static String q(final String s) {
        return hia.k("data:", s, ";charset=utf-8;base64,");
    }
    
    public static final r86 r(final lx4 lx4) {
        final long p = lx4.p;
        final long e = lx4.e;
        final long h = lx4.H;
        final long d = lx4.d;
        final long a = m86.a;
        final long s = lx4.s;
        final long p2 = lx4.P;
        final long b = m86.b;
        final long t = lx4.t;
        final long q = lx4.q;
        final long o = lx4.O;
        final long q2 = lx4.Q;
        final int i = j86.i;
        final long b2 = j86.b;
        final long x = lx4.x;
        return new r86(e, h, d, h, a, a, a, s, p2, a, b, t, p2, q, o, p, o, p, q2, b2, o, p, a, a, a, a, x, x, b2, p, p, p, p, p, p, p, a, a, b, b, a, a, b, b, a, a, b, b);
    }
    
    public static final boolean s(Object value) {
        if (value instanceof o8m) {
            final o8m o8m = (o8m)value;
            if (o8m.c() != cib.A && o8m.c() != def.D && o8m.c() != awp.H) {
                return false;
            }
            value = ((xom)o8m).getValue();
            if (value != null) {
                return s(value);
            }
        }
        else {
            if (value instanceof aua && value instanceof Serializable) {
                return false;
            }
            for (int i = 0; i < 7; ++i) {
                if (ao2.w[i].isInstance(value)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static void t(final String s, final boolean b) {
        if (b) {
            return;
        }
        en9.s(s);
    }
    
    public static void u(final boolean b) {
        if (b) {
            return;
        }
        fvd.w();
    }
    
    public static void v(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format(s, array));
    }
    
    public static void w(final Handler handler) {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name;
            if (myLooper != null) {
                name = myLooper.getThread().getName();
            }
            else {
                name = "null current looper";
            }
            final String name2 = handler.getLooper().getThread().getName();
            final StringBuilder sb = new StringBuilder(String.valueOf((Object)name).length() + (String.valueOf((Object)name2).length() + 35) + 1);
            oz1.A(sb, "Must be called on ", name2, " thread, but got ", name);
            c2.g(sb, (Object)".");
        }
    }
    
    public static void x(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        en9.s("Given String is empty or null");
    }
    
    public static void y(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        en9.s(s2);
    }
    
    public static void z(final Object o) {
        if (o != null) {
            return;
        }
        fvd.k("null reference");
    }
}
