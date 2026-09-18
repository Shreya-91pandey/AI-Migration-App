public final class bva
{
    public int a;
    
    public bva(final int a) {
        this.a = a;
    }
    
    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final int a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("{ location = ");
        sb.append(a);
        sb.append(" }");
        return sb.toString();
    }
}
