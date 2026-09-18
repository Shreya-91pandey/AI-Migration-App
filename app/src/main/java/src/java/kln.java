import java.util.LinkedHashMap;
import java.util.Map;

public final class kln extends v98 implements a0d, x2b, zl6
{
    public qmn L;
    public boolean M;
    public final sl2 N;
    public Map O;
    
    public kln(qmn l, final peo peo, final mnn mnn, final boolean m, final zta b, final mvc mvc) {
        this.L = l;
        this.M = m;
        final sl2 n = new sl2(l.h);
        this.o1((t98)n);
        this.N = n;
        l = this.L;
        l.b = b;
        final boolean i = this.M;
        l.a.v.setValue((Object)new zin(peo, mnn, i, i ^ true, mvc.c == 4));
    }
    
    public final noe b(final ooe ooe, final goe goe, long c) {
        final qmn l = this.L;
        final qzc layoutDirection = ooe.getLayoutDirection();
        final tna tna = (tna)uoo.z((zl6)this, (sei)hm6.k);
        final ajn a = l.a;
        final yin value = new yin(ooe, layoutDirection, tna, c);
        a.w.setValue((Object)value);
        final zin zin = (zin)a.v.getValue();
        if (zin != null) {
            final omn e = a.e(zin, value);
            c = e.c;
            final zta b = l.b;
            if (b != null) {
                b.d((Object)ooe, (Object)new wfk((Object)l, (byte)18));
            }
            final int n = (int)(c >> 32);
            final int n2 = (int)(c & 0xFFFFFFFFL);
            final o8h u = goe.u(ri2.F(n, n, n2, n2));
            final qmn i = this.L;
            float e2;
            if (this.M) {
                e2 = ooe.e0(zn2.q(e.b.b(0)));
            }
            else {
                e2 = 0.0f;
            }
            i.g.setValue((Object)new qs8(e2));
            Object o;
            if ((o = this.O) == null) {
                o = new LinkedHashMap(2);
            }
            ((Map)o).put((Object)kx.a, (Object)Math.round(e.d));
            ((Map)o).put((Object)kx.b, (Object)Math.round(e.e));
            this.O = (Map)o;
            return ooe.Y(n, n2, (Map)o, (lta)new t40(u, (byte)11));
        }
        jac.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        ebq.a();
        return null;
    }
    
    public final void u0(final yxf value) {
        this.L.d.setValue((Object)value);
    }
}
