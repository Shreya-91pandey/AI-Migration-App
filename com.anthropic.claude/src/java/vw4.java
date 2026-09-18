import android.content.Context;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.AppStartEvents$BaselineProfileStatus;
import androidx.lifecycle.ProcessLifecycleOwner;

public final class vw4 extends m6n implements zta
{
    public final byte w;
    public final yw4 x;
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final yw4 x = this.x;
        switch (w) {
            default: {
                return (f07)new vw4(x, f07, (byte)4);
            }
            case 3: {
                return (f07)new vw4(x, f07, (byte)3);
            }
            case 2: {
                return (f07)new vw4(x, f07, (byte)2);
            }
            case 1: {
                return (f07)new vw4(x, f07, (byte)1);
            }
            case 0: {
                return (f07)new vw4(x, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final oc7 oc7 = (oc7)o;
        final f07 f07 = (f07)o2;
        switch (w) {
            default: {
                ((vw4)this.create(oc7, f07)).invokeSuspend(a);
                return a;
            }
            case 3: {
                ((vw4)this.create(oc7, f07)).invokeSuspend(a);
                return a;
            }
            case 2: {
                ((vw4)this.create(oc7, f07)).invokeSuspend(a);
                return a;
            }
            case 1: {
                ((vw4)this.create(oc7, f07)).invokeSuspend(a);
                return a;
            }
            case 0: {
                ((vw4)this.create(oc7, f07)).invokeSuspend(a);
                return a;
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final yw4 x = this.x;
        switch (w) {
            default: {
                vt4.g0(o);
                final p4g k = x.k;
                k.a.getValue();
                k.b.getValue();
                return a;
            }
            case 3: {
                vt4.g0(o);
                ProcessLifecycleOwner.D.A.a((fbd)x.l.getValue());
                return a;
            }
            case 2: {
                vt4.g0(o);
                final hth hth = (hth)((b3)ith.a).get();
                final st4 i = x.i;
                final AppStartEvents$BaselineProfileStatus appStartEvents$BaselineProfileStatus = new AppStartEvents$BaselineProfileStatus(hth.a, hth.b, hth.c);
                final KSerializer serializer = AppStartEvents$BaselineProfileStatus.Companion.serializer();
                vt4.b0(serializer);
                i.b((v10)appStartEvents$BaselineProfileStatus, (KSerializer)serializer);
                return a;
            }
            case 1: {
                vt4.g0(o);
                if (x.r.d() == null) {
                    final ArrayList e = eni.e;
                    c5q.J(x.a);
                }
                return a;
            }
            case 0: {
                vt4.g0(o);
                final Context a2 = x.u.a;
                for (int j = 0; j < 3; ++j) {
                    qh0.a.b(a2, (new int[] { 16, 20, 24 })[j]);
                }
                return a;
            }
        }
    }
}
