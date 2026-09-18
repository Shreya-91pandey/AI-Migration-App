public final class p4d
{
    public final lta a;
    public final tze b;
    public rfa c;
    public int d;
    public int e;
    public int f;
    
    public p4d(final lta a) {
        this.b = new tze((byte)4);
        this.d = -1;
        this.e = -1;
        this.a = a;
    }
    
    public final o4d a(final int n, final long n2, final boolean b, final lta lta) {
        final rfa c = this.c;
        if (c != null) {
            final ikh ikh = (ikh)c.d;
            final boolean b2 = ikh instanceof ia0;
            final yjh yjh = new yjh(c, n, n2, this.b, lta);
            if (b2) {
                if (b) {
                    final ia0 ia0 = (ia0)ikh;
                    ia0.w.add((Object)new yoh(1, yjh));
                    if (!ia0.x) {
                        ia0.x = true;
                        ia0.v.post((Runnable)ia0);
                    }
                }
                else {
                    final ia0 ia2 = (ia0)ikh;
                    ia2.w.add((Object)new yoh(0, yjh));
                    if (!ia2.x) {
                        ia2.x = true;
                        ia2.v.post((Runnable)ia2);
                    }
                }
            }
            else {
                ikh.a(yjh);
            }
            ncq.S((long)n, "compose:lazy:schedule_prefetch:index");
            return (o4d)yjh;
        }
        return (o4d)kz8.a;
    }
}
