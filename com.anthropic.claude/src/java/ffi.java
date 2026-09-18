public final class ffi
{
    public final sei a;
    public final boolean b;
    public final q8m c;
    public final lta d;
    public final boolean e;
    public final Object f;
    public boolean g;
    
    public ffi(final sei a, final Object f, final boolean b, final q8m c, final lta d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = true;
    }
    
    public final Object a() {
        if (this.b) {
            return null;
        }
        final Object f = this.f;
        if (f != null) {
            return f;
        }
        ti6.b("Unexpected form of a provided value");
        ebq.a();
        return null;
    }
}
