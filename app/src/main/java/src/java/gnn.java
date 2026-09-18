public final class gnn
{
    public final long a;
    public final long b;
    
    public gnn(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof gnn) {
                final gnn gnn = (gnn)o;
                final long a = gnn.a;
                final int i = j86.i;
                if (foo.a(this.a, a)) {
                    if (foo.a(this.b, gnn.b)) {
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
        final int i = j86.i;
        return Long.hashCode(this.b) + Long.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return lmf.t("SelectionColors(selectionHandleColor=", j86.h(this.a), ", selectionBackgroundColor=", j86.h(this.b), ")");
    }
}
