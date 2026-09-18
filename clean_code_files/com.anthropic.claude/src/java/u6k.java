import java.util.Iterator;

public final class u6k extends v6k implements Iterator
{
    public t6k v;
    public boolean w;
    public final w6k x;
    
    public u6k(final w6k x) {
        this.x = x;
        this.w = true;
    }
    
    @Override
    public final void a(t6k y) {
        final t6k v = this.v;
        if (y == v) {
            y = v.y;
            this.v = y;
            this.w = (y == null);
        }
    }
    
    public final boolean hasNext() {
        if (this.w) {
            return this.x.v != null;
        }
        final t6k v = this.v;
        return v != null && v.x != null;
    }
    
    public final Object next() {
        if (this.w) {
            this.w = false;
            return this.v = this.x.v;
        }
        final t6k v = this.v;
        t6k x;
        if (v != null) {
            x = v.x;
        }
        else {
            x = null;
        }
        return this.v = x;
    }
}
