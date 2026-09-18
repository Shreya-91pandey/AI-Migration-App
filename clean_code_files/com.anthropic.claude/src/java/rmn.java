import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;

public abstract class rmn
{
    public static final ThreadLocal a;
    public static final long b;
    
    static {
        a = new ThreadLocal();
        b = a(0, 0);
    }
    
    public static final long a(final int n, final int n2) {
        return ((long)n2 & 0xFFFFFFFFL) | (long)n << 32;
    }
    
    public static final TextDirectionHeuristic b(final int n) {
        if (n == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (n == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (n == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (n == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (n == 4) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (n != 5) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        return TextDirectionHeuristics.LOCALE;
    }
}
