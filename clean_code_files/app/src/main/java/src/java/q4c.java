import android.content.res.Resources$Theme;

public final class q4c
{
    public final Resources$Theme a;
    public final int b;
    
    public q4c(final Resources$Theme a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q4c)) {
            return false;
        }
        final q4c q4c = (q4c)o;
        return mlc.q((Object)this.a, (Object)q4c.a) && this.b == q4c.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append((Object)this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
