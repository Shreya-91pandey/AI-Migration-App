import java.util.Calendar;
import android.os.BaseBundle;
import android.util.SizeF;
import android.util.Size;
import android.os.IBinder;
import java.io.Serializable;
import android.os.Parcelable;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.lang.reflect.Array;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Map;
import com.anthropic.claude.core.di.engine.core.DiException;
import kotlin.NotImplementedError;
import kotlinx.serialization.KSerializer;
import java.util.regex.Matcher;
import java.util.GregorianCalendar;
import java.util.Locale;
import androidx.compose.foundation.layout.b;
import java.util.regex.Pattern;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import android.text.TextUtils;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import android.content.Intent;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.project.Project;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import android.text.Layout$Alignment;
import android.graphics.Paint;
import android.text.Layout;
import java.util.List;
import android.graphics.Rect;
import android.graphics.Region$Op;
import android.graphics.Region;
import androidx.compose.ui.node.LayoutNode;
import android.os.Trace;
import com.anthropic.claude.core.di.engine.DuplicateBindingException;

public abstract class ach
{
    public static final Object[] a;
    public static final float[] b;
    public static final long[] c;
    public static final wc2[] d;
    public static final shc e;
    public static final k2j f;
    
    public static final Object A(final long n, final f07 f07) {
        if (n > 0L) {
            final l13 l13 = new l13(1, ljq.K(f07));
            l13.r();
            if (n < Long.MAX_VALUE) {
                L(l13.z).A0(n, l13);
            }
            final Object p2 = l13.p();
            if (p2 == pc7.v) {
                return p2;
            }
        }
        return lqo.a;
    }
    
    public static final Object B(final long n, final f07 f07) {
        final Object a = A(i0(n), f07);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public static boolean C() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: pop            
        //     4: invokestatic    ffa.b:()Lffa;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokevirtual   ffa.a:()V
        //    12: aload_1        
        //    13: getfield        ffa.a:Landroid/content/Context;
        //    16: astore_1       
        //    17: aload_1        
        //    18: ldc             "com.google.firebase.messaging"
        //    20: iconst_0       
        //    21: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    24: astore_2       
        //    25: aload_2        
        //    26: ldc             "export_to_big_query"
        //    28: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //    33: ifeq            46
        //    36: aload_2        
        //    37: ldc             "export_to_big_query"
        //    39: iconst_0       
        //    40: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    45: ireturn        
        //    46: aload_1        
        //    47: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    50: astore_2       
        //    51: aload_2        
        //    52: ifnull          102
        //    55: aload_2        
        //    56: aload_1        
        //    57: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    60: sipush          128
        //    63: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    66: astore_2       
        //    67: aload_2        
        //    68: ifnull          102
        //    71: aload_2        
        //    72: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    75: astore_1       
        //    76: aload_1        
        //    77: ifnull          102
        //    80: aload_1        
        //    81: ldc             "delivery_metrics_exported_to_big_query_enabled"
        //    83: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //    86: ifeq            102
        //    89: aload_2        
        //    90: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    93: ldc             "delivery_metrics_exported_to_big_query_enabled"
        //    95: iconst_0       
        //    96: invokevirtual   android/os/BaseBundle.getBoolean:(Ljava/lang/String;Z)Z
        //    99: istore_0       
        //   100: iload_0        
        //   101: ireturn        
        //   102: iconst_0       
        //   103: ireturn        
        //   104: astore_1       
        //   105: ldc             "FirebaseMessaging"
        //   107: ldc             "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
        //   109: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   112: pop            
        //   113: iconst_0       
        //   114: ireturn        
        //   115: astore_1       
        //   116: goto            102
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      4      104    115    Ljava/lang/IllegalStateException;
        //  46     51     115    119    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  55     67     115    119    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  71     76     115    119    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  80     100    115    119    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    public static boolean D(final String s, final String s2) {
        if (!mlc.q((Object)s, (Object)s2)) {
            if (!rym.y0(s, s2, false) || s.charAt(s.length() - s2.length() - 1) != '.' || acq.a.g((CharSequence)s)) {
                return false;
            }
        }
        return true;
    }
    
    public static DuplicateBindingException E(final wc2 wc2, final wc2 wc3) {
        final String name = wc3.d.getName();
        final emi e = wc3.e;
        final String s = "";
        String k;
        if (e != null) {
            k = hia.k("(named \"", e.getValue(), "\")");
        }
        else {
            k = "";
        }
        final String a = wc3.b.a;
        final String b = wc2.b();
        final String b2 = wc3.b();
        final Class i = wc3.k;
        String j = s;
        if (i != null) {
            Class clazz;
            if (i == wc2.k) {
                clazz = i;
            }
            else {
                clazz = null;
            }
            j = s;
            if (clazz != null) {
                j = hia.k("\nBoth are elements of the ", clazz.getSimpleName(), " set: two elements of one set need two classes.");
            }
        }
        final StringBuilder t = oz1.t("Duplicate binding for ", name, k, " in ", a);
        oz1.A(t, ":\n  first:  ", b, "\n  second: ", b2);
        return new DuplicateBindingException(oz1.p(t, "\nRegister the later module with allowOverride = true if replacing is intended.", j));
    }
    
    public static final Object F(final xd3 xd3, stk v, final f07 f07) {
        Object o = null;
        Label_0052: {
            if (f07 instanceof ss9) {
                final ss9 ss9 = (ss9)f07;
                final int y = ss9.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ss9.y = y + Integer.MIN_VALUE;
                    o = ss9;
                    break Label_0052;
                }
            }
            o = new h07(f07);
        }
        final Object x = ((ss9)o).x;
        final int y2 = ((ss9)o).y;
        final pc7 v2 = pc7.v;
        while (true) {
            en2 en2 = null;
            stk v3 = null;
            Object o2 = null;
            Label_0193: {
                ss9 ss10;
                if (y2 != 0) {
                    if (y2 == 1) {
                        en2 = ((ss9)o).w;
                        v3 = ((ss9)o).v;
                        vt4.g0(x);
                        o2 = x;
                        break Label_0193;
                    }
                    if (y2 != 2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    en2 = ((ss9)o).w;
                    v = ((ss9)o).v;
                    vt4.g0(x);
                    ss10 = (ss9)o;
                }
                else {
                    vt4.g0(x);
                    en2 = xd3.iterator();
                    ss10 = (ss9)o;
                }
                ss10.v = v;
                ss10.w = en2;
                ss10.y = 1;
                final Object b = en2.b((f07)ss10);
                o = ss10;
                v3 = v;
                if ((o2 = b) == v2) {
                    return v2;
                }
            }
            if (!(boolean)o2) {
                return lqo.a;
            }
            final Object c = en2.c();
            ((ss9)o).v = v3;
            ((ss9)o).w = en2;
            ((ss9)o).y = 2;
            ss9 ss10 = (ss9)o;
            v = v3;
            if (v3.a((f07)o, c) != v2) {
                continue;
            }
            break;
        }
        return v2;
    }
    
