import java.util.Iterator;

public abstract class r7c implements Iterator, stc
{
    public int v;
    public int w;
    public boolean x;
    
    public r7c(final int v) {
        this.v = v;
    }
    
    public abstract Object a(final int p0);
    
    public abstract void c(final int p0);
    
    public final boolean hasNext() {
        return this.w < this.v;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            final Object a = this.a(this.w);
            ++this.w;
            this.x = true;
            return a;
        }
        oyl.r();
        return null;
    }
    
    public final void remove() {
        if (this.x) {
            this.c(--this.w);
            --this.v;
            this.x = false;
            return;
        }
        qiq.s("Call next() before removing an element.");
        throw null;
    }
}
