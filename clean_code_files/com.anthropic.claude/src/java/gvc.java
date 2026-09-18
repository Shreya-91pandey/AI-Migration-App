public final class gvc
{
    public static final gvc g;
    public final lta a;
    public final lta b;
    public final lta c;
    public final lta d;
    public final lta e;
    public final lta f;
    
    static {
        g = new gvc(null, null, null, 63);
    }
    
    public gvc(final lta a, final lta b, final lta c, final lta d, final lta e, final lta f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gvc)) {
            return false;
        }
        final gvc gvc = (gvc)o;
        return this.a == gvc.a && this.b == gvc.b && this.c == gvc.c && this.d == gvc.d && this.e == gvc.e && this.f == gvc.f;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final lta a = this.a;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final lta b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final lta c = this.c;
        int hashCode4;
        if (c != null) {
            hashCode4 = c.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final lta d = this.d;
        int hashCode5;
        if (d != null) {
            hashCode5 = d.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final lta e = this.e;
        int hashCode6;
        if (e != null) {
            hashCode6 = e.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final lta f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
}
