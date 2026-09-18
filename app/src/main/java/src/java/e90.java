import java.util.AbstractCollection;
import android.text.Spanned;
import java.util.Collection;
import android.graphics.Paint;
import java.util.Iterator;
import android.text.Layout;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.text.CharacterIterator;
import java.text.BreakIterator;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import java.util.Arrays;
import android.text.style.LeadingMarginSpan$Standard;
import android.text.SpannableString;
import android.text.Spannable;
import java.util.ArrayList;
import android.graphics.Typeface;
import java.util.Locale;
import android.text.TextPaint;
import java.util.List;

public final class e90 implements jrg
{
    public final xc8 A;
    public final bc0 B;
    public final CharSequence C;
    public final wzc D;
    public nrb E;
    public final boolean F;
    public final int G;
    public final int H;
    public final String v;
    public final mnn w;
    public final List x;
    public final List y;
    public final tna z;
    
    public e90(String s, final mnn w, List x, final List y, final tna z, final xc8 a, final boolean b) {
        this.v = s;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        final float density = a.getDensity();
        final TextPaint b2 = new TextPaint(1);
        b2.density = density;
        ((bc0)b2).b = wgn.b;
        ((bc0)b2).c = 3;
        ((bc0)b2).d = rpl.d;
        this.B = (bc0)b2;
        final boolean v = twl.v(w);
        final hcm a2 = w.a;
        final mrg b3 = w.b;
        boolean booleanValue;
        if (!v) {
            booleanValue = false;
        }
        else {
            final jy7 a3 = w69.a;
            final jy7 a4 = w69.a;
            Object w2 = a4.w;
            if (w2 == null) {
                if (q69.d()) {
                    w2 = a4.t();
                    a4.w = w2;
                }
                else {
                    w2 = k8e.a;
                }
            }
            booleanValue = (boolean)((xom)w2).getValue();
        }
        this.F = booleanValue;
        final int b4 = b3.b;
        final jpd k = a2.k;
        int g = 0;
        Label_0303: {
            Label_0205: {
                if (b4 != 4) {
                    if (b4 != 5) {
                        if (b4 == 1) {
                            g = 0;
                            break Label_0303;
                        }
                        if (b4 == 2) {
                            g = 1;
                            break Label_0303;
                        }
                        if (b4 != 3) {
                            if (b4 != 0) {
                                en9.q("Invalid TextDirection.");
                                throw null;
                            }
                        }
                        Locale locale;
                        if (k == null || (locale = k.a().a) == null) {
                            locale = Locale.getDefault();
                        }
                        final int g2 = rkq.g(locale);
                        if (g2 == 0) {
                            break Label_0205;
                        }
                        if (g2 != 1) {
                            break Label_0205;
                        }
                    }
                    g = 3;
                    break Label_0303;
                }
            }
            g = 2;
        }
        this.G = g;
        this.H = -1;
        final d90 d90 = new d90((Object)this, (byte)0);
        ymn ymn;
        if ((ymn = b3.i) == null) {
            ymn = ymn.c;
        }
        int flags;
        if (ymn.b) {
            flags = (((Paint)b2).getFlags() | 0x80);
        }
        else {
            flags = (((Paint)b2).getFlags() & 0xFFFFFF7F);
        }
        ((Paint)b2).setFlags(flags);
        final int a5 = ymn.a;
        if (a5 == 1) {
            ((Paint)b2).setFlags(((Paint)b2).getFlags() | 0x40);
            ((Paint)b2).setHinting(0);
        }
        else if (a5 == 2) {
            ((Paint)b2).getFlags();
            ((Paint)b2).setHinting(1);
        }
        else if (a5 == 3) {
            ((Paint)b2).getFlags();
            ((Paint)b2).setHinting(0);
        }
        else {
            ((Paint)b2).getFlags();
        }
        while (true) {
            for (int size = ((Collection)x).size(), i = 0; i < size; ++i) {
                final Object value = x.get(i);
                if (((ng0)value).a instanceof hcm) {
                    final boolean b5 = value != null;
                    final long b6 = a2.b;
                    zoa zoa = a2.c;
                    final soa d91 = a2.d;
                    final String g3 = a2.g;
                    final jpd j = a2.k;
                    final oln a6 = a2.a;
                    final tln l = a2.j;
                    long n = a2.h;
                    final long b7 = vnn.b(b6);
                    if (wnn.a(b7, 4294967296L)) {
                        ((Paint)b2).setTextSize(a.W0(b6));
                    }
                    else if (wnn.a(b7, 8589934592L)) {
                        ((Paint)b2).setTextSize(vnn.c(b6) * ((Paint)b2).getTextSize());
                    }
                    final una f = a2.f;
                    if (f != null || d91 != null || zoa != null) {
                        if (zoa == null) {
                            zoa = zoa.A;
                        }
                        int a7;
                        if (d91 != null) {
                            a7 = d91.a;
                        }
                        else {
                            a7 = 0;
                        }
                        final toa e = a2.e;
                        int a8;
                        if (e != null) {
                            a8 = e.a;
                        }
                        else {
                            a8 = 65535;
                        }
                        final e90 e2 = (e90)d90.w;
                        final cno b8 = ((wna)e2.z).b(f, zoa, a7, a8);
                        Typeface m;
                        if (!(b8 instanceof bno)) {
                            final nrb e3 = new nrb(b8, e2.E);
                            e2.E = e3;
                            m = e3.I();
                        }
                        else {
                            final Object v2 = ((bno)b8).v;
                            v2.getClass();
                            m = (Typeface)v2;
                        }
                        ((Paint)b2).setTypeface(m);
                    }
                    if (j != null) {
                        final jpd x2 = jpd.x;
                        if (!j.equals(zah.a.v())) {
                            mkq.w((bc0)b2, j);
                        }
                    }
                    if (g3 != null && !g3.equals("")) {
                        ((Paint)b2).setFontFeatureSettings(g3);
                    }
                    if (l != null && !l.equals(tln.c)) {
                        ((Paint)b2).setTextScaleX(((Paint)b2).getTextScaleX() * l.a);
                        ((Paint)b2).setTextSkewX(((Paint)b2).getTextSkewX() + l.b);
                    }
                    ((bc0)b2).d(a6.b());
                    ((bc0)b2).c(a6.c(), 9205357640488583168L, a6.a());
                    ((bc0)b2).f(a2.n);
                    ((bc0)b2).g(a2.m);
                    ((bc0)b2).e(a2.p);
                    if (wnn.a(vnn.b(n), 4294967296L) && vnn.c(n) != 0.0f) {
                        final float n2 = ((Paint)b2).getTextScaleX() * ((Paint)b2).getTextSize();
                        final float w3 = a.W0(n);
                        if (n2 != 0.0f) {
                            ((Paint)b2).setLetterSpacing(w3 / n2);
                        }
                    }
                    else if (wnn.a(vnn.b(n), 8589934592L)) {
                        ((Paint)b2).setLetterSpacing(vnn.c(n));
                    }
                    final long l2 = a2.l;
                    zw1 i2 = a2.i;
                    final boolean b9 = b5 && wnn.a(vnn.b(n), 4294967296L) && vnn.c(n) != 0.0f;
                    long h = j86.h;
                    final boolean b10 = !foo.a(l2, h) && !foo.a(l2, j86.g);
                    final boolean b11 = i2 != null && Float.compare(i2.a, 0.0f) != 0;
                    Object o;
                    if (!b9 && !b10 && !b11) {
                        o = null;
                    }
                    else {
                        if (!b9) {
                            n = vnn.c;
                        }
                        if (b10) {
                            h = l2;
                        }
                        if (!b11) {
                            i2 = null;
                        }
                        o = new hcm(0L, 0L, null, null, null, null, null, n, i2, null, null, h, null, null, 63103);
                    }
                    ArrayList x3;
                    final List list = (List)(x3 = (ArrayList)this.x);
                    if (o != null) {
                        final int n3 = list.size() + 1;
                        x3 = new ArrayList(n3);
                        for (int n4 = 0; n4 < n3; ++n4) {
                            Object o2;
                            if (n4 == 0) {
                                o2 = new ng0(0, this.v.length(), o);
                            }
                            else {
                                o2 = this.x.get(n4 - 1);
                            }
                            x3.add(o2);
                        }
                    }
                    final String v3 = this.v;
                    final float textSize = ((Paint)this.B).getTextSize();
                    final mnn w4 = this.w;
                    final List y2 = this.y;
                    final xc8 a9 = this.A;
                    final boolean f2 = this.F;
                    s = this.v;
                    if (this.H == -1) {
                        int h2;
                        if (s.length() <= 512 && !kym.J0((CharSequence)s, '\n')) {
                            h2 = 0;
                        }
                        else {
                            h2 = 1;
                        }
                        this.H = h2;
                    }
                    final b90 a10 = c90.a;
                    if (f2 && q69.d()) {
                        final vbh c = w4.c;
                        v79 v4 = null;
                        Label_1522: {
                            if (c != null) {
                                final fbh b12 = c.b;
                                if (b12 != null) {
                                    v4 = new v79(b12.b);
                                    break Label_1522;
                                }
                            }
                            v4 = null;
                        }
                        int n5;
                        if (v4 != null && v4.a == 2) {
                            n5 = 1;
                        }
                        else {
                            n5 = 0;
                        }
                        s = (String)q69.a().h(0, v3.length(), n5, (CharSequence)v3);
                        s.getClass();
                    }
                    else {
                        s = v3;
                    }
                    if (!((List)x3).isEmpty() || !y2.isEmpty() || !mlc.q((Object)w4.b.d, (Object)vln.c) || (w4.b.c & 0xFF00000000L) != 0x0L) {
                        Object o3;
                        if (s instanceof Spannable) {
                            o3 = s;
                        }
                        else {
                            o3 = new SpannableString((CharSequence)s);
                        }
                        final hcm a11 = w4.a;
                        final mrg b13 = w4.b;
                        if (mlc.q((Object)a11.m, (Object)wgn.c)) {
                            ((Spannable)o3).setSpan((Object)c90.a, 0, v3.length(), 33);
                        }
                        final vbh c2 = w4.c;
                        boolean a12 = false;
                        Label_1727: {
                            if (c2 != null) {
                                final fbh b14 = c2.b;
                                if (b14 != null) {
                                    a12 = b14.a;
                                    break Label_1727;
                                }
                            }
                            a12 = false;
                        }
                        if (a12 && b13.f == null) {
                            final float r = yi2.R(b13.c, textSize, a9);
                            if (!Float.isNaN(r)) {
                                ((Spannable)o3).setSpan((Object)new edd(r), 0, ((CharSequence)o3).length(), 33);
                            }
                        }
                        else {
                            idd idd;
                            if ((idd = b13.f) == null) {
                                idd = idd.d;
                            }
                            final float r2 = yi2.R(b13.c, textSize, a9);
                            if (!Float.isNaN(r2)) {
                                int length = 0;
                                Label_1858: {
                                    if (((CharSequence)o3).length() != 0) {
                                        if (kym.Z0((CharSequence)o3) != '\n') {
                                            length = ((CharSequence)o3).length();
                                            break Label_1858;
                                        }
                                    }
                                    length = ((CharSequence)o3).length() + 1;
                                }
                                final int b15 = idd.b;
                                ((Spannable)o3).setSpan((Object)new jdd(r2, idd.a, length, idd.c, (b15 & 0x1) > 0, (b15 & 0x10) > 0), 0, ((CharSequence)o3).length(), 33);
                            }
                        }
                        final vln d92 = b13.d;
                        if (d92 != null) {
                            final long a13 = d92.a;
                            final long b16 = d92.b;
                            if (!vnn.a(a13, tsf.K(0)) || !vnn.a(b16, tsf.K(0))) {
                                if ((a13 & 0xFF00000000L) != 0x0L && (b16 & 0xFF00000000L) != 0x0L) {
                                    final long b17 = vnn.b(a13);
                                    float w5;
                                    if (wnn.a(b17, 4294967296L)) {
                                        w5 = a9.W0(a13);
                                    }
                                    else if (wnn.a(b17, 8589934592L)) {
                                        w5 = vnn.c(a13) * textSize;
                                    }
                                    else {
                                        w5 = 0.0f;
                                    }
                                    final long b18 = vnn.b(b16);
                                    float w6;
                                    if (wnn.a(b18, 4294967296L)) {
                                        w6 = a9.W0(b16);
                                    }
                                    else if (wnn.a(b18, 8589934592L)) {
                                        w6 = vnn.c(b16) * textSize;
                                    }
                                    else {
                                        w6 = 0.0f;
                                    }
                                    ((Spannable)o3).setSpan((Object)new LeadingMarginSpan$Standard((int)(float)Math.ceil((double)w5), (int)(float)Math.ceil((double)w6)), 0, ((CharSequence)o3).length(), 33);
                                }
                            }
                        }
                        final ArrayList list2 = new ArrayList(((List)x3).size());
                        for (int size2 = ((Collection)x3).size(), n6 = 0; n6 < size2; ++n6) {
                            final ng0 ng0 = (ng0)((List)x3).get(n6);
                            final Object a14 = ng0.a;
                            if (a14 instanceof hcm) {
                                final hcm hcm = (hcm)a14;
                                if (hcm.f == null && hcm.d == null) {
                                    if (hcm.c == null) {
                                        if (((hcm)a14).e == null) {
                                            continue;
                                        }
                                    }
                                }
                                list2.add((Object)ng0);
                            }
                        }
                        final una f3 = a11.f;
                        hcm hcm2 = null;
                        Label_2388: {
                            if (f3 == null && a11.d == null) {
                                if (a11.c == null) {
                                    if (a11.e == null) {
                                        hcm2 = null;
                                        break Label_2388;
                                    }
                                }
                            }
                            hcm2 = new hcm(0L, 0L, a11.c, a11.d, a11.e, f3, null, 0L, null, null, null, 0L, null, null, 65475);
                        }
                        final zy3 zy3 = new zy3(o3, (Object)d90, (byte)7);
                        if (list2.size() <= 1) {
                            if (!list2.isEmpty()) {
                                hcm d93 = (hcm)((ng0)list2.get(0)).a;
                                if (hcm2 != null) {
                                    d93 = hcm2.d(d93);
                                }
                                zy3.h((Object)d93, (Object)((ng0)list2.get(0)).b, (Object)((ng0)list2.get(0)).c);
                            }
                        }
                        else {
                            final int size3 = list2.size();
                            final int n7 = size3 * 2;
                            final int[] array = new int[n7];
                            for (int size4 = list2.size(), n8 = 0; n8 < size4; ++n8) {
                                final ng0 ng2 = (ng0)list2.get(n8);
                                array[n8] = ng2.b;
                                array[n8 + size3] = ng2.c;
                            }
                            if (n7 > 1) {
                                Arrays.sort(array);
                            }
                            if (n7 == 0) {
                                oyl.i("Array is empty.");
                                throw null;
                            }
                            int n9 = array[0];
                            final int n10 = 0;
                            final int n11 = n7;
                            int n12 = n10;
                            final ArrayList list3 = list2;
                            while (n12 < n11) {
                                final int n13 = array[n12];
                                if (n13 != n9) {
                                    final int size5 = list3.size();
                                    int n14 = 0;
                                    Object d94 = hcm2;
                                    Object o4;
                                    while (true) {
                                        o4 = d94;
                                        if (n14 >= size5) {
                                            break;
                                        }
                                        final ng0 ng3 = (ng0)list3.get(n14);
                                        final int b19 = ng3.b;
                                        final int c3 = ng3.c;
                                        d94 = o4;
                                        if (b19 != c3) {
                                            d94 = o4;
                                            if (pg0.c(n9, n13, b19, c3)) {
                                                d94 = ng3.a;
                                                if (o4 != null) {
                                                    d94 = ((hcm)o4).d((hcm)d94);
                                                }
                                            }
                                        }
                                        ++n14;
                                    }
                                    if (o4 != null) {
                                        zy3.h(o4, (Object)n9, (Object)n13);
                                    }
                                    n9 = n13;
                                }
                                ++n12;
                            }
                        }
                        final int size6 = ((Collection)x3).size();
                        int n15 = 0;
                        boolean b20 = false;
                        final xc8 xc8 = a9;
                        while (n15 < size6) {
                            final ng0 ng4 = (ng0)((List)x3).get(n15);
                            final Object a15 = ng4.a;
                            if (a15 instanceof hcm) {
                                final int b21 = ng4.b;
                                final int c4 = ng4.c;
                                if (b21 >= 0 && b21 < ((CharSequence)o3).length() && c4 > b21 && c4 <= ((CharSequence)o3).length()) {
                                    final hcm hcm3 = (hcm)a15;
                                    final long h3 = hcm3.h;
                                    final zw1 i3 = hcm3.i;
                                    final oln a16 = hcm3.a;
                                    if (i3 != null) {
                                        ((Spannable)o3).setSpan((Object)new ax1(i3.a), b21, c4, 33);
                                    }
                                    yi2.W((Spannable)o3, a16.b(), b21, c4);
                                    final qm2 c5 = a16.c();
                                    final float a17 = a16.a();
                                    if (c5 != null) {
                                        if (c5 instanceof cam) {
                                            yi2.W((Spannable)o3, ((cam)c5).a, b21, c4);
                                        }
                                        else {
                                            ((Spannable)o3).setSpan((Object)new ppl((opl)c5, a17), b21, c4, 33);
                                        }
                                    }
                                    final wgn m2 = hcm3.m;
                                    if (m2 != null) {
                                        final int a18 = m2.a;
                                        ((Spannable)o3).setSpan((Object)new xgn((a18 | 0x1) == a18, (a18 | 0x2) == a18), b21, c4, 33);
                                    }
                                    yi2.X((Spannable)o3, hcm3.b, xc8, b21, c4);
                                    final String g4 = hcm3.g;
                                    if (g4 != null) {
                                        ((Spannable)o3).setSpan((Object)new yna((Object)g4, (byte)0), b21, c4, 33);
                                    }
                                    final tln j2 = hcm3.j;
                                    if (j2 != null) {
                                        ((Spannable)o3).setSpan((Object)new ScaleXSpan(j2.a), b21, c4, 33);
                                        ((Spannable)o3).setSpan((Object)new p0m(j2.b), b21, c4, 33);
                                    }
                                    final jpd k2 = hcm3.k;
                                    if (k2 != null) {
                                        ((Spannable)o3).setSpan((Object)mkq.t(k2), b21, c4, 33);
                                    }
                                    final long l3 = hcm3.l;
                                    if (l3 != 16L) {
                                        ((Spannable)o3).setSpan((Object)new BackgroundColorSpan(t08.o0(l3)), b21, c4, 33);
                                    }
                                    final rpl n16 = hcm3.n;
                                    if (n16 != null) {
                                        final long b22 = n16.b;
                                        final int o5 = t08.o0(n16.a);
                                        final float intBitsToFloat = Float.intBitsToFloat((int)(b22 >> 32));
                                        final float intBitsToFloat2 = Float.intBitsToFloat((int)(b22 & 0xFFFFFFFFL));
                                        float c6;
                                        if ((c6 = n16.c) == 0.0f) {
                                            c6 = Float.MIN_VALUE;
                                        }
                                        ((Spannable)o3).setSpan((Object)new tpl(o5, intBitsToFloat, intBitsToFloat2, c6), b21, c4, 33);
                                    }
                                    final dw8 p7 = hcm3.p;
                                    if (p7 != null) {
                                        ((Spannable)o3).setSpan((Object)new ew8(p7), b21, c4, 33);
                                    }
                                    if (wnn.a(vnn.b(h3), 4294967296L) || wnn.a(vnn.b(h3), 8589934592L)) {
                                        b20 = true;
                                    }
                                }
                            }
                            ++n15;
                        }
                        final xc8 xc9 = xc8;
                        x = y2;
                        if (b20) {
                            final int size7 = ((Collection)x3).size();
                            int n17 = 0;
                            final List list4 = y2;
                            while (true) {
                                x = list4;
                                if (n17 >= size7) {
                                    break;
                                }
                                final ng0 ng5 = (ng0)((List)x3).get(n17);
                                final kg0 kg0 = (kg0)ng5.a;
                                if (kg0 instanceof hcm) {
                                    final int b23 = ng5.b;
                                    final int c7 = ng5.c;
                                    if (b23 >= 0 && b23 < ((CharSequence)o3).length() && c7 > b23 && c7 <= ((CharSequence)o3).length()) {
                                        final long h4 = ((hcm)kg0).h;
                                        final long b24 = vnn.b(h4);
                                        Object o6;
                                        if (wnn.a(b24, 4294967296L)) {
                                            o6 = new j8d(xc9.W0(h4));
                                        }
                                        else if (wnn.a(b24, 8589934592L)) {
                                            o6 = new i8d(vnn.c(h4));
                                        }
                                        else {
                                            o6 = null;
                                        }
                                        if (o6 != null) {
                                            ((Spannable)o3).setSpan(o6, b23, c7, 33);
                                        }
                                    }
                                }
                                ++n17;
                            }
                        }
                        final vln d95 = b13.d;
                        float w7;
                        if (d95 != null) {
                            final long a19 = d95.a;
                            final long b25 = vnn.b(a19);
                            if (wnn.a(b25, 4294967296L)) {
                                w7 = xc9.W0(a19);
                            }
                            else if (wnn.a(b25, 8589934592L)) {
                                w7 = vnn.c(a19) * textSize;
                            }
                            else {
                                w7 = 0.0f;
                            }
                        }
                        else {
                            w7 = 0.0f;
                        }
                        final int size8 = ((Collection)x3).size();
                        int n18 = 0;
                        final xc8 xc10 = xc9;
                        while (n18 < size8) {
                            final ng0 ng6 = (ng0)((List)x3).get(n18);
                            final Object a20 = ng6.a;
                            ho2 ho2;
                            if (a20 instanceof ho2) {
                                ho2 = (ho2)a20;
                            }
                            else {
                                ho2 = null;
                            }
                            if (ho2 != null) {
                                final float q = yi2.Q(ho2.c(), textSize, xc10);
                                final float q2 = yi2.Q(ho2.a(), textSize, xc10);
                                final float q3 = yi2.Q(ho2.b(), textSize, xc10);
                                if (!Float.isNaN(q) && !Float.isNaN(q2) && !Float.isNaN(q3)) {
                                    ((Spannable)o3).setSpan((Object)new tr7((aql)jr4.a, q, q2, q3, (qm2)null, Float.NaN, (dw8)gea.a, xc10, w7), ng6.b, ng6.c, 33);
                                }
                            }
                            ++n18;
                        }
                        for (int size9 = ((Collection)x).size(), n19 = 0; n19 < size9; ++n19) {
                            final ng0 ng7 = (ng0)x.get(n19);
                            final s8h s8h = (s8h)ng7.a;
                            final int b26 = ng7.b;
                            final int c8 = ng7.c;
                            final Object[] spans = ((Spanned)o3).getSpans(b26, c8, (Class)ymo.class);
                            for (int length2 = spans.length, n20 = 0; n20 < length2; ++n20) {
                                ((Spannable)o3).removeSpan((Object)spans[n20]);
                            }
                            final float c9 = vnn.c(s8h.c());
                            final long b27 = vnn.b(s8h.c());
                            int n21;
                            if (wnn.a(b27, 4294967296L)) {
                                n21 = 0;
                            }
                            else if (wnn.a(b27, 8589934592L)) {
                                n21 = 1;
                            }
                            else {
                                n21 = 2;
                            }
                            final float c10 = vnn.c(s8h.a());
                            final long b28 = vnn.b(s8h.a());
                            int n22;
                            if (wnn.a(b28, 4294967296L)) {
                                n22 = 0;
                            }
                            else if (wnn.a(b28, 8589934592L)) {
                                n22 = 1;
                            }
                            else {
                                n22 = 2;
                            }
                            final int b29 = s8h.b();
                            int n23;
                            if (blq.h(b29, 1)) {
                                n23 = 0;
                            }
                            else if (blq.h(b29, 2)) {
                                n23 = 1;
                            }
                            else if (blq.h(b29, 3)) {
                                n23 = 2;
                            }
                            else {
                                n23 = 4;
                                if (blq.h(b29, 4)) {
                                    n23 = 3;
                                }
                                else if (!blq.h(b29, 5)) {
                                    if (blq.h(b29, 6)) {
                                        n23 = 5;
                                    }
                                    else {
                                        if (!blq.h(b29, 7)) {
                                            en9.q("Invalid PlaceholderVerticalAlign");
                                            throw null;
                                        }
                                        n23 = 6;
                                    }
                                }
                            }
                            ((Spannable)o3).setSpan((Object)new t8h(c9, n21, c10, n22, xc10, n23), b26, c8, 33);
                        }
                        s = (String)o3;
                    }
                    this.C = (CharSequence)s;
                    this.D = new wzc((CharSequence)s, this.B, this.G);
                    return;
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    public final boolean e() {
        final nrb e = this.E;
        if (e == null || !e.L()) {
            if (!this.F && twl.v(this.w)) {
                final jy7 a = w69.a;
                final jy7 a2 = w69.a;
                Object w = a2.w;
                if (w == null) {
                    if (q69.d()) {
                        w = a2.t();
                        a2.w = w;
                    }
                    else {
                        w = k8e.a;
                    }
                }
                if (((xom)w).getValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final float p() {
        final wzc d = this.D;
        final float e = d.e;
        final TextPaint b = d.b;
        if (!Float.isNaN(e)) {
            return d.e;
        }
        final BreakIterator lineInstance = BreakIterator.getLineInstance(((Paint)b).getTextLocale());
        final CharSequence a = d.a;
        lineInstance.setText((CharacterIterator)new li3(a.length(), a));
        final PriorityQueue priorityQueue = new PriorityQueue(10, (Comparator)vt4.b);
        int i = lineInstance.next();
        int n = 0;
        while (i != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add((Object)new vgc(n, i, 1));
            }
            else {
                final xgc xgc = (xgc)priorityQueue.peek();
                if (xgc != null && ((vgc)xgc).w - ((vgc)xgc).v < i - n) {
                    priorityQueue.poll();
                    priorityQueue.add((Object)new vgc(n, i, 1));
                }
            }
            final int next = lineInstance.next();
            n = i;
            i = next;
        }
        final boolean empty = ((AbstractCollection)priorityQueue).isEmpty();
        float e2 = 0.0f;
        if (!empty) {
            final Iterator iterator = priorityQueue.iterator();
            if (!iterator.hasNext()) {
                oyl.r();
                return 0.0f;
            }
            final xgc xgc2 = (xgc)iterator.next();
            float n2 = Layout.getDesiredWidth(d.b(), ((vgc)xgc2).v, ((vgc)xgc2).w, b);
            while (true) {
                e2 = n2;
                if (!iterator.hasNext()) {
                    break;
                }
                final xgc xgc3 = (xgc)iterator.next();
                n2 = Math.max(n2, Layout.getDesiredWidth(d.b(), ((vgc)xgc3).v, ((vgc)xgc3).w, b));
            }
        }
        return d.e = e2;
    }
    
    public final float y() {
        return this.D.c();
    }
}
