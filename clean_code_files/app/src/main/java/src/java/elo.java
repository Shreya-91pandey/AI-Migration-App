public final class elo implements dlo
{
    public final lta a;
    public final lta b;
    
    public elo(final lta a, final lta b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final lta a() {
        return this.a;
    }
    
    @Override
    public final lta b() {
        return this.b;
    }
}
