import android.net.NetworkRequest;

public final class ktf
{
    public static final String b;
    public final Object a;
    
    static {
        b = krd.e("NetworkRequestCompat");
    }
    
    public ktf(final NetworkRequest a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ktf && mlc.q(this.a, ((ktf)o).a));
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NetworkRequestCompat(wrapped=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
