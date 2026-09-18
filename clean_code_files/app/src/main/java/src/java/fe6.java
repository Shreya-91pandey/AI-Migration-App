import android.os.Bundle;
import android.view.View;
import android.view.Window$Callback;
import android.view.KeyEvent;
import android.app.Activity;

public abstract class fe6 extends Activity implements gbd, ouc
{
    public final jbd v;
    
    public fe6() {
        this.v = new jbd((gbd)this, true);
    }
    
    public final boolean c(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        decorView.getClass();
        return ebr.b(decorView, keyEvent) || ebr.c((ouc)this, decorView, (Window$Callback)this, keyEvent);
    }
    
    public final boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        decorView.getClass();
        return ebr.b(decorView, keyEvent) || super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final int w = zdj.w;
        xdj.b((Activity)this);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        this.v.i(tad.x);
        super.onSaveInstanceState(bundle);
    }
}
