import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;
import android.text.Layout;
import java.util.ArrayList;
import android.text.TextUtils;
import android.text.TextUtils$TruncateAt;
import android.os.Build$VERSION;
import android.text.Spanned;
import android.text.SpannableString;
import android.text.Spannable;
import java.util.List;

public final class a90
{
    public final e90 a;
    public final int b;
    public final long c;
    public final mmn d;
    public final CharSequence e;
    public final float f;
    public final List g;
    
    public a90(final e90 a, int i, int j, long c) {
        final CharSequence c2 = a.C;
        this.a = a;
        this.b = i;
        this.c = c;
        if (gv6.j(c) != 0 || gv6.k(c) != 0) {
            hac.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            hac.a("maxLines should be greater than 0");
        }
        final mnn w = a.w;
        Object e;
        if (j == 2) {
            e = c2;
            if (!vnn.a(w.a.h, tsf.K(0))) {
                e = c2;
                if (!vnn.a(w.a.h, vnn.c)) {
                    final int a2 = w.b.a;
                    if (a2 == 0) {
                        e = c2;
                    }
                    else if (a2 == 5) {
                        e = c2;
                    }
                    else if (a2 == 4) {
                        e = c2;
                    }
                    else if (c2.length() == 0) {
                        e = c2;
                    }
                    else {
                        Spannable spannable;
                        if (c2 instanceof Spannable) {
                            spannable = (Spannable)c2;
                        }
                        else {
                            spannable = null;
                        }
                        e = spannable;
                        if (spannable == null) {
                            e = new SpannableString(c2);
                        }
                        if (!rml.z((Spanned)e, (Class)o7c.class)) {
                            ((Spannable)e).setSpan((Object)new o7c(), ((CharSequence)e).length() - 1, ((CharSequence)e).length() - 1, 33);
                        }
                    }
                }
            }
        }
        else {
            e = c2;
        }
        this.e = (CharSequence)e;
        final mrg b = w.b;
        final int a3 = b.a;
        int n;
        if (a3 == 1) {
            n = 3;
        }
        else if (a3 == 2) {
            n = 4;
        }
        else if (a3 == 3) {
            n = 2;
        }
        else if (a3 != 5 && a3 == 6) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n2;
        if (a3 == 4) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        int n3;
        if (b.h == 2) {
            if (Build$VERSION.SDK_INT <= 32) {
                n3 = 2;
            }
            else {
                n3 = 4;
            }
        }
        else {
            n3 = 0;
        }
        final int g = b.g;
        final int n4 = g & 0xFF;
        int n5 = 0;
        Label_0447: {
            if (n4 != 1) {
                if (n4 == 2) {
                    n5 = 1;
                    break Label_0447;
                }
                if (n4 == 3) {
                    n5 = 2;
                    break Label_0447;
                }
            }
            n5 = 0;
        }
        final int n6 = g >> 8 & 0xFF;
        int n7 = 0;
        Label_0503: {
            if (n6 != 1) {
                if (n6 == 2) {
                    n7 = 1;
                    break Label_0503;
                }
                if (n6 == 3) {
                    n7 = 2;
                    break Label_0503;
                }
                if (n6 == 4) {
                    n7 = 3;
                    break Label_0503;
                }
            }
            n7 = 0;
        }
        final int n8 = g >> 16 & 0xFF;
        int n9;
        if (n8 == 1) {
            n9 = 0;
        }
        else if (n8 == 2) {
            n9 = 1;
        }
        else {
            n9 = 0;
        }
        TextUtils$TruncateAt textUtils$TruncateAt2 = null;
        Label_0594: {
            TextUtils$TruncateAt end = null;
            Label_0551: {
                if (j != 2) {
                    TextUtils$TruncateAt textUtils$TruncateAt;
                    if (j == 5) {
                        textUtils$TruncateAt = TextUtils$TruncateAt.MIDDLE;
                    }
                    else {
                        if (j != 4) {
                            end = null;
                            break Label_0551;
                        }
                        textUtils$TruncateAt = TextUtils$TruncateAt.START;
                    }
                    textUtils$TruncateAt2 = textUtils$TruncateAt;
                    break Label_0594;
                }
                end = TextUtils$TruncateAt.END;
            }
            textUtils$TruncateAt2 = end;
        }
        final mmn a4 = this.a(n, n2, textUtils$TruncateAt2, i, n3, n5, n7, n9, (CharSequence)e);
        final Layout f = a4.f;
        mmn a5;
        if (Build$VERSION.SDK_INT < 35 && ((Paint)a.B).getLetterSpacing() != 0.0f && (j == 4 || j == 5) && f.getEllipsisCount(0) > 0) {
            final int ellipsisStart = f.getEllipsisStart(0);
            a5 = this.a(n, n2, textUtils$TruncateAt2, i, n3, n5, n7, n9, TextUtils.concat(new CharSequence[] { ((CharSequence)e).subSequence(0, ellipsisStart), (CharSequence)"\u2026", ((CharSequence)e).subSequence(f.getEllipsisCount(0) + ellipsisStart, ((CharSequence)e).length()) }));
        }
        else {
            a5 = a4;
        }
        final int g2 = a5.g;
        if (j == 2 && a5.a() > gv6.h(c) && i > 1) {
            final int h = gv6.h(c);
            i = 0;
            while (true) {
                j = g2;
                if (i >= g2) {
                    break;
                }
                if (a5.e(i) > h) {
                    j = i;
                    break;
                }
                ++i;
            }
            mmn a6 = a5;
            if (j >= 0) {
                a6 = a5;
                if (j != this.b) {
                    if (j < 1) {
                        i = 1;
                    }
                    else {
                        i = j;
                    }
                    a6 = this.a(n, n2, textUtils$TruncateAt2, i, n3, n5, n7, n9, this.e);
                }
            }
            this.d = a6;
            a5 = a6;
        }
        else {
            this.d = a5;
        }
        this.f = (float)a5.a();
        final bc0 b2 = this.a.B;
        final qm2 b3 = w.b();
        final float c3 = this.c();
        final float f2 = this.f;
        c = Float.floatToRawIntBits(c3);
        b2.c(b3, ((long)Float.floatToRawIntBits(f2) & 0xFFFFFFFFL) | c << 32, w.a.a.a());
        final Layout f3 = a5.f;
        ppl[] array = null;
        Label_1084: {
            if (f3.getText() instanceof Spanned) {
                final CharSequence text = f3.getText();
                text.getClass();
                final Spanned spanned = (Spanned)text;
                if (spanned.nextSpanTransition(-1, ((CharSequence)spanned).length(), (Class)ppl.class) != ((CharSequence)spanned).length()) {
                    final CharSequence text2 = f3.getText();
                    text2.getClass();
                    array = (ppl[])((Spanned)text2).getSpans(0, f3.getText().length(), (Class)ppl.class);
                    break Label_1084;
                }
            }
            array = null;
        }
        if (array != null) {
            ppl ppl;
            float c4;
            float f4;
            for (j = array.length, i = 0; i < j; ++i) {
                ppl = array[i];
                c4 = this.c();
                f4 = this.f;
                c = Float.floatToRawIntBits(c4);
                ppl.a(((long)Float.floatToRawIntBits(f4) & 0xFFFFFFFFL) | c << 32);
            }
        }
        final CharSequence e2 = this.e;
        Object v;
        if (!(e2 instanceof Spanned)) {
            v = r89.v;
        }
        else {
            final Spanned spanned2 = (Spanned)e2;
            final Object[] spans = spanned2.getSpans(0, e2.length(), (Class)t8h.class);
            final ArrayList list = new ArrayList(spans.length);
            int length;
            t8h t8h;
            int spanStart;
            int spanEnd;
            int g3;
            boolean b4;
            boolean b5;
            Object o;
            boolean rtlChar;
            float n10;
            mmn d;
            float n11 = 0.0f;
            float n12 = 0.0f;
            float n13 = 0.0f;
            mmn d2;
            Paint$FontMetricsInt a7;
            float n14 = 0.0f;
            float n15 = 0.0f;
            float n16 = 0.0f;
            float k = 0.0f;
            for (length = spans.length, j = 0; j < length; ++j) {
                t8h = (t8h)spans[j];
                spanStart = spanned2.getSpanStart((Object)t8h);
                spanEnd = spanned2.getSpanEnd((Object)t8h);
                g3 = this.d.g(spanStart);
                if (g3 >= this.b) {
                    i = 1;
                }
                else {
                    i = 0;
                }
                b4 = (this.d.f.getEllipsisCount(g3) > 0 && spanEnd > this.d.f.getEllipsisStart(g3) + this.d.f.getLineStart(g3));
                b5 = (spanEnd > this.d.f(g3));
                if (b4 || b5 || i != 0) {
                    o = null;
                }
                else {
                    if (this.d.f.getParagraphDirection(g3) == 1) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                    rtlChar = this.d.f.isRtlCharAt(spanStart);
                    Label_1535: {
                        Label_1434: {
                            if (i == 0 || rtlChar) {
                                if (i != 0 && rtlChar) {
                                    n10 = this.d.k(spanStart, false);
                                    i = t8h.d();
                                }
                                else {
                                    d = this.d;
                                    if (!rtlChar) {
                                        n11 = d.k(spanStart, false);
                                        i = t8h.d();
                                        break Label_1434;
                                    }
                                    n10 = d.j(spanStart, false);
                                    i = t8h.d();
                                }
                                n12 = n10 - i;
                                n13 = n10;
                                break Label_1535;
                            }
                            n11 = this.d.j(spanStart, false);
                            i = t8h.d();
                        }
                        n13 = i + n11;
                        n12 = n11;
                    }
                    d2 = this.d;
                    Label_1779: {
                        Label_1669: {
                            switch (t8h.c()) {
                                default: {
                                    en9.q("unexpected verticalAlignment");
                                    throw null;
                                }
                                case 6: {
                                    a7 = t8h.a();
                                    n14 = (float)((a7.ascent + a7.descent - t8h.b()) / 2);
                                    n15 = d2.d(g3);
                                    break;
                                }
                                case 5: {
                                    n16 = d2.d(g3) + t8h.a().descent;
                                    i = t8h.b();
                                    break Label_1669;
                                }
                                case 4: {
                                    n14 = (float)t8h.a().ascent;
                                    n15 = d2.d(g3);
                                    break;
                                }
                                case 3: {
                                    k = (d2.e(g3) + d2.i(g3) - t8h.b()) / 2.0f;
                                    break Label_1779;
                                }
                                case 2: {
                                    n16 = d2.e(g3);
                                    i = t8h.b();
                                    break Label_1669;
                                }
                                case 1: {
                                    k = d2.i(g3);
                                    break Label_1779;
                                }
                                case 0: {
                                    n16 = d2.d(g3);
                                    i = t8h.b();
                                    break Label_1669;
                                }
                            }
                            k = n15 + n14;
                            break Label_1779;
                        }
                        k = n16 - i;
                    }
                    o = new k2j(n12, k, n13, t8h.b() + k);
                }
                list.add(o);
            }
            v = list;
        }
        this.g = (List)v;
    }
    
