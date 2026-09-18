import android.content.ClipData;
import android.os.Build$VERSION;

public final class j40 implements y45
{
    public final jmq a;
    
    public j40(final jmq a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final w45 w45, final h07 h07) {
        final jmq a = this.a;
        if (w45 == null) {
            if (Build$VERSION.SDK_INT >= 28) {
                x9r.l(a.x());
            }
            else {
                a.x().setPrimaryClip(ClipData.newPlainText((CharSequence)"", (CharSequence)""));
            }
        }
        else {
            a.x().setPrimaryClip(w45.a());
        }
        return lqo.a;
    }
    
    @Override
    public final Object b(final h07 h07) {
        final ClipData primaryClip = this.a.x().getPrimaryClip();
        if (primaryClip != null) {
            return new w45(primaryClip);
        }
        return null;
    }
}
