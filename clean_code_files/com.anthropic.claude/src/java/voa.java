public final class voa implements uoa
{
    public final String a;
    public final float b;
    
    public voa(final String a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final float a() {
        return this.b;
    }
    
    @Override
    public final String b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof voa) {
                final voa voa = (voa)o;
                if (this.a.equals(voa.a)) {
                    if (this.b == voa.b) {
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
        return Float.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
        sb.append(this.a);
        sb.append("', value=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
