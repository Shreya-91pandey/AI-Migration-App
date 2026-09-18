import android.os.Build$VERSION;
import android.view.DisplayCutout;

public final class yo8
{
    public final DisplayCutout a;
    
    public yo8(final DisplayCutout a) {
        this.a = a;
    }
    
    public final dec a() {
        if (Build$VERSION.SDK_INT >= 30) {
            return dec.d(r4.d(this.a));
        }
        return dec.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && yo8.class == o.getClass() && this.a.equals(((yo8)o).a));
    }
    
    @Override
    public final int hashCode() {
        return l4.D(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DisplayCutoutCompat{");
        sb.append((Object)this.a);
        sb.append("}");
        return sb.toString();
    }
}
