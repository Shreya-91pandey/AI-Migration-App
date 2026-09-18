public final class dqc
{
    public final Object a;
    public final Object b;
    
    public dqc(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dqc)) {
            return false;
        }
        final dqc dqc = (dqc)o;
        return mlc.q(this.a, dqc.a) && mlc.q(this.b, dqc.b);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        final boolean b = a instanceof Enum;
        int n = 0;
        int n2;
        if (b) {
            n2 = ((Enum)a).ordinal();
        }
        else if (a != null) {
            n2 = a.hashCode();
        }
        else {
            n2 = 0;
        }
        final Object b2 = this.b;
        if (b2 instanceof Enum) {
            n = ((Enum)b2).ordinal();
        }
        else if (b2 != null) {
            n = b2.hashCode();
        }
        return n + n2 * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.a);
        sb.append(", right=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
