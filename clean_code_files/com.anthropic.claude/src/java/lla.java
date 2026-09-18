import java.util.Set;
import androidx.work.impl.WorkDatabase;

public final class lla implements jja
{
    public final jja v;
    public final WorkDatabase w;
    public final boolean x;
    public final lta y;
    
    public lla(final jja v, final WorkDatabase w, final boolean x, final lta y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final Object l(final Object o, final f07 f07) {
        Object o2 = null;
        Label_0051: {
            if (f07 instanceof kla) {
                final kla kla = (kla)f07;
                final int w = kla.w;
                if ((w & Integer.MIN_VALUE) != 0x0) {
                    kla.w = w + Integer.MIN_VALUE;
                    o2 = kla;
                    break Label_0051;
                }
            }
            o2 = new kla(this, f07);
        }
        Object o3 = ((kla)o2).v;
        final int w2 = ((kla)o2).w;
        final pc7 v = pc7.v;
        jja x;
        if (w2 != 0) {
            if (w2 != 1) {
                if (w2 == 2) {
                    vt4.g0(o3);
                    return lqo.a;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                x = ((kla)o2).x;
                vt4.g0(o3);
            }
        }
        else {
            vt4.g0(o3);
            final Set set = (Set)o;
            x = this.v;
            ((kla)o2).x = x;
            ((kla)o2).w = 1;
            o3 = xp7.M(this.w, true, this.x, this.y, (h07)o2);
            if (o3 == v) {
                return v;
            }
        }
        ((kla)o2).x = null;
        ((kla)o2).w = 2;
        if (x.l(o3, (f07)o2) != v) {
            return lqo.a;
        }
        return v;
    }
}
