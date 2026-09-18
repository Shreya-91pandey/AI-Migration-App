public final class he0 extends qxc implements lta
{
    public final byte w;
    public final je0 x;
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final je0 x = this.x;
        switch (w) {
            default: {
                final n8h n8h = (n8h)o;
                final o8h m = x.M;
                m.getClass();
                n8h.h(n8h, m, x.L.b.a((long)m.v << 32 | (0xFFFFFFFFL & (long)m.w), x.O, qzc.v));
                return a;
            }
            case 0: {
                final n8h n8h2 = (n8h)o;
                final o8h n = x.N;
                n.getClass();
                n8h.h(n8h2, n, x.L.b.a((long)n.v << 32 | (0xFFFFFFFFL & (long)n.w), x.P, qzc.v));
                return a;
            }
        }
    }
}
