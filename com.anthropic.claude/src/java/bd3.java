import android.view.View;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

public final class bd3 implements ubh
{
    public final ubh v;
    public final ubh w;
    public final AtomicReference x;
    public final cd3 y;
    
    public bd3(final ubh ubh, final AtomicReference x, final cd3 y) {
        this.w = ubh;
        this.x = x;
        this.y = y;
        this.v = ubh;
    }
    
    @Override
    public final void Y(final obh obh, final h07 h07) {
        ad3 ad4 = null;
        Label_0051: {
            if (h07 instanceof ad3) {
                final ad3 ad3 = (ad3)h07;
                final int x = ad3.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    ad3.x = x + Integer.MIN_VALUE;
                    ad4 = ad3;
                    break Label_0051;
                }
            }
            ad4 = new ad3(this, h07);
        }
        final Object v = ad4.v;
        final int x2 = ad4.x;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            final mx1 mx1 = new mx1((byte)29);
            final o10 o10 = new o10((Object)this.y, (Object)obh, (Object)this.w, (f07)null, (byte)7);
            ad4.x = 1;
            if (ien.m((f07)ad4, (zta)new l10((byte)10, (f07)null, (Serializable)this.x, (Object)mx1, (Object)o10)) == pc7.v) {
                return;
            }
        }
        ebq.a();
    }
    
    public final hc7 getCoroutineContext() {
        return ((oc7)this.v).getCoroutineContext();
    }
    
    @Override
    public final View getView() {
        return this.v.getView();
    }
}
