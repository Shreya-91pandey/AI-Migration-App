public final class czc
{
    public static final czc a;
    
    static {
        final Object a2 = new Object();
        if (qs8.b(0.0f, 0.0f) < 0 || qs8.b(0.0f, 0.0f) < 0 || qs8.b(0.0f, 0.0f) < 0 || qs8.b(0.0f, 0.0f) < 0) {
            fac.a("Layer outsets must be non-negative");
        }
        a = (czc)a2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof czc) {
                if (qs8.e(0.0f, 0.0f)) {
                    if (qs8.e(0.0f, 0.0f)) {
                        if (qs8.e(0.0f, 0.0f)) {
                            if (qs8.e(0.0f, 0.0f)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(0.0f) + oz1.d(0.0f, oz1.d(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        return oz1.q(oz1.t("LayerOutsets(left=", qs8.f(0.0f), ", top=", qs8.f(0.0f), ", right="), qs8.f(0.0f), ", bottom=", qs8.f(0.0f), ")");
    }
}
