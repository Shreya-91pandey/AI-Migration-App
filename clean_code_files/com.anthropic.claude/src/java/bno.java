public final class bno implements cno
{
    public final Object v;
    public final boolean w;
    
    public bno(final Object v, final boolean w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final boolean b() {
        return this.w;
    }
    
    public final Object getValue() {
        return this.v;
    }
}
