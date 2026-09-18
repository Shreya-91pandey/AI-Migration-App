import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;

public final class uhb implements bx7
{
    public final jqc a;
    public final gy7 b;
    public final hhb c;
    
    public uhb(final jqc a, final gy7 b, final hhb c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static void a(final Exception ex, final String s) {
        try {
            final StringBuilder sb = new StringBuilder("Health-metric ");
            sb.append(s);
            sb.append(" sink failed");
            SilentException.a(new SilentException(sb.toString(), (Throwable)ex), lpl.w, (List)null, 6);
        }
        catch (final Exception ex) {
            final tqd l = uqd.l;
        }
    }
}
