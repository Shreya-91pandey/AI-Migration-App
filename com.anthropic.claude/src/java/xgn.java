import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class xgn extends CharacterStyle
{
    public final boolean a;
    public final boolean b;
    
    public xgn(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        ((Paint)textPaint).setUnderlineText(this.a);
        ((Paint)textPaint).setStrikeThruText(this.b);
    }
}
