public final class irg
{
    public final e90 a;
    public final int b;
    public final int c;
    
    public irg(final e90 a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof irg) {
                final irg irg = (irg)o;
                if (this.a != irg.a) {
                    return false;
                }
                if (this.b == irg.b) {
                    if (this.c == irg.c) {
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
        return Integer.hashCode(this.c) + hia.y(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append((Object)this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return smk.q(this.c, ")", sb);
    }
}
