import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.AccountId;

public final class phb
{
    public final String a;
    public final String b;
    
    public phb(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof phb)) {
            return false;
        }
        final phb phb = (phb)o;
        return mlc.q((Object)this.a, (Object)phb.a) && mlc.q((Object)this.b, (Object)phb.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return lmf.t("HealthMetricOwner(accountId=", AccountId.a(this.a), ", organizationId=", OrganizationId.a(this.b), ")");
    }
}
