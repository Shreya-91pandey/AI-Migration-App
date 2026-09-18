import android.text.BoringLayout$Metrics;
import android.text.TextDirectionHeuristic;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.BoringLayout;
import android.os.Build$VERSION;
import android.os.Trace;
import android.text.Spanned;
import android.text.Layout$Alignment;
import android.graphics.Rect;
import android.graphics.Paint$FontMetricsInt;
import android.text.Layout;
import android.text.TextUtils$TruncateAt;
import android.text.TextPaint;

public final class mmn
{
    public final TextPaint a;
    public final TextUtils$TruncateAt b;
    public final boolean c;
    public final boolean d;
    public rm0 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint$FontMetricsInt l;
    public final int m;
    public final jdd[] n;
    public final Rect o;
    public uy7 p;
    
    public mmn(CharSequence charSequence, final float n, final TextPaint a, int i, final TextUtils$TruncateAt b, int n2, final boolean c, int n3, int n4, int n5, int g, int f, final int n6, final wzc wzc) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.o = new Rect();
        final int length = charSequence.length();
        final TextDirectionHeuristic b2 = rmn.b(n2);
        final Layout$Alignment a2 = lfn.a;
        Layout$Alignment layout$Alignment;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                        }
                        else {
                            layout$Alignment = lfn.b;
                        }
                    }
                    else {
                        layout$Alignment = lfn.a;
                    }
                }
                else {
                    layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                }
            }
            else {
                layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
            }
        }
        else {
            layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
        }
        if (charSequence instanceof Spanned && ((Spanned)charSequence).nextSpanTransition(-1, length, (Class)ax1.class) < length) {
            i = 1;
        }
        else {
            i = 0;
        }
        Trace.beginSection("TextLayout:initLayout");
        try {
            final BoringLayout$Metrics a3 = wzc.a();
            final double n7 = n;
            n2 = (int)(float)Math.ceil(n7);
            Object f2;
            if (a3 != null && wzc.c() <= n && i == 0) {
                if (n2 < 0) {
                    hac.a("negative width");
                }
                if (n2 < 0) {
                    hac.a("negative ellipsized width");
                }
                if (Build$VERSION.SDK_INT >= 33) {
                    f2 = od.e(charSequence, a, n2, layout$Alignment, a3, c, b, n2);
                }
                else {
                    f2 = enq.g(charSequence, a, n2, layout$Alignment, a3, c, b, n2);
                }
                n4 = 1;
            }
            else {
                f2 = lq6.z(charSequence, a, n2, charSequence.length(), b2, layout$Alignment, n3, b, (int)(float)Math.ceil(n7), n6, c, n4, n5, g, f);
                n4 = 0;
            }
            this.f = (Layout)f2;
            Trace.endSection();
            g = Math.min(((Layout)f2).getLineCount(), n3);
            this.g = g;
            n5 = g - 1;
            this.d = (g >= n3 && (((Layout)f2).getEllipsisCount(n5) > 0 || ((Layout)f2).getLineEnd(n5) != charSequence.length()));
            jdd[] n8 = null;
            Label_0493: {
                if (((Layout)f2).getText() instanceof Spanned) {
                    charSequence = ((Layout)f2).getText();
                    charSequence.getClass();
                    if (rml.z((Spanned)charSequence, (Class)jdd.class) || ((Layout)f2).getText().length() <= 0) {
                        charSequence = ((Layout)f2).getText();
                        charSequence.getClass();
                        n8 = (jdd[])((Spanned)charSequence).getSpans(0, ((Layout)f2).getText().length(), (Class)jdd.class);
                        break Label_0493;
                    }
                }
                n8 = null;
            }
            this.n = n8;
            Label_0552: {
                if (n8 != null) {
                    final jdd jdd = (jdd)iw0.Y0((Object[])n8);
                    if (jdd != null) {
                        if (jdd.x && jdd.A == 2) {
                            i = 1;
                        }
                        else {
                            i = 0;
                        }
                        n2 = i;
                        break Label_0552;
                    }
                }
                n2 = 0;
            }
            Label_0596: {
                if (n8 != null) {
                    final jdd jdd2 = (jdd)iw0.Y0((Object[])n8);
                    if (jdd2 != null && jdd2.y && jdd2.A == 2) {
                        i = 1;
                        break Label_0596;
                    }
                }
                i = 0;
            }
            long n9;
            long a4;
            if (n2 != 0 && i != 0) {
                a4 = (n9 = rmn.b);
            }
            else {
                n9 = rmn.b;
                long a5 = 0L;
                Label_0880: {
                    if (!c) {
                        boolean b3 = false;
                        Label_0701: {
                            if (n4 != 0) {
                                final BoringLayout boringLayout = (BoringLayout)f2;
                                if (Build$VERSION.SDK_INT >= 33) {
                                    b3 = od.x(boringLayout);
                                    break Label_0701;
                                }
                            }
                            else {
                                final StaticLayout staticLayout = (StaticLayout)f2;
                                n3 = Build$VERSION.SDK_INT;
                                if (n3 >= 33) {
                                    b3 = o4.k(staticLayout);
                                    break Label_0701;
                                }
                                if (n3 >= 28) {
                                    b3 = true;
                                    break Label_0701;
                                }
                            }
                            b3 = false;
                        }
                        if (!b3) {
                            final TextPaint paint = ((Layout)f2).getPaint();
                            final CharSequence text = ((Layout)f2).getText();
                            Rect rect = xiq.t(paint, text, ((Layout)f2).getLineStart(0), ((Layout)f2).getLineEnd(0));
                            n4 = ((Layout)f2).getLineAscent(0);
                            n3 = rect.top;
                            if (n3 < n4) {
                                n3 = n4 - n3;
                            }
                            else {
                                n3 = ((Layout)f2).getTopPadding();
                            }
                            if (g != 1) {
                                rect = xiq.t(paint, text, ((Layout)f2).getLineStart(n5), ((Layout)f2).getLineEnd(n5));
                            }
                            g = ((Layout)f2).getLineDescent(n5);
                            n4 = rect.bottom;
                            if (n4 > g) {
                                n4 -= g;
                            }
                            else {
                                n4 = ((Layout)f2).getBottomPadding();
                            }
                            if (n3 != 0 || n4 != 0) {
                                a5 = rmn.a(n3, n4);
                                break Label_0880;
                            }
                        }
                    }
                    a5 = n9;
                }
                if (n2 != 0) {
                    n2 = 0;
                }
                else {
                    n2 = (int)(a5 >> 32);
                }
                if (i != 0) {
                    i = 0;
                }
                else {
                    i = (int)(a5 & 0xFFFFFFFFL);
                }
                a4 = rmn.a(n2, i);
            }
            if (n8 != null) {
                g = n8.length;
                n4 = 0;
                jdd jdd3;
                for (n2 = (i = 0); i < g; ++i, n4 = n3) {
                    jdd3 = n8[i];
                    f = jdd3.F;
                    n3 = n4;
                    if (f < 0) {
                        n3 = Math.max(n4, Math.abs(f));
                    }
                    n4 = jdd3.G;
                    if (n4 < 0) {
                        n2 = Math.max(n3, Math.abs(n4));
                    }
                }
                if (n4 == 0 && n2 == 0) {
                    n9 = rmn.b;
                }
                else {
                    n9 = rmn.a(n4, n2);
                }
            }
            this.h = Math.max((int)(a4 >> 32), (int)(n9 >> 32));
            this.i = Math.max((int)(a4 & 0xFFFFFFFFL), (int)(n9 & 0xFFFFFFFFL));
            final TextPaint a6 = this.a;
            final jdd[] n10 = this.n;
            i = this.g - 1;
            final Layout f3 = this.f;
            Paint$FontMetricsInt l;
            if (f3.getLineStart(i) == f3.getLineEnd(i) && n10 != null && n10.length != 0) {
                final SpannableString spannableString = new SpannableString((CharSequence)"\u200b");
                final jdd jdd4 = (jdd)iw0.X0((Object[])n10);
                n2 = spannableString.length();
                boolean b4 = false;
                boolean b5 = false;
                Label_1202: {
                    if (i != 0) {
                        b4 = jdd4.y;
                        if (b4) {
                            b5 = false;
                            break Label_1202;
                        }
                    }
                    b5 = (b4 = jdd4.y);
                }
                spannableString.setSpan((Object)new jdd(jdd4.v, jdd4.z, n2, jdd4.A, b5, b4), 0, spannableString.length(), 33);
                i = spannableString.length();
                final StaticLayout z = lq6.z((CharSequence)spannableString, a6, Integer.MAX_VALUE, i, b2, kzc.a, Integer.MAX_VALUE, (TextUtils$TruncateAt)null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                l = new Paint$FontMetricsInt();
                l.ascent = ((Layout)z).getLineAscent(0);
                l.descent = z.getLineDescent(0);
                l.top = z.getLineTop(0);
                l.bottom = ((Layout)z).getLineBottom(0);
            }
            else {
                l = null;
            }
            if (l != null) {
                i = l.bottom - (int)this.h(n5);
            }
            else {
                i = 0;
            }
            this.m = i;
            this.l = l;
            final Layout f4 = this.f;
            this.j = ach.M(f4, n5, (Paint)f4.getPaint());
            final Layout f5 = this.f;
            this.k = ach.N(f5, n5, (Paint)f5.getPaint());
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final int a() {
        final boolean d = this.d;
        final Layout f = this.f;
        int n;
        if (d) {
            n = f.getLineBottom(this.g - 1);
        }
        else {
            n = f.getHeight();
        }
        return n + this.h + this.i + this.m;
    }
    
    public final float b(final int n) {
        if (n == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }
    
    public final uy7 c() {
        uy7 p;
        if ((p = this.p) == null) {
            p = new uy7(this.f);
            this.p = p;
        }
        return p;
    }
    
    public final float d(final int n) {
        final float n2 = (float)this.h;
        if (n == this.g - 1) {
            final Paint$FontMetricsInt l = this.l;
            if (l != null) {
                final float n3 = this.i(n) - l.ascent;
                return n2 + n3;
            }
        }
        final float n3 = (float)this.f.getLineBaseline(n);
        return n2 + n3;
    }
    
    public final float e(int i) {
        final int g = this.g;
        final Layout f = this.f;
        if (i == g - 1) {
            final Paint$FontMetricsInt l = this.l;
            if (l != null) {
                return f.getLineBottom(i - 1) + (float)l.bottom;
            }
        }
        final float n = (float)this.h;
        final float n2 = (float)f.getLineBottom(i);
        if (i == g - 1) {
            i = this.i;
        }
        else {
            i = 0;
        }
        return n + n2 + i;
    }
    
    public final int f(final int n) {
        final ThreadLocal a = rmn.a;
        final Layout f = this.f;
        if (f.getEllipsisCount(n) > 0 && this.b == TextUtils$TruncateAt.END) {
            return f.getText().length();
        }
        return f.getLineEnd(n);
    }
    
    public final int g(int lineForOffset) {
        int g = this.g;
        if (g <= 0) {
            return 0;
        }
        lineForOffset = this.f.getLineForOffset(lineForOffset);
        --g;
        if (lineForOffset > g) {
            return g;
        }
        return lineForOffset;
    }
    
    public final float h(final int n) {
        return this.e(n) - this.i(n);
    }
    
    public final float i(int h) {
        final float n = (float)this.f.getLineTop(h);
        if (h == 0) {
            h = 0;
        }
        else {
            h = this.h;
        }
        return n + h;
    }
    
    public final float j(final int n, final boolean b) {
        return this.b(this.g(n)) + this.c().N(n, true, b);
    }
    
    public final float k(final int n, final boolean b) {
        return this.b(this.g(n)) + this.c().N(n, false, b);
    }
    
    public final rm0 l() {
        final rm0 e = this.e;
        if (e != null) {
            return e;
        }
        final Layout f = this.f;
        return this.e = new rm0(f.getText(), f.getText().length(), ((Paint)this.a).getTextLocale());
    }
}
