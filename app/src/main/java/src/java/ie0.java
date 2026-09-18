public final class ie0 extends qxc implements lta
{
    public final byte w;
    public final je0 x;
    public final long y;
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        long a = 0L;
        long n = this.y;
        final je0 x = this.x;
        switch (w) {
            default: {
                if (mlc.q(o, x.L.d())) {
                    if (!chc.b(x.S, -9223372034707292160L)) {
                        n = x.S;
                    }
                }
                else {
                    final xom xom = (xom)x.L.e.g(o);
                    n = a;
                    if (xom != null) {
                        n = ((chc)xom.getValue()).a;
                    }
                }
                return new chc(n);
            }
            case 0: {
                final xeo xeo = (xeo)o;
                if (mlc.q(xeo.d(), x.L.d())) {
                    if (!chc.b(x.S, -9223372034707292160L)) {
                        n = x.S;
                    }
                }
                else {
                    final xom xom2 = (xom)x.L.e.g(xeo.d());
                    if (xom2 != null) {
                        n = ((chc)xom2.getValue()).a;
                    }
                    else {
                        n = 0L;
                    }
                }
                final xom xom3 = (xom)x.L.e.g(xeo.h());
                if (xom3 != null) {
                    a = ((chc)xom3.getValue()).a;
                }
                final o0m o0m = (o0m)((xom)x.K).getValue();
                bfa a2;
                if (o0m == null || (a2 = (bfa)o0m.b.d(new chc(n), new chc(a))) == null) {
                    a2 = ri2.A0(0.0f, 400.0f, null, 5);
                }
                return a2;
            }
        }
    }
}
