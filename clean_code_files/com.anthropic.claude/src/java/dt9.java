import android.graphics.Rect;

public final class dt9 extends hgf implements x2b
{
    public Rect J;
    
    @Override
    public final void h1() {
        this.o1(null);
    }
    
    public final void o1(final Rect j) {
        final inf inf = new inf(0, (Object[])new Rect[16]);
        inf.e(inf.x, zp6.i(eqi.m0(this)));
        final Rect i = this.J;
        if (i != null) {
            inf.k((Object)i);
        }
        if (j != null && !j.isEmpty()) {
            inf.b((Object)j);
        }
        zp6.q(eqi.m0(this), inf.g());
        this.J = j;
    }
    
    @Override
    public final void u0(final yxf yxf) {
        final k2j l = r9n.t((nzc)yxf).L((nzc)yxf, true);
        this.o1(new Rect(k8e.H(l.a), k8e.H(l.b), k8e.H(l.c), k8e.H(l.d)));
    }
}
