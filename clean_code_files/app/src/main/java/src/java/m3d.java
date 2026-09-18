public final class m3d
{
    public final int a;
    public final int b;
    
    public m3d(final int a, final int b) {
        this.a = a;
        this.b = b;
        final int n = 0;
        if (a < 0) {
            jac.a("negative start index");
        }
        int n2 = n;
        if (b >= a) {
            n2 = 1;
        }
        if (n2 == 0) {
            jac.a("end index greater than start");
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m3d)) {
            return false;
        }
        final m3d m3d = (m3d)o;
        return this.a == m3d.a && this.b == m3d.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return hia.g(this.a, this.b, "Interval(start=", ", end=", ")");
    }
}
