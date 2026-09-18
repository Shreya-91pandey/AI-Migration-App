import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.view.GestureDetector;

public final class o8c
{
    public final k40 a;
    public int b;
    public boolean c;
    public final GestureDetector d;
    
    public o8c(final Context context, final k40 a) {
        this.a = a;
        this.b = 0;
        this.d = new GestureDetector(context, (GestureDetector$OnGestureListener)new n8c(this));
    }
}
