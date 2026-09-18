import java.util.concurrent.CancellationException;
import com.anthropic.claude.db.ClaudeDatabase;

public final class b37
{
    public final ClaudeDatabase a;
    public final e6c b;
    
    public b37(final uy7 uy7) {
        this.a = (ClaudeDatabase)uy7.v;
        this.b = (e6c)uy7.w;
    }
    
    public final Object a(jta w, lta lta, h07 w2) {
        Object o = null;
        Label_0052: {
            if (w2 instanceof z27) {
                o = w2;
                final int z = ((z27)o).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((z27)o).z = z + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            o = new z27(this, w2);
        }
        final Object x = ((z27)o).x;
        final int z2 = ((z27)o).z;
        if (z2 == 0 || z2 != 1) {
            goto Label_0117;
        }
        w = (jta)((z27)o).w;
        final Object v = ((z27)o).v;
        lta = (lta)w;
        w2 = (h07)v;
        Label_0190: {
            try {
                vt4.g0(x);
                w2 = (h07)v;
                break Label_0190;
            }
            catch (final Exception ex) {
                goto Label_0209;
            }
            catch (final CancellationException ex2) {
                throw ex2;
            }
            try {
                final ClaudeDatabase a = this.a;
                final a37 a2 = new a37(lta, (f07)null, (byte)0);
                ((z27)o).v = w;
                ((z27)o).w = (x3j)w2;
                ((z27)o).z = 1;
                final Object z3 = qt7.Z((quj)a, (zta)a2, (h07)o);
                final pc7 v2 = pc7.v;
                if (z3 == v2) {
                    return v2;
                }
                final Object o2 = w2;
                w2 = (h07)w;
                w = (jta)o2;
                ((x3j)w).v = true;
                goto Label_0238;
            }
            catch (final Exception ex3) {}
        }
    }
}
