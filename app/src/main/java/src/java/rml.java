import java.util.Map;
import java.security.Key;
import java.security.cert.Certificate;
import java.util.AbstractCollection;
import android.text.Spanned;
import java.util.Map$Entry;
import java.util.HashMap;
import kotlinx.serialization.KSerializer;
import java.io.File;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.Decoder;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.material3.c;
import androidx.compose.foundation.layout.b;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import android.net.NetworkRequest;
import com.datadog.android.core.UploadWorker;
import android.content.Context;
import java.util.Collections;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class rml
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final tei e;
    public static final awp f;
    
    public static final Object A(final avn avn, final bua bua, final Throwable v, h07 v2) {
        Object o = null;
        Label_0051: {
            if (v2 instanceof sja) {
                o = v2;
                final int x = ((sja)o).x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    ((sja)o).x = x + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            o = new h07(v2);
        }
        final Object w = ((sja)o).w;
        final int x2 = ((sja)o).x;
        Label_0101: {
            if (x2 == 0) {
                break Label_0101;
            }
            Label_0094: {
                if (x2 != 1) {
                    break Label_0094;
                }
                v2 = (h07)((sja)o).v;
                try {
                    vt4.g0(w);
                    return lqo.a;
                }
                finally {
                    final h07 h07;
                    if (v2 != null && v2 != h07) {
                        soh.j((Throwable)h07, (Throwable)v2);
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                    vt4.g0(w);
                    ((sja)o).v = v;
                    ((sja)o).x = 1;
                    final Object h8 = bua.h(avn, v, o);
                    final pc7 v3 = pc7.v;
                    iftrue(Label_0146:)(h8 != v3);
                    return v3;
                    Label_0146: {
                        return lqo.a;
                    }
                }
            }
        }
    }
    
    public static boolean B(final fvg fvg) {
        return rym.y0(fvg.b(), ".class", true) ^ true;
    }
    
    public static LinkedHashSet C(final Set set, final Object o) {
        final LinkedHashSet set2 = new LinkedHashSet(z5e.V(set.size()));
        final Iterator iterator = ((Iterable)set).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            final boolean b = true;
            int n2 = n;
            int n3 = b ? 1 : 0;
            if (n == 0) {
                n2 = n;
                n3 = (b ? 1 : 0);
                if (mlc.q(next, o)) {
                    n2 = 1;
                    n3 = 0;
                }
            }
            n = n2;
            if (n3 != 0) {
                ((Collection)set2).add(next);
                n = n2;
            }
        }
        return set2;
    }
    
    public static Set D(final Set set, final Iterable iterable) {
        Object s1;
        if (iterable instanceof Collection) {
            s1 = iterable;
        }
        else {
            s1 = c86.s1(iterable);
        }
        if (((Collection)s1).isEmpty()) {
            return c86.w1((Iterable)set);
        }
        if (s1 instanceof Set) {
            final Iterable iterable2 = (Iterable)set;
            final LinkedHashSet set2 = new LinkedHashSet();
            for (final Object next : iterable2) {
                if (!((Set)s1).contains(next)) {
                    ((Collection)set2).add(next);
                }
            }
            return (Set)set2;
        }
        final LinkedHashSet set3 = new LinkedHashSet((Collection)set);
        ((AbstractCollection)set3).removeAll((Collection)s1);
        return (Set)set3;
    }
    
    public static final igf E(final igf igf, final lta lta) {
        return igf.E((igf)new quc(lta, (lta)null));
    }
    
    public static final igf F(final igf igf, final lta lta) {
        return igf.E((igf)new quc((lta)null, lta));
    }
    
    public static String G(final X509Certificate x509Certificate) {
        final byte[] encoded = ((Key)((Certificate)x509Certificate).getPublicKey()).getEncoded();
        encoded.getClass();
        final int length = encoded.length;
        soh.q(encoded.length, 0L, length);
        final byte[] q0 = iw0.Q0(encoded, 0, length);
        final MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(q0, 0, q0.length);
        final byte[] digest = instance.digest();
        digest.getClass();
        return "sha256/".concat(a.b(digest, true));
    }
    
    public static LinkedHashSet H(final Set set, final Iterable iterable) {
        Object value;
        if (iterable instanceof Collection) {
            value = ((Collection)iterable).size();
        }
        else {
            value = null;
        }
        int n;
        if (value != null) {
            n = set.size() + ((Number)value).intValue();
        }
        else {
            n = set.size() * 2;
        }
        final LinkedHashSet set2 = new LinkedHashSet(z5e.V(n));
        ((AbstractCollection)set2).addAll((Collection)set);
        h86.t0((Collection)set2, iterable);
        return set2;
    }
    
    public static LinkedHashSet I(final Set set, final Object o) {
        final LinkedHashSet set2 = new LinkedHashSet(z5e.V(set.size() + 1));
        ((AbstractCollection)set2).addAll((Collection)set);
        ((AbstractCollection)set2).add(o);
        return set2;
    }
    
    public static fvg J(final fvg fvg, final fvg fvg2) {
        return tmj.A.h(rym.D0(kym.g1(fvg.v.w(), fvg2.v.w()), '\\', '/'));
    }
    
    public static Set K(final Object o) {
        final Set singleton = Collections.singleton(o);
        singleton.getClass();
        return singleton;
    }
    
    public static Set L(final Object... array) {
        final LinkedHashSet set = new LinkedHashSet();
        for (final Object o : array) {
            if (o != null) {
                ((Collection)set).add(o);
            }
        }
        return (Set)set;
    }
    
    public static final yog M(final Object o, final Object o2) {
        return new yog(o, o2);
    }
    
    public static final void N(final Context context, final String s, final rjc rjc) {
        final qjc w = qjc.w;
        try {
            final a5q e = a5q.e(context);
            e.getClass();
            new(ktf.class)();
            final qbg qbg = (qbg)((q5q)((q5q)new q5q((Class)UploadWorker.class).f(new fv6(new ktf((NetworkRequest)null), 4, false, false, false, false, -1L, -1L, c86.w1((Iterable)new LinkedHashSet())))).a("DatadogBackgroundUpload/".concat(s))).h(5000L, TimeUnit.MILLISECONDS);
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            ((Map)linkedHashMap).put((Object)"_dd.sdk.instanceName", (Object)s);
            final nt7 nt7 = new nt7(linkedHashMap);
            ri2.C0(nt7);
            e.d("DatadogUploadWorker", 1, (rbg)((q5q)((q5q)qbg).i(nt7)).b());
            c5q.E(rjc, 3, w, (jta)g5q.y, null, false, 56);
        }
        catch (final Exception ex) {
            c5q.F(rjc, 5, lq6.Y(w, qjc.x), (jta)g5q.z, (Throwable)ex, 48);
        }
    }
    
    public static final int O(final ukc ukc) {
        if (ukc instanceof qkc) {
            return 1;
        }
        if (ukc instanceof rkc) {
            return 2;
        }
        if (ukc instanceof pkc) {
            return 3;
        }
        if (ukc instanceof tkc) {
            return 6;
        }
        if (ukc instanceof okc) {
            return 5;
        }
        en9.r();
        return 0;
    }
    
    public static final String P(final String s) {
        return Q(Q(s, "platform", "android"), "appVersion", "1.260911.19");
    }
    
    public static final String Q(String s, final String s2, final String s3) {
        ipb b = null;
        while (true) {
            try {
                final hpb hpb = new hpb((byte)0);
                hpb.g((ipb)null, s);
                b = hpb.b();
                if (b != null) {
                    s = (String)b.g();
                    ((hpb)s).a(s2, s3);
                    s = ((hpb)s).b().i;
                }
                return s;
            }
            catch (final IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
    
    public static final void a(igf v, final gva gva, final int n) {
        gva.i0(-60983122);
        final int n2 = n | 0x6;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            final String s = soh.S(2131757001, gva);
            v = (igf)fgf.v;
            a4r.a(s, v, 0L, 0L, (dng)null, (bi2)null, (aql)null, (mnn)null, (xog)null, false, gva, 48, 1020);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new va6(v, n, (byte)9);
        }
    }
    
    public static final void b(final boolean b, final boolean b2, final lta lta, final jta jta, final jta jta2, final igf igf, q09 q09, final jta jta3, final gva gva, final int n, final int n2) {
        gva.i0(-1227421219);
        int n3;
        if (gva.g(b)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4 = n3 | n;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.g(b2)) {
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
            if (gva.h((Object)lta)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)jta)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n6 |= n8;
        }
        if ((n & 0x6000) == 0x0) {
            int n9;
            if (gva.h((Object)jta2)) {
                n9 = 16384;
            }
            else {
                n9 = 8192;
            }
            n6 |= n9;
        }
        final int n10 = n2 & 0x40;
        int n11;
        if (n10 != 0) {
            n11 = (n6 | 0x1B0000);
        }
        else {
            int n12;
            if (gva.f((Object)q09)) {
                n12 = 1048576;
            }
            else {
                n12 = 524288;
            }
            n11 = (0x30000 | n6 | n12);
        }
        final int n13 = n2 & 0x80;
        int n14;
        if (n13 != 0) {
            n14 = (n11 | 0xC00000);
        }
        else {
            int n15;
            if (gva.h((Object)jta3)) {
                n15 = 8388608;
            }
            else {
                n15 = 4194304;
            }
            n14 = (n11 | n15);
        }
        Object o4;
        jta jta6;
        if (gva.W(n14 & 0x1, (n14 & 0x492493) != 0x492492)) {
            q09 q10 = q09;
            if (n10 != 0) {
                q10 = new q09();
            }
            final cib a = bi6.a;
            jta jta4;
            if (n13 != 0) {
                Object r;
                if ((r = gva.R()) == a) {
                    r = new wl8((byte)25);
                    gva.q0(r);
                }
                jta4 = (jta)r;
            }
            else {
                jta4 = jta3;
            }
            Object o;
            if ((o = gva.R()) == a) {
                o = oz1.g(gva);
            }
            final llf llf = (llf)o;
            final boolean b3 = (n14 & 0x70) == 0x20;
            final Object r2 = gva.R();
            Object q11;
            if (b3 || (q11 = r2) == a) {
                q11 = o50.Q(Boolean.FALSE);
                gva.q0(q11);
            }
            final bnf bnf = (bnf)q11;
            final mb2 b4 = wab.B;
            final fgf v = fgf.v;
            final igf w = b.w(b.h((igf)v, 48.0f, 0.0f, 2), 0.0f, 240.0f, 1);
            final String s = soh.S(2131756999, gva);
            final iuj iuj = new iuj(0);
            final int n16 = n14 & 0x380;
            final boolean b5 = n16 == 256;
            final boolean b6 = (n14 & 0x1C00000) == 0x800000;
            final Object r3 = gva.R();
            Object o2;
            if ((b5 | b6) || (o2 = r3) == a) {
                o2 = new m09(lta, jta4, (byte)0);
                gva.q0(o2);
            }
            final igf b7 = androidx.compose.foundation.b.b(w, llf, (c)null, false, s, iuj, (jta)o2, 4);
            final moe c = rj2.c((gx)b4, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b8 = ien.B(gva, b7);
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
            k8e.P((zta)awp.y, gva, b8);
            String s2;
            if (b) {
                s2 = hia.j(gva, 1165004306, 2131757001, gva, false);
            }
            else {
                gva.g0(1755448533);
                s2 = q10.a();
                if (s2 == null) {
                    s2 = hia.j(gva, 1165006835, 2131757000, gva, false);
                }
                else {
                    gva.g0(1165006029);
                    gva.q(false);
                }
                gva.q(false);
            }
            final xog a2 = com.anthropic.claude.design.icon.a.a(lh0.G, gva);
            final cy4 a3 = qy4.a;
            a4r.a(s2, w7c.a(k((igf)v, qy4.b(gva).b), llf, (a8c)gva.j((sei)w7c.a)), 0L, 0L, (dng)null, (bi2)null, (aql)null, (mnn)null, a2, true, gva, 939524096, 252);
            final boolean b9 = n16 == 256;
            final Object r4 = gva.R();
            Object o3;
            if (b9 || (o3 = r4) == a) {
                o3 = new vm8(lta, (byte)3);
                gva.q0(o3);
            }
            omo.b(b2, (jta)o3, null, 0L, null, null, null, 0L, 0.0f, uuj.t0(-198892730, (aua)new n09(b, b2, bnf, lta, jta, q10, jta2), gva), gva, n14 >> 3 & 0xE, 48, 2044);
            gva.q(true);
            final q09 q12 = q10;
            final jta jta5 = jta4;
            o4 = v;
            q09 = q12;
            jta6 = jta5;
        }
        else {
            gva.Z();
            jta6 = jta3;
            o4 = igf;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new o09(b, b2, lta, jta, jta2, (igf)o4, q09, jta6, n, n2);
        }
    }
    
    public static final void c(final Object o, final int c, final m4d m4d, final ye6 ye6, final gva gva, final int n) {
        gva.i0(872548579);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h(o)) {
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
            if (gva.d(c)) {
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
            if (gva.h((Object)m4d)) {
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
        Label_0531: {
            if (gva.W(n8 & 0x1, (n8 & 0x493) != 0x492)) {
                final boolean f = gva.f(o);
                final boolean f2 = gva.f((Object)m4d);
                final Object r = gva.R();
                final cib a = bi6.a;
                k4d k4d;
                if ((f | f2) || (k4d = (k4d)r) == a) {
                    k4d = new k4d(o, m4d);
                    gva.q0((Object)k4d);
                }
                final k4d k4d2 = k4d;
                k4d2.c = c;
                final ksg g = k4d2.g;
                final b09 a2 = c8h.a;
                k4d k4d3 = (k4d)gva.j((sei)a2);
                final r7m a3 = q7m.a();
                lta e;
                if (a3 != null) {
                    e = a3.e();
                }
                else {
                    e = null;
                }
                final r7m b = q7m.b(a3);
                Label_0515: {
                    Label_0415: {
                        try {
                            if (k4d3 == g.getValue()) {
                                break Label_0415;
                            }
                            g.setValue((Object)k4d3);
                            if (k4d2.d <= 0) {
                                break Label_0415;
                            }
                            final k4d e2 = k4d2.e;
                            if (e2 != null) {
                                e2.b();
                            }
                        }
                        finally {
                            break Label_0515;
                        }
                        if (k4d3 != null) {
                            k4d3.a();
                        }
                        else {
                            k4d3 = null;
                        }
                        k4d2.e = k4d3;
                    }
                    q7m.d(a3, b, e);
                    final boolean f3 = gva.f((Object)k4d2);
                    final Object r2 = gva.R();
                    Object o2;
                    if (f3 || (o2 = r2) == a) {
                        o2 = new p8a((Object)k4d2, (byte)7);
                        gva.q0(o2);
                    }
                    mlc.a(k4d2, (lta)o2, gva);
                    c5q.c(a2.a((Object)k4d2), (zta)ye6, gva, (n8 >> 6 & 0x70) | 0x8);
                    break Label_0531;
                }
                q7m.d(a3, b, e);
            }
            else {
                gva.Z();
            }
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new l4d(o, c, m4d, ye6, n);
        }
    }
    
    public static final k2j d(final long n, final long n2) {
        return new k2j(Float.intBitsToFloat((int)(n >> 32)), Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)), Float.intBitsToFloat((int)(n2 >> 32)), Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)));
    }
    
    public static final k2j e(final float n, final long n2) {
        final int n3 = (int)(n2 >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n3);
        final int n4 = (int)(n2 & 0xFFFFFFFFL);
        return new k2j(intBitsToFloat - n, Float.intBitsToFloat(n4) - n, Float.intBitsToFloat(n3) + n, Float.intBitsToFloat(n4) + n);
    }
    
    public static final k2j f(final long n, final long n2) {
        final int n3 = (int)(n >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n3);
        final int n4 = (int)(n & 0xFFFFFFFFL);
        return new k2j(intBitsToFloat, Float.intBitsToFloat(n4), Float.intBitsToFloat((int)(n2 >> 32)) + Float.intBitsToFloat(n3), Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)) + Float.intBitsToFloat(n4));
    }
    
    public static final grc g(final Decoder decoder) {
        grc grc;
        if (decoder instanceof grc) {
            grc = (grc)decoder;
        }
        else {
            grc = null;
        }
        if (grc != null) {
            return grc;
        }
        uy8.o((Object)v4j.a((Class)decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }
    
    public static final prc h(final Encoder encoder) {
        prc prc;
        if (encoder instanceof prc) {
            prc = (prc)encoder;
        }
        else {
            prc = null;
        }
        if (prc != null) {
            return prc;
        }
        uy8.o((Object)v4j.a((Class)encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        return null;
    }
    
    public static final igf i(final igf igf, final float n, final float n2, final ylb ylb) {
        int n3;
        boolean b;
        if (ylb != null) {
            n3 = 0;
            b = true;
        }
        else {
            b = false;
            n3 = 3;
        }
        if (qs8.b(n, 0.0f) <= 0 || qs8.b(n2, 0.0f) <= 0) {
            final igf f = igf;
            if (!b) {
                return f;
            }
        }
        return zrn.F(igf, (lta)new ug2(n, n2, n3, (aql)ylb, b));
    }
    
    public static xll j(final Set set) {
        final xll xll = (xll)set;
        final o1e v = xll.v;
        v.c();
        if (v.D > 0) {
            return xll;
        }
        return xll.w;
    }
    
    public static final igf k(final igf igf, final aql aql) {
        return zrn.G(igf, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aql, true, 1042431);
    }
    
    public static final igf l(final igf igf) {
        return zrn.G(igf, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (aql)null, true, 1044479);
    }
    
    public static final float m(final long n, final long n2) {
        return Math.min(Float.intBitsToFloat((int)(n2 >> 32)) / Float.intBitsToFloat((int)(n >> 32)), Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)) / Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)));
    }
    
    public static final ig0 n(final ig0 ig0) {
        final ig0 c = ig0.c();
        for (int b = c.b(), i = 0; i < b; ++i) {
            c.e(i, ig0.a(i));
        }
        return c;
    }
    
    public static final File o(final Context context, final String s) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(s));
    }
    
    public static final igf p(final lta lta, final igf igf, final boolean b) {
        return igf.E((igf)new q98(lta, b));
    }
    
    public static final vsf q(final jta jta) {
        return new vsf((jta)new v24(jta, (byte)8));
    }
    
    public static final KSerializer r(final r2 r2, final jl6 jl6, final String s) {
        final KSerializer a = r2.a(jl6, s);
        if (a != null) {
            return a;
        }
        o3r.j(s, r2.c());
        throw null;
    }
    
    public static final KSerializer s(final r2 r2, final Encoder encoder, final Object o) {
        final KSerializer b = r2.b(encoder, o);
        if (b != null) {
            return b;
        }
        o3r.i(v4j.a((Class)o.getClass()), r2.c());
        throw null;
    }
    
    public static qb t(final zrc zrc) {
        Label_0212: {
            Label_0203: {
                Label_0194: {
                    long f = 0L;
                    tb x = null;
                    Label_0048: {
                        try {
                            f = zrc.o("format_version").f();
                            final irc o = zrc.o("session");
                            if (o != null) {
                                x = zn2.x(o.e());
                                break Label_0048;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0194;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0203;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0212;
                        }
                        x = null;
                    }
                    final irc o2 = zrc.o("configuration");
                    kb v;
                    if (o2 != null) {
                        v = x90.v(o2.e());
                    }
                    else {
                        v = null;
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
                    final irc o5 = zrc.o("action");
                    rb k;
                    if (o5 != null) {
                        k = v5r.k(o5.e());
                    }
                    else {
                        k = null;
                    }
                    if (f == 2L) {
                        return new qb(x, v, i, j, k);
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
    
    public static qap u(final zrc zrc) {
        Label_0155: {
            Label_0146: {
                Label_0137: {
                    Number h = null;
                    Number h2 = null;
                    Label_0046: {
                        try {
                            h = zrc.o("session_sample_rate").h();
                            final irc o = zrc.o("session_replay_sample_rate");
                            if (o != null) {
                                h2 = o.h();
                                break Label_0046;
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
                        h2 = null;
                    }
                    final irc o2 = zrc.o("profiling_sample_rate");
                    Number h3;
                    if (o2 != null) {
                        h3 = o2.h();
                    }
                    else {
                        h3 = null;
                    }
                    final irc o3 = zrc.o("trace_sample_rate");
                    Number h4;
                    if (o3 != null) {
                        h4 = o3.h();
                    }
                    else {
                        h4 = null;
                    }
                    final irc o4 = zrc.o("start_session_replay_recording_manually");
                    Boolean value;
                    if (o4 != null) {
                        value = o4.a();
                    }
                    else {
                        value = null;
                    }
                    h.getClass();
                    return new qap(h, h2, h3, h4, value);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Configuration", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Configuration", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Configuration", (Throwable)ex3);
        return null;
    }
    
    public static zrc v(final HashMap hashMap) {
        final zrc zrc = new zrc();
        for (final Map$Entry map$Entry : hashMap.entrySet()) {
            zrc.m((String)map$Entry.getKey(), (String)map$Entry.getValue());
        }
        return zrc;
    }
    
    public static final hen w(final ukc ukc) {
        if (ukc instanceof rkc) {
            final int o = O(ukc);
            final rkc rkc = (rkc)ukc;
            return new hen(o, ((skc)rkc).b(), rkc.c());
        }
        if (ukc instanceof qkc) {
            return new hen(O(ukc), ((skc)ukc).b(), (String)null);
        }
        return new hen(O(ukc), "", (String)null);
    }
    
    public static final d09 x(final mgf mgf) {
        if (((hgf)mgf).v.I) {
            return (d09)mgf.P(rml.e);
        }
        return null;
    }
    
    public static final String y(final Throwable t) {
        final String b = v4j.a((Class)t.getClass()).b();
        if (b == null) {
            String v;
            if ((v = lmf.v(t)) == null) {
                v = "UnknownThrowable";
            }
            return v;
        }
        return b;
    }
    
    public static final boolean z(final Spanned spanned, final Class clazz) {
        return spanned.nextSpanTransition(-1, ((CharSequence)spanned).length(), clazz) != ((CharSequence)spanned).length();
    }
}
