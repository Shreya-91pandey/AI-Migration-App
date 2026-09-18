import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.LinkedHashMap;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.Serializable;

public final class dho
{
    public static final String[] l;
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final aua f;
    public final Serializable g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    
    static {
        l = new String[] { "INSERT", "UPDATE", "DELETE" };
    }
    
    public dho(final WorkDatabase_Impl b, final LinkedHashMap c, LinkedHashMap d, final String[] array, final boolean a, final a0 f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.f = (aua)f;
        int i = 0;
        this.j = new AtomicBoolean(false);
        this.k = new lih((byte)21);
        this.e = new LinkedHashMap();
        final int length = array.length;
        final String[] g = new String[length];
        while (i < length) {
            final String s = array[i];
            final Locale root = Locale.ROOT;
            final String lowerCase = s.toLowerCase(root);
            lowerCase.getClass();
            ((Map)this.e).put((Object)lowerCase, (Object)i);
            final String s2 = (String)((LinkedHashMap)this.c).get((Object)array[i]);
            String lowerCase2;
            if (s2 != null) {
                lowerCase2 = s2.toLowerCase(root);
                lowerCase2.getClass();
            }
            else {
                lowerCase2 = null;
            }
            if (lowerCase2 == null) {
                lowerCase2 = lowerCase;
            }
            g[i] = lowerCase2;
            ++i;
        }
        this.g = g;
        for (final Map$Entry map$Entry : ((LinkedHashMap)this.c).entrySet()) {
            final String s3 = (String)map$Entry.getValue();
            final Locale root2 = Locale.ROOT;
            final String lowerCase3 = s3.toLowerCase(root2);
            lowerCase3.getClass();
            if (((Map)this.e).containsKey((Object)lowerCase3)) {
                final String lowerCase4 = ((String)map$Entry.getKey()).toLowerCase(root2);
                lowerCase4.getClass();
                d = (LinkedHashMap)this.e;
                ((Map)d).put((Object)lowerCase4, y5e.X((Object)lowerCase3, (Map)d));
            }
        }
        this.h = new h5g(((String[])(Object)this.g).length);
        this.i = new v2b(((String[])(Object)this.g).length);
    }
    
