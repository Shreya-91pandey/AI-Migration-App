import android.graphics.Shader;

public final class cam extends qm2
{
    public final long a;
    
    public cam(final long a) {
        this.a = a;
    }
    
    @Override
    public final void a(final float n, long n2, final y80 y80) {
        y80.d(1.0f);
        n2 = this.a;
        if (n != 1.0f) {
            n2 = j86.b(j86.c(n2) * n, n2);
        }
        y80.f(n2);
        if (y80.c != null) {
            y80.j(null);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof cam) {
                final long a = ((cam)o).a;
                final int i = j86.i;
                if (foo.a(this.a, a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int i = j86.i;
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return hia.k("SolidColor(value=", j86.h(this.a), ")");
    }
}
