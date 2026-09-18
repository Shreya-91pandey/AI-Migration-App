public final class rkn implements jja
{
    public final byte v;
    public final ykn w;
    
    public final Object l(Object a, final f07 f07) {
        final byte v = this.v;
        final ykn w = this.w;
        Object a2 = lqo.a;
        switch (v) {
            default: {
                final k2j k2j = (k2j)a;
                if (k2j != null) {
                    final boolean c = twl.C;
                    final pc7 v2 = pc7.v;
                    Label_0105: {
                        if (c) {
                            w.d.f();
                        }
                        else {
                            final cy1 l = w.l;
                            if (l != null) {
                                a = l.a(w, k2j, f07);
                                if (a == v2) {
                                    break Label_0105;
                                }
                            }
                        }
                        a = a2;
                    }
                    if (a == v2) {
                        a2 = a;
                    }
                }
                else {
                    w.w();
                }
                return a2;
            }
            case 0: {
                final hhn hhn = (hhn)a;
                w.D(false);
                w.E(snn.v);
                return a2;
            }
        }
    }
}
