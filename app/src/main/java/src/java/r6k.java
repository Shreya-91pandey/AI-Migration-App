import android.view.ViewParent;
import android.view.View;
import kotlinx.coroutines.TimeoutCancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Set;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import com.anthropic.claude.app.ClaudeAppDestination$List;
import com.anthropic.claude.app.ClaudeAppDestination$Detail;
import java.text.Normalizer;
import java.text.Normalizer$Form;
import com.anthropic.claude.api.account.Account;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import java.util.Iterator;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import com.anthropic.claude.types.strings.Capability;
import com.anthropic.claude.api.account.Organization;

public abstract class r6k
{
    public static final ye6 a;
    public static final ye6 b;
    public static final ye6 c;
    public static final ye6 d;
    public static final mff e;
    public static final Object f;
    
    public static final boolean A(final Organization organization, final String s) {
        return organization.d.contains((Object)new Capability(s));
    }
    
    public static final String B(String s, final String s2) {
        Object o;
        if (s != null) {
            final List m1 = kym.m1((CharSequence)s, new String[] { " " }, 0, 6);
            final ArrayList list = new ArrayList();
            final Iterator iterator = ((Iterable)m1).iterator();
            while (true) {
                o = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final Object next = iterator.next();
                if (((String)next).length() <= 0) {
                    continue;
                }
                list.add(next);
            }
        }
        else {
            o = null;
        }
        Object v;
        if ((v = o) == null) {
            v = r89.v;
        }
        final ArrayList list2 = new ArrayList();
        for (final Object next2 : v) {
            if (((String)next2).length() > 1) {
                list2.add(next2);
            }
        }
        s = c86.N0((Iterable)c86.l1((Iterable)list2, 2), (CharSequence)"", (String)null, (String)null, (lta)new fy9((byte)3), 30);
        if (s.length() != 0) {
            return s;
        }
        s = (String)c86.I0((List)v);
        if (s != null) {
            s = n(s).toUpperCase(Locale.ROOT);
            s.getClass();
            return s;
        }
        return s2;
    }
    
    public static final void D() {
        throw new IllegalStateException("Invalid applier");
    }
    
    public static final boolean F(final Account account) {
        return account.i && rym.y0(account.b, "@googleapis.com", true);
    }
    
    public static final boolean G(final Object o) {
        return o == um6.a;
    }
    
    public static boolean H(final byte b) {
        return b > -65;
    }
    
    public static final List I(final Object o, final lta lta, final lta lta2) {
        return iw0.W0((Object[])new String[] { (String)lta.b(o), (String)lta2.b(o) });
    }
    
    public static hc7 J(final fc7 fc7, final gc7 gc7) {
        Object v = fc7;
        if (mlc.q(fc7.getKey(), gc7)) {
            v = o89.v;
        }
        return (hc7)v;
    }
    
    public static final boolean K(final v8m v8m, final lta lta) {
        while (true) {
            final Object f = r6k.f;
            synchronized (f) {
                final epm v = v8m.v;
                v.getClass();
                final epm epm = (epm)g8m.f((lpm)v);
                final int d = epm.d;
                final p2 c = epm.c;
                monitorexit(f);
                c.getClass();
                final v4h o = c.o();
                final Object b = lta.b(o);
                final p2 j = o.j();
                if (!mlc.q(j, c)) {
                    final epm v2 = v8m.v;
                    v2.getClass();
                    final Object c2 = g8m.c;
                    synchronized (c2) {
                        final r7m h = g8m.h();
                        final boolean h2 = h((epm)g8m.w((lpm)v2, (jpm)v8m, h), d, j, true);
                        monitorexit(c2);
                        g8m.l(h, (jpm)v8m);
                        if (!h2) {
                            continue;
                        }
                    }
                }
                return (boolean)b;
            }
        }
    }
    
    public static final String L(String s) {
        s = Normalizer.normalize((CharSequence)s, Normalizer$Form.NFC);
        s.getClass();
        s = s.toLowerCase(Locale.ROOT);
        s.getClass();
        return s;
    }
    
    public static final Object M(final Object o, final Object o2) {
        if (o == null) {
            return o2;
        }
        if (o instanceof ArrayList) {
            ((ArrayList)o).add(o2);
            return o;
        }
        final ArrayList list = new ArrayList(4);
        list.add(o);
        list.add(o2);
        return list;
    }
    
    public static void N(final brg brg, final ClaudeAppDestination$Detail claudeAppDestination$Detail, final int n) {
        brg.b((lta)new b61((n & 0x2) == 0x0, (Object)claudeAppDestination$Detail, (byte)8), (zta)new v6e((byte)28));
    }
    
    public static void O(final brg brg, final ClaudeAppDestination$List list) {
        brg.b((lta)new u87((Object)list, (byte)3), (zta)new v6e((byte)28));
    }
    
    public static void P(final brg brg, final ClaudeAppDestination$Detail claudeAppDestination$Detail) {
        brg.b((lta)new erg(claudeAppDestination$Detail, (lta)new drg(claudeAppDestination$Detail, (byte)2), (byte)1), (zta)new v6e((byte)28));
    }
    
    public static final int Q(final lta lta, final lta lta2, final String s, final Object o) {
        final Iterator iterator = ((ArrayList)I(o, lta, lta2)).iterator();
        if (iterator.hasNext()) {
            int s2 = S(s, (String)iterator.next());
            while (iterator.hasNext()) {
                final int s3 = S(s, (String)iterator.next());
                if (s2 > s3) {
                    s2 = s3;
                }
            }
            return s2;
        }
        oyl.r();
        return 0;
    }
    
    public static final int R(final lta lta, final lta lta2, final String s, final Object o) {
        if (Q(lta, lta2, s, o) == 1) {
            final List i = I(o, lta, lta2);
            final ArrayList list = new ArrayList();
            for (final Object next : (ArrayList)i) {
                if (S(s, (String)next) == 1) {
                    list.add(next);
                }
            }
            final Iterator iterator2 = list.iterator();
            if (iterator2.hasNext()) {
                int length = ((String)iterator2.next()).length();
                while (iterator2.hasNext()) {
                    final int length2 = ((String)iterator2.next()).length();
                    if (length > length2) {
                        length = length2;
                    }
                }
                return length;
            }
            oyl.r();
        }
        return 0;
    }
    
    public static final int S(final String obj, String l) {
        l = L(l);
        if (l.equals(obj)) {
            return 0;
        }
        if (rym.E0(l, obj, false)) {
            return 1;
        }
        return 2;
    }
    
