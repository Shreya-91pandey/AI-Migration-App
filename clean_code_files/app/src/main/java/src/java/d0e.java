import android.os.Build$VERSION;

public abstract class d0e
{
    public static final htk a;
    
    static {
        a = new htk("MagnifierPositionInRoot");
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 28;
    }
    
    public static igf b(final lta lta, final lta lta2, final bbh bbh) {
        if (a()) {
            return (igf)new a0e(lta, lta2, bbh);
        }
        return (igf)fgf.v;
    }
}
