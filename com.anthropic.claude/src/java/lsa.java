public final class lsa extends ksa
{
    public long f;
    public long g;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof lsa && super.equals(o)) {
            final long f = this.f;
            final lsa lsa = (lsa)o;
            if (f == lsa.f && this.g == lsa.g) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.g) + (Long.hashCode(this.f) * 31 + super.hashCode() * 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(super.b);
        sb.append(", frameDurationUiNanos=");
        sb.append(super.c);
        sb.append(", frameDurationCpuNanos=");
        sb.append(super.e);
        sb.append(", frameDurationTotalNanos=");
        sb.append(this.f);
        sb.append(", frameOverrunNanos=");
        sb.append(this.g);
        sb.append(", isJank=");
        sb.append(super.d);
        sb.append(", states=");
        sb.append((Object)super.a);
        sb.append(')');
        return sb.toString();
    }
}
