import java.util.Arrays;

public final class nu0
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final float q;
    public final float r;
    
    public nu0(float n, float g, float c, float d, final float e, float f, int n2) {
        this.a = n;
        this.b = g;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        final float n3 = e - c;
        final float n4 = f - d;
        final float n5 = 0.0f;
        final int n6 = 1;
        final boolean b = n2 == 1 || ((n2 == 4) ? (n4 > 0.0f) : (n2 == 5 && n4 < 0.0f));
        float m;
        if (b) {
            m = -1.0f;
        }
        else {
            m = 1.0f;
        }
        this.m = m;
        n = 1.0f / (g - n);
        this.k = n;
        final float[] j = new float[101];
        this.j = j;
        boolean p7 = n2 == 3;
        if (p7 || Math.abs(n3) < 0.001f || Math.abs(n4) < 0.001f) {
            g = (float)Math.hypot((double)n4, (double)n3);
            this.g = g;
            this.l = g * n;
            this.q = n3 * n;
            this.r = n4 * n;
            this.n = Float.NaN;
            this.o = Float.NaN;
            p7 = true;
        }
        else {
            this.n = n3 * m;
            this.o = n4 * -m;
            if (b) {
                n = e;
            }
            else {
                n = c;
            }
            this.q = n;
            if (b) {
                n = d;
            }
            else {
                n = f;
            }
            this.r = n;
            final float n7 = d - f;
            final float[] c2 = ifc.c;
            d = n7;
            g = 0.0f;
            f = 0.0f;
            int n8 = 1;
            n2 = n6;
            n = n5;
            while (true) {
                final double n9 = (float)(n8 * 90.0 / 90.0 * 0.017453292519943295);
                final float n10 = (float)Math.sin(n9);
                final float n11 = (float)Math.cos(n9);
                final float n12 = n10 * (e - c);
                final float n13 = n11 * n7;
                g += (float)Math.hypot((double)(n12 - f), (double)(n13 - d));
                c2[n8] = g;
                if (n8 == 90) {
                    break;
                }
                ++n8;
                f = n12;
                d = n13;
            }
            this.g = g;
            int n14 = n2;
            while (true) {
                c2[n14] /= g;
                if (n14 == 90) {
                    break;
                }
                ++n14;
            }
            for (int length = j.length, i = 0; i < length; ++i) {
                g = i / 100.0f;
                final int binarySearch = Arrays.binarySearch(c2, 0, 91, g);
                if (binarySearch >= 0) {
                    j[i] = binarySearch / 90.0f;
                }
                else if (binarySearch == -1) {
                    j[i] = n;
                }
                else {
                    final int n15 = -binarySearch;
                    final int n16 = n15 - 2;
                    c = (float)n16;
                    d = c2[n16];
                    j[i] = ((g - d) / (c2[n15 - n2] - d) + c) / 90.0f;
                }
            }
            this.l = this.g * this.k;
        }
        this.p = p7;
    }
    
    public final float a() {
        final float n = this.n * this.i;
        return n * this.m * (this.l / (float)Math.hypot((double)n, (double)(-this.o * this.h)));
    }
    
    public final float b() {
        final float n = this.n;
        final float i = this.i;
        final float n2 = -this.o * this.h;
        return n2 * this.m * (this.l / (float)Math.hypot((double)(n * i), (double)n2));
    }
    
    public final void c(float k) {
        if (this.m == -1.0f) {
            k = this.b - k;
        }
        else {
            k -= this.a;
        }
        final float n = k * this.k;
        k = 0.0f;
        if (n > 0.0f) {
            k = 1.0f;
            if (n < 1.0f) {
                final float n2 = n * 100.0f;
                final int n3 = (int)n2;
                k = (float)n3;
                final float[] j = this.j;
                final float n4 = j[n3];
                k = ge9.k(j[n3 + 1], n4, n2 - k, n4);
            }
        }
        final double n5 = k * 1.5707964f;
        this.h = (float)Math.sin(n5);
        this.i = (float)Math.cos(n5);
    }
}
