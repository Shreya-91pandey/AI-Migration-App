public final class lv2 extends hgf implements k5g, vn2, bw8
{
    public final nv2 J;
    public boolean K;
    public lta L;
    
    public lv2(final nv2 j, final lta l) {
        this.J = j;
        this.L = l;
        j.v = (vn2)this;
    }
    
    public final void F0() {
        this.o1();
    }
    
    public final void I0(final k0d k0d) {
        final boolean k = this.K;
        final nv2 j = this.J;
        if (!k) {
            j.w = null;
            yi2.I((hgf)this, (jta)new jd0((Object)this, (Object)j, (byte)11));
            if (j.w == null) {
                throw ge9.x("DrawResult not defined, did you forget to call onDraw?");
            }
            this.K = true;
        }
        final r70 w = j.w;
        w.getClass();
        ((lta)w.w).b((Object)k0d);
    }
    
    public final void b0() {
        this.o1();
    }
    
    public final void f() {
        this.o1();
    }
    
    public final xc8 getDensity() {
        return soh.L((t98)this).U;
    }
    
    public final qzc getLayoutDirection() {
        return soh.L((t98)this).V;
    }
    
    public final void h0() {
        this.o1();
    }
    
    public final void h1() {
    }
    
    public final long i() {
        return uoo.Z(soh.J((t98)this, 4).x);
    }
    
    public final void i1() {
        this.o1();
    }
    
    public final void o1() {
        this.K = false;
        this.J.w = null;
        x90.z((bw8)this);
    }
}
