import android.os.BaseBundle;
import android.text.Layout;
import com.squareup.wire.ProtoAdapter;
import java.util.concurrent.TimeUnit;
import android.os.Build$VERSION;
import android.content.pm.ShortcutManager;
import java.util.Collection;
import com.anthropic.claude.api.model.ThinkingOptions;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import androidx.compose.ui.node.LayoutNode;
import com.anthropic.claude.conversation.FailureKind;
import com.anthropic.claude.api.chat.RefusalStopDetails;
import com.anthropic.claude.api.chat.ChatFeedback;
import com.anthropic.claude.api.chat.InputMode;
import android.content.res.Resources;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.util.List;
import android.content.Context;
import java.util.ArrayList;

public abstract class twl
{
    public static final nyf A;
    public static final Object B;
    public static boolean C = true;
    public static boolean D = true;
    public static volatile swl v;
    public static volatile ArrayList w;
    public static final ye6 x;
    public static final uy8 y;
    public static final myf z;
    
    public static final Object A(final tsk tsk, final htk htk) {
        Object g;
        if ((g = tsk.v.g(htk)) == null) {
            g = null;
        }
        return g;
    }
    
    public static List B(final Context context) {
        Label_0175: {
            if (twl.w != null) {
                break Label_0175;
            }
            final ArrayList w = new ArrayList();
            final PackageManager packageManager = context.getPackageManager();
            final Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            final Iterator iterator = packageManager.queryIntentActivities(intent, 128).iterator();
        Block_8_Outer:
            while (true) {
                Label_0107: {
                    while (iterator.hasNext()) {
                        final ActivityInfo activityInfo = ((ResolveInfo)iterator.next()).activityInfo;
                        if (activityInfo == null) {
                            continue;
                        }
                        final Bundle metaData = activityInfo.metaData;
                        if (metaData == null) {
                            continue;
                        }
                        final String string = ((BaseBundle)metaData).getString("androidx.core.content.pm.shortcut_listener_impl");
                        if (string == null) {
                            continue;
                        }
                        break Label_0107;
                    }
                    Label_0165: {
                        break Label_0165;
                        try {
                            final String string;
                            if (Class.forName(string, false, twl.class.getClassLoader()).getMethod("getInstance", Context.class).invoke((Object)null, new Object[] { context }) == null) {
                                w.add((Object)null);
                                continue Block_8_Outer;
                            }
                            throw new ClassCastException();
                            return (List)twl.w;
                            while (true) {
                                twl.w = w;
                                return (List)twl.w;
                                iftrue(Label_0175:)(twl.w != null);
                                continue;
                            }
                        }
                        catch (final Exception ex) {
                            continue;
                        }
                    }
                }
                break;
            }
        }
    }
    
