import android.os.BaseBundle;
import java.util.Collection;
import android.os.SystemClock;
import android.graphics.Rect;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo$RangeInfo;
import android.util.Log;
import java.util.List;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;
import java.util.ArrayList;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import android.text.style.StyleSpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.os.Bundle;

public final class b50 extends jy7
{
    public final f50 z;
    
    public b50(final f50 z) {
        this.z = z;
        super((byte)3);
    }
    
    public final void j(final int n, final x4 x4, final String s, final Bundle bundle) {
        this.z.j(n, x4, s, bundle);
    }
    
    public final x4 o(final int n) {
        final f50 z = this.z;
        final AccessibilityManager b = z.B;
        final ilf i0 = f50.i0;
        final AndroidComposeView y = z.y;
        x4 x4 = null;
        Label_0073: {
            if (y.getComposeViewContext().d().d().b() == tad.v) {
                if (!b.isEnabled()) {
                    x4 = new x4(AccessibilityNodeInfo.obtain());
                    break Label_0073;
                }
            }
            else {
                final btk btk = (btk)z.s().b(n);
                if (btk == null) {
                    if (!b.isEnabled()) {
                        x4 = new x4(AccessibilityNodeInfo.obtain());
                        break Label_0073;
                    }
                }
                else {
                    final zsk a = btk.a;
                    final tsk k = a.k();
                    final LayoutNode c = a.c;
                    Object g;
                    if ((g = k.v.g((Object)etk.o)) == null) {
                        g = null;
                    }
                    final boolean q = mlc.q(g, (Object)Boolean.TRUE);
                    if (q && Build$VERSION.SDK_INT >= 34 && !j4.e(b)) {
                        x4 = null;
                        break Label_0073;
                    }
                    final AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                    x4 x5 = new x4(obtain);
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (sdk_INT >= 34) {
                        j4.f(obtain, q);
                    }
                    else {
                        x5.g(64, q);
                    }
                    if (n == -1) {
                        final ViewParent parentForAccessibility = ((View)y).getParentForAccessibility();
                        View parent;
                        if (parentForAccessibility instanceof View) {
                            parent = (View)parentForAccessibility;
                        }
                        else {
                            parent = null;
                        }
                        x5.b = -1;
                        obtain.setParent(parent);
                    }
                    else {
                        final zsk l = a.l();
                        Object value;
                        if (l != null) {
                            value = l.f;
                        }
                        else {
                            value = null;
                        }
                        if (value == null) {
                            final StringBuilder sb = new StringBuilder("semanticsNode ");
                            sb.append(n);
                            sb.append(" has null parent");
                            gac.d(sb.toString());
                            ebq.a();
                            return null;
                        }
                        int intValue;
                        if ((intValue = ((Number)value).intValue()) == y.getSemanticsOwner().a().f) {
                            intValue = -1;
                        }
                        obtain.setParent((View)y, x5.b = intValue);
                    }
                    obtain.setSource((View)y, x5.c = n);
                    obtain.setBoundsInScreen(z.k(btk));
                    final hlf e0 = z.e0;
                    final wcm n2 = z.N;
                    final Resources resources = ((View)y).getContext().getResources();
                    x5.h("android.view.View");
                    final tsk d = a.d;
                    final tmf v = d.v;
                    if (v.c((Object)etk.G)) {
                        x5.h("android.widget.EditText");
                    }
                    if (v.c((Object)etk.C)) {
                        x5.h("android.widget.TextView");
                    }
                    Object g2;
                    if ((g2 = v.g((Object)etk.z)) == null) {
                        g2 = null;
                    }
                    final iuj iuj = (iuj)g2;
                    if (iuj != null) {
                        final byte a2 = iuj.a;
                        if (a.n() || zsk.j(4, a).isEmpty()) {
                            if (a2 == 4) {
                                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", (CharSequence)resources.getString(2131758417));
                            }
                            else if (a2 == 2) {
                                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", (CharSequence)resources.getString(2131758416));
                            }
                            else {
                                final String f0 = omo.f0((int)a2);
                                if (a2 != 5 || twl.J(a) || d.x) {
                                    x5.h(f0);
                                }
                            }
                        }
                    }
                    obtain.setPackageName((CharSequence)((View)y).getContext().getPackageName());
                    obtain.setImportantForAccessibility(ach.R(a));
                    final boolean b2 = sdk_INT < 34 || j4.e(b);
                    final List j = zsk.j(4, a);
                    final int size = ((Collection)j).size();
                    int n3 = 0;
                    int n5;
                    for (int n4 = 0; n4 < size; ++n4, n3 = n5) {
                        final zsk zsk = (zsk)j.get(n4);
                        final sgc s = z.s();
                        final int f2 = zsk.f;
                        n5 = n3;
                        if (s.a(f2)) {
                            final uc0 uc0 = (uc0)y.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get((Object)zsk.c);
                            if (f2 == -1) {
                                n5 = n3;
                            }
                            else {
                                if (uc0 != null) {
                                    obtain.addChild((View)uc0);
                                }
                                else {
                                    final btk btk2 = (btk)z.s().b(f2);
                                    boolean q2 = false;
                                    Label_0925: {
                                        if (btk2 != null) {
                                            final zsk a3 = btk2.a;
                                            if (a3 != null) {
                                                Object g3;
                                                if ((g3 = a3.k().v.g((Object)etk.o)) == null) {
                                                    g3 = null;
                                                }
                                                q2 = mlc.q(g3, (Object)Boolean.TRUE);
                                                break Label_0925;
                                            }
                                        }
                                        q2 = false;
                                    }
                                    if (b2 || !q2) {
                                        obtain.addChild((View)y, f2);
                                    }
                                }
                                e0.f(f2, n3);
                                n5 = n3 + 1;
                            }
                        }
                    }
                    final int f3 = z.F;
                    AccessibilityNodeInfo a4 = x5.a;
                    if (n == f3) {
                        a4.setAccessibilityFocused(true);
                        x5.b(q4.d);
                    }
                    else {
                        a4.setAccessibilityFocused(false);
                        x5.b(q4.c);
                    }
                    final og0 y2 = twl.y(a);
                    iuj iuj3;
                    tsk tsk2;
                    Object text;
                    AccessibilityNodeInfo accessibilityNodeInfo2;
                    zsk zsk3;
                    if (y2 != null) {
                        final tna fontFamilyResolver = y.getFontFamilyResolver();
                        final xc8 density = y.getDensity();
                        final tze a5 = z.a0;
                        final String w = y2.w;
                        final List v2 = y2.v;
                        final SpannableString spannableString = new SpannableString((CharSequence)w);
                        final ArrayList x6 = y2.x;
                        og0 og0;
                        zsk zsk2;
                        iuj iuj2;
                        tsk tsk;
                        x4 x7;
                        CharSequence charSequence;
                        if (x6 != null) {
                            final int size2 = ((Collection)x6).size();
                            int n6 = 0;
                            final AccessibilityNodeInfo accessibilityNodeInfo = a4;
                            while (true) {
                                og0 = y2;
                                a4 = accessibilityNodeInfo;
                                zsk2 = a;
                                iuj2 = iuj;
                                tsk = d;
                                x7 = x5;
                                charSequence = (CharSequence)spannableString;
                                if (n6 >= size2) {
                                    break;
                                }
                                final ng0 ng0 = (ng0)((List)x6).get(n6);
                                final hcm hcm = (hcm)ng0.a;
                                final int b3 = ng0.b;
                                final int c2 = ng0.c;
                                final hcm a6 = hcm.a(hcm, 0L, 65503);
                                final oln a7 = a6.a;
                                final tln m = a6.j;
                                final wgn m2 = a6.m;
                                final una f4 = a6.f;
                                final soa d2 = a6.d;
                                yi2.W((Spannable)spannableString, a7.b(), b3, c2);
                                yi2.X((Spannable)spannableString, a6.b, density, b3, c2);
                                final zoa c3 = a6.c;
                                if (c3 != null || d2 != null) {
                                    zoa a8;
                                    if ((a8 = c3) == null) {
                                        a8 = zoa.A;
                                    }
                                    int a9;
                                    if (d2 != null) {
                                        a9 = d2.a;
                                    }
                                    else {
                                        a9 = 0;
                                    }
                                    spannableString.setSpan((Object)new StyleSpan(w8r.j(a8, a9)), b3, c2, 33);
                                }
                                if (f4 != null) {
                                    if (f4 instanceof cxa) {
                                        spannableString.setSpan((Object)new TypefaceSpan(((cxa)f4).A), b3, c2, 33);
                                    }
                                    else if (Build$VERSION.SDK_INT >= 28) {
                                        final toa e2 = a6.e;
                                        int a10;
                                        if (e2 != null) {
                                            a10 = e2.a;
                                        }
                                        else {
                                            a10 = 65535;
                                        }
                                        final Object value2 = ((xom)((wna)fontFamilyResolver).b(f4, zoa.A, 0, a10)).getValue();
                                        value2.getClass();
                                        spannableString.setSpan((Object)ai0.c((Typeface)value2), b3, c2, 33);
                                    }
                                }
                                if (m2 != null) {
                                    final int a11 = m2.a;
                                    if ((a11 | 0x1) == a11) {
                                        spannableString.setSpan((Object)new UnderlineSpan(), b3, c2, 33);
                                    }
                                    if ((a11 | 0x2) == a11) {
                                        spannableString.setSpan((Object)new StrikethroughSpan(), b3, c2, 33);
                                    }
                                }
                                if (m != null) {
                                    spannableString.setSpan((Object)new ScaleXSpan(m.a), b3, c2, 33);
                                }
                                final jpd k2 = a6.k;
                                if (k2 != null) {
                                    spannableString.setSpan((Object)mkq.t(k2), b3, c2, 33);
                                }
                                final long l2 = a6.l;
                                if (l2 != 16L) {
                                    spannableString.setSpan((Object)new BackgroundColorSpan(t08.o0(l2)), b3, c2, 33);
                                }
                                ++n6;
                            }
                        }
                        else {
                            og0 = y2;
                            zsk2 = a;
                            iuj2 = iuj;
                            tsk = d;
                            x7 = x5;
                            charSequence = (CharSequence)spannableString;
                        }
                        iuj3 = iuj2;
                        tsk2 = tsk;
                        x5 = x7;
                        final int length = w.length();
                        Object v3 = r89.v;
                        Object o;
                        if (v2 != null) {
                            final ArrayList list = new ArrayList(v2.size());
                            final int size3 = ((Collection)v2).size();
                            int n7 = 0;
                            while (true) {
                                o = list;
                                if (n7 >= size3) {
                                    break;
                                }
                                final Object value3 = v2.get(n7);
                                final ng0 ng2 = (ng0)value3;
                                if (ng2.a instanceof k7p && pg0.c(0, length, ng2.b, ng2.c)) {
                                    list.add(value3);
                                }
                                ++n7;
                            }
                        }
                        else {
                            o = v3;
                        }
                        for (int size4 = ((Collection)o).size(), n8 = 0; n8 < size4; ++n8) {
                            final ng0 ng3 = (ng0)((List)o).get(n8);
                            ((SpannableString)charSequence).setSpan((Object)j6r.k((k7p)ng3.a), ng3.b, ng3.c, 33);
                        }
                        final int length2 = w.length();
                        if (v2 != null) {
                            final ArrayList list2 = new ArrayList(v2.size());
                            final int size5 = ((Collection)v2).size();
                            int n9 = 0;
                            while (true) {
                                v3 = list2;
                                if (n9 >= size5) {
                                    break;
                                }
                                final Object value4 = v2.get(n9);
                                final ng0 ng4 = (ng0)value4;
                                if (ng4.a instanceof xyo && pg0.c(0, length2, ng4.b, ng4.c)) {
                                    list2.add(value4);
                                }
                                ++n9;
                            }
                        }
                        for (int size6 = ((Collection)v3).size(), n10 = 0; n10 < size6; ++n10) {
                            final ng0 ng5 = (ng0)((List)v3).get(n10);
                            final xyo xyo = (xyo)ng5.a;
                            final int b4 = ng5.b;
                            final int c4 = ng5.c;
                            final WeakHashMap weakHashMap = (WeakHashMap)a5.w;
                            Object value5;
                            if ((value5 = weakHashMap.get((Object)xyo)) == null) {
                                value5 = new URLSpan(xyo.a());
                                weakHashMap.put((Object)xyo, value5);
                            }
                            ((SpannableString)charSequence).setSpan((Object)value5, b4, c4, 33);
                        }
                        final List b5 = og0.b(w.length());
                        for (int size7 = ((Collection)b5).size(), n11 = 0; n11 < size7; ++n11) {
                            final ng0 ng6 = (ng0)b5.get(n11);
                            final int b6 = ng6.b;
                            final Object a12 = ng6.a;
                            final int c5 = ng6.c;
                            if (b6 != c5) {
                                final vdd vdd = (vdd)a12;
                                if (vdd instanceof udd && ((udd)vdd).c == null) {
                                    a12.getClass();
                                    final udd udd = (udd)a12;
                                    final ng0 ng7 = new ng0(b6, c5, udd);
                                    final WeakHashMap weakHashMap2 = (WeakHashMap)a5.x;
                                    Object value6;
                                    if ((value6 = weakHashMap2.get((Object)ng7)) == null) {
                                        value6 = new URLSpan(udd.a);
                                        weakHashMap2.put((Object)ng7, value6);
                                    }
                                    ((SpannableString)charSequence).setSpan((Object)value6, b6, c5, 33);
                                }
                                else {
                                    final WeakHashMap weakHashMap3 = (WeakHashMap)a5.y;
                                    Object value7;
                                    if ((value7 = weakHashMap3.get((Object)ng6)) == null) {
                                        value7 = new gh6(vdd);
                                        weakHashMap3.put((Object)ng6, value7);
                                    }
                                    ((SpannableString)charSequence).setSpan((Object)value7, b6, c5, 33);
                                }
                            }
                        }
                        text = f50.P(charSequence);
                        accessibilityNodeInfo2 = a4;
                        zsk3 = zsk2;
                    }
                    else {
                        final zsk zsk4 = a;
                        final iuj iuj4 = iuj;
                        final tsk tsk3 = d;
                        final CharSequence charSequence2 = null;
                        accessibilityNodeInfo2 = a4;
                        iuj3 = iuj4;
                        tsk2 = tsk3;
                        zsk3 = zsk4;
                        text = charSequence2;
                    }
                    accessibilityNodeInfo2.setText((CharSequence)text);
                    final htk o2 = etk.O;
                    if (v.c((Object)o2)) {
                        obtain.setContentInvalid(true);
                        Object g4;
                        if ((g4 = v.g((Object)o2)) == null) {
                            g4 = null;
                        }
                        obtain.setError((CharSequence)g4);
                    }
                    final String x8 = twl.x(zsk3, resources);
                    if (Build$VERSION.SDK_INT >= 30) {
                        r4.h(accessibilityNodeInfo2, (CharSequence)x8);
                    }
                    else {
                        accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", (CharSequence)x8);
                    }
                    obtain.setCheckable(twl.w(zsk3));
                    Object g5;
                    if ((g5 = v.g((Object)etk.L)) == null) {
                        g5 = null;
                    }
                    final c1o c1o = (c1o)g5;
                    if (c1o != null) {
                        if (c1o == c1o.v) {
                            accessibilityNodeInfo2.setChecked(true);
                        }
                        else if (c1o == c1o.w) {
                            accessibilityNodeInfo2.setChecked(false);
                        }
                    }
                    Object g6;
                    if ((g6 = v.g((Object)etk.K)) == null) {
                        g6 = null;
                    }
                    final Boolean b7 = (Boolean)g6;
                    Label_2700: {
                        if (b7 != null) {
                            final boolean booleanValue = b7;
                            if (iuj3 != null) {
                                if (iuj3.a == 4) {
                                    obtain.setSelected(booleanValue);
                                    break Label_2700;
                                }
                            }
                            accessibilityNodeInfo2.setChecked(booleanValue);
                        }
                    }
                    if (!tsk2.x || zsk.j(4, zsk3).isEmpty()) {
                        Object g7;
                        if ((g7 = v.g((Object)etk.a)) == null) {
                            g7 = null;
                        }
                        final List list3 = (List)g7;
                        Object contentDescription;
                        if (list3 != null) {
                            contentDescription = c86.I0(list3);
                        }
                        else {
                            contentDescription = null;
                        }
                        obtain.setContentDescription((CharSequence)contentDescription);
                    }
                    Object g8;
                    if ((g8 = v.g((Object)etk.A)) == null) {
                        g8 = null;
                    }
                    final String viewIdResourceName = (String)g8;
                    Label_2896: {
                        if (viewIdResourceName != null) {
                            zsk l3 = zsk3;
                            while (true) {
                                while (l3 != null) {
                                    final tsk d3 = l3.d;
                                    final htk k3 = soh.k;
                                    if (d3.v.c((Object)k3)) {
                                        final boolean booleanValue2 = (boolean)d3.f(k3);
                                        if (booleanValue2) {
                                            obtain.setViewIdResourceName(viewIdResourceName);
                                        }
                                        break Label_2896;
                                    }
                                    else {
                                        l3 = l3.l();
                                    }
                                }
                                final boolean booleanValue2 = false;
                                continue;
                            }
                        }
                    }
                    Object g9;
                    if ((g9 = v.g((Object)etk.h)) == null) {
                        g9 = null;
                    }
                    if (g9 != null) {
                        if (Build$VERSION.SDK_INT >= 28) {
                            l4.r(accessibilityNodeInfo2, true);
                        }
                        else {
                            x5.g(2, true);
                        }
                    }
                    if (twl.A(tsk2, etk.i) != null) {
                        if (Build$VERSION.SDK_INT >= 29) {
                            d4.t(obtain);
                        }
                        else {
                            x5.g(8, true);
                        }
                    }
                    if (n != -1) {
                        final int d4 = e0.d(zsk3.f);
                        if (d4 != -1) {
                            obtain.setDrawingOrder(d4);
                        }
                        else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    obtain.setPassword(v.c((Object)etk.N));
                    final Object a13 = twl.A(tsk2, etk.Q);
                    final Boolean booleanTrue = Boolean.TRUE;
                    obtain.setEditable(mlc.q(a13, (Object)true));
                    final Integer n12 = (Integer)twl.A(tsk2, etk.R);
                    int intValue2;
                    if (n12 != null) {
                        intValue2 = n12;
                    }
                    else {
                        intValue2 = -1;
                    }
                    obtain.setMaxTextLength(intValue2);
                    obtain.setEnabled(twl.q(zsk3));
                    final htk l4 = etk.l;
                    obtain.setFocusable(v.c((Object)l4));
                    if (obtain.isFocusable()) {
                        obtain.setFocused((boolean)tsk2.f(l4));
                        if (obtain.isFocused()) {
                            x5.a(2);
                            z.G = n;
                        }
                        else {
                            x5.a(1);
                        }
                    }
                    final f50 f5 = z;
                    accessibilityNodeInfo2.setVisibleToUser(ach.Q(zsk3) ^ true);
                    zsk l5;
                    if (zsk3.n()) {
                        l5 = zsk3.l();
                        l5.getClass();
                    }
                    else {
                        l5 = zsk3;
                    }
                    if (l5.m().j()) {
                        accessibilityNodeInfo2.setVisibleToUser(false);
                    }
                    final emd emd = (emd)twl.A(tsk2, etk.k);
                    if (emd != null) {
                        final int c6 = emd.c();
                        int liveRegion;
                        if (!emd.b(c6, 0) && emd.b(c6, 1)) {
                            liveRegion = 2;
                        }
                        else {
                            liveRegion = 1;
                        }
                        obtain.setLiveRegion(liveRegion);
                    }
                    accessibilityNodeInfo2.setClickable(false);
                    final t3 t3 = (t3)twl.A(tsk2, rsk.b);
                    if (t3 != null) {
                        final boolean q3 = mlc.q(twl.A(tsk2, etk.K), (Object)true);
                        boolean b8 = false;
                        Label_3408: {
                            Label_3399: {
                                if (iuj3 != null) {
                                    if (iuj3.a == 4) {
                                        break Label_3399;
                                    }
                                }
                                if (iuj3 != null) {
                                    if (iuj3.a == 3) {
                                        break Label_3399;
                                    }
                                }
                                b8 = false;
                                break Label_3408;
                            }
                            b8 = true;
                        }
                        accessibilityNodeInfo2.setClickable(!b8 || (b8 && !q3));
                        if (twl.q(zsk3) && obtain.isClickable()) {
                            x5.b(new q4(16, t3.a));
                        }
                    }
                    accessibilityNodeInfo2.setLongClickable(false);
                    final t3 t4 = (t3)twl.A(tsk2, rsk.c);
                    if (t4 != null) {
                        accessibilityNodeInfo2.setLongClickable(true);
                        if (twl.q(zsk3)) {
                            x5.b(new q4(32, t4.a));
                        }
                    }
                    final t3 t5 = (t3)twl.A(tsk2, rsk.q);
                    if (t5 != null) {
                        x5.b(new q4(16384, t5.a));
                    }
                    if (twl.q(zsk3)) {
                        final t3 t6 = (t3)twl.A(tsk2, rsk.k);
                        if (t6 != null) {
                            x5.b(new q4(2097152, t6.a));
                        }
                        final t3 t7 = (t3)twl.A(tsk2, rsk.p);
                        if (t7 != null) {
                            x5.b(new q4(16908372, t7.a));
                        }
                        final t3 t8 = (t3)twl.A(tsk2, rsk.r);
                        if (t8 != null) {
                            x5.b(new q4(65536, t8.a));
                        }
                        final t3 t9 = (t3)twl.A(tsk2, rsk.s);
                        if (t9 != null && obtain.isFocused()) {
                            final ClipDescription primaryClipDescription = ((jmq)y.getClipboardManager()).x().getPrimaryClipDescription();
                            if (primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*")) {
                                x5.b(new q4(32768, t9.a));
                            }
                        }
                    }
                    final String t10 = f50.t(zsk3);
                    Label_4113: {
                        if (t10 != null) {
                            if (t10.length() != 0) {
                                obtain.setTextSelection(f5.r(zsk3), f5.q(zsk3));
                                final t3 t11 = (t3)twl.A(tsk2, rsk.j);
                                String a14;
                                if (t11 != null) {
                                    a14 = t11.a;
                                }
                                else {
                                    a14 = null;
                                }
                                x5.b(new q4(131072, a14));
                                x5.a(256);
                                x5.a(512);
                                accessibilityNodeInfo2.setMovementGranularities(11);
                                final List list4 = (List)twl.A(tsk2, etk.a);
                                if ((list4 == null || ((Collection)list4).isEmpty()) && v.c((Object)rsk.a)) {
                                    if (!v.c((Object)etk.G) || mlc.q(twl.A(tsk2, l4), (Object)true)) {
                                        while (true) {
                                            for (LayoutNode layoutNode = c.G(); layoutNode != null; layoutNode = layoutNode.G()) {
                                                final tsk i2 = layoutNode.I();
                                                if (i2 != null && i2.x && i2.v.c((Object)etk.G)) {
                                                    if (layoutNode != null) {
                                                        final tsk i3 = layoutNode.I();
                                                        boolean q4;
                                                        if (i3 != null) {
                                                            Object g10;
                                                            if ((g10 = i3.v.g((Object)etk.l)) == null) {
                                                                g10 = null;
                                                            }
                                                            q4 = mlc.q(g10, (Object)Boolean.TRUE);
                                                        }
                                                        else {
                                                            q4 = false;
                                                        }
                                                        if (!q4) {
                                                            break Label_4113;
                                                        }
                                                    }
                                                    accessibilityNodeInfo2.setMovementGranularities(obtain.getMovementGranularities() | 0x14);
                                                    break Label_4113;
                                                }
                                            }
                                            LayoutNode layoutNode = null;
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final ArrayList v4 = ge9.v("androidx.compose.ui.semantics.id");
                    final CharSequence f6 = x5.f();
                    if (f6 != null) {
                        if (f6.length() != 0) {
                            if (v.c((Object)rsk.a)) {
                                v4.add((Object)"android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                        }
                    }
                    if (v.c((Object)etk.A)) {
                        v4.add((Object)"androidx.compose.ui.semantics.testTag");
                    }
                    if (v.c((Object)etk.S)) {
                        v4.add((Object)"androidx.compose.ui.semantics.shapeType");
                        v4.add((Object)"androidx.compose.ui.semantics.shapeRect");
                        v4.add((Object)"androidx.compose.ui.semantics.shapeCorners");
                        v4.add((Object)"androidx.compose.ui.semantics.shapeRegion");
                    }
                    obtain.setAvailableExtraData((List)v4);
                    final xth xth = (xth)twl.A(tsk2, etk.c);
                    if (xth != null) {
                        final float a15 = xth.a;
                        final u55 b9 = xth.b;
                        final htk i4 = rsk.i;
                        if (v.c((Object)i4)) {
                            x5.h("android.widget.SeekBar");
                        }
                        else {
                            x5.h("android.widget.ProgressBar");
                        }
                        if (xth != xth.d) {
                            obtain.setRangeInfo((AccessibilityNodeInfo$RangeInfo)bgq.E(((Number)b9.d()).floatValue(), ((Number)b9.f()).floatValue(), a15).v);
                        }
                        if (v.c((Object)i4) && twl.q(zsk3)) {
                            final float floatValue = ((Number)b9.f()).floatValue();
                            final float floatValue2 = ((Number)b9.d()).floatValue();
                            float n13 = floatValue;
                            if (floatValue < floatValue2) {
                                n13 = floatValue2;
                            }
                            if (a15 < n13) {
                                x5.b(q4.e);
                            }
                            final float floatValue3 = ((Number)b9.d()).floatValue();
                            final float floatValue4 = ((Number)b9.f()).floatValue();
                            float n14 = floatValue3;
                            if (floatValue3 > floatValue4) {
                                n14 = floatValue4;
                            }
                            if (a15 > n14) {
                                x5.b(q4.f);
                            }
                        }
                    }
                    if (twl.q(zsk3)) {
                        final t3 t12 = (t3)twl.A(tsk2, rsk.i);
                        if (t12 != null) {
                            x5.b(new q4(16908349, t12.a));
                        }
                    }
                    vt4.c0(x5, zsk3);
                    vt4.d0(x5, zsk3);
                    final dfk dfk = (dfk)twl.A(tsk2, etk.v);
                    final t3 t13 = (t3)twl.A(tsk2, rsk.d);
                    if (dfk != null && t13 != null) {
                        Object g11;
                        if ((g11 = zsk3.k().v.g((Object)etk.f)) == null) {
                            g11 = null;
                        }
                        if (g11 == null) {
                            Object g12;
                            if ((g12 = zsk3.k().v.g((Object)etk.e)) == null) {
                                g12 = null;
                            }
                            if (g12 == null) {
                                x5.h("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number)dfk.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo2.setScrollable(true);
                        }
                        if (twl.q(zsk3)) {
                            final boolean z2 = f50.z(dfk);
                            final qzc w2 = qzc.w;
                            if (z2) {
                                x5.b(q4.e);
                                q4 q5;
                                if (c.V == w2) {
                                    q5 = q4.h;
                                }
                                else {
                                    q5 = q4.j;
                                }
                                x5.b(q5);
                            }
                            if (f50.y(dfk)) {
                                x5.b(q4.f);
                                q4 q6;
                                if (c.V == w2) {
                                    q6 = q4.j;
                                }
                                else {
                                    q6 = q4.h;
                                }
                                x5.b(q6);
                            }
                        }
                    }
                    final dfk dfk2 = (dfk)twl.A(tsk2, etk.w);
                    if (dfk2 != null && t13 != null) {
                        Object g13;
                        if ((g13 = zsk3.k().v.g((Object)etk.f)) == null) {
                            g13 = null;
                        }
                        if (g13 == null) {
                            Object g14;
                            if ((g14 = zsk3.k().v.g((Object)etk.e)) == null) {
                                g14 = null;
                            }
                            if (g14 == null) {
                                x5.h("android.widget.ScrollView");
                            }
                        }
                        if (((Number)dfk2.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo2.setScrollable(true);
                        }
                        if (twl.q(zsk3)) {
                            if (f50.z(dfk2)) {
                                x5.b(q4.e);
                                x5.b(q4.i);
                            }
                            if (f50.y(dfk2)) {
                                x5.b(q4.f);
                                x5.b(q4.g);
                            }
                        }
                    }
                    final int sdk_INT2 = Build$VERSION.SDK_INT;
                    if (sdk_INT2 >= 29) {
                        r6k.d(x5, zsk3);
                    }
                    final CharSequence charSequence3 = (CharSequence)twl.A(tsk2, etk.d);
                    if (sdk_INT2 >= 28) {
                        k4.m(accessibilityNodeInfo2, charSequence3);
                    }
                    else {
                        accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence3);
                    }
                    if (twl.q(zsk3)) {
                        final t3 t14 = (t3)twl.A(tsk2, rsk.t);
                        if (t14 != null) {
                            x5.b(new q4(262144, t14.a));
                        }
                        final t3 t15 = (t3)twl.A(tsk2, rsk.u);
                        if (t15 != null) {
                            x5.b(new q4(524288, t15.a));
                        }
                        final t3 t16 = (t3)twl.A(tsk2, rsk.v);
                        if (t16 != null) {
                            x5.b(new q4(1048576, t16.a));
                        }
                        final htk x9 = rsk.x;
                        if (v.c((Object)x9)) {
                            final List list5 = (List)tsk2.f(x9);
                            final int size8 = list5.size();
                            final int b10 = i0.b;
                            if (size8 >= b10) {
                                en9.q(oz1.n("Can't have more than ", b10, " custom actions for one widget"));
                                return null;
                            }
                            int n15 = 0;
                            final wcm wcm = new wcm(0);
                            final amf a16 = i4g.a();
                            if (o50.o(n2.x, n, n2.v) >= 0) {
                                final amf amf = (amf)k1r.e(n2, n);
                                final ilf ilf = new ilf();
                                final int[] a17 = i0.a;
                                while (n15 < i0.b) {
                                    ilf.a(a17[n15]);
                                    ++n15;
                                }
                                final ArrayList list6 = new ArrayList();
                            Label_5562:
                                for (int size9 = ((Collection)list5).size(), n16 = 0; n16 < size9; ++n16) {
                                    final qr7 qr7 = (qr7)list5.get(n16);
                                    amf.getClass();
                                    final String a18 = qr7.a;
                                    if (amf.d((Object)a18) >= 0) {
                                        final int d5 = amf.d((Object)a18);
                                        if (d5 >= 0) {
                                            final int n17 = amf.c[d5];
                                            wcm.c(n17, (Object)a18);
                                            a16.g(n17, (Object)a18);
                                            final int[] a19 = ilf.a;
                                            while (true) {
                                                for (int b11 = ilf.b, n18 = 0; n18 < b11; ++n18) {
                                                    if (n17 == a19[n18]) {
                                                        if (n18 >= 0) {
                                                            ilf.e(n18);
                                                        }
                                                        x5.b(new q4(n17, a18));
                                                        continue Label_5562;
                                                    }
                                                }
                                                int n18 = -1;
                                                continue;
                                            }
                                        }
                                        final StringBuilder sb2 = new StringBuilder("There is no key ");
                                        sb2.append((Object)a18);
                                        sb2.append(" in the map");
                                        qiq.u(sb2.toString());
                                        throw null;
                                    }
                                    else {
                                        list6.add((Object)qr7);
                                    }
                                }
                                final tsk tsk4 = tsk2;
                                final int size10 = list6.size();
                                int n19 = 0;
                                while (true) {
                                    tsk2 = tsk4;
                                    if (n19 >= size10) {
                                        break;
                                    }
                                    final qr7 qr8 = (qr7)list6.get(n19);
                                    final int c7 = ilf.c(n19);
                                    final String a20 = qr8.a;
                                    wcm.c(c7, (Object)a20);
                                    a16.g(c7, (Object)a20);
                                    x5.b(new q4(c7, a20));
                                    ++n19;
                                }
                            }
                            else {
                                final tsk tsk5 = tsk2;
                                final int size11 = ((Collection)list5).size();
                                int n20 = 0;
                                while (true) {
                                    tsk2 = tsk5;
                                    if (n20 >= size11) {
                                        break;
                                    }
                                    final qr7 qr9 = (qr7)list5.get(n20);
                                    final int c8 = i0.c(n20);
                                    final String a21 = qr9.a;
                                    wcm.c(c8, (Object)a21);
                                    a16.g(c8, (Object)a21);
                                    x5.b(new q4(c8, a21));
                                    ++n20;
                                }
                            }
                            f5.M.c(n, (Object)wcm);
                            n2.c(n, (Object)a16);
                        }
                    }
                    final boolean i5 = twl.I(zsk3, resources);
                    if (Build$VERSION.SDK_INT >= 28) {
                        k4.n(accessibilityNodeInfo2, i5);
                    }
                    else {
                        x5.g(1, i5);
                    }
                    final int d6 = f5.W.d(n);
                    if (d6 != -1) {
                        final uc0 c9 = omo.c0(y.getAndroidViewsHandler$ui(), d6);
                        if (c9 != null) {
                            accessibilityNodeInfo2.setTraversalBefore((View)c9);
                        }
                        else {
                            accessibilityNodeInfo2.setTraversalBefore((View)y, d6);
                        }
                        f5.j(n, x5, f5.Y, null);
                    }
                    final int d7 = f5.X.d(n);
                    if (d7 != -1) {
                        final uc0 c10 = omo.c0(y.getAndroidViewsHandler$ui(), d7);
                        if (c10 != null) {
                            accessibilityNodeInfo2.setTraversalAfter((View)c10);
                            f5.j(n, x5, f5.Z, null);
                        }
                    }
                    final String s2 = (String)twl.A(tsk2, soh.l);
                    if (s2 != null) {
                        x5.h(s2);
                    }
                    x4 = x5;
                    break Label_0073;
                }
            }
            x4 = null;
        }
        if (z.J) {
            if (n == z.F) {
                z.H = x4;
            }
            if (n == z.G) {
                z.I = x4;
            }
        }
        return x4;
    }
    
    public final x4 r(int g) {
        final f50 z = this.z;
        if (g != 1) {
            if (g == 2) {
                return this.o(z.F);
            }
            en9.s(smk.p(g, "Unknown focus type: "));
            return null;
        }
        else {
            g = z.G;
            if (g == Integer.MIN_VALUE) {
                return null;
            }
            return this.o(g);
        }
    }
    
    public final boolean y(int i, int n, final Bundle bundle) {
        final f50 z = this.z;
        final AccessibilityManager b = z.B;
        final Float value = 0.0f;
        final AndroidComposeView y = z.y;
        final btk btk = (btk)z.s().b(i);
        Label_0057: {
            if (btk != null) {
                final zsk a = btk.a;
                if (a != null) {
                    final LayoutNode c = a.c;
                    final int f = a.f;
                    final tsk d = a.d;
                    final tmf v = d.v;
                    Object g;
                    if ((g = v.g((Object)etk.o)) == null) {
                        g = null;
                    }
                    final Boolean booleanTrue = Boolean.TRUE;
                    if (!mlc.q(g, (Object)true) || Build$VERSION.SDK_INT < 34 || j4.e(b)) {
                        if (n != 64) {
                            if (n != 128) {
                                final int n2 = -1;
                                if (n != 256 && n != 512) {
                                    if (n != 16384) {
                                        if (n == 131072) {
                                            if (bundle != null) {
                                                i = ((BaseBundle)bundle).getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                            }
                                            else {
                                                i = -1;
                                            }
                                            n = n2;
                                            if (bundle != null) {
                                                n = ((BaseBundle)bundle).getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1);
                                            }
                                            final boolean k = z.K(a, i, n, false);
                                            if (k) {
                                                f50.E(z, z.A(f), 0, null, 12);
                                            }
                                            return k;
                                        }
                                        if (twl.q(a)) {
                                            if (n != 1) {
                                                if (n != 2) {
                                                    final qzc w = qzc.w;
                                                    Label_0747: {
                                                        switch (n) {
                                                            default: {
                                                                switch (n) {
                                                                    default: {
                                                                        switch (n) {
                                                                            default: {
                                                                                final wcm m = z.M;
                                                                                m.getClass();
                                                                                final wcm wcm = (wcm)k1r.e(m, i);
                                                                                if (wcm == null) {
                                                                                    break Label_0057;
                                                                                }
                                                                                final CharSequence charSequence = (CharSequence)k1r.e(wcm, n);
                                                                                if (charSequence == null) {
                                                                                    break Label_0057;
                                                                                }
                                                                                Object g2 = v.g((Object)rsk.x);
                                                                                if (g2 == null) {
                                                                                    g2 = null;
                                                                                }
                                                                                final List list = (List)g2;
                                                                                if (list == null) {
                                                                                    break Label_0057;
                                                                                }
                                                                                qr7 qr7;
                                                                                for (n = ((Collection)list).size(), i = 0; i < n; ++i) {
                                                                                    qr7 = (qr7)list.get(i);
                                                                                    if (mlc.q((Object)qr7.a, (Object)charSequence)) {
                                                                                        return (boolean)qr7.b.a();
                                                                                    }
                                                                                }
                                                                                break Label_0057;
                                                                            }
                                                                            case 16908361: {
                                                                                Object g3 = v.g((Object)rsk.B);
                                                                                if (g3 == null) {
                                                                                    g3 = null;
                                                                                }
                                                                                final t3 t3 = (t3)g3;
                                                                                if (t3 == null) {
                                                                                    break Label_0057;
                                                                                }
                                                                                final jta jta = (jta)t3.b;
                                                                                if (jta != null) {
                                                                                    return (boolean)jta.a();
                                                                                }
                                                                                break Label_0057;
                                                                            }
                                                                            case 16908360: {
                                                                                Object g4 = v.g((Object)rsk.z);
                                                                                if (g4 == null) {
                                                                                    g4 = null;
                                                                                }
                                                                                final t3 t4 = (t3)g4;
                                                                                if (t4 == null) {
                                                                                    break Label_0057;
                                                                                }
                                                                                final jta jta2 = (jta)t4.b;
                                                                                if (jta2 != null) {
                                                                                    return (boolean)jta2.a();
                                                                                }
                                                                                break Label_0057;
                                                                            }
                                                                            case 16908359: {
                                                                                Object g5 = v.g((Object)rsk.A);
                                                                                if (g5 == null) {
                                                                                    g5 = null;
                                                                                }
                                                                                final t3 t5 = (t3)g5;
                                                                                if (t5 == null) {
                                                                                    break Label_0057;
                                                                                }
                                                                                final jta jta3 = (jta)t5.b;
                                                                                if (jta3 != null) {
                                                                                    return (boolean)jta3.a();
                                                                                }
                                                                                break Label_0057;
                                                                            }
                                                                            case 16908358: {
                                                                                Object g6 = v.g((Object)rsk.y);
                                                                                if (g6 == null) {
                                                                                    g6 = null;
                                                                                }
                                                                                final t3 t6 = (t3)g6;
                                                                                if (t6 == null) {
                                                                                    break Label_0057;
                                                                                }
                                                                                final jta jta4 = (jta)t6.b;
                                                                                if (jta4 != null) {
                                                                                    return (boolean)jta4.a();
                                                                                }
                                                                                break Label_0057;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 16908344:
                                                                    case 16908345:
                                                                    case 16908346:
                                                                    case 16908347: {
                                                                        break Label_0747;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 4096:
                                                            case 8192: {
                                                                if (n == 4096) {
                                                                    i = 1;
                                                                }
                                                                else {
                                                                    i = 0;
                                                                }
                                                                final boolean b2 = n == 8192;
                                                                final boolean b3 = n == 16908345;
                                                                final boolean b4 = n == 16908347;
                                                                final boolean b5 = n == 16908344;
                                                                final boolean b6 = n == 16908346;
                                                                if (!b3 && !b4 && i == 0 && !b2) {
                                                                    n = 0;
                                                                }
                                                                else {
                                                                    n = 1;
                                                                }
                                                                final boolean b7 = b5 || b6 || i != 0 || b2;
                                                                if (i != 0 || b2) {
                                                                    Object g7;
                                                                    if ((g7 = v.g((Object)etk.c)) == null) {
                                                                        g7 = null;
                                                                    }
                                                                    final xth xth = (xth)g7;
                                                                    Object g8;
                                                                    if ((g8 = v.g((Object)rsk.i)) == null) {
                                                                        g8 = null;
                                                                    }
                                                                    final t3 t7 = (t3)g8;
                                                                    if (xth != null) {
                                                                        final u55 b8 = xth.b;
                                                                        if (t7 != null) {
                                                                            final float w2 = b8.w;
                                                                            final float v2 = b8.v;
                                                                            final float floatValue = ((Number)Float.valueOf(w2)).floatValue();
                                                                            final float floatValue2 = ((Number)Float.valueOf(v2)).floatValue();
                                                                            float n3 = floatValue;
                                                                            if (floatValue < floatValue2) {
                                                                                n3 = floatValue2;
                                                                            }
                                                                            final float floatValue3 = ((Number)Float.valueOf(v2)).floatValue();
                                                                            final float floatValue4 = ((Number)Float.valueOf(b8.w)).floatValue();
                                                                            float n4 = floatValue3;
                                                                            if (floatValue3 > floatValue4) {
                                                                                n4 = floatValue4;
                                                                            }
                                                                            i = xth.c;
                                                                            float n5;
                                                                            float n6;
                                                                            if (i > 0) {
                                                                                n5 = n3 - n4;
                                                                                n6 = (float)(i + 1);
                                                                            }
                                                                            else {
                                                                                n5 = n3 - n4;
                                                                                n6 = 20.0f;
                                                                            }
                                                                            float n7 = n5 / n6;
                                                                            if (b2) {
                                                                                n7 = -n7;
                                                                            }
                                                                            final lta lta = (lta)t7.b;
                                                                            if (lta != null) {
                                                                                return (boolean)lta.b((Object)(xth.a + n7));
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                final long g9 = r9n.f((nzc)c.Z.y).g();
                                                                final ArrayList list2 = new ArrayList();
                                                                Object g10;
                                                                if ((g10 = v.g((Object)rsk.C)) == null) {
                                                                    g10 = null;
                                                                }
                                                                final t3 t8 = (t3)g10;
                                                                Float n8 = null;
                                                                Label_2640: {
                                                                    if (t8 != null) {
                                                                        final lta lta2 = (lta)t8.b;
                                                                        if (lta2 != null && (boolean)lta2.b((Object)list2)) {
                                                                            n8 = (Float)list2.get(0);
                                                                            break Label_2640;
                                                                        }
                                                                    }
                                                                    n8 = null;
                                                                }
                                                                Object g11;
                                                                if ((g11 = v.g((Object)rsk.d)) == null) {
                                                                    g11 = null;
                                                                }
                                                                final t3 t9 = (t3)g11;
                                                                if (t9 == null) {
                                                                    break;
                                                                }
                                                                final aua b9 = t9.b;
                                                                Object g12;
                                                                if ((g12 = v.g((Object)etk.v)) == null) {
                                                                    g12 = null;
                                                                }
                                                                final dfk dfk = (dfk)g12;
                                                                if (dfk != null && n != 0) {
                                                                    float n9;
                                                                    if (n8 != null) {
                                                                        n9 = n8;
                                                                    }
                                                                    else {
                                                                        n9 = Float.intBitsToFloat((int)(g9 >> 32));
                                                                    }
                                                                    float n10 = 0.0f;
                                                                    Label_2765: {
                                                                        if (!b3) {
                                                                            n10 = n9;
                                                                            if (!b2) {
                                                                                break Label_2765;
                                                                            }
                                                                        }
                                                                        n10 = -n9;
                                                                    }
                                                                    float n11 = n10;
                                                                    if (dfk.c) {
                                                                        n11 = -n10;
                                                                    }
                                                                    float n12 = n11;
                                                                    Label_2815: {
                                                                        if (c.V == w) {
                                                                            if (!b3) {
                                                                                n12 = n11;
                                                                                if (!b4) {
                                                                                    break Label_2815;
                                                                                }
                                                                            }
                                                                            n12 = -n11;
                                                                        }
                                                                    }
                                                                    if (f50.x(dfk, n12)) {
                                                                        final htk z2 = rsk.z;
                                                                        if (!v.c((Object)z2) && !v.c((Object)rsk.B)) {
                                                                            final zta zta = (zta)b9;
                                                                            if (zta != null) {
                                                                                return (boolean)zta.d((Object)n12, (Object)value);
                                                                            }
                                                                            break;
                                                                        }
                                                                        else {
                                                                            t3 t10;
                                                                            if (n12 > 0.0f) {
                                                                                Object g13 = v.g((Object)rsk.B);
                                                                                if (g13 == null) {
                                                                                    g13 = null;
                                                                                }
                                                                                t10 = (t3)g13;
                                                                            }
                                                                            else {
                                                                                Object g14 = v.g((Object)z2);
                                                                                if (g14 == null) {
                                                                                    g14 = null;
                                                                                }
                                                                                t10 = (t3)g14;
                                                                            }
                                                                            if (t10 == null) {
                                                                                break;
                                                                            }
                                                                            final jta jta5 = (jta)t10.b;
                                                                            if (jta5 != null) {
                                                                                return (boolean)jta5.a();
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                Object g15;
                                                                if ((g15 = v.g((Object)etk.w)) == null) {
                                                                    g15 = null;
                                                                }
                                                                final dfk dfk2 = (dfk)g15;
                                                                if (dfk2 == null || !b7) {
                                                                    break;
                                                                }
                                                                float n13;
                                                                if (n8 != null) {
                                                                    n13 = n8;
                                                                }
                                                                else {
                                                                    n13 = Float.intBitsToFloat((int)(g9 & 0xFFFFFFFFL));
                                                                }
                                                                float n14 = 0.0f;
                                                                Label_3048: {
                                                                    if (!b5) {
                                                                        n14 = n13;
                                                                        if (!b2) {
                                                                            break Label_3048;
                                                                        }
                                                                    }
                                                                    n14 = -n13;
                                                                }
                                                                float n15 = n14;
                                                                if (dfk2.c) {
                                                                    n15 = -n14;
                                                                }
                                                                if (!f50.x(dfk2, n15)) {
                                                                    break;
                                                                }
                                                                final htk y2 = rsk.y;
                                                                if (!v.c((Object)y2) && !v.c((Object)rsk.A)) {
                                                                    final zta zta2 = (zta)b9;
                                                                    if (zta2 != null) {
                                                                        return (boolean)zta2.d((Object)value, (Object)n15);
                                                                    }
                                                                    break;
                                                                }
                                                                else {
                                                                    t3 t11;
                                                                    if (n15 > 0.0f) {
                                                                        Object g16 = v.g((Object)rsk.A);
                                                                        if (g16 == null) {
                                                                            g16 = null;
                                                                        }
                                                                        t11 = (t3)g16;
                                                                    }
                                                                    else {
                                                                        Object g17 = v.g((Object)y2);
                                                                        if (g17 == null) {
                                                                            g17 = null;
                                                                        }
                                                                        t11 = (t3)g17;
                                                                    }
                                                                    if (t11 == null) {
                                                                        break;
                                                                    }
                                                                    final jta jta6 = (jta)t11.b;
                                                                    if (jta6 != null) {
                                                                        return (boolean)jta6.a();
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            case 16908372: {
                                                                Object g18 = v.g((Object)rsk.p);
                                                                if (g18 == null) {
                                                                    g18 = null;
                                                                }
                                                                final t3 t12 = (t3)g18;
                                                                if (t12 == null) {
                                                                    break;
                                                                }
                                                                final jta jta7 = (jta)t12.b;
                                                                if (jta7 != null) {
                                                                    return (boolean)jta7.a();
                                                                }
                                                                break;
                                                            }
                                                            case 16908349: {
                                                                if (bundle == null) {
                                                                    break;
                                                                }
                                                                if (!((BaseBundle)bundle).containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                                    break;
                                                                }
                                                                Object g19 = v.g((Object)rsk.i);
                                                                if (g19 == null) {
                                                                    g19 = null;
                                                                }
                                                                final t3 t13 = (t3)g19;
                                                                if (t13 == null) {
                                                                    break;
                                                                }
                                                                final lta lta3 = (lta)t13.b;
                                                                if (lta3 != null) {
                                                                    return (boolean)lta3.b((Object)bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
                                                                }
                                                                break;
                                                            }
                                                            case 16908342: {
                                                                zsk zsk2;
                                                                final zsk zsk = zsk2 = a.l();
                                                                while (true) {
                                                                    Label_0954: {
                                                                        if (zsk == null) {
                                                                            break Label_0954;
                                                                        }
                                                                        Object g20;
                                                                        if ((g20 = zsk.d.v.g((Object)rsk.d)) == null) {
                                                                            g20 = null;
                                                                        }
                                                                        final t3 t14 = (t3)g20;
                                                                        zsk2 = zsk;
                                                                        t3 t15 = t14;
                                                                        while (t15 == null && zsk2 != null) {
                                                                            final zsk l = zsk2.l();
                                                                            if ((zsk2 = l) == null) {
                                                                                break Label_0954;
                                                                            }
                                                                            Object g21;
                                                                            if ((g21 = l.d.v.g((Object)rsk.d)) == null) {
                                                                                g21 = null;
                                                                            }
                                                                            final t3 t16 = (t3)g21;
                                                                            zsk2 = l;
                                                                            t15 = t16;
                                                                        }
                                                                        if (zsk2 == null) {
                                                                            final k2j g22 = a.g();
                                                                            return ((View)y).requestRectangleOnScreen(new Rect((int)(float)Math.floor((double)g22.a), (int)(float)Math.floor((double)g22.b), k8e.H((float)Math.ceil((double)g22.c)), k8e.H((float)Math.ceil((double)g22.d))));
                                                                        }
                                                                        long h = 0L;
                                                                        boolean b10 = false;
                                                                        while (zsk2 != null) {
                                                                            final LayoutNode c2 = zsk2.c;
                                                                            final tmf v3 = zsk2.d.v;
                                                                            Object g23;
                                                                            if ((g23 = v3.g((Object)rsk.d)) == null) {
                                                                                g23 = null;
                                                                            }
                                                                            final t3 t17 = (t3)g23;
                                                                            if (t17 != null) {
                                                                                final k2j f2 = r9n.f((nzc)c2.Z.y);
                                                                                final nzc d2 = ((yxf)c2.Z.y).D();
                                                                                long n16;
                                                                                if (d2 != null) {
                                                                                    n16 = ((yxf)d2).N(0L);
                                                                                }
                                                                                else {
                                                                                    n16 = 0L;
                                                                                }
                                                                                final k2j j = f2.m(n16);
                                                                                yxf d3 = a.d();
                                                                                long n17 = 0L;
                                                                                Label_1268: {
                                                                                    if (d3 != null) {
                                                                                        if (!d3.h1().I) {
                                                                                            d3 = null;
                                                                                        }
                                                                                        if (d3 != null) {
                                                                                            n17 = d3.N(0L);
                                                                                            break Label_1268;
                                                                                        }
                                                                                    }
                                                                                    n17 = 0L;
                                                                                }
                                                                                final long i2 = l6g.i(n17, h);
                                                                                final yxf d4 = a.d();
                                                                                long x;
                                                                                if (d4 != null) {
                                                                                    x = ((o8h)d4).x;
                                                                                }
                                                                                else {
                                                                                    x = 0L;
                                                                                }
                                                                                final k2j f3 = rml.f(i2, uoo.Z(x));
                                                                                float n18 = f3.a - j.a;
                                                                                final float n19 = f3.c - j.c;
                                                                                if (Math.signum(n18) == Math.signum(n19)) {
                                                                                    if (Math.abs(n18) >= Math.abs(n19)) {
                                                                                        n18 = n19;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    n18 = 0.0f;
                                                                                }
                                                                                float n20 = f3.b - j.b;
                                                                                final float n21 = f3.d - j.d;
                                                                                if (Math.signum(n20) == Math.signum(n21)) {
                                                                                    if (Math.abs(n20) >= Math.abs(n21)) {
                                                                                        n20 = n21;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    n20 = 0.0f;
                                                                                }
                                                                                final long n22 = (long)Float.floatToRawIntBits(n18) << 32 | ((long)Float.floatToRawIntBits(n20) & 0xFFFFFFFFL);
                                                                                long n23;
                                                                                if (l6g.c(n22, 0L)) {
                                                                                    n23 = n22;
                                                                                }
                                                                                else {
                                                                                    final float intBitsToFloat = Float.intBitsToFloat((int)(n22 >> 32));
                                                                                    final float intBitsToFloat2 = Float.intBitsToFloat((int)(n22 & 0xFFFFFFFFL));
                                                                                    Object g24;
                                                                                    if ((g24 = v3.g((Object)etk.v)) == null) {
                                                                                        g24 = null;
                                                                                    }
                                                                                    final dfk dfk3 = (dfk)g24;
                                                                                    float n24 = intBitsToFloat;
                                                                                    if (dfk3 != null) {
                                                                                        n24 = intBitsToFloat;
                                                                                        if (dfk3.c) {
                                                                                            n24 = -intBitsToFloat;
                                                                                        }
                                                                                    }
                                                                                    float n25 = n24;
                                                                                    if (c.V == w) {
                                                                                        n25 = -n24;
                                                                                    }
                                                                                    Object g25;
                                                                                    if ((g25 = v3.g((Object)etk.w)) == null) {
                                                                                        g25 = null;
                                                                                    }
                                                                                    final dfk dfk4 = (dfk)g25;
                                                                                    float n26 = intBitsToFloat2;
                                                                                    if (dfk4 != null) {
                                                                                        n26 = intBitsToFloat2;
                                                                                        if (dfk4.c) {
                                                                                            n26 = -intBitsToFloat2;
                                                                                        }
                                                                                    }
                                                                                    n23 = (((long)Float.floatToRawIntBits(n26) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(n25) << 32);
                                                                                }
                                                                                final zta zta3 = (zta)t17.b;
                                                                                Label_1740: {
                                                                                    if (zta3 == null || !(boolean)zta3.d((Object)Float.intBitsToFloat((int)(n23 >> 32)), (Object)Float.intBitsToFloat((int)(n23 & 0xFFFFFFFFL)))) {
                                                                                        if (!b10) {
                                                                                            b10 = false;
                                                                                            break Label_1740;
                                                                                        }
                                                                                    }
                                                                                    b10 = true;
                                                                                }
                                                                                h = l6g.h(h, n22);
                                                                            }
                                                                            zsk2 = zsk2.l();
                                                                        }
                                                                        return b10;
                                                                    }
                                                                    t3 t15 = null;
                                                                    continue;
                                                                }
                                                            }
                                                            case 2097152: {
                                                                String string;
                                                                if (bundle != null) {
                                                                    string = ((BaseBundle)bundle).getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                                                }
                                                                else {
                                                                    string = null;
                                                                }
                                                                Object g26 = v.g((Object)rsk.k);
                                                                if (g26 == null) {
                                                                    g26 = null;
                                                                }
                                                                final t3 t18 = (t3)g26;
                                                                if (t18 == null) {
                                                                    break;
                                                                }
                                                                final lta lta4 = (lta)t18.b;
                                                                if (lta4 != null) {
                                                                    String s;
                                                                    if ((s = string) == null) {
                                                                        s = "";
                                                                    }
                                                                    return (boolean)lta4.b((Object)new og0(s));
                                                                }
                                                                break;
                                                            }
                                                            case 1048576: {
                                                                Object g27 = v.g((Object)rsk.v);
                                                                if (g27 == null) {
                                                                    g27 = null;
                                                                }
                                                                final t3 t19 = (t3)g27;
                                                                if (t19 == null) {
                                                                    break;
                                                                }
                                                                final jta jta8 = (jta)t19.b;
                                                                if (jta8 != null) {
                                                                    return (boolean)jta8.a();
                                                                }
                                                                break;
                                                            }
                                                            case 524288: {
                                                                Object g28 = v.g((Object)rsk.u);
                                                                if (g28 == null) {
                                                                    g28 = null;
                                                                }
                                                                final t3 t20 = (t3)g28;
                                                                if (t20 == null) {
                                                                    break;
                                                                }
                                                                final jta jta9 = (jta)t20.b;
                                                                if (jta9 != null) {
                                                                    return (boolean)jta9.a();
                                                                }
                                                                break;
                                                            }
                                                            case 262144: {
                                                                Object g29 = v.g((Object)rsk.t);
                                                                if (g29 == null) {
                                                                    g29 = null;
                                                                }
                                                                final t3 t21 = (t3)g29;
                                                                if (t21 == null) {
                                                                    break;
                                                                }
                                                                final jta jta10 = (jta)t21.b;
                                                                if (jta10 != null) {
                                                                    return (boolean)jta10.a();
                                                                }
                                                                break;
                                                            }
                                                            case 65536: {
                                                                Object g30 = v.g((Object)rsk.r);
                                                                if (g30 == null) {
                                                                    g30 = null;
                                                                }
                                                                final t3 t22 = (t3)g30;
                                                                if (t22 == null) {
                                                                    break;
                                                                }
                                                                final jta jta11 = (jta)t22.b;
                                                                if (jta11 != null) {
                                                                    return (boolean)jta11.a();
                                                                }
                                                                break;
                                                            }
                                                            case 32768: {
                                                                Object g31 = v.g((Object)rsk.s);
                                                                if (g31 == null) {
                                                                    g31 = null;
                                                                }
                                                                final t3 t23 = (t3)g31;
                                                                if (t23 == null) {
                                                                    break;
                                                                }
                                                                final jta jta12 = (jta)t23.b;
                                                                if (jta12 != null) {
                                                                    return (boolean)jta12.a();
                                                                }
                                                                break;
                                                            }
                                                            case 32: {
                                                                Object g32 = v.g((Object)rsk.c);
                                                                if (g32 == null) {
                                                                    g32 = null;
                                                                }
                                                                final t3 t24 = (t3)g32;
                                                                if (t24 == null) {
                                                                    break;
                                                                }
                                                                final jta jta13 = (jta)t24.b;
                                                                if (jta13 != null) {
                                                                    return (boolean)jta13.a();
                                                                }
                                                                break;
                                                            }
                                                            case 16: {
                                                                Object g33;
                                                                if ((g33 = v.g((Object)rsk.b)) == null) {
                                                                    g33 = null;
                                                                }
                                                                final t3 t25 = (t3)g33;
                                                                while (true) {
                                                                    Label_3321: {
                                                                        if (t25 == null) {
                                                                            break Label_3321;
                                                                        }
                                                                        final jta jta14 = (jta)t25.b;
                                                                        if (jta14 == null) {
                                                                            break Label_3321;
                                                                        }
                                                                        final Boolean b11 = (Boolean)jta14.a();
                                                                        f50.E(z, i, 1, null, 12);
                                                                        if (b11 != null) {
                                                                            return b11;
                                                                        }
                                                                        break;
                                                                    }
                                                                    final Boolean b11 = null;
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                else {
                                                    Object g34;
                                                    if ((g34 = v.g((Object)etk.l)) == null) {
                                                        g34 = null;
                                                    }
                                                    if (mlc.q(g34, (Object)true)) {
                                                        ((pma)y.getFocusOwner()).d(8, false, true);
                                                        return true;
                                                    }
                                                }
                                            }
                                            else {
                                                if (((View)y).isInTouchMode()) {
                                                    ((View)y).requestFocusFromTouch();
                                                }
                                                Object g35 = v.g((Object)rsk.w);
                                                if (g35 == null) {
                                                    g35 = null;
                                                }
                                                final t3 t26 = (t3)g35;
                                                if (t26 != null) {
                                                    final jta jta15 = (jta)t26.b;
                                                    if (jta15 != null) {
                                                        return (boolean)jta15.a();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        Object g36 = v.g((Object)rsk.q);
                                        if (g36 == null) {
                                            g36 = null;
                                        }
                                        final t3 t27 = (t3)g36;
                                        if (t27 != null) {
                                            final jta jta16 = (jta)t27.b;
                                            if (jta16 != null) {
                                                return (boolean)jta16.a();
                                            }
                                        }
                                    }
                                }
                                else if (bundle != null) {
                                    final int int1 = ((BaseBundle)bundle).getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                    final boolean boolean1 = ((BaseBundle)bundle).getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                    final boolean b12 = n == 256;
                                    final Integer p3 = z.P;
                                    Label_3656: {
                                        if (p3 != null) {
                                            if (f == p3) {
                                                break Label_3656;
                                            }
                                        }
                                        z.O = -1;
                                        z.P = f;
                                    }
                                    final String t28 = f50.t(a);
                                    if (t28 != null) {
                                        if (t28.length() != 0) {
                                            final String t29 = f50.t(a);
                                            Object o = null;
                                            Label_3870: {
                                                Label_3734: {
                                                    if (t29 != null) {
                                                        if (t29.length() != 0) {
                                                            if (int1 == 1) {
                                                                o = t3r.g(((View)y).getContext().getResources().getConfiguration().locale);
                                                                ((a4)o).q(t29);
                                                                break Label_3870;
                                                            }
                                                            if (int1 == 2) {
                                                                o = z3r.z(((View)y).getContext().getResources().getConfiguration().locale);
                                                                ((a4)o).q(t29);
                                                                break Label_3870;
                                                            }
                                                            if (int1 != 4) {
                                                                if (int1 == 8) {
                                                                    o = y3r.g();
                                                                    ((z3)o).q(t29);
                                                                    break Label_3870;
                                                                }
                                                                if (int1 != 16) {
                                                                    break Label_3734;
                                                                }
                                                            }
                                                            if (v.c((Object)rsk.a)) {
                                                                final omn k2 = omo.K(d);
                                                                if (k2 != null) {
                                                                    if (int1 == 4) {
                                                                        o = u3r.k();
                                                                        ((a4)o).y(t29, k2);
                                                                        break Label_3870;
                                                                    }
                                                                    o = x3r.h();
                                                                    ((b4)o).y(t29, k2, a);
                                                                    break Label_3870;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                o = null;
                                            }
                                            if (o != null) {
                                                n = z.q(a);
                                                if ((i = n) == -1) {
                                                    if (b12) {
                                                        i = 0;
                                                    }
                                                    else {
                                                        i = t28.length();
                                                    }
                                                }
                                                int[] array;
                                                if (b12) {
                                                    array = ((z3)o).g(i);
                                                }
                                                else {
                                                    array = ((z3)o).v(i);
                                                }
                                                if (array != null) {
                                                    final int n27 = array[0];
                                                    n = array[1];
                                                    int n28;
                                                    if (boolean1 && !v.c((Object)etk.a) && v.c((Object)etk.G)) {
                                                        if ((i = z.r(a)) == -1) {
                                                            if (b12) {
                                                                i = n27;
                                                            }
                                                            else {
                                                                i = n;
                                                            }
                                                        }
                                                        if (b12) {
                                                            n28 = n;
                                                        }
                                                        else {
                                                            n28 = n27;
                                                        }
                                                    }
                                                    else {
                                                        if (b12) {
                                                            i = n;
                                                        }
                                                        else {
                                                            i = n27;
                                                        }
                                                        n28 = i;
                                                    }
                                                    int n29;
                                                    if (b12) {
                                                        n29 = 256;
                                                    }
                                                    else {
                                                        n29 = 512;
                                                    }
                                                    z.T = new c50(a, n29, int1, n27, n, SystemClock.uptimeMillis());
                                                    z.K(a, i, n28, true);
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                if (z.F == i) {
                                    z.F = Integer.MIN_VALUE;
                                    z.H = null;
                                    ((View)y).invalidate();
                                    f50.E(z, i, 65536, null, 12);
                                    return true;
                                }
                                return false;
                            }
                        }
                        else if (b.isEnabled() && b.isTouchExplorationEnabled()) {
                            n = z.F;
                            if (n == i) {
                                return false;
                            }
                            if (n != Integer.MIN_VALUE) {
                                f50.E(z, n, 65536, null, 12);
                            }
                            z.F = i;
                            ((View)y).invalidate();
                            f50.E(z, i, 32768, null, 12);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
