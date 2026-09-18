import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;

public final class xy8
{
    public final k8e a;
    public g90 b;
    public he2 c;
    public long d;
    public long e;
    public long f;
    public qzc g;
    public float h;
    public final qpl i;
    public final y80 j;
    public n70 k;
    
    public xy8(final qpl i, final k8e a) {
        this.a = a;
        final int j = j86.i;
        this.d = j86.h;
        this.e = 0L;
        this.f = 9205357640488583168L;
        this.g = qzc.v;
        this.h = 1.0f;
        this.i = i;
        this.j = uoo.d();
    }
    
    public final void a(final cw8 cw8, he2 c, final long f, long d, final float n, final int n2) {
        final k8e a = this.a;
        if (a instanceof qig) {
            this.b = ((qig)a).e;
            this.e = 0L;
        }
        else if (a instanceof sig) {
            final sig sig = (sig)a;
            final lvj e = sig.e;
            if (t08.U(e)) {
                this.b = null;
                this.e = e.e;
            }
            else {
                this.b = sig.f;
                this.e = 0L;
            }
        }
        else {
            if (!(a instanceof rig)) {
                en9.r();
                return;
            }
            this.b = null;
            this.e = 0L;
        }
        if (c == null) {
            if (d != 16L) {
                c = this.c;
                Label_0184: {
                    if (c != null) {
                        final long d2 = this.d;
                        final int i = j86.i;
                        if (foo.a(d2, d)) {
                            break Label_0184;
                        }
                    }
                    c = new he2(d, 5);
                    this.d = d;
                    this.c = (he2)c;
                }
            }
            else {
                c = null;
            }
        }
        d = this.f;
        Label_0766: {
            if (d != 9205357640488583168L) {
                if (yzl.b(d, f) && this.g == cw8.getLayoutDirection() && this.h == ((xc8)cw8).getDensity()) {
                    break Label_0766;
                }
            }
            d = this.e;
            final g90 b = this.b;
            final qpl j = this.i;
            final float w0 = ((xc8)cw8).w0(j.a);
            final float w2 = ((xc8)cw8).w0(j.b);
            final y80 k = this.j;
            n70 l;
            if (b != null) {
                final float n3 = w2 * 2.0f;
                final float n4 = w0 * 2.0f + n3;
                final n70 e2 = mlc.e((int)(float)Math.ceil((double)(Float.intBitsToFloat((int)(f >> 32)) + n4)), (int)(float)Math.ceil((double)(Float.intBitsToFloat((int)(f & 0xFFFFFFFFL)) + n4)), 1, 24);
                final f40 a2 = g40.a(e2);
                if (w2 > 0.0f) {
                    final float n5 = w2 + w0;
                    a2.n(n5, n5);
                    final float n6 = fcmpl(w0, 0.0f);
                    BlurMaskFilter blurMaskFilter;
                    if (n6 > 0) {
                        blurMaskFilter = new BlurMaskFilter(w0, BlurMaskFilter$Blur.NORMAL);
                    }
                    else {
                        blurMaskFilter = null;
                    }
                    yi2.n(k, blurMaskFilter, 11);
                    a2.d(b, k);
                    BlurMaskFilter blurMaskFilter2;
                    if (n6 > 0) {
                        blurMaskFilter2 = new BlurMaskFilter(w0, BlurMaskFilter$Blur.NORMAL);
                    }
                    else {
                        blurMaskFilter2 = null;
                    }
                    yi2.n(k, blurMaskFilter2, 3);
                    k.m(n3);
                    a2.d(b, k);
                    l = e2;
                }
                else {
                    BlurMaskFilter blurMaskFilter3;
                    if (w0 > 0.0f) {
                        blurMaskFilter3 = new BlurMaskFilter(w0, BlurMaskFilter$Blur.NORMAL);
                    }
                    else {
                        blurMaskFilter3 = null;
                    }
                    yi2.n(k, blurMaskFilter3, 11);
                    a2.n(w0, w0);
                    a2.d(b, k);
                    l = e2;
                }
            }
            else {
                final float n7 = w2 * 2.0f + w0 * 2.0f;
                final float n8 = Float.intBitsToFloat((int)(f >> 32)) + n7;
                final float n9 = Float.intBitsToFloat((int)(f & 0xFFFFFFFFL)) + n7;
                final n70 e3 = mlc.e((int)(float)Math.ceil((double)n8), (int)(float)Math.ceil((double)n9), 1, 24);
                final f40 a3 = g40.a(e3);
                final float intBitsToFloat = Float.intBitsToFloat((int)(d >> 32));
                final float intBitsToFloat2 = Float.intBitsToFloat((int)(d & 0xFFFFFFFFL));
                BlurMaskFilter blurMaskFilter4;
                if (w0 > 0.0f) {
                    blurMaskFilter4 = new BlurMaskFilter(w0, BlurMaskFilter$Blur.NORMAL);
                }
                else {
                    blurMaskFilter4 = null;
                }
                yi2.n(k, blurMaskFilter4, 11);
                a3.a.drawRoundRect(w0, w0, n8 - w0, n9 - w0, intBitsToFloat, intBitsToFloat2, k.a);
                l = e3;
            }
            this.k = l;
            this.f = f;
            this.g = cw8.getLayoutDirection();
            this.h = ((xc8)cw8).getDensity();
        }
        final n70 m = this.k;
        if (m != null) {
            final qpl i2 = this.i;
            final float n10 = -(((xc8)cw8).w0(i2.b) + ((xc8)cw8).w0(i2.a));
            cw8.g0(cw8, m, (long)Float.floatToRawIntBits(n10) << 32 | ((long)Float.floatToRawIntBits(n10) & 0xFFFFFFFFL), n, (he2)c, n2, 8);
        }
    }
}
