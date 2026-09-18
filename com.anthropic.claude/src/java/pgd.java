public final class pgd
{
    public final Object a;
    public final Object b;
    
    public pgd() {
        final wab p = wab.P;
        this(p, p);
    }
    
    public pgd(final Object o) {
        this(o, wab.P);
    }
    
    public pgd(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
}
