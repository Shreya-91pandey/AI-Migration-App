import android.graphics.Paint$FontMetricsInt;
import android.text.style.LineHeightSpan;

public final class jdd implements LineHeightSpan
{
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final float v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final float z;
    
    public jdd(final float v, final float z, final int w, final int a, final boolean x, final boolean y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = Integer.MIN_VALUE;
        this.E = Integer.MIN_VALUE;
        if (0.0f > z || z > 1.0f) {
            if (z != -1.0f) {
                hac.c("topRatio should be in [0..1] range or -1");
            }
        }
    }
    
    public final void chooseHeight(final CharSequence charSequence, int descent, int ascent, int n, int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        n2 = paint$FontMetricsInt.descent;
        final int ascent2 = paint$FontMetricsInt.ascent;
        if (n2 - ascent2 > 0) {
            if (descent == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (ascent == this.w) {
                descent = 1;
            }
            else {
                descent = 0;
            }
            final int a = this.A;
            final boolean y = this.y;
            final boolean x = this.x;
            if (n == 0 || descent == 0 || !x || !y || a == 2) {
                Label_0459: {
                    if (this.B == Integer.MIN_VALUE) {
                        ascent = (int)(float)Math.ceil((double)this.v);
                        final int n3 = ascent - (n2 - ascent2);
                        if (a == 1 && n3 <= 0) {
                            ascent = paint$FontMetricsInt.ascent;
                            this.C = ascent;
                            n2 = paint$FontMetricsInt.descent;
                            this.D = n2;
                            this.B = ascent;
                            this.E = n2;
                            this.F = 0;
                            this.G = 0;
                        }
                        else {
                            float z;
                            if ((z = this.z) == -1.0f) {
                                z = Math.abs((float)paint$FontMetricsInt.ascent) / (paint$FontMetricsInt.descent - paint$FontMetricsInt.ascent);
                            }
                            double n4;
                            if (n3 <= 0) {
                                n4 = Math.ceil((double)(n3 * z));
                            }
                            else {
                                n4 = Math.ceil((double)((1.0f - z) * n3));
                            }
                            n2 = (int)(float)n4;
                            final int descent2 = paint$FontMetricsInt.descent;
                            n2 += descent2;
                            this.D = n2;
                            ascent = n2 - ascent;
                            this.C = ascent;
                            if (a != 0) {
                                if (n3 < 0) {
                                    if (a == 2) {
                                        n2 = paint$FontMetricsInt.ascent;
                                        if (x) {
                                            ascent = Math.max(n2, ascent);
                                        }
                                        else {
                                            ascent = Math.min(n2, ascent);
                                        }
                                        this.B = ascent;
                                        ascent = paint$FontMetricsInt.descent;
                                        n2 = this.D;
                                        if (y) {
                                            ascent = Math.min(ascent, n2);
                                        }
                                        else {
                                            ascent = Math.max(ascent, n2);
                                        }
                                        this.E = ascent;
                                        this.F = 0;
                                        this.G = 0;
                                    }
                                    break Label_0459;
                                }
                            }
                            if (x) {
                                ascent = paint$FontMetricsInt.ascent;
                            }
                            this.B = ascent;
                            if (y) {
                                n2 = descent2;
                            }
                            this.E = n2;
                            this.F = paint$FontMetricsInt.ascent - ascent;
                            this.G = n2 - descent2;
                        }
                    }
                }
                if (n != 0) {
                    ascent = this.B;
                }
                else {
                    ascent = this.C;
                }
                paint$FontMetricsInt.ascent = ascent;
                if (descent != 0) {
                    descent = this.E;
                }
                else {
                    descent = this.D;
                }
                paint$FontMetricsInt.descent = descent;
            }
        }
    }
}
