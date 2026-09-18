import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Method;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import android.os.Build$VERSION;
import android.content.Context;

public abstract class sqh
{
    static {
        krd.e("ProcessUtils");
    }
    
    public static final boolean a(final Context context) {
        String s = null;
        if (Build$VERSION.SDK_INT >= 28) {
            s = zh0.e();
        }
        else {
            final String s2 = null;
            try {
                final Method declaredMethod = Class.forName("android.app.ActivityThread", false, a5q.class.getClassLoader()).getDeclaredMethod("currentProcessName", (Class<?>[])null);
                ((AccessibleObject)declaredMethod).setAccessible(true);
                final Object invoke = declaredMethod.invoke((Object)null, (Object[])null);
                invoke.getClass();
                if (invoke instanceof String) {
                    final String s3 = (String)invoke;
                    return mlc.q((Object)s, (Object)context.getApplicationInfo().processName);
                }
            }
            finally {
                krd.c().getClass();
            }
            final int myPid = Process.myPid();
            final Object systemService = context.getSystemService("activity");
            systemService.getClass();
            final List runningAppProcesses = ((ActivityManager)systemService).getRunningAppProcesses();
            s = s2;
            if (runningAppProcesses != null) {
                while (true) {
                    for (final Object next : runningAppProcesses) {
                        if (((ActivityManager$RunningAppProcessInfo)next).pid == myPid) {
                            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = (ActivityManager$RunningAppProcessInfo)next;
                            s = s2;
                            if (activityManager$RunningAppProcessInfo != null) {
                                s = activityManager$RunningAppProcessInfo.processName;
                                return mlc.q((Object)s, (Object)context.getApplicationInfo().processName);
                            }
                            return mlc.q((Object)s, (Object)context.getApplicationInfo().processName);
                        }
                    }
                    Object next = null;
                    continue;
                }
            }
        }
        return mlc.q((Object)s, (Object)context.getApplicationInfo().processName);
    }
}
