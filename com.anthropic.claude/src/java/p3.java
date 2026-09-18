import java.util.Map;
import java.time.LocalTime;
import java.util.Collection;
import android.content.Intent;
import com.anthropic.claude.tool.model.AlarmCreateV0Input;
import com.anthropic.claude.tool.model.MapDisplayV0Input;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.concurrent.CancellationException;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import android.content.SharedPreferences;
import com.anthropic.claude.types.strings.OrganizationId;
import android.content.Context;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.account.AppStartResponse;
import java.util.concurrent.Executor;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public final class p3 implements gc7, ne6, t45, by6, zr0, s9c, btm, l55
{
    public static final p3 A;
    public static final p3 B;
    public static final p3 C;
    public static final p3 D;
    public static final p3 E;
    public static p3 F;
    public static final p3 w;
    public static final p3 x;
    public static final p3 y;
    public static final p3 z;
    public final byte v;
    
    public p3(final iw iw) {
        this.v = 10;
    }
    
    public p3(final ru7 ru7, final tjc tjc) {
        this.v = 24;
    }
    
    public static void j(final b3k b3k, final Object o) {
        final v5q v5q = (v5q)o;
        final String a = v5q.a;
        final int n = 1;
        b3k.U(1, a);
        b3k.k(2, (long)vt4.f0(v5q.b));
        b3k.U(3, v5q.c);
        b3k.U(4, v5q.d);
        final nt7 b = nt7.b;
        b3k.l(ri2.C0(v5q.e), 5);
        b3k.l(ri2.C0(v5q.f), 6);
        b3k.k(7, v5q.g);
        b3k.k(8, v5q.h);
        b3k.k(9, v5q.i);
        b3k.k(10, (long)v5q.k);
        final int d = ge9.D(v5q.l);
        int n2;
        if (d != 0) {
            if (d != 1) {
                en9.r();
                return;
            }
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        b3k.k(11, (long)n2);
        b3k.k(12, v5q.m);
        b3k.k(13, v5q.n);
        b3k.k(14, v5q.o);
        b3k.k(15, v5q.p);
        b3k.k(16, (long)(v5q.q ? 1 : 0));
        final int d2 = ge9.D(v5q.r);
        int n3;
        if (d2 != 0) {
            if (d2 != 1) {
                en9.r();
                return;
            }
            n3 = n;
        }
        else {
            n3 = 0;
        }
        b3k.k(17, (long)n3);
        b3k.k(18, (long)v5q.s);
        b3k.k(19, (long)v5q.t);
        b3k.k(20, v5q.u);
        b3k.k(21, (long)v5q.v);
        b3k.k(22, (long)v5q.w);
        final String x = v5q.x;
        if (x == null) {
            b3k.m(23);
        }
        else {
            b3k.U(23, x);
        }
        final Boolean y = v5q.y;
        Integer value;
        if (y != null) {
            value = (((boolean)y) ? 1 : 0);
        }
        else {
            value = null;
        }
        if (value == null) {
            b3k.m(24);
        }
        else {
            b3k.k(24, (long)value);
        }
        final fv6 j = v5q.j;
        b3k.k(25, (long)vt4.V(j.a));
        b3k.l(vt4.F(j.b), 26);
        b3k.k(27, (long)(j.c ? 1 : 0));
        b3k.k(28, (long)(j.d ? 1 : 0));
        b3k.k(29, (long)(j.e ? 1 : 0));
        b3k.k(30, (long)(j.f ? 1 : 0));
        b3k.k(31, j.g);
        b3k.k(32, j.h);
        b3k.l(vt4.e0(j.i), 33);
        b3k.U(34, a);
    }
    
    public static ldd m(final List list, final float n, final float n2) {
        return new ldd(list, (ArrayList)null, (long)Float.floatToRawIntBits(n) << 32 | ((long)Float.floatToRawIntBits(0.0f) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(n2) << 32 | ((long)Float.floatToRawIntBits(0.0f) & 0xFFFFFFFFL), 0);
    }
    
    public static ldd n(final yog[] array, float n, float n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n = 0.0f;
        }
        if ((n3 & 0x4) != 0x0) {
            n2 = Float.POSITIVE_INFINITY;
        }
        return o((yog[])Arrays.copyOf((Object[])array, array.length), (long)Float.floatToRawIntBits(n) << 32 | ((long)Float.floatToRawIntBits(0.0f) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(n2) << 32 | ((long)Float.floatToRawIntBits(0.0f) & 0xFFFFFFFFL));
    }
    
    public static ldd o(final yog[] array, final long n, final long n2) {
        final int length = array.length;
        final ArrayList list = new ArrayList(length);
        final int n3 = 0;
        for (int i = 0; i < length; ++i) {
            final j86 j86 = (j86)array[i].w;
            final long a = j86.a;
            list.add((Object)j86);
        }
        final int length2 = array.length;
        final ArrayList list2 = new ArrayList(length2);
        for (int k = n3; k < length2; ++k) {
            list2.add((Object)((Number)array[k].v).floatValue());
        }
        return new ldd((List)list, list2, n, n2, 0);
    }
    
    public static ldd t(final List list, float n, float n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n = 0.0f;
        }
        if ((n3 & 0x4) != 0x0) {
            n2 = Float.POSITIVE_INFINITY;
        }
        return new ldd(list, (ArrayList)null, (long)Float.floatToRawIntBits(0.0f) << 32 | ((long)Float.floatToRawIntBits(n) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(0.0f) << 32 | ((long)Float.floatToRawIntBits(n2) & 0xFFFFFFFFL), 0);
    }
    
    public static ldd u(yog[] array, float n, float n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n = 0.0f;
        }
        if ((n3 & 0x4) != 0x0) {
            n2 = Float.POSITIVE_INFINITY;
        }
        array = (yog[])Arrays.copyOf((Object[])array, array.length);
        return o(array, (long)Float.floatToRawIntBits(0.0f) << 32 | ((long)Float.floatToRawIntBits(n) & 0xFFFFFFFFL), ((long)Float.floatToRawIntBits(n2) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(0.0f) << 32);
    }
    
    public long a() {
        return SystemClock.elapsedRealtime();
    }
    
    public String b() {
        return "";
    }
    
    public boolean c(final otf otf) {
        return false;
    }
    
    public void d(final String s) {
    }
    
    public long e(long n, long n2) {
        final float n3 = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)) / Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        n2 = Float.floatToRawIntBits(n3);
        n = Float.floatToRawIntBits(n3);
        final int a = bak.a;
        return n2 << 32 | (n & 0xFFFFFFFFL);
    }
    
    @Override
    public boolean equals(final Object obj) {
        switch (this.v) {
            default: {
                return super.equals(obj);
            }
            case 0: {
                boolean b = true;
                if (this != obj) {
                    Class<?> class1;
                    if (obj != null) {
                        class1 = obj.getClass();
                    }
                    else {
                        class1 = null;
                    }
                    if (!p3.class.equals(class1)) {
                        b = false;
                    }
                }
                return b;
            }
        }
    }
    
    public cz1 f() {
        return null;
    }
    
    public int g() {
        return 0;
    }
    
    public void h(final nz1 nz1, final m9r m9r, final boolean b) {
    }
    
    @Override
    public int hashCode() {
        switch (this.v) {
            default: {
                return super.hashCode();
            }
            case 0: {
                return p3.class.hashCode();
            }
        }
    }
    
    public lta i(final cx7 cx7) {
        return (lta)q10.K;
    }
    
    public Object k(final uy7 uy7) {
        switch (this.v) {
            default: {
                return new eaf();
            }
            case 3: {
                final Object w = uy7.w(new bmi((Class)hp1.class, (Class)Executor.class));
                w.getClass();
                return eqi.W((Executor)w);
            }
        }
    }
    
    public Object l(final odk v, String w, final h07 h07) {
        u2l u2l = null;
        Label_0057: {
            if (h07 instanceof u2l) {
                u2l = (u2l)h07;
                final int b = u2l.B;
                if ((b & Integer.MIN_VALUE) != 0x0) {
                    u2l.B = b + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            u2l = new u2l(this, h07);
        }
        final Object z = u2l.z;
        final int b2 = u2l.B;
        final pc7 v2 = pc7.v;
        wo8 wo8 = null;
        odk v4 = null;
        Label_0620: {
            Label_0561: {
                er0 y = null;
                String w2 = null;
                odk v3 = null;
                Object d = null;
                Label_0485: {
                    odk v5;
                    Object f0;
                    if (b2 != 0) {
                        if (b2 != 1) {
                            if (b2 == 2) {
                                y = u2l.y;
                                final wo8 x = u2l.x;
                                w2 = u2l.w;
                                v3 = u2l.v;
                                vt4.g0(z);
                                d = z;
                                wo8 = x;
                                break Label_0485;
                            }
                            if (b2 == 3) {
                                final wo8 x2 = u2l.x;
                                w = u2l.w;
                                v4 = u2l.v;
                                vt4.g0(z);
                                wo8 = x2;
                                break Label_0561;
                            }
                            if (b2 == 4) {
                                final wo8 x3 = u2l.x;
                                w = u2l.w;
                                v4 = u2l.v;
                                vt4.g0(z);
                                wo8 = x3;
                                break Label_0620;
                            }
                            if (b2 == 5) {
                                vt4.g0(z);
                                return z;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        else {
                            final wo8 x4 = u2l.x;
                            w = u2l.w;
                            v5 = u2l.v;
                            vt4.g0(z);
                            f0 = z;
                            wo8 = x4;
                        }
                    }
                    else {
                        vt4.g0(z);
                        final o8k o8k = (o8k)v.d((Class)o8k.class, (emi)null);
                        final f60 f2 = (f60)v.d((Class)f60.class, (emi)null);
                        final x97 b3 = ba7.b(o8k);
                        Boolean value;
                        if (b3 != null) {
                            value = (b3.c < System.currentTimeMillis());
                        }
                        else {
                            value = null;
                        }
                        if (!mlc.q((Object)value, (Object)Boolean.FALSE)) {
                            return null;
                        }
                        wo8 = (wo8)v.d((Class)wo8.class, (emi)null);
                        final vbb a = ((y38)wo8).a();
                        final h80 h8 = new h80((byte)17, (f07)null, (Object)v);
                        u2l.v = v;
                        u2l.w = w;
                        u2l.x = wo8;
                        u2l.B = 1;
                        f0 = rhc.f0((hc7)a, (zta)h8, (f07)u2l);
                        if (f0 == v2) {
                            return v2;
                        }
                        v5 = v;
                    }
                    y = (er0)f0;
                    u2l.v = v5;
                    u2l.w = w;
                    u2l.x = wo8;
                    u2l.y = y;
                    u2l.B = 2;
                    d = y.d(w, (h07)u2l);
                    if (d == v2) {
                        return v2;
                    }
                    final String s = w;
                    v3 = v5;
                    w2 = s;
                }
                final AppStartResponse appStartResponse = (AppStartResponse)ak0.g((ApiResult)d);
                if (appStartResponse != null) {
                    u2l.v = v3;
                    u2l.w = w2;
                    u2l.x = wo8;
                    u2l.y = null;
                    u2l.B = 3;
                    if (y.e(w2, appStartResponse, (h07)u2l) == v2) {
                        return v2;
                    }
                    final String s2 = w2;
                    v4 = v3;
                    w = s2;
                    break Label_0561;
                }
                return null;
            }
            final egg egg = (egg)v4.d((Class)egg.class, (emi)null);
            u2l.v = v4;
            u2l.w = w;
            u2l.x = wo8;
            u2l.y = null;
            u2l.B = 4;
            if (egg.a(w, (h07)u2l) == v2) {
                return v2;
            }
        }
        final vbb a2 = ((y38)wo8).a();
        final rf0 rf0 = new rf0(v4, w, null, (byte)22);
        u2l.v = null;
        u2l.w = null;
        u2l.x = null;
        u2l.y = null;
        u2l.B = 5;
        final Object f3 = rhc.f0((hc7)a2, (zta)rf0, (f07)u2l);
        if (f3 != v2) {
            return f3;
        }
        return v2;
    }
    
    public Object p(final ux4 ux4, final Context context, final ep0 ep0, final h07 h07) {
        Object o = null;
        Label_0061: {
            if (h07 instanceof v2l) {
                final v2l v2l = (v2l)h07;
                final int x = v2l.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    v2l.x = x + Integer.MIN_VALUE;
                    o = v2l;
                    break Label_0061;
                }
            }
            o = new v2l(this, h07);
        }
        final Object v = ((v2l)o).v;
        final int x2 = ((v2l)o).x;
        odk a;
        if (x2 != 0) {
            a = null;
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            final ndk ndk = (ndk)v;
            if (ndk != null) {
                a = ndk.a;
            }
        }
        else {
            vt4.g0(v);
            final odk e = ux4.e();
            if (e != null) {
                return e;
            }
            ((v2l)o).x = 1;
            final Object q = this.q(ux4, context, ep0, (h07)o);
            final pc7 v2 = pc7.v;
            if ((a = (odk)q) == v2) {
                return v2;
            }
        }
        return a;
    }
    
    public Object q(final ux4 ux4, final Context context, final ep0 ep0, final h07 h07) {
        Object o = null;
        Label_0061: {
            if (h07 instanceof w2l) {
                final w2l w2l = (w2l)h07;
                final int x = w2l.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    w2l.x = x + Integer.MIN_VALUE;
                    o = w2l;
                    break Label_0061;
                }
            }
            o = new w2l(this, h07);
        }
        final Object v = ((w2l)o).v;
        final int x2 = ((w2l)o).x;
        final odk odk = null;
        if (x2 == 0) {
            vt4.g0(v);
            final String d = ep0.d();
            if (d != null) {
                final SharedPreferences m = smk.m("account_prefs", d, context.getApplicationContext(), 0);
                Object o2;
                if ((o2 = m.getAll()) == null) {
                    o2 = s89.v;
                }
                final Iterable iterable = (Iterable)((Map)o2).keySet();
                final ArrayList list = new ArrayList();
                for (final Object next : iterable) {
                    final String s = (String)next;
                    if (!mlc.q((Object)s, (Object)"conway_saved_client_id")) {
                        s.getClass();
                        if (!rym.E0(s, "conway_composer_draft_", false) && !rym.E0(s, "conway_viewing_fork_", false) && !rym.E0(s, "conway_send_outbox_", false)) {
                            continue;
                        }
                    }
                    list.add(next);
                }
                if (!list.isEmpty()) {
                    final SharedPreferences$Editor edit = m.edit();
                    edit.getClass();
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        edit.remove((String)iterator2.next());
                    }
                    edit.apply();
                }
                String string = m.getString("selected_org_id", (String)null);
                if (string == null) {
                    string = null;
                }
                Object o3;
                if (string != null) {
                    o3 = new OrganizationId(string);
                }
                else {
                    o3 = null;
                }
                final ksg q = o50.Q(o3);
                o50.Q((Object)m.getString("display_email", (String)null));
                final OrganizationId organizationId = (OrganizationId)q.getValue();
                String a;
                if (organizationId != null) {
                    a = organizationId.a;
                }
                else {
                    a = null;
                }
                if (a != null) {
                    ((w2l)o).x = 1;
                    final Object r = this.r(ux4, d, a, (h07)o);
                    final pc7 v2 = pc7.v;
                    final odk a2;
                    if ((a2 = (odk)r) == v2) {
                        return v2;
                    }
                    return a2;
                }
            }
            return null;
        }
        if (x2 != 1) {
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vt4.g0(v);
        final ndk ndk = (ndk)v;
        odk a2 = odk;
        if (ndk != null) {
            a2 = ndk.a;
        }
        return a2;
    }
    
    public Object r(final ux4 v, final String s, final String s2, final h07 h07) {
        Object o = null;
        Label_0061: {
            if (h07 instanceof x2l) {
                final x2l x2l = (x2l)h07;
                final int z = x2l.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    x2l.z = z + Integer.MIN_VALUE;
                    o = x2l;
                    break Label_0061;
                }
            }
            o = new x2l(this, h07);
        }
        final Object x = ((x2l)o).x;
        final int z2 = ((x2l)o).z;
        rdk w;
        ux4 v2;
        Object l;
        if (z2 != 0) {
            if (z2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w = ((x2l)o).w;
            v2 = ((x2l)o).v;
            vt4.g0(x);
            l = x;
        }
        else {
            vt4.g0(x);
            final rdk w2 = new rdk(s, s2);
            final odk d = v.d((sdk)w2);
            if (d != null) {
                return d;
            }
            final odk c = v.c(new pdk(s));
            ((x2l)o).v = v;
            ((x2l)o).w = w2;
            ((x2l)o).z = 1;
            l = this.l(c, s2, (h07)o);
            final pc7 v3 = pc7.v;
            if (l == v3) {
                return v3;
            }
            final rdk rdk = w2;
            v2 = v;
            w = rdk;
        }
        final s3p s3p = (s3p)l;
        if (s3p == null) {
            return null;
        }
        final odk b = v2.b(w, s3p);
        final kgg kgg = (kgg)b.d((Class)kgg.class, (emi)null);
        if (kgg.f.getAndSet(true)) {
            return b;
        }
        rhc.G((oc7)kgg.e, (hc7)null, 0, (zta)new pn((byte)25, (f07)null, (Object)kgg), 3);
        return b;
    }
    
    public Object s(final ux4 ux4, final String s, final String s2, String v, h07 v2) {
        Object o = null;
        Label_0057: {
            if (v2 instanceof y2l) {
                o = v2;
                final int y = ((y2l)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((y2l)o).y = y + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            o = new y2l(this, v2);
        }
        final Object w = ((y2l)o).w;
        final int y2 = ((y2l)o).y;
        Label_0144: {
            if (y2 == 0) {
                break Label_0144;
            }
            Label_0136: {
                if (y2 != 1) {
                    break Label_0136;
                }
                v = (String)(v2 = (h07)((y2l)o).v);
                Label_0131: {
                    try {
                        vt4.g0(w);
                        v2 = (h07)v;
                        final ndk ndk = (ndk)w;
                        if (ndk != null) {
                            v2 = (h07)v;
                            final odk a = ndk.a;
                            break Label_0131;
                        }
                        break Label_0131;
                    }
                    catch (final CancellationException ex) {
                        throw ex;
                    }
                    finally {
                        final Throwable t;
                        if (ssf.f(t)) {
                            goto Label_0250;
                        }
                        SilentException.a(new SilentException(smk.t((String)v2, ": scope resolution failed: ", t4r.e(t))), lpl.w, (List)null, 6);
                        return;
                        odk a = null;
                        break Label_0131;
                        vt4.g0(w);
                        ((y2l)o).v = v;
                        ((y2l)o).y = 1;
                        final Object r = this.r(ux4, s, s2, (h07)o);
                        v3 = pc7.v;
                        iftrue(Label_0197:)((a = (odk)r) != v3);
                        return v3;
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                        final odk odk = a;
                        goto Label_0250;
                    }
                }
            }
        }
    }
    
    public Object z(final Context context, final Object o, String c, final x4o x4o) {
        switch (this.v) {
            default: {
                final MapDisplayV0Input mapDisplayV0Input = (MapDisplayV0Input)o;
                return sdr.t((Object)"Map displayed.");
            }
            case 10: {
                final AlarmCreateV0Input alarmCreateV0Input = (AlarmCreateV0Input)o;
                final bug r = s7r.r(alarmCreateV0Input);
                final int x = t.x(r);
                z4o z4o;
                if (x != 0) {
                    if (x == 1) {
                        final LocalTime a = ((aug)r).a();
                        final List a2 = alarmCreateV0Input.a;
                        c = alarmCreateV0Input.c;
                        final Boolean e = alarmCreateV0Input.e;
                        final Intent intent = new Intent("android.intent.action.SET_ALARM");
                        intent.setFlags(268435456);
                        intent.putExtra("android.intent.extra.alarm.HOUR", a.getHour());
                        intent.putExtra("android.intent.extra.alarm.MINUTES", a.getMinute());
                        intent.putExtra("android.intent.extra.alarm.MESSAGE", c);
                        if (e != null) {
                            intent.putExtra("android.intent.extra.alarm.VIBRATE", (boolean)e);
                        }
                        if (a2 != null) {
                            intent.putIntegerArrayListExtra("android.intent.extra.alarm.DAYS", new ArrayList((Collection)a2));
                        }
                        intent.putExtra("android.intent.extra.alarm.SKIP_UI", true);
                        try {
                            context.startActivity(intent);
                            sdr.t((Object)"Alarm was set on Android device.");
                        }
                        finally {
                            final tqd l = uqd.l;
                            z4o = sdr.j((Object)"Failed to set alarm.");
                        }
                    }
                    else {
                        en9.r();
                        z4o = null;
                    }
                }
                else {
                    final String a3 = ((ztg)r).a();
                    final StringBuilder sb = new StringBuilder("Failed to set alarm: ");
                    sb.append(a3);
                    sb.append(".");
                    z4o = sdr.j((Object)sb.toString());
                }
                return z4o;
            }
        }
    }
}
