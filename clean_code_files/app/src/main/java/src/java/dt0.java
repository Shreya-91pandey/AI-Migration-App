public final class dt0 extends ogf implements vsk
{
    public final boolean v;
    public final lta w;
    
    public dt0(final lta w, final boolean v) {
        this.v = v;
        this.w = w;
    }
    
    public final hgf create() {
        return new db7(this.w, this.v, false);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dt0)) {
            return false;
        }
        final dt0 dt0 = (dt0)o;
        return this.v == dt0.v && this.w == dt0.w;
    }
    
    public final tsk getSemanticsConfiguration() {
        final tsk tsk = new tsk();
        tsk.x = this.v;
        this.w.b((Object)tsk);
        return tsk;
    }
    
    public final int hashCode() {
        return this.w.hashCode() + Boolean.hashCode(this.v) * 31;
    }
    
    public final void update(final hgf hgf) {
        final db7 db7 = (db7)hgf;
        db7.J = this.v;
        db7.L = this.w;
    }
}