    public final mmn a(final int n, final int n2, final TextUtils$TruncateAt textUtils$TruncateAt, final int n3, final int n4, final int n5, final int n6, final int n7, final CharSequence charSequence) {
        final float c = this.c();
        final e90 a = this.a;
        final bc0 b = a.B;
        final int g = a.G;
        final wzc d = a.D;
        final mnn w = a.w;
        final b90 a2 = c90.a;
        final vbh c2 = w.c;
        Label_0079: {
            if (c2 == null) {
                break Label_0079;
            }
            final fbh b2 = c2.b;
            if (b2 == null) {
                break Label_0079;
            }
            final boolean a3 = b2.a;
            return new mmn(charSequence, c, b, n, textUtils$TruncateAt, g, a3, n3, n5, n6, n7, n4, n2, d);
        }
        final boolean a3 = false;
        return new mmn(charSequence, c, b, n, textUtils$TruncateAt, g, a3, n3, n5, n6, n7, n4, n2, d);
    }
    
    public final long b(final k2j k2j, int n, final yif yif) {
        final RectF a0 = yi2.a0(k2j);
        if (!wjq.g(n, 0) && wjq.g(n, 1)) {
            n = 1;
        }
        else {
            n = 0;
        }
        final n7 n2 = new n7((Object)yif, (byte)5);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final mmn d = this.d;
        int[] array;
        if (sdk_INT >= 34) {
            d.getClass();
            array = x3.d(d, a0, n, n2);
        }
        else {
            array = bkq.v(d, d.f, d.c(), a0, n, n2);
        }
        if (array == null) {
            return dnn.b;
        }
        return rhc.c(array[0], array[1]);
    }
    
