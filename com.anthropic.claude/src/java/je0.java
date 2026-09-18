import java.util.Map;

public final class je0 extends e0d
{
    public veo J;
    public bnf K;
    public le0 L;
    public o8h M;
    public o8h N;
    public long O;
    public long P;
    public final he0 Q;
    public final he0 R;
    public long S;
    
    public je0(final veo j, final bnf k, final le0 l) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.O = 0L;
        this.P = 0L;
        this.Q = new he0(this, (byte)1);
        this.R = new he0(this, (byte)0);
        this.S = -9223372034707292160L;
    }
    
    @Override
    public final noe b(final ooe ooe, final goe goe, long a) {
        final o8h u = goe.u(a);
        if (((flc)ooe).r0()) {
            a = ((long)u.v << 32 | ((long)u.w & 0xFFFFFFFFL));
        }
        else {
            final veo j = this.J;
            final int v = u.v;
            if (j == null) {
                a = ((long)v << 32 | ((long)u.w & 0xFFFFFFFFL));
                this.S = a;
            }
            else {
                final int w = u.w;
                a = v;
                a = (((long)w & 0xFFFFFFFFL) | a << 32);
                final ueo a2 = j.a(new ie0(this, a, (byte)0), null, null, new ie0(this, a, (byte)1));
                this.L.f = a2;
                a = ((chc)a2.getValue()).a;
                this.S = ((chc)a2.getValue()).a;
            }
        }
        final boolean r0 = ((flc)ooe).r0();
        final s89 v2 = s89.v;
        if (r0) {
            this.M = u;
            this.O = a;
            return ooe.Y((int)(a >> 32), (int)(a & 0xFFFFFFFFL), (Map)v2, (lta)this.Q);
        }
        this.N = u;
        this.P = a;
        return ooe.Y((int)(a >> 32), (int)(a & 0xFFFFFFFFL), (Map)v2, (lta)this.R);
    }
    
    @Override
    public final void i1() {
        this.S = -9223372034707292160L;
    }
}
