import java.io.File;

public final class uca extends h07
{
    public Object A;
    public final vca B;
    public int C;
    public qv7 v;
    public aof w;
    public File x;
    public xda y;
    public int z;
    
    public uca(final vca b, final h07 h07) {
        this.B = b;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object a) {
        this.A = a;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
