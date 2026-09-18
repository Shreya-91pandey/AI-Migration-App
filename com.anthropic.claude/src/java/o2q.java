public final class o2q implements n2q
{
    public final String b;
    public final mcc c;
    public final mcc d;
    
    public o2q(final String b) {
        this.b = b;
        this.c = new mcc(b);
        this.d = new mcc(b.concat(" maximum"));
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
}
