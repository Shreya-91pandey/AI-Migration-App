import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import android.webkit.WebView;
import android.os.Build$VERSION;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.lang.reflect.InvocationHandler;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import android.graphics.Bitmap;
import com.anthropic.claude.types.strings.OrganizationId;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import android.graphics.Path;
import android.graphics.Path$FillType;
import java.time.Instant;
import android.graphics.Bitmap$Config;
import java.util.Iterator;
import com.anthropic.claude.types.strings.SessionId;
import android.view.accessibility.AccessibilityManager;
import android.content.Context;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public abstract class ien
{
    public static final ye6 a;
    public static final ye6 b;
    public static final cib c;
    public static final nsn d;
    
    public static final igf A(final gva gva, igf igf) {
        if (igf.e((lta)new mz5((byte)24))) {
            return igf;
        }
        gva.h0(1219399079);
        igf = (igf)igf.a((zta)new l0((Object)gva, (byte)6), (Object)fgf.v);
        gva.q(false);
        return igf;
    }
    
    public static final igf B(final gva gva, igf a) {
        gva.g0(439770924);
        a = A(gva, a);
        gva.q(false);
        return a;
    }
    
    public static List C(final y5m y5m, int n, final y5m y5m2, final boolean b, final boolean b2, final boolean b3) {
        final int t = y5m.t(n);
        final int n2 = n + t;
        final int f = y5m.f(y5m.b, y5m.q(n));
        final int f2 = y5m.f(y5m.b, y5m.q(n2));
        final int n3 = f2 - f;
        final boolean b4 = n >= 0 && (y5m.b[y5m.q(n) * 5 + 1] & 0xC000000) != 0x0;
        y5m2.v(t);
        y5m2.w(n3, y5m2.t);
        if (y5m.g < n2) {
            y5m.A(n2);
        }
        if (y5m.k < f2) {
            y5m.B(f2, n2);
        }
        final int[] b5 = y5m2.b;
        final int t2 = y5m2.t;
        final int[] b6 = y5m.b;
        final int n4 = t2 * 5;
        iw0.J0(n4, n * 5, n2 * 5, b6, b5);
        final Object[] c = y5m2.c;
        final int i = y5m2.i;
        System.arraycopy((Object)y5m.c, f, (Object)c, i, n3);
        final int v = y5m2.v;
        b5[n4 + 2] = v;
        final int n5 = t2 - n;
        final int t3 = t2 + t;
        final int f3 = y5m2.f(b5, t2);
        int m = y5m2.m;
        final int l = y5m2.l;
        final int length = c.length;
        int n7;
        for (int j = t2; j < t3; ++j, m = n7) {
            if (j != t2) {
                final int n6 = j * 5 + 2;
                b5[n6] += n5;
            }
            final int f4 = y5m2.f(b5, j);
            int k;
            if (m < j) {
                k = 0;
            }
            else {
                k = y5m2.k;
            }
            b5[j * 5 + 4] = y5m.h(f4 + (i - f3), k, l, length);
            n7 = m;
            if (j == m) {
                n7 = m + 1;
            }
        }
        y5m2.m = m;
        final int b7 = x5m.b(y5m.d, n, y5m.o());
        final int b8 = x5m.b(y5m.d, n2, y5m.o());
        Object v2;
        if (b7 < b8) {
            final ArrayList d = y5m.d;
            v2 = new ArrayList(b8 - b7);
            for (int n8 = b7; n8 < b8; ++n8) {
                final bva bva = (bva)d.get(n8);
                bva.a += n5;
                ((ArrayList)v2).add((Object)bva);
            }
            y5m2.d.addAll(x5m.b(y5m2.d, y5m2.t, y5m2.o()), (Collection)v2);
            d.subList(b7, b8).clear();
        }
        else {
            v2 = r89.v;
        }
        if (!((Collection)v2).isEmpty()) {
            final HashMap e = y5m.e;
            final HashMap e2 = y5m2.e;
            if (e != null && e2 != null) {
                for (int size = ((Collection)v2).size(), n9 = 0; n9 < size; ++n9) {
                    final iva iva = (iva)e.get((Object)((List)v2).get(n9));
                }
            }
        }
        final int v3 = y5m2.v;
        y5m2.P(v);
        final int f5 = y5m.F(y5m.b, n);
        boolean b9;
        if (!b3) {
            b9 = false;
        }
        else if (b) {
            final boolean b10 = f5 >= 0;
            if (b10) {
                y5m.Q();
                y5m.a(f5 - y5m.t);
                y5m.Q();
            }
            y5m.a(n - y5m.t);
            b9 = y5m.I();
            if (b10) {
                y5m.N();
                y5m.i();
                y5m.N();
                y5m.i();
            }
        }
        else {
            b9 = y5m.J(n, t);
            y5m.K(f, n3, n - 1);
        }
        if (b9) {
            ti6.a("Unexpectedly removed anchors");
        }
        final int o = y5m2.o;
        n = b5[n4 + 1];
        if ((0x40000000 & n) != 0x0) {
            n = 1;
        }
        else {
            n &= 0x3FFFFFF;
        }
        y5m2.o = o + n;
        if (b2) {
            y5m2.t = t3;
            y5m2.i = i + n3;
        }
        if (b4) {
            y5m2.V(v);
        }
        return (List)v2;
    }
    
    public static final igf D(final igf igf, final lta lta) {
        return igf.E((igf)new p8g(lta));
    }
    
    public static final mm4 E(final String s, final jta jta, final gva gva) {
        final odk a = ii8.a(gva);
        final boolean f = gva.f(null);
        final boolean f2 = gva.f(a);
        final Object r = gva.R();
        final cib a2 = bi6.a;
        Object o;
        if ((f | f2) || (o = r) == a2) {
            o = a.d((Class)st4.class, (emi)null);
            gva.q0(o);
        }
        final st4 st4 = (st4)o;
        final odk a3 = ii8.a(gva);
        final boolean f3 = gva.f(null);
        final boolean f4 = gva.f(a3);
        final Object r2 = gva.R();
        Object o2;
        if ((f3 | f4) || (o2 = r2) == a2) {
            o2 = a3.d((Class)s3p.class, (emi)null);
            gva.q0(o2);
        }
        final s3p s3p = (s3p)o2;
        final odk a4 = ii8.a(gva);
        final boolean f5 = gva.f(null);
        final boolean f6 = gva.f(a4);
        final Object r3 = gva.R();
        Object o3;
        if ((f5 | f6) || (o3 = r3) == a2) {
            o3 = a4.d((Class)mzm.class, (emi)null);
            gva.q0(o3);
        }
        final mzm mzm = (mzm)o3;
        final odk a5 = ii8.a(gva);
        final boolean f7 = gva.f(null);
        final boolean f8 = gva.f(a5);
        final Object r4 = gva.R();
        Object o4;
        if ((f7 | f8) || (o4 = r4) == a2) {
            o4 = a5.d((Class)kem.class, (emi)null);
            gva.q0(o4);
        }
        final kem kem = (kem)o4;
        final boolean f9 = gva.f(s);
        final Object r5 = gva.R();
        mm4 mm4;
        if (f9 || (mm4 = (mm4)r5) == a2) {
            mm4 = new mm4(s, jta, st4, new jzm(s3p, (byte)0), new p1((Object)mzm.e(mzm).a, (byte)2), new wfk((Object)kem, (byte)10));
            gva.q0(mm4);
        }
        return mm4;
    }
    
    public static final bnf F(final gva gva) {
        final Context context = (Context)gva.j(q50.b);
        final boolean f = gva.f(context);
        final Object r = gva.R();
        final cib a = bi6.a;
        AccessibilityManager accessibilityManager;
        if (f || (accessibilityManager = (AccessibilityManager)r) == a) {
            final Object systemService = context.getSystemService("accessibility");
            if (systemService instanceof AccessibilityManager) {
                accessibilityManager = (AccessibilityManager)systemService;
            }
            else {
                accessibilityManager = null;
            }
            gva.q0(accessibilityManager);
        }
        final AccessibilityManager accessibilityManager2 = accessibilityManager;
        Object o;
        if ((o = gva.R()) == a) {
            boolean b = false;
            Label_0123: {
                if (accessibilityManager2 != null) {
                    final boolean touchExplorationEnabled = accessibilityManager2.isTouchExplorationEnabled();
                    b = true;
                    if (touchExplorationEnabled) {
                        break Label_0123;
                    }
                }
                b = false;
            }
            o = o50.Q((Object)b);
            gva.q0(o);
        }
        final bnf bnf = (bnf)o;
        final boolean h = gva.h(accessibilityManager2);
        final Object r2 = gva.R();
        Object o2;
        if (h || (o2 = r2) == a) {
            o2 = new e4((Object)accessibilityManager2, (Object)bnf, (byte)0);
            gva.q0(o2);
        }
        mlc.a((Object)accessibilityManager2, (lta)o2, gva);
        return bnf;
    }
    
    public static final lil G(final String s, final String s2, final gva gva, final int n) {
        final odk a = ii8.a(gva);
        final Object o = null;
        final boolean f = gva.f(null);
        final boolean f2 = gva.f(a);
        final Object r = gva.R();
        final cib a2 = bi6.a;
        Object o2;
        if ((f | f2) || (o2 = r) == a2) {
            o2 = a.d((Class)st4.class, (emi)null);
            gva.q0(o2);
        }
        final st4 st4 = (st4)o2;
        final odk a3 = ii8.a(gva);
        final boolean f3 = gva.f(null);
        final boolean f4 = gva.f(a3);
        final Object r2 = gva.R();
        Object o3;
        if ((f3 | f4) || (o3 = r2) == a2) {
            o3 = a3.d((Class)s3p.class, (emi)null);
            gva.q0(o3);
        }
        final s3p s3p = (s3p)o3;
        final odk a4 = ii8.a(gva);
        final boolean f5 = gva.f(null);
        final boolean f6 = gva.f(a4);
        final Object r3 = gva.R();
        Object o4;
        if ((f5 | f6) || (o4 = r3) == a2) {
            o4 = a4.d((Class)mzm.class, (emi)null);
            gva.q0(o4);
        }
        final mzm mzm = (mzm)o4;
        final odk a5 = ii8.a(gva);
        final boolean f7 = gva.f(null);
        final boolean f8 = gva.f(a5);
        final Object r4 = gva.R();
        Object o5;
        if ((f7 | f8) || (o5 = r4) == a2) {
            o5 = a5.d((Class)kem.class, (emi)null);
            gva.q0(o5);
        }
        final kem kem = (kem)o5;
        boolean b = false;
        final boolean b2 = (((n & 0xE) ^ 0x6) > 4 && gva.f(s)) || (n & 0x6) == 0x4;
        Label_0390: {
            Label_0387: {
                if (((n & 0x70) ^ 0x30) > 32) {
                    Object o6 = o;
                    if (s2 != null) {
                        o6 = new SessionId(s2);
                    }
                    if (gva.f(o6)) {
                        break Label_0387;
                    }
                }
                if ((n & 0x30) != 0x20) {
                    break Label_0390;
                }
            }
            b = true;
        }
        final Object r5 = gva.R();
        lil lil;
        if ((b2 | b) || (lil = (lil)r5) == a2) {
            lil = new lil(s, s2, st4, new dh(s3p, (byte)1), new qy3(mzm, (byte)1), new q9m((Object)kem, (byte)8));
            gva.q0(lil);
        }
        return lil;
    }
    
    public static String H(final String s) {
        final int hashCode = s.hashCode();
        switch (hashCode) {
            default: {
                switch (hashCode) {
                    default: {
                        switch (hashCode) {
                            default: {
                                switch (hashCode) {
                                    default: {
                                        return null;
                                    }
                                    case 80123380: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function9")) {
                                            return null;
                                        }
                                        return "Function9";
                                    }
                                    case 80123379: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function8")) {
                                            return null;
                                        }
                                        return "Function8";
                                    }
                                    case 80123378: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function7")) {
                                            return null;
                                        }
                                        return "Function7";
                                    }
                                    case 80123377: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function6")) {
                                            return null;
                                        }
                                        return "Function6";
                                    }
                                    case 80123376: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function5")) {
                                            return null;
                                        }
                                        return "Function5";
                                    }
                                    case 80123375: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function4")) {
                                            return null;
                                        }
                                        return "Function4";
                                    }
                                    case 80123374: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function3")) {
                                            return null;
                                        }
                                        return "Function3";
                                    }
                                    case 80123373: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function2")) {
                                            return null;
                                        }
                                        return "Function2";
                                    }
                                    case 80123372: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function1")) {
                                            return null;
                                        }
                                        return "Function1";
                                    }
                                    case 80123371: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function0")) {
                                            return null;
                                        }
                                        return "Function0";
                                    }
                                }
                                break;
                            }
                            case -1811142683: {
                                if (!s.equals((Object)"kotlin.jvm.functions.Function22")) {
                                    return null;
                                }
                                return "Function22";
                            }
                            case -1811142684: {
                                if (!s.equals((Object)"kotlin.jvm.functions.Function21")) {
                                    return null;
                                }
                                return "Function21";
                            }
                            case -1811142685: {
                                if (!s.equals((Object)"kotlin.jvm.functions.Function20")) {
                                    return null;
                                }
                                return "Function20";
                            }
                        }
                        break;
                    }
                    case -1811142707: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function19")) {
                            return null;
                        }
                        return "Function19";
                    }
                    case -1811142708: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function18")) {
                            return null;
                        }
                        return "Function18";
                    }
                    case -1811142709: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function17")) {
                            return null;
                        }
                        return "Function17";
                    }
                    case -1811142710: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function16")) {
                            return null;
                        }
                        return "Function16";
                    }
                    case -1811142711: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function15")) {
                            return null;
                        }
                        return "Function15";
                    }
                    case -1811142712: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function14")) {
                            return null;
                        }
                        return "Function14";
                    }
                    case -1811142713: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function13")) {
                            return null;
                        }
                        return "Function13";
                    }
                    case -1811142714: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function12")) {
                            return null;
                        }
                        return "Function12";
                    }
                    case -1811142715: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function11")) {
                            return null;
                        }
                        return "Function11";
                    }
                    case -1811142716: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function10")) {
                            return null;
                        }
                        return "Function10";
                    }
                }
                break;
            }
            case 1877171123: {
                if (!s.equals((Object)"kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
            case 1630335596: {
                if (!s.equals((Object)"java.lang.Throwable")) {
                    return null;
                }
                return "Throwable";
            }
            case 1383693018: {
                if (!s.equals((Object)"kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
            case 1275614662: {
                if (!s.equals((Object)"java.lang.Iterable")) {
                    return null;
                }
                return "Iterable";
            }
            case 1195259493: {
                if (!s.equals((Object)"java.lang.String")) {
                    return null;
                }
                return "String";
            }
            case 1063877011: {
                if (!s.equals((Object)"java.lang.Object")) {
                    return null;
                }
                return "Any";
            }
            case 1052881309: {
                if (!s.equals((Object)"java.lang.Number")) {
                    return null;
                }
                return "Number";
            }
            case 761287205: {
                if (!s.equals((Object)"java.lang.Double")) {
                    return null;
                }
                return "Double";
            }
            case 599019395: {
                if (!s.equals((Object)"kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
            case 577341676: {
                if (!s.equals((Object)"java.util.ListIterator")) {
                    return null;
                }
                return "ListIterator";
            }
            case 499831342: {
                if (!s.equals((Object)"java.util.Iterator")) {
                    return null;
                }
                return "Iterator";
            }
            case 482629606: {
                if (!s.equals((Object)"kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
            case 398795216: {
                if (!s.equals((Object)"java.lang.Long")) {
                    return null;
                }
                return "Long";
            }
            case 398585941: {
                if (!s.equals((Object)"java.lang.Enum")) {
                    return null;
                }
                return "Enum";
            }
            case 398507100: {
                if (!s.equals((Object)"java.lang.Byte")) {
                    return null;
                }
                return "Byte";
            }
            case 344809556: {
                if (!s.equals((Object)"java.lang.Boolean")) {
                    return null;
                }
                break;
            }
            case 226173651: {
                if (!s.equals((Object)"kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
            case 155276373: {
                if (!s.equals((Object)"java.lang.Character")) {
                    return null;
                }
                return "Char";
            }
            case 109413500: {
                if (!s.equals((Object)"short")) {
                    return null;
                }
                return "Short";
            }
            case 97526364: {
                if (!s.equals((Object)"float")) {
                    return null;
                }
                return "Float";
            }
            case 77230534: {
                if (!s.equals((Object)"kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
            case 65821278: {
                if (!s.equals((Object)"java.util.List")) {
                    return null;
                }
                return "List";
            }
            case 64711720: {
                if (!s.equals((Object)"boolean")) {
                    return null;
                }
                break;
            }
            case 3327612: {
                if (!s.equals((Object)"long")) {
                    return null;
                }
                return "Long";
            }
            case 3052374: {
                if (!s.equals((Object)"char")) {
                    return null;
                }
                return "Char";
            }
            case 3039496: {
                if (!s.equals((Object)"byte")) {
                    return null;
                }
                return "Byte";
            }
            case 104431: {
                if (!s.equals((Object)"int")) {
                    return null;
                }
                return "Int";
            }
            case -165139126: {
                if (!s.equals((Object)"java.util.Map$Entry")) {
                    return null;
                }
                return "Entry";
            }
            case -207262728: {
                if (!s.equals((Object)"kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
            case -246476834: {
                if (!s.equals((Object)"kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
            case -515992664: {
                if (!s.equals((Object)"java.lang.Short")) {
                    return null;
                }
                return "Short";
            }
            case -527879800: {
                if (!s.equals((Object)"java.lang.Float")) {
                    return null;
                }
                return "Float";
            }
            case -688322466: {
                if (!s.equals((Object)"java.util.Collection")) {
                    return null;
                }
                return "Collection";
            }
            case -1062240117: {
                if (!s.equals((Object)"java.lang.CharSequence")) {
                    return null;
                }
                return "CharSequence";
            }
            case -1182275604: {
                if (!s.equals((Object)"kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
            case -1325958191: {
                if (!s.equals((Object)"double")) {
                    return null;
                }
                return "Double";
            }
            case -1383343454: {
                if (!s.equals((Object)"java.util.Set")) {
                    return null;
                }
                return "Set";
            }
            case -1383349348: {
                if (!s.equals((Object)"java.util.Map")) {
                    return null;
                }
                return "Map";
            }
            case -1571515090: {
                if (!s.equals((Object)"java.lang.Comparable")) {
                    return null;
                }
                return "Comparable";
            }
            case -1979556166: {
                if (!s.equals((Object)"java.lang.annotation.Annotation")) {
                    return null;
                }
                return "Annotation";
            }
            case -2034166429: {
                if (!s.equals((Object)"java.lang.Cloneable")) {
                    return null;
                }
                return "Cloneable";
            }
            case -2056817302: {
                if (!s.equals((Object)"java.lang.Integer")) {
                    return null;
                }
                return "Int";
            }
            case -2061550653: {
                if (!s.equals((Object)"kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "Companion";
            }
        }
        return "Boolean";
    }
    
    public static final di8 I(final lta lta) {
        final gi8 gi8 = new gi8();
        lta.b((Object)gi8);
        final yp4 b = gi8.b;
        jmq jmq;
        if (b != null) {
            jmq = new jmq(new ei8((bua)b, (byte)0));
        }
        else {
            jmq = null;
        }
        final di8 z = new di8(gi8.a, jmq);
        final Iterator iterator = gi8.c.iterator();
        iterator.getClass();
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            next.getClass();
            ((lta)next).b((Object)z);
        }
        final Object c = z.c;
        synchronized (c) {
            z.g = new odk(z, tdk.d, (Object)null, (odk)null, z.b(z.h), z.h.g, di8.i, z.b);
            z.h.i.add((Object)z.d());
            monitorexit(c);
            monitorenter(vzq.y);
            Label_0221: {
                try {
                    if (vzq.z == null) {
                        return vzq.z = z;
                    }
                }
                finally {
                    break Label_0221;
                }
                throw new RuntimeException("A global Di is already started", (Throwable)null);
            }
            monitorexit(c);
        }
    }
    
    public static final Bitmap$Config J(final int n) {
        if (n == 0) {
            return Bitmap$Config.ARGB_8888;
        }
        if (n == 1) {
            return Bitmap$Config.ALPHA_8;
        }
        if (n == 2) {
            return Bitmap$Config.RGB_565;
        }
        if (n == 3) {
            return Bitmap$Config.RGBA_F16;
        }
        if (n == 4) {
            return Bitmap$Config.HARDWARE;
        }
        return Bitmap$Config.ARGB_8888;
    }
    
    public static final Instant K(final hfc hfc) {
        final Instant ofEpochSecond = Instant.ofEpochSecond(hfc.v, (long)hfc.w);
        ofEpochSecond.getClass();
        return ofEpochSecond;
    }
    
    public static final hfc L(final Instant instant) {
        final hfc x = hfc.x;
        return o55.w(instant.getEpochSecond(), (long)instant.getNano());
    }
    
    public static final g90 M(final List list, final g90 g90) {
        final Path a = g90.a;
        int n;
        if (a.getFillType() == Path$FillType.EVEN_ODD) {
            n = 1;
        }
        else {
            n = 0;
        }
        g90.l();
        g90.m(n);
        gwg c;
        if (list.isEmpty()) {
            c = ovg.c;
        }
        else {
            c = (gwg)list.get(0);
        }
        final int size = ((Collection)list).size();
        float n2 = 0.0f;
        int i = 0;
        float n3 = 0.0f;
        float n4 = 0.0f;
        float n6;
        float n5 = n6 = n4;
        float n8;
        float n7 = n8 = n6;
        gwg gwg = c;
        final Path path = a;
        while (i < size) {
            final gwg gwg2 = (gwg)list.get(i);
            float a4 = 0.0f;
            float b3 = 0.0f;
            Label_1596: {
                Label_0154: {
                    if (!(gwg2 instanceof ovg)) {
                        if (gwg2 instanceof awg) {
                            final awg awg = (awg)gwg2;
                            final float a2 = awg.a();
                            final float b = awg.b();
                            path.rMoveTo(awg.a(), awg.b());
                            n5 = (n7 = a2 + n5);
                            n6 = (n8 = b + n6);
                        }
                        else if (gwg2 instanceof svg) {
                            final svg svg = (svg)gwg2;
                            n5 = svg.c;
                            n6 = svg.d;
                            g90.i(n5, n6);
                            n8 = n6;
                            n7 = n5;
                        }
                        else if (gwg2 instanceof zvg) {
                            final zvg zvg = (zvg)gwg2;
                            path.rLineTo(zvg.a(), zvg.b());
                            final float a3 = zvg.a();
                            n6 += zvg.b();
                            n5 += a3;
                        }
                        else if (gwg2 instanceof rvg) {
                            final rvg rvg = (rvg)gwg2;
                            n6 = rvg.d;
                            n5 = rvg.c;
                            g90.h(n5, n6);
                        }
                        else if (gwg2 instanceof yvg) {
                            final yvg yvg = (yvg)gwg2;
                            path.rLineTo(yvg.a(), n2);
                            n5 += yvg.a();
                        }
                        else if (gwg2 instanceof qvg) {
                            n5 = ((qvg)gwg2).c;
                            g90.h(n5, n6);
                        }
                        else if (gwg2 instanceof ewg) {
                            final ewg ewg = (ewg)gwg2;
                            path.rLineTo(n2, ewg.a());
                            n6 += ewg.a();
                        }
                        else if (gwg2 instanceof fwg) {
                            n6 = ((fwg)gwg2).c;
                            g90.h(n5, n6);
                        }
                        else {
                            if (gwg2 instanceof xvg) {
                                final xvg xvg = (xvg)gwg2;
                                path.rCubicTo(xvg.a(), xvg.d(), xvg.b(), xvg.e(), xvg.c(), xvg.f());
                                final float b2 = xvg.b();
                                final float e = xvg.e();
                                final float c2 = xvg.c();
                                final float f = xvg.f();
                                final float n9 = c2 + n5;
                                final float n10 = f + n6;
                                a4 = b2 + n5;
                                b3 = e + n6;
                                n5 = n9;
                                n6 = n10;
                                break Label_1596;
                            }
                            float n11 = 0.0f;
                            float n26 = 0.0f;
                            Label_0727: {
                                float n12;
                                float n13;
                                float n14;
                                if (gwg2 instanceof pvg) {
                                    final pvg pvg = (pvg)gwg2;
                                    g90.f(pvg.c, pvg.d, pvg.e, pvg.f, pvg.g, pvg.h);
                                    n11 = pvg.e;
                                    n12 = pvg.f;
                                    n13 = pvg.g;
                                    n14 = pvg.h;
                                }
                                else if (gwg2 instanceof cwg) {
                                    float n15;
                                    float n16;
                                    if (gwg.a) {
                                        n15 = n6 - n4;
                                        n16 = n5 - n3;
                                    }
                                    else {
                                        n16 = (n15 = n2);
                                    }
                                    final cwg cwg = (cwg)gwg2;
                                    path.rCubicTo(n16, n15, cwg.a(), cwg.c(), cwg.b(), cwg.d());
                                    final float n17 = cwg.a() + n5;
                                    n12 = cwg.c() + n6;
                                    final float n18 = cwg.b() + n5;
                                    final float n19 = cwg.d() + n6;
                                    n11 = n17;
                                    n13 = n18;
                                    n14 = n19;
                                }
                                else {
                                    if (!(gwg2 instanceof uvg)) {
                                        float c3;
                                        float b4;
                                        float a5;
                                        float d;
                                        if (gwg2 instanceof bwg) {
                                            final bwg bwg = (bwg)gwg2;
                                            path.rQuadTo(bwg.a(), bwg.c(), bwg.b(), bwg.d());
                                            final float n20 = bwg.a() + n5;
                                            c3 = bwg.c() + n6;
                                            final float n21 = bwg.b() + n5;
                                            final float n22 = bwg.d() + n6;
                                            b4 = n21;
                                            a5 = n20;
                                            d = n22;
                                        }
                                        else if (gwg2 instanceof tvg) {
                                            final tvg tvg = (tvg)gwg2;
                                            path.quadTo(tvg.a(), tvg.c(), tvg.b(), tvg.d());
                                            a5 = tvg.a();
                                            c3 = tvg.c();
                                            b4 = tvg.b();
                                            d = tvg.d();
                                        }
                                        else {
                                            if (gwg2 instanceof dwg) {
                                                float n23;
                                                float n24;
                                                if (gwg.b) {
                                                    n23 = n5 - n3;
                                                    n24 = n6 - n4;
                                                }
                                                else {
                                                    n23 = (n24 = n2);
                                                }
                                                final dwg dwg = (dwg)gwg2;
                                                path.rQuadTo(n23, n24, dwg.a(), dwg.b());
                                                final float n25 = n23 + n5;
                                                final float a6 = dwg.a();
                                                final float b5 = dwg.b();
                                                b3 = n24 + n6;
                                                n6 += b5;
                                                n26 = a6 + n5;
                                                n11 = n25;
                                                break Label_0727;
                                            }
                                            if (gwg2 instanceof vvg) {
                                                float n27 = n5;
                                                float n28 = n6;
                                                if (gwg.b) {
                                                    n27 = n5 * 2.0f - n3;
                                                    n28 = 2.0f * n6 - n4;
                                                }
                                                final vvg vvg = (vvg)gwg2;
                                                path.quadTo(n27, n28, vvg.a(), vvg.b());
                                                final float a7 = vvg.a();
                                                n6 = vvg.b();
                                                final float n29 = n27;
                                                b3 = n28;
                                                a4 = n29;
                                                n5 = a7;
                                                break Label_1596;
                                            }
                                            if (gwg2 instanceof wvg) {
                                                final wvg wvg = (wvg)gwg2;
                                                a4 = wvg.a() + n5;
                                                b3 = wvg.b() + n6;
                                                final double n30 = n5;
                                                final double n31 = n6;
                                                final double n32 = a4;
                                                final double n33 = b3;
                                                final double n34 = wvg.c();
                                                final double n35 = wvg.e();
                                                final double n36 = wvg.d();
                                                final boolean f2 = wvg.f();
                                                final boolean g91 = wvg.g();
                                                n2 = 0.0f;
                                                n(g90, n30, n31, n32, n33, n34, n35, n36, f2, g91);
                                                n5 = a4;
                                                break Label_0154;
                                            }
                                            if (gwg2 instanceof nvg) {
                                                final double n37 = n5;
                                                final double n38 = n6;
                                                final nvg nvg = (nvg)gwg2;
                                                n(g90, n37, n38, nvg.a(), nvg.b(), nvg.c(), nvg.e(), nvg.d(), nvg.f(), nvg.g());
                                                a4 = nvg.a();
                                                b3 = nvg.b();
                                                n5 = a4;
                                                break Label_0154;
                                            }
                                            en9.r();
                                            return null;
                                        }
                                        final float n39 = d;
                                        b3 = c3;
                                        a4 = a5;
                                        n5 = b4;
                                        n6 = n39;
                                        break Label_1596;
                                    }
                                    float n40 = n5;
                                    float n41 = n6;
                                    if (gwg.a) {
                                        n40 = n5 * 2.0f - n3;
                                        n41 = 2.0f * n6 - n4;
                                    }
                                    final uvg uvg = (uvg)gwg2;
                                    g90.f(n40, n41, uvg.a(), uvg.c(), uvg.b(), uvg.d());
                                    n11 = uvg.a();
                                    n12 = uvg.c();
                                    n13 = uvg.b();
                                    n14 = uvg.d();
                                }
                                n26 = n13;
                                n6 = n14;
                                b3 = n12;
                            }
                            a4 = n11;
                            n5 = n26;
                            break Label_1596;
                        }
                        a4 = n3;
                        b3 = n4;
                        break Label_1596;
                    }
                    path.close();
                    a4 = (n5 = n7);
                    b3 = n8;
                }
                n6 = b3;
            }
            ++i;
            gwg = gwg2;
            n3 = a4;
            n4 = b3;
        }
        return g90;
    }
    
    public static final CharSequence N(final CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) {
            return kym.y1(4999, charSequence);
        }
        return kym.y1(5000, charSequence);
    }
    
    public static final Object O(final lta lta, final h07 h07) {
        return v(((f07)h07).getContext()).p0((f07)h07, (lta)new gx2(lta, (byte)2));
    }
    
    public static RuntimeException P(int n, final Throwable t) {
        Throwable cause = t.getCause();
        Object p2;
        final Object o = p2 = null;
        if (cause != null) {
            if (++n >= 8) {
                cause = null;
            }
            p2 = o;
            if (cause != null) {
                p2 = P(n, cause);
            }
        }
        String v;
        if ((v = lmf.v(t)) == null) {
            v = "Throwable";
        }
        final RuntimeException ex = new RuntimeException(v, (Throwable)p2);
        ((Throwable)ex).setStackTrace(t.getStackTrace());
        return ex;
    }
    
    public static void Q(final int n, final Object[] array) {
        for (int i = 0; i < n; ++i) {
            if (array[i] == null) {
                fvd.k(smk.p(i, "at index "));
                break;
            }
        }
    }
    
    public static final fz6 a(hc7 f0) {
        if (f0.M0((gc7)o55.z) == null) {
            f0 = f0.F0((hc7)x90.d());
        }
        return new fz6(f0);
    }
    
    public static final void b(final xh9 xh9, final jta jta, final jta jta2, igf v, final gva gva, final int n) {
        gva.i0(-349751986);
        int n2;
        if (gva.f(xh9)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n4;
        final int n3 = n4 = (n2 | n);
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h(jta)) {
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
            if (gva.h(jta2)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        final int n8 = n6 | 0xC00;
        if (gva.W(n8 & 0x1, (n8 & 0x493) != 0x492)) {
            final v96 a = u96.a((jv0)t08.c, (dx)wab.K, gva, 48);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            v = (igf)fgf.v;
            final igf b = B(gva, v);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)a);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b);
            vp7.f(xh9, (igf)null, z65.h(gva), (String)null, jta, gva, (n8 & 0xE) | (n8 << 9 & 0xE000), 10);
            x90.l(gva, androidx.compose.foundation.layout.b.f(v, 16.0f));
            soh.f(jta2, (igf)null, false, (aql)null, (cp2)null, (bi2)null, (dng)null, (bua)zrn.b, gva, (n8 >> 6 & 0xE) | 0x30000000, 510);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new c44((byte)2, n, (Object)xh9, (Object)jta, (Object)jta2, (Object)v);
        }
    }
    
    public static final void c(final String s, final wn wn, final zta zta, final lta lta, final jta jta, final jta jta2, final igf igf, ond ond, final gva gva, final int n) {
        gva.i0(-618539388);
        OrganizationId organizationId;
        if (s != null) {
            organizationId = new OrganizationId(s);
        }
        else {
            organizationId = null;
        }
        int n2;
        if (gva.f(organizationId)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.d(((Enum)wn).ordinal())) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h(zta)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.h(lta)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        int n6;
        if (gva.h(jta)) {
            n6 = 16384;
        }
        else {
            n6 = 8192;
        }
        int n7;
        if (gva.h(jta2)) {
            n7 = 131072;
        }
        else {
            n7 = 65536;
        }
        int n8;
        if (gva.f(igf)) {
            n8 = 1048576;
        }
        else {
            n8 = 524288;
        }
        final int n9 = n | n2 | n3 | n4 | n5 | n6 | n7 | n8 | 0x6400000;
        boolean b = true;
        while (true) {
            Label_1035: {
                if (!gva.W(n9 & 0x1, (0x2492493 & n9) != 0x2492492)) {
                    gva.Z();
                    break Label_1035;
                }
                gva.b0();
                final cib a = bi6.a;
                int n10;
                if ((n & 0x1) != 0x0 && !gva.C()) {
                    gva.Z();
                    n10 = (n9 & 0xFE3FFFFF);
                }
                else {
                    final odk a2 = ii8.a(gva);
                    boolean b2 = false;
                    Label_0362: {
                        Label_0353: {
                            if (((n9 & 0xE) ^ 0x6) > 4) {
                                Object o;
                                if (s != null) {
                                    o = new OrganizationId(s);
                                }
                                else {
                                    o = null;
                                }
                                if (gva.f(o)) {
                                    break Label_0353;
                                }
                            }
                            if ((n9 & 0x6) != 0x4) {
                                b2 = false;
                                break Label_0362;
                            }
                        }
                        b2 = true;
                    }
                    final boolean b3 = (((n9 & 0x70) ^ 0x30) > 32 && gva.d(((Enum)wn).ordinal())) || (n9 & 0x30) == 0x20;
                    final boolean h = gva.h(a2);
                    Object r = gva.R();
                    if ((b2 | b3 | h) || r == a) {
                        r = new rx1((Object)s, (Object)wn, (Object)a2, (byte)17);
                        gva.q0(r);
                    }
                    ond = (ond)rhc.S(v4j.a((Class)ond.class), (Object)tsf.E(v4j.a((Class)ond.class)), (lta)r, gva);
                    n10 = (n9 & 0xFE3FFFFF);
                }
                gva.r();
                final boolean f = gva.f(ond);
                final Object r2 = gva.R();
                Object o2;
                if (f || (o2 = r2) == a) {
                    o2 = new h80((byte)8, (f07)null, (Object)ond);
                    gva.q0(o2);
                }
                mlc.f((zta)o2, gva, (Object)lqo.a);
                final boolean f2 = gva.f(ond);
                final Object r3 = gva.R();
                Object o3;
                if (f2 || (o3 = r3) == a) {
                    o3 = new p8a((Object)ond, (byte)12);
                    gva.q0(o3);
                }
                t08.g((Object)ond, (gbd)null, (lta)o3, gva, 0);
                final z0q z0q = (z0q)gva.j(hm6.v);
                final boolean f3 = gva.f(z0q);
                final boolean f4 = gva.f(ond);
                final Object r4 = gva.R();
                Object o4;
                if ((f3 | f4) || (o4 = r4) == a) {
                    o4 = new j2c((Object)z0q, (Object)ond, (f07)null, (byte)13);
                    gva.q0(o4);
                }
                mlc.g((Object)z0q, (Object)ond, (zta)o4, gva);
                final mn2 k = ond.K;
                final boolean b4 = (n10 & 0x380) == 0x100;
                final boolean b5 = (n10 & 0x1C00) == 0x800;
                if ((0xE000 & n10) != 0x4000) {
                    b = false;
                }
                final Object r5 = gva.R();
                Object o5;
                if ((b4 | b5 | b) || (o5 = r5) == a) {
                    o5 = new ch(zta, lta, jta, (f07)null);
                    gva.q0(o5);
                }
                ach.e((xd3)k, (zta)o5, gva, 0);
                final e8 e8 = (e8)ond.O.getValue();
                if (e8 == null) {
                    gva.g0(-1495378323);
                    gva.q(false);
                    d(ond, jta, jta2, igf, gva, (n10 >> 9 & 0x1FF0) | 0x6000);
                    break Label_1035;
                }
                gva.g0(-1495378322);
                ion.a(false, (w73)null, (vy4)null, (zta)uuj.t0(317390153, (aua)new up4((Object)e8, (Object)ond, (Object)igf, (byte)12), gva), gva, 3072, 7);
                gva.q(false);
                final b0j v = gva.v();
                if (v == null) {
                    return;
                }
                final tnd d = new tnd((Object)s, (Object)wn, (Object)zta, (Object)lta, (Object)jta, (Object)jta2, (Object)igf, (Object)ond, n, (byte)0);
                final b0j b0j = v;
                b0j.d = (zta)d;
                return;
            }
            final b0j v2 = gva.v();
            if (v2 != null) {
                final tnd d = new tnd((Object)s, (Object)wn, (Object)zta, (Object)lta, (Object)jta, (Object)jta2, (Object)igf, (Object)ond, n, (byte)1);
                final b0j b0j = v2;
                continue;
            }
            break;
        }
    }
    
    public static final void d(final ond ond, final jta jta, final jta jta2, final igf igf, final gva gva, final int n) {
        gva.i0(421865345);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f(ond)) {
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
            if (gva.h(jta)) {
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
            if (gva.h(jta2)) {
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
            if (gva.f(igf)) {
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
            if (gva.c(0.0f)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        if (gva.W(n10 & 0x1, (n10 & 0x2493) != 0x2492)) {
            ion.a(false, (w73)null, (vy4)null, (zta)uuj.t0(2027375166, (aua)new cj4(igf, ond, jta2, jta), gva), gva, 3072, 7);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new el6(ond, jta, jta2, igf, n);
        }
    }
    
    public static final fz6 e() {
        final w4n o = omo.o();
        final o68 a = vo8.a;
        return new fz6(uuj.s0((hc7)o, (hc7)w0e.a));
    }
    
    public static final void f(final long n, final mnn mnn, final zta zta, final gva gva, final int n2) {
        gva.i0(-684938728);
        int n4;
        if ((n2 & 0x6) == 0x0) {
            int n3;
            if (gva.e(n)) {
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
            if (gva.f(mnn)) {
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
            if (gva.h(zta)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        if (gva.W(n7 & 0x1, (n7 & 0x93) != 0x92)) {
            final b09 a = lmn.a;
            c5q.d(new ffi[] { ge9.n(n, dx6.a), a.a(((mnn)gva.j(a)).e(mnn)) }, zta, gva, (n7 >> 3 & 0x70) | 0x8);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new uei(n, mnn, zta, n2);
        }
    }
    
    public static final zsk g(final LayoutNode layoutNode, final boolean b) {
        hgf a = (hgf)layoutNode.Z.B;
        final int y = a.y;
        xsk xsk2;
        final xsk xsk = xsk2 = null;
        Label_0293: {
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
                            if (g instanceof xsk) {
                                xsk2 = (xsk)g;
                                break Label_0293;
                            }
                            inf inf2 = inf;
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
                                                    inf4 = new inf(0, new hgf[16]);
                                                }
                                                hgf hgf3;
                                                if ((hgf3 = g) != null) {
                                                    inf4.b(g);
                                                    hgf3 = null;
                                                }
                                                inf4.b(hgf);
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
        ((hgf)xsk2).getClass();
        final hgf v = ((hgf)xsk2).v;
        tsk i;
        if ((i = layoutNode.I()) == null) {
            i = new tsk();
        }
        return new zsk(v, b, layoutNode, i);
    }
    
    public static final Bitmap h(final n70 n70) {
        if (n70 instanceof n70) {
            return n70.a;
        }
        oyl.s("Unable to obtain android.graphics.Bitmap");
        return null;
    }
    
    public static final void i(final oc7 oc7, final CancellationException ex) {
        final opc opc = (opc)oc7.getCoroutineContext().M0((gc7)o55.z);
        if (opc != null) {
            opc.g(ex);
            return;
        }
        uy8.g((Object)oc7, "Scope cannot be cancelled because it does not have a job: ");
    }
    
    public static String j(final String s) {
        final int hashCode = s.hashCode();
        switch (hashCode) {
            default: {
                switch (hashCode) {
                    default: {
                        switch (hashCode) {
                            default: {
                                switch (hashCode) {
                                    default: {
                                        return null;
                                    }
                                    case 80123380: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function9")) {
                                            return null;
                                        }
                                        return "kotlin.Function9";
                                    }
                                    case 80123379: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function8")) {
                                            return null;
                                        }
                                        return "kotlin.Function8";
                                    }
                                    case 80123378: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function7")) {
                                            return null;
                                        }
                                        return "kotlin.Function7";
                                    }
                                    case 80123377: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function6")) {
                                            return null;
                                        }
                                        return "kotlin.Function6";
                                    }
                                    case 80123376: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function5")) {
                                            return null;
                                        }
                                        return "kotlin.Function5";
                                    }
                                    case 80123375: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function4")) {
                                            return null;
                                        }
                                        return "kotlin.Function4";
                                    }
                                    case 80123374: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function3")) {
                                            return null;
                                        }
                                        return "kotlin.Function3";
                                    }
                                    case 80123373: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function2")) {
                                            return null;
                                        }
                                        return "kotlin.Function2";
                                    }
                                    case 80123372: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function1")) {
                                            return null;
                                        }
                                        return "kotlin.Function1";
                                    }
                                    case 80123371: {
                                        if (!s.equals((Object)"kotlin.jvm.functions.Function0")) {
                                            return null;
                                        }
                                        return "kotlin.Function0";
                                    }
                                }
                                break;
                            }
                            case -1811142683: {
                                if (!s.equals((Object)"kotlin.jvm.functions.Function22")) {
                                    return null;
                                }
                                return "kotlin.Function22";
                            }
                            case -1811142684: {
                                if (!s.equals((Object)"kotlin.jvm.functions.Function21")) {
                                    return null;
                                }
                                return "kotlin.Function21";
                            }
                            case -1811142685: {
                                if (!s.equals((Object)"kotlin.jvm.functions.Function20")) {
                                    return null;
                                }
                                return "kotlin.Function20";
                            }
                        }
                        break;
                    }
                    case -1811142707: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function19")) {
                            return null;
                        }
                        return "kotlin.Function19";
                    }
                    case -1811142708: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function18")) {
                            return null;
                        }
                        return "kotlin.Function18";
                    }
                    case -1811142709: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function17")) {
                            return null;
                        }
                        return "kotlin.Function17";
                    }
                    case -1811142710: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function16")) {
                            return null;
                        }
                        return "kotlin.Function16";
                    }
                    case -1811142711: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function15")) {
                            return null;
                        }
                        return "kotlin.Function15";
                    }
                    case -1811142712: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function14")) {
                            return null;
                        }
                        return "kotlin.Function14";
                    }
                    case -1811142713: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function13")) {
                            return null;
                        }
                        return "kotlin.Function13";
                    }
                    case -1811142714: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function12")) {
                            return null;
                        }
                        return "kotlin.Function12";
                    }
                    case -1811142715: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function11")) {
                            return null;
                        }
                        return "kotlin.Function11";
                    }
                    case -1811142716: {
                        if (!s.equals((Object)"kotlin.jvm.functions.Function10")) {
                            return null;
                        }
                        return "kotlin.Function10";
                    }
                }
                break;
            }
            case 1877171123: {
                if (!s.equals((Object)"kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "kotlin.Int.Companion";
            }
            case 1630335596: {
                if (!s.equals((Object)"java.lang.Throwable")) {
                    return null;
                }
                return "kotlin.Throwable";
            }
            case 1383693018: {
                if (!s.equals((Object)"kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "kotlin.Boolean.Companion";
            }
            case 1275614662: {
                if (!s.equals((Object)"java.lang.Iterable")) {
                    return null;
                }
                return "kotlin.collections.Iterable";
            }
            case 1195259493: {
                if (!s.equals((Object)"java.lang.String")) {
                    return null;
                }
                return "kotlin.String";
            }
            case 1063877011: {
                if (!s.equals((Object)"java.lang.Object")) {
                    return null;
                }
                return "kotlin.Any";
            }
            case 1052881309: {
                if (!s.equals((Object)"java.lang.Number")) {
                    return null;
                }
                return "kotlin.Number";
            }
            case 761287205: {
                if (!s.equals((Object)"java.lang.Double")) {
                    return null;
                }
                return "kotlin.Double";
            }
            case 599019395: {
                if (!s.equals((Object)"kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "kotlin.String.Companion";
            }
            case 577341676: {
                if (!s.equals((Object)"java.util.ListIterator")) {
                    return null;
                }
                return "kotlin.collections.ListIterator";
            }
            case 499831342: {
                if (!s.equals((Object)"java.util.Iterator")) {
                    return null;
                }
                return "kotlin.collections.Iterator";
            }
            case 482629606: {
                if (!s.equals((Object)"kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "kotlin.Float.Companion";
            }
            case 398795216: {
                if (!s.equals((Object)"java.lang.Long")) {
                    return null;
                }
                return "kotlin.Long";
            }
            case 398585941: {
                if (!s.equals((Object)"java.lang.Enum")) {
                    return null;
                }
                return "kotlin.Enum";
            }
            case 398507100: {
                if (!s.equals((Object)"java.lang.Byte")) {
                    return null;
                }
                return "kotlin.Byte";
            }
            case 344809556: {
                if (!s.equals((Object)"java.lang.Boolean")) {
                    return null;
                }
                break;
            }
            case 226173651: {
                if (!s.equals((Object)"kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "kotlin.Enum.Companion";
            }
            case 155276373: {
                if (!s.equals((Object)"java.lang.Character")) {
                    return null;
                }
                return "kotlin.Char";
            }
            case 109413500: {
                if (!s.equals((Object)"short")) {
                    return null;
                }
                return "kotlin.Short";
            }
            case 97526364: {
                if (!s.equals((Object)"float")) {
                    return null;
                }
                return "kotlin.Float";
            }
            case 77230534: {
                if (!s.equals((Object)"kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "kotlin.Short.Companion";
            }
            case 65821278: {
                if (!s.equals((Object)"java.util.List")) {
                    return null;
                }
                return "kotlin.collections.List";
            }
            case 64711720: {
                if (!s.equals((Object)"boolean")) {
                    return null;
                }
                break;
            }
            case 3327612: {
                if (!s.equals((Object)"long")) {
                    return null;
                }
                return "kotlin.Long";
            }
            case 3052374: {
                if (!s.equals((Object)"char")) {
                    return null;
                }
                return "kotlin.Char";
            }
            case 3039496: {
                if (!s.equals((Object)"byte")) {
                    return null;
                }
                return "kotlin.Byte";
            }
            case 104431: {
                if (!s.equals((Object)"int")) {
                    return null;
                }
                return "kotlin.Int";
            }
            case -165139126: {
                if (!s.equals((Object)"java.util.Map$Entry")) {
                    return null;
                }
                return "kotlin.collections.Map.Entry";
            }
            case -207262728: {
                if (!s.equals((Object)"kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "kotlin.Long.Companion";
            }
            case -246476834: {
                if (!s.equals((Object)"kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "kotlin.Char.Companion";
            }
            case -515992664: {
                if (!s.equals((Object)"java.lang.Short")) {
                    return null;
                }
                return "kotlin.Short";
            }
            case -527879800: {
                if (!s.equals((Object)"java.lang.Float")) {
                    return null;
                }
                return "kotlin.Float";
            }
            case -688322466: {
                if (!s.equals((Object)"java.util.Collection")) {
                    return null;
                }
                return "kotlin.collections.Collection";
            }
            case -1062240117: {
                if (!s.equals((Object)"java.lang.CharSequence")) {
                    return null;
                }
                return "kotlin.CharSequence";
            }
            case -1182275604: {
                if (!s.equals((Object)"kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "kotlin.Byte.Companion";
            }
            case -1325958191: {
                if (!s.equals((Object)"double")) {
                    return null;
                }
                return "kotlin.Double";
            }
            case -1383343454: {
                if (!s.equals((Object)"java.util.Set")) {
                    return null;
                }
                return "kotlin.collections.Set";
            }
            case -1383349348: {
                if (!s.equals((Object)"java.util.Map")) {
                    return null;
                }
                return "kotlin.collections.Map";
            }
            case -1571515090: {
                if (!s.equals((Object)"java.lang.Comparable")) {
                    return null;
                }
                return "kotlin.Comparable";
            }
            case -1979556166: {
                if (!s.equals((Object)"java.lang.annotation.Annotation")) {
                    return null;
                }
                return "kotlin.Annotation";
            }
            case -2034166429: {
                if (!s.equals((Object)"java.lang.Cloneable")) {
                    return null;
                }
                return "kotlin.Cloneable";
            }
            case -2056817302: {
                if (!s.equals((Object)"java.lang.Integer")) {
                    return null;
                }
                return "kotlin.Int";
            }
            case -2061550653: {
                if (!s.equals((Object)"kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "kotlin.Double.Companion";
            }
        }
        return "kotlin.Boolean";
    }
    
    public static final ye6 k(final List list) {
        return new ye6(1271844412, true, new l0((Object)list, (byte)17));
    }
    
    public static igf l(final igf igf, final bua bua) {
        return igf.E((igf)new ai6(bua));
    }
    
    public static final Object m(final f07 f07, final zta zta) {
        final mdk mdk = new mdk(f07, f07.getContext());
        return t08.m0(mdk, true, (Object)mdk, zta);
    }
    
    public static final void n(final g90 g90, double n, double n2, double n3, double sqrt, final double n4, double n5, double sin, final boolean b, final boolean b2) {
        final double n6 = sin / 180.0 * 3.141592653589793;
        final double cos = Math.cos(n6);
        final double sin2 = Math.sin(n6);
        final double n7 = (n2 * sin2 + n * cos) / n4;
        final double n8 = (n2 * cos + -n * sin2) / n5;
        final double n9 = (sqrt * sin2 + n3 * cos) / n4;
        final double n10 = (sqrt * cos + -n3 * sin2) / n5;
        final double n11 = n7 - n9;
        final double n12 = n8 - n10;
        final double n13 = (n7 + n9) / 2.0;
        final double n14 = (n8 + n10) / 2.0;
        final double n15 = n12 * n12 + n11 * n11;
        if (n15 != 0.0) {
            final double n16 = 1.0 / n15 - 0.25;
            if (n16 < 0.0) {
                final double n17 = (float)(Math.sqrt(n15) / 1.99999);
                n(g90, n, n2, n3, sqrt, n4 * n17, n5 * n17, sin, b, b2);
                return;
            }
            sqrt = Math.sqrt(n16);
            n3 = n11 * sqrt;
            sqrt *= n12;
            if (b == b2) {
                sin = n13 - sqrt;
                sqrt = n14 + n3;
            }
            else {
                sin = n13 + sqrt;
                sqrt = n14 - n3;
            }
            double atan2 = Math.atan2(n8 - sqrt, n7 - sin);
            final double n18 = Math.atan2(n10 - sqrt, n9 - sin) - atan2;
            final double n19 = dcmpl(n18, 0.0);
            final boolean b3 = n19 >= 0;
            n3 = n18;
            if (b2 != b3) {
                if (n19 > 0) {
                    n3 = n18 - 6.283185307179586;
                }
                else {
                    n3 = n18 + 6.283185307179586;
                }
            }
            final double n20 = sin * n4;
            final double n21 = sqrt * n5;
            final double n22 = n20 * cos - n21 * sin2;
            final int n23 = (int)Math.ceil(Math.abs(n3 * 4.0 / 3.141592653589793));
            final double cos2 = Math.cos(n6);
            final double sin3 = Math.sin(n6);
            final double cos3 = Math.cos(atan2);
            sin = Math.sin(atan2);
            sqrt = -n4;
            final double n24 = sqrt * cos2;
            final double n25 = n5 * sin3;
            final double n26 = sqrt * sin3;
            final double n27 = n5 * cos2;
            final double n28 = n3 / n23;
            sqrt = n24 * sin - n25 * cos3;
            int i = 0;
            sin = cos3 * n27 + sin * n26;
            double n29 = n;
            n5 = n2;
            n3 = n26;
            n = n22;
            n2 = sin3;
            final double n30 = n28;
            while (i < n23) {
                final double n31 = atan2 + n30;
                final double sin4 = Math.sin(n31);
                final double cos4 = Math.cos(n31);
                final double n32 = n4 * cos2 * cos4 + n - n25 * sin4;
                final double n33 = n27 * sin4 + (n4 * n2 * cos4 + (n21 * cos + n20 * sin2));
                final double n34 = n24 * sin4 - n25 * cos4;
                final double n35 = cos4 * n27 + sin4 * n3;
                final double n36 = n31 - atan2;
                final double tan = Math.tan(n36 / 2.0);
                final double n37 = (Math.sqrt(tan * 3.0 * tan + 4.0) - 1.0) * Math.sin(n36) / 3.0;
                g90.f((float)(sqrt * n37 + n29), (float)(sin * n37 + n5), (float)(n32 - n37 * n34), (float)(n33 - n37 * n35), (float)n32, (float)n33);
                n29 = n32;
                ++i;
                atan2 = n31;
                sin = n35;
                sqrt = n34;
                n5 = n33;
            }
        }
    }
    
    public static Map o(final l7b l7b) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Iterator t = l7b.t();
        while (t.hasNext()) {
            final Object b = l7b.b(t.next());
            final Object value = linkedHashMap.get(b);
            Object o;
            if ((o = value) == null) {
                o = value;
                if (!((Map)linkedHashMap).containsKey(b)) {
                    o = new Object();
                }
            }
            final z3j z3j = (z3j)o;
            ++z3j.v;
            ((Map)linkedHashMap).put(b, (Object)z3j);
        }
        for (final Map$Entry map$Entry : (Iterable)linkedHashMap.entrySet()) {
            map$Entry.getClass();
            if (map$Entry instanceof stc && !(map$Entry instanceof vtc)) {
                omo.e0((Object)map$Entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            map$Entry.setValue((Object)((z3j)map$Entry.getValue()).v);
        }
        return omo.u((Object)linkedHashMap);
    }
    
    public static final void p(final oc7 oc7) {
        x90.u(oc7.getCoroutineContext());
    }
    
    public static l78 q() {
        return new l78((Object)ri2.I0(0, 0, (u09)null, 7), (Object)new z3a((byte)0), (byte)0);
    }
    
    public static InvocationHandler r() {
        return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, w()).getDeclaredMethod("createWebViewProviderFactory", (Class<?>[])null).invoke((Object)null, (Object[])null);
    }
    
    public static rmj s(final zrc zrc) {
        Label_0768: {
            Label_0759: {
                Label_0750: {
                    long f = 0L;
                    flj x = null;
                    String i = null;
                    Label_0066: {
                        try {
                            f = zrc.o("date").f();
                            x = r9n.x(zrc.o("application").e());
                            final irc o = zrc.o("service");
                            if (o != null) {
                                i = o.i();
                                break Label_0066;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0750;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0759;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0768;
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
                    final jmj w = x90.w(zrc.o("session").e());
                    final irc o6 = zrc.o("source");
                    int n = 0;
                    int n3 = 0;
                    kmj n4 = null;
                    omj v = null;
                    Label_0333: {
                        Label_0274: {
                            if (o6 == null) {
                                break Label_0274;
                            }
                            final String i2 = o6.i();
                            if (i2 == null) {
                                break Label_0274;
                            }
                            final int[] f2 = ge9.F(11);
                            try {
                                while (true) {
                                    while (n < f2.length) {
                                        final int n2 = f2[n];
                                        if (lmf.k(n2).equals(i2)) {
                                            n3 = n2;
                                            n4 = ri2.N(zrc.o("view").e());
                                            final irc o7 = zrc.o("usr");
                                            if (o7 != null) {
                                                v = yi2.v(o7.e());
                                                break Label_0333;
                                            }
                                            break Label_0274;
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
                                break Label_0750;
                            }
                            catch (final NumberFormatException ex2) {
                                break Label_0759;
                            }
                            catch (final IllegalStateException ex3) {
                                break Label_0768;
                            }
                        }
                        v = null;
                    }
                    final irc o8 = zrc.o("account");
                    dlj r;
                    if (o8 != null) {
                        r = kar.r(o8.e());
                    }
                    else {
                        r = null;
                    }
                    final irc o9 = zrc.o("connectivity");
                    klj i3;
                    if (o9 != null) {
                        i3 = omo.I(o9.e());
                    }
                    else {
                        i3 = null;
                    }
                    final irc o10 = zrc.o("display");
                    rlj q;
                    if (o10 != null) {
                        q = yar.q(o10.e());
                    }
                    else {
                        q = null;
                    }
                    final irc o11 = zrc.o("synthetics");
                    nmj f3;
                    if (o11 != null) {
                        f3 = wbr.f(o11.e());
                    }
                    else {
                        f3 = null;
                    }
                    final irc o12 = zrc.o("ci_test");
                    hlj u;
                    if (o12 != null) {
                        u = rar.u(o12.e());
                    }
                    else {
                        u = null;
                    }
                    final irc o13 = zrc.o("os");
                    zlj z;
                    if (o13 != null) {
                        z = o50.z(o13.e());
                    }
                    else {
                        z = null;
                    }
                    final irc o14 = zrc.o("device");
                    qlj f4;
                    if (o14 != null) {
                        f4 = ljq.F(o14.e());
                    }
                    else {
                        f4 = null;
                    }
                    final olj y = c5q.y(zrc.o("_dd").e());
                    final irc o15 = zrc.o("context");
                    nlj h;
                    if (o15 != null) {
                        h = uoo.H(o15.e());
                    }
                    else {
                        h = null;
                    }
                    final irc o16 = zrc.o("action");
                    elj i4;
                    if (o16 != null) {
                        i4 = lar.i(o16.e());
                    }
                    else {
                        i4 = null;
                    }
                    final irc o17 = zrc.o("container");
                    llj f5;
                    if (o17 != null) {
                        f5 = uar.f(o17.e());
                    }
                    else {
                        f5 = null;
                    }
                    final String i5 = zrc.o("type").i();
                    final imj b = xp7.B(zrc.o("resource").e());
                    if (mlc.q((Object)i5, (Object)"resource")) {
                        return new rmj(f, x, i, j, k, l, m, w, n3, n4, v, r, i3, q, f3, u, z, f4, y, h, i4, f5, b);
                    }
                    throw new IllegalStateException("Check failed.");
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ResourceEvent", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ResourceEvent", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ResourceEvent", (Throwable)ex3);
        return null;
    }
    
    public static int t(String s) {
        final String u1 = kym.u1('/', s, s);
        final Locale us = Locale.US;
        final String r = oz1.r(us, u1, us);
        s = kym.q1('/', s, s);
        s = kym.u1(';', s, s).toLowerCase(us);
        s.getClass();
        if (r.equals("image")) {
            return 7;
        }
        if (r.equals("video") || r.equals("audio")) {
            return 11;
        }
        if (r.equals("font")) {
            return 9;
        }
        if (r.equals("text") && s.equals("css")) {
            return 10;
        }
        if (r.equals("text") && s.equals("javascript")) {
            return 8;
        }
        return 5;
    }
    
    public static final String u(int d) {
        d = ge9.D(d);
        if (d == 0) {
            return "attached";
        }
        if (d == 1) {
            return "skipped";
        }
        if (d == 2) {
            return "unavailable";
        }
        en9.r();
        return null;
    }
    
    public static final ahf v(final hc7 hc7) {
        final ahf ahf = (ahf)hc7.M0((gc7)wab.R);
        if (ahf != null) {
            return ahf;
        }
        en9.q("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }
    
    public static ClassLoader w() {
        if (Build$VERSION.SDK_INT >= 28) {
            return k4.f();
        }
        Object o = null;
        try {
            o = WebView.class.getDeclaredMethod("getFactory", (Class<?>[])null);
            ((AccessibleObject)o).setAccessible(true);
            o = ((Method)o).invoke((Object)null, (Object[])null);
            return ((Method)o).getClass().getClassLoader();
        }
        catch (final IllegalAccessException o) {}
        catch (final InvocationTargetException o) {}
        catch (final NoSuchMethodException ex) {}
        uy8.i((Throwable)o);
        return null;
    }
    
    public static final int x(final int n, final int n2) {
        return n >> n2 & 0x1F;
    }
    
    public static final boolean y(final oc7 oc7) {
        final opc opc = (opc)oc7.getCoroutineContext().M0((gc7)o55.z);
        return opc == null || opc.c();
    }
    
    public static boolean z(final String s) {
        return !"Connection".equalsIgnoreCase(s) && !"Keep-Alive".equalsIgnoreCase(s) && !"Proxy-Authenticate".equalsIgnoreCase(s) && !"Proxy-Authorization".equalsIgnoreCase(s) && !"TE".equalsIgnoreCase(s) && !"Trailers".equalsIgnoreCase(s) && !"Transfer-Encoding".equalsIgnoreCase(s) && !"Upgrade".equalsIgnoreCase(s);
    }
}
