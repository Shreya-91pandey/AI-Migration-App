import kotlinx.coroutines.TimeoutCancellationException;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.concurrent.CancellationException;

public final class q33 extends m6n implements bua
{
    public final byte w;
    public Throwable x;
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final jja jja = (jja)o;
        final Throwable x = (Throwable)o2;
        final f07 f07 = (f07)o3;
        switch (w) {
            default: {
                final q33 q33 = new q33(3, f07, (byte)2);
                q33.x = x;
                q33.invokeSuspend(a);
                return a;
            }
            case 1: {
                final q33 q34 = new q33(3, f07, (byte)1);
                q34.x = x;
                q34.invokeSuspend(a);
                return a;
            }
            case 0: {
                final q33 q35 = new q33(3, f07, (byte)0);
                q35.x = x;
                q35.invokeSuspend(a);
                return a;
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final Throwable x = this.x;
        switch (w) {
            default: {
                vt4.g0(o);
                if (!(x instanceof CancellationException)) {
                    SilentException.a(new SilentException("GrowthBook overrides observation failed", x), (lpl)null, (List)null, 7);
                    return a;
                }
                throw x;
            }
            case 1: {
                vt4.g0(o);
                if (x instanceof TimeoutCancellationException) {
                    return a;
                }
                final tqd l = uqd.l;
                throw x;
            }
            case 0: {
                vt4.g0(o);
                SilentException.a(new SilentException("Car connection unwatchable: ".concat(t4r.e(x))), lpl.w, (List)null, 6);
                return a;
            }
        }
    }
}
