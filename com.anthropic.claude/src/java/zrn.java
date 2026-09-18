import java.util.AbstractMap;
import android.os.BaseBundle;
import java.util.regex.Pattern;
import java.util.WeakHashMap;
import java.util.Collection;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.design.icon.a;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import com.anthropic.claude.types.strings.AccountId;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import android.graphics.Matrix;
import java.util.Map$Entry;
import android.view.View;
import java.util.Iterator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.content.Context;
import java.util.Map;

public abstract class zrn
{
    public static final ye6 a;
    public static final ye6 b;
    public static jqj c;
    public static final float d = 6.0f;
    
    static {
        a = new ye6(-1169147723, false, (Object)new wp4((byte)25));
        b = new ye6(-141920831, false, (Object)new yp4((byte)11));
    }
    
    public static final void A(final Map map, final int n, final Float n2) {
        if (n2 != null) {
            map.put((Object)hia.a(n), (Object)n2);
        }
    }
    
    public static igf B(final igf igf, final long n, qs8 qs8, final int n2) {
        final boolean b = (n2 & 0x2) == 0x0;
        if ((n2 & 0x4) != 0x0) {
            qs8 = null;
        }
        return ien.l(igf, (bua)new i5a(n, qs8, (jta)new ux8((byte)11), b));
    }
    
