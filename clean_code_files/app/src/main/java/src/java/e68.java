import com.anthropic.claude.types.strings.OrganizationId;

public final class e68 implements g68
{
    public final String a;
    
    public e68(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof e68 && mlc.q((Object)this.a, (Object)((e68)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("Found(organizationId=", OrganizationId.a(this.a), ")");
    }
}
