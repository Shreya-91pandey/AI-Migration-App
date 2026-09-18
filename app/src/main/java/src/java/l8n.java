import android.os.BaseBundle;
import android.net.NetworkRequest;
import java.util.Set;
import android.app.job.JobInfo$TriggerContentUri;
import java.util.Collection;
import android.net.NetworkRequest$Builder;
import android.os.Build$VERSION;
import android.app.job.JobInfo$Builder;
import android.os.PersistableBundle;
import java.util.Iterator;
import java.util.List;
import android.app.job.JobInfo;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Locale;
import androidx.work.impl.WorkDatabase;
import android.app.job.JobScheduler;
import android.content.Context;

public final class l8n implements tck
{
    public static final String z;
    public final Context v;
    public final JobScheduler w;
    public final k8n x;
    public final WorkDatabase y;
    
    static {
        z = krd.e("SystemJobScheduler");
    }
    
    public l8n(final Context v, final WorkDatabase y, final wn6 wn6) {
        final JobScheduler a = rpc.a(v);
        final k8n x = new k8n(v, wn6.d);
        this.v = v;
        this.w = a;
        this.x = x;
        this.y = y;
    }
    
    public static void a(final JobScheduler jobScheduler, final int n) {
        try {
            jobScheduler.cancel(n);
        }
        finally {
            final Throwable t;
            krd.c().b(l8n.z, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[] { n }), t);
        }
    }
    
    public static ArrayList b(final Context context, final JobScheduler jobScheduler) {
        final String a = rpc.a;
        List list = null;
        try {
            jobScheduler.getAllPendingJobs().getClass();
        }
        finally {
            final Throwable t;
            krd.c().b(rpc.a, "getAllPendingJobs() is not reliable on this device.", t);
            list = null;
        }
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList(list.size());
        final ComponentName componentName = new ComponentName(context, (Class)SystemJobService.class);
        for (final JobInfo jobInfo : list) {
            if (componentName.equals((Object)jobInfo.getService())) {
                list2.add((Object)jobInfo);
            }
        }
        return list2;
    }
    
    public static v4q f(final JobInfo jobInfo) {
        final PersistableBundle extras = jobInfo.getExtras();
        Label_0043: {
            if (extras == null) {
                break Label_0043;
            }
            try {
                if (((BaseBundle)extras).containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new v4q(((BaseBundle)extras).getString("EXTRA_WORK_SPEC_ID"), ((BaseBundle)extras).getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            }
            catch (final NullPointerException ex) {
                return null;
            }
        }
    }
    
    @Override
    public final boolean c() {
        return true;
    }
    
    @Override
    public final void d(final String s) {
        final Context v = this.v;
        final JobScheduler w = this.w;
        final ArrayList b = b(v, w);
        Object o;
        if (b == null) {
            o = null;
        }
        else {
            o = new ArrayList(2);
            for (final JobInfo jobInfo : b) {
                final v4q f = f(jobInfo);
                if (f != null && s.equals((Object)f.a)) {
                    ((ArrayList)o).add((Object)jobInfo.getId());
                }
            }
        }
        if (o != null && !((List)o).isEmpty()) {
            final Iterator iterator2 = ((List)o).iterator();
            while (iterator2.hasNext()) {
                a(w, (int)iterator2.next());
            }
            xp7.L(this.y.r().a, false, true, (lta)new uhm(s, (byte)5));
        }
    }
    
    @Override
    public final void e(final v5q... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        l8n.y:Landroidx/work/impl/WorkDatabase;
        //     4: astore          6
        //     6: new             Lv2b;
        //     9: dup            
        //    10: aload           6
        //    12: bipush          20
        //    14: invokespecial   v2b.<init>:(Ljava/lang/Object;B)V
        //    17: astore          7
        //    19: aload_1        
        //    20: arraylength    
        //    21: istore          4
        //    23: iconst_0       
        //    24: istore_2       
        //    25: iload_2        
        //    26: iload           4
        //    28: if_icmpge       434
        //    31: aload_1        
        //    32: iload_2        
        //    33: aaload         
        //    34: astore          8
        //    36: aload           6
        //    38: invokevirtual   androidx/work/impl/WorkDatabase.b:()V
        //    41: aload           6
        //    43: invokevirtual   androidx/work/impl/WorkDatabase.v:()Lz5q;
        //    46: astore          10
        //    48: aload           8
        //    50: getfield        v5q.a:Ljava/lang/String;
        //    53: astore          9
        //    55: aload           10
        //    57: aload           9
        //    59: invokevirtual   z5q.d:(Ljava/lang/String;)Lv5q;
        //    62: astore          11
        //    64: getstatic       l8n.z:Ljava/lang/String;
        //    67: astore          10
        //    69: aload           11
        //    71: ifnonnull       142
        //    74: invokestatic    krd.c:()Lkrd;
        //    77: astore          11
        //    79: new             Ljava/lang/StringBuilder;
        //    82: astore          8
        //    84: aload           8
        //    86: invokespecial   java/lang/StringBuilder.<init>:()V
        //    89: aload           8
        //    91: ldc             "Skipping scheduling "
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: pop            
        //    97: aload           8
        //    99: aload           9
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: pop            
        //   105: aload           8
        //   107: ldc             " because it's no longer in the DB"
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: pop            
        //   113: aload           11
        //   115: aload           10
        //   117: aload           8
        //   119: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   122: invokevirtual   krd.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   125: aload           6
        //   127: invokevirtual   androidx/work/impl/WorkDatabase.q:()V
        //   130: aload           6
        //   132: invokevirtual   androidx/work/impl/WorkDatabase.m:()V
        //   135: goto            421
        //   138: astore_1       
        //   139: goto            427
        //   142: aload           11
        //   144: getfield        v5q.b:Lx4q;
        //   147: getstatic       x4q.v:Lx4q;
        //   150: if_acmpeq       213
        //   153: invokestatic    krd.c:()Lkrd;
        //   156: astore          8
        //   158: new             Ljava/lang/StringBuilder;
        //   161: astore          11
        //   163: aload           11
        //   165: invokespecial   java/lang/StringBuilder.<init>:()V
        //   168: aload           11
        //   170: ldc             "Skipping scheduling "
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: pop            
        //   176: aload           11
        //   178: aload           9
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: pop            
        //   184: aload           11
        //   186: ldc_w           " because it is no longer enqueued"
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   192: pop            
        //   193: aload           8
        //   195: aload           10
        //   197: aload           11
        //   199: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   202: invokevirtual   krd.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   205: aload           6
        //   207: invokevirtual   androidx/work/impl/WorkDatabase.q:()V
        //   210: goto            130
        //   213: aload           8
        //   215: invokestatic    ao2.K:(Lv5q;)Lv4q;
        //   218: astore          9
        //   220: aload           9
        //   222: getfield        v4q.b:I
        //   225: istore          5
        //   227: aload           9
        //   229: getfield        v4q.a:Ljava/lang/String;
        //   232: astore          9
        //   234: aload           6
        //   236: invokevirtual   androidx/work/impl/WorkDatabase.r:()Le8n;
        //   239: getfield        e8n.a:Landroidx/work/impl/WorkDatabase;
        //   242: astore          11
        //   244: new             Ld8n;
        //   247: astore          10
        //   249: aload           10
        //   251: aload           9
        //   253: iload           5
        //   255: invokespecial   d8n.<init>:(Ljava/lang/String;I)V
        //   258: aload           11
        //   260: iconst_1       
        //   261: iconst_0       
        //   262: aload           10
        //   264: invokestatic    xp7.L:(Landroidx/work/impl/WorkDatabase;ZZLlta;)Ljava/lang/Object;
        //   267: checkcast       Lc8n;
        //   270: astore          10
        //   272: aload           10
        //   274: ifnull          286
        //   277: aload           10
        //   279: getfield        c8n.c:I
        //   282: istore_3       
        //   283: goto            347
        //   286: aload           7
        //   288: getfield        v2b.w:Ljava/lang/Object;
        //   291: checkcast       Landroidx/work/impl/WorkDatabase;
        //   294: astore          12
        //   296: new             Lu48;
        //   299: astore          13
        //   301: aload           13
        //   303: aload           7
        //   305: iconst_1       
        //   306: invokespecial   u48.<init>:(Ljava/lang/Object;B)V
        //   309: new             Llce;
        //   312: astore          11
        //   314: aload           11
        //   316: aload           13
        //   318: bipush          20
        //   320: invokespecial   lce.<init>:(Ljava/lang/Object;B)V
        //   323: aload           12
        //   325: aload           11
        //   327: invokevirtual   androidx/work/impl/WorkDatabase.p:(Ljta;)Ljava/lang/Object;
        //   330: astore          11
        //   332: aload           11
        //   334: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   337: pop            
        //   338: aload           11
        //   340: checkcast       Ljava/lang/Number;
        //   343: invokevirtual   java/lang/Number.intValue:()I
        //   346: istore_3       
        //   347: aload           10
        //   349: ifnonnull       406
        //   352: new             Lc8n;
        //   355: astore          10
        //   357: aload           10
        //   359: aload           9
        //   361: iload           5
        //   363: iload_3        
        //   364: invokespecial   c8n.<init>:(Ljava/lang/String;II)V
        //   367: aload           6
        //   369: invokevirtual   androidx/work/impl/WorkDatabase.r:()Le8n;
        //   372: astore          12
        //   374: aload           12
        //   376: getfield        e8n.a:Landroidx/work/impl/WorkDatabase;
        //   379: astore          11
        //   381: new             Ltyl;
        //   384: astore          9
        //   386: aload           9
        //   388: aload           12
        //   390: aload           10
        //   392: iconst_4       
        //   393: invokespecial   tyl.<init>:(Ljava/lang/Object;Ljava/lang/Object;B)V
        //   396: aload           11
        //   398: iconst_0       
        //   399: iconst_1       
        //   400: aload           9
        //   402: invokestatic    xp7.L:(Landroidx/work/impl/WorkDatabase;ZZLlta;)Ljava/lang/Object;
        //   405: pop            
        //   406: aload_0        
        //   407: aload           8
        //   409: iload_3        
        //   410: invokevirtual   l8n.g:(Lv5q;I)V
        //   413: aload           6
        //   415: invokevirtual   androidx/work/impl/WorkDatabase.q:()V
        //   418: goto            130
        //   421: iinc            2, 1
        //   424: goto            25
        //   427: aload           6
        //   429: invokevirtual   androidx/work/impl/WorkDatabase.m:()V
        //   432: aload_1        
        //   433: athrow         
        //   434: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  41     64     138    142    Any
        //  74     130    138    142    Any
        //  142    210    138    142    Any
        //  213    272    138    142    Any
        //  277    283    138    142    Any
        //  286    347    138    142    Any
        //  352    406    138    142    Any
        //  406    418    138    142    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to invoke virtual method 'g5.m0 g5.d2.L()' on a null object reference
        //     at e5.d0.e(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:26)
        //     at e5.c0.s(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:1643)
        //     at q5.g.o(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2651)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2099)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
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
    
    public final void g(v5q v5q, int n) {
        final String z = l8n.z;
        final fv6 j = v5q.j;
        final PersistableBundle extras = new PersistableBundle();
        final String a = v5q.a;
        ((BaseBundle)extras).putString("EXTRA_WORK_SPEC_ID", a);
        ((BaseBundle)extras).putInt("EXTRA_WORK_SPEC_GENERATION", v5q.t);
        ((BaseBundle)extras).putBoolean("EXTRA_IS_PERIODIC", v5q.c());
        final JobInfo$Builder jobInfo$Builder = new JobInfo$Builder(n, this.x.a);
        final boolean c = j.c;
        final Set i = j.i;
        final JobInfo$Builder setRequiresCharging = jobInfo$Builder.setRequiresCharging(c);
        final boolean d = j.d;
        final JobInfo$Builder setExtras = setRequiresCharging.setRequiresDeviceIdle(d).setExtras(extras);
        final NetworkRequest a2 = j.a();
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n2 = 0;
        if (sdk_INT >= 28 && a2 != null) {
            cbr.w(setExtras, a2);
        }
        else {
            final int a3 = j.a;
            if (sdk_INT >= 30 && a3 == 6) {
                k4.j(setExtras, new NetworkRequest$Builder().addCapability(25).build());
            }
            else {
                final int d2 = ge9.D(a3);
                int requiredNetworkType = 0;
                Label_0304: {
                    if (d2 != 0) {
                        if (d2 != 1) {
                            if (d2 == 2) {
                                requiredNetworkType = 2;
                                break Label_0304;
                            }
                            requiredNetworkType = 3;
                            if (d2 == 3) {
                                break Label_0304;
                            }
                            requiredNetworkType = 4;
                            if (d2 == 4) {
                                break Label_0304;
                            }
                            final krd c2 = krd.c();
                            switch (a3) {
                                default: {
                                    throw null;
                                }
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6: {
                                    c2.getClass();
                                    break;
                                }
                            }
                        }
                        requiredNetworkType = 1;
                    }
                    else {
                        requiredNetworkType = 0;
                    }
                }
                setExtras.setRequiredNetworkType(requiredNetworkType);
            }
        }
        if (!d) {
            int n3;
            if (v5q.l == 2) {
                n3 = 0;
            }
            else {
                n3 = 1;
            }
            setExtras.setBackoffCriteria(v5q.m, n3);
        }
        final long max = Math.max(v5q.a() - System.currentTimeMillis(), 0L);
        if (sdk_INT <= 28) {
            setExtras.setMinimumLatency(max);
        }
        else if (max > 0L) {
            setExtras.setMinimumLatency(max);
        }
        else if (!v5q.q) {
            k4.i(setExtras);
        }
        if (!((Collection)i).isEmpty()) {
            for (final ev6 ev6 : i) {
                setExtras.addTriggerContentUri(new JobInfo$TriggerContentUri(ev6.a(), (int)(ev6.b() ? 1 : 0)));
            }
            setExtras.setTriggerContentUpdateDelay(j.g);
            setExtras.setTriggerContentMaxDelay(j.h);
        }
        setExtras.setPersisted(false);
        setExtras.setRequiresBatteryNotLow(j.e);
        setExtras.setRequiresStorageNotLow(j.f);
        final boolean b = v5q.k > 0;
        final boolean b2 = max > 0L;
        final int sdk_INT2 = Build$VERSION.SDK_INT;
        if (sdk_INT2 >= 31 && v5q.q && !b && !b2) {
            j50.e(setExtras);
        }
        if (sdk_INT2 >= 35) {
            final String x = v5q.x;
            if (x != null) {
                k08.d(setExtras, x);
            }
        }
        final JobInfo build = setExtras.build();
        krd.c().getClass();
        while (true) {
            try {
                if (this.w.schedule(build) != 0) {
                    return;
                }
                final krd c3 = krd.c();
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to schedule work ID ");
                sb.append(a);
                c3.f(z, sb.toString());
                if (v5q.q && v5q.r == 1) {
                    v5q.q = false;
                    krd.c().getClass();
                    this.g(v5q, n);
                }
            }
            catch (final IllegalStateException ex) {
                v5q = (v5q)rpc.a;
                final int sdk_INT3 = Build$VERSION.SDK_INT;
                if (sdk_INT3 >= 31) {
                    n = 150;
                }
                else {
                    n = 100;
                }
                final int size = ((List)xp7.L(this.y.v().a, true, false, (lta)new dop((byte)10))).size();
                final Context v = this.v;
                v5q = (v5q)"<faulty JobScheduler failed to getPendingJobs>";
                if (sdk_INT3 >= 34) {
                    final JobScheduler a4 = rpc.a(v);
                    List list = null;
                    try {
                        a4.getAllPendingJobs().getClass();
                    }
                    finally {
                        final Throwable t;
                        krd.c().b(rpc.a, "getAllPendingJobs() is not reliable on this device.", t);
                        list = null;
                    }
                    if (list != null) {
                        v5q = (v5q)b(v, a4);
                        int n4;
                        if (v5q != null) {
                            n4 = list.size() - ((ArrayList)v5q).size();
                        }
                        else {
                            n4 = 0;
                        }
                        if (n4 == 0) {
                            v5q = null;
                        }
                        else {
                            v5q = (v5q)oz1.k(n4, " of which are not owned by WorkManager");
                        }
                        final Object systemService = v.getSystemService("jobscheduler");
                        systemService.getClass();
                        final ArrayList b3 = b(v, (JobScheduler)systemService);
                        int size2 = n2;
                        if (b3 != null) {
                            size2 = b3.size();
                        }
                        String k;
                        if (size2 == 0) {
                            k = null;
                        }
                        else {
                            k = oz1.k(size2, " from WorkManager in the default namespace");
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(list.size());
                        sb2.append(" jobs in \"androidx.work.systemjobscheduler\" namespace");
                        v5q = (v5q)c86.N0((Iterable)iw0.W0((Object[])new String[] { sb2.toString(), (String)v5q, k }), (CharSequence)",\n", (String)null, (String)null, (lta)null, 62);
                    }
                }
                else {
                    final ArrayList b4 = b(v, rpc.a(v));
                    if (b4 != null) {
                        v5q = (v5q)new StringBuilder();
                        ((StringBuilder)v5q).append(b4.size());
                        ((StringBuilder)v5q).append(" jobs from WorkManager");
                        v5q = (v5q)((StringBuilder)v5q).toString();
                    }
                }
                v5q = (v5q)smk.q(size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.", lmf.w(n, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", (String)v5q, ".\nThere are "));
                krd.c().a(z, (String)v5q);
                fvd.o((String)v5q, (Throwable)ex);
                return;
                final krd c4 = krd.c();
                final StringBuilder sb3 = new StringBuilder("Unable to schedule ");
                sb3.append((Object)v5q);
                final Throwable t2;
                c4.b(z, sb3.toString(), t2);
            }
            finally {
                continue;
            }
            break;
        }
    }
}
