public final class lln
{
    public final nnn a;
    public final int b;
    
    public lln(final nnn a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof lln) {
                final lln lln = (lln)o;
                if (this.b == lln.b) {
                    if (this.a.equals(lln.a)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
}
