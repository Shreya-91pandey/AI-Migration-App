import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public class k1 implements Iterator, stc
{
    public final byte v;
    public int w;
    public final Object x;
    
    public final boolean hasNext() {
        final byte v = this.v;
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        final Object x = this.x;
        switch (v) {
            default: {
                if (this.w < ((ViewGroup)x).getChildCount()) {
                    b3 = true;
                }
                return b3;
            }
            case 2: {
                return ((Iterator)x).hasNext();
            }
            case 1: {
                boolean b4 = b;
                if (this.w < ((Object[])x).length) {
                    b4 = true;
                }
                return b4;
            }
            case 0: {
                boolean b5 = b2;
                if (this.w < ((j0)x).a()) {
                    b5 = true;
                }
                return b5;
            }
        }
    }
    
    public final Object next() {
        final byte v = this.v;
        final Object o = null;
        Object o2 = null;
        final Object x = this.x;
        switch (v) {
            default: {
                final View child = ((ViewGroup)x).getChildAt(this.w++);
                if (child != null) {
                    return child;
                }
                throw new IndexOutOfBoundsException();
            }
            case 2: {
                final int n = this.w++;
                if (n >= 0) {
                    return new v7c(n, ((Iterator)x).next());
                }
                lq6.n0();
                throw null;
            }
            case 1: {
                try {
                    o2 = ((Object[])x)[this.w++];
                }
                catch (final ArrayIndexOutOfBoundsException ex) {
                    --this.w;
                    oyl.i(((Throwable)ex).getMessage());
                }
                return o2;
            }
            case 0: {
                Object value;
                if (this.hasNext()) {
                    value = ((List)x).get(this.w++);
                }
                else {
                    oyl.r();
                    value = o;
                }
                return value;
            }
        }
    }
    
    public final void remove() {
        switch (this.v) {
            default: {
                ((ViewGroup)this.x).removeViewAt(--this.w);
                return;
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
