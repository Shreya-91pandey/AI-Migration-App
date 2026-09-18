public final class sm2 implements oln
{
    public final opl a;
    public final float b;
    
    public sm2(final opl a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final float a() {
        return this.b;
    }
    
    @Override
    public final long b() {
        final int i = j86.i;
        return j86.h;
    }
    
    @Override
    public final qm2 c() {
        return (qm2)this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof sm2) {
                final sm2 sm2 = (sm2)o;
                if (this.a.equals(sm2.a)) {
                    if (Float.compare(this.b, sm2.b) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append((Object)this.a);
        sb.append(", alpha=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
