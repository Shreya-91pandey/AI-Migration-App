import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class c04 implements PointerInputEventHandler
{
    public final qkb v;
    public final rkb w;
    public final bnf x;
    
    public c04(final qkb v, final rkb w, final bnf x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final Object invoke(final ueh ueh, final f07 f07) {
        final Object e = enq.e(ueh, (zta)new b04((Object)this.v, (Object)this.w, (Object)this.x, (f07)null, (byte)0), f07);
        if (e == pc7.v) {
            return e;
        }
        return lqo.a;
    }
}
