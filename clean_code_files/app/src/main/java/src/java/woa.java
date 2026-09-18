public final class woa implements uoa
{
    public final int a;
    
    public woa(final int a) {
        this.a = a;
    }
    
    @Override
    public final float a() {
        return (float)this.a;
    }
    
    @Override
    public final String b() {
        return "wght";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof woa && this.a == ((woa)o).a);
    }
    
    @Override
    public final int hashCode() {
        return 113071012 + this.a;
    }
    
    @Override
    public final String toString() {
        return oz1.n("FontVariation.Setting(axisName='wght', value=", this.a, ")");
    }
}
