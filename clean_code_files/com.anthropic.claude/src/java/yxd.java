import java.util.Map;
import androidx.compose.ui.node.LayoutNode;
import java.util.LinkedHashMap;

public abstract class yxd extends wxd implements goe
{
    public final yxf P;
    public long Q;
    public LinkedHashMap R;
    public final zxd S;
    public noe T;
    public final amf U;
    
    public yxd(final yxf p) {
        this.P = p;
        this.Q = 0L;
        this.S = new zxd(this);
        final amf a = i4g.a;
        this.U = new amf();
    }
    
    @Override
    public final long D0() {
        return this.Q;
    }
    
    @Override
    public final void I0() {
        this.a0(this.Q, 0.0f, null);
    }
    
    public final long O0() {
        return (long)super.v << 32 | ((long)super.w & 0xFFFFFFFFL);
    }
    
    public void R0() {
        this.y0().d();
    }
    
    public final void V0(final long q) {
        if (!ugc.b(this.Q, q)) {
            this.Q = q;
            final yxf p = this.P;
            final byd q2 = p.P.t().q;
            if (q2 != null) {
                q2.n0();
            }
            wxd.G0(p);
        }
        if (!super.J) {
            this.n0(this.y0());
        }
    }
    
    public final long X0(final yxd obj, final boolean b) {
        long n = 0L;
        yxd f1 = this;
        while (!f1.equals(obj)) {
            long d = 0L;
            Label_0040: {
                if (f1.G) {
                    d = n;
                    if (b) {
                        break Label_0040;
                    }
                }
                d = ugc.d(n, f1.Q);
            }
            final yxf t = f1.P.T;
            t.getClass();
            f1 = t.f1();
            f1.getClass();
            n = d;
        }
        return n;
    }
    
    public final void Y0(final noe t) {
        if (t != null) {
            this.c0(((long)t.a() & 0xFFFFFFFFL) | (long)t.b() << 32);
        }
        else {
            this.c0(0L);
        }
        if (!mlc.q((Object)this.T, (Object)t) && t != null) {
            final LinkedHashMap r = this.R;
            if (((r != null && !((Map)r).isEmpty()) || !t.c().isEmpty()) && !mlc.q((Object)t.c(), (Object)this.R)) {
                final byd q = this.P.P.t().q;
                q.getClass();
                q.N.f();
                LinkedHashMap r2;
                if ((r2 = this.R) == null) {
                    r2 = new LinkedHashMap();
                    this.R = r2;
                }
                ((Map)r2).clear();
                ((Map)r2).putAll(t.c());
            }
        }
        this.T = t;
    }
    
    @Override
    public final void a0(final long n, final float n2, final lta lta) {
        this.V0(n);
        if (super.I) {
            return;
        }
        this.R0();
    }
    
    public final float getDensity() {
        return this.P.getDensity();
    }
    
    public final qzc getLayoutDirection() {
        return this.P.P.V;
    }
    
    public final float o0() {
        return this.P.o0();
    }
    
    @Override
    public final wxd q0() {
        final yxf s = this.P.S;
        if (s != null) {
            return s.f1();
        }
        return null;
    }
    
    @Override
    public final boolean r0() {
        return true;
    }
    
    @Override
    public final nzc u0() {
        return this.S;
    }
    
    @Override
    public final boolean v0() {
        return this.T != null;
    }
    
    @Override
    public final LayoutNode x0() {
        return this.P.P;
    }
    
    @Override
    public final noe y0() {
        final noe t = this.T;
        if (t != null) {
            return t;
        }
        throw ge9.x("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }
    
    @Override
    public final Object z() {
        return this.P.z();
    }
    
    @Override
    public final wxd z0() {
        final yxf t = this.P.T;
        if (t != null) {
            return t.f1();
        }
        return null;
    }
}
