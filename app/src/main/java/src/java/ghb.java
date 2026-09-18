import java.util.concurrent.CancellationException;
import com.anthropic.claude.api.events.EventLoggingRequest;
import com.anthropic.claude.api.events.HealthMetricEventData;
import com.anthropic.claude.analytics.health.HealthMetricOutcome;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.health.HealthMetricReport;

public final class ghb extends m6n implements zta
{
    public Object w;
    public final HealthMetricReport x;
    public final hhb y;
    public final ch0 z;
    
    public ghb(final HealthMetricReport x, final hhb y, final ch0 z, final f07 f07) {
        this.x = x;
        this.y = y;
        this.z = z;
        super(2, f07);
    }
    
    public final f07 create(final Object w, final f07 f07) {
        final ghb ghb = new ghb(this.x, this.y, this.z, f07);
        ghb.w = w;
        return (f07)ghb;
    }
    
    public final Object d(final Object o, final Object o2) {
        final ghb ghb = (ghb)this.create(o, (f07)o2);
        final lqo a = lqo.a;
        ghb.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(Object o) {
        final HealthMetricReport x = this.x;
        final hhb y = this.y;
        final p9b f = y.f;
        final oc7 oc7 = (oc7)this.w;
        vt4.g0(o);
        while (true) {
            Label_0213: {
                try {
                    final String v = x.g.v;
                    final String a = y.d.a().a();
                    final hfc c = y.e.c();
                    final String u1 = kym.u1('.', v, v);
                    final String a2 = jrc.j(x90.N(y.a, (Object)x.a, (KSerializer)HealthMetricOutcome.Companion.serializer())).a();
                    final String c2 = x.c;
                    final w6j g = hhb.g;
                    o = new EventLoggingRequest.HealthMetric(new HealthMetricEventData(a, c, v, u1, a2, c2, o50.X(x.d), o50.X(x.b), o50.X(x.e), "1.260911.19", "android", x.f, x.h, x.i));
                    final ch0 z = this.z;
                    if (z != null) {
                        z.a((EventLoggingRequest)o);
                        break Label_0232;
                    }
                    break Label_0213;
                }
                catch (final Exception ex) {
                    try {
                        f.d((Object)"Health-metric event queueing failed", (Object)ex);
                        return lqo.a;
                    }
                    finally {}
                    f.d((Object)"Health-metric event dropped: no destination resolved", (Object)null);
                    continue;
                }
                catch (final CancellationException ex2) {}
            }
            break;
        }
    }
}
