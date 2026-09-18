import com.anthropic.claude.tool.model.ChartDisplayV0Output;
import com.anthropic.claude.tool.model.ChartDisplayV0OutputStatus;
import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.util.List;
import android.content.Context;
import javax.net.ssl.SSLSocket;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Map;
import java.util.Date;
import java.util.Map$Entry;
import java.util.LinkedHashMap;

public class awp implements rpj, q8m, ne6, h98, gv0, jv0, t45, gc7, i9c, vv7, tkf, sdp, hbh, gfi
{
    public static final rg6 A;
    public static final rg6 B;
    public static final mz5 C;
    public static final awp D;
    public static final awp E;
    public static final dpg F;
    public static final dpg G;
    public static final awp H;
    public static final awp I;
    public static final w2q J;
    public static final awp K;
    public static volatile awp L;
    public static final awp w;
    public static final lv4 x;
    public static final rg6 y;
    public static final rg6 z;
    public final byte v;
    
    public static cwp i(final String s) {
        final td9 o = cwp.O;
        o.getClass();
        final k1 k1 = new k1((Object)o, (byte)0);
        while (k1.hasNext()) {
            final Object next = k1.next();
            if (mlc.q(((Enum)next).name(), s)) {
                return (cwp)next;
            }
        }
        return null;
    }
    
