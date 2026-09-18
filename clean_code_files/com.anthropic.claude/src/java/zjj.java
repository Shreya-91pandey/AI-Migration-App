public final class zjj implements dkj
{
    public final String a;
    public final String b;
    
    public zjj(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public zjj(final Throwable t) {
        this(bk0.f(t), bk0.c(t));
    }
    
    public zjj(final pj0 pj0) {
        this(bk0.d(pj0), bk0.a(pj0));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zjj)) {
            return false;
        }
        final zjj zjj = (zjj)o;
        return mlc.q((Object)this.a, (Object)zjj.a) && mlc.q((Object)this.b, (Object)zjj.b);
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
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return lmf.t("Failed(errorType=", this.a, ", errorCode=", this.b, ")");
    }
}
