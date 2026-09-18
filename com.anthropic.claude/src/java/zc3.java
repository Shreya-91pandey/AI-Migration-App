import androidx.compose.ui.node.Owner;

public final class zc3 extends h07
{
    public Object v;
    public final cd3 w;
    public int x;
    
    public zc3(final cd3 w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        this.w.a(null, null, this);
        return pc7.v;
    }
}
