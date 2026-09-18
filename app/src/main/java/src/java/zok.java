final class zok extends ogf
{
    public final iuj A;
    public final jta B;
    public final boolean v;
    public final llf w;
    public final a8c x;
    public final boolean y;
    public final boolean z;
    
    public zok(final boolean v, final llf w, final a8c x, final boolean y, final boolean z, final iuj a, final jta b) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
    }
    
    public final hgf create() {
        final h0 h0 = new h0(this.w, this.x, this.y, this.z, (String)null, this.A, this.B);
        ((cpk)h0).h0 = this.v;
        return (hgf)h0;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (zok.class == o.getClass()) {
                    final zok zok = (zok)o;
                    if (this.v == zok.v) {
                        if (mlc.q((Object)this.w, (Object)zok.w)) {
                            if (mlc.q((Object)this.x, (Object)zok.x)) {
                                if (this.y == zok.y) {
                                    if (this.z == zok.z) {
                                        if (mlc.q((Object)this.A, (Object)zok.A)) {
                                            if (this.B == zok.B) {
                                                return true;
                                            }
                                        }
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
        final int hashCode = Boolean.hashCode(this.v);
        final int n = 0;
        final llf w = this.w;
        int hashCode2;
        if (w != null) {
            hashCode2 = w.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final a8c x = this.x;
        int hashCode3;
        if (x != null) {
            hashCode3 = x.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int l = smk.l(smk.l(((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31, 31, this.y), 31, this.z);
        final iuj a = this.A;
        int hashCode4 = n;
        if (a != null) {
            hashCode4 = Integer.hashCode((int)a.a);
        }
        return this.B.hashCode() + (l + hashCode4) * 31;
    }
    
    public final void update(final hgf hgf) {
        final cpk cpk = (cpk)hgf;
        final boolean h0 = cpk.h0;
        final boolean v = this.v;
        if (h0 != v) {
            cpk.h0 = v;
            soh.L((t98)cpk).T();
        }
        ((h0)cpk).D1(this.w, this.x, this.y, this.z, (String)null, this.A, this.B);
    }
}
