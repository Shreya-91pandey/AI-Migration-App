import java.util.AbstractCollection;
import java.util.NoSuchElementException;
import android.content.Context;
import android.os.Bundle;
import java.io.Serializable;
import java.util.Set;
import java.util.Locale;
import java.util.Arrays;
import androidx.work.impl.WorkDatabase;
import android.util.Log;
import androidx.compose.ui.node.LayoutNode;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import com.anthropic.claude.conversation.model.q0;
import java.util.ListIterator;
import com.anthropic.claude.analytics.events.ChatEvents$DraftRestoreTrigger;
import java.net.ProtocolException;
import java.util.List;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;

public abstract class qt7
{
    public static final ad8 a;
    public static final cib b;
    public static final def c;
    public static final eup d;
    public static final char[] e;
    
    public static final Class A(final rtc rtc) {
        final Class a = ((ns4)rtc).a();
        if (a.isPrimitive()) {
            final String name = a.getName();
            switch (name.hashCode()) {
                case 109413500: {
                    if (!name.equals((Object)"short")) {
                        break;
                    }
                    return Short.class;
                }
                case 97526364: {
                    if (!name.equals((Object)"float")) {
                        break;
                    }
                    return Float.class;
                }
                case 64711720: {
                    if (!name.equals((Object)"boolean")) {
                        break;
                    }
                    return Boolean.class;
                }
                case 3625364: {
                    if (!name.equals((Object)"void")) {
                        break;
                    }
                    return Void.class;
                }
                case 3327612: {
                    if (!name.equals((Object)"long")) {
                        break;
                    }
                    return Long.class;
                }
                case 3052374: {
                    if (!name.equals((Object)"char")) {
                        break;
                    }
                    return Character.class;
                }
                case 3039496: {
                    if (!name.equals((Object)"byte")) {
                        break;
                    }
                    return Byte.class;
                }
                case 104431: {
                    if (!name.equals((Object)"int")) {
                        break;
                    }
                    return Integer.class;
                }
                case -1325958191: {
                    if (!name.equals((Object)"double")) {
                        break;
                    }
                    return Double.class;
                }
            }
        }
        return a;
    }
    
