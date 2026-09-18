import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteProgram;

public class ysa implements j5n
{
    public final SQLiteProgram v;
    
    public ysa(final SQLiteProgram v) {
        this.v = v;
    }
    
    public final void close() {
        ((SQLiteClosable)this.v).close();
    }
    
    @Override
    public final void k(final int n, final long n2) {
        this.v.bindLong(n, n2);
    }
    
    @Override
    public final void l(final byte[] array, final int n) {
        this.v.bindBlob(n, array);
    }
    
    @Override
    public final void m(final int n) {
        this.v.bindNull(n);
    }
    
    @Override
    public final void o() {
        this.v.clearBindings();
    }
    
    @Override
    public final void v(final int n, final String s) {
        this.v.bindString(n, s);
    }
    
    @Override
    public final void z0(final double n, final int n2) {
        this.v.bindDouble(n2, n);
    }
}
