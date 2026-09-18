import java.util.ListIterator;

public abstract class o1 implements ListIterator, stc
{
    public final byte v;
    public int w;
    public int x;
    
    public void add(final Object o) {
        switch (this.v) {
            default: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 0: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }
    }
    
    public final boolean hasNext() {
        switch (this.v) {
            default: {
                return this.w < this.x;
            }
            case 0: {
                return this.w < this.x;
            }
        }
    }
    
    public final boolean hasPrevious() {
        switch (this.v) {
            default: {
                return this.w > 0;
            }
            case 0: {
                return this.w > 0;
            }
        }
    }
    
    public final int nextIndex() {
        switch (this.v) {
            default: {
                return this.w;
            }
            case 0: {
                return this.w;
            }
        }
    }
    
    public final int previousIndex() {
        int n = 0;
        switch (this.v) {
            default: {
                n = this.w;
                break;
            }
            case 0: {
                n = this.w;
                break;
            }
        }
        return n - 1;
    }
    
    public void remove() {
        switch (this.v) {
            default: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 0: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }
    }
    
    public void set(final Object o) {
        switch (this.v) {
            default: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 0: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }
    }
}
