import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public final class ynf
{
    public final AtomicReference a;
    public final cof b;
    
    public ynf() {
        this.a = new AtomicReference((Object)null);
        this.b = new cof();
    }
    
    public final Object a(final lnf lnf, final lta lta, final f07 f07) {
        return ien.m(f07, (zta)new xnf(lnf, this, lta, (f07)null));
    }
    
    public final void b(final vnf vnf) {
    Label_0000:
        while (true) {
            final AtomicReference a = this.a;
            final vnf vnf2 = (vnf)a.get();
            if (vnf2 != null) {
                if (vnf.a.compareTo((Enum)vnf2.a) < 0) {
                    throw new CancellationException("Current mutation had a higher priority");
                }
            }
            while (!a.compareAndSet((Object)vnf2, (Object)vnf)) {
                if (a.get() != vnf2) {
                    continue Label_0000;
                }
            }
            if (vnf2 != null) {
                vnf2.b.g((CancellationException)new MutationInterruptedException());
            }
        }
    }
}
