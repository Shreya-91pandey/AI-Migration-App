import android.graphics.ImageDecoder$Source;
import android.graphics.Bitmap$Config;

public final class vpm implements u18
{
    public final byte a;
    public final Object b;
    
    public vpm() {
        this.a = 1;
        this.b = v6n.d;
    }
    
    public vpm(final ntk b) {
        this.a = 0;
        this.b = b;
    }
    
    @Override
    public final v18 a(final qam qam, final pfg pfg) {
        final byte a = this.a;
        final Object b = this.b;
        final v18 v18 = null;
        v18 v19 = null;
        switch (a) {
            default: {
                if (mlc.q((Object)qam.b(), (Object)"image/svg+xml") || b18.a(qam.c().Y0())) {
                    v19 = new v6n(qam.c(), pfg, (lta)b);
                }
                return v19;
            }
            case 0: {
                final Bitmap$Config f = l3c.f(pfg);
                if (f != Bitmap$Config.ARGB_8888) {
                    final Object o = v18;
                    if (f != Bitmap$Config.HARDWARE) {
                        return (v18)o;
                    }
                }
                final ImageDecoder$Source l = l9r.l(qam.c(), pfg);
                Object o;
                if (l == null) {
                    o = v18;
                }
                else {
                    o = new xd2(l, qam.c(), pfg, (ntk)b);
                }
                return (v18)o;
            }
        }
    }
}
