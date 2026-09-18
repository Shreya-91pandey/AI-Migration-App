import android.webkit.WebView;
import java.util.AbstractCollection;
import android.content.SharedPreferences$Editor;
import java.util.LinkedHashSet;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import com.anthropic.claude.types.strings.LocalizedText;
import com.anthropic.claude.types.strings.ChatId;
import java.io.Serializable;
import android.os.SystemClock;
import com.anthropic.claude.api.errors.ClaudeApiErrorException;
import java.util.Map;
import com.anthropic.claude.api.account.BootstrapResponse;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.conversation.sse.d;
import java.util.List;

public final class wb0 implements jja
{
    public final byte v;
    public final Object w;
    
    public Object a(final List list, final f07 f07) {
        Object o = null;
        Label_0051: {
            if (f07 instanceof vhm) {
                final vhm vhm = (vhm)f07;
                final int x = vhm.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    vhm.x = x + Integer.MIN_VALUE;
                    o = vhm;
                    break Label_0051;
                }
            }
            o = new vhm(this, f07);
        }
        final Object v = ((vhm)o).v;
        final int x2 = ((vhm)o).x;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            final qpm a = ((d)this.w).A;
            final e0j e0j = new e0j((Object)list, (byte)14);
            ((vhm)o).x = 1;
            final Object d = a.d((lta)e0j, (h07)o);
            final pc7 v2 = pc7.v;
            if (d == v2) {
                return v2;
            }
        }
        return lqo.a;
    }
    
    public Object b(boolean v, final f07 f07) {
        final byte v2 = this.v;
        final lqo lqo = null;
        final Object o = null;
        switch (v2) {
            default: {
                final lqo a = lqo.a;
                Object o2 = null;
                Label_0088: {
                    if (f07 instanceof m0e) {
                        final m0e m0e = (m0e)f07;
                        final int x = m0e.x;
                        if ((x & Integer.MIN_VALUE) != 0x0) {
                            m0e.x = x + Integer.MIN_VALUE;
                            o2 = m0e;
                            break Label_0088;
                        }
                    }
                    o2 = new m0e(this, f07);
                }
                final Object v3 = ((m0e)o2).v;
                final pc7 v4 = pc7.v;
                final int x2 = ((m0e)o2).x;
                Object b;
                if (x2 != 0) {
                    if (x2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o;
                    }
                    vt4.g0(v3);
                    b = v3;
                }
                else {
                    vt4.g0(v3);
                    final n2b n2b = (n2b)this.w;
                    ((m0e)o2).x = 1;
                    if ((b = n2b.b((h07)o2)) == v4) {
                        return v4;
                    }
                }
                final ApiResult apiResult = (ApiResult)b;
                if (apiResult != null) {
                    final boolean b2 = apiResult instanceof qj0;
                    if (b2) {
                        final BootstrapResponse bootstrapResponse = (BootstrapResponse)((qj0)apiResult).b;
                        final List a2 = adn.a;
                        adn.e(6, "Global bootstrap refreshed", (String)null, (Map)null);
                    }
                    else if (!(apiResult instanceof pj0)) {
                        en9.r();
                        return o;
                    }
                    if (!b2) {
                        if (!(apiResult instanceof pj0)) {
                            en9.r();
                            return o;
                        }
                        final pj0 pj0 = (pj0)apiResult;
                        if (pj0 instanceof nj0) {
                            final nj0 nj0 = (nj0)apiResult;
                            final List a3 = adn.a;
                            adn.f((Throwable)new ClaudeApiErrorException(nj0.b(), "Failed to refresh global bootstrap"), "Failed to refresh global bootstrap", (lpl)null, (Map)null, (List)null, 60);
                        }
                        else if (!(pj0 instanceof oj0)) {
                            en9.r();
                            return o;
                        }
                    }
                }
                return a;
            }
            case 4: {
                final lqo a4 = lqo.a;
                Object o4 = null;
                Label_0392: {
                    if (f07 instanceof zz4) {
                        final zz4 zz4 = (zz4)f07;
                        final int y = zz4.y;
                        if ((y & Integer.MIN_VALUE) != 0x0) {
                            zz4.y = y + Integer.MIN_VALUE;
                            o4 = zz4;
                            break Label_0392;
                        }
                    }
                    o4 = new zz4(this, f07);
                }
                final Object w = ((zz4)o4).w;
                final pc7 v5 = pc7.v;
                final int y2 = ((zz4)o4).y;
                Object e = null;
                Label_0507: {
                    if (y2 != 0) {
                        if (y2 == 1) {
                            v = ((zz4)o4).v;
                            vt4.g0(w);
                            e = w;
                            break Label_0507;
                        }
                        if (y2 != 2) {
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return lqo;
                        }
                        vt4.g0(w);
                    }
                    else {
                        vt4.g0(w);
                        final d05 d05 = (d05)this.w;
                        ((zz4)o4).v = v;
                        ((zz4)o4).y = 1;
                        if ((e = d05.e((h07)o4)) == v5) {
                            return v5;
                        }
                        break Label_0507;
                    }
                    return a4;
                }
                if (mlc.q(e, (Object)((d05)this.w).g)) {
                    return a4;
                }
                final d05 d6 = (d05)this.w;
                ((zz4)o4).v = v;
                ((zz4)o4).y = 2;
                if (d6.f("background", (h07)o4) != v5) {
                    return a4;
                }
                return v5;
            }
        }
    }
    
    public final Object l(Object value, final f07 f07) {
        final byte v = this.v;
        boolean q = false;
        Object o = pc7.v;
        final Object o2 = null;
        final yce yce = null;
        final mce mce = null;
        final Object o3 = null;
        final String s = null;
        Object a = lqo.a;
        final Object w = this.w;
        switch (v) {
            default: {
                final Boolean value2 = (Boolean)value;
                final boolean booleanValue = value2;
                final ep0 ep0 = (ep0)w;
                if (ep0.l() != booleanValue) {
                    ep0.i.setValue((Object)value2);
                    hia.u(ep0.a, "widget_offers_cowork", booleanValue);
                }
                return a;
            }
            case 27: {
                final String s2 = (String)value;
                final List a2 = adn.a;
                final String a3 = ((f4p)w).a();
                final Iterator iterator = ((Iterable)adn.a).iterator();
                while (iterator.hasNext()) {
                    ((len)iterator.next()).j(a3, s2);
                }
                return a;
            }
            case 26: {
                value.getClass();
                ((qno)w).c();
                return a;
            }
            case 25: {
                final xgc xgc = (xgc)value;
                final ksg e = ((m1o)w).e;
                if (!mlc.q((Object)xgc, (Object)e.getValue())) {
                    e.setValue((Object)null);
                }
                return a;
            }
            case 24: {
                final boolean a4 = ((pn0)value).a;
                final uvn uvn = (uvn)w;
                if (a4) {
                    if (!(boolean)uvn.l.getValue()) {
                        final Object e2 = uvn.e(f07);
                        value = a;
                        if (e2 == o) {
                            value = e2;
                        }
                    }
                    else {
                        value = a;
                        if (uvn.b() != null) {
                            final h5j c = uvn.c;
                            rhc.G((oc7)c.g, (hc7)null, 0, (zta)new lqi((byte)3, (f07)null, (Object)c), 3);
                            value = a;
                        }
                    }
                }
                else {
                    final DateTimeFormatter q2 = uvn.q;
                    uvn.m.setValue((Object)Boolean.FALSE);
                    value = a;
                }
                return value;
            }
            case 23: {
                final qs8 value3 = (qs8)value;
                if (value3 != null) {
                    ((crm)w).c.setValue((Object)value3);
                }
                return a;
            }
            case 22: {
                return this.a((List)value, f07);
            }
            case 21: {
                ((irh)w).setValue(value);
                return a;
            }
            case 20: {
                final yog yog = (yog)value;
                final String s3 = (String)yog.v;
                final String s4 = (String)yog.w;
                final zta a5 = ((eyk)w).a;
                a5.d((Object)"active_surface", (Object)s3);
                a5.d((Object)"active_screen", (Object)s4);
                return a;
            }
            case 19: {
                final jd jd = (jd)value;
                final c0k c0k = (c0k)w;
                if (jd == null) {
                    final String c2 = c0k.c;
                    if (c2 != null) {
                        c0k.b.b((Object)c2);
                    }
                }
                else {
                    c0k.a.h((Object)jd.a, (Object)jd.b, (Object)jd.d);
                }
                String a6 = s;
                if (jd != null) {
                    a6 = jd.a;
                }
                c0k.c = a6;
                return a;
            }
            case 18: {
                final boolean a7 = ((pn0)value).a;
                final h5j h5j = (h5j)w;
                if (a7) {
                    h5j.j = new Long(SystemClock.elapsedRealtime());
                }
                else {
                    final DateTimeFormatter m = h5j.m;
                    value = h5j.a(f07);
                    if (value == o) {
                        a = value;
                    }
                }
                return a;
            }
            case 17: {
                if (value) {
                    ((ipi)w).k();
                }
                return a;
            }
            case 16: {
                value.getClass();
                final ili ili = (ili)w;
                final odk e3 = ili.a.e();
                if (e3 != null) {
                    final s3p s3p = (s3p)e3.f((Class)s3p.class, (emi)null);
                    if (s3p != null) {
                        final String c3 = s3p.c;
                        final String d = s3p.d;
                        final et0 g = ili.g;
                        final o68 a8 = vo8.a;
                        rhc.G((oc7)g, (hc7)d58.w, 0, (zta)new l10((byte)7, (f07)null, (Serializable)c3, (Object)ili, (Object)d), 2);
                    }
                }
                return a;
            }
            case 15: {
                ((qhf)w).x.i(((Number)value).floatValue());
                return a;
            }
            case 14: {
                final yye yye = (yye)value;
                final re0 re0 = (re0)w;
                re0.x.getClass();
                if (SystemClock.elapsedRealtime() - yye.b() <= 10000L) {
                    final String a9 = yye.a();
                    final ChatId chatId = (ChatId)((kn3)re0.y).a();
                    String a10;
                    if (chatId != null) {
                        a10 = chatId.a;
                    }
                    else {
                        a10 = null;
                    }
                    if (a10 != null) {
                        q = mlc.q((Object)a9, (Object)a10);
                    }
                    if (q && (boolean)((l9o)re0.w).x.getValue()) {
                        final gze gze = (gze)re0.v;
                        final long d2 = yye.d();
                        final LinkedHashSet k = gze.k;
                        if (((AbstractCollection)k).add((Object)d2)) {
                            if (((AbstractCollection)k).size() > 500) {
                                ((AbstractCollection)k).remove(c86.F0((Iterable)k));
                            }
                            final on3 on3 = (on3)re0.z;
                            final String c4 = yye.c();
                            value = o2;
                            if (c4 != null) {
                                value = new LocalizedText(c4);
                            }
                            on3.b(value);
                        }
                    }
                }
                return a;
            }
            case 13: {
                value.getClass();
                final ede ede = (ede)w;
                final ms9 p2 = ede.l.p;
                if (p2 != null) {
                    value = p2.b;
                }
                else {
                    value = null;
                }
                final yce yce2 = (yce)value;
                if (yce2 != null) {
                    yce yce3 = yce;
                    if (!((bqc)((l8k)yce2.a).I).R0()) {
                        yce3 = yce2;
                    }
                    if (yce3 != null) {
                        ((WebView)yce3.a).onResume();
                    }
                }
                value = ede.a(f07);
                if (value == o) {
                    a = value;
                }
                return a;
            }
            case 12: {
                final String a11 = ((ChatId)value).a;
                final nce nce = (nce)w;
                final mce e4 = nce.e;
                if (e4 != null) {
                    mce mce2 = mce;
                    if (mlc.q((Object)e4.a(), (Object)a11)) {
                        mce2 = e4;
                    }
                    if (mce2 != null) {
                        nce.a(mce2, "chatDeleted");
                    }
                }
                return a;
            }
            case 11: {
                return this.b((boolean)value, f07);
            }
            case 10: {
                final kza kza = (kza)value;
                value = ((sza)w).c(kza.a(), kza.b(), f07);
                if (value == o) {
                    a = value;
                }
                return a;
            }
            case 9: {
                Object o4 = null;
                Label_1320: {
                    if (f07 instanceof oja) {
                        final oja oja = (oja)f07;
                        final int x = oja.x;
                        if ((x & Integer.MIN_VALUE) != 0x0) {
                            oja.x = x + Integer.MIN_VALUE;
                            o4 = oja;
                            break Label_1320;
                        }
                    }
                    o4 = new oja(this, f07);
                }
                final Object v2 = ((oja)o4).v;
                final int x2 = ((oja)o4).x;
                if (x2 != 0) {
                    if (x2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(v2);
                }
                else {
                    vt4.g0(v2);
                    final jrh jrh = (jrh)w;
                    Object a12;
                    if ((a12 = value) == null) {
                        a12 = j3g.a;
                    }
                    ((oja)o4).x = 1;
                    if (((stk)jrh.z).a((f07)o4, a12) == o) {
                        return o;
                    }
                }
                return a;
            }
            case 8: {
                final px8 px8 = (px8)value;
                final f8 f8 = (f8)w;
                final String v3 = px8.v;
                final SharedPreferences$Editor edit = f8.a.edit();
                edit.getClass();
                edit.putString("last_active_drawer_tab", v3);
                edit.apply();
                return a;
            }
            case 7: {
                final lqo lqo = (lqo)value;
                final rv7 rv7 = (rv7)w;
                value = a;
                if (!(rv7.h.v() instanceof nea)) {
                    final Object e5 = rv7.e(true, f07);
                    value = a;
                    if (e5 == o) {
                        value = e5;
                    }
                }
                return value;
            }
            case 6: {
                final CursorAnchorInfo cursorAnchorInfo = (CursorAnchorInfo)value;
                final ko1 ko1 = (ko1)((nr7)w).g;
                ko1.g().updateCursorAnchorInfo((View)ko1.a, cursorAnchorInfo);
                return a;
            }
            case 5: {
                final wqh wqh = (wqh)value;
                final g67 g2 = (g67)w;
                final r7m h = g8m.h();
                zmf zmf;
                if (h instanceof zmf) {
                    zmf = (zmf)h;
                }
                else {
                    zmf = null;
                }
                if (zmf != null) {
                    value = zmf.C((lta)null, (lta)null);
                    if (value != null) {
                        try {
                            o = ((r7m)value).j();
                            final g67 g3 = g2;
                            final ksg ksg = g3.j;
                            final wqh wqh2 = wqh;
                            ksg.setValue((Object)wqh2);
                            final wqh wqh3 = wqh;
                            final drh drh = crh.a(wqh3);
                            final g67 g4 = g2;
                            final ksg ksg2 = g4.k;
                            final drh drh2 = drh;
                            ksg2.setValue((Object)drh2);
                            final pc7 pc7 = (pc7)o;
                            r7m.q((r7m)pc7);
                            final Object o6 = value;
                            final uoo uoo = ((zmf)o6).w();
                            uoo.v();
                            final Object o7 = value;
                            ((zmf)o7).c();
                            value = a;
                            return value;
                        }
                        finally {
                            try {}
                            finally {
                                ((zmf)value).c();
                            }
                        }
                        try {
                            final g67 g3 = g2;
                            final ksg ksg = g3.j;
                            final wqh wqh2 = wqh;
                            ksg.setValue((Object)wqh2);
                            final wqh wqh3 = wqh;
                            final drh drh = crh.a(wqh3);
                            final g67 g4 = g2;
                            final ksg ksg2 = g4.k;
                            final drh drh2 = drh;
                            ksg2.setValue((Object)drh2);
                            final pc7 pc7 = (pc7)o;
                            r7m.q((r7m)pc7);
                            final Object o6 = value;
                            final uoo uoo = ((zmf)o6).w();
                            uoo.v();
                            final Object o7 = value;
                            ((zmf)o7).c();
                            value = a;
                            return value;
                        }
                        finally {}
                    }
                }
                en9.q("Cannot create a mutable snapshot of an read-only snapshot");
                value = o3;
                return value;
            }
            case 4: {
                return this.b((boolean)value, f07);
            }
            case 3: {
                final Set set = (Set)value;
                value = ((yw4)w).t.a(true, f07);
                if (value == o) {
                    a = value;
                }
                return a;
            }
            case 2: {
                final eic eic = (eic)value;
                final v8m v8m = (v8m)w;
                if (eic instanceof wmb) {
                    v8m.add((Object)eic);
                }
                else if (eic instanceof xmb) {
                    v8m.remove((Object)((xmb)eic).a());
                }
                else if (eic instanceof gma) {
                    v8m.add((Object)eic);
                }
                else if (eic instanceof hma) {
                    v8m.remove((Object)((hma)eic).a());
                }
                else if (eic instanceof vlh) {
                    v8m.add((Object)eic);
                }
                else if (eic instanceof wlh) {
                    v8m.remove((Object)((wlh)eic).a());
                }
                else if (eic instanceof ulh) {
                    v8m.remove((Object)((ulh)eic).a());
                }
                return a;
            }
            case 1: {
                value = ((stk)w).a(f07, (Object)value);
                if (value == o) {
                    a = value;
                }
                return a;
            }
            case 0: {
                final lqo lqo2 = (lqo)value;
                ((ko1)w).j();
                return a;
            }
        }
    }
}
