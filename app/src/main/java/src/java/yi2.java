import java.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import android.graphics.MaskFilter;
import android.graphics.BlurMaskFilter;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonNull;
import java.util.ListIterator;
import androidx.compose.foundation.layout.b;
import android.graphics.RectF;
import android.graphics.Rect;
import kotlinx.serialization.json.JsonEncodingException;
import kotlinx.serialization.json.JsonElement;
import android.text.style.RelativeSizeSpan;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.Spannable;
import android.view.View;
import android.os.Build$VERSION;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import kotlinx.serialization.KSerializer;
import java.util.Map$Entry;
import java.util.Map;
import java.io.File;
import java.util.LinkedHashMap;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.annotation.Annotation;
import kotlinx.serialization.descriptors.SerialDescriptor;

public abstract class yi2
{
    public static final String[] a;
    public static final vbh b;
    public static final def c;
    public static final fvd d;
    public static final elo e;
    public static final elo f;
    public static final elo g;
    public static final elo h;
    public static final elo i;
    public static final elo j;
    public static final elo k;
    public static final elo l;
    public static final elo m;
    
    public static final opk A(final px8 px8) {
        switch (((Enum)px8).ordinal()) {
            default: {
                en9.r();
                return null;
            }
            case 6: {
                return (opk)kpk.a;
            }
            case 5: {
                return (opk)mpk.a;
            }
            case 4: {
                return (opk)jpk.a;
            }
            case 3: {
                return (opk)fpk.a;
            }
            case 2: {
                return (opk)hpk.a;
            }
            case 1: {
                return (opk)epk.a;
            }
            case 0: {
                return (opk)gpk.a;
            }
        }
    }
    
    public static final boolean B(final jqc jqc, final SerialDescriptor serialDescriptor) {
        if (!jqc.a.b) {
            final List annotations = serialDescriptor.getAnnotations();
            if (annotations == null || !((Collection)annotations).isEmpty()) {
                final Iterator iterator = ((Iterable)annotations).iterator();
                while (iterator.hasNext()) {
                    if (((Annotation)iterator.next()) instanceof rrc) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public static final int C(final int n, final int n2) {
        return n >> n2 & 0x1F;
    }
    
    public static final Object[] D(final Object[] array, final int n, final Object o, final Object o2) {
        final Object[] array2 = new Object[array.length + 2];
        iw0.O0(0, n, 6, array, array2);
        iw0.K0(n + 2, n, array.length, array, array2);
        array2[n] = o;
        array2[n + 1] = o2;
        return array2;
    }
    
    public static final Object E(final t2b t2b, czp v, final p1 w, yz4 x, final h07 h07) {
        Object o = null;
        Label_0058: {
            if (h07 instanceof e05) {
                final e05 e05 = (e05)h07;
                final int b = e05.B;
                if ((b & Integer.MIN_VALUE) != 0x0) {
                    e05.B = b + Integer.MIN_VALUE;
                    o = e05;
                    break Label_0058;
                }
            }
            o = new h07(h07);
        }
        final Object a = ((e05)o).A;
        final int b2 = ((e05)o).B;
        final pc7 v2 = pc7.v;
        b4j z;
        ArrayList y;
        p1 w2;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 == 2) {
                    vt4.g0(a);
                    return lqo.a;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                z = ((e05)o).z;
                y = ((e05)o).y;
                x = ((e05)o).x;
                w2 = ((e05)o).w;
                v = ((e05)o).v;
                vt4.g0(a);
            }
        }
        else {
            vt4.g0(a);
            final List a2 = byp.a;
            final ArrayList y2 = new ArrayList(d86.p0((Iterable)a2, 10));
            final Iterator iterator = ((Iterable)a2).iterator();
            while (iterator.hasNext()) {
                y2.add((Object)((u2b)t2b).a.s((String)iterator.next()));
            }
            final Object z2 = new Object();
            haj f;
            if (((u2b)t2b).a.b()) {
                f = F((List)y2, (jta)w);
            }
            else {
                f = null;
            }
            ((b4j)z2).v = f;
            final n6k a3 = ljq.a0((jta)new p1((Object)t2b, (byte)20));
            final q31 q31 = new q31(2, (f07)null, (byte)4);
            ((e05)o).v = v;
            ((e05)o).w = w;
            ((e05)o).x = x;
            ((e05)o).y = y2;
            ((e05)o).z = (b4j)z2;
            ((e05)o).B = 1;
            if (vt4.A((ija)a3, (zta)q31, (f07)o) == v2) {
                return v2;
            }
            z = (b4j)z2;
            w2 = w;
            y = y2;
        }
        final n6k a4 = ljq.a0((jta)new jd0((Object)y, (Object)w2, (byte)21));
        final te0 te0 = new te0(z, x, v, (byte)3);
        ((e05)o).v = null;
        ((e05)o).w = null;
        ((e05)o).x = null;
        ((e05)o).y = null;
        ((e05)o).z = null;
        ((e05)o).B = 2;
        if (a4.a((jja)te0, (f07)o) != v2) {
            return lqo.a;
        }
        return v2;
    }
    
    public static final haj F(final List list, final jta jta) {
        final ArrayList list2 = new ArrayList(d86.p0((Iterable)list, 10));
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            final Boolean b = (Boolean)((xom)iterator.next()).getValue();
            b.getClass();
            list2.add((Object)b);
        }
        return new haj(list2, (boolean)jta.a());
    }
    
    public static final void G(final Context context) {
        final File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            final krd c = krd.c();
            final String a = p4q.a;
            c.getClass();
            final File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            final File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            final String[] a2 = p4q.a();
            int v;
            if ((v = z5e.V(a2.length)) < 16) {
                v = 16;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(v);
            for (final String s : a2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(databasePath2.getPath());
                sb.append(s);
                final File file = new File(sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(noBackupFilesDir.getPath());
                sb2.append(s);
                ((Map)linkedHashMap).put((Object)file, (Object)new File(sb2.toString()));
            }
            for (final Map$Entry map$Entry : y5e.g0((Map)linkedHashMap, new yog((Object)databasePath2, (Object)noBackupFilesDir)).entrySet()) {
                final File file2 = (File)map$Entry.getKey();
                final File file3 = (File)map$Entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        final krd c2 = krd.c();
                        final String b = p4q.b();
                        final StringBuilder sb3 = new StringBuilder("Over-writing contents of ");
                        sb3.append((Object)file3);
                        c2.f(b, sb3.toString());
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    }
                    else {
                        file2.toString();
                        file3.toString();
                    }
                    final krd c3 = krd.c();
                    final String a3 = p4q.a;
                    c3.getClass();
                }
            }
        }
    }
    
    public static final void H(final jqc jqc, final SerialDescriptor serialDescriptor) {
        mlc.q(serialDescriptor.b(), xym.k);
    }
    
    public static final void I(final hgf hgf, final jta jta) {
        l5g b;
        if ((b = hgf.B) == null) {
            b = new l5g((k5g)hgf);
            hgf.B = b;
        }
        soh.M(hgf).getSnapshotObserver().a.d((Object)b, (lta)l5g.w, jta);
    }
    
