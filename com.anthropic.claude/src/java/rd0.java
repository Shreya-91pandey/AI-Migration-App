import java.util.Map;

public final class rd0 extends hgf implements rt0
{
    public wfk J;
    public qun K;
    public boolean L;
    public long M;
    public long N;
    public jcn O;
    
    public final noe D0(final st0 st0, final goe goe, final long n) {
        final jcn o = this.O;
        final float floatValue = ((Number)o.f((long)(o.b() * ((Number)this.J.a()).floatValue()))).floatValue();
        final o8h u = goe.u(n);
        return ((ooe)st0).Y(u.v, u.w, (Map)s89.v, (lta)new c60((Object)u, floatValue, (Object)this, (byte)1));
    }
    
    public final boolean T() {
        return false;
    }
    
    public final boolean v0(final xxd xxd) {
        final qun k = this.K;
        final nzc j = ((cyd)k).j((n8h)xxd);
        final nzc b = xxd.b();
        b.getClass();
        final long r = zrn.R(((cyd)k).f(j, b));
        if (!ugc.b(this.N, r)) {
            this.M = this.N;
            this.N = r;
        }
        return this.L && !ugc.b(this.M, -9223372034707292160L) && !ugc.b(this.M, this.N) && ((Number)this.J.a()).floatValue() != 1.0f;
    }
}
