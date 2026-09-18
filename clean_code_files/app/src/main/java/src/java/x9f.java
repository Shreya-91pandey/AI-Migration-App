import java.util.Map;
import java.util.LinkedHashMap;

public final class x9f extends hgf implements zl6, a0d
{
    public LinkedHashMap J;
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        float v;
        if ((v = ((qs8)uoo.z((zl6)this, (sei)hic.c)).v) < 0.0f) {
            v = 0.0f;
        }
        final o8h u = goe.u(n);
        final boolean i = super.I;
        final int n2 = 0;
        final boolean b = i && !Float.isNaN(v) && qs8.b(v, 0.0f) > 0;
        int l0;
        if (!Float.isNaN(v)) {
            l0 = ooe.L0(v);
        }
        else {
            l0 = 0;
        }
        int n4;
        final int n3 = n4 = u.v;
        if (b) {
            n4 = Math.max(n3, l0);
        }
        int n6;
        final int n5 = n6 = u.w;
        if (b) {
            n6 = Math.max(n5, l0);
        }
        if (b) {
            LinkedHashMap j;
            if ((j = this.J) == null) {
                j = new LinkedHashMap(2);
                this.J = j;
            }
            final i8p b2 = hic.b;
            int round;
            if ((round = Math.round((l0 - u.v) / 2.0f)) < 0) {
                round = 0;
            }
            ((Map)j).put((Object)b2, (Object)round);
            final olb a = hic.a;
            int round2 = Math.round((l0 - u.w) / 2.0f);
            if (round2 < 0) {
                round2 = n2;
            }
            ((Map)j).put((Object)a, (Object)round2);
        }
        Object o;
        if ((o = this.J) == null) {
            o = s89.v;
        }
        return ooe.Y(n4, n6, (Map)o, (lta)new jec(n4, u, n6));
    }
}
