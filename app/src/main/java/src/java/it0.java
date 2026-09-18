public interface it0
{
    void a(final int p0, final Object p1);
    
    void b(final Object p0);
    
    default void c() {
        final Object j = this.j();
        kh6 kh6;
        if (j instanceof kh6) {
            kh6 = (kh6)j;
        }
        else {
            kh6 = null;
        }
        if (kh6 != null) {
            kh6.i();
        }
    }
    
    void d(final int p0, final int p1, final int p2);
    
    void e(final int p0, final int p1);
    
    void g();
    
    void h(final int p0, final Object p1);
    
    default void i() {
    }
    
    Object j();
    
    default void k(final zta zta, final Object o) {
        zta.d(this.j(), o);
    }
}
