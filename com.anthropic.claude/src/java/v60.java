import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class v60 implements PointerInputEventHandler
{
    public final byte v;
    public final Object w;
    
    public final Object invoke(final ueh ueh, final f07 f07) {
        final byte v = this.v;
        Object a = lqo.a;
        final pc7 v2 = pc7.v;
        final Object w = this.w;
        switch (v) {
            default: {
                final dkn dkn = (dkn)w;
                final Object d = i1r.d(ueh, (aif)dkn.B, (dhn)dkn.A, f07);
                if (d == v2) {
                    a = d;
                }
                return a;
            }
            case 2: {
                final Object m = ien.m(f07, (zta)new a3e((Object)w, (Object)ueh, (f07)null, (byte)14));
                if (m == v2) {
                    a = m;
                }
                return a;
            }
            case 1: {
                final Object e = enq.e(ueh, (zta)new j4d((byte)4, (f07)null, (Object)w), f07);
                if (e == v2) {
                    a = e;
                }
                return a;
            }
            case 0: {
                final Object e2 = enq.e(ueh, (zta)new u60((byte)0, (f07)null, (Object)w), f07);
                if (e2 == v2) {
                    a = e2;
                }
                return a;
            }
        }
    }
}
