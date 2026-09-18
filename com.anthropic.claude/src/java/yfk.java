final class yfk extends ogf
{
    public final llf A;
    public final mgk v;
    public final zhg w;
    public final boolean x;
    public final boolean y;
    public final gia z;
    
    public yfk(final mgk v, final zhg w, final boolean x, final boolean y, final gia z, final llf a) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
    }
    
    public final hgf create() {
        return (hgf)new lgk((w60)null, (yl2)null, this.z, this.A, this.w, this.v, this.x, this.y);
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof yfk) {
                final yfk yfk = (yfk)o;
                if (mlc.q((Object)this.v, (Object)yfk.v)) {
                    if (this.w == yfk.w) {
                        if (this.x == yfk.x) {
                            if (this.y == yfk.y) {
                                if (mlc.q((Object)this.z, (Object)yfk.z)) {
                                    if (mlc.q((Object)this.A, (Object)yfk.A)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        final int l = smk.l(smk.l((this.w.hashCode() + this.v.hashCode() * 31) * 961, 31, this.x), 31, this.y);
        int hashCode = 0;
        final gia z = this.z;
        int hashCode2;
        if (z != null) {
            hashCode2 = z.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final llf a = this.A;
        if (a != null) {
            hashCode = a.hashCode();
        }
        return ((l + hashCode2) * 31 + hashCode) * 31;
    }
    
    public final void update(final hgf hgf) {
        ((lgk)hgf).J1((w60)null, (yl2)null, this.z, this.A, this.w, this.v, this.x, this.y);
    }
}
