import android.os.Build$VERSION;
import android.app.job.JobScheduler;
import android.content.Context;

public abstract class rpc
{
    public static final String a;
    
    static {
        a = krd.e("SystemJobScheduler");
    }
    
    public static final JobScheduler a(final Context context) {
        final Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler c;
        final JobScheduler jobScheduler = c = (JobScheduler)systemService;
        if (Build$VERSION.SDK_INT >= 34) {
            c = ws4.c(jobScheduler);
            c.getClass();
        }
        return c;
    }
}
