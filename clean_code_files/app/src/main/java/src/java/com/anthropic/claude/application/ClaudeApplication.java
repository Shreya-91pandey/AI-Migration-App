package com.anthropic.claude.application;

import java.util.Iterator;
import io.sentry.android.core.performance.h;
import androidx.lifecycle.ProcessLifecycleOwner;
import android.app.Application$ActivityLifecycleCallbacks;
import io.sentry.n6;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import androidx.webkit.ProcessGlobalConfig;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import com.agog.mathdisplay.MathDisplayLogger;
import android.content.Context;
import io.sentry.u4;
import io.sentry.android.core.s1;
import io.sentry.android.core.v;
import io.sentry.l6;
import android.os.SystemClock;
import io.sentry.android.core.performance.g;
import android.app.Application;

public class ClaudeApplication extends Application implements tn6, hi8
{
    public static final int B = 0;
    public final d2d A;
    public di8 v;
    public txl w;
    public vn0 x;
    public final nto y;
    public final oto z;
    
    public ClaudeApplication() {
        this.y = new nto();
        this.z = new oto();
        this.A = ncq.F(3, (jta)new p1((Object)this, (byte)18));
    }
    
    public final void onCreate() {
        final g u = g.U;
        final long uptimeMillis = SystemClock.uptimeMillis();
        final g c = g.c();
        final h a = c.A;
        if (a.x == 0L) {
            a.i(uptimeMillis);
            c.e((Application)this);
        }
        super.onCreate();
        final tqd l = uqd.l;
        if ((((Context)this).getApplicationInfo().flags & 0x2) != 0x0) {
            uqd.l.getClass();
            final Object c2 = tqd.c;
            synchronized (c2) {
                new RuntimeException("LogcatLogger previously installed here");
                monitorexit(c2);
                tqd.b.add((Object)new def((byte)10));
            }
        }
        final pgf a2 = ep0.A;
        final Context applicationContext = ((Context)this).getApplicationContext();
        applicationContext.getClass();
        final jyk jyk = new jyk(cib.j(applicationContext, (f60)new Object()).n() ^ true);
        this.y.a = lq6.Y((Object[])new l6[] { (l6)jyk.b, (l6)new di9((byte)1), (l6)new di9((byte)0) });
        this.z.a = lq6.X((Object)jyk.c);
        final Context applicationContext2 = ((Context)this).getApplicationContext();
        applicationContext2.getClass();
        s1.b(applicationContext2, new v((byte)3), (u4)new en7((Object)this.y, (Object)this.z, (Object)jyk, (byte)7));
        final Context applicationContext3 = ((Context)this).getApplicationContext();
        applicationContext3.getClass();
        if (soh.n != null) {
            en9.q("Context already initialized");
            return;
        }
        soh.n = applicationContext3;
        q0g.a((Context)this, false);
        MathDisplayLogger.Companion.set((MathDisplayLogger)new en9((byte)11));
        this.v = ien.I((lta)new i1((Object)new tw4(this, (byte)0), (byte)19));
        final et0 et0 = (et0)oz1.i((Class)et0.class, (emi)null);
        final wo8 wo8 = (wo8)oz1.i((Class)wo8.class, (emi)null);
        final o68 a3 = vo8.a;
        rhc.G((oc7)et0, (hc7)d58.w, 0, (zta)new rf0((byte)6, (f07)null, (Object)this), 2);
        final List a4 = adn.a;
        final List e = hi8.f().d().e((Class)len.class);
        final boolean h = ((ep0)oz1.i((Class)ep0.class, (emi)null)).h();
        adn.a = c86.s1((Iterable)e);
        adn.b = h;
        fej.a.clear();
        fej.b.set(false);
        ri2.c = (y08)new vhk((f60)oz1.i((Class)f60.class, (emi)null));
        final aj0 a5 = wsp.a;
        final Set unmodifiableSet = Collections.unmodifiableSet((Set)tom.d);
        final HashSet set = new HashSet();
        for (final tom tom : unmodifiableSet) {
            if (tom.a.equals((Object)"STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2")) {
                set.add((Object)tom);
            }
        }
        if (!set.isEmpty()) {
            final Iterator iterator2 = set.iterator();
            while (true) {
                while (iterator2.hasNext()) {
                    if (((tom)iterator2.next()).a(this)) {
                        final jpj jpj;
                        Label_0663: {
                            Label_0652: {
                                try {
                                    final Object o = new Object();
                                    ((ProcessGlobalConfig)o).a = -1;
                                    if (wsp.i.a(this)) {
                                        ((ProcessGlobalConfig)o).a = 3;
                                        ProcessGlobalConfig.a((ProcessGlobalConfig)o);
                                        final lqo a6 = lqo.a;
                                        break Label_0663;
                                    }
                                }
                                finally {
                                    break Label_0652;
                                }
                                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                            }
                            jpj = new jpj((Throwable)jpj);
                        }
                        final Throwable a7 = kpj.a((Object)jpj);
                        if (a7 != null) {
                            SilentException.a(new SilentException("Failed to apply ProcessGlobalConfig", a7), (lpl)null, (List)null, 7);
                        }
                        mlc.f0((zta)new m33((byte)5, (f07)null, (Object)oz1.i((Class)j2b.class, (emi)null)));
                        this.w = (txl)hi8.f().d().d((Class)txl.class, (emi)null);
                        this.x = (vn0)oz1.i((Class)vn0.class, (emi)null);
                        final nto y = this.y;
                        final oto z = this.z;
                        final gyk b = jyk.b;
                        final di8 z2 = vzq.z;
                        if (z2 == null) {
                            throw new RuntimeException("No global Di: call startDi { } first", (Throwable)null);
                        }
                        y.a = lq6.Y((Object[])new l6[] { (l6)b, (l6)z2.d().d((Class)fyk.class, (emi)null), (l6)new xr7(new l7n((jta)new s8k((byte)5))), (l6)new di9((byte)1), (l6)new di9((byte)3), (l6)new di9((byte)2), (l6)new di9((byte)0), (l6)new di9((byte)4) });
                        final hyk c3 = jyk.c;
                        final Object o2 = new Object();
                        final di8 z3 = vzq.z;
                        if (z3 == null) {
                            throw new RuntimeException("No global Di: call startDi { } first", (Throwable)null);
                        }
                        z.a = lq6.Y((Object[])new n6[] { (n6)c3, (n6)o2, (n6)(jcm)z3.d().d((Class)jcm.class, (emi)null) });
                        ti6.a = true;
                        twl.C = false;
                        twl.D = false;
                        final txl w = this.w;
                        if (w == null) {
                            mlc.j0("activityLifecycleCallbacks");
                            throw null;
                        }
                        this.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)w);
                        final jbd a8 = ProcessLifecycleOwner.D.A;
                        final vn0 x = this.x;
                        if (x != null) {
                            a8.a((fbd)x);
                            final yw4 yw4 = (yw4)hi8.f().d().d((Class)yw4.class, (emi)null);
                            final uw4 uw4 = new uw4((gc7)o55.x, (byte)0);
                            final ili ili = (ili)yw4.e;
                            final et0 g = ili.g;
                            final o68 a9 = vo8.a;
                            rhc.G((oc7)g, (hc7)a9, 0, (zta)new pn((byte)27, (f07)null, (Object)ili), 2);
                            final v80 v80 = (v80)yw4.v;
                            if (!v80.d.getAndSet(true)) {
                                rhc.G((oc7)v80.b, (hc7)d58.w, 0, (zta)new pn((byte)1, (f07)null, (Object)v80), 2);
                            }
                            rhc.G((oc7)yw4.b, uuj.s0((hc7)d58.w, (hc7)uw4), 0, (zta)new vw4(yw4, null, (byte)0), 2);
                            final et0 b2 = yw4.b;
                            a9.getClass();
                            rhc.G((oc7)b2, uuj.s0((hc7)a9, (hc7)uw4), 0, (zta)new vw4(yw4, null, (byte)1), 2);
                            rhc.G((oc7)yw4.b, uuj.s0((hc7)a9, (hc7)uw4), 0, (zta)new ww4(yw4, null, (byte)0), 2);
                            rhc.G((oc7)yw4.b, uuj.s0((hc7)a9, (hc7)uw4), 0, (zta)new ww4(yw4, null, (byte)1), 2);
                            rhc.G((oc7)yw4.b, uuj.s0((hc7)a9, (hc7)uw4), 0, (zta)new o10((Object)yw4, (Object)uw4, (Object)jyk, (f07)null, (byte)12), 2);
                            final long uptimeMillis2 = SystemClock.uptimeMillis();
                            final h a10 = io.sentry.android.core.performance.g.c().A;
                            if (a10.e()) {
                                a10.v = this.getClass().getName().concat(".onCreate");
                                a10.y = uptimeMillis2;
                            }
                            return;
                        }
                        mlc.j0("foregroundDetector");
                        throw null;
                    }
                }
                final tqd i = uqd.l;
                continue;
            }
        }
        fvd.u("Unknown feature STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2");
    }
    
    public final void onTerminate() {
        super.onTerminate();
        final txl w = this.w;
        if (w != null) {
            this.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)w);
            return;
        }
        mlc.j0("activityLifecycleCallbacks");
        throw null;
    }
}
