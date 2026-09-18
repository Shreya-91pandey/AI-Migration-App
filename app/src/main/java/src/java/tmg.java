import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.Context;

public abstract class tmg
{
    static {
        krd.e("PackageManagerHelper");
    }
    
    public static void a(final Context context, final Class clazz, final boolean b) {
        try {
            final int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, clazz.getName()));
            boolean b2 = false;
            if (componentEnabledSetting != 0) {
                if (componentEnabledSetting == 1) {
                    b2 = true;
                }
            }
            if (b == b2) {
                krd.c().getClass();
                return;
            }
            final PackageManager packageManager = context.getPackageManager();
            final ComponentName componentName = new ComponentName(context, clazz.getName());
            int n;
            if (b) {
                n = 1;
            }
            else {
                n = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, n, 1);
            krd.c().getClass();
        }
        catch (final Exception ex) {
            krd.c().getClass();
        }
    }
}
