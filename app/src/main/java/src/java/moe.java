import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public interface moe
{
    default int a(final flc flc, final List list, final int n) {
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
            list2.add((Object)new c58((goe)list.get(i), 2, 1, (byte)0));
        }
        return this.b((ooe)new slc(flc, ((yxf)flc).P.V), (List)list2, hv6.b(0, 0, 0, n, 7)).b();
    }
    
    noe b(final ooe p0, final List p1, final long p2);
    
    default int c(final flc flc, final List list, final int n) {
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
            list2.add((Object)new c58((goe)list.get(i), 1, 1, (byte)0));
        }
        return this.b((ooe)new slc(flc, ((yxf)flc).P.V), (List)list2, hv6.b(0, 0, 0, n, 7)).b();
    }
    
    default int d(final flc flc, final List list, final int n) {
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
            list2.add((Object)new c58((goe)list.get(i), 2, 2, (byte)0));
        }
        return this.b((ooe)new slc(flc, ((yxf)flc).P.V), (List)list2, hv6.b(0, n, 0, 0, 13)).a();
    }
    
    default int e(final flc flc, final List list, final int n) {
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
            list2.add((Object)new c58((goe)list.get(i), 1, 2, (byte)0));
        }
        return this.b((ooe)new slc(flc, ((yxf)flc).P.V), (List)list2, hv6.b(0, n, 0, 0, 13)).a();
    }
}