    public static ilj C(final zrc zrc) {
        Label_0120: {
            Label_0112: {
                Label_0104: {
                    Number h = null;
                    Number h2 = null;
                    Label_0043: {
                        try {
                            h = zrc.o("session_sample_rate").h();
                            final irc o = zrc.o("session_replay_sample_rate");
                            if (o != null) {
                                h2 = o.h();
                                break Label_0043;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0104;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0112;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0120;
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
                    h.getClass();
                    return new ilj(h, h2, h3, h4);
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
    
    public static final ygm D(final xhf xhf, final int n) {
        if (n == 0) {
            xhf.getClass();
            final ygm b = xhf.b;
            b.getClass();
            return b;
        }
        if (n == 1) {
            xhf.getClass();
            final ygm c = xhf.c;
            c.getClass();
            return c;
        }
        if (n == 2) {
            xhf.getClass();
            final ygm d = xhf.d;
            d.getClass();
            return d;
        }
        if (n == 3) {
            xhf.getClass();
            final ygm e = xhf.e;
            e.getClass();
            return e;
        }
        if (n == 4) {
            xhf.getClass();
            final ygm f = xhf.f;
            f.getClass();
            return f;
        }
        if (n == 5) {
            xhf.getClass();
            final ygm g = xhf.g;
            g.getClass();
            return g;
        }
        xhf.getClass();
        final ygm b2 = xhf.b;
        b2.getClass();
        return b2;
    }
    
    public static Map E(y0k a) {
        a = a.a();
        if (a != null) {
            final Map b = a.b();
            if (b != null) {
                return b;
            }
        }
        return (Map)s89.v;
    }
    
    public static final igf F(final igf igf, final lta lta) {
        return igf.E((igf)new ye2(lta));
    }
    
    public static igf G(final igf igf, float n, float n2, float n3, float n4, float n5, aql k, boolean b, int n6) {
        if ((n6 & 0x1) != 0x0) {
            n = 1.0f;
        }
        if ((n6 & 0x2) != 0x0) {
            n2 = 1.0f;
        }
        if ((n6 & 0x4) != 0x0) {
            n3 = 1.0f;
        }
        if ((n6 & 0x20) != 0x0) {
            n4 = 0.0f;
        }
        if ((n6 & 0x100) != 0x0) {
            n5 = 0.0f;
        }
        final long b2 = jeo.b;
        if ((n6 & 0x800) != 0x0) {
            k = (aql)zn2.k;
        }
        final int n7 = 0;
        if ((n6 & 0x1000) != 0x0) {
            b = false;
        }
        final long a = k6b.a;
        if ((n6 & 0x10000) != 0x0) {
            n6 = n7;
        }
        else {
            n6 = 1;
        }
        return igf.E((igf)new h6b(n, n2, n3, 0.0f, n4, n5, b2, k, b, a, a, n6, czc.a));
    }
    
    public static igf H(final igf igf, final float n, final float n2, final float n3, final float n4, final aql aql) {
        final long b = jeo.b;
        final long a = k6b.a;
        return igf.E((igf)new h6b(n, n2, n3, n4, 0.0f, 0.0f, b, aql, true, a, a, 1, czc.a));
    }
    
    public static void I(final Context context) {
        if (omo.J(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        while (true) {
            try {
                final Context applicationContext = context.getApplicationContext();
                final PackageManager packageManager = applicationContext.getPackageManager();
                boolean boolean1 = false;
                Label_0081: {
                    if (packageManager != null) {
                        final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                        if (applicationInfo != null) {
                            final Bundle metaData = applicationInfo.metaData;
                            if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_messaging_notification_delegation_enabled")) {
                                boolean1 = ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_messaging_notification_delegation_enabled");
                                break Label_0081;
                            }
                        }
                    }
                    boolean1 = true;
                }
                if (Build$VERSION.SDK_INT >= 29) {
                    new zfi(context, boolean1, new qcn()).run();
                }
                else {
                    ri2.I((Object)null);
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public static final boolean J(final zsk zsk) {
        return zsk.k().v.c((Object)etk.B);
    }
    
    public static final LinkedHashMap K(final lta lta, final List list) {
        final HashMap hashMap = new HashMap();
        int v;
        if ((v = z5e.V(d86.p0((Iterable)list, 10))) < 16) {
            v = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(v);
        for (final Object next : list) {
            final Object b = lta.b(next);
            final Integer n = (Integer)hashMap.get(b);
            int n2;
            if (n != null) {
                n2 = n + 1;
            }
            else {
                n2 = 0;
            }
            hashMap.put(b, (Object)n2);
            ((Map)linkedHashMap).put((Object)new vmc(n2, b), next);
        }
        return linkedHashMap;
    }
    
    public static final igf L(final igf igf, final lta lta) {
        return igf.E((igf)new n9m(lta));
    }
    
    public static final igf M(final igf igf, final lta lta) {
        return igf.E((igf)new y8g(lta));
    }
    
    public static final long N(final long n, final long n2) {
        return (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n >> 32)) + (int)(n2 >> 32)) << 32 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) + (int)(n2 & 0xFFFFFFFFL)) & 0xFFFFFFFFL);
    }
    
    public static final bnf O(final String s, final jta jta, final jta jta2, sx4 sx4, final gva gva, final int n, int n2) {
        final cib a = bi6.a;
        if ((n2 & 0x8) != 0x0) {
            final odk a2 = ii8.a(gva);
            final boolean f = gva.f((Object)null);
            final boolean f2 = gva.f((Object)a2);
            final Object r = gva.R();
            if ((f | f2) || (sx4 = (sx4)r) == a) {
                sx4 = (sx4)a2.d((Class)sx4.class, (emi)null);
                gva.q0((Object)sx4);
            }
            sx4 = sx4;
        }
        final odk a3 = ii8.a(gva);
        final boolean f3 = gva.f((Object)null);
        final boolean f4 = gva.f((Object)a3);
        final Object r2 = gva.R();
        Object o;
        if ((f3 | f4) || (o = r2) == a) {
            o = a3.d((Class)shb.class, (emi)null);
            gva.q0(o);
        }
        final shb shb = (shb)o;
        final int n3 = 1;
        if ((((n & 0xE) ^ 0x6) > 4 && gva.f((Object)s)) || (n & 0x6) == 0x4) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final boolean h = gva.h((Object)shb);
        int n4 = 0;
        Label_0266: {
            if (((n & 0x380) ^ 0x180) > 256) {
                n4 = n3;
                if (gva.f((Object)jta2)) {
                    break Label_0266;
                }
            }
            if ((n & 0x180) == 0x100) {
                n4 = n3;
            }
            else {
                n4 = 0;
            }
        }
        final Object r3 = gva.R();
        Object o2;
        if ((n2 | (h ? 1 : 0) | n4) != 0x0 || (o2 = r3) == a) {
            o2 = new qn1((Object)s, (Object)shb, (Object)jta2, (byte)20);
            gva.q0(o2);
        }
        return Q(jta, (jta)o2, null, null, sx4, gva, (n >> 3 & 0xE) | (0xE000 & n << 3), 12);
    }
    
    public static final q2h P(final jta jta, final gva gva) {
        final odk a = ii8.a(gva);
        final boolean f = gva.f((Object)null);
        final boolean f2 = gva.f((Object)a);
        final Object r = gva.R();
        final cib a2 = bi6.a;
        Object o;
        if ((f | f2) || (o = r) == a2) {
            o = a.d((Class)shb.class, (emi)null);
            gva.q0(o);
        }
        final shb shb = (shb)o;
        final boolean h = gva.h((Object)shb);
        final boolean f3 = gva.f((Object)jta);
        final Object r2 = gva.R();
        Object o2;
        if ((h | f3) || (o2 = r2) == a2) {
            o2 = new tyl((Object)shb, (Object)jta, (byte)3);
            gva.q0(o2);
        }
        return c5q.H("android.permission.RECORD_AUDIO", (lta)o2, gva, 0);
    }
    
    public static final bnf Q(final jta jta, final jta jta2, jta jta3, zta zta, final sx4 sx4, final gva gva, int n, int n2) {
        if ((n2 & 0x4) != 0x0) {
            jta3 = null;
        }
        if ((n2 & 0x8) != 0x0) {
            zta = null;
        }
        final View view = (View)gva.j((sei)q50.f);
        final Object r = gva.R();
        final cib a = bi6.a;
        Object q;
        if ((q = r) == a) {
            q = o50.Q((Object)Boolean.FALSE);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        Object o;
        if ((o = gva.R()) == a) {
            o = o50.Q((Object)Boolean.FALSE);
            gva.q0(o);
        }
        final bnf bnf2 = (bnf)o;
        Object r2;
        if ((r2 = gva.R()) == a) {
            r2 = new s8k((byte)19);
            gva.q0(r2);
        }
        final bnf bnf3 = (bnf)mlc.a0(new Object[0], (jta)r2, gva, 48);
        if ((((n & 0x1C00) ^ 0xC00) > 2048 && gva.f((Object)zta)) || (n & 0xC00) == 0x800) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final boolean f = gva.f((Object)bnf3);
        final int n3 = (0xE000 & n) ^ 0x6000;
        boolean b = false;
        Label_0296: {
            if (n3 <= 16384 || !gva.h((Object)sx4)) {
                if ((n & 0x6000) != 0x4000) {
                    b = false;
                    break Label_0296;
                }
            }
            b = true;
        }
        final boolean h = gva.h((Object)view);
        final int n4 = (n & 0xE) ^ 0x6;
        final int n5 = n2 | (f ? 1 : 0) | (b ? 1 : 0) | (h ? 1 : 0) | (((n4 > 4 && gva.f((Object)jta)) || (n & 0x6) == 0x4) ? 1 : 0);
        Label_0411: {
            if (((n & 0x70) ^ 0x30) <= 32 || !gva.f((Object)jta2)) {
                if ((n & 0x30) != 0x20) {
                    n2 = 0;
                    break Label_0411;
                }
            }
            n2 = 1;
        }
        final Object r3 = gva.R();
        Object o2;
        if ((n5 | n2) == 0x0 && r3 != a) {
            o2 = r3;
        }
        else {
            o2 = new mv4((Object)bnf, (Object)bnf2, (Object)zta, (Object)bnf3, (Object)sx4, (Object)view, (Object)jta, (Object)jta2, (byte)2);
            gva.q0(o2);
        }
        final q2h h2 = c5q.H("android.permission.RECORD_AUDIO", (lta)o2, gva, 0);
        final boolean f2 = gva.f((Object)h2);
        if ((n3 > 16384 && gva.h((Object)sx4)) || (n & 0x6000) == 0x4000) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final boolean h3 = gva.h((Object)view);
        final boolean b2 = (n4 > 4 && gva.f((Object)jta)) || (n & 0x6) == 0x4;
        final boolean f3 = gva.f((Object)bnf3);
        if ((((n & 0x380) ^ 0x180) > 256 && gva.f((Object)jta3)) || (n & 0x180) == 0x100) {
            n = 1;
        }
        else {
            n = 0;
        }
        final Object r4 = gva.R();
        Object o3;
        if (((f2 ? 1 : 0) | n2 | (h3 ? 1 : 0) | (b2 ? 1 : 0) | (f3 ? 1 : 0) | n) != 0x0 || (o3 = r4) == a) {
            o3 = new e0n(h2, sx4, view, jta, bnf2, bnf, bnf3, jta3);
            gva.q0(o3);
        }
        return o50.W((Object)o3, gva);
    }
    
    public static final long R(long n) {
        final int round = Math.round(Float.intBitsToFloat((int)(n >> 32)));
        final int round2 = Math.round(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)));
        n = round;
        return ((long)round2 & 0xFFFFFFFFL) | n << 32;
    }
    
    public static final List S(final izp izp, final boolean b, final Map map) {
        Object o = izp.v;
        if (!b) {
            o = c86.X0((Iterable)o, (Object)cwp.L);
        }
        if (izp != izp.z) {
            return (List)o;
        }
        final List a = izp.a(b);
        cwp.x.getClass();
        final List y0 = c86.Y0((Iterable)a, (Iterable)cwp.y);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map$Entry map$Entry : map.entrySet()) {
            if (y0.contains((Object)map$Entry.getKey())) {
                ((AbstractMap)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
            }
        }
        return xkq.e((List)o, linkedHashMap);
    }
    
    public static final void T(final Matrix matrix, final float[] values) {
        final float n = values[0];
        final float n2 = values[1];
        final float n3 = values[2];
        final float n4 = values[3];
        final float n5 = values[4];
        final float n6 = values[5];
        final float n7 = values[6];
        final float n8 = values[7];
        final float n9 = values[8];
        final float n10 = values[12];
        final float n11 = values[13];
        final float n12 = values[15];
        values[0] = n;
        values[1] = n5;
        values[2] = n10;
        values[3] = n2;
        values[4] = n6;
        values[5] = n11;
        values[6] = n4;
        values[7] = n8;
        values[8] = n12;
        matrix.setValues(values);
        values[0] = n;
        values[1] = n2;
        values[2] = n3;
        values[3] = n4;
        values[4] = n5;
        values[5] = n6;
        values[6] = n7;
        values[7] = n8;
        values[8] = n9;
    }
    
    public static final void U(final Matrix matrix, final float[] array) {
        matrix.getValues(array);
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[2];
        final float n4 = array[3];
        final float n5 = array[4];
        final float n6 = array[5];
        final float n7 = array[6];
        final float n8 = array[7];
        final float n9 = array[8];
        array[0] = n;
        array[1] = n4;
        array[2] = 0.0f;
        array[3] = n7;
        array[4] = n2;
        array[5] = n5;
        array[6] = 0.0f;
        array[7] = n8;
        array[9] = (array[8] = 0.0f);
        array[10] = 1.0f;
        array[11] = 0.0f;
        array[12] = n3;
        array[13] = n6;
        array[14] = 0.0f;
        array[15] = n9;
    }
    
    public static final jw2 V(final ChatConversationWithProjectReference chatConversationWithProjectReference, final jqc jqc) {
        return new jw2(chatConversationWithProjectReference.a, chatConversationWithProjectReference.c, jqc.c((Object)chatConversationWithProjectReference, (KSerializer)ChatConversationWithProjectReference.Companion.serializer()));
    }
    
    public static final ArrayList W(List a, final jqc jqc) {
        final ArrayList list = new ArrayList();
        for (final jw2 jw2 : a) {
            ChatConversationWithProjectReference chatConversationWithProjectReference = null;
            Label_0097: {
                try {
                    chatConversationWithProjectReference = (ChatConversationWithProjectReference)jqc.b(jw2.c, (KSerializer)ChatConversationWithProjectReference.Companion.serializer());
                    break Label_0097;
                }
                catch (final Exception ex) {
                    a = adn.a;
                    adn.f((Throwable)ex, smk.s("Failed to deserialize conversation ", jw2.a), lpl.w, (Map)null, (List)null, 56);
                    chatConversationWithProjectReference = null;
                }
            }
            if (chatConversationWithProjectReference != null) {
                list.add((Object)chatConversationWithProjectReference);
            }
        }
        return list;
    }
    
    public static final ygm X(final int n, final gva gva) {
        return D(((e8e)gva.j((sei)h8e.a)).d, n);
    }
    
    public static yog Y(final String s) {
        final ReentrantReadWriteLock$ReadLock lock = v6.d.readLock();
        lock.lock();
        Label_0078: {
            int intValue = 0;
            Label_0054: {
                try {
                    final Integer n = (Integer)v6.e.get((Object)new AccountId(s));
                    if (n != null) {
                        intValue = n;
                        break Label_0054;
                    }
                }
                finally {
                    break Label_0078;
                }
                intValue = 0;
            }
            final yog yog = new yog((Object)intValue, (Object)v6.f);
            lock.unlock();
            return yog;
        }
        lock.unlock();
    }
    
    public static yb0 a(final jta jta, final jta jta2, final jta jta3, final lta lta, final lta lta2, final vhk vhk, final jta jta4, s8o s8o, final lta lta3, final int n) {
        final h64 h64 = new h64((byte)16);
        if ((n & 0x100) != 0x0) {
            s8o = null;
        }
        return new yb0(vhk, jta, jta2, jta4, (jta)h64, lta2, (zta)s8o, lta, jta3, lta3);
    }
    
    public static final void b(final String s, final String s2, final jta jta, final gva gva, final int n) {
        gva.i0(1094008569);
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
            if (gva.f((Object)s2)) {
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
            if (gva.h((Object)jta)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            n(0L, uuj.t0(-114408505, (aua)new k26((Object)s, (Object)jta, (Object)s2, (byte)10), gva), gva, 48, 1);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new yl8(n, (Object)s, (Object)s2, (Object)jta, (byte)2);
        }
    }
    
    public static do1 c(final int n, final jta jta, boolean b) {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        return new do1(b, 0, (k38)null, (a0)null, (kr)null, jta);
    }
    
    public static rxf d(final jta jta, final jta jta2, final lta lta, final jta jta3, final lta lta2, final vhk vhk, rv3 rv3, final s8o s8o, n8o n8o, m8o m8o, final int n) {
        if ((n & 0x40) != 0x0) {
            rv3 = (rv3)new kh0((byte)27);
        }
        if ((n & 0x100) != 0x0) {
            n8o = (n8o)new jkn((byte)25);
        }
        if ((n & 0x200) != 0x0) {
            m8o = (m8o)new smn((byte)24);
        }
        return new rxf((Object)vhk, (Object)jta, (Object)jta2, (Object)rv3, (aua)lta2, (zta)s8o, (aua)lta, (Object)jta3, (aua)n8o, (Object)m8o, (byte)4);
    }
    
    public static final void e(final li9 li9, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-1336336266);
        int n2;
        if (gva.h((Object)li9)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
            final odk a = ii8.a(gva);
            final boolean f = gva.f((Object)null);
            final boolean f2 = gva.f((Object)a);
            final Object r = gva.R();
            Object o;
            if ((f | f2) || (o = r) == bi6.a) {
                o = a.d((Class)vsi.class, (emi)null);
                gva.q0(o);
            }
            final vsi vsi = (vsi)o;
            final hdk hdk = new hdk(3);
            final ArrayList list = (ArrayList)hdk.v;
            hdk.c((Object)oiq.k(gva));
            final b09 b = ion.b;
            vsi.getClass();
            hdk.a((Object)b.a((Object)Boolean.FALSE));
            hdk.a((Object)mi9.b().a((Object)li9));
            c5q.d((ffi[])list.toArray((Object[])new ffi[list.size()]), (zta)uuj.t0(-489253962, (aua)new bc3(ye6, (byte)1), gva), gva, 48);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new n84((Object)li9, (Object)ye6, n, (byte)10);
        }
    }
    
    public static final void f(final int n, final int n2, final jta jta, final gva gva, igf v, final String s, boolean b) {
        gva.i0(-1819771885);
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
        int n8;
        if (n7 != 0) {
            n8 = (n5 | 0x180);
        }
        else {
            int n9;
            if (gva.f((Object)v)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n5 | n9);
        }
        final int n10 = n2 & 0x8;
        int n11;
        if (n10 != 0) {
            n11 = (n8 | 0xC00);
        }
        else {
            int n12;
            if (gva.g(b)) {
                n12 = 2048;
            }
            else {
                n12 = 1024;
            }
            n11 = (n8 | n12);
        }
        if (gva.W(n11 & 0x1, (n11 & 0x493) != 0x492)) {
            if (n7 != 0) {
                v = (igf)fgf.v;
            }
            if (n10 != 0) {
                b = true;
            }
            h(com.anthropic.claude.design.icon.a.a(lh0.f, gva), s, v, b, 0L, 20.0f, jta, gva, (n11 << 3 & 0x70) | 0x30008 | (n11 & 0x380) | (n11 & 0x1C00) | (n11 << 15 & 0x380000), 16);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ii6(n, n2, jta, v, s, b);
        }
    }
    
    public static final void g(final jta jta, final xzb xzb, igf v, boolean b, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(-1665004586);
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
        int n5 = n4;
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.f((Object)xzb)) {
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
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0225: {
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
                    break Label_0225;
                }
            }
            n14 = n12;
        }
        int n15 = n14;
        if ((n & 0x6000) == 0x0) {
            int n16;
            if (gva.h((Object)ye6)) {
                n16 = 16384;
            }
            else {
                n16 = 8192;
            }
            n15 = (n14 | n16);
        }
        if (gva.W(n15 & 0x1, (n15 & 0x2493) != 0x2492)) {
            if (n7 != 0) {
                v = (igf)fgf.v;
            }
            if (n11 != 0) {
                b = true;
            }
            long n17;
            if (b) {
                n17 = xzb.a;
            }
            else {
                n17 = xzb.c;
            }
            long n18;
            if (b) {
                n18 = xzb.b;
            }
            else {
                n18 = xzb.d;
            }
            c5q.c(ge9.n(n18, dx6.a), (zta)uuj.t0(-1194389738, (aua)new ki6(v, n17, b, jta, ye6), gva), gva, 56);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new li6(jta, xzb, v, b, ye6, n, n2);
        }
    }
    
    public static final void h(final xog xog, final String s, igf v, boolean b, long o, float n, final jta jta, final gva gva, final int n2, final int n3) {
        gva.i0(296370115);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            boolean b2;
            if ((n2 & 0x8) == 0x0) {
                b2 = gva.f((Object)xog);
            }
            else {
                b2 = gva.h((Object)xog);
            }
            int n4;
            if (b2) {
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
                    if (gva.f((Object)v)) {
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
                    if (gva.g(b)) {
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
        if ((n2 & 0x6000) == 0x0) {
            int n16;
            if ((n3 & 0x10) == 0x0 && gva.e(o)) {
                n16 = 16384;
            }
            else {
                n16 = 8192;
            }
            n15 |= n16;
        }
        final int n17 = n3 & 0x20;
        int n20 = 0;
        Label_0367: {
            int n18;
            if (n17 != 0) {
                n18 = (n15 | 0x30000);
            }
            else {
                n18 = n15;
                if ((0x30000 & n2) == 0x0) {
                    int n19;
                    if (gva.c(n)) {
                        n19 = 131072;
                    }
                    else {
                        n19 = 65536;
                    }
                    n20 = (n15 | n19);
                    break Label_0367;
                }
            }
            n20 = n18;
        }
        if ((0x180000 & n2) == 0x0) {
            int n21;
            if (gva.h((Object)jta)) {
                n21 = 1048576;
            }
            else {
                n21 = 524288;
            }
            n20 |= n21;
        }
        final boolean b3 = true;
        if (gva.W(n20 & 0x1, (0x92493 & n20) != 0x92492)) {
            gva.b0();
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                if (n8 != 0) {
                    v = (igf)fgf.v;
                }
                if (n12 != 0) {
                    b = b3;
                }
                if ((n3 & 0x10) != 0x0) {
                    final cy4 a = qy4.a;
                    o = qy4.a(gva).O;
                }
                if (n17 != 0) {
                    n = 24.0f;
                }
            }
            gva.r();
            float n22;
            if (b) {
                n22 = 1.0f;
            }
            else {
                n22 = 0.4f;
            }
            c5q.c(ge9.n(o, dx6.a), (zta)uuj.t0(-405830525, (aua)new gi6(v, n22, b, jta, xog, s, n), gva), gva, 56);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new hi6(xog, s, v, b, o, n, jta, n2, n3);
        }
    }
    
    public static final void i(final int n, final int n2, final jta jta, final gva gva, igf v, final String s) {
        gva.i0(-405426211);
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
        if (gva.W(n8 & 0x1, (n8 & 0x93) != 0x92)) {
            if (n7 != 0) {
                v = (igf)fgf.v;
            }
            final xog a = com.anthropic.claude.design.icon.a.a(lh0.s1, gva);
            final cy4 a2 = qy4.a;
            h(a, s, v, false, qy4.a(gva).P, 20.0f, jta, gva, (n8 << 3 & 0x70) | 0x30008 | (n8 & 0x380) | (n8 << 15 & 0x380000), 8);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ei6(n, n2, jta, v, s);
        }
    }
    
    public static final void j(final boolean b, final boolean b2, final String s, final jta jta, igf v, xzb j, final gva gva, final int n, final int n2) {
        gva.i0(-1091350627);
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
        int n7 = n5;
        if ((n & 0x180) == 0x0) {
            int n8;
            if (gva.f((Object)s)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        int n10;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.h((Object)jta)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n10 = (n7 | n9);
        }
        else {
            n10 = n7;
        }
        final int n11 = n2 & 0x10;
        int n12;
        if (n11 != 0) {
            n12 = (n10 | 0x6000);
        }
        else {
            n12 = n10;
            if ((n & 0x6000) == 0x0) {
                int n13;
                if (gva.f((Object)v)) {
                    n13 = 16384;
                }
                else {
                    n13 = 8192;
                }
                n12 = (n10 | n13);
            }
        }
        int n14;
        if ((n2 & 0x20) == 0x0 && gva.f((Object)j)) {
            n14 = 131072;
        }
        else {
            n14 = 65536;
        }
        final int n15 = n12 | n14;
        if (gva.W(n15 & 0x1, (n15 & 0x12493) != 0x12492)) {
            gva.b0();
            int n16;
            xzb xzb;
            igf igf2;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n16 = n15;
                if ((n2 & 0x20) != 0x0) {
                    n16 = (n15 & 0xFFF8FFFF);
                }
                final igf igf = v;
                xzb = j;
                igf2 = igf;
            }
            else {
                if (n11 != 0) {
                    v = (igf)fgf.v;
                }
                if ((n2 & 0x20) != 0x0) {
                    final cy4 a = qy4.a;
                    j = lq6.J(qy4.a(gva).e, qy4.a(gva).H, j86.b(0.4f, qy4.a(gva).e), j86.b(0.4f, qy4.a(gva).H), gva, 24576, 0);
                    n16 = (n15 & 0xFFF8FFFF);
                }
                else {
                    n16 = n15;
                }
                final igf igf3 = v;
                xzb = j;
                igf2 = igf3;
            }
            gva.r();
            final boolean b3 = (n16 & 0x380) == 0x100;
            final Object r = gva.R();
            Object o;
            if (b3 || (o = r) == bi6.a) {
                o = new fs5(s, (byte)12);
                gva.q0(o);
            }
            g(jta, xzb, wsk.b((lta)o, igf2, false), b, uuj.t0(282920571, (aua)new xq2(b2, (Object)xzb, (byte)3), gva), gva, (n16 >> 9 & 0xE) | 0x6000 | (n16 >> 12 & 0x70) | (n16 << 9 & 0x1C00), 0);
            final xzb xzb2 = xzb;
            v = igf2;
            j = xzb2;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ji6(b, b2, s, jta, v, j, n, n2);
        }
    }
    
    public static final void k(final int n, final int n2, final jta jta, final gva gva, igf v, final String s, final boolean b) {
        gva.i0(113482192);
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
            if (gva.f((Object)s)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
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
        final int n9 = n2 & 0x8;
        int n10;
        if (n9 != 0) {
            n10 = (n7 | 0xC00);
        }
        else {
            n10 = n7;
            if ((n & 0xC00) == 0x0) {
                int n11;
                if (gva.f((Object)v)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n7 | n11);
            }
        }
        if (gva.W(n10 & 0x1, (n10 & 0x493) != 0x492)) {
            if (n9 != 0) {
                v = (igf)fgf.v;
            }
            final cy4 a = qy4.a;
            g(jta, lq6.J(qy4.a(gva).u0, qy4.a(gva).O, 0L, 0L, gva, 24576, 12), v, false, uuj.t0(-1543760590, (aua)new zq2(s, b, (byte)1), gva), gva, (n10 >> 6 & 0xE) | 0x6000 | (n10 >> 3 & 0x380), 8);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ek2(n, n2, jta, v, s, b);
        }
    }
    
    public static final void l(final xog xog, final String s, final boolean b, final lta lta, igf v, boolean b2, final gva gva, final int n, final int n2) {
        gva.i0(605453284);
        int n3;
        if (gva.h((Object)xog)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4 = n3 | n;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.f((Object)s)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 |= n5;
        }
        int n6;
        if (gva.g(b)) {
            n6 = 256;
        }
        else {
            n6 = 128;
        }
        int n8;
        final int n7 = n8 = (n4 | n6);
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.h((Object)lta)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n7 | n9);
        }
        final int n10 = n2 & 0x10;
        int n11;
        if (n10 != 0) {
            n11 = (n8 | 0x6000);
        }
        else {
            n11 = n8;
            if ((n & 0x6000) == 0x0) {
                int n12;
                if (gva.f((Object)v)) {
                    n12 = 16384;
                }
                else {
                    n12 = 8192;
                }
                n11 = (n8 | n12);
            }
        }
        final int n13 = n2 & 0x20;
        int n14;
        if (n13 != 0) {
            n14 = (n11 | 0x30000);
        }
        else {
            int n15;
            if (gva.g(b2)) {
                n15 = 131072;
            }
            else {
                n15 = 65536;
            }
            n14 = (n11 | n15);
        }
        if (gva.W(n14 & 0x1, (0x12493 & n14) != 0x12492)) {
            if (n10 != 0) {
                v = (igf)fgf.v;
            }
            if (n13 != 0) {
                b2 = true;
            }
            long n16;
            if (!b2) {
                gva.g0(2020029835);
                final cy4 a = qy4.a;
                n16 = qy4.a(gva).Q;
                gva.q(false);
            }
            else if (b) {
                gva.g0(2020031318);
                final cy4 a2 = qy4.a;
                n16 = qy4.a(gva).m;
                gva.q(false);
            }
            else {
                gva.g0(2020033035);
                final cy4 a3 = qy4.a;
                n16 = qy4.a(gva).O;
                gva.q(false);
            }
            c5q.c(ge9.n(n16, dx6.a), (zta)uuj.t0(312069924, (aua)new m71(v, b, b2, lta, xog, s), gva), gva, 56);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ji6(xog, s, b, lta, v, b2, n, n2);
        }
    }
    
    public static final void m(final int n, final gva gva) {
        gva.i0(-956048788);
        if (gva.W(n & 0x1, n != 0)) {
            final odk a = ii8.a(gva);
            final boolean f = gva.f((Object)null);
            final boolean f2 = gva.f((Object)a);
            final Object r = gva.R();
            final cib a2 = bi6.a;
            Object o;
            if ((f | f2) || (o = r) == a2) {
                o = a.d((Class)eni.class, (emi)null);
                gva.q0(o);
            }
            final eni eni = (eni)o;
            final boolean h = gva.h((Object)eni);
            final Object r2 = gva.R();
            Object o2;
            if (h || (o2 = r2) == a2) {
                o2 = new pn((byte)9, (f07)null, (Object)eni);
                gva.q0(o2);
            }
            final zta zta = (zta)o2;
            final ArrayList e = eni.e;
            mlc.f(zta, gva, (Object)eni);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new rg6(n);
        }
    }
    
    public static final void n(long v0, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(2105571773);
        int n3;
        if ((n2 & 0x1) == 0x0 && gva.e(v0)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        final int n4 = n3 | n;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else if ((n2 & 0x1) != 0x0) {
                final cy4 a = qy4.a;
                v0 = qy4.a(gva).v0;
            }
            gva.r();
            final igf v2 = omo.V(rhc.h(androidx.compose.foundation.layout.b.d((igf)fgf.v, 1.0f), v0, (aql)ovj.b(16.0f)), 12.0f, 12.0f);
            final jzj a2 = hzj.a((gv0)new hv0(8.0f, true, (iv0)new en9((byte)2)), wab.H, gva, 54);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, v2);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)a2);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b);
            ye6.h((Object)mzj.a, (Object)gva, (Object)54);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new om8(v0, ye6, n, n2);
        }
    }
    
    public static final void o(final kzj kzj, final lh0 lh0, final long n, final ye6 ye6, final gva gva, final int n2) {
        gva.i0(293523811);
        int n4;
        if ((n2 & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)kzj)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x30) == 0x0) {
            int n6;
            if (gva.f((Object)lh0)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n2 & 0x180) == 0x0) {
            int n8;
            if (gva.e(n)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        int n9 = n7;
        if ((n2 & 0xC00) == 0x0) {
            int n10;
            if (gva.h((Object)ye6)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n7 | n10);
        }
        if (gva.W(n9 & 0x1, (n9 & 0x493) != 0x492)) {
            gva.b0();
            if ((n2 & 0x1) != 0x0) {
                if (!gva.C()) {
                    gva.Z();
                }
            }
            gva.r();
            final hv0 hv0 = new hv0(8.0f, true, (iv0)new en9((byte)2));
            final lb2 h = wab.H;
            final igf a = kzj.a((igf)fgf.v, 1.0f, true);
            final jzj a2 = hzj.a((gv0)hv0, h, gva, 54);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, a);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)a2);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b);
            if (lh0 != null) {
                gva.g0(423455089);
                o50.e(lh0, (String)null, (igf)null, d93.w, n, gva, (n9 >> 3 & 0xE) | 0xC30 | (n9 << 6 & 0xE000), 4);
                gva.q(false);
            }
            else {
                gva.g0(423564643);
                gva.q(false);
            }
            ye6.h((Object)mzj.a, (Object)gva, (Object)((n9 >> 6 & 0x70) | 0x6));
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new pm8((byte)0, n2, n, (Object)kzj, (Object)lh0, (Object)ye6);
        }
    }
    
    public static final void p(final jta jta, String s, long p6, final gva gva, final int n, final int n2) {
        gva.i0(1295134816);
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
                    if (gva.f((Object)s)) {
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
        String s2 = s;
        if ((n & 0x180) == 0x0) {
            int n9;
            if ((n2 & 0x4) == 0x0 && gva.e(p6)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 |= n9;
        }
        long n11 = 0L;
        if (gva.W(n8 & 0x1, (n8 & 0x93) != 0x92)) {
            gva.b0();
            int n10 = 0;
            Label_0258: {
                if ((n & 0x1) != 0x0 && !gva.C()) {
                    gva.Z();
                    n10 = n8;
                    s = s2;
                    n11 = p6;
                    if ((n2 & 0x4) == 0x0) {
                        break Label_0258;
                    }
                    s = s2;
                }
                else {
                    if (n5 != 0) {
                        s2 = null;
                    }
                    n10 = n8;
                    s = s2;
                    n11 = p6;
                    if ((n2 & 0x4) == 0x0) {
                        break Label_0258;
                    }
                    final cy4 a = qy4.a;
                    p6 = qy4.a(gva).P;
                    s = s2;
                }
                n10 = (n8 & 0xFFFFFC7F);
                n11 = p6;
            }
            gva.r();
            final lh0 m2 = lh0.M2;
            String j;
            if (s == null) {
                j = hia.j(gva, -915947325, 2131757178, gva, false);
            }
            else {
                gva.g0(-915948007);
                gva.q(false);
                j = s;
            }
            final up2 up2 = new up2(new j86(n11), 2);
            final fgf v = fgf.v;
            final qp2 a2 = qp2.a;
            m6r.a(m2, j, androidx.compose.foundation.layout.b.y(androidx.compose.foundation.layout.b.f((igf)v, a2.a(gva)), (lb2)null, 1), false, (rp2)a2, (cq2)up2, (bua)null, jta, gva, 0x6000 | (n10 << 21 & 0x1C00000), 72);
        }
        else {
            gva.Z();
            s = s2;
            n11 = p6;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new a88(jta, s, n11, n, n2);
        }
    }
    
    public static final void q(final q6m a, final igf igf, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-977568115);
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
            if (gva.h((Object)ye6)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        final boolean b = true;
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final String d = twl.D(2131757488, gva);
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new Object();
                ((y3a)r).a = new Object();
                ((y3a)r).b = new ArrayList();
                gva.q0(r);
            }
            final y3a y3a = (y3a)r;
            final Object a2 = y3a.a;
            final ArrayList b2 = y3a.b;
            boolean b3;
            if (!mlc.q((Object)a, a2)) {
                gva.g0(1441886385);
                y3a.a = a;
                final ArrayList list = new ArrayList(b2.size());
                for (int size = ((Collection)b2).size(), i = 0; i < size; ++i) {
                    list.add((Object)((x3a)b2.get(i)).c());
                }
                final ArrayList list2 = new ArrayList((Collection)list);
                if (!list2.contains((Object)a)) {
                    list2.add((Object)a);
                }
                b2.clear();
                final ArrayList list3 = new ArrayList(list2.size());
                for (int size2 = list2.size(), j = 0; j < size2; ++j) {
                    final Object value = list2.get(j);
                    if (value != null) {
                        list3.add(value);
                    }
                }
                final int size3 = list3.size();
                int k = 0;
                b3 = b;
                while (k < size3) {
                    final q6m q6m = (q6m)list3.get(k);
                    b2.add((Object)new x3a(q6m, uuj.t0(-1952400805, (aua)new d4d((Object)q6m, (Object)a, (Object)y3a, (Object)d, (byte)2), gva)));
                    ++k;
                }
                gva.q(false);
            }
            else {
                b3 = true;
                gva.g0(1443889109);
                gva.q(false);
            }
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b4 = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)c);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b4);
            final b0j b5 = gva.B();
            if (b5 == null) {
                en9.q("no recompose scope found");
                return;
            }
            b5.b |= 0x1;
            y3a.c = b5;
            gva.g0(-1888182177);
            for (int size4 = b2.size(), n8 = 0; n8 < size4; ++n8) {
                final x3a x3a = (x3a)b2.get(n8);
                final q6m q6m2 = (q6m)x3a.a();
                final bua b6 = x3a.b();
                gva.d0(1325010085, (Object)q6m2);
                ((ye6)b6).h((Object)uuj.t0(-1893791890, (aua)new txf((Object)ye6, (Object)q6m2, (byte)11), gva), (Object)gva, (Object)6);
                gva.q(false);
            }
            gva.q(false);
            gva.q(b3);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0((Object)a, igf, (zta)ye6, n, (byte)14);
        }
    }
    
    public static final void r(final boolean b, final float n, final xao xao, final ye6 ye6, final gva gva, final int n2) {
        gva.i0(1804769209);
        int n4;
        if ((n2 & 0x6) == 0x0) {
            int n3;
            if (gva.g(b)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x30) == 0x0) {
            int n6;
            if (gva.c(n)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n2 & 0x180) == 0x0) {
            int n8;
            if (gva.f((Object)xao)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        int n9 = n7;
        if ((n2 & 0xC00) == 0x0) {
            int n10;
            if (gva.h((Object)ye6)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n7 | n10);
        }
        if (gva.W(n9 & 0x1, (n9 & 0x493) != 0x492)) {
            final fgf v = fgf.v;
            igf igf;
            if (b) {
                igf = B((igf)v, xao.a, new qs8(0.2876f * n), 10);
            }
            else {
                igf = rhc.h((igf)v, xao.a, (aql)zn2.k);
            }
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)c);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b2);
            ye6.h((Object)xao.b(xao, j86.g, 0L, 62), (Object)gva, (Object)(n9 >> 6 & 0x70));
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new j5a(b, n, xao, ye6, n2);
        }
    }
    
    public static final void s(final igf igf, zta zta, zta zta2, bua bua, float n, final d1q d1q, xao xao, boolean b, final gva gva, final int n2, final int n3) {
        gva.i0(-1995393829);
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
        int n10 = 0;
        Label_0134: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x30);
            }
            else {
                n8 = n5;
                if ((n2 & 0x30) == 0x0) {
                    int n9;
                    if (gva.h((Object)zta)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n5 | n9);
                    break Label_0134;
                }
            }
            n10 = n8;
        }
        final int n11 = n3 & 0x4;
        int n14 = 0;
        Label_0202: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x180);
            }
            else {
                n12 = n10;
                if ((n2 & 0x180) == 0x0) {
                    int n13;
                    if (gva.h((Object)zta2)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n10 | n13);
                    break Label_0202;
                }
            }
            n14 = n12;
        }
        final int n15 = n3 & 0x8;
        int n18 = 0;
        Label_0271: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n2 & 0xC00) == 0x0) {
                    int n17;
                    if (gva.h((Object)bua)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0271;
                }
            }
            n18 = n16;
        }
        int n20;
        if ((n2 & 0x6000) == 0x0) {
            int n19;
            if ((n3 & 0x10) == 0x0 && gva.c(n)) {
                n19 = 16384;
            }
            else {
                n19 = 8192;
            }
            n20 = (n18 | n19);
        }
        else {
            n20 = n18;
        }
        int n21 = n20;
        if ((0x30000 & n2) == 0x0) {
            n21 = (n20 | 0x10000);
        }
        if ((0x180000 & n2) == 0x0) {
            int n22;
            if ((n3 & 0x40) == 0x0 && gva.f((Object)xao)) {
                n22 = 1048576;
            }
            else {
                n22 = 524288;
            }
            n21 |= n22;
        }
        final int n23 = n3 & 0x80;
        int n24;
        if (n23 != 0) {
            n24 = (n21 | 0xC00000);
        }
        else {
            n24 = n21;
            if ((0xC00000 & n2) == 0x0) {
                int n25;
                if (gva.g(b)) {
                    n25 = 8388608;
                }
                else {
                    n25 = 4194304;
                }
                n24 = (n21 | n25);
            }
        }
        int n26 = n24 | 0x6000000;
        igf igf2;
        d1q d1q3;
        if (gva.W(n26 & 0x1, (n26 & 0x2492493) != 0x2492492)) {
            gva.b0();
            d1q d1q2;
            int n29;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n27;
                if ((n3 & 0x10) != 0x0) {
                    n27 = (n26 & 0xFFFF1FFF);
                }
                else {
                    n27 = n26;
                }
                int n28 = n27 & 0xFFF8FFFF;
                if ((n3 & 0x40) != 0x0) {
                    n28 = (n27 & 0xFFC0FFFF);
                }
                igf2 = igf;
                d1q2 = d1q;
                n29 = n28;
            }
            else {
                Object v;
                if (n4 != 0) {
                    v = fgf.v;
                }
                else {
                    v = igf;
                }
                Object a = zta;
                if (n7 != 0) {
                    a = a4r.a;
                }
                Object b2 = zta2;
                if (n11 != 0) {
                    b2 = a4r.b;
                }
                Object c = bua;
                if (n15 != 0) {
                    c = a4r.c;
                }
                float b3;
                if ((n3 & 0x10) != 0x0) {
                    b3 = yao.b;
                    n26 &= 0xFFFF1FFF;
                }
                else {
                    b3 = n;
                }
                final wbd c2 = yao.c(gva);
                final Object o = v;
                xao q;
                int n30;
                if ((n3 & 0x40) != 0x0) {
                    q = xp7.q(48, 1, 0L, gva);
                    n30 = (n26 & 0xFFC0FFFF);
                }
                else {
                    n30 = (n26 & 0xFFF8FFFF);
                    q = xao;
                }
                n29 = n30;
                d1q2 = c2;
                zta = (zta)a;
                zta2 = (zta)b2;
                bua = (bua)c;
                n = b3;
                xao = q;
                igf2 = (igf)o;
                if (n23 != 0) {
                    b = true;
                    n29 = n30;
                    d1q2 = c2;
                    zta = (zta)a;
                    zta2 = (zta)b2;
                    bua = (bua)c;
                    n = b3;
                    xao = q;
                    igf2 = (igf)o;
                }
            }
            gva.r();
            r(b, n, xao, uuj.t0(759119272, (aua)new f5a(zta, igf2, n, d1q2, zta2, bua), gva), gva, (n29 >> 12 & 0x380) | ((n29 >> 21 & 0xE) | 0xC00 | (n29 >> 9 & 0x70)));
            d1q3 = d1q2;
        }
        else {
            gva.Z();
            igf2 = igf;
            d1q3 = d1q;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new h5a(igf2, zta, zta2, bua, n, d1q3, xao, b, n2, n3);
        }
    }
    
    public static final void t(final int n, long n2, final gva gva) {
        gva.i0(-166332950);
        final int n3 = n | 0x2;
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                n2 = ((e8e)gva.j((sei)h8e.a)).a.n;
            }
            gva.r();
            final igf d = androidx.compose.foundation.layout.b.d((igf)fgf.v, 1.0f);
            final WeakHashMap x = l2q.x;
            rj2.a(B(t2r.m(d, (d1q)o50.w(gva).l), n2, null, 14), gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ly2(n2, n, (byte)2);
        }
    }
    
    public static final void u(final igf igf, final ye6 ye6, final ye6 ye7, final ye6 ye8, float b, d1q c, xao q, final boolean b2, final gva gva, final int n) {
        gva.i0(-1448398073);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)igf)) {
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
            if (gva.h((Object)ye6)) {
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
            if (gva.h((Object)ye7)) {
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
            if (gva.h((Object)ye8)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n & 0x6000) == 0x0) {
            n10 = (n8 | 0x2000);
        }
        int n11 = n10;
        if ((0x30000 & n) == 0x0) {
            n11 = (n10 | 0x10000);
        }
        int n12 = n11;
        if ((0x180000 & n) == 0x0) {
            n12 = (n11 | 0x80000);
        }
        int n13 = n12;
        if ((0xC00000 & n) == 0x0) {
            int n14;
            if (gva.g(b2)) {
                n14 = 8388608;
            }
            else {
                n14 = 4194304;
            }
            n13 = (n12 | n14);
        }
        final int n15 = n13 | 0x6000000;
        d1q d1q;
        xao xao2;
        if (gva.W(n15 & 0x1, (0x2492493 & n15) != 0x2492492)) {
            gva.b0();
            int n16;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n16 = (n15 & 0xFFC01FFF);
            }
            else {
                b = yao.b;
                c = yao.c(gva);
                q = xp7.q(48, 1, 0L, gva);
                n16 = (n15 & 0xFFC01FFF);
            }
            gva.r();
            r(b2, b, q, uuj.t0(-1383999276, (aua)new g5a(ye6, igf, ye7, ye8, b, c), gva), gva, (n16 >> 21 & 0xE) | 0xC00);
            final xao xao = q;
            d1q = c;
            xao2 = xao;
        }
        else {
            gva.Z();
            final d1q d1q2 = c;
            xao2 = q;
            d1q = d1q2;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new b64(igf, ye6, ye7, ye8, b, d1q, xao2, b2, n);
        }
    }
    
    public static final void v(final j14 j14, final zta zta, final gva gva, final int n) {
        gva.i0(-548087909);
        int n2;
        if (gva.h((Object)j14)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)zta)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final boolean r0 = j14.R0();
            final boolean d = j14.K.d.c.d((kql)j14.J0);
            final boolean g = gva.g(r0);
            final boolean g2 = gva.g(d);
            final int n5 = n4 & 0xE;
            final boolean b = n5 == 4 || gva.h((Object)j14);
            final Object r2 = gva.R();
            final cib a = bi6.a;
            Object o;
            if ((b | (g | g2)) || (o = r2) == a) {
                o = new rbb(r0, d, j14);
                gva.q0(o);
            }
            t08.i(j14, r0, d, null, (lta)o, gva, 0x8 | n5);
            final mn2 k0 = j14.K0;
            final boolean b2 = (n4 & 0x70) == 0x20;
            final Object r3 = gva.R();
            Object o2;
            if (b2 || (o2 = r3) == a) {
                o2 = new xs7(zta, (f07)null, (byte)2);
                gva.q0(o2);
            }
            ach.e((xd3)k0, (zta)o2, gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)j14, (Object)zta, n, (byte)20);
        }
    }
    
    public static final long w(final int n, final int n2) {
        return ((long)n2 & 0xFFFFFFFFL) | (long)n << 32;
    }
    
    public static final void x(final x6m x6m, final igf igf, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-1077081618);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)x6m)) {
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
            if (gva.h((Object)ye6)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final q6m q6m = (q6m)x6m.b.getValue();
            final i4 i4 = (i4)gva.j((sei)hm6.a);
            final boolean f = gva.f((Object)q6m);
            final boolean h = gva.h((Object)i4);
            final Object r = gva.R();
            Object o;
            if ((f | h) || (o = r) == bi6.a) {
                o = new frd(q6m, i4, null, (byte)12);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)q6m);
            q((q6m)x6m.b.getValue(), igf, ye6, gva, n6 & 0x3F0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0((Object)x6m, igf, (zta)ye6, n, (byte)13);
        }
    }
    
    public static final int y(final wxd wxd, final hx hx) {
        final wxd q0 = wxd.q0();
        if (q0 == null) {
            final StringBuilder sb = new StringBuilder("Child of ");
            sb.append((Object)wxd);
            sb.append(" cannot be null when calculating alignment line");
            gac.c(sb.toString());
        }
        if (wxd.y0().c().containsKey((Object)hx)) {
            final Integer n = (Integer)wxd.y0().c().get((Object)hx);
            if (n != null) {
                return n;
            }
        }
        else {
            final int s = q0.S(hx);
            if (s != Integer.MIN_VALUE) {
                final boolean i = wxd.I;
                final boolean j = wxd.J;
                q0.I = true;
                wxd.J = true;
                wxd.I0();
                q0.I = i;
                wxd.J = j;
                long n2;
                if (hx instanceof olb) {
                    n2 = (q0.D0() & 0xFFFFFFFFL);
                }
                else {
                    n2 = q0.D0() >> 32;
                }
                return s + (int)n2;
            }
        }
        return Integer.MIN_VALUE;
    }
    
    public static final String z(String replaceAll) {
        final Pattern compile = Pattern.compile("[^A-Za-z0-9.-]");
        compile.getClass();
        replaceAll = compile.matcher((CharSequence)replaceAll).replaceAll("_");
        replaceAll.getClass();
        return replaceAll;
    }
}
