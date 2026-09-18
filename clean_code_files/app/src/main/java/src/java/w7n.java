public final class w7n
{
    public final int a;
    public final int b;
    public final byte c;
    public final lta d;
    
    public w7n(final int a, final int b, final int c, final lta d) {
        this.a = a;
        this.b = b;
        this.c = (byte)c;
        this.d = d;
    }
    
    public final int a(final boolean b) {
        if (this.c == 0) {
            return 0;
        }
        if (b) {
            return this.b;
        }
        return this.a;
    }
}