    public static final f9k B(final ycp ycp) {
        return (f9k)new c2l(ycp.s(), (vcp)new Object(), ach.O(ycp)).D(v4j.a((Class)f9k.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
    
    public static final k2j C(final c2l c2l) {
        return rml.f(l6g.i(((l6g)((ksg)c2l.x).getValue()).a, ((l6g)((ksg)c2l.y).getValue()).a), ((yzl)((ksg)c2l.w).getValue()).a);
    }
    
    public static final String D(final String s, final gva gva) {
        if (s == null) {
            return hia.j(gva, -1735535094, 2131756326, gva, false);
        }
        gva.g0(-1735535528);
        gva.q(false);
        return s;
    }
    
    public static final boolean F(final int n, final int n2, final String s) {
        final int n3 = n + 2;
        return n3 < n2 && s.charAt(n) == '%' && gcq.l(s.charAt(n + 1)) != -1 && gcq.l(s.charAt(n3)) != -1;
    }
    
    public static final boolean G(final long n) {
        return chc.b(n, -9223372034707292160L) ^ true;
    }
    
    public static final String H(final w37 w37, final String s, final gva gva) {
        final int ordinal = ((Enum)w37).ordinal();
        if (ordinal == 0) {
            return hia.j(gva, -770578375, 2131756328, gva, false);
        }
        if (ordinal == 1) {
            gva.g0(-770575635);
            gva.q(false);
            return s;
        }
        throw ge9.y(-770579880, gva, false);
    }
    
    public static final Object I(m9e v, final vad vad, jta w, final h07 h07) {
        Object o = null;
        Label_0055: {
            if (h07 instanceof q9e) {
                final q9e q9e = (q9e)h07;
                final int y = q9e.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    q9e.y = y + Integer.MIN_VALUE;
                    o = q9e;
                    break Label_0055;
                }
            }
            o = new q9e(h07);
        }
        final Object x = ((q9e)o).x;
        final int y2 = ((q9e)o).y;
        final j9e w2 = j9e.w;
        boolean b = true;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w = ((q9e)o).w;
            v = ((q9e)o).v;
            vt4.g0(x);
        }
        else {
            vt4.g0(x);
            if (v.d() != w2 || (boolean)w.a()) {
                return Boolean.FALSE;
            }
            ((q9e)o).v = v;
            ((q9e)o).w = w;
            ((q9e)o).y = 1;
            Object o2 = k(v, (ija)new e92((ija)vad.c(), (byte)7), (h07)o);
            final pc7 v2 = pc7.v;
            if (o2 != v2) {
                o2 = lqo.a;
            }
            if (o2 == v2) {
                return v2;
            }
        }
        if (v.d() == w2 && !(boolean)w.a()) {
            if (v.d() != w2) {
                b = false;
            }
            else {
                v.e.setValue((Object)j9e.x);
            }
            return b;
        }
        return Boolean.FALSE;
    }
    
    public static final j9j J(final eup eup, final String s, final Executor executor, final jta jta) {
        final lqo a = lqo.a;
        final olf olf = new olf(0);
        final Object o = new Object();
        ((b)o).c = (ekj)new Object();
        final t03 b = new t03((b)o);
        ((b)o).b = b;
        ((b)o).a = ge9.class;
        try {
            executor.execute((Runnable)new ex7(eup, s, jta, olf, (b)o));
            ((b)o).a = a;
        }
        catch (final Exception ex) {
            ((b3)b.w).o((Throwable)ex);
        }
        return new j9j(b, (byte)1);
    }
    
    public static final igf K(final r3d r3d, final v2b v2b, final boolean b, final zhg zhg) {
        return (igf)new n3d(r3d, v2b, b, zhg);
    }
    
    public static final k2j L(final url url, final zql zql) {
        if (zql != null) {
            final List b = url.b();
            final int size = ((Collection)b).size();
            int i = 0;
            while (i < size) {
                if (mlc.q(((vrl)b.get(i)).H, zql)) {
                    if (!zql.I) {
                        break;
                    }
                    if (!zql.M) {
                        return zql.L;
                    }
                    return rml.f(nzc.f(zql.p1(), (nzc)soh.K(zql), 6), uoo.Z(((o8h)soh.K(zql)).x));
                }
                else {
                    ++i;
                }
            }
        }
        return null;
    }
    
    public static mlf M(String substring) {
        final boolean e0 = rym.E0(substring, "HTTP/1.", false);
        mei w = mei.w;
        final mei x = mei.x;
        int n3 = 0;
        Label_0140: {
            if (e0) {
                final int length = substring.length();
                final int n = 9;
                if (length < 9 || substring.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(substring));
                }
                final int n2 = substring.charAt(7) - '0';
                n3 = n;
                if (n2 == 0) {
                    break Label_0140;
                }
                if (n2 != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(substring));
                }
                n3 = n;
            }
            else {
                if (rym.E0(substring, "ICY ", false)) {
                    n3 = 4;
                    break Label_0140;
                }
                if (!rym.E0(substring, "SOURCETABLE ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(substring));
                }
                n3 = 12;
            }
            w = x;
        }
        final int length2 = substring.length();
        final int n4 = n3 + 3;
        if (length2 < n4) {
            throw new ProtocolException("Unexpected status line: ".concat(substring));
        }
        final Integer g0 = rym.G0(substring.substring(n3, n4));
        if (g0 != null) {
            final int intValue = g0;
            if (substring.length() > n4) {
                if (substring.charAt(n4) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(substring));
                }
                substring = substring.substring(n3 + 4);
            }
            else {
                substring = "";
            }
            return new mlf(w, intValue, substring);
        }
        throw new ProtocolException("Unexpected status line: ".concat(substring));
    }
    
    public static String N(final String s, int i, int j, int n) {
        final int n2 = 0;
        if ((n & 0x1) != 0x0) {
            i = 0;
        }
        int length = j;
        if ((n & 0x2) != 0x0) {
            length = s.length();
        }
        if ((n & 0x4) != 0x0) {
            n = n2;
        }
        else {
            n = 1;
        }
        char char1;
        Object o;
        int codePoint;
        int n3;
        int l;
        for (j = i; j < length; ++j) {
            char1 = s.charAt(j);
            if (char1 == '%' || (char1 == '+' && n != 0)) {
                o = new Object();
                ((an2)o).m1(i, j, s);
                i = j;
                while (i < length) {
                    codePoint = s.codePointAt(i);
                    Label_0213: {
                        if (codePoint == 37) {
                            n3 = i + 2;
                            if (n3 < length) {
                                j = gcq.l(s.charAt(i + 1));
                                l = gcq.l(s.charAt(n3));
                                if (j != -1 && l != -1) {
                                    ((an2)o).g1((j << 4) + l);
                                    i = Character.charCount(codePoint) + n3;
                                    continue;
                                }
                                break Label_0213;
                            }
                        }
                        if (codePoint == 43 && n != 0) {
                            ((an2)o).g1(32);
                            ++i;
                            continue;
                        }
                    }
                    ((an2)o).o1(codePoint);
                    i += Character.charCount(codePoint);
                }
                return ((an2)o).I0();
            }
        }
        return s.substring(i, length);
    }
    
    public static final Object O(oc4 v, kt8 w, final h07 h07) {
        while (true) {
            Label_0043: {
                if (!(h07 instanceof nn3)) {
                    break Label_0043;
                }
                final nn3 nn3 = (nn3)h07;
                final int y = nn3.y;
                if ((y & Integer.MIN_VALUE) == 0x0) {
                    break Label_0043;
                }
                nn3.y = y + Integer.MIN_VALUE;
                final Object o = nn3;
                final Object x = ((nn3)o).x;
                final int y2 = ((nn3)o).y;
                final lqo a = lqo.a;
                if (y2 != 0) {
                    if (y2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w = ((nn3)o).w;
                    v = ((nn3)o).v;
                    vt4.g0(x);
                }
                else {
                    vt4.g0(x);
                    if (v.F0().Q.getValue()) {
                        return a;
                    }
                    if (v.S0.v) {
                        w = kt8.v;
                    }
                    final j14 f0 = v.F0();
                    final ChatEvents$DraftRestoreTrigger w2 = ChatEvents$DraftRestoreTrigger.w;
                    final on3 on3 = new on3(v, (byte)0);
                    ((nn3)o).v = v;
                    ((nn3)o).w = w;
                    ((nn3)o).y = 1;
                    final Object u0 = j14.U0(f0, w2, on3, (String)null, w, (h07)o, 4);
                    final pc7 v2 = pc7.v;
                    if (u0 == v2) {
                        return v2;
                    }
                }
                final xs8 s0 = v.S0;
                if (w == kt8.x) {
                    s0.v = true;
                    return a;
                }
                s0.getClass();
                return a;
            }
            final Object o = new h07(h07);
            continue;
        }
    }
    
    public static final n04 P(final String obj, final List list) {
        final ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            while (listIterator.hasPrevious()) {
                final Object previous = listIterator.previous();
                final vqh vqh = (vqh)previous;
                if (vqh instanceof uqh) {
                    final uqh uqh = (uqh)vqh;
                    vqh vqh2 = (vqh)previous;
                    if (!mlc.q(uqh.b(), obj)) {
                        final String n = uqh.n();
                        if (n == null || !n.equals(obj)) {
                            continue;
                        }
                        vqh2 = (vqh)previous;
                    }
                    final vqh vqh3 = vqh2;
                    if (vqh3 == null) {
                        return n04.v;
                    }
                    if (vqh3.e()) {
                        return n04.w;
                    }
                    return n04.x;
                }
            }
            vqh vqh2 = null;
            continue;
        }
    }
    
    public static final boolean Q(final mf8 mf8, final i27 i27, final o2 o2) {
        final String a = mf8.a();
        final String b = i27.b;
        boolean equals = false;
        Label_0050: {
            if (a == null) {
                if (b == null) {
                    equals = true;
                    break Label_0050;
                }
            }
            else if (b != null) {
                equals = a.equals(b);
                break Label_0050;
            }
            equals = false;
        }
        if (!equals) {
            final u6f u6f = (u6f)c86.I0(mf8.b());
            String b2;
            if (u6f != null) {
                b2 = u6f.b;
            }
            else {
                b2 = null;
            }
            boolean equals2 = false;
            Label_0122: {
                if (b2 == null) {
                    if (b == null) {
                        equals2 = true;
                        break Label_0122;
                    }
                }
                else if (b != null) {
                    equals2 = b2.equals(b);
                    break Label_0122;
                }
                equals2 = false;
            }
            if (!equals2) {
                if (!((j0)o2).isEmpty()) {
                    final ListIterator listIterator = ((n1)o2).listIterator(0);
                    while (((Iterator)listIterator).hasNext()) {
                        final e0h e0h = (e0h)((Iterator)listIterator).next();
                        if (e0h instanceof q0) {
                            final q0 q0 = (q0)e0h;
                            if (!q0.o.isOpen()) {
                                continue;
                            }
                            if (omo.L(q0) != null) {
                                continue;
                            }
                            final String a2 = q0.b.a;
                            final String a3 = mf8.a();
                            if (a3 != null && mlc.q(a2, a3)) {
                                return true;
                            }
                            continue;
                        }
                    }
                }
                final List b3 = mf8.b();
                if (b3 == null || !((Collection)b3).isEmpty()) {
                    for (final u6f u6f2 : b3) {
                        final Iterable iterable = (Iterable)((Map)i27.a).values();
                        if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
                            final Iterator iterator2 = iterable.iterator();
                            while (iterator2.hasNext()) {
                                final String b4 = ((u6f)iterator2.next()).b;
                                final String a4 = u6f2.a;
                                if (b4 != null && b4.equals(a4)) {
                                    return true;
                                }
                            }
                        }
                        if (((j0)o2).isEmpty()) {
                            continue;
                        }
                        final ListIterator listIterator2 = ((n1)o2).listIterator(0);
                        while (((Iterator)listIterator2).hasNext()) {
                            final e0h e0h2 = (e0h)((Iterator)listIterator2).next();
                            if (e0h2 instanceof q0) {
                                final q0 q2 = (q0)e0h2;
                                if (!q2.o.isOpen()) {
                                    continue;
                                }
                                final u6f a5 = q2.a;
                                String s;
                                if (a5 == null || (s = a5.b) == null) {
                                    s = q2.b.b;
                                }
                                final String a6 = u6f2.a;
                                if (s != null && s.equals(a6)) {
                                    return true;
                                }
                                continue;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    public static final List R(final List list) {
        final int size = list.size();
        if (size == 0) {
            return (List)r89.v;
        }
        if (size != 1) {
            return Collections.unmodifiableList((List)new ArrayList((Collection)list));
        }
        return Collections.singletonList(c86.G0(list));
    }
    
    public static final Map S(final Map map) {
        final int size = map.size();
        if (size == 0) {
            return (Map)s89.v;
        }
        if (size != 1) {
            return Collections.unmodifiableMap((Map)new LinkedHashMap(map));
        }
        final Map$Entry map$Entry = (Map$Entry)c86.F0((Iterable)map.entrySet());
        return Collections.singletonMap(map$Entry.getKey(), map$Entry.getValue());
    }
    
    public static final aoo T(final int n, final String s) {
        lq6.u(n);
        final int length = s.length();
        if (length != 0) {
            int n2 = 0;
            final char char1 = s.charAt(0);
            int n3;
            if (char1 < '0') {
                n3 = 1;
                if (length == 1) {
                    return null;
                }
                if (char1 != '+') {
                    return null;
                }
            }
            else {
                n3 = 0;
            }
            int n4 = 119304647;
            int divideUnsigned;
            for (int i = n3; i < length; ++i, n4 = divideUnsigned) {
                final int digit = Character.digit((int)s.charAt(i), n);
                if (digit < 0) {
                    return null;
                }
                divideUnsigned = n4;
                if (Integer.compareUnsigned(n2, n4) > 0) {
                    if (n4 != 119304647) {
                        return null;
                    }
                    if (Integer.compareUnsigned(n2, divideUnsigned = Integer.divideUnsigned(-1, n)) > 0) {
                        return null;
                    }
                }
                final int n5 = n2 * n;
                n2 = digit + n5;
                if (Integer.compareUnsigned(n2, n5) < 0) {
                    return null;
                }
            }
            return new aoo(n2);
        }
        return null;
    }
    
    public static final foo U(final int n, final String s) {
        lq6.u(n);
        final int length = s.length();
        if (length != 0) {
            int i = 0;
            final char char1 = s.charAt(0);
            if (char1 < '0') {
                i = 1;
                if (length == 1) {
                    return null;
                }
                if (char1 != '+') {
                    return null;
                }
            }
            final long n2 = n;
            long n3 = 0L;
            long n4 = 512409557603043100L;
            while (i < length) {
                final int digit = Character.digit((int)s.charAt(i), n);
                if (digit < 0) {
                    return null;
                }
                long divideUnsigned = n4;
                if (Long.compareUnsigned(n3, n4) > 0) {
                    if (n4 != 512409557603043100L) {
                        return null;
                    }
                    if (Long.compareUnsigned(n3, divideUnsigned = Long.divideUnsigned(-1L, n2)) > 0) {
                        return null;
                    }
                }
                final long n5 = n3 * n2;
                n3 = ((long)digit & 0xFFFFFFFFL) + n5;
                if (Long.compareUnsigned(n3, n5) < 0) {
                    return null;
                }
                ++i;
                n4 = divideUnsigned;
            }
            return new foo(n3);
        }
        return null;
    }
    
    public static final og0 V(final og0 og0, int n) {
        if (n <= 0) {
            en9.s("maxLines must be positive");
            return null;
        }
        final long n2 = n * 1000L;
        final String w = og0.w;
        if (w.length() <= n2) {
            return og0;
        }
        final int n3 = (int)n2;
        if ((n = n3) > 0) {
            final int n4 = n3 - 1;
            n = n3;
            if (Character.isHighSurrogate(w.charAt(n4))) {
                n = n4;
            }
        }
        return og0.g(0, n);
    }
    
    public static final String W(final int n, final String s) {
        if (n <= 0) {
            en9.s("maxLines must be positive");
            return null;
        }
        final long n2 = n * 1000L;
        if (s.length() <= n2) {
            return s;
        }
        return X((int)n2, s);
    }
    
    public static final String X(int min, final String s) {
        final int n = min = Math.min(s.length(), min);
        if (n > 0) {
            final int n2 = n - 1;
            min = n;
            if (Character.isHighSurrogate(s.charAt(n2))) {
                min = n2;
            }
        }
        return s.substring(0, min);
    }
    
    public static final void Y(final c2l c2l, final long n, final long n2, final long n3, final boolean b) {
        final ksg ksg = (ksg)c2l.x;
        final ksg ksg2 = (ksg)c2l.z;
        final ksg ksg3 = (ksg)c2l.w;
        final ksg ksg4 = (ksg)c2l.y;
        if (!l6g.c(((l6g)ksg4.getValue()).a, n3) || !yzl.b(((yzl)ksg3.getValue()).a, n) || b) {
            ksg3.setValue((Object)new yzl(n));
            ksg4.setValue((Object)new l6g(n3));
            if (b) {
                ksg.setValue((Object)new l6g(l6g.h(l6g.h(n2, n3), l6g.h(((l6g)ksg2.getValue()).a, ((l6g)ksg.getValue()).a))));
            }
        }
        ksg2.setValue((Object)new l6g(l6g.h(n2, n3)));
    }
    
    public static final Object Z(quj quj, zta zta, final h07 h07) {
        Object o = null;
        Label_0052: {
            if (h07 instanceof suj) {
                final suj suj = (suj)h07;
                final int y = suj.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    suj.y = y + Integer.MIN_VALUE;
                    o = suj;
                    break Label_0052;
                }
            }
            o = new h07(h07);
        }
        Object o2 = ((suj)o).x;
        final int y2 = ((suj)o).y;
        final pc7 v = pc7.v;
        Label_0231: {
            if (y2 != 0) {
                if (y2 != 1) {
                    if (y2 == 2) {
                        quj = ((suj)o).v;
                        vt4.g0(o2);
                        break Label_0231;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    zta = (zta)((suj)o).w;
                    quj = ((suj)o).v;
                    vt4.g0(o2);
                }
            }
            else {
                vt4.g0(o2);
                ((suj)o).v = quj;
                ((suj)o).w = (m6n)zta;
                ((suj)o).y = 1;
                if ((o2 = o50.C(quj, (h07)o)) == v) {
                    return v;
                }
            }
            final hc7 f0 = ((hc7)o2).F0((hc7)u13.x);
            final frd frd = new frd((Object)quj, (Object)zta, (f07)null, (byte)8);
            ((suj)o).v = quj;
            ((suj)o).w = null;
            ((suj)o).y = 2;
            if ((o2 = rhc.f0(f0, (zta)frd, (f07)o)) != v) {
                break Label_0231;
            }
            return v;
        }
        quj.e().b();
        return o2;
    }
    
    public static final void a(final w37 w37, final String s, final lta lta, final igf igf, final ye6 ye6, final gva gva, final int n) {
        gva.i0(533468087);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.d(((Enum)w37).ordinal())) {
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
            if (gva.f((Object)s)) {
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
            if (gva.f((Object)igf)) {
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
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if ((o = r) == a) {
                o = new f17((byte)6);
                gva.q0(o);
            }
            final bnf bnf = (bnf)mlc.a0(new Object[0], (jta)o, gva, 48);
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, igf);
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
            k8e.P((zta)awp.y, gva, b);
            final boolean f = gva.f((Object)bnf);
            final Object r2 = gva.R();
            Object o2;
            if (f || (o2 = r2) == a) {
                o2 = new ua6(bnf, (byte)24);
                gva.q0(o2);
            }
            ye6.h((Object)o2, (Object)gva, (Object)(n10 >> 9 & 0x70));
            final boolean booleanValue = (boolean)((xom)bnf).getValue();
            final boolean f2 = gva.f((Object)bnf);
            final Object r3 = gva.R();
            Object o3;
            if (f2 || (o3 = r3) == a) {
                o3 = new ua6(bnf, (byte)25);
                gva.q0(o3);
            }
            omo.b(booleanValue, (jta)o3, null, 0L, null, null, null, 0L, 0.0f, uuj.t0(2141977774, (aua)new gs((Object)w37, (Object)s, (Object)bnf, (Object)lta, (byte)26), gva), gva, 0, 48, 2044);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new nj((Object)w37, (Object)s, (Object)lta, (Object)igf, (Object)ye6, n, (byte)17);
        }
    }
    
    public static final void a0(final Map map, final List list, final zta zta, final lta lta, final zta zta2) {
        final boolean[] array = new boolean[list.size()];
        for (final Map$Entry map$Entry : map.entrySet()) {
            final rtc rtc = (rtc)map$Entry.getKey();
            for (final rtc rtc2 : (List)map$Entry.getValue()) {
                int n = ((Collection)list).size() - 1;
                Label_0166: {
                    if (n >= 0) {
                        while (true) {
                            final int n2 = n - 1;
                            if (((us4)rtc2).d(list.get(n))) {
                                array[n] = true;
                                break Label_0166;
                            }
                            if (n2 < 0) {
                                break;
                            }
                            n = n2;
                        }
                    }
                    n = -1;
                }
                if (n < 0) {
                    oyl.g(zta.d(rtc2, rtc));
                    return;
                }
                zta2.d(rtc2, list.get(n));
            }
        }
        int n3 = ((Collection)list).size() - 1;
        if (n3 >= 0) {
            while (true) {
                final int n4 = n3 - 1;
                if (!array[n3]) {
                    en9.s((String)lta.b(list.get(n3)));
                    break;
                }
                if (n4 < 0) {
                    break;
                }
                n3 = n4;
            }
        }
    }
    
    public static final void b(final x96 x96, final w37 w37, final String s, final lta lta, final gva gva, final int n) {
        gva.i0(410240127);
        int n3;
        if ((n & 0x30) == 0x0) {
            int n2;
            if (gva.d(((Enum)w37).ordinal())) {
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
            if (gva.f((Object)s)) {
                n5 = 256;
            }
            else {
                n5 = 128;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0xC00) == 0x0) {
            int n7;
            if (gva.h((Object)lta)) {
                n7 = 2048;
            }
            else {
                n7 = 1024;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x491) != 0x490)) {
            final String s2 = soh.S(2131756327, gva);
            final cy4 a = qy4.a;
            lmn.b(s2, omo.V((igf)fgf.v, 12.0f, 4.0f), qy4.a(gva).a.m(), 0L, (zoa)null, (una)null, 0L, (wgn)null, (kfn)null, 0L, 0, false, 0, 0, (lta)null, (mnn)((uy4)qy4.c(gva).k.v).H, gva, 48, 0, 131064);
            final k1 k1 = new k1((Object)w37.z, (byte)0);
            while (k1.hasNext()) {
                final w37 w38 = (w37)k1.next();
                final String h = H(w38, s, gva);
                final boolean b = w38 == w37;
                final boolean b2 = (n6 & 0x1C00) == 0x800;
                final boolean d = gva.d(((Enum)w38).ordinal());
                final Object r = gva.R();
                Object o;
                if ((b2 | d) || (o = r) == bi6.a) {
                    o = new cw5((Object)lta, (Object)w38, (byte)23);
                    gva.q0(o);
                }
                j6r.b(h, (jta)o, (igf)null, (lh0)null, Boolean.valueOf(b), false, (uze)null, (aql)null, (dng)null, 0, 0, false, gva, 0, 0, 4076);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new vh((byte)27, n, lta, (Object)x96, (Object)w37, (Object)s);
        }
    }
    
    public static final boolean b0(final jta jta, final String s) {
        try {
            final boolean booleanValue = (boolean)jta.a();
            if (!booleanValue) {
                Log.e("ReflectionGuard", s);
            }
            return booleanValue;
        }
        catch (final NoSuchFieldException ex) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(s));
        }
        catch (final NoSuchMethodException ex2) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(s));
        }
        catch (final ClassNotFoundException ex3) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(s));
        }
        return false;
    }
    
    public static final void c(final int n, final int n2, final ye6 ye6, final jta jta, final gva gva, final xzb xzb, final igf igf, aql l, boolean b) {
        gva.i0(947208840);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)jta)) {
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
            if (gva.f((Object)igf)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0152: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x180);
            }
            else {
                n8 = n5;
                if ((n & 0x180) == 0x0) {
                    int n9;
                    if (gva.g(b)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n5 | n9);
                    break Label_0152;
                }
            }
            n10 = n8;
        }
        if ((n & 0xC00) == 0x0) {
            int n11;
            if ((n2 & 0x8) == 0x0 && gva.f((Object)l)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n10 |= n11;
        }
        int n12 = n10;
        if ((n & 0x6000) == 0x0) {
            int n13;
            if (gva.f((Object)xzb)) {
                n13 = 16384;
            }
            else {
                n13 = 8192;
            }
            n12 = (n10 | n13);
        }
        int n15;
        final int n14 = n15 = (n12 | 0x30000);
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
        final boolean b2 = true;
        if (gva.W(n15 & 0x1, (0x92493 & n15) != 0x92492)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n17 = n15;
                if ((n2 & 0x8) != 0x0) {
                    n17 = (n15 & 0xFFFFE3FF);
                }
                n15 = n17;
            }
            else {
                if (n7 != 0) {
                    b = b2;
                }
                if ((n2 & 0x8) != 0x0) {
                    l = vt4.L(6, gva);
                    n15 &= 0xFFFFE3FF;
                }
            }
            gva.r();
            final int n18 = n15 << 3;
            i((n15 & 0xE) | 0x30000 | (n15 & 0x70) | (n15 & 0x380) | (n15 & 0x1C00) | (0xE000 & n15) | (0x380000 & n18) | (n18 & 0x1C00000), ye6, jta, gva, xzb, igf, l, b);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new yzb(jta, igf, b, l, xzb, ye6, n, n2);
        }
    }
    
    public static final Object c0(h07 h07) {
        final hc7 context = h07.getContext();
        x90.u(context);
        final f07 k = ljq.K(h07);
        if (k instanceof oo8) {
            h07 = (h07)k;
        }
        else {
            h07 = null;
        }
        final pc7 v = pc7.v;
        final lqo a = lqo.a;
        Object o = null;
        Label_0255: {
            Label_0047: {
                if (h07 != null) {
                    final ic7 y = ((oo8)h07).y;
                    if (po8.c(y, context)) {
                        ((oo8)h07).A = a;
                        ((ro8)h07).x = 1;
                        y.h1(context, (Runnable)h07);
                    }
                    else {
                        final r0 r0 = new r0((gc7)yaq.x);
                        final hc7 f0 = context.F0((hc7)r0);
                        ((oo8)h07).A = a;
                        ((ro8)h07).x = 1;
                        y.h1(f0, (Runnable)h07);
                        if (((yaq)r0).w) {
                            final on9 a2 = lsn.a();
                            final pv0 y2 = a2.y;
                            if (y2 == null || y2.isEmpty()) {
                                break Label_0047;
                            }
                            if (a2.w < 4294967296L) {
                                a2.q1(true);
                                try {
                                    ((ro8)h07).run();
                                    while (a2.t1()) {}
                                    a2.k1(true);
                                    break Label_0047;
                                }
                                finally {
                                    try {
                                        final Throwable t;
                                        ((ro8)h07).g(t);
                                    }
                                    finally {
                                        a2.k1(true);
                                    }
                                }
                                break Label_0255;
                            }
                            ((oo8)h07).A = a;
                            ((ro8)h07).x = 1;
                            a2.l1((ro8)h07);
                        }
                    }
                    o = v;
                    break Label_0255;
                }
            }
            o = a;
        }
        if (o == v) {
            return o;
        }
        return a;
    }
    
    public static final void d(final int n, final int n2, final ye6 ye6, final jta jta, final gva gva, xzb xzb, igf v, aql aql, boolean b) {
        gva.i0(1413012038);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)jta)) {
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
        Label_0109: {
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
                    break Label_0109;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0176: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x180) == 0x0) {
                    int n11;
                    if (gva.g(b)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0176;
                }
            }
            n12 = n10;
        }
        int n13 = n12;
        if ((n & 0xC00) == 0x0) {
            int n14;
            if ((n2 & 0x8) == 0x0 && gva.f((Object)xzb)) {
                n14 = 2048;
            }
            else {
                n14 = 1024;
            }
            n13 = (n12 | n14);
        }
        int n15 = n13 | 0x6000;
        if ((0x30000 & n) == 0x0) {
            n15 = (0x16000 | n13);
        }
        int n16 = n15;
        if ((0x180000 & n) == 0x0) {
            int n17;
            if (gva.h((Object)ye6)) {
                n17 = 1048576;
            }
            else {
                n17 = 524288;
            }
            n16 = (n15 | n17);
        }
        final boolean b2 = true;
        if (gva.W(n16 & 0x1, (0x92493 & n16) != 0x92492)) {
            gva.b0();
            int n19;
            aql l;
            xzb e0;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n18 = n16;
                if ((n2 & 0x8) != 0x0) {
                    n18 = (n16 & 0xFFFFE3FF);
                }
                n19 = (n18 & 0xFFF8FFFF);
                final xzb xzb2 = xzb;
                l = aql;
                e0 = xzb2;
            }
            else {
                if (n5 != 0) {
                    v = (igf)fgf.v;
                }
                if (n9 != 0) {
                    b = b2;
                }
                if ((n2 & 0x8) != 0x0) {
                    final long a = ((j86)gva.j((sei)dx6.a)).a;
                    final r86 a2 = ((e8e)gva.j((sei)h8e.a)).a;
                    e0 = a2.e0;
                    if (e0 == null) {
                        final long g = j86.g;
                        e0 = new xzb(g, a, g, j86.b(0.38f, a));
                        a2.e0 = e0;
                    }
                    if (!foo.a(e0.b, a)) {
                        e0 = e0.a(e0.a, a, e0.c, j86.b(0.38f, a));
                    }
                    n16 &= 0xFFFFE3FF;
                }
                else {
                    e0 = xzb;
                }
                l = vt4.L(6, gva);
                n19 = (n16 & 0xFFF8FFFF);
            }
            gva.r();
            final int n20 = n19 << 3;
            e((n19 >> 3 & 0xE) | (n20 & 0x70) | (n19 & 0x380) | (0xE000 & n20) | (n20 & 0x70000) | (n19 & 0x380000), ye6, jta, gva, e0, v, l, b);
            final aql aql2 = l;
            xzb = e0;
            aql = aql2;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new yzb(jta, v, b, xzb, aql, ye6, n, n2);
        }
    }
    
    public static final void e(final int n, final ye6 ye6, final jta jta, final gva gva, final xzb xzb, final igf igf, final aql aql, final boolean b) {
        gva.i0(-1134296466);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)igf)) {
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
            if (gva.g(b)) {
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
            if (gva.f((Object)aql)) {
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
            if (gva.f((Object)xzb)) {
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
            if (gva.f((Object)null)) {
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
            gva.g0(976976045);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = oz1.g(gva);
            }
            final llf llf = (llf)o;
            gva.q(false);
            final olb a = hic.a;
            final igf k = rml.k(androidx.compose.foundation.layout.b.q(ncq.b(40.0f, 40.0f), igf.E((igf)w9f.v)), aql);
            long n16;
            if (b) {
                n16 = xzb.a;
            }
            else {
                n16 = xzb.c;
            }
            final igf m = twl.m(androidx.compose.foundation.b.b(rhc.h(k, n16, aql), llf, utj.a(false, 0.0f, 0L, aql, 247), b, (String)null, new iuj(0), jta, 8));
            final moe c = rj2.c((gx)wab.B, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, m);
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
            long n17;
            if (b) {
                n17 = xzb.b;
            }
            else {
                n17 = xzb.d;
            }
            c5q.c(ge9.n(n17, dx6.a), (zta)ye6, gva, (n14 >> 15 & 0x70) | 0x8);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new zzb(igf, jta, b, aql, xzb, ye6, n);
        }
    }
    
    public static final void f(final int n, final zta zta, final gva gva, final boolean b) {
        gva.i0(-642000585);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.g(b)) {
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
            if (gva.h((Object)zta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            Object o = vod.a(gva);
            if (o == null) {
                gva.g0(1512740606);
                o = wod.a(gva);
            }
            else {
                gva.g0(1512737723);
            }
            gva.q(false);
            if (o == null) {
                en9.q("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            final boolean f = gva.f(o);
            final Object r = gva.R();
            final cib a = bi6.a;
            lo1 lo1;
            if (f || (lo1 = (lo1)r) == a) {
                final boolean b2 = o instanceof crf;
                d8g e = null;
                crf crf;
                if (b2) {
                    crf = (crf)o;
                }
                else {
                    crf = null;
                }
                c2l a2;
                if (crf != null) {
                    a2 = crf.a();
                }
                else {
                    a2 = null;
                }
                f8g f8g;
                if (o instanceof f8g) {
                    f8g = (f8g)o;
                }
                else {
                    f8g = null;
                }
                if (f8g != null) {
                    e = f8g.e();
                }
                lo1 = new lo1(a2, e);
                gva.q0((Object)lo1);
            }
            final lo1 lo2 = lo1;
            Object o2;
            if ((o2 = gva.R()) == a) {
                o2 = mlc.z((hc7)o89.v, gva);
                gva.q0(o2);
            }
            final oc7 oc7 = (oc7)o2;
            final long t = gva.T;
            final boolean f2 = gva.f((Object)lo2);
            final boolean e2 = gva.e(t);
            final Object r2 = gva.R();
            mh6 mh6;
            if ((f2 | e2) || (mh6 = (mh6)r2) == a) {
                mh6 = new mh6(oc7, new zih(t, o));
                gva.q0((Object)mh6);
            }
            final mh6 mh7 = mh6;
            gva.g0(-348514256);
            final boolean h = gva.h((Object)mh7);
            final boolean h2 = gva.h((Object)zta);
            final Object r3 = gva.R();
            Object o3;
            if ((h | h2) || (o3 = r3) == a) {
                o3 = new nob((Object)mh7, (Object)zta, (byte)23);
                gva.q0(o3);
            }
            mlc.l((jta)o3, gva);
            final boolean h3 = gva.h((Object)mh7);
            final int n6 = n4 & 0xE;
            final boolean b3 = n6 == 4;
            final Object r4 = gva.R();
            Object o4;
            if ((b3 | h3) || (o4 = r4) == a) {
                o4 = new no1((ko1)mh7, b, (byte)1);
                gva.q0(o4);
            }
            t08.l((Object)b, (Object)mh7, (gbd)null, (lta)o4, gva, n6);
            final boolean h4 = gva.h((Object)lo2);
            final boolean h5 = gva.h((Object)mh7);
            final Object r5 = gva.R();
            Object o5;
            if ((h4 | h5) || (o5 = r5) == a) {
                o5 = new tt8((Object)lo2, (Object)mh7, (byte)22);
                gva.q0(o5);
            }
            mlc.b(lo2, mh7, (lta)o5, gva);
            gva.q(false);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ajh(b, zta, n);
        }
    }
    
    public static final void g(final igf igf, zta a, zta b, zta c, zta d, int n, long n2, long b2, d1q b3, final ye6 ye6, final gva gva, final int n3, final int n4) {
        gva.i0(-1211482744);
        int n6;
        if ((n3 & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)igf)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n6 = (n5 | n3);
        }
        else {
            n6 = n3;
        }
        final int n7 = n4 & 0x2;
        int n10 = 0;
        Label_0113: {
            int n8;
            if (n7 != 0) {
                n8 = (n6 | 0x30);
            }
            else {
                n8 = n6;
                if ((n3 & 0x30) == 0x0) {
                    int n9;
                    if (gva.h((Object)a)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n6 | n9);
                    break Label_0113;
                }
            }
            n10 = n8;
        }
        final int n11 = n4 & 0x4;
        int n14 = 0;
        Label_0181: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x180);
            }
            else {
                n12 = n10;
                if ((n3 & 0x180) == 0x0) {
                    int n13;
                    if (gva.h((Object)b)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n10 | n13);
                    break Label_0181;
                }
            }
            n14 = n12;
        }
        final int n15 = n4 & 0x8;
        int n18 = 0;
        Label_0250: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n3 & 0xC00) == 0x0) {
                    int n17;
                    if (gva.h((Object)c)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0250;
                }
            }
            n18 = n16;
        }
        final int n19 = n4 & 0x10;
        int n22 = 0;
        Label_0320: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x6000);
            }
            else {
                n20 = n18;
                if ((n3 & 0x6000) == 0x0) {
                    int n21;
                    if (gva.h((Object)d)) {
                        n21 = 16384;
                    }
                    else {
                        n21 = 8192;
                    }
                    n22 = (n18 | n21);
                    break Label_0320;
                }
            }
            n22 = n20;
        }
        if ((0x30000 & n3) == 0x0) {
            int n23;
            if ((n4 & 0x20) == 0x0 && gva.d(n)) {
                n23 = 131072;
            }
            else {
                n23 = 65536;
            }
            n22 |= n23;
        }
        if ((0x180000 & n3) == 0x0) {
            int n24;
            if ((n4 & 0x40) == 0x0 && gva.e(n2)) {
                n24 = 1048576;
            }
            else {
                n24 = 524288;
            }
            n22 |= n24;
        }
        int n26;
        if ((n3 & 0xC00000) == 0x0) {
            int n25;
            if ((n4 & 0x80) == 0x0 && gva.e(b2)) {
                n25 = 8388608;
            }
            else {
                n25 = 4194304;
            }
            n26 = (n22 | n25);
        }
        else {
            n26 = n22;
        }
        if ((n3 & 0x6000000) == 0x0) {
            int n27;
            if ((n4 & 0x100) == 0x0 && gva.f((Object)b3)) {
                n27 = 67108864;
            }
            else {
                n27 = 33554432;
            }
            n26 |= n27;
        }
        int n28 = n26;
        if ((n3 & 0x30000000) == 0x0) {
            int n29;
            if (gva.h((Object)ye6)) {
                n29 = 536870912;
            }
            else {
                n29 = 268435456;
            }
            n28 = (n26 | n29);
        }
        final boolean b4 = true;
        if (gva.W(n28 & 0x1, (n28 & 0x12492493) != 0x12492492)) {
            gva.b0();
            int n36 = 0;
            Label_0957: {
                long n34;
                int n35;
                zta zta;
                zta zta2;
                zta zta3;
                zta zta4;
                long n37;
                if ((n3 & 0x1) != 0x0 && !gva.C()) {
                    gva.Z();
                    int n30 = n28;
                    if ((n4 & 0x20) != 0x0) {
                        n30 = (n28 & 0xFFF8FFFF);
                    }
                    int n31 = n30;
                    if ((n4 & 0x40) != 0x0) {
                        n31 = (n30 & 0xFFC7FFFF);
                    }
                    int n32 = n31;
                    if ((n4 & 0x80) != 0x0) {
                        n32 = (n31 & 0xFE3FFFFF);
                    }
                    int n33 = n32;
                    if ((n4 & 0x100) != 0x0) {
                        n33 = (n32 & 0xF1FFFFFF);
                    }
                    n34 = b2;
                    n35 = n;
                    zta = d;
                    zta2 = c;
                    zta3 = b;
                    zta4 = a;
                    n36 = n33;
                    n37 = n2;
                }
                else {
                    if (n7 != 0) {
                        a = (zta)omo.a;
                    }
                    if (n11 != 0) {
                        b = (zta)omo.b;
                    }
                    if (n15 != 0) {
                        c = (zta)omo.c;
                    }
                    if (n19 != 0) {
                        d = (zta)omo.d;
                    }
                    if ((n4 & 0x20) != 0x0) {
                        n28 &= 0xFFF8FFFF;
                        n = 2;
                    }
                    if ((n4 & 0x40) != 0x0) {
                        n2 = ((e8e)gva.j((sei)h8e.a)).a.n;
                        n28 &= 0xFFC7FFFF;
                    }
                    int n38;
                    if ((n4 & 0x80) != 0x0) {
                        b2 = s86.b(n2, gva);
                        n38 = (n28 & 0xFE3FFFFF);
                    }
                    else {
                        n38 = n28;
                    }
                    n37 = n2;
                    n36 = n38;
                    zta4 = a;
                    zta3 = b;
                    zta2 = c;
                    zta = d;
                    n35 = n;
                    n34 = b2;
                    if ((n4 & 0x100) != 0x0) {
                        b3 = (d1q)c5q.B(gva);
                        n36 = (n38 & 0xF1FFFFFF);
                        break Label_0957;
                    }
                }
                n2 = n37;
                a = zta4;
                b = zta3;
                c = zta2;
                d = zta;
                n = n35;
                b2 = n34;
            }
            gva.r();
            final int n39 = (0xE000000 & n36) ^ 0x6000000;
            final boolean b5 = (n39 > 67108864 && gva.f((Object)b3)) || (n36 & 0x6000000) == 0x4000000;
            final Object r = gva.R();
            final cib a2 = bi6.a;
            knf knf;
            if (b5 || (knf = (knf)r) == a2) {
                knf = new knf(b3);
                gva.q0((Object)knf);
            }
            final knf knf2 = knf;
            final boolean f = gva.f((Object)knf2);
            boolean b6 = false;
            Label_1119: {
                if (n39 > 67108864) {
                    b6 = b4;
                    if (gva.f((Object)b3)) {
                        break Label_1119;
                    }
                }
                b6 = ((n36 & 0x6000000) == 0x4000000 && b4);
            }
            final Object r2 = gva.R();
            Object o;
            if ((f | b6) || (o = r2) == a2) {
                o = new tt8((Object)knf2, (Object)b3, (byte)28);
                gva.q0(o);
            }
            final igf w = vt4.W(igf, (lta)o);
            final ye6 t0 = uuj.t0(848889571, (aua)new urd(n, a, ye6, c, d, knf2, b), gva);
            final int n40 = n36 >> 12;
            a6n.a(w, (aql)null, n2, b2, 0.0f, 0.0f, (bi2)null, (zta)t0, gva, (n40 & 0x380) | 0xC00000 | (n40 & 0x1C00), 114);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new u9k(igf, a, b, c, d, n, n2, b2, b3, ye6, n3, n4);
        }
    }
    
    public static final void h(final int n, final zta zta, final ye6 ye6, final zta zta2, final zta zta3, final d1q d1q, final zta zta4, final gva gva, final int n2) {
        gva.i0(-280287501);
        int n3;
        if (gva.d(n)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.h((Object)zta)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        int n5;
        if (gva.h((Object)ye6)) {
            n5 = 256;
        }
        else {
            n5 = 128;
        }
        int n6;
        if (gva.h((Object)zta2)) {
            n6 = 2048;
        }
        else {
            n6 = 1024;
        }
        int n7;
        if (gva.h((Object)zta3)) {
            n7 = 16384;
        }
        else {
            n7 = 8192;
        }
        int n8;
        if (gva.f((Object)d1q)) {
            n8 = 131072;
        }
        else {
            n8 = 65536;
        }
        int n9;
        if (gva.h((Object)zta4)) {
            n9 = 1048576;
        }
        else {
            n9 = 524288;
        }
        final int n10 = n2 | n3 | n4 | n5 | n6 | n7 | n8 | n9;
        if (gva.W(n10 & 0x1, (0x92493 & n10) != 0x92492)) {
            final Object r = gva.R();
            final cib a = bi6.a;
            x9k x9k;
            if ((x9k = (x9k)r) == a) {
                x9k = new x9k();
                gva.q0((Object)x9k);
            }
            final x9k x9k2 = x9k;
            final boolean b = (n10 & 0x70000) == 0x20000;
            final boolean b2 = (n10 & 0x70) == 0x20;
            final boolean b3 = (n10 & 0x1C00) == 0x800;
            final boolean b4 = (0xE000 & n10) == 0x4000;
            final boolean b5 = (n10 & 0xE) == 0x4;
            final boolean b6 = (0x380000 & n10) == 0x100000;
            final boolean b7 = (n10 & 0x380) == 0x100;
            Object r2 = gva.R();
            if ((b7 | (b | b2 | b3 | b4 | b5 | b6)) || r2 == a) {
                r2 = new v9k(d1q, zta, zta2, zta3, n, zta4, x9k2, ye6);
                gva.q0(r2);
            }
            c5q.j(null, (zta)r2, gva, 0, 1);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new urd(n, zta, ye6, zta2, zta3, d1q, zta4, n2);
        }
    }
    
    public static final void i(final int n, final ye6 ye6, final jta jta, final gva gva, final xzb xzb, final igf igf, final aql aql, final boolean b) {
        gva.i0(-171935091);
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
            if (gva.g(b)) {
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
            if (gva.f((Object)aql)) {
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
            if (gva.f((Object)xzb)) {
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
            if (gva.f((Object)null)) {
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
            if (gva.f((Object)null)) {
                n15 = 1048576;
            }
            else {
                n15 = 524288;
            }
            n14 = (n12 | n15);
        }
        int n16 = n14;
        if ((0xC00000 & n) == 0x0) {
            int n17;
            if (gva.h((Object)ye6)) {
                n17 = 8388608;
            }
            else {
                n17 = 4194304;
            }
            n16 = (n14 | n17);
        }
        if (gva.W(n16 & 0x1, (0x492493 & n16) != 0x492492)) {
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new dqb((byte)13);
                gva.q0(r);
            }
            final igf b2 = wsk.b((lta)r, igf, false);
            long n18;
            if (b) {
                n18 = xzb.a;
            }
            else {
                n18 = xzb.c;
            }
            long n19;
            if (b) {
                n19 = xzb.b;
            }
            else {
                n19 = xzb.d;
            }
            final ye6 t0 = uuj.t0(669231714, (aua)new bc3(ye6, (byte)6), gva);
            final int n20 = n16 << 9;
            a6n.c(jta, b2, b, aql, n18, n19, 0.0f, 0.0f, (bi2)null, (llf)null, t0, gva, (n16 & 0x1F8E) | (0xE000000 & n20) | (n20 & 0x70000000), 192);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new zzb(jta, igf, b, aql, xzb, ye6, n);
        }
    }
    
    public static igf j(final igf igf, alo a0, final int n) {
        if ((n & 0x1) != 0x0) {
            final k2j a2 = eep.a;
            a0 = (alo)ri2.A0(0.0f, 400.0f, new chc(4294967297L), 1);
        }
        return rml.l(igf).E(new zzl(a0));
    }
    
    public static final Object k(final m9e m9e, final ija ija, final h07 h07) {
        final Object z = vt4.z((ija)mka.b(soh.u(ija), (bua)new n9e(m9e, (f07)null)), h07);
        if (z == pc7.v) {
            return z;
        }
        return lqo.a;
    }
    
    public static final float m(final v08 v08, final float n, final float n2) {
        return ((eg0)new s6p(v08.a).a((ig0)new eg0(n), (ig0)new eg0(n2))).a;
    }
    
    public static String n(int n, int length, final int n2, final String s, final String s2) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x2) != 0x0) {
            length = s.length();
        }
        return o(s, n, length, s2, (n2 & 0x8) == 0x0, (n2 & 0x10) == 0x0, (n2 & 0x20) == 0x0, (n2 & 0x40) == 0x0, 128);
    }
    
    public static String o(final String s, int byte1, int i, final String s2, boolean b, boolean b2, final boolean b3, boolean b4, int n) {
        final boolean b5 = false;
        if ((n & 0x1) != 0x0) {
            byte1 = 0;
        }
        int length;
        if ((n & 0x2) != 0x0) {
            length = s.length();
        }
        else {
            length = i;
        }
        if ((n & 0x8) != 0x0) {
            b = false;
        }
        if ((n & 0x10) != 0x0) {
            b2 = false;
        }
        if ((n & 0x40) != 0x0) {
            b4 = b5;
        }
        Object o;
        an2 an2;
        an2 an3 = null;
        String s3;
        Object o2;
        char[] e;
        for (i = byte1; i < length; i += Character.charCount(n)) {
            n = s.codePointAt(i);
            if (n < 32 || n == 127 || (n >= 128 && !b4) || kym.J0((CharSequence)s2, (char)n) || (n == 37 && (!b || (b2 && !F(i, length, s)))) || (n == 43 && b3)) {
                o = new Object();
                ((an2)o).m1(byte1, i, s);
                an2 = null;
                while (i < length) {
                    n = s.codePointAt(i);
                    Label_0418: {
                        if (b) {
                            an3 = an2;
                            if (n == 9) {
                                break Label_0418;
                            }
                            an3 = an2;
                            if (n == 10) {
                                break Label_0418;
                            }
                            an3 = an2;
                            if (n == 12) {
                                break Label_0418;
                            }
                            if (n == 13) {
                                an3 = an2;
                                break Label_0418;
                            }
                        }
                        s3 = "+";
                        if (n == 32 && s2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            ((an2)o).n1("+");
                            an3 = an2;
                        }
                        else if (n == 43 && b3) {
                            if (!b) {
                                s3 = "%2B";
                            }
                            ((an2)o).n1(s3);
                            an3 = an2;
                        }
                        else {
                            Label_0421: {
                                if (n >= 32 && n != 127 && (n < 128 || b4) && !kym.J0((CharSequence)s2, (char)n)) {
                                    if (n == 37) {
                                        if (!b) {
                                            break Label_0421;
                                        }
                                        if (b2 && !F(i, length, s)) {
                                            break Label_0421;
                                        }
                                    }
                                    ((an2)o).o1(n);
                                    an3 = an2;
                                    break Label_0418;
                                }
                            }
                            if ((o2 = an2) == null) {
                                o2 = new Object();
                            }
                            ((an2)o2).o1(n);
                            while (true) {
                                an3 = (an2)o2;
                                if (((an2)o2).I()) {
                                    break;
                                }
                                byte1 = ((an2)o2).readByte();
                                ((an2)o).g1(37);
                                e = qt7.e;
                                ((an2)o).g1((int)e[(byte1 & 0xFF) >> 4 & 0xF]);
                                ((an2)o).g1((int)e[byte1 & 0xF]);
                            }
                        }
                    }
                    i += Character.charCount(n);
                    an2 = an3;
                }
                return ((an2)o).I0();
            }
        }
        return s.substring(byte1, length);
    }
    
    public static ud6 p(final String s, final String s2) {
        final kl1 kl1 = new kl1(s, s2);
        final td6 b = ud6.b((Class)kl1.class);
        b.e = true;
        b.f = (ne6)new sd6((Object)kl1, (byte)1);
        return b.b();
    }
    
    public static final mla q(final WorkDatabase workDatabase, final boolean b, String[] array, final lta lta) {
        final fmc g = workDatabase.g();
        array = (String[])Arrays.copyOf((Object[])array, array.length);
        final dho b2 = g.b;
        b2.getClass();
        final xll xll = new xll();
        final int length = array.length;
        final int n = 0;
        for (final String s : array) {
            final LinkedHashMap linkedHashMap = (LinkedHashMap)b2.d;
            final String lowerCase = s.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            final Set set = (Set)linkedHashMap.get((Object)lowerCase);
            if (set != null) {
                xll.addAll((Collection)set);
            }
            else {
                xll.add((Object)s);
            }
        }
        final String[] array2 = (String[])((AbstractCollection)rml.j((Set)xll)).toArray((Object[])new String[0]);
        final int length2 = array2.length;
        final int[] array3 = new int[length2];
        for (int j = n; j < length2; ++j) {
            final String s2 = array2[j];
            final LinkedHashMap linkedHashMap2 = (LinkedHashMap)b2.e;
            final String lowerCase2 = s2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            final Integer n2 = (Integer)linkedHashMap2.get((Object)lowerCase2);
            if (n2 == null) {
                en9.s("There is no table with name ".concat(s2));
                final yog yog = null;
                return new mla(ri2.p((ija)new n6k((zta)new l10((byte)12, null, (Serializable)yog.w, b2, yog.v)), -1), workDatabase, b, lta);
            }
            array3[j] = n2;
        }
        final yog yog = new yog((Object)array2, (Object)array3);
        return new mla(ri2.p((ija)new n6k((zta)new l10((byte)12, null, (Serializable)yog.w, b2, yog.v)), -1), workDatabase, b, lta);
    }
    
    public static final a9k s(final elf elf) {
        final LinkedHashMap a = ((im7)elf).a;
        final j9k j9k = (j9k)a.get((Object)qt7.b);
        Bundle bundle = null;
        if (j9k == null) {
            en9.s("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        final ycp ycp = (ycp)a.get((Object)qt7.c);
        if (ycp == null) {
            en9.s("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        final Bundle bundle2 = (Bundle)a.get((Object)qt7.d);
        final String s = (String)a.get((Object)zn2.l);
        if (s == null) {
            en9.s("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        final h9k e = j9k.x().E("androidx.lifecycle.internal.SavedStateHandlesProvider");
        e9k e9k;
        if (e instanceof e9k) {
            e9k = (e9k)e;
        }
        else {
            e9k = null;
        }
        if (e9k == null) {
            en9.q("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        final LinkedHashMap b = B(ycp).b;
        final a9k a9k = (a9k)b.get((Object)s);
        if (a9k == null) {
            e9k.b();
            final Bundle c = e9k.c;
            if (c != null) {
                if (ek.j(c, s)) {
                    if ((bundle = ek.q(c, s)) == null) {
                        bundle = ach.v((yog[])Arrays.copyOf((Object[])new yog[0], 0));
                    }
                    c.remove(s);
                    if (ek.t(c)) {
                        e9k.c = null;
                    }
                }
            }
            final a9k u = ejq.u(bundle, bundle2);
            ((Map)b).put((Object)s, (Object)u);
            return u;
        }
        return a9k;
    }
    
    public static final void t(final j9k j9k) {
        final tad b = j9k.d().b();
        if (b != tad.w && b != tad.x) {
            oyl.l("Failed to enable `SavedStateHandle` for `", (Object)j9k, (Object)"`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", (Object)b, (Object)"`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
            return;
        }
        if (j9k.x().E("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            final e9k e9k = new e9k(j9k.x(), (ycp)j9k);
            j9k.x().P("androidx.lifecycle.internal.SavedStateHandlesProvider", (h9k)e9k);
            j9k.d().a((fbd)new j2j(e9k, (byte)2));
        }
    }
    
    public static v08 u() {
        return new v08(new jia());
    }
    
    public static ud6 v(final String s, final uy8 uy8) {
        final td6 b = ud6.b((Class)kl1.class);
        b.e = true;
        b.a(dd8.a((Class)Context.class));
        b.f = (ne6)new oe6((Object)s, (Object)uy8, (byte)3);
        return b.b();
    }
    
    public static abp w(final zrc zrc) {
        Label_0569: {
            Label_0560: {
                Label_0551: {
                    int n3 = 0;
                    Label_0105: {
                        try {
                            final irc o = zrc.o("type");
                            final int n = 0;
                            final int n2 = 0;
                            n3 = n;
                            if (o != null) {
                                final String i = o.i();
                                n3 = n;
                                if (i != null) {
                                    final int[] f = ge9.F(7);
                                    for (int length = f.length, j = n2; j < length; ++j) {
                                        final int n4 = f[j];
                                        if (smk.d(n4).equals(i)) {
                                            n3 = n4;
                                            break Label_0105;
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0551;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0560;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0569;
                        }
                    }
                    final irc o2 = zrc.o("name");
                    String k;
                    if (o2 != null) {
                        k = o2.i();
                    }
                    else {
                        k = null;
                    }
                    final irc o3 = zrc.o("model");
                    String l;
                    if (o3 != null) {
                        l = o3.i();
                    }
                    else {
                        l = null;
                    }
                    final irc o4 = zrc.o("brand");
                    String m;
                    if (o4 != null) {
                        m = o4.i();
                    }
                    else {
                        m = null;
                    }
                    final irc o5 = zrc.o("architecture");
                    String i2;
                    if (o5 != null) {
                        i2 = o5.i();
                    }
                    else {
                        i2 = null;
                    }
                    final irc o6 = zrc.o("locale");
                    String i3;
                    if (o6 != null) {
                        i3 = o6.i();
                    }
                    else {
                        i3 = null;
                    }
                    final irc o7 = zrc.o("locales");
                    Object o8;
                    if (o7 != null) {
                        final ArrayList v = o7.d().v;
                        final ArrayList list = new ArrayList(v.size());
                        final Iterator iterator = v.iterator();
                        while (true) {
                            o8 = list;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            list.add((Object)((irc)iterator.next()).i());
                        }
                    }
                    else {
                        o8 = null;
                    }
                    final irc o9 = zrc.o("time_zone");
                    String i4;
                    if (o9 != null) {
                        i4 = o9.i();
                    }
                    else {
                        i4 = null;
                    }
                    final irc o10 = zrc.o("battery_level");
                    Number h;
                    if (o10 != null) {
                        h = o10.h();
                    }
                    else {
                        h = null;
                    }
                    final irc o11 = zrc.o("power_saving_mode");
                    Boolean value;
                    if (o11 != null) {
                        value = o11.a();
                    }
                    else {
                        value = null;
                    }
                    final irc o12 = zrc.o("brightness_level");
                    Number h2;
                    if (o12 != null) {
                        h2 = o12.h();
                    }
                    else {
                        h2 = null;
                    }
                    final irc o13 = zrc.o("logical_cpu_count");
                    Number h3;
                    if (o13 != null) {
                        h3 = o13.h();
                    }
                    else {
                        h3 = null;
                    }
                    final irc o14 = zrc.o("total_ram");
                    Number h4;
                    if (o14 != null) {
                        h4 = o14.h();
                    }
                    else {
                        h4 = null;
                    }
                    final irc o15 = zrc.o("is_low_ram");
                    Boolean value2;
                    if (o15 != null) {
                        value2 = o15.a();
                    }
                    else {
                        value2 = null;
                    }
                    return new abp(n3, k, l, m, i2, i3, (List)o8, i4, h, value, h2, h3, h4, value2);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Device", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Device", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Device", (Throwable)ex3);
        return null;
    }
    
    public static oi0 x(final String s) {
        final mi0 g = mi0.g;
        if (s.equals(((oi0)g).a)) {
            return (oi0)g;
        }
        final ni0 g2 = ni0.g;
        if (s.equals(((oi0)g2).a)) {
            return (oi0)g2;
        }
        final ji0 g3 = ji0.g;
        if (s.equals(((oi0)g3).a)) {
            return (oi0)g3;
        }
        final li0 g4 = li0.g;
        if (s.equals(((oi0)g4).a)) {
            return (oi0)g4;
        }
        return (oi0)new ki0(s);
    }
    
    public static final Object y(final gwj gwj) {
        return ((dq4)gwj.w.getValue()).a.a;
    }
    
    public static final Class z(final rtc rtc) {
        final Class a = ((ns4)rtc).a();
        a.getClass();
        return a;
    }
    
    public lqo E(t2k d1, final Object o) {
        final lqo a = lqo.a;
        if (o == null) {
            return a;
        }
        d1 = (t2k)d1.d1(this.r());
        try {
            this.l((b3k)d1, o);
            ((b3k)d1).Z0();
            r9n.m((AutoCloseable)d1, (Throwable)null);
            return a;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                r9n.m((AutoCloseable)d1, t);
            }
        }
    }
    
    public abstract void l(final b3k p0, final Object p1);
    
    public abstract String r();
}
