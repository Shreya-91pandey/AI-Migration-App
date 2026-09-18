import android.view.ViewParent;
import android.content.ContextWrapper;
import android.content.Context;
import android.view.View;

public abstract class rod
{
    public static final b09 a;
    
    static {
        a = new b09((jta)new lrc((byte)6), (byte)0);
    }
    
    public static ita a(final gva gva) {
        ita ita = (ita)gva.j((sei)rod.a);
        final ita ita2 = null;
        Label_0098: {
            if (ita == null) {
                gva.g0(-571362883);
                View view = (View)gva.j((sei)q50.f);
                while (view != null) {
                    final Object tag = view.getTag(2131297029);
                    ita ita3;
                    if (tag instanceof ita) {
                        ita3 = (ita)tag;
                    }
                    else {
                        ita3 = null;
                    }
                    if (ita3 != null) {
                        ita = ita3;
                        break Label_0098;
                    }
                    final ViewParent z = soh.z(view);
                    if (z instanceof View) {
                        view = (View)z;
                    }
                    else {
                        view = null;
                    }
                }
                ita = null;
            }
            else {
                gva.g0(-571365177);
            }
        }
        gva.q(false);
        if (ita == null) {
            gva.g0(-571361040);
            Context baseContext = (Context)gva.j((sei)q50.b);
            Object o;
            while (true) {
                o = ita2;
                if (!(baseContext instanceof ContextWrapper)) {
                    break;
                }
                if (baseContext instanceof ita) {
                    o = baseContext;
                    break;
                }
                baseContext = ((ContextWrapper)baseContext).getBaseContext();
            }
            final ita ita4 = (ita)o;
            gva.q(false);
            return ita4;
        }
        gva.g0(-571365101);
        gva.q(false);
        return ita;
    }
}
