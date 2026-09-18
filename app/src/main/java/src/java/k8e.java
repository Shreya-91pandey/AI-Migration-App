import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.io.File;
import android.os.Build$VERSION;
import android.content.Context;
import com.anthropic.claude.api.chat.InputMode;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.draw.a;
import java.util.List;
import java.time.ZonedDateTime;
import java.util.Map;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.Map$Entry;
import java.util.Set;
import java.util.Iterator;
import com.anthropic.claude.api.chat.MessageSender;
import com.anthropic.claude.types.strings.MessageId;
import java.util.ArrayList;
import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import com.google.gson.JsonIOException;
import java.io.EOFException;

public abstract class k8e
{
    public static final b5c a;
    public static final Object b;
    public static boolean c;
    public static int d;
    
    public static final fz6 A(final wo8 wo8) {
        return ien.a(uuj.s0((hc7)omo.o(), (hc7)((y38)wo8).a()));
    }
    
    public static irc B(final isc isc) {
        boolean b;
        try {
            try {
                isc.Y();
                b = false;
                try {
                    return (irc)nmo.z.b(isc);
                }
                catch (final EOFException ex) {}
            }
            catch (final NumberFormatException ex2) {
                throw new RuntimeException((Throwable)ex2);
            }
            catch (final IOException ex3) {
                throw new JsonIOException((Exception)ex3);
            }
            catch (final MalformedJsonException ex4) {
                throw new RuntimeException((Throwable)ex4);
            }
        }
        catch (final EOFException ex) {
            b = true;
        }
        if (b) {
            return (irc)xrc.v;
        }
        final EOFException ex;
        throw new RuntimeException((Throwable)ex);
    }
    
    public static final void C(final gva gva) {
        gva.b((zta)new dtk((byte)17), (Object)lqo.a);
    }
    
