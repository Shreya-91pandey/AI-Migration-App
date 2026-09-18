import com.anthropic.claude.connector.auth.b;
import android.content.pm.PackageManager;
import java.util.Iterator;
import com.anthropic.claude.analytics.events.McpEvents$McpAuthFailureType;
import java.io.File;
import java.util.Comparator;
import java.io.FileFilter;
import com.anthropic.claude.analytics.events.AppStartEvents$InstallSource;
import android.os.Build$VERSION;
import android.content.Context;
import com.anthropic.claude.analytics.events.AppStartEvents$PlayServicesStatus;
import java.util.List;

public final class h80 extends m6n implements zta
{
    public final byte w;
    public final Object x;
    
    public final f07 create(Object x, final f07 f07) {
        final byte w = this.w;
        x = this.x;
        switch (w) {
            default: {
                return (f07)new h80((byte)19, f07, x);
            }
            case 18: {
                return (f07)new h80((byte)18, f07, x);
            }
            case 17: {
                return (f07)new h80((byte)17, f07, x);
            }
            case 16: {
                return (f07)new h80((byte)16, f07, x);
            }
            case 15: {
                return (f07)new h80((byte)15, f07, x);
            }
            case 14: {
                return (f07)new h80((byte)14, f07, x);
            }
            case 13: {
                return (f07)new h80((byte)13, f07, x);
            }
            case 12: {
                return (f07)new h80((byte)12, f07, x);
            }
            case 11: {
                return (f07)new h80((byte)11, f07, x);
            }
            case 10: {
                return (f07)new h80((byte)10, f07, x);
            }
            case 9: {
                return (f07)new h80((byte)9, f07, x);
            }
            case 8: {
                return (f07)new h80((byte)8, f07, x);
            }
            case 7: {
                return (f07)new h80((byte)7, f07, x);
            }
            case 6: {
                return (f07)new h80((byte)6, f07, x);
            }
            case 5: {
                return (f07)new h80((byte)5, f07, x);
            }
            case 4: {
                return (f07)new h80((byte)4, f07, x);
            }
            case 3: {
                return (f07)new h80((byte)3, f07, x);
            }
            case 2: {
                return (f07)new h80((byte)2, f07, x);
            }
            case 1: {
                return (f07)new h80((byte)1, f07, x);
            }
            case 0: {
                return (f07)new h80((byte)0, f07, x);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 18: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 17: {
                return ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 16: {
                return ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 15: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 14: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 13: {
                return ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 12: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 11: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 10: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 9: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 8: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 7: {
                return ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 6: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 5: {
                return ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                return ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 2: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 1: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 0: {
                ((h80)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final Object x = this.x;
        switch (w) {
            default: {
                vt4.g0(o);
                final o3p o3p = (o3p)x;
                final Context a2 = o3p.a;
                final String b = o3p.b;
                final StringBuilder sb = new StringBuilder("user_prefs_");
                sb.append(b);
                sb.append("chat_known_terminal_error_conversations");
                a2.deleteSharedPreferences(sb.toString());
                return a;
            }
            case 18: {
                vt4.g0(o);
                h86.w0((lta)l0k.A, (List)((xtm)x).b);
                return a;
            }
            case 17: {
                vt4.g0(o);
                return ((odk)x).d((Class)er0.class, (emi)null);
            }
            case 16: {
                vt4.g0(o);
                AppStartEvents$PlayServicesStatus appStartEvents$PlayServicesStatus;
                try {
                    final int b2 = ((q3b)p3b.e).b(((ech)x).a, q3b.a);
                    if (b2 != 0) {
                        if (b2 != 1) {
                            if (b2 != 2) {
                                if (b2 != 3) {
                                    if (b2 != 9) {
                                        if (b2 != 18) {
                                            appStartEvents$PlayServicesStatus = AppStartEvents$PlayServicesStatus.D;
                                        }
                                        else {
                                            appStartEvents$PlayServicesStatus = AppStartEvents$PlayServicesStatus.B;
                                        }
                                    }
                                    else {
                                        appStartEvents$PlayServicesStatus = AppStartEvents$PlayServicesStatus.C;
                                    }
                                }
                                else {
                                    appStartEvents$PlayServicesStatus = AppStartEvents$PlayServicesStatus.A;
                                }
                            }
                            else {
                                appStartEvents$PlayServicesStatus = AppStartEvents$PlayServicesStatus.z;
                            }
                        }
                        else {
                            appStartEvents$PlayServicesStatus = AppStartEvents$PlayServicesStatus.y;
                        }
                    }
                    else {
                        appStartEvents$PlayServicesStatus = AppStartEvents$PlayServicesStatus.x;
                    }
                }
                catch (final Exception ex) {
                    appStartEvents$PlayServicesStatus = AppStartEvents$PlayServicesStatus.w;
                }
                return appStartEvents$PlayServicesStatus;
            }
            case 15: {
                vt4.g0(o);
                ((voc)x).j.setValue((Object)Boolean.FALSE);
                final Iterator iterator = ((Iterable)adn.a).iterator();
                while (iterator.hasNext()) {
                    ((len)iterator.next()).a();
                }
                return a;
            }
            case 14: {
                vt4.g0(o);
                ((xk0)x).a((dkj)ckj.a, "logged_out", (Long)null, (phb)null);
                return a;
            }
            case 13: {
                vt4.g0(o);
                return xp7.K((Context)x);
            }
            case 12: {
                vt4.g0(o);
                ((sn)x).c();
                return a;
            }
            case 11: {
                vt4.g0(o);
                final ywp ywp = (ywp)x;
                if (!ywp.j) {
                    final t2b b3 = ywp.a.b;
                    final List a3 = byp.a;
                    izp.x.getClass();
                    if (wab.o(b3) == izp.z) {
                        ywp.j = true;
                        rhc.G((oc7)ywp.i, (hc7)vo8.a, 0, (zta)new v8n((byte)16, (f07)null, (Object)ywp), 2);
                    }
                }
                return a;
            }
            case 10: {
                vt4.g0(o);
                final kgg kgg = (kgg)x;
                if (!kgg.f.getAndSet(true)) {
                    rhc.G((oc7)kgg.e, (hc7)null, 0, (zta)new pn((byte)25, (f07)null, (Object)kgg), 3);
                }
                return a;
            }
            case 9: {
                vt4.g0(o);
                final sza sza = (sza)x;
                final wmm q = sza.q;
                if (q == null || !((bqc)q).c()) {
                    sza.q = rhc.G((oc7)sza.f, (hc7)null, 0, (zta)new pn((byte)15, (f07)null, (Object)sza), 3);
                }
                return a;
            }
            case 8: {
                vt4.g0(o);
                ((ond)x).b0();
                return a;
            }
            case 7: {
                vt4.g0(o);
                AppStartEvents$InstallSource appStartEvents$InstallSource;
                try {
                    final Context a4 = ((xec)x).a;
                    final PackageManager packageManager = a4.getPackageManager();
                    final String packageName = a4.getPackageName();
                    String s;
                    if (Build$VERSION.SDK_INT >= 30) {
                        s = p4.p(p4.h(packageManager, packageName));
                    }
                    else {
                        s = packageManager.getInstallerPackageName(packageName);
                    }
                    appStartEvents$InstallSource = r9n.h(s);
                }
                catch (final Exception ex2) {
                    appStartEvents$InstallSource = AppStartEvents$InstallSource.w;
                }
                return appStartEvents$InstallSource;
            }
            case 6: {
                vt4.g0(o);
                ((z3j)x).v = 0;
                return a;
            }
            case 5: {
                vt4.g0(o);
                final pm9 pm9 = (pm9)x;
                if (pm9.J > 0L || (pm9.g().exists() && pm9.g().length() > 0L)) {
                    pm9.c();
                    pm9.g().renameTo(pm9.p());
                }
                final File[] listFiles = pm9.v.listFiles((FileFilter)new om9(pm9, (byte)1));
                Object o2;
                if (listFiles != null) {
                    o2 = iw0.j1((Object[])listFiles, (Comparator)new w8g((byte)8));
                }
                else {
                    o2 = r89.v;
                }
                return o2;
            }
            case 4: {
                vt4.g0(o);
                return ((File)x).exists();
            }
            case 3: {
                vt4.g0(o);
                final sq6 sq6 = (sq6)x;
                final wmm d = sq6.d;
                if (d == null || !((bqc)d).c()) {
                    final wmm e = sq6.e;
                    if (e == null || !((bqc)e).c()) {
                        final b a5 = sq6.a;
                        final wmm p = a5.p;
                        if (p == null || !((bqc)p).c()) {
                            final qyg l = a5.l;
                            if (l != null) {
                                a5.q(l.a(), "cancelled", (McpEvents$McpAuthFailureType)null);
                            }
                            a5.b();
                        }
                    }
                }
                return a;
            }
            case 2: {
                vt4.g0(o);
                final y39 y39 = (y39)x;
                if (y39 != null) {
                    oz1.y("id", y39.a, "server tool approval card shown");
                }
                return a;
            }
            case 1: {
                vt4.g0(o);
                ((lta)x).b((Object)Boolean.FALSE);
                return a;
            }
            case 0: {
                vt4.g0(o);
                ((ve)x).a();
                return a;
            }
        }
    }
}