    public static LinkedHashMap o(LinkedHashMap iterator, final rjc rjc) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        iterator = (LinkedHashMap)iterator.entrySet().iterator();
        while (((Iterator)iterator).hasNext()) {
            final Map$Entry map$Entry = (Map$Entry)((Iterator)iterator).next();
            try {
                ((Map)linkedHashMap).put(map$Entry.getKey(), (Object)t(map$Entry.getValue()));
            }
            catch (final Exception ex) {
                c5q.F(rjc, 5, lq6.Y(qjc.v, qjc.x), (jta)new ix7(map$Entry, (byte)2), (Throwable)ex, 48);
            }
        }
        return linkedHashMap;
    }
    
    public static irc t(final Object o) {
        final boolean q = mlc.q(o, eqi.c);
        final xrc v = xrc.v;
        if (!q) {
            if (o != null) {
                if (!o.equals(v)) {
                    if (o instanceof Boolean) {
                        return (irc)new dsc((Boolean)o);
                    }
                    if (o instanceof Integer) {
                        return (irc)new dsc((Number)o);
                    }
                    if (o instanceof Long) {
                        return (irc)new dsc((Number)o);
                    }
                    if (o instanceof Float) {
                        return (irc)new dsc((Number)o);
                    }
                    if (o instanceof Double) {
                        return (irc)new dsc((Number)o);
                    }
                    if (o instanceof String) {
                        return (irc)new dsc((String)o);
                    }
                    if (o instanceof Date) {
                        return (irc)new dsc((Number)((Date)o).getTime());
                    }
                    if (o instanceof qqc) {
                        return (irc)o;
                    }
                    if (o instanceof Iterable) {
                        final Iterable iterable = (Iterable)o;
                        final qqc qqc = new qqc();
                        final Iterator iterator = iterable.iterator();
                        while (iterator.hasNext()) {
                            qqc.j(t(iterator.next()));
                        }
                        return (irc)qqc;
                    }
                    if (o instanceof Map) {
                        final Map map = (Map)o;
                        final zrc zrc = new zrc();
                        for (final Map$Entry map$Entry : map.entrySet()) {
                            zrc.j(String.valueOf(map$Entry.getKey()), t(map$Entry.getValue()));
                        }
                        return (irc)zrc;
                    }
                    if (o instanceof zrc) {
                        return (irc)o;
                    }
                    if (o instanceof dsc) {
                        return (irc)o;
                    }
                    if (o instanceof JSONObject) {
                        final JSONObject jsonObject = (JSONObject)o;
                        final zrc zrc2 = new zrc();
                        final Iterator keys = jsonObject.keys();
                        keys.getClass();
                        while (keys.hasNext()) {
                            final String s = (String)keys.next();
                            zrc2.j(s, t(jsonObject.get(s)));
                        }
                        return (irc)zrc2;
                    }
                    if (o instanceof JSONArray) {
                        final JSONArray jsonArray = (JSONArray)o;
                        final qqc qqc2 = new qqc();
                        for (int length = jsonArray.length(), i = 0; i < length; ++i) {
                            qqc2.j(t(jsonArray.get(i)));
                        }
                        return (irc)qqc2;
                    }
                    return (irc)new dsc(o.toString());
                }
            }
        }
        return (irc)v;
    }
    
    @Override
    public boolean a(final SSLSocket sslSocket) {
        return rym.E0(sslSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }
    
    @Override
    public void b(final Context context) {
    }
    
    @Override
    public b9c c() {
        return (b9c)new y3();
    }
    
    @Override
    public float d() {
        return 0.0f;
    }
    
    @Override
    public l9m e(final SSLSocket sslSocket) {
        Object o;
        final Class<? extends SSLSocket> clazz = (Class<? extends SSLSocket>)(o = sslSocket.getClass());
        while (!((Class)o).getSimpleName().equals("OpenSSLSocketImpl")) {
            o = ((Class)o).getSuperclass();
            if (o != null) {
                continue;
            }
            final StringBuilder sb = new StringBuilder("No OpenSSLSocketImpl superclass of socket of type ");
            sb.append((Object)clazz);
            throw new AssertionError((Object)sb.toString());
        }
        return (l9m)new wa0((Class)o);
    }
    
    @Override
    public eyo f(final cx7 cx7, final List list, final byte[] array, final nz1 nz1) {
        return (eyo)cyo.d;
    }
    
    public String g(final int n, final Method method) {
        final StringBuilder sb = new StringBuilder("parameter #");
        sb.append(n + 1);
        return sb.toString();
    }
    
    @Override
    public Object get() {
        final eup eup = new eup((byte)27);
        final HashMap hashMap = new HashMap();
        final Set empty_SET = Collections.EMPTY_SET;
        if (empty_SET == null) {
            fvd.k("Null flags");
            return null;
        }
        hashMap.put((Object)voh.v, (Object)new ul1(30000L, 86400000L, empty_SET));
        if (empty_SET == null) {
            fvd.k("Null flags");
            return null;
        }
        hashMap.put((Object)voh.x, (Object)new ul1(1000L, 86400000L, empty_SET));
        if (empty_SET == null) {
            fvd.k("Null flags");
            return null;
        }
        final Set unmodifiableSet = Collections.unmodifiableSet((Set)new HashSet((Collection)Arrays.asList((Object[])new uck[] { uck.w })));
        if (unmodifiableSet == null) {
            fvd.k("Null flags");
            return null;
        }
        hashMap.put((Object)voh.w, (Object)new ul1(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() >= voh.values().length) {
            new HashMap();
            return new tl1((l55)eup, hashMap);
        }
        en9.q("Not all priorities have been configured");
        return null;
    }
    
    @Override
    public void h(final xc8 xc8, final int n, final int[] array, final qzc qzc, final int[] array2) {
        if (qzc == qzc.v) {
            t08.a0(n, array, array2, false);
            return;
        }
        t08.a0(n, array, array2, true);
    }
    
    public Object j(final Method method, final Class clazz, final Object o, final Object[] array) {
        throw new AssertionError();
    }
    
    @Override
    public Object k(final uy7 uy7) {
        final u25 u25 = (u25)uy7.d((Class)u25.class);
        return new o55((byte)0);
    }
    
    public boolean l(final Method method) {
        return false;
    }
    
    @Override
    public void m(final tjc tjc, final Context context) {
    }
    
    @Override
    public boolean n(final Object o, final Object o2) {
        return o == o2;
    }
    
    @Override
    public void r(final xc8 xc8, final int n, final int[] array, final int[] array2) {
        t08.a0(n, array, array2, false);
    }
    
    @Override
    public void s() {
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 11: {
                return "Arrangement#SpaceEvenly";
            }
            case 6: {
                return "ReferentialEqualityPolicy";
            }
        }
    }
    
    @Override
    public Object z(final Context context, final Object o, final String s, final x4o x4o) {
        final ChartDisplayV0Input chartDisplayV0Input = (ChartDisplayV0Input)o;
        if (chartDisplayV0Input.a.isEmpty()) {
            return sdr.j((Object)new ChartDisplayV0Output("Chart had no series to plot. Provide at least one series with data.", ChartDisplayV0OutputStatus.x));
        }
        if (s7r.p(chartDisplayV0Input)) {
            return sdr.j((Object)new ChartDisplayV0Output("Chart had no plottable data. Every series was empty or contained only non-finite (NaN/Infinity) numbers; provide non-empty, finite `values` (BAR/LINE) or `points` (LINE/SCATTER).", ChartDisplayV0OutputStatus.x));
        }
        return sdr.t((Object)new ChartDisplayV0Output((String)null, ChartDisplayV0OutputStatus.w));
    }
}
