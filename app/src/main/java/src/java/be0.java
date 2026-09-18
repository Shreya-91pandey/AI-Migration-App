public final class be0 extends qxc implements lta
{
    public final byte w;
    public final ce0 x;
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        int i = 0;
        final int n = 0;
        final ce0 x = this.x;
        switch (w) {
            default: {
                final n8h n8h = (n8h)o;
                final o8h[] b = x.b;
                b.getClass();
                final int d = x.d;
                final int f = x.f;
                final int length = b.length;
                int j = n;
                final lqo lqo = a;
                while (j < length) {
                    final o8h o8h = b[j];
                    if (o8h != null) {
                        final long a2 = x.a.b.a(((long)o8h.w & 0xFFFFFFFFL) | (long)o8h.v << 32, (long)d << 32 | ((long)f & 0xFFFFFFFFL), qzc.v);
                        n8h.g(n8h, o8h, (int)(a2 >> 32), (int)(a2 & 0xFFFFFFFFL));
                    }
                    ++j;
                }
                return lqo;
            }
            case 0: {
                final n8h n8h2 = (n8h)o;
                final o8h[] c = x.c;
                c.getClass();
                final int e = x.e;
                final int g = x.g;
                while (i < c.length) {
                    final o8h o8h2 = c[i];
                    if (o8h2 != null) {
                        final long a3 = x.a.b.a((long)o8h2.v << 32 | ((long)o8h2.w & 0xFFFFFFFFL), (long)e << 32 | ((long)g & 0xFFFFFFFFL), qzc.v);
                        n8h.g(n8h2, o8h2, (int)(a3 >> 32), (int)(a3 & 0xFFFFFFFFL));
                    }
                    ++i;
                }
                return a;
            }
        }
    }
}
