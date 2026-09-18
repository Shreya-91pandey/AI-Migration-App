import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public final class n70
{
    public final Bitmap a;
    
    public n70(final Bitmap a) {
        this.a = a;
    }
    
    public final int a() {
        final Bitmap$Config config = this.a.getConfig();
        config.getClass();
        if (config == Bitmap$Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap$Config.RGB_565) {
            return 2;
        }
        if (config != Bitmap$Config.ARGB_4444) {
            if (config == Bitmap$Config.RGBA_F16) {
                return 3;
            }
            if (config == Bitmap$Config.HARDWARE) {
                return 4;
            }
        }
        return 0;
    }
}
