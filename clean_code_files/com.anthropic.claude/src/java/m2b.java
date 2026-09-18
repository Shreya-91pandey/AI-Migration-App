import com.anthropic.claude.api.account.BootstrapResponse;
import com.anthropic.claude.api.result.ApiResult;

public final class m2b extends h07
{
    public int A;
    public ApiResult v;
    public ApiResult w;
    public BootstrapResponse x;
    public Object y;
    public final n2b z;
    
    public m2b(final n2b z, final h07 h07) {
        this.z = z;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object y) {
        this.y = y;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(this);
    }
}
