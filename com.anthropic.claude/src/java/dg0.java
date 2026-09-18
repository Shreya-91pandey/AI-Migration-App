public final class dg0 implements xom
{
    public boolean A;
    public final dlo v;
    public final ksg w;
    public ig0 x;
    public long y;
    public long z;
    
    public dg0(final dlo v, final Object o, final ig0 ig0, final long y, final long z, final boolean a) {
        this.v = v;
        this.w = o50.Q(o);
        ig0 n;
        if (ig0 != null) {
            n = rml.n(ig0);
        }
        else {
            n = (ig0)v.a().b(o);
            n.d();
        }
        this.x = n;
        this.y = y;
        this.z = z;
        this.A = a;
    }
    
    public final Object a() {
        return this.v.b().b(this.x);
    }
    
    @Override
    public final Object getValue() {
        return this.w.getValue();
    }
    
    @Override
    public final String toString() {
        final Object value = this.w.getValue();
        final Object a = this.a();
        final boolean a2 = this.A;
        final long y = this.y;
        final long z = this.z;
        final StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(value);
        sb.append(", velocity=");
        sb.append(a);
        sb.append(", isRunning=");
        sb.append(a2);
        sb.append(", lastFrameTimeNanos=");
        sb.append(y);
        sb.append(", finishedTimeNanos=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
