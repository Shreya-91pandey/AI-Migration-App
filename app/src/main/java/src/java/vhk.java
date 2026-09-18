import java.util.AbstractMap;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.HashMap;
import com.google.android.gms.common.api.Status;
import java.io.Serializable;
import java.util.Date;
import java.util.Map$Entry;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.networking.cookies.serializer.SerializableCookie;
import java.util.Collection;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import android.content.SharedPreferences;
import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$System;
import android.os.SystemClock;
import com.anthropic.claude.types.strings.MessageId;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentHashMap;
import android.view.WindowInsetsAnimation$Bounds;
import android.content.Context;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.Reference;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class vhk implements qpp, y08, wcq, zgq
{
    public final byte v;
    public Object w;
    public Object x;
    
    public vhk(final byte v) {
        switch (this.v = v) {
            default: {
                this.w = new cof();
                this.x = new AtomicInteger(0);
                return;
            }
            case 25: {
                this.w = Collections.synchronizedMap((Map)new WeakHashMap());
                this.x = Collections.synchronizedMap((Map)new WeakHashMap());
                return;
            }
            case 20: {
                this.w = new inf(0, (Object[])new Reference[16]);
                this.x = new ReferenceQueue();
                return;
            }
            case 18: {
                this.w = new wab((byte)26);
                this.x = new lyd(16);
            }
        }
    }
    
    public vhk(final Context x, final rjc w) {
        this.v = 14;
        this.x = x;
        this.w = w;
    }
    
    public vhk(final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
        this.v = 22;
        this.w = dec.d(p4.z(windowInsetsAnimation$Bounds));
        this.x = dec.d(p4.i(windowInsetsAnimation$Bounds));
    }
    
    public vhk(final ap2 w) {
        this.v = 13;
        this.w = w;
        this.x = new Object();
    }
    
    public vhk(final f60 f60) {
        this.v = 16;
        this.w = new ConcurrentHashMap();
        this.x = new AtomicBoolean(false);
    }
    
    public vhk(final gfk w, final ucq x, final eup eup) {
        this.v = 24;
        this.w = w;
        this.x = x;
    }
    
    public vhk(final lta lta) {
        this.v = 4;
        this.w = new vhk((byte)5);
        this.x = new gfk((Object)lta);
    }
    
    public vhk(final lta w, final Object o) {
        this.v = 8;
        this.w = w;
        this.x = o50.Q(o);
    }
    
    public vhk(final lta lta, final zta zta) {
        this.v = 3;
        this.w = new vhk((byte)5);
        this.x = new pnl(lta, zta);
    }
    
    public vhk(final oc7 w) {
        this.v = 2;
        this.w = w;
        this.x = new x8m();
    }
    
    public vhk(final rjc rjc, final byte v) {
        switch (this.v = v) {
            default: {
                this.w = rjc;
                this.x = new LinkedHashMap();
                return;
            }
            case 10: {
                final kx7 x = new kx7(rjc);
                this.w = rjc;
                this.x = x;
            }
        }
    }
    
    public vhk(final unn unn, final aqo w) {
        this.v = 17;
        this.w = w;
        this.x = o50.Q((Object)unn);
    }
    
    public static void q(final z08 z08, final String s, final String s2, final long n) {
        final List a = adn.a;
        final SilentException ex = new SilentException(lmf.s("Decode fallback: ", ((Enum)z08).name(), " ", s));
        final Map z9 = y5e.Z(new yog[] { new yog((Object)"mechanism", (Object)((Enum)z08).name()), new yog((Object)"type", (Object)s), new yog((Object)"error_class", (Object)s2), new yog((Object)"suppressed_count", (Object)n) });
        final String name = ((Enum)z08).name();
        String s3 = s2;
        if (s2 == null) {
            s3 = "none";
        }
        adn.f((Throwable)ex, (String)null, lpl.w, z9, lq6.Y((Object[])new String[] { "decode_fallback", name, s, s3 }), 18);
    }
    
    @Override
    public String a() {
        final wnp d1 = ((oc4)((v2b)this.x).w).d1();
        if (d1 != null) {
            final MessageId messageId = (MessageId)d1.e.getValue();
            if (messageId != null) {
                return messageId.a;
            }
        }
        return null;
    }
    
    @Override
    public void b(final boolean b) {
        final oc4 oc4 = (oc4)((v2b)this.x).w;
        final wnp d1 = oc4.d1();
        if (d1 != null) {
            final b87 c = d1.c;
            d1.a();
            oc4.M3.setValue((Object)null);
            ((fg4)this.w).h((Object)c.S().B, (Object)c.e, (Object)jf8.w);
        }
        if (b || oc4.z0() != null) {
            oc4.E1();
        }
        if (b) {
            rhc.G((oc7)((tvj)oc4).v, (hc7)null, 0, (zta)new g24((Object)new ca4(oc4, (byte)1), (Object)oc4, (f07)null, (byte)4), 3);
        }
    }
    
    @Override
    public opp c() {
        final wnp d1 = ((oc4)((v2b)this.x).w).d1();
        if (d1 != null) {
            final opp e = ((g92)d1.a).E();
            if (e != null) {
                return e;
            }
        }
        return opp.w;
    }
    
    @Override
    public void d(final v72 v72, final oc7 oc7) {
        rhc.G(oc7, (hc7)null, 0, (zta)new s9l((Object)this, (Object)v72, (f07)null, (byte)21), 3);
    }
    
    @Override
    public Map e() {
        final wnp d1 = ((oc4)((v2b)this.x).w).d1();
        Map map;
        if (d1 != null) {
            map = (Map)d1.f.getValue();
        }
        else {
            map = null;
        }
        Object v = map;
        if (map == null) {
            v = s89.v;
        }
        return (Map)v;
    }
    
    public Object f() {
        return new scq((Context)((gfk)this.w).v, (fdq)((ucq)this.x).f(), new awp((byte)28));
    }
    
    @Override
    public Map g() {
        final wnp d1 = ((oc4)((v2b)this.x).w).d1();
        if (d1 != null) {
            final Map map = (Map)d1.d.getValue();
            if (map != null) {
                return map;
            }
        }
        return (Map)s89.v;
    }
    
    @Override
    public void h(final z08 z08, final String s, final String s2) {
        final vdn vdn = new vdn(z08, s, s2);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)this.w;
        udn udn;
        if ((udn = (udn)concurrentHashMap.get((Object)vdn)) == null) {
            if (concurrentHashMap.size() >= 128) {
                if (((AtomicBoolean)this.x).compareAndSet(false, true)) {
                    final List a = adn.a;
                    final SilentException ex = new SilentException("Decode fallback dedup table full; further new keys unreported");
                    final Map singletonMap = Collections.singletonMap((Object)"max_keys", (Object)128);
                    singletonMap.getClass();
                    adn.f((Throwable)ex, (String)null, lpl.w, singletonMap, lq6.Y((Object[])new String[] { "decode_fallback", "overflow" }), 18);
                }
                return;
            }
            if ((udn = (udn)concurrentHashMap.putIfAbsent((Object)vdn, (Object)new udn(elapsedRealtime))) == null) {
                q(z08, s, s2, 0L);
                return;
            }
        }
        final long value = udn.a().get();
        if (elapsedRealtime - value >= 600000L && udn.a().compareAndSet(value, elapsedRealtime)) {
            q(z08, s, s2, udn.b().getAndSet(0L));
            return;
        }
        udn.b().incrementAndGet();
    }
    
    @Override
    public boolean i() {
        return ((oc4)((v2b)this.x).w).d1() != null;
    }
    
    public boolean j(final v4q v4q) {
        final Object x = this.x;
        synchronized (x) {
            return ((Map)((ap2)this.w).v).containsKey((Object)v4q);
        }
    }
    
    public void k() {
        final ksg ksg = (ksg)this.x;
        Object a = q7m.a();
        Object o;
        if (a != null) {
            o = ((r7m)a).e();
        }
        else {
            o = null;
        }
        Object o2 = q7m.b((r7m)a);
        try {
            final unn unn = (unn)ksg.getValue();
            q7m.d((r7m)a, (r7m)o2, (lta)o);
            if (unn != null) {
                a = this.w;
                o = ((aqo)a).b;
                o2 = ((aqo)a).c;
                ((v8m)o2).clear();
                while (((v8m)o2).size() + ((v8m)o).size() > ((aqo)a).a - 1) {
                    if (((v8m)o).isEmpty()) {
                        oyl.i("List is empty.");
                        return;
                    }
                    ((v8m)o).remove(0);
                }
                ((v8m)o).add((Object)unn);
            }
            ksg.setValue((Object)null);
        }
        finally {
            q7m.d((r7m)a, (r7m)o2, (lta)o);
        }
    }
    
    public int l() {
        try {
            return Settings$System.getInt(((Context)this.x).getContentResolver(), "screen_brightness");
        }
        catch (final Settings$SettingNotFoundException ex) {
            c5q.E((rjc)this.w, 4, qjc.w, (jta)new g5q(), (Throwable)ex, false, 48);
            return Integer.MIN_VALUE;
        }
    }
    
    public void m(final Object o) {
        final ktp ktp = (ktp)o;
        final List a = adn.a;
        final yog yog = new yog((Object)"ui_thread_ms", (Object)ktp.getTotalTimeInUiThreadMillis());
        final yog yog2 = new yog((Object)"max_task_ms", (Object)ktp.getMaxTimePerTaskInUiThreadMillis());
        final List a2 = ktp.a();
        Integer value;
        if (a2 != null) {
            value = a2.size();
        }
        else {
            value = null;
        }
        adn.e(2, "startUpWebView done", (String)null, y5e.Z(new yog[] { yog, yog2, new yog((Object)"blocking_locations", (Object)value) }));
        eup.A((AtomicBoolean)this.w, (l13)this.x);
    }
    
    public void n(final unn unn) {
        final ksg ksg = (ksg)this.x;
        final r7m a = q7m.a();
        Object value;
        if (a != null) {
            value = a.e();
        }
        else {
            value = null;
        }
        final r7m b = q7m.b(a);
        try {
            final unn unn2 = (unn)ksg.getValue();
            q7m.d(a, b, (lta)value);
            if (unn2 == null) {
                ksg.setValue((Object)unn);
                return;
            }
            value = pkq.f(unn2, unn);
            if (value != null) {
                ksg.setValue(value);
                return;
            }
            this.k();
            ksg.setValue((Object)unn);
        }
        finally {
            q7m.d(a, b, (lta)value);
        }
    }
    
    public com o(final v4q v4q) {
        final Object x = this.x;
        synchronized (x) {
            return ((ap2)this.w).d(v4q);
        }
    }
    
    public void p() {
        final SharedPreferences sharedPreferences = (SharedPreferences)this.w;
        final Map all = sharedPreferences.getAll();
        if (all != null) {
            final Set keySet = all.keySet();
            if (keySet != null) {
                final Iterable iterable = (Iterable)keySet;
                final ArrayList list = new ArrayList();
                for (final Object next : iterable) {
                    final String s = (String)next;
                    s.getClass();
                    if (rym.y0(s, "|__Host-ant_trusted_device", false)) {
                        list.add(next);
                    }
                }
                if (!list.isEmpty()) {
                    final SharedPreferences$Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        edit.remove((String)iterator2.next());
                    }
                    edit.commit();
                }
            }
        }
    }
    
    public void r(final Collection collection) {
        final SharedPreferences$Editor edit = ((SharedPreferences)this.w).edit();
        edit.getClass();
        for (final x97 x97 : (Iterable)collection) {
            final boolean f = x97.f;
            final String d = x97.d;
            String s;
            if (f) {
                s = "https";
            }
            else {
                s = "http";
            }
            final String t = lmf.t(s, "://", d, x97.e, smk.s("|", x97.a));
            final jqc a = ((arc)this.x).a;
            final String a2 = x97.a;
            final String b = x97.b;
            Long value = x97.c;
            if (!x97.h) {
                value = null;
            }
            edit.putString(t, a.c((Object)new SerializableCookie(a2, b, value, d, x97.e, x97.f, x97.g, x97.i), (KSerializer)SerializableCookie.Companion.serializer()));
        }
        edit.apply();
    }
    
    public String s(final cx7 cx7, final wbm wbm) {
        final nbm k = wbm.k;
        final ubm e = k.e;
        final kx7 kx7 = (kx7)this.x;
        final LinkedHashMap f0 = yi2.f0(kx7, e.d, "meta.usr", (Set)null, 12);
        final LinkedHashMap linkedHashMap = new LinkedHashMap(z5e.V(((Map)f0).size()));
        for (final Map$Entry map$Entry : (Iterable)f0.entrySet()) {
            final Object key = map$Entry.getKey();
            Object o = null;
            Label_0249: {
                while (true) {
                    try {
                        final Object value = map$Entry.getValue();
                        if (!mlc.q(value, eqi.c)) {
                            if (value != null) {
                                if (value instanceof Date) {
                                    o = String.valueOf(((Date)value).getTime());
                                    break Label_0249;
                                }
                                if (value instanceof dsc) {
                                    o = ((dsc)value).i();
                                    break Label_0249;
                                }
                                o = value.toString();
                                break Label_0249;
                            }
                        }
                        o = null;
                        break Label_0249;
                    }
                    catch (final Exception ex) {
                        c5q.F((rjc)this.w, 5, lq6.Y((Object[])new qjc[] { qjc.v, qjc.x }), (jta)new ix7(map$Entry, (byte)3), (Throwable)ex, 48);
                        continue;
                    }
                    break;
                }
            }
            ((Map)linkedHashMap).put(key, o);
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (final Map$Entry map$Entry2 : linkedHashMap.entrySet()) {
            if (map$Entry2.getValue() != null) {
                ((AbstractMap)linkedHashMap2).put(map$Entry2.getKey(), map$Entry2.getValue());
            }
        }
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap((Map)linkedHashMap2);
        final String a = e.a;
        final String b = e.b;
        final String c = e.c;
        final obm j = wbm.j;
        final LinkedHashMap f2 = yi2.f0(kx7, j.b, "metrics", (Set)null, 12);
        final Long a2 = j.a;
        final String a3 = k.a;
        final lbm b2 = k.b;
        final tbm d = k.d;
        final pbm f3 = k.f;
        final mbm g = k.g;
        final qbm h = k.h;
        final Map i = k.i;
        final String a4 = wbm.a;
        final String b3 = wbm.b;
        final String c2 = wbm.c;
        final String d2 = wbm.d;
        final String e2 = wbm.e;
        final String f4 = wbm.f;
        final long g2 = wbm.g;
        final long h2 = wbm.h;
        final long l = wbm.i;
        final zrc zrc = new zrc();
        zrc.m("trace_id", a4);
        zrc.m("span_id", b3);
        zrc.m("parent_id", c2);
        zrc.m("resource", d2);
        zrc.m("name", e2);
        zrc.m("service", f4);
        zrc.l((Number)g2, "duration");
        zrc.l((Number)h2, "start");
        zrc.l((Number)l, "error");
        zrc.m("type", "custom");
        final zrc zrc2 = new zrc();
        if (a2 != null) {
            lmf.y(a2, zrc2, "_top_level");
        }
        for (final Map$Entry map$Entry3 : f2.entrySet()) {
            final String s = (String)map$Entry3.getKey();
            final Number n = (Number)map$Entry3.getValue();
            if (!iw0.G0((Object[])obm.c, (Object)s)) {
                zrc2.l(n, s);
            }
        }
        zrc.j("metrics", (irc)zrc2);
        final zrc zrc3 = new zrc();
        zrc3.m("version", a3);
        final zrc zrc4 = new zrc();
        final String a5 = b2.a;
        if (a5 != null) {
            zrc4.m("source", a5);
        }
        final jbm b4 = b2.b;
        if (b4 != null) {
            final zrc zrc5 = new zrc();
            final String a6 = b4.a;
            if (a6 != null) {
                zrc5.m("id", a6);
            }
            zrc4.j("application", (irc)zrc5);
        }
        final rbm c3 = b2.c;
        if (c3 != null) {
            final zrc zrc6 = new zrc();
            final String a7 = c3.a;
            if (a7 != null) {
                zrc6.m("id", a7);
            }
            zrc4.j("session", (irc)zrc6);
        }
        final vbm d3 = b2.d;
        if (d3 != null) {
            final zrc zrc7 = new zrc();
            final String a8 = d3.a;
            if (a8 != null) {
                zrc7.m("id", a8);
            }
            zrc4.j("view", (irc)zrc7);
        }
        zrc3.j("_dd", (irc)zrc4);
        final zrc zrc8 = new zrc();
        zrc8.m("kind", "client");
        zrc3.j("span", (irc)zrc8);
        final zrc zrc9 = new zrc();
        zrc9.m("version", d.a);
        zrc3.j("tracer", (irc)zrc9);
        final zrc zrc10 = new zrc();
        if (a != null) {
            zrc10.m("id", a);
        }
        if (b != null) {
            zrc10.m("name", b);
        }
        if (c != null) {
            zrc10.m("email", c);
        }
        for (final Map$Entry map$Entry4 : linkedHashMap3.entrySet()) {
            final String s2 = (String)map$Entry4.getKey();
            final Object value2 = map$Entry4.getValue();
            if (!iw0.G0((Object[])ubm.e, (Object)s2)) {
                zrc10.j(s2, awp.t(value2));
            }
        }
        zrc3.j("usr", (irc)zrc10);
        if (f3 != null) {
            final zrc zrc11 = new zrc();
            final kbm a9 = f3.a;
            final zrc zrc12 = new zrc();
            final sbm a10 = a9.a;
            if (a10 != null) {
                final zrc zrc13 = new zrc();
                final String a11 = a10.a;
                if (a11 != null) {
                    zrc13.m("id", a11);
                }
                final String b5 = a10.b;
                if (b5 != null) {
                    zrc13.m("name", b5);
                }
                zrc12.j("sim_carrier", (irc)zrc13);
            }
            final String b6 = a9.b;
            if (b6 != null) {
                zrc12.m("signal_strength", b6);
            }
            final String c4 = a9.c;
            if (c4 != null) {
                zrc12.m("downlink_kbps", c4);
            }
            final String d4 = a9.d;
            if (d4 != null) {
                zrc12.m("uplink_kbps", d4);
            }
            final String e3 = a9.e;
            if (e3 != null) {
                zrc12.m("connectivity", e3);
            }
            zrc11.j("client", (irc)zrc12);
            zrc3.j("network", (irc)zrc11);
        }
        final zrc zrc14 = new zrc();
        final int a12 = g.a;
        if (a12 != 0) {
            String s3 = null;
            switch (a12) {
                default: {
                    throw null;
                }
                case 7: {
                    s3 = "other";
                    break;
                }
                case 6: {
                    s3 = "bot";
                    break;
                }
                case 5: {
                    s3 = "gaming_console";
                    break;
                }
                case 4: {
                    s3 = "tv";
                    break;
                }
                case 3: {
                    s3 = "tablet";
                    break;
                }
                case 2: {
                    s3 = "desktop";
                    break;
                }
                case 1: {
                    s3 = "mobile";
                    break;
                }
            }
            zrc14.j("type", (irc)new dsc(s3));
        }
        final String b7 = g.b;
        if (b7 != null) {
            zrc14.m("name", b7);
        }
        final String c5 = g.c;
        if (c5 != null) {
            zrc14.m("model", c5);
        }
        final String d5 = g.d;
        if (d5 != null) {
            zrc14.m("brand", d5);
        }
        final String e4 = g.e;
        if (e4 != null) {
            zrc14.m("architecture", e4);
        }
        zrc14.l((Number)g.f, "logical_cpu_count");
        final Number g3 = g.g;
        if (g3 != null) {
            zrc14.l(g3, "total_ram");
        }
        final Boolean h3 = g.h;
        if (h3 != null) {
            zrc14.k(h3, "is_low_ram");
        }
        zrc3.j("device", (irc)zrc14);
        final zrc zrc15 = new zrc();
        zrc15.m("name", h.a);
        zrc15.m("version", h.b);
        zrc15.m("version_major", h.c);
        zrc3.j("os", (irc)zrc15);
        for (final Map$Entry map$Entry5 : i.entrySet()) {
            final String s4 = (String)map$Entry5.getKey();
            final String s5 = (String)map$Entry5.getValue();
            if (!iw0.G0((Object[])nbm.j, (Object)s4)) {
                zrc3.m(s4, s5);
            }
        }
        zrc.j("meta", (irc)zrc3);
        final qqc qqc = new qqc(1);
        qqc.j((irc)zrc);
        final zrc zrc16 = new zrc();
        zrc16.j("spans", (irc)qqc);
        zrc16.m("env", cx7.d);
        return ((irc)zrc16).toString();
    }
    
    public void t(final Object o, final auc auc, final Object value) {
        ((ksg)this.x).setValue(value);
        ((lta)this.w).b(value);
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 22: {
                final StringBuilder sb = new StringBuilder("Bounds{lower=");
                sb.append((Object)this.w);
                sb.append(" upper=");
                sb.append((Object)this.x);
                sb.append("}");
                return sb.toString();
            }
        }
    }
    
    public void u(final com com, final int n) {
        ((f5q)this.x).a.execute((Runnable)new wsm((frh)this.w, com, false, n));
    }
    
    public com v(final v4q v4q) {
        final Object x = this.x;
        synchronized (x) {
            return ((ap2)this.w).f(v4q);
        }
    }
    
    public void w(final d9m d9m) {
        synchronized (this) {
            ((q70)this.w).a.edit().putLong("com.lyft.kronos.cached_current_time", d9m.a).apply();
            ((q70)this.w).a.edit().putLong("com.lyft.kronos.cached_elapsed_time", d9m.b).apply();
            ((q70)this.w).a.edit().putLong("com.lyft.kronos.cached_offset", d9m.c).apply();
        }
    }
    
    public Object x(Object v, int x, h07 o) {
        final vhk vhk = (vhk)this.w;
        Object o2 = null;
        Label_0065: {
            if (o instanceof c6) {
                final c6 c6 = (c6)o;
                final int a = c6.A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    c6.A = a + Integer.MIN_VALUE;
                    o2 = c6;
                    break Label_0065;
                }
            }
            o2 = new c6(this, (h07)o);
        }
        final Object y = ((c6)o2).y;
        final int a2 = ((c6)o2).A;
        if (a2 != 0) {
            if (a2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x = ((c6)o2).x;
            final cof w = ((c6)o2).w;
            final Object v2 = ((c6)o2).v;
            vt4.g0(y);
            o = w;
            v = v2;
        }
        else {
            vt4.g0(y);
            final cof w2 = (cof)vhk.w;
            ((c6)o2).v = v;
            ((c6)o2).w = w2;
            ((c6)o2).x = x;
            ((c6)o2).A = 1;
            final Object c7 = w2.c((f07)o2);
            final pc7 v3 = pc7.v;
            o = w2;
            if (c7 == v3) {
                return v3;
            }
        }
        try {
            if (((AtomicInteger)vhk.x).get() == x) {
                ((pnl)this.x).b.b(v);
            }
            return lqo.a;
        }
        finally {
            ((aof)o).g((Object)null);
        }
    }
    
    public Object y(final Serializable s, final xr5 xr5, final m6n m6n) {
        final Object m = ien.m((f07)m6n, (zta)new e6(this, ((AtomicInteger)((vhk)this.w).x).incrementAndGet(), xr5, s, (f07)null));
        if (m == pc7.v) {
            return m;
        }
        return lqo.a;
    }
    
    public void z(final boolean b, final Status status) {
        final Map map = (Map)this.w;
        synchronized (map) {
            final HashMap hashMap = new HashMap(map);
            monitorexit(map);
            final Map map2 = (Map)this.x;
            synchronized (map2) {
                final HashMap hashMap2 = new HashMap(map2);
                monitorexit(map2);
                for (final Map$Entry map$Entry : hashMap.entrySet()) {
                    if (b || (boolean)map$Entry.getValue()) {
                        ((BasePendingResult)map$Entry.getKey()).c(status);
                    }
                }
                for (final Map$Entry map$Entry2 : hashMap2.entrySet()) {
                    if (b || (boolean)map$Entry2.getValue()) {
                        ((qcn)map$Entry2.getKey()).c((Exception)new ApiException(status));
                    }
                }
            }
        }
    }
    
    public Object zza() {
        return new hfr(((g70)((gfk)this.w).v).a, (ofr)((zgq)this.x).zza());
    }
}
