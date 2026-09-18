import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class j8d extends MetricAffectingSpan
{
    public final float v;
    
    public j8d(final float v) {
        this.v = v;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        final float n = ((Paint)textPaint).getTextScaleX() * ((Paint)textPaint).getTextSize();
        if (n == 0.0f) {
            return;
        }
        ((Paint)textPaint).setLetterSpacing(this.v / n);
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        final float n = ((Paint)textPaint).getTextScaleX() * ((Paint)textPaint).getTextSize();
        if (n == 0.0f) {
            return;
        }
        ((Paint)textPaint).setLetterSpacing(this.v / n);
    }
}
