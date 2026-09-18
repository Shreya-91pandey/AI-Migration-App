import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

public final class vsa implements Closeable
{
    public static final String[] w;
    public static final String[] x;
    public static final d2d y;
    public static final d2d z;
    public final SQLiteDatabase v;
    
    static {
        w = new String[] { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
        x = new String[0];
        y = ncq.F(2, (jta)new ux8((byte)22));
        z = ncq.F(2, (jta)new ux8((byte)23));
    }
    
    public vsa(final SQLiteDatabase v) {
        this.v = v;
    }
    
    public final boolean H0() {
        return this.v.inTransaction();
    }
    
    public final void L() {
        this.v.setTransactionSuccessful();
    }
    
    public final void c() {
        this.v.beginTransaction();
    }
    
    public final void close() {
        ((SQLiteClosable)this.v).close();
    }
    
    public final void g() {
        this.v.beginTransactionNonExclusive();
    }
    
    public final boolean isOpen() {
        return this.v.isOpen();
    }
    
    public final zsa n(final String s) {
        final SQLiteStatement compileStatement = this.v.compileStatement(s);
        compileStatement.getClass();
        return new zsa(compileStatement);
    }
    
    public final void p() {
        this.v.endTransaction();
    }
    
    public final void q(final String s) {
        this.v.execSQL(s);
    }
    
    public final void t(final Object[] array) {
        this.v.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", array);
    }
}
