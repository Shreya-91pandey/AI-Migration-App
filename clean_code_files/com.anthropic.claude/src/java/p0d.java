import androidx.compose.ui.node.LayoutNode;
import java.util.Map;

public final class p0d implements noe
{
    public final int a;
    public final int b;
    public final Map c;
    public final lta d;
    public final q0d e;
    public final v0d f;
    public final lta g;
    
    public p0d(final int a, final int b, final Map c, final lta d, final q0d e, final v0d f, final lta g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final int b() {
        return this.a;
    }
    
    public final Map c() {
        return this.c;
    }
    
    public final void d() {
        final LayoutNode v = this.f.v;
        final boolean r0 = this.e.r0();
        final lta g = this.g;
        if (r0) {
            final kcc a0 = ((lcc)v.Z.y).A0;
            if (a0 != null) {
                g.b((Object)a0.K);
                return;
            }
        }
        g.b((Object)((lcc)v.Z.y).K);
    }
    
    public final lta g() {
        return this.d;
    }
}
