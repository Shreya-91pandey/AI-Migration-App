import com.anthropic.claude.types.strings.OrganizationId;

public final class tl3
{
    public final String a;
    public final sl3 b;
    
    public tl3(final String a, final sl3 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tl3)) {
            return false;
        }
        final tl3 tl3 = (tl3)o;
        final String a = tl3.a;
        final String a2 = this.a;
        if (a2 == null) {
            if (a == null) {
                final boolean equals = true;
                return equals && mlc.q((Object)this.b, (Object)tl3.b);
            }
        }
        else if (a != null) {
            final boolean equals = a2.equals(a);
            return equals && mlc.q((Object)this.b, (Object)tl3.b);
        }
        final boolean equals = false;
        return equals && mlc.q((Object)this.b, (Object)tl3.b);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final sl3 b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        String a2;
        if (a == null) {
            a2 = "null";
        }
        else {
            a2 = OrganizationId.a(a);
        }
        final StringBuilder sb = new StringBuilder("ChatAnalyticsContext(organizationId=");
        sb.append(a2);
        sb.append(", chat=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
