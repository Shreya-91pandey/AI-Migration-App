public final class rs8 implements ec7
{
    public final float a;
    
    public rs8(final float a) {
        this.a = a;
    }
    
    @Override
    public final float a(final long n, final xc8 xc8) {
        return xc8.w0(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof rs8) {
                if (qs8.e(this.a, ((rs8)o).a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return tj0.j("CornerSize(size = ", this.a, ".dp)");
    }
}
