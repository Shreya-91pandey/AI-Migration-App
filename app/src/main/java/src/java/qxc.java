import java.io.Serializable;

public abstract class qxc implements kua, Serializable
{
    public final byte v;
    
    public qxc(final int v) {
        this.v = (byte)v;
    }
    
    @Override
    public final int e() {
        return this.v;
    }
    
    @Override
    public final String toString() {
        v4j.a.getClass();
        return w4j.a((kua)this);
    }
}
