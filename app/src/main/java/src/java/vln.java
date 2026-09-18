public final class vln
{
    public static final vln c;
    public final long a;
    public final long b;
    
    static {
        c = new vln(tsf.K(0), tsf.K(0));
    }
    
    public vln(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vln)) {
            return false;
        }
        final vln vln = (vln)o;
        return vnn.a(this.a, vln.a) && vnn.a(this.b, vln.b);
    }
    
    @Override
    public final int hashCode() {
        final wnn[] b = vnn.b;
        return Long.hashCode(this.b) + Long.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return lmf.t("TextIndent(firstLine=", vnn.f(this.a), ", restLine=", vnn.f(this.b), ")");
    }
}
