public final class k4d
{
    public final Object a;
    public final m4d b;
    public int c;
    public int d;
    public k4d e;
    public boolean f;
    public final ksg g;
    
    public k4d(final Object a, final m4d b) {
        this.a = a;
        this.b = b;
        this.c = -1;
        this.g = o50.Q((Object)null);
    }
    
    public final k4d a() {
        if (this.f) {
            jac.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.v.add((Object)this);
            k4d e = (k4d)this.g.getValue();
            if (e != null) {
                e.a();
            }
            else {
                e = null;
            }
            this.e = e;
        }
        ++this.d;
        return this;
    }
    
    public final void b() {
        if (!this.f) {
            if (this.d <= 0) {
                jac.c("Release should only be called once");
            }
            final int d = this.d - 1;
            this.d = d;
            if (d == 0) {
                this.b.v.remove((Object)this);
                final k4d e = this.e;
                if (e != null) {
                    e.b();
                }
                this.e = null;
            }
        }
    }
}
