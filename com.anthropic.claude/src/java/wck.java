import java.util.Collection;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

public abstract class wck
{
    public static final int a = 0;
    
    static {
        krd.e("Schedulers");
    }
    
    public static void a(final z5q z5q, final y7j y7j, final List list) {
        if (list.size() > 0) {
            final long currentTimeMillis = System.currentTimeMillis();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                z5q.f(currentTimeMillis, ((v5q)iterator.next()).a);
            }
        }
    }
    
    public static void b(final wn6 wn6, WorkDatabase iterator, final List list) {
        if (list != null) {
            if (list.size() != 0) {
                final z5q v = iterator.v();
                iterator.b();
                try {
                    final WorkDatabase a = v.a;
                    final WorkDatabase a2 = v.a;
                    final List list2 = (List)xp7.L(a, true, false, (lta)new i6p((byte)29));
                    a(v, wn6.d, list2);
                    final List list3 = (List)xp7.L(a2, true, false, (lta)new i6p((byte)27));
                    a(v, wn6.d, list3);
                    list3.addAll((Collection)list2);
                    final List list4 = (List)xp7.L(a2, true, false, (lta)new i6p((byte)25));
                    iterator.q();
                    iterator.m();
                    if (list3.size() > 0) {
                        iterator = (WorkDatabase)list3.toArray((Object[])new v5q[list3.size()]);
                        for (final tck tck : list) {
                            if (tck.c()) {
                                tck.e((v5q[])(Object)iterator);
                            }
                        }
                    }
                    if (list4.size() > 0) {
                        final v5q[] array = (v5q[])list4.toArray((Object[])new v5q[list4.size()]);
                        iterator = (WorkDatabase)list.iterator();
                        while (((Iterator)iterator).hasNext()) {
                            final tck tck2 = (tck)((Iterator)iterator).next();
                            if (!tck2.c()) {
                                tck2.e(array);
                            }
                        }
                    }
                }
                finally {
                    iterator.m();
                }
            }
        }
    }
}
