import androidx.compose.ui.platform.AndroidComposeView;

public final class b9q implements sl6, cbd
{
    public final AndroidComposeView v;
    public final yl6 w;
    public boolean x;
    public vad y;
    public ye6 z;
    
    public b9q(final AndroidComposeView v, final yl6 w) {
        this.v = v;
        this.w = w;
        this.z = c5q.a;
    }
    
    public final void a() {
        if (!this.x) {
            this.x = true;
            final AndroidComposeView v = this.v;
            v.getView().setTag(2131297137, (Object)null);
            final vad y = this.y;
            if (y != null) {
                y.d((fbd)this);
            }
            this.y = null;
            final eq8 b = v.B;
            if (b != null) {
                b.w.a();
            }
            v.B = null;
        }
        this.w.a();
    }
    
    public final void b(final zta zta) {
        this.v.setOnReadyForComposition((lta)new tyl((Object)this, (Object)zta, (byte)25));
    }
    
    public final void g(final gbd gbd, final rad rad) {
        if (rad == rad.ON_DESTROY) {
            this.a();
            return;
        }
        if (rad == rad.ON_CREATE && !this.x) {
            this.b((zta)this.z);
        }
    }
}
