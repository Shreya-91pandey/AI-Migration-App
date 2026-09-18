import android.view.DragEvent;

public final class jvi implements ut8
{
    public final d09 v;
    public final p8a w;
    
    public jvi(final d09 v, final p8a w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final void G0(final mt8 mt8) {
        this.v.b.b();
    }
    
    @Override
    public final void N(final mt8 mt8) {
        this.v.b.e();
    }
    
    @Override
    public final boolean Y0(final mt8 mt8) {
        this.w.b((Object)mt8);
        final DragEvent p = i9r.p(mt8);
        final vec vec = new vec(r8r.k(p.getClipData()), r8r.l(p.getClipDescription()), 1);
        return vec == this.v.b.a(vec) ^ true;
    }
    
    @Override
    public final void x0(final mt8 mt8) {
        this.v.b.c();
    }
    
    @Override
    public final void z(final mt8 mt8) {
        this.v.b.d();
    }
}
