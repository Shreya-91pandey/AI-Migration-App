import com.anthropic.claude.api.memory.MemorySettingsResponse;

public final class boj extends h07
{
    public Object v;
    public final nq w;
    public int x;
    
    public boj(final nq w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        return this.w.g((MemorySettingsResponse)null, (h07)this);
    }
}
