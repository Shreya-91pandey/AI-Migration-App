public final class fc2 implements o6g, q6p
{
    public int v;
    public int w;
    public Object x;
    
    public fc2() {
        this.x = new fc2[256];
        this.v = 0;
        this.w = 0;
    }
    
    public fc2(final int v, final int w, final jta x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public fc2(final int v, final int w, final u09 u09) {
        this.v = v;
        this.w = w;
        this.x = new c2l(new wia(v, w, u09));
    }
    
    public fc2(final o6g x, final int v, final int w) {
        this.x = x;
        this.v = v;
        this.w = w;
    }
    
    public int G(final int n) {
        final int g = ((o6g)this.x).G(n);
        if (n >= 0 && n <= this.v) {
            t5p.b(g, this.w, n);
        }
        return g;
    }
    
    public gc2 b() {
        final Object o = new Object();
        ((gc2)o).a = this.v;
        ((gc2)o).b = this.w;
        ((gc2)o).c = (String)this.x;
        return (gc2)o;
    }
    
    public ig0 e(final long n, final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return ((c2l)this.x).e(n, ig0, ig2, ig3);
    }
    
    public int g() {
        return this.w;
    }
    
    public int h() {
        return this.v;
    }
    
    public ig0 i(final long n, final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return ((c2l)this.x).i(n, ig0, ig2, ig3);
    }
    
    public int n(final int n) {
        final int n2 = ((o6g)this.x).n(n);
        if (n >= 0 && n <= this.w) {
            t5p.c(n2, this.v, n);
        }
        return n2;
    }
}
