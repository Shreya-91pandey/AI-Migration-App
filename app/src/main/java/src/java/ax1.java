import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class ax1 extends MetricAffectingSpan
{
    public final float v;
    
    public ax1(final float v) {
        this.v = v;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        textPaint.baselineShift += (int)(float)Math.ceil((double)(((Paint)textPaint).ascent() * this.v));
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        textPaint.baselineShift += (int)(float)Math.ceil((double)(((Paint)textPaint).ascent() * this.v));
    }
}
