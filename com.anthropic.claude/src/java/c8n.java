public final class c8n
{
    public final String a;
    public final int b;
    public final int c;
    
    public c8n(final String a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c8n)) {
            return false;
        }
        final c8n c8n = (c8n)o;
        return mlc.q((Object)this.a, (Object)c8n.a) && this.b == c8n.b && this.c == c8n.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + hia.y(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return hia.m(sb, this.c, ')');
    }
}
