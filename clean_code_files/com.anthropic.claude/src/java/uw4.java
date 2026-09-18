import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;

public final class uw4 extends r0 implements jc7
{
    public final byte w;
    
    private final void g1(final hc7 hc7, final Throwable t) {
    }
    
    private final void h1(final hc7 hc7, final Throwable t) {
    }
    
    public final void Q(final hc7 hc7, final Throwable t) {
        switch (this.w) {
            default: {
                final ycn y = zcn.y;
                if (y != null) {
                    final StringBuilder sb = new StringBuilder("Caught Exception in Telemetry Scope: ");
                    sb.append(t.getMessage());
                    y.b((Object)new Exception(sb.toString(), t));
                }
                return;
            }
            case 3: {
                soh.Q(t);
                ifc.v((s10)null, t, "Caught Exception in Analytics Scope", "analytics_mobile.invoke.error", (lta)new gwb((Object)t, (byte)15));
            }
            case 1:
            case 2: {
                return;
            }
            case 0: {
                SilentException.a(new SilentException("Async app initializer failed", t), (lpl)null, (List)null, 7);
            }
        }
    }
}
