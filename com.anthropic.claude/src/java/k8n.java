import androidx.work.impl.background.systemjob.SystemJobService;
import android.content.Context;
import android.content.ComponentName;

public final class k8n
{
    public final ComponentName a;
    
    static {
        krd.e("SystemJobInfoConverter");
    }
    
    public k8n(final Context context, final y7j y7j) {
        this.a = new ComponentName(context.getApplicationContext(), (Class)SystemJobService.class);
    }
}
