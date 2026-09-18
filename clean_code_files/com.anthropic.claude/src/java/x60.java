import android.content.Context;

public final class x60
{
    public final Context a;
    public final xc8 b;
    public final long c;
    public final hng d;
    
    public x60(final Context a, final xc8 b, final long c, final hng d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            Class<?> class1;
            if (o != null) {
                class1 = o.getClass();
            }
            else {
                class1 = null;
            }
            if (x60.class.equals(class1)) {
                o.getClass();
                final x60 x60 = (x60)o;
                if (mlc.q(this.a, x60.a)) {
                    if (mlc.q(this.b, x60.b)) {
                        final long c = x60.c;
                        final int i = j86.i;
                        if (foo.a(this.c, c)) {
                            if (this.d.equals((Object)x60.d)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int i = j86.i;
        return this.d.hashCode() + hia.d((hashCode2 + hashCode * 31) * 31, this.c, 31);
    }
}
