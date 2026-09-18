public final class q7m
{
    public static r7m a() {
        return (r7m)g8m.b.get();
    }
    
    public static r7m b(r7m e) {
        if (e instanceof mfo) {
            final mfo mfo = (mfo)e;
            if (mfo.t == eqi.T()) {
                mfo.r = null;
                return e;
            }
        }
        if (e instanceof nfo) {
            final nfo nfo = (nfo)e;
            if (nfo.i == eqi.T()) {
                nfo.h = null;
                return e;
            }
        }
        e = g8m.e(e, null, false);
        e.j();
        return e;
    }
    
    public static Object c(qd8 u, final jta jta) {
        final r7m r7m = (r7m)g8m.b.get();
        if (r7m instanceof mfo) {
            final mfo mfo = (mfo)r7m;
            if (mfo.t == eqi.T()) {
                final lta r = mfo.r;
                final lta s = mfo.s;
                try {
                    ((mfo)r7m).r = g8m.i((lta)u, r, true);
                    ((mfo)r7m).s = s;
                    return jta.a();
                }
                finally {
                    mfo.r = r;
                    mfo.s = s;
                }
            }
        }
        if (r7m == null || r7m instanceof zmf) {
            r7m j;
            if (r7m instanceof zmf) {
                j = r7m;
            }
            else {
                j = null;
            }
            u = new mfo((zmf)j, (lta)u, null, true, false);
        }
        else {
            u = r7m.u((lta)u);
        }
        Label_0196: {
            r7m j;
            try {
                j = ((r7m)u).j();
                final jta jta2 = jta;
                final Object o = jta2.a();
                final zmf zmf = (zmf)j;
                r7m.q(zmf);
                final Object o2 = u;
                ((r7m)o2).c();
                return o;
            }
            finally {
                break Label_0196;
            }
            try {
                final jta jta2 = jta;
                final Object o = jta2.a();
                final zmf zmf = (zmf)j;
                r7m.q(zmf);
                final Object o2 = u;
                ((r7m)o2).c();
                return o;
            }
            finally {
                r7m.q(j);
            }
        }
        ((r7m)u).c();
    }
    
    public static void d(final r7m r7m, final r7m r7m2, final lta lta) {
        if (r7m != r7m2) {
            r7m2.getClass();
            r7m.q(r7m);
            r7m2.c();
            return;
        }
        if (r7m instanceof mfo) {
            ((mfo)r7m).r = lta;
            return;
        }
        if (r7m instanceof nfo) {
            ((nfo)r7m).h = lta;
            return;
        }
        uy8.g((Object)r7m, "Non-transparent snapshot was reused: ");
    }
}
