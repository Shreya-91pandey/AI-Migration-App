import androidx.compose.ui.platform.AndroidComposeView;

public final class y40 extends h07
{
    public Object v;
    public final AndroidComposeView w;
    public int x;
    
    public y40(final AndroidComposeView w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        this.w.K((zta)null, (h07)this);
        return pc7.v;
    }
}
