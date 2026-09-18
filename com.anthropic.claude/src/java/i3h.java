import java.util.Iterator;

public abstract class i3h implements Iterator, stc
{
    public final hgo[] v;
    public int w;
    public boolean x;
    
    public i3h(final fgo fgo, final hgo[] v) {
        this.v = v;
        this.x = true;
        v[0].a(fgo.d, Integer.bitCount(fgo.a) * 2, 0);
        this.w = 0;
        this.a();
    }
    
    public final void a() {
        int w = this.w;
        final hgo[] v = this.v;
        final hgo hgo = v[w];
        if (hgo.x < hgo.w) {
            return;
        }
        while (-1 < w) {
            final int c = this.c(w);
            int c2;
            if ((c2 = c) == -1) {
                final hgo hgo2 = v[w];
                final int x = hgo2.x;
                final Object[] v2 = hgo2.v;
                c2 = c;
                if (x < v2.length) {
                    final int length = v2.length;
                    hgo2.x = x + 1;
                    c2 = this.c(w);
                }
            }
            if (c2 != -1) {
                this.w = c2;
                return;
            }
            if (w > 0) {
                final hgo hgo3 = v[w - 1];
                final int x2 = hgo3.x;
                final int length2 = hgo3.v.length;
                hgo3.x = x2 + 1;
            }
            v[w].a(fgo.e.d, 0, 0);
            --w;
        }
        this.x = false;
    }
    
    public final int c(final int n) {
        final hgo[] v = this.v;
        final hgo hgo = v[n];
        final int x = hgo.x;
        if (x < hgo.w) {
            return n;
        }
        final Object[] v2 = hgo.v;
        if (x < v2.length) {
            final int length = v2.length;
            final Object o = v2[x];
            o.getClass();
            final fgo fgo = (fgo)o;
            if (n == 6) {
                final hgo hgo2 = v[n + 1];
                final Object[] d = fgo.d;
                hgo2.a(d, d.length, 0);
            }
            else {
                v[n + 1].a(fgo.d, Integer.bitCount(fgo.a) * 2, 0);
            }
            return this.c(n + 1);
        }
        return -1;
    }
    
    public final boolean hasNext() {
        return this.x;
    }
    
    public Object next() {
        if (this.x) {
            final Object next = ((Iterator)this.v[this.w]).next();
            this.a();
            return next;
        }
        oyl.r();
        return null;
    }
    
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
