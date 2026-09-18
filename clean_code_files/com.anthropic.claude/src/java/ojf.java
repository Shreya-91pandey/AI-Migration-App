import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public interface ojf
{
    default int a(final flc flc, final List list, final int n) {
        final ArrayList list2 = (ArrayList)list;
        final ArrayList list3 = new ArrayList(list2.size());
        for (int size = list2.size(), i = 0; i < size; ++i) {
            final List list4 = (List)list2.get(i);
            final ArrayList list5 = new ArrayList(list4.size());
            for (int size2 = ((Collection)list4).size(), j = 0; j < size2; ++j) {
                list5.add((Object)new c58((goe)list4.get(j), 2, 1, (byte)0));
            }
            list3.add((Object)list5);
        }
        return this.b((ooe)new slc(flc, flc.getLayoutDirection()), (List)list3, hv6.b(0, 0, 0, n, 7)).b();
    }
    
    noe b(final ooe p0, final List p1, final long p2);
    
    default int c(final flc flc, final List list, final int n) {
        final ArrayList list2 = (ArrayList)list;
        final ArrayList list3 = new ArrayList(list2.size());
        for (int size = list2.size(), i = 0; i < size; ++i) {
            final List list4 = (List)list2.get(i);
            final ArrayList list5 = new ArrayList(list4.size());
            for (int size2 = ((Collection)list4).size(), j = 0; j < size2; ++j) {
                list5.add((Object)new c58((goe)list4.get(j), 1, 1, (byte)0));
            }
            list3.add((Object)list5);
        }
        return this.b((ooe)new slc(flc, flc.getLayoutDirection()), (List)list3, hv6.b(0, 0, 0, n, 7)).b();
    }
    
    default int d(final flc flc, final List list, final int n) {
        final ArrayList list2 = (ArrayList)list;
        final ArrayList list3 = new ArrayList(list2.size());
        for (int size = list2.size(), i = 0; i < size; ++i) {
            final List list4 = (List)list2.get(i);
            final ArrayList list5 = new ArrayList(list4.size());
            for (int size2 = ((Collection)list4).size(), j = 0; j < size2; ++j) {
                list5.add((Object)new c58((goe)list4.get(j), 2, 2, (byte)0));
            }
            list3.add((Object)list5);
        }
        return this.b((ooe)new slc(flc, flc.getLayoutDirection()), (List)list3, hv6.b(0, n, 0, 0, 13)).a();
    }
    
    default int e(final flc flc, final List list, final int n) {
        final ArrayList list2 = (ArrayList)list;
        final ArrayList list3 = new ArrayList(list2.size());
        for (int size = list2.size(), i = 0; i < size; ++i) {
            final List list4 = (List)list2.get(i);
            final ArrayList list5 = new ArrayList(list4.size());
            for (int size2 = ((Collection)list4).size(), j = 0; j < size2; ++j) {
                list5.add((Object)new c58((goe)list4.get(j), 1, 2, (byte)0));
            }
            list3.add((Object)list5);
        }
        return this.b((ooe)new slc(flc, flc.getLayoutDirection()), (List)list3, hv6.b(0, n, 0, 0, 13)).a();
    }
}
