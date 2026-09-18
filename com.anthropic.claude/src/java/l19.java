import android.content.res.Configuration;
import android.content.Context;
import android.view.View;

public final class l19 extends View
{
    public final cu6 v;
    
    public l19(final cu6 v, final Context context) {
        this.v = v;
        super(context);
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        this.v.run();
    }
}
