import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;

public class ci6
{
    public boolean a;
    public Object b;
    
    public ci6() {
        this.b = new HashMap();
    }
    
    public ci6(final ojc b) {
        this.b = b;
        this.a = true;
    }
    
    public void a() {
        if (!this.a) {
            this.a = true;
            final Collection values = ((HashMap)this.b).values();
            values.getClass();
            final Iterator iterator = ((Iterable)c86.s1((Iterable)values)).iterator();
            while (iterator.hasNext()) {
                ((efc)iterator.next()).onDestroy();
            }
        }
    }
    
    public void b() {
        this.a = true;
    }
    
    public void c() {
        this.a = false;
    }
    
    public void d() {
        this.a = false;
    }
    
    public void e(final byte b) {
        ((ojc)this.b).writeLong((long)b);
    }
    
    public void f(final char c) {
        ((ojc)this.b).e(c);
    }
    
    public void g(final int n) {
        ((ojc)this.b).writeLong((long)n);
    }
    
    public void h(final long n) {
        ((ojc)this.b).writeLong(n);
    }
    
    public void i(final String s) {
        ((ojc)this.b).j(s);
    }
    
    public void j(final short n) {
        ((ojc)this.b).writeLong((long)n);
    }
    
    public void k(final String s) {
        ((ojc)this.b).h(s);
    }
    
    public void l(final Object o, final efc efc) {
        final HashMap hashMap = (HashMap)this.b;
        if (!hashMap.containsKey(o)) {
            hashMap.put(o, (Object)efc);
            if (this.a) {
                efc.onDestroy();
            }
            return;
        }
        fvd.h((Object)smk.r(o, "Another instance is already associated with the key: "));
    }
    
    public void m() {
    }
    
    public void n() {
    }
}
