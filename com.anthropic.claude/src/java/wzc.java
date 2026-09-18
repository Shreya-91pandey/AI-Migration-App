import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.MetricAffectingSpan;
import android.text.style.CharacterStyle;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.os.Build$VERSION;
import android.text.BoringLayout$Metrics;
import android.text.TextPaint;

public final class wzc
{
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public float d;
    public float e;
    public BoringLayout$Metrics f;
    public boolean g;
    public CharSequence h;
    
    public wzc(final CharSequence a, final TextPaint b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = Float.NaN;
        this.e = Float.NaN;
    }
    
    public final BoringLayout$Metrics a() {
        if (!this.g) {
            final TextDirectionHeuristic b = rmn.b(this.c);
            final int sdk_INT = Build$VERSION.SDK_INT;
            final CharSequence a = this.a;
            final TextPaint b2 = this.b;
            BoringLayout$Metrics f;
            if (sdk_INT >= 33) {
                f = o4.e(a, b2, b);
            }
            else {
                f = enq.j(a, b2, b);
            }
            this.f = f;
            this.g = true;
        }
        return this.f;
    }
    
    public final CharSequence b() {
        final CharSequence h = this.h;
        if (h == null) {
            Object a;
            final CharSequence charSequence = (CharSequence)(a = this.a);
            if (charSequence instanceof Spanned) {
                final Spanned spanned = (Spanned)charSequence;
                if (!rml.z(spanned, (Class)CharacterStyle.class)) {
                    a = charSequence;
                }
                else {
                    final int length = charSequence.length();
                    int i = 0;
                    final CharacterStyle[] array = (CharacterStyle[])spanned.getSpans(0, length, (Class)CharacterStyle.class);
                    a = charSequence;
                    if (array != null) {
                        if (array.length == 0) {
                            a = charSequence;
                        }
                        else {
                            final int length2 = array.length;
                            Object o = null;
                            while (i < length2) {
                                final CharacterStyle characterStyle = array[i];
                                Object o2 = o;
                                if (!(characterStyle instanceof MetricAffectingSpan)) {
                                    if ((o2 = o) == null) {
                                        o2 = new SpannableString(charSequence);
                                    }
                                    ((SpannableString)o2).removeSpan((Object)characterStyle);
                                }
                                ++i;
                                o = o2;
                            }
                            a = charSequence;
                            if (o != null) {
                                a = o;
                            }
                        }
                    }
                }
            }
            return this.h = (CharSequence)a;
        }
        h.getClass();
        return h;
    }
    
    public final float c() {
        if (!Float.isNaN(this.d)) {
            return this.d;
        }
        final BoringLayout$Metrics a = this.a();
        int width;
        if (a != null) {
            width = a.width;
        }
        else {
            width = -1;
        }
        final float n = (float)width;
        final TextPaint b = this.b;
        float n2 = n;
        if (n < 0.0f) {
            n2 = (float)Math.ceil((double)Layout.getDesiredWidth(this.b(), 0, this.b().length(), b));
        }
        if (n2 != 0.0f) {
            final CharSequence a2 = this.a;
            Label_0144: {
                if (a2 instanceof Spanned) {
                    final Spanned spanned = (Spanned)a2;
                    if (rml.z(spanned, (Class)j8d.class) || rml.z(spanned, (Class)i8d.class)) {
                        break Label_0144;
                    }
                }
                if (((Paint)b).getLetterSpacing() == 0.0f) {
                    return this.d = n2;
                }
            }
            n2 += 0.5f;
        }
        return this.d = n2;
    }
}
