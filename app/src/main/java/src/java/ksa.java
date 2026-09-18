import java.util.ArrayList;
import java.util.List;

public class ksa
{
    public final List a;
    public long b;
    public long c;
    public boolean d;
    public long e;
    
    public ksa(final ArrayList a) {
        this.a = (List)a;
        this.b = 0L;
        this.c = 0L;
        this.d = false;
        this.e = 0L;
    }
    
    public final boolean a(final Object o) {
        if (this != o) {
            final Class<? extends ksa> class1 = this.getClass();
            Class<?> class2;
            if (o != null) {
                class2 = o.getClass();
            }
            else {
                class2 = null;
            }
            if (class1.equals(class2)) {
                o.getClass();
                final ksa ksa = (ksa)o;
                if (this.b == ksa.b) {
                    if (this.c == ksa.c) {
                        if (this.d == ksa.d) {
                            if (this.a.equals(ksa.a)) {
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
    
    public final int b() {
        return this.a.hashCode() + smk.l(hia.d(Long.hashCode(this.b) * 31, this.c, 31), 31, this.d);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof ksa && this.a(o) && this.e == ((ksa)o).e;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.e) + this.b() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.b);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.c);
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.e);
        sb.append(", isJank=");
        sb.append(this.d);
        sb.append(", states=");
        sb.append((Object)this.a);
        sb.append(')');
        return sb.toString();
    }
}
