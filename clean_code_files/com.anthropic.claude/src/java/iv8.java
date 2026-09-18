import java.util.Arrays;
import java.util.ArrayList;

public final class iv8
{
    public final ArrayList a;
    public float[] b;
    
    public iv8() {
        this.a = new ArrayList();
        final float[] b = new float[5];
        for (int i = 0; i < 5; ++i) {
            b[i] = Float.NaN;
        }
        this.b = b;
    }
    
    public final void a(final float n, final Object o) {
        final ArrayList a = this.a;
        a.add(o);
        if (this.b.length < a.size()) {
            this.b = Arrays.copyOf(this.b, a.size() + 2);
        }
        this.b[a.size() - 1] = n;
    }
}
