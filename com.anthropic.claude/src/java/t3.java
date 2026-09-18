public final class t3
{
    public final String a;
    public final aua b;
    
    public t3(final String a, final aua b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t3)) {
            return false;
        }
        final t3 t3 = (t3)o;
        return mlc.q((Object)this.a, (Object)t3.a) && mlc.q((Object)this.b, (Object)t3.b);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final aua b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AccessibilityAction(label=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
