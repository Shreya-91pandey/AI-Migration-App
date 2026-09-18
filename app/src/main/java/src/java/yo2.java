import androidx.sqlite.driver.bundled.BundledSQLiteConnectionKt;

public final class yo2 implements t2k
{
    public final long v;
    public volatile boolean w;
    
    public yo2(final long v) {
        this.v = v;
    }
    
    @Override
    public final boolean H0() {
        if (!this.w) {
            return BundledSQLiteConnectionKt.b(this.v);
        }
        tiq.l(21, "connection is closed");
        throw null;
    }
    
    public final void close() {
        if (!this.w) {
            this.w = true;
            BundledSQLiteConnectionKt.a(this.v);
        }
    }
    
    @Override
    public final b3k d1(final String s) {
        if (!this.w) {
            return new bp2(BundledSQLiteConnectionKt.d(this.v, s));
        }
        tiq.l(21, "connection is closed");
        throw null;
    }
}
