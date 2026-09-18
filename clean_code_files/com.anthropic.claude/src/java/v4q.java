public final class v4q
{
    public final String a;
    public final int b;
    
    public v4q(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof v4q)) {
            return false;
        }
        final v4q v4q = (v4q)o;
        return mlc.q((Object)this.a, (Object)v4q.a) && this.b == v4q.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return hia.m(sb, this.b, ')');
    }
}
