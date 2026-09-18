import android.graphics.fonts.Font;
import java.nio.ByteBuffer;
import android.graphics.fonts.FontStyle;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.graphics.Typeface;
import android.content.Context;
import android.widget.Magnifier$Builder;
import android.widget.Magnifier;
import android.view.View;

public final class o4a implements e70, bbh
{
    public static final o4a v;
    public static final o4a w;
    
    public boolean a() {
        return true;
    }
    
    public abh b(final View view, final boolean b, long t0, float w0, float w2, final boolean clippingEnabled, final xc8 xc8, final float initialZoom) {
        if (b) {
            return (abh)new ebh(new Magnifier(view));
        }
        t0 = xc8.T0(t0);
        w0 = xc8.w0(w0);
        w2 = xc8.w0(w2);
        final Magnifier$Builder magnifier$Builder = new Magnifier$Builder(view);
        if (t0 != 9205357640488583168L) {
            magnifier$Builder.setSize(k8e.H(Float.intBitsToFloat((int)(t0 >> 32))), k8e.H(Float.intBitsToFloat((int)(t0 & 0xFFFFFFFFL))));
        }
        if (!Float.isNaN(w0)) {
            magnifier$Builder.setCornerRadius(w0);
        }
        if (!Float.isNaN(w2)) {
            magnifier$Builder.setElevation(w2);
        }
        if (!Float.isNaN(initialZoom)) {
            magnifier$Builder.setInitialZoom(initialZoom);
        }
        magnifier$Builder.setClippingEnabled(clippingEnabled);
        return (abh)new ebh(magnifier$Builder.build());
    }
    
    @Override
    public Typeface j(final Context context, final f70 f70) {
        final n4a n4a = (n4a)f70;
        final ByteBuffer d = n4a.d;
        final zoa f71 = n4a.f;
        final boolean g = n4a.g;
        int n = 1;
        if (!g) {
            n = 0;
        }
        final int v = f71.v;
        int n2 = f71.v;
        final FontVariationAxis fontVariationAxis = new FontVariationAxis("wght", (float)v);
        final FontVariationAxis fontVariationAxis2 = new FontVariationAxis("opsz", n4a.e);
        m6b.i();
        final Font build = new Font$Builder(n4a.c).setFontVariationSettings(new FontVariationAxis[] { fontVariationAxis, fontVariationAxis2 }).setWeight(n2).setSlant(n).build();
        build.getClass();
        new(android.graphics.Typeface$CustomFallbackBuilder.class)();
        final Typeface$CustomFallbackBuilder e = m6b.e(new FontFamily$Builder(build).build());
        if (d != null) {
            m6b.i();
            final Font build2 = new Font$Builder(d).setFontVariationSettings(new FontVariationAxis[] { new FontVariationAxis("wght", (float)n2) }).setWeight(n2).setSlant(n).build();
            build2.getClass();
            e.addCustomFallback(new FontFamily$Builder(build2).build());
        }
        new(android.graphics.fonts.FontStyle.class)();
        if (mlc.K(f71)) {
            n2 = zoa.C.v;
        }
        final Typeface build3 = e.setStyle(new FontStyle(n2, n)).build();
        build3.getClass();
        return build3;
    }
}
