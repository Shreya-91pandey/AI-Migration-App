import com.anthropic.claude.types.strings.OrganizationId;

public final class hqn implements kqn
{
    public final String a;
    
    public hqn(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hqn && mlc.q((Object)this.a, (Object)((hqn)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("Active(id=", OrganizationId.a(this.a), ")");
    }
}