    public static swl C(final Context context) {
        Label_0065: {
            if (twl.v != null) {
                break Label_0065;
            }
            while (true) {
                try {
                    twl.v = (swl)Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, twl.class.getClassLoader()).getMethod("getInstance", Context.class).invoke((Object)null, new Object[] { context });
                    if (twl.v == null) {
                        twl.v = (swl)new Object();
                    }
                    return twl.v;
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public static final String D(final int n, final gva gva) {
        gva.j((sei)q50.a);
        return ((Resources)gva.j((sei)q50.c)).getString(n);
    }
    
    public static ArrayList F(final String s, final List list) {
        final ArrayList list2 = new ArrayList(d86.p0((Iterable)list, 10));
        final Iterator iterator = ((Iterable)list).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                lq6.n0();
                throw null;
            }
            u6f a = (u6f)next;
            if (n == 0) {
                a = u6f.a(a, s, 0, false, (String)null, false, (String)null, (InputMode)null, (ChatFeedback)null, (RefusalStopDetails)null, (sdo)null, (FailureKind)null, (Boolean)null, 4194301);
            }
            list2.add((Object)a);
            ++n;
        }
        return list2;
    }
    
    public static void G(final pb1 pb1) {
        if (pb1.j == null) {
            pb1.j = new pb1();
            final Thread thread = new Thread("Okio Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        final long nanoTime = System.nanoTime();
        final long c = ((jzn)pb1).c;
        final boolean a = ((jzn)pb1).a;
        final long n = lcmp(c, 0L);
        if (n != 0 && a) {
            pb1.h = Math.min(c, ((jzn)pb1).e() - nanoTime) + nanoTime;
        }
        else if (n != 0) {
            pb1.h = nanoTime + c;
        }
        else {
            if (!a) {
                oyl.d();
                return;
            }
            pb1.h = ((jzn)pb1).e();
        }
        final qd6 i = pb1.i;
        final int w = i.w + 1;
        i.w = w;
        final pb1[] array = (pb1[])i.x;
        if (w == array.length) {
            final pb1[] x = new pb1[w * 2];
            iw0.O0(0, 0, 14, (Object[])array, (Object[])x);
            i.x = x;
        }
        i.q(w, pb1);
        if (pb1.g == 1) {
            pb1.l.signal();
        }
    }
    
    public static final boolean H(final btf btf) {
        return btf.a != 1;
    }
    
    public static final boolean I(final zsk zsk, final Resources resources) {
        if (!ach.Q(zsk)) {
            final tsk d = zsk.d;
            if (!d.x) {
                final Object g = d.v.g(etk.a);
                final String s = null;
                List list;
                if ((list = (List)g) == null) {
                    list = null;
                }
                final List list2 = list;
                String s2 = s;
                if (list2 != null) {
                    s2 = (String)c86.I0(list2);
                }
                if ((s2 == null && y(zsk) == null && x(zsk, resources) == null && !w(zsk)) || !J(zsk)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static final boolean J(final zsk zsk) {
        final boolean n = zsk.n();
        final int n2 = 0;
        if (!n) {
            final List j = zsk.j(4, zsk);
            for (int size = ((Collection)j).size(), i = 0; i < size; ++i) {
                if (!zrn.J((zsk)j.get(i))) {
                    return false;
                }
            }
            while (true) {
                for (LayoutNode layoutNode = zsk.c.G(); layoutNode != null; layoutNode = layoutNode.G()) {
                    final tsk k = layoutNode.I();
                    if (k != null && k.x) {
                        int n3 = n2;
                        if (layoutNode != null) {
                            n3 = 1;
                        }
                        return (n3 ^ 0x1) != 0x0;
                    }
                }
                LayoutNode layoutNode = null;
                continue;
            }
        }
        return false;
    }
    
    public static final n9k K(final lta lta, final zta zta) {
        final xp4 xp4 = new xp4(zta, (byte)3);
        lta.getClass();
        omo.v(1, lta);
        return new n9k(lta, (zta)xp4);
    }
    
    public static final ModelSelectorEntry L(final ModelSelectorEntry modelSelectorEntry, final opd opd) {
        final _ServerLocalizedString e = modelSelectorEntry.e;
        ThinkingOptions thinkingOptions = null;
        _ServerLocalizedString serverLocalizedString;
        if (e != null) {
            final String a = e.a;
            serverLocalizedString = new _ServerLocalizedString(a, opd.b(a));
        }
        else {
            serverLocalizedString = null;
        }
        final Badge n = modelSelectorEntry.n;
        Badge badge;
        if (n != null) {
            final _ServerLocalizedString a2 = n.a;
            _ServerLocalizedString serverLocalizedString2;
            if (a2 != null) {
                final String a3 = a2.a;
                serverLocalizedString2 = new _ServerLocalizedString(a3, opd.b(a3));
            }
            else {
                serverLocalizedString2 = null;
            }
            badge = new Badge(serverLocalizedString2, n.b);
        }
        else {
            badge = null;
        }
        final ThinkingOptions m = modelSelectorEntry.m;
        if (m != null) {
            final List a4 = m.a;
            final ArrayList list = new ArrayList(d86.p0((Iterable)a4, 10));
            for (final ThinkingOption thinkingOption : a4) {
                final Badge e2 = thinkingOption.e;
                Badge badge2;
                if (e2 != null) {
                    final _ServerLocalizedString a5 = e2.a;
                    _ServerLocalizedString serverLocalizedString3;
                    if (a5 != null) {
                        final String a6 = a5.a;
                        serverLocalizedString3 = new _ServerLocalizedString(a6, opd.b(a6));
                    }
                    else {
                        serverLocalizedString3 = null;
                    }
                    badge2 = new Badge(serverLocalizedString3, e2.b);
                }
                else {
                    badge2 = null;
                }
                list.add((Object)new ThinkingOption(thinkingOption.a, thinkingOption.b, thinkingOption.c, thinkingOption.d, badge2));
            }
            final List b = m.b;
            final ArrayList list2 = new ArrayList(d86.p0((Iterable)b, 10));
            for (final ThinkingOption thinkingOption2 : b) {
                final Badge e3 = thinkingOption2.e;
                Badge badge3;
                if (e3 != null) {
                    final _ServerLocalizedString a7 = e3.a;
                    _ServerLocalizedString serverLocalizedString4;
                    if (a7 != null) {
                        final String a8 = a7.a;
                        serverLocalizedString4 = new _ServerLocalizedString(a8, opd.b(a8));
                    }
                    else {
                        serverLocalizedString4 = null;
                    }
                    badge3 = new Badge(serverLocalizedString4, e3.b);
                }
                else {
                    badge3 = null;
                }
                list2.add((Object)new ThinkingOption(thinkingOption2.a, thinkingOption2.b, thinkingOption2.c, thinkingOption2.d, badge3));
            }
            thinkingOptions = new ThinkingOptions(list, list2);
        }
        return new ModelSelectorEntry(modelSelectorEntry.a, modelSelectorEntry.b, modelSelectorEntry.c, modelSelectorEntry.d, serverLocalizedString, modelSelectorEntry.f, modelSelectorEntry.g, modelSelectorEntry.h, modelSelectorEntry.i, modelSelectorEntry.j, modelSelectorEntry.k, modelSelectorEntry.l, thinkingOptions, badge);
    }
    
    public static final hc7 M(final oc7 oc7, hc7 t) {
        t = t(oc7.getCoroutineContext(), t, true);
        final o68 a = vo8.a;
        hc7 f0 = t;
        if (t != a) {
            f0 = t;
            if (t.M0((gc7)p3.x) == null) {
                f0 = t.F0((hc7)a);
            }
        }
        return f0;
    }
    
    public static final o2 N(final Object... array) {
        return e6m.w.m((Collection)iw0.E0(array));
    }
    
    public static void O(final Context context, final List list) {
        ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).removeDynamicShortcuts(list);
        C(context).getClass();
        final Iterator iterator = ((ArrayList)B(context)).iterator();
        if (!iterator.hasNext()) {
            return;
        }
        iterator.next().getClass();
        fvd.c();
    }
    
    public static void P(final Context context, final List list) {
        if (Build$VERSION.SDK_INT < 30) {
            O(context, list);
            return;
        }
        p4.s((ShortcutManager)context.getSystemService((Class)ShortcutManager.class), list);
        C(context).getClass();
        final Iterator iterator = ((ArrayList)B(context)).iterator();
        if (!iterator.hasNext()) {
            return;
        }
        iterator.next().getClass();
        fvd.c();
    }
    
    public static l78 Q(final int n) {
        final alo i0 = ri2.I0(0, 0, null, 7);
        zhg zhg;
        if ((n & 0x2) != 0x0) {
            zhg = zhg.w;
        }
        else {
            zhg = zhg.v;
        }
        return new l78((Object)i0, (Object)new o4m((Object)zhg, (byte)0), (byte)0);
    }
    
    public static final lg9 R(final btf btf) {
        final String b = btf.b;
        int n;
        if (H(btf)) {
            n = 1;
        }
        else {
            n = 2;
        }
        final int d = ge9.D(btf.a);
        final ig9 ig9 = null;
        Object o = null;
        switch (d) {
            default: {
                en9.r();
                return null;
            }
            case 11: {
                o = lq6.X(yg9.B);
                break;
            }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                o = lq6.X(yg9.x);
                break;
            }
            case 4: {
                o = lq6.X(yg9.w);
                break;
            }
            case 3: {
                o = lq6.X(yg9.A);
                break;
            }
            case 2: {
                o = lq6.X(yg9.z);
                break;
            }
            case 1: {
                o = lq6.X(yg9.y);
                break;
            }
            case 0: {
                o = r89.v;
                break;
            }
        }
        final String g = btf.g;
        if (g == null) {
            final ig9 ig10 = ig9;
            if (b == null) {
                return new lg9(n, (List)o, ig10);
            }
        }
        final ig9 ig10 = new ig9(g, b);
        return new lg9(n, (List)o, ig10);
    }
    
    public static final int S(final jh8 jh8) {
        switch (((Enum)jh8).ordinal()) {
            default: {
                en9.r();
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 2;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static final int T(final int n) {
        switch (ge9.D(n)) {
            default: {
                en9.r();
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static final o5c U(final Iterable iterable) {
        o5c o5c;
        if (iterable instanceof o5c) {
            o5c = (o5c)iterable;
        }
        else {
            o5c = null;
        }
        if (o5c == null) {
            return (o5c)W(iterable);
        }
        return o5c;
    }
    
    public static final u5c V(final Iterable iterable) {
        final boolean b = iterable instanceof u5c;
        Object d = null;
        u5c u5c;
        if (b) {
            u5c = (u5c)iterable;
        }
        else {
            u5c = null;
        }
        if (u5c != null) {
            return u5c;
        }
        o4h o4h;
        if (iterable instanceof o4h) {
            o4h = (o4h)iterable;
        }
        else {
            o4h = null;
        }
        if (o4h != null) {
            d = o4h.d();
        }
        if (d != null) {
            return (u5c)d;
        }
        final m4h y = m4h.y;
        if (iterable instanceof Collection) {
            return (u5c)y.j((Collection)iterable);
        }
        final o4h o4h2 = new o4h(y);
        h86.t0((Collection)o4h2, iterable);
        return (u5c)o4h2.d();
    }
    
    public static final o2 W(final Iterable iterable) {
        final boolean b = iterable instanceof o2;
        o2 j = null;
        o2 o2;
        if (b) {
            o2 = (o2)iterable;
        }
        else {
            o2 = null;
        }
        if (o2 != null) {
            return o2;
        }
        Object o3;
        if (iterable instanceof b4h) {
            o3 = iterable;
        }
        else {
            o3 = null;
        }
        if (o3 != null) {
            j = ((u4h)o3).j();
        }
        if (j != null) {
            return j;
        }
        final boolean b2 = iterable instanceof Collection;
        final e6m w = e6m.w;
        if (b2) {
            return w.m((Collection)iterable);
        }
        final u4h o4 = w.o();
        h86.t0((Collection)o4, iterable);
        return o4.j();
    }
    
    public static final int X(final int n) {
        switch (ge9.D(n)) {
            default: {
                en9.r();
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static final eb Y(final b0k b0k) {
        final int ordinal = ((Enum)b0k).ordinal();
        if (ordinal == 0) {
            return eb.y;
        }
        if (ordinal == 1) {
            return eb.z;
        }
        if (ordinal == 2) {
            return eb.A;
        }
        if (ordinal == 3) {
            return eb.x;
        }
        if (ordinal == 4) {
            return eb.B;
        }
        if (ordinal == 5) {
            return eb.w;
        }
        en9.r();
        return null;
    }
    
    public static final void Z() {
        throw new UnsupportedOperationException();
    }
    
    public static final zpo a0(final f07 f07, final hc7 hc7, final Object o) {
        final boolean b = f07 instanceof qc7;
        zpo zpo = null;
        final zpo zpo2 = null;
        if (b) {
            if (hc7.M0((gc7)u13.z) != null) {
                Object o2 = f07;
                while (true) {
                    while (!(o2 instanceof qo8)) {
                        final qc7 callerFrame = ((qc7)o2).getCallerFrame();
                        zpo zpo3;
                        if (callerFrame == null) {
                            zpo3 = zpo2;
                        }
                        else {
                            o2 = callerFrame;
                            if (!(callerFrame instanceof zpo)) {
                                continue;
                            }
                            zpo3 = (zpo)callerFrame;
                        }
                        zpo = zpo3;
                        if (zpo3 != null) {
                            zpo3.s0(hc7, o);
                            zpo = zpo3;
                            return zpo;
                        }
                        return zpo;
                    }
                    zpo zpo3 = zpo2;
                    continue;
                }
            }
        }
        return zpo;
    }
    
    public static String b0(final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length);
        for (int i = 0; i < array.length; ++i) {
            final byte b = array[i];
            if (b != 34) {
                if (b != 39) {
                    if (b != 92) {
                        switch (b) {
                            default: {
                                if (b >= 32 && b <= 126) {
                                    sb.append((char)b);
                                    break;
                                }
                                sb.append('\\');
                                sb.append((char)((b >>> 6 & 0x3) + 48));
                                sb.append((char)((b >>> 3 & 0x7) + 48));
                                sb.append((char)((b & 0x7) + 48));
                                break;
                            }
                            case 13: {
                                sb.append("\\r");
                                break;
                            }
                            case 12: {
                                sb.append("\\f");
                                break;
                            }
                            case 11: {
                                sb.append("\\v");
                                break;
                            }
                            case 10: {
                                sb.append("\\n");
                                break;
                            }
                            case 9: {
                                sb.append("\\t");
                                break;
                            }
                            case 8: {
                                sb.append("\\b");
                                break;
                            }
                            case 7: {
                                sb.append("\\a");
                                break;
                            }
                        }
                    }
                    else {
                        sb.append("\\\\");
                    }
                }
                else {
                    sb.append("\\'");
                }
            }
            else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
    
    public static final void c(final int n, final int n2, final jta jta, final gva gva, igf v, final boolean b, boolean b2) {
        gva.i0(-240578962);
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
        final int n6 = n4 | 0x180;
        final int n7 = n2 & 0x8;
        int n8;
        if (n7 != 0) {
            n8 = (n4 | 0xD80);
        }
        else {
            n8 = n6;
            if ((n & 0xC00) == 0x0) {
                int n9;
                if (gva.g(b2)) {
                    n9 = 2048;
                }
                else {
                    n9 = 1024;
                }
                n8 = (n6 | n9);
            }
        }
        if (gva.W(n8 & 0x1, (n8 & 0x493) != 0x492)) {
            if (n7 != 0) {
                b2 = true;
            }
            final String s = soh.S(2131757322, gva);
            final String s2 = soh.S(2131758365, gva);
            final String s3 = soh.S(2131758364, gva);
            final cy4 a = qy4.a;
            final xzb s4 = lq6.S(0L, qy4.a(gva).O, 0L, qy4.a(gva).Q, gva, 5);
            final boolean b3 = (n8 & 0xE) == 0x4;
            final boolean f = gva.f((Object)s2);
            final boolean f2 = gva.f((Object)s3);
            final boolean f3 = gva.f((Object)s);
            final Object r = gva.R();
            Object o;
            if ((f | b3 | f2 | f3) || (o = r) == bi6.a) {
                o = new fv4(b, (Object)s2, (Object)s3, (Object)s, (byte)1);
                gva.q0(o);
            }
            final lta lta = (lta)o;
            v = (igf)fgf.v;
            final igf k = rml.k(wsk.b(lta, v, false), (aql)ovj.a);
            final ye6 t0 = uuj.t0(83658636, (aua)new sy4((byte)1, b), gva);
            final int n10 = n8 >> 3;
            qt7.d((n10 & 0x380) | ((n10 & 0xE) | 0x180000), 48, t0, jta, gva, s4, k, null, b2);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new wya(b, jta, v, b2, n, n2);
        }
    }
    
    public static final void f(final jta jta, vfj vfj, final st4 st4, final gva gva, final int n) {
        gva.i0(-91030699);
        int n2;
        if (gva.h((Object)jta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n | n2 | 0x90;
        st4 st5;
        vfj vfj2;
        if (gva.W(n3 & 0x1, (n3 & 0x93) != 0x92)) {
            gva.b0();
            final cib a = bi6.a;
            Object o;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                o = vfj;
                st5 = st4;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (vfj = (vfj)r) == a) {
                    vfj = (vfj)a2.d((Class)vfj.class, (emi)null);
                    gva.q0((Object)vfj);
                }
                o = vfj;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)st4.class, (emi)null);
                    gva.q0(o2);
                }
                st5 = (st4)o2;
            }
            gva.r();
            final hch hch = (hch)((xom)ljq.w((yom)((vfj)o).e, gva)).getValue();
            final Boolean b = (Boolean)((xom)ljq.w((yom)((vfj)o).g, gva)).getValue();
            final boolean booleanValue = b;
            final Context context = (Context)gva.j((sei)q50.b);
            final bnf w = o50.W(jta, gva);
            final boolean g = gva.g(booleanValue);
            final boolean f5 = gva.f((Object)w);
            final Object r3 = gva.R();
            Object o3;
            if ((g | f5) || (o3 = r3) == a) {
                o3 = new zyc(booleanValue, w, (f07)null);
                gva.q0(o3);
            }
            mlc.f((zta)o3, gva, b);
            final ke ke = new ke((byte)3);
            final boolean h = gva.h(o);
            final Object r4 = gva.R();
            Object o4;
            if (h || (o4 = r4) == a) {
                o4 = new e0j(o, (byte)1);
                gva.q0(o4);
            }
            final a1e d = k8e.D(ke, (lta)o4, gva, 0);
            final boolean b2 = hch instanceof fch;
            if (b2 && booleanValue) {
                gva.g0(-1770069884);
                final rad on_RESUME = rad.ON_RESUME;
                final boolean h2 = gva.h(o);
                final boolean h3 = gva.h((Object)st5);
                final boolean h4 = gva.h((Object)context);
                final boolean h5 = gva.h((Object)hch);
                final boolean h6 = gva.h((Object)d);
                final Object r5 = gva.R();
                Object o5;
                if ((h2 | h3 | h4 | h5 | h6) || (o5 = r5) == a) {
                    o5 = new q9c(o, (Object)st5, (Object)context, (Object)hch, (Object)d, (byte)1);
                    gva.q0(o5);
                }
                t08.f(on_RESUME, (gbd)null, (jta)o5, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(-1769353939);
                gva.q(false);
            }
            if (b2 && booleanValue) {
                gva.g0(-1769266860);
                final boolean h7 = gva.h((Object)context);
                final boolean h8 = gva.h((Object)hch);
                final boolean h9 = gva.h((Object)d);
                final Object r6 = gva.R();
                Object o6;
                if ((h7 | h8 | h9) || (o6 = r6) == a) {
                    o6 = new a3e((Object)context, (Object)hch, (Object)d, (f07)null, (byte)8);
                    gva.q0(o6);
                }
                mlc.f((zta)o6, gva, lqo.a);
                gva.q(false);
            }
            else {
                gva.g0(-1768904563);
                gva.q(false);
            }
            vfj2 = (vfj)o;
        }
        else {
            gva.Z();
            vfj2 = vfj;
            st5 = st4;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)jta, (Object)vfj2, (Object)st5, (byte)17);
        }
    }
    
    public static final void i(final ynp ynp, final pjg pjg, final boolean b, final igf igf, final gva gva, final int n) {
        gva.i0(-1199514056);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)ynp)) {
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
                b2 = gva.f((Object)pjg);
            }
            else {
                b2 = gva.h((Object)pjg);
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
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.g(b)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n4 |= n6;
        }
        if ((n & 0xC00) == 0x0) {
            int n7;
            if (gva.f((Object)igf)) {
                n7 = 2048;
            }
            else {
                n7 = 1024;
            }
            n4 |= n7;
        }
        boolean b3 = false;
        if (gva.W(n4 & 0x1, (n4 & 0x493) != 0x492)) {
            long n8;
            if (x90.D(gva)) {
                n8 = ui1.b();
            }
            else {
                n8 = ui1.c();
            }
            if ((n4 & 0xE) == 0x4) {
                b3 = true;
            }
            final Object r = gva.R();
            Object o;
            if (b3 || (o = r) == bi6.a) {
                o = new kal((Object)ynp, (byte)19);
                gva.q0(o);
            }
            final zta zta = (zta)o;
            final int n9 = n4 >> 3;
            l7r.a(pjg, b, n8, igf, false, (Float)null, 0.0f, (q5m)null, zta, gva, (n9 & 0x70) | ((n9 & 0xE) | 0x8) | (n4 & 0x1C00), 240);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new z83((Object)ynp, (Object)pjg, b, (Object)igf, n, (byte)22);
        }
    }
    
    public static pb1 j() {
        final qd6 i = pb1.i;
        final pb1 pb1 = ((pb1[])i.x)[1];
        if (pb1 == null) {
            final long nanoTime = System.nanoTime();
            pb1.l.await((long)pb1.m, TimeUnit.MILLISECONDS);
            if (((pb1[])i.x)[1] == null && System.nanoTime() - nanoTime >= pb1.n) {
                return pb1.j;
            }
            return null;
        }
        else {
            final long n = pb1.h - System.nanoTime();
            if (n > 0L) {
                pb1.l.await(n, TimeUnit.NANOSECONDS);
                return null;
            }
            i.t(pb1);
            pb1.f = 2;
            return pb1;
        }
    }
    
    public static void k(final int n, final int n2, final int n3) {
        if (n < 0 || n2 > n3) {
            fvd.g(n3, hia.o(n, n2, "startIndex: ", ", endIndex: ", ", size: "));
            return;
        }
        if (n <= n2) {
            return;
        }
        en9.s(smk.o(n, n2, "startIndex: ", " > endIndex: "));
    }
    
    public static void l(final int n, final int n2, final int n3) {
        if (n < 0 || n2 > n3) {
            fvd.g(n3, hia.o(n, n2, "fromIndex: ", ", toIndex: ", ", size: "));
            return;
        }
        if (n <= n2) {
            return;
        }
        en9.s(smk.o(n, n2, "fromIndex: ", " > toIndex: "));
    }
    
    public static igf m(final igf igf) {
        return igf.E((igf)new bq4(new h74((byte)22)));
    }
    
    public static final jgc n(final ProtoAdapter protoAdapter, final String s) {
        return new jgc(s, protoAdapter, protoAdapter.getType(), protoAdapter.getIdentity());
    }
    
    public static is2 o(final String s) {
        if (s.length() % 2 == 0) {
            final int n = s.length() / 2;
            final byte[] array = new byte[n];
            for (int i = 0; i < n; ++i) {
                final int n2 = i * 2;
                array[i] = (byte)(tsf.w(s.charAt(n2 + 1)) + (tsf.w(s.charAt(n2)) << 4));
            }
            return new is2(array);
        }
        oyl.g((Object)"Unexpected hex string: ".concat(s));
        return null;
    }
    
    public static final boolean q(final zsk zsk) {
        return zsk.k().v.c(etk.j) ^ true;
    }
    
    public static is2 s(final String x) {
        final is2 is2 = new is2(rhc.e(x));
        is2.x = x;
        return is2;
    }
    
    public static final hc7 t(hc7 v, final hc7 hc7, final boolean b) {
        final Boolean booleanFalse = Boolean.FALSE;
        final boolean booleanValue = (boolean)((hc7)v).V((zta)new rg6((byte)7), (Object)false);
        final boolean booleanValue2 = (boolean)hc7.V((zta)new rg6((byte)7), (Object)false);
        if (!booleanValue && !booleanValue2) {
            return ((hc7)v).F0(hc7);
        }
        final rg6 rg6 = new rg6((byte)8);
        final o89 v2 = o89.v;
        final hc7 hc8 = (hc7)((hc7)v).V((zta)rg6, (Object)v2);
        v = hc7;
        if (booleanValue2) {
            v = hc7.V((zta)new rg6((byte)9), (Object)v2);
        }
        return hc8.F0((hc7)v);
    }
    
    public static d0o u(final String s) {
        final int hashCode = s.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070501: {
                        if (s.equals((Object)"TLSv1.3")) {
                            return d0o.w;
                        }
                        break;
                    }
                    case -503070502: {
                        if (s.equals((Object)"TLSv1.2")) {
                            return d0o.x;
                        }
                        break;
                    }
                    case -503070503: {
                        if (s.equals((Object)"TLSv1.1")) {
                            return d0o.y;
                        }
                        break;
                    }
                }
            }
            else if (s.equals((Object)"TLSv1")) {
                return d0o.z;
            }
        }
        else if (s.equals((Object)"SSLv3")) {
            return d0o.A;
        }
        en9.s("Unexpected TLS version: ".concat(s));
        return null;
    }
    
    public static final boolean v(final mnn mnn) {
        final vbh c = mnn.c;
        v79 v79 = null;
        Label_0035: {
            if (c != null) {
                final fbh b = c.b;
                if (b != null) {
                    v79 = new v79(b.b);
                    break Label_0035;
                }
            }
            v79 = null;
        }
        boolean b2 = false;
        if (v79 != null) {
            if (v79.a == 1) {
                b2 = true;
            }
        }
        return b2 ^ true;
    }
    
    public static final boolean w(final zsk zsk) {
        final Object g = zsk.d.v.g(etk.L);
        final Boolean b = null;
        Object o = g;
        if (g == null) {
            o = null;
        }
        final c1o c1o = (c1o)o;
        final tmf v = zsk.d.v;
        Object g2;
        if ((g2 = v.g(etk.z)) == null) {
            g2 = null;
        }
        final iuj iuj = (iuj)g2;
        final boolean b2 = c1o != null;
        Object g3 = v.g(etk.K);
        if (g3 == null) {
            g3 = b;
        }
        if (g3 != null) {
            if (iuj != null) {
                if (iuj.a == 4) {
                    return b2;
                }
            }
            return true;
        }
        return b2;
    }
    
    public static final String x(final zsk zsk, final Resources resources) {
        final tsk d = zsk.d;
        final tsk d2 = zsk.d;
        final Object g = d.v.g(etk.b);
        final String s = null;
        Object o = g;
        if (g == null) {
            o = null;
        }
        final tmf v = d2.v;
        Object g2;
        if ((g2 = v.g(etk.L)) == null) {
            g2 = null;
        }
        final c1o c1o = (c1o)g2;
        Object g3;
        if ((g3 = v.g(etk.z)) == null) {
            g3 = null;
        }
        final iuj iuj = (iuj)g3;
        Object o2 = o;
        if (c1o != null) {
            final int ordinal = ((Enum)c1o).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        en9.r();
                        return null;
                    }
                    if ((o2 = o) == null) {
                        o2 = resources.getString(2131757324);
                    }
                }
                else if (iuj == null) {
                    o2 = o;
                }
                else {
                    o2 = o;
                    if (iuj.a == 2 && (o2 = o) == null) {
                        o2 = resources.getString(2131758367);
                    }
                }
            }
            else if (iuj == null) {
                o2 = o;
            }
            else {
                o2 = o;
                if (iuj.a == 2 && (o2 = o) == null) {
                    o2 = resources.getString(2131758368);
                }
            }
        }
        Object g4;
        if ((g4 = v.g(etk.K)) == null) {
            g4 = null;
        }
        final Boolean b = (Boolean)g4;
        Object o3 = o2;
        Label_0361: {
            if (b != null) {
                final boolean booleanValue = b;
                if (iuj != null) {
                    if (iuj.a == 4) {
                        o3 = o2;
                        break Label_0361;
                    }
                }
                if ((o3 = o2) == null) {
                    if (booleanValue) {
                        o3 = resources.getString(2131758216);
                    }
                    else {
                        o3 = resources.getString(2131757669);
                    }
                }
            }
        }
        Object g5;
        if ((g5 = v.g(etk.c)) == null) {
            g5 = null;
        }
        final xth xth = (xth)g5;
        Object o4 = o3;
        if (xth != null) {
            if (xth != xth.d) {
                if ((o4 = o3) == null) {
                    final u55 b2 = xth.b;
                    final float w = b2.w;
                    final float v2 = b2.v;
                    float n;
                    if (((Number)Float.valueOf(w)).floatValue() - ((Number)Float.valueOf(v2)).floatValue() == 0.0f) {
                        n = 0.0f;
                    }
                    else {
                        n = (xth.a - ((Number)Float.valueOf(v2)).floatValue()) / (((Number)Float.valueOf(b2.w)).floatValue() - ((Number)Float.valueOf(v2)).floatValue());
                    }
                    float n2 = n;
                    if (n < 0.0f) {
                        n2 = 0.0f;
                    }
                    float n3 = n2;
                    if (n2 > 1.0f) {
                        n3 = 1.0f;
                    }
                    int o5;
                    if (n3 == 0.0f) {
                        o5 = 0;
                    }
                    else if (n3 == 1.0f) {
                        o5 = 100;
                    }
                    else {
                        o5 = ncq.o(Math.round(n3 * 100.0f), 1, 99);
                    }
                    o4 = resources.getString(2131758420, new Object[] { o5 });
                }
            }
            else if ((o4 = o3) == null) {
                o4 = resources.getString(2131757321);
            }
        }
        final htk g6 = etk.G;
        if (v.c(g6)) {
            final tmf v3 = new zsk(zsk.a, true, zsk.c, d2).k().v;
            Object g7;
            if ((g7 = v3.g(etk.a)) == null) {
                g7 = null;
            }
            final Collection collection = (Collection)g7;
            String string = null;
            Label_0777: {
                if (collection != null) {
                    string = s;
                    if (!collection.isEmpty()) {
                        break Label_0777;
                    }
                }
                Object g8;
                if ((g8 = v3.g(etk.C)) == null) {
                    g8 = null;
                }
                final Collection collection2 = (Collection)g8;
                if (collection2 != null) {
                    string = s;
                    if (!collection2.isEmpty()) {
                        break Label_0777;
                    }
                }
                Object g9;
                if ((g9 = v3.g(g6)) == null) {
                    g9 = null;
                }
                final CharSequence charSequence = (CharSequence)g9;
                if (charSequence != null) {
                    string = s;
                    if (charSequence.length() != 0) {
                        break Label_0777;
                    }
                }
                string = resources.getString(2131758366);
            }
            o4 = string;
        }
        return (String)o4;
    }
    
    public static final og0 y(final zsk zsk) {
        final Object g = zsk.d.v.g(etk.G);
        final og0 og0 = null;
        Object o = g;
        if (g == null) {
            o = null;
        }
        final og0 og2 = (og0)o;
        Object g2;
        if ((g2 = zsk.d.v.g(etk.C)) == null) {
            g2 = null;
        }
        final List list = (List)g2;
        og0 og3 = og0;
        if (list != null) {
            og3 = (og0)c86.I0(list);
        }
        if (og2 == null) {
            return og3;
        }
        return og2;
    }
    
    public static final int z(final Layout layout, final int n, final boolean b) {
        if (n <= 0) {
            return 0;
        }
        if (n >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        final int lineForOffset = layout.getLineForOffset(n);
        final int lineStart = layout.getLineStart(lineForOffset);
        final int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == n || lineEnd == n) {
            if (lineStart == n) {
                if (b) {
                    return lineForOffset - 1;
                }
            }
            else if (!b) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
    
    public abstract String p(final byte[] p0, final int p1, final int p2);
    
    public abstract int r(final String p0, final byte[] p1, final int p2, final int p3);
}
