public abstract class m6n extends h07 implements kua, l6n
{
    public final byte v;
    
    public m6n(final int v, final f07 f07) {
        super(f07);
        this.v = (byte)v;
    }
    
    @Override
    public final int e() {
        return this.v;
    }
    
    @Override
    public final String toString() {
        if (this.getCompletion() == null) {
            v4j.a.getClass();
            return w4j.a((kua)this);
        }
        return super.toString();
    }
}
