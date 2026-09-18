import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class pjn implements PointerInputEventHandler
{
    public final oc7 v;
    public final bnf w;
    public final llf x;
    public final bnf y;
    
    public pjn(final oc7 v, final bnf w, final llf x, final bnf y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final Object invoke(final ueh ueh, final f07 f07) {
        final Object e = ccn.e(ueh, (bua)new ojn(this.v, this.w, this.x, (f07)null), (lta)new i7d(this.y, (byte)29), f07);
        if (e == pc7.v) {
            return e;
        }
        return lqo.a;
    }
}
