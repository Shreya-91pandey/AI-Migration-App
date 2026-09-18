public final class qr7
{
    public final String a;
    public final jta b;
    
    public qr7(final jta b, final String a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof qr7) {
                final qr7 qr7 = (qr7)o;
                if (mlc.q((Object)this.a, (Object)qr7.a)) {
                    if (this.b == qr7.b) {
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
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CustomAccessibilityAction(label=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
