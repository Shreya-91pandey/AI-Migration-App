import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import android.view.View;

public final class o90 implements ubh, oc7
{
    public final View v;
    public final amn w;
    public final oc7 x;
    public final AtomicReference y;
    
    public o90(final View v, final amn w, final oc7 x) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = new AtomicReference((Object)null);
    }
    
    @Override
    public final void Y(final obh obh, final h07 h07) {
        m90 m91 = null;
        Label_0051: {
            if (h07 instanceof m90) {
                final m90 m90 = (m90)h07;
                final int x = m90.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    m90.x = x + Integer.MIN_VALUE;
                    m91 = m90;
                    break Label_0051;
                }
            }
            m91 = new m90(this, h07);
        }
        final Object v = m91.v;
        final int x2 = m91.x;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            final e4 e4 = new e4((Object)obh, (Object)this, (byte)1);
            final p10 p2 = new p10((byte)2, (f07)null, (Object)this);
            m91.x = 1;
            if (ien.m((f07)m91, (zta)new l10((byte)10, (f07)null, (Serializable)this.y, (Object)e4, (Object)p2)) == pc7.v) {
                return;
            }
        }
        ebq.a();
    }
    
    public final hc7 getCoroutineContext() {
        return this.x.getCoroutineContext();
    }
    
    @Override
    public final View getView() {
        return this.v;
    }
}
