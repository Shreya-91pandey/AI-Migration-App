import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import java.util.Map;
import android.content.pm.ActivityInfo;
import android.os.Parcelable;
import android.net.Uri;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import android.content.pm.Signature;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Collections;
import android.content.pm.ResolveInfo;
import android.content.Context;
import sun.misc.Unsafe;
import kotlinx.coroutines.DispatchException;
import androidx.compose.foundation.ScrollingLayoutElement;
import java.util.HashMap;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import android.os.SystemClock;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.content.Intent;

public abstract class rhc
{
    public static final ux8 a;
    public static final cib b;
    
    public static final String A(final Intent intent, final String s) {
        try {
            final String stringExtra = intent.getStringExtra(s);
            if (stringExtra == null) {
                X(intent, s, "String");
            }
            return stringExtra;
        }
        finally {
            final Throwable t;
            C(intent, s, "String", t);
            return null;
        }
    }
    
    public static final void C(Intent string, final String s, final String s2, final Throwable t) {
        String s3 = null;
        if (Build$VERSION.SDK_INT < 33) {
            string.replaceExtras((Bundle)null);
            s3 = oz1.p(oz1.t("Extras map fails to unparcel reading \"", s, "\" (", t4r.e(t), ") where "), s2, " was expected; clearing extras.");
        }
        else {
            try {
                string.removeExtra(s);
                final String e = t4r.e(t);
                final StringBuilder sb = new StringBuilder("Extra \"");
                sb.append(s);
                sb.append("\" fails to unparcel (");
                sb.append(e);
                sb.append(") where ");
                sb.append(s2);
                sb.append(" was expected; dropping the key.");
                string = (Intent)sb.toString();
            }
            finally {
                string.replaceExtras((Bundle)null);
                s3 = oz1.p(oz1.t("Extras map fails to unparcel reading \"", s, "\" (", t4r.e(t), ") where "), s2, " was expected; clearing extras.");
            }
        }
        r6k.a0(lq6.Y("intent_extra_read", "heal", s, s2), lpl.w, s3, SystemClock.elapsedRealtime(), null);
    }
    
