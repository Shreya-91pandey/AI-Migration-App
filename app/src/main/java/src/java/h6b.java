final class h6b extends ogf
{
    public final float A;
    public final long B;
    public final aql C;
    public final boolean D;
    public final long E;
    public final long F;
    public final int G;
    public final czc H;
    public final float v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;
    
    public h6b(final float v, final float w, final float x, final float y, final float z, final float a, final long b, final aql c, final boolean d, final long e, final long f, final int g, final czc h) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((uyl)hgf).J = this.v;
        ((uyl)hgf).K = this.w;
        ((uyl)hgf).L = this.x;
        ((uyl)hgf).M = this.y;
        ((uyl)hgf).N = this.z;
        ((uyl)hgf).O = this.A;
        ((uyl)hgf).P = 8.0f;
        ((uyl)hgf).Q = this.B;
        ((uyl)hgf).R = this.C;
        ((uyl)hgf).S = this.D;
        ((uyl)hgf).T = this.E;
        ((uyl)hgf).U = this.F;
        ((uyl)hgf).V = this.G;
        ((uyl)hgf).W = 3;
        ((uyl)hgf).X = this.H;
        ((uyl)hgf).Y = new e0j((Object)hgf, (byte)10);
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof h6b) {
                final h6b h6b = (h6b)o;
                if (Float.compare(this.v, h6b.v) == 0) {
                    if (Float.compare(this.w, h6b.w) == 0) {
                        if (Float.compare(this.x, h6b.x) == 0) {
                            if (Float.compare(this.y, h6b.y) == 0) {
                                if (Float.compare(0.0f, 0.0f) == 0) {
                                    if (Float.compare(this.z, h6b.z) == 0) {
                                        if (Float.compare(0.0f, 0.0f) == 0) {
                                            if (Float.compare(0.0f, 0.0f) == 0) {
                                                if (Float.compare(this.A, h6b.A) == 0) {
                                                    if (Float.compare(8.0f, 8.0f) == 0) {
                                                        if (jeo.a(this.B, h6b.B)) {
                                                            if (mlc.q((Object)this.C, (Object)h6b.C)) {
                                                                if (this.D == h6b.D) {
                                                                    final long e = h6b.E;
                                                                    final int i = j86.i;
                                                                    if (foo.a(this.E, e)) {
                                                                        if (foo.a(this.F, h6b.F)) {
                                                                            if (this.G == h6b.G) {
                                                                                if (mlc.q((Object)this.H, (Object)h6b.H)) {
                                                                                    return true;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        final int d = oz1.d(8.0f, oz1.d(this.A, oz1.d(0.0f, oz1.d(0.0f, oz1.d(this.z, oz1.d(0.0f, oz1.d(this.y, oz1.d(this.x, oz1.d(this.w, Float.hashCode(this.v) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        final int c = jeo.c;
        final int l = smk.l((this.C.hashCode() + hia.d(d, this.B, 31)) * 31, 961, this.D);
        final int i = j86.i;
        return this.H.hashCode() + hia.y(3, hia.y(this.G, hia.d(hia.d(l, this.E, 31), this.F, 31), 31), 961);
    }
    
    public final String toString() {
        final String b = jeo.b(this.B);
        final String h = j86.h(this.E);
        final String h2 = j86.h(this.F);
        final String n = oz1.n("CompositingStrategy(value=", this.G, ")");
        final String l = x90.L(3);
        final StringBuilder r = hia.r("GraphicsLayerElement(scaleX=", this.v, ", scaleY=", this.w, ", alpha=");
        oz1.z(r, this.x, ", translationX=", this.y, ", translationY=0.0, shadowElevation=");
        oz1.z(r, this.z, ", rotationX=0.0, rotationY=0.0, rotationZ=", this.A, ", cameraDistance=8.0, transformOrigin=");
        r.append(b);
        r.append(", shape=");
        r.append((Object)this.C);
        r.append(", clip=");
        a6l.k(r, this.D, ", renderEffect=null, ambientShadowColor=", h, ", spotShadowColor=");
        oz1.A(r, h2, ", compositingStrategy=", n, ", blendMode=");
        r.append(l);
        r.append(", colorFilter=null, outsets=");
        r.append((Object)this.H);
        r.append(")");
        return r.toString();
    }
    
    public final void update(final hgf hgf) {
        final hgf hgf2 = hgf;
        ((uyl)hgf2).J = this.v;
        ((uyl)hgf2).K = this.w;
        ((uyl)hgf2).L = this.x;
        ((uyl)hgf2).M = this.y;
        ((uyl)hgf2).N = this.z;
        ((uyl)hgf2).O = this.A;
        ((uyl)hgf2).P = 8.0f;
        ((uyl)hgf2).Q = this.B;
        ((uyl)hgf2).R = this.C;
        ((uyl)hgf2).S = this.D;
        ((uyl)hgf2).T = this.E;
        ((uyl)hgf2).U = this.F;
        ((uyl)hgf2).V = this.G;
        ((uyl)hgf2).W = 3;
        ((uyl)hgf2).X = this.H;
        final e0j y = ((uyl)hgf2).Y;
        if (hgf2.v.I) {
            final yxf s = soh.J((t98)hgf2, 2).S;
            if (s != null) {
                s.H1((lta)y, true);
            }
        }
    }
}
