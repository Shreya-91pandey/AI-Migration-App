import android.view.ViewConfiguration;

public abstract class fgm
{
    public static final float a;
    
    static {
        a = ViewConfiguration.getScrollFriction();
    }
    
    public static final v08 a(final gva gva) {
        final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
        final boolean c = gva.c(xc8.getDensity());
        final Object r = gva.R();
        v08 v08;
        if (c || (v08 = (v08)r) == bi6.a) {
            v08 = new v08(new xzj(xc8));
            gva.q0((Object)v08);
        }
        return v08;
    }
}
