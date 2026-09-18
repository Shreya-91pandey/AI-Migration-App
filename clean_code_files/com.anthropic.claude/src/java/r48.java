import android.graphics.Paint;
import android.text.TextPaint;

public final class r48
{
    public static final ThreadLocal b;
    public final TextPaint a;
    
    static {
        b = new ThreadLocal();
    }
    
    public r48() {
        ((Paint)(this.a = new TextPaint())).setTextSize(10.0f);
    }
}
