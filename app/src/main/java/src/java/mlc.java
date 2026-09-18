import java.io.Writer;
import java.util.Map$Entry;
import androidx.compose.runtime.e;
import java.util.Comparator;
import java.io.Closeable;
import com.anthropic.claude.api.result.ApiResult;
import java.lang.reflect.Type;
import kotlin.UninitializedPropertyAccessException;
import androidx.compose.runtime.c;
import java.util.concurrent.locks.LockSupport;
import android.graphics.Bitmap$Config;
import java.util.function.DoubleUnaryOperator;
import android.graphics.ColorSpace$Rgb;
import android.graphics.ColorSpace$Rgb$TransferParameters;
import android.util.DisplayMetrics;
import android.graphics.Bitmap;
import android.os.Build$VERSION;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo$Builder;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import android.content.pm.ShortcutInfo;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.content.Context;
import android.content.res.Resources;
import java.io.StringWriter;
import java.io.Reader;
import java.util.Arrays;
import java.util.Collection;
import java.io.BufferedReader;
import com.anthropic.claude.conversation.model.q0;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.List;
import com.anthropic.claude.analytics.events.ChatKind;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import android.os.Bundle;
import kotlinx.serialization.KSerializer;
import com.arkivanov.essenty.statekeeper.b;

public abstract class mlc
{
    public static final jn0 a;
    public static final bq8 b;
    public static final ga0 c;
    public static final n5a d;
    public static final n5a e;
    public static final n5a[] f;
    
    public static final qq6 A(final u86 u86, final u86 u87) {
        if (u86 == u87) {
            return new qq6(u86, u86, 1);
        }
        if (rhc.p(u86.b, 12884901888L) && rhc.p(u87.b, 12884901888L)) {
            return (qq6)new oq6((yrj)u86, (yrj)u87);
        }
        return new qq6(u86, u87, 0);
    }
    
