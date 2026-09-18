import java.util.Map$Entry;
import java.lang.reflect.AccessibleObject;
import com.google.android.gms.common.internal.a;
import android.os.Looper;
import android.content.Context;
import android.os.Build$VERSION;
import android.text.StaticLayout$Builder;
import android.text.StaticLayout;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.LinkedHashSet;
import java.util.Locale;
import android.content.res.Resources;
import android.content.SharedPreferences;
import kotlinx.serialization.descriptors.SerialDescriptor;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.HashMap;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlinx.serialization.KSerializer;
import java.util.Iterator;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashMap;

public abstract class lq6
{
    public static final vf0 a;
    public static final i6p b;
    public static final i6p c;
    public static final i6p d;
    public static final i6p e;
    
    public static ygd A() {
        return new ygd(10);
    }
    
    public static final r2k C(final Class clazz, final String s, final m7n m7n, final ClassLoader classLoader) {
        int i = 0;
        jpj jpj = null;
        try {
            Class.forName(clazz.getName().concat("$Builder"), false, clazz.getClassLoader()).getClass();
        }
        finally {
            final Throwable t;
            jpj = new jpj(t);
        }
        Object o = jpj;
        if (jpj instanceof jpj) {
            o = null;
        }
        Class<wwc> clazz2;
        if ((clazz2 = (Class)o) == null) {
            clazz2 = wwc.class;
        }
        final nob nob = new nob((Object)clazz2, (Object)clazz, (byte)26);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Field[] declaredFields = clazz.getDeclaredFields();
        declaredFields.getClass();
        while (i < declaredFields.length) {
            final Field field = declaredFields[i];
            final h3q h3q = (h3q)field.getAnnotation((Class)h3q.class);
            if (h3q != null) {
                ((Map)linkedHashMap).put((Object)h3q.tag(), (Object)new q8a(h3q, clazz, field, (Class)clazz2, classLoader));
            }
            else if (mlc.q(field.getType(), obg.class)) {
                final Class declaringClass = field.getDeclaringClass();
                final String name = field.getName();
                name.getClass();
                final Field declaredField = declaringClass.getDeclaredField(ear.h(name));
                ((AccessibleObject)declaredField).setAccessible(true);
                final Object value = declaredField.get((Object)null);
                value.getClass();
                final Iterator iterator = ((Set)value).iterator();
                if (iterator.hasNext()) {
                    iterator.next().getClass();
                    fvd.c();
                    return null;
                }
            }
            ++i;
        }
        final us4 a = v4j.a(clazz);
        final Map unmodifiableMap = Collections.unmodifiableMap((Map)linkedHashMap);
        unmodifiableMap.getClass();
        return new r2k(new uy7(a, nob, unmodifiableMap, s, m7n));
    }
    
    public static final Object E(final jqc jqc, final KSerializer kSerializer, mjc mjc) {
        mjc = (mjc)new qsi(mjc, ((jr2)zh3.c).d(16384), jqc.a);
        try {
            final Object v = new exm(jqc, m9q.x, (g1)mjc, kSerializer.getDescriptor(), (dxm)null).v(kSerializer);
            ((g1)mjc).v();
            return v;
        }
        finally {
            ((qsi)mjc).K();
        }
    }
    
    public static final igf F(final igf igf, final lta lta) {
        return igf.E(new az8(lta));
    }
    
    public static final void G(final jqc jqc, final ojc ojc, final KSerializer kSerializer, final Object o) {
        final prc[] array = new prc[((j0)m9q.C).a()];
        Object o2;
        if (jqc.a.e) {
            o2 = new il6(ojc, jqc);
        }
        else {
            o2 = new ci6(ojc);
        }
        new fxm((ci6)o2, jqc, m9q.x, array).K(o, kSerializer);
    }
    
