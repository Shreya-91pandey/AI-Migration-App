import android.os.BaseBundle;
import java.util.Map;
import android.view.accessibility.AccessibilityRecord;
import android.content.res.Resources;
import android.os.Trace;
import android.view.accessibility.AccessibilityNodeInfo;
import android.util.Log;
import android.os.Parcelable;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.Map$Entry;
import android.os.Build$VERSION;
import java.util.Collection;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.node.LayoutNode;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Handler;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;
import android.view.View$OnAttachStateChangeListener;

public final class f50 extends w3 implements View$OnAttachStateChangeListener, AccessibilityManager$AccessibilityStateChangeListener, AccessibilityManager$TouchExplorationStateChangeListener
{
    public static final ilf i0;
    public final z40 A;
    public final AccessibilityManager B;
    public long C;
    public List D;
    public final b50 E;
    public int F;
    public int G;
    public x4 H;
    public x4 I;
    public boolean J;
    public final jlf K;
    public final jlf L;
    public final wcm M;
    public final wcm N;
    public int O;
    public Integer P;
    public final fw0 Q;
    public final mn2 R;
    public boolean S;
    public c50 T;
    public jlf U;
    public final klf V;
    public final hlf W;
    public final hlf X;
    public final String Y;
    public final String Z;
    public final tze a0;
    public final jlf b0;
    public atk c0;
    public boolean d0;
    public final hlf e0;
    public final m0 f0;
    public final ArrayList g0;
    public final z40 h0;
    public final AndroidComposeView y;
    public int z;
    
    static {
        final ilf a = qgc.a;
        final ilf i = new ilf(32);
        final int b = i.b;
        if (b >= 0) {
            final int n = b + 32;
            i.b(n);
            final int[] a2 = i.a;
            final int b2 = i.b;
            if (b != b2) {
                iw0.J0(n, b, b2, a2, a2);
            }
            iw0.N0(b, 0, 12, new int[] { 2131296263, 2131296264, 2131296275, 2131296286, 2131296289, 2131296290, 2131296291, 2131296292, 2131296293, 2131296294, 2131296265, 2131296266, 2131296267, 2131296268, 2131296269, 2131296270, 2131296271, 2131296272, 2131296273, 2131296274, 2131296276, 2131296277, 2131296278, 2131296279, 2131296280, 2131296281, 2131296282, 2131296283, 2131296284, 2131296285, 2131296287, 2131296288 }, a2);
            i.b += 32;
            i0 = i;
            return;
        }
        qiq.t("");
        throw null;
    }
    
    public f50(final AndroidComposeView y) {
        this.y = y;
        this.z = Integer.MIN_VALUE;
        this.A = new z40(this, (byte)0);
        final Object systemService = ((View)y).getContext().getSystemService("accessibility");
        systemService.getClass();
        this.B = (AccessibilityManager)systemService;
        this.C = 100L;
        new Handler(Looper.getMainLooper());
        this.E = new b50(this);
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.K = new jlf();
        this.L = new jlf();
        this.M = new wcm(0);
        this.N = new wcm(0);
        this.O = -1;
        this.Q = new fw0(0);
        this.R = ao2.c(1, 0, 6);
        this.S = true;
        final jlf a = tgc.a;
        a.getClass();
        this.U = a;
        this.V = new klf();
        this.W = new hlf();
        this.X = new hlf();
        this.Y = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.Z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.a0 = new tze((byte)16);
        this.b0 = new jlf();
        this.c0 = new atk(y.getSemanticsOwner().a(), (sgc)a);
        final int a2 = mgc.a;
        this.e0 = new hlf();
        ((View)y).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.f0 = new m0((Object)this, (byte)1);
        this.g0 = new ArrayList();
        this.h0 = new z40(this, (byte)1);
    }
    
    public static /* synthetic */ void E(final f50 f50, final int n, final int n2, Integer n3, final int n4) {
        if ((n4 & 0x4) != 0x0) {
            n3 = null;
        }
        f50.D(n, n2, n3, null);
    }
    
    public static Rect L(final k8e k8e, final float n, final float n2) {
        if (!(k8e instanceof rig) && !(k8e instanceof sig)) {
            return null;
        }
        final k2j u = k8e.u();
        return new Rect((int)(u.a + n), (int)(u.b + n2), (int)(u.c + n), (int)(u.d + n2));
    }
    
    public static float[] N(final k8e k8e) {
        if (k8e instanceof sig) {
            final lvj e = ((sig)k8e).e;
            final long h = e.h;
            final long g = e.g;
            final long f = e.f;
            final long e2 = e.e;
            return new float[] { Float.intBitsToFloat((int)(e2 >> 32)), Float.intBitsToFloat((int)(e2 & 0xFFFFFFFFL)), Float.intBitsToFloat((int)(f >> 32)), Float.intBitsToFloat((int)(f & 0xFFFFFFFFL)), Float.intBitsToFloat((int)(g >> 32)), Float.intBitsToFloat((int)(g & 0xFFFFFFFFL)), Float.intBitsToFloat((int)(h >> 32)), Float.intBitsToFloat((int)(h & 0xFFFFFFFFL)) };
        }
        return null;
    }
    
    public static Region O(final k8e k8e, final float n, final float n2) {
        if (k8e instanceof qig) {
            final qig qig = (qig)k8e;
            final k2j l = qig.u().l(n, n2);
            final Region region = new Region(new Rect((int)(l.a + 0.0f), (int)(l.b + 0.0f), (int)(l.c + 0.0f), (int)(l.d + 0.0f)));
            final Region region2 = new Region();
            final g90 e = qig.e;
            if (e instanceof g90) {
                final Path a = e.a;
                a.offset(n, n2);
                region2.setPath(a, region);
                return region2;
            }
            oyl.s("Unable to obtain android.graphics.Path");
        }
        return null;
    }
    
    public static CharSequence P(CharSequence subSequence) {
        if (subSequence.length() != 0) {
            final int length = subSequence.length();
            final int n = 100000;
            if (length > 100000) {
                int n2 = n;
                if (Character.isHighSurrogate(subSequence.charAt(99999))) {
                    n2 = n;
                    if (Character.isLowSurrogate(subSequence.charAt(100000))) {
                        n2 = 99999;
                    }
                }
                subSequence = subSequence.subSequence(0, n2);
                subSequence.getClass();
                return subSequence;
            }
        }
        return subSequence;
    }
    
    public static String t(final zsk zsk) {
        if (zsk != null) {
            final tsk d = zsk.d;
            final tmf v = d.v;
            final htk a = etk.a;
            if (v.c((Object)a)) {
                return ald.a((List)d.f(a), ",", null, 62);
            }
            final htk g = etk.G;
            if (v.c((Object)g)) {
                Object g2;
                if ((g2 = v.g((Object)g)) == null) {
                    g2 = null;
                }
                final og0 og0 = (og0)g2;
                if (og0 != null) {
                    return og0.w;
                }
            }
            else {
                Object g3;
                if ((g3 = v.g((Object)etk.C)) == null) {
                    g3 = null;
                }
                final List list = (List)g3;
                if (list != null) {
                    final og0 og2 = (og0)c86.I0(list);
                    if (og2 != null) {
                        return og2.w;
                    }
                }
            }
        }
        return null;
    }
    
    public static final boolean x(final dfk dfk, final float n) {
        final jta a = dfk.a;
        return (n < 0.0f && ((Number)a.a()).floatValue() > 0.0f) || (n > 0.0f && ((Number)a.a()).floatValue() < ((Number)dfk.b.a()).floatValue());
    }
    
    public static final boolean y(final dfk dfk) {
        final jta a = dfk.a;
        final boolean c = dfk.c;
        return (((Number)a.a()).floatValue() > 0.0f && !c) || (((Number)a.a()).floatValue() < ((Number)dfk.b.a()).floatValue() && c);
    }
    
