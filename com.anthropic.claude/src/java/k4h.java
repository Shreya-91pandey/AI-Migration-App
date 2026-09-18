import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Iterator;

public class k4h implements Iterator, stc
{
    public final byte v;
    public Object w;
    public final Object x;
    public int y;
    
    public k4h(final bxa x) {
        this.v = 3;
        this.x = x;
        this.y = -2;
    }
    
    public void a() {
        final int y = this.y;
        final bxa bxa = (bxa)this.x;
        Object w;
        if (y == -2) {
            w = ((jta)bxa.b).a();
        }
        else {
            final lta lta = (lta)bxa.c;
            final Object w2 = this.w;
            w2.getClass();
            w = lta.b(w2);
        }
        this.w = w;
        this.y = ((w != null) ? 1 : 0);
    }
    
    public mgd c() {
        if (!this.hasNext()) {
            oyl.r();
            return null;
        }
        final Object value = ((Map)this.x).get(this.w);
        if (value != null) {
            final mgd mgd = (mgd)value;
            ++this.y;
            this.w = mgd.c();
            return mgd;
        }
        final Object w = this.w;
        final StringBuilder sb = new StringBuilder("Hash code of a key (");
        sb.append(w);
        sb.append(") has changed after it was added to the persistent map.");
        throw new ConcurrentModificationException(sb.toString());
    }
    
    public final boolean hasNext() {
        final byte v = this.v;
        final Object x = this.x;
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = false;
        switch (v) {
            default: {
                if (this.y < 0) {
                    this.a();
                }
                if (this.y == 1) {
                    b4 = true;
                }
                return b4;
            }
            case 2: {
                boolean b5 = b;
                if (this.y < ((Map)x).size()) {
                    b5 = true;
                }
                return b5;
            }
            case 1: {
                boolean b6 = b2;
                if (this.y < ((Map)x).size()) {
                    b6 = true;
                }
                return b6;
            }
            case 0: {
                boolean b7 = b3;
                if (this.y < ((Map)x).size()) {
                    b7 = true;
                }
                return b7;
            }
        }
    }
    
    public Object next() {
        final byte v = this.v;
        final Object x = this.x;
        Object w = null;
        final Object o = null;
        final Object o2 = null;
        switch (v) {
            default: {
                if (this.y < 0) {
                    this.a();
                }
                Object w2;
                if (this.y != 0) {
                    w2 = this.w;
                    w2.getClass();
                    this.y = -1;
                }
                else {
                    oyl.r();
                    w2 = o2;
                }
                return w2;
            }
            case 2: {
                if (this.hasNext()) {
                    w = this.w;
                    ++this.y;
                    final Object value = ((Map)x).get(w);
                    if (value == null) {
                        throw new ConcurrentModificationException(lmf.r(w, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                    }
                    this.w = ((pgd)value).b;
                }
                else {
                    oyl.r();
                }
                return w;
            }
            case 1: {
                Object w3;
                if (this.hasNext()) {
                    w3 = this.w;
                    ++this.y;
                    final Object value2 = ((Map)x).get(w3);
                    if (value2 == null) {
                        throw new ConcurrentModificationException(lmf.r(w3, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                    }
                    this.w = ((ogd)value2).b;
                }
                else {
                    oyl.r();
                    w3 = o;
                }
                return w3;
            }
            case 0: {
                return this.c();
            }
        }
    }
    
    public void remove() {
        switch (this.v) {
            default: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 2: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 1: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 0: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }
    }
}
