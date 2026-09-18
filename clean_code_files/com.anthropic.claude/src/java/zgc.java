public final class zgc
{
    public int a;
    
    public zgc() {
        this.a = 0;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int hashCode = this.hashCode();
        lq6.u(16);
        final String string = Integer.toString(hashCode, 16);
        string.getClass();
        final StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(a);
        sb.append(")@");
        sb.append(string);
        return sb.toString();
    }
}