    public static final boolean z(final dfk dfk) {
        final jta a = dfk.a;
        final boolean c = dfk.c;
        return (((Number)a.a()).floatValue() < ((Number)dfk.b.a()).floatValue() && !c) || (((Number)a.a()).floatValue() > 0.0f && c);
    }
    
    public final int A(final int n) {
        if (n == this.y.getSemanticsOwner().a().f) {
            return -1;
        }
        return n;
    }
    
    public final void B(zsk zsk, atk atk) {
        final int[] a = bhc.a;
        final klf klf = new klf();
        final List j = zsk.j(4, zsk);
        final LayoutNode c = zsk.c;
        final int size = ((Collection)j).size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final zsk zsk2 = (zsk)j.get(i);
            final sgc s = this.s();
            final int f = zsk2.f;
            if (s.a(f)) {
                if (!atk.b.c(f)) {
                    this.w(c);
                    return;
                }
                klf.a(f);
            }
        }
        final klf b = atk.b;
        final int[] b2 = b.b;
        final long[] a2 = b.a;
        final int n2 = a2.length - 2;
        if (n2 >= 0) {
            int n3 = 0;
            while (true) {
                long n4 = a2[n3];
                if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n5 = 8 - (~(n3 - n2) >>> 31);
                    for (int k = 0; k < n5; ++k) {
                        if ((0xFFL & n4) < 128L && !klf.c(b2[(n3 << 3) + k])) {
                            this.w(c);
                            return;
                        }
                        n4 >>= 8;
                    }
                    if (n5 != 8) {
                        break;
                    }
                }
                if (n3 == n2) {
                    break;
                }
                ++n3;
            }
        }
        final List l = zsk.j(4, zsk);
        for (int size2 = ((Collection)l).size(), n6 = n; n6 < size2; ++n6) {
            zsk = (zsk)l.get(n6);
            atk = (atk)((sgc)this.b0).b(zsk.f);
            if (atk != null && this.s().a(zsk.f)) {
                this.B(zsk, atk);
            }
        }
    }
    
    public final boolean C(final AccessibilityEvent accessibilityEvent) {
        if (!this.v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.J = true;
        }
        try {
            return (boolean)this.A.b((Object)accessibilityEvent);
        }
        finally {
            this.J = false;
        }
    }
    
    public final boolean D(final int n, final int n2, final Integer n3, final List list) {
        if (n != Integer.MIN_VALUE && this.v()) {
            final AccessibilityEvent o = this.o(n, n2);
            if (n3 != null) {
                o.setContentChangeTypes((int)n3);
            }
            if (list != null) {
                ((AccessibilityRecord)o).setContentDescription((CharSequence)ald.a(list, ",", null, 62));
            }
            return this.C(o);
        }
        return false;
    }
    
    public final void F(final int n, final int contentChangeTypes, final String s) {
        final AccessibilityEvent o = this.o(this.A(n), 32);
        o.setContentChangeTypes(contentChangeTypes);
        if (s != null) {
            ((AccessibilityRecord)o).getText().add((Object)s);
        }
        this.C(o);
    }
    
    public final void G(final int n) {
        final c50 t = this.T;
        if (t != null) {
            if (n != t.d().f) {
                return;
            }
            if (SystemClock.uptimeMillis() - t.f() <= 1000L) {
                final AccessibilityEvent o = this.o(this.A(t.d().f), 131072);
                ((AccessibilityRecord)o).setFromIndex(t.b());
                ((AccessibilityRecord)o).setToIndex(t.e());
                o.setAction(t.a());
                o.setMovementGranularity(t.c());
                ((AccessibilityRecord)o).getText().add((Object)t(t.d()));
                this.C(o);
            }
        }
        this.T = null;
    }
    
    public final void H(final sgc sgc) {
        Integer value = 64;
        final ArrayList g0 = this.g0;
        ArrayList list = new ArrayList((Collection)g0);
        g0.clear();
        int[] b = sgc.b;
        long[] a = sgc.a;
        final int length = a.length;
        final int n = 2;
        final int n2 = length - 2;
        Integer value2 = 0;
        if (n2 >= 0) {
            int n3 = 0;
            while (true) {
                long n4 = a[n3];
                ArrayList list2;
                Integer n41;
                Integer n42;
                int[] array3;
                long[] array4;
                if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n5 = 8;
                    final int n6 = 8 - (~(n3 - n2) >>> 31);
                    int i = 0;
                    final int n7 = n3;
                    int n8 = n5;
                    final long[] array = a;
                    final int[] array2 = b;
                    list2 = list;
                    Integer n9 = value2;
                    while (i < n6) {
                        Integer n32 = null;
                        Integer n34 = null;
                        Label_2892: {
                            if ((n4 & 0xFFL) < 128L) {
                                int n10 = array2[(n7 << 3) + i];
                                final atk atk = (atk)((sgc)this.b0).b(n10);
                                if (atk != null) {
                                    final tsk a2 = atk.a;
                                    tmf v = a2.v;
                                    final btk btk = (btk)sgc.b(n10);
                                    zsk a3;
                                    if (btk != null) {
                                        a3 = btk.a;
                                    }
                                    else {
                                        a3 = null;
                                    }
                                    if (a3 == null) {
                                        throw ge9.x("no value for specified key");
                                    }
                                    LayoutNode c = a3.c;
                                    final tsk d = a3.d;
                                    final int f = a3.f;
                                    final tmf v2 = d.v;
                                    final Object[] b2 = v2.b;
                                    final Object[] c2 = v2.c;
                                    final long[] a4 = v2.a;
                                    int n11 = a4.length - 2;
                                    int n31;
                                    zsk zsk4;
                                    int n33;
                                    tsk tsk3;
                                    if (n11 >= 0) {
                                        int n12 = 0;
                                        int n13 = 0;
                                        int n14 = n8;
                                        zsk zsk = a3;
                                        ArrayList list3 = list2;
                                        Integer n15 = value;
                                        tsk tsk = a2;
                                        while (true) {
                                            long n16 = a4[n12];
                                            tmf tmf;
                                            Integer n27;
                                            ArrayList list10;
                                            LayoutNode layoutNode3;
                                            Integer n28;
                                            tsk tsk4;
                                            zsk zsk5;
                                            int n35;
                                            int n36;
                                            if ((~n16 << 7 & n16 & 0x8080808080808080L) != 0x8080808080808080L) {
                                                final int n17 = 8 - (~(n12 - n11) >>> 31);
                                                final int n18 = 0;
                                                final LayoutNode layoutNode = c;
                                                int n19 = n13;
                                                int n20 = n14;
                                                for (int j = n18; j < n17; ++j) {
                                                    Label_2501: {
                                                        if ((n16 & 0xFFL) < 128L) {
                                                            final int n21 = (n12 << 3) + j;
                                                            final Object o = b2[n21];
                                                            final Object o2 = c2[n21];
                                                            final htk htk = (htk)o;
                                                            final htk v3 = etk.v;
                                                            boolean b3;
                                                            if (!mlc.q((Object)htk, (Object)v3) && !mlc.q((Object)htk, (Object)etk.w)) {
                                                                b3 = false;
                                                            }
                                                            else {
                                                                sfk c3 = omo.C(n10, list3);
                                                                if (c3 != null) {
                                                                    b3 = false;
                                                                }
                                                                else {
                                                                    c3 = new sfk(n10, g0);
                                                                    b3 = true;
                                                                }
                                                                g0.add((Object)c3);
                                                            }
                                                            Label_0554: {
                                                                if (b3) {
                                                                    break Label_0554;
                                                                }
                                                                Object g2;
                                                                if ((g2 = v.g((Object)htk)) == null) {
                                                                    g2 = null;
                                                                }
                                                                if (!mlc.q(o2, g2)) {
                                                                    break Label_0554;
                                                                }
                                                                break Label_2501;
                                                            }
                                                            final htk d2 = etk.d;
                                                            if (mlc.q((Object)htk, (Object)d2)) {
                                                                o2.getClass();
                                                                final String s = (String)o2;
                                                                if (v.c((Object)d2)) {
                                                                    this.F(n10, n20, s);
                                                                }
                                                            }
                                                            else if (mlc.q((Object)htk, (Object)etk.b)) {
                                                                E(this, this.A(n10), 2048, n15, 8);
                                                                E(this, this.A(n10), 2048, n9, 8);
                                                            }
                                                            else if (mlc.q((Object)htk, (Object)etk.L)) {
                                                                E(this, this.A(n10), 2048, 8192, 8);
                                                                E(this, this.A(n10), 2048, n9, 8);
                                                            }
                                                            else if (mlc.q((Object)htk, (Object)etk.O)) {
                                                                E(this, this.A(n10), 2048, 3072, 8);
                                                            }
                                                            else if (mlc.q((Object)htk, (Object)etk.c)) {
                                                                E(this, this.A(n10), 2048, n15, 8);
                                                                E(this, this.A(n10), 2048, n9, 8);
                                                            }
                                                            else {
                                                                final htk k = etk.K;
                                                                if (mlc.q((Object)htk, (Object)k)) {
                                                                    Object g3;
                                                                    if ((g3 = v2.g((Object)etk.z)) == null) {
                                                                        g3 = null;
                                                                    }
                                                                    final iuj iuj = (iuj)g3;
                                                                    if (iuj != null && iuj.a == 4) {
                                                                        Object g4;
                                                                        if ((g4 = v2.g((Object)k)) == null) {
                                                                            g4 = null;
                                                                        }
                                                                        if (mlc.q(g4, (Object)Boolean.TRUE)) {
                                                                            final AccessibilityEvent o3 = this.o(this.A(n10), 4);
                                                                            final zsk zsk2 = new zsk(zsk.a, true, layoutNode, d);
                                                                            Object g5;
                                                                            if ((g5 = zsk2.k().v.g((Object)etk.a)) == null) {
                                                                                g5 = null;
                                                                            }
                                                                            final List list4 = (List)g5;
                                                                            Object a5 = null;
                                                                            if (list4 != null) {
                                                                                a5 = ald.a(list4, ",", null, 62);
                                                                            }
                                                                            Object g6;
                                                                            if ((g6 = zsk2.k().v.g((Object)etk.C)) == null) {
                                                                                g6 = null;
                                                                            }
                                                                            final List list5 = (List)g6;
                                                                            String a6;
                                                                            if (list5 != null) {
                                                                                a6 = ald.a(list5, ",", null, 62);
                                                                            }
                                                                            else {
                                                                                a6 = null;
                                                                            }
                                                                            if (a5 != null) {
                                                                                ((AccessibilityRecord)o3).setContentDescription((CharSequence)a5);
                                                                            }
                                                                            if (a6 != null) {
                                                                                ((AccessibilityRecord)o3).getText().add((Object)a6);
                                                                            }
                                                                            this.C(o3);
                                                                        }
                                                                        else {
                                                                            E(this, this.A(n10), 2048, n9, 8);
                                                                        }
                                                                    }
                                                                    else {
                                                                        E(this, this.A(n10), 2048, n15, 8);
                                                                        E(this, this.A(n10), 2048, n9, 8);
                                                                    }
                                                                }
                                                                else {
                                                                    final LayoutNode layoutNode2 = layoutNode;
                                                                    if (mlc.q((Object)htk, (Object)etk.a)) {
                                                                        final int a7 = this.A(n10);
                                                                        o2.getClass();
                                                                        this.D(a7, 2048, 4, (List)o2);
                                                                    }
                                                                    else {
                                                                        final htk g7 = etk.G;
                                                                        final boolean q = mlc.q((Object)htk, (Object)g7);
                                                                        final String s2 = "";
                                                                        if (q) {
                                                                            if (v2.c((Object)rsk.k)) {
                                                                                Object g8;
                                                                                if ((g8 = v.g((Object)g7)) == null) {
                                                                                    g8 = null;
                                                                                }
                                                                                Object beforeText = g8;
                                                                                if (beforeText == null) {
                                                                                    beforeText = "";
                                                                                }
                                                                                Object g9;
                                                                                if ((g9 = v2.g((Object)g7)) == null) {
                                                                                    g9 = null;
                                                                                }
                                                                                Object o4 = g9;
                                                                                if (o4 == null) {
                                                                                    o4 = "";
                                                                                }
                                                                                final CharSequence p = P((CharSequence)o4);
                                                                                final int length2 = ((CharSequence)beforeText).length();
                                                                                final int length3 = ((CharSequence)o4).length();
                                                                                int n22;
                                                                                if (length2 > length3) {
                                                                                    n22 = length3;
                                                                                }
                                                                                else {
                                                                                    n22 = length2;
                                                                                }
                                                                                int fromIndex;
                                                                                int n23;
                                                                                for (fromIndex = 0, n23 = n22; fromIndex < n23 && ((CharSequence)beforeText).charAt(fromIndex) == ((CharSequence)o4).charAt(fromIndex); ++fromIndex) {}
                                                                                int n24;
                                                                                for (n24 = 0; n24 < n23 - fromIndex && ((CharSequence)beforeText).charAt(length2 - 1 - n24) == ((CharSequence)o4).charAt(length3 - 1 - n24); ++n24) {}
                                                                                final htk n25 = etk.N;
                                                                                final boolean c4 = v.c((Object)n25);
                                                                                final boolean c5 = v2.c((Object)n25);
                                                                                final boolean c6 = v.c((Object)etk.G);
                                                                                final boolean b4 = c6 && !c4 && c5;
                                                                                final boolean b5 = c6 && c4 && !c5;
                                                                                AccessibilityEvent p2;
                                                                                if (!b4 && !b5) {
                                                                                    final AccessibilityEvent o5 = this.o(this.A(n10), 16);
                                                                                    ((AccessibilityRecord)o5).setFromIndex(fromIndex);
                                                                                    ((AccessibilityRecord)o5).setRemovedCount(length2 - n24 - fromIndex);
                                                                                    ((AccessibilityRecord)o5).setAddedCount(length3 - n24 - fromIndex);
                                                                                    ((AccessibilityRecord)o5).setBeforeText((CharSequence)beforeText);
                                                                                    ((AccessibilityRecord)o5).getText().add((Object)p);
                                                                                    p2 = o5;
                                                                                }
                                                                                else {
                                                                                    p2 = this.p(this.A(n10), n9, n9, length3, p);
                                                                                }
                                                                                ((AccessibilityRecord)p2).setClassName((CharSequence)"android.widget.EditText");
                                                                                if (Build$VERSION.SDK_INT >= 37) {
                                                                                    a50.b(zsk, p2);
                                                                                }
                                                                                this.C(p2);
                                                                                if (b4 || b5) {
                                                                                    final long a8 = ((dnn)d.f(etk.H)).a;
                                                                                    ((AccessibilityRecord)p2).setFromIndex((int)(a8 >> 32));
                                                                                    ((AccessibilityRecord)p2).setToIndex((int)(a8 & 0xFFFFFFFFL));
                                                                                    this.C(p2);
                                                                                }
                                                                            }
                                                                            else {
                                                                                E(this, this.A(n10), 2048, n, 8);
                                                                            }
                                                                        }
                                                                        else {
                                                                            final htk h = etk.H;
                                                                            if (mlc.q((Object)htk, (Object)h)) {
                                                                                Object g10;
                                                                                if ((g10 = v2.g((Object)g7)) == null) {
                                                                                    g10 = null;
                                                                                }
                                                                                final og0 og0 = (og0)g10;
                                                                                String w = s2;
                                                                                if (og0 != null) {
                                                                                    w = og0.w;
                                                                                    if (w == null) {
                                                                                        w = s2;
                                                                                    }
                                                                                }
                                                                                final long a9 = ((dnn)d.f(h)).a;
                                                                                this.C(this.p(this.A(n10), (int)(a9 >> 32), (int)(a9 & 0xFFFFFFFFL), w.length(), P((CharSequence)w)));
                                                                                this.G(f);
                                                                            }
                                                                            else if (!mlc.q((Object)htk, (Object)v3) && !mlc.q((Object)htk, (Object)etk.w)) {
                                                                                if (mlc.q((Object)htk, (Object)etk.l)) {
                                                                                    o2.getClass();
                                                                                    if (o2) {
                                                                                        this.C(this.o(this.A(f), 8));
                                                                                    }
                                                                                    E(this, this.A(f), 2048, n9, 8);
                                                                                }
                                                                                else {
                                                                                    final htk x = rsk.x;
                                                                                    if (mlc.q((Object)htk, (Object)x)) {
                                                                                        final List list6 = (List)d.f(x);
                                                                                        Object g11;
                                                                                        if ((g11 = v.g((Object)x)) == null) {
                                                                                            g11 = null;
                                                                                        }
                                                                                        final List list7 = (List)g11;
                                                                                        Label_2207: {
                                                                                            Label_2205: {
                                                                                                if (list7 != null) {
                                                                                                    final umf a10 = kak.a;
                                                                                                    final umf umf = new umf();
                                                                                                    final int size = ((Collection)list6).size();
                                                                                                    int l = 0;
                                                                                                    final List list8 = list6;
                                                                                                    while (l < size) {
                                                                                                        umf.a((Object)((qr7)list8.get(l)).a);
                                                                                                        ++l;
                                                                                                    }
                                                                                                    final umf umf2 = new umf();
                                                                                                    final int size2 = ((Collection)list7).size();
                                                                                                    int n26 = 0;
                                                                                                    final List list9 = list7;
                                                                                                    while (n26 < size2) {
                                                                                                        umf2.a((Object)((qr7)list9.get(n26)).a);
                                                                                                        ++n26;
                                                                                                    }
                                                                                                    if (n19 != 0) {
                                                                                                        break Label_2205;
                                                                                                    }
                                                                                                    if (!umf.equals((Object)umf2)) {
                                                                                                        break Label_2205;
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    if (n19 != 0) {
                                                                                                        break Label_2205;
                                                                                                    }
                                                                                                    if (!((Collection)list6).isEmpty()) {
                                                                                                        break Label_2205;
                                                                                                    }
                                                                                                }
                                                                                                n19 = 0;
                                                                                                break Label_2207;
                                                                                            }
                                                                                            n19 = 1;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Label_2363: {
                                                                                            if (n19 == 0 && o2 instanceof t3) {
                                                                                                final t3 t3 = (t3)o2;
                                                                                                Object g12;
                                                                                                if ((g12 = v.g((Object)htk)) == null) {
                                                                                                    g12 = null;
                                                                                                }
                                                                                                if (t3 != g12) {
                                                                                                    if (!(g12 instanceof t3)) {
                                                                                                        break Label_2363;
                                                                                                    }
                                                                                                    final String a11 = t3.a;
                                                                                                    final t3 t4 = (t3)g12;
                                                                                                    final aua b6 = t4.b;
                                                                                                    if (!mlc.q((Object)a11, (Object)t4.a)) {
                                                                                                        break Label_2363;
                                                                                                    }
                                                                                                    final aua b7 = t3.b;
                                                                                                    if (b7 == null && b6 != null) {
                                                                                                        break Label_2363;
                                                                                                    }
                                                                                                    if (b7 != null && b6 == null) {
                                                                                                        break Label_2363;
                                                                                                    }
                                                                                                }
                                                                                                n19 = 0;
                                                                                                break Label_2501;
                                                                                            }
                                                                                        }
                                                                                        n19 = 1;
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                this.w(layoutNode2);
                                                                                final sfk c7 = omo.C(n10, g0);
                                                                                c7.getClass();
                                                                                Object g13;
                                                                                if ((g13 = v2.g((Object)v3)) == null) {
                                                                                    g13 = null;
                                                                                }
                                                                                c7.b((dfk)g13);
                                                                                Object g14;
                                                                                if ((g14 = v2.g((Object)etk.w)) == null) {
                                                                                    g14 = null;
                                                                                }
                                                                                c7.c((dfk)g14);
                                                                                if (c7.A()) {
                                                                                    this.y.getSnapshotObserver().a.d((Object)c7, (lta)this.h0, (jta)new z4((Object)c7, (Object)this, (byte)14));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    n20 = 8;
                                                    n16 >>= 8;
                                                }
                                                final tsk tsk2 = tsk;
                                                tmf = v;
                                                n27 = n15;
                                                list10 = list3;
                                                layoutNode3 = layoutNode;
                                                final zsk zsk3 = zsk;
                                                n28 = n9;
                                                final int n29 = n10;
                                                final int n30 = n11;
                                                n31 = n29;
                                                zsk4 = zsk3;
                                                n32 = n28;
                                                n33 = n19;
                                                tsk3 = tsk2;
                                                list2 = list10;
                                                n34 = n27;
                                                if (n17 != n20) {
                                                    break;
                                                }
                                                tsk4 = tsk2;
                                                n13 = n19;
                                                zsk5 = zsk3;
                                                n35 = n29;
                                                n36 = n30;
                                            }
                                            else {
                                                tmf = v;
                                                n27 = n15;
                                                layoutNode3 = c;
                                                zsk5 = zsk;
                                                n35 = n10;
                                                n36 = n11;
                                                n28 = n9;
                                                tsk4 = tsk;
                                                list10 = list3;
                                            }
                                            n31 = n35;
                                            zsk4 = zsk5;
                                            n32 = n28;
                                            n33 = n13;
                                            tsk3 = tsk4;
                                            list2 = list10;
                                            n34 = n27;
                                            if (n12 == n36) {
                                                break;
                                            }
                                            final Integer n37 = n27;
                                            final int n38 = 8;
                                            ++n12;
                                            n11 = n36;
                                            n9 = n28;
                                            list3 = list10;
                                            n10 = n35;
                                            tsk = tsk4;
                                            v = tmf;
                                            n15 = n37;
                                            zsk = zsk5;
                                            n14 = n38;
                                            c = layoutNode3;
                                        }
                                    }
                                    else {
                                        final Integer n39 = value;
                                        final zsk zsk6 = a3;
                                        n32 = n9;
                                        n31 = n10;
                                        n33 = 0;
                                        n34 = n39;
                                        tsk3 = a2;
                                        zsk4 = zsk6;
                                    }
                                    int n40 = 0;
                                    Label_2842: {
                                        if ((n40 = n33) == 0) {
                                            final Iterator iterator = tsk3.iterator();
                                            while (iterator.hasNext()) {
                                                if (!zsk4.k().v.c((Object)((Map$Entry)iterator.next()).getKey())) {
                                                    n40 = 1;
                                                    break Label_2842;
                                                }
                                            }
                                            n40 = 0;
                                        }
                                    }
                                    if (n40 != 0) {
                                        final int a12 = this.A(n31);
                                        n8 = 8;
                                        E(this, a12, 2048, n32, 8);
                                        break Label_2892;
                                    }
                                    n8 = 8;
                                    break Label_2892;
                                }
                            }
                            n32 = n9;
                            n34 = value;
                        }
                        n4 >>= n8;
                        ++i;
                        value = n34;
                        n9 = n32;
                    }
                    n41 = n9;
                    n42 = value;
                    array3 = array2;
                    array4 = array;
                    if (n6 != n8) {
                        break;
                    }
                    n3 = n7;
                }
                else {
                    final Integer n43 = value;
                    final ArrayList list11 = list;
                    n41 = value2;
                    array3 = b;
                    array4 = a;
                    list2 = list11;
                    n42 = n43;
                }
                if (n3 == n2) {
                    break;
                }
                ++n3;
                final int[] array5 = array3;
                final long[] array6 = array4;
                value2 = n41;
                value = n42;
                list = list2;
                b = array5;
                a = array6;
            }
        }
    }
    
    public final void I(LayoutNode layoutNode, final klf klf) {
        if (layoutNode.V()) {
            if (!((Map)this.y.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).containsKey((Object)layoutNode)) {
                final boolean l = layoutNode.Z.l(8);
                final LayoutNode layoutNode2 = null;
                Label_0088: {
                    if (!l) {
                        for (layoutNode = layoutNode.G(); layoutNode != null; layoutNode = layoutNode.G()) {
                            if (layoutNode.Z.l(8)) {
                                break Label_0088;
                            }
                        }
                        layoutNode = null;
                    }
                }
                if (layoutNode != null) {
                    final tsk i = layoutNode.I();
                    if (i != null) {
                        LayoutNode layoutNode3 = layoutNode;
                        if (!i.x) {
                            LayoutNode layoutNode4 = layoutNode.G();
                            LayoutNode layoutNode5;
                            while (true) {
                                layoutNode5 = layoutNode2;
                                if (layoutNode4 == null) {
                                    break;
                                }
                                final tsk j = layoutNode4.I();
                                if (j != null && j.x) {
                                    layoutNode5 = layoutNode4;
                                    break;
                                }
                                layoutNode4 = layoutNode4.G();
                            }
                            layoutNode3 = layoutNode;
                            if (layoutNode5 != null) {
                                layoutNode3 = layoutNode5;
                            }
                        }
                        final int w = layoutNode3.w;
                        if (klf.a(w)) {
                            E(this, this.A(w), 2048, 1, 8);
                        }
                    }
                }
            }
        }
    }
    
    public final void J(final LayoutNode layoutNode) {
        if (layoutNode.V()) {
            if (!((Map)this.y.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).containsKey((Object)layoutNode)) {
                final int w = layoutNode.w;
                final dfk dfk = (dfk)((sgc)this.K).b(w);
                final dfk dfk2 = (dfk)((sgc)this.L).b(w);
                if (dfk != null || dfk2 != null) {
                    final AccessibilityEvent o = this.o(w, 4096);
                    if (dfk != null) {
                        ((AccessibilityRecord)o).setScrollX((int)((Number)dfk.a.a()).floatValue());
                        ((AccessibilityRecord)o).setMaxScrollX((int)((Number)dfk.b.a()).floatValue());
                    }
                    if (dfk2 != null) {
                        ((AccessibilityRecord)o).setScrollY((int)((Number)dfk2.a.a()).floatValue());
                        ((AccessibilityRecord)o).setMaxScrollY((int)((Number)dfk2.b.a()).floatValue());
                    }
                    this.C(o);
                }
            }
        }
    }
    
    public final boolean K(final zsk zsk, int o, int a, final boolean b) {
        final tsk d = zsk.d;
        final int f = zsk.f;
        final htk j = rsk.j;
        final boolean c = d.v.c((Object)j);
        final int n = 0;
        if (c && twl.q(zsk)) {
            final bua bua = (bua)((t3)zsk.d.f(j)).b;
            if (bua != null) {
                return (boolean)bua.h((Object)o, (Object)a, (Object)b);
            }
        }
        else if (o != a || a != this.O) {
            final String t = t(zsk);
            if (t != null) {
                if (o < 0 || o != a || a > t.length()) {
                    o = -1;
                }
                this.O = o;
                o = n;
                if (t.length() > 0) {
                    o = 1;
                }
                a = this.A(f);
                Integer value = null;
                Integer value2;
                if (o != 0) {
                    value2 = this.O;
                }
                else {
                    value2 = null;
                }
                Integer value3;
                if (o != 0) {
                    value3 = this.O;
                }
                else {
                    value3 = null;
                }
                if (o != 0) {
                    value = t.length();
                }
                this.C(this.p(a, value2, value3, value, (CharSequence)t));
                this.G(f);
                return true;
            }
        }
        return false;
    }
    
    public final Rect M(float n, final float n2, final float n3, final float n4) {
        final long n5 = Float.floatToRawIntBits(n);
        final long n6 = Float.floatToRawIntBits(n2);
        final AndroidComposeView y = this.y;
        final long r = y.r((n6 & 0xFFFFFFFFL) | n5 << 32);
        final long r2 = y.r(((long)Float.floatToRawIntBits(n4) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(n3) << 32);
        final int n7 = (int)(r >> 32);
        n = Float.intBitsToFloat(n7);
        final int n8 = (int)(r2 >> 32);
        final int n9 = (int)(float)Math.floor((double)Math.min(n, Float.intBitsToFloat(n8)));
        final int n10 = (int)(r & 0xFFFFFFFFL);
        n = Float.intBitsToFloat(n10);
        final int n11 = (int)(r2 & 0xFFFFFFFFL);
        return new Rect(n9, (int)(float)Math.floor((double)Math.min(n, Float.intBitsToFloat(n11))), (int)(float)Math.ceil((double)Math.max(Float.intBitsToFloat(n7), Float.intBitsToFloat(n8))), (int)(float)Math.ceil((double)Math.max(Float.intBitsToFloat(n10), Float.intBitsToFloat(n11))));
    }
    
    public final void Q() {
        final klf klf = new klf();
        final klf v = this.V;
        final int[] b = v.b;
        final long[] a = v.a;
        final int n = a.length - 2;
        final jlf b2 = this.b0;
        int n8;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                final int n4 = 7;
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n5 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n5; ++i) {
                        if ((n3 & 0xFFL) < 128L) {
                            final int n6 = b[(n2 << 3) + i];
                            final btk btk = (btk)this.s().b(n6);
                            final String s = null;
                            final String s2 = null;
                            zsk a2;
                            if (btk != null) {
                                a2 = btk.a;
                            }
                            else {
                                a2 = null;
                            }
                            if (a2 == null || !a2.d.v.c((Object)etk.d)) {
                                klf.a(n6);
                                final atk atk = (atk)((sgc)b2).b(n6);
                                String s3 = s;
                                if (atk != null) {
                                    Object g = atk.a.v.g((Object)etk.d);
                                    if (g == null) {
                                        g = s2;
                                    }
                                    s3 = (String)g;
                                }
                                this.F(n6, 32, s3);
                            }
                        }
                        n3 >>= 8;
                    }
                    final int n7 = n8 = n4;
                    if (n5 != 8) {
                        break;
                    }
                    n8 = n7;
                }
                else {
                    n8 = 7;
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        else {
            n8 = 7;
        }
        final int[] b3 = klf.b;
        long[] a3 = klf.a;
        final int n9 = a3.length - 2;
        if (n9 >= 0) {
            int n10 = 0;
            while (true) {
                final int n11 = 8;
                long n12 = a3[n10];
                if ((~n12 << n8 & n12 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n13 = 8 - (~(n10 - n9) >>> 31);
                    long[] array;
                    for (int j = 0; j < n13; ++j, a3 = array) {
                        long n26;
                        if ((n12 & 0xFFL) < 128L) {
                            final int n14 = b3[(n10 << 3) + j];
                            final int n15 = Integer.hashCode(n14) * -862048943;
                            final int n16 = n15 ^ n15 << 16;
                            final int c = v.c;
                            int n17 = n16 >>> 7 & c;
                            int n18 = 0;
                            int n25 = 0;
                        Label_0603:
                            while (true) {
                                final long[] a4 = v.a;
                                final int n19 = n17 >> 3;
                                final int n20 = (n17 & 0x7) << 3;
                                final long n21 = a4[n19] >>> n20 | (a4[n19 + 1] << 64 - n20 & -n20 >> 63);
                                final long n22 = (n16 & 0x7F) * 72340172838076673L ^ n21;
                                for (long n23 = n22 - 72340172838076673L & ~n22 & 0x8080808080808080L; n23 != 0L; n23 &= n23 - 1L) {
                                    final int n24 = n17 + (Long.numberOfTrailingZeros(n23) >> 3) & c;
                                    if (v.b[n24] == n14) {
                                        n25 = n24;
                                        break Label_0603;
                                    }
                                }
                                if ((n21 & ~n21 << 6 & 0x8080808080808080L) != 0x0L) {
                                    n25 = -1;
                                    break;
                                }
                                n18 += 8;
                                n17 = (n17 + n18 & c);
                            }
                            array = a3;
                            n26 = n12;
                            if (n25 >= 0) {
                                v.h(n25);
                                array = a3;
                                n26 = n12;
                            }
                        }
                        else {
                            n26 = n12;
                            array = a3;
                        }
                        n12 = n26 >> n11;
                    }
                    if (n13 != n11) {
                        break;
                    }
                }
                if (n10 == n9) {
                    break;
                }
                ++n10;
            }
        }
        b2.c();
        final sgc s4 = this.s();
        final int[] b4 = s4.b;
        final Object[] c2 = s4.c;
        final long[] a5 = s4.a;
        final int n27 = a5.length - 2;
        if (n27 >= 0) {
            int n28 = 0;
            while (true) {
                long n29 = a5[n28];
                if ((~n29 << n8 & n29 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n30 = 8 - (~(n28 - n27) >>> 31);
                    for (int k = 0; k < n30; ++k) {
                        if ((n29 & 0xFFL) < 128L) {
                            final int n31 = (n28 << 3) + k;
                            final int n32 = b4[n31];
                            final zsk a6 = ((btk)c2[n31]).a;
                            final tsk d = a6.d;
                            final htk d2 = etk.d;
                            if (d.v.c((Object)d2) && v.a(n32)) {
                                this.F(n32, 16, (String)a6.d.f(d2));
                            }
                            b2.i(n32, (Object)new atk(a6, this.s()));
                        }
                        n29 >>= 8;
                    }
                    if (n30 != 8) {
                        break;
                    }
                }
                if (n28 == n27) {
                    break;
                }
                ++n28;
            }
        }
        this.c0 = new atk(this.y.getSemanticsOwner().a(), this.s());
    }
    
    @Override
    public final jy7 b(final View view) {
        return this.E;
    }
    
    public final void j(int n, final x4 x4, final String s, final Bundle bundle) {
        final AccessibilityNodeInfo a = x4.a;
        final btk btk = (btk)this.s().b(n);
        if (btk != null) {
            final zsk a2 = btk.a;
            if (a2 != null) {
                final LayoutNode c = a2.c;
                final tsk d = a2.d;
                final tmf v = d.v;
                final String t = t(a2);
                if (mlc.q((Object)s, (Object)this.Y)) {
                    n = this.W.d(n);
                    if (n != -1) {
                        ((BaseBundle)a.getExtras()).putInt(s, n);
                    }
                }
                else if (mlc.q((Object)s, (Object)this.Z)) {
                    n = this.X.d(n);
                    if (n != -1) {
                        ((BaseBundle)a.getExtras()).putInt(s, n);
                    }
                }
                else {
                    final boolean c2 = v.c((Object)rsk.a);
                    final AndroidComposeView y = this.y;
                    int i = 0;
                    if (c2 && bundle != null && mlc.q((Object)s, (Object)"android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                        final int int1 = ((BaseBundle)bundle).getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                        final int int2 = ((BaseBundle)bundle).getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                        if (int2 > 0 && int1 >= 0) {
                            if (t != null) {
                                n = t.length();
                            }
                            else {
                                n = Integer.MAX_VALUE;
                            }
                            if (int1 < n) {
                                final omn k = omo.K(d);
                                Object[] array2 = null;
                                Label_0585: {
                                    if (k != null) {
                                        Object o = c.Z.y;
                                        if (!((lcc)o).z0.I) {
                                            o = null;
                                        }
                                        if (o != null) {
                                            final long n2 = ((yxf)o).N(0L);
                                            final k2j g = a2.g();
                                            final RectF[] array = new RectF[int2];
                                            n = int1;
                                            while (i < int2) {
                                                final int n3 = n + i;
                                                if (n3 < k.a.a.w.length()) {
                                                    final k2j m = k.b(n3).m(n2);
                                                    k2j j;
                                                    if (m.k(g)) {
                                                        j = m.i(g);
                                                    }
                                                    else {
                                                        j = null;
                                                    }
                                                    if (j != null) {
                                                        final long r = y.r((long)Float.floatToRawIntBits(j.a) << 32 | ((long)Float.floatToRawIntBits(j.b) & 0xFFFFFFFFL));
                                                        final long r2 = y.r(((long)Float.floatToRawIntBits(j.d) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(j.c) << 32);
                                                        final int n4 = (int)(r >> 32);
                                                        final float intBitsToFloat = Float.intBitsToFloat(n4);
                                                        final int n5 = (int)(r2 >> 32);
                                                        final float min = Math.min(intBitsToFloat, Float.intBitsToFloat(n5));
                                                        final int n6 = (int)(r & 0xFFFFFFFFL);
                                                        final float intBitsToFloat2 = Float.intBitsToFloat(n6);
                                                        final int n7 = (int)(r2 & 0xFFFFFFFFL);
                                                        array[i] = new RectF(min, Math.min(intBitsToFloat2, Float.intBitsToFloat(n7)), Math.max(Float.intBitsToFloat(n4), Float.intBitsToFloat(n5)), Math.max(Float.intBitsToFloat(n6), Float.intBitsToFloat(n7)));
                                                    }
                                                }
                                                ++i;
                                            }
                                            array2 = array;
                                            break Label_0585;
                                        }
                                    }
                                    array2 = null;
                                }
                                if (array2 == null) {
                                    return;
                                }
                                a.getExtras().putParcelableArray(s, (Parcelable[])array2);
                                return;
                            }
                        }
                        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                        return;
                    }
                    final htk a3 = etk.A;
                    if (v.c((Object)a3) && bundle != null && mlc.q((Object)s, (Object)"androidx.compose.ui.semantics.testTag")) {
                        Object g2 = v.g((Object)a3);
                        if (g2 == null) {
                            g2 = null;
                        }
                        final String s2 = (String)g2;
                        if (s2 != null) {
                            a.getExtras().putCharSequence(s, (CharSequence)s2);
                        }
                    }
                    else {
                        if (mlc.q((Object)s, (Object)"androidx.compose.ui.semantics.id")) {
                            ((BaseBundle)a.getExtras()).putInt(s, a2.f);
                            return;
                        }
                        if (mlc.q((Object)s, (Object)"androidx.compose.ui.semantics.shapeType")) {
                            Object g3 = v.g((Object)etk.S);
                            if (g3 == null) {
                                g3 = null;
                            }
                            final aql aql = (aql)g3;
                            if (aql != null) {
                                final Rect rect = new Rect();
                                a.getBoundsInScreen(rect);
                                final k2j u = this.u(a2, rect, aql);
                                final float b = u.b;
                                final float a4 = u.a;
                                final k8e a5 = aql.a(u.g(), c.V, y.getDensity());
                                if (a5 instanceof rig) {
                                    ((BaseBundle)a.getExtras()).putInt("androidx.compose.ui.semantics.shapeType", 0);
                                    a.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", (Parcelable)L(a5, a4, b));
                                    return;
                                }
                                if (a5 instanceof sig) {
                                    ((BaseBundle)a.getExtras()).putInt("androidx.compose.ui.semantics.shapeType", 1);
                                    a.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", (Parcelable)L(a5, a4, b));
                                    a.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(a5));
                                    return;
                                }
                                if (a5 instanceof qig) {
                                    ((BaseBundle)a.getExtras()).putInt("androidx.compose.ui.semantics.shapeType", 2);
                                    a.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", (Parcelable)O(a5, a4, b));
                                    return;
                                }
                                en9.r();
                            }
                        }
                        else if (mlc.q((Object)s, (Object)"androidx.compose.ui.semantics.shapeRect")) {
                            Object g4 = v.g((Object)etk.S);
                            if (g4 == null) {
                                g4 = null;
                            }
                            final aql aql2 = (aql)g4;
                            if (aql2 != null) {
                                final Rect rect2 = new Rect();
                                a.getBoundsInScreen(rect2);
                                final k2j u2 = this.u(a2, rect2, aql2);
                                final Rect l = L(aql2.a(u2.g(), c.V, y.getDensity()), u2.a, u2.b);
                                if (l != null) {
                                    a.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", (Parcelable)l);
                                }
                            }
                        }
                        else if (mlc.q((Object)s, (Object)"androidx.compose.ui.semantics.shapeCorners")) {
                            Object g5 = v.g((Object)etk.S);
                            if (g5 == null) {
                                g5 = null;
                            }
                            final aql aql3 = (aql)g5;
                            if (aql3 != null) {
                                final Rect rect3 = new Rect();
                                a.getBoundsInScreen(rect3);
                                final float[] n8 = N(aql3.a(this.u(a2, rect3, aql3).g(), c.V, y.getDensity()));
                                if (n8 != null) {
                                    a.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", n8);
                                }
                            }
                        }
                        else if (mlc.q((Object)s, (Object)"androidx.compose.ui.semantics.shapeRegion")) {
                            Object g6 = v.g((Object)etk.S);
                            if (g6 == null) {
                                g6 = null;
                            }
                            final aql aql4 = (aql)g6;
                            if (aql4 != null) {
                                final Rect rect4 = new Rect();
                                a.getBoundsInScreen(rect4);
                                final k2j u3 = this.u(a2, rect4, aql4);
                                final Region o2 = O(aql4.a(u3.g(), c.V, y.getDensity()), u3.a, u3.b);
                                if (o2 != null) {
                                    a.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", (Parcelable)o2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final Rect k(final btk btk) {
        final ygc b = btk.b;
        return this.M((float)b.a, (float)b.b, (float)b.c, (float)b.d);
    }
    
    public final Object l(final h07 h07) {
        Object o = null;
        Label_0051: {
            if (h07 instanceof d50) {
                final d50 d50 = (d50)h07;
                final int z = d50.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    d50.z = z + Integer.MIN_VALUE;
                    o = d50;
                    break Label_0051;
                }
            }
            o = new d50(this, h07);
        }
        Object o2 = ((d50)o).x;
        final int z2 = ((d50)o).z;
        final fw0 q = this.Q;
        final pc7 v = pc7.v;
        while (true) {
            Object o3 = null;
            Object o4 = null;
            Label_0236: {
                Label_0189: {
                    if (z2 == 0) {
                        vt4.g0(o2);
                        o3 = new klf();
                        final mn2 r = this.R;
                        r.getClass();
                        o4 = new en2(r);
                        break Label_0189;
                    }
                    if (z2 == 1) {
                        o3 = ((d50)o).w;
                        o4 = ((d50)o).v;
                        vt4.g0(o2);
                        break Label_0236;
                    }
                    Label_0123: {
                        if (z2 != 2) {
                            break Label_0123;
                        }
                        o3 = ((d50)o).w;
                        o4 = ((d50)o).v;
                        Label_0436: {
                            try {
                                vt4.g0(o2);
                                final Object o5 = o4;
                                o4 = o3;
                                o3 = o5;
                                break Label_0189;
                            }
                            finally {
                                break Label_0436;
                            }
                            break Label_0123;
                        }
                        q.clear();
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ((d50)o).v = (klf)o3;
                ((d50)o).w = (en2)o4;
                ((d50)o).z = 1;
                o2 = ((en2)o4).b((f07)o);
                if (o2 == v) {
                    return v;
                }
                final en2 en2 = (en2)o4;
                o4 = o3;
                o3 = en2;
            }
            if (!(boolean)o2) {
                q.clear();
                return lqo.a;
            }
            ((en2)o3).c();
            Label_0367: {
                if (this.v()) {
                    Trace.beginSection("Compose:semantics:boundUpdates");
                    Label_0362: {
                        try {
                            for (int x = q.x, i = 0; i < x; ++i) {
                                final LayoutNode layoutNode = (LayoutNode)q.w[i];
                                this.I(layoutNode, (klf)o4);
                                this.J(layoutNode);
                            }
                        }
                        finally {
                            break Label_0362;
                        }
                        ((klf)o4).b();
                        Trace.endSection();
                        final Handler handler = ((View)this.y).getHandler();
                        if (!this.d0 && handler != null) {
                            this.d0 = true;
                            handler.post((Runnable)this.f0);
                        }
                        break Label_0367;
                    }
                    Trace.endSection();
                }
            }
            q.clear();
            this.K.c();
            this.L.c();
            final long c = this.C;
            ((d50)o).v = (klf)o4;
            ((d50)o).w = (en2)o3;
            ((d50)o).z = 2;
            if (ach.A(c, (f07)o) != v) {
                continue;
            }
            break;
        }
        return v;
    }
    
    public final boolean m(final int n, final long n2, final boolean b) {
        if (mlc.q((Object)Looper.getMainLooper().getThread(), (Object)Thread.currentThread())) {
            final sgc s = this.s();
            if (!l6g.c(n2, 9205357640488583168L) && ((0x7FFFFFFF7FFFFFFFL & n2) + 36028792732385279L & 0x8000000080000000L) == 0x0L) {
                htk htk;
                if (b) {
                    htk = etk.w;
                }
                else {
                    if (b) {
                        en9.r();
                        return false;
                    }
                    htk = etk.v;
                }
                final Object[] c = s.c;
                final long[] a = s.a;
                final int n3 = a.length - 2;
                if (n3 >= 0) {
                    int n4 = 0;
                    boolean b2 = false;
                    while (true) {
                        long n5 = a[n4];
                        if ((~n5 << 7 & n5 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n6 = 8;
                            final int n7 = 8 - (~(n4 - n3) >>> 31);
                            for (int i = 0; i < n7; ++i) {
                                Label_0499: {
                                    if ((n5 & 0xFFL) < 128L) {
                                        final btk btk = (btk)c[(n4 << 3) + i];
                                        final ygc b3 = btk.b;
                                        final float n8 = (float)b3.a;
                                        final float n9 = (float)b3.b;
                                        final float n10 = (float)b3.c;
                                        final float n11 = (float)b3.d;
                                        final float intBitsToFloat = Float.intBitsToFloat((int)(n2 >> 32));
                                        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL));
                                        if (intBitsToFloat2 < n11 & (intBitsToFloat >= n8 & intBitsToFloat < n10 & intBitsToFloat2 >= n9)) {
                                            Object g;
                                            if ((g = btk.a.d.v.g((Object)htk)) == null) {
                                                g = null;
                                            }
                                            final dfk dfk = (dfk)g;
                                            if (dfk != null) {
                                                final boolean c2 = dfk.c;
                                                int n12;
                                                if (c2) {
                                                    n12 = -n;
                                                }
                                                else {
                                                    n12 = n;
                                                }
                                                int n13 = n12;
                                                if (n == 0) {
                                                    n13 = n12;
                                                    if (c2) {
                                                        n13 = -1;
                                                    }
                                                }
                                                final jta a2 = dfk.a;
                                                if (n13 < 0) {
                                                    if (((Number)a2.a()).floatValue() <= 0.0f) {
                                                        break Label_0499;
                                                    }
                                                }
                                                else if (((Number)a2.a()).floatValue() >= ((Number)dfk.b.a()).floatValue()) {
                                                    break Label_0499;
                                                }
                                                b2 = true;
                                            }
                                        }
                                    }
                                }
                                n5 >>= n6;
                            }
                            if (n7 != n6) {
                                return b2;
                            }
                        }
                        if (n4 == n3) {
                            return b2;
                        }
                        ++n4;
                    }
                }
            }
        }
        return false;
    }
    
    public final void n() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (this.v()) {
                this.B(this.y.getSemanticsOwner().a(), this.c0);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                this.H(this.s());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    this.Q();
                }
                finally {
                    Trace.endSection();
                }
            }
            finally {
                Trace.endSection();
            }
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final AccessibilityEvent o(final int n, final int n2) {
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(n2);
        ((AccessibilityRecord)obtain).setEnabled(true);
        ((AccessibilityRecord)obtain).setClassName((CharSequence)"android.view.View");
        final AndroidComposeView y = this.y;
        obtain.setPackageName((CharSequence)((View)y).getContext().getPackageName());
        ((AccessibilityRecord)obtain).setSource((View)y, n);
        if (this.v()) {
            final btk btk = (btk)this.s().b(n);
            if (btk != null) {
                final zsk a = btk.a;
                ((AccessibilityRecord)obtain).setPassword(a.d.v.c((Object)etk.N));
                Object g;
                if ((g = a.d.v.g((Object)etk.o)) == null) {
                    g = null;
                }
                r3r.E(obtain, mlc.q(g, (Object)Boolean.TRUE));
            }
        }
        return obtain;
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        this.D = null;
    }
    
    public final void onTouchExplorationStateChanged(final boolean b) {
        this.D = null;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        final AccessibilityManager b = this.B;
        if (b.isEnabled()) {
            this.D = null;
        }
        b.addAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)this);
        b.addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)this);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        final Handler handler = ((View)this.y).getHandler();
        handler.getClass();
        handler.removeCallbacks((Runnable)this.f0);
        final AccessibilityManager b = this.B;
        b.removeAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)this);
        b.removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)this);
    }
    
    public final AccessibilityEvent p(final int n, final Integer n2, final Integer n3, final Integer n4, final CharSequence charSequence) {
        final AccessibilityEvent o = this.o(n, 8192);
        if (n2 != null) {
            ((AccessibilityRecord)o).setFromIndex(((Number)n2).intValue());
        }
        if (n3 != null) {
            ((AccessibilityRecord)o).setToIndex(((Number)n3).intValue());
        }
        if (n4 != null) {
            ((AccessibilityRecord)o).setItemCount(((Number)n4).intValue());
        }
        if (charSequence != null) {
            ((AccessibilityRecord)o).getText().add((Object)charSequence);
        }
        return o;
    }
    
    public final int q(final zsk zsk) {
        final tsk d = zsk.d;
        if (!d.v.c((Object)etk.a)) {
            final htk h = etk.H;
            if (d.v.c((Object)h)) {
                return (int)(((dnn)d.f(h)).a & 0xFFFFFFFFL);
            }
        }
        return this.O;
    }
    
    public final int r(final zsk zsk) {
        final tsk d = zsk.d;
        if (!d.v.c((Object)etk.a)) {
            final htk h = etk.H;
            if (d.v.c((Object)h)) {
                return (int)(((dnn)d.f(h)).a >> 32);
            }
        }
        return this.O;
    }
    
    public final sgc s() {
        if (this.S) {
            this.S = false;
            final AndroidComposeView y = this.y;
            this.U = ach.G(y.getSemanticsOwner(), (lta)new f3((byte)28));
            if (this.v()) {
                final jlf u = this.U;
                final Resources resources = ((View)y).getContext().getResources();
                final hlf w = this.W;
                w.a();
                final hlf x = this.X;
                x.a();
                final btk btk = (btk)((sgc)u).b(-1);
                zsk a;
                if (btk != null) {
                    a = btk.a;
                }
                else {
                    a = null;
                }
                a.getClass();
                final ArrayList b = jtk.b(a, new i0((Object)u, (byte)7), new i0((Object)resources, (byte)8), lq6.X((Object)a));
                final int p = lq6.P((List)b);
                int n = 1;
                if (1 <= p) {
                    while (true) {
                        final int f = ((zsk)b.get(n - 1)).f;
                        final int f2 = ((zsk)b.get(n)).f;
                        w.f(f, f2);
                        x.f(f2, f);
                        if (n == p) {
                            break;
                        }
                        ++n;
                    }
                }
            }
        }
        return (sgc)this.U;
    }
    
    public final k2j u(final zsk zsk, final Rect rect, final aql aql) {
        final e50 e50 = new e50(aql);
        final LayoutNode c = zsk.c;
        hgf a = (hgf)c.Z.B;
        final int y = a.y;
        xsk xsk2;
        final xsk xsk = xsk2 = null;
        Label_0313: {
            if ((y & 0x8) != 0x0) {
                while (true) {
                    xsk2 = xsk;
                    if (a == null) {
                        break;
                    }
                    if ((a.x & 0x8) != 0x0) {
                        hgf g = a;
                        inf inf = null;
                        while (g != null) {
                            inf inf2;
                            if (g instanceof xsk) {
                                ((xsk)g).j((itk)e50);
                                inf2 = inf;
                                if (e50.b()) {
                                    xsk2 = (xsk)g;
                                    break Label_0313;
                                }
                            }
                            else {
                                inf2 = inf;
                                if ((g.x & 0x8) != 0x0) {
                                    inf2 = inf;
                                    if (g instanceof v98) {
                                        hgf hgf = ((v98)g).K;
                                        int n = 0;
                                        while (hgf != null) {
                                            hgf hgf2 = g;
                                            inf inf3 = inf;
                                            int n2 = n;
                                            if ((hgf.x & 0x8) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    hgf2 = hgf;
                                                    inf3 = inf;
                                                }
                                                else {
                                                    inf inf4;
                                                    if ((inf4 = inf) == null) {
                                                        inf4 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    hgf hgf3;
                                                    if ((hgf3 = g) != null) {
                                                        inf4.b((Object)g);
                                                        hgf3 = null;
                                                    }
                                                    inf4.b((Object)hgf);
                                                    inf3 = inf4;
                                                    hgf2 = hgf3;
                                                }
                                            }
                                            hgf = hgf.A;
                                            g = hgf2;
                                            inf = inf3;
                                            n = n2;
                                        }
                                        inf2 = inf;
                                        if (n == 1) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            g = soh.G(inf2);
                            inf = inf2;
                        }
                    }
                    xsk2 = xsk;
                    if ((a.y & 0x8) == 0x0) {
                        break;
                    }
                    a = a.A;
                }
            }
        }
        final xsk xsk3 = xsk2;
        if (xsk3 != null && ((hgf)xsk3).v.I) {
            final yxf k = soh.K((t98)xsk3);
            final k2j l = r9n.t((nzc)k).L((nzc)k, false);
            final Rect m = this.M(l.a, l.b, l.c, l.d);
            final float n3 = (float)(m.left - rect.left);
            final float n4 = (float)(m.top - rect.top);
            return new k2j(n3, n4, m.width() + n3, m.height() + n4);
        }
        return r9n.g((nzc)c.getOuterCoordinator$ui(), false);
    }
    
    public final boolean v() {
        final AccessibilityManager b = this.B;
        if (b.isEnabled()) {
            List d;
            if ((d = this.D) == null) {
                d = b.getEnabledAccessibilityServiceList(-1);
                this.D = d;
            }
            if (!((Collection)d).isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    public final void w(final LayoutNode layoutNode) {
        if (this.Q.add((Object)layoutNode)) {
            ((stk)this.R).e((Object)lqo.a);
        }
    }
}