    public static final boolean D(final i27 i27, final String s) {
        final List b = i27.b();
        if (b != null && ((Collection)b).isEmpty()) {
            return false;
        }
        final Iterator iterator = ((Iterable)b).iterator();
        while (iterator.hasNext()) {
            if (mlc.q(((u6f)iterator.next()).a, s)) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean E(final i27 i27) {
        final Iterable iterable = (Iterable)((Map)i27.c().h).values();
        if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
            final Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                if (!((gij)iterator.next()).c()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static final wmm F(final oc7 oc7, final hc7 hc7, final int n, final zta zta) {
        final hc7 m = twl.M(oc7, hc7);
        Object o;
        if (n == 2) {
            o = new g6d(m, zta);
        }
        else {
            o = new q0(m, true);
        }
        ((q0)o).n0(n, (q0)o, zta);
        return (wmm)o;
    }
    
    public static wmm G(final oc7 oc7, hc7 v, int n, final zta zta, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            v = (hc7)o89.v;
        }
        if ((n2 & 0x2) != 0x0) {
            n = 1;
        }
        return F(oc7, v, n, zta);
    }
    
    public static final igf H(final igf igf, final z3d z3d) {
        return igf.E((igf)new wp8(z3d));
    }
    
    public static final void I(final String s) {
        Log.i("PrewarmMarks", s);
    }
    
    public static final List J(final String s) {
        if (s != null && s.length() != 0) {
            final List m1 = kym.m1((CharSequence)s, new String[] { "," }, 0, 6);
            final ArrayList list = new ArrayList(d86.p0((Iterable)m1, 10));
            final Iterator iterator = ((Iterable)m1).iterator();
            while (iterator.hasNext()) {
                list.add((Object)kym.B1((CharSequence)iterator.next()).toString());
            }
            return (List)list;
        }
        return (List)r89.v;
    }
    
    public static final int L(final gna gna, final int n) {
        final int ordinal = ((Enum)gna.t1()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return 2;
                }
                if (ordinal != 3) {
                    en9.r();
                    return 0;
                }
            }
            else {
                final gna j = elq.j(gna);
                if (j == null) {
                    en9.s("ActiveParent with no focused child");
                    return 0;
                }
                int l;
                if ((l = L(j, n)) == 1) {
                    l = 0;
                }
                if (l != 0) {
                    return l;
                }
                if (!gna.L) {
                    gna.L = true;
                    Label_0213: {
                        Object h;
                        try {
                            final sma q1 = gna.q1();
                            final g13 g13 = new g13(n);
                            h = soh.M((t98)gna).getFocusOwner();
                            ((pma)h).h();
                            q1.k.b(g13);
                            h = ((pma)h).h();
                            if (g13.b) {
                                final xma b = xma.b;
                                gna.L = false;
                                return 2;
                            }
                        }
                        finally {
                            break Label_0213;
                        }
                        final Throwable t;
                        if (t == h || h == null) {
                            gna.L = false;
                            return 1;
                        }
                        if (xma.d == xma.c) {
                            gna.L = false;
                            return 2;
                        }
                        gna.L = false;
                        return 3;
                    }
                    gna.L = false;
                }
            }
        }
        return 1;
    }
    
    public static final int M(final gna gna, final int n) {
        if (!gna.M) {
            gna.M = true;
            Label_0134: {
                Object o;
                try {
                    o = gna.q1();
                    final g13 g13 = new g13(n);
                    final pma pma = (pma)soh.M((t98)gna).getFocusOwner();
                    pma.h();
                    ((sma)o).j.b(g13);
                    o = pma.h();
                    if (g13.b) {
                        final xma b = xma.b;
                        gna.M = false;
                        return 2;
                    }
                }
                finally {
                    break Label_0134;
                }
                final Throwable t;
                if (t == o || o == null) {
                    gna.M = false;
                    return 1;
                }
                if (xma.d == xma.c) {
                    gna.M = false;
                    return 2;
                }
                gna.M = false;
                return 3;
            }
            gna.M = false;
        }
        return 1;
    }
    
    public static final int N(gna j, final int n) {
        final int ordinal = ((Enum)j.t1()).ordinal();
        if (ordinal != 0) {
            final int n2 = 0;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        en9.r();
                        return 0;
                    }
                    if (!((hgf)j).v.I) {
                        gac.c("visitAncestors called on an unattached node");
                    }
                    final hgf z = ((hgf)j).v.z;
                    LayoutNode layoutNode = soh.L((t98)j);
                    Object o = z;
                    Object g = null;
                Label_0362:
                    while (true) {
                        g = null;
                        if (layoutNode == null) {
                            break;
                        }
                        if ((((hgf)layoutNode.Z.B).y & 0x400) != 0x0) {
                            for (Object z2 = o; z2 != null; z2 = ((hgf)z2).z) {
                                if ((((hgf)z2).x & 0x400) != 0x0) {
                                    g = z2;
                                    inf inf = null;
                                    while (g != null) {
                                        if (g instanceof gna) {
                                            break Label_0362;
                                        }
                                        inf inf2 = inf;
                                        if ((((hgf)g).x & 0x400) != 0x0) {
                                            inf2 = inf;
                                            if (g instanceof v98) {
                                                hgf hgf = ((v98)g).K;
                                                int n3 = 0;
                                                while (hgf != null) {
                                                    v98 v98 = (v98)g;
                                                    inf inf3 = inf;
                                                    int n4 = n3;
                                                    if ((hgf.x & 0x400) != 0x0) {
                                                        n4 = n3 + 1;
                                                        if (n4 == 1) {
                                                            v98 = (v98)hgf;
                                                            inf3 = inf;
                                                        }
                                                        else {
                                                            inf inf4;
                                                            if ((inf4 = inf) == null) {
                                                                inf4 = new inf(0, (Object[])new hgf[16]);
                                                            }
                                                            v98 v99;
                                                            if ((v99 = (v98)g) != null) {
                                                                inf4.b(g);
                                                                v99 = null;
                                                            }
                                                            inf4.b((Object)hgf);
                                                            inf3 = inf4;
                                                            v98 = v99;
                                                        }
                                                    }
                                                    hgf = hgf.A;
                                                    g = v98;
                                                    inf = inf3;
                                                    n3 = n4;
                                                }
                                                inf2 = inf;
                                                if (n3 == 1) {
                                                    continue;
                                                }
                                            }
                                        }
                                        g = soh.G(inf2);
                                        inf = inf2;
                                    }
                                }
                            }
                        }
                        layoutNode = layoutNode.G();
                        if (layoutNode != null) {
                            final rxf z3 = layoutNode.Z;
                            if (z3 != null) {
                                o = z3.A;
                                continue;
                            }
                        }
                        o = null;
                    }
                    j = (gna)g;
                    if (j != null) {
                        final int ordinal2 = ((Enum)j.t1()).ordinal();
                        if (ordinal2 == 0) {
                            return M(j, n);
                        }
                        if (ordinal2 == 1) {
                            return N(j, n);
                        }
                        if (ordinal2 == 2) {
                            return 2;
                        }
                        if (ordinal2 != 3) {
                            en9.r();
                            return 0;
                        }
                        int n5 = N(j, n);
                        if (n5 == 1) {
                            n5 = n2;
                        }
                        if (n5 == 0) {
                            return M(j, n);
                        }
                        return n5;
                    }
                }
            }
            else {
                j = elq.j(j);
                if (j != null) {
                    return L(j, n);
                }
                en9.s("ActiveParent with no focused child");
                return 0;
            }
        }
        return 1;
    }
    
    public static final boolean O(final gna gna) {
        final pma pma = (pma)soh.M((t98)gna).getFocusOwner();
        final gna h = pma.h();
        final bna t1 = gna.t1();
        if (h == gna) {
            gna.p1(t1, t1);
            return true;
        }
        if (h == null || h.J) {
            if (!gna.J && !((pma)soh.M((t98)gna).getFocusOwner()).a.E()) {
                return false;
            }
        }
        inf inf2;
        if (h != null) {
            final inf inf = new inf(0, (Object[])new gna[16]);
            if (!((hgf)h).v.I) {
                gac.c("visitAncestors called on an unattached node");
            }
            Object z = ((hgf)h).v.z;
            LayoutNode layoutNode = soh.L((t98)h);
            while (true) {
                inf2 = inf;
                if (layoutNode == null) {
                    break;
                }
                if ((((hgf)layoutNode.Z.B).y & 0x400) != 0x0) {
                    for (Object z2 = z; z2 != null; z2 = ((hgf)z2).z) {
                        if ((((hgf)z2).x & 0x400) != 0x0) {
                            hgf g = (hgf)z2;
                            inf inf3 = null;
                            while (g != null) {
                                inf inf4;
                                if (g instanceof gna) {
                                    inf.b((Object)g);
                                    inf4 = inf3;
                                }
                                else {
                                    inf4 = inf3;
                                    if ((g.x & 0x400) != 0x0) {
                                        inf4 = inf3;
                                        if (g instanceof v98) {
                                            hgf hgf = ((v98)g).K;
                                            int n = 0;
                                            while (hgf != null) {
                                                v98 v98 = (v98)g;
                                                inf inf5 = inf3;
                                                int n2 = n;
                                                if ((hgf.x & 0x400) != 0x0) {
                                                    n2 = n + 1;
                                                    if (n2 == 1) {
                                                        v98 = (v98)hgf;
                                                        inf5 = inf3;
                                                    }
                                                    else {
                                                        inf inf6;
                                                        if ((inf6 = inf3) == null) {
                                                            inf6 = new inf(0, (Object[])new hgf[16]);
                                                        }
                                                        v98 v99;
                                                        if ((v99 = (v98)g) != null) {
                                                            inf6.b((Object)g);
                                                            v99 = null;
                                                        }
                                                        inf6.b((Object)hgf);
                                                        inf5 = inf6;
                                                        v98 = v99;
                                                    }
                                                }
                                                hgf = hgf.A;
                                                g = v98;
                                                inf3 = inf5;
                                                n = n2;
                                            }
                                            inf4 = inf3;
                                            if (n == 1) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                g = soh.G(inf4);
                                inf3 = inf4;
                            }
                        }
                    }
                }
                layoutNode = layoutNode.G();
                if (layoutNode != null) {
                    final rxf z3 = layoutNode.Z;
                    if (z3 != null) {
                        z = z3.A;
                        continue;
                    }
                }
                z = null;
            }
        }
        else {
            inf2 = null;
        }
        Object[] array = new gna[16];
        Object[] array2 = new gna[16];
        if (!((hgf)gna).v.I) {
            gac.c("visitAncestors called on an unattached node");
        }
        Object o = ((hgf)gna).v.z;
        LayoutNode layoutNode2 = soh.L((t98)gna);
        int n3 = 1;
        int n4 = 0;
        int n5 = 0;
        pma pma2 = pma;
        while (layoutNode2 != null) {
            pma pma3 = pma2;
            Object[] array3 = array;
            Object[] array4 = array2;
            int n6 = n3;
            int n7 = n4;
            int n8 = n5;
            if ((((hgf)layoutNode2.Z.B).y & 0x400) != 0x0) {
                while (true) {
                    pma3 = pma2;
                    array3 = array;
                    array4 = array2;
                    n6 = n3;
                    n7 = n4;
                    n8 = n5;
                    if (o == null) {
                        break;
                    }
                    pma pma4 = pma2;
                    Object[] array5 = array;
                    Object[] array6 = array2;
                    int n9 = n3;
                    int n10 = n4;
                    int n11 = n5;
                    if ((((hgf)o).x & 0x400) != 0x0) {
                        Object g2 = o;
                        inf inf7 = null;
                    Label_1092_Outer:
                        while (true) {
                            pma4 = pma2;
                            array5 = array;
                            array6 = array2;
                            n9 = n3;
                            n10 = n4;
                            n11 = n5;
                            if (g2 != null) {
                                boolean b;
                                Object[] array9;
                                Object[] array10;
                                if (g2 instanceof gna) {
                                    final gna gna2 = (gna)g2;
                                    Boolean value;
                                    if (inf2 != null) {
                                        value = inf2.k((Object)gna2);
                                    }
                                    else {
                                        value = null;
                                    }
                                    if (mlc.q(value, Boolean.TRUE)) {
                                        final int n12 = n4 + 1;
                                        if (array.length < n12) {
                                            final int length = array.length;
                                            final Object[] array7 = new Object[Math.max(n12, length * 2)];
                                            System.arraycopy((Object)array, 0, (Object)array7, 0, length);
                                            array = array7;
                                        }
                                        array[n4] = gna2;
                                        n4 = n12;
                                    }
                                    else {
                                        final int n13 = n5 + 1;
                                        if (array2.length < n13) {
                                            final int length2 = array2.length;
                                            final Object[] array8 = new Object[Math.max(n13, length2 * 2)];
                                            System.arraycopy((Object)array2, 0, (Object)array8, 0, length2);
                                            array2 = array8;
                                        }
                                        array2[n5] = gna2;
                                        n5 = n13;
                                    }
                                    if (gna2 == h) {
                                        n3 = 0;
                                    }
                                    b = false;
                                    array9 = array;
                                    array10 = array2;
                                }
                                else {
                                    b = true;
                                    array10 = array2;
                                    array9 = array;
                                }
                                inf inf8 = inf7;
                                while (true) {
                                    Label_1103: {
                                        if (!b) {
                                            break Label_1103;
                                        }
                                        inf8 = inf7;
                                        if ((((hgf)g2).x & 0x400) == 0x0) {
                                            break Label_1103;
                                        }
                                        inf8 = inf7;
                                        if (!(g2 instanceof v98)) {
                                            break Label_1103;
                                        }
                                        final hgf k = ((v98)g2).K;
                                        int n14 = 0;
                                        inf inf9 = inf7;
                                        Object o2 = g2;
                                        int n15;
                                        Object o3;
                                        inf inf10;
                                        for (hgf a = k; a != null; a = a.A, n14 = n15, o2 = o3, inf9 = inf10) {
                                            n15 = n14;
                                            o3 = o2;
                                            inf10 = inf9;
                                            if ((a.x & 0x400) != 0x0) {
                                                n15 = n14 + 1;
                                                Object o4;
                                                if (n15 == 1) {
                                                    o4 = a;
                                                    inf10 = inf9;
                                                }
                                                else {
                                                    if (inf9 == null) {
                                                        inf10 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    else {
                                                        inf10 = inf9;
                                                    }
                                                    Object o5 = o2;
                                                    if (o2 != null) {
                                                        inf10.b(o2);
                                                        o5 = null;
                                                    }
                                                    inf10.b((Object)a);
                                                    o4 = o5;
                                                }
                                                o3 = o4;
                                            }
                                        }
                                        inf8 = inf9;
                                        if (n14 != 1) {
                                            break Label_1103;
                                        }
                                        inf7 = inf9;
                                        g2 = o2;
                                        array = array9;
                                        array2 = array10;
                                        continue Label_1092_Outer;
                                    }
                                    g2 = soh.G(inf8);
                                    inf7 = inf8;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    o = ((hgf)o).z;
                    pma2 = pma4;
                    array = array5;
                    array2 = array6;
                    n3 = n9;
                    n4 = n10;
                    n5 = n11;
                }
            }
            layoutNode2 = layoutNode2.G();
            Label_1188: {
                if (layoutNode2 != null) {
                    final rxf z4 = layoutNode2.Z;
                    if (z4 != null) {
                        o = z4.A;
                        break Label_1188;
                    }
                }
                o = null;
            }
            pma2 = pma3;
            array = array3;
            array2 = array4;
            n3 = n6;
            n4 = n7;
            n5 = n8;
        }
        if (n3 == 0 || h == null || Q(h, false)) {
            yi2.I((hgf)gna, (jta)new h87((Object)gna, (byte)11));
            final int ordinal = ((Enum)gna.t1()).ordinal();
            Label_1298: {
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            break Label_1298;
                        }
                        if (ordinal != 3) {
                            en9.r();
                            return false;
                        }
                    }
                    ((pma)soh.M((t98)gna).getFocusOwner()).k(gna);
                }
            }
            final bna x = bna.x;
            final bna v100 = bna.v;
            if (n3 != 0 && h != null) {
                h.p1(v100, x);
            }
            final bna w = bna.w;
            if (inf2 != null) {
                int i = inf2.x - 1;
                final Object[] v101 = inf2.v;
                if (i < v101.length) {
                    while (i >= 0) {
                        final gna gna3 = (gna)v101[i];
                        if (pma2.h() != gna) {
                            return false;
                        }
                        gna3.p1(w, x);
                        --i;
                    }
                }
            }
            int j = n5 - 1;
            if (j < array2.length) {
                while (j >= 0) {
                    final gna gna4 = (gna)array2[j];
                    if (pma2.h() != gna) {
                        return false;
                    }
                    bna bna;
                    if (gna4 == h) {
                        bna = v100;
                    }
                    else {
                        bna = x;
                    }
                    gna4.p1(bna, w);
                    --j;
                }
            }
            if (pma2.h() == gna) {
                gna.p1(t1, v100);
                if (pma2.h() == gna) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static hjh P(final String s, j9j j9j, zoc zoc, final int n) {
        if ((n & 0x2) != 0x0) {
            j9j = null;
        }
        if ((n & 0x4) != 0x0) {
            zoc = (zoc)new kmg((byte)27);
        }
        final o68 a = vo8.a;
        return new hjh(s, j9j, (lta)zoc, (oc7)ien.a(uuj.s0((hc7)d58.w, (hc7)omo.o())));
    }
    
    public static final boolean Q(final gna gna, final boolean b) {
        final int ordinal = ((Enum)gna.t1()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return b;
                }
                if (ordinal != 3) {
                    en9.r();
                    return false;
                }
            }
            else {
                final gna j = elq.j(gna);
                if (j == null || Q(j, b)) {
                    gna.p1(bna.w, bna.x);
                    return true;
                }
                return false;
            }
        }
        return true;
    }
    
    public static final int R(final int n, final String s) {
        return (s.charAt(n) << 7) + s.charAt(n + 1);
    }
    
    public static final efc S(final us4 us4, final Object o, final lta lta, final gva gva) {
        final hwj hwj = (hwj)gva.j((sei)iwj.a);
        final ci6 e = hwj.a.e();
        final boolean f = gva.f(o);
        final boolean f2 = gva.f((Object)e);
        final Object r = gva.R();
        Object o2;
        if ((f | f2) || (o2 = r) == bi6.a) {
            o2 = ((HashMap)e.b).get(o);
            if (o2 == null) {
                o2 = lta.b(hwj);
                e.l(o, (efc)o2);
            }
            gva.q0(o2);
        }
        return (efc)o2;
    }
    
    public static final ufk T(int n, int n2, final gva gva) {
        if ((n2 & 0x1) != 0x0) {
            n2 = 0;
        }
        else {
            n2 = Integer.MAX_VALUE;
        }
        if ((((n & 0xE) ^ 0x6) > 4 && gva.d(n2)) || (n & 0x6) == 0x4) {
            n = 1;
        }
        else {
            n = 0;
        }
        final Object r = gva.R();
        Object o;
        if (n != 0 || (o = r) == bi6.a) {
            o = new w5d(n2, (byte)1);
            gva.q0(o);
        }
        return (ufk)mlc.b0(new Object[0], (m9k)ufk.k, (jta)o, gva, 0);
    }
    
    public static final boolean U(final tmf tmf, final Object o, final Object obj) {
        final Object g = tmf.g(o);
        if (g == null) {
            return false;
        }
        if (g instanceof umf) {
            final umf umf = (umf)g;
            final boolean l = umf.l(obj);
            if (l && umf.g()) {
                tmf.k(o);
            }
            return l;
        }
        if (g.equals(obj)) {
            tmf.k(o);
            return true;
        }
        return false;
    }
    
    public static final void V(final tmf tmf, final Object o) {
        final long[] a = tmf.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            final Object o2 = tmf.b[n5];
                            final Object o3 = tmf.c[n5];
                            boolean g;
                            if (o3 instanceof umf) {
                                final umf umf = (umf)o3;
                                umf.l(o);
                                g = umf.g();
                            }
                            else {
                                g = (o3 == o);
                            }
                            if (g) {
                                tmf.l(n5);
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
    }
    
    public static final void W(final Object o, final String s, final String s2) {
        final List y = lq6.Y("intent_extra_read", "mismatch", s, s2);
        String name;
        if (o != null) {
            name = o.getClass().getName();
        }
        else {
            name = null;
        }
        r6k.a0(y, lpl.w, oz1.p(oz1.t("Extra \"", s, "\" holds ", name, " where "), s2, " was expected; reading as null."), SystemClock.elapsedRealtime(), null);
    }
    
    public static final void X(final Intent intent, String t, final String s) {
        if (!intent.hasExtra(t)) {
            return;
        }
        final List y = lq6.Y("intent_extra_read", "unreadable", t, s);
        t = lmf.t("Extra \"", t, "\" is present but does not read as ", s, "; reading as null.");
        r6k.a0(y, lpl.v, t, SystemClock.elapsedRealtime(), null);
    }
    
    public static final List Y(final Object o, final String s) {
        return lq6.Y(s, o);
    }
    
    public static igf Z(final igf igf, final ufk ufk, final boolean b, final boolean b2) {
        final zhg v = zhg.v;
        zhg w;
        if (b2) {
            w = v;
        }
        else {
            w = zhg.w;
        }
        final llf e = ufk.e;
        final fgf v2 = fgf.v;
        igf igf2;
        if (w == v) {
            igf2 = rml.k((igf)v2, ylb.c);
        }
        else {
            igf2 = rml.k((igf)v2, ylb.b);
        }
        return igf.E(igf2).E(new vfk(null, null, null, e, w, ufk, b, false, true)).E((igf)new ScrollingLayoutElement(ufk, b2));
    }
    
    public static final void a(final int n, final d74 d74, final jta jta, igf v, final gva gva, final int n2) {
        gva.i0(1141416185);
        int n3;
        if (gva.d(n)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.d(((Enum)d74).ordinal())) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        int n5;
        if (gva.h((Object)jta)) {
            n5 = 256;
        }
        else {
            n5 = 128;
        }
        final int n6 = n2 | n3 | n4 | n5 | 0xC00;
        if (gva.W(n6 & 0x1, (n6 & 0x493) != 0x492)) {
            kar.a(n > 0, lh0.B0, soh.E(d74.v, n, gva), jta, "Chat outputs action visibility", (String)null, gva, (n6 << 3 & 0x1C00) | 0x36000, 64);
            v = (igf)fgf.v;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new wf0(n, d74, jta, v, n2);
        }
    }
    
    public static final snj a0(final snj snj) {
        final qnj g = snj.g();
        final unj b = snj.B;
        g.g = (unj)new nro(b.n(), b.g());
        return g.a();
    }
    
    public static final void b(final qx8 qx8, final boolean b, final jta jta, final gva gva, final int n) {
        gva.i0(482907798);
        int n2;
        if (gva.f((Object)qx8)) {
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
        if (gva.h((Object)jta)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n2 | n | n3 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            final String c = qx8.c;
            final int d = ge9.D(qx8.d);
            Object a;
            if (d != 0) {
                if (d != 1) {
                    en9.r();
                    return;
                }
                a = q3r.a;
            }
            else {
                a = null;
            }
            final int a2 = lqf.a;
            long n6 = ((j86)gva.j((sei)dx6.a)).a;
            final cy4 a3 = qy4.a;
            long n7 = qy4.a(gva).A0;
            long n8 = j86.b(0.0f, qy4.a(gva).A0);
            if ((0x1 & 0xF4) != 0x0) {
                n7 = s86.d(31, gva);
            }
            if ((0xF4 & 0x2) != 0x0) {
                n8 = j86.g;
            }
            final long d2 = s86.d(14, gva);
            if ((0xF4 & 0x8) != 0x0) {
                n6 = s86.d(18, gva);
            }
            final long d3 = s86.d(14, gva);
            final long d4 = s86.d(18, gva);
            uoo.c(c, jta, null, b, (zta)uuj.t0(1859960590, (aua)new l0((Object)qx8, (byte)10), gva), (zta)a, new e48(d2, n6, d3, d4, n7, n8, d3, d4), (mnn)((uy4)qy4.c(gva).k.v).E, gva, (n5 >> 3 & 0x70) | 0x6000 | (n5 << 6 & 0x1C00));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new vx8(qx8, b, jta, n);
        }
    }
    
    public static void b0(final uad uad, qn1 qn1, jta jta, x5p x5p, x5p x5p2, jta jta2, jta jta3, final int n) {
        if ((n & 0x1) != 0x0) {
            qn1 = null;
        }
        if ((n & 0x2) != 0x0) {
            jta = null;
        }
        if ((n & 0x4) != 0x0) {
            x5p = null;
        }
        if ((n & 0x8) != 0x0) {
            x5p2 = null;
        }
        if ((n & 0x10) != 0x0) {
            jta2 = null;
        }
        if ((n & 0x20) != 0x0) {
            jta3 = null;
        }
        uad.h((oad)new dbd((jta)qn1, jta, (jta)x5p, (jta)x5p2, jta2, jta3));
    }
    
    public static final long c(int c, final int n) {
        if (c < 0 || n < 0) {
            final StringBuilder sb = new StringBuilder("start and end cannot be negative. [start: ");
            sb.append(c);
            sb.append(", end: ");
            sb.append(n);
            sb.append("]");
            hac.a(sb.toString());
        }
        final long n2 = c;
        final long n3 = n;
        c = dnn.c;
        return (n3 & 0xFFFFFFFFL) | n2 << 32;
    }
    
    public static final String c0(final long n, final CharSequence charSequence) {
        return charSequence.subSequence(dnn.g(n), dnn.f(n)).toString();
    }
    
    public static final void d(final tmf tmf, final Object o, Object o2) {
        final int f = tmf.f(o);
        final boolean b = f < 0;
        Object o3;
        if (b) {
            o3 = null;
        }
        else {
            o3 = tmf.c[f];
        }
        Label_0106: {
            if (o3 != null) {
                if (o3 instanceof umf) {
                    ((umf)o3).a(o2);
                }
                else if (o3 != o2) {
                    final umf umf = new umf();
                    umf.a(o3);
                    umf.a(o2);
                    o2 = umf;
                    break Label_0106;
                }
                o2 = o3;
            }
        }
        if (b) {
            final int n = ~f;
            tmf.b[n] = o;
            tmf.c[n] = o2;
            return;
        }
        tmf.c[f] = o2;
    }
    
    public static String d0(final long n) {
        if (p(n, 12884901888L)) {
            return "Rgb";
        }
        if (p(n, 12884901889L)) {
            return "Xyz";
        }
        if (p(n, 12884901890L)) {
            return "Lab";
        }
        if (p(n, 17179869187L)) {
            return "Cmyk";
        }
        return "Unknown";
    }
    
    public static final byte[] e(final String s) {
        final byte[] bytes = s.getBytes(ui3.a);
        bytes.getClass();
        return bytes;
    }
    
    public static igf e0(final igf igf, final ufk ufk, final int n) {
        return Z(igf, ufk, (n & 0x2) != 0x0, true);
    }
    
    public static b98 f(final oc7 oc7, hc7 v, int n, final zta zta, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            v = (hc7)o89.v;
        }
        if ((n2 & 0x2) != 0x0) {
            n = 1;
        }
        final hc7 m = twl.M(oc7, v);
        Object o;
        if (n == 2) {
            o = new h2d(m, zta);
        }
        else {
            o = new q0(m, true);
        }
        ((q0)o).n0(n, (q0)o, zta);
        return (b98)o;
    }
    
    public static final Object f0(hc7 hc7, final zta zta, f07 c) {
        final hc7 context = ((f07)c).getContext();
        if (!(boolean)hc7.V((zta)new rg6((byte)7), (Object)Boolean.FALSE)) {
            hc7 = context.F0(hc7);
        }
        else {
            hc7 = twl.t(context, hc7, false);
        }
        x90.u(hc7);
        if (hc7 == context) {
            final mdk mdk = new mdk((f07)c, hc7);
            return t08.m0(mdk, true, (Object)mdk, zta);
        }
        final p3 x = p3.x;
        if (mlc.q(hc7.M0((gc7)x), context.M0((gc7)x))) {
            final zpo zpo = new zpo((f07)c, hc7);
            hc7 = ((q0)zpo).y;
            c = asn.c(hc7, (Object)null);
            try {
                return t08.m0((mdk)zpo, true, (Object)zpo, zta);
            }
            finally {
                asn.a(hc7, c);
            }
        }
        c = new mdk((f07)c, hc7);
        try {
            po8.a(ljq.K(ljq.z((f07)c, (f07)c, zta)), (Object)lqo.a);
            Unsafe a;
            long a2;
            do {
                a = u51.a;
                a2 = qo8.A;
                final int intVolatile = a.getIntVolatile(c, a2);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        en9.q("Already suspended");
                        return null;
                    }
                    final Object a3 = cqc.a(((bqc)c).K());
                    if (!(a3 instanceof cd6)) {
                        return a3;
                    }
                    throw ((cd6)a3).a;
                }
            } while (!a.compareAndSwapInt(c, a2, 0, 1));
            return pc7.v;
        }
        finally {
            final DispatchException ex;
            Object v = ex;
            if (ex instanceof DispatchException) {
                v = ex.v;
            }
            ((q0)c).resumeWith((Object)new jpj((Throwable)v));
        }
    }
    
    public static igf g(final igf igf, final qm2 qm2) {
        return igf.E(new kp1(0L, qm2, zn2.k, 1));
    }
    
    public static final igf h(final igf igf, final long n, final aql aql) {
        return igf.E(new kp1(n, null, aql, 2));
    }
    
    public static igf i(final long n, final igf igf) {
        return h(igf, n, zn2.k);
    }
    
    public static final long j(int n, final long n2) {
        final int c = dnn.c;
        final int n3 = (int)(n2 >> 32);
        final int n4 = 0;
        int n5;
        if (n3 < 0) {
            n5 = 0;
        }
        else {
            n5 = n3;
        }
        int n6 = n5;
        if (n5 > n) {
            n6 = n;
        }
        final int n7 = (int)(0xFFFFFFFFL & n2);
        int n8;
        if (n7 < 0) {
            n8 = n4;
        }
        else {
            n8 = n7;
        }
        if (n8 <= n) {
            n = n8;
        }
        if (n6 == n3 && n == n7) {
            return n2;
        }
        return c(n6, n);
    }
    
    public static tmf k() {
        final long[] a = jak.a;
        return new tmf();
    }
    
    public static foa l(final Context context) {
        qdr qdr;
        if (Build$VERSION.SDK_INT >= 28) {
            qdr = new qdr((byte)29);
        }
        else {
            qdr = new qdr((byte)29);
        }
        final PackageManager packageManager = context.getPackageManager();
        lq6.t(packageManager, "Package manager required to locate emoji font provider");
        final Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        int i = 0;
        final Iterator iterator = packageManager.queryIntentContentProviders(intent, 0).iterator();
        foa foa;
        ProviderInfo providerInfo;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            foa = null;
            if (!hasNext) {
                providerInfo = null;
                break;
            }
            providerInfo = ((ResolveInfo)iterator.next()).providerInfo;
            if (providerInfo == null) {
                continue;
            }
            final ApplicationInfo applicationInfo = providerInfo.applicationInfo;
            if (applicationInfo != null && (applicationInfo.flags & 0x1) == 0x1) {
                break;
            }
        }
        doa doa = null;
        Label_0249: {
            Label_0145: {
                if (providerInfo != null) {
                    try {
                        final String authority = providerInfo.authority;
                        final String packageName = providerInfo.packageName;
                        final Signature[] u = qdr.u(packageManager, packageName);
                        final ArrayList list = new ArrayList();
                        while (i < u.length) {
                            list.add((Object)u[i].toByteArray());
                            ++i;
                        }
                        doa = new doa(authority, packageName, Collections.singletonList((Object)list));
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        Log.wtf("emoji2.text.DefaultEmojiConfig", (Throwable)ex);
                        break Label_0145;
                    }
                    break Label_0249;
                }
            }
            doa = null;
        }
        foa foa2;
        if (doa == null) {
            foa2 = foa;
        }
        else {
            foa2 = new foa(context, doa);
        }
        return foa2;
    }
    
    public static final xd9 m(final String s, final Enum[] array, final String[] array2, final Annotation[][] array3) {
        final rd9 rd9 = new rd9(s, array.length);
        for (int length = array.length, i = 0, n = 0; i < length; ++i, ++n) {
            final Enum enum1 = array[i];
            String name;
            if ((name = (String)iw0.a1(n, (Object[])array2)) == null) {
                name = enum1.name();
            }
            ((PluginGeneratedSerialDescriptor)rd9).l(name, false);
            final Annotation[] array4 = (Annotation[])iw0.a1(n, (Object[])array3);
            if (array4 != null) {
                for (int length2 = array4.length, j = 0; j < length2; ++j) {
                    ((PluginGeneratedSerialDescriptor)rd9).m(array4[j]);
                }
            }
        }
        return new xd9(s, array, rd9);
    }
    
    public static tcp o(final Class clazz) {
        try {
            final Constructor declaredConstructor = clazz.getDeclaredConstructor((Class[])null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                Label_0052: {
                    try {
                        final Object instance = declaredConstructor.newInstance((Object[])null);
                        instance.getClass();
                        return (tcp)instance;
                    }
                    catch (final IllegalAccessException ex) {}
                    catch (final InstantiationException ex2) {
                        break Label_0052;
                    }
                    final IllegalAccessException ex;
                    oyl.m("Cannot create an instance of ", (Object)clazz, (Throwable)ex);
                    return null;
                }
                final InstantiationException ex2;
                oyl.m("Cannot create an instance of ", (Object)clazz, (Throwable)ex2);
                return null;
            }
            final StringBuilder sb = new StringBuilder("Cannot create an instance of ");
            sb.append((Object)clazz);
            throw new RuntimeException(sb.toString());
        }
        catch (final NoSuchMethodException ex3) {
            oyl.m("Cannot create an instance of ", (Object)clazz, (Throwable)ex3);
            return null;
        }
    }
    
    public static final boolean p(final long n, final long n2) {
        return n == n2;
    }
    
    public static final Object q(zvl v, final h07 h07) {
        awl awl2 = null;
        Label_0048: {
            if (h07 instanceof awl) {
                final awl awl = (awl)h07;
                final int x = awl.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    awl.x = x + Integer.MIN_VALUE;
                    awl2 = awl;
                    break Label_0048;
                }
            }
            awl2 = new awl(h07);
        }
        final Object w = awl2.w;
        final int x2 = awl2.x;
        final pc7 v2 = pc7.v;
        if (x2 != 0) {
            if (x2 != 1) {
                if (x2 == 2) {
                    vt4.g0(w);
                    return lqo.a;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                v = awl2.v;
                vt4.g0(w);
            }
        }
        else {
            vt4.g0(w);
            final n6k a0 = ljq.a0((jta)new scf(v, (byte)1));
            final eh eh = new eh((byte)16);
            awl2.v = v;
            awl2.x = 1;
            if (vt4.A((ija)a0, (zta)eh, (f07)awl2) == v2) {
                return v2;
            }
        }
        awl2.v = null;
        awl2.x = 2;
        if (v.c((h07)awl2) != v2) {
            return lqo.a;
        }
        return v2;
    }
    
    public static zbp r(final zrc zrc) {
        Label_0118: {
            Label_0109: {
                Label_0100: {
                    Long value = null;
                    Label_0037: {
                        try {
                            final irc o = zrc.o("records_count");
                            if (o != null) {
                                value = o.f();
                                break Label_0037;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0100;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0109;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0118;
                        }
                        value = null;
                    }
                    final irc o2 = zrc.o("segments_count");
                    Long value2;
                    if (o2 != null) {
                        value2 = o2.f();
                    }
                    else {
                        value2 = null;
                    }
                    final irc o3 = zrc.o("segments_total_raw_size");
                    Long value3;
                    if (o3 != null) {
                        value3 = o3.f();
                    }
                    else {
                        value3 = null;
                    }
                    return new zbp(value, value2, value3);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ReplayStats", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ReplayStats", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ReplayStats", (Throwable)ex3);
        return null;
    }
    
    public static ApiException s(final Status status) {
        if (status.x != null) {
            return (ApiException)new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
    
    public static final boolean t(final Intent intent, final String s, final boolean b) {
        try {
            return intent.getBooleanExtra(s, b);
        }
        finally {
            final Throwable t;
            C(intent, s, "Boolean", t);
            return b;
        }
    }
    
    public static final CharSequence u(final Intent intent, final String s) {
        try {
            final CharSequence charSequenceExtra = intent.getCharSequenceExtra(s);
            if (charSequenceExtra == null) {
                X(intent, s, "CharSequence");
            }
            return charSequenceExtra;
        }
        finally {
            final Throwable t;
            C(intent, s, "CharSequence", t);
            return null;
        }
    }
    
    public static final int v(final Intent intent, final String s, final int n) {
        try {
            return intent.getIntExtra(s, n);
        }
        finally {
            final Throwable t;
            C(intent, s, "Int", t);
            return n;
        }
    }
    
    public static final String w(final Intent intent, final String s) {
        final String a = A(intent, s);
        if (a != null && !kym.Y0((CharSequence)a)) {
            return a;
        }
        return null;
    }
    
    public static final ArrayList x(final Intent intent) {
        final String k = hia.k("ArrayList<", Uri.class.getName(), ">");
        final ArrayList list = null;
        ArrayList list3 = null;
        Label_0080: {
            Label_0068: {
                ArrayList list2 = null;
                Label_0048: {
                    try {
                        if (Build$VERSION.SDK_INT >= 34) {
                            list2 = od.m(intent);
                            break Label_0048;
                        }
                    }
                    finally {
                        break Label_0068;
                    }
                    list2 = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                }
                list3 = list2;
                if (list2 == null) {
                    X(intent, "android.intent.extra.STREAM", k);
                    list3 = list2;
                }
                break Label_0080;
            }
            final Throwable t;
            C(intent, "android.intent.extra.STREAM", k, t);
            list3 = null;
        }
        if (list3 == null) {
            return null;
        }
        final Iterator iterator = ((List)list3).iterator();
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                if (!Uri.class.isInstance(iterator.next())) {
                    ArrayList list4;
                    if (n >= 0) {
                        W(list3.get(n), "android.intent.extra.STREAM", k);
                        list4 = list;
                    }
                    else {
                        list4 = list3;
                    }
                    return list4;
                }
                ++n;
            }
            n = -1;
            continue;
        }
    }
    
    public static final Parcelable y(final Intent intent, final String s, final Class clazz) {
        final String name = clazz.getName();
        final Parcelable parcelable = null;
        Object o = null;
        Label_0071: {
            final Parcelable parcelableExtra;
            Label_0060: {
                Label_0040: {
                    try {
                        if (Build$VERSION.SDK_INT >= 34) {
                            final Parcelable parcelable2 = (Parcelable)od.k(intent, s, clazz);
                            break Label_0040;
                        }
                    }
                    finally {
                        break Label_0060;
                    }
                    parcelableExtra = intent.getParcelableExtra(s);
                }
                o = parcelableExtra;
                if (parcelableExtra == null) {
                    X(intent, s, name);
                    o = parcelableExtra;
                }
                break Label_0071;
            }
            C(intent, s, name, (Throwable)parcelableExtra);
            o = null;
        }
        Parcelable parcelable3;
        if (clazz.isInstance(o)) {
            parcelable3 = clazz.cast(o);
        }
        else {
            parcelable3 = parcelable;
            if (o != null) {
                W(o, s, clazz.getName());
                parcelable3 = parcelable;
            }
        }
        return parcelable3;
    }
    
    public static final CharSequence z(final Intent intent, String t) {
        Label_0024: {
            try {
                final Bundle a = g9j.a(intent);
                if (a != null) {
                    return a.getCharSequence(t);
                }
            }
            finally {
                break Label_0024;
            }
            return null;
        }
        final List y = lq6.Y("intent_extra_read", "remoteinput", t);
        final Throwable t2;
        t = lmf.t("RemoteInput results for \"", t, "\" fail to unparcel (", t4r.e(t2), "); reading as null.");
        r6k.a0(y, lpl.w, t, SystemClock.elapsedRealtime(), null);
        return null;
    }
    
    public w4 B(final Context context, final Object o) {
        return null;
    }
    
    public abstract Object K(final int p0, final Intent p1);
    
    public Intent n(final Context context, final Object o) {
        final r7h r7h = (r7h)o;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 33) {
            if (sdk_INT < 30 || fe.a() < 2) {
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    final Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent.setType(n6r.e(r7h.a));
                    if (intent.getType() == null) {
                        intent.setType("*/*");
                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[] { "image/*", "video/*" });
                    }
                    return intent;
                }
                final ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveActivity != null) {
                    final ActivityInfo activityInfo = resolveActivity.activityInfo;
                    final Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(n6r.e(r7h.a));
                    r7h.b.getClass();
                    intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent2;
                }
                en9.q("Required value was null.");
                return null;
            }
        }
        final Intent intent3 = new Intent("android.provider.action.PICK_IMAGES");
        intent3.setType(n6r.e(r7h.a));
        r7h.b.getClass();
        intent3.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }
}
