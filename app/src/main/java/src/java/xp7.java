import java.util.concurrent.CancellationException;
import androidx.compose.ui.node.LayoutNode;
import com.anthropic.claude.login.SSOIntentData;
import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.api.recents.RecentsRow$Session;
import com.anthropic.claude.types.strings.CodeArtifactId;
import com.anthropic.claude.networking.cookies.serializer.SerializableCookie;
import com.anthropic.claude.api.recents.RecentsRow$Artifact;
import java.util.Collection;
import java.util.List;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import com.anthropic.claude.connector.auth.b;
import kotlinx.serialization.json.JsonObject;
import java.io.Closeable;
import java.io.InputStream;
import android.content.Intent;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import android.os.Bundle;
import android.content.Context;

public abstract class xp7 implements iap
{
    public static final Object a;
    public static Context b;
    public static Bundle c;
    public static final f3 d;
    public static final jvp e;
    public static final jvp f;
    public static final jvp g;
    public static final jvp h;
    public static final float[] i;
    public static final KSerializer[] j;
    public static final jkn k;
    public static long l = -1L;
    public static final int m = 9;
    public static final int n = 6;
    public static final int o = 10;
    public static final int p = 5;
    public static final int q = 15;
    public static final int r = 48;
    
    public static ic A(final zrc zrc) {
        Label_0714: {
            Label_0705: {
                Label_0696: {
                    long f = 0L;
                    hb y = null;
                    String i = null;
                    Label_0063: {
                        try {
                            f = zrc.o("date").f();
                            y = o50.y(zrc.o("application").e());
                            final irc o = zrc.o("service");
                            if (o != null) {
                                i = o.i();
                                break Label_0063;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0696;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0705;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0714;
                        }
                        i = null;
                    }
                    final irc o2 = zrc.o("version");
                    String j;
                    if (o2 != null) {
                        j = o2.i();
                    }
                    else {
                        j = null;
                    }
                    final irc o3 = zrc.o("build_version");
                    String k;
                    if (o3 != null) {
                        k = o3.i();
                    }
                    else {
                        k = null;
                    }
                    final irc o4 = zrc.o("build_id");
                    String l;
                    if (o4 != null) {
                        l = o4.i();
                    }
                    else {
                        l = null;
                    }
                    final irc o5 = zrc.o("ddtags");
                    String m;
                    if (o5 != null) {
                        m = o5.i();
                    }
                    else {
                        m = null;
                    }
                    final fb z = ncq.z(zrc.o("session").e());
                    final irc o6 = zrc.o("source");
                    int n = 0;
                    int n3 = 0;
                    gb e = null;
                    gc l2 = null;
                    Label_0321: {
                        Label_0264: {
                            if (o6 == null) {
                                break Label_0264;
                            }
                            final String i2 = o6.i();
                            if (i2 == null) {
                                break Label_0264;
                            }
                            final int[] f2 = ge9.F(11);
                            try {
                                while (true) {
                                    while (n < f2.length) {
                                        final int n2 = f2[n];
                                        if (ge9.e(n2).equals(i2)) {
                                            n3 = n2;
                                            e = ljq.E(zrc.o("view").e());
                                            final irc o7 = zrc.o("usr");
                                            if (o7 != null) {
                                                l2 = lq6.L(o7.e());
                                                break Label_0321;
                                            }
                                            break Label_0264;
                                        }
                                        else {
                                            ++n;
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    n3 = 0;
                                    continue;
                                }
                            }
                            catch (final NullPointerException ex) {
                                break Label_0696;
                            }
                            catch (final NumberFormatException ex2) {
                                break Label_0705;
                            }
                            catch (final IllegalStateException ex3) {
                                break Label_0714;
                            }
                        }
                        l2 = null;
                    }
                    final irc o8 = zrc.o("account");
                    bb h;
                    if (o8 != null) {
                        h = t4r.h(o8.e());
                    }
                    else {
                        h = null;
                    }
                    final irc o9 = zrc.o("connectivity");
                    lb m2;
                    if (o9 != null) {
                        m2 = ri2.M(o9.e());
                    }
                    else {
                        m2 = null;
                    }
                    final irc o10 = zrc.o("display");
                    vb h2;
                    if (o10 != null) {
                        h2 = z5r.h(o10.e());
                    }
                    else {
                        h2 = null;
                    }
                    final irc o11 = zrc.o("synthetics");
                    ec h3;
                    if (o11 != null) {
                        h3 = g6r.h(o11.e());
                    }
                    else {
                        h3 = null;
                    }
                    final irc o12 = zrc.o("ci_test");
                    jb n4;
                    if (o12 != null) {
                        n4 = j5r.n(o12.e());
                    }
                    else {
                        n4 = null;
                    }
                    final irc o13 = zrc.o("os");
                    ac d;
                    if (o13 != null) {
                        d = vt4.D(o13.e());
                    }
                    else {
                        d = null;
                    }
                    final irc o14 = zrc.o("device");
                    ub h4;
                    if (o14 != null) {
                        h4 = ao2.H(o14.e());
                    }
                    else {
                        h4 = null;
                    }
                    final qb t = rml.t(zrc.o("_dd").e());
                    final irc o15 = zrc.o("context");
                    ob u;
                    if (o15 != null) {
                        u = yi2.u(o15.e());
                    }
                    else {
                        u = null;
                    }
                    final irc o16 = zrc.o("container");
                    mb f3;
                    if (o16 != null) {
                        f3 = p5r.f(o16.e());
                    }
                    else {
                        f3 = null;
                    }
                    final String i3 = zrc.o("type").i();
                    final cb g = uoo.G(zrc.o("action").e());
                    if (mlc.q(i3, "action")) {
                        return new ic(f, y, i, j, k, l, m, z, n3, e, l2, h, m2, h2, h3, n4, d, h4, t, u, f3, g);
                    }
                    throw new IllegalStateException("Check failed.");
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ActionEvent", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ActionEvent", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ActionEvent", (Throwable)ex3);
        return null;
    }
    
    public static imj B(final zrc zrc) {
        Label_0914: {
            Label_0905: {
                Label_0896: {
                    String i = null;
                    Label_0039: {
                        try {
                            final irc o = zrc.o("id");
                            if (o != null) {
                                i = o.i();
                                break Label_0039;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0896;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0905;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0914;
                        }
                        i = null;
                    }
                    final String j = zrc.o("type").i();
                    j.getClass();
                    final int[] f = ge9.F(11);
                    final int length = f.length;
                    final int n = 0;
                    for (final int n2 : f) {
                        if (lmf.l(n2).equals(j)) {
                            final irc o2 = zrc.o("method");
                            int n5 = 0;
                            Label_0183: {
                                if (o2 != null) {
                                    final String l = o2.i();
                                    if (l != null) {
                                        for (final int n4 : ge9.F(9)) {
                                            if (lmf.h(n4).equals(l)) {
                                                n5 = n4;
                                                break Label_0183;
                                            }
                                        }
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                }
                                n5 = 0;
                            }
                            final String m = zrc.o("url").i();
                            final irc o3 = zrc.o("status_code");
                            Long value;
                            if (o3 != null) {
                                value = o3.f();
                            }
                            else {
                                value = null;
                            }
                            final irc o4 = zrc.o("duration");
                            Long value2;
                            if (o4 != null) {
                                value2 = o4.f();
                            }
                            else {
                                value2 = null;
                            }
                            final irc o5 = zrc.o("size");
                            Long value3;
                            if (o5 != null) {
                                value3 = o5.f();
                            }
                            else {
                                value3 = null;
                            }
                            final irc o6 = zrc.o("encoded_body_size");
                            Long value4;
                            if (o6 != null) {
                                value4 = o6.f();
                            }
                            else {
                                value4 = null;
                            }
                            final irc o7 = zrc.o("decoded_body_size");
                            Long value5;
                            if (o7 != null) {
                                value5 = o7.f();
                            }
                            else {
                                value5 = null;
                            }
                            final irc o8 = zrc.o("transfer_size");
                            Long value6;
                            if (o8 != null) {
                                value6 = o8.f();
                            }
                            else {
                                value6 = null;
                            }
                            final irc o9 = zrc.o("render_blocking_status");
                            int f3 = 0;
                            Label_0412: {
                                if (o9 != null) {
                                    final String i2 = o9.i();
                                    if (i2 != null) {
                                        f3 = qbr.f(i2);
                                        break Label_0412;
                                    }
                                }
                                f3 = 0;
                            }
                            final irc o10 = zrc.o("worker");
                            qmj o11;
                            if (o10 != null) {
                                o11 = acr.o(o10.e());
                            }
                            else {
                                o11 = null;
                            }
                            fmj l2 = null;
                            Label_0487: {
                                try {
                                    final irc o12 = zrc.o("redirect");
                                    if (o12 != null) {
                                        l2 = pbr.l(o12.e());
                                        break Label_0487;
                                    }
                                }
                                catch (final NullPointerException ex) {
                                    break Label_0896;
                                }
                                catch (final NumberFormatException ex2) {
                                    break Label_0905;
                                }
                                catch (final IllegalStateException ex3) {
                                    break Label_0914;
                                }
                                l2 = null;
                            }
                            final irc o13 = zrc.o("dns");
                            slj c;
                            if (o13 != null) {
                                c = bbr.c(o13.e());
                            }
                            else {
                                c = null;
                            }
                            final irc o14 = zrc.o("connect");
                            jlj f4;
                            if (o14 != null) {
                                f4 = tar.f(o14.e());
                            }
                            else {
                                f4 = null;
                            }
                            final irc o15 = zrc.o("ssl");
                            mmj j2;
                            if (o15 != null) {
                                j2 = ubr.j(o15.e());
                            }
                            else {
                                j2 = null;
                            }
                            final irc o16 = zrc.o("first_byte");
                            vlj e;
                            if (o16 != null) {
                                e = gbr.e(o16.e());
                            }
                            else {
                                e = null;
                            }
                            final irc o17 = zrc.o("download");
                            tlj f5;
                            if (o17 != null) {
                                f5 = cbr.f(o17.e());
                            }
                            else {
                                f5 = null;
                            }
                            final irc o18 = zrc.o("protocol");
                            String i3;
                            if (o18 != null) {
                                i3 = o18.i();
                            }
                            else {
                                i3 = null;
                            }
                            final irc o19 = zrc.o("delivery_type");
                            int n6 = n;
                            if (o19 != null) {
                                final String i4 = o19.i();
                                n6 = n;
                                if (i4 != null) {
                                    n6 = war.n(i4);
                                }
                            }
                            final irc o20 = zrc.o("provider");
                            emj h;
                            if (o20 != null) {
                                h = obr.h(o20.e());
                            }
                            else {
                                h = null;
                            }
                            final irc o21 = zrc.o("request");
                            gmj h2;
                            if (o21 != null) {
                                h2 = rbr.h(o21.e());
                            }
                            else {
                                h2 = null;
                            }
                            final irc o22 = zrc.o("response");
                            lmj g;
                            if (o22 != null) {
                                g = tbr.g(o22.e());
                            }
                            else {
                                g = null;
                            }
                            final irc o23 = zrc.o("graphql");
                            wlj f6;
                            if (o23 != null) {
                                f6 = hbr.f(o23.e());
                            }
                            else {
                                f6 = null;
                            }
                            m.getClass();
                            return new imj(i, n2, n5, m, value, value2, value3, value4, value5, value6, f3, o11, l2, c, f4, j2, e, f5, i3, n6, h, h2, g, f6);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Resource", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Resource", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Resource", (Throwable)ex3);
        return null;
    }
    
    public static final int C(final b3k b3k, final String s) {
        final int u = ri2.u(b3k, s);
        if (u >= 0) {
            return u;
        }
        final int columnCount = b3k.getColumnCount();
        final ArrayList list = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; ++i) {
            list.add((Object)b3k.getColumnName(i));
        }
        final String n0 = c86.N0((Iterable)list, (CharSequence)null, (String)null, (String)null, (lta)null, 63);
        final StringBuilder sb = new StringBuilder("Column '");
        sb.append(s);
        sb.append("' does not exist. Available columns: [");
        sb.append(n0);
        sb.append(']');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final hc7 E(final WorkDatabase workDatabase, final boolean b, final h07 h07) {
        final ydo ydo = (ydo)h07.getContext().M0((gc7)ydo.w);
        Object o;
        if (ydo != null) {
            o = ydo.v;
        }
        else {
            o = null;
        }
        if (workDatabase.k()) {
            if (o != null) {
                final fz6 a = workDatabase.a;
                if (a != null) {
                    return a.v.F0((hc7)o);
                }
                mlc.j0("coroutineScope");
                throw null;
            }
            else if (b) {
                final hc7 b2 = workDatabase.b;
                if (b2 != null) {
                    return b2;
                }
                mlc.j0("transactionContext");
                throw null;
            }
            else {
                final fz6 a2 = workDatabase.a;
                if (a2 != null) {
                    return a2.v;
                }
                mlc.j0("coroutineScope");
                throw null;
            }
        }
        else {
            final fz6 a3 = workDatabase.a;
            if (a3 != null) {
                final hc7 v = a3.v;
                if (o == null) {
                    o = o89.v;
                }
                return v.F0((hc7)o);
            }
            mlc.j0("coroutineScope");
            throw null;
        }
    }
    
    public static Bundle H(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //     4: astore_2       
        //     5: getstatic       xp7.a:Ljava/lang/Object;
        //     8: astore_1       
        //     9: aload_1        
        //    10: dup            
        //    11: astore          4
        //    13: monitorenter   
        //    14: aload_2        
        //    15: getstatic       xp7.b:Landroid/content/Context;
        //    18: if_acmpeq       119
        //    21: ldc_w           "CronetManifest#getMetaData fetching info"
        //    24: invokestatic    xzg.n:(Ljava/lang/String;)V
        //    27: aload_2        
        //    28: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    31: astore_0       
        //    32: new             Landroid/content/ComponentName;
        //    35: astore_3       
        //    36: aload_3        
        //    37: aload_2        
        //    38: ldc_w           "android.net.http.MetaDataHolder"
        //    41: invokespecial   android/content/ComponentName.<init>:(Landroid/content/Context;Ljava/lang/String;)V
        //    44: aload_0        
        //    45: aload_3        
        //    46: ldc_w           787072
        //    49: invokevirtual   android/content/pm/PackageManager.getServiceInfo:(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
        //    52: astore_0       
        //    53: goto            63
        //    56: astore_0       
        //    57: goto            105
        //    60: astore_0       
        //    61: aconst_null    
        //    62: astore_0       
        //    63: aload_0        
        //    64: ifnull          79
        //    67: aload_0        
        //    68: getfield        android/content/pm/ServiceInfo.metaData:Landroid/os/Bundle;
        //    71: astore_0       
        //    72: aload_0        
        //    73: ifnull          79
        //    76: goto            87
        //    79: new             Landroid/os/Bundle;
        //    82: dup            
        //    83: invokespecial   android/os/Bundle.<init>:()V
        //    86: astore_0       
        //    87: aload_0        
        //    88: putstatic       xp7.c:Landroid/os/Bundle;
        //    91: aload_2        
        //    92: putstatic       xp7.b:Landroid/content/Context;
        //    95: invokestatic    android/os/Trace.endSection:()V
        //    98: goto            119
        //   101: astore_0       
        //   102: goto            128
        //   105: invokestatic    android/os/Trace.endSection:()V
        //   108: goto            117
        //   111: astore_2       
        //   112: aload_0        
        //   113: aload_2        
        //   114: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   117: aload_0        
        //   118: athrow         
        //   119: getstatic       xp7.c:Landroid/os/Bundle;
        //   122: astore_0       
        //   123: aload           4
        //   125: monitorexit    
        //   126: aload_0        
        //   127: areturn        
        //   128: aload           4
        //   130: monitorexit    
        //   131: aload_0        
        //   132: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  14     27     101    133    Any
        //  27     53     60     63     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  27     53     60     63     Ljava/lang/NullPointerException;
        //  27     53     56     119    Any
        //  67     72     56     119    Any
        //  79     87     56     119    Any
        //  87     95     56     119    Any
        //  95     98     101    133    Any
        //  105    108    111    117    Any
        //  112    117    101    133    Any
        //  117    119    101    133    Any
        //  119    126    101    133    Any
        //  128    131    101    133    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 68 out of bounds for length 68
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.util.Objects.checkIndex(Objects.java:371)
        //     at java.util.ArrayList.get(ArrayList.java:435)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:714)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
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
    
    public static final int I(final SerialDescriptor serialDescriptor, final SerialDescriptor[] array) {
        final int hashCode = serialDescriptor.a().hashCode();
        final int hashCode2 = Arrays.hashCode((Object[])array);
        int f = serialDescriptor.f();
        int n = 1;
        while (true) {
            final int n2 = 0;
            if (f <= 0) {
                break;
            }
            final String a = serialDescriptor.j(serialDescriptor.f() - f).a();
            int hashCode3 = n2;
            if (a != null) {
                hashCode3 = a.hashCode();
            }
            n = n * 31 + hashCode3;
            --f;
        }
        int i = serialDescriptor.f();
        int n3 = 1;
        while (i > 0) {
            final o50 b = serialDescriptor.j(serialDescriptor.f() - i).b();
            int hashCode4;
            if (b != null) {
                hashCode4 = b.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            n3 = n3 * 31 + hashCode4;
            --i;
        }
        return ((hashCode * 31 + hashCode2) * 31 + n) * 31 + n3;
    }
    
    public static final boolean J(final Intent intent) {
        return (intent.getFlags() & 0x100000) != 0x0;
    }
    
    public static pud K(Context context) {
        final pud i = pud.i;
        if (i != null) {
            return i;
        }
        final Object j = pud.j;
        synchronized (j) {
            final int k = pud.k;
            monitorexit(j);
            context = (Context)context.getResources().openRawResource(2131689492);
            try {
                context.getClass();
                final byte[] t = r6k.T((InputStream)context);
                ((Closeable)context).close();
                if (t.length < 14) {
                    en9.s("login_overview_frames: truncated");
                    return null;
                }
                final Object o = new Object();
                int x = x(t, (z3j)o);
                final int x2 = x(t, (z3j)o);
                final int x3 = x(t, (z3j)o);
                final int x4 = x(t, (z3j)o);
                final int x5 = x(t, (z3j)o);
                int x6 = x(t, (z3j)o);
                final int x7 = x(t, (z3j)o);
                if (t.length != x7 * 8 + (x6 * 3 + (x5 * 2 + (x4 * 2 + 14)))) {
                    en9.s("login_overview_frames: unexpected length");
                    return null;
                }
                final int[] array = new int[x4 + 1];
                if (1 <= x4) {
                    int n = 1;
                    while (true) {
                        array[n] = x(t, (z3j)o) + array[n - 1];
                        if (n == x4) {
                            break;
                        }
                        ++n;
                    }
                }
                final int[] array2 = new int[x5];
                for (int l = 0; l < x5; ++l) {
                    array2[l] = x(t, (z3j)o);
                }
                final int v = ((z3j)o).v;
                context = (Context)(Object)iw0.Q0(t, v, v + x6);
                ((z3j)o).v += x6;
                final int[] array3 = new int[x6 + 1];
                if (1 <= x6) {
                    int n2 = 1;
                    while (true) {
                        array3[n2] = x(t, (z3j)o) + array3[n2 - 1];
                        if (n2 == x6) {
                            break;
                        }
                        ++n2;
                    }
                }
                int v2 = ((z3j)o).v;
                final int n3 = x7 * 4 + v2;
                final int n4 = x2 / x3;
                final short[] array4 = new short[x7 * 6];
                int n7;
                int n9;
                int n11;
                for (int n5 = 0; n5 < x6; x6 = n11, v2 = n9, n5 = n7) {
                    final int n6 = array3[n5];
                    n7 = n5 + 1;
                    final int n8 = array3[n7];
                    n9 = v2;
                    int n10 = x;
                    Context context2 = context;
                    n11 = x6;
                    if (n6 != n8) {
                        int n12 = v(v2, x7, 0, n6, t);
                        int n13 = v(v2, x7, 1, n6, t);
                        int n14 = n6;
                        int n15 = 0;
                        int n16 = 0;
                        while (true) {
                            n9 = v2;
                            n10 = x;
                            context2 = context;
                            n11 = x6;
                            if (n14 >= n8) {
                                break;
                            }
                            n16 += n12;
                            n15 += n13;
                            int n17 = n12;
                            if (n14 == n6) {
                                n17 = 0;
                            }
                            int n18 = n13;
                            if (n14 == n6) {
                                n18 = 0;
                            }
                            final int n19 = n14 + 1;
                            if (n19 == n8) {
                                n12 = 0;
                            }
                            else {
                                n12 = v(v2, x7, 0, n19, t);
                            }
                            if (n19 == n8) {
                                n13 = 0;
                            }
                            else {
                                n13 = v(v2, x7, 1, n19, t);
                            }
                            final int n20 = n14 * 6;
                            array4[n20] = (short)n16;
                            array4[n20 + 1] = (short)n15;
                            array4[n20 + 2] = (short)(w(n3, n4, n14, 2, t) + (n12 / 3 + n16));
                            array4[n20 + 3] = (short)(w(n3, n4, n14, 3, t) + (n13 / 3 + n15));
                            array4[n20 + 4] = (short)(w(n3, n4, n14, 4, t) + (n16 - n17 / 3));
                            array4[n20 + 5] = (short)(w(n3, n4, n14, 5, t) + (n15 - n18 / 3));
                            n14 = n19;
                        }
                    }
                    context = context2;
                    x = n10;
                }
                final pud m = new pud(x4, x, array, array2, (byte[])(Object)context, array3, array4, (float)x2);
                context = (Context)pud.j;
                final Context context3;
                monitorenter(context3 = context);
                Label_0794: {
                    try {
                        if (pud.k == k) {
                            pud.i = m;
                        }
                    }
                    finally {
                        break Label_0794;
                    }
                    return;
                }
                monitorexit(context3);
            }
            finally {
                try {}
                finally {
                    final Throwable t2;
                    zn2.r((Closeable)context, t2);
                }
            }
        }
    }
    
    public static final Object L(final WorkDatabase workDatabase, final boolean b, final boolean b2, final lta lta) {
        final ThreadLocal i = workDatabase.i;
        workDatabase.a();
        if (workDatabase.k() && !workDatabase.l()) {
            final hc7 hc7 = (hc7)i.get();
            ydo ydo;
            if (hc7 != null) {
                ydo = (ydo)hc7.M0((gc7)ydo.w);
            }
            else {
                ydo = null;
            }
            if (ydo != null) {
                en9.q("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        Object o = i.get();
        final o89 v = o89.v;
        if (o == null) {
            o = v;
        }
        final bt7 bt7 = new bt7((hc7)o, workDatabase, b2, b, lta, (f07)null);
        Thread.interrupted();
        return mlc.e0((hc7)v, (zta)new rf0((byte)21, (f07)null, (Object)bt7));
    }
    
    public static final Object M(final WorkDatabase v, final boolean x, final boolean y, lta w, final h07 h07) {
        while (true) {
            Label_0049: {
                if (!(h07 instanceof ct7)) {
                    break Label_0049;
                }
                final ct7 ct7 = (ct7)h07;
                final int a = ct7.A;
                if ((a & Integer.MIN_VALUE) == 0x0) {
                    break Label_0049;
                }
                ct7.A = a + Integer.MIN_VALUE;
                final Object o = ct7;
                final Object z = ((ct7)o).z;
                final int a2 = ((ct7)o).A;
                final pc7 v2 = pc7.v;
                boolean x2;
                WorkDatabase v3;
                hc7 hc7;
                boolean b;
                if (a2 != 0) {
                    if (a2 == 1) {
                        vt4.g0(z);
                        return z;
                    }
                    if (a2 != 2) {
                        if (a2 == 3) {
                            vt4.g0(z);
                            return z;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        final boolean y2 = ((ct7)o).y;
                        x2 = ((ct7)o).x;
                        w = ((ct7)o).w;
                        v3 = ((ct7)o).v;
                        vt4.g0(z);
                        hc7 = (hc7)z;
                        b = y2;
                    }
                }
                else {
                    vt4.g0(z);
                    if (v.k() && v.n() && v.l()) {
                        final zs7 zs7 = new zs7(y, x, v, (f07)null, w, (byte)1);
                        ((ct7)o).A = 1;
                        final Object s = v.s(x, (zta)zs7, (h07)o);
                        if (s == v2) {
                            return v2;
                        }
                        return s;
                    }
                    else {
                        ((ct7)o).v = v;
                        ((ct7)o).w = w;
                        ((ct7)o).x = x;
                        ((ct7)o).y = y;
                        ((ct7)o).A = 2;
                        final hc7 e = E(v, y, (h07)o);
                        if (e == v2) {
                            return v2;
                        }
                        v3 = v;
                        hc7 = e;
                        b = y;
                        x2 = x;
                    }
                }
                final hc7 hc8 = hc7;
                final at7 at7 = new at7((f07)null, v3, x2, b, w);
                ((ct7)o).v = null;
                ((ct7)o).w = null;
                ((ct7)o).A = 3;
                final Object f0 = rhc.f0(hc8, (zta)at7, (f07)o);
                if (f0 != v2) {
                    return f0;
                }
                return v2;
            }
            final Object o = new h07(h07);
            continue;
        }
    }
    
    public static final Object N(final jqc jqc, final String s, final JsonObject jsonObject, final KSerializer kSerializer) {
        return ((h1)new ysc(jqc, jsonObject, s, kSerializer.getDescriptor())).v(kSerializer);
    }
    
    public static final ae3 O(final mn2 mn2) {
        return new ae3((xd3)mn2, false);
    }
    
    public static final sq6 P(final b b, final xd3 xd3, final gva gva, final int n) {
        final Object r = gva.R();
        final cib a = bi6.a;
        Object z = r;
        if (r == a) {
            z = mlc.z((hc7)o89.v, gva);
            gva.q0(z);
        }
        final oc7 oc7 = (oc7)z;
        final boolean b2 = true;
        final boolean b3 = (((n & 0xE) ^ 0x6) > 4 && gva.f((Object)b)) || (n & 0x6) == 0x4;
        boolean b4 = false;
        Label_0126: {
            if (((n & 0x70) ^ 0x30) > 32) {
                b4 = b2;
                if (gva.f((Object)xd3)) {
                    break Label_0126;
                }
            }
            b4 = ((n & 0x30) == 0x20 && b2);
        }
        final Object r2 = gva.R();
        sq6 sq6;
        if ((b3 | b4) || (sq6 = (sq6)r2) == a) {
            sq6 = new sq6(b, xd3, oc7);
            gva.q0((Object)sq6);
        }
        final sq6 sq7 = sq6;
        final usi k = sq7.a.k;
        final bnf v = ljq.v((ija)k, k.getValue(), gva, 0, 0);
        final boolean i = b.i();
        final pq6 pq6 = (pq6)((xom)v).getValue();
        final boolean f = gva.f((Object)v);
        final boolean g = gva.g(i);
        final boolean h = gva.h((Object)sq7);
        final Object r3 = gva.R();
        Object o;
        if ((f | g | h) || (o = r3) == a) {
            o = new sf0(i, (Object)v, (Object)sq7, (f07)null, (byte)2);
            gva.q0(o);
        }
        mlc.g(pq6, i, (zta)o, gva);
        final gbd gbd = (gbd)gva.j((sei)uod.a);
        final boolean h2 = gva.h((Object)gbd);
        final boolean h3 = gva.h((Object)sq7);
        final Object r4 = gva.R();
        Object o2;
        if ((h2 | h3) || (o2 = r4) == a) {
            o2 = new p10((Object)gbd, (Object)sq7, (f07)null, (byte)16);
            gva.q0(o2);
        }
        mlc.f((zta)o2, gva, gbd);
        return sq7;
    }
    
    public static final qbn Q(final lta lta, final gva gva) {
        gva.g0(-1328779074);
        gva.g0(-510838011);
        final boolean booleanValue = (boolean)gva.j((sei)nec.a);
        final cib a = bi6.a;
        boolean booleanValue2;
        if (booleanValue) {
            gva.q(false);
            booleanValue2 = false;
        }
        else {
            Object o;
            if ((o = gva.R()) == a) {
                o = (Camera.getNumberOfCameras() > 0);
                gva.q0(o);
            }
            booleanValue2 = (boolean)o;
            gva.q(false);
        }
        final b09 b = q50.b;
        final PackageManager packageManager = ((Context)gva.j((sei)b)).getPackageManager();
        Object o2;
        if ((o2 = gva.R()) == a) {
            final List queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), 65536);
            queryIntentActivities.getClass();
            o2 = (true ^ ((Collection)queryIntentActivities).isEmpty());
            gva.q0(o2);
        }
        final boolean booleanValue3 = (boolean)o2;
        if (booleanValue2 && booleanValue3) {
            final Context context = (Context)gva.j((sei)b);
            final odk a2 = ii8.a(gva);
            final boolean f = gva.f((Object)null);
            final boolean f2 = gva.f((Object)a2);
            final Object r = gva.R();
            Object o3;
            if ((f | f2) || (o3 = r) == a) {
                o3 = a2.d((Class)f60.class, (emi)null);
                gva.q0(o3);
            }
            final f60 f3 = (f60)o3;
            final odk a3 = ii8.a(gva);
            final boolean f4 = gva.f((Object)null);
            final boolean f5 = gva.f((Object)a3);
            final Object r2 = gva.R();
            Object o4;
            if ((f4 | f5) || (o4 = r2) == a) {
                o4 = a3.d((Class)oa.class, (emi)null);
                gva.q0(o4);
            }
            final oa oa = (oa)o4;
            final n9k n9k = new n9k((lta)new rx1((Object)context, (Object)f3, (Object)oa, (byte)28), (zta)new dtk((byte)11));
            final boolean h = gva.h((Object)context);
            final boolean h2 = gva.h((Object)f3);
            final boolean h3 = gva.h((Object)oa);
            final Object r3 = gva.R();
            Object o5;
            if ((h | h2 | h3) || (o5 = r3) == a) {
                o5 = new qn1((Object)context, (Object)f3, (Object)oa, (byte)21);
                gva.q0(o5);
            }
            final pbn pbn = (pbn)mlc.b0(new Object[] { context, f3, oa }, (m9k)n9k, (jta)o5, gva, 0);
            Object o6;
            if ((o6 = gva.R()) == a) {
                o6 = mlc.z((hc7)o89.v, gva);
                gva.q0(o6);
            }
            final oc7 oc7 = (oc7)o6;
            final odk a4 = ii8.a(gva);
            final boolean f6 = gva.f((Object)null);
            final boolean f7 = gva.f((Object)a4);
            final Object r4 = gva.R();
            Object o7;
            if ((f6 | f7) || (o7 = r4) == a) {
                o7 = a4.d((Class)wo8.class, (emi)null);
                gva.q0(o7);
            }
            final wo8 wo8 = (wo8)o7;
            final bnf w = o50.W(lta, gva);
            final ke ke = new ke((byte)4);
            final boolean h4 = gva.h((Object)pbn);
            final boolean f8 = gva.f((Object)lta);
            final Object r5 = gva.R();
            Object o8;
            if ((h4 | f8) || (o8 = r5) == a) {
                o8 = new tyl((Object)pbn, (Object)lta, (byte)5);
                gva.q0(o8);
            }
            final a1e d = k8e.D(ke, (lta)o8, gva, 0);
            final boolean f9 = gva.f((Object)pbn);
            final Object r6 = gva.R();
            qbn qbn;
            if (f9 || (qbn = (qbn)r6) == a) {
                qbn = new qbn(pbn, d, oc7, wo8, new ny1(w, (byte)19));
                gva.q0((Object)qbn);
            }
            final qbn qbn2 = qbn;
            gva.q(false);
            return qbn2;
        }
        final tqd l = uqd.l;
        gva.q(false);
        return null;
    }
    
    public static final efo R(final r1 r1, String s, final gva gva, int n, int n2) {
        if ((n2 & 0x2) != 0x0) {
            s = null;
        }
        final int n3 = (n & 0xE) ^ 0x6;
        if ((n3 > 4 && gva.f((Object)r1)) || (n & 0x6) == 0x4) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        Object o = gva.R();
        final cib a = bi6.a;
        Label_0134: {
            Object o2;
            if (n2 == 0 && (o2 = o) != a) {
                break Label_0134;
            }
            o = q7m.a();
            if (o != null) {
                o2 = ((r7m)o).e();
            }
            else {
                o2 = null;
            }
            Object o3 = q7m.b((r7m)o);
            try {
                final efo efo = new efo(r1, null, s);
                q7m.d((r7m)o, (r7m)o3, (lta)o2);
                gva.q0((Object)efo);
                o2 = efo;
                o = o2;
                if (r1 instanceof zmk) {
                    gva.g0(-1357398105);
                    o2 = gva.R();
                    Object z;
                    if ((z = o2) == a) {
                        z = mlc.z((hc7)o89.v, gva);
                        gva.q0(z);
                    }
                    o3 = z;
                    final boolean h = gva.h(o3);
                    if ((n3 > 4 && gva.f((Object)r1)) || (n & 0x6) == 0x4) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    o2 = gva.R();
                    Object o4;
                    if (((h ? 1 : 0) | n2) != 0x0 || (o4 = o2) == a) {
                        o4 = new tyl((Object)r1, o3, (byte)15);
                        gva.q0(o4);
                    }
                    mlc.a(o3, (lta)o4, gva);
                    final zmk zmk = (zmk)r1;
                    o3 = zmk.y.getValue();
                    final Object value = zmk.x.getValue();
                    if ((n3 > 4 && gva.f((Object)r1)) || (n & 0x6) == 0x4) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    o2 = gva.R();
                    Object o5;
                    if (n != 0 || (o5 = o2) == a) {
                        o5 = new djh((byte)12, null, r1);
                        gva.q0(o5);
                    }
                    mlc.g(o3, value, (zta)o5, gva);
                    gva.q(false);
                }
                else {
                    gva.g0(-1356407283);
                    ((efo)o).a(r1.k(), gva, 0);
                    gva.q(false);
                }
                final boolean f = gva.f(o);
                final Object r2 = gva.R();
                Object o6;
                if (f || (o6 = r2) == a) {
                    o6 = new ffo((efo)o, (byte)1);
                    gva.q0(o6);
                }
                mlc.a(o, (lta)o6, gva);
                return (efo)o;
            }
            finally {
                q7m.d((r7m)o, (r7m)o3, (lta)o2);
            }
        }
    }
    
    public static final void S(final v8m v8m, final ArrayList list) {
        final int size = v8m.size();
        final int size2 = list.size();
        int i;
        int o;
        for (i = 0, o = ncq.o(size, 0, size2); i < o; ++i) {
            if (!mlc.q(v8m.get(i), list.get(i))) {
                v8m.set(i, list.get(i));
            }
        }
        if (o < list.size()) {
            v8m.addAll((Collection)list.subList(o, list.size()));
        }
        if (v8m.size() > list.size()) {
            v8m.j(list.size(), v8m.size());
        }
    }
    
    public static final RecentsRow$Artifact T(cw2 cw2, final jqc jqc) {
        try {
            final RecentsRow$Artifact recentsRow$Artifact = (RecentsRow$Artifact)jqc.b(cw2.b(), (KSerializer)RecentsRow$Artifact.Companion.serializer());
        }
        finally {
            final Throwable t;
            cw2 = (cw2)new jpj(t);
        }
        final Throwable a = kpj.a((Object)cw2);
        if (a != null) {
            final z08 y = z08.y;
            final String v = lmf.v(a);
            try {
                ri2.c.h(y, "RecentsRow.Artifact", v);
            }
            finally {
                final tqd l = uqd.l;
            }
        }
        Object o = cw2;
        if (cw2 instanceof jpj) {
            o = null;
        }
        return (RecentsRow$Artifact)o;
    }
    
    public static final x97 U(final SerializableCookie serializableCookie) {
        final String d = serializableCookie.d;
        final String b = acq.b(d);
        if (b == null) {
            en9.s("unexpected domain: ".concat(d));
            return null;
        }
        final String e = serializableCookie.e;
        if (!rym.E0(e, "/", false)) {
            en9.s("path must start with '/'");
            return null;
        }
        final String a = serializableCookie.a;
        if (!mlc.q(kym.B1((CharSequence)a).toString(), a)) {
            en9.s("name is not trimmed");
            return null;
        }
        final String b2 = serializableCookie.b;
        if (mlc.q(kym.B1((CharSequence)b2).toString(), b2)) {
            final Long c = serializableCookie.c;
            final long n = 253402300799999L;
            long longValue;
            boolean b3;
            if (c != null) {
                if ((longValue = ((Number)c).longValue()) <= 0L) {
                    longValue = Long.MIN_VALUE;
                }
                if (longValue > 253402300799999L) {
                    longValue = n;
                }
                b3 = true;
            }
            else {
                b3 = false;
                longValue = n;
            }
            final boolean f = serializableCookie.f;
            final boolean g = serializableCookie.g;
            String b4;
            boolean b5;
            if (serializableCookie.h) {
                b4 = acq.b(d);
                if (b4 == null) {
                    en9.s("unexpected domain: ".concat(d));
                    return null;
                }
                b5 = true;
            }
            else {
                b5 = false;
                b4 = b;
            }
            return new x97(a, b2, longValue, b4, e, f, g, b3, b5, (String)null);
        }
        en9.s("value is not trimmed");
        return null;
    }
    
    public static final yhd V(final hjd hjd) {
        final String b = hjd.b();
        final int hashCode = b.hashCode();
        if (hashCode != -1434379820) {
            if (hashCode != -1228798510) {
                if (hashCode == 3052376) {
                    if (b.equals((Object)"chat")) {
                        return (yhd)new whd(hjd.a());
                    }
                }
            }
            else if (b.equals((Object)"artifact")) {
                final l65 companion = CodeArtifactId.Companion;
                final String a = hjd.a();
                companion.getClass();
                final String b2 = l65.b(a);
                if (b2 != null) {
                    return (yhd)new vhd(b2);
                }
            }
        }
        else if (b.equals((Object)"cowork_session")) {
            return (yhd)new xhd(hjd.a(), 0);
        }
        return null;
    }
    
    public static final lx3 W(final fkd fkd, final qx3 qx3, final long n) {
        if (fkd != null) {
            if (fkd instanceof dkd) {
                return new lx3(qx3, ((dkd)fkd).a.a, "chat", n);
            }
            if (fkd instanceof ekd) {
                return new lx3(qx3, ((ekd)fkd).c().b(), "cowork_session", n);
            }
            if (fkd instanceof ckd) {
                return new lx3(qx3, ((ckd)fkd).c().a(), "artifact", n);
            }
        }
        en9.r();
        return null;
    }
    
    public static final RecentsRow$Session X(jx2 jx2, final jqc jqc) {
        try {
            final RecentsRow$Session recentsRow$Session = (RecentsRow$Session)jqc.b(jx2.a(), (KSerializer)RecentsRow$Session.Companion.serializer());
        }
        finally {
            final Throwable t;
            jx2 = (jx2)new jpj(t);
        }
        final Throwable a = kpj.a((Object)jx2);
        if (a != null) {
            final z08 y = z08.y;
            final String v = lmf.v(a);
            try {
                ri2.c.h(y, "RecentsRow.Session", v);
            }
            finally {
                final tqd l = uqd.l;
            }
        }
        Object o = jx2;
        if (jx2 instanceof jpj) {
            o = null;
        }
        return (RecentsRow$Session)o;
    }
    
    public static final String Y(final SerialDescriptor serialDescriptor) {
        final xgc t = ncq.T(0, serialDescriptor.f());
        final StringBuilder sb = new StringBuilder();
        sb.append(serialDescriptor.a());
        sb.append('(');
        return c86.N0((Iterable)t, (CharSequence)", ", sb.toString(), ")", (lta)new trf((Object)serialDescriptor, (byte)15), 24);
    }
    
    public static final efo Z(Object r, String s, final gva gva, final int n, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            s = null;
        }
        final Object r2 = gva.R();
        final cib a = bi6.a;
        efo efo;
        if ((efo = (efo)r2) == a) {
            efo = new efo(new enf(r), null, s);
            gva.q0((Object)efo);
        }
        final efo efo2 = efo;
        efo2.a(r, gva, (n & 0x8) | 0x30 | (n & 0xE));
        if ((r = gva.R()) == a) {
            r = new ffo(efo2, (byte)0);
            gva.q0(r);
        }
        mlc.a(efo2, (lta)r, gva);
        return efo2;
    }
    
    public static final void a(final itl itl, final boolean b, final jta jta, final lta lta, final bua bua, final jta jta2, final x6m x6m, final igf igf, st4 st4, zup zup, final WelcomeNotice welcomeNotice, final dng dng, final gva gva, final int n) {
        final cib a = bi6.a;
        gva.i0(1598082754);
        int n2;
        if (gva.f((Object)itl)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.g(b)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)lta)) {
            n4 = 2048;
        }
        else {
            n4 = 1024;
        }
        int n5;
        if (gva.h((Object)bua)) {
            n5 = 16384;
        }
        else {
            n5 = 8192;
        }
        int n6;
        if (gva.h((Object)jta2)) {
            n6 = 131072;
        }
        else {
            n6 = 65536;
        }
        int n7;
        if (gva.f((Object)x6m)) {
            n7 = 1048576;
        }
        else {
            n7 = 524288;
        }
        int n8;
        if (gva.f((Object)igf)) {
            n8 = 8388608;
        }
        else {
            n8 = 4194304;
        }
        final int n9 = n | n2 | n3 | n4 | n5 | n6 | n7 | n8 | 0x12000000;
        int ordinal;
        if (welcomeNotice == null) {
            ordinal = -1;
        }
        else {
            ordinal = ((Enum)welcomeNotice).ordinal();
        }
        int n10;
        if (gva.d(ordinal)) {
            n10 = 4;
        }
        else {
            n10 = 2;
        }
        int n11;
        if (gva.f((Object)dng)) {
            n11 = 32;
        }
        else {
            n11 = 16;
        }
        if (gva.W(n9 & 0x1, (n9 & 0x12492493) != 0x12492492 || ((n10 | n11) & 0x13) != 0x12)) {
            gva.b0();
            int n12;
            Object o;
            zup zup3;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n12 = (n9 & 0x81FFFFFF);
                final zup zup2 = zup;
                o = st4;
                zup3 = zup2;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (st4 = (st4)r) == a) {
                    st4 = (st4)a2.d((Class)st4.class, (emi)null);
                    gva.q0((Object)st4);
                }
                o = st4;
                final emi a3 = avp.a;
                final odk a4 = ii8.a(gva);
                final boolean h = gva.h((Object)a4);
                final Object r2 = gva.R();
                Object o2;
                if (h || (o2 = r2) == a) {
                    o2 = new g64(a4, (byte)8);
                    gva.q0(o2);
                }
                zup3 = (zup)rhc.S(v4j.a((Class)zup.class), tsf.E(v4j.a((Class)zup.class)), (lta)o2, gva);
                n12 = (n9 & 0x81FFFFFF);
            }
            gva.r();
            final boolean h2 = gva.h(o);
            final Object r3 = gva.R();
            Object o3;
            if (h2 || (o3 = r3) == a) {
                o3 = new pf0((byte)0, (f07)null, o);
                gva.q0(o3);
            }
            uuj.R((lta)o3, gva, 0);
            final long n13 = ((e8e)gva.j((sei)h8e.a)).a.n;
            final b09 b2 = q50.b;
            final Context context = (Context)gva.j((sei)b2);
            final mn2 i = zup3.I;
            final st4 st5 = (st4)o;
            final boolean b3 = (n12 & 0x1C00) == 0x800;
            final boolean f3 = gva.f((Object)zup3);
            final boolean e = gva.e(n13);
            final boolean h3 = gva.h((Object)context);
            final boolean b4 = (n12 & 0xE000) == 0x4000;
            final boolean b5 = (n12 & 0x70000) == 0x20000;
            Object r4 = gva.R();
            if ((b3 | f3 | e | h3 | b4 | b5) || r4 == a) {
                r4 = new qf0(lta, zup3, n13, context, bua, jta2, (f07)null);
                gva.q0(r4);
            }
            ach.e((xd3)i, (zta)r4, gva, 0);
            omo.j((xd3)zup3.J, x6m, gva, n12 >> 15 & 0x70);
            SSOIntentData.Companion.getClass();
            final mn2 c = SSOIntentData.c;
            final boolean f4 = gva.f((Object)zup3);
            Object r5 = gva.R();
            if (f4 || r5 == a) {
                r5 = new rf0((byte)0, (f07)null, (Object)zup3);
                gva.q0(r5);
            }
            ach.e((xd3)c, (zta)r5, gva, 0);
            final evp evp = (evp)zup3.Q.getValue();
            if (evp == null) {
                gva.g0(-1227366486);
                gva.q(false);
            }
            else {
                gva.g0(-1227366485);
                final boolean f5 = gva.f((Object)zup3);
                final Object r6 = gva.R();
                Object o4;
                if (f5 || (o4 = r6) == a) {
                    o4 = new kf0(zup3, (byte)0);
                    gva.q0(o4);
                }
                final jta jta3 = (jta)o4;
                final boolean f6 = gva.f((Object)zup3);
                final boolean f7 = gva.f((Object)evp);
                final boolean e2 = gva.e(n13);
                final boolean h4 = gva.h((Object)context);
                Object r7 = gva.R();
                if ((f6 | f7 | e2 | h4) || r7 == a) {
                    r7 = new lf0(zup3, evp, n13, context);
                    gva.q0(r7);
                }
                final jta jta4 = (jta)r7;
                final boolean f8 = gva.f((Object)zup3);
                final boolean f9 = gva.f((Object)evp);
                Object r8 = gva.R();
                if ((f8 | f9) || r8 == a) {
                    r8 = new jd0((Object)zup3, (Object)evp, (byte)1);
                    gva.q0(r8);
                }
                k(jta3, jta4, (jta)r8, gva, 0);
                gva.q(false);
            }
            boolean b6 = true;
            gva.g0(-693128715);
            final Context context2 = (Context)gva.j((sei)b2);
            pud pud;
            if (gva.j((sei)nec.a)) {
                gva.g0(1205346602);
                Object o5;
                if ((o5 = gva.R()) == a) {
                    if ((o5 = pud.i) == null) {
                        o5 = K(context2);
                    }
                    gva.q0(o5);
                }
                pud = (pud)o5;
                gva.q(false);
                gva.q(false);
            }
            else {
                gva.g0(1205441741);
                gva.q(false);
                final odk a5 = ii8.a(gva);
                final boolean f10 = gva.f((Object)null);
                final boolean f11 = gva.f((Object)a5);
                final Object r9 = gva.R();
                Object o6;
                if ((f10 | f11) || (o6 = r9) == a) {
                    o6 = a5.d((Class)wo8.class, (emi)null);
                    gva.q0(o6);
                }
                final wo8 wo8 = (wo8)o6;
                final pud j = pud.i;
                final boolean h5 = gva.h((Object)wo8);
                final boolean h6 = gva.h((Object)context2);
                Object r10 = gva.R();
                if ((h5 | h6) || r10 == a) {
                    r10 = new kd0(wo8, context2, null, (byte)5);
                    gva.q0(r10);
                }
                pud = (pud)((xom)ncq.G((zta)r10, gva, j)).getValue();
                gva.q(false);
            }
            if ((n12 & 0x70) != 0x20) {
                b6 = false;
            }
            final boolean f12 = gva.f((Object)pud);
            final Object r11 = gva.R();
            Object o7;
            if ((f12 | b6) || (o7 = r11) == a) {
                o7 = new sf0(b, (Object)pud, (Object)jta, (f07)null, (byte)0);
                gva.q0(o7);
            }
            mlc.f((zta)o7, gva, pud);
            Object r12;
            if ((r12 = gva.R()) == a) {
                r12 = new p50((byte)2);
                gva.q0(r12);
            }
            vt4.b(b, igf, (lta)r12, null, "animatedWelcomeStage", null, uuj.t0(-2033364513, (aua)new mf0((Object)itl, (Object)zup3, (Object)pud, (Object)welcomeNotice, (Object)dng, (Object)context, (byte)0), gva), gva, (n12 >> 3 & 0xE) | 0x186180 | (n12 >> 18 & 0x70), 40);
            zup = zup3;
            st4 = st5;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new nf0(itl, b, jta, lta, bua, jta2, x6m, igf, st4, zup, welcomeNotice, dng, n);
        }
    }
    
    public static final void a0(final int n, final int n2) {
        final int n3 = 0;
        if (n <= 0 || n2 <= 0) {
            final StringBuilder sb = new StringBuilder("both minLines ");
            sb.append(n);
            sb.append(" and maxLines ");
            sb.append(n2);
            sb.append(" must be greater than zero");
            jac.a(sb.toString());
        }
        int n4 = n3;
        if (n <= n2) {
            n4 = 1;
        }
        if (n4 == 0) {
            final StringBuilder sb2 = new StringBuilder("minLines ");
            sb2.append(n);
            sb2.append(" must be less than or equal to maxLines ");
            sb2.append(n2);
            jac.a(sb2.toString());
        }
    }
    
    public static final void b(final lh0 lh0, igf v, String s, final gva gva, final int n, final int n2) {
        gva.i0(-1809892454);
        int n3;
        if (gva.f((Object)lh0)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        final int n4 = n3 | n;
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x30) == 0x0) {
                int n7;
                if (gva.f((Object)v)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        final int n8 = n2 & 0x4;
        int n9;
        if (n8 != 0) {
            n9 = (n6 | 0x180);
        }
        else {
            n9 = n6;
            if ((n & 0x180) == 0x0) {
                int n10;
                if (gva.f((Object)s)) {
                    n10 = 256;
                }
                else {
                    n10 = 128;
                }
                n9 = (n6 | n10);
            }
        }
        if (gva.W(n9 & 0x1, (n9 & 0x93) != 0x92)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            if (n8 != 0) {
                s = null;
            }
            final mb2 b = wab.B;
            final igf p6 = androidx.compose.foundation.layout.b.p(v, 16.0f);
            final moe c = rj2.c((gx)b, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, p6);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b2);
            final cy4 a = qy4.a;
            o50.e(lh0, s, null, d93.w, qy4.a(gva).a.a0(), gva, (n9 & 0xE) | 0xC00 | (n9 >> 3 & 0x70), 4);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new qm((byte)3, n, n2, v, (Object)lh0, (Object)s);
        }
    }
    
    public static final void b0(final StringBuilder sb, final String s) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(s);
    }
    
    public static final void c(final lh0 lh0, final mnn mnn, igf v, final gva gva, final int n, final int n2) {
        gva.i0(-420808478);
        int n3;
        if (gva.f((Object)lh0)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.f((Object)mnn)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        final int n5 = n3 | n | n4;
        final int n6 = n2 & 0x4;
        int n7;
        if (n6 != 0) {
            n7 = (n5 | 0x180);
        }
        else {
            int n8;
            if (gva.f((Object)v)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        final int n9 = n7 | 0xC00;
        if (gva.W(n9 & 0x1, (n9 & 0x493) != 0x492)) {
            if (n6 != 0) {
                v = (igf)fgf.v;
            }
            final ye6 t0 = uuj.t0(-917852201, (aua)new m01(lh0, (byte)1), gva);
            final int n10 = n9 >> 3;
            j(mnn, v, t0, gva, (n10 & 0x70) | ((n10 & 0xE) | 0x180));
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new fu((Object)lh0, (Object)mnn, (Object)v, n, n2, (byte)5);
        }
    }
    
    public static final int c0(final float n, final float[] array, final int n2) {
        float n3 = 0.0f;
        if (n >= 0.0f) {
            n3 = n;
        }
        float n4 = n3;
        if (n3 > 1.0f) {
            n4 = 1.0f;
        }
        float n5 = n4;
        if (Math.abs(n4 - n) > 1.05E-6f) {
            n5 = Float.NaN;
        }
        array[n2] = n5;
        return (Float.isNaN(n5) ^ true) ? 1 : 0;
    }
    
    public static final void d(final f93 f93, igf v, int n, final gva gva, final int n2, final int n3) {
        gva.i0(1741494210);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            int n4;
            if (gva.d(((Enum)f93).ordinal())) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n2);
        }
        else {
            n5 = n2;
        }
        final int n6 = n3 & 0x2;
        int n7;
        if (n6 != 0) {
            n7 = (n5 | 0x30);
        }
        else {
            n7 = n5;
            if ((n2 & 0x30) == 0x0) {
                int n8;
                if (gva.f((Object)v)) {
                    n8 = 32;
                }
                else {
                    n8 = 16;
                }
                n7 = (n5 | n8);
            }
        }
        final int n9 = n3 & 0x4;
        int n10;
        if (n9 != 0) {
            n10 = (n7 | 0x180);
        }
        else {
            n10 = n7;
            if ((n2 & 0x180) == 0x0) {
                int d;
                if (n == 0) {
                    d = -1;
                }
                else {
                    d = ge9.D(n);
                }
                int n11;
                if (gva.d(d)) {
                    n11 = 256;
                }
                else {
                    n11 = 128;
                }
                n10 = (n7 | n11);
            }
        }
        if (gva.W(n10 & 0x1, (n10 & 0x93) != 0x92)) {
            if (n6 != 0) {
                v = (igf)fgf.v;
            }
            if (n9 != 0) {
                n = 1;
            }
            l(f93, v, uuj.t0(746342972, (aua)new g93(f93, n, (byte)0), gva), gva, (n10 & 0x70) | ((n10 & 0xE) | 0x180));
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new l93((Object)f93, v, n, n2, n3, (byte)0);
        }
    }
    
    public static final void e(final f93 f93, final mnn mnn, igf v, int n, final gva gva, final int n2, final int n3) {
        gva.i0(-1921802438);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            int n4;
            if (gva.d(((Enum)f93).ordinal())) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n2);
        }
        else {
            n5 = n2;
        }
        int n6 = n5;
        if ((n2 & 0x30) == 0x0) {
            int n7;
            if (gva.f((Object)mnn)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        final int n8 = n3 & 0x4;
        int n9;
        if (n8 != 0) {
            n9 = (n6 | 0x180);
        }
        else {
            n9 = n6;
            if ((n2 & 0x180) == 0x0) {
                int n10;
                if (gva.f((Object)v)) {
                    n10 = 256;
                }
                else {
                    n10 = 128;
                }
                n9 = (n6 | n10);
            }
        }
        final int n11 = n3 & 0x8;
        int n12;
        if (n11 != 0) {
            n12 = (n9 | 0xC00);
        }
        else {
            n12 = n9;
            if ((n2 & 0xC00) == 0x0) {
                int d;
                if (n == 0) {
                    d = -1;
                }
                else {
                    d = ge9.D(n);
                }
                int n13;
                if (gva.d(d)) {
                    n13 = 2048;
                }
                else {
                    n13 = 1024;
                }
                n12 = (n9 | n13);
            }
        }
        if (gva.W(n12 & 0x1, (n12 & 0x493) != 0x492)) {
            if (n8 != 0) {
                v = (igf)fgf.v;
            }
            if (n11 != 0) {
                n = 1;
            }
            final ye6 t0 = uuj.t0(318668911, (aua)new g93(f93, n, (byte)1), gva);
            final int n14 = n12 >> 3;
            j(mnn, v, t0, gva, (n14 & 0x70) | ((n14 & 0xE) | 0x180));
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new m93((Object)f93, (Object)mnn, v, n, n2, n3, (byte)0);
        }
    }
    
    public static final void f(final f93 f93, igf v, final gva gva, final int n, final int n2) {
        gva.i0(281273244);
        int n3;
        if (gva.d(((Enum)f93).ordinal())) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        final int n4 = n3 | n;
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x30) == 0x0) {
                int n7;
                if (gva.f((Object)v)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        while (true) {
            Label_0218: {
                if (!gva.W(n6 & 0x1, (n6 & 0x13) != 0x12)) {
                    gva.Z();
                    break Label_0218;
                }
                if (n5 != 0) {
                    v = (igf)fgf.v;
                }
                if (f93 != f93.z) {
                    l(f93, v, uuj.t0(2070255382, (aua)new k93(f93, (byte)1), gva), gva, (n6 & 0x70) | ((n6 & 0xE) | 0x180));
                    break Label_0218;
                }
                final b0j v2 = gva.v();
                if (v2 == null) {
                    return;
                }
                final n93 d = new n93(f93, v, n, n2, (byte)0);
                final b0j b0j = v2;
                b0j.d = (zta)d;
                return;
            }
            final b0j v3 = gva.v();
            if (v3 != null) {
                final n93 d = new n93(f93, v, n, n2, (byte)1);
                final b0j b0j = v3;
                continue;
            }
            break;
        }
    }
    
    public static final void g(final f93 f93, final mnn mnn, final igf igf, final gva gva, final int n) {
        gva.i0(526299540);
        int n2;
        if (gva.d(((Enum)f93).ordinal())) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)mnn)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.f((Object)igf)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n2 | n | n3 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            if (f93 == f93.z) {
                final b0j v = gva.v();
                if (v != null) {
                    v.d = (zta)new j93(f93, mnn, igf, n, (byte)0);
                }
                return;
            }
            else {
                final ye6 t0 = uuj.t0(-391348407, (aua)new k93(f93, (byte)0), gva);
                final int n6 = n5 >> 3;
                j(mnn, igf, t0, gva, (n6 & 0x70) | ((n6 & 0xE) | 0x180));
            }
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new j93(f93, mnn, igf, n, (byte)1);
        }
    }
    
    public static final void h(final int n, final int n2, final gva gva, igf v) {
        gva.i0(699482041);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)v)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        final int n6 = 1;
        if (gva.W(n4 & 0x1, (n4 & 0x3) != 0x2)) {
            if (n3 != 0) {
                v = (igf)fgf.v;
            }
            gva.g0(-1905935641);
            int booleanValue;
            if (u8r.l(gva)) {
                gva.g0(-260970446);
                booleanValue = n6;
            }
            else {
                gva.g0(-1948079634);
                booleanValue = (((boolean)gva.j((sei)nec.a)) ? 1 : 0);
            }
            gva.q(false);
            Object o;
            if (booleanValue != 0) {
                gva.g0(-260916836);
                o = o50.W(1.0f, gva);
                gva.q(false);
            }
            else {
                gva.g0(-260887045);
                gva.q(false);
                o = eqi.L(eqi.k0("working-dot", gva, 0), 1.0f, 0.3f, ri2.W(ri2.I0(600, 0, null, 6), 2, 4), "working-dot-alpha", gva, 29112, 0);
            }
            gva.q(false);
            final igf p3 = androidx.compose.foundation.layout.b.p(v, 8.0f);
            final boolean f = gva.f(o);
            final Object r = gva.R();
            Object o2;
            if (f || (o2 = r) == bi6.a) {
                o2 = new fr1((xom)o, (byte)4);
                gva.q0(o2);
            }
            final igf f2 = zrn.F(p3, (lta)o2);
            final cy4 a = qy4.a;
            rj2.a(rhc.h(f2, qy4.a(gva).a.m(), (aql)ovj.a), gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new h93((byte)0, n, n2, v);
        }
    }
    
    public static final void i(final int n, final long n2, final gva gva) {
        gva.i0(1039144198);
        int n3;
        if (gva.e(n2)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        final int n4 = n3 | n;
        if (gva.W(n4 & 0x1, (n4 & 0x3) != 0x2)) {
            rj2.a(rhc.h(androidx.compose.foundation.layout.b.p((igf)fgf.v, 8.0f), n2, (aql)ovj.a), gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new i93(n2, n);
        }
    }
    
    public static final void j(final mnn mnn, final igf igf, final ye6 ye6, final gva gva, final int n) {
        gva.i0(110586314);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)mnn)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.f((Object)igf)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.h((Object)ye6)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final mb2 b = wab.B;
            final igf f = androidx.compose.foundation.layout.b.f(igf, ao2.S(mnn, gva));
            final moe c = rj2.c((gx)b, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, f);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b2);
            hia.t(n6 >> 6 & 0xE, ye6, gva, true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new vm(n, (Object)mnn, (Object)igf, (Object)ye6, (byte)9);
        }
    }
    
    public static final void k(final jta jta, final jta jta2, final jta jta3, final gva gva, final int n) {
        gva.i0(-12939066);
        int n2;
        if (gva.h((Object)jta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)jta2)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)jta3)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n | n2 | n3 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            xkq.c(jta, uuj.t0(-1845357309, (aua)new nm(jta2, (byte)1), gva), (igf)null, (zta)uuj.t0(-2110004799, (aua)new nm(jta3, (byte)2), gva), (zta)rjq.c, (zta)null, (aql)null, 0L, 0L, 0L, 0L, (pi8)null, gva, (n5 & 0xE) | 0x30C30, 0, 16340);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new of0(jta, jta2, jta3, n, (byte)0);
        }
    }
    
    public static final void l(final f93 f93, final igf igf, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-1081811003);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.d(((Enum)f93).ordinal())) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.f((Object)igf)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.h((Object)ye6)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final int ordinal = ((Enum)f93).ordinal();
            String j = null;
            Label_0289: {
                int n8;
                int n9;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    gva.g0(1203504856);
                                    gva.q(false);
                                    j = null;
                                    break Label_0289;
                                }
                                throw ge9.y(-238284197, gva, false);
                            }
                            else {
                                n8 = -238274539;
                                n9 = 2131756234;
                            }
                        }
                        else {
                            n8 = -238277224;
                            n9 = 2131756233;
                        }
                    }
                    else {
                        n8 = -238280039;
                        n9 = 2131756236;
                    }
                }
                else {
                    n8 = -238282887;
                    n9 = 2131756235;
                }
                j = hia.j(gva, n8, n9, gva, false);
            }
            final mb2 b = wab.B;
            final igf p5 = androidx.compose.foundation.layout.b.p(igf, 16.0f);
            final boolean f94 = gva.f((Object)j);
            final Object r = gva.R();
            Object o;
            if (f94 || (o = r) == bi6.a) {
                o = new y8(j, (byte)28);
                gva.q0(o);
            }
            final igf a = wsk.a(p5, (lta)o);
            final moe c = rj2.c((gx)b, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, a);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b2);
            hia.t(n6 >> 6 & 0xE, ye6, gva, true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new vm(n, (Object)f93, (Object)igf, (Object)ye6, (byte)10);
        }
    }
    
    public static final void m(final int n, final long n2, final gva gva) {
        gva.i0(-2010613789);
        int n3;
        if (gva.e(n2)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        final int n4 = n3 | n;
        if (gva.W(n4 & 0x1, (n4 & 0x3) != 0x2)) {
            rj2.a(zn2.l(androidx.compose.foundation.layout.b.p((igf)fgf.v, 8.0f), 1.5f, n2, (aql)ovj.a), gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ly2(n2, n, (byte)1);
        }
    }
    
    public static final void n(final efo efo, final zeo zeo, final Object o, final Object o2, final bfa bfa, final gva gva, final int n) {
        gva.i0(867041821);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)efo)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.f((Object)zeo)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            boolean b;
            if ((n & 0x200) == 0x0) {
                b = gva.f(o);
            }
            else {
                b = gva.h(o);
            }
            int n7;
            if (b) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            boolean b2;
            if ((n & 0x1000) == 0x0) {
                b2 = gva.f(o2);
            }
            else {
                b2 = gva.h(o2);
            }
            int n9;
            if (b2) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n & 0x6000) == 0x0) {
            boolean b3;
            if ((0x8000 & n) == 0x0) {
                b3 = gva.f((Object)bfa);
            }
            else {
                b3 = gva.h((Object)bfa);
            }
            int n11;
            if (b3) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        if (gva.W(n10 & 0x1, (n10 & 0x2493) != 0x2492)) {
            if (efo.h()) {
                zeo.g(o, o2, bfa);
            }
            else {
                zeo.h(o2, bfa, null, null);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new gf0((Object)efo, (Object)zeo, o, o2, (Object)bfa, n, (byte)4);
        }
    }
    
    public static final void o(final int n, final gva gva) {
        gva.i0(994377538);
        if (gva.W(n & 0x1, n != 0)) {
            final lh0 r0 = lh0.R0;
            final cy4 a = qy4.a;
            o50.e(r0, null, null, d93.w, qy4.a(gva).a.d(), gva, 3120, 4);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new o93(n, (byte)0);
        }
    }
    
    public static final bnf p(final llf llf, final gva gva, int n) {
        final Object r = gva.R();
        final cib a = bi6.a;
        Object q = r;
        if (r == a) {
            q = o50.Q(Boolean.FALSE);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        if ((((n & 0xE) ^ 0x6) > 4 && gva.f((Object)llf)) || (n & 0x6) == 0x4) {
            n = 1;
        }
        else {
            n = 0;
        }
        final Object r2 = gva.R();
        Object o;
        if (n != 0 || (o = r2) == a) {
            o = new qt8(llf, bnf, (f07)null, (byte)1);
            gva.q0(o);
        }
        mlc.f((zta)o, gva, llf);
        return bnf;
    }
    
    public static xao q(final int n, final int n2, long n3, final gva gva) {
        if ((n2 & 0x1) != 0x0) {
            n3 = ((e8e)gva.j((sei)h8e.a)).a.n;
        }
        final hng a = yao.a;
        final cy4 a2 = qy4.a;
        return yao.d(n3, n3, qy4.a(gva).P, ((j86)gva.j((sei)dx6.a)).a, qy4.a(gva).P, gva, 32);
    }
    
    public static final int r(final float n, final float n2, final float n3, int n4, int n5) {
        if (n4 == n5) {
            return -1;
        }
        if ((n5 = n4 - 2) < 0) {
            n5 = 0;
        }
        final float n6 = (float)n5;
        n5 = 1;
        if (--n4 > 1) {
            n4 = n5;
        }
        return k8e.H(n3 * n4 + (n2 * n6 + n));
    }
    
    public static final efo s(final efo efo, final Object o, final Object o2, final String s, final gva gva, final int n) {
        final int n2 = (n & 0xE) ^ 0x6;
        final boolean b = true;
        final boolean b2 = (n2 > 4 && gva.f((Object)efo)) || (n & 0x6) == 0x4;
        final Object r = gva.R();
        final cib a = bi6.a;
        efo efo2;
        if (b2 || (efo2 = (efo)r) == a) {
            efo2 = new efo(new enf(o), efo, smk.t(efo.c, " > ", s));
            gva.q0((Object)efo2);
        }
        final efo efo3 = efo2;
        boolean b3 = false;
        Label_0155: {
            if (n2 > 4) {
                b3 = b;
                if (gva.f((Object)efo)) {
                    break Label_0155;
                }
            }
            b3 = ((n & 0x6) == 0x4 && b);
        }
        final boolean f = gva.f((Object)efo3);
        final Object r2 = gva.R();
        Object o3;
        if ((f | b3) || (o3 = r2) == a) {
            o3 = new tyl((Object)efo, (Object)efo3, (byte)13);
            gva.q0(o3);
        }
        mlc.a(efo3, (lta)o3, gva);
        if (efo.h()) {
            efo3.l(o, o2);
            return efo3;
        }
        efo3.s(o2);
        efo3.l.setValue((Object)Boolean.FALSE);
        return efo3;
    }
    
    public static final veo t(final efo efo, final elo elo, String s, final gva gva, final int n, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            s = "DeferredAnimation";
        }
        final boolean f = gva.f((Object)efo);
        final Object r = gva.R();
        final cib a = bi6.a;
        veo veo;
        if (f || (veo = (veo)r) == a) {
            veo = new veo(efo, elo, s);
            gva.q0((Object)veo);
        }
        final veo veo2 = veo;
        final boolean f2 = gva.f((Object)efo);
        final boolean h = gva.h((Object)veo2);
        final Object r2 = gva.R();
        Object o;
        if ((f2 | h) || (o = r2) == a) {
            o = new tyl((Object)efo, (Object)veo2, (byte)14);
            gva.q0(o);
        }
        mlc.a(veo2, (lta)o, gva);
        if (efo.h()) {
            final ueo ueo = (ueo)veo2.b.getValue();
            if (ueo != null) {
                final efo c = veo2.c;
                ueo.v.g(ueo.x.b(c.f().d()), ueo.x.b(c.f().h()), (bfa)ueo.w.b(c.f()));
            }
        }
        return veo2;
    }
    
    public static final zeo u(final efo efo, Object o, Object r, final bfa bfa, final dlo dlo, final gva gva, final int n) {
        final int n2 = n & 0xE;
        final int n3 = n2 ^ 0x6;
        final boolean b = true;
        final boolean b2 = (n3 > 4 && gva.f((Object)efo)) || (n & 0x6) == 0x4;
        Object o2 = gva.R();
        final cib a = bi6.a;
        Label_0168: {
            if (!b2 && o2 != a) {
                final Object o3 = o2;
                break Label_0168;
            }
            final r7m a2 = q7m.a();
            if (a2 != null) {
                o2 = a2.e();
            }
            else {
                o2 = null;
            }
            final r7m b3 = q7m.b(a2);
            try {
                final ig0 ig0 = (ig0)dlo.a().b(r);
                ig0.d();
                final Object o3 = new zeo(efo, o, ig0, dlo);
                q7m.d(a2, b3, (lta)o2);
                gva.q0(o3);
                final zeo zeo = (zeo)o3;
                final int n4 = n >> 3 & 0x8;
                final int n5 = n << 3;
                n(efo, zeo, o, r, bfa, gva, n2 | n4 << 6 | (n5 & 0x380) | n4 << 9 | (n5 & 0x1C00) | (0xE000 & n5));
                boolean b4 = false;
                Label_0274: {
                    if (n3 > 4) {
                        b4 = b;
                        if (gva.f((Object)efo)) {
                            break Label_0274;
                        }
                    }
                    b4 = ((n & 0x6) == 0x4 && b);
                }
                final boolean f = gva.f((Object)zeo);
                r = gva.R();
                if ((f | b4) || (o = r) == a) {
                    o = new tyl((Object)efo, (Object)zeo, (byte)16);
                    gva.q0(o);
                }
                mlc.a(zeo, (lta)o, gva);
                return zeo;
            }
            finally {
                q7m.d(a2, b3, (lta)o2);
            }
        }
    }
    
    public static final int v(int n, final int n2, final int n3, final int n4, final byte[] array) {
        n = n3 * 2 * n2 + n + n4;
        return array[n2 + n] << 8 | (array[n] & 0xFF);
    }
    
    public static final int w(final int n, final int n2, final int n3, final int n4, final byte[] array) {
        return array[n4 - 2 + (n3 * 4 + n)] * n2;
    }
    
    public static final int x(final byte[] array, final z3j z3j) {
        final int v = z3j.v;
        final int v2 = v + 1;
        z3j.v = v2;
        final byte b = array[v];
        z3j.v = v + 2;
        return (array[v2] & 0xFF) << 8 | (b & 0xFF);
    }
    
    public static final Object y(final jja jja, xd3 w, boolean b, f07 o) {
        Object o2 = null;
        Label_0053: {
            if (o instanceof mja) {
                o2 = o;
                final int a = ((mja)o2).A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    ((mja)o2).A = a + Integer.MIN_VALUE;
                    break Label_0053;
                }
            }
            o2 = new h07((f07)o);
        }
        Object o3 = ((mja)o2).z;
        final int a2 = ((mja)o2).A;
        final pc7 v = pc7.v;
        Label_0188: {
            if (a2 == 0) {
                break Label_0188;
            }
            Label_0150: {
                if (a2 == 1) {
                    break Label_0150;
                }
                Label_0142: {
                    if (a2 != 2) {
                        break Label_0142;
                    }
                    b = ((mja)o2).y;
                    Object x = ((mja)o2).x;
                    Object w2 = ((mja)o2).w;
                    jja v2 = ((mja)o2).v;
                    o = w2;
                    boolean b2 = b;
                    Label_0216: {
                        try {
                            vt4.g0(o3);
                            Label_0124: {
                                o = x;
                            }
                            final jja v3 = v2;
                            w = (xd3)w2;
                            final Object iterator = o;
                            break Label_0216;
                        }
                        finally {
                            try {}
                            finally {
                                if (b2) {
                                    vt4.s((xd3)o, (Throwable)jja);
                                }
                            }
                            return v;
                            Label_0297: {
                                w2 = w;
                            }
                            final Object iterator;
                            x = iterator;
                            final jja v3;
                            v2 = v3;
                        Block_12_Outer:
                            while (true) {
                                iftrue(Label_0417:)(!(boolean)o3);
                                while (true) {
                                    Block_11: {
                                        break Block_11;
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                        Label_0428:
                                        return lqo.a;
                                        ((xd3)w2).g((CancellationException)null);
                                        return lqo.a;
                                    }
                                    final Object c = ((en2)x).c();
                                    ((mja)o2).v = v2;
                                    ((mja)o2).w = (xd3)w2;
                                    ((mja)o2).x = (en2)x;
                                    ((mja)o2).y = b;
                                    ((mja)o2).A = 2;
                                    o = w2;
                                    b2 = b;
                                    iftrue(Label_0124:)(v2.l(c, (f07)o2) != v);
                                    return v;
                                    Label_0417:
                                    iftrue(Label_0428:)(!b);
                                    continue;
                                }
                                b = ((mja)o2).y;
                                x = ((mja)o2).x;
                                w2 = ((mja)o2).w;
                                v2 = ((mja)o2).v;
                                vt4.g0(o3);
                                continue Block_12_Outer;
                            }
                            vt4.g0(o3);
                            iftrue(Label_0447:)(jja instanceof avn);
                            iterator = w.iterator();
                            v3 = jja;
                            ((mja)o2).v = v3;
                            ((mja)o2).w = w;
                            ((mja)o2).x = (en2)iterator;
                            ((mja)o2).y = b;
                            ((mja)o2).A = 1;
                            o3 = ((en2)iterator).b((f07)o2);
                            iftrue(Label_0297:)(o3 != v);
                            return v;
                        }
                    }
                }
            }
        }
        Label_0447: {
            throw ((avn)jja).v;
        }
    }
    
    public static boolean z(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    public Object D(final int n) {
        final zkc b = this.F().b(n);
        return b.c.getType().b(n - b.a);
    }
    
    public abstract mlf F();
    
    public Object G(final int n) {
        final zkc b = this.F().b(n);
        final int a = b.a;
        final lta key = b.c.getKey();
        if (key != null) {
            final Object b2 = key.b(n - a);
            if (b2 != null) {
                return b2;
            }
        }
        return unh.e(n);
    }
}
