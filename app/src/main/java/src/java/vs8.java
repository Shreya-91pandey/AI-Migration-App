public final class vs8
{
    public final long a(final xc8 xc8) {
        final int b = sbo.b;
        return wp7.t(xc8.L0(10.0f), xc8.L0(40.0f), xc8.L0(10.0f), xc8.L0(40.0f));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof vs8) {
            if (qs8.e(10.0f, 10.0f)) {
                if (qs8.e(40.0f, 40.0f)) {
                    if (qs8.e(10.0f, 10.0f)) {
                        if (qs8.e(40.0f, 40.0f)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(true) + oz1.d(40.0f, oz1.d(10.0f, oz1.d(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        return oz1.q(oz1.t("DpTouchBoundsExpansion(start=", qs8.f(10.0f), ", top=", qs8.f(40.0f), ", end="), qs8.f(10.0f), ", bottom=", qs8.f(40.0f), ", isLayoutDirectionAware=true)");
    }
}
