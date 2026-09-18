public final class ng0
{
    public final Object a;
    public final int b;
    public final int c;
    public final String d;
    
    public ng0(final int n, final int n2, final Object o) {
        this(n, n2, o, "");
    }
    
    public ng0(int b, final int c, final Object a, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (b <= c) {
            b = 1;
        }
        else {
            b = 0;
        }
        if (b == 0) {
            hac.a("Reversed range is not supported");
        }
    }
    
    public static ng0 a(final ng0 ng0, kg0 a, int b, int c, final int n) {
        if ((n & 0x1) != 0x0) {
            a = (kg0)ng0.a;
        }
        if ((n & 0x2) != 0x0) {
            b = ng0.b;
        }
        if ((n & 0x4) != 0x0) {
            c = ng0.c;
        }
        return new ng0(b, c, a, ng0.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ng0)) {
            return false;
        }
        final ng0 ng0 = (ng0)o;
        return mlc.q(this.a, ng0.a) && this.b == ng0.b && this.c == ng0.c && mlc.q((Object)this.d, (Object)ng0.d);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.d.hashCode() + hia.y(this.c, hia.y(this.b, hashCode * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
