public final class vd2 implements u18
{
    public final ntk a;
    public final cv9 b;
    
    public vd2(final ntk a, final cv9 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final v18 a(final qam qam, final pfg pfg) {
        return (v18)new xd2(qam.c(), pfg, this.a, this.b);
    }
}
