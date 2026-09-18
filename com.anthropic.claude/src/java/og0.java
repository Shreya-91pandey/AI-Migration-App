import java.util.Collection;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public final class og0 implements CharSequence
{
    public static final n9k z;
    public final List v;
    public final String w;
    public final ArrayList x;
    public final ArrayList y;
    
    static {
        z = s9k.a;
    }
    
    public og0(final String s, final List list) {
        List list2 = list;
        if (((Collection)list).isEmpty()) {
            list2 = null;
        }
        this(list2, s);
    }
    
    public og0(final String s, List list, final List list2) {
        final og0 a = pg0.a;
        if (list.isEmpty() && list2.isEmpty()) {
            list = null;
        }
        else if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list = list2;
            }
            else {
                final ArrayList list3 = new ArrayList(list2.size() + list.size());
                final int size = ((Collection)list).size();
                final int n = 0;
                for (int i = 0; i < size; ++i) {
                    list3.add((Object)list.get(i));
                }
                for (int size2 = ((Collection)list2).size(), j = n; j < size2; ++j) {
                    list3.add((Object)list2.get(j));
                }
                list = (List)list3;
            }
        }
        this(list, s);
    }
    
    public og0(List k1, final String w) {
        this.v = k1;
        this.w = w;
        final List list = null;
        Object x;
        Object y;
        if (k1 != null) {
            final int size = ((Collection)k1).size();
            int n = 0;
            Object o = null;
            Object o2 = null;
            while (true) {
                x = o;
                y = o2;
                if (n >= size) {
                    break;
                }
                final ng0 ng0 = (ng0)k1.get(n);
                final Object a = ng0.a;
                Object o3;
                Object o4;
                if (a instanceof hcm) {
                    if ((o3 = o) == null) {
                        o3 = new ArrayList();
                    }
                    ((List)o3).add((Object)ng0);
                    o4 = o2;
                }
                else {
                    o3 = o;
                    o4 = o2;
                    if (a instanceof mrg) {
                        Object o5;
                        if ((o5 = o2) == null) {
                            o5 = new ArrayList();
                        }
                        ((List)o5).add((Object)ng0);
                        o4 = o5;
                        o3 = o;
                    }
                }
                ++n;
                o = o3;
                o2 = o4;
            }
        }
        else {
            x = null;
            y = null;
        }
        this.x = (ArrayList)x;
        this.y = (ArrayList)y;
        k1 = list;
        if (y != null) {
            k1 = c86.k1((Iterable)y, (Comparator)new jna((byte)5));
        }
        if (k1 != null) {
            if (!((Collection)k1).isEmpty()) {
                final int c = ((ng0)c86.G0(k1)).c;
                final ilf a2 = qgc.a;
                final ilf ilf = new ilf(1);
                ilf.a(c);
                for (int size2 = k1.size(), i = 1; i < size2; ++i) {
                    final ng0 ng2 = (ng0)k1.get(i);
                    while (ilf.b != 0) {
                        final int d = ilf.d();
                        if (ng2.b >= d) {
                            ilf.e(ilf.b - 1);
                        }
                        else {
                            final int c2 = ng2.c;
                            if (c2 <= d) {
                                break;
                            }
                            final StringBuilder sb = new StringBuilder("Paragraph overlap not allowed, end ");
                            sb.append(c2);
                            sb.append(" should be less than or equal to ");
                            sb.append(d);
                            hac.a(sb.toString());
                            break;
                        }
                    }
                    ilf.a(ng2.c);
                }
            }
        }
    }
    
    public final og0 a(final lta lta) {
        final mg0 mg0 = new mg0(this);
        final ArrayList x = mg0.x;
        final ArrayList list = new ArrayList(x.size());
        for (int size = ((Collection)x).size(), i = 0; i < size; ++i) {
            final List list2 = (List)lta.b((Object)((lg0)x.get(i)).a(Integer.MIN_VALUE));
            final ArrayList list3 = new ArrayList(list2.size());
            for (int size2 = ((Collection)list2).size(), j = 0; j < size2; ++j) {
                final ng0 ng0 = (ng0)list2.get(j);
                list3.add((Object)new lg0(ng0.b, ng0.c, ng0.a, ng0.d));
            }
            h86.t0((Collection)list, (Iterable)list3);
        }
        x.clear();
        x.addAll((Collection)list);
        return mg0.n();
    }
    
    public final List b(final int n) {
        final List v = this.v;
        if (v != null) {
            final ArrayList list = new ArrayList(v.size());
            for (int size = ((Collection)v).size(), i = 0; i < size; ++i) {
                final Object value = v.get(i);
                final ng0 ng0 = (ng0)value;
                if (ng0.a instanceof vdd && pg0.c(0, n, ng0.b, ng0.c)) {
                    list.add(value);
                }
            }
            return (List)list;
        }
        return (List)r89.v;
    }
    
    public final List c(final int n, final int n2, final String s) {
        final List v = this.v;
        if (v != null) {
            final ArrayList list = new ArrayList(v.size());
            for (int size = ((Collection)v).size(), i = 0; i < size; ++i) {
                final ng0 ng0 = (ng0)v.get(i);
                if (ng0.a instanceof sxm && mlc.q((Object)s, (Object)ng0.d) && pg0.c(n, n2, ng0.b, ng0.c)) {
                    list.add((Object)r9r.j(ng0));
                }
            }
            return (List)list;
        }
        return (List)r89.v;
    }
    
    public final char charAt(final int n) {
        return this.w.charAt(n);
    }
    
    public final boolean d(final int n) {
        final List v = this.v;
        if (v != null) {
            for (int size = ((Collection)v).size(), i = 0; i < size; ++i) {
                final ng0 ng0 = (ng0)v.get(i);
                if (ng0.a instanceof vdd && pg0.c(0, n, ng0.b, ng0.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final og0 e(final lta lta) {
        final mg0 mg0 = new mg0(this);
        final ArrayList x = mg0.x;
        for (int size = x.size(), i = 0; i < size; ++i) {
            final ng0 ng0 = (ng0)lta.b((Object)((lg0)x.get(i)).a(Integer.MIN_VALUE));
            x.set(i, (Object)new lg0(ng0.b, ng0.c, ng0.a, ng0.d));
        }
        return mg0.n();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof og0)) {
            return false;
        }
        final og0 og0 = (og0)o;
        return mlc.q((Object)this.w, (Object)og0.w) && mlc.q((Object)this.v, (Object)og0.v);
    }
    
    public final og0 f(final og0 og0) {
        final mg0 mg0 = new mg0(this);
        mg0.e(og0);
        return mg0.n();
    }
    
    public final og0 g(final int n, final int n2) {
        final int n3 = 0;
        if (n > n2) {
            final StringBuilder sb = new StringBuilder("start (");
            sb.append(n);
            sb.append(") should be less or equal to end (");
            sb.append(n2);
            sb.append(")");
            hac.a(sb.toString());
        }
        final String w = this.w;
        if (n == 0 && n2 == w.length()) {
            return this;
        }
        final String substring = w.substring(n, n2);
        final og0 a = pg0.a;
        if (n > n2) {
            final StringBuilder sb2 = new StringBuilder("start (");
            sb2.append(n);
            sb2.append(") should be less than or equal to end (");
            sb2.append(n2);
            sb2.append(")");
            hac.a(sb2.toString());
        }
        final List v = this.v;
        final List list = null;
        Object o;
        if (v == null) {
            o = list;
        }
        else {
            o = new ArrayList(v.size());
            for (int size = ((Collection)v).size(), i = n3; i < size; ++i) {
                final ng0 ng0 = (ng0)v.get(i);
                final int b = ng0.b;
                final int c = ng0.c;
                if (pg0.c(n, n2, b, c)) {
                    ((ArrayList)o).add((Object)new ng0(Math.max(n, ng0.b) - n, Math.min(n2, c) - n, ng0.a, ng0.d));
                }
            }
            if (((ArrayList)o).isEmpty()) {
                o = list;
            }
        }
        return new og0((List)o, substring);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.w.hashCode();
        final List v = this.v;
        int hashCode2;
        if (v != null) {
            hashCode2 = v.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
    
    public final int length() {
        return this.w.length();
    }
    
    @Override
    public final String toString() {
        return this.w;
    }
}
