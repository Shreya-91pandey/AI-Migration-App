import android.net.Uri;
import android.content.ContentResolver;
import android.os.Looper;
import android.provider.Settings$Global;
import android.content.Context;

public final class qhf implements phf
{
    public final Context v;
    public fz6 w;
    public final gsg x;
    public wmm y;
    
    public qhf(final Context v) {
        this.v = v;
        this.x = new gsg(1.0f);
    }
    
    public final hc7 F0(final hc7 hc7) {
        return uuj.s0((hc7)this, hc7);
    }
    
    public final fc7 M0(final gc7 gc7) {
        return r6k.s((fc7)this, gc7);
    }
    
    public final Object V(final zta zta, final Object o) {
        return zta.d(o, (Object)this);
    }
    
    public final hc7 c0(final gc7 gc7) {
        return r6k.J((fc7)this, gc7);
    }
    
    public final float e0() {
        if (this.y == null) {
            final Context v = this.v;
            final tmf a = b3q.a;
            final tmf tmf;
            monitorenter(tmf = a);
            Label_0230: {
                try {
                    if (a.g((Object)v) == null) {
                        final ContentResolver contentResolver = v.getContentResolver();
                        final Uri uri = Settings$Global.getUriFor("animator_duration_scale");
                        final mn2 c = ao2.c(-1, 0, 6);
                        a.m((Object)v, (Object)lq6.i0((ija)new n6k((zta)new xnf(contentResolver, uri, new z38(c, uoo.y(Looper.getMainLooper()), (byte)1), c, v, null)), (oc7)ien.e(), (cul)new hom(Long.MAX_VALUE), (Object)Settings$Global.getFloat(v.getContentResolver(), "animator_duration_scale", 1.0f)));
                    }
                }
                finally {
                    break Label_0230;
                }
                final yom yom2;
                final yom yom = yom2;
                monitorexit(tmf);
                this.x.i(((Number)yom.getValue()).floatValue());
                final fz6 w = this.w;
                if (w != null) {
                    this.y = rhc.G((oc7)w, (hc7)null, 0, (zta)new frd((Object)yom, (Object)this, (f07)null, (byte)4), 3);
                    return this.x.h();
                }
                en9.q("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            monitorexit(tmf);
        }
        return this.x.h();
    }
}
