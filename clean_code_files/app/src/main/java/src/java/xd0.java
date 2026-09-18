import java.util.List;
import java.util.AbstractMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import com.segment.analytics.kotlin.core.Settings;
import java.util.LinkedHashSet;

public final class xd0 extends qxc implements lta
{
    public final byte w;
    public final Object x;
    public final Object y;
    public final Object z;
    
    @Override
    public final Object b(Object value) {
        final byte w = this.w;
        int n = 1;
        switch (w) {
            default: {
                final n8h n8h = (n8h)value;
                final nzc b = n8h.b();
                if (b != null) {
                    final boolean r0 = ((flc)this.x).r0();
                    final itl j = ((ptl)this.y).J;
                    if (!r0) {
                        j.A = b;
                    }
                    else {
                        j.B = b;
                    }
                }
                n8h.f((o8h)this.z, 0, 0, 0.0f);
                return lqo.a;
            }
            case 3: {
                final deh deh = (deh)value;
                if (((s7n)this.x).d.contains((Object)deh.hashCode())) {
                    n = 2;
                }
                else {
                    ((Set)this.y).add((Object)deh.hashCode());
                }
                deh.c((Settings)this.z, n);
                return lqo.a;
            }
            case 2: {
                final int ordinal = ((ec9)value).ordinal();
                float n2 = 1.0f;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            en9.r();
                            return null;
                        }
                        final w3a a = ((ev9)this.y).a.a;
                        if (a != null) {
                            n2 = a.a;
                        }
                        else {
                            n2 = ((hsl)this.z).g;
                        }
                    }
                }
                else {
                    final w3a a2 = ((id9)this.x).a.a;
                    if (a2 != null) {
                        n2 = a2.a;
                    }
                }
                return n2;
            }
            case 1: {
                final oi9 oi9 = (oi9)value;
                final ArrayList list = (ArrayList)this.x;
                final wb7 wb7 = (wb7)this.y;
                final cx7 cx7 = (cx7)this.z;
                for (ft7 ft7 : list) {
                    final Set a3 = wb7.A;
                    final long c = cx7.j.c;
                    final Map n3 = ft7.c.n();
                    n3.getClass();
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (final Map$Entry map$Entry : n3.entrySet()) {
                        if (map$Entry.getValue() instanceof Number) {
                            ((AbstractMap)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
                        }
                    }
                    value = new LinkedHashMap(z5e.V(((Map)linkedHashMap).size()));
                    for (final Map$Entry map$Entry2 : (Iterable)linkedHashMap.entrySet()) {
                        final Object key = map$Entry2.getKey();
                        final Object value3 = map$Entry2.getValue();
                        value3.getClass();
                        ((Map)value).put(key, (Object)value3);
                    }
                    value = new LinkedHashMap((Map)value);
                    final int l = ft7.c.L;
                    if (l != -128) {
                        ((Map)value).put((Object)"_sampling_priority_v1", (Object)l);
                    }
                    final obm obm = new obm(Long.valueOf(1L), (Map)value);
                    final bf8 m = cx7.m;
                    int n4 = 0;
                    switch (((Enum)m.d).ordinal()) {
                        default: {
                            en9.r();
                            return null;
                        }
                        case 6: {
                            n4 = 7;
                            break;
                        }
                        case 5: {
                            n4 = 6;
                            break;
                        }
                        case 4: {
                            n4 = 5;
                            break;
                        }
                        case 3: {
                            n4 = 2;
                            break;
                        }
                        case 2: {
                            n4 = 4;
                            break;
                        }
                        case 1: {
                            n4 = 3;
                            break;
                        }
                        case 0: {
                            n4 = 1;
                            break;
                        }
                    }
                    final mbm mbm = new mbm(n4, m.a, m.c, m.b, m.i, Integer.valueOf(m.l), (Number)m.m, m.n);
                    final bf8 i = cx7.m;
                    final qbm qbm = new qbm(i.f, i.h, i.g);
                    final btf k = cx7.l;
                    final Long c2 = k.c;
                    final String b2 = k.b;
                    sbm sbm;
                    if (c2 == null && b2 == null) {
                        sbm = null;
                    }
                    else {
                        String string;
                        if (c2 != null) {
                            string = c2.toString();
                        }
                        else {
                            string = null;
                        }
                        sbm = new sbm(string, b2);
                    }
                    final Long f = k.f;
                    String string2;
                    if (f != null) {
                        string2 = f.toString();
                    }
                    else {
                        string2 = null;
                    }
                    final Long e = k.e;
                    String string3;
                    if (e != null) {
                        string3 = e.toString();
                    }
                    else {
                        string3 = null;
                    }
                    final Long d = k.d;
                    String string4;
                    if (d != null) {
                        string4 = d.toString();
                    }
                    else {
                        string4 = null;
                    }
                    String s = null;
                    switch (k.a) {
                        default: {
                            throw null;
                        }
                        case 12: {
                            s = "NETWORK_OTHER";
                            break;
                        }
                        case 11: {
                            s = "NETWORK_CELLULAR";
                            break;
                        }
                        case 10: {
                            s = "NETWORK_MOBILE_OTHER";
                            break;
                        }
                        case 9: {
                            s = "NETWORK_5G";
                            break;
                        }
                        case 8: {
                            s = "NETWORK_4G";
                            break;
                        }
                        case 7: {
                            s = "NETWORK_3G";
                            break;
                        }
                        case 6: {
                            s = "NETWORK_2G";
                            break;
                        }
                        case 5: {
                            s = "NETWORK_BLUETOOTH";
                            break;
                        }
                        case 4: {
                            s = "NETWORK_WIMAX";
                            break;
                        }
                        case 3: {
                            s = "NETWORK_WIFI";
                            break;
                        }
                        case 2: {
                            s = "NETWORK_ETHERNET";
                            break;
                        }
                        case 1: {
                            s = "NETWORK_NOT_CONNECTED";
                            break;
                        }
                    }
                    final pbm pbm = new pbm(new kbm(sbm, string2, string3, string4, s));
                    final l2p n5 = cx7.n;
                    final ubm ubm = new ubm(n5.b, n5.c, n5.d, (Map)new LinkedHashMap(n5.e));
                    final String h = cx7.h;
                    value = ft7.c.n().get((Object)"application_id");
                    if (value != null) {
                        String s2;
                        if (value instanceof String) {
                            s2 = (String)value;
                        }
                        else {
                            s2 = null;
                        }
                        value = new jbm(s2);
                    }
                    else {
                        value = null;
                    }
                    final Object value4 = ft7.c.n().get((Object)"session_id");
                    rbm rbm;
                    if (value4 != null) {
                        String s3;
                        if (value4 instanceof String) {
                            s3 = (String)value4;
                        }
                        else {
                            s3 = null;
                        }
                        rbm = new rbm(s3);
                    }
                    else {
                        rbm = null;
                    }
                    final Object value5 = ft7.c.n().get((Object)"view.id");
                    vbm vbm;
                    if (value5 != null) {
                        String s4;
                        if (value5 instanceof String) {
                            s4 = (String)value5;
                        }
                        else {
                            s4 = null;
                        }
                        vbm = new vbm(s4);
                    }
                    else {
                        vbm = null;
                    }
                    final lbm lbm = new lbm(h, (jbm)value, rbm, vbm);
                    final String z = soh.Z(16, ft7.c.x.d());
                    final Map n6 = ft7.c.n();
                    n6.getClass();
                    value = new LinkedHashMap(z5e.V(n6.size()));
                    for (final Map$Entry map$Entry3 : (Iterable)n6.entrySet()) {
                        ((Map)value).put(map$Entry3.getKey(), (Object)map$Entry3.getValue().toString());
                    }
                    final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    final Map unmodifiableMap = Collections.unmodifiableMap(ft7.c.w);
                    unmodifiableMap.getClass();
                    ((Map)linkedHashMap2).putAll(unmodifiableMap);
                    ((Map)linkedHashMap2).putAll((Map)value);
                    ((Map)linkedHashMap2).put((Object)"_dd.p.id", (Object)z);
                    ((Map)linkedHashMap2).put((Object)"variant", (Object)cx7.g);
                    Object string5;
                    if (((List)ft7.i).isEmpty()) {
                        string5 = null;
                    }
                    else {
                        final CopyOnWriteArrayList i2 = ft7.i;
                        i2.getClass();
                        value = new ArrayList(d86.p0((Iterable)i2, 10));
                        final Iterator iterator5 = ((Iterable)i2).iterator();
                        if (iterator5.hasNext()) {
                            iterator5.next().getClass();
                            fvd.c();
                            return null;
                        }
                        final qqc qqc = new qqc();
                        final Iterator iterator6 = ((ArrayList)value).iterator();
                        while (iterator6.hasNext()) {
                            qqc.j((irc)iterator6.next());
                        }
                        string5 = ((irc)qqc).toString();
                    }
                    if (string5 != null) {
                        ((Map)linkedHashMap2).put((Object)"_dd.span_links", string5);
                    }
                    final nbm nbm = new nbm(cx7.e, lbm, new y7j((byte)25), new tbm(cx7.i), ubm, (ri2)null, pbm, mbm, qbm, (Map)linkedHashMap2);
                    final String z2 = soh.Z(16, ft7.c.x.e());
                    final String z3 = soh.Z(16, ft7.c.y);
                    final String z4 = soh.Z(16, 0L);
                    final String string6 = ft7.c.c().toString();
                    final String string7 = ft7.c.H.toString();
                    final String e2 = ft7.c.E;
                    final long f2 = ft7.f;
                    final long e3 = ft7.e;
                    final long n7 = (long)(ft7.c.I ? 1 : 0);
                    e2.getClass();
                    value = new wbm(z2, z3, z4, string6, string7, e2, f2, e3 + c, n7, obm, nbm);
                    value = wb7.w.a(value);
                    if (value == null) {
                        continue;
                    }
                    Label_1918: {
                        byte[] bytes;
                        wb7 wb8;
                        try {
                            bytes = wb7.x.s(cx7, (wbm)value).getBytes(ui3.a);
                            bytes.getClass();
                            monitorenter(wb8 = wb7);
                            final qpi qpi = new(qpi.class)();
                            final qpi qpi3;
                            final qpi qpi2 = qpi3 = qpi;
                            final byte[] array = bytes;
                            new qpi(array);
                            final oi9 oi10 = oi9;
                            final qpi qpi4 = qpi2;
                            oi10.a(qpi4);
                            continue;
                        }
                        finally {
                            break Label_1918;
                        }
                        try {
                            final qpi qpi = new(qpi.class)();
                            final qpi qpi3;
                            final qpi qpi2 = qpi3 = qpi;
                            final byte[] array = bytes;
                            new qpi(array);
                            final oi9 oi10 = oi9;
                            final qpi qpi4 = qpi2;
                            oi10.a(qpi4);
                            continue;
                        }
                        finally {
                            monitorexit(wb8);
                        }
                    }
                    final Throwable t;
                    c5q.F(wb7.y, 5, lq6.Y(qjc.v, qjc.x), (jta)new g5q(value, (byte)6), t, 48);
                }
                return lqo.a;
            }
            case 0: {
                final bq8 bq8 = (bq8)value;
                return new wd0(this.x, this.y, this.z, (byte)0);
            }
        }
    }
}
