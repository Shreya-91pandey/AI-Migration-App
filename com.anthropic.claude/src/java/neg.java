public final class neg extends gfg
{
    public static final neg c;
    
    static {
        c = (neg)new gfg(0, 3, 1);
    }
    
    @Override
    public final void a(final ifg ifg, final it0 it0, final y5m y5m, final yb0 yb0, final hfg hfg) {
        final v5m v5m = (v5m)ifg.b(1);
        final bva bva = (bva)ifg.b(0);
        final wga wga = (wga)ifg.b(2);
        final y5m o = v5m.o();
        final hfg hfg2;
        Label_0058: {
            Label_0056: {
                if (hfg != null) {
                    Label_0122: {
                        try {
                            rcr.b(hfg, y5m);
                            break Label_0058;
                        }
                        finally {
                            break Label_0122;
                        }
                        break Label_0056;
                    }
                    o.e(false);
                }
            }
            hfg2 = null;
        }
        if (!wga.d.i0()) {
            ti6.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        wga.c.h0(it0, o, yb0, hfg2);
        o.e(true);
        y5m.d();
        bva.getClass();
        y5m.z(v5m, v5m.a(bva));
        y5m.j();
    }
}
