final class zmg extends ogf
{
    public final float v;
    public final float w;
    public final float x;
    public final float y;
    
    public zmg(final float v, final float w, final float x, final float y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        final boolean b = true;
        final boolean b2 = v >= 0.0f || Float.isNaN(v);
        final boolean b3 = w >= 0.0f || Float.isNaN(w);
        final boolean b4 = x >= 0.0f || Float.isNaN(x);
        boolean b5 = b;
        if (y < 0.0f) {
            b5 = (Float.isNaN(y) && b);
        }
        if (!(b2 & b3 & b4 & b5)) {
            eac.a("Padding must be non-negative");
        }
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((bng)hgf).J = this.v;
        ((bng)hgf).K = this.w;
        ((bng)hgf).L = this.x;
        ((bng)hgf).M = this.y;
        ((bng)hgf).N = true;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        zmg zmg;
        if (o instanceof zmg) {
            zmg = (zmg)o;
        }
        else {
            zmg = null;
        }
        if (zmg != null) {
            if (qs8.e(this.v, zmg.v) && qs8.e(this.w, zmg.w) && qs8.e(this.x, zmg.x) && qs8.e(this.y, zmg.y)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Boolean.hashCode(true) + oz1.d(this.y, oz1.d(this.x, oz1.d(this.w, Float.hashCode(this.v) * 31, 31), 31), 31);
    }
    
    public final void update(final hgf hgf) {
        final bng bng = (bng)hgf;
        bng.J = this.v;
        bng.K = this.w;
        bng.L = this.x;
        bng.M = this.y;
        bng.N = true;
    }
}
