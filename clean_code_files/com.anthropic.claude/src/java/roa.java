import java.util.Arrays;

public final class roa implements poa
{
    public final float[] a;
    public final float[] b;
    
    public roa(final float[] a, final float[] b) {
        if (a.length == b.length && a.length != 0) {
            this.a = a;
            this.b = b;
            return;
        }
        en9.s("Array lengths must match and be nonzero");
        throw null;
    }
    
    @Override
    public final float a(final float n) {
        return ach.W(n, this.b, this.a);
    }
    
    @Override
    public final float b(final float n) {
        return ach.W(n, this.a, this.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (o instanceof roa) {
                    final roa roa = (roa)o;
                    if (Arrays.equals(this.a, roa.a) && Arrays.equals(this.b, roa.b)) {
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
        return Arrays.hashCode(this.b) + Arrays.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final String string = Arrays.toString(this.a);
        string.getClass();
        final String string2 = Arrays.toString(this.b);
        string2.getClass();
        final StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        sb.append(string);
        sb.append(", toDpValues=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
