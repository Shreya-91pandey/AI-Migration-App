import java.util.Collection;
import java.util.List;

public final class aqo
{
    public final int a;
    public final v8m b;
    public final v8m c;
    
    public aqo(final int a, final List list, final List list2) {
        this.a = a;
        final int n = 0;
        if (a < 0) {
            jac.a("Capacity must be a positive integer");
        }
        final int size = list2.size();
        int n2 = n;
        if (list.size() + size <= a) {
            n2 = 1;
        }
        if (n2 == 0) {
            jac.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        final v8m b = new v8m();
        b.addAll((Collection)list);
        this.b = b;
        final v8m c = new v8m();
        c.addAll((Collection)list2);
        this.c = c;
    }
}
