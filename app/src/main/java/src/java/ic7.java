public abstract class ic7 extends r0 implements fc7
{
    public ic7() {
        super((gc7)p3.x);
    }
    
    public final fc7 M0(final gc7 gc7) {
        if (gc7 instanceof s0) {
            if (super.v != gc7) {
                return null;
            }
            throw null;
        }
        else {
            if (p3.x == gc7) {
                return (fc7)this;
            }
            return null;
        }
    }
    
    public final hc7 c0(final gc7 gc7) {
        if (!(gc7 instanceof s0)) {
            Object v = this;
            if (p3.x == gc7) {
                v = o89.v;
            }
            return (hc7)v;
        }
        if (super.v != gc7) {
            return (hc7)this;
        }
        throw null;
    }
    
    public void g1(final hc7 hc7, final Runnable runnable) {
        rc7.x.g1(hc7, runnable);
    }
    
    public void h1(final hc7 hc7, final Runnable runnable) {
        po8.b(this, hc7, runnable);
    }
    
    public boolean i1(final hc7 hc7) {
        return this instanceof wpo ^ true;
    }
    
    public ic7 j1(final int n, final String s) {
        k8e.l(n);
        return (ic7)new hcd(this, n, s);
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append('@');
        sb.append(t08.L((Object)this));
        return sb.toString();
    }
}