    public static final boolean H(final char c, final char c2, final boolean b) {
        if (c == c2) {
            return true;
        }
        if (!b) {
            return false;
        }
        final char upperCase = Character.toUpperCase(c);
        final char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
    
    public static boolean I(final Type type, final Type obj) {
        if (type == obj) {
            return true;
        }
        if (type instanceof Class) {
            if (obj instanceof GenericArrayType) {
                return I((Type)((Class)type).getComponentType(), ((GenericArrayType)obj).getGenericComponentType());
            }
            return type.equals(obj);
        }
        else if (type instanceof ParameterizedType) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            final ParameterizedType parameterizedType2 = (ParameterizedType)obj;
            Type[] array;
            if (parameterizedType instanceof u4p) {
                array = ((u4p)parameterizedType).x;
            }
            else {
                array = parameterizedType.getActualTypeArguments();
            }
            Type[] array2;
            if (parameterizedType2 instanceof u4p) {
                array2 = ((u4p)parameterizedType2).x;
            }
            else {
                array2 = parameterizedType2.getActualTypeArguments();
            }
            return I(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals((Object[])array, (Object[])array2);
        }
        else if (type instanceof GenericArrayType) {
            if (obj instanceof Class) {
                return I((Type)((Class)obj).getComponentType(), ((GenericArrayType)type).getGenericComponentType());
            }
            return obj instanceof GenericArrayType && I(((GenericArrayType)type).getGenericComponentType(), ((GenericArrayType)obj).getGenericComponentType());
        }
        else {
            if (!(type instanceof WildcardType)) {
                if (type instanceof TypeVariable) {
                    if (!(obj instanceof TypeVariable)) {
                        return false;
                    }
                    final TypeVariable typeVariable = (TypeVariable)type;
                    final TypeVariable typeVariable2 = (TypeVariable)obj;
                    if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals((Object)typeVariable2.getName())) {
                        return true;
                    }
                }
                return false;
            }
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            final WildcardType wildcardType = (WildcardType)type;
            final WildcardType wildcardType2 = (WildcardType)obj;
            return Arrays.equals((Object[])wildcardType.getUpperBounds(), (Object[])wildcardType2.getUpperBounds()) && Arrays.equals((Object[])wildcardType.getLowerBounds(), (Object[])wildcardType2.getLowerBounds());
        }
    }
    
    public static xzb J(final long n, final long n2, long h, long h2, final gva gva, final int n3, final int n4) {
        if ((n4 & 0x4) != 0x0) {
            h = j86.h;
        }
        if ((n4 & 0x8) != 0x0) {
            h2 = j86.h;
        }
        final r86 a = ((e8e)gva.j((sei)h8e.a)).a;
        xzb f0 = a.f0;
        if (f0 == null) {
            f0 = new xzb(s86.c(a, 25), s86.c(a, 9), j86.b(0.1f, s86.c(a, 17)), j86.b(0.38f, s86.c(a, 17)));
            a.f0 = f0;
        }
        return f0.a(n, n2, h, h2);
    }
    
    public static t7k K(final jn6 jn6, final yb7 yb7) {
        if (jn6 == null) {
            return (t7k)new qdr((byte)23);
        }
        final String r = jn6.r;
        final HashMap q0 = jn6.q0;
        final HashMap r2 = jn6.r0;
        final String s0 = jn6.s0;
        zbo zbo = zbo.b;
        if (s0 != null) {
            zbo = zbo.a(s0);
        }
        final boolean b = q0 != null && !q0.isEmpty();
        final boolean b2 = r2 != null && !r2.isEmpty();
        final boolean empty = zbo.a.isEmpty();
        final boolean c = jn6.E1.c("v2.compatibility.enabled", false, new String[0]);
        Double n;
        if (yb7 != null) {
            n = yb7.j;
        }
        else {
            n = jn6.t0;
        }
        Label_0181: {
            if (c) {
                if (!b && !b2 && empty) {
                    if (n == null) {
                        break Label_0181;
                    }
                }
                try {
                    return (t7k)vzj.c(q0, r2, zbo, n, jn6.u0);
                }
                catch (final IllegalArgumentException ex) {
                    return (t7k)new qdr((byte)23);
                }
            }
        }
        if (n != null) {
            final Object o = new Object();
            ((moi)o).v = new e3a((double)n);
            return (t7k)o;
        }
        if (!jn6.q) {
            return (t7k)new qdr((byte)23);
        }
        if ("keep".equalsIgnoreCase(r)) {
            return (t7k)new rpa(1);
        }
        if ("drop".equalsIgnoreCase(r)) {
            return (t7k)new rpa(0);
        }
        return (t7k)new moi();
    }
    
