final class s9f extends ogf
{
    public final hgf create() {
        final hgf hgf = new hgf();
        ((t9f)hgf).J = 48.0f;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof s9f) {
                if (qs8.e(48.0f, 48.0f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return Float.hashCode(48.0f);
    }
    
    public final String toString() {
        return hia.k("MinTouchTargetSizeElement(size=", qs8.f(48.0f), ")");
    }
    
    public final void update(final hgf hgf) {
        ((t9f)hgf).J = 48.0f;
    }
}
