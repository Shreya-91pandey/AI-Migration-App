public final class b4d
{
    public final q8k a;
    public final ny1 b;
    public final tmf c;
    
    public b4d(final q8k a, final ny1 b) {
        this.a = a;
        this.b = b;
        final long[] a2 = jak.a;
        this.c = new tmf();
    }
    
    public final zta a(final int n, final Object o, final Object o2) {
        final tmf c = this.c;
        final a4d a4d = (a4d)c.g(o);
        if (a4d != null && a4d.c == n && mlc.q(a4d.b, o2)) {
            ye6 d;
            if ((d = a4d.d) == null) {
                d = new ye6(818252804, true, (Object)new ah0((Object)a4d.e, (Object)a4d, (byte)22));
                a4d.d = d;
            }
            return (zta)d;
        }
        final a4d a4d2 = new a4d(this, n, o, o2);
        c.m(o, (Object)a4d2);
        final ye6 d2 = a4d2.d;
        if (d2 == null) {
            return (zta)(a4d2.d = new ye6(818252804, true, (Object)new ah0((Object)this, (Object)a4d2, (byte)22)));
        }
        return (zta)d2;
    }
    
    public final Object b(final Object o) {
        if (o != null) {
            final a4d a4d = (a4d)this.c.g(o);
            if (a4d != null) {
                return a4d.b;
            }
            final c4d c4d = (c4d)this.b.a();
            final int e = c4d.e(o);
            if (e != -1) {
                return c4d.c(e);
            }
        }
        return null;
    }
}
