import com.anthropic.claude.api.account.BootstrapResponse;

public final class r2b implements s2b
{
    public final BootstrapResponse a;
    
    public r2b(final BootstrapResponse a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof r2b && mlc.q((Object)this.a, (Object)((r2b)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Success(response=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
