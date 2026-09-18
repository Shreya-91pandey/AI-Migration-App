import android.database.sqlite.SQLiteDatabase$CursorFactory;
import java.util.Arrays;
import android.database.Cursor;

public final class m5n extends o5n
{
    public double[] A;
    public String[] B;
    public byte[][] C;
    public Cursor D;
    public int[] y;
    public long[] z;
    
    public m5n(final vsa vsa, final String s) {
        super(vsa, s);
        this.y = new int[0];
        this.z = new long[0];
        this.A = new double[0];
        this.B = new String[0];
        this.C = new byte[0][];
    }
    
    public static void p(final Cursor cursor, final int n) {
        if (n >= 0 && n < cursor.getColumnCount()) {
            return;
        }
        tiq.l(25, "column index out of range");
        throw null;
    }
    
    @Override
    public final void U(final int n, final String s) {
        this.c();
        this.g(3, n);
        this.y[n] = 3;
        this.B[n] = s;
    }
    
    @Override
    public final boolean Z0() {
        this.c();
        this.n();
        final Cursor d = this.D;
        if (d != null) {
            return d.moveToNext();
        }
        en9.q("Required value was null.");
        return false;
    }
    
    public final void close() {
        if (!super.x) {
            this.o();
            this.reset();
        }
        super.x = true;
    }
    
    public final void g(final int n, int n2) {
        ++n2;
        final int[] y = this.y;
        if (y.length < n2) {
            this.y = Arrays.copyOf(y, n2);
        }
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        final byte[][] c = this.C;
                        if (c.length < n2) {
                            this.C = (byte[][])Arrays.copyOf((Object[])c, n2);
                        }
                    }
                }
                else {
                    final String[] b = this.B;
                    if (b.length < n2) {
                        this.B = (String[])Arrays.copyOf((Object[])b, n2);
                    }
                }
            }
            else {
                final double[] a = this.A;
                if (a.length < n2) {
                    this.A = Arrays.copyOf(a, n2);
                }
            }
        }
        else {
            final long[] z = this.z;
            if (z.length < n2) {
                this.z = Arrays.copyOf(z, n2);
            }
        }
    }
    
    @Override
    public final byte[] getBlob(final int n) {
        this.c();
        final Cursor q = this.q();
        p(q, n);
        final byte[] blob = q.getBlob(n);
        blob.getClass();
        return blob;
    }
    
    @Override
    public final int getColumnCount() {
        this.c();
        this.n();
        final Cursor d = this.D;
        if (d != null) {
            return d.getColumnCount();
        }
        return 0;
    }
    
    @Override
    public final String getColumnName(final int n) {
        this.c();
        this.n();
        final Cursor d = this.D;
        if (d != null) {
            p(d, n);
            final String columnName = d.getColumnName(n);
            columnName.getClass();
            return columnName;
        }
        en9.q("Required value was null.");
        return null;
    }
    
    @Override
    public final long getLong(final int n) {
        this.c();
        final Cursor q = this.q();
        p(q, n);
        return q.getLong(n);
    }
    
    @Override
    public final boolean isNull(final int n) {
        this.c();
        final Cursor q = this.q();
        p(q, n);
        return q.isNull(n);
    }
    
    @Override
    public final void k(final int n, final long n2) {
        this.c();
        this.g(1, n);
        this.y[n] = 1;
        this.z[n] = n2;
    }
    
    @Override
    public final void l(final byte[] array, final int n) {
        this.c();
        this.g(4, n);
        this.y[n] = 4;
        this.C[n] = array;
    }
    
    @Override
    public final void m(final int n) {
        this.c();
        this.g(5, n);
        this.y[n] = 5;
    }
    
    public final void n() {
        if (this.D == null) {
            final hdk hdk = new hdk((Object)this);
            final vsa v = super.v;
            v.getClass();
            final Cursor rawQueryWithFactory = v.v.rawQueryWithFactory((SQLiteDatabase$CursorFactory)new usa(new d90((Object)hdk, (byte)1)), ((m5n)hdk.v).w, vsa.x, (String)null);
            rawQueryWithFactory.getClass();
            this.D = rawQueryWithFactory;
        }
    }
    
    @Override
    public final void o() {
        this.c();
        this.y = new int[0];
        this.z = new long[0];
        this.A = new double[0];
        this.B = new String[0];
        this.C = new byte[0][];
    }
    
    public final Cursor q() {
        final Cursor d = this.D;
        if (d != null) {
            return d;
        }
        tiq.l(21, "no row");
        throw null;
    }
    
    @Override
    public final void reset() {
        this.c();
        final Cursor d = this.D;
        if (d != null) {
            d.close();
        }
        this.D = null;
    }
    
    @Override
    public final String t0(final int n) {
        this.c();
        final Cursor q = this.q();
        p(q, n);
        final String string = q.getString(n);
        string.getClass();
        return string;
    }
}
