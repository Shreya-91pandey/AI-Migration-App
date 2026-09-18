public abstract class gwg
{
    public final boolean a;
    public final boolean b;
    
    public gwg(final int n) {
        boolean b = true;
        final boolean a = (n & 0x1) == 0x0;
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        this.a = a;
        this.b = b;
    }
}
