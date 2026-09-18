public final class mun
{
    public gun a;
    public final lqg b;
    public final lqg c;
    public final lqg d;
    public tze e;
    public final v4a f;
    public long g;
    public final byte h;
    
    public mun() {
        this.b = new lqg();
        this.c = new lqg();
        this.d = new lqg();
        this.f = new v4a(new lun(this, (byte)0), new lun(this, (byte)1));
        this.g = 0L;
        this.h = 3;
    }
    
    public final lqg a(final int n) {
        return this.b(this.c(n));
    }
    
    public final lqg b(final oun oun) {
        final int ordinal = oun.ordinal();
        if (ordinal == 0) {
            return this.b;
        }
        if (ordinal == 1) {
            return this.c;
        }
        if (ordinal == 2) {
            return this.d;
        }
        en9.r();
        return null;
    }
    
    public final oun c(final int n) {
        final gun a = this.a;
        if (a == null) {
            mlc.j0("ltrOrder");
            throw null;
        }
        if (n == 0) {
            return a.a;
        }
        if (n == 1) {
            return oun.v;
        }
        if (n == 2) {
            return a.b;
        }
        en9.j(smk.p(n, "Invalid pane index "));
        return null;
    }
}
