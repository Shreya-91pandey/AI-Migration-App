public final class zpm implements a6p
{
    public final Object a;
    
    public zpm(final Object a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final e3h e3h) {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof zpm && mlc.q(this.a, ((zpm)o).a));
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Override
    public final String toString() {
        return lmf.r(this.a, "StaticValueHolder(value=", ")");
    }
}
