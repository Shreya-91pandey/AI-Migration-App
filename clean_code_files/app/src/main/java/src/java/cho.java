import java.util.concurrent.locks.ReentrantLock;
import java.util.Collection;
import java.util.Set;
import java.util.List;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.conversation.model.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.LinkedHashMap;
import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import java.io.Serializable;

public final class cho
{
    public static final String[] j;
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    
    static {
        j = new String[] { "INSERT", "UPDATE", "DELETE" };
    }
    
    public cho(final StreamSmoothingConfig b, final sa4 c, final fn3 d, final kr e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (Serializable)e;
    }
    
    public cho(final quj b, final LinkedHashMap c, LinkedHashMap linkedHashMap, final String[] array, final boolean a) {
        this.b = b;
        this.c = c;
        this.a = a;
        int i = 0;
        this.h = new AtomicBoolean(false);
        this.i = new cm6((byte)26);
        this.d = new LinkedHashMap();
        final int length = array.length;
        final String[] e = new String[length];
        while (i < length) {
            final String s = array[i];
            final Locale root = Locale.ROOT;
            final String lowerCase = s.toLowerCase(root);
            lowerCase.getClass();
            ((Map)this.d).put((Object)lowerCase, (Object)i);
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
            e[i] = lowerCase2;
            ++i;
        }
        this.e = e;
        for (final Map$Entry map$Entry : ((LinkedHashMap)this.c).entrySet()) {
            final String s3 = (String)map$Entry.getValue();
            final Locale root2 = Locale.ROOT;
            final String lowerCase3 = s3.toLowerCase(root2);
            lowerCase3.getClass();
            if (((Map)this.d).containsKey((Object)lowerCase3)) {
                final String lowerCase4 = ((String)map$Entry.getKey()).toLowerCase(root2);
                lowerCase4.getClass();
                linkedHashMap = (LinkedHashMap)this.d;
                ((Map)linkedHashMap).put((Object)lowerCase4, y5e.X((Object)lowerCase3, (Map)linkedHashMap));
            }
        }
        this.f = new g5g(((String[])(Object)this.e).length);
        this.g = new jy7(((String[])(Object)this.e).length);
    }
    
