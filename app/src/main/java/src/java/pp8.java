public final class pp8
{
    public final op8 a;
    
    static {
        new pp8("", 0, 0);
    }
    
    public pp8(final String s, final int n, final int n2) {
        this.a = new op8(s, n, n2);
    }
    
    public static pp8 a(final int n, final int n2, final boolean b, int min, int min2, int min3, int min4) {
        String s;
        if (b) {
            min = n / 2;
            min2 = n2 / 2;
            final StringBuilder o = hia.o(min2, min, "M0,", " A", ",");
            xc2.m(min2, n, " 0 1,1 ", ",", o);
            xc2.m(min2, min, " A", ",", o);
            s = rua.h(min2, min2, " 0 1,1 0,", " Z", o);
        }
        else {
            final StringBuilder sb = new StringBuilder("M ");
            final int min5 = Math.min(n / 2, n2 / 2);
            min = Math.min(min5, min);
            min2 = Math.min(min5, min2);
            min3 = Math.min(min5, min3);
            min4 = Math.min(min5, min4);
            sb.append(min);
            sb.append(",0 L ");
            sb.append(n - min2);
            sb.append(",0");
            if (min2 > 0) {
                t.p(min2, min2, " A ", ",", sb);
                t.p(n, min2, " 0 0,1 ", ",", sb);
            }
            sb.append(" L ");
            sb.append(n);
            sb.append(",");
            sb.append(n2 - min3);
            if (min3 > 0) {
                t.p(min3, min3, " A ", ",", sb);
                sb.append(" 0 0,1 ");
                sb.append(n - min3);
                sb.append(",");
                sb.append(n2);
            }
            t.p(min4, n2, " L ", ",", sb);
            if (min4 > 0) {
                t.p(min4, min4, " A ", ",", sb);
                sb.append(" 0 0,1 0,");
                sb.append(n2 - min4);
            }
            if (min > 0) {
                t.p(min, min, " L 0,", " A ", sb);
                t.p(min, min, ",", " 0 0,1 ", sb);
                sb.append(",0");
            }
            sb.append(" Z");
            s = sb.toString();
        }
        return new pp8(s, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof pp8 && this.a.equals((Object)((pp8)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
