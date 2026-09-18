import com.anthropic.claude.analytics.health.HealthMetricAction;
import java.util.concurrent.atomic.AtomicBoolean;

public final class xk0
{
    public static final pgf c;
    public final shb a;
    public final AtomicBoolean b;
    
    static {
        final p50 p50 = new p50((byte)27);
        final int a = gj0.a;
        c = new pgf((lta)p50);
    }
    
    public xk0(final shb a) {
        this.a = a;
        this.b = new AtomicBoolean(false);
    }
    
    public final void a(final dkj dkj, final String s, final Long n, final phb phb) {
        if (!this.b.compareAndSet(false, true)) {
            return;
        }
        shb.a(this.a, HealthMetricAction.I, dkj, s, (String)null, n, phb, (lhb)null, 72);
    }
}