    public static final jlf G(final ctk ctk, final lta lta) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            final zsk a = ctk.a();
            final LayoutNode c = a.c;
            if (c.W() && c.V()) {
                final k2j g = a.g();
                final jlf jlf = new jlf(48);
                final xzj xzj = new xzj((byte)2);
                xzj.f(omo.b0(g));
                J(lta, jlf, new xzj((byte)2), xzj, a, a);
                return jlf;
            }
            final jlf a2 = tgc.a;
            a2.getClass();
            return a2;
        }
        finally {
            Trace.endSection();
        }
    }
    
    public static final void H(final lta lta, final jlf jlf, final xzj xzj, final xzj xzj2, final zsk zsk, final zsk zsk2) {
        final Region region = (Region)xzj.v;
        final Region region2 = (Region)xzj2.v;
        final LayoutNode c = zsk2.c;
        final LayoutNode c2 = zsk2.c;
        if (c.W() && c2.V() && !region2.isEmpty()) {
            k2j k2j;
            if ((k2j = zsk2.m()).j()) {
                final xsk f = zsk2.f();
                if (f == null) {
                    final lcc lcc = (lcc)c2.Z.y;
                    k2j = r9n.t((nzc)lcc).L((nzc)lcc, false);
                }
                else {
                    final hgf v = ((hgf)f).v;
                    Object g;
                    if ((g = zsk2.d.v.g((Object)rsk.b)) == null) {
                        g = null;
                    }
                    k2j = r9n.q(v, g != null, false);
                }
            }
            final ygc b0 = omo.b0(k2j);
            xzj.f(b0);
            if (region.op(region2, Region$Op.INTERSECT)) {
                int f2;
                if ((f2 = zsk2.f) == zsk.f) {
                    f2 = -1;
                }
                final Rect bounds = region.getBounds();
                jlf.i(f2, (Object)new btk(zsk2, new ygc(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                final List j = zsk.j(4, zsk2);
                for (int n = j.size() - 1; -1 < n; --n) {
                    if (!(boolean)lta.b(j.get(n))) {
                        H(lta, jlf, xzj, xzj2, zsk, (zsk)j.get(n));
                    }
                }
                if (R(zsk2)) {
                    region2.op(b0.a, b0.b, b0.c, b0.d, Region$Op.DIFFERENCE);
                }
            }
        }
        else if (zsk2.n()) {
            I(jlf, zsk, zsk2);
        }
    }
    
    public static final void I(final jlf jlf, final zsk zsk, final zsk zsk2) {
        final zsk l = zsk2.l();
        k2j k2j = null;
        Label_0047: {
            if (l != null) {
                final LayoutNode c = l.c;
                if (c != null && c.W()) {
                    k2j = l.g();
                    break Label_0047;
                }
            }
            k2j = ach.f;
        }
        int f;
        if ((f = zsk2.f) == zsk.f) {
            f = -1;
        }
        jlf.i(f, (Object)new btk(zsk2, omo.b0(k2j)));
    }
    
    public static final void J(final lta lta, final jlf jlf, final xzj xzj, final xzj xzj2, final zsk zsk, final zsk zsk2) {
        final int f = zsk.f;
        final Region region = (Region)xzj.v;
        final Region region2 = (Region)xzj2.v;
        final LayoutNode c = zsk2.c;
        final tsk d = zsk2.d;
        final LayoutNode c2 = zsk2.c;
        final int f2 = zsk2.f;
        final boolean b = !c.W() || !c2.V();
        if (!region2.isEmpty() || f2 == f) {
            if (!b || zsk2.n()) {
                final ygc b2 = omo.b0(zsk2.m());
                xzj.f(b2);
                int n;
                if ((n = f2) == f) {
                    n = -1;
                }
                if (region.op(region2, Region$Op.INTERSECT)) {
                    final Rect bounds = region.getBounds();
                    jlf.i(n, (Object)new btk(zsk2, new ygc(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    final List j = zsk.j(4, zsk2);
                    Label_0699: {
                        Label_0628: {
                            if (d.x) {
                                zsk zsk3 = zsk2.l();
                                while (true) {
                                    while (zsk3 != null) {
                                        final tmf v = zsk3.d.v;
                                        zsk zsk4 = zsk3;
                                        if (!v.c((Object)etk.w)) {
                                            if (!v.c((Object)etk.v)) {
                                                zsk3 = zsk3.l();
                                                continue;
                                            }
                                            zsk4 = zsk3;
                                        }
                                        boolean b3 = false;
                                        Label_0432: {
                                            if (zsk4 != null) {
                                                Object d2 = zsk2.d();
                                                Object o = null;
                                                Label_0337: {
                                                    if (d2 != null) {
                                                        if (!((yxf)d2).h1().I) {
                                                            d2 = null;
                                                        }
                                                        if (d2 != null) {
                                                            o = d2;
                                                            break Label_0337;
                                                        }
                                                    }
                                                    o = null;
                                                }
                                                Object d3 = zsk4.d();
                                                Label_0377: {
                                                    if (d3 != null) {
                                                        if (!((yxf)d3).h1().I) {
                                                            d3 = null;
                                                        }
                                                        if (d3 != null) {
                                                            break Label_0377;
                                                        }
                                                    }
                                                    d3 = null;
                                                }
                                                if (o != null) {
                                                    if (d3 != null) {
                                                        final k2j l = ((yxf)d3).L((nzc)o, false);
                                                        b3 = (l.equals((Object)l.i(rml.f(0L, uoo.Z(((o8h)d3).x)))) ^ true);
                                                        break Label_0432;
                                                    }
                                                }
                                            }
                                            b3 = false;
                                        }
                                        if (b3) {
                                            final xzj xzj3 = new xzj((byte)2);
                                            final xsk f3 = zsk2.f();
                                            k2j k2j;
                                            if (f3 == null) {
                                                final lcc lcc = (lcc)c2.Z.y;
                                                k2j = r9n.t((nzc)lcc).L((nzc)lcc, false);
                                            }
                                            else {
                                                final hgf v2 = ((hgf)f3).v;
                                                Object g = d.v.g((Object)rsk.b);
                                                if (g == null) {
                                                    g = null;
                                                }
                                                k2j = r9n.q(v2, g != null, false);
                                            }
                                            xzj3.f(omo.b0(k2j));
                                            for (int n2 = j.size() - 1; -1 < n2; --n2) {
                                                if (!(boolean)lta.b(j.get(n2))) {
                                                    H(lta, jlf, new xzj((byte)2), xzj3, zsk, (zsk)j.get(n2));
                                                }
                                            }
                                            break Label_0699;
                                        }
                                        break Label_0628;
                                    }
                                    zsk zsk4 = null;
                                    continue;
                                }
                            }
                        }
                        for (int n3 = j.size() - 1; -1 < n3; --n3) {
                            if (!(boolean)lta.b(j.get(n3))) {
                                J(lta, jlf, xzj, xzj2, zsk, (zsk)j.get(n3));
                            }
                        }
                    }
                    if (R(zsk2)) {
                        region2.op(b2.a, b2.b, b2.c, b2.d, Region$Op.DIFFERENCE);
                    }
                }
                else {
                    if (zsk2.n()) {
                        I(jlf, zsk, zsk2);
                        return;
                    }
                    if (n == -1) {
                        final Rect bounds2 = region.getBounds();
                        jlf.i(n, (Object)new btk(zsk2, new ygc(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                    }
                }
            }
        }
    }
    
    public static final long K(long n) {
        final float n2 = Float.intBitsToFloat((int)(n >> 32)) / 2.0f;
        final float n3 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) / 2.0f;
        n = Float.floatToRawIntBits(n2);
        return ((long)Float.floatToRawIntBits(n3) & 0xFFFFFFFFL) | n << 32;
    }
    
    public static final l98 L(final hc7 hc7) {
        final fc7 m0 = hc7.M0((gc7)p3.x);
        l98 l98;
        if (m0 instanceof l98) {
            l98 = (l98)m0;
        }
        else {
            l98 = null;
        }
        l98 a = l98;
        if (l98 == null) {
            a = k48.a;
        }
        return a;
    }
    
    public static final float M(final Layout layout, int n, final Paint paint) {
        final float lineLeft = layout.getLineLeft(n);
        final ThreadLocal a = rmn.a;
        if (layout.getEllipsisCount(n) > 0 && layout.getParagraphDirection(n) == 1 && lineLeft < 0.0f) {
            final float n2 = paint.measureText("\u2026") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(n) + layout.getLineStart(n)) - lineLeft);
            final Layout$Alignment paragraphAlignment = layout.getParagraphAlignment(n);
            if (paragraphAlignment == null) {
                n = -1;
            }
            else {
                n = p7c.a[((Enum)paragraphAlignment).ordinal()];
            }
            float n3;
            float n4;
            if (n == 1) {
                n3 = Math.abs(lineLeft);
                n4 = (layout.getWidth() - n2) / 2.0f;
            }
            else {
                n3 = Math.abs(lineLeft);
                n4 = layout.getWidth() - n2;
            }
            return n4 + n3;
        }
        return 0.0f;
    }
    
    public static final float N(final Layout layout, final int n, final Paint paint) {
        final ThreadLocal a = rmn.a;
        if (layout.getEllipsisCount(n) > 0) {
            final int paragraphDirection = layout.getParagraphDirection(n);
            int n2 = -1;
            if (paragraphDirection == -1 && layout.getWidth() < layout.getLineRight(n)) {
                final float n3 = paint.measureText("\u2026") + (layout.getLineRight(n) - layout.getPrimaryHorizontal(layout.getEllipsisStart(n) + layout.getLineStart(n)));
                final Layout$Alignment paragraphAlignment = layout.getParagraphAlignment(n);
                if (paragraphAlignment != null) {
                    n2 = p7c.a[((Enum)paragraphAlignment).ordinal()];
                }
                float n4;
                float n5;
                if (n2 == 1) {
                    n4 = layout.getWidth() - layout.getLineRight(n);
                    n5 = (layout.getWidth() - n3) / 2.0f;
                }
                else {
                    n4 = layout.getWidth() - layout.getLineRight(n);
                    n5 = layout.getWidth() - n3;
                }
                return n4 - n5;
            }
        }
        return 0.0f;
    }
    
    public static final im7 O(final ycp ycp) {
        if (ycp instanceof pcb) {
            return (im7)((pcb)ycp).b();
        }
        return (im7)gm7.b;
    }
    
    public static final boolean P(final tsk tsk) {
        final htk s = etk.s;
        final tmf v = tsk.v;
        Object g;
        if ((g = v.g((Object)s)) == null) {
            g = null;
        }
        if (!mlc.q(g, (Object)wab.M)) {
            if (v.b((Object)rsk.g) || v.b((Object)rsk.h)) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean Q(final zsk zsk) {
        final yxf d = zsk.d();
        final tmf v = zsk.d.v;
        if (d == null || !d.q1()) {
            if (!v.c((Object)etk.q)) {
                if (!v.c((Object)etk.p)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static final boolean R(final zsk zsk) {
        if (!Q(zsk)) {
            final tsk d = zsk.d;
            Label_0157: {
                if (!d.x) {
                    final tmf v = d.v;
                    final Object[] b = v.b;
                    final Object[] c = v.c;
                    final long[] a = v.a;
                    final int n = a.length - 2;
                    if (n < 0) {
                        return false;
                    }
                    int n2 = 0;
                    while (true) {
                        long n3 = a[n2];
                        if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n4 = 8 - (~(n2 - n) >>> 31);
                            for (int i = 0; i < n4; ++i) {
                                if ((0xFFL & n3) < 128L) {
                                    final int n5 = (n2 << 3) + i;
                                    final Object o = b[n5];
                                    final Object o2 = c[n5];
                                    if (((htk)o).c) {
                                        break Label_0157;
                                    }
                                }
                                n3 >>= 8;
                            }
                            if (n4 != 8) {
                                return false;
                            }
                        }
                        if (n2 == n) {
                            return false;
                        }
                        ++n2;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static ngd S(final tdk tdk, final Class[] array, final c2l c2l, final ArrayList list, final List list2, ArrayList j) {
        final String a = tdk.a;
        final Iterator iterator = list.iterator();
        iterator.getClass();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            next.getClass();
            if (((wc2)next).a >= 0) {
                ++n;
            }
        }
        final ArrayList list3 = new ArrayList(list2.size() + array.length);
        if (list.isEmpty()) {
            for (int length = array.length, i = 0; i < length; ++i) {
                list3.add((Object)new wc2(tdk, 4, array[i], (emi)null, (lta)ach.e, (String)null, false));
            }
        }
        for (final wc2 wc2 : list2) {
            if (wc2.b != tdk) {
                en9.s("Failed requirement.");
                return null;
            }
            if (wc2.a != Integer.MIN_VALUE) {
                fvd.h((Object)"definition linked twice: ".concat(wc2.b()));
                return null;
            }
            list3.add((Object)wc2);
        }
        final ArrayList list4 = new ArrayList();
        for (final Object next2 : list3) {
            if (((wc2)next2).c != 2) {
                list4.add(next2);
            }
        }
        final int size = list4.size();
        ArrayList list5;
        if (list3.isEmpty()) {
            list5 = list;
        }
        else {
            list5 = new ArrayList(list3.size() + list.size());
            list5.addAll((Collection)list);
            list5.addAll((Collection)list3);
        }
        qd6 qd6;
        if (c2l != null) {
            final qmo qmo = (qmo)c2l.x;
            final Object[] a2 = qmo.a;
            qd6 = new qd6((Object)Arrays.copyOf(a2, a2.length), qmo.b, (byte)12);
        }
        else {
            qd6 = new qd6(((List)list5).size() + 8, (byte)12);
        }
        qd6 qd7;
        if (c2l != null) {
            final qmo qmo2 = (qmo)c2l.z;
            final Object[] a3 = qmo2.a;
            qd7 = new qd6((Object)Arrays.copyOf(a3, a3.length), qmo2.b, (byte)12);
        }
        else {
            qd7 = new qd6(8, (byte)12);
        }
        final Iterator iterator4 = ((List)list5).iterator();
        qd6 qd8 = null;
        final int n2 = n;
        final ArrayList list6 = list5;
        while (true) {
            final boolean hasNext = iterator4.hasNext();
            Object v = r89.v;
            if (!hasNext) {
                Iterator iterator5 = ((List)list6).iterator();
                Object o = null;
                while (iterator5.hasNext()) {
                    final wc2 wc3 = (wc2)iterator5.next();
                    final emi e = wc3.e;
                    final Class d = wc3.d;
                    Iterator iterator7 = null;
                    Label_1340: {
                        if (e == null) {
                            if (qd6.p((Object)d) == wc3) {
                                continue;
                            }
                            Object k = wc3.j;
                            if (k == null) {
                                k = v;
                            }
                            if (!((Collection)k).isEmpty()) {
                                final Iterator iterator6 = ((Iterable)k).iterator();
                                do {
                                    iterator7 = iterator5;
                                    if (iterator6.hasNext()) {
                                        continue;
                                    }
                                    break Label_1340;
                                } while (qd6.p((Object)iterator6.next()) != wc3);
                                continue;
                            }
                            iterator7 = iterator5;
                        }
                        else {
                            iterator7 = iterator5;
                            if (qd8 != null) {
                                final wc2[] array2 = (wc2[])qd8.p((Object)d);
                                if (array2 != null) {
                                    for (int length2 = array2.length, l = 0; l < length2; ++l) {
                                        if (array2[l] == wc3) {
                                            continue Label_1347;
                                        }
                                    }
                                }
                                Object m = wc3.j;
                                if (m == null) {
                                    m = v;
                                }
                                if (((Collection)m).isEmpty()) {
                                    iterator7 = iterator5;
                                }
                                else {
                                    final Iterator iterator8 = ((Iterable)m).iterator();
                                    while (true) {
                                        iterator7 = iterator5;
                                        if (!iterator8.hasNext()) {
                                            break;
                                        }
                                        final wc2[] array3 = (wc2[])qd8.p((Object)iterator8.next());
                                        Iterator iterator9 = iterator5;
                                        if (array3 != null) {
                                            final int length3 = array3.length;
                                            int n3 = 0;
                                            while (true) {
                                                iterator9 = iterator5;
                                                if (n3 >= length3) {
                                                    break;
                                                }
                                                if (array3[n3] == wc3) {
                                                    continue Label_1347;
                                                }
                                                ++n3;
                                            }
                                        }
                                        iterator5 = iterator9;
                                    }
                                }
                            }
                        }
                    }
                    iterator5 = iterator7;
                    if (o == null) {
                        o = new ArrayList(2);
                    }
                    ((ArrayList)o).add((Object)wc3);
                    Label_1347:;
                }
                final Iterator iterator10 = ((List)j).iterator();
                while (iterator10.hasNext()) {
                    qd7.s((Class)iterator10.next(), (Object)ach.d);
                }
                final Iterator iterator11 = ((List)list6).iterator();
                final ArrayList list7 = (ArrayList)o;
            Label_1625:
                while (iterator11.hasNext()) {
                    final wc2 wc4 = (wc2)iterator11.next();
                    if (list7 != null) {
                        if (!((Collection)list7).isEmpty()) {
                            final Iterator iterator12 = ((Iterable)list7).iterator();
                            while (iterator12.hasNext()) {
                                if (iterator12.next() == wc4) {
                                    continue Label_1625;
                                }
                            }
                        }
                    }
                    final Class k2 = wc4.k;
                    final Class d2 = wc4.d;
                    if (k2 == null) {
                        continue;
                    }
                    final wc2[] array4 = (wc2[])qd7.p((Object)k2);
                    Label_1790: {
                        if (array4 != null) {
                            final int length4 = array4.length;
                            int n4 = 0;
                            while (true) {
                                while (n4 < length4) {
                                    final wc2 wc5 = array4[n4];
                                    if (wc5.d == d2) {
                                        if (wc5 == null) {
                                            break Label_1790;
                                        }
                                        final String name = d2.getName();
                                        final String simpleName = k2.getSimpleName();
                                        final String b = wc5.b();
                                        final String b2 = wc4.b();
                                        final String a4 = wc5.b.a;
                                        final StringBuilder t = oz1.t(name, " is contributed to the ", simpleName, " set twice on ", a);
                                        oz1.A(t, "'s chain:\n  first:  ", b, "\n  second: ", b2);
                                        oz1.A(t, "\nAn element class appears once in a set; ", a, " scopes already see ", a4);
                                        t.append("'s elements.");
                                        throw new RuntimeException(t.toString(), (Throwable)null);
                                    }
                                    else {
                                        ++n4;
                                    }
                                }
                                final wc2 wc5 = null;
                                continue;
                            }
                        }
                    }
                    wc2[] array5;
                    if (array4 == null) {
                        array5 = new wc2[] { wc4 };
                    }
                    else {
                        final int length5 = array4.length;
                        final Object[] copy = Arrays.copyOf((Object[])array4, length5 + 1);
                        copy[length5] = wc4;
                        array5 = (wc2[])copy;
                    }
                    qd7.s(k2, (Object)array5);
                }
                Label_1963:
                for (final wc2 wc6 : list6) {
                    if (list7 != null) {
                        if (!((Collection)list7).isEmpty()) {
                            final Iterator iterator14 = ((Iterable)list7).iterator();
                            while (iterator14.hasNext()) {
                                if (iterator14.next() == wc6) {
                                    continue Label_1963;
                                }
                            }
                        }
                    }
                    final Class k3 = wc6.k;
                    final Class d3 = wc6.d;
                    if (k3 != null) {
                        final wc2 wc7 = (wc2)qd6.p((Object)k3);
                        if (wc7 != null) {
                            throw e0(k3, qd7, wc7, tdk);
                        }
                    }
                    if (wc6.e == null) {
                        if (qd7.p((Object)d3) != null) {
                            throw e0(d3, qd7, wc6, tdk);
                        }
                        j = wc6.j;
                        if (j == null) {
                            j = v;
                        }
                        for (final Class clazz : j) {
                            if (qd7.p((Object)clazz) == null) {
                                continue;
                            }
                            throw e0(clazz, qd7, wc6, tdk);
                        }
                    }
                }
                final wc2[] array6 = new wc2[size + n];
                final Iterator iterator16 = list.iterator();
                iterator16.getClass();
                while (iterator16.hasNext()) {
                    final Object next3 = iterator16.next();
                    next3.getClass();
                    final wc2 wc8 = (wc2)next3;
                    final int a5 = wc8.a;
                    if (a5 >= 0) {
                        array6[a5] = wc8;
                    }
                }
                for (int size2 = list4.size(), n5 = 0; n5 < size2; ++n5) {
                    array6[n2 + n5] = (wc2)list4.get(n5);
                }
                c86.s1((Iterable)list6);
                final qmo qmo3 = new qmo(qd6.w, (Object[])qd6.x);
                final Object[] d4 = qmo.d;
                qd6.x = d4;
                Object e2;
                if (qd8 != null) {
                    e2 = new qmo(qd8.w, (Object[])qd8.x);
                    qd8.x = d4;
                }
                else if (c2l != null) {
                    e2 = c2l.y;
                }
                else {
                    e2 = qmo.e;
                }
                final qmo qmo4 = new qmo(qd7.w, (Object[])qd7.x);
                qd7.x = d4;
                if (list7 != null) {
                    c86.s1((Iterable)list7);
                }
                return new ngd(new c2l((Object)array6, (Object)qmo3, e2, (Object)qmo4, (byte)9), list, list3, n2);
            }
            final wc2 wc9 = (wc2)iterator4.next();
            final boolean h = wc9.h;
            final emi e3 = wc9.e;
            final Class d5 = wc9.d;
            qd6 qd9 = null;
            if (e3 == null) {
                final wc2 wc10 = (wc2)qd6.s(d5, (Object)wc9);
                if (wc10 != null && wc10.b == tdk && wc10.d == d5 && !h) {
                    throw E(wc10, wc9);
                }
                final ArrayList j2 = wc9.j;
                if (j2 != null) {
                    v = j2;
                }
                for (final Class clazz2 : v) {
                    final wc2 wc11 = (wc2)qd6.p((Object)clazz2);
                    if (!h && wc11 != null && wc11.b == tdk && wc11.d == clazz2) {
                        continue;
                    }
                    qd6.s(clazz2, (Object)wc9);
                }
                qd9 = qd8;
            }
            else {
                Label_0770: {
                    if (qd8 == null) {
                        if (c2l != null) {
                            final qmo qmo5 = (qmo)c2l.y;
                            if (qmo5 != null) {
                                final Object[] a6 = qmo5.a;
                                qd9 = new qd6((Object)Arrays.copyOf(a6, a6.length), qmo5.b, (byte)12);
                                break Label_0770;
                            }
                        }
                        qd9 = new qd6(8, (byte)12);
                    }
                    else {
                        qd9 = qd8;
                    }
                }
                final wc2[] array7 = (wc2[])qd9.p((Object)d5);
                wc2 wc12 = null;
                Label_0850: {
                    if (array7 != null) {
                        for (final wc2 wc12 : array7) {
                            if (wc12.b == tdk && wc12.e == e3 && wc12.d == d5) {
                                break Label_0850;
                            }
                        }
                    }
                    wc12 = null;
                }
                if (wc12 != null && !h) {
                    throw E(wc12, wc9);
                }
                wc2[] array8;
                if (array7 != null) {
                    final ArrayList list8 = new ArrayList();
                    for (final wc2 wc13 : array7) {
                        if (wc13 != wc12) {
                            list8.add((Object)wc13);
                        }
                    }
                    array8 = (wc2[])list8.toArray((Object[])new wc2[0]);
                }
                else {
                    array8 = null;
                }
                qd9.s(d5, (Object)b0(wc9, array8));
                final ArrayList j3 = wc9.j;
                if (j3 != null) {
                    v = j3;
                }
                Iterator iterator18 = ((List)v).iterator();
                final emi emi = e3;
                while (iterator18.hasNext()) {
                    final Class clazz3 = (Class)iterator18.next();
                    final wc2[] array9 = (wc2[])qd9.p((Object)clazz3);
                    Iterator iterator19 = iterator18;
                    wc2 wc14 = null;
                    Label_1096: {
                        if (h) {
                            iterator19 = iterator18;
                            if (array9 != null) {
                                final int length8 = array9.length;
                                int n8 = 0;
                                while (true) {
                                    iterator19 = iterator18;
                                    if (n8 >= length8) {
                                        break;
                                    }
                                    wc14 = array9[n8];
                                    if (wc14.b == tdk && wc14.e == emi) {
                                        break Label_1096;
                                    }
                                    ++n8;
                                }
                            }
                        }
                        iterator18 = iterator19;
                        wc14 = null;
                    }
                    wc2[] array10;
                    if (array9 != null) {
                        final ArrayList list9 = new ArrayList();
                        for (final wc2 wc15 : array9) {
                            if (wc15 != wc14) {
                                list9.add((Object)wc15);
                            }
                        }
                        array10 = (wc2[])list9.toArray((Object[])new wc2[0]);
                    }
                    else {
                        array10 = null;
                    }
                    qd9.s(clazz3, (Object)b0(wc9, array10));
                }
            }
            qd8 = qd9;
        }
    }
    
    public static bs0 T(final v5a v5a, final gci gci, final qo4 qo4, final cbi cbi, final s3p s3p) {
        if (v5a.b.getValue()) {
            Object v;
            if (cbi.i.getValue()) {
                v = gci.p.getValue();
            }
            else {
                v = r89.v;
            }
            final ArrayList list = new ArrayList(d86.p0((Iterable)v, 10));
            for (final Project project : v) {
                list.add((Object)new oyp(0, project.o(), project.i(), s3p.c, s3p.d));
            }
            final List list2 = (List)qo4.w.getValue();
            final ArrayList list3 = new ArrayList(d86.p0((Iterable)list2, 10));
            for (final ChatConversationWithProjectReference chatConversationWithProjectReference : list2) {
                list3.add((Object)new nyp(0, chatConversationWithProjectReference.a, chatConversationWithProjectReference.d, s3p.c, s3p.d));
            }
            final ArrayList z0 = c86.Z0((Collection)list, (Iterable)list3);
            final List list4 = (List)qo4.y.getValue();
            if (!z0.isEmpty() || !list4.isEmpty() || (boolean)qo4.p.getValue()) {
                final List l1 = c86.l1((Iterable)z0, 10);
                final boolean b = z0.size() > 10;
                final ArrayList list5 = new ArrayList(d86.p0((Iterable)list4, 10));
                for (final ChatConversationWithProjectReference chatConversationWithProjectReference2 : list4) {
                    list5.add((Object)new dzp((qyp)new nyp(0, chatConversationWithProjectReference2.a, chatConversationWithProjectReference2.d, s3p.c, s3p.d), chatConversationWithProjectReference2.c.getTime()));
                }
                return new bs0(l1, b, list5, (boolean)qo4.z.getValue());
            }
        }
        return null;
    }
    
    public static void U(final Intent ex) {
        if (f0((Intent)ex)) {
            V(((Intent)ex).getExtras(), "_nr");
        }
        int n = 0;
        if (ex != null && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals((Object)((Intent)ex).getAction()) && C()) {
            final qfo qfo = (qfo)FirebaseMessaging.m.get();
            if (qfo == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            h8f a = null;
            final String s = null;
            Label_0807: {
                if (ex == null) {
                    break Label_0807;
                }
                Bundle bundle;
                if ((bundle = ((Intent)ex).getExtras()) == null) {
                    bundle = Bundle.EMPTY;
                }
                final d8f a2 = h8f.a();
                final Object value = ((BaseBundle)bundle).get("google.ttl");
                int n2 = 0;
                Label_0203: {
                    if (value instanceof Integer) {
                        n2 = (int)value;
                    }
                    else {
                        if (value instanceof String) {
                            try {
                                n2 = Integer.parseInt((String)value);
                                break Label_0203;
                            }
                            catch (final NumberFormatException ex2) {
                                final StringBuilder sb = new StringBuilder("Invalid TTL: ");
                                sb.append(value);
                                Log.w("FirebaseMessaging", sb.toString());
                            }
                        }
                        n2 = 0;
                    }
                }
                a2.n(n2);
                a2.e();
                String string = ((BaseBundle)bundle).getString("google.to");
                Label_0281: {
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        break Label_0281;
                    }
                    try {
                        final ffa b = ffa.b();
                        try {
                            final Object l = kfa.l;
                            b.a();
                            string = (String)ri2.n(((kfa)((ie6)b.d).d((Class)lfa.class)).c());
                            a2.f(string);
                            final ffa b2 = ffa.b();
                            b2.a();
                            a2.i(b2.a.getPackageName());
                            a2.l();
                            f8f f8f;
                            if (n2g.k(bundle)) {
                                f8f = f8f.y;
                            }
                            else {
                                f8f = f8f.x;
                            }
                            a2.h(f8f);
                            int n3 = 0;
                        Label_0427:
                            while (true) {
                                String s2 = null;
                                Label_0395: {
                                    if ((s2 = ((BaseBundle)bundle).getString("google.delivered_priority")) != null) {
                                        break Label_0395;
                                    }
                                    if (!"1".equals((Object)((BaseBundle)bundle).getString("google.priority_reduced"))) {
                                        s2 = ((BaseBundle)bundle).getString("google.priority");
                                        break Label_0395;
                                    }
                                    n3 = 2;
                                    break Label_0427;
                                }
                                if ("high".equals((Object)s2)) {
                                    n3 = 1;
                                }
                                else {
                                    if ("normal".equals((Object)s2)) {
                                        continue;
                                    }
                                    n3 = 0;
                                }
                                break;
                            }
                            if (n3 == 2) {
                                n = 5;
                            }
                            else if (n3 == 1) {
                                n = 10;
                            }
                            a2.j(n);
                            String s3;
                            if ((s3 = ((BaseBundle)bundle).getString("google.message_id")) == null) {
                                s3 = ((BaseBundle)bundle).getString("message_id");
                            }
                            if (s3 != null) {
                                a2.g(s3);
                            }
                            final String string2 = ((BaseBundle)bundle).getString("from");
                            String s4 = s;
                            if (string2 != null) {
                                s4 = s;
                                if (string2.startsWith("/topics/")) {
                                    s4 = string2;
                                }
                            }
                            if (s4 != null) {
                                a2.m(s4);
                            }
                            final String string3 = ((BaseBundle)bundle).getString("collapse_key");
                            if (string3 != null) {
                                a2.c(string3);
                            }
                            final String string4 = ((BaseBundle)bundle).getString("google.c.a.m_l");
                            if (string4 != null) {
                                a2.b(string4);
                            }
                            final String string5 = ((BaseBundle)bundle).getString("google.c.a.c_l");
                            if (string5 != null) {
                                a2.d(string5);
                            }
                            long n4 = 0L;
                            Label_0786: {
                                if (((BaseBundle)bundle).containsKey("google.c.sender.id")) {
                                    try {
                                        n4 = Long.parseLong(((BaseBundle)bundle).getString("google.c.sender.id"));
                                        break Label_0786;
                                    }
                                    catch (final NumberFormatException ex3) {
                                        Log.w("FirebaseMessaging", "error parsing project number", (Throwable)ex3);
                                    }
                                }
                                final ffa b3 = ffa.b();
                                final ufa c = b3.c;
                                b3.a();
                                c.getClass();
                                b3.a();
                                final String b4 = c.b;
                                Label_0737: {
                                    if (!b4.startsWith("1:")) {
                                        try {
                                            n4 = Long.parseLong(b4);
                                            break Label_0786;
                                        }
                                        catch (final NumberFormatException ex4) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", (Throwable)ex4);
                                            break Label_0737;
                                        }
                                    }
                                    final String[] split = b4.split(":");
                                    if (split.length >= 2) {
                                        final String s5 = split[1];
                                        if (!s5.isEmpty()) {
                                            try {
                                                n4 = Long.parseLong(s5);
                                            }
                                            catch (final NumberFormatException ex5) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", (Throwable)ex5);
                                                break Label_0737;
                                            }
                                            break Label_0786;
                                        }
                                    }
                                }
                                n4 = 0L;
                            }
                            if (n4 > 0L) {
                                a2.k(n4);
                            }
                            a = a2.a();
                            if (a == null) {
                                return;
                            }
                            try {
                                final sl1 sl1 = new sl1(Integer.valueOf(((Intent)ex).getIntExtra("google.product_id", 111881503)));
                                final sfo a3 = ((rfo)qfo).a("FCM_CLIENT_EVENT_LOGGING", new q99("proto"), (qeo)new pv9((byte)27));
                                final xa9 a4 = i8f.a();
                                a4.J(a);
                                a3.a(new el1((Object)a4.p(), voh.v, sl1));
                            }
                            catch (final RuntimeException ex6) {
                                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", (Throwable)ex6);
                            }
                            return;
                        }
                        catch (final InterruptedException ex) {}
                    }
                    catch (final ExecutionException | InterruptedException ex7) {}
                }
            }
            uy8.i((Throwable)ex);
        }
    }
    
    public static void V(final Bundle bundle, final String s) {
        try {
            ffa.b();
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            final Bundle bundle3 = new Bundle();
            final String string = ((BaseBundle)bundle2).getString("google.c.a.c_id");
            if (string != null) {
                ((BaseBundle)bundle3).putString("_nmid", string);
            }
            final String string2 = ((BaseBundle)bundle2).getString("google.c.a.c_l");
            if (string2 != null) {
                ((BaseBundle)bundle3).putString("_nmn", string2);
            }
            final String string3 = ((BaseBundle)bundle2).getString("google.c.a.m_l");
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                ((BaseBundle)bundle3).putString("label", string3);
            }
            final String string4 = ((BaseBundle)bundle2).getString("google.c.a.m_c");
            if (!TextUtils.isEmpty((CharSequence)string4)) {
                ((BaseBundle)bundle3).putString("message_channel", string4);
            }
            String string5 = ((BaseBundle)bundle2).getString("from");
            final String s2 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                ((BaseBundle)bundle3).putString("_nt", string5);
            }
            final String string6 = ((BaseBundle)bundle2).getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    ((BaseBundle)bundle3).putInt("_nmt", Integer.parseInt(string6));
                }
                catch (final NumberFormatException ex) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", (Throwable)ex);
                }
            }
            String string7 = s2;
            if (((BaseBundle)bundle2).containsKey("google.c.a.udt")) {
                string7 = ((BaseBundle)bundle2).getString("google.c.a.udt");
            }
            if (string7 != null) {
                try {
                    ((BaseBundle)bundle3).putInt("_ndt", Integer.parseInt(string7));
                }
                catch (final NumberFormatException ex2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", (Throwable)ex2);
                }
            }
            String s3;
            if (n2g.k(bundle2)) {
                s3 = "display";
            }
            else {
                s3 = "data";
            }
            if ("_nr".equals((Object)s) || "_nf".equals((Object)s)) {
                ((BaseBundle)bundle3).putString("_nmc", s3);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle3.toString();
            }
            final ffa b = ffa.b();
            b.a();
            ge9.C(((ie6)b.d).d((Class)t10.class));
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
        catch (final IllegalStateException ex3) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }
    
    public static float W(float n, final float[] array, final float[] array2) {
        final float abs = Math.abs(n);
        final float signum = Math.signum(n);
        final int binarySearch = Arrays.binarySearch(array, abs);
        if (binarySearch >= 0) {
            return signum * array2[binarySearch];
        }
        final int n2 = -(binarySearch + 1);
        final int n3 = n2 - 1;
        final int length = array.length;
        final float n4 = 0.0f;
        if (n3 < length - 1) {
            float n5;
            float n7;
            float n8;
            if (n3 == -1) {
                n5 = array[0];
                final float n6 = array2[0];
                n7 = 0.0f;
                n = n4;
                n8 = n6;
            }
            else {
                n7 = array[n3];
                n5 = array[n2];
                n = array2[n3];
                n8 = array2[n2];
            }
            return l3r.f(n, n8, n7, n5, abs) * signum;
        }
        final float n9 = array[array.length - 1];
        final float n10 = array2[array.length - 1];
        if (n9 == 0.0f) {
            return 0.0f;
        }
        return n10 / n9 * n;
    }
    
    public static String X(final String s, final String s2) {
        final int n = s.length() - s2.length();
        if (n >= 0 && n <= 1) {
            final StringBuilder sb = new StringBuilder(s2.length() + s.length());
            for (int i = 0; i < s.length(); ++i) {
                sb.append(s.charAt(i));
                if (s2.length() > i) {
                    sb.append(s2.charAt(i));
                }
            }
            return sb.toString();
        }
        en9.s("Invalid input received");
        return null;
    }
    
    public static final long Y(final int n, int n2, final String s) {
        final long n3 = 4294967295L;
        if (n == n2) {
            return (long)n << 32 | ((long)Float.floatToRawIntBits(Float.NaN) & 0xFFFFFFFFL);
        }
        int n4 = s.charAt(n);
        final boolean b = n4 == 45;
        int n6;
        if (b) {
            final int n5 = n + 1;
            if (n5 == n2) {
                return (long)n5 << 32 | ((long)Float.floatToRawIntBits(Float.NaN) & 0xFFFFFFFFL);
            }
            final char char1 = s.charAt(n5);
            if ((char)(char1 - '0') < '\n') {
                n6 = n5;
                n4 = char1;
            }
            else {
                n6 = n5;
                if ((n4 = char1) != 46) {
                    return (long)n5 << 32 | ((long)Float.floatToRawIntBits(Float.NaN) & 0xFFFFFFFFL);
                }
            }
        }
        else {
            n6 = n;
        }
        final int length = s.length();
        long n7 = 0L;
        int i = n6;
        long n8 = 0L;
        while (i != n2) {
            final int n9 = n4 - 48;
            if ((char)n9 >= '\n') {
                break;
            }
            n8 = n8 * 10L + n9;
            if (++i < length) {
                n4 = s.charAt(i);
            }
            else {
                n4 = 0;
            }
        }
        int n10 = i - n6;
        int j;
        int n11;
        int n16;
        int n18;
        if (i != n2 && n4 == 46) {
            for (n11 = (j = i + 1); n2 - j >= 4; j += 4) {
                final long n12 = (long)s.charAt(j) | (long)s.charAt(j + 1) << 16 | (long)s.charAt(j + 2) << 32 | (long)s.charAt(j + 3) << 48;
                final long n13 = n12 - 13511005043687472L;
                int n14;
                if (((n12 + 19703549022044230L | n13) & 0xFF80FF80FF80FF80L) != 0x0L) {
                    n14 = -1;
                }
                else {
                    n14 = (int)(n13 * 281475406208040961L >>> 48);
                }
                if (n14 < 0) {
                    break;
                }
                n8 = n8 * 10000L + n14;
            }
            int n15;
            if (j < length) {
                n15 = s.charAt(j);
            }
            else {
                n15 = 0;
            }
        Label_0403:
            while (true) {
                n16 = n15;
                while (j != n2) {
                    final int n17 = n16 - 48;
                    if ((char)n17 >= '\n') {
                        break;
                    }
                    n8 = n8 * 10L + n17;
                    if (++j < length) {
                        n15 = s.charAt(j);
                        continue Label_0403;
                    }
                    n16 = 0;
                }
                break;
            }
            n18 = n11 - j;
            n10 -= n18;
        }
        else {
            j = (n11 = i);
            final int n19 = 0;
            n16 = n4;
            n18 = n19;
        }
        if (n10 == 0) {
            return (long)j << 32 | ((long)Float.floatToRawIntBits(Float.NaN) & n3);
        }
        int k;
        int n24;
        if ((n16 | 0x20) == 0x65) {
            k = j + 1;
            char char2;
            if (k < length) {
                char2 = s.charAt(k);
            }
            else {
                char2 = '\0';
            }
            final boolean b2 = char2 == '-';
            if (b2 || char2 == '+') {
                k = j + 2;
            }
            int char3 = s.charAt(k);
            int n20 = 0;
            final int n21 = n18;
            while (k != n2) {
                final int n22 = char3 - 48;
                if ((char)n22 >= '\n') {
                    break;
                }
                int n23;
                if ((n23 = n20) < 1024) {
                    n23 = n20 * 10 + n22;
                }
                int char4;
                if (++k < length) {
                    char4 = s.charAt(k);
                }
                else {
                    char4 = 0;
                }
                char3 = char4;
                n20 = n23;
            }
            n24 = n20;
            if (b2) {
                n24 = -n20;
            }
            n18 = n21 + n24;
        }
        else {
            k = j;
            n24 = 0;
        }
        boolean b3 = false;
        Label_1011: {
            if (n10 > 19) {
                int char5 = s.charAt(n6);
                int n25 = n6;
                int n26 = n10;
                while (k != n2 && (char5 == 48 || char5 == 46)) {
                    int n27 = n26;
                    if (char5 == 48) {
                        n27 = n26 - 1;
                    }
                    int char6;
                    if (++n25 < length) {
                        char6 = s.charAt(n25);
                    }
                    else {
                        char6 = 0;
                    }
                    n26 = n27;
                    char5 = char6;
                }
                if (n26 > 19) {
                    n2 = s.charAt(n6);
                    n8 = 0L;
                    while (n6 != i && Long.compareUnsigned(n8, 1000000000000000000L) < 0) {
                        n8 = n8 * 10L + (n2 - 48);
                        if (++n6 < length) {
                            n2 = s.charAt(n6);
                        }
                        else {
                            n2 = 0;
                        }
                    }
                    if (Long.compareUnsigned(n8, 1000000000000000000L) >= 0) {
                        n2 = i - n6 + n24;
                    }
                    else {
                        n2 = s.charAt(n11);
                        int n28 = n11;
                        while (n28 != j && Long.compareUnsigned(n8, 1000000000000000000L) < 0) {
                            n8 = n8 * 10L + (n2 - 48);
                            if (++n28 < length) {
                                n2 = s.charAt(n28);
                            }
                            else {
                                n2 = 0;
                            }
                        }
                        n2 = n11 - n28 + n24;
                    }
                    b3 = true;
                    break Label_1011;
                }
            }
            b3 = false;
            n2 = n18;
        }
        if (-10 <= n2 && n2 < 11 && !b3 && Long.compareUnsigned(n8, 16777216L) <= 0) {
            final float n29 = (float)n8;
            final float[] b4 = ach.b;
            float n30;
            if (n2 < 0) {
                n30 = n29 / b4[-n2];
            }
            else {
                n30 = n29 * b4[n2];
            }
            float n31 = n30;
            if (b) {
                n31 = -n30;
            }
            return (long)k << 32 | ((long)Float.floatToRawIntBits(n31) & n3);
        }
        if (n8 == 0L) {
            float n32;
            if (b) {
                n32 = 0.0f;
            }
            else {
                n32 = 0.0f;
            }
            return (long)k << 32 | ((long)Float.floatToRawIntBits(n32) & n3);
        }
        if (-126 > n2 || n2 >= 128) {
            return (long)k << 32 | ((long)Float.floatToRawIntBits(Float.parseFloat(s.substring(n, k))) & n3);
        }
        final long n33 = ach.c[n2 + 325];
        final int numberOfLeadingZeros = Long.numberOfLeadingZeros(n8);
        final long n34 = n8 << numberOfLeadingZeros;
        final long n35 = n34 & n3;
        final long n36 = n34 >>> 32;
        final long n37 = n33 & n3;
        final long n38 = n33 >>> 32;
        final long n39 = n38 * n35;
        final long n40 = n36 * n38 + (n36 * n37 + (n35 * n37 >>> 32) + (n39 & n3) >>> 32) + (n39 >>> 32);
        final int n41 = (int)(n40 >>> 63);
        final long n42 = n40 >>> n41 + 9;
        final int n43 = numberOfLeadingZeros + (n41 ^ 0x1);
        final long n44 = n40 & 0x1FFL;
        if (n44 == 511L || (n44 == 0L && (0x3L & n42) == 0x1L)) {
            return (long)k << 32 | ((long)Float.floatToRawIntBits(Float.parseFloat(s.substring(n, k))) & n3);
        }
        final long n45 = n42 + 1L >>> 1;
        int n46 = n43;
        long n47 = n45;
        if (n45 >= 9007199254740992L) {
            n46 = n43 - 1;
            n47 = 4503599627370496L;
        }
        final long n48 = (n2 * 217706L >> 16) + 1087L - n46;
        if (n48 >= 1L && n48 <= 2046L) {
            if (b) {
                n7 = Long.MIN_VALUE;
            }
            return (long)k << 32 | ((long)Float.floatToRawIntBits((float)Double.longBitsToDouble(n48 << 52 | (n47 & 0xFFEFFFFFFFFFFFFFL) | n7)) & n3);
        }
        return (long)k << 32 | ((long)Float.floatToRawIntBits(Float.parseFloat(s.substring(n, k))) & n3);
    }
    
    public static List Z(ipb unmodifiableList, fdb o) {
        final List f = ((fdb)o).f("Set-Cookie");
        final int size = f.size();
        int n = 0;
        Object o2 = null;
    Label_0183_Outer:
        while (true) {
        Label_0993_Outer:
            while (true) {
                String s;
                long currentTimeMillis;
                int n2;
                int e;
                String o3;
                String o4;
                int n3;
                boolean b;
                boolean b3;
                boolean b2;
                long long1;
                long n4;
                Object b4;
                String s2;
                boolean b5;
                Object o5;
                Object o6;
                long a0;
                int d;
                int d2;
                String o7;
                boolean b6;
                Object o8;
                String b7;
                long n5;
                boolean b8;
                boolean b9;
                boolean b10;
                String d3;
                String s3;
                int a2;
                Object substring;
                Object v;
                is2 b11;
                long n6;
                Pattern compile;
                Label_0274_Outer:Label_0711_Outer:
                while (true) {
                    if (n < size) {
                        s = (String)f.get(n);
                        currentTimeMillis = System.currentTimeMillis();
                        n2 = gcq.e(s, ';', 0, 0, 6);
                        e = gcq.e(s, '=', 0, n2, 2);
                        if (e != n2) {
                            o3 = gcq.o(0, e, s);
                            if (o3.length() != 0) {
                                if (gcq.g(o3) == -1) {
                                    o4 = gcq.o(e + 1, n2, s);
                                    if (gcq.g(o4) == -1) {
                                        n3 = n2 + 1;
                                        n2 = s.length();
                                        b = false;
                                        b2 = (b3 = false);
                                        long1 = -1L;
                                        n4 = 253402300799999L;
                                        b4 = null;
                                        s2 = null;
                                        b5 = true;
                                        o5 = null;
                                        break Label_0183;
                                    }
                                }
                            }
                        }
                        o6 = null;
                        break Label_0993;
                    }
                    Label_1037: {
                        break Label_1037;
                        a0 = Long.MAX_VALUE;
                        Label_0751: {
                            if (n3 >= n2) {
                                break Label_0751;
                            }
                            d = gcq.d(s, ';', n3, n2);
                            d2 = gcq.d(s, '=', n3, d);
                            o7 = gcq.o(n3, d2, s);
                            if (d2 < d) {
                                o = gcq.o(d2 + 1, d, s);
                            }
                            else {
                                o = "";
                            }
                            Label_0304: {
                                if (!o7.equalsIgnoreCase("expires")) {
                                    break Label_0304;
                                }
                                Label_0711:Block_12_Outer:Label_0836_Outer:
                                while (true) {
                                    try {
                                        a0 = a0(((String)o).length(), (String)o);
                                        Label_0836:Label_0931_Outer:
                                        while (true) {
                                            while (true) {
                                                Block_26: {
                                                Block_17_Outer:
                                                    while (true) {
                                                        Block_11:Label_0406_Outer:
                                                        while (true) {
                                                            while (true) {
                                                                Label_0870_Outer:Label_1031_Outer:Block_27_Outer:
                                                                while (true) {
                                                                    b6 = true;
                                                                    o8 = b4;
                                                                    b7 = s2;
                                                                    n5 = long1;
                                                                    b8 = b;
                                                                    b9 = b5;
                                                                    b10 = b3;
                                                                    n3 = d + 1;
                                                                    b4 = o8;
                                                                    s2 = b7;
                                                                    long1 = n5;
                                                                    b = b8;
                                                                    b5 = b9;
                                                                    b2 = b6;
                                                                    n4 = a0;
                                                                    b3 = b10;
                                                                    continue Label_0993_Outer;
                                                                    Block_9: {
                                                                        Block_13:Block_22_Outer:
                                                                        while (true) {
                                                                        Block_10_Outer:
                                                                            while (true) {
                                                                                Block_25: {
                                                                                    while (true) {
                                                                                    Label_1031:
                                                                                        while (true) {
                                                                                            Label_1018: {
                                                                                                while (true) {
                                                                                                Label_1058_Outer:
                                                                                                    while (true) {
                                                                                                        Block_15: {
                                                                                                            Block_14: {
                                                                                                                Label_0821: {
                                                                                                                    while (true) {
                                                                                                                        Block_30: {
                                                                                                                            while (true) {
                                                                                                                            Label_0963:
                                                                                                                                while (true) {
                                                                                                                                    long1 = currentTimeMillis + a0;
                                                                                                                                    iftrue(Label_0824:)(long1 < currentTimeMillis || long1 > 253402300799999L);
                                                                                                                                    break Label_0821;
                                                                                                                                    iftrue(Label_0900:)(d3.length() == s3.length());
                                                                                                                                    break Label_1058_Outer;
                                                                                                                                    ++n;
                                                                                                                                    continue Label_0183_Outer;
                                                                                                                                    Label_0543: {
                                                                                                                                        iftrue(Label_0588:)(!o7.equalsIgnoreCase("secure"));
                                                                                                                                    }
                                                                                                                                    break Block_14;
                                                                                                                                    Label_0768:
                                                                                                                                    iftrue(Label_0832:)(long1 == -1L);
                                                                                                                                    Block_18: {
                                                                                                                                        break Block_18;
                                                                                                                                        Label_0588:
                                                                                                                                        iftrue(Label_0633:)(!o7.equalsIgnoreCase("httponly"));
                                                                                                                                        break Block_15;
                                                                                                                                        while (true) {
                                                                                                                                            b4 = new ArrayList();
                                                                                                                                            break Label_1018;
                                                                                                                                            substring = ((String)b4).substring(0, a2);
                                                                                                                                            break Label_0963;
                                                                                                                                            while (true) {
                                                                                                                                                continue Label_1031;
                                                                                                                                                b9 = false;
                                                                                                                                                o8 = b4;
                                                                                                                                                n5 = long1;
                                                                                                                                                b8 = b;
                                                                                                                                                b6 = b2;
                                                                                                                                                a0 = n4;
                                                                                                                                                b10 = b3;
                                                                                                                                                continue Label_0711;
                                                                                                                                                long1 = Long.MIN_VALUE;
                                                                                                                                                break Label_0836;
                                                                                                                                                o6 = null;
                                                                                                                                                break Label_0993;
                                                                                                                                                v = unmodifiableList;
                                                                                                                                                iftrue(Label_1068:)(unmodifiableList != null);
                                                                                                                                                return (List)r89.v;
                                                                                                                                                iftrue(Label_1000:)(o6 != null);
                                                                                                                                                continue Block_12_Outer;
                                                                                                                                            }
                                                                                                                                            Label_1000:
                                                                                                                                            iftrue(Label_1018:)((b4 = o2) != null);
                                                                                                                                            continue Block_27_Outer;
                                                                                                                                        }
                                                                                                                                        Label_0498:
                                                                                                                                        iftrue(Label_0543:)(!o7.equalsIgnoreCase("path"));
                                                                                                                                        break Block_13;
                                                                                                                                        iftrue(Label_1056:)(o2 == null);
                                                                                                                                        break Block_30;
                                                                                                                                        Label_0485:
                                                                                                                                        throw new IllegalArgumentException("Failed requirement.");
                                                                                                                                    }
                                                                                                                                    iftrue(Label_0794:)(long1 > 9223372036854775L);
                                                                                                                                    a0 = long1 * 1000L;
                                                                                                                                    continue Label_0870_Outer;
                                                                                                                                }
                                                                                                                                break Label_0836;
                                                                                                                                Label_0900: {
                                                                                                                                    s2 = "/";
                                                                                                                                }
                                                                                                                                iftrue(Label_0931:)(b4 == null);
                                                                                                                                break Block_25;
                                                                                                                                s3 = d3;
                                                                                                                                continue Label_1031_Outer;
                                                                                                                            }
                                                                                                                            Label_1056: {
                                                                                                                                unmodifiableList = null;
                                                                                                                            }
                                                                                                                            continue Block_22_Outer;
                                                                                                                            b10 = b3;
                                                                                                                            a0 = n4;
                                                                                                                            o5 = o;
                                                                                                                            b6 = b2;
                                                                                                                            b9 = b5;
                                                                                                                            b8 = b;
                                                                                                                            n5 = long1;
                                                                                                                            b7 = s2;
                                                                                                                            o8 = b4;
                                                                                                                            continue Label_0711;
                                                                                                                            Label_0852:
                                                                                                                            s3 = s2;
                                                                                                                            iftrue(Label_0870:)(D(d3, s2));
                                                                                                                            continue Label_1058_Outer;
                                                                                                                        }
                                                                                                                        unmodifiableList = (ipb)Collections.unmodifiableList((List)o2);
                                                                                                                        unmodifiableList.getClass();
                                                                                                                        continue Block_22_Outer;
                                                                                                                    }
                                                                                                                }
                                                                                                                break Label_0836;
                                                                                                            }
                                                                                                            b10 = true;
                                                                                                            o8 = b4;
                                                                                                            b7 = s2;
                                                                                                            n5 = long1;
                                                                                                            b8 = b;
                                                                                                            b9 = b5;
                                                                                                            b6 = b2;
                                                                                                            a0 = n4;
                                                                                                            continue Label_0711;
                                                                                                            iftrue(Label_0406:)(!o7.equalsIgnoreCase("max-age"));
                                                                                                            break Block_9;
                                                                                                        }
                                                                                                        b8 = true;
                                                                                                        o8 = b4;
                                                                                                        b7 = s2;
                                                                                                        n5 = long1;
                                                                                                        b9 = b5;
                                                                                                        b6 = b2;
                                                                                                        a0 = n4;
                                                                                                        b10 = b3;
                                                                                                        continue Label_0711;
                                                                                                        continue Block_22_Outer;
                                                                                                    }
                                                                                                    b11 = ggi.b;
                                                                                                    iftrue(Label_0900:)(s6r.n().a(s3) != null);
                                                                                                    continue Block_10_Outer;
                                                                                                }
                                                                                            }
                                                                                            ((List)b4).add(o6);
                                                                                            o2 = b4;
                                                                                            continue Label_1031;
                                                                                        }
                                                                                        v = r89.v;
                                                                                        return (List)v;
                                                                                        Label_0633: {
                                                                                            o8 = b4;
                                                                                        }
                                                                                        b7 = s2;
                                                                                        n5 = long1;
                                                                                        b8 = b;
                                                                                        b9 = b5;
                                                                                        b6 = b2;
                                                                                        a0 = n4;
                                                                                        b10 = b3;
                                                                                        iftrue(Label_0711:)(!o7.equalsIgnoreCase("samesite"));
                                                                                        continue Block_10_Outer;
                                                                                    }
                                                                                }
                                                                                substring = b4;
                                                                                iftrue(Label_0928:)(rym.E0((String)b4, "/", false));
                                                                                break Block_26;
                                                                                while (true) {
                                                                                    iftrue(Label_0485:)(rym.y0((String)o, ".", false));
                                                                                    break Block_11;
                                                                                    iftrue(Label_0498:)(!o7.equalsIgnoreCase("domain"));
                                                                                    continue Label_0406_Outer;
                                                                                }
                                                                                d3 = unmodifiableList.d;
                                                                                iftrue(Label_0852:)(s2 != null);
                                                                                continue Block_10_Outer;
                                                                            }
                                                                            Label_0824: {
                                                                                long1 = 253402300799999L;
                                                                            }
                                                                            continue Label_0836;
                                                                            b4 = unmodifiableList.b();
                                                                            a2 = kym.a1((CharSequence)b4, '/', 0, 6);
                                                                            substring = s2;
                                                                            iftrue(Label_0963:)(a2 == 0);
                                                                            continue Block_12_Outer;
                                                                        }
                                                                        o8 = o;
                                                                        b7 = s2;
                                                                        n5 = long1;
                                                                        b8 = b;
                                                                        b9 = b5;
                                                                        b6 = b2;
                                                                        a0 = n4;
                                                                        b10 = b3;
                                                                        continue Label_0711;
                                                                    }
                                                                    try {
                                                                        n6 = (long1 = Long.parseLong((String)o));
                                                                        a0 = n4;
                                                                        if (n6 <= 0L) {
                                                                            long1 = Long.MIN_VALUE;
                                                                            a0 = n4;
                                                                        }
                                                                        continue Label_0711_Outer;
                                                                    }
                                                                    catch (final NumberFormatException ex) {
                                                                        compile = Pattern.compile("-?\\d+");
                                                                        compile.getClass();
                                                                        if (compile.matcher((CharSequence)o).matches()) {
                                                                            if (rym.E0((String)o, "-", false)) {
                                                                                a0 = Long.MIN_VALUE;
                                                                            }
                                                                            long1 = a0;
                                                                            a0 = n4;
                                                                            continue Label_0711_Outer;
                                                                        }
                                                                        throw ex;
                                                                    }
                                                                    break;
                                                                }
                                                                continue Label_0931_Outer;
                                                            }
                                                            iftrue(Label_0768:)(long1 != Long.MIN_VALUE);
                                                            continue Label_0836_Outer;
                                                        }
                                                        b7 = acq.b(kym.g1((String)o, "."));
                                                        iftrue(Label_0475:)(b7 == null);
                                                        continue Block_17_Outer;
                                                    }
                                                    Label_0475: {
                                                        throw new IllegalArgumentException();
                                                    }
                                                }
                                                continue;
                                            }
                                            Label_1068: {
                                                return (List)v;
                                            }
                                            Label_0832:
                                            long1 = n4;
                                            continue Label_0836;
                                        }
                                        o6 = new x97(o3, o4, long1, s3, (String)substring, b3, b, b2, b5, (String)o5);
                                        continue Label_0274_Outer;
                                    }
                                    catch (final IllegalArgumentException | NumberFormatException ex2) {
                                        o8 = b4;
                                        b7 = s2;
                                        n5 = long1;
                                        b8 = b;
                                        b9 = b5;
                                        b6 = b2;
                                        a0 = n4;
                                        b10 = b3;
                                        continue Label_0711;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            }
        }
    }
    
    public static final void a(final int n, final gva gva, igf igf, final String s, final boolean b) {
        gva.i0(-278181955);
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
            if (gva.g(b)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        final int n6 = n4 | 0x180;
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            String j;
            if (b) {
                j = hia.j(gva, -1044881148, 2131757322, gva, false);
            }
            else {
                gva.g0(-1044879739);
                gva.q(false);
                j = s;
            }
            final cy4 a = qy4.a;
            final long m = qy4.a(gva).a.m();
            final mnn mnn = (mnn)((uy4)qy4.c(gva).k.v).H;
            final Object v = fgf.v;
            lmn.b(j, omo.W(b.w((igf)v, 0.0f, 200.0f, 1), 12.0f, 0.0f, 2), m, 0L, null, null, 0L, null, new kfn(5), 0L, 2, false, 3, 0, null, mnn, gva, 0, 24960, 109560);
            igf = (igf)v;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new tj4(s, b, igf, n);
        }
    }
    
    public static long a0(int n, final String s) {
        int i = z(0, n, s, false);
        final Matcher matcher = x97.n.matcher((CharSequence)s);
        final int n2 = -1;
        int n3 = -1;
        int n5;
        final int n4 = n5 = n3;
        int n7;
        int n6 = n7 = n5;
        int n8 = n4;
        int n9 = n2;
        while (i < n) {
            final int z = z(i + 1, n, s, true);
            matcher.region(i, z);
            int int1 = 0;
            int int2 = 0;
            int int3 = 0;
            int int4 = 0;
            int int5 = 0;
            int n10 = 0;
            Label_0434: {
                if (n3 == -1 && matcher.usePattern(x97.n).matches()) {
                    final String group = matcher.group(1);
                    group.getClass();
                    int1 = Integer.parseInt(group);
                    final String group2 = matcher.group(2);
                    group2.getClass();
                    int2 = Integer.parseInt(group2);
                    final String group3 = matcher.group(3);
                    group3.getClass();
                    int3 = Integer.parseInt(group3);
                    int4 = n9;
                    int5 = n8;
                    n10 = n5;
                }
                else if (n8 == -1 && matcher.usePattern(x97.m).matches()) {
                    final String group4 = matcher.group(1);
                    group4.getClass();
                    int5 = Integer.parseInt(group4);
                    int4 = n9;
                    int1 = n3;
                    n10 = n5;
                    int2 = n6;
                    int3 = n7;
                }
                else {
                    if (n5 == -1) {
                        final Pattern l = x97.l;
                        if (matcher.usePattern(l).matches()) {
                            final String group5 = matcher.group(1);
                            group5.getClass();
                            final Locale us = Locale.US;
                            final String r = oz1.r(us, group5, us);
                            final String pattern = l.pattern();
                            pattern.getClass();
                            n10 = kym.W0((CharSequence)pattern, r, 0, false, 6) / 4;
                            int4 = n9;
                            int1 = n3;
                            int5 = n8;
                            int2 = n6;
                            int3 = n7;
                            break Label_0434;
                        }
                    }
                    int4 = n9;
                    int1 = n3;
                    int5 = n8;
                    n10 = n5;
                    int2 = n6;
                    int3 = n7;
                    if (n9 == -1) {
                        int4 = n9;
                        int1 = n3;
                        int5 = n8;
                        n10 = n5;
                        int2 = n6;
                        int3 = n7;
                        if (matcher.usePattern(x97.k).matches()) {
                            final String group6 = matcher.group(1);
                            group6.getClass();
                            int4 = Integer.parseInt(group6);
                            int3 = n7;
                            int2 = n6;
                            n10 = n5;
                            int5 = n8;
                            int1 = n3;
                        }
                    }
                }
            }
            i = z(z + 1, n, s, false);
            n9 = int4;
            n3 = int1;
            n8 = int5;
            n5 = n10;
            n6 = int2;
            n7 = int3;
        }
        n = n9;
        if (70 <= n9 && (n = n9) < 100) {
            n = n9 + 1900;
        }
        int n11;
        if ((n11 = n) >= 0 && (n11 = n) < 70) {
            n11 = n + 2000;
        }
        if (n11 < 1601) {
            en9.s("Failed requirement.");
            return 0L;
        }
        if (n5 == -1) {
            en9.s("Failed requirement.");
            return 0L;
        }
        if (1 > n8 || n8 >= 32) {
            en9.s("Failed requirement.");
            return 0L;
        }
        if (n3 < 0 || n3 >= 24) {
            en9.s("Failed requirement.");
            return 0L;
        }
        if (n6 < 0 || n6 >= 60) {
            en9.s("Failed requirement.");
            return 0L;
        }
        if (n7 >= 0 && n7 < 60) {
            final GregorianCalendar gregorianCalendar = new GregorianCalendar(icq.a);
            ((Calendar)gregorianCalendar).setLenient(false);
            ((Calendar)gregorianCalendar).set(1, n11);
            ((Calendar)gregorianCalendar).set(2, n5 - 1);
            ((Calendar)gregorianCalendar).set(5, n8);
            ((Calendar)gregorianCalendar).set(11, n3);
            ((Calendar)gregorianCalendar).set(12, n6);
            ((Calendar)gregorianCalendar).set(13, n7);
            ((Calendar)gregorianCalendar).set(14, 0);
            return ((Calendar)gregorianCalendar).getTimeInMillis();
        }
        en9.s("Failed requirement.");
        return 0L;
    }
    
    public static final void b(final String s, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4, final jta jta, final jta jta2, final jta jta3, final jta jta4, final jta jta5, final jta jta6, final jta jta7, final jta jta8, final gva gva, final int n) {
        gva.i0(-1045964344);
        int n2;
        if (gva.f((Object)s)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)s2)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.g(b)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.g(b2)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        int n6;
        if (gva.g(b3)) {
            n6 = 16384;
        }
        else {
            n6 = 8192;
        }
        int n7;
        if (gva.g(b4)) {
            n7 = 131072;
        }
        else {
            n7 = 65536;
        }
        int n8;
        if (gva.h((Object)jta)) {
            n8 = 1048576;
        }
        else {
            n8 = 524288;
        }
        int n9;
        if (gva.h((Object)jta2)) {
            n9 = 8388608;
        }
        else {
            n9 = 4194304;
        }
        int n10;
        if (gva.h((Object)jta3)) {
            n10 = 67108864;
        }
        else {
            n10 = 33554432;
        }
        int n11;
        if (gva.h((Object)jta4)) {
            n11 = 536870912;
        }
        else {
            n11 = 268435456;
        }
        final int n12 = n | n2 | n3 | n4 | n5 | n6 | n7 | n8 | n9 | n10 | n11;
        int n13;
        if (gva.h((Object)jta5)) {
            n13 = 4;
        }
        else {
            n13 = 2;
        }
        int n14 = 1024;
        int n15;
        if (gva.h((Object)jta6)) {
            n15 = 32;
        }
        else {
            n15 = 16;
        }
        int n16;
        if (gva.h((Object)jta7)) {
            n16 = 256;
        }
        else {
            n16 = 128;
        }
        if (gva.h((Object)jta8)) {
            n14 = 2048;
        }
        if (gva.W(n12 & 0x1, (n12 & 0x12492493) != 0x12492492 || ((n13 | n15 | n16 | n14) & 0x493) != 0x492)) {
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = mlc.z((hc7)o89.v, gva);
                gva.q0(o);
            }
            i9r.d(uuj.t0(-688965159, (aua)new vj4(s2, b, b2, b3, b4, jta, jta2, jta3, jta4, jta5, jta6, jta7, jta8, (oc7)o, (y45)gva.j((sei)hm6.f), s, (xd3)gva.j((sei)dpd.a)), gva), iwq.a, gva, 54);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wj4(s, s2, b, b2, b3, b4, jta, jta2, jta3, jta4, jta5, jta6, jta7, jta8, n);
        }
    }
    
    public static wc2[] b0(final wc2 wc2, final wc2[] array) {
        if (array == null) {
            return new wc2[] { wc2 };
        }
        final int n = array.length + 1;
        final wc2[] array2 = new wc2[n];
        for (int i = 0; i < n; ++i) {
            wc2 wc3;
            if (i == 0) {
                wc3 = wc2;
            }
            else {
                wc3 = array[i - 1];
            }
            array2[i] = wc3;
        }
        return array2;
    }
    
    public static final void c(final ye6 ye6, final ye6 ye7, final ye6 ye8, final igf igf, float n, final gva gva, final int n2) {
        gva.i0(-163846153);
        int n4;
        if ((n2 & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)ye6)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x30) == 0x0) {
            int n6;
            if (gva.h((Object)ye7)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n2 & 0x180) == 0x0) {
            int n8;
            if (gva.h((Object)ye8)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        if ((n2 & 0xC00) == 0x0) {
            int n9;
            if (gva.f((Object)igf)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n7 |= n9;
        }
        final int n10 = n7 | 0x6000;
        if (gva.W(n10 & 0x1, (n10 & 0x2493) != 0x2492)) {
            zrn.s(igf, (zta)uuj.t0(1381627574, (aua)new rj4(50.0f, ye6, (byte)0), gva), (zta)uuj.t0(341335735, (aua)new rj4(50.0f, ye7, (byte)1), gva), (bua)uuj.t0(1399013984, (aua)new az3(50.0f, ye8), gva), 0.0f, null, null, false, gva, (n10 >> 9 & 0xE) | 0xDB0, 496);
            n = 50.0f;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new uj4(ye6, ye7, ye8, igf, n, n2);
        }
    }
    
    public static final gwj c0(final us4 us4, final String s, final boolean b, final KSerializer kSerializer, final jta jta, final gva gva) {
        final hwj hwj = (hwj)gva.j((sei)iwj.a);
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)s);
        sb.append(".router");
        final String string = sb.toString();
        final boolean f = gva.f((Object)string);
        final boolean f2 = gva.f((Object)hwj);
        final Object r = gva.R();
        Object o;
        if ((f | f2) || (o = r) == bi6.a) {
            if ((o = hwj.b.get((Object)string)) == null) {
                final jy7 jy7 = new jy7((byte)15);
                o = new gwj(jy7, vt4.l(com.arkivanov.decompose.router.children.b.a(hwj, (mrf)jy7, string, (jta)new v24(jta, (byte)4), (lta)new i1((Object)new eq4(kSerializer, (byte)0), (byte)13), (lta)new i1((Object)new eq4(kSerializer, (byte)1), (byte)14), (zta)new wp4((byte)2), (zta)new wp4((byte)3), (zta)new wp4((byte)4), (bua)new yp4((byte)1), (lta)new ff0((byte)1, b), (zta)new cqg((byte)15)), hwj.a.d()));
                hwj.b.put((Object)string, o);
            }
            gva.q0(o);
        }
        return (gwj)o;
    }
    
    public static final mn2 d() {
        return ao2.c(Integer.MAX_VALUE, 0, 6);
    }
    
    public static Object d0(final je6 je6, final zta zta, final m6n m6n) {
        final o68 a = vo8.a;
        vbb vbb2;
        final vbb vbb = vbb2 = w0e.a;
        Label_0024: {
            if (!uoo.d) {
                break Label_0024;
            }
            try {
                vbb2 = vbb.z;
            }
            catch (final UnsupportedOperationException | NotImplementedError unsupportedOperationException | NotImplementedError) {
                uoo.d = false;
                vbb2 = vbb;
            }
        }
        final pc7 v = pc7.v;
        final uad d = je6.d();
        final lqo a2 = lqo.a;
        Object m = null;
        Label_0096: {
            if (d.c() != sad.v) {
                m = ien.m((f07)m6n, (zta)new djh((Object)vbb2, (Object)d, (Object)zta, (f07)null, (byte)5));
                if (m == v) {
                    break Label_0096;
                }
            }
            m = a2;
        }
        if (m == v) {
            return m;
        }
        return a2;
    }
    
    public static final void e(final xd3 xd3, final zta zta, final gva gva, final int n) {
        gva.i0(1868971621);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)xd3);
            }
            else {
                b = gva.h((Object)xd3);
            }
            int n2;
            if (b) {
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
            boolean b2;
            if ((n & 0x40) == 0x0) {
                b2 = gva.f((Object)zta);
            }
            else {
                b2 = gva.h((Object)zta);
            }
            int n5;
            if (b2) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        final int n6 = false ? 1 : 0;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final boolean b3 = (n4 & 0xE) == 0x4 || ((n4 & 0x8) != 0x0 && gva.h((Object)xd3));
            boolean b4 = false;
            Label_0232: {
                if ((n4 & 0x70) != 0x20) {
                    b4 = (n6 != 0);
                    if ((n4 & 0x40) == 0x0) {
                        break Label_0232;
                    }
                    b4 = (n6 != 0);
                    if (!gva.h((Object)zta)) {
                        break Label_0232;
                    }
                }
                b4 = true;
            }
            final Object r = gva.R();
            Object o;
            if ((b3 | b4) || (o = r) == bi6.a) {
                o = new av7(xd3, zta, (f07)null);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)xd3);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6((Object)xd3, (Object)zta, n, (byte)3);
        }
    }
    
    public static DiException e0(final Class clazz, final qd6 qd6, final wc2 wc2, final tdk tdk) {
        final String simpleName = clazz.getSimpleName();
        final wc2[] array = (wc2[])qd6.p((Object)clazz);
        String s = null;
        Label_0057: {
            if (array != null) {
                final wc2 wc3 = (wc2)iw0.Y0((Object[])array);
                if (wc3 != null) {
                    s = "it has elements, first: ".concat(wc3.b());
                    break Label_0057;
                }
            }
            s = hia.k("a module says declareSet<", simpleName, ">()");
        }
        String s2;
        if (clazz == wc2.d && wc2.k == clazz) {
            s2 = lmf.t("An element is declared by its OWN class: inside contributes<", simpleName, "> { } write singleOf(::Impl) or scoped { Impl(\u2026) }, not a definition of ", simpleName, " itself.");
        }
        else {
            s2 = hia.k("Declare that definition inside a contributes<", simpleName, "> { } block too if it is one of several, or give the single value its own type if it is not.");
        }
        return (DiException)new RuntimeException(oz1.q(oz1.t(clazz.getName(), " is a multibinding set on ", tdk.a, "'s chain (", s), "; read with getAll), so it cannot also be the single-value key of\n  ", wc2.b(), "\n", s2), (Throwable)null);
    }
    
    public static final void f(final ye6 ye6, final gva gva) {
        final odk a = ii8.a(gva);
        final boolean f = gva.f((Object)null);
        final boolean f2 = gva.f((Object)a);
        final Object r = gva.R();
        Object o;
        if ((f | f2) || (o = r) == bi6.a) {
            o = a.d((Class)ux4.class, (emi)null);
            gva.q0(o);
        }
        final ux4 ux4 = (ux4)o;
        final Object r2 = gva.R();
        final cib a2 = bi6.a;
        Object o2;
        if ((o2 = r2) == a2) {
            synchronized (ux4) {
                o2 = ux4.a;
                final qud e = qud.e;
                o2 = ((di8)o2).f((tdk)e, (Object)"LoginScope");
                if (o2 != null) {
                    monitorexit(ux4);
                }
                else {
                    o2 = ux4.a;
                    o2 = ((di8)o2).e((tdk)e, (Object)"LoginScope", ((di8)o2).d(), new Object[0]);
                    final List a3 = adn.a;
                    final Object k = ((odk)o2).k;
                    final StringBuilder sb = new StringBuilder("ClaudeKoinScopeHolder: Created LoginScope ");
                    sb.append(k);
                    adn.e(6, sb.toString(), (String)null, (Map)null);
                    monitorexit(ux4);
                }
                o2 = new ndk((odk)o2);
                gva.q0(o2);
            }
        }
        final odk a4 = ((ndk)o2).a;
        final boolean h = gva.h((Object)ux4);
        final Object r3 = gva.R();
        Object o3;
        if (h || (o3 = r3) == a2) {
            o3 = new h87((Object)ux4, (byte)24);
            gva.q0(o3);
        }
        p(a4, (jta)o3, ye6, gva, 384);
    }
    
    public static boolean f0(final Intent intent) {
        if (intent != null && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals((Object)intent.getAction())) {
            final Bundle extras = intent.getExtras();
            return extras != null && "1".equals((Object)((BaseBundle)extras).getString("google.c.a.e"));
        }
        return false;
    }
    
    public static final void g(final rp4 rp4, final jta jta, final ye6 ye6, final ye6 ye7, final ye6 ye8, final sp4 sp4, final Object o, final igf igf, final pqg pqg, final cjh cjh, m0q a, final Object o2, final boolean b, final boolean b2, final gva gva, final int n) {
        gva.i0(144327090);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b3;
            if ((n & 0x8) == 0x0) {
                b3 = gva.f((Object)rp4);
            }
            else {
                b3 = gva.h((Object)rp4);
            }
            int n2;
            if (b3) {
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
        final int n6 = 128;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.h((Object)ye6)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n4 |= n7;
        }
        final int n8 = 2048;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.h((Object)ye7)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n4 |= n9;
        }
        int n11;
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.h((Object)ye8)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n11 = (n4 | n10);
        }
        else {
            n11 = n4;
        }
        int n12 = n11;
        if ((n & 0x30000) == 0x0) {
            boolean b4;
            if ((n & 0x40000) == 0x0) {
                b4 = gva.f((Object)sp4);
            }
            else {
                b4 = gva.h((Object)sp4);
            }
            int n13;
            if (b4) {
                n13 = 131072;
            }
            else {
                n13 = 65536;
            }
            n12 = (n11 | n13);
        }
        int n14 = n12;
        if ((n & 0x180000) == 0x0) {
            boolean b5;
            if ((n & 0x200000) == 0x0) {
                b5 = gva.f(o);
            }
            else {
                b5 = gva.h(o);
            }
            int n15;
            if (b5) {
                n15 = 1048576;
            }
            else {
                n15 = 524288;
            }
            n14 = (n12 | n15);
        }
        int n16 = n14;
        if ((n & 0xC00000) == 0x0) {
            int n17;
            if (gva.f((Object)igf)) {
                n17 = 8388608;
            }
            else {
                n17 = 4194304;
            }
            n16 = (n14 | n17);
        }
        int n18 = n16;
        if ((n & 0x6000000) == 0x0) {
            int n19;
            if (gva.f((Object)pqg)) {
                n19 = 67108864;
            }
            else {
                n19 = 33554432;
            }
            n18 = (n16 | n19);
        }
        int n20 = n18;
        if ((n & 0x30000000) == 0x0) {
            boolean b6;
            if ((n & 0x40000000) == 0x0) {
                b6 = gva.f((Object)cjh);
            }
            else {
                b6 = gva.h((Object)cjh);
            }
            int n21;
            if (b6) {
                n21 = 536870912;
            }
            else {
                n21 = 268435456;
            }
            n20 = (n18 | n21);
        }
        int n22;
        if (gva.h(o2)) {
            n22 = 32;
        }
        else {
            n22 = 16;
        }
        int n23 = n6;
        if (gva.g(b)) {
            n23 = 256;
        }
        int n24;
        if (gva.g(b2)) {
            n24 = n8;
        }
        else {
            n24 = 1024;
        }
        final int n25 = 0x2 | n22 | n23 | n24;
        if (gva.W(n20 & 0x1, (n20 & 0x12492493) != 0x12492492 || (n25 & 0x493) != 0x492)) {
            gva.b0();
            int n26;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n26 = (n25 & 0xFFFFFFF1);
            }
            else {
                a = uoo.A(gva);
                n26 = (n25 & 0xFFFFFFF1);
            }
            gva.r();
            final int n27 = n20 & 0xE;
            final bnf w = o50.W((Object)rp4, gva);
            final Object r = gva.R();
            final cib a2 = bi6.a;
            Object o3 = r;
            if (r == a2) {
                o3 = new shd(w);
                gva.q0(o3);
            }
            final shd shd = (shd)o3;
            final tun b7 = shd.b();
            Object r2 = gva.R();
            if (r2 == a2) {
                r2 = new pn((byte)21, (f07)null, (Object)shd);
                gva.q0(r2);
            }
            mlc.f((zta)r2, gva, (Object)b7);
            bjh.a(shd, jta, gva, n20 & 0x70);
            final kpg n28 = ajq.n(a.a, pqg, gva);
            final lpg o4 = yiq.o(gva);
            Object o5;
            if ((o5 = gva.R()) == a2) {
                o5 = ca9.r(0, gva);
            }
            final hsg hsg = (hsg)o5;
            final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
            final qzc qzc = (qzc)gva.j((sei)hm6.n);
            final boolean f = gva.f((Object)n28);
            final boolean f2 = gva.f((Object)xc8);
            final boolean d = gva.d(((Enum)qzc).ordinal());
            final Object r3 = gva.R();
            fpg fpg;
            if ((d | (f | f2)) || (fpg = (fpg)r3) == a2) {
                fpg = new fpg(n28.a(xc8, qzc));
                gva.q0((Object)fpg);
            }
            final fpg fpg2 = fpg;
            final tun j = shd.c.j();
            final List b8 = n28.b();
            final Integer a3 = o4.a();
            int intValue;
            if (a3 != null) {
                intValue = a3;
            }
            else {
                intValue = -1;
            }
            final bfa n29 = yiq.n(n26 >> 9 & 0xE, gva, b2);
            final boolean f3 = gva.f((Object)fpg2);
            final Object r4 = gva.R();
            Object o6;
            if (f3 || (o6 = r4) == a2) {
                o6 = new d3a(fpg2);
                gva.q0(o6);
            }
            final ypg w2 = uuj.w0(j, b8, intValue, n29, (lta)o6, gva, 16);
            final int n30 = n26 << 12;
            yiq.c(rp4, n28, w2, o4, hsg, o2, b, gva, n27 | 0x6000 | (0x70000 & n30) | (n30 & 0x380000));
            soh.d(pqg, shd.c, uuj.t0(-1203596564, (aua)new phd(rp4, sp4, cjh, o, ye6, ye7, ye8, (byte)0), gva), uuj.t0(429301165, (aua)new qhd(rp4, sp4, cjh, ye7, (byte)0), gva), igf, (bua)uuj.t0(-599870673, (aua)new qhd(rp4, sp4, cjh, ye8, (byte)1), gva), (cua)uuj.t0(930494014, (aua)new dp((Object)fpg2, (Object)hsg, (byte)11), gva), w2, gva, (n20 >> 24 & 0xE) | 0x1B0D80 | (0xE000 & n20 >> 9));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new oy5(rp4, jta, ye6, ye7, ye8, sp4, o, igf, pqg, cjh, a, o2, b, b2, n);
        }
    }
    
    public static final Object[] g0(final Collection collection) {
        final int size = collection.size();
        final Object[] a = ach.a;
        if (size == 0) {
            return a;
        }
        final Iterator iterator = collection.iterator();
        if (!iterator.hasNext()) {
            return a;
        }
        Object[] array = new Object[size];
        int n = 0;
        while (true) {
            final int n2 = n + 1;
            array[n] = iterator.next();
            Object[] copy;
            if (n2 >= array.length) {
                if (!iterator.hasNext()) {
                    return array;
                }
                int n3;
                if ((n3 = n2 * 3 + 1 >>> 1) <= n2) {
                    n3 = 2147483645;
                    if (n2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                copy = Arrays.copyOf(array, n3);
            }
            else {
                copy = array;
                if (!iterator.hasNext()) {
                    return Arrays.copyOf(array, n2);
                }
            }
            n = n2;
            array = copy;
        }
    }
    
    public static final void h(final rp4 rp4, final sp4 sp4, final cjh cjh, final Object o, final ye6 ye6, final ye6 ye7, final ye6 ye8, final gva gva, final int n) {
        gva.i0(-877078782);
        int n2;
        if (gva.f((Object)rp4)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)sp4)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)cjh)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.f(o)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        final int n6 = n | n2 | n3 | n4 | n5;
        boolean b = false;
        if (gva.W(n6 & 0x1, (0x92493 & n6) != 0x92492)) {
            final hwj hwj = (hwj)gva.j((sei)iwj.a);
            final boolean b2 = (n6 & 0xE) == 0x4;
            if ((n6 & 0x1C00) == 0x800) {
                b = true;
            }
            final boolean f = gva.f((Object)hwj);
            final Object r = gva.R();
            Object n7;
            if ((b2 | b | f) || (n7 = r) == bi6.a) {
                final ygd a = lq6.A();
                for (final fp4 fp4 : rp4.a) {
                    a.add((Object)new fp4(fp4.a, (Object)new ka6(fp4), fp4.c));
                }
                if (rp4.d == zp4.v) {
                    for (final fp4 fp5 : rp4.b) {
                        a.add((Object)new fp4(fp5.a, (Object)new ia6(fp5), fp5.c));
                    }
                    for (final fp4 fp6 : rp4.c) {
                        a.add((Object)new fp4(fp6.a, (Object)new ja6(fp6), fp6.c));
                    }
                    if (a.isEmpty()) {
                        SilentException.a(new SilentException("All panes are empty. Using fallback"), (lpl)null, (List)null, 5);
                        a.add((Object)new fp4(o, (Object)new ka6(new fp4(o, (Object)hwj, "fallback")), "fallback"));
                    }
                }
                n7 = lq6.n(a);
                gva.q0(n7);
            }
            final List list = (List)n7;
            final zp4 d = rp4.d;
            final ye6 t0 = uuj.t0(1053739518, (aua)new bz((Object)ye6, (Object)ye7, (Object)ye8, (byte)12), gva);
            final int n8 = n6 << 3;
            s(list, d, sp4, cjh, t0, gva, (n8 & 0x380) | 0x7000 | (n8 & 0x1C00));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new mz0((Object)rp4, (Object)sp4, (Object)cjh, o, (Object)ye6, (Object)ye7, (Object)ye8, n, (byte)7);
        }
    }
    
    public static final Object[] h0(final Collection collection, final Object[] array) {
        array.getClass();
        final int size = collection.size();
        int n = 0;
        if (size == 0) {
            if (array.length > 0) {
                array[0] = null;
                return array;
            }
        }
        else {
            final Iterator iterator = collection.iterator();
            if (!iterator.hasNext()) {
                if (array.length > 0) {
                    array[0] = null;
                }
            }
            else {
                Object[] array2;
                if (size <= array.length) {
                    array2 = array;
                }
                else {
                    final Object instance = Array.newInstance((Class)array.getClass().getComponentType(), size);
                    instance.getClass();
                    array2 = (Object[])instance;
                }
                while (true) {
                    final int n2 = n + 1;
                    array2[n] = iterator.next();
                    Object[] copy;
                    if (n2 >= array2.length) {
                        if (!iterator.hasNext()) {
                            return array2;
                        }
                        int n3;
                        if ((n3 = n2 * 3 + 1 >>> 1) <= n2) {
                            n3 = 2147483645;
                            if (n2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        copy = Arrays.copyOf(array2, n3);
                    }
                    else {
                        copy = array2;
                        if (!iterator.hasNext()) {
                            if (array2 == array) {
                                array[n2] = null;
                                return array;
                            }
                            return Arrays.copyOf(array2, n2);
                        }
                    }
                    n = n2;
                    array2 = copy;
                }
            }
        }
        return array;
    }
    
    public static final void i(final x96 x96, final String s, final boolean b, final boolean b2, final boolean b3, final boolean b4, final jta jta, final jta jta2, final jta jta3, final jta jta4, final jta jta5, final jta jta6, final jta jta7, final jta jta8, final jta jta9, final gva gva, final int n) {
        gva.i0(1438769771);
        int n3;
        if ((n & 0x30) == 0x0) {
            int n2;
            if (gva.f((Object)s)) {
                n2 = 32;
            }
            else {
                n2 = 16;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x180) == 0x0) {
            int n5;
            if (gva.g(b)) {
                n5 = 256;
            }
            else {
                n5 = 128;
            }
            n4 = (n3 | n5);
        }
        if ((n & 0xC00) == 0x0) {
            int n6;
            if (gva.g(b2)) {
                n6 = 2048;
            }
            else {
                n6 = 1024;
            }
            n4 |= n6;
        }
        if ((n & 0x6000) == 0x0) {
            int n7;
            if (gva.g(b3)) {
                n7 = 16384;
            }
            else {
                n7 = 8192;
            }
            n4 |= n7;
        }
        int n8 = n4;
        if ((n & 0x30000) == 0x0) {
            int n9;
            if (gva.g(b4)) {
                n9 = 131072;
            }
            else {
                n9 = 65536;
            }
            n8 = (n4 | n9);
        }
        int n10 = n8;
        if ((n & 0x180000) == 0x0) {
            int n11;
            if (gva.h((Object)jta)) {
                n11 = 1048576;
            }
            else {
                n11 = 524288;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((n & 0xC00000) == 0x0) {
            int n13;
            if (gva.h((Object)jta2)) {
                n13 = 8388608;
            }
            else {
                n13 = 4194304;
            }
            n12 = (n10 | n13);
        }
        int n14 = n12;
        if ((n & 0x6000000) == 0x0) {
            int n15;
            if (gva.h((Object)jta3)) {
                n15 = 67108864;
            }
            else {
                n15 = 33554432;
            }
            n14 = (n12 | n15);
        }
        int n16 = n14;
        if ((n & 0x30000000) == 0x0) {
            int n17;
            if (gva.h((Object)jta4)) {
                n17 = 536870912;
            }
            else {
                n17 = 268435456;
            }
            n16 = (n14 | n17);
        }
        int n18;
        if (gva.h((Object)jta5)) {
            n18 = 4;
        }
        else {
            n18 = 2;
        }
        int n19;
        if (gva.h((Object)jta6)) {
            n19 = 32;
        }
        else {
            n19 = 16;
        }
        int n20;
        if (gva.h((Object)jta7)) {
            n20 = 256;
        }
        else {
            n20 = 128;
        }
        int n21;
        if (gva.h((Object)jta8)) {
            n21 = 2048;
        }
        else {
            n21 = 1024;
        }
        int n22;
        if (gva.h((Object)jta9)) {
            n22 = 16384;
        }
        else {
            n22 = 8192;
        }
        final int n23 = n18 | n19 | n20 | n21 | n22;
        if (gva.W(n16 & 0x1, (n16 & 0x12492491) != 0x12492490 || (n23 & 0x2493) != 0x2492)) {
            a(n16 >> 3 & 0x7E, gva, null, s, b);
            if (jta8 == null) {
                gva.g0(-1382744575);
            }
            else {
                gva.g0(-1382744574);
                ier.A.t(jta8, gva, 48);
            }
            gva.q(false);
            final int n24 = n23 << 24;
            l9r.a(b, b2, b3, b4, jta, jta2, jta3, jta4, jta5, jta6, jta7, jta9, gva, (n16 >> 6 & 0x1FFFFFE) | (0xE000000 & n24) | (n24 & 0x70000000), (n23 >> 6 & 0xE) | (n23 >> 9 & 0x70));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new v44(x96, s, b, b2, b3, b4, jta, jta2, jta3, jta4, jta5, jta6, jta7, jta8, jta9, n);
        }
    }
    
    public static final long i0(final long n) {
        final awp w = lz8.w;
        final boolean b = n > 0L;
        if (b) {
            return lz8.i(lz8.r(n, ri2.F0(999999L, pz8.w)));
        }
        if (!b) {
            return 0L;
        }
        en9.r();
        return 0L;
    }
    
    public static final void j(final int n, final ye6 ye6, final ye6 ye7, final gva gva, igf v) {
        gva.i0(-1653935442);
        final int n2 = n | 0x180;
        if (gva.W(n2 & 0x1, (n2 & 0x93) != 0x92)) {
            final List y = lq6.Y((Object[])new zta[] { (zta)ye6, (zta)ye7 });
            final Object r = gva.R();
            final cib a = bi6.a;
            Object c;
            if ((c = r) == a) {
                c = h7f.c;
                gva.q0(c);
            }
            final ojf ojf = (ojf)c;
            final ye6 k = ien.k(y);
            Object r2;
            if ((r2 = gva.R()) == a) {
                r2 = new pjf(ojf);
                gva.q0(r2);
            }
            final moe moe = (moe)r2;
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            v = (igf)fgf.v;
            final igf b = ien.B(gva, v);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)moe);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b);
            hia.t(0, k, gva, true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new b4n(n, (Object)ye6, (Object)ye7, (Object)v, (byte)12);
        }
    }
    
    public static final k6c j0(final fji fji) {
        final String e = fji.e();
        e.getClass();
        final ArrayList c = fji.c();
        final int d = fji.d();
        int n = 1;
        if (d != 1) {
            n = 2;
            if (d != 2) {
                n = 3;
            }
        }
        final pk a = fji.a();
        String e2;
        if (a != null) {
            e2 = a.e();
        }
        else {
            e2 = null;
        }
        return new k6c(e, c, n, e2, fji.b());
    }
    
    public static final void k(final int n, final jta jta, final gva gva, igf v) {
        gva.i0(-1047833956);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)jta)) {
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
        final int n4 = n3 | 0x30;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final lh0 p3 = lh0.P;
            final String s = soh.S(((p37)gva.j((sei)q37.a())).a(), gva);
            v = (igf)fgf.v;
            m6r.a(p3, s, v, false, (rp2)null, (cq2)null, (bua)null, jta, gva, 0x180 | (n4 << 21 & 0x1C00000), 120);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ay(jta, v, n, (byte)2);
        }
    }
    
    public static Class k0(final Class clazz) {
        if (clazz == Integer.TYPE) {
            return Integer.class;
        }
        if (clazz == Float.TYPE) {
            return Float.class;
        }
        if (clazz == Byte.TYPE) {
            return Byte.class;
        }
        if (clazz == Double.TYPE) {
            return Double.class;
        }
        if (clazz == Long.TYPE) {
            return Long.class;
        }
        if (clazz == Character.TYPE) {
            return Character.class;
        }
        if (clazz == Boolean.TYPE) {
            return Boolean.class;
        }
        if (clazz == Short.TYPE) {
            return Short.class;
        }
        Class<Void> clazz2;
        if ((clazz2 = clazz) == Void.TYPE) {
            clazz2 = Void.class;
        }
        return clazz2;
    }
    
    public static final void l(final iln iln, final igf igf, boolean b, final mnn mnn, riq riq, final zta zta, final zta zta2, final zta zta3, mvc g, final djn djn, ufk ufk, final aql aql, final ihn ihn, final dng dng, final gva gva, final int n, final int n2) {
        gva.i0(-2007078942);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)iln)) {
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
        final int n5 = 16;
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.f((Object)igf)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n4 |= n6;
        }
        int n8;
        final int n7 = n8 = (n4 | 0xD80);
        if ((n & 0x6000) == 0x0) {
            int n9;
            if (gva.f((Object)mnn)) {
                n9 = 16384;
            }
            else {
                n9 = 8192;
            }
            n8 = (n7 | n9);
        }
        int n10 = n8;
        if ((0x30000 & n) == 0x0) {
            n10 = (n8 | 0x10000);
        }
        int n12;
        final int n11 = n12 = (n10 | 0x180000);
        if ((0xC00000 & n) == 0x0) {
            int n13;
            if (gva.h((Object)zta)) {
                n13 = 8388608;
            }
            else {
                n13 = 4194304;
            }
            n12 = (n11 | n13);
        }
        int n14 = n12;
        if ((0x6000000 & n) == 0x0) {
            int n15;
            if (gva.h((Object)zta2)) {
                n15 = 67108864;
            }
            else {
                n15 = 33554432;
            }
            n14 = (n12 | n15);
        }
        int n16 = n14;
        if ((0x30000000 & n) == 0x0) {
            int n17;
            if (gva.h((Object)zta3)) {
                n17 = 536870912;
            }
            else {
                n17 = 268435456;
            }
            n16 = (n14 | n17);
        }
        int n18;
        if ((n2 & 0x6) == 0x0) {
            n18 = (n2 | 0x2);
        }
        else {
            n18 = n2;
        }
        int n19 = n18;
        if ((n2 & 0x30) == 0x0) {
            int n20 = n5;
            if (gva.f((Object)aql)) {
                n20 = 32;
            }
            n19 = (n18 | n20);
        }
        int n21 = n19;
        if ((n2 & 0x180) == 0x0) {
            int n22;
            if (gva.f((Object)ihn)) {
                n22 = 256;
            }
            else {
                n22 = 128;
            }
            n21 = (n19 | n22);
        }
        if ((n2 & 0xC00) == 0x0) {
            int n23;
            if (gva.f((Object)dng)) {
                n23 = 2048;
            }
            else {
                n23 = 1024;
            }
            n21 |= n23;
        }
        if (gva.W(n16 & 0x1, (0x12492493 & n16) != 0x12492492 || ((n21 | 0x6000) & 0x2493) != 0x2492)) {
            gva.b0();
            ufk t;
            riq riq3;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final riq riq2 = riq;
                t = ufk;
                riq3 = riq2;
            }
            else {
                riq3 = new vin(0);
                g = mvc.g;
                b = true;
                t = rhc.T(0, 1, gva);
            }
            gva.r();
            gva.g0(1647396217);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = oz1.g(gva);
            }
            final llf llf = (llf)o;
            gva.q(false);
            gva.g0(-362494724);
            long n24 = mnn.c();
            if (n24 == 16L) {
                n24 = ihn.d(b, false, (boolean)((xom)t08.t(llf, gva, 0)).getValue());
            }
            gva.q(false);
            c5q.c(hnn.a.a((Object)ihn.k), (zta)uuj.t0(-416142558, (aua)new py3(igf, riq3, ihn, iln, b, djn, llf, zta, zta2, zta3, dng, mnn.e(new mnn(n24, 0L, (zoa)null, (soa)null, (una)null, 0L, 0L, 0, 0, 0L, (idd)null, 16777214)), g, t, aql), gva), gva, 56);
            final riq riq4 = riq3;
            ufk = t;
            riq = riq4;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ajg(iln, igf, b, mnn, riq, zta, zta2, zta3, g, djn, ufk, aql, ihn, dng, n, n2);
        }
    }
    
    public static int l0(final int n) {
        return (int)(Integer.rotateLeft((int)(n * -862048943L), 15) * 461845907L);
    }
    
    public static final void m(final mln mln, final lta lta, final igf igf, boolean b, mnn mnn, zta zta, final zta zta2, zta zta3, final zta zta4, boolean b2, final lep lep, final mvc mvc, final gvc gvc, final boolean b3, int n, int n2, final aql aql, final ihn ihn, final gva gva, final int n3, final int n4, final int n5, final int n6) {
        gva.i0(2057288437);
        int n8;
        if ((n3 & 0x6) == 0x0) {
            int n7;
            if (gva.f((Object)mln)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n8 = (n7 | n3);
        }
        else {
            n8 = n3;
        }
        if ((n3 & 0x30) == 0x0) {
            int n9;
            if (gva.h((Object)lta)) {
                n9 = 32;
            }
            else {
                n9 = 16;
            }
            n8 |= n9;
        }
        final int n10 = 256;
        if ((n3 & 0x180) == 0x0) {
            int n11;
            if (gva.f((Object)igf)) {
                n11 = 256;
            }
            else {
                n11 = 128;
            }
            n8 |= n11;
        }
        final int n12 = n6 & 0x8;
        final int n13 = 1024;
        int n14;
        if (n12 != 0) {
            n14 = (n8 | 0xC00);
        }
        else {
            n14 = n8;
            if ((n3 & 0xC00) == 0x0) {
                int n15;
                if (gva.g(b)) {
                    n15 = 2048;
                }
                else {
                    n15 = 1024;
                }
                n14 = (n8 | n15);
            }
        }
        final int n16 = 8192;
        int n17;
        if ((n6 & 0x10) != 0x0) {
            n17 = (n14 | 0x6000);
        }
        else {
            n17 = n14;
            if ((n3 & 0x6000) == 0x0) {
                int n18;
                if (gva.g(false)) {
                    n18 = 16384;
                }
                else {
                    n18 = 8192;
                }
                n17 = (n14 | n18);
            }
        }
        final int n19 = 131072;
        int n21;
        if ((n3 & 0x30000) == 0x0) {
            int n20;
            if ((n6 & 0x20) == 0x0 && gva.f((Object)mnn)) {
                n20 = 131072;
            }
            else {
                n20 = 65536;
            }
            n21 = (n17 | n20);
        }
        else {
            n21 = n17;
        }
        final int n22 = n6 & 0x40;
        final int n23 = 1048576;
        int n24;
        if (n22 != 0) {
            n24 = (n21 | 0x180000);
        }
        else {
            n24 = n21;
            if ((n3 & 0x180000) == 0x0) {
                int n25;
                if (gva.h((Object)zta)) {
                    n25 = 1048576;
                }
                else {
                    n25 = 524288;
                }
                n24 = (n21 | n25);
            }
        }
        final int n26 = 8388608;
        int n27 = n24;
        if ((n3 & 0xC00000) == 0x0) {
            int n28;
            if (gva.h((Object)zta2)) {
                n28 = 8388608;
            }
            else {
                n28 = 4194304;
            }
            n27 = (n24 | n28);
        }
        final int n29 = 33554432;
        int n30;
        if ((n6 & 0x100) != 0x0) {
            n30 = (n27 | 0x6000000);
        }
        else {
            n30 = n27;
            if ((n3 & 0x6000000) == 0x0) {
                int n31;
                if (gva.h((Object)null)) {
                    n31 = 67108864;
                }
                else {
                    n31 = 33554432;
                }
                n30 = (n27 | n31);
            }
        }
        final int n32 = 268435456;
        int n33;
        if ((n6 & 0x200) != 0x0) {
            n33 = (n30 | 0x30000000);
        }
        else {
            n33 = n30;
            if ((n3 & 0x30000000) == 0x0) {
                int n34;
                if (gva.h((Object)null)) {
                    n34 = 536870912;
                }
                else {
                    n34 = 268435456;
                }
                n33 = (n30 | n34);
            }
        }
        final int n35 = n6 & 0x400;
        int n36;
        if (n35 != 0) {
            n36 = (n4 | 0x6);
        }
        else if ((n4 & 0x6) == 0x0) {
            int n37;
            if (gva.h((Object)zta3)) {
                n37 = 4;
            }
            else {
                n37 = 2;
            }
            n36 = (n4 | n37);
        }
        else {
            n36 = n4;
        }
        int n38;
        if ((n6 & 0x800) != 0x0) {
            n38 = (n36 | 0x30);
        }
        else {
            n38 = n36;
            if ((n4 & 0x30) == 0x0) {
                int n39;
                if (gva.h((Object)null)) {
                    n39 = 32;
                }
                else {
                    n39 = 16;
                }
                n38 = (n36 | n39);
            }
        }
        final int n40 = n6 & 0x1000;
        int n41;
        if (n40 != 0) {
            n41 = (n38 | 0x180);
        }
        else {
            n41 = n38;
            if ((n4 & 0x180) == 0x0) {
                int n42;
                if (gva.h((Object)zta4)) {
                    n42 = 256;
                }
                else {
                    n42 = 128;
                }
                n41 |= n42;
            }
        }
        final int n43 = n6 & 0x2000;
        int n44;
        if (n43 != 0) {
            n44 = (n41 | 0xC00);
        }
        else {
            final int n45 = n44 = n41;
            if ((n4 & 0xC00) == 0x0) {
                int n46 = n13;
                if (gva.g(b2)) {
                    n46 = 2048;
                }
                n44 = (n45 | n46);
            }
        }
        if ((n4 & 0x6000) == 0x0) {
            int n47 = n16;
            if (gva.f((Object)lep)) {
                n47 = 16384;
            }
            n44 |= n47;
        }
        int n48 = n44;
        if ((n4 & 0x30000) == 0x0) {
            int n49;
            if (gva.f((Object)mvc)) {
                n49 = n19;
            }
            else {
                n49 = 65536;
            }
            n48 = (n44 | n49);
        }
        final int n50 = n6 & 0x10000;
        int n51;
        if (n50 != 0) {
            n51 = (n48 | 0x180000);
        }
        else {
            n51 = n48;
            if ((n4 & 0x180000) == 0x0) {
                int n52;
                if (gva.f((Object)gvc)) {
                    n52 = n23;
                }
                else {
                    n52 = 524288;
                }
                n51 = (n48 | n52);
            }
        }
        int n53 = n51;
        if ((n4 & 0xC00000) == 0x0) {
            int n54;
            if (gva.g(b3)) {
                n54 = n26;
            }
            else {
                n54 = 4194304;
            }
            n53 = (n51 | n54);
        }
        if ((n4 & 0x6000000) == 0x0) {
            int n55 = n29;
            if ((n6 & 0x40000) == 0x0) {
                n55 = n29;
                if (gva.d(n)) {
                    n55 = 67108864;
                }
            }
            n53 |= n55;
        }
        final int n56 = n6 & 0x80000;
        int n57;
        if (n56 != 0) {
            n57 = (n53 | 0x30000000);
        }
        else {
            n57 = n53;
            if ((n4 & 0x30000000) == 0x0) {
                int n58 = n32;
                if (gva.d(n2)) {
                    n58 = 536870912;
                }
                n57 = (n53 | n58);
            }
        }
        final int n59 = n5 | 0x6;
        int n61;
        if ((n5 & 0x30) == 0x0) {
            int n60;
            if ((n6 & 0x200000) == 0x0 && gva.f((Object)aql)) {
                n60 = 32;
            }
            else {
                n60 = 16;
            }
            n61 = (n59 | n60);
        }
        else {
            n61 = n59;
        }
        int n62 = n61;
        if ((n5 & 0x180) == 0x0) {
            int n63;
            if (gva.f((Object)ihn)) {
                n63 = n10;
            }
            else {
                n63 = 128;
            }
            n62 = (n61 | n63);
        }
        final int n64 = 1;
        aql aql2;
        zta zta5;
        zta zta8;
        gvc gvc5;
        if (gva.W(n33 & 0x1, (n33 & 0x12492493) != 0x12492492 || (n57 & 0x12492493) != 0x12492492 || (n62 & 0x93) != 0x92)) {
            gva.b0();
            zta zta6;
            gvc gvc2;
            mnn mnn3;
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final int n65 = n;
                aql2 = aql;
                final mnn mnn2 = mnn;
                n = n2;
                zta5 = zta4;
                zta6 = zta3;
                n2 = n65;
                gvc2 = gvc;
                mnn3 = mnn2;
            }
            else {
                if (n12 != 0) {
                    b = true;
                }
                if ((n6 & 0x20) != 0x0) {
                    mnn = (mnn)gva.j((sei)lmn.a);
                }
                if (n22 != 0) {
                    zta = null;
                }
                zta zta7;
                if (n35 != 0) {
                    zta7 = null;
                }
                else {
                    zta7 = zta3;
                }
                if (n40 != 0) {
                    zta3 = null;
                }
                else {
                    zta3 = zta4;
                }
                if (n43 != 0) {
                    b2 = false;
                }
                gvc g;
                if (n50 != 0) {
                    g = gvc.g;
                }
                else {
                    g = gvc;
                }
                if ((n6 & 0x40000) != 0x0) {
                    if (b3) {
                        n = 1;
                    }
                    else {
                        n = Integer.MAX_VALUE;
                    }
                }
                if (n56 != 0) {
                    n2 = n64;
                }
                aql l;
                if ((n6 & 0x200000) != 0x0) {
                    l = vt4.L(4, gva);
                }
                else {
                    l = aql;
                }
                zta6 = zta7;
                final gvc gvc3 = g;
                aql2 = l;
                final int n66 = n2;
                zta5 = zta3;
                mnn3 = mnn;
                gvc2 = gvc3;
                n2 = n;
                n = n66;
            }
            gva.r();
            gva.g0(-502301594);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = oz1.g(gva);
            }
            final llf llf = (llf)o;
            gva.q(false);
            gva.g0(1369275503);
            long n67 = mnn3.c();
            if (n67 == 16L) {
                n67 = ihn.d(b, b2, (boolean)((xom)t08.t(llf, gva, 0)).getValue());
            }
            gva.q(false);
            c5q.c(hnn.a.a((Object)ihn.k), (zta)uuj.t0(-2094276683, (aua)new bjg(igf, zta, b2, ihn, mln, lta, b, mnn3.e(new mnn(n67, 0L, (zoa)null, (soa)null, (una)null, 0L, 0L, 0, 0, 0L, (idd)null, 16777214)), mvc, gvc2, b3, n2, n, lep, llf, zta2, zta6, zta5, aql2), gva), gva, 56);
            final int n68 = n2;
            n2 = n;
            final gvc gvc4 = gvc2;
            mnn = mnn3;
            zta8 = zta;
            zta3 = zta6;
            gvc5 = gvc4;
            n = n68;
        }
        else {
            gva.Z();
            aql2 = aql;
            final zta zta9 = zta;
            gvc5 = gvc;
            zta5 = zta4;
            zta8 = zta9;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cjg(mln, lta, igf, b, mnn, zta8, zta2, zta3, zta5, b2, lep, mvc, gvc5, b3, n, n2, aql2, ihn, n3, n4, n5, n6);
        }
    }
    
    public static final void n(final String s, final lta lta, igf v, boolean b, boolean b2, mnn mnn, zta zta, zta zta2, zta zta3, zta zta4, final zta zta5, boolean b3, final lep lep, mvc g, final gvc gvc, boolean b4, int n, int n2, final aql aql, final ihn ihn, final gva gva, final int n3, final int n4, final int n5, final int n6) {
        gva.i0(1901501544);
        int n8;
        if ((n3 & 0x6) == 0x0) {
            int n7;
            if (gva.f((Object)s)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n8 = (n7 | n3);
        }
        else {
            n8 = n3;
        }
        int n9 = n8;
        if ((n3 & 0x30) == 0x0) {
            int n10;
            if (gva.h((Object)lta)) {
                n10 = 32;
            }
            else {
                n10 = 16;
            }
            n9 = (n8 | n10);
        }
        final int n11 = n6 & 0x4;
        int n14 = 0;
        Label_0156: {
            int n12;
            if (n11 != 0) {
                n12 = (n9 | 0x180);
            }
            else {
                n12 = n9;
                if ((n3 & 0x180) == 0x0) {
                    int n13;
                    if (gva.f((Object)v)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n9 | n13);
                    break Label_0156;
                }
            }
            n14 = n12;
        }
        final int n15 = n6 & 0x8;
        final int n16 = 1024;
        int n19 = 0;
        Label_0230: {
            int n17;
            if (n15 != 0) {
                n17 = (n14 | 0xC00);
            }
            else {
                n17 = n14;
                if ((n3 & 0xC00) == 0x0) {
                    int n18;
                    if (gva.g(b)) {
                        n18 = 2048;
                    }
                    else {
                        n18 = 1024;
                    }
                    n19 = (n14 | n18);
                    break Label_0230;
                }
            }
            n19 = n17;
        }
        final int n20 = n6 & 0x10;
        final int n21 = 8192;
        int n24 = 0;
        Label_0305: {
            int n22;
            if (n20 != 0) {
                n22 = (n19 | 0x6000);
            }
            else {
                n22 = n19;
                if ((n3 & 0x6000) == 0x0) {
                    int n23;
                    if (gva.g(b2)) {
                        n23 = 16384;
                    }
                    else {
                        n23 = 8192;
                    }
                    n24 = (n19 | n23);
                    break Label_0305;
                }
            }
            n24 = n22;
        }
        if ((n3 & 0x30000) == 0x0) {
            int n25;
            if ((n6 & 0x20) == 0x0 && gva.f((Object)mnn)) {
                n25 = 131072;
            }
            else {
                n25 = 65536;
            }
            n24 |= n25;
        }
        final int n26 = n6 & 0x40;
        final int n27 = 1048576;
        int n28;
        if (n26 != 0) {
            n28 = (n24 | 0x180000);
        }
        else {
            n28 = n24;
            if ((n3 & 0x180000) == 0x0) {
                int n29;
                if (gva.h((Object)zta)) {
                    n29 = 1048576;
                }
                else {
                    n29 = 524288;
                }
                n28 = (n24 | n29);
            }
        }
        final int n30 = n6 & 0x80;
        final int n31 = 8388608;
        int n32;
        if (n30 != 0) {
            n32 = (n28 | 0xC00000);
        }
        else {
            n32 = n28;
            if ((n3 & 0xC00000) == 0x0) {
                int n33;
                if (gva.h((Object)zta2)) {
                    n33 = 8388608;
                }
                else {
                    n33 = 4194304;
                }
                n32 = (n28 | n33);
            }
        }
        zta zta6 = zta2;
        final int n34 = n6 & 0x100;
        final int n35 = 33554432;
        int n38 = 0;
        Label_0578: {
            int n36;
            if (n34 != 0) {
                n36 = (n32 | 0x6000000);
            }
            else {
                n36 = n32;
                if ((n3 & 0x6000000) == 0x0) {
                    int n37;
                    if (gva.h((Object)zta3)) {
                        n37 = 67108864;
                    }
                    else {
                        n37 = 33554432;
                    }
                    n38 = (n32 | n37);
                    break Label_0578;
                }
            }
            n38 = n36;
        }
        final int n39 = n6 & 0x200;
        final int n40 = 268435456;
        int n43 = 0;
        Label_0654: {
            int n41;
            if (n39 != 0) {
                n41 = (n38 | 0x30000000);
            }
            else {
                n41 = n38;
                if ((n3 & 0x30000000) == 0x0) {
                    int n42;
                    if (gva.h((Object)zta4)) {
                        n42 = 536870912;
                    }
                    else {
                        n42 = 268435456;
                    }
                    n43 = (n38 | n42);
                    break Label_0654;
                }
            }
            n43 = n41;
        }
        int n44;
        if ((n6 & 0x400) != 0x0) {
            n44 = (n4 | 0x6);
        }
        else if ((n4 & 0x6) == 0x0) {
            int n45;
            if (gva.h((Object)null)) {
                n45 = 4;
            }
            else {
                n45 = 2;
            }
            n44 = (n4 | n45);
        }
        else {
            n44 = n4;
        }
        int n46;
        if ((n6 & 0x800) != 0x0) {
            n46 = (n44 | 0x30);
        }
        else {
            n46 = n44;
            if ((n4 & 0x30) == 0x0) {
                int n47;
                if (gva.h((Object)null)) {
                    n47 = 32;
                }
                else {
                    n47 = 16;
                }
                n46 = (n44 | n47);
            }
        }
        final int n48 = n6 & 0x1000;
        int n49;
        if (n48 != 0) {
            n49 = (n46 | 0x180);
        }
        else {
            n49 = n46;
            if ((n4 & 0x180) == 0x0) {
                int n50;
                if (gva.h((Object)zta5)) {
                    n50 = 256;
                }
                else {
                    n50 = 128;
                }
                n49 |= n50;
            }
        }
        final int n51 = n6 & 0x2000;
        if (n51 != 0) {
            n49 |= 0xC00;
        }
        else if ((n4 & 0xC00) == 0x0) {
            int n52 = n16;
            if (gva.g(b3)) {
                n52 = 2048;
            }
            n49 |= n52;
        }
        final int n53 = n6 & 0x4000;
        int n54;
        if (n53 != 0) {
            n54 = (n49 | 0x6000);
        }
        else {
            final int n55 = n54 = n49;
            if ((n4 & 0x6000) == 0x0) {
                int n56 = n21;
                if (gva.f((Object)lep)) {
                    n56 = 16384;
                }
                n54 = (n55 | n56);
            }
        }
        final int n57 = n6 & 0x8000;
        int n58;
        if (n57 != 0) {
            n58 = (n54 | 0x30000);
        }
        else {
            n58 = n54;
            if ((n4 & 0x30000) == 0x0) {
                int n59;
                if (gva.f((Object)g)) {
                    n59 = 131072;
                }
                else {
                    n59 = 65536;
                }
                n58 = (n54 | n59);
            }
        }
        final int n60 = n6 & 0x10000;
        int n61;
        if (n60 != 0) {
            n61 = (n58 | 0x180000);
        }
        else {
            n61 = n58;
            if ((n4 & 0x180000) == 0x0) {
                int n62;
                if (gva.f((Object)gvc)) {
                    n62 = n27;
                }
                else {
                    n62 = 524288;
                }
                n61 = (n58 | n62);
            }
        }
        final int n63 = n6 & 0x20000;
        int n64;
        if (n63 != 0) {
            n64 = (n61 | 0xC00000);
        }
        else {
            n64 = n61;
            if ((n4 & 0xC00000) == 0x0) {
                int n65;
                if (gva.g(b4)) {
                    n65 = n31;
                }
                else {
                    n65 = 4194304;
                }
                n64 = (n61 | n65);
            }
        }
        if ((n4 & 0x6000000) == 0x0) {
            int n66 = n35;
            if ((n6 & 0x40000) == 0x0) {
                n66 = n35;
                if (gva.d(n)) {
                    n66 = 67108864;
                }
            }
            n64 |= n66;
        }
        final int n67 = n6 & 0x80000;
        int n68;
        if (n67 != 0) {
            n68 = (n64 | 0x30000000);
        }
        else {
            n68 = n64;
            if ((n4 & 0x30000000) == 0x0) {
                int n69 = n40;
                if (gva.d(n2)) {
                    n69 = 536870912;
                }
                n68 = (n64 | n69);
            }
        }
        final int n70 = n5 | 0x6;
        int n72;
        if ((n5 & 0x30) == 0x0) {
            int n71;
            if ((n6 & 0x200000) == 0x0 && gva.f((Object)aql)) {
                n71 = 32;
            }
            else {
                n71 = 16;
            }
            n72 = (n70 | n71);
        }
        else {
            n72 = n70;
        }
        if ((n5 & 0x180) == 0x0) {
            int n73;
            if ((n6 & 0x400000) == 0x0 && gva.f((Object)ihn)) {
                n73 = 256;
            }
            else {
                n73 = 128;
            }
            n72 |= n73;
        }
        final int n74 = 1;
        gvc gvc2;
        zta zta10;
        zta zta11;
        mvc mvc2;
        aql aql4;
        lep lep2;
        ihn ihn5;
        if (gva.W(n43 & 0x1, (n43 & 0x12492493) != 0x12492492 || (n68 & 0x12492493) != 0x12492492 || (n72 & 0x93) != 0x92)) {
            gva.b0();
            Object o;
            zta zta8;
            aql aql2;
            zta zta9;
            boolean b6;
            ihn ihn2;
            int n76;
            igf igf2;
            mnn mnn3;
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final zta zta7 = zta4;
                o = lep;
                final mvc mvc = g;
                gvc2 = gvc;
                final int n75 = n;
                n = n2;
                zta8 = zta6;
                final mnn mnn2 = mnn;
                final igf igf = v;
                final boolean b5 = b3;
                aql2 = aql;
                zta9 = zta5;
                zta10 = zta7;
                zta11 = zta3;
                n2 = n75;
                mvc2 = mvc;
                b6 = b2;
                ihn2 = ihn;
                n76 = (b5 ? 1 : 0);
                zta3 = zta;
                igf2 = igf;
                mnn3 = mnn2;
            }
            else {
                if (n11 != 0) {
                    v = (igf)fgf.v;
                }
                boolean b7 = b;
                if (n15 != 0) {
                    b7 = true;
                }
                boolean b8 = b2;
                if (n20 != 0) {
                    b8 = false;
                }
                if ((n6 & 0x20) != 0x0) {
                    mnn = (mnn)gva.j((sei)lmn.a);
                }
                zta2 = zta;
                if (n26 != 0) {
                    zta2 = null;
                }
                zta = zta6;
                if (n30 != 0) {
                    zta = null;
                }
                zta zta12;
                if (n34 != 0) {
                    zta12 = null;
                }
                else {
                    zta12 = zta3;
                }
                if (n39 != 0) {
                    zta4 = null;
                }
                if (n48 != 0) {
                    zta3 = null;
                }
                else {
                    zta3 = zta5;
                }
                if (n51 != 0) {
                    n76 = 0;
                }
                else {
                    n76 = (b3 ? 1 : 0);
                }
                Object e;
                if (n53 != 0) {
                    e = def.E;
                }
                else {
                    e = lep;
                }
                if (n57 != 0) {
                    g = mvc.g;
                }
                gvc g2;
                if (n60 != 0) {
                    g2 = gvc.g;
                }
                else {
                    g2 = gvc;
                }
                boolean b9;
                if (n63 != 0) {
                    b9 = false;
                }
                else {
                    b9 = b4;
                }
                if ((n6 & 0x40000) != 0x0) {
                    if (b9) {
                        n = 1;
                    }
                    else {
                        n = Integer.MAX_VALUE;
                    }
                }
                if (n67 != 0) {
                    n2 = n74;
                }
                aql l;
                if ((n6 & 0x200000) != 0x0) {
                    l = vt4.L(4, gva);
                }
                else {
                    l = aql;
                }
                if ((n6 & 0x400000) != 0x0) {
                    final ihn u = eup.u(6, gva);
                    final zta zta13 = zta12;
                    final zta zta14 = zta4;
                    aql2 = l;
                    o = e;
                    gvc2 = g2;
                    b4 = b9;
                    final int n77 = n;
                    n = n2;
                    final zta zta15 = zta3;
                    final ihn ihn3 = u;
                    zta8 = zta;
                    b6 = b8;
                    zta3 = zta2;
                    mnn3 = mnn;
                    b = b7;
                    igf2 = v;
                    ihn2 = ihn3;
                    mvc2 = g;
                    n2 = n77;
                    zta11 = zta13;
                    zta10 = zta14;
                    zta9 = zta15;
                }
                else {
                    final zta zta16 = zta12;
                    final zta zta17 = zta4;
                    final aql aql3 = l;
                    o = e;
                    final mnn mnn4 = mnn;
                    final zta zta18 = zta2;
                    gvc2 = g2;
                    b4 = b9;
                    final int n78 = n;
                    n = n2;
                    zta9 = zta3;
                    zta8 = zta;
                    b6 = b8;
                    mnn3 = mnn4;
                    b = b7;
                    igf2 = v;
                    zta3 = zta18;
                    ihn2 = ihn;
                    mvc2 = g;
                    n2 = n78;
                    zta11 = zta16;
                    zta10 = zta17;
                    aql2 = aql3;
                }
            }
            gva.r();
            gva.g0(1310000147);
            Object o2;
            if ((o2 = gva.R()) == bi6.a) {
                o2 = oz1.g(gva);
            }
            final llf llf = (llf)o2;
            gva.q(false);
            gva.g0(1981926178);
            long n79 = mnn3.c();
            if (n79 == 16L) {
                n79 = ihn2.d(b, (boolean)(n76 != 0), (boolean)((xom)t08.t(llf, gva, 0)).getValue());
            }
            gva.q(false);
            c5q.c(hnn.a.a((Object)ihn2.k), (zta)uuj.t0(1874034984, (aua)new xig(igf2, zta3, (boolean)(n76 != 0), ihn2, s, lta, b, b6, mnn3.e(new mnn(n79, 0L, (zoa)null, (soa)null, (una)null, 0L, 0L, 0, 0, 0L, (idd)null, 16777214)), mvc2, gvc2, b4, n2, n, (lep)o, llf, zta8, zta11, zta10, zta9, aql2), gva), gva, 56);
            final igf igf3 = igf2;
            zta2 = zta3;
            final int n80 = n;
            final zta zta19 = zta8;
            aql4 = aql2;
            final ihn ihn4 = ihn2;
            final int n81 = n76;
            final zta zta20 = zta9;
            v = igf3;
            b2 = b6;
            mnn = mnn3;
            zta = zta2;
            zta6 = zta19;
            zta2 = zta20;
            b3 = (n81 != 0);
            lep2 = (lep)o;
            n = n2;
            n2 = n80;
            ihn5 = ihn4;
        }
        else {
            gva.Z();
            final zta zta21 = zta3;
            final zta zta22 = zta4;
            zta2 = zta5;
            gvc2 = gvc;
            ihn5 = ihn;
            aql4 = aql;
            mvc2 = g;
            lep2 = lep;
            zta10 = zta22;
            zta11 = zta21;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new yig(s, lta, v, b, b2, mnn, zta, zta6, zta11, zta10, zta2, b3, lep2, mvc2, gvc2, b4, n, n2, aql4, ihn5, n3, n4, n5, n6);
        }
    }
    
    public static final void o(final String s, final st4 st4, final jta jta, final gva gva, final int n) {
        gva.i0(-331501348);
        int n2;
        if (gva.f((Object)s)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)st4)) {
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
        final int n5 = n2 | n | n3 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            zrn.n(0L, uuj.t0(-717081650, (aua)new xu8((Object)s, (Object)st4, (Object)jta, (byte)4), gva), gva, 48, 1);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)s, (Object)st4, (Object)jta, (byte)21);
        }
    }
    
    public static final void p(final odk odk, final jta jta, final ye6 ye6, final gva gva, final int n) {
        gva.i0(1798123788);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)odk)) {
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
            if (gva.h((Object)ye6)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final boolean f = gva.f((Object)odk);
            final Object r = gva.R();
            Object q;
            if (f || (q = r) == bi6.a) {
                q = o50.Q((Object)Boolean.FALSE);
                gva.q0(q);
            }
            c5q.c(((sei)ii8.a).a((Object)odk), (zta)uuj.t0(-199568308, (aua)new up4((Object)ye6, (Object)q, (Object)jta, (byte)10), gva), gva, 48);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0(n, (Object)odk, (Object)jta, (Object)ye6, (byte)5);
        }
    }
    
    public static final void q(final String s, igf igf, final jta jta, final jta jta2, final long n, final gva gva, final int n2) {
        gva.i0(-2078815310);
        int n4;
        if ((n2 & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)s)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n6;
        final int n5 = n6 = (n4 | 0x30);
        if ((n2 & 0x180) == 0x0) {
            int n7;
            if (gva.h((Object)jta)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n2 & 0xC00) == 0x0) {
            int n9;
            if (gva.h((Object)jta2)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n2 & 0x6000) == 0x0) {
            int n11;
            if (gva.e(n)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        if (gva.W(n10 & 0x1, (n10 & 0x2493) != 0x2492)) {
            gva.b0();
            Object o = fgf.v;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                igf = (igf)o;
            }
            gva.r();
            if (n != 16L) {
                gva.g0(-853219337);
                final cib a = bi6.a;
                if (jta != null) {
                    gva.g0(-853120974);
                    final int n12 = n10 & 0x380;
                    final boolean b = n12 == 256;
                    final Object r = gva.R();
                    Object o2;
                    if (b || (o2 = r) == a) {
                        o2 = new j35(jta, (byte)4);
                        gva.q0(o2);
                    }
                    final igf b2 = p6n.b((igf)o, (Object)jta, (PointerInputEventHandler)o2);
                    final boolean b3 = (n10 & 0xE) == 0x4;
                    final boolean b4 = n12 == 256;
                    final Object r2 = gva.R();
                    Object o3;
                    if ((b3 | b4) || (o3 = r2) == a) {
                        o3 = new ecb(s, jta, (byte)1);
                        gva.q0(o3);
                    }
                    o = wsk.b((lta)o3, b2, true);
                    gva.q(false);
                }
                else {
                    gva.g0(-852623672);
                    gva.q(false);
                }
                final igf e = igf.E((igf)androidx.compose.foundation.layout.b.c).E((igf)o);
                final boolean b5 = (((0xE000 & n10) ^ 0x6000) > 16384 && gva.e(n)) || (n10 & 0x6000) == 0x4000;
                final boolean b6 = (n10 & 0x1C00) == 0x800;
                final Object r3 = gva.R();
                Object o4;
                if ((b6 | b5) || (o4 = r3) == a) {
                    o4 = new k5a(n, jta2, (byte)1);
                    gva.q0(o4);
                }
                ljq.j(e, (lta)o4, gva, 0);
                gva.q(false);
            }
            else {
                gva.g0(-852426512);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wek(s, igf, jta, jta2, n, n2);
        }
    }
    
    public static mn2 r() {
        return ao2.b(3, 2, (lta)new yp7((byte)28));
    }
    
    public static final void s(final List list, final zp4 zp4, final sp4 sp4, final cjh cjh, final ye6 ye6, final gva gva, final int n) {
        gva.i0(1111902445);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)list);
            }
            else {
                b = gva.h((Object)list);
            }
            int n2;
            if (b) {
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
            if (gva.d(((Enum)zp4).ordinal())) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            boolean b2;
            if ((n & 0x200) == 0x0) {
                b2 = gva.f((Object)sp4);
            }
            else {
                b2 = gva.h((Object)sp4);
            }
            int n7;
            if (b2) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            boolean b3;
            if ((n & 0x1000) == 0x0) {
                b3 = gva.f((Object)cjh);
            }
            else {
                b3 = gva.h((Object)cjh);
            }
            int n9;
            if (b3) {
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
            if (gva.h((Object)ye6)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        if (gva.W(n10 & 0x1, (n10 & 0x2493) != 0x2492)) {
            if (!((Collection)list).isEmpty()) {
                gva.g0(1898294888);
                final Object r = gva.R();
                final cib a = bi6.a;
                Object q;
                if ((q = r) == a) {
                    q = o50.Q((Object)zp4);
                    gva.q0(q);
                }
                final bnf bnf = (bnf)q;
                final boolean b4 = ((xom)bnf).getValue() != zp4;
                final boolean b5 = (n10 & 0x70) == 0x20;
                final Object r2 = gva.R();
                Object o;
                if (b5 || (o = r2) == a) {
                    o = new e2c((Object)zp4, (Object)bnf, (byte)14);
                    gva.q0(o);
                }
                mlc.l((jta)o, gva);
                final boolean b6 = (n10 & 0xE) == 0x4 || ((n10 & 0x8) != 0x0 && gva.f((Object)list));
                final Object r3 = gva.R();
                dq4 dq4;
                if (b6 || (dq4 = (dq4)r3) == a) {
                    dq4 = new dq4((fp4)c86.P0(list), c86.D0(1, list));
                    gva.q0((Object)dq4);
                }
                final dq4 dq5 = dq4;
                final FillElement c = androidx.compose.foundation.layout.b.c;
                Object a2;
                if (b4) {
                    gva.g0(1898815223);
                    Object r4;
                    if ((r4 = gva.R()) == a) {
                        r4 = new bf6((byte)26);
                        gva.q0(r4);
                    }
                    a2 = r4;
                    gva.q(false);
                }
                else {
                    gva.g0(1898910052);
                    gva.q(false);
                    final int ordinal = ((Enum)zp4).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                en9.r();
                                return;
                            }
                            a2 = sp4.c.v;
                        }
                        else {
                            a2 = sp4.b.v;
                        }
                    }
                    else {
                        a2 = sp4.a;
                    }
                }
                final boolean b7 = (n10 & 0x1C00) == 0x800 || ((n10 & 0x1000) != 0x0 && gva.h((Object)cjh));
                final Object r5 = gva.R();
                Object o2;
                if (b7 || (o2 = r5) == a) {
                    o2 = new tqb((Object)cjh, (byte)13);
                    gva.q0(o2);
                }
                r9n.a(dq5, (igf)c, (vlm)ao2.b0(1, (lta)o2, (cua)a2), uuj.t0(-1037733166, (aua)new j26(ye6, (byte)7), gva), gva, 3120);
                gva.q(false);
            }
            else {
                gva.g0(1899291445);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new nj((Object)list, (Object)zp4, (Object)sp4, (Object)cjh, (Object)ye6, n, (byte)24);
        }
    }
    
    public static final String t(final Thread$State thread$State) {
        switch (gsn.a[((Enum)thread$State).ordinal()]) {
            default: {
                en9.r();
                return null;
            }
            case 6: {
                return "waiting";
            }
            case 5: {
                return "timed_waiting";
            }
            case 4: {
                return "terminated";
            }
            case 3: {
                return "runnable";
            }
            case 2: {
                return "blocked";
            }
            case 1: {
                return "new";
            }
        }
    }
    
    public static final void u(final h07 h07) {
        Object o = null;
        Label_0048: {
            if (h07 instanceof m98) {
                final m98 m98 = (m98)h07;
                final int w = m98.w;
                if ((w & Integer.MIN_VALUE) != 0x0) {
                    m98.w = w + Integer.MIN_VALUE;
                    o = m98;
                    break Label_0048;
                }
            }
            o = new h07((f07)h07);
        }
        final Object v = ((m98)o).v;
        final int w2 = ((m98)o).w;
        if (w2 != 0) {
            if (w2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            ((m98)o).w = 1;
            final l13 l13 = new l13(1, ljq.K((f07)o));
            l13.r();
            if (l13.p() == pc7.v) {
                return;
            }
        }
        ebq.a();
    }
    
    public static final Bundle v(final yog... array) {
        final Bundle bundle = new Bundle(array.length);
        for (final yog yog : array) {
            final String s = (String)yog.v;
            final Object w = yog.w;
            if (w == null) {
                ((BaseBundle)bundle).putString(s, (String)null);
            }
            else if (w instanceof Boolean) {
                ((BaseBundle)bundle).putBoolean(s, (boolean)w);
            }
            else if (w instanceof Byte) {
                bundle.putByte(s, ((Number)w).byteValue());
            }
            else if (w instanceof Character) {
                bundle.putChar(s, (char)w);
            }
            else if (w instanceof Double) {
                ((BaseBundle)bundle).putDouble(s, ((Number)w).doubleValue());
            }
            else if (w instanceof Float) {
                bundle.putFloat(s, ((Number)w).floatValue());
            }
            else if (w instanceof Integer) {
                ((BaseBundle)bundle).putInt(s, ((Number)w).intValue());
            }
            else if (w instanceof Long) {
                ((BaseBundle)bundle).putLong(s, ((Number)w).longValue());
            }
            else if (w instanceof Short) {
                bundle.putShort(s, ((Number)w).shortValue());
            }
            else if (w instanceof Bundle) {
                bundle.putBundle(s, (Bundle)w);
            }
            else if (w instanceof CharSequence) {
                bundle.putCharSequence(s, (CharSequence)w);
            }
            else if (w instanceof Parcelable) {
                bundle.putParcelable(s, (Parcelable)w);
            }
            else if (w instanceof boolean[]) {
                ((BaseBundle)bundle).putBooleanArray(s, (boolean[])w);
            }
            else if (w instanceof byte[]) {
                bundle.putByteArray(s, (byte[])w);
            }
            else if (w instanceof char[]) {
                bundle.putCharArray(s, (char[])w);
            }
            else if (w instanceof double[]) {
                ((BaseBundle)bundle).putDoubleArray(s, (double[])w);
            }
            else if (w instanceof float[]) {
                bundle.putFloatArray(s, (float[])w);
            }
            else if (w instanceof int[]) {
                ((BaseBundle)bundle).putIntArray(s, (int[])w);
            }
            else if (w instanceof long[]) {
                ((BaseBundle)bundle).putLongArray(s, (long[])w);
            }
            else if (w instanceof short[]) {
                bundle.putShortArray(s, (short[])w);
            }
            else if (w instanceof Object[]) {
                final Class<?> componentType = ((short[])w).getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(s, (Parcelable[])w);
                }
                else if (String.class.isAssignableFrom(componentType)) {
                    ((BaseBundle)bundle).putStringArray(s, (String[])w);
                }
                else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(s, (CharSequence[])w);
                }
                else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        en9.s(lmf.t("Illegal value array type ", componentType.getCanonicalName(), " for key \"", s, "\""));
                        return null;
                    }
                    bundle.putSerializable(s, (Serializable)w);
                }
            }
            else if (w instanceof Serializable) {
                bundle.putSerializable(s, (Serializable)w);
            }
            else if (w instanceof IBinder) {
                bundle.putBinder(s, (IBinder)w);
            }
            else if (w instanceof Size) {
                bundle.putSize(s, (Size)w);
            }
            else {
                if (!(w instanceof SizeF)) {
                    en9.s(lmf.t("Illegal value type ", ((SizeF)w).getClass().getCanonicalName(), " for key \"", s, "\""));
                    return null;
                }
                bundle.putSizeF(s, (SizeF)w);
            }
        }
        return bundle;
    }
    
    public static final Object w(vyk x, xca xca, pv0 y, fvg o, boolean b, wv1 w) {
        final vyk v = x;
        Object y2 = o;
        Label_0057: {
            if (w instanceof c) {
                o = w;
                final int c = ((c)o).C;
                if ((c & Integer.MIN_VALUE) != 0x0) {
                    ((c)o).C = c + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            o = new c(w);
        }
        final Object b2 = ((c)o).B;
        final int c2 = ((c)o).C;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        Object z = null;
        Object o3 = null;
        Object o4 = null;
        boolean b3 = false;
        Label_0548: {
            Label_0412: {
                Object v4;
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 == 3) {
                                vt4.g0(b2);
                                return a;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        else {
                            b = ((c)o).A;
                            z = ((c)o).z;
                            y = (pv0)((c)o).y;
                            xca = (xca)((c)o).x;
                            w = (wv1)((c)o).w;
                            final Object v3 = ((c)o).v;
                            try {
                                vt4.g0(b2);
                                xca = (xca)v3;
                                break Label_0412;
                            }
                            finally {
                                break Label_0412;
                            }
                        }
                    }
                    b = ((c)o).A;
                    y2 = ((c)o).y;
                    xca = (xca)((c)o).x;
                    w = (wv1)((c)o).w;
                    v4 = ((c)o).v;
                    vt4.g0(b2);
                }
                else {
                    vt4.g0(b2);
                    if (!b) {
                        ((c)o).v = v;
                        ((c)o).w = xca;
                        ((c)o).x = y;
                        ((c)o).y = (fvg)y2;
                        ((c)o).A = b;
                        ((c)o).C = 1;
                        v.f((f07)o, y2);
                        return v2;
                    }
                    w = (wv1)xca;
                    xca = (xca)y;
                    v4 = v;
                }
                Object o2;
                if ((o2 = ((xca)w).T((fvg)y2)) == null) {
                    o2 = r89.v;
                }
                z = v4;
                o3 = y2;
                o4 = o;
                b3 = b;
                if (((Collection)o2).isEmpty()) {
                    break Label_0548;
                }
                fvg fvg = (fvg)y2;
                int n = 0;
                while (true) {
                    final fvg fvg2 = (fvg)((xca)w).V(fvg).d;
                    fvg a2;
                    if (fvg2 == null) {
                        a2 = null;
                    }
                    else {
                        final fvg e = fvg.e();
                        e.getClass();
                        a2 = e.a(e, fvg2, false);
                    }
                    if (a2 == null) {
                        break;
                    }
                    ++n;
                    fvg = a2;
                }
                z = v4;
                o3 = y2;
                o4 = o;
                b3 = b;
                if (n != 0) {
                    break Label_0548;
                }
                ((pv0)xca).addLast((Object)fvg);
                try {
                    z = ((List)o2).iterator();
                    final Object o5 = y2;
                    x = (vyk)xca;
                    xca = (xca)v4;
                    y = (pv0)o5;
                    Object o6 = null;
                    xca xca2 = null;
                    try {
                        while (((Iterator)z).hasNext()) {
                            final fvg fvg3 = (fvg)((Iterator)z).next();
                            ((c)o).v = (vyk)xca;
                            ((c)o).w = (xca)w;
                            ((c)o).x = (pv0)x;
                            ((c)o).y = (fvg)y;
                            ((c)o).z = (Iterator)z;
                            ((c)o).A = b;
                            ((c)o).C = 2;
                            if (w((vyk)xca, (xca)w, (pv0)x, fvg3, b, (wv1)o) == v2) {
                                return v2;
                            }
                        }
                    }
                    finally {
                        o6 = x;
                        xca2 = xca;
                        xca = (xca)o6;
                    }
                    ((pv0)xca2).removeLast();
                    z = xca;
                    o3 = o6;
                    o4 = o;
                    b3 = b;
                    break Label_0548;
                }
                finally {}
            }
            ((pv0)xca).removeLast();
            throw x;
        }
        if (b3) {
            ((c)o4).v = null;
            ((c)o4).w = null;
            ((c)o4).x = null;
            ((c)o4).y = null;
            ((c)o4).z = null;
            ((c)o4).C = 3;
            ((vyk)z).f((f07)o4, o3);
            return v2;
        }
        return a;
    }
    
    public static qc6 x(final lta... array) {
        if (array.length > 0) {
            return new qc6((Object)array, (byte)0);
        }
        en9.s("Failed requirement.");
        return null;
    }
    
    public static int y(final Comparable comparable, final Comparable comparable2) {
        if (comparable == null) {
            if (comparable2 == null) {
                return 0;
            }
            return -1;
        }
        else {
            if (comparable2 == null) {
                return 1;
            }
            return comparable.compareTo((Object)comparable2);
        }
    }
    
    public static int z(int i, final int n, final String s, final boolean b) {
        while (i < n) {
            final char char1 = s.charAt(i);
            boolean b2 = false;
            Label_0103: {
                if ((char1 >= ' ' || char1 == '\t') && char1 < '\u007f') {
                    if ('0' > char1 || char1 >= ':') {
                        if ('a' > char1 || char1 >= '{') {
                            if ('A' > char1 || char1 >= '[') {
                                if (char1 != ':') {
                                    b2 = false;
                                    break Label_0103;
                                }
                            }
                        }
                    }
                }
                b2 = true;
            }
            if (b2 == (b ^ true)) {
                return i;
            }
            ++i;
        }
        return n;
    }
}
