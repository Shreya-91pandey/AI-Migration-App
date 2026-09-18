public final class w25 extends ogf implements vsk
{
    public final lta v;
    
    public w25(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        return new db7(this.v, false, true);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof w25 && this.v == ((w25)o).v);
    }
    
    public final tsk getSemanticsConfiguration() {
        final tsk tsk = new tsk();
        tsk.x = false;
        tsk.y = true;
        this.v.b((Object)tsk);
        return tsk;
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        ((db7)hgf).L = this.v;
    }
}
