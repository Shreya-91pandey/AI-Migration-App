public abstract class frf
{
    public c2l a;
    public boolean b;
    
    public final void a() {
        final c2l a = this.a;
        if (a != null) {
            if (!this.b) {
                a.v(this, null);
            }
            final grf grf = (grf)a.x;
            final re re = (re)a.w;
            if (this.equals(grf.h)) {
                if (-1 == grf.g) {
                    drf drf;
                    if ((drf = grf.f) == null) {
                        drf = grf.c(-1);
                    }
                    grf.f = null;
                    grf.g = 0;
                    grf.h = null;
                    if (drf == null) {
                        ((d8g)re.w).a.run();
                    }
                    else {
                        drf.b();
                    }
                    grf.a.n((Object)null, (Object)hrf.d);
                }
            }
            this.b = false;
            return;
        }
        en9.q("This input is not added to any dispatcher.");
    }
    
    public void b(final boolean b) {
    }
}
