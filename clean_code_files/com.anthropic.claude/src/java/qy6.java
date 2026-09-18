import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class qy6 implements PointerInputEventHandler
{
    public final byte v;
    public final lta w;
    
    public final Object invoke(final ueh ueh, final f07 f07) {
        final byte v = this.v;
        Object a = lqo.a;
        final pc7 v2 = pc7.v;
        final lta w = this.w;
        switch (v) {
            default: {
                final Object o1 = ((t6n)ueh).o1(f07, (zta)new vy1((byte)2, (f07)null, (Object)w));
                if (o1 == v2) {
                    a = o1;
                }
                return a;
            }
            case 0: {
                final Object i = yx0.i(ueh, w, f07);
                if (i == v2) {
                    a = i;
                }
                return a;
            }
        }
    }
}
