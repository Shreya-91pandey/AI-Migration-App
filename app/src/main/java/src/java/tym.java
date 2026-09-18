public final class tym extends dw8
{
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final ivg e;
    
    public tym(final float a, float b, int c, int d, h90 e, final int n) {
        if ((n & 0x2) != 0x0) {
            b = 4.0f;
        }
        if ((n & 0x4) != 0x0) {
            c = 0;
        }
        if ((n & 0x8) != 0x0) {
            d = 0;
        }
        if ((n & 0x10) != 0x0) {
            e = null;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (ivg)e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tym)) {
            return false;
        }
        final tym tym = (tym)o;
        return this.a == tym.a && this.b == tym.b && this.c == tym.c && this.d == tym.d && mlc.q((Object)this.e, (Object)tym.e);
    }
    
    @Override
    public final int hashCode() {
        final int y = hia.y(this.d, hia.y(this.c, oz1.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        final ivg e = this.e;
        int hashCode;
        if (e != null) {
            hashCode = e.hashCode();
        }
        else {
            hashCode = 0;
        }
        return y + hashCode;
    }
    
    @Override
    public final String toString() {
        String s = "Unknown";
        final int c = this.c;
        String s2;
        if (c == 0) {
            s2 = "Butt";
        }
        else if (c == 1) {
            s2 = "Round";
        }
        else if (c == 2) {
            s2 = "Square";
        }
        else {
            s2 = "Unknown";
        }
        final int d = this.d;
        if (d == 0) {
            s = "Miter";
        }
        else if (d == 1) {
            s = "Round";
        }
        else if (d == 2) {
            s = "Bevel";
        }
        final StringBuilder r = hia.r("Stroke(width=", this.a, ", miter=", this.b, ", cap=");
        oz1.A(r, s2, ", join=", s, ", pathEffect=");
        r.append((Object)this.e);
        r.append(")");
        return r.toString();
    }
}
