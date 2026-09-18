import io.sentry.c2;
import java.util.Iterator;

public final class mpm implements Iterator, stc
{
    public final a9m v;
    public final Iterator w;
    public Object x;
    public Object y;
    public int z;
    
    public mpm(final a9m v, final Iterator w) {
        this.v = v;
        this.w = w;
        this.z = ((npm)g8m.f(v.v)).d;
        this.x = this.y;
        Object next;
        if (w.hasNext()) {
            next = w.next();
        }
        else {
            next = null;
        }
        this.y = next;
    }
    
    public final boolean hasNext() {
        return this.y != null;
    }
    
    public final Object next() {
        if (((npm)g8m.f(this.v.v)).d != this.z) {
            en9.c();
            return null;
        }
        this.x = this.y;
        final Iterator w = this.w;
        Object next;
        if (w.hasNext()) {
            next = w.next();
        }
        else {
            next = null;
        }
        this.y = next;
        final Object x = this.x;
        if (x != null) {
            return x;
        }
        c2.c();
        return null;
    }
    
    public final void remove() {
        final a9m v = this.v;
        if (((npm)g8m.f(v.v)).d != this.z) {
            en9.c();
            return;
        }
        final Object x = this.x;
        if (x != null) {
            v.remove(x);
            this.x = null;
            this.z = ((npm)g8m.f(v.v)).d;
            return;
        }
        c2.c();
    }
}
