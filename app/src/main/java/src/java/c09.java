public final class c09 implements lvi
{
    public int a;
    public final d09 b;
    
    public c09(final d09 b) {
        this.b = b;
    }
    
    @Override
    public final vec a(final vec vec) {
        final mvi a = this.b.a;
        final vec a2 = a.L.a(vec);
        c09 b = null;
        if (a2 == null) {
            return null;
        }
        final d09 x = rml.x(a);
        if (x != null) {
            b = x.b;
        }
        if (b == null) {
            return a2;
        }
        return b.a(a2);
    }
    
    @Override
    public final void b() {
        this.a = 0;
        this.b.a.L.b();
    }
    
    @Override
    public final void c() {
        final mvi a = this.b.a;
        final int a2 = this.a;
        int a3;
        if ((a3 = a2 - 1) < 0) {
            a3 = 0;
        }
        this.a = a3;
        if (a3 == 0 && a2 > 0) {
            a.L.c();
        }
        final d09 x = rml.x(a);
        c09 b;
        if (x != null) {
            b = x.b;
        }
        else {
            b = null;
        }
        if (b != null) {
            b.c();
        }
    }
    
    @Override
    public final void d() {
        final mvi a = this.b.a;
        final int a2 = this.a + 1;
        this.a = a2;
        if (a2 == 1) {
            a.L.d();
        }
        final d09 x = rml.x(a);
        c09 b;
        if (x != null) {
            b = x.b;
        }
        else {
            b = null;
        }
        if (b != null) {
            b.d();
        }
    }
    
    @Override
    public final void e() {
        this.b.a.L.e();
        this.a = 0;
    }
}
