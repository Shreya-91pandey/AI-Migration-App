public final class f1n
{
    public final i1n a;
    public v0d b;
    public final c1n c;
    public final c1n d;
    public final c1n e;
    
    public f1n(final i1n a) {
        this.a = a;
        this.c = new c1n(this, (byte)0);
        this.d = new c1n(this, (byte)1);
        this.e = new c1n(this, (byte)2);
    }
    
    public final v0d a() {
        final v0d b = this.b;
        if (b != null) {
            return b;
        }
        en9.s("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
