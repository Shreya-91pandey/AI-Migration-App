import android.os.BaseBundle;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Collection;
import java.util.Arrays;
import android.os.Bundle;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import android.os.Parcelable;
import android.app.PendingIntent;
import com.android.billingclient.api.ProxyBillingActivity;
import java.util.ArrayList;
import java.util.AbstractCollection;
import android.text.TextUtils;
import android.app.Activity;
import java.util.concurrent.TimeUnit;
import java.util.List;
import android.content.pm.ServiceInfo;
import android.content.pm.ResolveInfo;
import android.content.ServiceConnection;
import android.content.Intent;
import android.content.ComponentName;
import java.util.Objects;
import android.os.Build;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import android.os.Build$VERSION;
import java.util.Random;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

public class qb2
{
    public final boolean A;
    public snq B;
    public volatile rb2 C;
    public ExecutorService D;
    public final Long E;
    public final tsf F;
    public final Object a;
    public volatile byte b;
    public final String c;
    public final String d;
    public final Handler e;
    public volatile y28 f;
    public final Context g;
    public final hjo h;
    public volatile hiq i;
    public volatile emq j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final def z;
    
    public qb2(final def z, final Context context, final nji nji, final pb2 pb2) {
        this.a = new Object();
        this.b = 0;
        this.e = new Handler(Looper.getMainLooper());
        this.l = 0;
        final int x = snq.x;
        this.B = (snq)cpq.E;
        final long nextLong = new Random().nextLong();
        this.E = nextLong;
        this.F = gkq.a;
        this.c = "9.1.0";
        final String o = o();
        this.d = o;
        this.g = context.getApplicationContext();
        final abr d = fbr.D();
        d.j();
        if (o != null) {
            ((g1r)d).c();
            fbr.C((fbr)((g1r)d).w, o);
        }
        d.i(this.g.getPackageName());
        ((g1r)d).c();
        fbr.H((fbr)((g1r)d).w, nextLong);
        final boolean d2 = pb2.d;
        ((g1r)d).c();
        fbr.A((fbr)((g1r)d).w, d2);
        d.e(Build$VERSION.SDK_INT);
        d.h();
        r(d, context);
        try {
            d.f(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        }
        finally {
            final Throwable t;
            hmq.i("BillingClient", "Error getting app version code.", t);
        }
        this.h = new hjo(this.g, (fbr)((g1r)d).a());
        if (nji == null) {
            hmq.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new y28(this.g, nji, this.h);
        this.z = z;
        this.g.getPackageName();
        this.A = pb2.d;
    }
    
    public qb2(final def z, final Context context, final pb2 pb2) {
        this.a = new Object();
        this.b = 0;
        this.e = new Handler(Looper.getMainLooper());
        this.l = 0;
        final int x = snq.x;
        this.B = (snq)cpq.E;
        final long nextLong = new Random().nextLong();
        this.E = nextLong;
        this.F = gkq.a;
        this.c = "9.1.0";
        final String o = o();
        this.d = o;
        this.g = context.getApplicationContext();
        final abr d = fbr.D();
        d.j();
        if (o != null) {
            ((g1r)d).c();
            fbr.C((fbr)((g1r)d).w, o);
        }
        d.i(this.g.getPackageName());
        ((g1r)d).c();
        fbr.H((fbr)((g1r)d).w, nextLong);
        final boolean d2 = pb2.d;
        ((g1r)d).c();
        fbr.A((fbr)((g1r)d).w, d2);
        d.e(Build$VERSION.SDK_INT);
        d.h();
        r(d, context);
        try {
            d.f(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        }
        finally {
            final Throwable t;
            hmq.i("BillingClient", "Error getting app version code.", t);
        }
        this.h = new hjo(this.g, (fbr)((g1r)d).a());
        hmq.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new y28(this.g, (nji)null, this.h);
        this.z = z;
        this.g.getPackageName();
        this.A = pb2.d;
    }
    
    public static Future h(final Callable callable, final long n, final Runnable runnable, final Handler handler, final ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed((Runnable)new qrq((Object)submit, (Object)runnable, (byte)12), (long)(n * 0.95));
            return submit;
        }
        catch (final Exception ex) {
            hmq.i("BillingClient", "Async task throws exception!", (Throwable)ex);
            return null;
        }
    }
    
    public static String o() {
        try {
            return (String)rml.class.getField("VERSION_NAME").get((Object)null);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static final void r(final abr abr, final Context context) {
        try {
            final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
            if (activityManager != null) {
                final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
                activityManager.getMemoryInfo(activityManager$MemoryInfo);
                final int n = (int)(activityManager$MemoryInfo.totalMem / 1048576L);
                ((g1r)abr).c();
                fbr.z((fbr)((g1r)abr).w, n);
                final String brand = Build.BRAND;
                ((g1r)abr).c();
                fbr.v((fbr)((g1r)abr).w);
                final String model = Build.MODEL;
                ((g1r)abr).c();
                fbr.y((fbr)((g1r)abr).w);
                final String manufacturer = Build.MANUFACTURER;
                ((g1r)abr).c();
                fbr.x((fbr)((g1r)abr).w);
                final String fingerprint = Build.FINGERPRINT;
                ((g1r)abr).c();
                fbr.w((fbr)((g1r)abr).w);
            }
        }
        catch (final RuntimeException ex) {
            hmq.i("BillingClient", "Runtime error while populating device info.", (Throwable)ex);
        }
    }
    
    public final void A(final f9r f9r) {
        try {
            this.h.p(f9r, this.l);
        }
        finally {
            final Throwable t;
            hmq.i("BillingClient", "Unable to log.", t);
        }
    }
    
    public final void B(final p9r p9r) {
        try {
            this.h.t(p9r, this.l);
        }
        finally {
            final Throwable t;
            hmq.i("BillingClient", "Unable to log.", t);
        }
    }
    
    public final void C(final int n, final int n2, final gc2 gc2) {
        try {
            final int a = jrq.a;
            final a9r a9r = (a9r)((q1r)jrq.b(n, 6, gc2, null, mar.w)).m();
            final ldr t = mdr.t();
            t.e(n2 > 0);
            t.f(n2);
            a9r.g(t);
            this.A((f9r)((g1r)a9r).a());
        }
        finally {
            final Throwable t2;
            hmq.i("BillingClient", "Unable to log.", t2);
        }
    }
    
    public final void D(final int b) {
        final Object a;
        monitorenter(a = this.a);
        Label_0028: {
            try {
                if (this.b == 3) {
                    monitorexit(a);
                    return;
                }
                break Label_0028;
            }
            finally {
                monitorexit(a);
            Label_0115_Outer:
                while (true) {
                    iftrue(Label_0102:)(b == 1);
                    Label_0072: {
                    Block_7_Outer:
                        while (true) {
                            Block_10: {
                                while (true) {
                                    final byte b2;
                                    Block_5: {
                                        Block_9: {
                                            break Block_9;
                                            final StringBuilder sb = new StringBuilder("Setting clientState from ");
                                            final String s;
                                            sb.append(s);
                                            sb.append(" to ");
                                            final String s2;
                                            sb.append(s2);
                                            hmq.g("BillingClient", sb.toString());
                                            this.b = (byte)b;
                                            monitorexit(a);
                                            return;
                                            b2 = this.b;
                                            iftrue(Label_0068:)(b2 == 0);
                                            break Block_5;
                                            Label_0068: {
                                                s = "DISCONNECTED";
                                            }
                                            break Label_0072;
                                        }
                                        iftrue(Label_0094:)(b == 2);
                                        break Block_10;
                                        String s = "CLOSED";
                                        break Label_0072;
                                    }
                                    iftrue(Label_0061:)(b2 == 1);
                                    Block_6: {
                                        break Block_6;
                                        Label_0102: {
                                            final String s2 = "CONNECTING";
                                        }
                                        continue Block_7_Outer;
                                    }
                                    iftrue(Label_0054:)(b2 == 2);
                                    continue;
                                }
                                Label_0061: {
                                    final String s = "CONNECTING";
                                }
                                break Label_0072;
                            }
                            String s2 = "CLOSED";
                            continue;
                            Label_0094: {
                                s2 = "CONNECTED";
                            }
                            continue;
                            Label_0110:
                            s2 = "DISCONNECTED";
                            continue;
                        }
                        Label_0054: {
                            final String s = "CONNECTED";
                        }
                    }
                    iftrue(Label_0110:)(b == 0);
                    continue Label_0115_Outer;
                }
            }
        }
    }
    
    public final void E(final rb2 c, int n) {
        final Object a;
        monitorenter(a = this.a);
        Object o = null;
        ServiceInfo serviceInfo;
        String packageName;
        String name;
        ComponentName component;
        Intent intent;
        Object a2;
        int n2 = 0;
        boolean b;
        emq j;
        List queryIntentServices;
        Label_0508_Outer:Label_0069_Outer:Block_9_Outer:
        while (true) {
            Label_0036: {
                try {
                    if (this.H()) {
                        o = this.k(n);
                        monitorexit(a);
                        break Label_0534;
                    }
                    break Label_0036;
                }
                finally {
                    monitorexit(a);
                    Label_0072: {
                        iftrue(Label_0108:)(this.b != 3);
                    }
                    Block_14: {
                        while (true) {
                            Label_0126: {
                            Label_0069:
                                while (true) {
                                    Block_6: {
                                        break Block_6;
                                        Label_0505:
                                        n = 41;
                                    Block_10_Outer:
                                        while (true) {
                                            break Label_0508;
                                            while (true) {
                                                packageName = serviceInfo.packageName;
                                                name = serviceInfo.name;
                                                iftrue(Label_0483:)(!Objects.equals((Object)packageName, (Object)"com.android.vending") || name == null);
                                                Block_12: {
                                                    break Block_12;
                                                    Label_0547:
                                                    return;
                                                    break Label_0534;
                                                    iftrue(Label_0072:)(this.b != 1);
                                                    Block_5: {
                                                        break Block_5;
                                                        iftrue(Label_0547:)(o == null);
                                                        break Block_14;
                                                    }
                                                    hmq.h("BillingClient", "Client is already in the process of connecting to billing service.");
                                                    o = zrq.c;
                                                    this.C(37, n, (gc2)o);
                                                    monitorexit(a);
                                                    continue Label_0069;
                                                }
                                                component = new ComponentName(packageName, name);
                                                o = new Intent(intent);
                                                ((Intent)o).setComponent(component);
                                                ((Intent)o).putExtra("playBillingLibraryVersion", this.c);
                                                monitorenter(a2 = this.a);
                                                Label_0354: {
                                                    try {
                                                        if (this.b == 2) {
                                                            o = this.k(n2);
                                                            monitorexit(a2);
                                                            continue Label_0508_Outer;
                                                        }
                                                        break Label_0354;
                                                    }
                                                    finally {
                                                        monitorexit(a2);
                                                        while (true) {
                                                            iftrue(Label_0464:)(!b);
                                                            Block_20: {
                                                                Block_18: {
                                                                    Block_21: {
                                                                        break Block_21;
                                                                        Label_0390:
                                                                        j = this.j;
                                                                        monitorexit(a2);
                                                                        iftrue(Label_0431:)(n2 <= 0 || Build$VERSION.SDK_INT < 29);
                                                                        break Block_20;
                                                                        iftrue(Label_0390:)(this.b == 1);
                                                                        break Block_18;
                                                                        Label_0431:
                                                                        b = this.g.bindService((Intent)o, (ServiceConnection)j, 1);
                                                                        continue Block_9_Outer;
                                                                    }
                                                                    hmq.g("BillingClient", "Service was bonded successfully.");
                                                                    o = null;
                                                                    continue Label_0508_Outer;
                                                                }
                                                                hmq.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                                o = zrq.h;
                                                                this.C(105, n2, (gc2)o);
                                                                monitorexit(a2);
                                                                continue Label_0069;
                                                            }
                                                            b = d4.v(this.g, (Intent)o, this.g(), (ServiceConnection)j);
                                                            continue Block_9_Outer;
                                                        }
                                                        Label_0464:
                                                        hmq.h("BillingClient", "Connection to Billing service is blocked.");
                                                        n = 39;
                                                        break Label_0508;
                                                    }
                                                }
                                                Label_0483:
                                                hmq.h("BillingClient", "The device doesn't have valid Play Store.");
                                                break Label_0508;
                                                Label_0108:
                                                this.D(1);
                                                iftrue(Label_0126:)((n2 = n) != 0);
                                                Block_7: {
                                                    break Block_7;
                                                    this.D(0);
                                                    hmq.g("BillingClient", "Billing service unavailable on device.");
                                                    o = zrq.a;
                                                    this.C(n, n2, (gc2)o);
                                                    continue Label_0508_Outer;
                                                }
                                                this.C = c;
                                                n2 = 0;
                                                break Label_0126;
                                                serviceInfo = ((ResolveInfo)queryIntentServices.get(0)).serviceInfo;
                                                n = 40;
                                                iftrue(Label_0494:)(serviceInfo == null);
                                                continue Label_0069_Outer;
                                            }
                                            Label_0494:
                                            hmq.h("BillingClient", "The device doesn't have valid Play Store.");
                                            continue Block_10_Outer;
                                        }
                                    }
                                    hmq.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                                    o = zrq.h;
                                    this.C(38, n, (gc2)o);
                                    monitorexit(a);
                                    continue Label_0069;
                                }
                            }
                            this.F();
                            hmq.g("BillingClient", "Starting in-app billing setup.");
                            (this.j = new emq(this, c, n2)).a();
                            monitorexit(a);
                            intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                            intent.setPackage("com.android.vending");
                            queryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                            iftrue(Label_0505:)(queryIntentServices == null || queryIntentServices.isEmpty());
                            continue;
                        }
                    }
                    c.g((gc2)o);
                }
            }
            break;
        }
    }
    
    public final void F() {
        final Object a;
        monitorenter(a = this.a);
        while (true) {
            try {
                if (this.j != null) {
                    final qb2 qb2 = this;
                    final Context context = qb2.g;
                    final qb2 qb3 = this;
                    final emq emq = qb3.j;
                    context.unbindService((ServiceConnection)emq);
                    final qb2 qb4 = this;
                    final hiq hiq = null;
                    qb4.i = hiq;
                    final qb2 qb5 = this;
                    final emq emq2 = null;
                    qb5.j = emq2;
                }
                break Label_0082;
            }
            finally {
                monitorexit(a);
                monitorexit(a);
                return;
                try {
                    final Throwable t;
                    hmq.i("BillingClient", "There was an exception while unbinding service!", t);
                }
                finally {
                    this.i = null;
                    this.j = null;
                }
                continue;
            }
            try {
                final qb2 qb2 = this;
                final Context context = qb2.g;
                final qb2 qb3 = this;
                final emq emq = qb3.j;
                context.unbindService((ServiceConnection)emq);
                final qb2 qb4 = this;
                final hiq hiq = null;
                qb4.i = hiq;
                final qb2 qb5 = this;
                final emq emq2 = null;
                qb5.j = emq2;
                continue;
            }
            finally {}
            break;
        }
    }
    
    public final boolean G(final long n) {
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        final tsf f = this.F;
        if (f != null) {
            final long z = f.Z();
            final int u = q3r.U();
            long n2 = n;
            for (int i = 1; i <= u; ++i) {
                Label_0072: {
                    try {
                        final long max = Math.max(0L, n2);
                        if (max <= 0L) {
                            hmq.h("BillingClient", "No time remaining for reconnection attempt.");
                            return this.H();
                        }
                        break Label_0072;
                    }
                    catch (final Exception ex) {
                        if (ex instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        hmq.i("BillingClient", "Error during reconnection attempt: ", (Throwable)ex);
                        final StringBuilder sb;
                        Label_0141: {
                            sb = new StringBuilder();
                        }
                        sb.append("Reconnection failed with result: ");
                        int a = 0;
                        sb.append(a);
                        hmq.h("BillingClient", sb.toString());
                        break Label_0072;
                        while (true) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Reconnection succeeded with result: ");
                            sb2.append(a);
                            hmq.g("BillingClient", sb2.toString());
                            return this.H();
                            final long max;
                            a = ((gc2)((Future)this.m(i)).get(max, milliseconds)).a;
                            iftrue(Label_0141:)(a != 0);
                            continue;
                        }
                    }
                }
                final long n3 = n - (f.Z() - z + 0L) / 1000000L;
                final long n4 = (long)Math.pow(2.0, (double)(i - 1)) * 1000L;
                if (n3 < n4) {
                    hmq.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return this.H();
                }
                n2 = n3;
                if (i < u) {
                    n2 = n3;
                    if (n4 > 0L) {
                        try {
                            Thread.sleep(n4);
                            n2 = n - (f.Z() - z + 0L) / 1000000L;
                        }
                        catch (final InterruptedException ex2) {
                            Thread.currentThread().interrupt();
                            hmq.i("BillingClient", "Error sleeping during reconnection attempt: ", (Throwable)ex2);
                            break;
                        }
                    }
                }
            }
            hmq.h("BillingClient", "Max retries reached.");
            return this.H();
        }
        fvd.k("ticker");
        return false;
    }
    
    public final boolean H() {
        final Object a;
        monitorenter(a = this.a);
        Label_0054: {
            try {
                final byte b = this.b;
                boolean b3;
                final boolean b2 = b3 = false;
                if (b != 2) {
                    break Label_0054;
                }
                b3 = b2;
                if (this.i == null) {
                    break Label_0054;
                }
                b3 = b2;
                if (this.j != null) {
                    b3 = true;
                }
                break Label_0054;
            }
            finally {
                monitorexit(a);
                monitorexit(a);
                return;
            }
        }
    }
    
    public final void I(final gc2 gc2) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post((Runnable)new qrq((Object)this, (Object)gc2, (byte)11));
    }
    
    public void a(final ml ml, final r70 r70) {
        if (h((Callable)new dhq(this, (Object)r70, (Object)ml, (byte)1), 30000L, (Runnable)new ifj((Object)this, (Object)r70, (Object)ml, (byte)3), this.i(), this.g()) == null) {
            final gc2 l = this.l();
            this.t(25, 4, l);
            r70.w(l, ml.c());
        }
    }
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: bipush          12
        //     7: getstatic       mar.w:Lmar;
        //    10: invokestatic    jrq.c:(ILmar;)Lp9r;
        //    13: invokevirtual   qb2.B:(Lp9r;)V
        //    16: goto            29
        //    19: astore_2       
        //    20: ldc             "BillingClient"
        //    22: ldc_w           "Unable to log."
        //    25: aload_2        
        //    26: invokestatic    hmq.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //    29: aload_0        
        //    30: getfield        qb2.a:Ljava/lang/Object;
        //    33: astore_2       
        //    34: aload_2        
        //    35: dup            
        //    36: astore          4
        //    38: monitorenter   
        //    39: aload_0        
        //    40: getfield        qb2.f:Ly28;
        //    43: ifnull          66
        //    46: aload_0        
        //    47: getfield        qb2.f:Ly28;
        //    50: invokevirtual   y28.c:()V
        //    53: goto            66
        //    56: astore_3       
        //    57: ldc             "BillingClient"
        //    59: ldc_w           "There was an exception while shutting down broadcast manager while ending connection!"
        //    62: aload_3        
        //    63: invokestatic    hmq.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //    66: ldc             "BillingClient"
        //    68: ldc_w           "Unbinding from service."
        //    71: invokestatic    hmq.g:(Ljava/lang/String;Ljava/lang/String;)V
        //    74: aload_0        
        //    75: invokevirtual   qb2.F:()V
        //    78: goto            91
        //    81: astore_3       
        //    82: ldc             "BillingClient"
        //    84: ldc_w           "There was an exception while unbinding from the service while ending connection!"
        //    87: aload_3        
        //    88: invokestatic    hmq.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //    91: aload_0        
        //    92: dup            
        //    93: astore          5
        //    95: monitorenter   
        //    96: aload_0        
        //    97: getfield        qb2.D:Ljava/util/concurrent/ExecutorService;
        //   100: astore_3       
        //   101: aload_3        
        //   102: ifnull          117
        //   105: aload_3        
        //   106: invokeinterface java/util/concurrent/ExecutorService.shutdownNow:()Ljava/util/List;
        //   111: pop            
        //   112: aload_0        
        //   113: aconst_null    
        //   114: putfield        qb2.D:Ljava/util/concurrent/ExecutorService;
        //   117: aload           5
        //   119: monitorexit    
        //   120: goto            127
        //   123: astore_3       
        //   124: goto            144
        //   127: aload_0        
        //   128: iconst_3       
        //   129: invokevirtual   qb2.D:(I)V
        //   132: aload_0        
        //   133: aconst_null    
        //   134: putfield        qb2.C:Lrb2;
        //   137: goto            162
        //   140: astore_3       
        //   141: goto            179
        //   144: aload           5
        //   146: monitorexit    
        //   147: aload_3        
        //   148: athrow         
        //   149: astore_3       
        //   150: ldc             "BillingClient"
        //   152: ldc_w           "There was an exception while shutting down the executor service while ending connection!"
        //   155: aload_3        
        //   156: invokestatic    hmq.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   159: goto            127
        //   162: aload           4
        //   164: monitorexit    
        //   165: return         
        //   166: astore_3       
        //   167: aload_0        
        //   168: iconst_3       
        //   169: invokevirtual   qb2.D:(I)V
        //   172: aload_0        
        //   173: aconst_null    
        //   174: putfield        qb2.C:Lrb2;
        //   177: aload_3        
        //   178: athrow         
        //   179: aload           4
        //   181: monitorexit    
        //   182: aload_3        
        //   183: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      16     19     29     Any
        //  39     53     56     66     Any
        //  57     66     140    184    Any
        //  66     78     81     91     Any
        //  82     91     140    184    Any
        //  91     96     149    179    Any
        //  96     101    123    149    Any
        //  105    117    123    149    Any
        //  117    120    149    179    Any
        //  127    137    140    184    Any
        //  144    147    123    149    Any
        //  147    149    149    179    Any
        //  150    159    166    179    Any
        //  162    165    140    184    Any
        //  167    179    140    184    Any
        //  179    182    140    184    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0091:
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
    
    public final int c() {
        final Object a = this.a;
        synchronized (a) {
            return this.b;
        }
    }
    
    public gc2 d(Activity b, vb2 a) {
        final long nextLong = new Random().nextLong();
        if (this.f != null && this.f.b() != null) {
            long v = q3r.V();
            Label_0109: {
                try {
                    if (Build$VERSION.SDK_INT < 29) {
                        v = 0L;
                    }
                    final int a2 = ((gc2)((Future)this.m(1)).get(v, TimeUnit.MILLISECONDS)).a;
                    if (a2 != 0) {
                        break Label_0109;
                    }
                    final StringBuilder sb = new StringBuilder("Reconnection succeeded with result: ");
                    sb.append(a2);
                    hmq.g("BillingClient", sb.toString());
                }
                catch (final Exception ex) {
                    if (ex instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    hmq.i("BillingClient", "Error during reconnection attempt: ", (Throwable)ex);
                    final StringBuilder sb2 = new StringBuilder("Reconnection failed with result: ");
                    final int a2;
                    sb2.append(a2);
                    hmq.h("BillingClient", sb2.toString());
                }
            }
            if (!this.H()) {
                final gc2 h = zrq.h;
                this.u(2, h, nextLong);
                this.I(h);
                return h;
            }
            final Object a3;
            monitorenter(a3 = this.a);
            boolean b2 = false;
            Bundle bundle = null;
            ArrayList list = null;
            Iterator iterator;
            zlq zlq;
            gc2 j;
            ArrayList list2 = null;
            ArrayList h2 = null;
            ymq i = null;
            tb2 tb2 = null;
            String b3 = null;
            String c = null;
            int n = 0;
            Intent intent;
            gc2 k;
            ArrayList list3;
            gc2 c2;
            int n2;
            Bundle bundle2 = null;
            Object value;
            final Throwable t;
            String name;
            StringBuilder sb3;
            int n3;
            boolean b4;
            nvq t2;
            tb2 tb3;
            String c3;
            ArrayList list4 = null;
            yrh b5 = null;
            String g = null;
            Iterator iterator2 = null;
            ArrayList list5 = null;
            ArrayList list6;
            ArrayList list7;
            int n4 = 0;
            zlq zlq2;
            String c4;
            gc2 h3;
            ArrayList list8 = null;
            ArrayList list9 = null;
            gc2 n5;
            gc2 m;
            Intent intent2;
            long n6;
            boolean b6;
            boolean n7 = false;
            String f;
            Iterator iterator3;
            boolean b7;
            long n8;
            String d;
            long longValue;
            int a4;
            gc2 e;
            Future future = null;
            ArrayList list10 = null;
            gc2 l;
            String stringExtra;
            gc2 k2;
            Block_33_Outer:Block_28_Outer:Block_42_Outer:Block_31_Outer:Label_1282_Outer:Block_44_Outer:Block_65_Outer:
            while (true) {
                Label_0227: {
                    try {
                        if (this.j != null) {
                            b2 = this.j.b();
                            break Label_0230;
                        }
                        break Label_0227;
                    }
                    finally {
                        monitorexit(a3);
                        while (true) {
                            while (true) {
                                Block_43: {
                                    while (true) {
                                    Label_1566_Outer:
                                        while (true) {
                                            Block_49_Outer:Block_58_Outer:
                                            while (true) {
                                                Block_56: {
                                                    while (true) {
                                                        while (true) {
                                                            Block_30_Outer:Label_2078_Outer:Block_21_Outer:Block_55_Outer:
                                                            while (true) {
                                                            Block_41:
                                                                while (true) {
                                                                    Block_66_Outer:Label_1662_Outer:
                                                                    while (true) {
                                                                        while (true) {
                                                                        Label_1798:
                                                                            while (true) {
                                                                            Label_1662:
                                                                                while (true) {
                                                                                    Block_57: {
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                                Label_2078:Label_1672_Outer:
                                                                                                while (true) {
                                                                                                    Label_1672:Block_22_Outer:
                                                                                                    while (true) {
                                                                                                        Label_2090: {
                                                                                                            while (true) {
                                                                                                            Label_0478:
                                                                                                                while (true) {
                                                                                                                    Label_0698: {
                                                                                                                        while (true) {
                                                                                                                            Label_0855: {
                                                                                                                                Block_26_Outer:Label_0885_Outer:
                                                                                                                                while (true) {
                                                                                                                                    Label_0720: {
                                                                                                                                    Label_0791_Outer:
                                                                                                                                        while (true) {
                                                                                                                                            Block_37: {
                                                                                                                                                Block_19: {
                                                                                                                                                Block_54:
                                                                                                                                                    while (true) {
                                                                                                                                                        Block_48:Block_67_Outer:
                                                                                                                                                        while (true) {
                                                                                                                                                            Block_52: {
                                                                                                                                                                Label_1126: {
                                                                                                                                                                    while (true) {
                                                                                                                                                                        Label_1896: {
                                                                                                                                                                        Block_17:
                                                                                                                                                                            while (true) {
                                                                                                                                                                                Label_0758: {
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        Label_0972: {
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                            Label_2249:
                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                Block_71:
                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                        Label_1424_Outer:
                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                Block_50:
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        Block_27: {
                                                                                                                                                                                                                            Block_62: {
                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                    Block_47: {
                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                            Label_0871: {
                                                                                                                                                                                                                                                Block_25: {
                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                            Label_0813: {
                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    ((BaseBundle)bundle).putString("oldSkuPurchaseToken", a.f());
                                                                                                                                                                                                                                                                    break Label_0813;
                                                                                                                                                                                                                                                                    ((BaseBundle)bundle).putInt("prorationMode", a.b());
                                                                                                                                                                                                                                                                    break Label_0698;
                                                                                                                                                                                                                                                                    Block_35: {
                                                                                                                                                                                                                                                                        Block_39: {
                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                Label_1056: {
                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                        Block_38: {
                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                a.g();
                                                                                                                                                                                                                                                                                                iftrue(Label_0855:)(TextUtils.isEmpty((CharSequence)null));
                                                                                                                                                                                                                                                                                                break Block_35;
                                                                                                                                                                                                                                                                                                bundle.putStringArrayList("skuDetailsTokens", list);
                                                                                                                                                                                                                                                                                                break Label_1056;
                                                                                                                                                                                                                                                                                                zlq = (zlq)iterator;
                                                                                                                                                                                                                                                                                                iftrue(Label_0933:)(!zlq.hasNext());
                                                                                                                                                                                                                                                                                                break Block_38;
                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                    hmq.h("BillingClient", "Current client doesn't support subscriptions.");
                                                                                                                                                                                                                                                                                                    j = zrq.j;
                                                                                                                                                                                                                                                                                                    this.w(9, j, nextLong, b2);
                                                                                                                                                                                                                                                                                                    this.I(j);
                                                                                                                                                                                                                                                                                                    return j;
                                                                                                                                                                                                                                                                                                    ((BaseBundle)bundle).putBoolean("isOfferPersonalizedByDeveloper", true);
                                                                                                                                                                                                                                                                                                    break Label_0758;
                                                                                                                                                                                                                                                                                                    iftrue(Label_1470:)(list2.isEmpty());
                                                                                                                                                                                                                                                                                                    break Block_52;
                                                                                                                                                                                                                                                                                                    monitorexit(a3);
                                                                                                                                                                                                                                                                                                    h2 = a.h();
                                                                                                                                                                                                                                                                                                    i = a.i();
                                                                                                                                                                                                                                                                                                    ge9.C(b3r.O((AbstractCollection)h2));
                                                                                                                                                                                                                                                                                                    tb2 = (tb2)b3r.O((AbstractCollection)i);
                                                                                                                                                                                                                                                                                                    b3 = tb2.b().b();
                                                                                                                                                                                                                                                                                                    c = tb2.b().c();
                                                                                                                                                                                                                                                                                                    iftrue(Label_0334:)(!c.equals((Object)"subs") || this.k);
                                                                                                                                                                                                                                                                                                    continue Block_31_Outer;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                n = 23;
                                                                                                                                                                                                                                                                                                break Label_2090;
                                                                                                                                                                                                                                                                                                Label_0595: {
                                                                                                                                                                                                                                                                                                    iftrue(Label_1769:)(!this.m);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                break Block_27;
                                                                                                                                                                                                                                                                                                ((BaseBundle)bundle).putString("obfuscatedProfileId", a.e());
                                                                                                                                                                                                                                                                                                break Block_49_Outer;
                                                                                                                                                                                                                                                                                                Label_1675:
                                                                                                                                                                                                                                                                                                iftrue(Label_1698:)(!this.r || ((List)i).isEmpty());
                                                                                                                                                                                                                                                                                                break Block_62;
                                                                                                                                                                                                                                                                                                intent = ((Activity)b).getIntent();
                                                                                                                                                                                                                                                                                                iftrue(Label_1588:)(intent != null);
                                                                                                                                                                                                                                                                                                break Block_57;
                                                                                                                                                                                                                                                                                                ((BaseBundle)bundle).putString("oldSkuPurchaseId", (String)null);
                                                                                                                                                                                                                                                                                                continue Block_42_Outer;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            hmq.i("BillingClient", "Time out while launching billing flow. Try to reconnect", (Throwable)b);
                                                                                                                                                                                                                                                                                            k = zrq.i;
                                                                                                                                                                                                                                                                                            this.x(4, k, jrq.a(b), nextLong, b2);
                                                                                                                                                                                                                                                                                            this.I(k);
                                                                                                                                                                                                                                                                                            return k;
                                                                                                                                                                                                                                                                                            Label_0933: {
                                                                                                                                                                                                                                                                                                iftrue(Label_0972:)(list3.isEmpty());
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            break Block_39;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        zlq.next().getClass();
                                                                                                                                                                                                                                                                                        continue Block_31_Outer;
                                                                                                                                                                                                                                                                                        this.w(108, c2, nextLong, b2);
                                                                                                                                                                                                                                                                                        this.I(c2);
                                                                                                                                                                                                                                                                                        return c2;
                                                                                                                                                                                                                                                                                        list3 = new ArrayList();
                                                                                                                                                                                                                                                                                        iterator = a.i().iterator();
                                                                                                                                                                                                                                                                                        continue Block_31_Outer;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                iftrue(Label_1126:)(h2.size() <= 1);
                                                                                                                                                                                                                                                                                break Block_43;
                                                                                                                                                                                                                                                                                n = n2;
                                                                                                                                                                                                                                                                                iftrue(Label_2090:)(n2 != 1);
                                                                                                                                                                                                                                                                                continue Block_30_Outer;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            Label_2010: {
                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                    Label_1969: {
                                                                                                                                                                                                                                                                                        value = ((BaseBundle)bundle2).get("LOG_REASON");
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (value == null) {
                                                                                                                                                                                                                                                                                        break Label_1672;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (!(value instanceof Integer)) {
                                                                                                                                                                                                                                                                                        break Label_2010;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    n2 = yhq.b((int)value);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                finally {
                                                                                                                                                                                                                                                                                    hmq.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf((Object)t.getMessage())));
                                                                                                                                                                                                                                                                                    break Label_1672;
                                                                                                                                                                                                                                                                                    name = ((Integer)value).getClass().getName();
                                                                                                                                                                                                                                                                                    sb3 = new StringBuilder();
                                                                                                                                                                                                                                                                                    sb3.append("Unexpected type for bundle log reason: ");
                                                                                                                                                                                                                                                                                    sb3.append(name);
                                                                                                                                                                                                                                                                                    hmq.h("BillingClient", sb3.toString());
                                                                                                                                                                                                                                                                                    break Label_1672;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            continue Label_2078;
                                                                                                                                                                                                                                                                            n3 = 28;
                                                                                                                                                                                                                                                                            break Label_1672;
                                                                                                                                                                                                                                                                            Label_1698: {
                                                                                                                                                                                                                                                                                iftrue(Label_1715:)(!this.p || !b4);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            break Block_26_Outer;
                                                                                                                                                                                                                                                                            ((BaseBundle)bundle).putString("accountId", a.d());
                                                                                                                                                                                                                                                                            break Label_0720;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        t2 = qvq.t();
                                                                                                                                                                                                                                                                        t2.e(list3);
                                                                                                                                                                                                                                                                        bundle.putByteArray("subscriptionProductReplacementParamsList", ((kxq)((g1r)t2).a()).a());
                                                                                                                                                                                                                                                                        break Label_0972;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    a.g();
                                                                                                                                                                                                                                                                    ((BaseBundle)bundle).putString("originalExternalTransactionId", (String)null);
                                                                                                                                                                                                                                                                    break Label_0855;
                                                                                                                                                                                                                                                                    c3 = tb3.c();
                                                                                                                                                                                                                                                                    list4.add((Object)c3);
                                                                                                                                                                                                                                                                    g = b5.g(c3);
                                                                                                                                                                                                                                                                    iftrue(Label_1322:)(TextUtils.isEmpty((CharSequence)g));
                                                                                                                                                                                                                                                                    break Block_47;
                                                                                                                                                                                                                                                                    Label_0471: {
                                                                                                                                                                                                                                                                        iterator2 = i.iterator();
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break Label_0478;
                                                                                                                                                                                                                                                                    ((BaseBundle)bundle).putString("paymentsPurchaseParams", (String)null);
                                                                                                                                                                                                                                                                    break Label_0871;
                                                                                                                                                                                                                                                                    iftrue(Label_1424:)(list5.isEmpty());
                                                                                                                                                                                                                                                                    break Block_50;
                                                                                                                                                                                                                                                                    iftrue(Label_0813:)(TextUtils.isEmpty((CharSequence)a.f()));
                                                                                                                                                                                                                                                                    continue Block_28_Outer;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                bundle.putStringArrayList("additionalSkus", list6);
                                                                                                                                                                                                                                                                bundle.putStringArrayList("additionalSkuTypes", list7);
                                                                                                                                                                                                                                                                break Label_1126;
                                                                                                                                                                                                                                                                ++n4;
                                                                                                                                                                                                                                                                break Label_2078;
                                                                                                                                                                                                                                                                c4 = ((tb2)zlq2.next()).c();
                                                                                                                                                                                                                                                                iftrue(Label_0478:)(c4 == null || !c4.contains((CharSequence)":") || this.y);
                                                                                                                                                                                                                                                                break Block_25;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            iftrue(Label_0829:)(TextUtils.isEmpty((CharSequence)null));
                                                                                                                                                                                                                                                            continue Block_26_Outer;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        iftrue(Label_1510:)(!((BaseBundle)bundle).containsKey("SKU_OFFER_ID_TOKEN_LIST") || this.o);
                                                                                                                                                                                                                                                        break Block_54;
                                                                                                                                                                                                                                                        hmq.i("BillingClient", "Exception while launching billing flow. Try to reconnect", (Throwable)b);
                                                                                                                                                                                                                                                        h3 = zrq.h;
                                                                                                                                                                                                                                                        this.x(5, h3, jrq.a(b), nextLong, b2);
                                                                                                                                                                                                                                                        this.I(h3);
                                                                                                                                                                                                                                                        return h3;
                                                                                                                                                                                                                                                        Label_0378: {
                                                                                                                                                                                                                                                            iftrue(Label_0424:)(h2.size() <= 1 || this.q);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        break Block_19;
                                                                                                                                                                                                                                                        iftrue(Label_1372:)(n4 <= 0);
                                                                                                                                                                                                                                                        break Block_48;
                                                                                                                                                                                                                                                        iftrue(Label_1442:)(list8.isEmpty());
                                                                                                                                                                                                                                                        break Label_1424_Outer;
                                                                                                                                                                                                                                                        bundle.putIntegerArrayList("autoPayBalanceThresholdList", list9);
                                                                                                                                                                                                                                                        continue Label_0791_Outer;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    b2 = false;
                                                                                                                                                                                                                                                    continue Block_33_Outer;
                                                                                                                                                                                                                                                    Label_0334: {
                                                                                                                                                                                                                                                        iftrue(Label_0378:)(!a.k() || this.m);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break Block_17;
                                                                                                                                                                                                                                                    Label_1129:
                                                                                                                                                                                                                                                    ge9.C(h2.get(1));
                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                    iftrue(Label_1566:)(TextUtils.isEmpty((CharSequence)null));
                                                                                                                                                                                                                                                    break Block_56;
                                                                                                                                                                                                                                                    hmq.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                                                                                                                                                                                                                                                    n5 = zrq.n;
                                                                                                                                                                                                                                                    this.w(20, n5, nextLong, b2);
                                                                                                                                                                                                                                                    this.I(n5);
                                                                                                                                                                                                                                                    return n5;
                                                                                                                                                                                                                                                    ((BaseBundle)bundle).putString("skuPackageName", tb2.b().e());
                                                                                                                                                                                                                                                    b4 = true;
                                                                                                                                                                                                                                                    continue Block_21_Outer;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                hmq.h("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                                                                                                                                                                                                                                                m = zrq.m;
                                                                                                                                                                                                                                                this.w(143, m, nextLong, b2);
                                                                                                                                                                                                                                                this.I(m);
                                                                                                                                                                                                                                                return m;
                                                                                                                                                                                                                                                intent2 = new Intent((Context)b, (Class)ProxyBillingActivity.class);
                                                                                                                                                                                                                                                intent2.putExtra("BUY_INTENT", (Parcelable)bundle2.getParcelable("BUY_INTENT"));
                                                                                                                                                                                                                                                intent2.putExtra("billingClientTransactionId", n6);
                                                                                                                                                                                                                                                intent2.putExtra("wasServiceAutoReconnected", b6);
                                                                                                                                                                                                                                                ((Activity)b).startActivity(intent2);
                                                                                                                                                                                                                                                return zrq.g;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            iftrue(Label_0885:)(!n7);
                                                                                                                                                                                                                                            break Block_37;
                                                                                                                                                                                                                                            hmq.h("BillingClient", d2r.v(n2, "Unable to buy item, Error response code: "));
                                                                                                                                                                                                                                            a = (vb2)zrq.a(n2, f);
                                                                                                                                                                                                                                            iftrue(Label_1969:)(bundle2 != null);
                                                                                                                                                                                                                                            break Label_1672;
                                                                                                                                                                                                                                            list = new ArrayList();
                                                                                                                                                                                                                                            new ArrayList();
                                                                                                                                                                                                                                            new ArrayList();
                                                                                                                                                                                                                                            new ArrayList();
                                                                                                                                                                                                                                            new ArrayList();
                                                                                                                                                                                                                                            iterator3 = h2.iterator();
                                                                                                                                                                                                                                            iftrue(Label_1140:)(iterator3.hasNext());
                                                                                                                                                                                                                                            break Block_41;
                                                                                                                                                                                                                                            Label_1545: {
                                                                                                                                                                                                                                                b4 = false;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            continue Block_21_Outer;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            b = (Exception)zrq.b;
                                                                                                                                                                                                                                            b7 = b2;
                                                                                                                                                                                                                                            n8 = nextLong;
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                this.w(25, (gc2)b, n8, b7);
                                                                                                                                                                                                                                                this.I((gc2)b);
                                                                                                                                                                                                                                                return (gc2)b;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (final Exception b) {}
                                                                                                                                                                                                                                            catch (final CancellationException b) {}
                                                                                                                                                                                                                                            catch (final TimeoutException b) {}
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (final Exception b) {
                                                                                                                                                                                                                                            continue Label_2249;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (final CancellationException ex2) {}
                                                                                                                                                                                                                                        catch (final TimeoutException b) {
                                                                                                                                                                                                                                            goto Label_1881;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        break Label_1896;
                                                                                                                                                                                                                                        Label_1140: {
                                                                                                                                                                                                                                            ge9.C(iterator3.next());
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    list8.add((Object)g);
                                                                                                                                                                                                                                    continue Label_1424_Outer;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    Label_2100: {
                                                                                                                                                                                                                                        ((BaseBundle)bundle2).getString("ADDITIONAL_LOG_DETAILS");
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                finally {
                                                                                                                                                                                                                                    hmq.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf((Object)((Throwable)b).getMessage())));
                                                                                                                                                                                                                                    break Label_1798;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                break Block_71;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            n3 = 17;
                                                                                                                                                                                                                            break Label_1672;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        n7 = this.n;
                                                                                                                                                                                                                        this.z.getClass();
                                                                                                                                                                                                                        this.z.getClass();
                                                                                                                                                                                                                        d = this.d;
                                                                                                                                                                                                                        longValue = this.E;
                                                                                                                                                                                                                        this.g.getPackageName();
                                                                                                                                                                                                                        a4 = hmq.a;
                                                                                                                                                                                                                        bundle = new Bundle();
                                                                                                                                                                                                                        hmq.b(bundle, d, longValue);
                                                                                                                                                                                                                        ((BaseBundle)bundle).putLong("billingClientTransactionId", nextLong);
                                                                                                                                                                                                                        iftrue(Label_0698:)(a.b() == 0);
                                                                                                                                                                                                                        continue Block_42_Outer;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    bundle.putStringArrayList("skuDetailsTokens", list5);
                                                                                                                                                                                                                    continue Block_49_Outer;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                iftrue(Label_1675:)(!this.y);
                                                                                                                                                                                                                continue Label_1672_Outer;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", list8);
                                                                                                                                                                                                            continue Block_30_Outer;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        Label_0560: {
                                                                                                                                                                                                            c2 = a.c();
                                                                                                                                                                                                        }
                                                                                                                                                                                                        iftrue(Label_0595:)(c2 == zrq.g);
                                                                                                                                                                                                        continue Label_0885_Outer;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        this.x(n, (gc2)a, (String)b, nextLong, b2);
                                                                                                                                                                                                        this.I((gc2)a);
                                                                                                                                                                                                        return (gc2)a;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (final Exception b) {
                                                                                                                                                                                                        continue Label_2249;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (final CancellationException ex3) {}
                                                                                                                                                                                                    catch (final TimeoutException b) {
                                                                                                                                                                                                        goto Label_2174;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;
                                                                                                                                                                                                }
                                                                                                                                                                                                continue Block_67_Outer;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        iftrue(Label_1152:)(h2.isEmpty());
                                                                                                                                                                                        continue Block_66_Outer;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                iftrue(Label_0791:)(TextUtils.isEmpty((CharSequence)null));
                                                                                                                                                                                bundle.putStringArrayList("skusToReplace", new ArrayList((Collection)Arrays.asList((Object[])new String[] { null })));
                                                                                                                                                                                continue Block_44_Outer;
                                                                                                                                                                            }
                                                                                                                                                                            hmq.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                                                                                                                                                                            e = zrq.e;
                                                                                                                                                                            this.w(18, e, nextLong, b2);
                                                                                                                                                                            this.I(e);
                                                                                                                                                                            return e;
                                                                                                                                                                        }
                                                                                                                                                                        b6 = b2;
                                                                                                                                                                        n6 = nextLong;
                                                                                                                                                                        bundle2 = (Bundle)future.get(5000L, TimeUnit.MILLISECONDS);
                                                                                                                                                                        n2 = hmq.a(bundle2, "BillingClient");
                                                                                                                                                                        f = hmq.f(bundle2, "BillingClient");
                                                                                                                                                                        iftrue(Label_2189:)(n2 == 0);
                                                                                                                                                                        continue Block_66_Outer;
                                                                                                                                                                    }
                                                                                                                                                                    future = h((Callable)new ahq(this, n3, b3, c, a, bundle), 5000L, null, this.e, this.g());
                                                                                                                                                                    break Label_1798;
                                                                                                                                                                }
                                                                                                                                                                continue Block_49_Outer;
                                                                                                                                                            }
                                                                                                                                                            bundle.putStringArrayList("additionalSkus", list2);
                                                                                                                                                            bundle.putStringArrayList("additionalSkuTypes", list10);
                                                                                                                                                            continue Block_49_Outer;
                                                                                                                                                        }
                                                                                                                                                        list2.add((Object)((tb2)((List)i).get(n4)).b().b());
                                                                                                                                                        list10.add((Object)((tb2)((List)i).get(n4)).b().c());
                                                                                                                                                        continue Block_22_Outer;
                                                                                                                                                    }
                                                                                                                                                    l = zrq.l;
                                                                                                                                                    this.w(21, l, nextLong, b2);
                                                                                                                                                    this.I(l);
                                                                                                                                                    return l;
                                                                                                                                                    stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                                                                                                                                    ((BaseBundle)bundle).putString("proxyPackage", stringExtra);
                                                                                                                                                    try {
                                                                                                                                                        ((BaseBundle)bundle).putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                                                                                                                                    }
                                                                                                                                                    catch (final PackageManager$NameNotFoundException ex4) {
                                                                                                                                                        ((BaseBundle)bundle).putString("proxyPackageVersion", "package not found");
                                                                                                                                                    }
                                                                                                                                                    continue Label_1662;
                                                                                                                                                }
                                                                                                                                                hmq.h("BillingClient", "Current client doesn't support multi-item purchases.");
                                                                                                                                                k2 = zrq.k;
                                                                                                                                                this.w(19, k2, nextLong, b2);
                                                                                                                                                this.I(k2);
                                                                                                                                                return k2;
                                                                                                                                            }
                                                                                                                                            ((BaseBundle)bundle).putBoolean("enablePendingPurchases", true);
                                                                                                                                            continue Label_2078_Outer;
                                                                                                                                        }
                                                                                                                                        tb3 = (tb2)((List)i).get(n4);
                                                                                                                                        b5 = tb3.b();
                                                                                                                                        iftrue(Label_1282:)(b5.f().isEmpty());
                                                                                                                                        break Label_1566_Outer;
                                                                                                                                        Label_1152: {
                                                                                                                                            list2 = new ArrayList(((List)i).size() - 1);
                                                                                                                                        }
                                                                                                                                        list10 = new ArrayList(((List)i).size() - 1);
                                                                                                                                        list5 = new ArrayList();
                                                                                                                                        list4 = new ArrayList();
                                                                                                                                        list8 = new ArrayList();
                                                                                                                                        list9 = new ArrayList();
                                                                                                                                        n4 = 0;
                                                                                                                                        break Label_2078;
                                                                                                                                    }
                                                                                                                                    iftrue(Label_0742:)(TextUtils.isEmpty((CharSequence)a.e()));
                                                                                                                                    continue Label_1566_Outer;
                                                                                                                                }
                                                                                                                                n3 = 15;
                                                                                                                                continue Label_1672;
                                                                                                                                n3 = 9;
                                                                                                                                continue Label_1672;
                                                                                                                            }
                                                                                                                            iftrue(Label_0871:)(TextUtils.isEmpty((CharSequence)null));
                                                                                                                            continue Block_44_Outer;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    iftrue(Label_0720:)(TextUtils.isEmpty((CharSequence)a.d()));
                                                                                                                    continue Label_1282_Outer;
                                                                                                                }
                                                                                                                zlq2 = (zlq)iterator2;
                                                                                                                iftrue(Label_0560:)(!zlq2.hasNext());
                                                                                                                continue Block_49_Outer;
                                                                                                            }
                                                                                                        }
                                                                                                        iftrue(Label_2100:)(bundle2 != null);
                                                                                                        break Label_1798;
                                                                                                        Label_1728: {
                                                                                                            n3 = 6;
                                                                                                        }
                                                                                                        continue Label_1672;
                                                                                                    }
                                                                                                    n2 = 1;
                                                                                                    continue Label_2078;
                                                                                                }
                                                                                                iftrue(Label_1378:)(n4 >= ((List)i).size());
                                                                                                continue Block_65_Outer;
                                                                                            }
                                                                                            iftrue(Label_1896:)(future != null);
                                                                                            continue Label_1662_Outer;
                                                                                        }
                                                                                    }
                                                                                    hmq.h("BillingClient", "Activity's intent is null.");
                                                                                    continue Label_1662;
                                                                                }
                                                                                Label_1769: {
                                                                                    future = h((Callable)new dhq(this, (Object)b3, (Object)c, (byte)0), 5000L, null, this.e, this.g());
                                                                                }
                                                                                continue Label_1798;
                                                                            }
                                                                            b = null;
                                                                            continue Block_58_Outer;
                                                                        }
                                                                        Label_0424: {
                                                                            iftrue(Label_0471:)(((List)i).isEmpty() || this.r);
                                                                        }
                                                                        continue Block_55_Outer;
                                                                    }
                                                                    Label_1510: {
                                                                        iftrue(Label_1545:)(TextUtils.isEmpty((CharSequence)tb2.b().e()));
                                                                    }
                                                                    continue Block_58_Outer;
                                                                }
                                                                iftrue(Label_1056:)(list.isEmpty());
                                                                continue Block_31_Outer;
                                                            }
                                                            Label_1378: {
                                                                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", list4);
                                                            }
                                                            iftrue(Label_1406:)(list9.isEmpty());
                                                            continue Block_58_Outer;
                                                        }
                                                        Label_1588: {
                                                            iftrue(Label_1662:)(TextUtils.isEmpty((CharSequence)intent.getStringExtra("PROXY_PACKAGE")));
                                                        }
                                                        continue Block_65_Outer;
                                                    }
                                                }
                                                ((BaseBundle)bundle).putString("accountName", (String)null);
                                                continue Label_1282_Outer;
                                            }
                                            iftrue(Label_0758:)(!a.j());
                                            continue Label_1282_Outer;
                                        }
                                        list5.add((Object)b5.f());
                                        continue Block_44_Outer;
                                    }
                                }
                                list6 = new ArrayList(h2.size() - 1);
                                list7 = new ArrayList(h2.size() - 1);
                                iftrue(Label_1129:)(h2.size() > 1);
                                continue Block_65_Outer;
                            }
                            Label_1715: {
                                iftrue(Label_1728:)(!this.n);
                            }
                            continue;
                        }
                    }
                }
                break;
            }
        }
        final gc2 q = zrq.q;
        this.u(12, q, nextLong);
        return q;
    }
    
    public void e(final vre vre, final bgq bgq) {
        if (h((Callable)new dhq(this, (Object)bgq, (Object)vre, (byte)2), 30000L, (Runnable)new qua((Object)this, (Object)bgq, (byte)15), this.i(), this.g()) == null) {
            final gc2 l = this.l();
            this.t(25, 7, l);
            final goq m = ymq.m();
            ymq.m();
            bgq.F(l, new azh((List)m, (byte)2));
        }
    }
    
    public void f(final rb2 rb2) {
        this.E(rb2, 0);
    }
    
    public final ExecutorService g() {
        monitorenter(this);
        Label_0047: {
            try {
                ExecutorService d;
                if ((d = this.D) == null) {
                    d = Executors.newFixedThreadPool(hmq.a, (ThreadFactory)new epc(this));
                    this.D = d;
                }
                break Label_0047;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
                return;
            }
        }
    }
    
    public final Handler i() {
        if (Looper.myLooper() == null) {
            return this.e;
        }
        return new Handler(Looper.myLooper());
    }
    
    public final o70 j(final gc2 gc2, final int n, final String s, final Exception ex) {
        hmq.i("BillingClient", s, (Throwable)ex);
        this.v(n, 7, gc2, jrq.a(ex));
        return new o70(gc2.a, gc2.c, new ArrayList(), new ArrayList());
    }
    
    public final gc2 k(final int n) {
        hmq.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        final k9r u = p9r.u();
        ((g1r)u).c();
        p9r.t((p9r)((g1r)u).w, 6);
        final ldr t = mdr.t();
        t.g();
        t.e(n > 0);
        t.f(n);
        ((g1r)u).c();
        p9r.y((p9r)((g1r)u).w, (mdr)((g1r)t).a());
        this.B((p9r)((g1r)u).a());
        return zrq.g;
    }
    
    public final gc2 l() {
        int n = 0;
        final Object a;
        monitorenter(a = this.a);
        while (true) {
            Label_0058: {
                if (n >= 2) {
                    break Label_0058;
                }
                Label_0052: {
                    try {
                        if (this.b == (new int[] { 0, 3 })[n]) {
                            monitorexit(a);
                            return zrq.h;
                        }
                        break Label_0052;
                    }
                    finally {
                        monitorexit(a);
                        ++n;
                        continue;
                        monitorexit(a);
                        return zrq.f;
                    }
                }
            }
        }
    }
    
    public final isq m(final int n) {
        if (this.A && !this.H()) {
            return (isq)j5r.u((ffr)new qd6((Object)this, n, (byte)14));
        }
        hmq.g("BillingClient", "Already connected or not opted into auto reconnection.");
        return (isq)m3r.q((Object)zrq.g);
    }
    
    public final void n() {
        if (!TextUtils.isEmpty((CharSequence)null)) {
            return;
        }
        this.g.getPackageName();
    }
    
    public final hjo s(final gc2 gc2, final int n, final String s, final Exception ex) {
        this.v(n, 9, gc2, jrq.a(ex));
        hmq.i("BillingClient", s, (Throwable)ex);
        return new hjo((Object)gc2, (Object)null, (byte)12);
    }
    
    public final void t(final int n, final int n2, final gc2 gc2) {
        try {
            final int a = jrq.a;
            this.A(jrq.b(n, n2, gc2, null, mar.w));
        }
        finally {
            final Throwable t;
            hmq.i("BillingClient", "Unable to log.", t);
        }
    }
    
    public final void u(final int n, final gc2 gc2, final long n2) {
        try {
            final int a = jrq.a;
            final f9r b = jrq.b(n, 2, gc2, null, mar.w);
            try {
                this.h.q(b, this.l, n2);
            }
            finally {
                final Throwable t;
                hmq.i("BillingClient", "Unable to log.", t);
            }
        }
        finally {
            final Throwable t2;
            hmq.i("BillingClient", "Unable to log.", t2);
        }
    }
    
    public final void v(final int n, final int n2, final gc2 gc2, final String s) {
        try {
            final int a = jrq.a;
            this.A(jrq.b(n, n2, gc2, s, mar.w));
        }
        finally {
            final Throwable t;
            hmq.i("BillingClient", "Unable to log.", t);
        }
    }
    
    public final void w(final int n, final gc2 gc2, final long n2, final boolean b) {
        try {
            final int a = jrq.a;
            final f9r b2 = jrq.b(n, 2, gc2, null, mar.w);
            try {
                this.h.s(b2, this.l, n2, b);
            }
            finally {
                final Throwable t;
                hmq.i("BillingClient", "Unable to log.", t);
            }
        }
        finally {
            final Throwable t2;
            hmq.i("BillingClient", "Unable to log.", t2);
        }
    }
    
    public final void x(final int n, final gc2 gc2, final String s, final long n2, final boolean b) {
        try {
            final int a = jrq.a;
            final f9r b2 = jrq.b(n, 2, gc2, s, mar.w);
            try {
                this.h.s(b2, this.l, n2, b);
            }
            finally {
                final Throwable t;
                hmq.i("BillingClient", "Unable to log.", t);
            }
        }
        finally {
            final Throwable t2;
            hmq.i("BillingClient", "Unable to log.", t2);
        }
    }
    
    public final void y(final r70 r70, final String s, final gc2 gc2, final int n, final String s2, final Exception ex) {
        hmq.i("BillingClient", s2, (Throwable)ex);
        this.v(n, 4, gc2, jrq.a(ex));
        r70.w(gc2, s);
    }
    
    public final void z(final zs2 zs2, final gc2 gc2, final int n, final Exception ex) {
        hmq.i("BillingClient", "getBillingConfig got an exception.", (Throwable)ex);
        this.v(n, 13, gc2, jrq.a(ex));
        zs2.b(gc2);
    }
}
