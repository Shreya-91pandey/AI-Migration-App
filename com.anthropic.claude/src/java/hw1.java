public final class hw1 implements b3k
{
    public final b3k v;
    
    public hw1(final b3k v) {
        this.v = v;
    }
    
    @Override
    public final void U(final int n, final String s) {
        this.v.U(n, s);
    }
    
    @Override
    public final boolean W() {
        return this.v.W();
    }
    
    @Override
    public final boolean Z0() {
        return this.v.Z0();
    }
    
    public final void close() {
        final b3k v = this.v;
        v.reset();
        v.o();
    }
    
    @Override
    public final byte[] getBlob(final int n) {
        return this.v.getBlob(n);
    }
    
    @Override
    public final int getColumnCount() {
        return this.v.getColumnCount();
    }
    
    @Override
    public final String getColumnName(final int n) {
        return this.v.getColumnName(n);
    }
    
    @Override
    public final long getLong(final int n) {
        return this.v.getLong(n);
    }
    
    @Override
    public final boolean isNull(final int n) {
        return this.v.isNull(n);
    }
    
    @Override
    public final void k(final int n, final long n2) {
        this.v.k(n, n2);
    }
    
    @Override
    public final void l(final byte[] array, final int n) {
        this.v.l(array, n);
    }
    
    @Override
    public final void m(final int n) {
        this.v.m(n);
    }
    
    @Override
    public final void o() {
        this.v.o();
    }
    
    @Override
    public final void reset() {
        this.v.reset();
    }
    
    @Override
    public final String t0(final int n) {
        return this.v.t0(n);
    }
}
