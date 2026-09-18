import androidx.compose.ui.graphics.shadow.DropShadowPainter;

public final class syl extends hgf implements bw8, k5g
{
    public aql J;
    public qpl K;
    public DropShadowPainter L;
    
    public final void F0() {
        this.L = null;
        x90.z((bw8)this);
    }
    
    public final void I0(final k0d k0d) {
        DropShadowPainter l = this.L;
        if (l == null) {
            final jmq b = soh.M((t98)this).getGraphicsContext().b();
            final aql j = this.J;
            final qpl k = this.K;
            b.getClass();
            l = new DropShadowPainter(j, k, (yy8)b);
            this.L = l;
        }
        xog.h((xog)l, k0d, k0d.v.i(), null, 6);
        k0d.a();
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && o instanceof syl) {
            final aql j = this.J;
            final syl syl = (syl)o;
            return mlc.q((Object)j, (Object)syl.J) && mlc.q((Object)this.K, (Object)syl.K);
        }
        return false;
    }
    
    public final int hashCode() {
        return this.K.hashCode() + this.J.hashCode() * 31;
    }
}
