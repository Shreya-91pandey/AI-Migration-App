import com.anthropic.claude.api.account.AppStartResponse;

public final class br0 extends h07
{
    public String v;
    public AppStartResponse w;
    public Object x;
    public final er0 y;
    public int z;
    
    public br0(final er0 y, final h07 h07) {
        this.y = y;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object x) {
        this.x = x;
        this.z |= Integer.MIN_VALUE;
        return this.y.f(null, null, null, this);
    }
}
