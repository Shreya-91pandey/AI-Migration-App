import com.anthropic.claude.types.strings.OrganizationId;

public final class rnd implements snd
{
    public final String a;
    public final wn b;
    
    public rnd(final String a, final wn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rnd)) {
            return false;
        }
        final rnd rnd = (rnd)o;
        return mlc.q((Object)this.a, (Object)rnd.a) && this.b == rnd.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final String a = OrganizationId.a(this.a);
        final StringBuilder sb = new StringBuilder("UserSessionLoaded(organizationId=");
        sb.append(a);
        sb.append(", ageSignalsResult=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
