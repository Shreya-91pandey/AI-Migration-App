import java.util.Collection;
import java.io.InputStream;
import java.util.Iterator;
import io.sentry.p7;
import io.sentry.q1;
import com.segment.analytics.kotlin.core.AnalyticsError$SettingsFail;
import com.segment.analytics.kotlin.core.AnalyticsError$NetworkUnknown;
import java.net.URL;
import kotlinx.serialization.KSerializer;
import com.segment.analytics.kotlin.core.Settings;
import java.io.Closeable;
import java.io.Reader;
import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;

public final class djh extends m6n implements zta
{
    public final Object A;
    public final byte w;
    public boolean x;
    public Object y;
    public Object z;
    
    @Override
    public final f07 create(final Object z, final f07 f07) {
        final byte w = this.w;
        final Object a = this.A;
        switch (w) {
            default: {
                return new djh(this.y, this.z, a, f07, (byte)16);
            }
            case 15: {
                final djh djh = new djh(this.z, a, f07, (byte)15);
                djh.y = z;
                return djh;
            }
            case 14: {
                return new djh(this.y, this.z, a, f07, (byte)14);
            }
            case 13: {
                return new djh(this.z, a, f07, (byte)13);
            }
            case 12: {
                return new djh((byte)12, f07, a);
            }
            case 11: {
                return new djh(this.y, this.z, a, f07, (byte)11);
            }
            case 10: {
                final djh djh2 = new djh(this.z, a, f07, (byte)10);
                djh2.y = z;
                return djh2;
            }
            case 9: {
                final djh djh3 = new djh(this.z, a, f07, (byte)9);
                djh3.y = z;
                return djh3;
            }
            case 8: {
                return new djh(this.y, this.z, a, f07, (byte)8);
            }
            case 7: {
                final djh djh4 = new djh((byte)7, f07, a);
                djh4.z = z;
                return djh4;
            }
            case 6: {
                final djh djh5 = new djh(this.z, a, f07, (byte)6);
                djh5.y = z;
                return djh5;
            }
            case 5: {
                return new djh(this.y, this.z, a, f07, (byte)5);
            }
            case 4: {
                final djh djh6 = new djh(this.z, a, f07, (byte)4);
                djh6.y = z;
                return djh6;
            }
            case 3: {
                final djh djh7 = new djh(this.z, a, f07, (byte)3);
                djh7.y = z;
                return djh7;
            }
            case 2: {
                final djh djh8 = new djh(this.z, a, f07, (byte)2);
                djh8.y = z;
                return djh8;
            }
            case 1: {
                final djh djh9 = new djh((byte)1, f07, a);
                djh9.z = z;
                return djh9;
            }
            case 0: {
                return new djh(this.y, this.z, a, f07, (byte)0);
            }
        }
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 15: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 14: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 13: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 12: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 11: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 10: {
                ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
                return pc7.v;
            }
            case 9: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 8: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 7: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 6: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 5: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((djh)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    @Override
    public final Object invokeSuspend(Object y) {
        final byte w = this.w;
        Object a = lqo.a;
        final Object a2 = this.A;
        Object v = pc7.v;
        final Object o = null;
        switch (w) {
            default: {
                final v5q v5q = (v5q)this.z;
                final boolean x = this.x;
                if (x) {
                    if (x) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final ArrayList a3 = ((ddb)this.y).a;
                    final ArrayList list = new ArrayList();
                    for (final Object next : a3) {
                        if (((bv6)next).b(v5q)) {
                            list.add(next);
                        }
                    }
                    final ArrayList list2 = new ArrayList(d86.p0((Iterable)list, 10));
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        list2.add((Object)((bv6)iterator2.next()).a(v5q.j));
                    }
                    final ija u = soh.u((ija)new un0((Object)((Collection)c86.s1((Iterable)list2)).toArray((Object[])new ija[0]), (byte)3));
                    final hb4 hb4 = new hb4((Object)a2, (Object)v5q, (byte)11);
                    this.x = true;
                    if (u.a((jja)hb4, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 15: {
                final hdk hdk = (hdk)this.z;
                final boolean x2 = this.x;
                if (x2) {
                    if (x2) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final jrh jrh = (jrh)this.y;
                    final ira ira = new ira((Object)jrh, (byte)2);
                    ((p0q)hdk.v).b((Context)a2, new ou0((byte)1), ira);
                    final kkk kkk = new kkk((Object)hdk, (Object)ira, (byte)10);
                    this.x = true;
                    if (uuj.U(jrh, (jta)kkk, this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 14: {
                final boolean x3 = this.x;
                if (x3) {
                    if (x3) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final a14 a4 = new a14(new cd0((ija)((vn0)this.y).x, (byte)2), (byte)3);
                    final hb4 hb5 = new hb4((Object)this.z, (Object)a2, (byte)10);
                    this.x = true;
                    if (a4.a((jja)hb5, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 13: {
                final gfk gfk = (gfk)this.z;
                final fd0 fd0 = (fd0)gfk.v;
                final boolean x4 = this.x;
                Label_0792: {
                    if (x4) {
                        if (x4) {
                            v = this.y;
                            try {
                                vt4.g0(y);
                                break Label_0792;
                            }
                            finally {
                                break Label_0792;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        y = null;
                        return y;
                    }
                    y = ge9.o(y);
                    while (true) {
                        try {
                            final n6k a5 = ljq.a0((jta)new l27((qhc)a2, (byte)4));
                            final q31 q31 = new q31(2, (f07)null, (byte)10);
                            final hb4 hb6 = new hb4(y, (Object)gfk, (byte)9);
                            this.y = y;
                            this.x = true;
                            Object a6 = a5.a((jja)new te0(new Object(), hb6, q31, (byte)5), (f07)this);
                            if (a6 != v) {
                                a6 = a;
                            }
                            if (a6 == v) {
                                y = v;
                            }
                            else {
                                v = y;
                                y = a;
                                if (((x3j)v).v) {
                                    fd0.b((Object)Boolean.FALSE);
                                    y = a;
                                }
                            }
                            return y;
                            v = y;
                            final Throwable t;
                            y = t;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                if (((x3j)v).v) {
                    fd0.b((Object)Boolean.FALSE);
                }
                break;
            }
            case 12: {
                r1 z = (r1)a2;
                final boolean x5 = this.x;
                if (x5) {
                    if (!x5) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    z = (r1)this.z;
                    final cof cof = (cof)this.y;
                    vt4.g0(y);
                    y = cof;
                }
                else {
                    vt4.g0(y);
                    final zmk zmk = (zmk)z;
                    final z8m d = zmk.D;
                    if (d != null) {
                        d.d((Object)zmk, (lta)xp7.k, (jta)zmk.C);
                    }
                    final cof g = zmk.G;
                    this.y = g;
                    this.z = z;
                    this.x = true;
                    y = g;
                    if (g.c((f07)this) == v) {
                        a = v;
                        return a;
                    }
                }
                Label_1065: {
                    try {
                        ((zmk)z).z = ((zmk)z).x.getValue();
                        final l13 f = ((zmk)z).F;
                        if (f != null) {
                            f.resumeWith(((zmk)z).x.getValue());
                        }
                    }
                    finally {
                        break Label_1065;
                    }
                    ((zmk)z).F = null;
                    ((aof)y).g((Object)null);
                    return a;
                }
                ((aof)y).g((Object)null);
                return a;
            }
            case 11: {
                final gwj gwj = (gwj)this.y;
                final boolean x6 = this.x;
                if (x6) {
                    if (x6) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    final b4j e = hia.e(y);
                    final Object o2 = new Object();
                    final n6k a7 = ljq.a0((jta)new qn1((Object)gwj, (Object)this.z, (Object)a2, (byte)22));
                    final te0 te0 = new te0(o2, e, gwj, (byte)9);
                    this.x = true;
                    if (a7.a((jja)te0, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 10: {
                final yhn yhn = (yhn)this.z;
                final boolean x7 = this.x;
                if (x7) {
                    if (x7) {
                        throw ge9.w(y);
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    v = null;
                }
                else {
                    vt4.g0(y);
                    final ubh ubh = (ubh)this.y;
                    final peo l = yhn.L;
                    final qmn m = yhn.M;
                    final y4c e2 = yhn.R.e(yhn.S);
                    final d09 d2 = (d09)a2;
                    final h21 h21 = new h21(1, (Object)yhn, (Class)yhn.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8, (byte)8);
                    final rhn rhn = new rhn(yhn, (byte)10);
                    final ymf u2 = yhn.U;
                    final jap jap = (jap)uoo.z((zl6)yhn, (sei)hm6.u);
                    final shn shn = new shn(yhn, (byte)7);
                    this.x = true;
                    yi2.K(ubh, l, m, e2, d2, h21, rhn, u2, jap, shn, this);
                }
                return v;
            }
            case 9: {
                final kuo kuo = (kuo)this.y;
                final boolean x8 = this.x;
                if (x8) {
                    if (x8) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        y = o;
                    }
                }
                else {
                    vt4.g0(y);
                    final ik4 g2 = ((plm)this.z).g;
                    final String s = (String)a2;
                    this.y = null;
                    this.x = true;
                    y = i7r.p(g2, s, kuo, (h07)this);
                    if (y == v) {
                        y = v;
                    }
                }
                return y;
            }
            case 8: {
                final s10 s2 = (s10)this.y;
                final boolean x9 = this.x;
                if (x9) {
                    if (x9) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final StringBuilder sb = new StringBuilder("Fetching settings on ");
                    sb.append(Thread.currentThread().getName());
                    uuj.z0(3, sb.toString());
                    final String s3 = (String)this.z;
                    final String s4 = (String)a2;
                    Settings settings = null;
                    Label_1797: {
                        Label_1726: {
                            Label_1679: {
                                Label_1675: {
                                    Object a8;
                                    try {
                                        y = new e3a((Object)s3, (Object)s2.v.g, (byte)3);
                                        final InputStream w2 = ((e3a)y).R(s4).w;
                                        if (w2 != null) {
                                            a8 = ui3.a;
                                            y = new InputStreamReader(w2, (Charset)a8);
                                            final Charset charset;
                                            a8 = (charset = (Charset)new BufferedReader((Reader)y, 8192));
                                            mlc.W((Reader)charset);
                                            final Charset charset2 = (Charset)a8;
                                            ((Closeable)charset2).close();
                                            break Label_1679;
                                        }
                                        break Label_1675;
                                    }
                                    catch (final Exception ex) {
                                        break Label_1726;
                                    }
                                    try {
                                        final Charset charset = (Charset)a8;
                                        mlc.W((Reader)charset);
                                        final Charset charset2 = (Charset)a8;
                                        ((Closeable)charset2).close();
                                        break Label_1679;
                                    }
                                    finally {
                                        try {}
                                        finally {
                                            zn2.r((Closeable)a8, (Throwable)y);
                                        }
                                    }
                                }
                                y = "";
                            }
                            uuj.z0(3, "Fetched Settings: ".concat((String)y));
                            final src b = itc.b;
                            b.getClass();
                            settings = (Settings)((jqc)b).b((String)y, (KSerializer)k8e.v(Settings.Companion.serializer()));
                            break Label_1797;
                        }
                        final AnalyticsError$SettingsFail analyticsError$SettingsFail = new AnalyticsError$SettingsFail(new AnalyticsError$NetworkUnknown(new URL(lmf.t("https://", s4, "/projects/", s3, "/settings")), (Exception)y));
                        soh.Q((Throwable)y);
                        ifc.v(s2, (Throwable)analyticsError$SettingsFail, "Failed to fetch settings", "analytics_mobile.invoke.error", (lta)new q79(y, (Object)s3, (byte)5));
                        settings = null;
                    }
                    final o68 o3 = (o68)s2.w.x;
                    y = new l10(settings, s2, null);
                    this.x = true;
                    if (rhc.f0((hc7)o3, (zta)y, this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 7: {
                final oc7 oc7 = (oc7)this.z;
                final boolean x10 = this.x;
                q1 q33 = null;
                Label_1991: {
                    if (x10) {
                        Label_1896: {
                            if (x10) {
                                final q1 q32 = (q1)this.y;
                                Label_2033: {
                                    try {
                                        vt4.g0(y);
                                        q33 = q32;
                                        break Label_1991;
                                    }
                                    catch (final Exception ex2) {
                                        break Label_2033;
                                    }
                                    break Label_1896;
                                }
                                q32.k(p7.INTERNAL_ERROR);
                                throw;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(y);
                    final q1 p = y7j.P("loading_app.load_user_session", "Load user session", null);
                    final nnd nnd = (nnd)a2;
                    this.z = null;
                    this.y = p;
                    this.x = true;
                    q33 = p;
                    if (nnd.h((Object)oc7, (Object)p, (Object)this) == v) {
                        a = v;
                        return a;
                    }
                }
                p7 p2;
                if ((p2 = q33.a()) == null) {
                    p2 = p7.OK;
                }
                q33.k(p2);
                return a;
            }
            case 6: {
                final boolean x11 = this.x;
                Object o5 = null;
                Label_2190: {
                    if (x11) {
                        Label_2087: {
                            if (x11) {
                                final Object o4 = o5 = this.y;
                                Label_2181: {
                                    try {
                                        vt4.g0(y);
                                        o5 = o4;
                                        break Label_2190;
                                    }
                                    finally {
                                        break Label_2181;
                                    }
                                    break Label_2087;
                                }
                                y = new jpj((Throwable)y);
                                break Label_2190;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(y);
                    final oc7 oc8 = (oc7)this.y;
                    final vc6 y2 = (vc6)this.z;
                    final zta zta = (zta)a2;
                    this.y = y2;
                    this.x = true;
                    final Object o6 = y = zta.d(oc8, this);
                    o5 = y2;
                    if (o6 == v) {
                        a = v;
                        return a;
                    }
                }
                final Throwable a9 = kpj.a(y);
                if (a9 == null) {
                    ((bqc)o5).S(y);
                }
                else {
                    ((bqc)o5).getClass();
                    ((bqc)o5).S((Object)new cd6(a9, false));
                }
                return a;
            }
            case 5: {
                final boolean x12 = this.x;
                if (x12) {
                    if (x12) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final hc7 hc7 = (hc7)this.y;
                    final eh0 eh0 = new eh0((Object)this.z, (Object)a2, (f07)null, (byte)8);
                    this.x = true;
                    if (rhc.f0(hc7, (zta)eh0, this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 4: {
                final boolean x13 = this.x;
                if (x13) {
                    if (x13) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final oc7 oc9 = (oc7)this.y;
                    final o68 a10 = vo8.a;
                    final vbb z2 = w0e.a.z;
                    final eh0 eh2 = new eh0((Object)this.z, (Object)oc9, (Object)a2, (f07)null, (byte)7);
                    this.x = true;
                    if (rhc.f0((hc7)z2, (zta)eh2, this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 3: {
                final boolean x14 = this.x;
                if (x14) {
                    if (x14) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final oc7 oc10 = (oc7)this.y;
                    final i0j i0j = (i0j)this.z;
                    final ahf ahf = (ahf)a2;
                    this.x = true;
                    if (i0j.h((Object)oc10, (Object)ahf, (Object)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 2: {
                final t2k t2k = (t2k)this.y;
                final boolean x15 = this.x;
                if (x15) {
                    if (x15) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final jmq b2 = ((ozh)this.z).b;
                    final List list3 = (List)a2;
                    this.y = null;
                    this.x = true;
                    if (b2.H(t2k, (Iterable)list3, (h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 1: {
                final mmf mmf = (mmf)this.z;
                final boolean x16 = this.x;
                if (x16) {
                    if (x16) {
                        v = this.y;
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final mmf f2 = mmf.f();
                    final zta zta2 = (zta)a2;
                    this.z = null;
                    this.y = f2;
                    this.x = true;
                    if (zta2.d(f2, this) != v) {
                        v = f2;
                    }
                }
                return v;
            }
            case 0: {
                final tze tze = (tze)this.y;
                final boolean x17 = this.x;
                if (x17) {
                    if (x17) {
                        vt4.g0(y);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(y);
                    final n6k a11 = ljq.a0((jta)new uhd(tze, (byte)1));
                    final te0 te2 = new te0(tze, this.z, a2, (byte)8);
                    this.x = true;
                    if (a11.a((jja)te2, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
        }
    }
}
