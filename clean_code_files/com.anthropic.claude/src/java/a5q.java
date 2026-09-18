import android.os.Trace;
import java.util.UUID;
import com.anthropic.claude.application.ClaudeApplication;
import java.util.concurrent.Executor;
import android.content.BroadcastReceiver$PendingResult;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import android.content.Context;

public final class a5q
{
    public static a5q k;
    public static a5q l;
    public static final Object m;
    public final Context a;
    public final wn6 b;
    public final WorkDatabase c;
    public final f5q d;
    public final List e;
    public final frh f;
    public final j9j g;
    public boolean h;
    public BroadcastReceiver$PendingResult i;
    public final ddo j;
    
    static {
        krd.e("WorkManagerImpl");
        a5q.k = null;
        a5q.l = null;
        m = new Object();
    }
    
    public a5q(Context applicationContext, final wn6 b, final f5q d, final WorkDatabase c, final List e, final frh f, final ddo j) {
        this.h = false;
        applicationContext = applicationContext.getApplicationContext();
        if (!applicationContext.isDeviceProtectedStorage()) {
            b.getClass();
            final krd c2 = new krd(4);
            final Object b2;
            monitorenter(b2 = krd.b);
            Label_0065: {
                try {
                    if (krd.c == null) {
                        krd.c = c2;
                    }
                    break Label_0065;
                }
                finally {
                    monitorexit(b2);
                    monitorexit(b2);
                    this.a = applicationContext;
                    this.d = d;
                    this.c = c;
                    this.f = f;
                    this.j = j;
                    this.b = b;
                    this.e = e;
                    final ic7 b3 = d.b;
                    b3.getClass();
                    final fz6 a = ien.a((hc7)b3);
                    this.g = new j9j((Object)c, (byte)25);
                    final gzk a2 = d.a;
                    final int a3 = wck.a;
                    f.a((nt9)new vck((Executor)a2, e, b, c));
                    d.a.execute((Runnable)new spa(applicationContext, this));
                    final String a4 = gqo.a;
                    iftrue(Label_0281:)(!sqh.a(applicationContext));
                    x90.E(new wja(soh.u(ri2.p((ija)new f67((ija)qt7.q(c.v().a, false, new String[] { "workspec" }, (lta)new y5q()), (Object)new m6n(4, (f07)null), (byte)1), -1)), (zta)new khn((byte)6, (f07)null, (Object)applicationContext), (byte)3), (oc7)a);
                    Label_0281: {
                        return;
                    }
                }
            }
        }
        en9.q("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }
    
    public static a5q e(Context applicationContext) {
        final Object m = a5q.m;
        monitorenter(m);
        try {
            final Object o;
            monitorenter(o = m);
            Label_0032: {
                try {
                    final a5q a5q = a5q.k;
                    if (a5q != null) {
                        monitorexit(o);
                        break Label_0032;
                    }
                    break Label_0032;
                }
                finally {
                    monitorexit(o);
                    final a5q a5q = a5q.l;
                    monitorexit(o);
                    break Label_0032;
                    Label_0091: {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    a5q e = a5q;
                    iftrue(Label_0103:)(a5q != null);
                Label_0103:
                    while (true) {
                        Block_7: {
                            break Block_7;
                            f(applicationContext, (wn6)((ClaudeApplication)applicationContext).A.getValue());
                            e = e(applicationContext);
                            break Label_0103;
                        }
                        applicationContext = applicationContext.getApplicationContext();
                        iftrue(Label_0091:)(!(applicationContext instanceof tn6));
                        continue;
                    }
                    monitorexit(o);
                    return e;
                }
            }
        }
        finally {}
    }
    
    public static void f(final Context context, final wn6 wn6) {
        final Object m;
        monitorenter(m = a5q.m);
        Label_0042: {
            try {
                final a5q k = a5q.k;
                if (k != null && a5q.l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                break Label_0042;
            }
            finally {
                monitorexit(m);
                Label_0077: {
                    while (true) {
                        while (true) {
                            final Context applicationContext;
                            a5q l = a5q.l = c5q.s(applicationContext, wn6);
                            Label_0073: {
                                a5q.k = l;
                            }
                            break Label_0077;
                            applicationContext = context.getApplicationContext();
                            iftrue(Label_0073:)((l = a5q.l) != null);
                            continue;
                        }
                        final a5q k;
                        iftrue(Label_0077:)(k != null);
                        continue;
                    }
                }
                monitorexit(m);
            }
        }
    }
    
    public final j9j a(final String s) {
        final eup g = this.b.g;
        final String concat = "CancelWorkByTag_".concat(s);
        final gzk a = this.d.a;
        a.getClass();
        return qt7.J(g, concat, (Executor)a, (jta)new jd0((Object)this, (Object)s, (byte)12));
    }
    
    public final j9j b(final UUID uuid) {
        final eup g = this.b.g;
        final gzk a = this.d.a;
        a.getClass();
        return qt7.J(g, "CancelWorkById", (Executor)a, (jta)new ty1((Object)this, (Object)uuid, (byte)17));
    }
    
    public final void c(final r5q r5q) {
        final List x = lq6.X((Object)r5q);
        if (!x.isEmpty()) {
            new o4q(this, null, 2, x, 0).a();
            return;
        }
        en9.s("enqueue needs at least one WorkRequest.");
    }
    
    public final j9j d(final String s, final int n, final rbg rbg) {
        return new o4q(this, s, n, lq6.X((Object)rbg), 0).a();
    }
    
    public final void g() {
        final Object m;
        monitorenter(m = a5q.m);
        Label_0038: {
            try {
                this.h = true;
                final BroadcastReceiver$PendingResult i = this.i;
                if (i != null) {
                    i.finish();
                    this.i = null;
                }
                break Label_0038;
            }
            finally {
                monitorexit(m);
                monitorexit(m);
            }
        }
    }
    
    public final void h() {
        final eup g = this.b.g;
        final wfk wfk = new wfk((Object)this, (byte)28);
        final boolean p = omo.P();
        Label_0040: {
            if (!p) {
                break Label_0040;
            }
            try {
                Trace.beginSection("ReschedulingWork");
                break Label_0040;
            }
            finally {
                if (p) {
                    Trace.endSection();
                }
                wfk.a();
                iftrue(Label_0052:)(!p);
                Block_4: {
                    break Block_4;
                    Label_0052: {
                        return;
                    }
                }
                Trace.endSection();
            }
        }
    }
}
