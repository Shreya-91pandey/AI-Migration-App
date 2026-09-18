import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class i8d extends MetricAffectingSpan
{
    public final float v;
    
    public i8d(final float v) {
        this.v = v;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        ((Paint)textPaint).setLetterSpacing(this.v);
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        ((Paint)textPaint).setLetterSpacing(this.v);
    }
}
