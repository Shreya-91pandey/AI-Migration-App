import android.app.Activity;

public final class se implements aq8
{
    public final byte a;
    public final Object b;
    
    @Override
    public final void a() {
        final byte a = this.a;
        int n = 0;
        final Object b = this.b;
        switch (a) {
            default: {
                ((zmk)b).z(null);
                return;
            }
            case 9: {
                final oek oek = (oek)b;
                if (oek.c) {
                    final Activity d = oek.d;
                    if (d != null) {
                        ws4.f(d, ws4.b(oek.e.getValue()));
                    }
                    oek.d = null;
                }
                return;
            }
            case 8: {
                ((pdj)b).c();
                return;
            }
            case 7: {
                ((jmf)b).e = null;
                return;
            }
            case 6: {
                final k4d k4d = (k4d)b;
                k4d.f = true;
                k4d.d = 0;
                k4d.b.v.remove((Object)k4d);
                final k4d e = k4d.e;
                if (e != null) {
                    e.b();
                }
                k4d.e = null;
                return;
            }
            case 5: {
                final p4d p4d = (p4d)b;
                final rfa c = p4d.c;
                if (c != null) {
                    c.a = false;
                }
                p4d.c = null;
                return;
            }
            case 4: {
                ((a4d)b).d = null;
                return;
            }
            case 3: {
                ((dkn)b).s();
                return;
            }
            case 2: {
                final xd4 x0 = ((oc4)b).X0;
                final int n2 = x0.n - 1;
                if (n2 >= 0) {
                    n = n2;
                }
                x0.n = n;
                if (n == 0 && !(boolean)x0.i.getValue()) {
                    x0.j = true;
                }
                return;
            }
            case 1: {
                final ykn ykn = (ykn)b;
                ykn.w();
                ykn.k = null;
                return;
            }
            case 0: {
                final pe a2 = ((le)b).a;
                if (a2 != null) {
                    a2.r0();
                }
                else {
                    en9.q("Launcher has not been initialized");
                }
            }
        }
    }
}
