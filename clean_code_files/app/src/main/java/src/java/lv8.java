public final class lv8 extends ogf
{
    public static final yp7 D;
    public final bua A;
    public final bua B;
    public final boolean C;
    public final vv8 v;
    public final zhg w;
    public final boolean x;
    public final llf y;
    public final boolean z;
    
    static {
        D = new yp7((byte)19);
    }
    
    public lv8(final vv8 v, final zhg w, final boolean x, final llf y, final boolean z, final bua a, final bua b, final boolean c) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
    }
    
    public final hgf create() {
        final vu8 vu8 = new vu8((lta)lv8.D, this.x, this.y, this.w);
        ((uv8)vu8).e0 = this.v;
        ((uv8)vu8).f0 = this.z;
        ((uv8)vu8).g0 = this.A;
        ((uv8)vu8).h0 = this.B;
        ((uv8)vu8).i0 = this.C;
        return (hgf)vu8;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (lv8.class != o.getClass()) {
            return false;
        }
        final lv8 lv8 = (lv8)o;
        return mlc.q((Object)this.v, (Object)lv8.v) && this.w == lv8.w && this.x == lv8.x && mlc.q((Object)this.y, (Object)lv8.y) && this.z == lv8.z && mlc.q((Object)this.A, (Object)lv8.A) && mlc.q((Object)this.B, (Object)lv8.B) && this.C == lv8.C;
    }
    
    public final int hashCode() {
        final int l = smk.l((this.w.hashCode() + this.v.hashCode() * 31) * 31, 31, this.x);
        final llf y = this.y;
        int hashCode;
        if (y != null) {
            hashCode = y.hashCode();
        }
        else {
            hashCode = 0;
        }
        return Boolean.hashCode(this.C) + (this.B.hashCode() + (this.A.hashCode() + smk.l((l + hashCode) * 31, 31, this.z)) * 31) * 31;
    }
    
    public final void update(final hgf hgf) {
        final uv8 uv8 = (uv8)hgf;
        final vv8 e0 = uv8.e0;
        final vv8 v = this.v;
        boolean b;
        if (!mlc.q((Object)e0, (Object)v)) {
            uv8.e0 = v;
            b = true;
        }
        else {
            b = false;
        }
        final boolean i0 = uv8.i0;
        final boolean c = this.C;
        if (i0 != c) {
            uv8.i0 = c;
            b = true;
        }
        uv8.g0 = this.A;
        uv8.h0 = this.B;
        uv8.f0 = this.z;
        uv8.I1((lta)lv8.D, this.x, this.y, this.w, b);
    }
}
