import android.content.BroadcastReceiver;
import com.anthropic.claude.tool.model.MessageComposeV0Input;
import android.content.ComponentName;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Collections;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.concurrent.ConcurrentHashMap$KeySetView;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.Locale;
import java.io.File;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchError;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchErrorErrorType;
import com.anthropic.claude.tool.model.EventSearchV0Output;
import com.anthropic.claude.tool.model.EventSearchV0Input;
import java.util.concurrent.CancellationException;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1Error;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ErrorErrorType;
import com.anthropic.claude.tool.model.EventCreateV1Output;
import com.anthropic.claude.tool.model.EventCreateV1Input;
import androidx.profileinstaller.ProfileInstallReceiver;
import android.util.Log;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.List;
import android.app.ActivityManager;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;
import java.util.HashSet;

public final class v2b implements t45, d64, gfi, brg, be, psh, rb2
{
    public static final owa A;
    public static volatile v2b x;
    public static final Object y;
    public static volatile v2b z;
    public final byte v;
    public Object w;
    
    public v2b(final byte v) {
        switch (this.v = v) {
            default: {
                this.w = new HashSet();
                return;
            }
            case 27: {
                this.w = new rwd((Object)null);
                return;
            }
            case 22: {
                this.w = new inf(0, (Object[])new m3d[16]);
                return;
            }
            case 19: {
                this.w = null;
                return;
            }
            case 15: {
                this.w = new HashMap();
                return;
            }
            case 14: {
                this.w = new hdk((byte)3);
                return;
            }
            case 4: {
                this.w = new AtomicInteger(0);
                return;
            }
            case 3: {
                this.w = ConcurrentHashMap.newKeySet();
                return;
            }
            case 2: {
                final Class a = w30.a;
                Object a2;
                try {
                    a2 = Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])null).invoke((Object)null, (Object[])null);
                }
                catch (final Exception ex) {
                    a2 = v2b.A;
                }
                final owa b = owa.b;
                final Object w = new Object();
                ((i1e)w).a = new s5f[] { (s5f)b, (s5f)a2 };
                final Charset a3 = ejc.a;
                this.w = w;
                return;
            }
            case 1: {
                this.w = new ConcurrentHashMap();
            }
        }
    }
    
    public v2b(final int n) {
        this.v = 26;
        this.w = bpm.a((Object)new int[n]);
    }
    
    public v2b(final gb0 w, final p3 p2) {
        this.v = 13;
        this.w = w;
    }
    
    public static v2b q() {
        if (v2b.z == null) {
            final Object y;
            monitorenter(y = v2b.y);
            Label_0040: {
                try {
                    if (v2b.z == null) {
                        v2b.z = new v2b((byte)1);
                    }
                    break Label_0040;
                }
                finally {
                    monitorexit(y);
                    monitorexit(y);
                }
            }
        }
        final v2b z = v2b.z;
        ao2.z((Object)z);
        return z;
    }
    
    public static void r(final v2b v2b, final Context context) {
        double n = 0.2;
        while (true) {
            try {
                final Object systemService = context.getSystemService((Class)ActivityManager.class);
                systemService.getClass();
                if (((ActivityManager)systemService).isLowRamDevice()) {
                    n = 0.15;
                }
                if (0.0 <= n && n <= 1.0) {
                    v2b.w = new use(n, context);
                    return;
                }
                en9.s("percent must be in the range [0.0, 1.0].");
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public boolean a() {
        final f64 f64 = (f64)this.w;
        final gci c = f64.C;
        return c.q(f64.b0()).isEmpty() && mlc.q(c.j.get((Object)f64.b0()), (Object)Boolean.TRUE);
    }
    
    public void b(final lta lta, final zta zta) {
        ((gb0)((hdk)this.w).v).a(new arg(lta, zta));
    }
    
    public sti c() {
        final qd6 qd6 = new qd6((byte)9);
        final use use = (use)this.w;
        if (use != null) {
            return new sti(new gui(((Number)use.a()).longValue(), qd6), qd6);
        }
        en9.q("maxSizeBytesFactory == null");
        return null;
    }
    
    public gnf d(final i1 i1) {
        return ((gb0)((hdk)this.w).v).f((lta)i1);
    }
    
    public List e() {
        final f64 f64 = (f64)this.w;
        final gci c = f64.C;
        final ArrayList q = c.q(f64.b0());
        final ProjectId projectId = (ProjectId)f64.N.getValue();
        Object o = null;
        String a;
        if (projectId != null) {
            a = projectId.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            return (List)q;
        }
        final ygd a2 = lq6.A();
        final Project c2 = c.g.c(a);
        if (c2 != null) {
            if (!qjq.d(c2)) {
                o = c2;
            }
            if (o != null) {
                a2.add(o);
            }
        }
        for (final Object next : q) {
            if (!mlc.q((Object)((Project)next).o(), (Object)a)) {
                a2.add(next);
            }
        }
        return (List)lq6.n(a2);
    }
    
    public void f(Object o) {
        final Map map = (Map)o;
        final vra vra = (vra)this.w;
        final String[] array = (String[])map.keySet().toArray((Object[])new String[0]);
        final ArrayList list = new ArrayList(map.values());
        final int[] array2 = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            int n;
            if (list.get(i)) {
                n = 0;
            }
            else {
                n = -1;
            }
            array2[i] = n;
        }
        final rra rra = (rra)vra.F.pollFirst();
        if (rra == null) {
            o = new StringBuilder("No permissions were requested for ");
            ((StringBuilder)o).append((Object)this);
            Log.w("FragmentManager", ((StringBuilder)o).toString());
            return;
        }
        final String v = rra.v;
        if (vra.c.x(v) == null) {
            o = new StringBuilder("Permission request result delivered for unknown Fragment ");
            ((StringBuilder)o).append(v);
            Log.w("FragmentManager", ((StringBuilder)o).toString());
        }
    }
    
    public void g(final gc2 gc2) {
        h4b.a((k13)this.w, (Object)gc2.a);
    }
    
    public Object get() {
        switch (this.v) {
            default: {
                String packageName = ((Context)((gfi)this.w).get()).getPackageName();
                if (packageName == null) {
                    fvd.k("Cannot return null from a non-@Nullable @Provides method");
                    packageName = null;
                }
                return packageName;
            }
            case 11: {
                return new zn0((Context)((o3a)this.w).v, (Object)new eup((byte)27), (Object)new p3((byte)27));
            }
        }
    }
    
    public void h(final int resultCode, final Object o) {
        String s = null;
        switch (resultCode) {
            default: {
                s = "";
                break;
            }
            case 11: {
                s = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            }
            case 10: {
                s = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            }
            case 8: {
                s = "RESULT_PARSE_EXCEPTION";
                break;
            }
            case 7: {
                s = "RESULT_IO_EXCEPTION";
                break;
            }
            case 6: {
                s = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            }
            case 5: {
                s = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            }
            case 4: {
                s = "RESULT_NOT_WRITABLE";
                break;
            }
            case 3: {
                s = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            }
            case 2: {
                s = "RESULT_ALREADY_INSTALLED";
                break;
            }
            case 1: {
                s = "RESULT_INSTALL_SUCCESS";
                break;
            }
        }
        if (resultCode == 6 || resultCode == 7 || resultCode == 8) {
            Log.e("ProfileInstaller", s, (Throwable)o);
        }
        ((BroadcastReceiver)this.w).setResultCode(resultCode);
    }
    
    public boolean i() {
        final f64 f64 = (f64)this.w;
        return mlc.q((Object)f64.C.k(f64.b0(), (String)null).b(), (Object)Boolean.TRUE);
    }
    
    public boolean j() {
        final f64 f64 = (f64)this.w;
        return f64.C.k(f64.b0(), (String)null).c();
    }
    
    public void k() {
        final f64 f64 = (f64)this.w;
        rhc.G((oc7)((tvj)f64).v, (hc7)null, 0, (zta)new e64(f64, (f07)null, (byte)0), 3);
    }
    
    public void l() {
        h4b.a((k13)this.w, (Object)(-1));
    }
    
    public void m(final l33 l33, final h07 h07) {
        i5g i5g2 = null;
        Label_0053: {
            if (h07 instanceof i5g) {
                final i5g i5g = (i5g)h07;
                final int x = i5g.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    i5g.x = x + Integer.MIN_VALUE;
                    i5g2 = i5g;
                    break Label_0053;
                }
            }
            i5g2 = new i5g(this, h07);
        }
        final Object v = i5g2.v;
        final int x2 = i5g2.x;
        if (x2 == 0) {
            vt4.g0(v);
            final apm apm = (apm)this.w;
            i5g2.x = 1;
            apm.a((jja)l33, (f07)i5g2);
            return;
        }
        if (x2 != 1) {
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        throw ge9.w(v);
    }
    
    public Object n(EventCreateV1Input v, final h07 h07) {
        final xx2 xx2 = (xx2)this.w;
        wx2 wx3 = null;
        Label_0062: {
            if (h07 instanceof wx2) {
                final wx2 wx2 = (wx2)h07;
                final int y = wx2.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    wx2.y = y + Integer.MIN_VALUE;
                    wx3 = wx2;
                    break Label_0062;
                }
            }
            wx3 = new wx2(this, h07);
        }
        Object o = wx3.w;
        final int y2 = wx3.y;
        final pc7 v2 = pc7.v;
        Label_0121: {
            if (y2 == 0) {
                break Label_0121;
            }
            Label_0108: {
                if (y2 == 1) {
                    break Label_0108;
                }
                Label_0100: {
                    if (y2 != 2) {
                        break Label_0100;
                    }
                    try {
                        vt4.g0(o);
                        Label_0257: {
                            return sdr.t((Object)o);
                        }
                        vt4.g0(o);
                        final xd f = xx2.f;
                        wx3.v = v;
                        wx3.y = 1;
                        iftrue(Label_0165:)((o = f.b((h07)wx3)) != v2);
                        return v2;
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                        while (true) {
                            iftrue(Label_0193:)((boolean)o);
                            return sdr.j((Object)new EventCreateV1OutputEventCreateV1Error(EventCreateV1OutputEventCreateV1ErrorErrorType.x, "User denied calendar write permission."));
                            v = wx3.v;
                            vt4.g0(o);
                            continue;
                        }
                        Label_0193:
                        final az2 g = xx2.g;
                        wx3.v = null;
                        wx3.y = 2;
                        final o68 a = vo8.a;
                        iftrue(Label_0257:)((o = rhc.f0((hc7)d58.w, (zta)new n9((Object)g, (Object)v, (f07)null, (byte)18), (f07)wx3)) != v2);
                        return v2;
                    }
                    catch (final CancellationException ex) {
                        throw ex;
                    }
                    finally {
                        final tqd l = uqd.l;
                        return sdr.j((Object)new EventCreateV1OutputEventCreateV1Error(EventCreateV1OutputEventCreateV1ErrorErrorType.A, "An error occurred while creating calendar events."));
                    }
                }
            }
        }
    }
    
    public Object o(EventSearchV0Input v, final h07 h07) {
        final jy2 jy2 = (jy2)this.w;
        iy2 iy3 = null;
        Label_0062: {
            if (h07 instanceof iy2) {
                final iy2 iy2 = (iy2)h07;
                final int y = iy2.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    iy2.y = y + Integer.MIN_VALUE;
                    iy3 = iy2;
                    break Label_0062;
                }
            }
            iy3 = new iy2(this, h07);
        }
        Object o = iy3.w;
        final int y2 = iy3.y;
        final pc7 v2 = pc7.v;
        Label_0121: {
            if (y2 == 0) {
                break Label_0121;
            }
            Label_0108: {
                if (y2 == 1) {
                    break Label_0108;
                }
                Label_0100: {
                    if (y2 != 2) {
                        break Label_0100;
                    }
                    try {
                        vt4.g0(o);
                        Label_0260: {
                            final EventSearchV0Output eventSearchV0Output = (EventSearchV0Output)o;
                        }
                        goto Label_0288;
                        vt4.g0(o);
                        final xd f = jy2.f;
                        iy3.v = v;
                        iy3.y = 1;
                        iftrue(Label_0168:)((o = f.e("android.permission.READ_CALENDAR", (h07)iy3)) != v2);
                        return v2;
                        v = iy3.v;
                        vt4.g0(o);
                        Label_0168: {
                            break Label_0168;
                            Label_0196:
                            final az2 g = jy2.g;
                            iy3.v = null;
                            iy3.y = 2;
                            final o68 a = vo8.a;
                            iftrue(Label_0260:)((o = rhc.f0((hc7)d58.w, (zta)new n9((Object)g, (Object)v, (f07)null, (byte)20), (f07)iy3)) != v2);
                            return v2;
                        }
                        iftrue(Label_0196:)((boolean)o);
                        return sdr.j((Object)new EventSearchV0OutputEventSearchError(EventSearchV0OutputEventSearchErrorErrorType.x, "Calendar read permission denied."));
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    catch (final CancellationException ex) {
                        throw ex;
                    }
                    finally {
                        final tqd l = uqd.l;
                        final EventSearchV0OutputEventSearchError eventSearchV0OutputEventSearchError = new EventSearchV0OutputEventSearchError(EventSearchV0OutputEventSearchErrorErrorType.B, "An unknown error occurred.");
                    }
                }
            }
        }
    }
    
    public File p(final File file, final String s) {
        final File file2 = new File(new File(file, String.format(Locale.US, "datastore_v%s", Arrays.copyOf(new Object[] { 0 }, 1))), s);
        final rjc rjc = (rjc)this.w;
        if (!uoo.E(file2, rjc)) {
            uoo.T(file2, rjc);
        }
        return new File(file2, "anonymous_id_key");
    }
    
    public ms9 s(final sv9 sv9, final AndroidComposeView androidComposeView) {
        final rwd rwd = (rwd)this.w;
        final rwd rwd2 = new rwd(((ArrayList)sv9.v()).size());
        final ArrayList list = (ArrayList)sv9.v();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final reh reh = (reh)list.get(i);
            final qeh qeh = (qeh)rwd.b(reh.d());
            long n;
            long n2;
            boolean a;
            if (qeh == null) {
                n = reh.m();
                n2 = reh.g();
                a = false;
            }
            else {
                n = qeh.c();
                a = qeh.a();
                n2 = androidComposeView.H(qeh.b());
            }
            rwd2.d(reh.d(), (Object)new peh(reh.d(), reh.m(), reh.g(), reh.b(), reh.i(), n, n2, a, reh.l(), reh.c(), reh.k(), reh.j(), reh.f(), reh.e(), 0));
            if (reh.b()) {
                rwd.d(reh.d(), (Object)new qeh(reh.m(), reh.h(), reh.b()));
            }
            else {
                rwd.e(reh.d());
            }
        }
        return new ms9(rwd2, sv9);
    }
    
    public void t(final mh0 mh0, final Exception ex, final int n) {
        if (!((ConcurrentHashMap$KeySetView)this.w).add((Object)mh0)) {
            return;
        }
        final List a = adn.a;
        final SilentException ex2 = new SilentException(mh0.b(), (Throwable)ex);
        final lpl a2 = mh0.a();
        final Map singletonMap = Collections.singletonMap((Object)"first_failing_opsz", (Object)n);
        singletonMap.getClass();
        adn.f((Throwable)ex2, (String)null, a2, singletonMap, (List)null, 50);
    }
    
    public void u(final Context p0, final ServiceConnection p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        v2b.w:Ljava/lang/Object;
        //     4: checkcast       Ljava/util/concurrent/ConcurrentHashMap;
        //     7: astore_3       
        //     8: aload_2        
        //     9: instanceof      Lmer;
        //    12: ifne            61
        //    15: aload_3        
        //    16: aload_2        
        //    17: invokevirtual   java/util/concurrent/ConcurrentHashMap.containsKey:(Ljava/lang/Object;)Z
        //    20: ifeq            61
        //    23: aload_3        
        //    24: aload_2        
        //    25: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    28: checkcast       Landroid/content/ServiceConnection;
        //    31: astore          4
        //    33: aload_1        
        //    34: aload           4
        //    36: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    39: goto            46
        //    42: astore_1       
        //    43: goto            53
        //    46: aload_3        
        //    47: aload_2        
        //    48: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    51: pop            
        //    52: return         
        //    53: aload_3        
        //    54: aload_2        
        //    55: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    58: pop            
        //    59: aload_1        
        //    60: athrow         
        //    61: aload_1        
        //    62: aload_2        
        //    63: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    66: return         
        //    67: astore_1       
        //    68: goto            46
        //    71: astore_1       
        //    72: goto            66
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  23     33     42     46     Any
        //  33     39     67     71     Ljava/lang/IllegalArgumentException;
        //  33     39     67     71     Ljava/lang/IllegalStateException;
        //  33     39     67     71     Ljava/util/NoSuchElementException;
        //  33     39     42     46     Any
        //  61     66     71     75     Ljava/lang/IllegalArgumentException;
        //  61     66     71     75     Ljava/lang/IllegalStateException;
        //  61     66     71     75     Ljava/util/NoSuchElementException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
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
    
    public boolean v(final Context context, String s, final Intent intent, final ServiceConnection serviceConnection, final int n, final Executor executor) {
        final ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)this.w;
        final ComponentName component = intent.getComponent();
        while (true) {
            if (component == null) {
                break Label_0066;
            }
            final String packageName = component.getPackageName();
            try {
                boolean b;
                if ((i9q.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 0x200000) != 0x0) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (b) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
                if (!(serviceConnection instanceof mer)) {
                    final ServiceConnection serviceConnection2 = (ServiceConnection)concurrentHashMap.putIfAbsent((Object)serviceConnection, (Object)serviceConnection);
                    if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                        Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[] { serviceConnection, s, intent.getAction() }));
                    }
                    if ((s = (String)executor) == null) {
                        s = null;
                    }
                    try {
                        boolean b2;
                        if (Build$VERSION.SDK_INT >= 29 && s != null) {
                            b2 = zp6.s(context, intent, n, (Executor)s, serviceConnection);
                        }
                        else {
                            b2 = context.bindService(intent, serviceConnection, n);
                        }
                        return b2 && b2;
                    }
                    finally {
                        concurrentHashMap.remove((Object)serviceConnection, (Object)serviceConnection);
                    }
                }
                if ((s = (String)executor) == null) {
                    s = null;
                }
                boolean b3;
                if (Build$VERSION.SDK_INT >= 29 && s != null) {
                    b3 = zp6.s(context, intent, n, (Executor)s, serviceConnection);
                }
                else {
                    b3 = context.bindService(intent, serviceConnection, n);
                }
                return b3;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public Object z(final Context context, final Object o, final String s, final x4o x4o) {
        switch (this.v) {
            default: {
                ((v2f)this.w).g = ((MessageComposeV0Input)o).b;
                return sdr.t((Object)"Text message creation template has been presented.");
            }
            case 7: {
                return this.o((EventSearchV0Input)o, (h07)x4o);
            }
            case 6: {
                return this.n((EventCreateV1Input)o, (h07)x4o);
            }
        }
    }
}
