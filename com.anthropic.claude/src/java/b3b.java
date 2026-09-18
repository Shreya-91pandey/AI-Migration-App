public final class b3b extends zmf
{
    @Override
    public final zmf C(final lta lta, final lta lta2) {
        return (zmf)g8m.b((lta)new mv2((lta)new n90((Object)lta, (Object)lta2, (byte)6), (byte)7));
    }
    
    @Override
    public final void c() {
        final Object c = g8m.c;
        synchronized (c) {
            this.o();
        }
    }
    
    @Override
    public final void k() {
        twl.Z();
        throw null;
    }
    
    @Override
    public final void l() {
        twl.Z();
        throw null;
    }
    
    @Override
    public final void m() {
        g8m.c();
    }
    
    @Override
    public final r7m u(final lta lta) {
        return (r7m)g8m.b((lta)new mv2((lta)new gx2(lta, (byte)1), (byte)7));
    }
    
    @Override
    public final uoo w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
