public final class jln extends ogf
{
    public final mvc A;
    public final qmn v;
    public final peo w;
    public final mnn x;
    public final boolean y;
    public final zta z;
    
    public jln(final qmn v, final peo w, final mnn x, final boolean y, final zta z, final mvc a) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
    }
    
    public final hgf create() {
        return (hgf)new kln(this.v, this.w, this.x, this.y, this.z, this.A);
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof jln) {
                final jln jln = (jln)o;
                if (this.y == jln.y) {
                    if (mlc.q((Object)this.v, (Object)jln.v)) {
                        if (mlc.q((Object)this.w, (Object)jln.w)) {
                            if (mlc.q((Object)this.x, (Object)jln.x)) {
                                if (this.z == jln.z) {
                                    if (this.A.equals(jln.A)) {
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
        final int l = idn.l(this.x, (this.w.hashCode() + (this.v.hashCode() + Boolean.hashCode(this.y) * 31) * 31) * 31, 31);
        final zta z = this.z;
        int hashCode;
        if (z != null) {
            hashCode = z.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.A.hashCode() + (l + hashCode) * 31;
    }
    
    public final void update(final hgf hgf) {
        final kln kln = (kln)hgf;
        final qmn l = kln.L;
        final qmn v = this.v;
        kln.L = v;
        v.b = this.z;
        final boolean y = this.y;
        kln.M = y;
        v.a.v.setValue((Object)new zin(this.w, this.x, y, y ^ true, this.A.c == 4));
        if (!mlc.q((Object)l, (Object)v)) {
            kln.N.o1(v.h);
        }
    }
}
