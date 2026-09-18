public final class tc9 extends qxc implements lta
{
    public final byte w;
    public final uc9 x;
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        final ec9 x = ec9.x;
        final ec9 w2 = ec9.w;
        final ec9 v = ec9.v;
        final uc9 x2 = this.x;
        switch (w) {
            default: {
                final xeo xeo = (xeo)o;
                bfa bfa;
                if (xeo.e(v, w2)) {
                    final m4m b = x2.N.a.b;
                    if (b == null || (bfa = b.b) == null) {
                        bfa = pc9.d;
                    }
                }
                else if (xeo.e(w2, x)) {
                    final m4m b2 = x2.O.a.b;
                    if (b2 == null || (bfa = b2.b) == null) {
                        bfa = pc9.d;
                    }
                }
                else {
                    bfa = pc9.d;
                }
                return bfa;
            }
            case 0: {
                final xeo xeo2 = (xeo)o;
                final boolean e = xeo2.e(v, w2);
                bfa bfa2 = null;
                if (e) {
                    final rd3 c = x2.N.a.c;
                    if (c != null) {
                        bfa2 = c.c;
                    }
                }
                else if (xeo2.e(w2, x)) {
                    final rd3 c2 = x2.O.a.c;
                    if (c2 != null) {
                        bfa2 = c2.c;
                    }
                }
                else {
                    bfa2 = pc9.e;
                }
                bfa e2;
                if ((e2 = bfa2) == null) {
                    e2 = pc9.e;
                }
                return e2;
            }
        }
    }
}
