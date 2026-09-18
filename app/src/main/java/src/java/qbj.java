import java.util.concurrent.CancellationException;

public final class qbj implements cbd
{
    public final cof A;
    public final zta B;
    public final rad v;
    public final b4j w;
    public final oc7 x;
    public final rad y;
    public final l13 z;
    
    public qbj(final rad v, final b4j w, final oc7 x, final rad y, final l13 z, final cof a, final zta b) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
    }
    
    public final void g(final gbd gbd, final rad rad) {
        final rad v = this.v;
        final b4j w = this.w;
        if (rad == v) {
            w.v = rhc.G(this.x, (hc7)null, 0, (zta)new l10((Object)this.A, (Object)this.B, (f07)null, (byte)9), 3);
            return;
        }
        if (rad == this.y) {
            final opc opc = (opc)w.v;
            if (opc != null) {
                opc.g((CancellationException)null);
            }
            w.v = null;
        }
        if (rad == rad.ON_DESTROY) {
            this.z.resumeWith((Object)lqo.a);
        }
    }
}
