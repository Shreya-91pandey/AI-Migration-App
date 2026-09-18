import android.graphics.text.LineBreakConfig$Builder;
import android.text.StaticLayout$Builder;
import android.content.pm.ShortcutInfo$Builder;
import android.view.inputmethod.CursorAnchorInfo$Builder;
import android.os.UserManager;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.pm.PackageManager$PackageInfoFlags;
import android.content.pm.PackageInfo;
import android.content.Context;
import android.content.pm.PackageManager;

public abstract class mo2
{
    public static PackageInfo a(final PackageManager packageManager, final Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager$PackageInfoFlags.of(0L));
    }
    
    public static Object b(final Bundle bundle, final String s, final Class clazz) {
        return bundle.getParcelable(s, clazz);
    }
    
    public static ArrayList c(final Bundle bundle, final String s, final Class clazz) {
        return bundle.getParcelableArrayList(s, clazz);
    }
    
    public static final int d(final Context context) {
        final Object systemService = context.getSystemService("user");
        systemService.getClass();
        if (!((UserManager)systemService).isProfile() && context.getSystemService("healthconnect") != null) {
            return 3;
        }
        return 1;
    }
    
    public static final void e(final CursorAnchorInfo$Builder cursorAnchorInfo$Builder, final k2j k2j) {
        cursorAnchorInfo$Builder.setEditorBoundsInfo(o4.g().setEditorBounds(yi2.a0(k2j)).setHandwritingBounds(yi2.a0(k2j)).build());
    }
    
    public static void f(final ShortcutInfo$Builder shortcutInfo$Builder) {
        shortcutInfo$Builder.setExcludedFromSurfaces(0);
    }
    
    public static final void g(final StaticLayout$Builder staticLayout$Builder, final int lineBreakStyle, final int lineBreakWordStyle) {
        staticLayout$Builder.setLineBreakConfig(new LineBreakConfig$Builder().setLineBreakStyle(lineBreakStyle).setLineBreakWordStyle(lineBreakWordStyle).build());
    }
}