    public static final hwj B(final ge6 ge6) {
        final lih lih = new lih((byte)21);
        final d8g e = ge6.e();
        final d38 d38 = new d38();
        final jo1 jo1 = new jo1(d38);
        final y7g y7g = new y7g(jo1, new a8g(null, jo1));
        jo1.a.add((Object)y7g);
        c2l.f(e.b().c, y7g);
        final e3a e3a = (e3a)ge6.y.x;
        final Bundle e2 = e3a.e("STATE_KEEPER_STATE");
        SerializableContainer g = null;
        Label_0116: {
            if (e2 != null) {
                g = p1r.g(e2);
                if (g != null) {
                    break Label_0116;
                }
            }
            g = null;
        }
        final b b = new b(g);
        e3a.P("STATE_KEEPER_STATE", (h9k)new z60((jta)lih, b));
        final hym a = hym.a;
        final String s = (String)b.a("DefaultComponentContext_state_marker", (KSerializer)a);
        b.b("DefaultComponentContext_state_marker", (KSerializer)a, (jta)new cm6((byte)25));
        final jmq jmq = new jmq((vad)ge6.v);
        final boolean b2 = s == null;
        final c2l c2l = new c2l(ge6.s(), (vcp)new a70((byte)0), (im7)gm7.b);
        final us4 a2 = v4j.a((Class)gfc.class);
        final String b3 = a2.b();
        if (b3 != null) {
            final gfc gfc = (gfc)c2l.D(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b3));
            if (b2) {
                gfc.b.a();
                gfc.b = new ci6();
            }
            return new hwj((je6)new o38((uad)jmq, b, gfc.b, (ho1)d38));
        }
        en9.s("Local and anonymous classes can not be ViewModels");
        return null;
    }
    
    public static final void C(final kbd kbd) {
        if (kbd.w == sad.z) {
            kbd.onPause();
        }
        if (kbd.w == sad.y) {
            kbd.a();
        }
        if (kbd.w == sad.x) {
            kbd.onDestroy();
        }
    }
    
    public static Object D(final Class clazz) {
        final Package package1 = clazz.getPackage();
        String name;
        if (package1 == null || (name = package1.getName()) == null) {
            name = "";
        }
        String s = clazz.getCanonicalName();
        s.getClass();
        if (name.length() != 0) {
            s = s.substring(name.length() + 1);
        }
        final String concat = rym.D0(s, '.', '_').concat("_Impl");
        Label_0186: {
            Label_0170: {
                try {
                    String string;
                    if (name.length() == 0) {
                        string = concat;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(name);
                        sb.append(".");
                        sb.append(concat);
                        string = sb.toString();
                    }
                    final Class<?> forName = Class.forName(string, true, clazz.getClassLoader());
                    forName.getClass();
                    return forName.getDeclaredConstructor((Class<?>[])null).newInstance((Object[])null);
                }
                catch (final InstantiationException ex) {}
                catch (final IllegalAccessException ex2) {
                    break Label_0170;
                }
                catch (final ClassNotFoundException ex3) {
                    break Label_0186;
                }
                final InstantiationException ex;
                fvd.v(smk.s("Failed to create an instance of ", clazz.getCanonicalName()), (Throwable)ex);
                return null;
            }
            final IllegalAccessException ex2;
            fvd.v(smk.s("Cannot access the constructor ", clazz.getCanonicalName()), (Throwable)ex2);
            return null;
        }
        final ClassNotFoundException ex3;
        fvd.v(lmf.t("Cannot find implementation for ", clazz.getCanonicalName(), ". ", concat, " does not exist. Is Room annotation processor correctly configured?"), (Throwable)ex3);
        return null;
    }
    
    public static final afa E(final wqh wqh) {
        final List b = wqh.b;
        final grh a = wqh.a;
        final gko gko = (gko)c86.Q0((Iterable)((Map)a.h).values());
        final t47 t47 = null;
        if (gko != null) {
            final v47 a2 = gko.A;
            final ListIterator listIterator = b.listIterator(b.size());
            while (true) {
                while (listIterator.hasPrevious()) {
                    final Object previous = listIterator.previous();
                    if (((zqh)previous) instanceof xqh) {
                        xqh xqh;
                        if (previous instanceof xqh) {
                            xqh = (xqh)previous;
                        }
                        else {
                            xqh = null;
                        }
                        if (xqh == null) {
                            return null;
                        }
                        final u6f u6f = (u6f)((Map)a.a.a).get(c86.P0(xqh.p()));
                        if (u6f == null) {
                            return null;
                        }
                        final boolean f = u6f.f;
                        if (!q(u6f.a, gko.b)) {
                            return null;
                        }
                        if (!u6f.e) {
                            return null;
                        }
                        if (!f && !gko.f()) {
                            return null;
                        }
                        if (f) {
                            s47 s47;
                            if (a2 instanceof s47) {
                                s47 = (s47)a2;
                            }
                            else {
                                s47 = null;
                            }
                            if (s47 != null && !s47.c() && !s47.b()) {
                                return null;
                            }
                        }
                        t47 t48 = t47;
                        if (a2 instanceof t47) {
                            t48 = (t47)a2;
                        }
                        final String a3 = u6f.a;
                        int n;
                        if (f) {
                            n = 2;
                        }
                        else if (t48 != null) {
                            n = 3;
                        }
                        else {
                            n = 1;
                        }
                        final l7f c = gko.c();
                        final boolean b2 = c != null && c.h();
                        final l7f c2 = gko.c();
                        ChatKind chatKind;
                        if (c2 == null || (chatKind = c2.b()) == null) {
                            chatKind = ChatKind.w;
                        }
                        return new afa(a3, n, b2, chatKind, xqh.e(), b.size());
                    }
                }
                final Object previous = null;
                continue;
            }
        }
        return null;
    }
    
    public static final String F(String i) {
        jpj jpj = null;
        try {
            final StringBuilder sb = new StringBuilder("font/");
            sb.append(i);
            sb.append(".ttf");
            i = gar.i(sb.toString());
        }
        finally {
            final Throwable t;
            jpj = new jpj(t);
        }
        final Throwable a = kpj.a((Object)jpj);
        final iih x = iih.x;
        if (a != null) {
            final jih v = jih.v;
            jih.a(x, a);
            return null;
        }
        i = (String)jpj;
        if (!rym.E0(i, "file:///android_asset/", false)) {
            final jih v2 = jih.v;
            jih.a(x, (Throwable)null);
            return null;
        }
        return kym.g1(i, "file:///android_asset/");
    }
    
    public static ecp G(final zrc zrc) {
        Label_0234: {
            Label_0225: {
                Label_0216: {
                    String i = null;
                    Label_0034: {
                        try {
                            final irc o = zrc.o("id");
                            if (o != null) {
                                i = o.i();
                                break Label_0034;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0216;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0225;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0234;
                        }
                        i = null;
                    }
                    final irc o2 = zrc.o("name");
                    String j;
                    if (o2 != null) {
                        j = o2.i();
                    }
                    else {
                        j = null;
                    }
                    final irc o3 = zrc.o("email");
                    String k;
                    if (o3 != null) {
                        k = o3.i();
                    }
                    else {
                        k = null;
                    }
                    final irc o4 = zrc.o("anonymous_id");
                    String l;
                    if (o4 != null) {
                        l = o4.i();
                    }
                    else {
                        l = null;
                    }
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    final Iterator iterator = ((hgd)zrc.v.entrySet()).iterator();
                    while (((jgd)iterator).hasNext()) {
                        final kgd a = ((jgd)iterator).a();
                        if (!iw0.G0((Object[])ecp.f, ((Map$Entry)a).getKey())) {
                            final Object key = ((Map$Entry)a).getKey();
                            key.getClass();
                            ((Map)linkedHashMap).put(key, ((Map$Entry)a).getValue());
                        }
                    }
                    return new ecp(i, j, k, l, (Map)linkedHashMap);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Usr", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Usr", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Usr", (Throwable)ex3);
        return null;
    }
    
    public static final String H(final Object o) {
        final StringBuilder sb = new StringBuilder();
        sb.append(o);
        sb.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
        return sb.toString();
    }
    
    public static final ArrayList I(final flc flc) {
        flc.getClass();
        final LayoutNode x0 = ((wxd)flc).x0();
        final boolean n = N(x0);
        final hnf hnf = (hnf)x0.r();
        final inf v = hnf.v;
        final ArrayList list = new ArrayList(v.x);
        for (int x2 = v.x, i = 0; i < x2; ++i) {
            final LayoutNode layoutNode = (LayoutNode)hnf.get(i);
            List list2;
            if (n) {
                list2 = layoutNode.p();
            }
            else {
                list2 = layoutNode.q();
            }
            list.add((Object)list2);
        }
        return list;
    }
    
    public static final h57 J(final dlf dlf) {
        final i27 s = dlf.s();
        final String e = dlf.e();
        final d4h l = dlf.l();
        final q0 h = dlf.H();
        final d0h b = c87.b(dlf);
        final g2j g2j = null;
        final Long n = null;
        ln1 ln1;
        if (b != null) {
            ln1 = new ln1(b.c, b.b);
        }
        else {
            ln1 = null;
        }
        final zmd k = dlf.k();
        final h2j n2 = dlf.N();
        final f87 a = dlf.a();
        while (true) {
            for (final Object next : (Iterable)((Map)l).values()) {
                if (!((gko)next).f()) {
                    final gko gko = (gko)next;
                    if ((e != null || h != null || a.a()) && ln1 != null) {
                        Long h2 = n;
                        if (gko != null) {
                            h2 = gko.h;
                        }
                        return (h57)new f57(h2, ln1);
                    }
                    final long n3 = 0L;
                    if (e == null) {
                        boolean b2 = true;
                        if (h == null || !h.f) {
                            if (h != null) {
                                g2j g2j2 = g2j;
                                if (n2 instanceof g2j) {
                                    g2j2 = (g2j)n2;
                                }
                                if (gko != null) {
                                    final l7f c = gko.c();
                                    if (c != null && c.h()) {
                                        return (h57)new e57(g2j2, b2);
                                    }
                                }
                                b2 = false;
                                return (h57)new e57(g2j2, b2);
                            }
                            if (n2 != null) {
                                return (h57)new d57(n2);
                            }
                            if (q(k, xmd.a)) {
                                return (h57)b57.a;
                            }
                            if (k instanceof vmd) {
                                return (h57)a57.a;
                            }
                            if (q(k, ymd.a) && s.b().isEmpty()) {
                                return (h57)c57.a;
                            }
                            if (a.a()) {
                                if (gko != null) {
                                    final Long h3 = gko.h;
                                    if (h3 != null) {
                                        final long n4 = h3;
                                        return (h57)new g57(n4);
                                    }
                                }
                                long n4 = n3;
                                if (gko != null) {
                                    final jko a2 = gko.a;
                                    n4 = n3;
                                    if (a2 != null) {
                                        n4 = a2.a();
                                    }
                                }
                                return (h57)new g57(n4);
                            }
                            return (h57)z47.a;
                        }
                    }
                    if (gko != null) {
                        final Long h4 = gko.h;
                        if (h4 != null) {
                            final long n5 = h4;
                            return (h57)new g57(n5);
                        }
                    }
                    long n5 = n3;
                    if (gko != null) {
                        final jko a3 = gko.a;
                        n5 = n3;
                        if (a3 != null) {
                            n5 = a3.a();
                        }
                    }
                    return (h57)new g57(n5);
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public static final boolean K(final zoa zoa) {
        final zoa w = zoa.w;
        eqi.b0();
        final int v = zoa.C.v;
        final int v2 = zoa.v;
        return 550 <= v2 && v2 < v;
    }
    
    public static final String L(final ao9 ao9) {
        if (ao9 instanceof yn9) {
            return "unauthenticated";
        }
        if (ao9 instanceof zn9) {
            return "authenticated";
        }
        en9.r();
        return null;
    }
    
    public static final float[] M(float[] array) {
        final float n = array[0];
        final float n2 = array[3];
        final float n3 = array[6];
        final float n4 = array[1];
        final float n5 = array[4];
        final float n6 = array[7];
        final float n7 = array[2];
        final float n8 = array[5];
        final float n9 = array[8];
        final float n10 = n5 * n9 - n6 * n8;
        final float n11 = n6 * n7 - n4 * n9;
        final float n12 = n4 * n8 - n5 * n7;
        final float n13 = n3 * n12 + (n2 * n11 + n * n10);
        array = new float[array.length];
        array[0] = n10 / n13;
        array[1] = n11 / n13;
        array[2] = n12 / n13;
        array[3] = (n3 * n8 - n2 * n9) / n13;
        array[4] = (n9 * n - n3 * n7) / n13;
        array[5] = (n7 * n2 - n8 * n) / n13;
        array[6] = (n2 * n6 - n3 * n5) / n13;
        array[7] = (n3 * n4 - n6 * n) / n13;
        array[8] = (n * n5 - n2 * n4) / n13;
        return array;
    }
    
    public static final boolean N(LayoutNode g) {
        final int d = ge9.D(g.v());
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    return false;
                }
                if (d != 3) {
                    if (d != 4) {
                        en9.r();
                        return false;
                    }
                    g = g.G();
                    if (g != null) {
                        return N(g);
                    }
                    en9.s("no parent for idle node");
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static final boolean O(final String s) {
        if (((CharSequence)s).length() > 0 && !s.equals(".") && !s.equals("..")) {
            for (int i = 0; i < ((CharSequence)s).length(); ++i) {
                final char char1 = ((CharSequence)s).charAt(i);
                if (char1 == '/' || char1 == '\\') {
                    return false;
                }
                if (char1 == '\0') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static final boolean P(final h57 h57) {
        return h57 instanceof e57 || h57 instanceof g57 || h57 instanceof f57;
    }
    
    public static final uyk R(final BufferedReader bufferedReader) {
        return (uyk)new av6((uyk)new i86((Object)bufferedReader, (byte)1));
    }
    
    public static final int S(final g4d g4d, final boolean b) {
        int n;
        int n2;
        if (b) {
            n = g4d.g();
            n2 = g4d.j();
        }
        else {
            n = g4d.m();
            n2 = g4d.f();
        }
        return n2 + n;
    }
    
    public static final float[] T(final float[] array, final float[] array2) {
        final float[] array3 = new float[9];
        if (array.length >= 9) {
            if (array2.length >= 9) {
                final float n = array[0];
                final float n2 = array2[0];
                final float n3 = array[3];
                final float n4 = array2[1];
                final float n5 = array[6];
                final float n6 = array2[2];
                array3[0] = n5 * n6 + (n3 * n4 + n * n2);
                final float n7 = array[1];
                final float n8 = array2[0];
                final float n9 = array[4];
                final float n10 = array[7];
                array3[1] = n10 * n6 + (n4 * n9 + n7 * n8);
                final float n11 = array[2];
                final float n12 = array[5];
                final float n13 = array2[1];
                final float n14 = array[8];
                array3[2] = n6 * n14 + (n13 * n12 + n11 * n8);
                final float n15 = array[0];
                final float n16 = array2[3];
                final float n17 = array2[4];
                final float n18 = array2[5];
                array3[3] = n5 * n18 + (n3 * n17 + n16 * n15);
                final float n19 = array[1];
                final float n20 = array2[3];
                array3[4] = n10 * n18 + (n9 * n17 + n19 * n20);
                final float n21 = array[2];
                array3[5] = n18 * n14 + (n12 * array2[4] + n20 * n21);
                final float n22 = array2[6];
                final float n23 = array[3];
                final float n24 = array2[7];
                final float n25 = array2[8];
                array3[6] = n5 * n25 + (n23 * n24 + n15 * n22);
                final float n26 = array2[6];
                array3[7] = n10 * n25 + (array[4] * n24 + n19 * n26);
                array3[8] = n14 * n25 + (array[5] * array2[7] + n21 * n26);
                return array3;
            }
        }
        return array3;
    }
    
    public static final float[] U(final float[] array, final float[] array2) {
        if (array.length >= 9) {
            if (array2.length >= 3) {
                final float n = array2[0];
                final float n2 = array2[1];
                final float n3 = array2[2];
                array2[0] = array[6] * n3 + (array[3] * n2 + array[0] * n);
                array2[1] = array[7] * n3 + (array[4] * n2 + array[1] * n);
                array2[2] = array[8] * n3 + (array[5] * n2 + array[2] * n);
                return array2;
            }
        }
        return array2;
    }
    
    public static ofg V(final is2... array) {
        final int length = array.length;
        final int n = 0;
        if (length == 0) {
            return new ofg(new is2[0], new int[] { 0, -1 });
        }
        final ArrayList list = new ArrayList((Collection)new kv0((Object[])array, false));
        g86.r0((List)list);
        final int size = list.size();
        final ArrayList list2 = new ArrayList(size);
        for (int i = 0; i < size; ++i) {
            list2.add((Object)(-1));
        }
        for (int length2 = array.length, j = 0, n2 = 0; j < length2; ++j, ++n2) {
            list2.set(lq6.j(list, (Comparable)array[j]), (Object)n2);
        }
        if (((is2)list.get(0)).h() > 0) {
            int n3;
            for (int k = 0; k < list.size(); k = n3) {
                final is2 is2 = (is2)list.get(k);
                int l;
                n3 = (l = k + 1);
                while (l < list.size()) {
                    final is2 is3 = (is2)list.get(l);
                    is3.getClass();
                    if (!is3.q(0, is2.h(), is2)) {
                        break;
                    }
                    if (is3.h() == is2.h()) {
                        fvd.t((Object)is3, "duplicate option: ");
                        return null;
                    }
                    if (((Number)list2.get(l)).intValue() > ((Number)list2.get(k)).intValue()) {
                        list.remove(l);
                        ((Number)list2.remove(l)).intValue();
                    }
                    else {
                        ++l;
                    }
                }
            }
            final Object o = new Object();
            r(0L, (an2)o, 0, list, 0, list.size(), list2);
            final int n4 = (int)(((an2)o).w / 4L);
            final int[] array2 = new int[n4];
            for (int n5 = n; n5 < n4; ++n5) {
                array2[n5] = ((an2)o).readInt();
            }
            return new ofg((is2[])Arrays.copyOf((Object[])array, array.length), array2);
        }
        en9.s("the empty byte string is not a supported option");
        return null;
    }
    
    public static final String W(final Reader reader) {
        final StringWriter stringWriter = new StringWriter();
        final char[] array = new char[8192];
        for (int i = reader.read(array); i >= 0; i = reader.read(array)) {
            ((Writer)stringWriter).write(array, 0, i);
        }
        final String string = stringWriter.toString();
        string.getClass();
        return string;
    }
    
    public static final zr4 X(final zta zta, final zta zta2, final zta zta3, final lta lta, final gva gva) {
        final Resources resources = (Resources)gva.j((sei)q50.c);
        Object r;
        if ((r = gva.R()) == bi6.a) {
            final String string = resources.getString(2131758709);
            string.getClass();
            final String string2 = resources.getString(2131756446);
            string2.getClass();
            final String string3 = resources.getString(2131757831);
            string3.getClass();
            r = new zr4(new l84(lta, zta2, resources, zta, (byte)0), new m84(lta, string2, string, (byte)0), new l84(lta, zta2, resources, zta3, (byte)1), new m84(lta, string2, string3, (byte)1));
            gva.q0(r);
        }
        return (zr4)r;
    }
    
    public static final bnf Y(final koa koa, final gva gva) {
        final alj c = clj.c(gva);
        final boolean h = gva.h((Object)c);
        final boolean f = gva.f((Object)koa);
        final Object r = gva.R();
        zta zta;
        if ((h | f) || (zta = (zta)r) == bi6.a) {
            zta = new kd0(c, koa, null, (byte)3);
            gva.q0((Object)zta);
        }
        return ncq.I(null, koa, c, zta, gva, 6);
    }
    
    public static final bnf Z(Object[] copy, final m9k m9k, final jta jta, final gva gva, final int n) {
        copy = Arrays.copyOf(copy, copy.length);
        m9k.getClass();
        return (bnf)c0(copy, (m9k)new n9k((lta)new trf((Object)m9k, (byte)25), (zta)new qxg((Object)m9k, (byte)15)), null, jta, gva, (n << 3 & 0x1C00) | 0x180, 0);
    }
    
    public static final void a(Object o, final lta lta, final gva gva) {
        final boolean f = gva.f(o);
        final Object r = gva.R();
        if (f || (o = r) == bi6.a) {
            o = new zp8(lta);
            gva.q0(o);
        }
        final zp8 zp8 = (zp8)o;
    }
    
    public static final Object a0(final Object[] array, final jta jta, final gva gva, final int n) {
        return c0(Arrays.copyOf(array, array.length), (m9k)t08.i, null, jta, gva, (n << 6 & 0x1C00) | 0x180, 0);
    }
    
    public static final void b(Object o, Object r, final lta lta, final gva gva) {
        final boolean f = gva.f(o);
        final boolean f2 = gva.f(r);
        r = gva.R();
        if ((f | f2) || (o = r) == bi6.a) {
            o = new zp8(lta);
            gva.q0(o);
        }
        final zp8 zp8 = (zp8)o;
    }
    
    public static final Object b0(final Object[] array, final m9k m9k, final jta jta, final gva gva, final int n) {
        return c0(Arrays.copyOf(array, array.length), m9k, null, jta, gva, (n & 0x70) | 0x180 | (n << 3 & 0x1C00), 0);
    }
    
    public static final void c(Object o, Object r, final Object o2, final lta lta, final gva gva) {
        final boolean f = gva.f(o);
        final boolean f2 = gva.f(r);
        final boolean f3 = gva.f(o2);
        r = gva.R();
        if ((f | f2 | f3) || (o = r) == bi6.a) {
            o = new zp8(lta);
            gva.q0(o);
        }
        final zp8 zp8 = (zp8)o;
    }
    
    public static final Object c0(final Object[] array, final m9k m9k, final String s, final jta jta, final gva gva, int n, final int n2) {
        Object i = m9k;
        if ((n2 & 0x2) != 0x0) {
            i = t08.i;
        }
        final long t = gva.T;
        while (true) {
            Label_0042: {
                if (s == null) {
                    break Label_0042;
                }
                final String string = s;
                if (s.length() == 0) {
                    break Label_0042;
                }
                ((m9k)i).getClass();
                final u8k u8k = (u8k)gva.j((sei)w8k.a);
                Object r = gva.R();
                final Object o = null;
                final cib a = bi6.a;
                if (r == a) {
                    Object a2 = null;
                    Label_0137: {
                        if (u8k != null) {
                            final Object f = u8k.f(string);
                            if (f != null) {
                                a2 = ((m9k)i).a(f);
                                break Label_0137;
                            }
                        }
                        a2 = null;
                    }
                    Object a3 = a2;
                    if (a2 == null) {
                        a3 = jta.a();
                    }
                    r = new p8k((m9k)i, u8k, string, a3, array);
                    gva.q0(r);
                }
                final p8k p8k = (p8k)r;
                Object y = o;
                if (Arrays.equals(array, p8k.z)) {
                    y = p8k.y;
                }
                Object a4;
                if ((a4 = y) == null) {
                    a4 = jta.a();
                }
                final boolean h = gva.h((Object)p8k);
                if ((((n & 0x70) ^ 0x30) > 32 && gva.h(i)) || (n & 0x30) == 0x20) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                final boolean h2 = gva.h((Object)u8k);
                final boolean f2 = gva.f((Object)string);
                final boolean h3 = gva.h(a4);
                final boolean h4 = gva.h((Object)array);
                final Object r2 = gva.R();
                Object o2;
                if (((h ? 1 : 0) | n | (h2 ? 1 : 0) | (f2 ? 1 : 0) | (h3 ? 1 : 0) | (h4 ? 1 : 0)) == 0x0 && r2 != a) {
                    o2 = r2;
                }
                else {
                    o2 = new jvl(p8k, (m9k)i, u8k, string, a4, array);
                    gva.q0(o2);
                }
                l((jta)o2, gva);
                return a4;
            }
            lq6.u(36);
            final String string = Long.toString(t, 36);
            string.getClass();
            continue;
        }
    }
    
    public static final void d(Object[] copy, final lta lta, final gva gva) {
        copy = Arrays.copyOf(copy, copy.length);
        boolean d = gva.d(copy.length);
        for (int length = copy.length, i = 0; i < length; ++i) {
            d |= gva.f(copy[i]);
        }
        final Object r = gva.R();
        if (!d && r != bi6.a) {
            return;
        }
        gva.q0((Object)new zp8(lta));
    }
    
    public static final void d0(final Context context, String id, String f, final String s, final String s2, final Icon icon, final String s3) {
        final ShortcutManager shortcutManager = (ShortcutManager)context.getSystemService((Class)ShortcutManager.class);
        if (shortcutManager == null) {
            return;
        }
        yog yog;
        if (s3 == null) {
            yog = new yog((Object)"chat_".concat(id), (Object)uwl.x);
        }
        else {
            yog = new yog((Object)lmf.s("artifact_", id, "_", s3), (Object)uwl.w);
        }
        final String s4 = (String)yog.v;
        final uwl uwl = (uwl)yog.w;
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName(context.getPackageName(), "com.anthropic.claude.deeplink.DeepLinkActivity");
        intent.putExtra("EXTRA_SHORTCUT_TYPE", uwl.a());
        intent.putExtra("com.anthropic.claude.intent.extra.CHAT_ID", id);
        intent.putExtra("com.anthropic.claude.intent.extra.ACCOUNT_ID", f);
        intent.putExtra("com.anthropic.claude.intent.extra.ORGANIZATION_ID", s);
        if (s3 != null) {
            intent.putExtra("com.anthropic.claude.intent.extra.ARTIFACT_IDENTIFIER", s3);
        }
        f = s4;
        Label_0329: {
            if (s3 != null) {
                final List pinnedShortcuts = shortcutManager.getPinnedShortcuts();
                pinnedShortcuts.getClass();
                while (true) {
                    for (final Object next : pinnedShortcuts) {
                        final ShortcutInfo shortcutInfo = (ShortcutInfo)next;
                        shortcutInfo.getClass();
                        final Intent intent2 = shortcutInfo.getIntent();
                        kcg a0;
                        if (intent2 != null) {
                            a0 = vt4.a0(intent2);
                        }
                        else {
                            a0 = null;
                        }
                        if (a0 == null) {
                            continue;
                        }
                        if (!q(a0.a, id)) {
                            continue;
                        }
                        f = a0.f;
                        if (f == null || !ArtifactIdentifier.b(f, s3)) {
                            continue;
                        }
                        final ShortcutInfo shortcutInfo2 = (ShortcutInfo)next;
                        final ShortcutInfo shortcutInfo3 = shortcutInfo2;
                        if (shortcutInfo3 != null) {
                            id = shortcutInfo3.getId();
                        }
                        else {
                            id = null;
                        }
                        f = s4;
                        if (id != null) {
                            f = id;
                        }
                        break Label_0329;
                    }
                    final ShortcutInfo shortcutInfo2 = null;
                    continue;
                }
            }
        }
        final ShortcutInfo build = new ShortcutInfo$Builder(context, f).setShortLabel((CharSequence)s2).setLongLabel((CharSequence)s2).setIcon(icon).setIntent(intent).build();
        build.getClass();
        shortcutManager.updateShortcuts(lq6.X(build));
        shortcutManager.requestPinShortcut(build, (IntentSender)null);
    }
    
    public static n70 e(final int n, final int n2, int sdk_INT, final int n3) {
        if ((n3 & 0x4) != 0x0) {
            sdk_INT = 0;
        }
        final yrj e = x86.e;
        ien.J(sdk_INT);
        final Bitmap$Config j = ien.J(sdk_INT);
        Object o;
        if (q(e, e)) {
            o = ColorSpace.get(ColorSpace$Named.SRGB);
        }
        else if (q(e, x86.q)) {
            o = ColorSpace.get(ColorSpace$Named.ACES);
        }
        else if (q(e, x86.r)) {
            o = ColorSpace.get(ColorSpace$Named.ACESCG);
        }
        else if (q(e, x86.o)) {
            o = ColorSpace.get(ColorSpace$Named.ADOBE_RGB);
        }
        else if (q(e, x86.j)) {
            o = ColorSpace.get(ColorSpace$Named.BT2020);
        }
        else if (q(e, x86.i)) {
            o = ColorSpace.get(ColorSpace$Named.BT709);
        }
        else if (q(e, x86.t)) {
            o = ColorSpace.get(ColorSpace$Named.CIE_LAB);
        }
        else if (q(e, x86.s)) {
            o = ColorSpace.get(ColorSpace$Named.CIE_XYZ);
        }
        else if (q(e, x86.k)) {
            o = ColorSpace.get(ColorSpace$Named.DCI_P3);
        }
        else if (q(e, x86.l)) {
            o = ColorSpace.get(ColorSpace$Named.DISPLAY_P3);
        }
        else if (q(e, x86.g)) {
            o = ColorSpace.get(ColorSpace$Named.EXTENDED_SRGB);
        }
        else if (q(e, x86.h)) {
            o = ColorSpace.get(ColorSpace$Named.LINEAR_EXTENDED_SRGB);
        }
        else if (q(e, x86.f)) {
            o = ColorSpace.get(ColorSpace$Named.LINEAR_SRGB);
        }
        else if (q(e, x86.m)) {
            o = ColorSpace.get(ColorSpace$Named.NTSC_1953);
        }
        else if (q(e, x86.p)) {
            o = ColorSpace.get(ColorSpace$Named.PRO_PHOTO_RGB);
        }
        else if (q(e, x86.n)) {
            o = ColorSpace.get(ColorSpace$Named.SMPTE_C);
        }
        else {
            sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 34) {
                o = tjq.m((u86)e);
                if (o != null) {
                    return new n70(Bitmap.createBitmap((DisplayMetrics)null, n, n2, j, true, (ColorSpace)o));
                }
            }
            if (sdk_INT >= 36) {
                o = ujq.h((u86)e);
                if (o != null) {
                    return new n70(Bitmap.createBitmap((DisplayMetrics)null, n, n2, j, true, (ColorSpace)o));
                }
            }
            if (e != null) {
                final String a = ((u86)e).a;
                final float[] a2 = e.d.a();
                final ieo g = e.g;
                ColorSpace$Rgb$TransferParameters colorSpace$Rgb$TransferParameters;
                if (g != null) {
                    colorSpace$Rgb$TransferParameters = new ColorSpace$Rgb$TransferParameters(g.b, g.c, g.d, g.e, g.f, g.g, g.a);
                }
                else {
                    colorSpace$Rgb$TransferParameters = null;
                }
                final float[] i = e.i;
                if (colorSpace$Rgb$TransferParameters != null) {
                    final ColorSpace$Rgb colorSpace$Rgb = new ColorSpace$Rgb(a, e.h, a2, colorSpace$Rgb$TransferParameters);
                    if (!Float.isNaN(i[0])) {
                        if (!Arrays.equals(colorSpace$Rgb.getTransform(), i)) {
                            o = new ColorSpace$Rgb(a, i, colorSpace$Rgb$TransferParameters);
                            return new n70(Bitmap.createBitmap((DisplayMetrics)null, n, n2, j, true, (ColorSpace)o));
                        }
                    }
                    o = colorSpace$Rgb;
                }
                else {
                    o = new ColorSpace$Rgb(a, e.h, a2, (DoubleUnaryOperator)new v86((lta)e.l, (byte)0), (DoubleUnaryOperator)new v86((lta)e.o, (byte)1), e.e, e.f);
                }
            }
            else {
                o = ColorSpace.get(ColorSpace$Named.SRGB);
            }
        }
        return new n70(Bitmap.createBitmap((DisplayMetrics)null, n, n2, j, true, (ColorSpace)o));
    }
    
    public static final Object e0(hc7 hc7, final zta zta) {
        final p3 x = p3.x;
        final ic7 ic7 = (ic7)hc7.M0((gc7)x);
        final o89 v = o89.v;
        on9 on9;
        if (ic7 == null) {
            final on9 a = lsn.a();
            final hc7 t = twl.t((hc7)v, hc7.F0((hc7)a), true);
            final o68 a2 = vo8.a;
            on9 = a;
            if ((hc7 = t) != a2) {
                on9 = a;
                hc7 = t;
                if (t.M0((gc7)x) == null) {
                    hc7 = t.F0((hc7)a2);
                    on9 = a;
                }
            }
        }
        else {
            final on9 on10 = (on9)lsn.a.get();
            final hc7 t2 = twl.t((hc7)v, hc7, true);
            final o68 a3 = vo8.a;
            on9 = on10;
            if ((hc7 = t2) != a3) {
                on9 = on10;
                hc7 = t2;
                if (t2.M0((gc7)x) == null) {
                    hc7 = t2.F0((hc7)a3);
                    on9 = on10;
                }
            }
        }
        final xf2 xf2 = new xf2(hc7, Thread.currentThread(), on9);
        ((q0)xf2).n0(1, (q0)xf2, zta);
        hc7 = (hc7)xf2.A;
        if (hc7 != null) {
            ((on9)hc7).q1(false);
        }
    Label_0235_Outer:
        while (true) {
            Label_0231: {
                if (hc7 == null) {
                    break Label_0231;
                }
            Label_0308_Outer:
                while (true) {
                    try {
                        final long s1 = ((on9)hc7).s1();
                        break Label_0235;
                    }
                    finally {
                        if (hc7 != null) {
                            ((on9)hc7).k1(false);
                        }
                        cd6 cd6 = null;
                    Label_0282_Outer:
                        while (true) {
                            iftrue(Label_0314:)(cd6 != null);
                            return null;
                            Label_0273: {
                                iftrue(Label_0282:)(hc7 == null);
                            }
                        Block_13:
                            while (true) {
                                Block_12: {
                                    break Block_12;
                                    a4 = cqc.a(((bqc)xf2).K());
                                    iftrue(Label_0306:)(!(a4 instanceof cd6));
                                    break Block_13;
                                    Block_11: {
                                        while (true) {
                                            final long s1;
                                            LockSupport.parkNanos((Object)xf2, s1);
                                            iftrue(Label_0215:)(!Thread.interrupted());
                                            break Block_11;
                                            iftrue(Label_0273:)(((bqc)xf2).R0());
                                            continue;
                                        }
                                        final long s1 = Long.MAX_VALUE;
                                        continue Label_0308_Outer;
                                    }
                                    ((bqc)xf2).v((Object)new InterruptedException());
                                    continue Label_0235_Outer;
                                }
                                ((on9)hc7).k1(false);
                                continue;
                            }
                            cd6 = (cd6)a4;
                            continue Label_0282_Outer;
                            Label_0306:
                            cd6 = null;
                            continue Label_0282_Outer;
                        }
                        Label_0314: {
                            throw cd6.a;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public static final void f(final zta zta, final gva gva, Object o) {
        final hc7 r = gva.R;
        final boolean f = gva.f(o);
        final Object r2 = gva.R();
        if (f || (o = r2) == bi6.a) {
            o = new c(r, zta);
            gva.q0(o);
        }
        final c c = (c)o;
    }
    
    public static Object f0(final zta zta) {
        return e0((hc7)o89.v, zta);
    }
    
    public static final void g(Object o, Object r, final zta zta, final gva gva) {
        final hc7 r2 = gva.R;
        final boolean f = gva.f(o);
        final boolean f2 = gva.f(r);
        r = gva.R();
        if ((f | f2) || (o = r) == bi6.a) {
            o = new c(r2, zta);
            gva.q0(o);
        }
        final c c = (c)o;
    }
    
    public static void g0(final RuntimeException ex, final String s) {
        final StackTraceElement[] stackTrace = ((Throwable)ex).getStackTrace();
        final int length = stackTrace.length;
        int n = -1;
        for (int i = 0; i < length; ++i) {
            if (s.equals((Object)stackTrace[i].getClassName())) {
                n = i;
            }
        }
        ((Throwable)ex).setStackTrace((StackTraceElement[])Arrays.copyOfRange((Object[])stackTrace, n + 1, length));
    }
    
    public static final void h(Object o, Object r, final Object o2, final zta zta, final gva gva) {
        final hc7 r2 = gva.R;
        final boolean f = gva.f(o);
        final boolean f2 = gva.f(r);
        final boolean f3 = gva.f(o2);
        r = gva.R();
        if ((f | f2 | f3) || (o = r) == bi6.a) {
            o = new c(r2, zta);
            gva.q0(o);
        }
        final c c = (c)o;
    }
    
    public static final igf h0(final igf igf, final mgk mgk, final zhg zhg, final w60 w60, final boolean b, final boolean b2, final gia gia, final llf llf, final yl2 yl2) {
        final zhg v = zhg.v;
        final fgf v2 = fgf.v;
        igf igf2;
        if (zhg == v) {
            igf2 = rml.k((igf)v2, ylb.c);
        }
        else {
            igf2 = rml.k((igf)v2, ylb.b);
        }
        return igf.E(igf2).E(new vfk(w60, yl2, gia, llf, zhg, mgk, b, b2, false));
    }
    
    public static final void i(Object[] copy, final zta zta, final gva gva) {
        final hc7 r = gva.R;
        copy = Arrays.copyOf(copy, copy.length);
        boolean d = gva.d(copy.length);
        for (int length = copy.length, i = 0; i < length; ++i) {
            d |= gva.f(copy[i]);
        }
        final Object r2 = gva.R();
        if (!d && r2 != bi6.a) {
            return;
        }
        gva.q0((Object)new c(r, zta));
    }
    
    public static final void i0(final kbd kbd) {
        y(kbd);
        if (kbd.w == sad.x) {
            kbd.b();
        }
    }
    
    public static final void j(final dq4 dq4, final igf igf, final vlm vlm, final ye6 ye6, final gva gva, final int n) {
        gva.i0(11583962);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)dq4)) {
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
            boolean b;
            if ((n & 0x200) == 0x0) {
                b = gva.f((Object)vlm);
            }
            else {
                b = gva.h((Object)vlm);
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
            int n9;
            if (gva.h((Object)ye6)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        if (gva.W(n8 & 0x1, (n8 & 0x493) != 0x492)) {
            r9n.a(dq4, igf, vlm, uuj.t0(-2034294534, (aua)new kj4(ye6, (byte)1), gva), gva, (n8 & 0x380) | ((n8 & 0xE) | 0xC00 | (n8 & 0x70)));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new fq4(dq4, igf, vlm, ye6, n, (byte)1);
        }
    }
    
    public static void j0(final String s) {
        final UninitializedPropertyAccessException ex = new UninitializedPropertyAccessException(hia.k("lateinit property ", s, " has not been initialized"));
        g0((RuntimeException)ex, mlc.class.getName());
        throw ex;
    }
    
    public static final void k(final gwj gwj, igf v, vlm vlm, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(456095895);
        int n4;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)gwj);
            }
            else {
                b = gva.h((Object)gwj);
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
                boolean b2;
                if ((n & 0x200) == 0x0) {
                    b2 = gva.f((Object)vlm);
                }
                else {
                    b2 = gva.h((Object)vlm);
                }
                int n10;
                if (b2) {
                    n10 = 256;
                }
                else {
                    n10 = 128;
                }
                n9 = (n6 | n10);
            }
        }
        int n11 = n9;
        if ((n & 0xC00) == 0x0) {
            int n12;
            if (gva.h((Object)ye6)) {
                n12 = 2048;
            }
            else {
                n12 = 1024;
            }
            n11 = (n9 | n12);
        }
        if (gva.W(n11 & 0x1, (n11 & 0x493) != 0x492)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            if (n8 != 0) {
                vlm = null;
            }
            j((dq4)gwj.w.getValue(), v, vlm, ye6, gva, n11 & 0x1FF0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new f8e((Object)gwj, (Object)v, (Object)vlm, (zta)ye6, n, n2, (byte)1);
        }
    }
    
    public static final ApiResult k0(final rnj rnj, final Type type, final fu4 fu4) {
        final snj a = rnj.a;
        final int y = a.y;
        if (a.K) {
            if (type.equals(lqo.class)) {
                return (ApiResult)new qj0(y, (Object)lqo.a);
            }
            return (ApiResult)new qj0(y, rnj.b);
        }
        else {
            final unj c = rnj.c;
            Label_0088: {
                if (c == null) {
                    break Label_0088;
                }
                Label_0096: {
                    try {
                        final Object y2;
                        if ((y2 = c.Y0()) == null) {
                            break Label_0088;
                        }
                        break Label_0096;
                    }
                    finally {
                        try {}
                        finally {
                            zn2.r((Closeable)c, (Throwable)type);
                        }
                        final Object y2 = new Object();
                        final eu4 a2 = fu4.a(y, (qn2)y2, pbr.i(rnj));
                        zn2.r((Closeable)c, null);
                        return (ApiResult)new nj0(y, a2);
                    }
                }
            }
        }
    }
    
    public static final void l(final jta jta, final gva gva) {
        final jfg f = gva.M.b.f;
        f.j0((gfg)weg.c);
        t08.g0(f, 0, (Object)jta);
    }
    
    public static final double l0(final long n) {
        return (n >>> 11) * 2048.0 + (n & 0x7FFL);
    }
    
    public static u86 m(final u86 u86) {
        final jvp f = xp7.f;
        final jy7 x = jy7.x;
        if (rhc.p(u86.b, 12884901888L)) {
            final yrj yrj = (yrj)u86;
            final jvp d = yrj.d;
            if (!w(d, f)) {
                return (u86)new yrj(((u86)yrj).a, yrj.h, f, T(t((float[])x.w, d.a(), f.a()), yrj.i), yrj.k, yrj.n, yrj.e, yrj.f, yrj.g, -1);
            }
        }
        return u86;
    }
    
    public static final List m0(final int n, final int n2, final ArrayList list, final List list2) {
        if (list.isEmpty()) {
            return (List)r89.v;
        }
        final ArrayList list3 = new ArrayList((Collection)list2);
        for (int size = list.size(), i = 0; i < size; ++i) {
            final g4d g4d = (g4d)list.get(i);
            final int index = g4d.getIndex();
            if (n <= index && index <= n2) {
                list3.add((Object)g4d);
            }
        }
        g86.s0((List)list3, (Comparator)mlc.c);
        return (List)list3;
    }
    
    public static boolean n(final float n, final Float n2) {
        return n2 != null && n == n2;
    }
    
    public static void n0(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                en9.s(smk.p(n2, "negative size: "));
                return;
            }
            s = f2r.l("%s (%s) must be less than size (%s)", new Object[] { "index", n, n2 });
        }
        else {
            s = f2r.l("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static boolean o(final Double n, final Double n2) {
        if (n == null) {
            return n2 == null;
        }
        return n2 != null && n == (double)n2;
    }
    
    public static void o0(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return;
        }
        en9.j(q0(n, n2, "index"));
    }
    
    public static boolean p(final Float n, final float n2) {
        return n != null && n == n2;
    }
    
    public static void p0(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = f2r.l("end index (%s) must not be less than start index (%s)", new Object[] { n2, n });
            }
            else {
                s = q0(n2, n3, "end index");
            }
        }
        else {
            s = q0(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static boolean q(final Object o, final Object obj) {
        if (o == null) {
            return obj == null;
        }
        return o.equals(obj);
    }
    
    public static String q0(final int n, final int n2, final String s) {
        if (n < 0) {
            return f2r.l("%s (%s) must not be negative", new Object[] { s, n });
        }
        if (n2 >= 0) {
            return f2r.l("%s (%s) must not be greater than size (%s)", new Object[] { s, n, n2 });
        }
        en9.s(smk.p(n2, "negative size: "));
        return null;
    }
    
    public static void r(long n, final an2 an2, int i, final ArrayList list, int j, final int n2, final ArrayList list2) {
        int k = i;
        ArrayList list3 = list;
        if (j >= n2) {
            en9.s("Failed requirement.");
            return;
        }
        for (i = j; i < n2; ++i) {
            if (((is2)list3.get(i)).h() < k) {
                en9.s("Failed requirement.");
                return;
            }
        }
        is2 is2 = (is2)list.get(j);
        final is2 is3 = (is2)list3.get(n2 - 1);
        if (k == is2.h()) {
            final int intValue = ((Number)list2.get(j)).intValue();
            i = j + 1;
            is2 = (is2)list3.get(i);
            j = intValue;
        }
        else {
            i = j;
            j = -1;
        }
        if (is2.m(k) != is3.m(k)) {
            int l = i + 1;
            int n3 = 1;
            while (l < n2) {
                int n4 = n3;
                if (((is2)list3.get(l - 1)).m(k) != ((is2)list3.get(l)).m(k)) {
                    n4 = n3 + 1;
                }
                ++l;
                n3 = n4;
            }
            n = an2.w / 4L + n + 2L + n3 * 2;
            an2.j1(n3);
            an2.j1(j);
            byte m;
            for (j = i; j < n2; ++j) {
                m = ((is2)list3.get(j)).m(k);
                if (j == i || m != ((is2)list3.get(j - 1)).m(k)) {
                    an2.j1(m & 0xFF);
                }
            }
            final Object o = new Object();
            j = i;
        Label_0336:
            while (j < n2) {
                final byte m2 = ((is2)list3.get(j)).m(k);
                while (true) {
                    for (int n5 = i = j + 1; i < n2; ++i) {
                        if (m2 != ((is2)list3.get(i)).m(k)) {
                            if (n5 == i && k + 1 == ((is2)list3.get(j)).h()) {
                                an2.j1(((Number)list2.get(j)).intValue());
                            }
                            else {
                                an2.j1((int)(((an2)o).w / 4L + n) * -1);
                                r(n, (an2)o, k + 1, list, j, i, list2);
                                list3 = list;
                            }
                            j = i;
                            continue Label_0336;
                        }
                    }
                    i = n2;
                    continue;
                }
            }
            an2.R((nam)o);
            return;
        }
        final int min = Math.min(is2.h(), is3.h());
        int n6 = 0;
        for (int n7 = k; n7 < min && is2.m(n7) == is3.m(n7); ++n7) {
            ++n6;
        }
        n = an2.w / 4L + n + 2L + n6 + 1L;
        an2.j1(-n6);
        an2.j1(j);
        for (j = k + n6; k < j; ++k) {
            an2.j1(is2.m(k) & 0xFF);
        }
        if (i + 1 != n2) {
            final Object o2 = new Object();
            an2.j1((int)(((an2)o2).w / 4L + n) * -1);
            r(n, (an2)o2, j, list3, i, n2, list2);
            an2.R((nam)o2);
            return;
        }
        if (j == ((is2)list3.get(i)).h()) {
            an2.j1(((Number)list2.get(i)).intValue());
            return;
        }
        en9.q("Check failed.");
    }
    
    public static final boolean s(final Context context) {
        jpj jpj = null;
        try {
            final ShortcutManager shortcutManager = (ShortcutManager)context.getSystemService((Class)ShortcutManager.class);
        }
        finally {
            final Throwable t;
            jpj = new jpj(t);
        }
        Object o = jpj;
        if (jpj instanceof jpj) {
            o = null;
        }
        final ShortcutManager shortcutManager2 = (ShortcutManager)o;
        boolean b = false;
        if (shortcutManager2 != null) {
            b = b;
            if (shortcutManager2.isRequestPinShortcutSupported()) {
                b = true;
            }
        }
        return b;
    }
    
    public static final float[] t(final float[] array, float[] m, float[] array2) {
        U(array, m);
        U(array, array2);
        array2 = new float[] { array2[0] / m[0], array2[1] / m[1], array2[2] / m[2] };
        m = M(array);
        final float n = array2[0];
        final float n2 = array[0];
        final float n3 = array2[1];
        final float n4 = array[1];
        final float n5 = array2[2];
        return T(m, new float[] { n2 * n, n4 * n3, array[2] * n5, array[3] * n, array[4] * n3, array[5] * n5, n * array[6], n3 * array[7], n5 * array[8] });
    }
    
    public static int u(final int n, final int n2) {
        if (n < n2) {
            return -1;
        }
        if (n == n2) {
            return 0;
        }
        return 1;
    }
    
    public static int v(final long n, final long n2) {
        final long n3 = lcmp(n, n2);
        if (n3 < 0) {
            return -1;
        }
        if (n3 == 0) {
            return 0;
        }
        return 1;
    }
    
    public static final boolean w(final jvp jvp, final jvp jvp2) {
        return jvp == jvp2 || (Math.abs(jvp.a - jvp2.a) < 0.001f && Math.abs(jvp.b - jvp2.b) < 0.001f);
    }
    
    public static gjh x(j9j j9j, final List list, final oc7 oc7, final jta jta) {
        final sca sca = new sca((wzk)o55.B, (jta)new v24(jta, (byte)9));
        hc7 hc7;
        if (oc7.getCoroutineContext().M0((gc7)o55.z) == null) {
            hc7 = oc7.getCoroutineContext().F0((hc7)x90.d());
        }
        else {
            hc7 = oc7.getCoroutineContext();
        }
        final Object o = new cib((byte)23);
        if (j9j == null) {
            j9j = (j9j)o;
        }
        return new gjh((ou7)new gjh((ou7)new rv7(sca, lq6.X(new p10((byte)21, (f07)null, (Object)c86.Z0((Collection)r89.v, (Iterable)list))), (uc7)j9j, hc7)));
    }
    
    public static final void y(final kbd kbd) {
        if (kbd.w == sad.w) {
            kbd.onCreate();
        }
    }
    
    public static final oc7 z(final hc7 hc7, final gva gva) {
        if (hc7.M0((gc7)o55.z) != null) {
            final ppc d = x90.d();
            ((bqc)d).S((Object)new cd6((Throwable)new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
            return (oc7)ien.a((hc7)d);
        }
        return (oc7)new e(gva.R, hc7);
    }
    
    public abstract void Q(final Object p0, final cvj p1);
}
