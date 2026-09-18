import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;

public final class n5n extends o5n
{
    public final int y;
    
    public n5n(final vsa vsa, final String s, final int y) {
        super(vsa, s);
        this.y = y;
    }
    
    @Override
    public final void U(final int n, final String s) {
        this.c();
        tiq.l(25, "column index out of range");
        throw null;
    }
    
    @Override
    public final boolean Z0() {
        final int d = ge9.D(this.y);
        final vsa v = super.v;
        if (d != 0) {
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        if (d != 4) {
                            en9.r();
                            return false;
                        }
                        final Integer value = 0;
                        final SQLiteDatabase v2 = v.v;
                        final d2d z = vsa.z;
                        if (z.getValue() != null) {
                            final d2d y = vsa.y;
                            if (y.getValue() != null) {
                                final Method method = (Method)z.getValue();
                                method.getClass();
                                final Method method2 = (Method)y.getValue();
                                method2.getClass();
                                final Object invoke = method2.invoke((Object)v2, (Object[])null);
                                if (invoke != null) {
                                    method.invoke(invoke, new Object[] { value, null, value, null });
                                    return false;
                                }
                                en9.q("Required value was null.");
                                return false;
                            }
                        }
                        v.c();
                    }
                    else {
                        v.g();
                    }
                }
                else {
                    v.c();
                }
            }
            else {
                v.p();
            }
        }
        else {
            v.L();
            v.p();
        }
        return false;
    }
    
    public final void close() {
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
        tiq.l(25, "column index out of range");
        throw null;
    }
    
    @Override
    public final void l(final byte[] array, final int n) {
        this.c();
        tiq.l(25, "column index out of range");
        throw null;
    }
    
    @Override
    public final void m(final int n) {
        this.c();
        tiq.l(25, "column index out of range");
        throw null;
    }
    
    @Override
    public final String t0(final int n) {
        this.c();
        tiq.l(21, "no row");
        throw null;
    }
}
