import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class mqq implements ServiceConnection
{
    public final erq a = a;
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        hmq.g("BillingClientTesting", "Billing Override Service connected.");
        final sjq m = fjq.m(binder);
        final erq a = this.a;
        erq.L(a, m);
        erq.M(a, 2);
        erq.O(a);
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        hmq.h("BillingClientTesting", "Billing Override Service disconnected.");
        final erq a = this.a;
        erq.L(a, (sjq)null);
        erq.M(a, 0);
    }
}
