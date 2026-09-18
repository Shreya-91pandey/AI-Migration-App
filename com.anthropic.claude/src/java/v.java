import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

public abstract class v implements it0
{
    public final Object a;
    public Object b;
    public Object c;
    
    public v() {
        final Object a = new Object();
        ((mth)a).a = Float.NaN;
        this.a = a;
        this.b = new Object();
    }
    
    public v(final Object o) {
        this.a = o;
        this.c = new ArrayList();
        this.b = o;
    }
    
    public static void l(final ArrayList list, final int n, final int n2, final int n3) {
        int n4;
        if (n > n2) {
            n4 = n2;
        }
        else {
            n4 = n2 - n3;
        }
        if (n3 != 1) {
            final List subList = list.subList(n, n3 + n);
            final ArrayList list2 = new ArrayList((Collection)subList);
            subList.clear();
            list.addAll(n4, (Collection)list2);
            return;
        }
        if (n != n2 + 1 && n != n2 - 1) {
            list.add(n4, list.remove(n));
            return;
        }
        list.set(n, list.set(n2, list.get(n)));
    }
    
    @Override
    public void b(final Object b) {
        ((ArrayList)this.c).add(this.b);
        this.b = b;
    }
    
    public void f() {
        ((ArrayList)this.c).clear();
        this.b = this.a;
        this.m();
    }
    
    @Override
    public void g() {
        final ArrayList list = (ArrayList)this.c;
        this.b = list.remove(list.size() - 1);
    }
    
    @Override
    public Object j() {
        return this.b;
    }
    
    public void m() {
        final Object a = this.a;
        a.getClass();
        ((j69)a).c.clear();
    }
}
