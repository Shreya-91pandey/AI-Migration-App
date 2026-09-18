public final class ag0
{
    public final dg0 a;
    public final int b;
    
    public ag0(final int b, final dg0 a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        sb.append(t.u(this.b));
        sb.append(", endState=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
