import android.app.ApplicationExitInfo;
import java.util.Iterator;
import java.util.ArrayList;
import android.app.job.JobScheduler;
import android.util.Log;
import android.app.ActivityManager;
import androidx.work.impl.WorkDatabase;
import android.app.job.JobInfo;
import java.util.HashSet;
import java.util.List;
import android.app.PendingIntent;
import android.content.ComponentName;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import android.content.Intent;
import android.os.Build$VERSION;
import android.app.AlarmManager;
import android.content.Context;

public final class spa implements Runnable
{
    public static final long A;
    public static final String z;
    public final Context v;
    public final a5q w;
    public final j9j x;
    public int y;
    
    static {
        z = krd.e("ForceStopRunnable");
        A = 315360000000L;
    }
    
    public spa(final Context context, final a5q w) {
        this.v = context.getApplicationContext();
        this.w = w;
        this.x = w.g;
        this.y = 0;
    }
    
    public static void b(final Context context) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n;
        if (Build$VERSION.SDK_INT >= 31) {
            n = 167772160;
        }
        else {
            n = 134217728;
        }
        final Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class)ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        final PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, n);
        final long currentTimeMillis = System.currentTimeMillis();
        final long a = spa.A;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis + a, broadcast);
        }
    }
    
    public final void a() {
        final j9j x = this.x;
        final a5q w = this.w;
        final wn6 b = w.b;
        final j9j g = w.g;
        final WorkDatabase c = w.c;
        final String z = l8n.z;
        final Context v = this.v;
        final JobScheduler a = rpc.a(v);
        final ArrayList b2 = l8n.b(v, a);
        final List list = (List)xp7.L(c.r().a, true, false, (lta)new cyl((byte)25));
        int size;
        if (b2 != null) {
            size = b2.size();
        }
        else {
            size = 0;
        }
        final HashSet set = new HashSet(size);
        if (b2 != null && !b2.isEmpty()) {
            for (final JobInfo jobInfo : b2) {
                final v4q f = l8n.f(jobInfo);
                if (f != null) {
                    set.add((Object)f.a);
                }
                else {
                    l8n.a(a, jobInfo.getId());
                }
            }
        }
        Object iterator2 = list.iterator();
        while (true) {
            while (((Iterator)iterator2).hasNext()) {
                if (!set.contains((Object)((Iterator)iterator2).next())) {
                    krd.c().getClass();
                    final boolean b3 = true;
                    Label_0327: {
                        if (b3) {
                            c.b();
                            Label_0319: {
                                try {
                                    final z5q v2 = c.v();
                                    final Iterator iterator3 = list.iterator();
                                    while (iterator3.hasNext()) {
                                        v2.f(-1L, (String)iterator3.next());
                                    }
                                }
                                finally {
                                    break Label_0319;
                                }
                                c.q();
                                c.m();
                                break Label_0327;
                            }
                            c.m();
                        }
                    }
                    final z5q v3 = c.v();
                    final n5q u = c.u();
                    c.b();
                    Label_1014: {
                        boolean b4 = false;
                        Label_0406: {
                            try {
                                final WorkDatabase a2 = v3.a;
                                iterator2 = new i6p((byte)28);
                                iterator2 = xp7.L(a2, true, false, (lta)iterator2);
                                if (iterator2 != null && !((List)iterator2).isEmpty()) {
                                    b4 = true;
                                    break Label_0406;
                                }
                            }
                            finally {
                                break Label_1014;
                            }
                            b4 = false;
                        }
                        if (b4) {
                            for (final v5q v5q : iterator2) {
                                final x4q v4 = x4q.v;
                                final String a3 = v5q.a;
                                v3.g(v4, a3);
                                v3.h(-512, a3);
                                v3.f(-1L, a3);
                            }
                        }
                        xp7.L(u.a, false, true, (lta)new i6p((byte)24));
                        c.q();
                        c.m();
                        final boolean b5 = b4 || b3;
                        final Long a4 = ((WorkDatabase)g.w).o().a("reschedule_needed");
                        long longValue = 0L;
                        if (a4 != null && a4 == 1L) {
                            krd.c().getClass();
                            w.h();
                            g.getClass();
                            final ejh ejh = new ejh("reschedule_needed", 0L);
                            final fjh o = ((WorkDatabase)g.w).o();
                            xp7.L(o.a, false, true, (lta)new tt8((Object)o, (Object)ejh, (byte)23));
                            return;
                        }
                        final j9j j9j;
                        Label_0929: {
                            Label_0907: {
                                Label_0883: {
                                    PendingIntent broadcast = null;
                                    Label_0870: {
                                        try {
                                            final int sdk_INT = Build$VERSION.SDK_INT;
                                            int n;
                                            if (sdk_INT >= 31) {
                                                n = 570425344;
                                            }
                                            else {
                                                n = 536870912;
                                            }
                                            final Intent intent = new Intent();
                                            intent.setComponent(new ComponentName(v, (Class)ForceStopRunnable$BroadcastReceiver.class));
                                            intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                                            broadcast = PendingIntent.getBroadcast(v, -1, intent, n);
                                            if (sdk_INT < 30) {
                                                break Label_0870;
                                            }
                                            if (broadcast != null) {
                                                broadcast.cancel();
                                            }
                                        }
                                        catch (final IllegalArgumentException ex) {
                                            break Label_0907;
                                        }
                                        catch (final SecurityException ex) {
                                            break Label_0907;
                                        }
                                        final List q = p4.q((ActivityManager)v.getSystemService("activity"));
                                        if (q != null && !q.isEmpty()) {
                                            final Long a5 = ((WorkDatabase)j9j.w).o().a("last_force_stop_ms");
                                            if (a5 != null) {
                                                longValue = a5;
                                            }
                                            for (int i = 0; i < q.size(); ++i) {
                                                final ApplicationExitInfo g2 = p4.g(q.get(i));
                                                if (p4.c(g2) == 10 && p4.e(g2) >= longValue) {
                                                    break Label_0929;
                                                }
                                            }
                                        }
                                        break Label_0883;
                                    }
                                    if (broadcast == null) {
                                        b(v);
                                        break Label_0929;
                                    }
                                }
                                if (b5) {
                                    krd.c().getClass();
                                    wck.b(b, c, w.e);
                                }
                                return;
                            }
                            if (krd.c().a <= 5) {
                                final IllegalArgumentException ex;
                                Log.w(spa.z, "Ignoring exception", (Throwable)ex);
                            }
                        }
                        krd.c().getClass();
                        w.h();
                        final y7j d = b.d;
                        final long currentTimeMillis = System.currentTimeMillis();
                        j9j.getClass();
                        final ejh ejh2 = new ejh("last_force_stop_ms", currentTimeMillis);
                        final fjh o2 = ((WorkDatabase)j9j.w).o();
                        xp7.L(o2.a, false, true, (lta)new tt8((Object)o2, (Object)ejh2, (byte)23));
                        return;
                    }
                    c.m();
                }
            }
            final boolean b3 = false;
            continue;
        }
    }
    
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          9
        //     5: aload_0        
        //     6: getfield        spa.w:La5q;
        //     9: astore          7
        //    11: aload           7
        //    13: getfield        a5q.b:Lwn6;
        //    16: astore          8
        //    18: aload           8
        //    20: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    23: pop            
        //    24: aconst_null    
        //    25: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    28: istore_2       
        //    29: aload_0        
        //    30: getfield        spa.v:Landroid/content/Context;
        //    33: astore          6
        //    35: iload_2        
        //    36: ifeq            51
        //    39: invokestatic    krd.c:()Lkrd;
        //    42: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    45: pop            
        //    46: iconst_1       
        //    47: istore_2       
        //    48: goto            64
        //    51: aload           6
        //    53: invokestatic    sqh.a:(Landroid/content/Context;)Z
        //    56: istore_2       
        //    57: invokestatic    krd.c:()Lkrd;
        //    60: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    63: pop            
        //    64: iload_2        
        //    65: ifne            74
        //    68: aload           7
        //    70: invokevirtual   a5q.g:()V
        //    73: return         
        //    74: aload           6
        //    76: invokestatic    yi2.G:(Landroid/content/Context;)V
        //    79: invokestatic    krd.c:()Lkrd;
        //    82: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    85: pop            
        //    86: aload_0        
        //    87: invokevirtual   spa.a:()V
        //    90: aload           7
        //    92: invokevirtual   a5q.g:()V
        //    95: return         
        //    96: astore          5
        //    98: goto            274
        //   101: astore          5
        //   103: goto            138
        //   106: astore          5
        //   108: goto            138
        //   111: astore          5
        //   113: goto            138
        //   116: astore          5
        //   118: goto            138
        //   121: astore          5
        //   123: goto            138
        //   126: astore          5
        //   128: goto            138
        //   131: astore          5
        //   133: goto            138
        //   136: astore          5
        //   138: aload_0        
        //   139: getfield        spa.y:I
        //   142: iconst_1       
        //   143: iadd           
        //   144: istore_1       
        //   145: aload_0        
        //   146: iload_1        
        //   147: putfield        spa.y:I
        //   150: iload_1        
        //   151: iconst_3       
        //   152: if_icmplt       211
        //   155: aload           6
        //   157: invokestatic    eqi.e0:(Landroid/content/Context;)Z
        //   160: ifeq            171
        //   163: ldc_w           "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
        //   166: astore          6
        //   168: goto            176
        //   171: ldc_w           "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"
        //   174: astore          6
        //   176: invokestatic    krd.c:()Lkrd;
        //   179: aload           9
        //   181: aload           6
        //   183: aload           5
        //   185: invokevirtual   krd.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   188: new             Ljava/lang/IllegalStateException;
        //   191: astore          9
        //   193: aload           9
        //   195: aload           6
        //   197: aload           5
        //   199: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   202: aload           8
        //   204: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   207: pop            
        //   208: aload           9
        //   210: athrow         
        //   211: invokestatic    krd.c:()Lkrd;
        //   214: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   217: pop            
        //   218: aload_0        
        //   219: getfield        spa.y:I
        //   222: istore_1       
        //   223: iload_1        
        //   224: i2l            
        //   225: lstore_3       
        //   226: lload_3        
        //   227: ldc2_w          300
        //   230: lmul           
        //   231: invokestatic    java/lang/Thread.sleep:(J)V
        //   234: goto            74
        //   237: astore          5
        //   239: invokestatic    krd.c:()Lkrd;
        //   242: aload           9
        //   244: ldc_w           "Unexpected SQLite exception during migrations"
        //   247: invokevirtual   krd.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   250: new             Ljava/lang/IllegalStateException;
        //   253: astore          6
        //   255: aload           6
        //   257: ldc_w           "Unexpected SQLite exception during migrations"
        //   260: aload           5
        //   262: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   265: aload           8
        //   267: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   270: pop            
        //   271: aload           6
        //   273: athrow         
        //   274: aload           7
        //   276: invokevirtual   a5q.g:()V
        //   279: aload           5
        //   281: athrow         
        //   282: astore          5
        //   284: goto            74
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  18     29     96     101    Any
        //  39     46     96     101    Any
        //  51     64     96     101    Any
        //  74     79     237    274    Landroid/database/sqlite/SQLiteException;
        //  74     79     96     101    Any
        //  79     86     96     101    Any
        //  86     90     136    138    Landroid/database/sqlite/SQLiteAccessPermException;
        //  86     90     131    136    Landroid/database/sqlite/SQLiteCantOpenDatabaseException;
        //  86     90     126    131    Landroid/database/sqlite/SQLiteConstraintException;
        //  86     90     121    126    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  86     90     116    121    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  86     90     111    116    Landroid/database/sqlite/SQLiteDiskIOException;
        //  86     90     106    111    Landroid/database/sqlite/SQLiteFullException;
        //  86     90     101    106    Landroid/database/sqlite/SQLiteTableLockedException;
        //  86     90     96     101    Any
        //  138    150    96     101    Any
        //  155    163    96     101    Any
        //  176    211    96     101    Any
        //  211    223    96     101    Any
        //  226    234    282    287    Ljava/lang/InterruptedException;
        //  226    234    96     101    Any
        //  239    274    96     101    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
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
}
