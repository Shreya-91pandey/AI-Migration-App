import com.anthropic.claude.api.memory.MemorySettingsResponse;
import java.net.URL;
import java.util.Iterator;
import java.io.IOException;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.Map$Entry;
import java.util.HashMap;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.api.result.ApiResult;
import io.sentry.q1;
import io.sentry.p7;
import java.util.concurrent.CancellationException;
import com.arkivanov.essenty.statekeeper.b;
import android.content.SharedPreferences;
import kotlinx.serialization.KSerializer;

public final class nq
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    
    public nq(final fz6 a, final uq b, final s3p c, final z2g d, final wq e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final SharedPreferences a2 = b.a;
        this.f = ge9.m(a2, "onboarding_completed", false);
        this.g = ge9.m(a2, "intro_banner_dismissed", false);
        this.h = o50.Q((Object)a2.getString("dispatch_notice_closed_end_date", (String)null));
        this.i = ge9.m(a2, "dispatch_upsell_dismissed", false);
    }
    
    public nq(String d, final b b, final ca4 c, final kn3 d2, final fa4 e, final fa4 f, final fa4 g, final p84 h, final p84 i) {
        this.a = d;
        this.b = b;
        this.c = c;
        this.d = d2;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        d = this.d("isCreatedChat");
        final ph2 a = ph2.a;
        b.b(d, (KSerializer)a, (jta)new rc4(this, (byte)0));
        b.b(this.d("selectedModel"), (KSerializer)hym.a, (jta)new rc4(this, (byte)1));
        b.b(this.d("draftDiscarded"), (KSerializer)a, (jta)new rc4(this, (byte)2));
        b.b(this.d("settledAuthority"), (KSerializer)a, (jta)new rc4(this, (byte)3));
        b.b(this.d("isChatStarted"), (KSerializer)a, (jta)new rc4(this, (byte)4));
        b.b(this.d("isIncognito"), (KSerializer)a, (jta)new rc4(this, (byte)5));
        b.b(this.d("isChatMemoryOff"), (KSerializer)a, (jta)new rc4(this, (byte)6));
    }
    
    public nq(final zn0 zn0) {
        final vy4 vy4 = (vy4)zn0.x;
        final una a = ((vna)vy4.e.b).a(28.0f);
        final long k = tsf.K(28);
        final zoa w = zoa.w;
        this.a = new mnn(0L, k, vy4.b(eqi.b0()), (soa)null, a, 0L, 0L, 0, 3, tsf.D(1.3), vy4.j, 15531993);
        this.b = new mnn(0L, tsf.K(24), vy4.b(eqi.b0()), (soa)null, ((vna)vy4.e.b).a(24.0f), 0L, 0L, 0, 3, tsf.D(1.3), vy4.j, 15531993);
        this.c = new mnn(0L, tsf.K(20), vy4.b(eqi.b0()), (soa)null, ((vna)vy4.e.b).a(20.0f), 0L, 0L, 0, 3, tsf.D(1.3), vy4.j, 15531993);
        final una a2 = ((vna)vy4.e.b).a(17.0f);
        final long i = tsf.K(17);
        final zoa a3 = zoa.A;
        final mnn d = new mnn(0L, i, vy4.b(a3), (soa)null, a2, 0L, 0L, 0, 3, tsf.D(1.5), vy4.j, 15531993);
        this.d = d;
        this.e = mnn.a(d, 0L, 0L, vy4.b(eqi.b0()), (soa)null, (una)null, 0L, (wgn)null, 0, 0L, (idd)null, 0, 16777211);
        final mnn f = new mnn(0L, tsf.K(15), vy4.b(a3), (soa)null, ((vna)vy4.e.b).a(15.0f), 0L, 0L, 0, 3, tsf.D(1.6), vy4.j, 15531993);
        this.f = f;
        this.g = mnn.a(f, 0L, 0L, vy4.b(eqi.b0()), (soa)null, (una)null, 0L, (wgn)null, 0, 0L, (idd)null, 0, 16777211);
        this.h = new mnn(0L, tsf.K(15), vy4.a(a3), (soa)null, ((vna)vy4.e.c).a(13.0f), 0L, 0L, 0, 1, tsf.D(1.5), vy4.j, 15531993);
        this.i = new mnn(0L, tsf.K(13), vy4.a(a3), (soa)null, ((vna)vy4.e.c).a(11.0f), 0L, 0L, 0, 1, tsf.D(1.5), vy4.j, 15531993);
    }
    
    public void a() {
        final ksg ksg = (ksg)this.i;
        if (ksg.getValue()) {
            return;
        }
        ((uq)this.b).a.edit().putBoolean("dispatch_upsell_dismissed", true).apply();
        ksg.setValue((Object)Boolean.TRUE);
    }
    
    public Object b(lta v, h07 v2) {
        final String s = (String)this.b;
        Object h = null;
        Label_0058: {
            if (v2 instanceof znj) {
                h = v2;
                final int b = ((znj)h).B;
                if ((b & Integer.MIN_VALUE) != 0x0) {
                    ((znj)h).B = b + Integer.MIN_VALUE;
                    break Label_0058;
                }
            }
            h = new znj(this, v2);
        }
        Object o = ((znj)h).z;
        final int b2 = ((znj)h).B;
        final pc7 v3 = pc7.v;
        String w = null;
        Label_0309: {
            Label_0160: {
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            final Object y = ((znj)h).x;
                            v = (lta)((znj)h).v;
                            try {
                                try {
                                    vt4.g0(o);
                                    final Object o2 = y;
                                }
                                catch (final Exception h) {}
                            }
                            catch (final CancellationException ex) {
                                throw ex;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w = ((znj)h).w;
                    v = (lta)(v2 = (h07)((znj)h).v);
                    Label_0598: {
                        try {
                            vt4.g0(o);
                            break Label_0309;
                        }
                        catch (final Exception ex2) {
                            break Label_0598;
                        }
                        break Label_0160;
                    }
                    ((q1)v2).k(p7.INTERNAL_ERROR);
                    throw;
                }
            }
            vt4.g0(o);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(".fetch");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder("Fetch and save (");
            sb2.append(s);
            sb2.append(")");
            final Object y = y7j.P(string, sb2.toString(), (q1)null);
            w = (String)((jta)this.i).a();
            ((znj)h).v = (q1)y;
            ((znj)h).w = w;
            ((znj)h).B = 1;
            o = v.b(h);
            if (o == v3) {
                return v3;
            }
            v = (lta)y;
        }
        Object y = o;
        int n;
        if (y == null) {
            n = -1;
        }
        else if (y instanceof qj0) {
            n = 0;
        }
        else if (y instanceof pj0) {
            n = 1;
        }
        else {
            n = -2;
        }
        Label_0557: {
            if (n != 0) {
                if (n == 1) {
                    break Label_0557;
                }
                throw new RuntimeException();
            }
            final Object b3 = ((qj0)y).b;
            while (true) {
                try {
                    ((znj)h).v = (q1)v;
                    ((znj)h).w = null;
                    ((znj)h).x = (ApiResult)y;
                    ((znj)h).y = (ApiResult)y;
                    ((znj)h).B = 2;
                    h = this.h(b3, w, (h07)h);
                    if (h == v3) {
                        return v3;
                    }
                    final Object o2 = y;
                    y = o2;
                    break Label_0557;
                }
                catch (final Exception ex3) {}
                final fvg fvg = (fvg)this.a;
                final StringBuilder sb3 = new StringBuilder("Failed to cache response to ");
                sb3.append((Object)fvg);
                SilentException.a(new SilentException(sb3.toString(), (Throwable)h), (lpl)null, (List)null, 7);
                final Object o2 = y;
                continue;
            }
        }
        p7 p7;
        if ((p7 = ((q1)v).a()) == null) {
            p7 = io.sentry.p7.OK;
        }
        ((q1)v).k(p7);
        return y;
    }
    
    public Object c(final boolean b, h07 ex) {
        final String s = (String)this.b;
        Label_0060: {
            if (ex instanceof aoj) {
                final Object o = ex;
                final int y = ((aoj)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((aoj)o).y = y + Integer.MIN_VALUE;
                    ex = (Exception)o;
                    break Label_0060;
                }
            }
            ex = (Exception)new aoj(this, (h07)ex);
        }
        Object o2 = ((aoj)ex).w;
        final int y2 = ((aoj)ex).y;
        Object p = null;
        Label_0271: {
            if (y2 != 0) {
                if (y2 == 1) {
                    p = (ex = (Exception)((aoj)ex).v);
                    try {
                        vt4.g0(o2);
                        break Label_0271;
                    }
                    catch (final Exception ex2) {
                        p = ex;
                        ex = ex2;
                        break Label_0271;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(o2);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(".getCached");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder("Load cache (");
            sb2.append(s);
            sb2.append(")");
            p = y7j.P(string, sb2.toString(), (q1)null);
            while (true) {
                try {
                    final wo8 wo8 = (wo8)this.g;
                    try {
                        ((y38)wo8).getClass();
                        final o68 a = vo8.a;
                        final d58 w = d58.w;
                        try {
                            final m10 m10 = new m10((Object)this, b, (f07)null, (byte)4);
                            ((aoj)ex).v = (q1)p;
                            ((aoj)ex).y = 1;
                            o2 = rhc.f0((hc7)w, (zta)m10, (f07)ex);
                            ex = (Exception)pc7.v;
                            if (o2 == ex) {
                                return ex;
                            }
                            ex = (Exception)p;
                            p7 p2;
                            if ((p2 = ((q1)p).a()) == null) {
                                ex = (Exception)p;
                                p2 = p7.OK;
                            }
                            ex = (Exception)p;
                            ((q1)p).k(p2);
                            return o2;
                        }
                        catch (final Exception ex3) {}
                    }
                    catch (final Exception ex) {}
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
        ((q1)p).k(p7.INTERNAL_ERROR);
        throw ex;
    }
    
    public String d(final String s) {
        return lmf.s("ChatScreenDataStateKeeper_", s, "_", (String)this.a);
    }
    
    public void e(final yl1 yl1, final int n) {
        byte[] b = yl1.b;
        final a3k a3k = (a3k)this.f;
        final pfo a = ((o8f)this.b).a(yl1.a);
        al1.e(0L);
        long n2 = 0L;
        while (a3k.t((k7n)new iyo(this, yl1, (byte)0))) {
            final Iterable iterable = (Iterable)a3k.t((k7n)new iyo(this, yl1, (byte)1));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] array = null;
            al1 al1 = null;
            Label_1522: {
                if (a == null) {
                    c5q.t((Object)yl1, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                    final al1 a2 = al1.a();
                    array = b;
                    al1 = a2;
                }
                else {
                    final ArrayList list = new ArrayList();
                    final Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        list.add((Object)((pl1)iterator.next()).c);
                    }
                    if (b != null) {
                        final a3k a3k2 = (a3k)this.i;
                        Objects.requireNonNull((Object)a3k2);
                        final f45 f45 = (f45)a3k.t((k7n)new hyo(a3k2, (byte)0));
                        final Object o = new Object();
                        ((re0)o).A = new HashMap();
                        ((re0)o).y = ((l55)this.g).a();
                        ((re0)o).z = ((l55)this.h).a();
                        ((re0)o).v = "GDT_CLIENT_METRICS";
                        ((re0)o).x = new n99(new q99("proto"), f45.a());
                        list.add((Object)((i73)a).a(((re0)o).k()));
                    }
                    final xr5 a3 = zk1.a();
                    a3.B(list);
                    a3.C(b);
                    final zk1 a4 = a3.a();
                    final i73 i73 = (i73)a;
                    final HashMap hashMap = new HashMap();
                    for (final fl1 fl1 : a4.b()) {
                        final String a5 = fl1.a;
                        if (!hashMap.containsKey((Object)a5)) {
                            final ArrayList list2 = new ArrayList();
                            list2.add((Object)fl1);
                            hashMap.put((Object)a5, (Object)list2);
                        }
                        else {
                            ((List)hashMap.get((Object)a5)).add((Object)fl1);
                        }
                    }
                    final ArrayList list3 = new ArrayList();
                    for (final Map$Entry map$Entry : hashMap.entrySet()) {
                        final fl1 fl2 = (fl1)((List)map$Entry.getValue()).get(0);
                        final xz8 xz8 = new xz8('\0');
                        final zli v = zli.v;
                        xz8.G();
                        xz8.H(i73.f.a());
                        xz8.I(i73.e.a());
                        final vcc vcc = new vcc((byte)8, false);
                        vcc.w = b45.v;
                        final xk1 xk1 = new xk1();
                        xk1.m(Integer.valueOf(fl2.b("sdk-version")));
                        xk1.j(fl2.a("model"));
                        xk1.f(fl2.a("hardware"));
                        xk1.d(fl2.a("device"));
                        xk1.l(fl2.a("product"));
                        xk1.k(fl2.a("os-uild"));
                        xk1.h(fl2.a("manufacturer"));
                        xk1.e(fl2.a("fingerprint"));
                        xk1.c(fl2.a("country"));
                        xk1.g(fl2.a("locale"));
                        xk1.i(fl2.a("mcc_mnc"));
                        xk1.b(fl2.a("application_build"));
                        vcc.x = xk1.a();
                        xz8.A(new cl1((b45)vcc.w, (yk1)vcc.x));
                        try {
                            xz8.J(Integer.parseInt((String)map$Entry.getKey()));
                        }
                        catch (final NumberFormatException ex) {
                            xz8.K((String)map$Entry.getKey());
                        }
                        final ArrayList list4 = new ArrayList();
                        for (final fl1 fl3 : (List)map$Entry.getValue()) {
                            final n99 c = fl3.c;
                            final q99 a6 = c.a;
                            final byte[] b2 = c.b;
                            xz8 xz9;
                            if (a6.equals((Object)new q99("proto"))) {
                                xz9 = new xz8('\0');
                                xz9.L(b2);
                            }
                            else if (a6.equals((Object)new q99("json"))) {
                                final String s = new String(b2, Charset.forName("UTF-8"));
                                xz9 = new xz8('\0');
                                xz9.M(s);
                            }
                            else {
                                if (Log.isLoggable("TRuntime.CctTransportBackend", 5)) {
                                    final StringBuilder sb = new StringBuilder("Received event of unsupported encoding ");
                                    sb.append((Object)a6);
                                    sb.append(". Skipping...");
                                    Log.w("TRuntime.CctTransportBackend", sb.toString());
                                    continue;
                                }
                                continue;
                            }
                            xz9.C(fl3.d);
                            xz9.D(fl3.e);
                            final String s2 = (String)fl3.f.get((Object)"tz-offset");
                            long longValue;
                            if (s2 == null) {
                                longValue = 0L;
                            }
                            else {
                                longValue = Long.valueOf(s2);
                            }
                            xz9.N(longValue);
                            final xr5 xr5 = new xr5((byte)8);
                            xr5.E(qsf.a(fl3.b("net-type")));
                            xr5.D((psf)psf.v.get(fl3.b("mobile-subtype")));
                            xz9.F(xr5.c());
                            final Integer b3 = fl3.b;
                            if (b3 != null) {
                                xz9.B(b3);
                            }
                            list4.add((Object)xz9.b());
                        }
                        xz8.E(list4);
                        list3.add((Object)xz8.e());
                    }
                    final byte[] array2 = b;
                    final bl1 bl1 = new bl1(list3);
                    URL url = i73.d;
                    final byte[] c2 = a4.c();
                    Object o2 = null;
                    final Object o3 = null;
                    if (c2 != null) {
                        try {
                            final tu2 a7 = tu2.a(a4.c());
                            final String b4 = a7.b;
                            o2 = o3;
                            if (b4 != null) {
                                o2 = b4;
                            }
                            url = i73.b(a7.a);
                        }
                        catch (final IllegalArgumentException ex2) {
                            al1 = al1.a();
                            array = array2;
                            break Label_1522;
                        }
                    }
                    Label_1502: {
                        int a8;
                        try {
                            final ov0 l = mcr.l(new pp7((Object)url, (Object)bl1, o2), new dv0((Object)i73, (byte)4), new my8((byte)19));
                            a8 = l.a;
                            if (a8 == 200) {
                                al1 = al1.e(l.b);
                                array = array2;
                                break Label_1522;
                            }
                        }
                        catch (final IOException ex3) {
                            break Label_1502;
                        }
                        if (a8 >= 500 || a8 == 404) {
                            al1 = al1.f();
                            array = array2;
                            break Label_1522;
                        }
                        if (a8 == 400) {
                            al1 = al1.d();
                            array = array2;
                            break Label_1522;
                        }
                        al1 = al1.a();
                        array = array2;
                        break Label_1522;
                    }
                    final IOException ex3;
                    c5q.u((Exception)ex3, "CctTransportBackend", "Could not make request to the backend");
                    al1 = al1.f();
                    array = array2;
                }
            }
            if (al1.c() == 2) {
                a3k.t((k7n)new y98(this, iterable, yl1, n2));
                ((zn0)this.d).E(yl1, n + 1, true);
                return;
            }
            a3k.t((k7n)new pm7((Object)this, (Object)iterable, (byte)19));
            long max;
            if (al1.c() == 1) {
                max = Math.max(n2, al1.b());
                if (array != null) {
                    a3k.t((k7n)new uxa((Object)this, (byte)10));
                    max = max;
                }
            }
            else {
                max = n2;
                if (al1.c() == 4) {
                    final HashMap hashMap2 = new HashMap();
                    final Iterator iterator5 = iterable.iterator();
                    while (iterator5.hasNext()) {
                        final String a9 = ((pl1)iterator5.next()).c.a;
                        if (!hashMap2.containsKey((Object)a9)) {
                            hashMap2.put((Object)a9, (Object)1);
                        }
                        else {
                            hashMap2.put((Object)a9, (Object)((int)hashMap2.get((Object)a9) + 1));
                        }
                    }
                    a3k.t((k7n)new pm7((Object)this, (Object)hashMap2, (byte)20));
                    max = n2;
                }
            }
            b = array;
            n2 = max;
        }
        a3k.t((k7n)new x2k(n2, (Object)this, (Object)yl1));
    }
    
    public void f() {
        final ksg ksg = (ksg)this.f;
        if (ksg.getValue()) {
            return;
        }
        ((uq)this.b).a.edit().putBoolean("onboarding_completed", true).apply();
        ksg.setValue((Object)Boolean.TRUE);
    }
    
    public Object g(final MemorySettingsResponse memorySettingsResponse, final h07 h07) {
        boj boj2 = null;
        Label_0051: {
            if (h07 instanceof boj) {
                final boj boj = (boj)h07;
                final int x = boj.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    boj.x = x + Integer.MIN_VALUE;
                    boj2 = boj;
                    break Label_0051;
                }
            }
            boj2 = new boj(this, h07);
        }
        final Object v = boj2.v;
        final int x2 = boj2.x;
        if (x2 != 0 && x2 == 1) {
            try {
                vt4.g0(v);
                return lqo.a;
            }
            catch (final Exception ex) {}
            catch (final CancellationException ex2) {
                throw ex2;
            }
            final fvg fvg = (fvg)this.a;
            final StringBuilder sb = new StringBuilder("Failed to cache response to ");
            sb.append((Object)fvg);
            final Exception ex;
            SilentException.a(new SilentException(sb.toString(), (Throwable)ex), (lpl)null, (List)null, 7);
            return lqo.a;
        }
        goto Label_0092;
    }
    
    public Object h(final Object p0, final String p1, final h07 p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        nq.b:Ljava/lang/Object;
        //     4: checkcast       Ljava/lang/String;
        //     7: astore          8
        //     9: aload_3        
        //    10: instanceof      Lcoj;
        //    13: ifeq            50
        //    16: aload_3        
        //    17: checkcast       Lcoj;
        //    20: astore          7
        //    22: aload           7
        //    24: getfield        coj.y:I
        //    27: istore          4
        //    29: iload           4
        //    31: ldc             -2147483648
        //    33: iand           
        //    34: ifeq            50
        //    37: aload           7
        //    39: iload           4
        //    41: ldc             -2147483648
        //    43: iadd           
        //    44: putfield        coj.y:I
        //    47: goto            61
        //    50: new             Lcoj;
        //    53: dup            
        //    54: aload_0        
        //    55: aload_3        
        //    56: invokespecial   coj.<init>:(Lnq;Lh07;)V
        //    59: astore          7
        //    61: aload           7
        //    63: getfield        coj.w:Ljava/lang/Object;
        //    66: astore_3       
        //    67: aload           7
        //    69: getfield        coj.y:I
        //    72: istore          4
        //    74: iload           4
        //    76: ifeq            116
        //    79: iload           4
        //    81: iconst_1       
        //    82: if_icmpne       108
        //    85: aload           7
        //    87: getfield        coj.v:Lio/sentry/q1;
        //    90: astore_2       
        //    91: aload_2        
        //    92: astore_1       
        //    93: aload_3        
        //    94: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //    97: goto            287
        //   100: astore_3       
        //   101: aload_1        
        //   102: astore_2       
        //   103: aload_3        
        //   104: astore_1       
        //   105: goto            347
        //   108: ldc_w           "call to 'resume' before 'invoke' with coroutine"
        //   111: invokestatic    en9.q:(Ljava/lang/String;)V
        //   114: aconst_null    
        //   115: areturn        
        //   116: aload_3        
        //   117: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   120: new             Ljava/lang/StringBuilder;
        //   123: dup            
        //   124: invokespecial   java/lang/StringBuilder.<init>:()V
        //   127: astore_3       
        //   128: aload_3        
        //   129: aload           8
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: pop            
        //   135: aload_3        
        //   136: ldc_w           ".saveCached"
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: pop            
        //   143: aload_3        
        //   144: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   147: astore          9
        //   149: new             Ljava/lang/StringBuilder;
        //   152: dup            
        //   153: ldc_w           "Save cache ("
        //   156: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   159: astore_3       
        //   160: aload_3        
        //   161: aload           8
        //   163: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   166: pop            
        //   167: aload_3        
        //   168: ldc_w           ")"
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: pop            
        //   175: aload           9
        //   177: aload_3        
        //   178: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   181: aconst_null    
        //   182: invokestatic    y7j.P:(Ljava/lang/String;Ljava/lang/String;Lio/sentry/q1;)Lio/sentry/q1;
        //   185: astore_3       
        //   186: new             Lcom/anthropic/claude/app/appstart/CachedData;
        //   189: astore          8
        //   191: aload_0        
        //   192: getfield        nq.d:Ljava/lang/Object;
        //   195: checkcast       Lf60;
        //   198: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   201: pop            
        //   202: invokestatic    java/lang/System.currentTimeMillis:()J
        //   205: lstore          5
        //   207: aload           8
        //   209: aload_1        
        //   210: lload           5
        //   212: aload_2        
        //   213: invokespecial   com/anthropic/claude/app/appstart/CachedData.<init>:(Ljava/lang/Object;JLjava/lang/String;)V
        //   216: aload_0        
        //   217: getfield        nq.g:Ljava/lang/Object;
        //   220: checkcast       Lwo8;
        //   223: astore_1       
        //   224: aload_1        
        //   225: checkcast       Ly38;
        //   228: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   231: pop            
        //   232: getstatic       vo8.a:Lo68;
        //   235: astore_1       
        //   236: getstatic       d58.w:Ld58;
        //   239: astore_2       
        //   240: new             Lrf0;
        //   243: astore_1       
        //   244: aload_1        
        //   245: aload_0        
        //   246: aload           8
        //   248: aconst_null    
        //   249: bipush          20
        //   251: invokespecial   rf0.<init>:(Ljava/lang/Object;Ljava/lang/Object;Lf07;B)V
        //   254: aload           7
        //   256: aload_3        
        //   257: putfield        coj.v:Lio/sentry/q1;
        //   260: aload           7
        //   262: iconst_1       
        //   263: putfield        coj.y:I
        //   266: aload_2        
        //   267: aload_1        
        //   268: aload           7
        //   270: invokestatic    rhc.f0:(Lhc7;Lzta;Lf07;)Ljava/lang/Object;
        //   273: astore_1       
        //   274: getstatic       pc7.v:Lpc7;
        //   277: astore_2       
        //   278: aload_1        
        //   279: aload_2        
        //   280: if_acmpne       285
        //   283: aload_2        
        //   284: areturn        
        //   285: aload_3        
        //   286: astore_2       
        //   287: aload_2        
        //   288: astore_1       
        //   289: getstatic       lqo.a:Llqo;
        //   292: astore          8
        //   294: aload_2        
        //   295: astore_1       
        //   296: aload_2        
        //   297: invokeinterface io/sentry/q1.a:()Lio/sentry/p7;
        //   302: astore          7
        //   304: aload           7
        //   306: astore_3       
        //   307: aload           7
        //   309: ifnonnull       318
        //   312: aload_2        
        //   313: astore_1       
        //   314: getstatic       io/sentry/p7.OK:Lio/sentry/p7;
        //   317: astore_3       
        //   318: aload_2        
        //   319: astore_1       
        //   320: aload_2        
        //   321: aload_3        
        //   322: invokeinterface io/sentry/q1.k:(Lio/sentry/p7;)V
        //   327: aload           8
        //   329: areturn        
        //   330: astore_1       
        //   331: aload_3        
        //   332: astore_2       
        //   333: goto            347
        //   336: goto            331
        //   339: astore_1       
        //   340: goto            336
        //   343: astore_1       
        //   344: goto            336
        //   347: aload_2        
        //   348: getstatic       io/sentry/p7.INTERNAL_ERROR:Lio/sentry/p7;
        //   351: invokeinterface io/sentry/q1.k:(Lio/sentry/p7;)V
        //   356: aload_1        
        //   357: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  93     97     100    108    Ljava/lang/Exception;
        //  186    191    330    331    Ljava/lang/Exception;
        //  191    207    343    347    Ljava/lang/Exception;
        //  207    216    330    331    Ljava/lang/Exception;
        //  216    224    343    347    Ljava/lang/Exception;
        //  224    240    339    343    Ljava/lang/Exception;
        //  240    274    330    331    Ljava/lang/Exception;
        //  289    294    100    108    Ljava/lang/Exception;
        //  296    304    100    108    Ljava/lang/Exception;
        //  314    318    100    108    Ljava/lang/Exception;
        //  320    327    100    108    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0285:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1100)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        //     at java.lang.Thread.run(Thread.java:1572)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Object i(lta ex, h07 p) {
        final String s = (String)this.b;
        Object o = null;
        Label_0058: {
            if (p instanceof doj) {
                o = p;
                final int y = ((doj)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((doj)o).y = y + Integer.MIN_VALUE;
                    break Label_0058;
                }
            }
            o = new doj(this, p);
        }
        final Object w = ((doj)o).w;
        final int y2 = ((doj)o).y;
        Label_0263: {
            if (y2 != 0) {
                if (y2 == 1) {
                    p = (h07)(ex = (Exception)((doj)o).v);
                    try {
                        vt4.g0(w);
                        break Label_0263;
                    }
                    catch (final Exception ex2) {
                        p = (h07)ex;
                        ex = ex2;
                        break Label_0263;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(w);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(".updateCached");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder("Update cache (");
            sb2.append(s);
            sb2.append(")");
            p = (h07)y7j.P(string, sb2.toString(), (q1)null);
            while (true) {
                try {
                    final wo8 wo8 = (wo8)this.g;
                    try {
                        ((y38)wo8).getClass();
                        final o68 a = vo8.a;
                        final d58 w2 = d58.w;
                        try {
                            final r7g r7g = new r7g((Object)this, (Object)ex, (f07)null, (byte)18);
                            ((doj)o).v = (q1)p;
                            ((doj)o).y = 1;
                            final Object f0 = rhc.f0((hc7)w2, (zta)r7g, (f07)o);
                            ex = (Exception)pc7.v;
                            if (f0 == ex) {
                                return ex;
                            }
                            ex = (Exception)p;
                            final lqo a2 = lqo.a;
                            ex = (Exception)p;
                            p7 p2;
                            if ((p2 = ((q1)p).a()) == null) {
                                ex = (Exception)p;
                                p2 = p7.OK;
                            }
                            ex = (Exception)p;
                            ((q1)p).k(p2);
                            return a2;
                        }
                        catch (final Exception ex3) {}
                    }
                    catch (final Exception ex) {}
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
        ((q1)p).k(p7.INTERNAL_ERROR);
        throw ex;
    }
}
