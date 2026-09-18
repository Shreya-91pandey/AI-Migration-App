public final class b0j
{
    public c0j a;
    public int b;
    public bva c;
    public zta d;
    public int e;
    public amf f;
    public tmf g;
    
    public b0j(final c0j a) {
        this.a = a;
    }
    
    public final boolean a() {
        if (this.a != null) {
            final bva c = this.c;
            if (c != null && c.a()) {
                return true;
            }
        }
        return false;
    }
    
    public final int b(final Object o) {
        final c0j a = this.a;
        if (a != null) {
            final int d = a.d(this, o);
            if (d != 0) {
                return d;
            }
        }
        return 1;
    }
    
    public final void c() {
        final c0j a = this.a;
        if (a != null) {
            a.b();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }
    
    public final void d(final boolean b) {
        final int b2 = this.b;
        int b3;
        if (b) {
            b3 = (b2 | 0x20);
        }
        else {
            b3 = (b2 & 0xFFFFFFDF);
        }
        this.b = b3;
    }
    
    public final void e(final zta d) {
        this.d = d;
    }
}