    public static final KSerializer J(final rtc rtc, final ArrayList list, final jta jta) {
        Object o;
        if (!rtc.equals(v4j.a((Class)Collection.class)) && !rtc.equals(v4j.a((Class)List.class)) && !rtc.equals(v4j.a((Class)List.class)) && !rtc.equals(v4j.a((Class)ArrayList.class))) {
            if (rtc.equals(v4j.a((Class)HashSet.class))) {
                o = new wcb((KSerializer)list.get(0));
            }
            else if (!rtc.equals(v4j.a((Class)Set.class)) && !rtc.equals(v4j.a((Class)Set.class)) && !rtc.equals(v4j.a((Class)LinkedHashSet.class))) {
                if (rtc.equals(v4j.a((Class)HashMap.class))) {
                    o = new vcb((KSerializer)list.get(0), (KSerializer)list.get(1));
                }
                else if (!rtc.equals(v4j.a((Class)Map.class)) && !rtc.equals(v4j.a((Class)Map.class)) && !rtc.equals(v4j.a((Class)LinkedHashMap.class))) {
                    if (rtc.equals(v4j.a((Class)Map$Entry.class))) {
                        o = new p3e((KSerializer)list.get(0), (KSerializer)list.get(1), (byte)0);
                    }
                    else if (rtc.equals(v4j.a((Class)yog.class))) {
                        o = new p3e((KSerializer)list.get(0), (KSerializer)list.get(1), (byte)1);
                    }
                    else if (rtc.equals(v4j.a((Class)cio.class))) {
                        o = new dio((KSerializer)list.get(0), (KSerializer)list.get(1), (KSerializer)list.get(2));
                    }
                    else if (qt7.z(rtc).isArray()) {
                        final Object a = jta.a();
                        a.getClass();
                        o = new e4j((rtc)a, (KSerializer)list.get(0));
                    }
                    else {
                        o = null;
                    }
                }
                else {
                    o = new afd((KSerializer)list.get(0), (KSerializer)list.get(1));
                }
            }
            else {
                o = new uv0((KSerializer)list.get(0), (byte)1);
            }
        }
        else {
            o = new uv0((KSerializer)list.get(0), (byte)0);
        }
        if (o == null) {
            final KSerializer[] array = (KSerializer[])list.toArray((Object[])new KSerializer[0]);
            final KSerializer[] array2 = (KSerializer[])Arrays.copyOf((Object[])array, array.length);
            return o50.t(qt7.z(rtc), (KSerializer[])Arrays.copyOf((Object[])array2, array2.length));
        }
        return (KSerializer)o;
    }
    
