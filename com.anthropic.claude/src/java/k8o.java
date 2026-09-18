public interface k8o
{
    default int a() {
        if (this.isVisible() && this.c(null, (lef)kef.a)) {
            return 1;
        }
        return 0;
    }
    
    boolean c(final String p0, final lef p1);
    
    int e(final String p0, final lef p1);
    
    boolean g();
    
    default l8o h(final String s, final lef lef) {
        final int e = this.e(s, lef);
        return new l8o(e, this.isVisible(), this.g() && e == 0, this.c(s, lef));
    }
    
    boolean isVisible();
}
