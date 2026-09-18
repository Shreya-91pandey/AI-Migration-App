public final class cjn implements djn
{
    public final int v;
    
    public cjn(int v, final int n) {
        if ((n & 0x2) != 0x0) {
            v = Integer.MAX_VALUE;
        }
        if (1 <= (this.v = v)) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Expected 1 \u2264 minHeightInLines \u2264 maxHeightInLines, were 1, ");
        sb.append(v);
        jac.a(sb.toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (cjn.class == o.getClass()) {
                    if (this.v == ((cjn)o).v) {
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
        return 31 + this.v;
    }
    
    @Override
    public final String toString() {
        return oz1.n("MultiLine(minHeightInLines=1, maxHeightInLines=", this.v, ")");
    }
}
