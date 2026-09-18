import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class k6p extends m6p implements Iterable, stc
{
    public final float A;
    public final float B;
    public final float C;
    public final List D;
    public final ArrayList E;
    public final String v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;
    
    public k6p(final String v, final float w, final float x, final float y, final float z, final float a, final float b, final float c, final List d, final ArrayList e) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (o instanceof k6p) {
                    final k6p k6p = (k6p)o;
                    if (mlc.q((Object)this.v, (Object)k6p.v)) {
                        if (this.w == k6p.w && this.x == k6p.x && this.y == k6p.y && this.z == k6p.z && this.A == k6p.A && this.B == k6p.B && this.C == k6p.C) {
                            if (mlc.q((Object)this.D, (Object)k6p.D)) {
                                if (this.E.equals(k6p.E)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return this.E.hashCode() + smk.k(oz1.d(this.C, oz1.d(this.B, oz1.d(this.A, oz1.d(this.z, oz1.d(this.y, oz1.d(this.x, oz1.d(this.w, this.v.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.D);
    }
    
    public final Iterator iterator() {
        return (Iterator)new p3h(this);
    }
}
