public final class bzj
{
    public float a;
    public boolean b;
    public q4r c;
    
    public bzj() {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bzj)) {
            return false;
        }
        final bzj bzj = (bzj)o;
        return Float.compare(this.a, bzj.a) == 0 && this.b == bzj.b && mlc.q((Object)this.c, (Object)bzj.c);
    }
    
    @Override
    public final int hashCode() {
        final int l = smk.l(Float.hashCode(this.a) * 31, 31, this.b);
        final q4r c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return (l + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final boolean b = this.b;
        final q4r c = this.c;
        final StringBuilder sb = new StringBuilder("RowColumnParentData(weight=");
        sb.append(a);
        sb.append(", fill=");
        sb.append(b);
        sb.append(", crossAxisAlignment=");
        sb.append((Object)c);
        sb.append(", flowLayoutData=null)");
        return sb.toString();
    }
}