    public static final void K(final ubh ubh, final peo peo, final qmn qmn, final y4c y4c, final d09 d09, final h21 h21, final rhn rhn, final ymf ymf, final jap jap, final shn shn, final h07 h22) {
        while (true) {
            Label_0047: {
                if (!(h22 instanceof sb0)) {
                    break Label_0047;
                }
                final sb0 sb0 = (sb0)h22;
                final int w = sb0.w;
                if ((w & Integer.MIN_VALUE) == 0x0) {
                    break Label_0047;
                }
                sb0.w = w + Integer.MIN_VALUE;
                final Object o = sb0;
                final Object v = ((sb0)o).v;
                final int w2 = ((sb0)o).w;
                if (w2 == 0) {
                    vt4.g0(v);
                    final View view = ubh.getView();
                    ko1 ko1;
                    if (Build$VERSION.SDK_INT >= 34) {
                        ko1 = new ko1(view);
                    }
                    else {
                        ko1 = new ko1(view);
                    }
                    ((sb0)o).w = 1;
                    L(ubh, peo, qmn, y4c, d09, (lta)h21, (jta)rhn, (ih6)ko1, ymf, jap, (lta)shn, (h07)o);
                    return;
                }
                if (w2 != 1) {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                throw ge9.w(v);
            }
            final Object o = new h07(h22);
            continue;
        }
    }
    
    public static final void L(final ubh ubh, final peo peo, final qmn qmn, final y4c y4c, final d09 d09, final lta lta, final jta jta, final ih6 ih6, final ymf ymf, final jap jap, final lta lta2, final h07 h07) {
        Object o = null;
        Label_0058: {
            if (h07 instanceof tb0) {
                final tb0 tb0 = (tb0)h07;
                final int w = tb0.w;
                if ((w & Integer.MIN_VALUE) != 0x0) {
                    tb0.w = w + Integer.MIN_VALUE;
                    o = tb0;
                    break Label_0058;
                }
            }
            o = new h07(h07);
        }
        final Object v = ((tb0)o).v;
        final int w2 = ((tb0)o).w;
        if (w2 != 0) {
            if (w2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            final zb0 zb0 = new zb0(ymf, peo, qmn, (ko1)ih6, ubh, y4c, d09, lta, jta, jap, lta2, (f07)null);
            ((tb0)o).w = 1;
            if (ien.m((f07)o, (zta)zb0) == pc7.v) {
                return;
            }
        }
        ebq.a();
    }
    
    public static final hng M(final dng dng, final hng hng) {
        final qzc v = qzc.v;
        return new hng(omo.z((dng)hng, v) + omo.z(dng, v), hng.c + dng.d(), omo.y((dng)hng, v) + omo.y(dng, v), hng.e + dng.a());
    }
    
    public static final ArrayList N(final px8[] array, final gva gva, final int n) {
        boolean b = true;
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        final lh0 r = lh0.R;
        final String s = soh.S(2131757659, gva);
        final px8 w = px8.w;
        final qx8 qx8 = new qx8(w, r, s, 24);
        final lh0 s2 = lh0.S1;
        final String s3 = soh.S(2131757665, gva);
        final px8 y = px8.y;
        final qx8 qx9 = new qx8(y, s2, s3, 24);
        final qx8 qx10 = new qx8(px8.A, lh0.a0, soh.S(2131757660, gva), 24);
        final lh0 u = lh0.u;
        final String s4 = soh.S(2131757839, gva);
        final px8 z = px8.z;
        final List y2 = lq6.Y(qx8, qx9, qx10, new qx8(z, u, s4, 24), new qx8(px8.B, lh0.Y, soh.S(2131757663, gva), 24), new qx8(px8.x, lh0.l0, soh.S(2131757661, gva), 24));
        final Set n2 = iw0.n1((Object[])new px8[] { w, z });
        Object o;
        if (b) {
            o = rml.K(y);
        }
        else {
            o = z89.v;
        }
        final LinkedHashSet h = rml.H((Set)rml.H(n2, (Iterable)o), (Iterable)iw0.n1((Object[])array));
        final ArrayList list = new ArrayList();
        for (final Object next : y2) {
            if (((Set)h).contains((Object)((qx8)next).a)) {
                list.add(next);
            }
        }
        return list;
    }
    
    public static final Object[] O(final int n, final Object[] array) {
        final Object[] array2 = new Object[array.length - 2];
        iw0.O0(0, n, 6, array, array2);
        iw0.K0(n, n + 2, array.length, array, array2);
        return array2;
    }
    
    public static final Object[] P(final int n, final Object[] array) {
        final Object[] array2 = new Object[array.length - 1];
        iw0.O0(0, n, 6, array, array2);
        iw0.K0(n, n + 1, array.length, array, array2);
        return array2;
    }
    
    public static final float Q(final long n, final float n2, final xc8 xc8) {
        if (vnn.a(n, vnn.c)) {
            return n2;
        }
        final long b = vnn.b(n);
        if (wnn.a(b, 4294967296L)) {
            return xc8.W0(n);
        }
        if (wnn.a(b, 8589934592L)) {
            return vnn.c(n) * n2;
        }
        return Float.NaN;
    }
    
    public static final float R(final long n, final float n2, final xc8 xc8) {
        final long b = vnn.b(n);
        float c;
        if (wnn.a(b, 4294967296L)) {
            if (xc8.o0() <= 1.05) {
                return xc8.W0(n);
            }
            c = vnn.c(n) / vnn.c(xc8.Z(n2));
        }
        else {
            if (!wnn.a(b, 8589934592L)) {
                return Float.NaN;
            }
            c = vnn.c(n);
        }
        return c * n2;
    }
    
    public static final KSerializer S(final vee vee, final buc buc) {
        final KSerializer t = T(vee, buc, true);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(o50.R(o50.K(buc)));
    }
    
    public static final KSerializer T(final vee vee, final buc buc, final boolean b) {
        final rtc k = o50.K(buc);
        final boolean a = buc.a();
        final List b2 = buc.b();
        final ArrayList list = new ArrayList(d86.p0((Iterable)b2, 10));
        for (final duc duc : b2) {
            final buc a2 = duc.a();
            if (a2 == null) {
                fvd.t((Object)duc.a(), "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            list.add((Object)a2);
        }
        final boolean empty = list.isEmpty();
        final r89 v = r89.v;
        KSerializer kSerializer = null;
        Label_0238: {
            if (empty) {
                if (!o50.H(k) || vee.v(k, (List)v) == null) {
                    if (a) {
                        kSerializer = yzk.b.b(k);
                        break Label_0238;
                    }
                    kSerializer = yzk.a.b(k);
                    if (kSerializer != null) {
                        break Label_0238;
                    }
                }
            }
            else if (!vee.a) {
                Object o;
                if (!a) {
                    o = yzk.c.k(k, list);
                }
                else {
                    o = yzk.d.k(k, list);
                }
                Object o2 = o;
                if (o instanceof jpj) {
                    o2 = null;
                }
                kSerializer = (KSerializer)o2;
                break Label_0238;
            }
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer kSerializer2 = null;
        Label_0385: {
            Label_0305: {
                nfh nfh;
                if (list.isEmpty()) {
                    if ((kSerializer2 = U(k)) != null || (kSerializer2 = vee.v(k, (List)v)) != null) {
                        break Label_0385;
                    }
                    if (!o50.H(k)) {
                        break Label_0305;
                    }
                    nfh = new nfh(k);
                }
                else {
                    final ArrayList v2 = V(vee, (List)list, b);
                    if (v2 == null) {
                        return null;
                    }
                    kSerializer2 = J(k, v2, (jta)new wfk((Object)list, (byte)4));
                    if (kSerializer2 != null || (kSerializer2 = vee.v(k, (List)v2)) != null) {
                        break Label_0385;
                    }
                    if (!o50.H(k)) {
                        break Label_0305;
                    }
                    nfh = new nfh(k);
                }
                kSerializer2 = (KSerializer)nfh;
                break Label_0385;
            }
            kSerializer2 = null;
        }
        if (kSerializer2 != null) {
            if (a) {
                return k8e.v(kSerializer2);
            }
            return kSerializer2;
        }
        return null;
    }
    
    public static final KSerializer U(final rtc rtc) {
        final KSerializer t = o50.t(qt7.z(rtc), (KSerializer[])Arrays.copyOf((Object[])new KSerializer[0], 0));
        if (t == null) {
            return (KSerializer)roh.a.get((Object)rtc);
        }
        return t;
    }
    
    public static final ArrayList V(final vee vee, final List list, final boolean b) {
        if (b) {
            final ArrayList list2 = new ArrayList(d86.p0((Iterable)list, 10));
            final Iterator iterator = ((Iterable)list).iterator();
            while (iterator.hasNext()) {
                list2.add((Object)S(vee, (buc)iterator.next()));
            }
            return list2;
        }
        final ArrayList list3 = new ArrayList(d86.p0((Iterable)list, 10));
        final Iterator iterator2 = ((Iterable)list).iterator();
        while (iterator2.hasNext()) {
            final KSerializer t = T(vee, (buc)iterator2.next(), false);
            if (t == null) {
                return null;
            }
            list3.add((Object)t);
        }
        return list3;
    }
    
    public static final void W(final Spannable spannable, final long n, final int n2, final int n3) {
        if (n != 16L) {
            spannable.setSpan((Object)new ForegroundColorSpan(t08.o0(n)), n2, n3, 33);
        }
    }
    
    public static final void X(final Spannable spannable, final long n, final xc8 xc8, final int n2, final int n3) {
        final long b = vnn.b(n);
        if (wnn.a(b, 4294967296L)) {
            spannable.setSpan((Object)new AbsoluteSizeSpan(k8e.H(xc8.W0(n)), false), n2, n3, 33);
            return;
        }
        if (wnn.a(b, 8589934592L)) {
            spannable.setSpan((Object)new RelativeSizeSpan(vnn.c(n)), n2, n3, 33);
        }
    }
    
    public static final void Y(final String s, final JsonElement jsonElement) {
        final StringBuilder u = ge9.u("Class with serial name ", s, " cannot be serialized polymorphically because it is represented as ");
        u.append(v4j.a((Class)jsonElement.getClass()).c());
        u.append('.');
        throw new JsonEncodingException(u.toString(), "Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }
    
    public static final Rect Z(final ygc ygc) {
        return new Rect(ygc.a, ygc.b, ygc.c, ygc.d);
    }
    
    public static dg0 a(final float n, float n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        return new dg0(yi2.e, n, new eg0(n2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
    
    public static final RectF a0(final k2j k2j) {
        return new RectF(k2j.a, k2j.b, k2j.c, k2j.d);
    }
    
    public static final void b(final boolean b, final List list, final Map map, final boolean b2, final List list2, final List list3, final Set set, final jta jta, final lta lta, final boolean b3, final lta lta2, final lta lta3, final lta lta4, final lta lta5, final jta jta2, final jta jta3, final jta jta4, final jta jta5, igf igf, final v5d v5d, dng dng, final boolean b4, final gx8 gx8, lta lta6, final gva gva, final int n, final int n2, final int n3) {
        gva.i0(-42351636);
        int n4;
        if (gva.g(b)) {
            n4 = 4;
        }
        else {
            n4 = 2;
        }
        int n5;
        if (gva.f((Object)list)) {
            n5 = 32;
        }
        else {
            n5 = 16;
        }
        final int n6 = n4 | n | n5;
        int n8;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.f((Object)map)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n8 = (n6 | n7);
        }
        else {
            n8 = n6;
        }
        final boolean g = gva.g(b2);
        final int n9 = 1024;
        int n10;
        if (g) {
            n10 = 2048;
        }
        else {
            n10 = 1024;
        }
        final boolean f = gva.f((Object)list2);
        final int n11 = 8192;
        int n12;
        if (f) {
            n12 = 16384;
        }
        else {
            n12 = 8192;
        }
        final boolean f2 = gva.f((Object)list3);
        final int n13 = 65536;
        int n14;
        if (f2) {
            n14 = 131072;
        }
        else {
            n14 = 65536;
        }
        final boolean f3 = gva.f((Object)set);
        final int n15 = 524288;
        int n16;
        if (f3) {
            n16 = 1048576;
        }
        else {
            n16 = 524288;
        }
        int n17 = n8 | n10 | n12 | n14 | n16;
        int n18 = 4194304;
        if ((n & 0xC00000) == 0x0) {
            int n19;
            if (gva.h((Object)jta)) {
                n19 = 8388608;
            }
            else {
                n19 = 4194304;
            }
            n17 |= n19;
        }
        int n20 = n17;
        if ((n & 0x6000000) == 0x0) {
            int n21;
            if (gva.h((Object)lta)) {
                n21 = 67108864;
            }
            else {
                n21 = 33554432;
            }
            n20 = (n17 | n21);
        }
        int n22 = n20;
        if ((n & 0x30000000) == 0x0) {
            int n23;
            if (gva.g(b3)) {
                n23 = 536870912;
            }
            else {
                n23 = 268435456;
            }
            n22 = (n20 | n23);
        }
        int n25;
        if ((n2 & 0x6) == 0x0) {
            int n24;
            if (gva.h((Object)lta2)) {
                n24 = 4;
            }
            else {
                n24 = 2;
            }
            n25 = (n2 | n24);
        }
        else {
            n25 = n2;
        }
        int n26 = n25;
        if ((n2 & 0x30) == 0x0) {
            int n27;
            if (gva.h((Object)lta3)) {
                n27 = 32;
            }
            else {
                n27 = 16;
            }
            n26 = (n25 | n27);
        }
        if ((n2 & 0x180) == 0x0) {
            int n28;
            if (gva.h((Object)lta4)) {
                n28 = 256;
            }
            else {
                n28 = 128;
            }
            n26 |= n28;
        }
        if ((n2 & 0xC00) == 0x0) {
            int n29;
            if (gva.h((Object)lta5)) {
                n29 = 2048;
            }
            else {
                n29 = 1024;
            }
            n26 |= n29;
        }
        if ((n2 & 0x6000) == 0x0) {
            int n30 = n11;
            if (gva.h((Object)jta2)) {
                n30 = 16384;
            }
            n26 |= n30;
        }
        int n31 = n26;
        if ((n2 & 0x30000) == 0x0) {
            int n32 = n13;
            if (gva.h((Object)jta3)) {
                n32 = 131072;
            }
            n31 = (n26 | n32);
        }
        int n33 = n15;
        if (gva.h((Object)jta4)) {
            n33 = 1048576;
        }
        if (gva.h((Object)jta5)) {
            n18 = 8388608;
        }
        final int n34 = n31 | n33 | n18 | 0x16000000;
        final int n35 = n3 & 0x100000;
        int n36;
        if (n35 != 0) {
            n36 = 6;
        }
        else if (gva.f((Object)dng)) {
            n36 = 4;
        }
        else {
            n36 = 2;
        }
        int n37;
        if (gva.g(b4)) {
            n37 = 32;
        }
        else {
            n37 = 16;
        }
        int n38;
        if (gva.f((Object)gx8)) {
            n38 = 256;
        }
        else {
            n38 = 128;
        }
        final int n39 = n36 | n37 | n38;
        final int n40 = n3 & 0x800000;
        int n41;
        if (n40 != 0) {
            n41 = (n39 | 0xC00);
        }
        else {
            int n42 = n9;
            if (gva.h((Object)lta6)) {
                n42 = 2048;
            }
            n41 = (n39 | n42);
        }
        final boolean b5 = true;
        v5d v5d2;
        lta lta11;
        if (gva.W(n22 & 0x1, (n22 & 0x12492493) != 0x12492492 || (n34 & 0x12492493) != 0x12492492 || (n41 & 0x493) != 0x492)) {
            gva.b0();
            final cib a = bi6.a;
            int n43;
            Object v;
            lta lta8;
            Object o;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final dng dng2 = dng;
                final lta lta7 = lta6;
                n43 = (n34 & 0x8FFFFFFF);
                v5d2 = v5d;
                v = igf;
                lta8 = lta7;
                o = dng2;
            }
            else {
                final v5d a2 = y5d.a(0, 3, gva);
                n43 = (n34 & 0x8FFFFFFF);
                Object o2;
                if (n35 != 0) {
                    o2 = new hng(0.0f, 0.0f, 0.0f, 0.0f);
                }
                else {
                    o2 = dng;
                }
                v = fgf.v;
                if (n40 != 0) {
                    Object r = gva.R();
                    if (r == a) {
                        r = new g9b((byte)16);
                        gva.q0(r);
                    }
                    lta6 = (lta)r;
                    o = o2;
                    lta8 = lta6;
                    v5d2 = a2;
                }
                else {
                    final lta lta9 = lta6;
                    v5d2 = a2;
                    o = o2;
                    lta8 = lta9;
                }
            }
            gva.r();
            final String s = soh.S(((p37)gva.j((sei)q37.a())).a(), gva);
            final boolean b6 = (n22 & 0x70000) == 0x20000;
            final boolean b7 = (0x70000000 & n22) == 0x20000000;
            final Object r2 = gva.R();
            Object o3;
            if ((b6 | b7) || (o3 = r2) == a) {
                if (b3) {
                    o3 = list3;
                }
                else {
                    final ArrayList list4 = new ArrayList(d86.p0((Iterable)list3, 10));
                    for (final x34 x34 : list3) {
                        final List c = x34.c;
                        final ArrayList list5 = new ArrayList();
                        for (final Object next : c) {
                            if (!(((e34)next) instanceof a34)) {
                                list5.add(next);
                            }
                        }
                        list4.add((Object)x34.a(x34, (List)list5));
                    }
                    o3 = list4;
                }
                gva.q0(o3);
            }
            final List list6 = (List)o3;
            final igf e = ((igf)v).E((igf)b.b);
            final boolean b8 = (n22 & 0xE) == 0x4;
            final boolean f4 = gva.f((Object)s);
            final boolean b9 = (n43 & 0x70000) == 0x20000;
            final boolean b10 = (n43 & 0x380000) == 0x100000;
            final boolean b11 = (n43 & 0x1C00000) == 0x800000;
            final boolean b12 = (n22 & 0x70) == 0x20;
            final boolean b13 = (n22 & 0x380) == 0x100;
            final boolean b14 = (n22 & 0x380000) == 0x100000;
            final boolean b15 = (n41 & 0x380) == 0x100;
            final boolean b16 = (n41 & 0x1C00) == 0x800;
            final boolean b17 = (n22 & 0xE000) == 0x4000;
            final boolean b18 = (n43 & 0xE) == 0x4;
            final boolean b19 = (n43 & 0x380) == 0x100;
            final boolean b20 = (n43 & 0xE000) == 0x4000;
            final boolean h = gva.h((Object)list6);
            final boolean b21 = (n41 & 0x70) == 0x20;
            final boolean b22 = (n22 & 0x1C00) == 0x800;
            final boolean b23 = (0xE000000 & n22) == 0x4000000;
            final boolean b24 = (n22 & 0x1C00000) == 0x800000;
            final boolean b25 = (n43 & 0x70) == 0x20;
            final boolean b26 = (n43 & 0x1C00) == 0x800 && b5;
            Object r3 = gva.R();
            if ((b24 | (b8 | f4 | b9 | b10 | b11 | b12 | b13 | b14 | b15 | b16 | b17 | b18 | b19 | b20 | h | b21 | b22 | b23) | b25 | b26) || r3 == a) {
                r3 = new klb(list, map, set, gx8, b, list2, lta2, lta4, jta2, list6, b4, b2, lta, jta, lta3, lta5, s, jta3, jta4, jta5, lta8);
                gva.q0(r3);
            }
            c5q.g(e, v5d2, (dng)o, false, null, null, null, false, null, (lta)r3, gva, n41 << 6 & 0x380, 504);
            final lta lta10 = lta8;
            igf = (igf)v;
            dng = (dng)o;
            lta11 = lta10;
        }
        else {
            gva.Z();
            lta11 = lta6;
            v5d2 = v5d;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new elb(b, list, map, b2, list2, list3, set, jta, lta, b3, lta2, lta3, lta4, lta5, jta2, jta3, jta4, jta5, igf, v5d2, dng, b4, gx8, lta11, n, n2, n3);
        }
    }
    
    public static final k2j b0(final Rect rect) {
        return new k2j((float)rect.left, (float)rect.top, (float)rect.right, (float)rect.bottom);
    }
    
    public static final void c(boolean b, List n, boolean b2, List list, List list2, Set v, boolean b3, gx8 gx8, jta jta, final jta jta2, final gva gva, final int n2, final int n3) {
        gva.i0(-1460489667);
        int n4;
        if ((n3 & 0x2) == 0x0 && gva.f((Object)n)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        final int n5 = n2 | 0x6 | n4;
        final int n6 = n3 & 0x4;
        int n7;
        if (n6 != 0) {
            n7 = (n5 | 0x180);
        }
        else {
            n7 = n5;
            if ((n2 & 0x180) == 0x0) {
                int n8;
                if (gva.g(b2)) {
                    n8 = 256;
                }
                else {
                    n8 = 128;
                }
                n7 = (n5 | n8);
            }
        }
        final int n9 = n3 & 0x8;
        int n10;
        if (n9 != 0) {
            n10 = (n7 | 0xC00);
        }
        else {
            int n11;
            if (gva.f((Object)list)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n10 = (n7 | n11);
        }
        final int n12 = n3 & 0x10;
        int n13;
        if (n12 != 0) {
            n13 = (n10 | 0x6000);
        }
        else {
            int n14;
            if (gva.f((Object)list2)) {
                n14 = 16384;
            }
            else {
                n14 = 8192;
            }
            n13 = (n10 | n14);
        }
        final int n15 = n3 & 0x20;
        int n16;
        if (n15 != 0) {
            n16 = (n13 | 0x30000);
        }
        else {
            int n17;
            if (gva.f((Object)v)) {
                n17 = 131072;
            }
            else {
                n17 = 65536;
            }
            n16 = (n13 | n17);
        }
        final int n18 = n3 & 0x40;
        int n21 = 0;
        Label_0338: {
            int n19;
            if (n18 != 0) {
                n19 = (n16 | 0x180000);
            }
            else {
                n19 = n16;
                if ((0x180000 & n2) == 0x0) {
                    int n20;
                    if (gva.g(b3)) {
                        n20 = 1048576;
                    }
                    else {
                        n20 = 524288;
                    }
                    n21 = (n16 | n20);
                    break Label_0338;
                }
            }
            n21 = n19;
        }
        final int n22 = n3 & 0x80;
        int n25 = 0;
        Label_0409: {
            int n23;
            if (n22 != 0) {
                n23 = (n21 | 0xC00000);
            }
            else {
                n23 = n21;
                if ((n2 & 0xC00000) == 0x0) {
                    int n24;
                    if (gva.f((Object)gx8)) {
                        n24 = 8388608;
                    }
                    else {
                        n24 = 4194304;
                    }
                    n25 = (n21 | n24);
                    break Label_0409;
                }
            }
            n25 = n23;
        }
        final int n26 = n3 & 0x100;
        int n29 = 0;
        Label_0480: {
            int n27;
            if (n26 != 0) {
                n27 = (n25 | 0x6000000);
            }
            else {
                n27 = n25;
                if ((n2 & 0x6000000) == 0x0) {
                    int n28;
                    if (gva.h((Object)jta)) {
                        n28 = 67108864;
                    }
                    else {
                        n28 = 33554432;
                    }
                    n29 = (n25 | n28);
                    break Label_0480;
                }
            }
            n29 = n27;
        }
        final int n30 = n3 & 0x200;
        int n31;
        if (n30 != 0) {
            n31 = (n29 | 0x30000000);
        }
        else {
            n31 = n29;
            if ((n2 & 0x30000000) == 0x0) {
                int n32;
                if (gva.h((Object)jta2)) {
                    n32 = 536870912;
                }
                else {
                    n32 = 268435456;
                }
                n31 = (n29 | n32);
            }
        }
        List list4;
        boolean b6;
        boolean b7;
        Set set;
        gx8 gx11;
        jta jta6;
        if (gva.W(n31 & 0x1, (n31 & 0x12492493) != 0x12492492)) {
            gva.b0();
            List list3;
            gx8 gx9;
            boolean b5;
            List list5;
            jta jta3;
            jta jta4;
            int n33;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final boolean b4 = b;
                list3 = n;
                gx9 = gx8;
                b5 = b2;
                list4 = list;
                list5 = list2;
                jta3 = jta2;
                jta4 = jta;
                n33 = (b4 ? 1 : 0);
            }
            else {
                if ((n3 & 0x2) != 0x0) {
                    n = (List)N(new px8[0], gva, 1);
                }
                if (n6 != 0) {
                    b2 = false;
                }
                final Object v2 = r89.v;
                if (n9 != 0) {
                    list = (List)v2;
                }
                if (n12 != 0) {
                    list2 = (List)v2;
                }
                if (n15 != 0) {
                    v = (Set)z89.v;
                }
                if (n18 != 0) {
                    b3 = false;
                }
                if (n22 != 0) {
                    gx8 = null;
                }
                jta jta5;
                if (n26 != 0) {
                    jta5 = null;
                }
                else {
                    jta5 = jta;
                }
                if (n30 != 0) {
                    jta = null;
                }
                else {
                    jta = jta2;
                }
                final List list6 = n;
                final int n34 = 1;
                b5 = b2;
                gx9 = gx8;
                list5 = list2;
                jta4 = jta5;
                n33 = n34;
                list3 = list6;
                list4 = list;
                jta3 = jta;
            }
            gva.r();
            final b09 a = q37.a();
            p37 p13;
            if (b3) {
                p13 = p37.B;
            }
            else {
                p13 = p37.A;
            }
            c5q.c(a.a((Object)p13), (zta)uuj.t0(608966013, (aua)new qk7((boolean)(n33 != 0), list3, b5, list4, list5, v, jta4, jta3, b3, gx9), gva), gva, 56);
            final int n35 = n33;
            b6 = b5;
            jta = jta4;
            b7 = b3;
            final gx8 gx10 = gx9;
            b = (n35 != 0);
            n = list3;
            list2 = list5;
            set = v;
            gx11 = gx10;
            jta6 = jta;
            jta = jta3;
        }
        else {
            gva.Z();
            jta6 = jta;
            b6 = b2;
            final Set set2 = v;
            b7 = b3;
            gx11 = gx8;
            jta = jta2;
            set = set2;
            list4 = list;
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new flb(b, n, b6, list4, list2, set, b7, gx11, jta6, jta, n2, n3);
        }
    }
    
    public static final k2j c0(final RectF rectF) {
        return new k2j(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
    
    public static final void d(final alb alb, final nx8 nx8, final Set set, final jta jta, final jta jta2, final jta jta3, final jta jta4, final jta jta5, final lta lta, final boolean b, final lta lta2, final jta jta6, final jta jta7, final lta lta3, final lta lta4, final lta lta5, final jta jta8, final jta jta9, final jta jta10, final jta jta11, final jta jta12, final igf igf, boolean b2, boolean b3, final String s, final boolean b4, final boolean b5, final gva gva, final int n, final int n2) {
        gva.i0(-1322846905);
        int n4;
        if ((n & 0x6) == 0x0) {
            boolean b6;
            if ((n & 0x8) == 0x0) {
                b6 = gva.f((Object)alb);
            }
            else {
                b6 = gva.h((Object)alb);
            }
            int n3;
            if (b6) {
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
        int n7;
        final int n6 = n7 = n4;
        if ((n & 0x30) == 0x0) {
            int n8;
            if (gva.f((Object)nx8)) {
                n8 = 32;
            }
            else {
                n8 = 16;
            }
            n7 = (n6 | n8);
        }
        final int n9 = 128;
        int n10 = n7;
        if ((n & 0x180) == 0x0) {
            boolean b7;
            if ((n & 0x200) == 0x0) {
                b7 = gva.f((Object)set);
            }
            else {
                b7 = gva.h((Object)set);
            }
            int n11;
            if (b7) {
                n11 = 256;
            }
            else {
                n11 = 128;
            }
            n10 = (n7 | n11);
        }
        final int n12 = 1024;
        int n13 = n10;
        if ((n & 0xC00) == 0x0) {
            int n14;
            if (gva.h((Object)jta)) {
                n14 = 2048;
            }
            else {
                n14 = 1024;
            }
            n13 = (n10 | n14);
        }
        final int n15 = 8192;
        int n16 = n13;
        if ((n & 0x6000) == 0x0) {
            int n17;
            if (gva.h((Object)jta2)) {
                n17 = 16384;
            }
            else {
                n17 = 8192;
            }
            n16 = (n13 | n17);
        }
        int n18 = n16;
        if ((n & 0x30000) == 0x0) {
            int n19;
            if (gva.h((Object)jta3)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 = (n16 | n19);
        }
        int n20 = n18;
        if ((n & 0x180000) == 0x0) {
            int n21;
            if (gva.h((Object)jta4)) {
                n21 = 1048576;
            }
            else {
                n21 = 524288;
            }
            n20 = (n18 | n21);
        }
        int n22 = 4194304;
        int n23 = n20;
        if ((n & 0xC00000) == 0x0) {
            int n24;
            if (gva.h((Object)jta5)) {
                n24 = 8388608;
            }
            else {
                n24 = 4194304;
            }
            n23 = (n20 | n24);
        }
        int n25 = 33554432;
        int n26 = n23;
        if ((n & 0x6000000) == 0x0) {
            int n27;
            if (gva.h((Object)lta)) {
                n27 = 67108864;
            }
            else {
                n27 = 33554432;
            }
            n26 = (n23 | n27);
        }
        int n28 = 268435456;
        int n29 = n26;
        if ((n & 0x30000000) == 0x0) {
            int n30;
            if (gva.g(b)) {
                n30 = 536870912;
            }
            else {
                n30 = 268435456;
            }
            n29 = (n26 | n30);
        }
        int n31;
        if (gva.h((Object)lta2)) {
            n31 = 4;
        }
        else {
            n31 = 2;
        }
        int n32;
        if (gva.h((Object)jta6)) {
            n32 = 32;
        }
        else {
            n32 = 16;
        }
        int n33 = n9;
        if (gva.h((Object)jta7)) {
            n33 = 256;
        }
        int n34 = n12;
        if (gva.h((Object)lta3)) {
            n34 = 2048;
        }
        int n35;
        if (gva.h((Object)lta4)) {
            n35 = 16384;
        }
        else {
            n35 = 8192;
        }
        int n36;
        if (gva.h((Object)lta5)) {
            n36 = 131072;
        }
        else {
            n36 = 65536;
        }
        int n37;
        if (gva.h((Object)jta8)) {
            n37 = 1048576;
        }
        else {
            n37 = 524288;
        }
        if (gva.h((Object)jta9)) {
            n22 = 8388608;
        }
        if (gva.h((Object)jta10)) {
            n25 = 67108864;
        }
        if (gva.h((Object)jta11)) {
            n28 = 536870912;
        }
        final int n38 = n31 | n32 | n33 | n34 | n35 | n36 | n37 | n22 | n25 | n28;
        int n40;
        if ((n2 & 0x6) == 0x0) {
            int n39;
            if (gva.h((Object)jta12)) {
                n39 = 4;
            }
            else {
                n39 = 2;
            }
            n40 = (n2 | n39);
        }
        else {
            n40 = n2;
        }
        int n41 = n40;
        if ((n2 & 0x30) == 0x0) {
            int n42 = n5;
            if (gva.f((Object)igf)) {
                n42 = 32;
            }
            n41 = (n40 | n42);
        }
        int n43 = n41;
        if ((n2 & 0x180) == 0x0) {
            n43 = (n41 | 0x80);
        }
        int n44 = n43;
        if ((n2 & 0xC00) == 0x0) {
            n44 = (n43 | 0x400);
        }
        int n45 = n44;
        if ((n2 & 0x6000) == 0x0) {
            int n46 = n15;
            if (gva.f((Object)s)) {
                n46 = 16384;
            }
            n45 = (n44 | n46);
        }
        int n47 = n45;
        if ((n2 & 0x30000) == 0x0) {
            n47 = (n45 | 0x10000);
        }
        int n48 = n47;
        if ((n2 & 0x180000) == 0x0) {
            n48 = (n47 | 0x80000);
        }
        final boolean b8 = true;
        boolean a;
        boolean c;
        if (gva.W(n29 & 0x1, (n29 & 0x12492493) != 0x12492492 || (n38 & 0x12492493) != 0x12492492 || (0x92493 & n48) != 0x92492)) {
            gva.b0();
            int n49;
            boolean p30;
            boolean l;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final boolean b9 = b3;
                n49 = (n48 & 0xFFC0E07F);
                p30 = b2;
                l = b9;
                a = b4;
                c = b5;
            }
            else {
                p30 = alb.p();
                l = alb.L();
                a = alb.A();
                c = alb.c();
                n49 = (0xFFC0E07F & n48);
            }
            gva.r();
            final Object r = gva.R();
            final cib a2 = bi6.a;
            Object o = r;
            if (r == a2) {
                o = new geb((byte)7);
                gva.q0(o);
            }
            final bnf bnf = (bnf)mlc.a0(new Object[0], (jta)o, gva, 48);
            if (((xom)bnf).getValue()) {
                gva.g0(1689147067);
                final boolean f = gva.f((Object)bnf);
                final Object r2 = gva.R();
                Object o2;
                if (f || (o2 = r2) == a2) {
                    o2 = new dj7(bnf, (byte)22);
                    gva.q0(o2);
                }
                h3r.h(tab.x, (jta)o2, (k4j)null, (s3p)null, (st4)null, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(1689300827);
                gva.q(false);
            }
            final boolean b10 = alb.B();
            final String s2 = soh.S(2131757659, gva);
            String s3 = soh.S(2131757661, gva);
            final String s4 = soh.S(2131757665, gva);
            final String s5 = soh.S(2131757839, gva);
            final String s6 = soh.S(2131757660, gva);
            final String s7 = soh.S(2131757663, gva);
            final String s8 = soh.S(2131757662, gva);
            final boolean b11 = (n29 & 0x1C00) == 0x800;
            final boolean b12 = (n38 & 0x1C00000) == 0x800000;
            final boolean b13 = (n38 & 0x70) == 0x20;
            final boolean b14 = (n29 & 0xE000) == 0x4000;
            final boolean b15 = (n29 & 0x70000) == 0x20000;
            final boolean b16 = (n29 & 0x380000) == 0x100000;
            final boolean b17 = (n29 & 0x1C00000) == 0x800000;
            Object o3 = gva.R();
            final px8 c2 = px8.C;
            final px8 b18 = px8.B;
            final px8 a3 = px8.A;
            final px8 z = px8.z;
            final px8 y = px8.y;
            final px8 x = px8.x;
            final px8 w = px8.w;
            if ((b11 | b12 | b13 | b14 | b15 | b16 | b17) || o3 == a2) {
                o3 = y5e.Z(new yog[] { new yog((Object)w, (Object)jta), new yog((Object)x, (Object)jta9), new yog((Object)y, (Object)jta6), new yog((Object)z, (Object)jta2), new yog((Object)a3, (Object)jta3), new yog((Object)b18, (Object)jta4), new yog((Object)c2, (Object)jta5) });
                gva.q0(o3);
            }
            final Map map = (Map)o3;
            final boolean j = alb.j();
            final boolean y2 = alb.Y();
            final boolean h = alb.h();
            final boolean i = alb.i();
            final boolean z2 = alb.z();
            final Set q = alb.q();
            final boolean g = gva.g(j);
            final boolean g2 = gva.g(p30);
            final boolean g3 = gva.g(b10);
            final boolean g4 = gva.g(y2);
            final boolean g5 = gva.g(h);
            final boolean g6 = gva.g(i);
            final boolean g7 = gva.g(z2);
            final boolean g8 = gva.g(l);
            final boolean f2 = gva.f((Object)s2);
            final boolean b19 = (n49 & 0xE000) == 0x4000 && b8;
            final boolean f3 = gva.f((Object)s3);
            final boolean f4 = gva.f((Object)s4);
            final boolean f5 = gva.f((Object)s5);
            final boolean f6 = gva.f((Object)s6);
            final boolean f7 = gva.f((Object)s7);
            final boolean f8 = gva.f((Object)s8);
            final boolean f9 = gva.f((Object)q);
            final Object r3 = gva.R();
            Object o4;
            if (!(g | g2 | g3 | g4 | g5 | g6 | g7 | g8 | f2 | b19 | f3 | f4 | f5 | f6 | f7 | f8 | f9) && r3 != a2) {
                o4 = r3;
            }
            else {
                final ygd a4 = lq6.A();
                if (j && !b10) {
                    a4.add((Object)new qx8(w, lh0.R, s2, 24));
                }
                if (y2) {
                    a4.add((Object)new qx8(y, lh0.S1, s4, 24));
                }
                if (i) {
                    a4.add((Object)new qx8(a3, lh0.a0, s6, 24));
                }
                if (h) {
                    a4.add((Object)new qx8(z, lh0.u, s5, 24));
                }
                if (z2) {
                    a4.add((Object)new qx8(b18, lh0.Y, s7, 24));
                }
                if (l) {
                    a4.add((Object)new qx8(c2, lh0.r2, s8, 8));
                }
                if (p30) {
                    final lh0 l2 = lh0.l0;
                    if (s != null) {
                        s3 = s;
                    }
                    a4.add((Object)new qx8(x, l2, s3, 24));
                }
                final ygd n50 = lq6.n(a4);
                final ArrayList list = new ArrayList(d86.p0((Iterable)n50, 10));
                final ListIterator listIterator = n50.listIterator(0);
                while (true) {
                    final xgd xgd = (xgd)listIterator;
                    if (!xgd.hasNext()) {
                        break;
                    }
                    final qx8 qx8 = (qx8)xgd.next();
                    final sw8 e = qx8.e;
                    qx8 qx9 = qx8;
                    if (e != null) {
                        qx9 = qx8;
                        if (q.contains((Object)e)) {
                            qx9 = new qx8(qx8.a, qx8.b, qx8.c, 2, qx8.e);
                        }
                    }
                    list.add((Object)qx9);
                }
                gva.q0((Object)list);
                o4 = list;
            }
            final List list2 = (List)o4;
            final cy4 a5 = qy4.a;
            arf.c(nx8, igf, (aql)null, qy4.a(gva).r, qy4.a(gva).P, (d1q)new Object(), uuj.t0(-1448035988, (aua)new glb(alb, jta7, jta10, b, h, c, jta12, a, bnf, j, list2, map, set, jta, lta, lta2, lta3, lta4, lta5, jta8, jta11, b10), gva), gva, (n29 >> 3 & 0xE) | 0xC00000 | (n49 & 0x70));
            final boolean b20 = l;
            b2 = p30;
            b3 = b20;
        }
        else {
            gva.Z();
            c = b5;
            a = b4;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new hlb(alb, nx8, set, jta, jta2, jta3, jta4, jta5, lta, b, lta2, jta6, jta7, lta3, lta4, lta5, jta8, jta9, jta10, jta11, jta12, igf, b2, b3, s, a, c, n, n2);
        }
    }
    
    public static final Object d0(final JsonElement jsonElement) {
        if (jsonElement != null) {
            if (jsonElement instanceof JsonNull) {
                return null;
            }
            if (jsonElement instanceof JsonPrimitive) {
                final JsonPrimitive jsonPrimitive = (JsonPrimitive)jsonElement;
                if (jsonPrimitive.d()) {
                    return jsonPrimitive.a();
                }
                Object o;
                if ((o = jrc.e(jsonPrimitive)) != null || (o = jrc.k(jsonPrimitive)) != null) {
                    return o;
                }
                final Double t0 = qym.t0(jsonPrimitive.a());
                if (t0 != null) {
                    return t0;
                }
                uy8.g((Object)jsonPrimitive, "JsonPrimitive could not be parsed to a Kotlin type: ");
                return null;
            }
            else {
                if (jsonElement instanceof JsonArray) {
                    final Iterable iterable = (Iterable)jsonElement;
                    final ArrayList list = new ArrayList(d86.p0(iterable, 10));
                    final Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        list.add(d0((JsonElement)iterator.next()));
                    }
                    return list;
                }
                if (jsonElement instanceof JsonObject) {
                    return e0((JsonObject)jsonElement);
                }
            }
        }
        en9.r();
        return null;
    }
    
    public static final void e(final jta jta, final igf igf, final p4d p4d, final e4d e4d, final gva gva, final int n) {
        gva.i0(1055276397);
        int n2;
        if (gva.h((Object)jta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)igf)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.f((Object)p4d)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.f((Object)e4d)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        final int n6 = n2 | n | n3 | n4 | n5;
        if (gva.W(n6 & 0x1, (n6 & 0x493) != 0x492)) {
            vt4.j(uuj.t0(-933153643, (aua)new d4d((Object)p4d, (Object)igf, (Object)e4d, (Object)o50.W(jta, gva), (byte)0), gva), gva, 6);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cj4(jta, igf, p4d, e4d, n);
        }
    }
    
    public static final LinkedHashMap e0(final JsonObject jsonObject) {
        final Map v = jsonObject.v;
        final LinkedHashMap linkedHashMap = new LinkedHashMap(z5e.V(v.size()));
        for (final Map$Entry map$Entry : (Iterable)v.entrySet()) {
            ((Map)linkedHashMap).put(map$Entry.getKey(), d0((JsonElement)map$Entry.getValue()));
        }
        return linkedHashMap;
    }
    
    public static final void f(final ye6 ye6, final gva gva, final int n) {
        gva.i0(441837433);
        if (gva.W(n & 0x1, (n & 0x3) != 0x2)) {
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if ((o = r) == a) {
                o = new Object();
                ((dyd)o).v = null;
                gva.q0(o);
            }
            final dyd dyd = (dyd)o;
            Object r2;
            if ((r2 = gva.R()) == a) {
                r2 = new lrc((byte)23);
                gva.q0(r2);
            }
            final jta jta = (jta)r2;
            gva.k0();
            if (gva.S) {
                gva.k(jta);
            }
            else {
                gva.t0();
            }
            final avd avd = new avd((byte)6);
            if (gva.S) {
                gva.b((zta)new f0l((Object)avd, (byte)4), (Object)lqo.a);
            }
            k8e.P((zta)new rg6((byte)19), gva, dyd);
            ye6.h((Object)dyd, (Object)gva, (Object)48);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new bc3(ye6, n, (byte)9);
        }
    }
    
    public static final void g(igf v, final gva gva, final int n) {
        gva.i0(439919300);
        final int n2 = n | 0x6;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            final cy4 a = qy4.a;
            final long x = qy4.a(gva).x;
            v = (igf)fgf.v;
            c5q.f(0.0f, 48, 0, x, gva, omo.V(v, 16.0f, 8.0f));
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new k78(v, n, (byte)2);
        }
    }
    
    public static final Object h(final cgr cgr, final h07 h07) {
        if (!cgr.j()) {
            final l13 l13 = new l13(1, ljq.K(h07));
            l13.r();
            cgr.b((Executor)bfq.y, (h8g)new xwc(l13));
            return l13.p();
        }
        final Exception h8 = cgr.h();
        if (h8 != null) {
            throw h8;
        }
        if (!cgr.d) {
            return cgr.i();
        }
        final StringBuilder sb = new StringBuilder("Task ");
        sb.append((Object)cgr);
        sb.append(" was cancelled normally.");
        throw new CancellationException(sb.toString());
    }
    
    public static Object i(final Class clazz, final InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return clazz.cast(Proxy.newProxyInstance(yi2.class.getClassLoader(), new Class[] { clazz }, invocationHandler));
    }
    
    public static final void j(final jqc jqc, final KSerializer kSerializer, final KSerializer kSerializer2, final String s) {
        final SerialDescriptor descriptor = kSerializer2.getDescriptor();
        H(jqc, descriptor);
        if (o50.q(descriptor).contains((Object)s)) {
            final String a = kSerializer.getDescriptor().a();
            final String a2 = kSerializer2.getDescriptor().a();
            String n;
            if (jqc.a.k == 2 && mlc.q(a, a2)) {
                n = "in ALL_JSON_OBJECTS class discriminator mode";
            }
            else {
                n = smk.n('\'', "as base class '", a);
            }
            throw new JsonEncodingException(oz1.p(oz1.t("Class '", a2, "' cannot be serialized ", n, " because it has property name that conflicts with JSON class discriminator '"), s, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }
    
    public static final void k(final o50 o50) {
        if (o50 instanceof izk) {
            en9.q("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            return;
        }
        if (o50 instanceof foh) {
            en9.q("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            return;
        }
        if (!(o50 instanceof mfh)) {
            return;
        }
        en9.q("Actual serializer for polymorphic cannot be polymorphic itself");
    }
    
    public static final String l(final jqc jqc, final SerialDescriptor serialDescriptor) {
        for (final Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof yqc) {
                return ((yqc)annotation).discriminator();
            }
        }
        return jqc.a.h;
    }
    
    public static void n(final y80 y80, final BlurMaskFilter maskFilter, int n) {
        final long b = j86.b;
        if ((n & 0x8) != 0x0) {
            n = 0;
        }
        else {
            n = 1;
        }
        y80.f(b);
        y80.e(3);
        y80.n(n);
        y80.a.setMaskFilter((MaskFilter)maskFilter);
    }
    
    public static final double o(final double n, final pz8 pz8, final pz8 pz9) {
        final TimeUnit v = pz9.v;
        final TimeUnit v2 = pz8.v;
        final long convert = v.convert(1L, v2);
        if (convert > 0L) {
            return n * convert;
        }
        return n / v2.convert(1L, v);
    }
    
    public static final long p(long n, final pz8 pz8) {
        final int ordinal = ((Enum)pz8).ordinal();
        long n2;
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            uy8.g((Object)pz8, "Wrong unit for millisMultiplier: ");
                            return 0L;
                        }
                        n2 = 86400000L;
                    }
                    else {
                        n2 = 3600000L;
                    }
                }
                else {
                    n2 = 60000L;
                }
            }
            else {
                n2 = 1000L;
            }
        }
        else {
            n2 = 1L;
        }
        if (n == 0L) {
            return 0L;
        }
        if (n == 1L) {
            if (n2 <= 4611686018427387903L) {
                return n2;
            }
        }
        else if (n2 == 1L) {
            if (n <= 4611686018427387903L) {
                return n;
            }
        }
        else {
            final int n3 = 128 - Long.numberOfLeadingZeros(n) - Long.numberOfLeadingZeros(n2);
            if (n3 < 63) {
                return n * n2;
            }
            if (n3 <= 63) {
                n *= n2;
                if (n <= 4611686018427387903L) {
                    return n;
                }
            }
        }
        return 4611686018427387903L;
    }
    
    public static dg0 q(final dg0 dg0, float floatValue, float a, final int n) {
        if ((n & 0x1) != 0x0) {
            floatValue = ((Number)dg0.w.getValue()).floatValue();
        }
        if ((n & 0x2) != 0x0) {
            a = ((eg0)dg0.x).a;
        }
        return new dg0(dg0.v, floatValue, new eg0(a), dg0.y, dg0.z, dg0.A);
    }
    
    public static final ija r(final ija ija, final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 < 0) {
            en9.s("Debounce timeout should not be negative");
            return null;
        }
        if (n2 == 0) {
            return ija;
        }
        return (ija)s(ija, (lta)new bm2((byte)2, n));
    }
    
    public static final un0 s(final ija ija, final lta lta) {
        return new un0((Object)new pja(lta, ija, (f07)null), (byte)2);
    }
    
    public static final void t(final t2k t2k, String d1) {
        d1 = (String)t2k.d1(d1);
        try {
            ((b3k)d1).Z0();
            r9n.m((AutoCloseable)d1, (Throwable)null);
        }
        finally {
            try {}
            finally {
                r9n.m((AutoCloseable)d1, (Throwable)t2k);
            }
        }
    }
    
    public static ob u(final zrc zrc) {
        Label_0110: {
            Label_0101: {
                Label_0092: {
                    LinkedHashMap linkedHashMap;
                    try {
                        linkedHashMap = new LinkedHashMap();
                        final Iterator iterator = ((hgd)zrc.v.entrySet()).iterator();
                        while (((jgd)iterator).hasNext()) {
                            final kgd a = ((jgd)iterator).a();
                            final Object key = ((Map$Entry)a).getKey();
                            key.getClass();
                            ((Map)linkedHashMap).put(key, ((Map$Entry)a).getValue());
                        }
                    }
                    catch (final NullPointerException ex) {
                        break Label_0092;
                    }
                    catch (final NumberFormatException ex2) {
                        break Label_0101;
                    }
                    catch (final IllegalStateException ex3) {
                        break Label_0110;
                    }
                    return new ob(linkedHashMap);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Context", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Context", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Context", (Throwable)ex3);
        return null;
    }
    
    public static omj v(final zrc zrc) {
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
                        if (!iw0.G0((Object[])omj.f, ((Map$Entry)a).getKey())) {
                            final Object key = ((Map$Entry)a).getKey();
                            key.getClass();
                            ((Map)linkedHashMap).put(key, ((Map$Entry)a).getValue());
                        }
                    }
                    return new omj(i, j, k, l, (Map)linkedHashMap);
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
    
    public static jcp w(final zrc zrc) {
        Label_0781: {
            Label_0772: {
                Label_0763: {
                    long f = 0L;
                    nap o = null;
                    String i = null;
                    Label_0066: {
                        try {
                            f = zrc.o("date").f();
                            o = ri2.O(zrc.o("application").e());
                            final irc o2 = zrc.o("service");
                            if (o2 != null) {
                                i = o2.i();
                                break Label_0066;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0763;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0772;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0781;
                        }
                        i = null;
                    }
                    final irc o3 = zrc.o("version");
                    String j;
                    if (o3 != null) {
                        j = o3.i();
                    }
                    else {
                        j = null;
                    }
                    final irc o4 = zrc.o("build_version");
                    String k;
                    if (o4 != null) {
                        k = o4.i();
                    }
                    else {
                        k = null;
                    }
                    final irc o5 = zrc.o("build_id");
                    String l;
                    if (o5 != null) {
                        l = o5.i();
                    }
                    else {
                        l = null;
                    }
                    final irc o6 = zrc.o("ddtags");
                    String m;
                    if (o6 != null) {
                        m = o6.i();
                    }
                    else {
                        m = null;
                    }
                    final fcp s = k8e.s(zrc.o("session").e());
                    final irc o7 = zrc.o("source");
                    int n = 0;
                    int n3 = 0;
                    hcp a = null;
                    ecp g = null;
                    Label_0333: {
                        Label_0274: {
                            if (o7 == null) {
                                break Label_0274;
                            }
                            final String i2 = o7.i();
                            if (i2 == null) {
                                break Label_0274;
                            }
                            final int[] f2 = ge9.F(11);
                            try {
                                while (true) {
                                    while (n < f2.length) {
                                        final int n2 = f2[n];
                                        if (gcp.a(n2).equals(i2)) {
                                            n3 = n2;
                                            a = tsf.A(zrc.o("view").e());
                                            final irc o8 = zrc.o("usr");
                                            if (o8 != null) {
                                                g = mlc.G(o8.e());
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
                                break Label_0763;
                            }
                            catch (final NumberFormatException ex2) {
                                break Label_0772;
                            }
                            catch (final IllegalStateException ex3) {
                                break Label_0781;
                            }
                        }
                        g = null;
                    }
                    final irc o9 = zrc.o("account");
                    lap r;
                    if (o9 != null) {
                        r = yar.r(o9.e());
                    }
                    else {
                        r = null;
                    }
                    final irc o10 = zrc.o("connectivity");
                    rap y;
                    if (o10 != null) {
                        y = zn2.y(o10.e());
                    }
                    else {
                        y = null;
                    }
                    final irc o11 = zrc.o("display");
                    bbp h;
                    if (o11 != null) {
                        h = ibr.h(o11.e());
                    }
                    else {
                        h = null;
                    }
                    final irc o12 = zrc.o("synthetics");
                    dcp h2;
                    if (o12 != null) {
                        h2 = mcr.h(o12.e());
                    }
                    else {
                        h2 = null;
                    }
                    final irc o13 = zrc.o("ci_test");
                    pap g2;
                    if (o13 != null) {
                        g2 = cbr.g(o13.e());
                    }
                    else {
                        g2 = null;
                    }
                    final irc o14 = zrc.o("os");
                    qbp j2;
                    if (o14 != null) {
                        j2 = t08.J(o14.e());
                    }
                    else {
                        j2 = null;
                    }
                    final irc o15 = zrc.o("device");
                    abp w;
                    if (o15 != null) {
                        w = qt7.w(o15.e());
                    }
                    else {
                        w = null;
                    }
                    final xap e = vt4.E(zrc.o("_dd").e());
                    final irc o16 = zrc.o("context");
                    uap i3;
                    if (o16 != null) {
                        i3 = ao2.I(o16.e());
                    }
                    else {
                        i3 = null;
                    }
                    final irc o17 = zrc.o("container");
                    sap f3;
                    if (o17 != null) {
                        f3 = dbr.f(o17.e());
                    }
                    else {
                        f3 = null;
                    }
                    final irc o18 = zrc.o("feature_flags");
                    uap i4;
                    if (o18 != null) {
                        i4 = ao2.I(o18.e());
                    }
                    else {
                        i4 = null;
                    }
                    final irc o19 = zrc.o("privacy");
                    wbp h3;
                    if (o19 != null) {
                        h3 = dcr.h(o19.e());
                    }
                    else {
                        h3 = null;
                    }
                    if (mlc.q(zrc.o("type").i(), "view")) {
                        return new jcp(f, o, i, j, k, l, m, s, n3, a, g, r, y, h, h2, g2, j2, w, e, i3, f3, i4, h3);
                    }
                    throw new IllegalStateException("Check failed.");
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ViewEvent", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ViewEvent", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ViewEvent", (Throwable)ex3);
        return null;
    }
    
    public static final opk x(final c34 c34) {
        final int s = rua.s(c34);
        if (s == 0) {
            return (opk)new ipk(((b34)c34).a.a);
        }
        if (s == 1) {
            return (opk)new npk(((d34)c34).d().a);
        }
        en9.r();
        return null;
    }
    
    public static final int y(final SerialDescriptor serialDescriptor, final jqc jqc, final String s) {
        H(jqc, serialDescriptor);
        final int e = serialDescriptor.e(s);
        if (e == -3) {
            if (jqc.a.j) {
                final jy7 c = jqc.c;
                final nob nob = new nob((Object)serialDescriptor, (Object)jqc, (byte)4);
                final ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)c.w;
                final Map map = (Map)concurrentHashMap.get((Object)serialDescriptor);
                final def c2 = yi2.c;
                final Map map2 = null;
                Object value;
                if (map != null) {
                    value = map.get((Object)c2);
                }
                else {
                    value = null;
                }
                if (value == null) {
                    value = map2;
                }
                if (value == null) {
                    final Object a = nob.a();
                    Object value2;
                    if ((value2 = concurrentHashMap.get((Object)serialDescriptor)) == null) {
                        value2 = new ConcurrentHashMap(2);
                        concurrentHashMap.put((Object)serialDescriptor, value2);
                    }
                    ((Map)value2).put((Object)c2, a);
                    value = a;
                }
                final Integer n = (Integer)((Map)value).get((Object)s);
                if (n != null) {
                    return n;
                }
                return -3;
            }
        }
        return e;
    }
    
    public static final int z(final SerialDescriptor serialDescriptor, final jqc jqc, final String s, final String s2) {
        final int y = y(serialDescriptor, jqc, s);
        if (y != -3) {
            return y;
        }
        final String a = serialDescriptor.a();
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" does not contain element with name '");
        sb.append(s);
        sb.append('\'');
        sb.append(s2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public abstract List m(final String p0, final List p1);
}
