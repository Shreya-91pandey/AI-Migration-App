import java.io.Closeable;

public final class l5n extends o5n
{
    public final zsa y;
    
    public l5n(final vsa vsa, final String s) {
        super(vsa, s);
        this.y = vsa.n(s);
    }
    
    @Override
    public final void U(final int n, final String s) {
        this.c();
        this.y.v(n, s);
    }
    
    @Override
    public final boolean Z0() {
        this.c();
        this.y.w.execute();
        return false;
    }
    
    public final void close() {
        ((Closeable)this.y).close();
        super.x = true;
    }
    
    @Override
    public final byte[] getBlob(final int n) {
        this.c();
        tiq.l(21, "no row");
        throw null;
    }
    
    @Override
    public final int getColumnCount() {
        this.c();
        return 0;
    }
    
    @Override
    public final String getColumnName(final int n) {
        this.c();
        tiq.l(21, "no row");
        throw null;
    }
    
    @Override
    public final long getLong(final int n) {
        this.c();
        tiq.l(21, "no row");
        throw null;
    }
    
    @Override
    public final boolean isNull(final int n) {
        this.c();
        tiq.l(21, "no row");
        throw null;
    }
    
    @Override
    public final void k(final int n, final long n2) {
        this.c();
        this.y.k(n, n2);
    }
    
    @Override
    public final void l(final byte[] array, final int n) {
        this.c();
        this.y.l(array, n);
    }
    
    @Override
    public final void m(final int n) {
        this.c();
        this.y.m(n);
    }
    
    @Override
    public final void o() {
        this.c();
        this.y.o();
    }
    
    @Override
    public final String t0(final int n) {
        this.c();
        tiq.l(21, "no row");
        throw null;
    }
}