    public static final byte[] T(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        j(inputStream, (OutputStream)byteArrayOutputStream);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
    
    public static final l35 U(final p65 p3, final l35 l35, final gva gva) {
        final bnf w = o50.W(p3, gva);
        final bnf w2 = o50.W(l35, gva);
        Object r;
        if ((r = gva.R()) == bi6.a) {
            r = new v01(w, w2);
            gva.q0(r);
        }
        return (l35)r;
    }
    
    public static final eva V(final gva gva) {
        gva.c0(206, ti6.f);
        if (gva.S) {
            y5m.y(gva.I);
        }
        final Object j = gva.J();
        kva kva;
        if (j instanceof kva) {
            kva = (kva)j;
        }
        else {
            kva = null;
        }
        if (kva == null) {
            kva = new kva((f8j)new dva(new eva(gva, gva.T, gva.q, gva.C, gva.h.O)), -1);
            gva.r0((Object)kva);
        }
        final eva v = ((dva)kva.a).v;
        v.f.setValue((Object)gva.l());
        gva.q(false);
        return v;
    }
    
    public static final zvl W(final boolean b, lta lta, final gva gva, final int n, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new gfe((byte)6);
                gva.q0(r);
            }
            lta = (lta)r;
        }
        final fwl w = fwl.w;
        final fwl v = fwl.v;
        Set set;
        if (b) {
            set = iw0.n1((Object[])new fwl[] { v, w });
        }
        else {
            set = iw0.n1((Object[])new fwl[] { v, fwl.x, w });
        }
        return zul.b(set, lta, gva, 196992, 24);
    }
    
    public static final m1o X(final iln iln, final List value, final lta lta, final gva gva, final int n, int n2) {
        Object c = vz3.C;
        final cib a = bi6.a;
        if ((n2 & 0x8) != 0x0) {
            Object r;
            if ((r = gva.R()) == a) {
                r = new krl((byte)14);
                gva.q0(r);
            }
            c = r;
        }
        final int n3 = (n & 0x380) ^ 0x180;
        final int n4 = 0;
        if ((n3 > 256 && gva.f((Object)lta)) || (n & 0x180) == 0x100) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final boolean f = gva.f(c);
        final Object r2 = gva.R();
        Object o;
        if ((n2 | (f ? 1 : 0)) != 0x0 || (o = r2) == a) {
            o = new etj((Object)lta, c, (byte)22);
            gva.q0(o);
        }
        final zta zta = (zta)o;
        Label_0206: {
            if (n3 <= 256 || !gva.f((Object)lta)) {
                n2 = n4;
                if ((n & 0x180) != 0x100) {
                    break Label_0206;
                }
            }
            n2 = 1;
        }
        final Object r3 = gva.R();
        Object o2;
        if (n2 != 0 || (o2 = r3) == a) {
            o2 = new bcf(lta, (byte)8);
            gva.q0(o2);
        }
        final lta lta2 = (lta)o2;
        final boolean f2 = gva.f((Object)iln);
        final Object r4 = gva.R();
        m1o m1o;
        if (f2 || (m1o = (m1o)r4) == a) {
            m1o = new m1o(iln, zta, lta2);
            gva.q0((Object)m1o);
        }
        final m1o m1o2 = m1o;
        m1o2.d.setValue((Object)value);
        final boolean f3 = gva.f((Object)m1o2);
        final Object r5 = gva.R();
        Object o3;
        if (f3 || (o3 = r5) == a) {
            o3 = new khn((byte)4, (f07)null, (Object)m1o2);
            gva.q0(o3);
        }
        mlc.f((zta)o3, gva, m1o2);
        return m1o2;
    }
    
    public static void Y(final brg brg, final ClaudeAppDestination$Detail claudeAppDestination$Detail) {
        brg.b((lta)new drg(claudeAppDestination$Detail, (byte)0), (zta)new v6e((byte)28));
    }
    
    public static void Z(final brg brg, final ClaudeAppDestination$Detail claudeAppDestination$Detail, fs5 fs5, final int n) {
        if ((n & 0x2) != 0x0) {
            fs5 = (fs5)new drg(claudeAppDestination$Detail, (byte)1);
        }
        brg.b((lta)new erg(claudeAppDestination$Detail, (lta)fs5, (byte)0), (zta)new v6e((byte)28));
    }
    
    public static ad8 a() {
        return new ad8(1.0f, 1.0f);
    }
    
    public static final void a0(final List list, final lpl lpl, final String s, long longValue, final Throwable t) {
        sn9 a;
        if (t != null) {
            a = wun.a(t);
        }
        else {
            a = null;
        }
        final String n0 = c86.N0((Iterable)list, (CharSequence)"|", (String)null, (String)null, (lta)null, 62);
        Long n2;
        if (a == null) {
            n2 = fej.a(longValue, n0);
        }
        else {
            final ConcurrentHashMap a2 = fej.a;
            final String k = hia.k(n0, " @ ", a.T());
            final ConcurrentHashMap a3 = fej.a;
            String s3 = null;
            Label_0294: {
                if (!a3.containsKey((Object)k)) {
                    final Set keySet = a3.keySet();
                    keySet.getClass();
                    final Iterable iterable = (Iterable)keySet;
                    final ArrayList list2 = new ArrayList();
                    final Iterator iterator = iterable.iterator();
                    int n3;
                    while (true) {
                        final boolean hasNext = iterator.hasNext();
                        n3 = 0;
                        if (!hasNext) {
                            break;
                        }
                        final Object next = iterator.next();
                        final String s2 = (String)next;
                        s2.getClass();
                        if (!kym.I0((CharSequence)s2, (CharSequence)" @ ", false)) {
                            continue;
                        }
                        list2.add(next);
                    }
                    s3 = n0;
                    if (list2.size() >= 32) {
                        break Label_0294;
                    }
                    if (!list2.isEmpty()) {
                        final Iterator iterator2 = list2.iterator();
                        n3 = 0;
                        while (iterator2.hasNext()) {
                            final String s4 = (String)iterator2.next();
                            s4.getClass();
                            if (rym.E0(s4, n0.concat(" @ "), false)) {
                                if (++n3 >= 0) {
                                    continue;
                                }
                                lq6.m0();
                                throw null;
                            }
                        }
                    }
                    s3 = n0;
                    if (n3 >= 8) {
                        break Label_0294;
                    }
                }
                s3 = k;
            }
            n2 = fej.a(longValue, s3);
        }
        if (n2 != null) {
            longValue = n2;
            final o1e o1e = new o1e();
            if (a != null) {
                o1e.put((Object)"throw_site", (Object)a.T());
            }
            if (longValue > 0L) {
                o1e.put((Object)"suppressed_count", (Object)n2);
            }
            final o1e c = o1e.c();
            final List a4 = adn.a;
            final SilentException ex = new SilentException(s);
            if (a != null) {
                ((Throwable)ex).setStackTrace(a.V());
            }
            adn.f((Throwable)ex, (String)null, lpl, (Map)c, list, 18);
        }
    }
    
    public static final void b(final lta lta, final gva gva, final int n) {
        gva.i0(868660676);
        int n2;
        if (gva.f((Object)lta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final hwj hwj = (hwj)gva.j((sei)iwj.a);
            final bnf w = o50.W(lta, gva);
            final boolean h = gva.h((Object)hwj);
            final boolean f = gva.f((Object)w);
            final Object r = gva.R();
            Object o;
            if ((h | f) || (o = r) == bi6.a) {
                o = new p10((Object)hwj, (Object)w, (f07)null, (byte)29);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, hwj);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new v65((byte)2, n, lta);
        }
    }
    
    public static final void c(final jta jta, final igf igf, final zvl zvl, float n, boolean b, final aql aql, final long n2, final long n3, long b2, final zta zta, final zta zta2, ucf ucf, final ye6 ye6, final gva gva, final int n4, final int n5, final int n6) {
        gva.i0(1904798512);
        int n8;
        if ((n4 & 0x6) == 0x0) {
            int n7;
            if (gva.h((Object)jta)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n8 = (n7 | n4);
        }
        else {
            n8 = n4;
        }
        if ((n4 & 0x30) == 0x0) {
            int n9;
            if (gva.f((Object)igf)) {
                n9 = 32;
            }
            else {
                n9 = 16;
            }
            n8 |= n9;
        }
        int n10 = n8;
        if ((n4 & 0x180) == 0x0) {
            int n11;
            if (gva.f((Object)zvl)) {
                n11 = 256;
            }
            else {
                n11 = 128;
            }
            n10 = (n8 | n11);
        }
        final int n12 = n10 | 0xC00;
        final int n13 = n6 & 0x10;
        int n14;
        if (n13 != 0) {
            n14 = (n10 | 0x6C00);
        }
        else {
            n14 = n12;
            if ((n4 & 0x6000) == 0x0) {
                int n15;
                if (gva.g(b)) {
                    n15 = 16384;
                }
                else {
                    n15 = 8192;
                }
                n14 = (n12 | n15);
            }
        }
        if ((0x30000 & n4) == 0x0) {
            int n16;
            if (gva.f((Object)aql)) {
                n16 = 131072;
            }
            else {
                n16 = 65536;
            }
            n14 |= n16;
        }
        int n17 = n14;
        if ((n4 & 0x180000) == 0x0) {
            int n18;
            if (gva.e(n2)) {
                n18 = 1048576;
            }
            else {
                n18 = 524288;
            }
            n17 = (n14 | n18);
        }
        int n19 = n17;
        if ((n4 & 0xC00000) == 0x0) {
            int n20;
            if (gva.e(n3)) {
                n20 = 8388608;
            }
            else {
                n20 = 4194304;
            }
            n19 = (n17 | n20);
        }
        final int n21 = n19 | 0x6000000;
        int n23;
        if ((n4 & 0x30000000) == 0x0) {
            int n22;
            if ((n6 & 0x200) == 0x0 && gva.e(b2)) {
                n22 = 536870912;
            }
            else {
                n22 = 268435456;
            }
            n23 = (n21 | n22);
        }
        else {
            n23 = n21;
        }
        int n25;
        if ((n5 & 0x6) == 0x0) {
            int n24;
            if (gva.h((Object)zta)) {
                n24 = 4;
            }
            else {
                n24 = 2;
            }
            n25 = (n5 | n24);
        }
        else {
            n25 = n5;
        }
        int n26;
        if (gva.h((Object)zta2)) {
            n26 = 32;
        }
        else {
            n26 = 16;
        }
        final int n27 = n25 | n26;
        final int n28 = n6 & 0x1000;
        int n29;
        if (n28 != 0) {
            n29 = (n27 | 0x180);
        }
        else {
            int n30;
            if (gva.f((Object)ucf)) {
                n30 = 256;
            }
            else {
                n30 = 128;
            }
            n29 = (n27 | n30);
        }
        final int n31 = 1;
        if (gva.W(n23 & 0x1, (n23 & 0x12492493) != 0x12492492 || (n29 & 0x493) != 0x492)) {
            gva.b0();
            if ((n4 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                if ((n6 & 0x200) != 0x0) {
                    n23 &= 0x8FFFFFFF;
                }
            }
            else {
                if (n13 != 0) {
                    b = true;
                }
                if ((n6 & 0x200) != 0x0) {
                    b2 = j86.b(0.32f, s86.d(29, gva));
                    n23 &= 0x8FFFFFFF;
                }
                n = 640.0f;
                if (n28 != 0) {
                    ucf = new ucf(3, false);
                }
            }
            gva.r();
            final Object r = gva.R();
            final cib a = bi6.a;
            Object z = r;
            if (r == a) {
                z = mlc.z((hc7)o89.v, gva);
                gva.q0(z);
            }
            final oc7 oc7 = (oc7)z;
            final int n32 = (n23 & 0x380) ^ 0x180;
            int n33 = 0;
            Label_0804: {
                if (n32 <= 256 || !gva.f((Object)zvl)) {
                    if ((n23 & 0x180) != 0x100) {
                        n33 = 0;
                        break Label_0804;
                    }
                }
                n33 = 1;
            }
            final boolean h = gva.h((Object)oc7);
            final int n34 = n23 & 0xE;
            final boolean b3 = n34 == 4;
            Object r2 = gva.R();
            if ((n33 | (h ? 1 : 0) | (b3 ? 1 : 0)) || r2 == a) {
                r2 = new ji2(zvl, oc7, jta, (byte)2);
                gva.q0(r2);
            }
            final jta jta2 = (jta)r2;
            final boolean b4 = (n32 > 256 && gva.f((Object)zvl)) || (n23 & 0x180) == 0x100;
            final boolean h2 = gva.h((Object)oc7);
            final boolean b5 = n34 == 4;
            final Object r3 = gva.R();
            Object o;
            if ((b5 | (b4 | h2)) || (o = r3) == a) {
                o = new ji2(zvl, oc7, jta, (byte)3);
                gva.q0(o);
            }
            x8r.c((jta)o, n3, ucf, uuj.t0(-1328793519, (aua)new qcf(zvl, ucf, jta2, b2, igf, jta, n, b, zta, zta2, aql, n2, n3, ye6), gva), gva, (n23 >> 18 & 0x70) | 0xC00 | (n29 & 0x380));
            if (zvl.e.c().c((Object)fwl.w)) {
                gva.g0(748189566);
                int n35 = 0;
                Label_1153: {
                    if (n32 > 256) {
                        n35 = n31;
                        if (gva.f((Object)zvl)) {
                            break Label_1153;
                        }
                    }
                    if ((n23 & 0x180) == 0x100) {
                        n35 = n31;
                    }
                    else {
                        n35 = 0;
                    }
                }
                final Object r4 = gva.R();
                Object o2;
                if (n35 != 0 || (o2 = r4) == a) {
                    o2 = new j81(zvl, (f07)null, (byte)8);
                    gva.q0(o2);
                }
                mlc.f((zta)o2, gva, zvl);
                gva.q(false);
            }
            else {
                gva.g0(748547058);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new rcf(jta, igf, zvl, n, b, aql, n2, n3, b2, zta, zta2, ucf, ye6, n4, n5, n6);
        }
    }
    
    public static void c0(final brg brg, final ClaudeAppDestination$Detail claudeAppDestination$Detail) {
        brg.b((lta)new drg(claudeAppDestination$Detail, (byte)3), (zta)new v6e((byte)28));
    }
    
    public static final void d(final x4 x4, final zsk zsk) {
        final tsk d = zsk.d;
        final tmf v = d.v;
        Object g;
        if ((g = d.v.g(etk.z)) == null) {
            g = null;
        }
        final iuj iuj = (iuj)g;
        if (twl.q(zsk)) {
            if (iuj != null) {
                if (iuj.a == 8) {
                    return;
                }
            }
            Object g2;
            if ((g2 = v.g(rsk.y)) == null) {
                g2 = null;
            }
            final t3 t3 = (t3)g2;
            if (t3 != null) {
                x4.b(new q4((Object)null, 16908358, (CharSequence)t3.a, (Class)null));
            }
            Object g3;
            if ((g3 = v.g(rsk.A)) == null) {
                g3 = null;
            }
            final t3 t4 = (t3)g3;
            if (t4 != null) {
                x4.b(new q4((Object)null, 16908359, (CharSequence)t4.a, (Class)null));
            }
            Object g4;
            if ((g4 = v.g(rsk.z)) == null) {
                g4 = null;
            }
            final t3 t5 = (t3)g4;
            if (t5 != null) {
                x4.b(new q4((Object)null, 16908360, (CharSequence)t5.a, (Class)null));
            }
            Object g5;
            if ((g5 = v.g(rsk.B)) == null) {
                g5 = null;
            }
            final t3 t6 = (t3)g5;
            if (t6 != null) {
                x4.b(new q4((Object)null, 16908361, (CharSequence)t6.a, (Class)null));
            }
        }
    }
    
    public static void d0(final brg brg, final ClaudeAppDestination$List list) {
        brg.b((lta)new u87((Object)list, (byte)2), (zta)new v6e((byte)28));
    }
    
    public static void e(final StringBuilder sb, final Object o, final lta lta) {
        if (lta != null) {
            sb.append((CharSequence)lta.b(o));
            return;
        }
        if (o == null || o instanceof CharSequence) {
            sb.append((CharSequence)o);
            return;
        }
        if (o instanceof Character) {
            sb.append((char)o);
            return;
        }
        sb.append((CharSequence)o.toString());
    }
    
    public static final Object e0(final lzn lzn, final zta zta) {
        x90.A((opc)lzn, (qpc)new fq8(ach.L(((mdk)lzn).z.getContext()).Y(lzn.A, (Runnable)lzn, ((q0)lzn).y)));
        return t08.m0((mdk)lzn, false, (Object)lzn, zta);
    }
    
    public static final bva f(bva bva) {
        if (bva == null) {
            bva = null;
        }
        if (bva != null) {
            return bva;
        }
        ti6.b("Inconsistent composition");
        ebq.a();
        return null;
    }
    
    public static final String f0(final byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        if (b == 127) {
            return "invalid token";
        }
        return "valid token";
    }
    
    public static final f93 g(int d) {
        d = ge9.D(d);
        if (d == 0) {
            return f93.v;
        }
        if (d == 1) {
            return f93.w;
        }
        if (d == 2) {
            return f93.x;
        }
        if (d == 3) {
            return f93.y;
        }
        if (d == 4) {
            return f93.z;
        }
        en9.r();
        return null;
    }
    
    public static final void g0(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        en9.j(hia.g(n, n2, "index (", ") is out of bound of [0, ", ")"));
    }
    
    public static final boolean h(final epm epm, final int n, final p2 c, final boolean b) {
        final Object f;
        monitorenter(f = r6k.f);
        Label_0073: {
            boolean b3 = false;
            Label_0068: {
                Label_0066: {
                    int d;
                    boolean b2;
                    try {
                        d = epm.d;
                        if (d != n) {
                            break Label_0066;
                        }
                        epm.c = c;
                        b2 = true;
                        if (b) {
                            ++epm.e;
                        }
                    }
                    finally {
                        break Label_0073;
                    }
                    final epm epm2;
                    epm2.d = d + 1;
                    b3 = b2;
                    break Label_0068;
                }
                b3 = false;
            }
            monitorexit(f);
            return b3;
        }
        monitorexit(f);
    }
    
    public static final Object h0(final long n, final zta zta, final h07 h07) {
        if (n > 0L) {
            return e0(new lzn(n, h07), zta);
        }
        throw new TimeoutCancellationException("Timed out immediately", (lzn)null);
    }
    
    public static final byte i(final char c) {
        if (c < '~') {
            return di3.b[c];
        }
        return 0;
    }
    
    public static final Object i0(final long n, final zta zta, final h07 h07) {
        return h0(ach.i0(n), zta, h07);
    }
    
    public static void j(final InputStream inputStream, final OutputStream outputStream) {
        final byte[] array = new byte[8192];
        for (int i = inputStream.read(array); i >= 0; i = inputStream.read(array)) {
            outputStream.write(array, 0, i);
        }
    }
    
    public static final Object j0(final long n, final zta zta, f07 v) {
        Object o = null;
        Label_0055: {
            if (v instanceof mzn) {
                final mzn mzn = (mzn)v;
                final int x = mzn.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    mzn.x = x + Integer.MIN_VALUE;
                    o = mzn;
                    break Label_0055;
                }
            }
            o = new h07((f07)v);
        }
        final Object w = ((mzn)o).w;
        final int x2 = ((mzn)o).x;
        Label_0180: {
            if (x2 != 0) {
                if (x2 == 1) {
                    v = ((mzn)o).v;
                    try {
                        vt4.g0(w);
                        return w;
                    }
                    catch (final TimeoutCancellationException ex) {
                        break Label_0180;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(w);
            if (n <= 0L) {
                return null;
            }
            final Object v2 = new Object();
            try {
                ((mzn)o).v = (b4j)v2;
                ((mzn)o).x = 1;
                final lzn v3 = new lzn(n, (h07)o);
                ((b4j)v2).v = v3;
                final Object e0 = e0(v3, zta);
                final pc7 v4 = pc7.v;
                if (e0 == v4) {
                    return v4;
                }
                return e0;
            }
            catch (final TimeoutCancellationException ex) {
                v = v2;
            }
        }
        final TimeoutCancellationException ex;
        if (ex.v != ((b4j)v).v) {
            throw ex;
        }
        return null;
    }
    
    public static void k(final brg brg) {
        brg.b((lta)new ukg((byte)11), (zta)new v6e((byte)28));
    }
    
    public static final Object k0(final long n, final zta zta, final h07 h07) {
        return j0(ach.i0(n), zta, h07);
    }
    
    public static final void l(final lyg lyg, final xma xma, final xom xom, final xom xom2, final xom xom3, final z0q z0q, final jta jta, final m6n m6n) {
        final p6k c = p6k.C;
        m(lyg, new nob((Object)xma, (Object)new e0j((x3j)new Object()), (byte)29), xom, xom2, xom3, z0q, jta, 3, 60, 30, m6n);
    }
    
    public static void l0(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                en9.s(smk.p(n2, "negative size: "));
                return;
            }
            s = p4r.l("%s (%s) must be less than size (%s)", new Object[] { "index", n, n2 });
        }
        else {
            s = p4r.l("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static final void m(lyg v, final nob nob, xom y, xom z, xom xom, final z0q z0q, jta b, int d, int c, int e, final h07 h07) {
        Object o = null;
        Label_0060: {
            if (h07 instanceof o6k) {
                final o6k o6k = (o6k)h07;
                final int n = o6k.N;
                if ((n & Integer.MIN_VALUE) != 0x0) {
                    o6k.N = n + Integer.MIN_VALUE;
                    o = o6k;
                    break Label_0060;
                }
            }
            o = new h07(h07);
        }
        Object o2 = ((o6k)o).M;
        final int n2 = ((o6k)o).N;
        final pc7 v2 = pc7.v;
    Label_0939:
        while (true) {
            lyg v3 = null;
            pc7 pc9 = null;
            jta jta2 = null;
            int f3 = 0;
            Object o10 = null;
            jta b5 = null;
            int h12 = 0;
            Object o11 = null;
        Label_0504_Outer:
            while (true) {
                Object a = null;
                Object o3 = null;
                pc7 pc7 = null;
                jta b2 = null;
                Object w = null;
                if (n2 == 0) {
                    vt4.g0(o2);
                    final lyg lyg = v;
                    a = z0q;
                    final jta jta = b;
                    final int n3 = c;
                    c = e;
                    o3 = o;
                    pc7 = v2;
                    e = n3;
                    b2 = jta;
                    final xom z2 = xom;
                    xom = z;
                    z = y;
                    w = nob;
                    v3 = lyg;
                    break Label_0761;
                }
                xom x = null;
                int k = 0;
                int n11 = 0;
            Label_2486:
                while (true) {
                    int g = 0;
                    int j = 0;
                    Label_2153: {
                        xom y2 = null;
                        Object o6 = null;
                        lyg lyg3 = null;
                        Label_2075: {
                            while (true) {
                                int n4 = 0;
                                int h10 = 0;
                                boolean b4 = false;
                                xom z3 = null;
                                Object o7 = null;
                                z0q a5 = null;
                                lyg lyg4 = null;
                                int n6 = 0;
                                int k2 = 0;
                                xom y3 = null;
                                int j2 = 0;
                                Object o8 = null;
                                Label_1386: {
                                    int h8 = 0;
                                    Object o4 = null;
                                    Label_1130: {
                                        jta b3 = null;
                                        jta w2 = null;
                                        lyg lyg2 = null;
                                        Label_0920: {
                                            if (n2 == 1) {
                                                c = ((o6k)o).E;
                                                d = ((o6k)o).D;
                                                e = ((o6k)o).C;
                                                b3 = ((o6k)o).B;
                                                a = ((o6k)o).A;
                                                z = ((o6k)o).z;
                                                xom = ((o6k)o).y;
                                                x = ((o6k)o).x;
                                                w2 = ((o6k)o).w;
                                                final lyg v4 = ((o6k)o).v;
                                                vt4.g0(o2);
                                                final pc7 pc8 = v2;
                                                o3 = o;
                                                lyg2 = v4;
                                                pc7 = pc8;
                                                break Label_0920;
                                            }
                                            if (n2 == 2) {
                                                h8 = ((o6k)o).H;
                                                g = ((o6k)o).G;
                                                n4 = ((o6k)o).F;
                                                e = ((o6k)o).E;
                                                d = ((o6k)o).D;
                                                c = ((o6k)o).C;
                                                b2 = ((o6k)o).B;
                                                a = ((o6k)o).A;
                                                z = ((o6k)o).z;
                                                xom = ((o6k)o).y;
                                                x = ((o6k)o).x;
                                                final jta w3 = ((o6k)o).w;
                                                v3 = ((o6k)o).v;
                                                vt4.g0(o2);
                                                pc9 = v2;
                                                o4 = o;
                                                jta2 = w3;
                                                break Label_1130;
                                            }
                                            if (n2 == 3) {
                                                k = ((o6k)o).K;
                                                j = ((o6k)o).J;
                                                final int i = ((o6k)o).I;
                                                final int h9 = ((o6k)o).H;
                                                final int g2 = ((o6k)o).G;
                                                final int f = ((o6k)o).F;
                                                e = ((o6k)o).E;
                                                d = ((o6k)o).D;
                                                c = ((o6k)o).C;
                                                b = ((o6k)o).B;
                                                final Object a2 = ((o6k)o).A;
                                                z = ((o6k)o).z;
                                                xom = ((o6k)o).y;
                                                x = ((o6k)o).x;
                                                final jta w4 = ((o6k)o).w;
                                                v = ((o6k)o).v;
                                                vt4.g0(o2);
                                                final o6k o6k2 = (o6k)o;
                                                final jta jta3 = b;
                                                pc9 = v2;
                                                final Object o5 = o6k2;
                                                break Label_0504;
                                            }
                                            int l;
                                            int m;
                                            int i2;
                                            int h11;
                                            int g3;
                                            int f2;
                                            xom x2;
                                            pc7 pc10;
                                            if (n2 != 4) {
                                                if (n2 == 5) {
                                                    h10 = ((o6k)o).H;
                                                    g = ((o6k)o).G;
                                                    n4 = ((o6k)o).F;
                                                    c = ((o6k)o).E;
                                                    d = ((o6k)o).D;
                                                    e = ((o6k)o).C;
                                                    b3 = ((o6k)o).B;
                                                    final z0q a3 = ((o6k)o).A;
                                                    z = ((o6k)o).z;
                                                    y2 = ((o6k)o).y;
                                                    xom = ((o6k)o).x;
                                                    final jta w5 = ((o6k)o).w;
                                                    final lyg v5 = ((o6k)o).v;
                                                    vt4.g0(o2);
                                                    o3 = o;
                                                    o6 = v2;
                                                    w = w5;
                                                    a = a3;
                                                    lyg3 = v5;
                                                    break Label_2075;
                                                }
                                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                                return;
                                            }
                                            else {
                                                l = ((o6k)o).K;
                                                b4 = ((o6k)o).L;
                                                m = ((o6k)o).J;
                                                i2 = ((o6k)o).I;
                                                h11 = ((o6k)o).H;
                                                g3 = ((o6k)o).G;
                                                f2 = ((o6k)o).F;
                                                d = ((o6k)o).E;
                                                c = ((o6k)o).D;
                                                e = ((o6k)o).C;
                                                b = ((o6k)o).B;
                                                final z0q a4 = ((o6k)o).A;
                                                z3 = ((o6k)o).z;
                                                y = ((o6k)o).y;
                                                x2 = ((o6k)o).x;
                                                final jta w6 = ((o6k)o).w;
                                                final lyg v6 = ((o6k)o).v;
                                                vt4.g0(o2);
                                                pc10 = v2;
                                                o7 = o;
                                                w = w6;
                                                a5 = a4;
                                                lyg4 = v6;
                                            }
                                            final pc7 pc11 = pc10;
                                            final int n5 = m;
                                            n6 = i2;
                                            k2 = l + 1;
                                            z = x2;
                                            final int n7 = f2;
                                            g = g3;
                                            h10 = h11;
                                            y3 = y;
                                            n4 = n7;
                                            j2 = n5;
                                            o8 = pc11;
                                            break Label_1386;
                                            int i = 0;
                                            final int n8 = i + 1;
                                            int g2 = 0;
                                            final int n9 = g2;
                                            int h9 = 0;
                                            final int n10 = h9;
                                            Object a2 = null;
                                            final Object o9 = a2;
                                            int f = 0;
                                            f3 = f;
                                            final lyg lyg5 = v;
                                            Object o5 = null;
                                            o10 = o5;
                                            g = n9;
                                            n11 = n8;
                                            jta jta3 = null;
                                            b5 = jta3;
                                            h12 = n10;
                                            jta w4 = null;
                                            jta2 = w4;
                                            v3 = lyg5;
                                            o11 = o9;
                                            break Label_2153;
                                            final n6k a6 = ljq.a0((jta)new lce((Object)v3, (byte)23));
                                            final q31 q31 = new q31(2, (f07)null, (byte)9);
                                            ((o6k)o3).v = v3;
                                            ((o6k)o3).w = (jta)w;
                                            ((o6k)o3).x = z;
                                            ((o6k)o3).y = xom;
                                            final xom z2;
                                            ((o6k)o3).z = z2;
                                            ((o6k)o3).A = (z0q)a;
                                            ((o6k)o3).B = b2;
                                            ((o6k)o3).C = (byte)d;
                                            ((o6k)o3).D = (byte)e;
                                            ((o6k)o3).E = (byte)c;
                                            ((o6k)o3).N = 1;
                                            if (vt4.A((ija)a6, (zta)q31, (f07)o3) == pc7) {
                                                return;
                                            }
                                            final jta jta4 = (jta)w;
                                            final int n12 = e;
                                            final xom xom2 = z2;
                                            final jta jta5 = b2;
                                            lyg2 = v3;
                                            w2 = jta4;
                                            x = z;
                                            z = xom2;
                                            b3 = jta5;
                                            e = d;
                                            d = n12;
                                        }
                                        final lyg lyg6 = lyg2;
                                        n4 = 0;
                                        g = 0;
                                        h10 = 0;
                                        w = w2;
                                        lyg4 = lyg6;
                                        if (!lyg4.a()) {
                                            final int n13 = e;
                                            final jta jta6 = b3;
                                            final xom xom3 = z;
                                            z = x;
                                            e = d;
                                            v3 = lyg4;
                                            final xom z2 = xom3;
                                            b2 = jta6;
                                            d = n13;
                                            continue Label_0504_Outer;
                                        }
                                        final cd0 cd0 = new cd0((ija)ljq.a0((jta)new ng4((Object)b3, (Object)xom, a, (Object)x, (byte)6)), (byte)3);
                                        ((o6k)o3).v = lyg4;
                                        ((o6k)o3).w = (jta)w;
                                        ((o6k)o3).x = x;
                                        ((o6k)o3).y = xom;
                                        ((o6k)o3).z = z;
                                        ((o6k)o3).A = (z0q)a;
                                        ((o6k)o3).B = b3;
                                        ((o6k)o3).C = (byte)e;
                                        ((o6k)o3).D = (byte)d;
                                        ((o6k)o3).E = (byte)c;
                                        ((o6k)o3).F = n4;
                                        ((o6k)o3).G = g;
                                        ((o6k)o3).H = h10;
                                        ((o6k)o3).N = 2;
                                        o2 = vt4.z((ija)cd0, (f07)o3);
                                        final cna cna = (cna)pc7;
                                        if (o2 == cna) {
                                            return;
                                        }
                                        final lyg lyg7 = lyg4;
                                        final f07 f4 = (f07)o3;
                                        final int n14 = c;
                                        c = e;
                                        b2 = b3;
                                        pc9 = (pc7)cna;
                                        v3 = lyg7;
                                        jta2 = (jta)w;
                                        o4 = f4;
                                        e = n14;
                                        h8 = h10;
                                    }
                                    final int ordinal = ((Enum)o2).ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal == 1) {
                                            j = (((boolean)z.getValue() ^ true) ? 1 : 0);
                                            final z0q z0q2 = (z0q)a;
                                            b5 = b2;
                                            o10 = o4;
                                            k = 0;
                                            final int n15 = 1;
                                            final int n16 = 0;
                                            o11 = z0q2;
                                            f3 = n4;
                                            h12 = n15;
                                            n11 = n16;
                                            break Label_2153;
                                        }
                                        if (ordinal != 2) {
                                            en9.r();
                                            return;
                                        }
                                        int j3;
                                        if ((h8 == 0) ? (g >= d) : (n4 >= c)) {
                                            j3 = 1;
                                        }
                                        else {
                                            j3 = 0;
                                        }
                                        if (j3 != 0) {
                                            v3.b(false);
                                            SilentException.a(new SilentException(hia.g(n4, g, "Gave up on a pending focus request (refocuses=", " rejections=", ")")), lpl.w, (List)null, 6);
                                        }
                                        else {
                                            b4 = (boolean)jta2.a();
                                            int f5;
                                            int g4;
                                            if (h8 != 0) {
                                                f5 = n4 + 1;
                                                g4 = g;
                                            }
                                            else {
                                                g4 = g;
                                                f5 = n4;
                                                if (!b4) {
                                                    g4 = g + 1;
                                                    f5 = n4;
                                                }
                                            }
                                            if (b4) {
                                                final jta jta7 = jta2;
                                                final int n17 = d;
                                                g = g4;
                                                a5 = (z0q)a;
                                                y3 = xom;
                                                final int n18 = 0;
                                                final int n19 = h8;
                                                j2 = j3;
                                                final lyg lyg8 = v3;
                                                n4 = f5;
                                                final xom xom4 = z;
                                                h10 = 0;
                                                o8 = pc9;
                                                d = e;
                                                z = x;
                                                o7 = o4;
                                                z3 = xom4;
                                                n6 = n19;
                                                b = b2;
                                                k2 = n18;
                                                e = c;
                                                c = n17;
                                                w = jta7;
                                                lyg4 = lyg8;
                                                break Label_1386;
                                            }
                                            final drj drj = new drj((byte)12);
                                            ((o6k)o4).v = v3;
                                            ((o6k)o4).w = jta2;
                                            ((o6k)o4).x = x;
                                            ((o6k)o4).y = xom;
                                            ((o6k)o4).z = z;
                                            ((o6k)o4).A = (z0q)a;
                                            ((o6k)o4).B = b2;
                                            ((o6k)o4).C = (byte)c;
                                            ((o6k)o4).D = (byte)d;
                                            ((o6k)o4).E = (byte)e;
                                            ((o6k)o4).F = f5;
                                            ((o6k)o4).G = g4;
                                            ((o6k)o4).H = 0;
                                            ((o6k)o4).I = h8;
                                            ((o6k)o4).J = j3;
                                            ((o6k)o4).L = b4;
                                            ((o6k)o4).N = 5;
                                            if (ien.v(((f07)o4).getContext()).p0((f07)o4, (lta)drj) == pc9) {
                                                return;
                                            }
                                            g = g4;
                                            final f07 f6 = (f07)o4;
                                            final int n20 = c;
                                            w = jta2;
                                            n4 = f5;
                                            c = e;
                                            final jta jta8 = b2;
                                            final xom xom5 = xom;
                                            h10 = 0;
                                            o6 = pc9;
                                            o3 = f6;
                                            xom = x;
                                            y2 = xom5;
                                            lyg3 = v3;
                                            final jta b3 = jta8;
                                            e = n20;
                                            break Label_2075;
                                        }
                                    }
                                    else {
                                        v3.b(false);
                                    }
                                    final int n21 = d;
                                    d = c;
                                    final f07 f7 = (f07)o4;
                                    w = jta2;
                                    c = e;
                                    final xom xom6 = z;
                                    z = x;
                                    final xom z2 = xom6;
                                    e = n21;
                                    pc7 = pc9;
                                    o3 = f7;
                                    continue Label_0504_Outer;
                                }
                                if (lyg4.a() && !(boolean)y3.getValue() && k2 < 5) {
                                    final drj drj2 = new drj((byte)11);
                                    ((o6k)o7).v = lyg4;
                                    ((o6k)o7).w = (jta)w;
                                    ((o6k)o7).x = z;
                                    ((o6k)o7).y = y3;
                                    ((o6k)o7).z = z3;
                                    ((o6k)o7).A = a5;
                                    ((o6k)o7).B = b;
                                    ((o6k)o7).C = (byte)e;
                                    ((o6k)o7).D = (byte)c;
                                    ((o6k)o7).E = (byte)d;
                                    ((o6k)o7).F = n4;
                                    ((o6k)o7).G = g;
                                    ((o6k)o7).H = h10;
                                    final int i3 = n6;
                                    ((o6k)o7).I = i3;
                                    ((o6k)o7).J = j2;
                                    final int n22 = j2;
                                    ((o6k)o7).L = b4;
                                    ((o6k)o7).K = k2;
                                    ((o6k)o7).N = 4;
                                    if (ien.v(((f07)o7).getContext()).p0((f07)o7, (lta)drj2) == o8) {
                                        return;
                                    }
                                    final int l = k2;
                                    final int n23 = g;
                                    final xom xom7 = z;
                                    final int h11 = h10;
                                    final int i2 = i3;
                                    final pc7 pc10 = (pc7)o8;
                                    y = y3;
                                    final xom x2 = xom7;
                                    final int f2 = n4;
                                    final int g3 = n23;
                                    final int m = n22;
                                    continue;
                                }
                                else {
                                    if (y3.getValue()) {
                                        final int n24 = c;
                                        final jta jta9 = b;
                                        final z0q z0q3 = a5;
                                        final xom xom8 = z3;
                                        x = z;
                                        c = d;
                                        pc7 = (pc7)o8;
                                        final xom xom9 = y3;
                                        final f07 f8 = (f07)o7;
                                        h10 = 1;
                                        d = n24;
                                        final jta b3 = jta9;
                                        a = z0q3;
                                        z = xom8;
                                        xom = xom9;
                                        o3 = f8;
                                        continue Label_0939;
                                    }
                                    if (n6 == 0) {
                                        final int n25 = c;
                                        final z0q z0q4 = a5;
                                        final xom xom10 = z;
                                        pc7 = (pc7)o8;
                                        final xom xom11 = y3;
                                        final f07 f9 = (f07)o7;
                                        final jta b3 = b;
                                        z = z3;
                                        c = d;
                                        ++g;
                                        d = n25;
                                        a = z0q4;
                                        xom = xom11;
                                        x = xom10;
                                        o3 = f9;
                                        continue Label_0939;
                                    }
                                    final int n26 = c;
                                    final z0q z0q5 = a5;
                                    final xom xom12 = z;
                                    pc7 = (pc7)o8;
                                    final xom xom13 = y3;
                                    final f07 f10 = (f07)o7;
                                    final jta b3 = b;
                                    z = z3;
                                    c = d;
                                    d = n26;
                                    a = z0q5;
                                    xom = xom13;
                                    x = xom12;
                                    o3 = f10;
                                    continue Label_0939;
                                }
                                break;
                            }
                        }
                        final lyg lyg9 = lyg3;
                        final xom xom14 = xom;
                        pc7 = (pc7)o6;
                        lyg lyg4 = lyg9;
                        xom = y2;
                        x = xom14;
                        continue Label_0939;
                    }
                    if (v3.a() && (boolean)xom.getValue()) {
                        final n6d a7 = (n6d)o11;
                        if (a7.b() && (boolean)b5.a() && n11 < e) {
                            if (z.getValue()) {
                                if (j != 0) {
                                    k = 1;
                                    break Label_2486;
                                }
                            }
                            else {
                                j = 1;
                            }
                            final drj drj3 = new drj((byte)10);
                            ((o6k)o10).v = v3;
                            ((o6k)o10).w = jta2;
                            ((o6k)o10).x = x;
                            ((o6k)o10).y = xom;
                            ((o6k)o10).z = z;
                            ((o6k)o10).A = (z0q)a7;
                            ((o6k)o10).B = b5;
                            ((o6k)o10).C = (byte)c;
                            ((o6k)o10).D = (byte)d;
                            ((o6k)o10).E = (byte)e;
                            ((o6k)o10).F = f3;
                            ((o6k)o10).G = g;
                            ((o6k)o10).H = h12;
                            final int i = n11;
                            ((o6k)o10).I = i;
                            ((o6k)o10).J = j;
                            ((o6k)o10).K = k;
                            ((o6k)o10).N = 3;
                            if (ien.v(((f07)o10).getContext()).p0((f07)o10, (lta)drj3) == pc9) {
                                return;
                            }
                            final lyg lyg10 = v3;
                            final int n27 = f3;
                            final jta w4 = jta2;
                            final Object o5 = o10;
                            final jta jta3 = b5;
                            final int g2 = g;
                            final int h9 = h12;
                            final Object a2 = a7;
                            final int f = n27;
                            v = lyg10;
                            continue;
                        }
                    }
                    break;
                }
                if (v3.a() && (boolean)xom.getValue() && (k != 0 || n11 >= e)) {
                    v3.b(false);
                    final int n28 = d;
                    final jta jta10 = b5;
                    final xom xom15 = z;
                    a = o11;
                    d = c;
                    c = e;
                    final f07 f11 = (f07)o10;
                    w = jta2;
                    z = x;
                    final xom z2 = xom15;
                    b2 = jta10;
                    e = n28;
                    pc7 = pc9;
                    o3 = f11;
                    continue Label_0504_Outer;
                }
                break;
            }
            final cna cna2 = (cna)pc9;
            final int n29 = f3;
            final int n30 = c;
            c = e;
            Object o3 = o10;
            lyg lyg4 = v3;
            int h10 = h12;
            final n6d n6d = (n6d)o11;
            Object w = jta2;
            e = n30;
            jta b3 = b5;
            Object a = n6d;
            int n4 = n29;
            pc7 pc7 = (pc7)cna2;
            continue Label_0939;
        }
    }
    
    public static void m0(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = p4r.l("end index (%s) must not be less than start index (%s)", new Object[] { n2, n });
            }
            else {
                s = n0(n2, n3, "end index");
            }
        }
        else {
            s = n0(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static final String n(final String s) {
        if (s.length() > 1 && Character.isHighSurrogate(s.charAt(0)) && Character.isLowSurrogate(s.charAt(1))) {
            return s.substring(0, 2);
        }
        return s.substring(0, 1);
    }
    
    public static String n0(final int n, final int n2, final String s) {
        if (n < 0) {
            return p4r.l("%s (%s) must not be negative", new Object[] { s, n });
        }
        if (n2 >= 0) {
            return p4r.l("%s (%s) must not be greater than size (%s)", new Object[] { s, n, n2 });
        }
        en9.s(smk.p(n2, "negative size: "));
        return null;
    }
    
    public static final igf o(final igf igf) {
        return igf.E((igf)bma.v);
    }
    
    public static final igf p(final igf igf, final boolean b, final llf llf) {
        Object v;
        if (b) {
            v = new kna(llf);
        }
        else {
            v = fgf.v;
        }
        return igf.E((igf)v);
    }
    
    public static f0k r(final Map map) {
        final Object value = map.get((Object)"application_id");
        final boolean b = value instanceof String;
        final Number n = null;
        String s;
        if (b) {
            s = (String)value;
        }
        else {
            s = null;
        }
        final Object value2 = map.get((Object)"session_id");
        String s2;
        if (value2 instanceof String) {
            s2 = (String)value2;
        }
        else {
            s2 = null;
        }
        final Object value3 = map.get((Object)"session_active");
        Boolean b2;
        if (value3 instanceof Boolean) {
            b2 = (Boolean)value3;
        }
        else {
            b2 = null;
        }
        final Object value4 = map.get((Object)"session_state");
        String obj;
        if (value4 instanceof String) {
            obj = (String)value4;
        }
        else {
            obj = null;
        }
        final int[] f = ge9.F(3);
        final int length = f.length;
        boolean booleanValue = false;
        while (true) {
            for (final int n2 : f) {
                if (lmf.b(n2).equals(obj)) {
                    int n3 = n2;
                    final Object value5 = map.get((Object)"session_start_reason");
                    String obj2;
                    if (value5 instanceof String) {
                        obj2 = (String)value5;
                    }
                    else {
                        obj2 = null;
                    }
                    while (true) {
                        for (final int n4 : ge9.F(7)) {
                            if (lmf.a(n4).equals(obj2)) {
                                int n5 = n4;
                                final Object value6 = map.get((Object)"view_id");
                                String s3;
                                if (value6 instanceof String) {
                                    s3 = (String)value6;
                                }
                                else {
                                    s3 = null;
                                }
                                final Object value7 = map.get((Object)"view_name");
                                String s4;
                                if (value7 instanceof String) {
                                    s4 = (String)value7;
                                }
                                else {
                                    s4 = null;
                                }
                                final Object value8 = map.get((Object)"view_url");
                                String s5;
                                if (value8 instanceof String) {
                                    s5 = (String)value8;
                                }
                                else {
                                    s5 = null;
                                }
                                final Object value9 = map.get((Object)"view_type");
                                String obj3;
                                if (value9 instanceof String) {
                                    obj3 = (String)value9;
                                }
                                else {
                                    obj3 = null;
                                }
                                while (true) {
                                    for (final int n6 : ge9.F(4)) {
                                        if (lmf.c(n6).equals(obj3)) {
                                            int n7 = n6;
                                            final Object value10 = map.get((Object)"action_id");
                                            String s6;
                                            if (value10 instanceof String) {
                                                s6 = (String)value10;
                                            }
                                            else {
                                                s6 = null;
                                            }
                                            final Object value11 = map.get((Object)"synthetics_test_id");
                                            String s7;
                                            if (value11 instanceof String) {
                                                s7 = (String)value11;
                                            }
                                            else {
                                                s7 = null;
                                            }
                                            final Object value12 = map.get((Object)"synthetics_result_id");
                                            String s8;
                                            if (value12 instanceof String) {
                                                s8 = (String)value12;
                                            }
                                            else {
                                                s8 = null;
                                            }
                                            final Object value13 = map.get((Object)"view_has_replay");
                                            Boolean b3;
                                            if (value13 instanceof Boolean) {
                                                b3 = (Boolean)value13;
                                            }
                                            else {
                                                b3 = null;
                                            }
                                            final boolean b4 = b3 != null && b3;
                                            final Object value14 = map.get((Object)"view_timestamp");
                                            Long n8;
                                            if (value14 instanceof Long) {
                                                n8 = (Long)value14;
                                            }
                                            else {
                                                n8 = null;
                                            }
                                            long longValue = 0L;
                                            long longValue2;
                                            if (n8 != null) {
                                                longValue2 = n8;
                                            }
                                            else {
                                                longValue2 = 0L;
                                            }
                                            final Object value15 = map.get((Object)"view_timestamp_offset");
                                            Long n9;
                                            if (value15 instanceof Long) {
                                                n9 = (Long)value15;
                                            }
                                            else {
                                                n9 = null;
                                            }
                                            if (n9 != null) {
                                                longValue = n9;
                                            }
                                            final Object value16 = map.get((Object)"session_sample_rate");
                                            Number n10 = n;
                                            if (value16 instanceof Number) {
                                                n10 = (Number)value16;
                                            }
                                            float floatValue;
                                            if (n10 != null) {
                                                floatValue = n10.floatValue();
                                            }
                                            else {
                                                floatValue = 100.0f;
                                            }
                                            String q = s;
                                            if (s == null) {
                                                q = f0k.q;
                                            }
                                            String q2;
                                            if ((q2 = s2) == null) {
                                                q2 = f0k.q;
                                            }
                                            if (b2 != null) {
                                                booleanValue = b2;
                                            }
                                            if (n3 == 0) {
                                                n3 = 1;
                                            }
                                            if (n5 == 0) {
                                                n5 = 1;
                                            }
                                            if (n7 == 0) {
                                                n7 = 1;
                                            }
                                            return new f0k(q, q2, booleanValue, s3, s4, s5, s6, n3, n5, n7, s7, s8, longValue2, longValue, b4, floatValue);
                                        }
                                    }
                                    int n7 = 0;
                                    continue;
                                }
                            }
                        }
                        int n5 = 0;
                        continue;
                    }
                }
            }
            int n3 = 0;
            continue;
        }
    }
    
    public static fc7 s(final fc7 fc7, final gc7 gc7) {
        if (mlc.q(fc7.getKey(), gc7)) {
            return fc7;
        }
        return null;
    }
    
    public static final ycp t(View view) {
        while (view != null) {
            final Object tag = view.getTag(2131297132);
            ycp ycp;
            if (tag instanceof ycp) {
                ycp = (ycp)tag;
            }
            else {
                ycp = null;
            }
            if (ycp != null) {
                return ycp;
            }
            final ViewParent z = soh.z(view);
            if (z instanceof View) {
                view = (View)z;
            }
            else {
                view = null;
            }
        }
        return null;
    }
    
    public static final long u(final gva gva) {
        return gva.T;
    }
    
    public static final int v(int n, final int n2, int n3) {
        if (n3 > 0) {
            if (n < n2) {
                int n4 = n2 % n3;
                if (n4 < 0) {
                    n4 += n3;
                }
                n %= n3;
                if (n < 0) {
                    n += n3;
                }
                n = (n4 - n) % n3;
                if (n < 0) {
                    n += n3;
                }
                return n2 - n;
            }
        }
        else {
            if (n3 >= 0) {
                en9.s("Step is zero.");
                return 0;
            }
            if (n > n2) {
                final int n5 = -n3;
                n %= n5;
                if (n < 0) {
                    n += n5;
                }
                n3 = n2 % n5;
                if (n3 < 0) {
                    n3 += n5;
                }
                n = (n - n3) % n5;
                if (n < 0) {
                    n += n5;
                }
                return n + n2;
            }
        }
        return n2;
    }
    
    public static final epm w(final v8m v8m) {
        final epm v = v8m.v;
        v.getClass();
        return (epm)g8m.s((lpm)v, (jpm)v8m);
    }
    
    public static final hnk x(final Object o) {
        if (o != um6.a) {
            return (hnk)o;
        }
        en9.q("Does not contain segment");
        return null;
    }
    
    public static final int y(final v8m v8m) {
        final epm v = v8m.v;
        v.getClass();
        return ((epm)g8m.f((lpm)v)).e;
    }
    
    public static final w1n z(final Organization organization) {
        final f33 companion = Capability.Companion;
        companion.getClass();
        if (A(organization, "raven")) {
            return w1n.z;
        }
        companion.getClass();
        if (A(organization, "claude_max")) {
            return w1n.y;
        }
        companion.getClass();
        if (A(organization, "claude_pro")) {
            return w1n.x;
        }
        return w1n.w;
    }
}
