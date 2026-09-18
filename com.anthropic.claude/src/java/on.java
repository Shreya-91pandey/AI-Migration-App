public final class on extends h07
{
    public int A;
    public Object B;
    public final sn C;
    public int D;
    public boolean v;
    public long w;
    public int x;
    public int y;
    public int z;
    
    public on(final sn c, final h07 h07) {
        this.C = c;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object b) {
        this.B = b;
        this.D |= Integer.MIN_VALUE;
        return this.C.e(false, this);
    }
}
