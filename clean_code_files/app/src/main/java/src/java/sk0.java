import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class sk0 implements PointerInputEventHandler
{
    public static final sk0 A;
    public static final sk0 w;
    public static final sk0 x;
    public static final sk0 y;
    public static final sk0 z;
    public final byte v;
    
    public final Object invoke(final ueh ueh, final f07 f07) {
        final byte v = this.v;
        final pc7 v2 = pc7.v;
        lqo a;
        lqo lqo = a = lqo.a;
        switch (v) {
            default: {
                return lqo;
            }
            case 3: {
                final Object f8 = ccn.f(ueh, (hk0)null, (lta)null, (bua)null, (lta)new wg7((byte)29), f07, 7);
                if (f8 == v2) {
                    lqo = (lqo)f8;
                }
                return lqo;
            }
            case 2: {
                final Object f9 = ccn.f(ueh, (hk0)null, (lta)null, (bua)null, (lta)new wg7((byte)28), f07, 7);
                if (f9 == v2) {
                    lqo = (lqo)f9;
                }
                return lqo;
            }
            case 1: {
                final Object o1 = ((t6n)ueh).o1(f07, (zta)new cl6());
                a = lqo;
                if (o1 == v2) {
                    a = (lqo)o1;
                    return a;
                }
                return a;
            }
            case 0: {
                return a;
            }
        }
    }
}
