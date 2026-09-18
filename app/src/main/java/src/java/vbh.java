public final class vbh
{
    public final nbh a;
    public final fbh b;
    
    public vbh(final nbh a, final fbh b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vbh)) {
            return false;
        }
        final vbh vbh = (vbh)o;
        return mlc.q((Object)this.b, (Object)vbh.b) && mlc.q((Object)this.a, (Object)vbh.a);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final nbh a = this.a;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final fbh b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PlatformTextStyle(spanStyle=");
        sb.append((Object)this.a);
        sb.append(", paragraphSyle=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
