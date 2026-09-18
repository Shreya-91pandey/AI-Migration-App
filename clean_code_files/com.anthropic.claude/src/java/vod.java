import android.view.ViewParent;
import android.view.View;

public abstract class vod
{
    public static final b09 a;
    
    static {
        a = new b09((jta)new lrc((byte)8), (byte)0);
    }
    
    public static crf a(final gva gva) {
        final crf crf = (crf)gva.j((sei)vod.a);
        if (crf == null) {
            gva.g0(950836184);
            View view = (View)gva.j((sei)q50.f);
            crf crf2;
            while (true) {
                crf2 = null;
                if (view == null) {
                    break;
                }
                final Object tag = view.getTag(2131297129);
                if (tag instanceof crf) {
                    crf2 = (crf)tag;
                }
                else {
                    crf2 = null;
                }
                if (crf2 != null) {
                    break;
                }
                final ViewParent z = soh.z(view);
                if (z instanceof View) {
                    view = (View)z;
                }
                else {
                    view = null;
                }
            }
            gva.q(false);
            return crf2;
        }
        gva.g0(950834231);
        gva.q(false);
        return crf;
    }
}
