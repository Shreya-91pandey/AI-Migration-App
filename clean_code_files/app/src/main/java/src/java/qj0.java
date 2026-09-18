import com.anthropic.claude.api.result.ApiResult;

public final class qj0 implements ApiResult
{
    public final int a;
    public final Object b;
    
    public qj0(final int a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qj0)) {
            return false;
        }
        final qj0 qj0 = (qj0)o;
        return this.a == qj0.a && mlc.q(this.b, qj0.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = Integer.hashCode(this.a);
        final Object b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Success(code=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
