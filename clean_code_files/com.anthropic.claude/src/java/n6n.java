import java.util.Arrays;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class n6n extends ogf
{
    public final Object v;
    public final Object w;
    public final Object[] x;
    public final PointerInputEventHandler y;
    
    public n6n(Object v, Object w, Object[] x, final PointerInputEventHandler y, final int n) {
        if ((n & 0x1) != 0x0) {
            v = null;
        }
        if ((n & 0x2) != 0x0) {
            w = null;
        }
        if ((n & 0x4) != 0x0) {
            x = null;
        }
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final hgf create() {
        return new t6n(this.v, this.w, this.x, this.y);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n6n)) {
            return false;
        }
        final n6n n6n = (n6n)o;
        if (!mlc.q(this.v, n6n.v)) {
            return false;
        }
        if (!mlc.q(this.w, n6n.w)) {
            return false;
        }
        final Object[] x = n6n.x;
        final Object[] x2 = this.x;
        if (x2 != null) {
            if (x == null) {
                return false;
            }
            if (!Arrays.equals(x2, x)) {
                return false;
            }
        }
        else if (x != null) {
            return false;
        }
        return this.y == n6n.y;
    }
    
    public final int hashCode() {
        int hashCode = 0;
        final Object v = this.v;
        int hashCode2;
        if (v != null) {
            hashCode2 = v.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Object w = this.w;
        int hashCode3;
        if (w != null) {
            hashCode3 = w.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Object[] x = this.x;
        if (x != null) {
            hashCode = Arrays.hashCode(x);
        }
        return this.y.hashCode() + ((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31;
    }
    
    public final void update(final hgf hgf) {
        final t6n t6n = (t6n)hgf;
        final Object j = t6n.J;
        final Object v = this.v;
        final boolean q = mlc.q(j, v);
        final int n = 1;
        boolean b = q ^ true;
        t6n.J = v;
        final Object k = t6n.K;
        final Object w = this.w;
        if (!mlc.q(k, w)) {
            b = true;
        }
        t6n.K = w;
        final Object[] l = t6n.L;
        final Object[] x = this.x;
        boolean b2 = b;
        if (l != null) {
            b2 = b;
            if (x == null) {
                b2 = true;
            }
        }
        boolean b3 = b2;
        if (l == null) {
            b3 = b2;
            if (x != null) {
                b3 = true;
            }
        }
        int n2 = b3 ? 1 : 0;
        if (l != null) {
            n2 = (b3 ? 1 : 0);
            if (x != null) {
                n2 = (b3 ? 1 : 0);
                if (!Arrays.equals(x, l)) {
                    n2 = 1;
                }
            }
        }
        t6n.L = x;
        final Class<? extends PointerInputEventHandler> class1 = t6n.M.getClass();
        final PointerInputEventHandler y = this.y;
        if (class1 != y.getClass()) {
            n2 = n;
        }
        if (n2 != 0) {
            t6n.q1();
        }
        t6n.M = y;
    }
}
