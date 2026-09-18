import android.os.Build$VERSION;

public class aj0 extends bj0
{
    public final byte d;
    
    public aj0(final String s) {
        this.d = 3;
        super("IMPLEMENTATION_ONLY_FEATURE", s);
    }
    
    @Override
    public final boolean a() {
        switch (this.d) {
            default: {
                return Build$VERSION.SDK_INT >= 29;
            }
            case 6: {
                return Build$VERSION.SDK_INT >= 28;
            }
            case 5: {
                return Build$VERSION.SDK_INT >= 27;
            }
            case 4: {
                return true;
            }
            case 3: {
                return false;
            }
            case 2: {
                return false;
            }
            case 1: {
                return true;
            }
            case 0: {
                return true;
            }
        }
    }
}