    public final float c() {
        return (float)gv6.i(this.c);
    }
    
    public final void d(x13 x13) {
        final Canvas b = g40.b(x13);
        final mmn d = this.d;
        if (d.d) {
            b.save();
            b.clipRect(0.0f, 0.0f, this.c(), this.f);
        }
        final int h = d.h;
        Label_0148: {
            if (!b.getClipBounds(d.o)) {
                break Label_0148;
            }
            if (h != 0) {
                b.translate(0.0f, (float)h);
            }
            final ThreadLocal a = rmn.a;
            Object value;
            if ((value = a.get()) == null) {
                value = new Canvas();
                a.set(value);
            }
            x13 = (x13)value;
            ((mfn)x13).a = b;
            try {
                d.f.draw((Canvas)x13);
                ((mfn)x13).a = null;
                if (h != 0) {
                    b.translate(0.0f, -1.0f * h);
                }
                if (d.d) {
                    b.restore();
                }
            }
            finally {
                ((mfn)x13).a = null;
            }
        }
    }
    
    public final void e(final x13 x13, final long n, final rpl rpl, final wgn wgn, final dw8 dw8) {
        final bc0 b = this.a.B;
        final byte c = b.c;
        b.d(n);
        b.f(rpl);
        b.g(wgn);
        b.e(dw8);
        b.b(3);
        this.d(x13);
        b.b(c);
    }
    
    public final void f(final x13 x13, final qm2 qm2, final float n, final rpl rpl, final wgn wgn, final dw8 dw8) {
        final bc0 b = this.a.B;
        final byte c = b.c;
        b.c(qm2, (long)Float.floatToRawIntBits(this.c()) << 32 | ((long)Float.floatToRawIntBits(this.f) & 0xFFFFFFFFL), n);
        b.f(rpl);
        b.g(wgn);
        b.e(dw8);
        b.b(3);
        new w7(this).b((Object)x13);
        b.b(c);
    }
}
