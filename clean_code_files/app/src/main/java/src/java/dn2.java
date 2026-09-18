public final class dn2 extends o1
{
    public final Object[] y;
    
    public dn2(final Object[] y, final int n, final int n2) {
        super(n, n2, (byte)1);
        this.y = y;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            return this.y[super.w++];
        }
        oyl.r();
        return null;
    }
    
    public final Object previous() {
        if (this.hasPrevious()) {
            final int w = super.w - 1;
            super.w = w;
            return this.y[w];
        }
        oyl.r();
        return null;
    }
}
