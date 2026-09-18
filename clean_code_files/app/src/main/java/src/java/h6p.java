import android.graphics.Bitmap;

public final class h6p extends s5p
{
    public final f7b b;
    public String c;
    public boolean d;
    public final yv8 e;
    public jta f;
    public final ksg g;
    public he2 h;
    public final ksg i;
    public long j;
    public float k;
    public float l;
    public final g6p m;
    
    public h6p(final f7b b) {
        this.b = b;
        b.i = (lta)new g6p(this, (byte)0);
        this.c = "";
        this.d = true;
        this.e = new yv8();
        this.f = (jta)new axo((byte)4);
        this.g = o50.Q((Object)null);
        this.i = o50.Q((Object)new yzl(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new g6p(this, (byte)1);
    }
    
    @Override
    public final void a(final cw8 cw8) {
        this.e(cw8, 1.0f, null);
    }
    
    public final void e(final cw8 a, final float n, he2 h) {
        final f7b b = this.b;
        final boolean d = b.d;
        final ksg g = this.g;
        int d2 = 0;
        Label_0133: {
            Label_0130: {
                if (d && b.e != 16L) {
                    final he2 he2 = (he2)g.getValue();
                    final int a2 = l6p.a;
                    if (he2 instanceof he2) {
                        final int c = he2.c;
                        if (c != 5) {
                            if (c != 3) {
                                break Label_0130;
                            }
                        }
                    }
                    else if (he2 != null) {
                        break Label_0130;
                    }
                    if (h instanceof he2) {
                        final int c2 = h.c;
                        if (c2 != 5) {
                            if (c2 != 3) {
                                break Label_0130;
                            }
                        }
                    }
                    else if (h != null) {
                        break Label_0130;
                    }
                    d2 = 1;
                    break Label_0133;
                }
            }
            d2 = 0;
        }
        final boolean d3 = this.d;
        final yv8 e = this.e;
        Label_0711: {
            if (!d3 && yzl.b(this.j, a.i())) {
                final n70 a3 = e.a;
                int a4;
                if (a3 != null) {
                    a4 = a3.a();
                }
                else {
                    a4 = 0;
                }
                if (d2 == a4) {
                    break Label_0711;
                }
            }
            he2 h2;
            if (d2 == 1) {
                long n2 = b.e;
                final int a5 = l6p.a;
                if (j86.c(n2) != 1.0f) {
                    n2 = j86.b(1.0f, n2);
                }
                h2 = new he2(n2, 5);
            }
            else {
                h2 = null;
            }
            this.h = h2;
            final float intBitsToFloat = Float.intBitsToFloat((int)(a.i() >> 32));
            final ksg i = this.i;
            this.k = intBitsToFloat / Float.intBitsToFloat((int)(((yzl)i.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int)(a.i() & 0xFFFFFFFFL)) / Float.intBitsToFloat((int)(((yzl)i.getValue()).a & 0xFFFFFFFFL));
            final long c3 = (long)(int)(float)Math.ceil((double)Float.intBitsToFloat((int)(a.i() >> 32))) << 32 | ((long)(int)(float)Math.ceil((double)Float.intBitsToFloat((int)(a.i() & 0xFFFFFFFFL))) & 0xFFFFFFFFL);
            final qzc layoutDirection = a.getLayoutDirection();
            n70 a6 = e.a;
            f40 f40 = e.b;
            Label_0542: {
                if (a6 != null && f40 != null) {
                    final int n3 = (int)(c3 >> 32);
                    final Bitmap a7 = a6.a;
                    if (n3 <= a7.getWidth() && (int)(c3 & 0xFFFFFFFFL) <= a7.getHeight() && e.d == d2) {
                        break Label_0542;
                    }
                }
                a6 = mlc.e((int)(c3 >> 32), (int)(c3 & 0xFFFFFFFFL), d2, 24);
                f40 = g40.a(a6);
                e.a = a6;
                e.b = f40;
                e.d = d2;
            }
            e.c = c3;
            final z13 e2 = e.e;
            final y13 v = e2.v;
            final long z = uoo.Z(c3);
            final xc8 a8 = v.a;
            final qzc b2 = v.b;
            final x13 c4 = v.c;
            final long d4 = v.d;
            v.a = (xc8)a;
            v.b = layoutDirection;
            v.c = f40;
            v.d = z;
            f40.g();
            cw8.r(e2, j86.b, 0L, 0L, 0.0f, null, null, 62);
            this.m.b((Object)e2);
            f40.p();
            v.a = a8;
            v.b = b2;
            v.c = c4;
            v.d = d4;
            a6.a.prepareToDraw();
            this.d = false;
            this.j = a.i();
        }
        if (h == null) {
            if (g.getValue() != null) {
                h = (he2)g.getValue();
            }
            else {
                h = this.h;
            }
        }
        final n70 a9 = e.a;
        if (a9 == null) {
            gac.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        cw8.k0(a, a9, 0L, e.c, 0L, 0L, n, h, 0, 858);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        final ksg i = this.i;
        sb.append(Float.intBitsToFloat((int)(((yzl)i.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int)(((yzl)i.getValue()).a & 0xFFFFFFFFL)));
        sb.append("\n");
        return sb.toString();
    }
}
