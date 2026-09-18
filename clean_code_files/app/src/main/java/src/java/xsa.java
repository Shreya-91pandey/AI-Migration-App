import android.database.sqlite.SQLiteOpenHelper;
import androidx.sqlite.db.framework.a;
import android.content.Context;

public final class xsa implements i5n
{
    public final l7n A;
    public boolean B;
    public final Context v;
    public final String w;
    public final qd6 x;
    public final boolean y;
    public final boolean z;
    
    public xsa(final Context v, final String w, final qd6 x, final boolean y, final boolean z) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = new l7n((jta)new h87((Object)this, (byte)12));
    }
    
    public final void close() {
        final l7n a = this.A;
        if (a.b()) {
            ((a)a.getValue()).close();
        }
    }
    
    @Override
    public final String getDatabaseName() {
        return this.w;
    }
    
    @Override
    public final vsa k0() {
        return ((a)this.A.getValue()).c(true);
    }
    
    @Override
    public final void setWriteAheadLoggingEnabled(final boolean b) {
        final l7n a = this.A;
        if (a.b()) {
            ((SQLiteOpenHelper)a.getValue()).setWriteAheadLoggingEnabled(b);
        }
        this.B = b;
    }
}
