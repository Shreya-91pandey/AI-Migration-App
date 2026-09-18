public final class i0h implements ec7
{
    public final float a;
    
    public i0h(final float a) {
        this.a = a;
        if (a >= 0.0f && a <= 100.0f) {
            return;
        }
        jac.a("The percent should be in the range of [0, 100]");
    }
    
    @Override
    public final float a(final long n, final xc8 xc8) {
        return this.a / 100.0f * yzl.c(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof i0h && Float.compare(this.a, ((i0h)o).a) == 0);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return tj0.j("CornerSize(size = ", this.a, "%)");
    }
}
