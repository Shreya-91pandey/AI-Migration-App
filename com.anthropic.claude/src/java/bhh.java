import java.util.ArrayList;

public final class bhh
{
    public final boolean a;
    public final ArrayList b;
    
    public bhh(final ArrayList b, final boolean a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof bhh) {
                final bhh bhh = (bhh)o;
                if (this.a == bhh.a) {
                    if (this.b.equals(bhh.b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Boolean.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final String n0 = c86.N0((Iterable)this.b, (CharSequence)", ", (String)null, (String)null, (lta)null, 62);
        final StringBuilder sb = new StringBuilder("Posture(isTabletop=");
        sb.append(this.a);
        sb.append(", hinges=[");
        sb.append(n0);
        sb.append("])");
        return sb.toString();
    }
}
