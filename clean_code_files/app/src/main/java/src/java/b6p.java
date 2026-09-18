public final class b6p implements d1q
{
    public final String a;
    public final ksg b;
    
    public b6p(final mec mec, final String a) {
        this.a = a;
        this.b = o50.Q((Object)mec);
    }
    
    @Override
    public final int a(final xc8 xc8) {
        return this.e().b;
    }
    
    @Override
    public final int b(final xc8 xc8, final qzc qzc) {
        return this.e().c;
    }
    
    @Override
    public final int c(final xc8 xc8) {
        return this.e().d;
    }
    
    @Override
    public final int d(final xc8 xc8, final qzc qzc) {
        return this.e().a;
    }
    
    public final mec e() {
        return (mec)this.b.getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof b6p && mlc.q((Object)this.e(), (Object)((b6p)o).e()));
    }
    
    public final void f(final mec value) {
        this.b.setValue((Object)value);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.e().a;
        final int b = this.e().b;
        final int c = this.e().c;
        final int d = this.e().d;
        final StringBuilder sb = new StringBuilder(this.a);
        sb.append("(left=");
        sb.append(a);
        sb.append(", top=");
        sb.append(b);
        t.p(c, d, ", right=", ", bottom=", sb);
        sb.append(")");
        return sb.toString();
    }
}
