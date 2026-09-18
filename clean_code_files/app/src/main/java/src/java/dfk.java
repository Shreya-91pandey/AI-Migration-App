public final class dfk
{
    public final jta a;
    public final jta b;
    public final boolean c;
    
    public dfk(final jta a, final jta b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final Object a = this.a.a();
        final Object a2 = this.b.a();
        final StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(a);
        sb.append(", maxValue=");
        sb.append(a2);
        sb.append(", reverseScrolling=");
        return ge9.t(sb, this.c, ")");
    }
}
