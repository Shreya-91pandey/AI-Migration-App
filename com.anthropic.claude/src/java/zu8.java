import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class zu8 implements PointerInputEventHandler
{
    public final jta v;
    public final jta w;
    
    public zu8(final jta v, final jta w) {
        this.v = v;
        this.w = w;
    }
    
    public final Object invoke(final ueh ueh, final f07 f07) {
        final Object e = enq.e(ueh, (zta)new yu8((Object)this.v, (Object)this.w, (f07)null, (byte)0), f07);
        if (e == pc7.v) {
            return e;
        }
        return lqo.a;
    }
}