    public static final a1e D(final rhc rhc, final lta lta, final gva gva, final int n) {
        o50.W(rhc, gva);
        final bnf w = o50.W(lta, gva);
        final Object r = gva.R();
        final cib a = bi6.a;
        Object o = r;
        if (r == a) {
            o = new y5((byte)4);
            gva.q0(o);
        }
        final String s = (String)mlc.a0(new Object[0], (jta)o, gva, 48);
        final te a2 = iod.a(gva);
        if (a2 != null) {
            final ee6 p4 = a2.p();
            Object r2;
            if ((r2 = gva.R()) == a) {
                r2 = new Object();
                gva.q0(r2);
            }
            final le le = (le)r2;
            Object r3;
            if ((r3 = gva.R()) == a) {
                r3 = new a1e(le);
                gva.q0(r3);
            }
            final a1e a1e = (a1e)r3;
            final boolean h = gva.h((Object)le);
            final boolean h2 = gva.h((Object)p4);
            final boolean f = gva.f((Object)s);
            final boolean h3 = gva.h((Object)rhc);
            final boolean f2 = gva.f((Object)w);
            Object r4 = gva.R();
            if ((h | h2 | f | h3 | f2) || r4 == a) {
                r4 = new qe((Object)le, (Object)p4, (Object)s, (Object)rhc, (Object)w, (byte)0);
                gva.q0(r4);
            }
            mlc.c(p4, s, rhc, (lta)r4, gva);
            return a1e;
        }
        en9.q("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        return null;
    }
    
    public static final d4j E(final Object a, final gva gva) {
        Object r;
        if ((r = gva.R()) == bi6.a) {
            r = new Object();
            ((d4j)r).a = a;
            gva.q0(r);
        }
        return (d4j)r;
    }
    
    public static final mnn F(final mnn mnn, final qzc qzc) {
        final hcm a = mnn.a;
        final oln d = icm.d;
        oln oln = a.a;
        if (oln.equals(nln.a)) {
            oln = icm.d;
        }
        final long b = a.b;
        final wnn[] b2 = vnn.b;
        long a2 = b;
        if ((b & 0xFF00000000L) == 0x0L) {
            a2 = icm.a;
        }
        zoa zoa;
        if ((zoa = a.c) == null) {
            zoa = zoa.A;
        }
        final soa d2 = a.d;
        int a3;
        if (d2 != null) {
            a3 = d2.a;
        }
        else {
            a3 = 0;
        }
        final soa soa = new soa(a3);
        final toa e = a.e;
        int a4;
        if (e != null) {
            a4 = e.a;
        }
        else {
            a4 = 65535;
        }
        final toa toa = new toa(a4);
        Object o;
        if ((o = a.f) == null) {
            o = una.v;
        }
        String g;
        if ((g = a.g) == null) {
            g = "";
        }
        long n;
        if (((n = a.h) & 0xFF00000000L) == 0x0L) {
            n = icm.b;
        }
        final zw1 i = a.i;
        final float n2 = 0.0f;
        float a5;
        if (i != null) {
            a5 = i.a;
        }
        else {
            a5 = 0.0f;
        }
        if (Float.isNaN(a5)) {
            a5 = n2;
        }
        final zw1 zw1 = new zw1(a5);
        tln tln;
        if ((tln = a.j) == null) {
            tln = tln.c;
        }
        jpd jpd;
        if ((jpd = a.k) == null) {
            final jpd x = jpd.x;
            jpd = zah.a.v();
        }
        long n3 = a.l;
        if (n3 == 16L) {
            n3 = icm.c;
        }
        wgn wgn;
        if ((wgn = a.m) == null) {
            wgn = wgn.b;
        }
        rpl rpl;
        if ((rpl = a.n) == null) {
            rpl = rpl.d;
        }
        final nbh o2 = a.o;
        Object o3;
        if ((o3 = a.p) == null) {
            o3 = gea.a;
        }
        final hcm hcm = new hcm(oln, a2, zoa, soa, toa, (una)o, g, n, zw1, tln, jpd, n3, wgn, rpl, o2, (dw8)o3);
        final mrg b3 = mnn.b;
        final int b4 = nrg.b;
        final int a6 = b3.a;
        int n4 = 5;
        int n5;
        if ((n5 = a6) == 0) {
            n5 = 5;
        }
        final int b5 = b3.b;
        if (b5 == 3) {
            final int ordinal = ((Enum)qzc).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    en9.r();
                    return null;
                }
            }
            else {
                n4 = 4;
            }
        }
        else if ((n4 = b5) == 0) {
            final int ordinal2 = ((Enum)qzc).ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    en9.r();
                    return null;
                }
                n4 = 2;
            }
            else {
                n4 = 1;
            }
        }
        long n6;
        if (((n6 = b3.c) & 0xFF00000000L) == 0x0L) {
            n6 = nrg.a;
        }
        vln vln;
        if ((vln = b3.d) == null) {
            vln = vln.c;
        }
        final fbh e2 = b3.e;
        final idd f = b3.f;
        int n7;
        if ((n7 = b3.g) == 0) {
            n7 = icd.b;
        }
        int h;
        if ((h = b3.h) == 0) {
            h = 1;
        }
        ymn ymn;
        if ((ymn = b3.i) == null) {
            ymn = ymn.c;
        }
        return new mnn(hcm, new mrg(n5, n4, n6, vln, e2, f, n7, h, ymn), mnn.c);
    }
    
    public static int G(final double n) {
        if (Double.isNaN(n)) {
            en9.s("Cannot round NaN value.");
            return 0;
        }
        if (n > 2.147483647E9) {
            return Integer.MAX_VALUE;
        }
        if (n < -2.147483648E9) {
            return Integer.MIN_VALUE;
        }
        return (int)Math.round(n);
    }
    
    public static int H(final float n) {
        if (!Float.isNaN(n)) {
            return Math.round(n);
        }
        en9.s("Cannot round NaN value.");
        return 0;
    }
    
    public static long I(final double n) {
        if (!Double.isNaN(n)) {
            return Math.round(n);
        }
        en9.s("Cannot round NaN value.");
        return 0L;
    }
    
    public static final igf J(final igf igf, final boolean b, final llf llf, final a8c a8c, final boolean b2, final iuj iuj, final jta jta) {
        Object o;
        if (a8c != null) {
            o = new zok(b, llf, a8c, false, b2, iuj, jta);
        }
        else if (a8c == null) {
            o = new zok(b, llf, (a8c)null, false, b2, iuj, jta);
        }
        else {
            final fgf v = fgf.v;
            if (llf != null) {
                o = w7c.a((igf)v, llf, a8c).E((igf)new zok(b, llf, (a8c)null, false, b2, iuj, jta));
            }
            else {
                o = ien.l((igf)v, (bua)new bpk(a8c, b, b2, iuj, (aua)jta, (byte)0));
            }
        }
        return igf.E((igf)o);
    }
    
    public static igf K(final igf igf, final boolean b, boolean b2, iuj iuj, final jta jta, final int n) {
        if ((n & 0x2) != 0x0) {
            b2 = true;
        }
        if ((n & 0x4) != 0x0) {
            iuj = null;
        }
        return igf.E((igf)new zok(b, (llf)null, (a8c)null, true, b2, iuj, jta));
    }
    
    public static l7f L(final String s, final String s2, final mko mko, final qtk qtk, final int n, String s3, ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason, String s4, boolean b, int size) {
        if ((size & 0x20) != 0x0) {
            s3 = null;
        }
        if ((size & 0x40) != 0x0) {
            chatEvents$RetryCompletionReason = null;
        }
        if ((size & 0x80) != 0x0) {
            s4 = null;
        }
        boolean b2 = false;
        if ((size & 0x100) != 0x0) {
            b = false;
        }
        final String a = mko.c().a();
        final boolean b3 = mko instanceof lko;
        final String b4 = mko.c().b();
        final boolean d = qtk.d();
        size = ((ArrayList)mko.c().c()).size();
        final boolean g = qtk.g();
        final String c = qtk.c();
        final boolean f = qtk.f();
        final Long e = qtk.e();
        final be1 a2 = qtk.a();
        if (o2r.h(mko) != null) {
            b2 = true;
        }
        return new l7f(s, s2, a, n, b3, b4, d, size, s3, chatEvents$RetryCompletionReason, s4, b, g, c, f, e, a2, b2, qtk.b());
    }
    
    public static final jvk M(final i27 i27, final bwk bwk, final boolean b) {
        final int t = o47.t((Object)bwk);
        if (t != 0) {
            if (t == 1) {
                return N(i27, ((zvk)bwk).f(), b);
            }
            en9.r();
            return null;
        }
        else {
            final String c = ((awk)bwk).c();
            final u6f u6f = (u6f)oz1.j(c, i27.a);
            if (u6f != null && u6f.i) {
                return (jvk)ivk.a;
            }
            return O(c);
        }
    }
    
    public static final jvk N(final i27 i27, final kko kko, final boolean b) {
        final d4h a = i27.a;
        final pko b2 = kko.b();
        final int n = o47.n(b2);
        final ivk a2 = ivk.a;
        if (n != 0) {
            final String s = null;
            if (n == 1) {
                if (b) {
                    final String a3 = ((nko)b2).a();
                    if (a3 != null) {
                        MessageId.Companion.getClass();
                        if (!a3.equals("00000000-0000-4000-8000-000000000000")) {
                            final u6f u6f = (u6f)oz1.j(a3, a);
                            if (u6f == null) {
                                return (jvk)a2;
                            }
                            if (u6f.i) {
                                return (jvk)a2;
                            }
                            if (u6f.c == MessageSender.w) {
                                final Iterator iterator = new h27((Object)i27, (Object)a3, (byte)0).iterator();
                                while (true) {
                                    Object next;
                                    do {
                                        final rbn rbn = (rbn)iterator;
                                        if (!rbn.hasNext()) {
                                            next = null;
                                            u6f u6f2 = (u6f)next;
                                            String a4 = s;
                                            if (u6f2 != null) {
                                                Label_0211: {
                                                    if (!u6f2.i && !u6f2.f) {
                                                        final Set a5 = qsm.a;
                                                        if (!qsm.d(u6f2.g)) {
                                                            break Label_0211;
                                                        }
                                                    }
                                                    u6f2 = null;
                                                }
                                                a4 = s;
                                                if (u6f2 != null) {
                                                    a4 = u6f2.a;
                                                }
                                            }
                                            return O(a4);
                                        }
                                        next = rbn.next();
                                    } while (((u6f)next).c != MessageSender.x);
                                    continue;
                                }
                            }
                            return (jvk)new gvk(u6f.a);
                        }
                    }
                    return O(a3);
                }
                return (jvk)a2;
            }
            en9.r();
            return null;
        }
        else {
            final String b3 = ((oko)b2).b();
            final u6f u6f3 = (u6f)oz1.j(b3, a);
            if (u6f3 != null && u6f3.i) {
                return (jvk)a2;
            }
            return O(b3);
        }
    }
    
    public static final jvk O(final String s) {
        if (s == null) {
            return (jvk)ivk.a;
        }
        MessageId.Companion.getClass();
        if (s.equals("00000000-0000-4000-8000-000000000000")) {
            return (jvk)hvk.a;
        }
        return (jvk)new gvk(s);
    }
    
    public static final void P(final zta zta, final gva gva, final Object o) {
        if (!gva.S && mlc.q(gva.R(), o)) {
            return;
        }
        gva.q0(o);
        gva.b(zta, o);
    }
    
    public static final ArrayList Q(final dlf dlf) {
        final Iterable iterable = (Iterable)((Map)dlf.l()).entrySet();
        final ArrayList list = new ArrayList();
        for (final Object next : iterable) {
            if (((gko)((Map$Entry)next).getValue()).t != null) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList();
        for (final Map$Entry map$Entry : list) {
            final MessageId messageId = (MessageId)map$Entry.getKey();
            final String a = messageId.a;
            final l7f c = ((gko)map$Entry.getValue()).c();
            Object o;
            if (c != null) {
                o = new yog((Object)messageId, (Object)new MessageId(c.d()));
            }
            else {
                o = null;
            }
            if (o != null) {
                list2.add(o);
            }
        }
        return list2;
    }
    
    public static final void R(final zta zta, final gva gva, final Object o) {
        final boolean s = gva.S;
        if (s || !mlc.q(gva.R(), o)) {
            gva.q0(o);
            if (!s) {
                gva.b(zta, o);
            }
        }
    }
    
    public static void S(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                en9.s(smk.p(n2, "negative size: "));
                return;
            }
            s = r2r.s("%s (%s) must be less than size (%s)", new Object[] { "index", n, n2 });
        }
        else {
            s = r2r.s("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void T(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return;
        }
        en9.j(V(n, n2, "index"));
    }
    
    public static void U(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = r2r.s("end index (%s) must not be less than start index (%s)", new Object[] { n2, n });
            }
            else {
                s = V(n2, n3, "end index");
            }
        }
        else {
            s = V(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static String V(final int n, final int n2, final String s) {
        if (n < 0) {
            return r2r.s("%s (%s) must not be negative", new Object[] { s, n });
        }
        if (n2 >= 0) {
            return r2r.s("%s (%s) must not be greater than size (%s)", new Object[] { s, n, n2 });
        }
        en9.s(smk.p(n2, "negative size: "));
        return null;
    }
    
    public static final void a(final og0 og0, final mnn mnn, final igf igf, final kfn kfn, final int n, final int n2, final int n3, final gva gva, final int n4) {
        gva.i0(1212636396);
        int n5;
        if (gva.f((Object)og0)) {
            n5 = 4;
        }
        else {
            n5 = 2;
        }
        int n6;
        if (gva.f((Object)mnn)) {
            n6 = 32;
        }
        else {
            n6 = 16;
        }
        int n7;
        if (gva.f((Object)kfn)) {
            n7 = 2048;
        }
        else {
            n7 = 1024;
        }
        final int n8 = n4 | n5 | n6 | n7;
        if (gva.W(n8 & 0x1, (0x92493 & n8) != 0x92492)) {
            final mb2 b = wab.B;
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new h74((byte)18);
                gva.q0(r);
            }
            vt4.b(og0, igf, (lta)r, (gx)b, "BlurDissolveText", null, uuj.t0(-977883704, (aua)new ej4(kfn, n3, n2, n, mnn), gva), gva, (n8 & 0xE) | 0x186DB0, 32);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new fj4(og0, mnn, igf, kfn, n, n2, n3, n4);
        }
    }
    
    public static final void b(final boolean b, final boolean b2, final igf igf, final gva gva, final int n) {
        gva.i0(-1243391027);
        int n2;
        if (gva.g(b)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.g(b2)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.f((Object)igf)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n | n2 | n3 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            final kb2 k = wab.K;
            final def e = t08.e;
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new d44((byte)19);
                gva.q0(r);
            }
            final igf b3 = wsk.b((lta)r, igf, true);
            final v96 a = u96.a((jv0)e, (dx)k, gva, 54);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b4 = ien.B(gva, b3);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            P((zta)awp.A, gva, a);
            P((zta)awp.z, gva, l);
            P((zta)awp.B, gva, hashCode);
            C(gva);
            P((zta)awp.y, gva, b4);
            final lh0 j0 = lh0.J0;
            final cy4 a2 = qy4.a;
            final long o = qy4.a(gva).O;
            final fgf v = fgf.v;
            o50.e(j0, null, b.p((igf)v, 43.0f), null, o, gva, 432, 8);
            x90.l(gva, b.f((igf)v, 11.0f));
            int n6;
            if (b) {
                n6 = 2131757220;
            }
            else if (b2) {
                n6 = 2131757221;
            }
            else {
                n6 = 2131757219;
            }
            final vmn vmn = new vmn(new hcm(qy4.a(gva).Q, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, (wgn)null, (rpl)null, 65534), (hcm)null, 14);
            String a3;
            if (b) {
                a3 = "https://privacy.claude.com/articles/10023580";
            }
            else {
                a3 = a6l.a(7);
            }
            lmn.c(t9r.e(n6, lq6.X(a3), vmn, new CharSequence[0], gva, 0, 0), (igf)null, qy4.a(gva).Q, 0L, 0L, new kfn(3), 0L, 0, false, 0, 0, (Map)null, (lta)null, (mnn)((uy4)qy4.c(gva).k.v).H, gva, 0, 0, 261114);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new dj4(b, b2, igf, n);
        }
    }
    
    public static final void c(final hm4 hm4, final og0 og0, final igf igf, final py4 py4, final gva gva, final int n) {
        gva.i0(1772919549);
        int n2;
        if (gva.f((Object)hm4)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)og0)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int ordinal;
        if (py4 == null) {
            ordinal = -1;
        }
        else {
            ordinal = ((Enum)py4).ordinal();
        }
        int n4;
        if (gva.d(ordinal)) {
            n4 = 2048;
        }
        else {
            n4 = 1024;
        }
        final int n5 = n | n2 | n3 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x493) != 0x492)) {
            final kb2 k = wab.K;
            final def e = t08.e;
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new yp7((byte)17);
                gva.q0(r);
            }
            final igf b = wsk.b((lta)r, igf, true);
            final v96 a = u96.a((jv0)e, (dx)k, gva, 54);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, b);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            P((zta)awp.A, gva, a);
            P((zta)awp.z, gva, l);
            P((zta)awp.B, gva, hashCode);
            C(gva);
            P((zta)awp.y, gva, b2);
            c5q.c(zsl.b.a((Object)gva.j((sei)im4.a)), (zta)uuj.t0(-1068556665, (aua)new ah0((Object)hm4, (Object)py4, (byte)4), gva), gva, 48);
            final fgf v = fgf.v;
            x90.l(gva, androidx.compose.foundation.layout.b.f((igf)v, 11.0f));
            final og0 v2 = qt7.V(og0, 4);
            final cy4 a2 = qy4.a;
            a(v2, (mnn)((uy4)qy4.c(gva).k.v).w, androidx.compose.foundation.layout.b.d((igf)v, 1.0f), new kfn(3), 2, 4, 2, gva, 1794432);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new cj4((byte)0, n, (Object)hm4, (Object)og0, (Object)igf, (Object)py4);
        }
    }
    
    public static final void d(final hm4 hm4, final ZonedDateTime zonedDateTime, final String s, final List list, final boolean b, final List list2, final lta lta, final boolean b2, final boolean b3, final boolean b4, final boolean b5, igf v, String s2, py4 v2, final gva gva, final int n, final int n2, final int n3) {
        gva.i0(461761023);
        int n4;
        if (gva.f((Object)hm4)) {
            n4 = 4;
        }
        else {
            n4 = 2;
        }
        int n5;
        if (gva.h((Object)zonedDateTime)) {
            n5 = 32;
        }
        else {
            n5 = 16;
        }
        int n6 = n4 | n | n5;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.f((Object)s)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 |= n7;
        }
        final int n8 = 2048;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.f((Object)list)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n6 |= n9;
        }
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.g(b)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n6 |= n10;
        }
        int n11 = n6;
        if ((n & 0x30000) == 0x0) {
            int n12;
            if (gva.f((Object)list2)) {
                n12 = 131072;
            }
            else {
                n12 = 65536;
            }
            n11 = (n6 | n12);
        }
        int n13 = n11;
        if ((n & 0x180000) == 0x0) {
            int n14;
            if (gva.h((Object)lta)) {
                n14 = 1048576;
            }
            else {
                n14 = 524288;
            }
            n13 = (n11 | n14);
        }
        int n15 = n13;
        if ((n & 0xC00000) == 0x0) {
            int n16;
            if (gva.g(b2)) {
                n16 = 8388608;
            }
            else {
                n16 = 4194304;
            }
            n15 = (n13 | n16);
        }
        int n17 = n15;
        if ((n & 0x6000000) == 0x0) {
            int n18;
            if (gva.g(b3)) {
                n18 = 67108864;
            }
            else {
                n18 = 33554432;
            }
            n17 = (n15 | n18);
        }
        int n19 = n17;
        if ((n & 0x30000000) == 0x0) {
            int n20;
            if (gva.g(b4)) {
                n20 = 536870912;
            }
            else {
                n20 = 268435456;
            }
            n19 = (n17 | n20);
        }
        int n22;
        if ((n2 & 0x6) == 0x0) {
            int n21;
            if (gva.g(b5)) {
                n21 = 4;
            }
            else {
                n21 = 2;
            }
            n22 = (n2 | n21);
        }
        else {
            n22 = n2;
        }
        final int n23 = n3 & 0x800;
        if (n23 != 0) {
            n22 |= 0x30;
        }
        else if ((n2 & 0x30) == 0x0) {
            int n24;
            if (gva.f((Object)v)) {
                n24 = 32;
            }
            else {
                n24 = 16;
            }
            n22 |= n24;
        }
        final int n25 = n3 & 0x1000;
        int n26;
        if (n25 != 0) {
            n26 = (n22 | 0x180);
        }
        else {
            int n27;
            if (gva.f((Object)s2)) {
                n27 = 256;
            }
            else {
                n27 = 128;
            }
            n26 = (n22 | n27);
        }
        final int n28 = n3 & 0x2000;
        int n29;
        if (n28 != 0) {
            n29 = (n26 | 0xC00);
        }
        else {
            int ordinal;
            if (v2 == null) {
                ordinal = -1;
            }
            else {
                ordinal = ((Enum)v2).ordinal();
            }
            int n30;
            if (gva.d(ordinal)) {
                n30 = n8;
            }
            else {
                n30 = 1024;
            }
            n29 = (n26 | n30);
        }
        final boolean b6 = true;
        String s3;
        py4 py5;
        if (gva.W(n19 & 0x1, (n19 & 0x12492493) != 0x12492492 || (n29 & 0x493) != 0x492)) {
            if (n23 != 0) {
                v = (igf)fgf.v;
            }
            if (n25 != 0) {
                s2 = null;
            }
            if (n28 != 0) {
                v2 = py4.v;
            }
            omo.g(b2 && s2 == null && b6, null, ri2.I0(300, 0, null, 6), "HeadlineCrossfade", uuj.t0(-1305770400, (aua)new zi4(b4, b3, v, s2, zonedDateTime, s, list, hm4, v2, list2, b5, b, lta), gva), gva, 28032, 2);
            final py4 py4 = v2;
            s3 = s2;
            py5 = py4;
        }
        else {
            gva.Z();
            final String s4 = s2;
            py5 = v2;
            s3 = s4;
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new aj4(hm4, zonedDateTime, s, list, b, list2, lta, b2, b3, b4, b5, v, s3, py5, n, n2, n3);
        }
    }
    
    public static final void e(final o4c o4c, final igf igf, final gva gva, final int n) {
        f((xog)ljq.T(o4c, gva), null, igf, (gx)wab.B, (by6)zx6.b, 1.0f, null, gva, 0x38 | (n & 0x380), 0);
    }
    
    public static final void f(final xog xog, final String s, igf igf, gx b, by6 b2, float n, he2 he2, final gva gva, final int n2, final int n3) {
        gva.i0(1142754848);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            boolean b3;
            if ((n2 & 0x8) == 0x0) {
                b3 = gva.f((Object)xog);
            }
            else {
                b3 = gva.h((Object)xog);
            }
            int n4;
            if (b3) {
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
            if (gva.f((Object)s)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        final int n8 = n3 & 0x4;
        int n11 = 0;
        Label_0179: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x180);
            }
            else {
                n9 = n6;
                if ((n2 & 0x180) == 0x0) {
                    int n10;
                    if (gva.f((Object)igf)) {
                        n10 = 256;
                    }
                    else {
                        n10 = 128;
                    }
                    n11 = (n6 | n10);
                    break Label_0179;
                }
            }
            n11 = n9;
        }
        final int n12 = n3 & 0x8;
        int n15 = 0;
        Label_0248: {
            int n13;
            if (n12 != 0) {
                n13 = (n11 | 0xC00);
            }
            else {
                n13 = n11;
                if ((n2 & 0xC00) == 0x0) {
                    int n14;
                    if (gva.f((Object)b)) {
                        n14 = 2048;
                    }
                    else {
                        n14 = 1024;
                    }
                    n15 = (n11 | n14);
                    break Label_0248;
                }
            }
            n15 = n13;
        }
        final int n16 = n3 & 0x10;
        int n19 = 0;
        Label_0318: {
            int n17;
            if (n16 != 0) {
                n17 = (n15 | 0x6000);
            }
            else {
                n17 = n15;
                if ((n2 & 0x6000) == 0x0) {
                    int n18;
                    if (gva.f((Object)b2)) {
                        n18 = 16384;
                    }
                    else {
                        n18 = 8192;
                    }
                    n19 = (n15 | n18);
                    break Label_0318;
                }
            }
            n19 = n17;
        }
        final int n20 = n3 & 0x20;
        int n23 = 0;
        Label_0388: {
            int n21;
            if (n20 != 0) {
                n21 = (n19 | 0x30000);
            }
            else {
                n21 = n19;
                if ((0x30000 & n2) == 0x0) {
                    int n22;
                    if (gva.c(n)) {
                        n22 = 131072;
                    }
                    else {
                        n22 = 65536;
                    }
                    n23 = (n19 | n22);
                    break Label_0388;
                }
            }
            n23 = n21;
        }
        final int n24 = n3 & 0x40;
        int n25;
        if (n24 != 0) {
            n25 = (n23 | 0x180000);
        }
        else {
            n25 = n23;
            if ((0x180000 & n2) == 0x0) {
                int n26;
                if (gva.f((Object)he2)) {
                    n26 = 1048576;
                }
                else {
                    n26 = 524288;
                }
                n25 = (n23 | n26);
            }
        }
        if (gva.W(n25 & 0x1, (n25 & 0x92493) != 0x92492)) {
            Object o = fgf.v;
            if (n8 != 0) {
                igf = (igf)o;
            }
            if (n12 != 0) {
                b = (gx)wab.B;
            }
            if (n16 != 0) {
                b2 = (by6)zx6.b;
            }
            if (n20 != 0) {
                n = 1.0f;
            }
            if (n24 != 0) {
                he2 = null;
            }
            final cib a = bi6.a;
            if (s != null) {
                gva.g0(1899222916);
                final boolean b4 = (n25 & 0x70) == 0x20;
                final Object r = gva.R();
                Object o2;
                if (b4 || (o2 = r) == a) {
                    o2 = new jy4(s, (byte)5);
                    gva.q0(o2);
                }
                o = wsk.b((lta)o2, (igf)o, false);
                gva.q(false);
            }
            else {
                gva.g0(1899381698);
                gva.q(false);
            }
            final igf a2 = androidx.compose.ui.draw.a.a(rml.l(igf.E((igf)o)), xog, b, b2, n, he2, 2);
            Object o3;
            if ((o3 = gva.R()) == a) {
                o3 = qj2.e;
                gva.q0(o3);
            }
            final moe moe = (moe)o3;
            final int hashCode = Long.hashCode(gva.T);
            final igf b5 = ien.B(gva, a2);
            final e3h l = gva.l();
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            P((zta)awp.A, gva, moe);
            P((zta)awp.z, gva, l);
            C(gva);
            P((zta)awp.y, gva, b5);
            P((zta)awp.B, gva, hashCode);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new m2c(xog, s, igf, b, b2, n, he2, n2, n3);
        }
    }
    
    public static final void g(wop wop, final gva gva, final int n) {
        gva.i0(1230650247);
        final int n2 = n | 0x2;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (wop = (wop)r) == a) {
                    wop = (wop)a2.d((Class)wop.class, (emi)null);
                    gva.q0((Object)wop);
                }
                wop = wop;
            }
            gva.r();
            final usi b = wop.b;
            if (((xom)ljq.v((ija)b, b.getValue(), gva, 0, 0)).getValue()) {
                gva.g0(460863287);
                final igf p3 = androidx.compose.foundation.layout.b.p((igf)fgf.v, 0.0f);
                Object r2;
                if ((r2 = gva.R()) == a) {
                    r2 = new shc((byte)11);
                    gva.q0(r2);
                }
                lub.b((lta)r2, p3, (lta)null, gva, 54, 4);
                gva.q(false);
            }
            else {
                gva.g0(460996091);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new l0((Object)wop, n, (byte)16);
        }
    }
    
    public static final void h(final igf igf, final gva gva, final int n) {
        gva.i0(-93309715);
        int n2;
        if (gva.f((Object)igf)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        if (((n2 | n) & 0x3) == 0x2 && gva.F()) {
            gva.Z();
        }
        else {
            gva.g0(-726897071);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = sk0.x;
                gva.q0(o);
            }
            final PointerInputEventHandler pointerInputEventHandler = (PointerInputEventHandler)o;
            gva.q(false);
            rj2.a(p6n.b(igf, (Object)lqo.a, pointerInputEventHandler), gva, 0);
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new k78(igf, n, (byte)0);
        }
    }
    
    public static final void i(final af0 af0, final fp4 fp4, final ye6 ye6, final gva gva, final int n) {
        gva.i0(448840184);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)af0);
            }
            else {
                b = gva.h((Object)af0);
            }
            int n2;
            if (b) {
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
            if (gva.h((Object)fp4)) {
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
            if (gva.h((Object)ye6)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            c5q.c(iwj.a.a(fp4.b), (zta)uuj.t0(938587832, (aua)new up4((Object)ye6, (Object)af0, (Object)fp4, (byte)18), gva), gva, 56);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0(n, (Object)af0, (Object)fp4, (Object)ye6, (byte)11);
        }
    }
    
    public static final void j(final igf igf, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-1854833411);
        int n2;
        if (gva.f((Object)igf)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = qj2.f;
                gva.q0(o);
            }
            final moe moe = (moe)o;
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            P((zta)awp.A, gva, moe);
            P((zta)awp.z, gva, l);
            P((zta)awp.B, gva, hashCode);
            C(gva);
            P((zta)awp.y, gva, b);
            hia.t(6, ye6, gva, true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new txf((Object)igf, (Object)ye6, n, (byte)10);
        }
    }
    
    public static final igf k(final igf igf, final rl2 rl2) {
        return igf.E((igf)new pl2(rl2));
    }
    
    public static final void l(final int n) {
        if (n >= 1) {
            return;
        }
        oyl.g((Object)smk.p(n, "Expected positive parallelism level, but got "));
    }
    
    public static final Object m(final f07 f07, final jja jja, final jta jta, final bua bua, final ija[] array) {
        final ba6 ba6 = new ba6((f07)null, jja, jta, bua, array);
        final mdk mdk = new mdk(f07, f07.getContext());
        final Object m0 = t08.m0(mdk, true, (Object)mdk, (zta)ba6);
        if (m0 == pc7.v) {
            return m0;
        }
        return lqo.a;
    }
    
    public static final kko n(final i27 i27, final dh6 dh6, final InputMode inputMode, final fvk fvk, final yuf yuf) {
        final int v = o47.v(dh6);
        Object o;
        if (v != 0) {
            if (v != 1) {
                en9.r();
                return null;
            }
            o = new oko(((ch6)dh6).a());
        }
        else {
            o = new nko(i27.b);
        }
        return new kko((pko)o, inputMode, fvk, yuf);
    }
    
    public static final mmf o() {
        return new mmf(true);
    }
    
    public static final wna p(final Context context) {
        final g70 g70 = new g70(context);
        int a;
        if (Build$VERSION.SDK_INT >= 31) {
            a = apa.a.a(context);
        }
        else {
            a = 0;
        }
        return new wna(g70, new h70(a));
    }
    
    public static final boolean q(final Context context, final String s) {
        final Object d;
        monitorenter(d = oa.d);
        Label_0186: {
            File file2 = null;
            boolean b = false;
            boolean b2 = false;
            Label_0110: {
                try {
                    final File w = w(context);
                    if (!mlc.O(s)) {
                        throw new IllegalArgumentException("account id must be a single path segment");
                    }
                    final File file = new File(w, "acc_".concat(s));
                    if (!mlc.O(s)) {
                        throw new IllegalArgumentException("id must be a single path segment");
                    }
                    file2 = new File(w, "acc_".concat(kym.z1(16, zn2.D(s))));
                    final boolean exists = file.exists();
                    b = true;
                    if (exists) {
                        if (!bea.e0(file)) {
                            b2 = false;
                            break Label_0110;
                        }
                    }
                }
                finally {
                    break Label_0186;
                }
                b2 = true;
            }
            final boolean b3 = !file2.exists() || bea.e0(file2);
            if (!b2 || !b3) {
                b = false;
            }
            monitorexit(d);
            return b;
        }
        monitorexit(d);
    }
    
    public static ija r(final jp9 jp9, final sej sej, final fu4 fu4) {
        return ri2.p((ija)o50.r((zta)new eh0((Object)jp9, (Object)sej, (Object)new ux8((byte)3), (Object)fu4, (f07)null, (byte)5)), Integer.MAX_VALUE);
    }
    
    public static fcp s(final zrc zrc) {
        Label_0220: {
            Label_0211: {
                Label_0202: {
                    String i = null;
                    int n2 = 0;
                    Boolean value;
                    while (true) {
                    Label_0103:
                        while (true) {
                            int n = 0;
                            Label_0183: {
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
                                    if (!smk.h(n2).equals(j)) {
                                        break Label_0183;
                                    }
                                    final irc o = zrc.o("has_replay");
                                    if (o != null) {
                                        value = o.a();
                                        break;
                                    }
                                }
                                catch (final NullPointerException ex) {
                                    break Label_0202;
                                }
                                catch (final NumberFormatException ex2) {
                                    break Label_0211;
                                }
                                catch (final IllegalStateException ex3) {
                                    break Label_0220;
                                }
                                break Label_0103;
                            }
                            ++n;
                            continue;
                        }
                        value = null;
                        break;
                    }
                    final irc o2 = zrc.o("is_active");
                    Boolean value2;
                    if (o2 != null) {
                        value2 = o2.a();
                    }
                    else {
                        value2 = null;
                    }
                    final irc o3 = zrc.o("sampled_for_replay");
                    Boolean value3;
                    if (o3 != null) {
                        value3 = o3.a();
                    }
                    else {
                        value3 = null;
                    }
                    i.getClass();
                    return new fcp(i, n2, value, value2, value3);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ViewEventSession", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ViewEventSession", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ViewEventSession", (Throwable)ex3);
        return null;
    }
    
    public static ire t(final String s) {
        final c8e d = ire.e.d(0, s);
        if (d != null) {
            final String s2 = (String)((a8e)d.a()).get(1);
            final Locale root = Locale.ROOT;
            final String lowerCase = s2.toLowerCase(root);
            lowerCase.getClass();
            final String lowerCase2 = ((String)((a8e)d.a()).get(2)).toLowerCase(root);
            lowerCase2.getClass();
            final ArrayList list = new ArrayList();
            c8e d2;
            for (int n = ((vgc)d.b()).w; ++n < s.length(); n = ((vgc)d2.b()).w) {
                d2 = ire.f.d(n, s);
                if (d2 == null) {
                    final String substring = s.substring(n);
                    final StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    sb.append(s);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                final b8e c = d2.c;
                final s7e d3 = c.d(1);
                String a;
                if (d3 != null) {
                    a = d3.a;
                }
                else {
                    a = null;
                }
                if (a != null) {
                    final s7e d4 = c.d(2);
                    String a2;
                    if (d4 != null) {
                        a2 = d4.a;
                    }
                    else {
                        a2 = null;
                    }
                    String s3;
                    if (a2 == null) {
                        final s7e d5 = c.d(3);
                        d5.getClass();
                        s3 = d5.a;
                    }
                    else {
                        s3 = a2;
                        if (kym.o1(a2, '\'')) {
                            s3 = a2;
                            if (kym.O0(a2, '\'')) {
                                s3 = a2;
                                if (a2.length() > 2) {
                                    s3 = hia.f(1, 1, a2);
                                }
                            }
                        }
                    }
                    list.add((Object)a);
                    list.add((Object)s3);
                }
            }
            return new ire(s, lowerCase, lowerCase2, (String[])list.toArray((Object[])new String[0]));
        }
        en9.s(smk.n('\"', "No subtype found for: \"", s));
        return null;
    }
    
    public static final KSerializer v(final KSerializer kSerializer) {
        if (kSerializer.getDescriptor().d()) {
            return kSerializer;
        }
        return (KSerializer)new n3g(kSerializer);
    }
    
    public static final File w(final Context context) {
        final File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        final File file = new File(cacheDir, "tmp");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
    
    public static final void x(final gva gva, final Integer n) {
        final rg6 b = awp.B;
        if (gva.S) {
            gva.b((zta)b, (Object)n);
        }
    }
    
    public static final LinkedHashMap y(final yf0... array) {
        int v;
        if ((v = z5e.V(array.length)) < 16) {
            v = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(v);
        for (final yf0 yf0 : array) {
            ((Map)linkedHashMap).put((Object)yf0.a.c, (Object)yf0);
        }
        return linkedHashMap;
    }
    
    public static final igf z(final igf igf, final ytc ytc, final s4d s4d, final zhg zhg, final boolean b, final boolean b2) {
        return igf.E((igf)new v4d((jta)ytc, s4d, zhg, b, b2));
    }
    
    public abstract k2j u();
}
