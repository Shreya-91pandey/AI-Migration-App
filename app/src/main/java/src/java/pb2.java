import android.os.BaseBundle;
import android.content.Context;

public final class pb2
{
    public volatile def a;
    public final Context b = b;
    public volatile nji c;
    public volatile boolean d;
    
    public final qb2 a() {
        final Context b = this.b;
        if (this.c == null) {
            en9.s("Please provide a valid listener for purchases updates.");
            return null;
        }
        if (this.a == null) {
            en9.s("Pending purchases for one-time products must be supported.");
            return null;
        }
        this.a.getClass();
        final nji c = this.c;
        final def a = this.a;
        if (c != null) {
            final nji c2 = this.c;
            if (this.b()) {
                return (qb2)new erq(a, b, c2, this);
            }
            return new qb2(a, b, c2, this);
        }
        else {
            if (this.b()) {
                return (qb2)new erq(a, b, this);
            }
            return new qb2(a, b, this);
        }
    }
    
    public final boolean b() {
        try {
            final Context b = this.b;
            return ((BaseBundle)b.getPackageManager().getApplicationInfo(b.getPackageName(), 128).metaData).getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        }
        catch (final Exception ex) {
            hmq.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", (Throwable)ex);
            return false;
        }
    }
}
