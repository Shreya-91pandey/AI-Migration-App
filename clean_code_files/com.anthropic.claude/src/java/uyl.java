import java.util.Map;

public final class uyl extends hgf implements a0d, xsk
{
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public long Q;
    public aql R;
    public boolean S;
    public long T;
    public long U;
    public int V;
    public byte W;
    public czc X;
    public e0j Y;
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final o8h u = goe.u(n);
        return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new tyl((Object)u, (Object)this, (byte)0));
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final void j(final itk itk) {
        if (!this.S) {
            return;
        }
        ftk.u(itk, this.R);
    }
    
    public final boolean o() {
        return false;
    }
    
    public final String toString() {
        final float j = this.J;
        final float k = this.K;
        final float l = this.L;
        final float m = this.M;
        final float n = this.N;
        final float o = this.O;
        final float p = this.P;
        final String b = jeo.b(this.Q);
        final aql r = this.R;
        final boolean s = this.S;
        final String h = j86.h(this.T);
        final String h2 = j86.h(this.U);
        final String n2 = oz1.n("CompositingStrategy(value=", this.V, ")");
        final String i = x90.L((int)this.W);
        final czc x = this.X;
        final StringBuilder r2 = hia.r("SimpleGraphicsLayerModifier(scaleX=", j, ", scaleY=", k, ", alpha = ");
        oz1.z(r2, l, ", translationX=", m, ", translationY=0.0, shadowElevation=");
        oz1.z(r2, n, ", rotationX=0.0, rotationY=0.0, rotationZ=", o, ", cameraDistance=");
        r2.append(p);
        r2.append(", transformOrigin=");
        r2.append(b);
        r2.append(", shape=");
        r2.append((Object)r);
        r2.append(", clip=");
        r2.append(s);
        r2.append(", renderEffect=null, ambientShadowColor=");
        oz1.A(r2, h, ", spotShadowColor=", h2, ", compositingStrategy=");
        oz1.A(r2, n2, ", blendMode=", i, ", colorFilter=nulloutsets=");
        r2.append((Object)x);
        r2.append(")");
        return r2.toString();
    }
}
