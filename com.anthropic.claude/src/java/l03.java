import java.io.Serializable;

public abstract class l03 implements qtc, Serializable
{
    public final boolean A;
    public transient qtc v;
    public final Object w;
    public final Class x;
    public final String y;
    public final String z;
    
    public l03(final Object w, final Class x, final String y, final String z, final boolean a) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
    }
    
    public qtc c() {
        v4j.a.getClass();
        return this;
    }
    
    public final ns4 i() {
        final Class x = this.x;
        if (x == null) {
            return null;
        }
        if (this.A) {
            v4j.a.getClass();
            return (ns4)new umg(x);
        }
        return (ns4)v4j.a(x);
    }
}
