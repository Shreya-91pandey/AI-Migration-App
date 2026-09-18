import java.util.Map;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import com.squareup.wire.ProtoAdapter;
import com.anthropic.claude.core.telemetry.SilentException;
import anthropic.claude.usercontent.UnknownMessage;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.CancellationException;
import java.util.LinkedHashSet;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Set;
import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import java.util.ListIterator;
import androidx.compose.ui.node.LayoutNode;
import java.util.Collection;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.types.strings.ChatId;
import android.content.Intent;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import com.google.gson.JsonIOException;
import java.io.Reader;
import java.io.StringReader;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.a;
import android.net.Uri;
import android.os.Build$VERSION;
import org.xmlpull.v1.XmlPullParser;
import android.util.Log;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import com.datadog.android.rum.DdRumContentProvider;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import kotlinx.coroutines.flow.internal.AbortFlowException;

public abstract class vt4
{
    public static final vt8 a;
    public static final ga0 b;
    public static final ygc c;
    public static final elo d;
    
    public static final Object A(ija v, final zta zta, f07 o) {
        Label_0050: {
            if (o instanceof rka) {
                final rka rka = (rka)o;
                final int y = rka.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    rka.y = y + Integer.MIN_VALUE;
                    o = rka;
                    break Label_0050;
                }
            }
            o = new h07((f07)o);
        }
        final Object x = ((rka)o).x;
        final int y2 = ((rka)o).y;
        final dxm a = j3g.a;
        Label_0202: {
            pka w = null;
            Label_0184: {
                if (y2 != 0) {
                    if (y2 == 1) {
                        w = ((rka)o).w;
                        v = (ija)((rka)o).v;
                        try {
                            g0(x);
                            break Label_0202;
                        }
                        catch (final AbortFlowException ex) {
                            break Label_0184;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                final b4j e = hia.e(x);
                e.v = a;
                final pka w2 = new pka(zta, e, (byte)0);
                try {
                    ((rka)o).v = e;
                    ((rka)o).w = w2;
                    ((rka)o).y = 1;
                    final Object a2 = v.a((jja)w2, (f07)o);
                    final pc7 v2 = pc7.v;
                    if (a2 == v2) {
                        return v2;
                    }
                    v = (ija)e;
                    break Label_0202;
                }
                catch (final AbortFlowException ex) {
                    v = (ija)e;
                    w = w2;
                }
            }
            final AbortFlowException ex;
            if (ex.v != w) {
                throw ex;
            }
            x90.u(((f07)o).getContext());
        }
        final Object v3 = ((b4j)v).v;
        if (v3 != a) {
            return v3;
        }
        oyl.i("Expected at least one element matching the predicate");
        return null;
    }
    
    public static final Object B(ija v, h07 v2) {
        Label_0046: {
            if (v2 instanceof tka) {
                final tka tka = (tka)v2;
                final int y = tka.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    tka.y = y + Integer.MIN_VALUE;
                    v2 = (h07)tka;
                    break Label_0046;
                }
            }
            v2 = new h07(v2);
        }
        final Object x = ((tka)v2).x;
        final int y2 = ((tka)v2).y;
        nka w = null;
        Label_0156: {
            if (y2 != 0) {
                if (y2 == 1) {
                    w = ((tka)v2).w;
                    v = (ija)((tka)v2).v;
                    try {
                        g0(x);
                        return ((b4j)v).v;
                    }
                    catch (final AbortFlowException ex) {
                        break Label_0156;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            final b4j e = hia.e(x);
            w = new nka(e, (byte)1);
            try {
                ((tka)v2).v = e;
                ((tka)v2).w = w;
                ((tka)v2).y = 1;
                final Object a = v.a((jja)w, (f07)v2);
                v2 = (h07)pc7.v;
                v = (ija)e;
                if (a == v2) {
                    return v2;
                }
                return ((b4j)v).v;
            }
            catch (final AbortFlowException ex) {
                v = (ija)e;
            }
        }
        final AbortFlowException ex;
        if (ex.v != w) {
            throw ex;
        }
        x90.u(v2.getContext());
        return ((b4j)v).v;
    }
    
    public static final Object C(ija v, final zta zta, h07 o) {
        Label_0050: {
            if (o instanceof uka) {
                final uka uka = (uka)o;
                final int y = uka.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    uka.y = y + Integer.MIN_VALUE;
                    o = uka;
                    break Label_0050;
                }
            }
            o = new h07((f07)o);
        }
        final Object x = ((uka)o).x;
        final int y2 = ((uka)o).y;
        pka w = null;
        Label_0172: {
            if (y2 != 0) {
                if (y2 == 1) {
                    w = ((uka)o).w;
                    v = (ija)((uka)o).v;
                    try {
                        g0(x);
                        return ((b4j)v).v;
                    }
                    catch (final AbortFlowException ex) {
                        break Label_0172;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            final b4j e = hia.e(x);
            final pka w2 = new pka(zta, e, (byte)1);
            try {
                ((uka)o).v = e;
                ((uka)o).w = w2;
                ((uka)o).y = 1;
                final Object a = v.a((jja)w2, (f07)o);
                final pc7 v2 = pc7.v;
                if (a == v2) {
                    return v2;
                }
                v = (ija)e;
                return ((b4j)v).v;
            }
            catch (final AbortFlowException ex) {
                v = (ija)e;
                w = w2;
            }
        }
        final AbortFlowException ex;
        if (ex.v != w) {
            throw ex;
        }
        x90.u(((f07)o).getContext());
        return ((b4j)v).v;
    }
    
    public static ac D(final zrc zrc) {
        Label_0108: {
            Label_0100: {
                Label_0092: {
                    String i = null;
                    String j = null;
                    String k = null;
                    Label_0053: {
                        try {
                            i = zrc.o("name").i();
                            j = zrc.o("version").i();
                            final irc o = zrc.o("build");
                            if (o != null) {
                                k = o.i();
                                break Label_0053;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0092;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0100;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0108;
                        }
                        k = null;
                    }
                    final String l = zrc.o("version_major").i();
                    i.getClass();
                    j.getClass();
                    l.getClass();
                    return new ac(i, j, k, l);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Os", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Os", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Os", (Throwable)ex3);
        return null;
    }
    
    public static xap E(final zrc zrc) {
        Label_0377: {
            Label_0368: {
                Label_0359: {
                    long f = 0L;
                    zap m = null;
                    Label_0051: {
                        try {
                            f = zrc.o("format_version").f();
                            final irc o = zrc.o("session");
                            if (o != null) {
                                m = lq6.M(o.e());
                                break Label_0051;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0359;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0368;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0377;
                        }
                        m = null;
                    }
                    final irc o2 = zrc.o("configuration");
                    qap u;
                    if (o2 != null) {
                        u = rml.u(o2.e());
                    }
                    else {
                        u = null;
                    }
                    final irc o3 = zrc.o("browser_sdk_version");
                    String i;
                    if (o3 != null) {
                        i = o3.i();
                    }
                    else {
                        i = null;
                    }
                    final irc o4 = zrc.o("sdk_name");
                    String j;
                    if (o4 != null) {
                        j = o4.i();
                    }
                    else {
                        j = null;
                    }
                    final long f2 = zrc.o("document_version").f();
                    final irc o5 = zrc.o("page_states");
                    Object o6;
                    if (o5 != null) {
                        final ArrayList v = o5.d().v;
                        final ArrayList list = new ArrayList(v.size());
                        final Iterator iterator = v.iterator();
                        while (true) {
                            o6 = list;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            list.add((Object)tbr.i(((irc)iterator.next()).e()));
                        }
                    }
                    else {
                        o6 = null;
                    }
                    final irc o7 = zrc.o("replay_stats");
                    zbp r;
                    if (o7 != null) {
                        r = rhc.r(o7.e());
                    }
                    else {
                        r = null;
                    }
                    final irc o8 = zrc.o("cls");
                    yap g;
                    if (o8 != null) {
                        g = hbr.g(o8.e());
                    }
                    else {
                        g = null;
                    }
                    final irc o9 = zrc.o("profiling");
                    xbp f3;
                    if (o9 != null) {
                        f3 = fcr.f(o9.e());
                    }
                    else {
                        f3 = null;
                    }
                    if (f == 2L) {
                        return new xap(m, u, i, j, f2, (List)o6, r, g, f3);
                    }
                    throw new IllegalStateException("Check failed.");
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Dd", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Dd", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Dd", (Throwable)ex3);
        return null;
    }
    
    public static final byte[] F(final ktf p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: iload_1        
        //     7: bipush          28
        //     9: if_icmpge       16
        //    12: iconst_0       
        //    13: newarray        B
        //    15: areturn        
        //    16: aload_0        
        //    17: getfield        ktf.a:Ljava/lang/Object;
        //    20: checkcast       Landroid/net/NetworkRequest;
        //    23: astore          6
        //    25: aload           6
        //    27: ifnonnull       34
        //    30: iconst_0       
        //    31: newarray        B
        //    33: areturn        
        //    34: new             Ljava/io/ByteArrayOutputStream;
        //    37: dup            
        //    38: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    41: astore_0       
        //    42: new             Ljava/io/ObjectOutputStream;
        //    45: astore          4
        //    47: aload           4
        //    49: aload_0        
        //    50: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    53: aload           6
        //    55: invokestatic    mkq.q:(Landroid/net/NetworkRequest;)[I
        //    58: astore          5
        //    60: aload           6
        //    62: invokestatic    mkq.n:(Landroid/net/NetworkRequest;)[I
        //    65: astore          6
        //    67: aload           4
        //    69: aload           5
        //    71: arraylength    
        //    72: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //    75: aload           5
        //    77: arraylength    
        //    78: istore_3       
        //    79: iconst_0       
        //    80: istore_1       
        //    81: iload_1        
        //    82: iload_3        
        //    83: if_icmpge       106
        //    86: aload           4
        //    88: aload           5
        //    90: iload_1        
        //    91: iaload         
        //    92: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //    95: iinc            1, 1
        //    98: goto            81
        //   101: astore          6
        //   103: goto            166
        //   106: aload           4
        //   108: aload           6
        //   110: arraylength    
        //   111: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   114: aload           6
        //   116: arraylength    
        //   117: istore_3       
        //   118: iload_2        
        //   119: istore_1       
        //   120: iload_1        
        //   121: iload_3        
        //   122: if_icmpge       140
        //   125: aload           4
        //   127: aload           6
        //   129: iload_1        
        //   130: iaload         
        //   131: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   134: iinc            1, 1
        //   137: goto            120
        //   140: aload           4
        //   142: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   145: aload_0        
        //   146: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   149: aload_0        
        //   150: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   153: astore_0       
        //   154: aload_0        
        //   155: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   158: pop            
        //   159: aload_0        
        //   160: areturn        
        //   161: astore          4
        //   163: goto            181
        //   166: aload           6
        //   168: athrow         
        //   169: astore          5
        //   171: aload           4
        //   173: aload           6
        //   175: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   178: aload           5
        //   180: athrow         
        //   181: aload           4
        //   183: athrow         
        //   184: astore          5
        //   186: aload_0        
        //   187: aload           4
        //   189: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   192: aload           5
        //   194: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  42     53     161    195    Any
        //  53     79     101    181    Any
        //  86     95     101    181    Any
        //  106    118    101    181    Any
        //  125    134    101    181    Any
        //  140    145    161    195    Any
        //  166    169    169    181    Any
        //  171    181    161    195    Any
        //  181    184    184    195    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 104 out of bounds for length 104
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
    
    public static final aql G(final eql eql, final int n) {
        final ylb k = zn2.k;
        if (n == 1) {
            return (aql)eql.e;
        }
        if (n == 2) {
            return (aql)eql.g;
        }
        if (n == 0) {
            return (aql)eql.h;
        }
        if (n == 3) {
            return (aql)j0(eql.e);
        }
        if (n == 4) {
            return (aql)eql.a;
        }
        if (n == 5) {
            return (aql)j0(eql.a);
        }
        if (n == 6) {
            return (aql)ovj.a;
        }
        if (n == 7) {
            return (aql)eql.d;
        }
        if (n == 9) {
            return (aql)eql.f;
        }
        if (n == 8) {
            final nvj d = eql.d;
            final rs8 i = cql.i;
            return (aql)nvj.b(d, (ec7)i, (ec7)null, (ec7)null, (ec7)i, 6);
        }
        if (n == 11) {
            return (aql)j0(eql.d);
        }
        if (n == 12) {
            return (aql)eql.c;
        }
        if (n != 13) {
            if (n == 14) {
                return (aql)eql.b;
            }
            if (n == 10) {
                final nvj d2 = eql.d;
                final rs8 j = cql.i;
                return (aql)nvj.b(d2, (ec7)null, (ec7)j, (ec7)j, (ec7)null, 9);
            }
        }
        return k;
    }
    
    public static int J() {
        final Integer v = DdRumContentProvider.v;
        if (v != null) {
            return v;
        }
        final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
        }
        catch (final RuntimeException ex) {
            Log.e("DdRumContentProvider", "Cannot read process importance from ActivityManager", (Throwable)ex);
        }
        final int importance = activityManager$RunningAppProcessInfo.importance;
        DdRumContentProvider.v = importance;
        return importance;
    }
    
    public static final aql L(final int n, final gva gva) {
        return G(((e8e)gva.j((sei)h8e.a)).c, n);
    }
    
    public static boolean M(final XmlPullParser xmlPullParser, final String s) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
    }
    
    public static final int N(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        en9.s(oz1.n("Could not convert ", n, " to BackoffPolicy"));
        return 0;
    }
    
    public static final int O(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (Build$VERSION.SDK_INT >= 30 && n == 5) {
            return 6;
        }
        en9.s(oz1.n("Could not convert ", n, " to NetworkType"));
        return 0;
    }
    
    public static final int P(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        en9.s(oz1.n("Could not convert ", n, " to OutOfQuotaPolicy"));
        return 0;
    }
    
    public static final x4q Q(final int n) {
        if (n == 0) {
            return x4q.v;
        }
        if (n == 1) {
            return x4q.w;
        }
        if (n == 2) {
            return x4q.x;
        }
        if (n == 3) {
            return x4q.y;
        }
        if (n == 4) {
            return x4q.z;
        }
        if (n == 5) {
            return x4q.A;
        }
        en9.s(oz1.n("Could not convert ", n, " to State"));
        return null;
    }
    
    public static final boolean R(final Uri uri) {
        return mlc.q(uri.getScheme(), "content") && uri.getAuthority() != null;
    }
    
    public static final float T(final float n, final float n2, final float n3) {
        return n3 * n2 + (1.0f - n3) * n;
    }
    
    public static final int U(final float n, final int n2, final int n3) {
        return n2 + (int)Math.round((n3 - n2) * (double)n);
    }
    
    public static final int V(final int n) {
        final int d = ge9.D(n);
        if (d != 0) {
            int n2 = 1;
            if (d != 1) {
                n2 = 2;
                if (d != 2) {
                    n2 = 3;
                    if (d != 3) {
                        n2 = 4;
                        if (d != 4) {
                            if (Build$VERSION.SDK_INT >= 30 && n == 6) {
                                return 5;
                            }
                            en9.i((Object)lmf.A(n), (Object)" to int", "Could not convert ");
                            return 0;
                        }
                    }
                }
            }
            return n2;
        }
        return 0;
    }
    
    public static final igf W(final igf igf, final lta lta) {
        return igf.E((igf)new vv6(lta));
    }
    
    public static AnyMessage X(final a a) {
        final String typeUrl = a.adapter().getTypeUrl();
        if (typeUrl != null) {
            return new AnyMessage(typeUrl, a.encodeByteString());
        }
        final us4 a2 = v4j.a((Class)a.getClass());
        final StringBuilder sb = new StringBuilder("recompile ");
        sb.append((Object)a2);
        sb.append(" to use it with AnyMessage");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static irc Y(final isc isc) {
        final int j = isc.J;
        Label_0015: {
            if (j != 2) {
                break Label_0015;
            }
            isc.J = 1;
            try {
                try {
                    final irc b = k8e.B(isc);
                    isc.e0(j);
                    return b;
                }
                finally {}
            }
            catch (final OutOfMemoryError outOfMemoryError) {}
            catch (final StackOverflowError stackOverflowError) {}
        }
        final StringBuilder sb = new StringBuilder("Failed parsing JSON source: ");
        sb.append((Object)isc);
        sb.append(" to Json");
        final OutOfMemoryError outOfMemoryError;
        throw new RuntimeException(sb.toString(), (Throwable)outOfMemoryError);
        isc.e0(j);
    }
    
    public static irc Z(String ex) {
        final StringReader stringReader = new StringReader((String)ex);
        try {
            ex = (NumberFormatException)new isc((Reader)stringReader);
            final irc y = Y((isc)ex);
            try {
                y.getClass();
                if (!(y instanceof xrc) && ((isc)ex).Y() != 10) {
                    throw new RuntimeException("Did not consume the entire document.");
                }
                return y;
            }
            catch (final NumberFormatException ex) {}
        }
        catch (final IOException ex2) {
            throw new JsonIOException((Exception)ex2);
        }
        catch (final MalformedJsonException | NumberFormatException ex3) {}
        throw new RuntimeException((Throwable)ex);
    }
    
    public static final void a(final efo efo, igf v, final lta lta, gx x, lta lta2, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(511725103);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)efo)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x1;
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
        if ((n & 0x180) == 0x0) {
            int n8;
            if (gva.h((Object)lta)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n6 |= n8;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0218: {
            int n10;
            if (n9 != 0) {
                n10 = (n6 | 0xC00);
            }
            else {
                n10 = n6;
                if ((n & 0xC00) == 0x0) {
                    int n11;
                    if (gva.f((Object)x)) {
                        n11 = 2048;
                    }
                    else {
                        n11 = 1024;
                    }
                    n12 = (n6 | n11);
                    break Label_0218;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0288: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0x6000);
            }
            else {
                n14 = n12;
                if ((n & 0x6000) == 0x0) {
                    int n15;
                    if (gva.h((Object)lta2)) {
                        n15 = 16384;
                    }
                    else {
                        n15 = 8192;
                    }
                    n16 = (n12 | n15);
                    break Label_0288;
                }
            }
            n16 = n14;
        }
        if ((n & 0x30000) == 0x0) {
            int n17;
            if (gva.h((Object)ye6)) {
                n17 = 131072;
            }
            else {
                n17 = 65536;
            }
            n16 |= n17;
        }
        gx gx;
        lta lta4;
        if (gva.W(n16 & 0x1, (0x12493 & n16) != 0x12492)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            if (n9 != 0) {
                x = (gx)wab.x;
            }
            final cib a = bi6.a;
            if (n13 != 0) {
                Object o;
                if ((o = gva.R()) == a) {
                    o = q10.z;
                    gva.q0(o);
                }
                lta2 = (lta)o;
            }
            Object o2;
            if ((o2 = gva.R()) == a) {
                o2 = n10.z;
                gva.q0(o2);
            }
            c(efo, v, lta, x, lta2, (lta)o2, ye6, gva, (n16 & 0xE) | 0x30000 | (n16 & 0x70) | (n16 & 0x380) | (n16 & 0x1C00) | (0xE000 & n16) | (n16 << 3 & 0x380000));
            final lta lta3 = lta2;
            gx = x;
            lta4 = lta3;
        }
        else {
            gva.Z();
            final gx gx2 = x;
            lta4 = lta2;
            gx = gx2;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new td0(efo, v, lta, gx, lta4, ye6, n, n2);
        }
    }
    
    public static kcg a0(final Intent intent) {
        final String a = rhc.A(intent, "com.anthropic.claude.intent.extra.CHAT_ID");
        final String s = null;
        if (a != null) {
            String a2 = rhc.A(intent, "com.anthropic.claude.intent.extra.PROJECT_ID");
            String a3 = rhc.A(intent, "com.anthropic.claude.intent.extra.SOURCE");
            String a4 = rhc.A(intent, "com.anthropic.claude.intent.extra.ARTIFACT_IDENTIFIER");
            String w = rhc.w(intent, "com.anthropic.claude.intent.extra.ACCOUNT_ID");
            if (w == null) {
                w = null;
            }
            String w2 = rhc.w(intent, "com.anthropic.claude.intent.extra.ORGANIZATION_ID");
            if (w2 == null) {
                w2 = null;
            }
            if (a2 == null) {
                a2 = null;
            }
            if (a3 == null) {
                a3 = null;
            }
            if (a4 == null) {
                a4 = null;
            }
            final String a5 = rhc.A(intent, "com.anthropic.claude.intent.extra.FEATURE_CATEGORY");
            String b = s;
            if (a5 != null) {
                final j2g e = cbr.e(a5);
                b = s;
                if (e != null) {
                    b = e.b();
                }
            }
            return new kcg(a, w, w2, a2, a3, a4, b);
        }
        final Uri data = intent.getData();
        if (data != null && data.getPathSegments().size() >= 2 && mlc.q(data.getPathSegments().get(0), "chat")) {
            final hx3 companion = ChatId.Companion;
            final Object value = data.getPathSegments().get(1);
            value.getClass();
            final String s2 = (String)value;
            companion.getClass();
            String p = tjq.p(s2);
            if (p == null) {
                p = null;
            }
            if (p != null) {
                return new kcg(110, p, (String)null, (String)null);
            }
        }
        return null;
    }
    
    public static final void b(final Object o, igf v, lta lta, gx x, String s, lta lta2, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(1501828832);
        int n4;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f(o);
            }
            else {
                b = gva.h(o);
            }
            int n3;
            if (b) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0136: {
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
                    n8 = (n4 | n7);
                    break Label_0136;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0204: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x180) == 0x0) {
                    int n11;
                    if (gva.h((Object)lta)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0204;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0273: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0xC00) == 0x0) {
                    int n15;
                    if (gva.f((Object)x)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0273;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0343: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n & 0x6000) == 0x0) {
                    int n19;
                    if (gva.f((Object)s)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0343;
                }
            }
            n20 = n18;
        }
        final int n21 = n2 & 0x20;
        int n24 = 0;
        Label_0413: {
            int n22;
            if (n21 != 0) {
                n22 = (n20 | 0x30000);
            }
            else {
                n22 = n20;
                if ((0x30000 & n) == 0x0) {
                    int n23;
                    if (gva.h((Object)lta2)) {
                        n23 = 131072;
                    }
                    else {
                        n23 = 65536;
                    }
                    n24 = (n20 | n23);
                    break Label_0413;
                }
            }
            n24 = n22;
        }
        if ((0x180000 & n) == 0x0) {
            int n25;
            if (gva.h((Object)ye6)) {
                n25 = 1048576;
            }
            else {
                n25 = 524288;
            }
            n24 |= n25;
        }
        if (gva.W(n24 & 0x1, (0x92493 & n24) != 0x92492)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            final cib a = bi6.a;
            if (n9 != 0) {
                Object o2;
                if ((o2 = gva.R()) == a) {
                    o2 = q10.y;
                    gva.q0(o2);
                }
                lta = (lta)o2;
            }
            if (n13 != 0) {
                x = (gx)wab.x;
            }
            if (n17 != 0) {
                s = "AnimatedContent";
            }
            if (n21 != 0) {
                Object o3;
                if ((o3 = gva.R()) == a) {
                    o3 = n10.y;
                    gva.q0(o3);
                }
                lta2 = (lta)o3;
            }
            final efo z = xp7.Z(o, s, gva, (n24 & 0xE) | (n24 >> 9 & 0x70), 0);
            final int n26 = n24 >> 3;
            a(z, v, lta, x, lta2, ye6, gva, (n24 & 0x1FF0) | (0xE000 & n26) | (n26 & 0x70000), 0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = new sd0(o, v, lta, x, s, lta2, ye6, n, n2);
        }
    }
    
    public static final void b0(final KSerializer kSerializer) {
        if (!(kSerializer.getDescriptor().b() instanceof mfh)) {
            return;
        }
        en9.s("Pass the event as its concrete class: an interface or abstract event type has no single serializer (track each if/when branch separately).");
    }
    
    public static final void c(final efo efo, final igf igf, final lta lta, final gx b, final lta lta2, final lta lta3, final ye6 ye6, final gva gva, final int n) {
        final r1 a = efo.a;
        gva.i0(1935038908);
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
            if (gva.h((Object)lta)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.f((Object)b)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n & 0x6000) == 0x0) {
            int n11;
            if (gva.h((Object)lta2)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((0x30000 & n) == 0x0) {
            int n13;
            if (gva.h((Object)lta3)) {
                n13 = 131072;
            }
            else {
                n13 = 65536;
            }
            n12 = (n10 | n13);
        }
        int n14 = n12;
        if ((0x180000 & n) == 0x0) {
            int n15;
            if (gva.h((Object)ye6)) {
                n15 = 1048576;
            }
            else {
                n15 = 524288;
            }
            n14 = (n12 | n15);
        }
        if (gva.W(n14 & 0x1, (0x92493 & n14) != 0x92492)) {
            final qzc c = (qzc)gva.j((sei)hm6.n);
            final int n16 = n14 & 0xE;
            final boolean b2 = n16 == 4;
            final Object r = gva.R();
            final cib a2 = bi6.a;
            le0 le0;
            if (b2 || (le0 = (le0)r) == a2) {
                le0 = new le0(efo, b, c);
                gva.q0((Object)le0);
            }
            final le0 le2 = le0;
            final boolean b3 = n16 == 4;
            Object r2 = gva.R();
            if (b3 || r2 == a2) {
                final Object i = a.i();
                r2 = new v8m();
                ((v8m)r2).addAll((Collection)iw0.m1(new Object[] { i }));
                gva.q0(r2);
            }
            final v8m v8m = (v8m)r2;
            final ksg e = efo.e;
            final ksg d = efo.d;
            final Object value = e.getValue();
            final boolean b4 = n16 == 4;
            final boolean f = gva.f(value);
            final Object r3 = gva.R();
            tmf tmf;
            if ((f | b4) || (tmf = (tmf)r3) == a2) {
                final long[] a3 = jak.a;
                tmf = new tmf();
                gva.q0((Object)tmf);
            }
            final tmf tmf2 = tmf;
            if (!v8m.contains(a.i())) {
                v8m.clear();
                v8m.add(a.i());
            }
            if (mlc.q(a.i(), d.getValue()) && e.getValue() == null) {
                if (v8m.size() != 1 || !mlc.q(v8m.get(0), a.i())) {
                    v8m.clear();
                    v8m.add(a.i());
                }
                if (tmf2.e != 1 || tmf2.c(a.i())) {
                    tmf2.a();
                }
                le2.b = b;
                le2.c = c;
            }
            final Object value2 = e.getValue();
            int n19;
            if (value2 != null && !value2.equals(a.i())) {
                final ListIterator listIterator = v8m.listIterator();
                int n17 = 0;
                int n18;
                while (true) {
                    final xgd xgd = (xgd)listIterator;
                    if (!xgd.hasNext()) {
                        n18 = -1;
                        break;
                    }
                    if (mlc.q(lta2.b(xgd.next()), lta2.b(value2))) {
                        n18 = n17;
                        break;
                    }
                    ++n17;
                }
                if (n18 == -1) {
                    v8m.add(value2);
                    n19 = n14;
                }
                else {
                    n19 = n14;
                    if (!mlc.q(v8m.get(n18), value2)) {
                        v8m.set(n18, value2);
                        n19 = n14;
                    }
                }
            }
            else {
                n19 = n14;
            }
            Label_1080: {
                if (!mlc.q(a.i(), d.getValue())) {
                    final ListIterator listIterator2 = v8m.listIterator();
                    int n20 = 0;
                    while (true) {
                        Label_0989: {
                            while (true) {
                                final xgd xgd2 = (xgd)listIterator2;
                                if (!xgd2.hasNext()) {
                                    break Label_0989;
                                }
                                if (mlc.q(lta2.b(xgd2.next()), lta2.b(d.getValue()))) {
                                    break;
                                }
                                ++n20;
                            }
                            if (n20 == -1) {
                                v8m.add(d.getValue());
                                break Label_1080;
                            }
                            if (!mlc.q(v8m.get(n20), d.getValue()) || n20 != v8m.size() - 1) {
                                mlc.q(d.getValue(), v8m.get(n20));
                                v8m.remove(n20);
                                v8m.add(d.getValue());
                            }
                            break Label_1080;
                        }
                        n20 = -1;
                        continue;
                    }
                }
            }
            final Object value3 = e.getValue();
            final boolean f2 = gva.f(value3);
            final Object r4 = gva.R();
            xxg xxg;
            if (f2 || (xxg = (xxg)r4) == a2) {
                if (value3 != null) {
                    xxg = new xxg(le2, d.getValue(), value3);
                }
                else {
                    xxg = null;
                }
                gva.q0((Object)xxg);
            }
            final xxg xxg2 = xxg;
            final boolean f3 = gva.f((Object)xxg2);
            final boolean b5 = (n19 & 0x70000) == 0x20000;
            Object r5 = gva.R();
            if ((f3 | b5) || r5 == a2) {
                if (xxg2 != null && lta3.b(xxg2) != null) {
                    fvd.c();
                    return;
                }
                gva.q0((Object)null);
                r5 = null;
            }
            if (r5 != null) {
                fvd.c();
                return;
            }
            int n21;
            le0 le3;
            v8m v8m3;
            if (!tmf2.b(d.getValue()) || !tmf2.b(a.i()) || (value3 != null && !tmf2.b(value3))) {
                n21 = 0;
                gva.g0(-302069574);
                tmf2.a();
                final int size = v8m.size();
                int j = 0;
                final v8m v8m2 = v8m;
                final xxg xxg3 = xxg2;
                while (j < size) {
                    final Object value4 = v8m2.get(j);
                    tmf2.m(value4, uuj.t0(427839334, new zd0(value4, efo, xxg3, lta, le2, v8m2, ye6), gva));
                    ++j;
                }
                gva.q((boolean)(n21 != 0));
                le3 = le2;
                v8m3 = v8m2;
            }
            else {
                gva.g0(-297322234);
                gva.q(false);
                n21 = 0;
                final le0 le4 = le2;
                v8m3 = v8m;
                le3 = le4;
            }
            final xeo f4 = efo.f();
            final Object value5 = e.getValue();
            final boolean f5 = gva.f((Object)le3);
            final boolean f6 = gva.f((Object)f4);
            final boolean f7 = gva.f(value5);
            final Object r6 = gva.R();
            Object o;
            if ((f6 | f5 | f7) || (o = r6) == a2) {
                o = lta.b(le3);
                gva.q0(o);
            }
            final ey6 ey6 = (ey6)o;
            final efo a4 = le3.a;
            final boolean f8 = gva.f((Object)le3);
            final Object r7 = gva.R();
            Object q;
            if (f8 || (q = r7) == a2) {
                q = o50.Q(Boolean.FALSE);
                gva.q0(q);
            }
            final bnf bnf = (bnf)q;
            final bnf w = o50.W(ey6.d, gva);
            if (mlc.q(a4.a.i(), a4.d.getValue())) {
                bnf.setValue((Object)Boolean.FALSE);
            }
            else if (((xom)w).getValue() != null) {
                bnf.setValue((Object)Boolean.TRUE);
            }
            final boolean booleanValue = (boolean)((xom)bnf).getValue();
            Object o2 = fgf.v;
            veo veo;
            if (booleanValue) {
                gva.g0(1353077497);
                final veo t = xp7.t(le3.a, yi2.l, null, gva, 0, 2);
                final boolean f9 = gva.f((Object)t);
                final Object r8 = gva.R();
                igf igf2;
                if (f9 || (igf2 = (igf)r8) == a2) {
                    final o0m o0m = (o0m)((xom)w).getValue();
                    if (o0m == null || o0m.a) {
                        o2 = rml.l((igf)o2);
                    }
                    gva.q0(o2);
                    igf2 = (igf)o2;
                }
                o2 = igf2;
                gva.q((boolean)(n21 != 0));
                veo = t;
            }
            else {
                gva.g0(1353343539);
                gva.q((boolean)(n21 != 0));
                veo = null;
                le3.f = null;
            }
            final igf e2 = igf.E(((igf)o2).E((igf)new ge0<Object>(veo, w, le3)));
            Object r9;
            if ((r9 = gva.R()) == a2) {
                r9 = new ce0(le3);
                gva.q0(r9);
            }
            final ce0 ce0 = (ce0)r9;
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b6 = ien.B(gva, e2);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, ce0);
            k8e.P((zta)awp.z, gva, l);
            k8e.x(gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b6);
            gva.g0(758586195);
            for (int size2 = v8m3.size(), k = n21; k < size2; ++k) {
                final Object value6 = v8m3.get(k);
                gva.d0(1420119555, lta2.b(value6));
                final zta zta = (zta)tmf2.g(value6);
                if (zta == null) {
                    gva.g0(1074069702);
                }
                else {
                    ge9.B(gva, 1420120731, n21, zta, gva);
                }
                gva.q((boolean)(n21 != 0));
                gva.q((boolean)(n21 != 0));
            }
            gva.q((boolean)(n21 != 0));
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = new ud0(efo, igf, lta, b, lta2, lta3, ye6, n);
        }
    }
    
    public static final void c0(final x4 x4, final zsk zsk) {
        final AccessibilityNodeInfo a = x4.a;
        final Object g = zsk.k().v.g(etk.f);
        final Object o = null;
        Object o2 = g;
        if (g == null) {
            o2 = null;
        }
        final u76 u76 = (u76)o2;
        if (u76 != null) {
            a.setCollectionInfo((AccessibilityNodeInfo$CollectionInfo)v4.a(u76.a, u76.b).a);
            return;
        }
        final ArrayList list = new ArrayList();
        Object g2 = zsk.k().v.g(etk.e);
        if (g2 == null) {
            g2 = o;
        }
        if (g2 != null) {
            final List j = zsk.j(4, zsk);
            for (int size = ((Collection)j).size(), i = 0; i < size; ++i) {
                final zsk zsk2 = (zsk)j.get(i);
                if (zsk2.k().v.c(etk.K)) {
                    list.add((Object)zsk2);
                }
            }
        }
        if (!list.isEmpty()) {
            final boolean q = q(list);
            int size2 = 1;
            int size3;
            if (q) {
                size3 = 1;
            }
            else {
                size3 = list.size();
            }
            if (q) {
                size2 = list.size();
            }
            a.setCollectionInfo((AccessibilityNodeInfo$CollectionInfo)v4.a(size3, size2).a);
        }
    }
    
    public static final void d(final boolean b, final lta lta, final zta zta, final lta lta2, final zta zta2, igf v, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(-2062375241);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.g(b)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        int n5 = n4;
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.h((Object)lta)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7;
        if (gva.h((Object)zta)) {
            n7 = 256;
        }
        else {
            n7 = 128;
        }
        int n8 = n5 | n7;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.h((Object)lta2)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 |= n9;
        }
        int n10;
        if (gva.h((Object)zta2)) {
            n10 = 16384;
        }
        else {
            n10 = 8192;
        }
        final int n11 = n8 | n10;
        final int n12 = n2 & 0x20;
        int n13;
        if (n12 != 0) {
            n13 = (n11 | 0x30000);
        }
        else {
            int n14;
            if (gva.f((Object)v)) {
                n14 = 131072;
            }
            else {
                n14 = 65536;
            }
            n13 = (n11 | n14);
        }
        if (gva.W(n13 & 0x1, (0x92493 & n13) != 0x92492)) {
            if (n12 != 0) {
                v = (igf)fgf.v;
            }
            final Object r = gva.R();
            final cib a = bi6.a;
            Object q;
            if ((q = r) == a) {
                q = o50.Q(Boolean.FALSE);
                gva.q0(q);
            }
            final bnf bnf = (bnf)q;
            Object o;
            if ((o = gva.R()) == a) {
                o = o50.Q(null);
                gva.q0(o);
            }
            final bnf bnf2 = (bnf)o;
            Object r2;
            if ((r2 = gva.R()) == a) {
                r2 = new jy1(bnf, (byte)7);
                gva.q0(r2);
            }
            final lta lta3 = (lta)r2;
            Object r3;
            if ((r3 = gva.R()) == a) {
                r3 = new jy1(bnf2, (byte)8);
                gva.q0(r3);
            }
            final lta lta4 = (lta)r3;
            final Context context = (Context)gva.j((sei)q50.b);
            final bnf w = o50.W(lta3, gva);
            final bnf w2 = o50.W(lta4, gva);
            final bnf w3 = o50.W(zta, gva);
            final bnf w4 = o50.W(zta2, gva);
            final bnf w5 = o50.W(lta2, gva);
            final bnf w6 = o50.W(lta, gva);
            final bnf w7 = o50.W(b, gva);
            Object r4;
            if ((r4 = gva.R()) == a) {
                r4 = new wt8(w, w2, w7, context, w6, w3, w5, w4);
                gva.q0(r4);
            }
            final wt8 wt8 = (wt8)r4;
            final boolean b2 = (n13 & 0x70) == 0x20;
            final Object r5 = gva.R();
            Object o2;
            if (b2 || (o2 = r5) == a) {
                o2 = new tt8((Object)lta, (Object)bnf2, (byte)1);
                gva.q0(o2);
            }
            final igf e = lq6.F(v, (lta)o2).E(new kvi((lvi)wt8));
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b3 = ien.B(gva, e);
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
            k8e.P((zta)awp.y, gva, b3);
            ye6.d((Object)gva, (Object)6);
            final hu8 hu8 = (hu8)((xom)bnf2).getValue();
            if ((boolean)((xom)bnf).getValue() && b && hu8 != null) {
                gva.g0(936209139);
                g(6, gva, hu8.b > 0);
                gva.q(false);
            }
            else {
                gva.g0(936349445);
                gva.q(false);
            }
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new fl6(b, lta, zta, lta2, zta2, v, ye6, n, n2);
        }
    }
    
    public static final void d0(final x4 x4, final zsk zsk) {
        final Object g = zsk.k().v.g(etk.g);
        final u76 u76 = null;
        Object o = g;
        if (g == null) {
            o = null;
        }
        final v76 v76 = (v76)o;
        if (v76 != null) {
            final int b = v76.b();
            final int a = v76.a();
            Object o2;
            if ((o2 = zsk.k().v.g(etk.K)) == null) {
                o2 = Boolean.FALSE;
            }
            x4.i(w4.c((boolean)o2, b, 1, a, 1));
        }
        final zsk l = zsk.l();
        if (l != null) {
            Object g2;
            if ((g2 = l.k().v.g(etk.e)) == null) {
                g2 = null;
            }
            if (g2 != null) {
                Object g3 = l.k().v.g(etk.f);
                if (g3 == null) {
                    g3 = u76;
                }
                final u76 u77 = (u76)g3;
                if (u77 != null) {
                    if (u77.a < 0) {
                        return;
                    }
                    if (u77.b < 0) {
                        return;
                    }
                }
                if (zsk.k().v.c(etk.K)) {
                    final ArrayList list = new ArrayList();
                    final List j = zsk.j(4, l);
                    final int size = ((Collection)j).size();
                    final int n = 0;
                    int i = 0;
                    int n2 = 0;
                    while (i < size) {
                        final zsk zsk2 = (zsk)j.get(i);
                        final tsk k = zsk2.k();
                        final htk m = etk.K;
                        int n3 = n2;
                        if (k.v.c(m)) {
                            list.add((Object)zsk2);
                            n3 = n2;
                            if (zsk2.c.H() < zsk.c.H()) {
                                n3 = n2 + 1;
                            }
                        }
                        ++i;
                        n2 = n3;
                    }
                    if (!list.isEmpty()) {
                        final boolean q = q(list);
                        int n4;
                        if (q) {
                            n4 = 0;
                        }
                        else {
                            n4 = n2;
                        }
                        int n5 = n;
                        if (q) {
                            n5 = n2;
                        }
                        Object o3;
                        if ((o3 = zsk.k().v.g(etk.K)) == null) {
                            o3 = Boolean.FALSE;
                        }
                        x4.i(w4.c((boolean)o3, n4, 1, n5, 1));
                    }
                }
            }
        }
    }
    
    public static final void e(final xy6 xy6, final jta jta, igf v, final lta lta, final gva gva, final int n) {
        gva.i0(-195055274);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)xy6)) {
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
            if (gva.h((Object)jta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n7;
        final int n6 = n7 = (n4 | 0x180);
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)lta)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n6 | n8);
        }
        if (gva.W(n7 & 0x1, (n7 & 0x493) != 0x492)) {
            final wy6 wy6 = (wy6)xy6.a.getValue();
            if (!(wy6 instanceof vy6)) {
                final b0j v2 = gva.v();
                if (v2 != null) {
                    v2.d = (zta)new wf0(xy6, jta, lta, n);
                }
                return;
            }
            else {
                final vy6 vy6 = (vy6)wy6;
                final boolean f = gva.f((Object)vy6);
                final Object r = gva.R();
                ry6 ry6;
                if (f || (ry6 = (ry6)r) == bi6.a) {
                    ry6 = new ry6(zrn.R(vy6.a()));
                    gva.q0((Object)ry6);
                }
                yy6.e((sgh)ry6, jta, lta, gva, n7 & 0x1FF0);
                v = (igf)fgf.v;
            }
        }
        else {
            gva.Z();
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new el6((Object)xy6, (aua)jta, v, (Object)lta, n, (byte)1);
        }
    }
    
    public static final byte[] e0(final Set p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface java/util/Set.isEmpty:()Z
        //     6: ifeq            13
        //     9: iconst_0       
        //    10: newarray        B
        //    12: areturn        
        //    13: new             Ljava/io/ByteArrayOutputStream;
        //    16: dup            
        //    17: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    20: astore_1       
        //    21: new             Ljava/io/ObjectOutputStream;
        //    24: astore_2       
        //    25: aload_2        
        //    26: aload_1        
        //    27: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    30: aload_2        
        //    31: aload_0        
        //    32: invokeinterface java/util/Set.size:()I
        //    37: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //    40: aload_0        
        //    41: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    46: astore_3       
        //    47: aload_3        
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            92
        //    56: aload_3        
        //    57: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    62: checkcast       Lev6;
        //    65: astore_0       
        //    66: aload_2        
        //    67: aload_0        
        //    68: invokevirtual   ev6.a:()Landroid/net/Uri;
        //    71: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //    74: invokevirtual   java/io/ObjectOutputStream.writeUTF:(Ljava/lang/String;)V
        //    77: aload_2        
        //    78: aload_0        
        //    79: invokevirtual   ev6.b:()Z
        //    82: invokevirtual   java/io/ObjectOutputStream.writeBoolean:(Z)V
        //    85: goto            47
        //    88: astore_0       
        //    89: goto            116
        //    92: aload_2        
        //    93: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    96: aload_1        
        //    97: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   100: aload_1        
        //   101: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   104: astore_0       
        //   105: aload_0        
        //   106: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   109: pop            
        //   110: aload_0        
        //   111: areturn        
        //   112: astore_0       
        //   113: goto            126
        //   116: aload_0        
        //   117: athrow         
        //   118: astore_3       
        //   119: aload_2        
        //   120: aload_0        
        //   121: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   124: aload_3        
        //   125: athrow         
        //   126: aload_0        
        //   127: athrow         
        //   128: astore_2       
        //   129: aload_1        
        //   130: aload_0        
        //   131: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   134: aload_2        
        //   135: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  21     30     112    136    Any
        //  30     47     88     126    Any
        //  47     85     88     126    Any
        //  92     96     112    136    Any
        //  116    118    118    126    Any
        //  119    126    112    136    Any
        //  126    128    128    136    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 71 out of bounds for length 71
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
    
    public static final void f(final xy6 xy6, final jta jta, final lta lta, final igf igf, boolean b, final jta jta2, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(1195420540);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)xy6)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)jta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 |= n5;
        }
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.h((Object)lta)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n4 |= n6;
        }
        final int n7 = n4 | 0xC00;
        final int n8 = n2 & 0x10;
        int n9;
        if (n8 != 0) {
            n9 = (n4 | 0x6C00);
        }
        else {
            n9 = n7;
            if ((n & 0x6000) == 0x0) {
                int n10;
                if (gva.g(b)) {
                    n10 = 16384;
                }
                else {
                    n10 = 8192;
                }
                n9 = (n7 | n10);
            }
        }
        final int n11 = n2 & 0x20;
        int n14 = 0;
        Label_0272: {
            int n12;
            if (n11 != 0) {
                n12 = (n9 | 0x30000);
            }
            else {
                n12 = n9;
                if ((0x30000 & n) == 0x0) {
                    int n13;
                    if (gva.h((Object)jta2)) {
                        n13 = 131072;
                    }
                    else {
                        n13 = 65536;
                    }
                    n14 = (n9 | n13);
                    break Label_0272;
                }
            }
            n14 = n12;
        }
        int n15 = n14;
        if ((0x180000 & n) == 0x0) {
            int n16;
            if (gva.h((Object)ye6)) {
                n16 = 1048576;
            }
            else {
                n16 = 524288;
            }
            n15 = (n14 | n16);
        }
        Object v;
        jta jta4;
        if (gva.W(n15 & 0x1, (0x92493 & n15) != 0x92492)) {
            if (n8 != 0) {
                b = true;
            }
            final cib a = bi6.a;
            jta jta3;
            if (n11 != 0) {
                Object r;
                if ((r = gva.R()) == a) {
                    r = new cm6((byte)14);
                    gva.q0(r);
                }
                jta3 = (jta)r;
            }
            else {
                jta3 = jta2;
            }
            v = fgf.v;
            igf b4;
            if (b) {
                gva.g0(-1095188022);
                final boolean b2 = (0x70000 & n15) == 0x20000;
                final boolean b3 = (n15 & 0xE) == 0x4;
                final Object r2 = gva.R();
                Object o;
                if ((b3 | b2) || (o = r2) == a) {
                    o = new e4((Object)jta3, (Object)xy6, (byte)26);
                    gva.q0(o);
                }
                b4 = p6n.b((igf)v, (Object)y7j.y, (PointerInputEventHandler)new qy6((lta)o, (byte)0));
                gva.q(false);
            }
            else {
                gva.g0(-1095031162);
                gva.q(false);
                b4 = (igf)v;
            }
            final moe c = rj2.c((gx)wab.x, true);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b5 = ien.B(gva, b4);
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
            k8e.P((zta)awp.y, gva, b5);
            ye6.d((Object)gva, (Object)(n15 >> 18 & 0xE));
            e(xy6, jta, null, lta, gva, (n15 & 0x7E) | (n15 << 3 & 0x1C00));
            gva.q(true);
            jta4 = jta3;
        }
        else {
            gva.Z();
            jta4 = jta2;
            v = igf;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new fl6(xy6, jta, lta, (igf)v, b, jta4, ye6, n, n2);
        }
    }
    
    public static final int f0(final x4q x4q) {
        final int ordinal = ((Enum)x4q).ordinal();
        if (ordinal != 0) {
            int n = 1;
            if (ordinal != 1) {
                n = 2;
                if (ordinal != 2) {
                    n = 3;
                    if (ordinal != 3) {
                        n = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            en9.r();
                            return 0;
                        }
                    }
                }
            }
            return n;
        }
        return 0;
    }
    
    public static final void g(final int n, final gva gva, final boolean b) {
        gva.i0(-744292527);
        int n2;
        if (gva.g(b)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
            final dk2 a = dk2.a;
            final fgf v = fgf.v;
            final igf b2 = a.b((igf)v);
            final cy4 a2 = qy4.a;
            final igf h = rhc.h(b2, j86.b(0.9f, qy4.a(gva).q), zn2.k);
            final moe c = rj2.c((gx)wab.B, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b3 = ien.B(gva, h);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n4 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n4);
            }
            else {
                gva.t0();
            }
            final rg6 a3 = awp.A;
            k8e.P((zta)a3, gva, c);
            final rg6 z = awp.z;
            k8e.P((zta)z, gva, l);
            final rg6 b4 = awp.B;
            k8e.P((zta)b4, gva, hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, b3);
            final v96 a4 = u96.a((jv0)new hv0(8.0f, true, (iv0)new en9((byte)2)), (dx)wab.K, gva, 54);
            final int hashCode2 = Long.hashCode(gva.T);
            final e3h i = gva.l();
            final igf b5 = ien.B(gva, (igf)v);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n4);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a3, gva, a4);
            k8e.P((zta)z, gva, i);
            oz1.v(hashCode2, gva, b4, gva);
            k8e.P((zta)y, gva, b5);
            o50.e(lh0.C0, null, null, null, qy4.a(gva).O, gva, 48, 12);
            lmn.b(soh.S(2131756996, gva), (igf)null, 0L, 0L, (zoa)null, (una)null, 0L, (wgn)null, (kfn)null, 0L, 0, false, 0, 0, (lta)null, mnn.a((mnn)((uy4)qy4.c(gva).k.v).E, qy4.a(gva).O, 0L, (zoa)null, (soa)null, (una)null, 0L, (wgn)null, 0, 0L, (idd)null, 0, 16777214), gva, 0, 0, 131070);
            if (b) {
                gva.g0(1577208813);
                ukq.c(soh.S(2131756997, gva), (igf)null, mnn.a((mnn)((uy4)qy4.c(gva).k.v).H, qy4.a(gva).O, 0L, (zoa)null, (soa)null, (una)null, 0L, (wgn)null, 0, 0L, (idd)null, 0, 16777214), com.anthropic.claude.design.icon.a.a(lh0.Z0, gva), 1, 0L, 0.0f, qy4.a(gva).O, 0, 0, gva, 28672, 1890);
                gva.q(false);
            }
            else {
                gva.g0(1577599413);
                gva.q(false);
            }
            gva.q(true);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new au(b, n, (byte)4);
        }
    }
    
    public static final void g0(final Object o) {
        if (!(o instanceof jpj)) {
            return;
        }
        throw ((jpj)o).v;
    }
    
    public static final void h(final String s, final jta jta, final jta jta2, final jta jta3, final gva gva, final int n) {
        gva.i0(290394994);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)s)) {
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
            if (gva.h((Object)jta)) {
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
            if (gva.h((Object)jta2)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)jta3)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n6 |= n8;
        }
        if (gva.W(n6 & 0x1, (n6 & 0x493) != 0x492)) {
            xkq.c(jta3, uuj.t0(-1969157457, (aua)new r9b(jta, (byte)2), gva), (igf)null, (zta)uuj.t0(-988202643, (aua)new r9b(jta2, (byte)3), gva), (zta)uuj.t0(-7247829, (aua)new ds7(s, (byte)21), gva), (zta)null, (aql)null, 0L, 0L, 0L, 0L, (pi8)null, gva, (n6 >> 9 & 0xE) | 0x30C30, 0, 16340);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new th8((byte)3, n, (Object)s, (Object)jta, (Object)jta2, (Object)jta3);
        }
    }
    
    public static final ktf h0(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          28
        //     5: if_icmplt       164
        //     8: aload_0        
        //     9: arraylength    
        //    10: ifne            16
        //    13: goto            164
        //    16: new             Ljava/io/ByteArrayInputStream;
        //    19: dup            
        //    20: aload_0        
        //    21: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    24: astore_0       
        //    25: new             Ljava/io/ObjectInputStream;
        //    28: astore          4
        //    30: aload           4
        //    32: aload_0        
        //    33: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    36: aload           4
        //    38: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    41: istore_3       
        //    42: iload_3        
        //    43: newarray        I
        //    45: astore          6
        //    47: iconst_0       
        //    48: istore_2       
        //    49: iconst_0       
        //    50: istore_1       
        //    51: iload_1        
        //    52: iload_3        
        //    53: if_icmpge       76
        //    56: aload           6
        //    58: iload_1        
        //    59: aload           4
        //    61: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    64: iastore        
        //    65: iinc            1, 1
        //    68: goto            51
        //    71: astore          5
        //    73: goto            135
        //    76: aload           4
        //    78: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    81: istore_3       
        //    82: iload_3        
        //    83: newarray        I
        //    85: astore          5
        //    87: iload_2        
        //    88: istore_1       
        //    89: iload_1        
        //    90: iload_3        
        //    91: if_icmpge       109
        //    94: aload           5
        //    96: iload_1        
        //    97: aload           4
        //    99: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //   102: iastore        
        //   103: iinc            1, 1
        //   106: goto            89
        //   109: aload           5
        //   111: aload           6
        //   113: invokestatic    far.g:([I[I)Lktf;
        //   116: astore          5
        //   118: aload           4
        //   120: invokevirtual   java/io/ObjectInputStream.close:()V
        //   123: aload_0        
        //   124: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   127: aload           5
        //   129: areturn        
        //   130: astore          4
        //   132: goto            150
        //   135: aload           5
        //   137: athrow         
        //   138: astore          6
        //   140: aload           4
        //   142: aload           5
        //   144: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   147: aload           6
        //   149: athrow         
        //   150: aload           4
        //   152: athrow         
        //   153: astore          5
        //   155: aload_0        
        //   156: aload           4
        //   158: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   161: aload           5
        //   163: athrow         
        //   164: new             Lktf;
        //   167: dup            
        //   168: aconst_null    
        //   169: invokespecial   ktf.<init>:(Landroid/net/NetworkRequest;)V
        //   172: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  25     36     130    164    Any
        //  36     47     71     150    Any
        //  56     65     71     150    Any
        //  76     87     71     150    Any
        //  94     103    71     150    Any
        //  109    118    71     150    Any
        //  118    123    130    164    Any
        //  135    138    138    150    Any
        //  140    150    130    164    Any
        //  150    153    153    164    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 90 out of bounds for length 90
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
    
    public static final void i(final x37 x37, final String s, final jta jta, final gva gva, final int n) {
        gva.i0(-1133559848);
        int n2;
        if (gva.f((Object)x37)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)s)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)jta)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n | n2 | n3 | n4;
        final int n6 = 1;
        final boolean b = true;
        while (true) {
            Label_0630: {
                if (!gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
                    gva.Z();
                    break Label_0630;
                }
                final ezg ezg = (ezg)((xom)x37.g).getValue();
                utb d;
                b0j b0j;
                if (ezg == null) {
                    final b0j v = gva.v();
                    if (v == null) {
                        return;
                    }
                    d = new utb(x37, s, jta, n, (byte)0);
                    b0j = v;
                }
                else {
                    final int d2 = ge9.D(ezg.w);
                    final cib a = bi6.a;
                    if (d2 == 0) {
                        gva.g0(1570686542);
                        final int n7 = n5 & 0xE;
                        final boolean b2 = n7 == 4;
                        final Object r = gva.R();
                        Object o;
                        if (b2 || (o = r) == a) {
                            o = new zqb(x37, (byte)1);
                            gva.q0(o);
                        }
                        final jta jta2 = (jta)o;
                        final boolean b3 = n7 == 4;
                        final Object r2 = gva.R();
                        Object o2;
                        if (b3 || (o2 = r2) == a) {
                            o2 = new zqb(x37, (byte)2);
                            gva.q0(o2);
                        }
                        final jta jta3 = (jta)o2;
                        int n8;
                        if (n7 == 4) {
                            n8 = n6;
                        }
                        else {
                            n8 = 0;
                        }
                        final Object r3 = gva.R();
                        Object o3;
                        if (n8 != 0 || (o3 = r3) == a) {
                            o3 = new zqb(x37, (byte)3);
                            gva.q0(o3);
                        }
                        h(s, jta2, jta3, (jta)o3, gva, n5 >> 3 & 0xE);
                        gva.q(false);
                        break Label_0630;
                    }
                    if (d2 == 1) {
                        gva.g0(1570694704);
                        final int n9 = n5 & 0xE;
                        final boolean b4 = n9 == 4;
                        final Object r4 = gva.R();
                        Object o4;
                        if (b4 || (o4 = r4) == a) {
                            o4 = new w36(x37);
                            gva.q0(o4);
                        }
                        final zta zta = (zta)o4;
                        final boolean b5 = n9 == 4;
                        final Object r5 = gva.R();
                        Object o5;
                        if (b5 || (o5 = r5) == a) {
                            o5 = new zqb(x37, (byte)4);
                            gva.q0(o5);
                        }
                        p6r.c(zta, (jta)o5, (q09)jta.a(), x37.b.a() != 3 && b, gva, 0);
                        gva.q(false);
                        break Label_0630;
                    }
                    throw ge9.y(1570684945, gva, false);
                }
                b0j.d = (zta)d;
                return;
            }
            final b0j v2 = gva.v();
            if (v2 != null) {
                final utb d = new utb(x37, s, jta, n, (byte)1);
                final b0j b0j = v2;
                continue;
            }
            break;
        }
    }
    
    public static final ey6 i0(final id9 id9, final ev9 ev9) {
        return new ey6(id9, ev9, null, 12);
    }
    
    public static final void j(final ye6 ye6, final gva gva, final int n) {
        gva.i0(-709502251);
        if (gva.W(n & 0x1, (n & 0x3) != 0x2)) {
            final b09 a = w8k.a;
            final u8k u8k = (u8k)gva.j((sei)a);
            final r8k f0 = lq6.f0(gva);
            final n9k n9k = new n9k((lta)new tt8((Object)u8k, (Object)f0, (byte)9), (zta)new rg6((byte)18));
            final boolean h = gva.h((Object)u8k);
            final boolean h2 = gva.h((Object)f0);
            final Object r = gva.R();
            Object o;
            if ((h | h2) || (o = r) == bi6.a) {
                o = new nob((Object)u8k, (Object)f0, (byte)9);
                gva.q0(o);
            }
            final b6d b6d = (b6d)mlc.b0(new Object[] { u8k }, (m9k)n9k, (jta)o, gva, 0);
            c5q.c(a.a((Object)b6d), (zta)uuj.t0(-412824043, (aua)new ah0((Object)ye6, (Object)b6d, (byte)24), gva), gva, 56);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new bc3(ye6, n, (byte)7);
        }
    }
    
    public static nvj j0(final nvj nvj) {
        final rs8 i = cql.i;
        return nvj.b(nvj, (ec7)null, (ec7)null, (ec7)i, (ec7)i, 3);
    }
    
    public static o0m k(final int n) {
        boolean b = true;
        if ((n & 0x1) == 0x0) {
            b = false;
        }
        return new o0m(b, ae0.x);
    }
    
    public static final igf k0(final igf igf, final d1q d1q) {
        return igf.E((igf)new iec(d1q));
    }
    
    public static final ksg l(final rfa rfa, final uad uad) {
        final vzq vzq = (vzq)rfa.b;
        synchronized (vzq) {
            final Object c = rfa.c;
            monitorexit(vzq);
            final ksg q = o50.Q(c);
            final e0j e0j = new e0j((Object)q, (byte)15);
            final Object o = new Object();
            rhc.b0(uad, new qn1(o, (Object)rfa, (Object)e0j, (byte)24), null, null, null, null, (jta)new wfk(o, (byte)24), 30);
            return q;
        }
    }
    
    public static final v5q l0(final v5q v5q) {
        final boolean c = v5q.e.c("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        final boolean c2 = v5q.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        final boolean c3 = v5q.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!c && c2 && c3) {
            final String c4 = v5q.c;
            final ap2 ap2 = new ap2((byte)1);
            ap2.c(v5q.e.a);
            ((Map)ap2.v).put((Object)"androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", (Object)c4);
            return v5q.b(v5q, (String)null, (x4q)null, ap2.a(), 0, 0L, 0, 0, 0L, 0, 33554411);
        }
        return v5q;
    }
    
    public static final Double m(final double n) {
        return new Double(n);
    }
    
    public static final Integer n(final int n) {
        return new Integer(n);
    }
    
    public static final Long o(final long n) {
        return new Long(n);
    }
    
    public static final LinkedHashSet p(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/LinkedHashSet.<init>:()V
        //     7: astore          4
        //     9: aload_0        
        //    10: arraylength    
        //    11: ifne            17
        //    14: aload           4
        //    16: areturn        
        //    17: new             Ljava/io/ByteArrayInputStream;
        //    20: dup            
        //    21: aload_0        
        //    22: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    25: astore_0       
        //    26: new             Ljava/io/ObjectInputStream;
        //    29: astore          5
        //    31: aload           5
        //    33: aload_0        
        //    34: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    37: aload           5
        //    39: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    42: istore_2       
        //    43: iconst_0       
        //    44: istore_1       
        //    45: iload_1        
        //    46: iload_2        
        //    47: if_icmpge       106
        //    50: aload           5
        //    52: invokevirtual   java/io/ObjectInputStream.readUTF:()Ljava/lang/String;
        //    55: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    58: astore          6
        //    60: aload           5
        //    62: invokevirtual   java/io/ObjectInputStream.readBoolean:()Z
        //    65: istore_3       
        //    66: new             Lev6;
        //    69: astore          7
        //    71: aload           6
        //    73: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    76: pop            
        //    77: aload           7
        //    79: iload_3        
        //    80: aload           6
        //    82: invokespecial   ev6.<init>:(ZLandroid/net/Uri;)V
        //    85: aload           4
        //    87: aload           7
        //    89: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    94: pop            
        //    95: iinc            1, 1
        //    98: goto            45
        //   101: astore          6
        //   103: goto            124
        //   106: aload           5
        //   108: invokevirtual   java/io/ObjectInputStream.close:()V
        //   111: goto            144
        //   114: astore          4
        //   116: goto            151
        //   119: astore          5
        //   121: goto            139
        //   124: aload           6
        //   126: athrow         
        //   127: astore          7
        //   129: aload           5
        //   131: aload           6
        //   133: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   136: aload           7
        //   138: athrow         
        //   139: aload           5
        //   141: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   144: aload_0        
        //   145: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   148: aload           4
        //   150: areturn        
        //   151: aload           4
        //   153: athrow         
        //   154: astore          5
        //   156: aload_0        
        //   157: aload           4
        //   159: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   162: aload           5
        //   164: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  26     37     119    124    Ljava/io/IOException;
        //  26     37     114    165    Any
        //  37     43     101    139    Any
        //  50     95     101    139    Any
        //  106    111    119    124    Ljava/io/IOException;
        //  106    111    114    165    Any
        //  124    127    127    139    Any
        //  129    139    119    124    Ljava/io/IOException;
        //  129    139    114    165    Any
        //  139    144    114    165    Any
        //  151    154    154    165    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 78 out of bounds for length 78
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.util.Objects.checkIndex(Objects.java:371)
        //     at java.util.ArrayList.get(ArrayList.java:435)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
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
    
    public static final boolean q(ArrayList v) {
        if (v.size() >= 2) {
            if (v.size() <= 1) {
                v = (ArrayList)r89.v;
            }
            else {
                final ArrayList list = new ArrayList();
                Object value = v.get(0);
                final int p = lq6.P((List)v);
                int i = 0;
                while (i < p) {
                    ++i;
                    final Object value2 = v.get(i);
                    final zsk zsk = (zsk)value2;
                    final zsk zsk2 = (zsk)value;
                    list.add((Object)new l6g((long)Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int)(zsk2.g().f() >> 32)) - Float.intBitsToFloat((int)(zsk.g().f() >> 32)))) << 32 | ((long)Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int)(zsk2.g().f() & 0xFFFFFFFFL)) - Float.intBitsToFloat((int)(zsk.g().f() & 0xFFFFFFFFL)))) & 0xFFFFFFFFL)));
                    value = value2;
                }
                v = list;
            }
            long n;
            if (((Collection)v).size() == 1) {
                n = ((l6g)c86.G0((List)v)).a;
            }
            else {
                if (((List)v).isEmpty()) {
                    ald.c("Empty collection can't be reduced.");
                }
                Object g0 = c86.G0((List)v);
                final int p2 = lq6.P((List)v);
                Object o = g0;
                if (1 <= p2) {
                    int n2 = 1;
                    while (true) {
                        g0 = (o = new l6g(l6g.i(((l6g)g0).a, ((l6g)((List)v).get(n2)).a)));
                        if (n2 == p2) {
                            break;
                        }
                        ++n2;
                    }
                }
                n = ((l6g)o).a;
            }
            if (Float.intBitsToFloat((int)(0xFFFFFFFFL & n)) >= Float.intBitsToFloat((int)(n >> 32))) {
                return false;
            }
        }
        return true;
    }
    
    public static final long r(final peo peo, final ykn ykn, final qmn qmn, long f) {
        final long s = ykn.s();
        if ((0x7FFFFFFF7FFFFFFFL & s) != 0x7FC000007FC00000L) {
            if (peo.f().x.length() != 0) {
                final long y = peo.f().y;
                final qbb q = ykn.q();
                int n;
                if (q == null) {
                    n = -1;
                }
                else {
                    n = ejn.a[((Enum)q).ordinal()];
                }
                if (n != -1) {
                    long n2;
                    if (n != 1 && n != 2) {
                        if (n != 3) {
                            en9.r();
                            return 0L;
                        }
                        final int c = dnn.c;
                        n2 = (y & 0xFFFFFFFFL);
                    }
                    else {
                        final int c2 = dnn.c;
                        n2 = y >> 32;
                    }
                    final int n3 = (int)n2;
                    final omn c3 = qmn.c();
                    if (c3 != null) {
                        final vjf b = c3.b;
                        final float intBitsToFloat = Float.intBitsToFloat((int)(s >> 32));
                        final int d = b.d(n3);
                        final float g = c3.g(d);
                        final float h = c3.h(d);
                        final float n4 = ncq.n(intBitsToFloat, Math.min(g, h), Math.max(g, h));
                        if (chc.b(f, 0L) || Math.abs(intBitsToFloat - n4) <= (int)(f >> 32) / 2) {
                            final float f2 = b.f(d);
                            final float n5 = (b.b(d) - f2) / 2.0f;
                            f = Float.floatToRawIntBits(n4);
                            final long n6 = ((long)Float.floatToRawIntBits(n5 + f2) & 0xFFFFFFFFL) | f << 32;
                            nzc e = qmn.e();
                            f = n6;
                            if (e != null) {
                                if (!e.p()) {
                                    e = null;
                                }
                                f = n6;
                                if (e != null) {
                                    f = fkq.f(n6, tsf.Y(e));
                                }
                            }
                            return fkq.l(qmn, f);
                        }
                    }
                }
            }
        }
        return 9205357640488583168L;
    }
    
    public static final void s(final xd3 xd3, final Throwable t) {
        CancellationException ex;
        if (t instanceof CancellationException) {
            ex = (CancellationException)t;
        }
        else {
            ex = null;
        }
        CancellationException b = ex;
        if (ex == null) {
            b = w5e.b("Channel was consumed, consumer had failed", t);
        }
        xd3.g(b);
    }
    
    public static final void t(final WorkDatabase workDatabase, final wn6 wn6, final o4q o4q) {
        final ArrayList a0 = lq6.a0(o4q);
        int n = 0;
        while (!a0.isEmpty()) {
            final List d = ((o4q)h86.x0((List)a0)).d;
            d.getClass();
            int n2;
            if (((Collection)d).isEmpty()) {
                n2 = 0;
            }
            else {
                final Iterator iterator = ((Iterable)d).iterator();
                int n3 = 0;
                while (true) {
                    n2 = n3;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    if (((Collection)((r5q)iterator.next()).b.j.i).isEmpty()) {
                        continue;
                    }
                    if (++n3 >= 0) {
                        continue;
                    }
                    lq6.m0();
                    throw null;
                }
            }
            n += n2;
        }
        if (n != 0) {
            final int intValue = ((Number)xp7.L(workDatabase.v().a, true, false, (lta)new dop((byte)11))).intValue();
            if (intValue + n > 8) {
                en9.s(hia.g(intValue, n, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
            }
        }
    }
    
    public static void u(final Object o, final String s) {
        if (o != null) {
            return;
        }
        fvd.k(s);
    }
    
    public static final void v(final AnyMessage anyMessage) {
        if (anyMessage != null) {
            final String v = anyMessage.v;
            final ProtoAdapter adapter = UnknownMessage.ADAPTER;
            if (mlc.q(v, adapter.getTypeUrl())) {
                SilentException.a(new SilentException(hia.k("SandboxWebView: Unknown payload message type: '", ((UnknownMessage)anyMessage.a(adapter)).getType(), "'")), (lpl)null, (List)null, 7);
            }
        }
    }
    
    public static final igf w(final igf igf, final dng dng) {
        return igf.E((igf)new eng(dng));
    }
    
    public static final igf x(final igf igf, final gwl gwl) {
        return igf.E((igf)new jqo((d1q)gwl));
    }
    
    public static final float y(final float n) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(((long)Float.floatToRawIntBits(n) & 0x1FFFFFFFFL) / 3L) + 709952852);
        final float n2 = intBitsToFloat - (intBitsToFloat - n / (intBitsToFloat * intBitsToFloat)) * 0.33333334f;
        return n2 - (n2 - n / (n2 * n2)) * 0.33333334f;
    }
    
    public static final Object z(ija v, f07 v2) {
        Label_0046: {
            if (v2 instanceof qka) {
                final qka qka = (qka)v2;
                final int y = qka.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    qka.y = y + Integer.MIN_VALUE;
                    v2 = qka;
                    break Label_0046;
                }
            }
            v2 = new h07((f07)v2);
        }
        final Object x = ((qka)v2).x;
        final int y2 = ((qka)v2).y;
        final dxm a = j3g.a;
        Label_0186: {
            nka w = null;
            Label_0167: {
                if (y2 != 0) {
                    if (y2 == 1) {
                        w = ((qka)v2).w;
                        v = (ija)((qka)v2).v;
                        try {
                            g0(x);
                            break Label_0186;
                        }
                        catch (final AbortFlowException ex) {
                            break Label_0167;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                final Object e = hia.e(x);
                ((b4j)e).v = a;
                w = new nka((b4j)e, (byte)0);
                try {
                    ((qka)v2).v = (b4j)e;
                    ((qka)v2).w = w;
                    ((qka)v2).y = 1;
                    final Object a2 = v.a((jja)w, (f07)v2);
                    v2 = pc7.v;
                    v = (ija)e;
                    if (a2 == v2) {
                        return v2;
                    }
                    break Label_0186;
                }
                catch (final AbortFlowException ex) {
                    v = (ija)e;
                }
            }
            final AbortFlowException ex;
            if (ex.v != w) {
                throw ex;
            }
            x90.u(((f07)v2).getContext());
        }
        final Object v3 = ((b4j)v).v;
        if (v3 != a) {
            return v3;
        }
        oyl.i("Expected at least one element");
        return null;
    }
    
    public Method H(final Class clazz, final Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }
    
    public Constructor I(final Class clazz) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }
    
    public String[] K(final Class clazz) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }
    
    public boolean S(final Class clazz) {
        return false;
    }
}
