public final class zih extends ncq
{
    public final Object e;
    public final long f;
    
    public zih(final long f, final Object e) {
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof zih) {
                final zih zih = (zih)o;
                if (this.e.equals(zih.e)) {
                    if (this.f == zih.f) {
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
        return Long.hashCode(this.f) + this.e.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb.append(this.e);
        sb.append(", compositeKey=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
