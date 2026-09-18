import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public final class b48
{
    public final List a;
    public final float[] b;
    public final int c;
    
    public b48(final List a, final float[] b) {
        this.a = a;
        this.b = b;
        if (a.size() != b.length) {
            final int length = b.length;
            Object o;
            if (length != 0) {
                int n = 0;
                if (length != 1) {
                    final ArrayList list = new ArrayList(b.length);
                    final int length2 = b.length;
                    while (true) {
                        o = list;
                        if (n >= length2) {
                            break;
                        }
                        list.add((Object)b[n]);
                        ++n;
                    }
                }
                else {
                    o = lq6.X((Object)b[0]);
                }
            }
            else {
                o = r89.v;
            }
            final StringBuilder sb = new StringBuilder("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: ");
            sb.append((Object)a);
            sb.append(" | Anchors: ");
            sb.append(o);
            jac.a(sb.toString());
        }
        this.c = this.b.length;
    }
    
    public final Object a(final float n) {
        final float[] b = this.b;
        final int length = b.length;
        float n2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int n3 = -1;
        float n5;
        for (int n4 = 0; i < length; ++i, ++n4, n2 = n5) {
            final float abs = Math.abs(n - b[i]);
            n5 = n2;
            if (abs <= n2) {
                n3 = n4;
                n5 = abs;
            }
        }
        if (n3 == -1) {
            return null;
        }
        return this.a.get(n3);
    }
    
    public final Object b(final float n, final boolean b) {
        final float[] b2 = this.b;
        final int length = b2.length;
        int i = 0;
        int n2 = -1;
        float n3 = Float.POSITIVE_INFINITY;
        float n8;
        for (int n4 = 0; i < length; ++i, ++n4, n3 = n8) {
            final float n5 = b2[i];
            float n6;
            if (b) {
                n6 = n5 - n;
            }
            else {
                n6 = n - n5;
            }
            float n7 = n6;
            if (n6 < 0.0f) {
                n7 = Float.POSITIVE_INFINITY;
            }
            n8 = n3;
            if (n7 <= n3) {
                n2 = n4;
                n8 = n7;
            }
        }
        if (n2 == -1) {
            return null;
        }
        return this.a.get(n2);
    }
    
    public final boolean c(final Object o) {
        return this.a.indexOf(o) != -1;
    }
    
    public final float d() {
        final float[] b = this.b;
        if (b.length == 0) {
            return Float.NaN;
        }
        float n = b[0];
        int length = b.length;
        int n2 = 1;
        --length;
        float max = n;
        if (1 <= length) {
            while (true) {
                n = (max = Math.max(n, b[n2]));
                if (n2 == length) {
                    break;
                }
                ++n2;
            }
        }
        return max;
    }
    
    public final float e() {
        final float[] b = this.b;
        if (b.length == 0) {
            return Float.NaN;
        }
        float n = b[0];
        int length = b.length;
        int n2 = 1;
        --length;
        float min = n;
        if (1 <= length) {
            while (true) {
                n = (min = Math.min(n, b[n2]));
                if (n2 == length) {
                    break;
                }
                ++n2;
            }
        }
        return min;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof b48) {
                final b48 b48 = (b48)o;
                if (this.a.equals(b48.a)) {
                    if (Arrays.equals(this.b, b48.b)) {
                        if (this.c == b48.c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final float f(final Object o) {
        final int index = this.a.indexOf(o);
        if (index >= 0) {
            final float[] b = this.b;
            if (index < b.length) {
                return b[index];
            }
        }
        return Float.NaN;
    }
    
    @Override
    public final int hashCode() {
        return (Arrays.hashCode(this.b) + this.a.hashCode() * 31) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int n = 0;
        while (true) {
            final int c = this.c;
            if (n >= c) {
                break;
            }
            final Object j0 = c86.J0(n, this.a);
            float n2 = 0.0f;
            Label_0061: {
                if (n >= 0) {
                    final float[] b = this.b;
                    if (n < b.length) {
                        n2 = b[n];
                        break Label_0061;
                    }
                }
                n2 = Float.NaN;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(j0);
            sb2.append("=");
            sb2.append(n2);
            sb.append(sb2.toString());
            if (n < c - 1) {
                sb.append(", ");
            }
            ++n;
        }
        sb.append("})");
        return sb.toString();
    }
}
