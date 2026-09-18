import java.lang.reflect.AccessibleObject;
import java.lang.ref.Reference;
import android.os.BaseBundle;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import android.content.ClipboardManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.TreeMap;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayDeque;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.lang.ref.WeakReference;
import com.anthropic.claude.core.di.engine.core.CycleException;
import java.util.List;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import java.util.Collections;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import java.util.ArrayList;
import java.util.TimeZone;
import java.lang.ref.SoftReference;
import kotlinx.serialization.KSerializer;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.privacyconsents.UpsertConsentRequest;
import com.anthropic.claude.api.privacyconsents.ConsentDecision;
import java.io.IOException;
import android.util.Log;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Locale;
import android.content.ContextWrapper;
import android.database.SQLException;
import java.lang.reflect.Modifier;
import android.view.View;
import android.graphics.Bitmap$Config;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import android.os.Build$VERSION;
import java.util.concurrent.atomic.AtomicLong;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class jmq implements c55, yy8, m03, mdo, xzk, csg, bz6, w97, u7k, uad
{
    public static volatile jmq y;
    public static final Object z;
    public final byte v;
    public Object w;
    public Object x;
    
    static {
        z = new Object();
    }
    
    public jmq(final byte v) {
        switch (this.v = v) {
            default: {
                this.w = new Object();
                this.x = new pv0();
                return;
            }
            case 14: {
                this.w = new AtomicInteger(0);
                this.x = new AtomicBoolean(false);
                return;
            }
            case 4: {}
        }
    }
    
    public jmq(final a0 w, final float n) {
        this.v = 26;
        final je8 x = new je8(n, (byte)0);
        this.w = w;
        this.x = x;
    }
    
    public jmq(final Context w, final byte v) {
        switch (this.v = v) {
            default: {
                this.x = new AtomicLong(-1L);
                this.w = new o3b(w, gfq.l, (wh0)new jen("module:cronet_dynamite"), n3b.c);
                return;
            }
            case 2: {
                this.w = w;
            }
        }
    }
    
    public jmq(final ei8 w) {
        this.v = 18;
        this.w = w;
        this.x = new hdk((byte)12);
    }
    
    public jmq(final String x, final lq6 w, final p3 p3) {
        this.v = 5;
        this.x = x;
        this.w = w;
    }
    
    public jmq(final String x, final rjc w) {
        this.v = 21;
        this.w = w;
        this.x = x;
    }
    
    public jmq(final jmq jmq) {
        this.v = 10;
        final sd3[] array = new sd3[16];
        int i = 0;
        this.w = new inf(0, (Object[])array);
        this.x = new inf(0, (Object[])new sd3[16]);
        if (jmq != null) {
            final inf inf = (inf)jmq.w;
            if (inf != null) {
                final Object[] v = inf.v;
                while (i < inf.x) {
                    final sd3 sd3 = (sd3)v[i];
                    ((inf)this.w).b((Object)new sd3(sd3.e(), sd3.d(), sd3.c(), sd3.b(), sd3.a()));
                    ++i;
                }
            }
        }
    }
    
    public jmq(final lta w) {
        this.v = 12;
        this.w = w;
        this.x = new xs4();
    }
    
    public jmq(final oti w) {
        this.v = 3;
        this.w = w;
        Object x;
        if (jcb.a) {
            x = new xs8(false);
        }
        else {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT != 26 && sdk_INT != 27) {
                x = new xs8(true);
            }
            else {
                x = new q78('\0');
            }
        }
        this.x = x;
    }
    
    public jmq(final tv7 w) {
        this.v = 24;
        this.w = w;
        this.x = new ConcurrentHashMap();
    }
    
    public jmq(final vad w) {
        this.v = 28;
        this.w = w;
        this.x = new HashMap();
    }
    
    public jmq(final zta w) {
        this.v = 13;
        this.w = w;
        this.x = new xs4();
    }
    
    public static boolean A(final i3c i3c, final Bitmap$Config bitmap$Config) {
        if (blq.l(bitmap$Config)) {
            if (l3c.a(i3c)) {
                final icn w = i3c.w();
                if (!(w instanceof gxa)) {
                    return true;
                }
                final View view = ((gxa)w).getView();
                if (!view.isAttachedToWindow() || view.isHardwareAccelerated()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static jmq j(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: aload_1        
        //     5: aload_0        
        //     6: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //     9: ldc             "generatefid.lock"
        //    11: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    14: new             Ljava/io/RandomAccessFile;
        //    17: astore_0       
        //    18: aload_0        
        //    19: aload_1        
        //    20: ldc             "rw"
        //    22: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    25: aload_0        
        //    26: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //    29: astore_2       
        //    30: aload_2        
        //    31: invokevirtual   java/nio/channels/FileChannel.lock:()Ljava/nio/channels/FileLock;
        //    34: astore_1       
        //    35: new             Ljmq;
        //    38: dup            
        //    39: aload_2        
        //    40: aload_1        
        //    41: bipush          19
        //    43: invokespecial   jmq.<init>:(Ljava/lang/Object;Ljava/lang/Object;B)V
        //    46: astore_0       
        //    47: aload_0        
        //    48: areturn        
        //    49: astore_0       
        //    50: goto            91
        //    53: astore_0       
        //    54: goto            91
        //    57: astore_0       
        //    58: goto            91
        //    61: astore_0       
        //    62: aconst_null    
        //    63: astore_1       
        //    64: goto            91
        //    67: astore_0       
        //    68: goto            62
        //    71: astore_0       
        //    72: goto            62
        //    75: astore_0       
        //    76: aconst_null    
        //    77: astore_2       
        //    78: aconst_null    
        //    79: astore_1       
        //    80: goto            91
        //    83: astore_0       
        //    84: goto            76
        //    87: astore_0       
        //    88: goto            76
        //    91: ldc             "CrossProcessLock"
        //    93: ldc             "encountered error while creating and acquiring the lock, ignoring"
        //    95: aload_0        
        //    96: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    99: pop            
        //   100: aload_1        
        //   101: ifnull          108
        //   104: aload_1        
        //   105: invokevirtual   java/nio/channels/FileLock.release:()V
        //   108: aload_2        
        //   109: ifnull          116
        //   112: aload_2        
        //   113: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   116: aconst_null    
        //   117: areturn        
        //   118: astore_0       
        //   119: goto            108
        //   122: astore_0       
        //   123: goto            116
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                            
        //  -----  -----  -----  -----  ------------------------------------------------
        //  0      30     87     91     Ljava/io/IOException;
        //  0      30     83     87     Ljava/lang/Error;
        //  0      30     75     76     Ljava/nio/channels/OverlappingFileLockException;
        //  30     35     71     75     Ljava/io/IOException;
        //  30     35     67     71     Ljava/lang/Error;
        //  30     35     61     62     Ljava/nio/channels/OverlappingFileLockException;
        //  35     47     57     61     Ljava/io/IOException;
        //  35     47     53     57     Ljava/lang/Error;
        //  35     47     49     53     Ljava/nio/channels/OverlappingFileLockException;
        //  104    108    118    122    Ljava/io/IOException;
        //  112    116    122    126    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0116:
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
    
    public static String o(final Class clazz) {
        final int modifiers = clazz.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(clazz.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            final StringBuilder sb = new StringBuilder("Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: ");
            sb.append(clazz.getName());
            sb.append("\nSee ");
            sb.append(c6r.e("r8-abstract-class"));
            return sb.toString();
        }
        return null;
    }
    
    public static void p(final SQLException ex) {
        final String message = ((Throwable)ex).getMessage();
        if (message == null) {
            throw ex;
        }
        if (!kym.I0((CharSequence)message, (CharSequence)"unique", true) && !kym.I0((CharSequence)message, (CharSequence)"2067", false) && !kym.I0((CharSequence)message, (CharSequence)"1555", false)) {
            throw ex;
        }
    }
    
    public static vad u(final i3c i3c) {
        final icn w = i3c.w();
        Context context;
        if (w instanceof gxa) {
            context = ((gxa)w).getView().getContext();
        }
        else {
            context = i3c.c();
        }
        while (!(context instanceof gbd)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
        return ((gbd)context).d();
    }
    
    public static String v(final String s, final String s2, final Object... array) {
        final String replace = s2.replace((CharSequence)"{}", (CharSequence)"%s");
        final Locale us = Locale.US;
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(": ");
        sb.append(replace);
        return String.format(us, sb.toString(), array);
    }
    
    public pfg B(final i3c i3c, final xzl xzl) {
        final Context c = i3c.c();
        final z9k u = i3c.u();
        final int t = i3c.t();
        final xca l = i3c.l();
        final int q = i3c.q();
        final int h = i3c.h();
        final int r = i3c.r();
        Bitmap$Config bitmap$Config = l3c.e(i3c);
        final boolean c2 = l3c.c(i3c);
        final boolean empty = k3c.d(i3c).isEmpty();
        boolean b = true;
        final boolean b2 = empty || iw0.G0((Object[])k5p.d(), (Object)l3c.e(i3c));
        final boolean b3 = !blq.l(l3c.e(i3c)) || (A(i3c, l3c.e(i3c)) && ((icb)this.x).a(xzl));
        if (!b2 || !b3) {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        if (!c2 || !k3c.d(i3c).isEmpty() || bitmap$Config == Bitmap$Config.ALPHA_8) {
            b = false;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap((Map)y5e.e0(i3c.f().n.a, i3c.i().a));
        if (bitmap$Config != l3c.e(i3c)) {
            final o3a d = l3c.d();
            if (bitmap$Config != null) {
                ((Map)linkedHashMap).put((Object)d, (Object)bitmap$Config);
            }
            else {
                ((Map)linkedHashMap).remove((Object)d);
            }
        }
        if (b != l3c.c(i3c)) {
            ((Map)linkedHashMap).put((Object)l3c.b(), (Object)b);
        }
        return new pfg(c, xzl, u, t, (String)null, l, q, h, r, new p3a(qt7.S((Map)linkedHashMap)));
    }
    
    public void C(float n, final long n2) {
        n = ncq.n(n, 0.0f, 1.0f);
        final Object w;
        monitorenter(w = this.w);
        Label_0108: {
            try {
                ((pv0)this.x).addLast((Object)new h10(n, n2));
                while (!((pv0)this.x).isEmpty() && ((h10)((pv0)this.x).first()).a() < n2 - 5000L) {
                    ((pv0)this.x).removeFirst();
                }
            }
            finally {
                break Label_0108;
            }
            monitorexit(w);
            return;
        }
        monitorexit(w);
    }
    
    public void D() {
        try {
            ((FileLock)this.x).release();
            ((AbstractInterruptibleChannel)this.w).close();
        }
        catch (final IOException ex) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", (Throwable)ex);
        }
    }
    
    public void E(int n, int n2, int n3, final boolean b) {
        if (n == n2 && n3 == 0) {
            return;
        }
        final int min = Math.min(n, n2);
        final int max = Math.max(n, n2);
        n3 -= max - min;
        n2 = 0;
        sd3 sd3 = null;
        n = 0;
        while (true) {
            final inf inf = (inf)this.w;
            if (n >= inf.x) {
                break;
            }
            final sd3 sd4 = (sd3)inf.v[n];
            final int d = sd4.d();
            final boolean b2 = true;
            if (min > d || d > max) {
                final int c = sd4.c();
                if (min > c || c > max) {
                    final int d2 = sd4.d();
                    if (min > sd4.c() || d2 > min) {
                        final int d3 = sd4.d();
                        if (max > sd4.c() || d3 > max) {
                            if (sd4.d() > max && n2 == 0) {
                                this.l(sd3, min, max, n3, b);
                                n2 = 1;
                            }
                            if (n2 != 0) {
                                sd4.j(sd4.d() + n3);
                                sd4.i(sd4.c() + n3);
                            }
                            ((inf)this.x).b((Object)sd4);
                            ++n;
                            continue;
                        }
                    }
                }
            }
            if (sd3 == null) {
                sd3 = sd4;
            }
            else {
                sd3.i(sd4.c());
                sd3.g(sd4.a());
                boolean b3 = b2;
                if (!sd3.e()) {
                    b3 = (sd4.e() && b2);
                }
                sd3.f(b3);
            }
            ++n;
        }
        if (n2 == 0) {
            this.l(sd3, min, max, n3, b);
        }
        final inf x = (inf)this.w;
        this.w = this.x;
        ((inf)(this.x = x)).h();
    }
    
    public void F() {
        synchronized (this) {
            ((AtomicInteger)this.w).decrementAndGet();
            if (((AtomicInteger)this.w).get() >= 0) {
                return;
            }
            throw new IllegalStateException("Unbalanced call to unblock() detected.");
        }
    }
    
    public pfg G(final pfg pfg) {
        p3a c = pfg.c();
        boolean b;
        if (blq.l(l3c.f(pfg)) && !((icb)this.x).g()) {
            c.getClass();
            final LinkedHashMap linkedHashMap = new LinkedHashMap(c.a);
            final o3a d = l3c.d();
            final Bitmap$Config argb_8888 = Bitmap$Config.ARGB_8888;
            if (argb_8888 != null) {
                ((Map)linkedHashMap).put((Object)d, (Object)argb_8888);
            }
            else {
                ((Map)linkedHashMap).remove((Object)d);
            }
            c = new p3a(qt7.S((Map)linkedHashMap));
            b = true;
        }
        else {
            b = false;
        }
        if (b) {
            return pfg.a(pfg, c);
        }
        return pfg;
    }
    
    public Object H(t2k t2k, Iterable iterable, h07 o) {
        Label_0056: {
            if (o instanceof md9) {
                final md9 md9 = (md9)o;
                final int a = md9.A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    md9.A = a + Integer.MIN_VALUE;
                    o = md9;
                    break Label_0056;
                }
            }
            o = new md9(this, (h07)o);
        }
        Object y = ((md9)o).y;
        final int a2 = ((md9)o).A;
        final lqo a3 = lqo.a;
        final pc7 v = pc7.v;
        while (true) {
            Label_0293: {
                Object x = null;
                Label_0235: {
                    if (a2 != 0) {
                        if (a2 != 1) {
                            if (a2 == 2) {
                                iterable = (Iterable)((md9)o).w;
                                t2k = ((md9)o).v;
                                vt4.g0(y);
                                break Label_0293;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        else {
                            x = ((md9)o).x;
                            iterable = (Iterable)((md9)o).w;
                            t2k = ((md9)o).v;
                            try {
                                vt4.g0(y);
                                break Label_0235;
                            }
                            catch (final SQLException y) {
                                break Label_0235;
                            }
                        }
                    }
                    vt4.g0(y);
                    if (iterable == null) {
                        return a3;
                    }
                    iterable = (Iterable)iterable.iterator();
                    if (!((Iterator)iterable).hasNext()) {
                        return a3;
                    }
                    x = ((Iterator)iterable).next();
                    try {
                        y = this.w;
                        ((md9)o).v = t2k;
                        ((md9)o).w = (Iterator)iterable;
                        ((md9)o).x = x;
                        ((md9)o).A = 1;
                        ((qt7)y).E(t2k, x);
                        if (a3 == v) {
                            return v;
                        }
                        continue;
                    }
                    catch (final SQLException ex) {}
                }
                p((SQLException)y);
                y = this.x;
                ((md9)o).v = t2k;
                ((md9)o).w = (Iterator)iterable;
                ((md9)o).x = null;
                ((md9)o).A = 2;
                ((lq6)y).R(t2k, x);
                if (a3 != v) {
                    break Label_0293;
                }
                return v;
            }
            continue;
        }
    }
    
    public Object I(final t2k v, final Object w, h07 o) {
        Label_0056: {
            if (o instanceof ld9) {
                final ld9 ld9 = (ld9)o;
                final int z = ld9.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ld9.z = z + Integer.MIN_VALUE;
                    o = ld9;
                    break Label_0056;
                }
            }
            o = new ld9(this, (h07)o);
        }
        final Object x = ((ld9)o).x;
        final int z2 = ((ld9)o).z;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        Label_0135: {
            if (z2 != 0) {
                if (z2 != 1) {
                    if (z2 == 2) {
                        vt4.g0(x);
                        return a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    final Object w2 = ((ld9)o).w;
                    final t2k v3 = ((ld9)o).v;
                    Label_0212: {
                        try {
                            vt4.g0(x);
                            return a;
                        }
                        catch (final SQLException ex) {
                            break Label_0212;
                        }
                        break Label_0135;
                    }
                    final SQLException ex;
                    p(ex);
                    final lq6 lq6 = (lq6)this.x;
                    ((ld9)o).v = null;
                    ((ld9)o).w = null;
                    ((ld9)o).z = 2;
                    lq6.R(v3, w2);
                    if (a == v2) {
                        return v2;
                    }
                    return a;
                }
            }
        }
        vt4.g0(x);
        final qt7 qt7 = (qt7)this.w;
        ((ld9)o).v = v;
        ((ld9)o).w = w;
        ((ld9)o).z = 1;
        qt7.E(v, w);
        if (a != v2) {
            return a;
        }
        return v2;
    }
    
    public Object J(final String s, ConsentDecision v, final h07 h07) {
        Object o = null;
        Label_0056: {
            if (h07 instanceof vj6) {
                final vj6 vj6 = (vj6)h07;
                final int y = vj6.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    vj6.y = y + Integer.MIN_VALUE;
                    o = vj6;
                    break Label_0056;
                }
            }
            o = new vj6(this, h07);
        }
        final Object w = ((vj6)o).w;
        final int y2 = ((vj6)o).y;
        Object o2;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((vj6)o).v;
            vt4.g0(w);
            o2 = w;
        }
        else {
            vt4.g0(w);
            final aph aph = (aph)this.w;
            final UpsertConsentRequest upsertConsentRequest = new UpsertConsentRequest(v, "sensitive_memory_couldnt_save_notice");
            ((vj6)o).v = v;
            ((vj6)o).y = 1;
            final Object a = ((bph)aph).a(s, upsertConsentRequest, (h07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = a) == v2) {
                return v2;
            }
        }
        final ApiResult apiResult = (ApiResult)o2;
        if (apiResult instanceof qj0) {
            ((lta)this.x).b((Object)v);
        }
        return apiResult;
    }
    
    public cx7 a(final Set set) {
        final hy7 b = ((za7)this.w).B;
        final String t = ((za7)this.w).t;
        final String u = ((za7)this.w).u;
        final String y = ((za7)this.w).y;
        final String b2 = ((za7)this.w).p.b();
        final int g = ((za7)this.w).p.g();
        final String z = ((za7)this.w).z;
        final String w = ((za7)this.w).w;
        final String v = ((za7)this.w).v;
        final ljq l = ((za7)this.w).l;
        final long currentTimeMillis = System.currentTimeMillis();
        final long i = l.I();
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        final long nanos = milliseconds.toNanos(currentTimeMillis);
        final long nanos2 = milliseconds.toNanos(i);
        final long n = i - currentTimeMillis;
        final pvn pvn = new pvn(nanos, nanos2, milliseconds.toNanos(n), n);
        final gqh gqh = new gqh(((za7)this.w).x);
        final btf j = ((za7)this.w).j.I();
        final p70 q = ((za7)this.w).q;
        final String s = q.s();
        final String g2 = q.g();
        final jh8 f = q.F();
        final String x = q.x();
        final String t2 = q.t();
        final String v2 = q.v();
        final String a = q.A();
        final String k = q.l();
        final String m = q.m();
        final Integer d = q.d();
        final p70 q2 = ((za7)this.w).q;
        final bf8 bf8 = new bf8(s, g2, x, f, t2, v2, k, a, m, d, new ipd(q2.p(), q2.o(), q2.i()), q.f(), q.B(), q.w());
        final l2p i2 = ((za7)this.w).n.i();
        ((za7)this.w).o.getClass();
        final fdo m2 = ((za7)this.w).m.m();
        final String c = ((za7)this.w).C;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Iterator iterator = ((Iterable)set).iterator();
        final hy7 hy7 = b;
        final String s2 = c;
        while (iterator.hasNext()) {
            final String s3 = (String)iterator.next();
            final Map e = ((hx7)((re)this.x).w).E(s3);
            if (!e.isEmpty()) {
                ((Map)linkedHashMap).put((Object)s3, (Object)e);
            }
        }
        return new cx7(hy7, t, u, y, b2, g, z, v, w, pvn, gqh, j, bf8, i2, m2, s2, (Map)linkedHashMap);
    }
    
    public KSerializer b(final rtc rtc) {
        final Object e = ws4.e((xs4)this.x, qt7.z(rtc));
        e.getClass();
        final anf anf = (anf)e;
        final Object value = anf.a.get();
        Label_0110: {
            if (value != null) {
                final Object o = value;
                break Label_0110;
            }
            synchronized (anf) {
                final Object value2 = anf.a.get();
                Object o;
                if (value2 != null) {
                    monitorexit(anf);
                    o = value2;
                }
                else {
                    final ov2 ov2 = new ov2((KSerializer)((lta)this.w).b((Object)rtc));
                    anf.a = new SoftReference((Object)ov2);
                    monitorexit(anf);
                    o = ov2;
                }
                return ((ov2)o).a;
            }
        }
    }
    
    public sad c() {
        final int ordinal = ((Enum)((vad)this.w).b()).ordinal();
        if (ordinal == 0) {
            return sad.v;
        }
        if (ordinal == 1) {
            return sad.w;
        }
        if (ordinal == 2) {
            return sad.x;
        }
        if (ordinal == 3) {
            return sad.y;
        }
        if (ordinal == 4) {
            return sad.z;
        }
        en9.r();
        return null;
    }
    
    public boolean d(final Object o) {
        final float floatValue = this.z();
        if (floatValue < 100.0f) {
            if (floatValue > 0.0f) {
                final long v = ((foo)((a0)this.w).b(o)).v;
                long n = -1L;
                final double n2 = mlc.l0(-1L) * floatValue / 100.0;
                if (!Double.isNaN(n2) && n2 > 0.0) {
                    if (n2 < 1.8446744073709552E19) {
                        if (n2 < 9.223372036854776E18) {
                            n = (long)n2;
                        }
                        else {
                            n = (long)(n2 - 9.223372036854776E18) - Long.MIN_VALUE;
                        }
                    }
                }
                else {
                    n = 0L;
                }
                if (Long.compareUnsigned(v * 1111111111111111111L, n) < 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public void e(final oad oad) {
        final fbd fbd = (fbd)((HashMap)this.x).remove((Object)oad);
        if (fbd != null) {
            ((vad)this.w).d(fbd);
        }
    }
    
    public void f(final c03 c03, final rnj rnj) {
        final rj0 rj0 = (rj0)this.w;
        Object k0;
        try {
            k0 = mlc.k0(rnj, rj0.w, rj0.x);
        }
        catch (final Exception ex) {
            k0 = new oj0((Throwable)ex);
        }
        final zta y = rj0.y;
        final sej y2 = c03.Y();
        y2.getClass();
        y.d(k0, (Object)y2);
        ((m03)this.x).f((c03)rj0, rnj.a((ApiResult)k0));
    }
    
    public Object g(final Object o) {
        return ((jqc)((hdk)this.x).v).b(((unj)o).p(), (KSerializer)this.w);
    }
    
    public fdb get() {
        final zsi y = ((bui)this.x).y;
        if (!y.x) {
            final TimeZone a = icq.a;
            while (!y.I()) {
                y.skip(y.w.w);
            }
        }
        final fdb h = ((zs9)((xs9)this.w).e).h();
        if (h != null) {
            return h;
        }
        en9.q("null trailers after exhausting response body?!");
        return null;
    }
    
    public void h(final oad oad) {
        final HashMap hashMap = (HashMap)this.x;
        if (!hashMap.containsKey((Object)oad)) {
            final x70 x70 = new x70(oad, new jd0((Object)this, (Object)oad, (byte)27));
            hashMap.put((Object)oad, (Object)x70);
            ((vad)this.w).a((fbd)x70);
            return;
        }
        en9.q("Already subscribed");
    }
    
    public void i(final c03 c03, final Throwable t) {
        final oj0 oj0 = new oj0(t);
        final rj0 rj0 = (rj0)this.w;
        final zta y = rj0.y;
        final sej y2 = c03.Y();
        y2.getClass();
        y.d((Object)oj0, (Object)y2);
        ((m03)this.x).f((c03)rj0, rnj.a((ApiResult)oj0));
    }
    
    public Object k(final rtc rtc, final ArrayList list) {
        final Object e = ws4.e((xs4)this.x, qt7.z(rtc));
        e.getClass();
        final anf anf = (anf)e;
        Object o = anf.a.get();
        Label_0096: {
            if (o != null) {
                break Label_0096;
            }
            synchronized (anf) {
                o = anf.a.get();
                if (o != null) {
                    monitorexit(anf);
                }
                else {
                    o = new bsg();
                    anf.a = new SoftReference(o);
                    monitorexit(anf);
                }
                final bsg bsg = (bsg)o;
                final ArrayList list2 = new ArrayList(d86.p0((Iterable)list, 10));
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    list2.add((Object)new euc((buc)iterator.next()));
                }
                final ConcurrentHashMap a = bsg.a(bsg);
                Object value;
                if ((value = a.get((Object)list2)) == null) {
                    jpj jpj = null;
                    try {
                        final KSerializer kSerializer = (KSerializer)((zta)this.w).d((Object)rtc, (Object)list);
                    }
                    finally {
                        final Throwable t;
                        jpj = new jpj(t);
                    }
                    value = new kpj((Object)jpj);
                    final Object putIfAbsent = a.putIfAbsent((Object)list2, value);
                    if (putIfAbsent != null) {
                        value = putIfAbsent;
                    }
                }
                return ((kpj)value).v;
            }
        }
    }
    
    public void l(sd3 sd3, int a, final int n, final int n2, final boolean b) {
        final inf inf = (inf)this.x;
        final int x = inf.x;
        final boolean b2 = true;
        int n3;
        if (x == 0) {
            n3 = 0;
        }
        else {
            if (x == 0) {
                oyl.i("MutableVector is empty.");
                return;
            }
            final sd3 sd4 = (sd3)inf.v[x - 1];
            n3 = sd4.c() - sd4.a();
        }
        if (sd3 == null) {
            final int n4 = a - n3;
            sd3 = new sd3(b, a, n + n2, n4, n - a + n4);
        }
        else {
            boolean b3 = b2;
            if (!sd3.e()) {
                b3 = (b && b2);
            }
            sd3.f(b3);
            if (sd3.d() > a) {
                sd3.j(a);
                sd3.h(a);
            }
            if (n > sd3.c()) {
                final int c = sd3.c();
                a = sd3.a();
                sd3.i(n);
                sd3.g(n - (c - a));
            }
            sd3.i(sd3.c() + n2);
        }
        ((inf)this.x).b((Object)sd3);
    }
    
    public boolean m() {
        synchronized (this) {
            if (((AtomicBoolean)this.x).get()) {
                return false;
            }
            ((AtomicInteger)this.w).incrementAndGet();
            return true;
        }
    }
    
    public xy8 n(final aql a, long b, final qzc c, final xc8 xc8, final qpl qpl) {
        monitorenter(this);
        Label_0306: {
            Object o;
            try {
                va0 x;
                o = (x = (va0)this.x);
                if (o == null) {
                    x = new va0((aql)zn2.k, 0L, qzc.v, 1.0f, (qpl)null);
                    this.x = x;
                }
                x.a = a;
                x.b = b;
                x.c = c;
                x.d = xc8.getDensity();
                o = new qpl(qpl.a, qpl.b, 0L, qpl.e, qpl.f, (int)qpl.d);
                x.e = (qpl)o;
                if ((o = this.w) == null) {
                    o = new tmf();
                    this.w = o;
                }
                if ((o = ((tmf)o).g((Object)x)) == null) {
                    o = new xy8(qpl, a.a(b, c, xc8));
                    tmf w;
                    if ((w = (tmf)this.w) == null) {
                        w = new tmf();
                        this.w = w;
                    }
                    final aql a2 = x.a;
                    b = x.b;
                    w.m((Object)new va0(a2, b, x.c, x.d, x.e), o);
                }
            }
            finally {
                break Label_0306;
            }
            monitorexit(this);
            return (xy8)o;
        }
        monitorexit(this);
    }
    
    public void q() {
        ((inf)this.w).h();
    }
    
    public void r(final Object o, final String s) {
        ((re0)this.w).u(2, qjc.w, (jta)new qn1((Object)this, (Object)s, o, (byte)8), null, false, null);
    }
    
    public ArrayList s() {
        final ArrayList list = new ArrayList();
        final v2b v2b = (v2b)this.x;
        final Context context = (Context)this.w;
        final Class clazz = (Class)v2b.w;
        Object metaData = null;
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            }
            else {
                final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, clazz), 128);
                if (serviceInfo == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append((Object)clazz);
                    sb.append(" has no service info.");
                    Log.w("ComponentDiscovery", sb.toString());
                }
                else {
                    metaData = serviceInfo.metaData;
                }
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        List empty_LIST;
        if (metaData == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            empty_LIST = Collections.EMPTY_LIST;
        }
        else {
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = ((BaseBundle)metaData).keySet().iterator();
            while (true) {
                empty_LIST = (List)list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final String s = (String)iterator.next();
                if (!"com.google.firebase.components.ComponentRegistrar".equals(((BaseBundle)metaData).get(s)) || !s.startsWith("com.google.firebase.components:")) {
                    continue;
                }
                list2.add((Object)s.substring(31));
            }
        }
        final Iterator iterator2 = empty_LIST.iterator();
        while (iterator2.hasNext()) {
            list.add((Object)new me6((Object)iterator2.next(), (byte)0));
        }
        return list;
    }
    
    public void t(final odk odk, final wc2 wc2, final Throwable t) {
        final ThreadLocal threadLocal = (ThreadLocal)((hdk)this.x).v;
        if (t instanceof CycleException) {
            final CycleException ex = (CycleException)t;
            if (ex.b() != wc2) {
                return;
            }
            if (ex.a() != odk) {
                return;
            }
        }
        else {
            final WeakReference weakReference = (WeakReference)threadLocal.get();
            Object value;
            if (weakReference != null) {
                value = ((Reference)weakReference).get();
            }
            else {
                value = null;
            }
            if (value == t) {
                return;
            }
        }
        threadLocal.set((Object)new WeakReference((Object)t));
        try {
            ((ei8)this.w).h((Object)odk, (Object)wc2, (Object)t);
        }
        finally {}
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 17: {
                return this.w.toString();
            }
            case 10: {
                final StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                final inf inf = (inf)this.w;
                final Object[] v = inf.v;
                for (int x = inf.x, i = 0; i < x; ++i) {
                    final sd3 sd3 = (sd3)v[i];
                    sb.append(rua.h(sd3.d(), sd3.c(), ",", ")", hia.o(sd3.b(), sd3.a(), "(", ",", ")->(")));
                    if (i < ((inf)this.w).x - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            }
        }
    }
    
    public f4g w(final rmo rmo, final boolean b) {
        final Type b2 = rmo.b;
        final Class a = rmo.a;
        final HashMap hashMap = (HashMap)this.w;
        ge9.C(hashMap.get((Object)b2));
        ge9.C(hashMap.get((Object)a));
        final boolean assignable = EnumSet.class.isAssignableFrom(a);
        final f4g f4g = null;
        Object o;
        if (assignable) {
            o = new qv6(b2, (byte)0);
        }
        else if (a == EnumMap.class) {
            o = new qv6(b2, (byte)1);
        }
        else {
            o = null;
        }
        if (o != null) {
            return (f4g)o;
        }
        ao2.N((ArrayList)this.x);
        Label_0124: {
            if (!Modifier.isAbstract(a.getModifiers())) {
                break Label_0124;
            }
            while (true) {
                Object o2 = null;
                Label_0233: {
                    break Label_0233;
                    try {
                        final Constructor declaredConstructor = a.getDeclaredConstructor((Class<?>[])null);
                        final vt4 a2 = z4j.a;
                        String string;
                        try {
                            ((AccessibleObject)declaredConstructor).setAccessible(true);
                            string = null;
                        }
                        catch (final Exception ex) {
                            final StringBuilder sb = new StringBuilder("Failed making constructor '");
                            sb.append(z4j.b(declaredConstructor));
                            sb.append("' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
                            sb.append(((Throwable)ex).getMessage());
                            sb.append(z4j.e(ex));
                            string = sb.toString();
                        }
                        if (string != null) {
                            o2 = new nv6(string);
                        }
                        else {
                            o2 = new re((Object)declaredConstructor, (byte)1);
                        }
                        if (o2 != null) {
                            return (f4g)o2;
                        }
                        Object o3 = null;
                        Label_0523: {
                            if (Collection.class.isAssignableFrom(a)) {
                                if (a.isAssignableFrom(ArrayList.class)) {
                                    o3 = new my8((byte)27);
                                }
                                else if (a.isAssignableFrom(LinkedHashSet.class)) {
                                    o3 = new my8((byte)28);
                                }
                                else if (a.isAssignableFrom(TreeSet.class)) {
                                    o3 = new my8((byte)29);
                                }
                                else {
                                    o3 = f4g;
                                    if (a.isAssignableFrom(ArrayDeque.class)) {
                                        o3 = new pv6((byte)0);
                                    }
                                }
                            }
                            else {
                                o3 = f4g;
                                if (Map.class.isAssignableFrom(a)) {
                                    Label_0428: {
                                        if (a.isAssignableFrom(lgd.class)) {
                                            if (b2 instanceof ParameterizedType) {
                                                final Type[] actualTypeArguments = ((ParameterizedType)b2).getActualTypeArguments();
                                                if (actualTypeArguments.length == 0) {
                                                    break Label_0428;
                                                }
                                                if (xiq.y(actualTypeArguments[0]) != String.class) {
                                                    break Label_0428;
                                                }
                                            }
                                            o3 = new my8((byte)22);
                                            break Label_0523;
                                        }
                                    }
                                    if (a.isAssignableFrom(LinkedHashMap.class)) {
                                        o3 = new my8((byte)23);
                                    }
                                    else if (a.isAssignableFrom(TreeMap.class)) {
                                        o3 = new my8((byte)24);
                                    }
                                    else if (a.isAssignableFrom(ConcurrentHashMap.class)) {
                                        o3 = new my8((byte)25);
                                    }
                                    else {
                                        o3 = f4g;
                                        if (a.isAssignableFrom(ConcurrentSkipListMap.class)) {
                                            o3 = new my8((byte)26);
                                        }
                                    }
                                }
                            }
                        }
                        if (o3 != null) {
                            return (f4g)o3;
                        }
                        final String o4 = o(a);
                        if (o4 != null) {
                            return (f4g)new ov6(o4, (byte)0);
                        }
                        if (!b) {
                            final StringBuilder sb2 = new StringBuilder("Unable to create instance of ");
                            sb2.append((Object)a);
                            sb2.append("; Register an InstanceCreator or a TypeAdapter for this type.");
                            return (f4g)new ov6(sb2.toString(), (byte)1);
                        }
                        return (f4g)new dv0((Object)a, (byte)9);
                    }
                    catch (final NoSuchMethodException ex2) {
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public ClipboardManager x() {
        ClipboardManager x;
        if ((x = (ClipboardManager)this.x) == null) {
            final Object systemService = ((Context)this.w).getSystemService("clipboard");
            systemService.getClass();
            x = (ClipboardManager)systemService;
            this.x = x;
        }
        return x;
    }
    
    public long y() {
        final sd3 sd3 = (sd3)((inf)this.w).v[0];
        return rhc.c(sd3.d(), sd3.c());
    }
    
    public Float z() {
        final float floatValue = ((Number)Float.valueOf(((je8)this.x).x)).floatValue();
        float n = 0.0f;
        final qjc v = qjc.v;
        if (floatValue < 0.0f) {
            rjc.j.getClass();
            c5q.E((rjc)pjc.b, 4, v, (jta)new le8(floatValue, (byte)0), (Throwable)null, false, 56);
        }
        else {
            final float n2 = 100.0f;
            n = floatValue;
            if (floatValue > 100.0f) {
                rjc.j.getClass();
                c5q.E((rjc)pjc.b, 4, v, (jta)new le8(floatValue, (byte)1), (Throwable)null, false, 56);
                n = n2;
            }
        }
        return n;
    }
}
