import androidx.sqlite.driver.bundled.BundledSQLiteStatementKt;

public final class bp2 implements b3k
{
    public final long v;
    public volatile boolean w;
    
    public bp2(final long v) {
        this.v = v;
    }
    
    @Override
    public final void U(final int n, final String s) {
        this.c();
        BundledSQLiteStatementKt.d(this.v, n, s);
    }
    
    @Override
    public final boolean Z0() {
        this.c();
        return BundledSQLiteStatementKt.n(this.v);
    }
    
    public final void c() {
        if (!this.w) {
            return;
        }
        tiq.l(21, "statement is closed");
        throw null;
    }
    
    public final void close() {
        if (!this.w) {
            this.w = true;
            BundledSQLiteStatementKt.f(this.v);
        }
    }
    
    @Override
    public final byte[] getBlob(final int n) {
        this.c();
        return BundledSQLiteStatementKt.g(n, this.v);
    }
    
    @Override
    public final int getColumnCount() {
        this.c();
        return BundledSQLiteStatementKt.h(this.v);
    }
    
    @Override
    public final String getColumnName(final int n) {
        this.c();
        return BundledSQLiteStatementKt.i(n, this.v);
    }
    
    @Override
    public final long getLong(final int n) {
        this.c();
        return BundledSQLiteStatementKt.k(n, this.v);
    }
    
    @Override
    public final boolean isNull(final int n) {
        this.c();
        return BundledSQLiteStatementKt.j(n, this.v) == 5;
    }
    
    @Override
    public final void k(final int n, final long n2) {
        this.c();
        BundledSQLiteStatementKt.b(this.v, n, n2);
    }
    
    @Override
    public final void l(final byte[] array, final int n) {
        this.c();
        BundledSQLiteStatementKt.a(this.v, n, array);
    }
    
    @Override
    public final void m(final int n) {
        this.c();
        BundledSQLiteStatementKt.c(n, this.v);
    }
    
    @Override
    public final void o() {
        this.c();
        BundledSQLiteStatementKt.e(this.v);
    }
    
    @Override
    public final void reset() {
        this.c();
        BundledSQLiteStatementKt.m(this.v);
    }
    
    @Override
    public final String t0(final int n) {
        this.c();
        return BundledSQLiteStatementKt.l(n, this.v);
    }
}
