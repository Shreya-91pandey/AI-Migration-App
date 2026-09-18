import com.anthropic.claude.api.result.ApiResult;

public final class op0 extends h07
{
    public ApiResult v;
    public Object w;
    public final rp0 x;
    public int y;
    
    public op0(final rp0 x, final h07 h07) {
        this.x = x;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object w) {
        this.w = w;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(null, this);
    }
}