    public static gc L(final zrc zrc) {
        Label_0233: {
            Label_0224: {
                Label_0215: {
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
                            break Label_0215;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0224;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0233;
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
                        if (!iw0.G0((Object[])gc.f, ((Map$Entry)a).getKey())) {
                            final Object key = ((Map$Entry)a).getKey();
                            key.getClass();
                            ((Map)linkedHashMap).put(key, ((Map$Entry)a).getValue());
                        }
                    }
                    return new gc(i, j, k, l, (Map)linkedHashMap);
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
    
    public static zap M(final zrc zrc) {
        Label_0169: {
            Label_0160: {
                Label_0151: {
                    ubp c = null;
                    Label_0051: {
                        try {
                            final irc o = zrc.o("plan");
                            if (o != null) {
                                final String i = o.i();
                                if (i != null) {
                                    c = xbr.c(i);
                                    break Label_0051;
                                }
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0151;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0160;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0169;
                        }
                        c = null;
                    }
                    final irc o2 = zrc.o("session_precondition");
                    final int n = 0;
                    final int n2 = 0;
                    int n3 = n;
                    if (o2 != null) {
                        final String j = o2.i();
                        n3 = n;
                        if (j != null) {
                            final int[] f = ge9.F(7);
                            for (int length = f.length, k = n2; k < length; ++k) {
                                final int n4 = f[k];
                                if (smk.g(n4).equals(j)) {
                                    n3 = n4;
                                    return new zap(c, n3);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    return new zap(c, n3);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type DdSession", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type DdSession", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type DdSession", (Throwable)ex3);
        return null;
    }
    
    public static final k2j N(final n8h n8h, int l0, final leo leo, final omn omn, final boolean b, final int n) {
        k2j k2j;
        if (omn != null) {
            k2j = omn.c(leo.b.G(l0));
        }
        else {
            k2j = k2j.e;
        }
        l0 = ((xc8)n8h).L0(2.0f);
        final float a = k2j.a;
        float n2;
        if (b) {
            n2 = n - a - l0;
        }
        else {
            n2 = a;
        }
        float n3;
        if (b) {
            n3 = n - a;
        }
        else {
            n3 = l0 + a;
        }
        return k2j.b(k2j, n2, n3, 0.0f, 10);
    }
    
    public static xgc O(final Collection collection) {
        return (xgc)new vgc(0, collection.size() - 1, 1);
    }
    
    public static int P(final List list) {
        return list.size() - 1;
    }
    
    public static Class Q(final Type type) {
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            return (Class)((ParameterizedType)type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(Q(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return Q(((WildcardType)type).getUpperBounds()[0]);
        }
        String name;
        if (type == null) {
            name = "null";
        }
        else {
            name = type.getClass().getName();
        }
        oyl.j("Expected a Class, ParameterizedType, or GenericArrayType, but <", (Object)type, (Object)"> is of type ", (Object)name);
        return null;
    }
    
    public static xzb S(long h, long a, long h2, long b, final gva gva, final int n) {
        if ((n & 0x1) != 0x0) {
            h = j86.h;
        }
        if ((n & 0x2) != 0x0) {
            a = ((j86)gva.j((sei)dx6.a)).a;
        }
        if ((n & 0x4) != 0x0) {
            h2 = j86.h;
        }
        if ((n & 0x8) != 0x0) {
            b = j86.b(0.38f, a);
        }
        final r86 a2 = ((e8e)gva.j((sei)h8e.a)).a;
        final long a3 = ((j86)gva.j((sei)dx6.a)).a;
        xzb e0 = a2.e0;
        if (e0 == null) {
            final long g = j86.g;
            e0 = (a2.e0 = new xzb(g, a3, g, j86.b(0.38f, a3)));
        }
        return e0.a(h, a, h2, b);
    }
    
    public static final igf T(final igf igf) {
        return igf.E((igf)new i8n((lta)lq6.d));
    }
    
    public static final boolean U(final float[] array) {
        return array.length >= 16 && (array[0] == 1.0f && array[1] == 0.0f && array[2] == 0.0f && array[3] == 0.0f && array[4] == 0.0f && array[5] == 1.0f && array[6] == 0.0f && array[7] == 0.0f && array[8] == 0.0f && array[9] == 0.0f && array[10] == 1.0f && array[11] == 0.0f && array[12] == 0.0f && array[13] == 0.0f && array[14] == 0.0f && array[15] == 1.0f);
    }
    
    public static boolean V(final char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
    
    public static final igf W(final igf igf, final bua bua) {
        return igf.E((igf)new rzc(bua));
    }
    
    public static List X(final Object o) {
        final List singletonList = Collections.singletonList(o);
        singletonList.getClass();
        return singletonList;
    }
    
    public static List Y(final Object... array) {
        if (array.length > 0) {
            return iw0.E0(array);
        }
        return (List)r89.v;
    }
    
    public static List Z(final Object o) {
        if (o != null) {
            return X(o);
        }
        return (List)r89.v;
    }
    
    public static final void a(final itl itl, final boolean b, final gva gva, final int n) {
        gva.i0(-1503239546);
        int n2;
        if (gva.f((Object)itl)) {
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
        final int n4 = n2 | n | n3;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            ljq.h(b ^ true, null, pc9.g(ri2.I0(700, 0, null, 6), 2), pc9.h(ri2.I0(700, 0, null, 6), 2), null, (bua)uuj.t0(-936922274, (aua)new tf0((Object)itl, (byte)0), gva), gva, 200064, 18);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new uf0((Object)itl, b, n, (byte)0);
        }
    }
    
    public static ArrayList a0(final Object... array) {
        if (array.length == 0) {
            return new ArrayList();
        }
        return new ArrayList((Collection)new kv0(array, true));
    }
    
    public static final void b(final vqk vqk, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-954926513);
        int n2;
        if (gva.h((Object)vqk)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
            tsf.f(vqk, ye6, gva, n3 & 0x7E);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new gb6(vqk, ye6, n, (byte)1);
        }
    }
    
    public static final igf b0(final igf igf) {
        return igf.E((igf)new i8n((lta)lq6.e));
    }
    
    public static final void c(final dkn dkn, final ye6 ye6, final gva gva, final int n) {
        gva.i0(2080741862);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)dkn)) {
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
            if (gva.h((Object)ye6)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            tsf.g(dkn, ye6, gva, n4 & 0x7E);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new eb6(dkn, ye6, n, (byte)1);
        }
    }
    
    public static u4p c0(final Class clazz, final Type... array) {
        if (array.length != 0) {
            return new u4p((Type)null, (Type)clazz, array);
        }
        uy8.l((Object)clazz, "Missing type arguments for ");
        return null;
    }
    
    public static final void d(final ykn ykn, final boolean b, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-579239002);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)ykn)) {
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
            tsf.h(ykn, b, ye6, gva, n6 & 0x3FE);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new fb6(ykn, b, ye6, n, (byte)1);
        }
    }
    
    public static final List d0(final List list) {
        final int size = list.size();
        if (size == 0) {
            return (List)r89.v;
        }
        if (size != 1) {
            return list;
        }
        return X(list.get(0));
    }
    
    public static final void e(final itl itl, final de0 de0, igf v, final gva gva, final int n) {
        gva.i0(1552113683);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)itl)) {
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
            boolean b;
            if ((n & 0x40) == 0x0) {
                b = gva.f((Object)de0);
            }
            else {
                b = gva.h((Object)de0);
            }
            int n5;
            if (b) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        final int n6 = n4 | 0x180;
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final FillElement c = androidx.compose.foundation.layout.b.c;
            final moe c2 = rj2.c((gx)wab.B, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, (igf)c);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c2);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b2);
            v = (igf)fgf.v;
            ljq.l(h0(androidx.compose.foundation.layout.b.u(v, 182.0f), itl, de0, gva), Float.NaN, gva, 48, 0);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new wf0(n, (Object)itl, (Object)de0, (Object)v, (byte)0);
        }
    }
    
    public static final void e0(final int n, final int n2) {
        if (n2 < 0) {
            en9.s(oz1.n("fromIndex (0) is greater than toIndex (", n2, ")."));
            return;
        }
        if (n2 <= n) {
            return;
        }
        en9.j(hia.g(n2, n, "toIndex (", ") is greater than size (", ")."));
    }
    
    public static float f(final float[] array) {
        if (array.length < 6) {
            return 0.0f;
        }
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[2];
        final float n4 = array[3];
        final float n5 = array[4];
        final float n6 = array[5];
        final float n7 = (n3 * n6 + (n2 * n5 + n * n4) - n4 * n5 - n2 * n3 - n * n6) * 0.5f;
        if (n7 < 0.0f) {
            return -n7;
        }
        return n7;
    }
    
    public static final r8k f0(final gva gva) {
        gva.g0(1967007413);
        Object r;
        if ((r = gva.R()) == bi6.a) {
            r = new s8k((byte)0);
            gva.q0(r);
        }
        final r8k r8k = (r8k)mlc.b0(new Object[0], (m9k)r8k.z, (jta)r, gva, 384);
        r8k.x = (u8k)gva.j((sei)w8k.a);
        gva.q(false);
        return r8k;
    }
    
    public static ArrayList g(final Object... array) {
        if (array.length == 0) {
            return new ArrayList();
        }
        return new ArrayList((Collection)new kv0(array, true));
    }
    
    public static final igf g0(final igf igf) {
        return igf.E((igf)new i8n((lta)lq6.b));
    }
    
    public static final ssi h(final bsl bsl) {
        return new ssi(bsl, (wmm)null);
    }
    
    public static final igf h0(igf c, final itl itl, final af0 af0, final gva gva) {
        gva.g0(757300211);
        c = itl.c(itl, c, itl.b("login-claude-logo", gva), af0, 120);
        gva.q(false);
        return c;
    }
    
    public static final usi i(final apm apm) {
        return new usi(apm, (wmm)null);
    }
    
    public static final usi i0(final ija ija, final oc7 oc7, final cul cul, final Object o) {
        final utl x = x(ija);
        final apm a = bpm.a(o);
        final hc7 hc7 = (hc7)x.d;
        final ija ija2 = (ija)x.c;
        int n;
        if (cul.equals(bul.a)) {
            n = 1;
        }
        else {
            n = 4;
        }
        return new usi(a, rhc.F(oc7, hc7, n, new l10(cul, ija2, a, o, null, (byte)5)));
    }
    
    public static int j(final ArrayList list, final Comparable comparable) {
        final int size = list.size();
        e0(list.size(), size);
        int n = size - 1;
        int i = 0;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final int y = ach.y((Comparable)list.get(n2), comparable);
            if (y < 0) {
                i = n2 + 1;
            }
            else {
                if (y <= 0) {
                    return n2;
                }
                n = n2 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final igf j0(final igf igf) {
        return igf.E((igf)new i8n((lta)lq6.c));
    }
    
    public static final m9q k0(final jqc jqc, SerialDescriptor q) {
        final o50 b = q.b();
        if (b instanceof mfh) {
            return m9q.A;
        }
        if (!mlc.q(b, xym.l)) {
            if (!mlc.q(b, xym.m)) {
                return m9q.x;
            }
            q = q(q.j(0), jqc.b);
            final o50 b2 = q.b();
            if (b2 instanceof foh || mlc.q(b2, izk.k)) {
                return m9q.z;
            }
            if (!jqc.a.d) {
                throw zn2.c(q);
            }
        }
        return m9q.y;
    }
    
    public static final vhk l(final SharedPreferences sharedPreferences, final String s) {
        return new vhk((lta)new qsl(sharedPreferences, s, (byte)0), (Object)sharedPreferences.getBoolean(s, false));
    }
    
    public static final void l0(final egn egn, final Resources resources, final ogn ogn, final boolean b, final lta lta) {
        if (b) {
            unh.f(egn, ogn.b(), resources.getString(ogn.e()), ogn.a(), lta);
        }
    }
    
    public static final Object m(final t98 t98, final jta jta, final h07 h07) {
        if (t98.z0().I) {
            if (!t98.z0().I) {
                gac.c("visitAncestors called on an unattached node");
            }
            Object z = t98.z0().z;
            LayoutNode layoutNode = soh.L(t98);
            Object g = null;
        Label_0372:
            while (true) {
                g = null;
                if (layoutNode == null) {
                    break;
                }
                if ((((hgf)layoutNode.Z.B).y & 0x80000) != 0x0) {
                    for (Object z2 = z; z2 != null; z2 = ((hgf)z2).z) {
                        if ((((hgf)z2).x & 0x80000) != 0x0) {
                            g = z2;
                            inf inf = null;
                            while (g != null) {
                                if (g instanceof nl2) {
                                    break Label_0372;
                                }
                                inf inf2 = inf;
                                if ((((hgf)g).x & 0x80000) != 0x0) {
                                    inf2 = inf;
                                    if (g instanceof v98) {
                                        hgf hgf = ((v98)g).K;
                                        int n = 0;
                                        while (hgf != null) {
                                            v98 v98 = (v98)g;
                                            inf inf3 = inf;
                                            int n2 = n;
                                            if ((hgf.x & 0x80000) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
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
            final nl2 nl2 = (nl2)g;
            if (nl2 != null) {
                final yxf k = soh.K(t98);
                final Object h8 = nl2.H(k, new jd0((Object)jta, (Object)k, (byte)10), h07);
                if (h8 == pc7.v) {
                    return h8;
                }
            }
        }
        return lqo.a;
    }
    
    public static void m0() {
        throw new ArithmeticException("Count overflow has happened.");
    }
    
    public static ygd n(final ygd ygd) {
        ygd.r();
        ygd.x = true;
        if (ygd.w > 0) {
            return ygd;
        }
        return ygd.y;
    }
    
    public static void n0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
    
    public static String o0(final char c, final Locale locale) {
        final String value = String.valueOf(c);
        value.getClass();
        final String upperCase = value.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() > 1) {
            if (c != '\u0149') {
                final char char1 = upperCase.charAt(0);
                final String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                final StringBuilder sb = new StringBuilder();
                sb.append(char1);
                sb.append(lowerCase);
                return sb.toString();
            }
        }
        else {
            final String value2 = String.valueOf(c);
            value2.getClass();
            final String upperCase2 = value2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c));
            }
        }
        return upperCase;
    }
    
    public static final SerialDescriptor q(final SerialDescriptor serialDescriptor, final vee vee) {
        SerialDescriptor q;
        if (mlc.q(serialDescriptor.b(), hzk.k)) {
            final rtc l = ao2.L(serialDescriptor);
            SerialDescriptor descriptor;
            final SerialDescriptor serialDescriptor2 = descriptor = null;
            if (l != null) {
                final KSerializer v = vee.v(l, (List)r89.v);
                descriptor = serialDescriptor2;
                if (v != null) {
                    descriptor = v.getDescriptor();
                }
            }
            q = serialDescriptor;
            if (descriptor != null) {
                final SerialDescriptor q2 = q(descriptor, vee);
                if (q2 != null) {
                    return q2;
                }
                q = serialDescriptor;
            }
        }
        else {
            q = serialDescriptor;
            if (serialDescriptor.h()) {
                q = q(serialDescriptor.j(0), vee);
            }
        }
        return q;
    }
    
    public static void r(final String s, final boolean b) {
        if (b) {
            return;
        }
        en9.s(s);
    }
    
    public static void s(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format(s, array));
    }
    
    public static void t(final Object o, final String s) {
        if (o != null) {
            return;
        }
        fvd.k(s);
    }
    
    public static void u(final int n) {
        if (2 <= n && n < 37) {
            return;
        }
        en9.n(hia.p(n, "radix ", " was not in valid range "), (Object)new vgc(2, 36, 1));
    }
    
    public static void v(final String s, final boolean b) {
        if (b) {
            return;
        }
        en9.q(s);
    }
    
    public static Type w(Type f) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            fvd.w();
            return null;
        }
        final Type type = f = y4p.f(f, (Class)Collection.class, y4p.c(f, (Class)Collection.class, (Class)Collection.class), new LinkedHashSet());
        if (type instanceof WildcardType) {
            f = ((WildcardType)type).getUpperBounds()[0];
        }
        if (f instanceof ParameterizedType) {
            return ((ParameterizedType)f).getActualTypeArguments()[0];
        }
        return (Type)Object.class;
    }
    
    public static final utl x(final ija ija) {
        xd3.c.getClass();
        int b = wd3.b;
        if (1 >= b) {
            b = 1;
        }
        --b;
        if (ija instanceof cf3) {
            final cf3 cf3 = (cf3)ija;
            final int x = cf3.x;
            final ija g = cf3.g();
            if (g != null) {
                final int w = cf3.w;
                if (w != -3 && w != -2 && w != 0) {
                    b = w;
                }
                else if (x != 1 || w == 0) {
                    b = 0;
                }
                return new utl(b, x, cf3.v, g);
            }
        }
        return new utl(b, 1, (hc7)o89.v, ija);
    }
    
    public static final boolean y(final k2j k2j, float b, final float n) {
        final float a = k2j.a;
        if (b <= k2j.c && a <= b) {
            b = k2j.b;
            if (n <= k2j.d && b <= n) {
                return true;
            }
        }
        return false;
    }
    
    public static StaticLayout z(final CharSequence charSequence, final TextPaint textPaint, int sdk_INT, final int n, final TextDirectionHeuristic textDirection, final Layout$Alignment alignment, final int maxLines, final TextUtils$TruncateAt ellipsize, final int ellipsizedWidth, final int justificationMode, final boolean includePad, final int breakStrategy, final int n2, final int n3, final int hyphenationFrequency) {
        if (n < 0) {
            hac.a("invalid start value");
        }
        final int length = charSequence.length();
        if (n < 0 || n > length) {
            hac.a("invalid end value");
        }
        if (maxLines < 0) {
            hac.a("invalid maxLines value");
        }
        if (sdk_INT < 0) {
            hac.a("invalid width value");
        }
        if (ellipsizedWidth < 0) {
            hac.a("invalid ellipsizedWidth value");
        }
        final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence, 0, n, textPaint, sdk_INT);
        obtain.setTextDirection(textDirection);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(maxLines);
        obtain.setEllipsize(ellipsize);
        obtain.setEllipsizedWidth(ellipsizedWidth);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(includePad);
        obtain.setBreakStrategy(breakStrategy);
        obtain.setHyphenationFrequency(hyphenationFrequency);
        obtain.setIndents((int[])null, (int[])null);
        obtain.setJustificationMode(justificationMode);
        sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            k4.k(obtain);
        }
        if (sdk_INT >= 33) {
            mo2.g(obtain, n2, n3);
        }
        if (sdk_INT >= 35) {
            k08.e(obtain);
        }
        return obtain.build();
    }
    
    public abstract String B();
    
    public lqo R(t2k d1, final Object o) {
        final lqo a = lqo.a;
        if (o == null) {
            return a;
        }
        d1 = (t2k)d1.d1(this.B());
        try {
            this.k((b3k)d1, o);
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
    
    public abstract void k(final b3k p0, final Object p1);
    
    public a o(final Context context, final Looper looper, final re0 re0, final Object o, final r3b r3b, final s3b s3b) {
        return this.p(context, looper, re0, o, (sdq)r3b, (sdq)s3b);
    }
    
    public a p(final Context context, final Looper looper, final re0 re0, final Object o, final sdq sdq, final sdq sdq2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
