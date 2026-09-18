public final class d3q
{
    public final ksg a;
    public final ksg b;
    public final gsg c;
    public final isg d;
    public final gsg e;
    public final mcc f;
    public final mcc g;
    public long h;
    public long i;
    public long j;
    public long k;
    
    public d3q(final String s) {
        this.a = o50.Q((Object)Boolean.TRUE);
        this.b = o50.Q((Object)Boolean.FALSE);
        this.c = new gsg(0.0f);
        this.d = new isg(0L);
        this.e = new gsg(1.0f);
        this.f = new mcc(s.concat(" source"));
        this.g = new mcc(s.concat(" target"));
        this.h = -1L;
        this.i = -1L;
        this.j = -1L;
        this.k = -1L;
    }
}
