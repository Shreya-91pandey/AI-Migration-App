public final class wii extends ogf
{
    public final boolean v;
    public final jta w;
    public final boolean x;
    public final dji y;
    public final float z;
    
    public wii(final boolean v, final jta w, final boolean x, final dji y, final float z) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public final hgf create() {
        return (hgf)new cji(this.v, this.w, this.x, this.y, this.z);
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof wii) {
                final wii wii = (wii)o;
                if (this.v == wii.v) {
                    if (this.x == wii.x) {
                        if (this.w == wii.w) {
                            if (mlc.q((Object)this.y, (Object)wii.y)) {
                                if (qs8.e(this.z, wii.z)) {
                                    return true;
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
        return Float.hashCode(this.z) + (this.y.hashCode() + ca9.q(smk.l(Boolean.hashCode(this.v) * 31, 31, this.x), 31, this.w)) * 31;
    }
    
    public final void update(final hgf hgf) {
        final cji cji = (cji)hgf;
        cji.M = this.w;
        cji.N = this.x;
        cji.O = this.y;
        cji.P = this.z;
        final boolean l = cji.L;
        final boolean v = this.v;
        if (l != v) {
            cji.L = v;
            rhc.G(((hgf)cji).c1(), (hc7)null, 0, (zta)new m33((byte)8, (f07)null, (Object)cji), 3);
        }
    }
}