    public dho(final fz6 b, final fn3 c, final fn3 d, final ca4 e, final ca4 f, final cb4 g, final ca4 h, final aa4 i) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (aua)f;
        this.g = (Serializable)g;
        this.h = h;
        this.i = i;
        this.j = o50.Q((Object)Boolean.FALSE);
        this.k = o50.Q((Object)null);
    }
    
    public Object a(vfh v, final h07 h07) {
        pgo pgo2 = null;
        Label_0051: {
            if (h07 instanceof pgo) {
                final pgo pgo = (pgo)h07;
                final int y = pgo.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    pgo.y = y + Integer.MIN_VALUE;
                    pgo2 = pgo;
                    break Label_0051;
                }
            }
            pgo2 = new pgo(this, h07);
        }
        Object o = pgo2.w;
        final int y2 = pgo2.y;
        final pc7 v2 = pc7.v;
        if (y2 != 0) {
            if (y2 != 1) {
                if (y2 == 2) {
                    final Set set = (Set)pgo2.v;
                    vt4.g0(o);
                    return set;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                v = (vfh)pgo2.v;
                vt4.g0(o);
            }
        }
        else {
            vt4.g0(o);
            final ngo ngo = new ngo((byte)0);
            pgo2.v = v;
            pgo2.y = 1;
            if ((o = v.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", (lta)ngo, pgo2)) == v2) {
                return v2;
            }
        }
        final Set v3 = (Set)o;
        if (!((Collection)v3).isEmpty()) {
            pgo2.v = v3;
            pgo2.y = 2;
            if (c5q.v(v, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", (h07)pgo2) == v2) {
                return v2;
            }
        }
        return v3;
    }
    
    public Object b(h07 v) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.b;
        Object o = null;
        Label_0058: {
            if (v instanceof tgo) {
                o = v;
                final int y = ((tgo)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((tgo)o).y = y + Integer.MIN_VALUE;
                    break Label_0058;
                }
            }
            o = new tgo(this, v);
        }
        final Object w = ((tgo)o).w;
        final int y2 = ((tgo)o).y;
        Object s = null;
        Label_0257: {
            if (y2 != 0) {
                if (y2 == 1) {
                    v = (h07)((tgo)o).v;
                    try {
                        vt4.g0(w);
                        break Label_0257;
                    }
                    finally {
                        s = v;
                        final Object o2;
                        v = (h07)o2;
                        break Label_0257;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(w);
            v = (h07)((WorkDatabase)workDatabase_Impl).g;
            final boolean m = ((jmq)v).m();
            final z89 v2 = z89.v;
            if (!m) {
                return v2;
            }
            try {
                if (!((AtomicBoolean)this.j).compareAndSet(true, false)) {
                    ((jmq)v).F();
                    return v2;
                }
                if (!(boolean)((jta)this.k).a()) {
                    ((jmq)v).F();
                    return v2;
                }
                final xb0 xb0 = new xb0((byte)8, (f07)null, (Object)this);
                ((tgo)o).v = (jmq)v;
                ((tgo)o).y = 1;
                s = ((WorkDatabase)workDatabase_Impl).s(false, (zta)xb0, (h07)o);
                final pc7 v3 = pc7.v;
                if (s == v3) {
                    return v3;
                }
                final Object o2 = v;
                v = (h07)o2;
                final Set set = (Set)s;
                v = (h07)o2;
                if (!((Collection)set).isEmpty()) {
                    v = (h07)o2;
                    final v2b v2b = (v2b)this.i;
                    v = (h07)o2;
                    if (!set.isEmpty()) {
                        v = (h07)o2;
                        final apm apm = (apm)v2b.w;
                        Object value;
                        int[] array;
                        do {
                            v = (h07)o2;
                            value = apm.getValue();
                            v = (h07)o2;
                            final int[] array2 = (int[])value;
                            v = (h07)o2;
                            final int length = array2.length;
                            v = (h07)o2;
                            array = new int[length];
                            for (int i = 0; i < length; ++i) {
                                v = (h07)o2;
                                int n;
                                if (set.contains((Object)i)) {
                                    n = array2[i] + 1;
                                }
                                else {
                                    n = array2[i];
                                }
                                array[i] = n;
                            }
                            v = (h07)o2;
                        } while (!apm.j(value, (Object)array));
                    }
                    v = (h07)o2;
                    ((a0)this.f).b((Object)set);
                }
                ((jmq)o2).F();
                return set;
            }
            finally {
                final h07 h07 = v;
                final h07 h8;
                v = h8;
                s = h07;
            }
        }
        ((jmq)s).F();
        throw v;
    }
    
    public void c(final jta jta, final jta jta2) {
        if (!((AtomicBoolean)this.j).compareAndSet(false, true)) {
            return;
        }
        jta.a();
        final fz6 a = ((WorkDatabase)this.b).a;
        if (a != null) {
            rhc.G((oc7)a, (hc7)new lc7("Room Invalidation Tracker Refresh"), 0, (zta)new frd((Object)this, (Object)jta2, (f07)null, (byte)23), 2);
            return;
        }
        mlc.j0("coroutineScope");
        throw null;
    }
    
    public Object d(final eeo v, int n, final h07 h07) {
        h07 h8 = null;
        Label_0051: {
            if (h07 instanceof vgo) {
                h8 = h07;
                final int d = ((vgo)h8).D;
                if ((d & Integer.MIN_VALUE) != 0x0) {
                    ((vgo)h8).D = d + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            h8 = new vgo(this, h07);
        }
        final Object b = ((vgo)h8).B;
        final int d2 = ((vgo)h8).D;
        final pc7 v2 = pc7.v;
        while (true) {
            vfh v3 = null;
            vgo vgo = null;
            Label_0441: {
                vfh v4;
                if (d2 != 0) {
                    if (d2 != 1) {
                        if (d2 == 2) {
                            final int a = ((vgo)h8).A;
                            n = ((vgo)h8).z;
                            final int y = ((vgo)h8).y;
                            final String[] x = ((vgo)h8).x;
                            final String w = ((vgo)h8).w;
                            v3 = ((vgo)h8).v;
                            vt4.g0(b);
                            vgo = (vgo)h8;
                            break Label_0441;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        n = ((vgo)h8).y;
                        v4 = ((vgo)h8).v;
                        vt4.g0(b);
                    }
                }
                else {
                    vt4.g0(b);
                    final StringBuilder sb = new StringBuilder("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
                    sb.append(n);
                    sb.append(", 0)");
                    final String string = sb.toString();
                    ((vgo)h8).v = v;
                    ((vgo)h8).y = n;
                    ((vgo)h8).D = 1;
                    v4 = v;
                    if (c5q.v((vfh)v, string, h8) == v2) {
                        return v2;
                    }
                }
                final String w = ((String[])(Object)this.g)[n];
                final String[] x = dho.l;
                final int n2 = 0;
                final int a = 3;
                final int y = n;
                n = n2;
                if (n >= a) {
                    return lqo.a;
                }
                final String s = x[n];
                String s2;
                if (this.a) {
                    s2 = "TEMP";
                }
                else {
                    s2 = "";
                }
                final StringBuilder sb2 = new StringBuilder("room_table_modification_trigger_");
                sb2.append(w);
                sb2.append('_');
                sb2.append(s);
                final StringBuilder t = oz1.t("CREATE ", s2, " TRIGGER IF NOT EXISTS `", sb2.toString(), "` AFTER ");
                oz1.A(t, s, " ON `", w, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                final String q = smk.q(y, " AND invalidated = 0; END", t);
                ((vgo)h8).v = v4;
                ((vgo)h8).w = w;
                ((vgo)h8).x = x;
                ((vgo)h8).y = y;
                ((vgo)h8).z = n;
                ((vgo)h8).A = a;
                ((vgo)h8).D = 2;
                vgo = (vgo)h8;
                v3 = v4;
                if (c5q.v(v4, q, h8) != v2) {
                    break Label_0441;
                }
                return v2;
            }
            ++n;
            h8 = vgo;
            vfh v4 = v3;
            continue;
        }
    }
    
    public Object e(final eeo eeo, int y, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof xgo) {
                final xgo xgo = (xgo)h07;
                final int c = xgo.C;
                if ((c & Integer.MIN_VALUE) != 0x0) {
                    xgo.C = c + Integer.MIN_VALUE;
                    o = xgo;
                    break Label_0054;
                }
            }
            o = new xgo(this, h07);
        }
        final Object a = ((xgo)o).A;
        final int c2 = ((xgo)o).C;
        while (true) {
            Label_0272: {
                int z;
                String[] x;
                String w;
                vfh v;
                if (c2 != 0) {
                    if (c2 == 1) {
                        z = ((xgo)o).z;
                        y = ((xgo)o).y;
                        x = ((xgo)o).x;
                        w = ((xgo)o).w;
                        v = ((xgo)o).v;
                        vt4.g0(a);
                        break Label_0272;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(a);
                    w = ((String[])(Object)this.g)[y];
                    final String[] l = dho.l;
                    z = 3;
                    v = eeo;
                    y = 0;
                    x = l;
                }
                if (y >= z) {
                    return lqo.a;
                }
                final String s = x[y];
                final StringBuilder sb = new StringBuilder("room_table_modification_trigger_");
                sb.append(w);
                sb.append('_');
                sb.append(s);
                final String n = smk.n('`', "DROP TRIGGER IF EXISTS `", sb.toString());
                ((xgo)o).v = v;
                ((xgo)o).w = w;
                ((xgo)o).x = x;
                ((xgo)o).y = y;
                ((xgo)o).z = z;
                ((xgo)o).C = 1;
                final Object v2 = c5q.v(v, n, (h07)o);
                final pc7 v3 = pc7.v;
                if (v2 == v3) {
                    return v3;
                }
            }
            ++y;
            continue;
        }
    }
    
    public Object f(h07 v) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.b;
        Object o = null;
        Label_0054: {
            if (v instanceof zgo) {
                o = v;
                final int y = ((zgo)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((zgo)o).y = y + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            o = new zgo(this, v);
        }
        final Object w = ((zgo)o).w;
        final int y2 = ((zgo)o).y;
        Label_0163: {
            if (y2 != 0) {
                if (y2 == 1) {
                    v = (h07)((zgo)o).v;
                    try {
                        vt4.g0(w);
                        break Label_0163;
                    }
                    finally {
                        break Label_0163;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(w);
            v = (h07)((WorkDatabase)workDatabase_Impl).g;
            if (!((jmq)v).m()) {
                return lqo.a;
            }
            try {
                final av7 av7 = new av7((byte)8, (f07)null, (Object)this);
                ((zgo)o).v = (jmq)v;
                ((zgo)o).y = 1;
                final Object s = ((WorkDatabase)workDatabase_Impl).s(false, (zta)av7, (h07)o);
                final pc7 v2 = pc7.v;
                if (s == v2) {
                    return v2;
                }
                ((jmq)v).F();
                return lqo.a;
            }
            finally {}
        }
        ((jmq)v).F();
        throw;
    }
}
