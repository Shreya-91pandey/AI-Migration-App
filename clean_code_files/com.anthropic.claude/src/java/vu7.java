import java.io.Serializable;

public final class vu7 extends h07
{
    public int A;
    public int B;
    public Object C;
    public final wu7 D;
    public int E;
    public tt7 v;
    public aof w;
    public Serializable x;
    public Object y;
    public rv7 z;
    
    public vu7(final wu7 d, final h07 h07) {
        this.D = d;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object c) {
        this.C = c;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, this);
    }
}
