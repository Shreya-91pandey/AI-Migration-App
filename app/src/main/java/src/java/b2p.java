import java.util.Iterator;

public final class b2p extends h07
{
    public Iterator v;
    public Object w;
    public final c2p x;
    public int y;
    
    public b2p(final c2p x, final h07 h07) {
        this.x = x;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object w) {
        this.w = w;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(this);
    }
}
