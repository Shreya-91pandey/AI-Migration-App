public final class wna implements tna
{
    public final g70 a;
    public final h70 b;
    public final vhk c;
    public final aoa d;
    public final jy7 e;
    public final p8a f;
    
    public wna(final g70 a, final h70 b) {
        final vhk a2 = xna.a;
        final aoa d = new aoa(xna.b);
        final jy7 e = new jy7((byte)25);
        this.a = a;
        this.b = b;
        this.c = a2;
        this.d = d;
        this.e = e;
        this.f = new p8a((Object)this, (byte)1);
    }
    
    public final cno a(final zmo zmo) {
        final vhk c = this.c;
        final tt8 tt8 = new tt8((Object)this, (Object)zmo, (byte)4);
        final wab wab;
        monitorenter(wab = (wab)c.w);
        Label_0203: {
            try {
                final cno cno = (cno)((lyd)c.x).c((Object)zmo);
                if (cno != null) {
                    if (cno.b()) {
                        monitorexit(wab);
                        return cno;
                    }
                    final cno cno2 = (cno)((lyd)c.x).e((Object)zmo);
                }
            }
            finally {
                break Label_0203;
            }
            monitorexit(wab);
            try {
                final Throwable t;
                final cno cno3 = (cno)tt8.b((Object)new tyl((Object)c, (Object)t, (byte)18));
                final wab wab2;
                monitorenter(wab2 = (wab)c.w);
                Label_0189: {
                    try {
                        if (((lyd)c.x).c((Object)t) == null && cno3.b()) {
                            ((lyd)c.x).d((Object)t, (Object)cno3);
                        }
                    }
                    finally {
                        break Label_0189;
                    }
                    monitorexit(wab2);
                    return cno3;
                }
                monitorexit(wab2);
            }
            catch (final Exception ex) {
                fvd.o("Could not load font", (Throwable)ex);
                return null;
            }
        }
        monitorexit(wab);
    }
    
    public final cno b(final una una, zoa zoa, final int n, final int n2) {
        final int v = this.b.v;
        if (v != 0) {
            if (v != Integer.MAX_VALUE) {
                zoa = new zoa(ncq.o(zoa.v + v, 1, 1000));
            }
        }
        return this.a(new zmo(una, zoa, n, n2, null));
    }
}
