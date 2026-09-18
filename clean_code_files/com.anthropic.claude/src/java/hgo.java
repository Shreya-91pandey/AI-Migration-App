import java.util.Iterator;

public abstract class hgo implements Iterator, stc
{
    public Object[] v;
    public int w;
    public int x;
    
    public hgo() {
        this.v = fgo.e.d;
    }
    
    public final void a(final Object[] v, final int w, final int x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final boolean hasNext() {
        return this.x < this.w;
    }
    
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