    public static int e(String l0, final grh grh, final grh grh2) {
        final o5c c = grh.c;
        final ArrayList list = new ArrayList();
        final Iterator iterator = ((Iterable)c).iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int n = 0;
            if (hasNext) {
                final Object next = iterator.next();
                final i57 i57 = (i57)next;
                if (mlc.q((Object)i57.b(), (Object)l0)) {
                    continue;
                }
                final List a = i57.a();
                if (((ArrayList)a).isEmpty()) {
                    continue;
                }
                final Iterator iterator2 = ((ArrayList)a).iterator();
                while (iterator2.hasNext()) {
                    if (ri3.a((b)iterator2.next()) > 0) {
                        final mw0 mw0 = new mw0((Object)new s71((Object)grh, (Object)i57.b(), (f07)null, (byte)0), (byte)1);
                        final MessageId messageId = new MessageId(l0);
                        final Iterator iterator3 = mw0.iterator();
                        while (true) {
                            final vyk vyk = (vyk)iterator3;
                            if (!vyk.hasNext()) {
                                n = -1;
                                break;
                            }
                            final Object next2 = vyk.next();
                            if (n < 0) {
                                lq6.n0();
                                throw null;
                            }
                            if (messageId.equals(next2)) {
                                break;
                            }
                            ++n;
                        }
                        if (n >= 0 && rcr.c(grh2, i57.b()) == 0) {
                            list.add(next);
                            break;
                        }
                        break;
                    }
                }
            }
            else {
                if (list.isEmpty()) {
                    return 0;
                }
                l0 = kym.L0(rcr.c(grh, l0), rcr.j(grh2, l0));
                final Iterator iterator4 = list.iterator();
                int n2 = 0;
                while (iterator4.hasNext()) {
                    final String j = rcr.j(grh, ((i57)iterator4.next()).b());
                    int length;
                    if (kym.I0((CharSequence)l0, (CharSequence)j, false)) {
                        length = j.length();
                    }
                    else {
                        length = 0;
                    }
                    n2 += length;
                }
                return n2;
            }
        }
    }
    
    public Object a(ufh v, final h07 h07) {
        ogo ogo2 = null;
        Label_0051: {
            if (h07 instanceof ogo) {
                final ogo ogo = (ogo)h07;
                final int y = ogo.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ogo.y = y + Integer.MIN_VALUE;
                    ogo2 = ogo;
                    break Label_0051;
                }
            }
            ogo2 = new ogo(this, h07);
        }
        Object o = ogo2.w;
        final int y2 = ogo2.y;
        final pc7 v2 = pc7.v;
        if (y2 != 0) {
            if (y2 != 1) {
                if (y2 == 2) {
                    final Set set = (Set)ogo2.v;
                    vt4.g0(o);
                    return set;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                v = (ufh)ogo2.v;
                vt4.g0(o);
            }
        }
        else {
            vt4.g0(o);
            final nw2 nw2 = new nw2(2, (f07)null, (byte)7);
            ogo2.v = v;
            ogo2.y = 1;
            if ((o = v.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", (zta)nw2, ogo2)) == v2) {
                return v2;
            }
        }
        final Set v3 = (Set)o;
        if (!((Collection)v3).isEmpty()) {
            ogo2.v = v3;
            ogo2.y = 2;
            if (t4r.f(v, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", (h07)ogo2) == v2) {
                return v2;
            }
        }
        return v3;
    }
    
    public Object b(t2k v, final h07 h07) {
        final lqo a = lqo.a;
        qgo qgo2 = null;
        Label_0056: {
            if (h07 instanceof qgo) {
                final qgo qgo = (qgo)h07;
                final int y = qgo.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    qgo.y = y + Integer.MIN_VALUE;
                    qgo2 = qgo;
                    break Label_0056;
                }
            }
            qgo2 = new qgo(this, h07);
        }
        Object o = qgo2.w;
        final pc7 v2 = pc7.v;
        final int y2 = qgo2.y;
        Label_0359: {
            if (y2 != 0) {
                if (y2 == 1) {
                    v = qgo2.v;
                    vt4.g0(o);
                    break Label_0359;
                }
                if (y2 == 2) {
                    v = qgo2.v;
                    vt4.g0(o);
                    break Label_0359;
                }
                if (y2 == 3) {
                    v = qgo2.v;
                    vt4.g0(o);
                    break Label_0359;
                }
                if (y2 != 4 && y2 != 5) {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vt4.g0(o);
                break Label_0359;
            }
            vt4.g0(o);
            o = v.d1("PRAGMA query_only");
            try {
                ((b3k)o).Z0();
                final boolean w = ((b3k)o).W();
                r9n.m((AutoCloseable)o, (Throwable)null);
                if (!w) {
                    qgo2.v = v;
                    qgo2.y = 1;
                    ncq.x(v, "PRAGMA temp_store = MEMORY");
                    if (a != v2) {
                        qgo2.v = v;
                        qgo2.y = 2;
                        ncq.x(v, "PRAGMA recursive_triggers = 1");
                        if (a != v2) {
                            qgo2.v = v;
                            qgo2.y = 3;
                            ncq.x(v, "DROP TABLE IF EXISTS room_table_modification_log");
                            if (a != v2) {
                                if (this.a) {
                                    qgo2.v = null;
                                    qgo2.y = 4;
                                    ncq.x(v, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                                    if (a == v2) {
                                        return v2;
                                    }
                                }
                                else {
                                    o = rym.C0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false);
                                    qgo2.v = null;
                                    qgo2.y = 5;
                                    ncq.x(v, (String)o);
                                    if (a == v2) {
                                        return v2;
                                    }
                                }
                                final g5g g5g = (g5g)this.f;
                                v = (t2k)g5g.a;
                                ((ReentrantLock)v).lock();
                                try {
                                    g5g.d = true;
                                    return a;
                                }
                                finally {
                                    ((ReentrantLock)v).unlock();
                                }
                                return a;
                            }
                        }
                    }
                    return v2;
                }
                return a;
            }
            finally {
                try {}
                finally {
                    r9n.m((AutoCloseable)o, (Throwable)h07);
                }
            }
        }
    }
    
    public Object c(h07 v) {
        final quj quj = (quj)this.b;
        Object o = null;
        Label_0058: {
            if (v instanceof sgo) {
                o = v;
                final int y = ((sgo)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((sgo)o).y = y + Integer.MIN_VALUE;
                    break Label_0058;
                }
            }
            o = new sgo(this, v);
        }
        Object o2 = ((sgo)o).w;
        final int y2 = ((sgo)o).y;
        Object o3 = null;
        Label_0252: {
            if (y2 != 0) {
                if (y2 == 1) {
                    v = (h07)((sgo)o).v;
                    try {
                        vt4.g0(o2);
                        break Label_0252;
                    }
                    finally {
                        break Label_0252;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(o2);
            v = (h07)quj.e;
            final boolean q = ((c2l)v).q();
            final z89 v2 = z89.v;
            if (!q) {
                return v2;
            }
            try {
                if (!((AtomicBoolean)this.h).compareAndSet(true, false)) {
                    ((c2l)v).S();
                    return v2;
                }
                if (!(boolean)((jta)this.i).a()) {
                    ((c2l)v).S();
                    return v2;
                }
                final xb0 xb0 = new xb0((byte)7, (f07)null, (Object)this);
                ((sgo)o).v = (c2l)v;
                ((sgo)o).y = 1;
                o2 = quj.i(false, (zta)xb0, (h07)o);
                final pc7 v3 = pc7.v;
                if (o2 == v3) {
                    return v3;
                }
                o3 = v;
                v = (h07)o3;
                final Set set = (Set)o2;
                v = (h07)o3;
                if (!((Collection)set).isEmpty()) {
                    v = (h07)o3;
                    final jy7 jy7 = (jy7)this.g;
                    v = (h07)o3;
                    if (!set.isEmpty()) {
                        v = (h07)o3;
                        final apm apm = (apm)jy7.w;
                        Object value;
                        int[] array;
                        do {
                            v = (h07)o3;
                            value = apm.getValue();
                            v = (h07)o3;
                            final int[] array2 = (int[])value;
                            v = (h07)o3;
                            final int length = array2.length;
                            v = (h07)o3;
                            array = new int[length];
                            for (int i = 0; i < length; ++i) {
                                v = (h07)o3;
                                int n;
                                if (set.contains((Object)i)) {
                                    n = array2[i] + 1;
                                }
                                else {
                                    n = array2[i];
                                }
                                array[i] = n;
                            }
                            v = (h07)o3;
                        } while (!apm.j(value, (Object)array));
                    }
                }
                ((c2l)o3).S();
                return set;
            }
            finally {}
        }
        ((c2l)v).S();
        throw o3;
    }
    
    public Object d(final deo v, int n, final h07 h07) {
        ugo ugo = null;
        Label_0051: {
            if (h07 instanceof ugo) {
                ugo = (ugo)h07;
                final int d = ugo.D;
                if ((d & Integer.MIN_VALUE) != 0x0) {
                    ugo.D = d + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            ugo = new ugo(this, h07);
        }
        final Object b = ugo.B;
        final int d2 = ugo.D;
        final pc7 v2 = pc7.v;
        while (true) {
            ufh v3 = null;
            ugo ugo2 = null;
            Label_0414: {
                ufh v4;
                if (d2 != 0) {
                    if (d2 != 1) {
                        if (d2 == 2) {
                            final int a = ugo.A;
                            n = ugo.z;
                            final int y = ugo.y;
                            final String[] x = ugo.x;
                            final String w = ugo.w;
                            v3 = ugo.v;
                            vt4.g0(b);
                            ugo2 = ugo;
                            break Label_0414;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        n = ugo.y;
                        v4 = ugo.v;
                        vt4.g0(b);
                    }
                }
                else {
                    vt4.g0(b);
                    final StringBuilder sb = new StringBuilder("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
                    sb.append(n);
                    sb.append(", 0)");
                    final String string = sb.toString();
                    ugo.v = v;
                    ugo.y = n;
                    ugo.D = 1;
                    v4 = v;
                    if (t4r.f((ufh)v, string, (h07)ugo) == v2) {
                        return v2;
                    }
                }
                final String w = ((String[])(Object)this.e)[n];
                final String[] x = cho.j;
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
                final StringBuilder t = oz1.t("CREATE ", s2, " TRIGGER IF NOT EXISTS `", lmf.s("room_table_modification_trigger_", w, "_", s), "` AFTER ");
                oz1.A(t, s, " ON `", w, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                final String q = smk.q(y, " AND invalidated = 0; END", t);
                ugo.v = v4;
                ugo.w = w;
                ugo.x = x;
                ugo.y = y;
                ugo.z = n;
                ugo.A = a;
                ugo.D = 2;
                ugo2 = ugo;
                v3 = v4;
                if (t4r.f(v4, q, (h07)ugo) != v2) {
                    break Label_0414;
                }
                return v2;
            }
            ++n;
            ugo = ugo2;
            ufh v4 = v3;
            continue;
        }
    }
    
    public Object f(final deo deo, int y, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof wgo) {
                final wgo wgo = (wgo)h07;
                final int c = wgo.C;
                if ((c & Integer.MIN_VALUE) != 0x0) {
                    wgo.C = c + Integer.MIN_VALUE;
                    o = wgo;
                    break Label_0054;
                }
            }
            o = new wgo(this, h07);
        }
        final Object a = ((wgo)o).A;
        final int c2 = ((wgo)o).C;
        while (true) {
            Label_0242: {
                int z;
                String[] x;
                String w;
                ufh v;
                if (c2 != 0) {
                    if (c2 == 1) {
                        z = ((wgo)o).z;
                        y = ((wgo)o).y;
                        x = ((wgo)o).x;
                        w = ((wgo)o).w;
                        v = ((wgo)o).v;
                        vt4.g0(a);
                        break Label_0242;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(a);
                    w = ((String[])(Object)this.e)[y];
                    final String[] j = cho.j;
                    z = 3;
                    v = deo;
                    y = 0;
                    x = j;
                }
                if (y >= z) {
                    return lqo.a;
                }
                final String k = hia.k("DROP TRIGGER IF EXISTS `", lmf.s("room_table_modification_trigger_", w, "_", x[y]), "`");
                ((wgo)o).v = v;
                ((wgo)o).w = w;
                ((wgo)o).x = x;
                ((wgo)o).y = y;
                ((wgo)o).z = z;
                ((wgo)o).C = 1;
                final Object f = t4r.f(v, k, (h07)o);
                final pc7 v2 = pc7.v;
                if (f == v2) {
                    return v2;
                }
            }
            ++y;
            continue;
        }
    }
    
    public Object g(h07 v) {
        final quj quj = (quj)this.b;
        Object o = null;
        Label_0054: {
            if (v instanceof ygo) {
                o = v;
                final int y = ((ygo)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((ygo)o).y = y + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            o = new ygo(this, v);
        }
        final Object w = ((ygo)o).w;
        final int y2 = ((ygo)o).y;
        Label_0165: {
            if (y2 != 0) {
                if (y2 == 1) {
                    v = (h07)((ygo)o).v;
                    try {
                        vt4.g0(w);
                        break Label_0165;
                    }
                    finally {
                        break Label_0165;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(w);
            v = (h07)quj.e;
            if (!((c2l)v).q()) {
                return lqo.a;
            }
            try {
                final gzh gzh = new gzh((byte)11, (f07)null, (Object)this);
                ((ygo)o).v = (c2l)v;
                ((ygo)o).y = 1;
                final Object i = quj.i(false, (zta)gzh, (h07)o);
                final pc7 v2 = pc7.v;
                if (i == v2) {
                    return v2;
                }
                ((c2l)v).S();
                return lqo.a;
            }
            finally {}
        }
        ((c2l)v).S();
        throw;
    }
}
