public final class ing implements d1q
{
    public final dng a;
    
    public ing(final dng a) {
        this.a = a;
    }
    
    @Override
    public final int a(final xc8 xc8) {
        return xc8.L0(this.a.d());
    }
    
    @Override
    public final int b(final xc8 xc8, final qzc qzc) {
        return xc8.L0(this.a.c(qzc));
    }
    
    @Override
    public final int c(final xc8 xc8) {
        return xc8.L0(this.a.a());
    }
    
    @Override
    public final int d(final xc8 xc8, final qzc qzc) {
        return xc8.L0(this.a.b(qzc));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ing && mlc.q((Object)((ing)o).a, (Object)this.a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final dng a = this.a;
        final qzc v = qzc.v;
        return oz1.q(oz1.t("PaddingValues(", qs8.f(a.b(v)), ", ", qs8.f(a.d()), ", "), qs8.f(a.c(v)), ", ", qs8.f(a.a()), ")");
    }
}
