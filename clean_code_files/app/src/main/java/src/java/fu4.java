import java.io.Closeable;
import com.anthropic.claude.api.errors.a;

public final class fu4
{
    public final jqc a;
    
    public fu4(final jqc a) {
        this.a = a;
    }
    
    public final eu4 a(final int n, final qn2 qn2, final iy4 iy4) {
        if (iy4.a() && n != 429) {
            return (eu4)com.anthropic.claude.api.errors.a.b(n);
        }
        return com.anthropic.claude.api.errors.a.a(this.a, n, com.anthropic.claude.api.errors.a.c(qn2), iy4, qn2.I() ^ true);
    }
    
    public final eu4 b(final snj snj) {
        final unj b = snj.B;
        try {
            final eu4 a = this.a(snj.y, b.Y0(), pbr.j(snj));
            ((Closeable)b).close();
            return a;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                zn2.r((Closeable)b, t);
            }
        }
    }
}
