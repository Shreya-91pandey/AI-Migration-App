import android.graphics.Canvas;

public abstract class g40
{
    public static final Canvas a;
    
    static {
        a = new Canvas();
    }
    
    public static final f40 a(final n70 n70) {
        final f40 f40 = new f40();
        f40.a = new Canvas(ien.h(n70));
        return f40;
    }
    
    public static final Canvas b(final x13 x13) {
        x13.getClass();
        return ((f40)x13).a;
    }
}
