import java.util.Set;
import java.util.UUID;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;

public abstract class yb9
{
    public static final String a;
    
    static {
        a = krd.e("EnqueueRunnable");
    }
    
    public static void a(final o4q o4q) {
        final a5q a = o4q.a;
        final HashSet set = new HashSet();
        ((Set)set).addAll((Collection)o4q.e);
        final HashSet b = o4q.b(o4q);
        final Iterator iterator = set.iterator();
        while (true) {
            while (iterator.hasNext()) {
                if (b.contains((Object)iterator.next())) {
                    final boolean b2 = true;
                    if (!b2) {
                        final WorkDatabase c = a.c;
                        final wn6 b3 = a.b;
                        c.b();
                        try {
                            vt4.t(c, b3, o4q);
                            final boolean b4 = b(o4q);
                            c.q();
                            c.m();
                            if (b4) {
                                wck.b(b3, a.c, a.e);
                            }
                            return;
                        }
                        finally {
                            c.m();
                        }
                    }
                    uy8.e((Object)o4q, (Object)")", "WorkContinuation has cycles (");
                    return;
                }
            }
            ((Set)set).removeAll((Collection)o4q.e);
            final boolean b2 = false;
            continue;
        }
    }
    
    public static boolean b(final o4q o4q) {
        final HashSet b = o4q.b(o4q);
        final a5q a = o4q.a;
        final List d = o4q.d;
        int n = 0;
        final String[] array = (String[])b.toArray((Object[])new String[0]);
        final String b2 = o4q.b;
        final int c = o4q.c;
        final y7j d2 = a.b.d;
        final long currentTimeMillis = System.currentTimeMillis();
        final WorkDatabase c2 = a.c;
        int n2;
        if (array != null && array.length > 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final x4q x = x4q.x;
        final x4q a2 = x4q.A;
        final x4q y = x4q.y;
        boolean b4 = false;
        Label_1253: {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            List list = null;
            boolean empty = false;
            x4q v = null;
            String[] array2 = null;
            WorkDatabase workDatabase2 = null;
            Label_0896: {
                while (true) {
                    Label_0885: {
                        List e = null;
                    Label_0216:
                        while (true) {
                            Label_0286: {
                                if (n2 == 0) {
                                    n3 = 0;
                                    n4 = 0;
                                    n5 = 1;
                                    list = d;
                                    break Label_0286;
                                }
                                final int length = array.length;
                                int n6 = 0;
                                int n7 = 0;
                                int n8 = 1;
                                while (true) {
                                    list = d;
                                    n3 = n6;
                                    n4 = n7;
                                    n5 = n8;
                                    if (n >= length) {
                                        break Label_0286;
                                    }
                                    final String s = array[n];
                                    final v5q d3 = c2.v().d(s);
                                    if (d3 == null) {
                                        final krd c3 = krd.c();
                                        final StringBuilder sb = new StringBuilder("Prerequisite ");
                                        sb.append(s);
                                        sb.append(" doesn't exist; not enqueuing");
                                        c3.a(yb9.a, sb.toString());
                                        break;
                                    }
                                    final x4q b3 = d3.b;
                                    n8 &= ((b3 == x) ? 1 : 0);
                                    int n9;
                                    if (b3 == y) {
                                        n9 = 1;
                                    }
                                    else {
                                        n9 = n7;
                                        if (b3 == a2) {
                                            n6 = 1;
                                            n9 = n7;
                                        }
                                    }
                                    ++n;
                                    n7 = n9;
                                }
                                b4 = false;
                                break Label_1253;
                            }
                            empty = TextUtils.isEmpty((CharSequence)b2);
                            v = x4q.v;
                            if (empty || n2 != 0) {
                                break Label_0885;
                            }
                            e = c2.v().e(b2);
                            if (e.isEmpty()) {
                                break Label_0885;
                            }
                            if (c != 3 && c != 4) {
                                if (c == 2) {
                                    final Iterator iterator = e.iterator();
                                    while (iterator.hasNext()) {
                                        final x4q b5 = ((t5q)iterator.next()).b;
                                        if (b5 == v) {
                                            continue Label_0216;
                                        }
                                        if (b5 == x4q.w) {
                                            continue Label_0216;
                                        }
                                    }
                                }
                                c2.getClass();
                                c2.p((jta)new lce((Object)new j13(c2, b2, a, (byte)1), (byte)21));
                                final z5q v2 = c2.v();
                                final Iterator iterator2 = e.iterator();
                                while (iterator2.hasNext()) {
                                    xp7.L(v2.a, false, true, (lta)new jy4(((t5q)iterator2.next()).a, (byte)27));
                                }
                                final WorkDatabase workDatabase = c2;
                                b4 = true;
                                array2 = array;
                                workDatabase2 = workDatabase;
                                break Label_0896;
                            }
                            break;
                        }
                        final gd8 f = c2.f();
                        final ArrayList list2 = new ArrayList();
                        for (final t5q t5q : e) {
                            final String a3 = t5q.a;
                            int n10 = n3;
                            int n11 = n4;
                            int n12 = n5;
                            if (!(boolean)xp7.L(f.a, true, false, (lta)new fs5(a3, (byte)26))) {
                                final x4q b6 = t5q.b;
                                final boolean b7 = b6 == x;
                                if (b6 == y) {
                                    n11 = 1;
                                }
                                else {
                                    n11 = n4;
                                    if (b6 == a2) {
                                        n3 = 1;
                                        n11 = n4;
                                    }
                                }
                                list2.add((Object)t5q.a);
                                n12 = (n5 & (b7 ? 1 : 0));
                                n10 = n3;
                            }
                            n3 = n10;
                            n4 = n11;
                            n5 = n12;
                        }
                        final WorkDatabase workDatabase3 = c2;
                        List empty_LIST = (List)list2;
                        int n13 = n3;
                        int n14 = n4;
                        Label_0834: {
                            if (c == 4) {
                                if (n3 == 0) {
                                    empty_LIST = (List)list2;
                                    n13 = n3;
                                    if ((n14 = n4) == 0) {
                                        break Label_0834;
                                    }
                                }
                                final z5q v3 = workDatabase3.v();
                                final Iterator iterator4 = v3.e(b2).iterator();
                                while (iterator4.hasNext()) {
                                    xp7.L(v3.a, false, true, (lta)new jy4(((t5q)iterator4.next()).a, (byte)27));
                                }
                                empty_LIST = Collections.EMPTY_LIST;
                                n13 = 0;
                                n14 = 0;
                            }
                        }
                        array2 = (String[])empty_LIST.toArray((Object[])array);
                        if (array2.length > 0) {
                            n2 = 1;
                            n3 = n13;
                            n4 = n14;
                        }
                        else {
                            n2 = 0;
                            n4 = n14;
                            n3 = n13;
                        }
                        b4 = false;
                        workDatabase2 = workDatabase3;
                        break Label_0896;
                    }
                    final WorkDatabase workDatabase3 = c2;
                    array2 = array;
                    continue;
                }
            }
            final Iterator iterator5 = list.iterator();
            final x4q x4q = v;
            while (iterator5.hasNext()) {
                final r5q r5q = (r5q)iterator5.next();
                final v5q b8 = r5q.b;
                final UUID a4 = r5q.a;
                if (n2 != 0 && n5 == 0) {
                    if (n4 != 0) {
                        b8.b = y;
                    }
                    else if (n3 != 0) {
                        b8.b = a2;
                    }
                    else {
                        b8.b = x4q.z;
                    }
                }
                else {
                    b8.n = currentTimeMillis;
                }
                if (b8.b == x4q) {
                    b4 = true;
                }
                final z5q v4 = workDatabase2.v();
                xp7.L(v4.a, false, true, (lta)new tyl((Object)v4, (Object)vt4.l0(b8), (byte)23));
                String[] array3 = array2;
                if (n2 != 0) {
                    final int length2 = array2.length;
                    int n15 = 0;
                    while (true) {
                        array3 = array2;
                        if (n15 >= length2) {
                            break;
                        }
                        final String s2 = array2[n15];
                        final String string = a4.toString();
                        string.getClass();
                        final ed8 ed8 = new ed8(string, s2);
                        final gd8 f2 = workDatabase2.f();
                        xp7.L(f2.a, false, true, (lta)new c26((Object)f2, (Object)ed8, (byte)18));
                        ++n15;
                    }
                }
                final b6q w = workDatabase2.w();
                final String string2 = a4.toString();
                string2.getClass();
                w.a(string2, r5q.c);
                if (!empty) {
                    final m5q t = workDatabase2.t();
                    final String string3 = a4.toString();
                    string3.getClass();
                    xp7.L(t.a, false, true, (lta)new tyl((Object)t, (Object)new l5q(b2, string3), (byte)20));
                }
                array2 = array3;
            }
        }
        o4q.g = true;
        return b4;
    }
}
