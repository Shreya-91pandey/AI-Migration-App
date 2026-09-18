import java.util.Map;
import com.anthropic.claude.widget.ClaudeAppWidgetReceiver;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.graphics.Typeface;
import java.nio.charset.Charset;

public final class vzq implements fzc, ne6, lrd, hak, i9c, fnf, ffp, ybh, gc7
{
    public static final vzq A;
    public static final aqg B;
    public static final vzq C;
    public static final vzq D;
    public static final vzq E;
    public static final vzq F;
    public static final vzq w;
    public static final vzq x;
    public static final vzq y;
    public static volatile di8 z;
    public final byte v;
    
    public static qx3 C(final String s) {
        if (s.equals("RECENT")) {
            return (qx3)nx3.a;
        }
        if (s.equals("STARRED")) {
            return (qx3)px3.a;
        }
        if (rym.E0(s, "PROJECT:", false)) {
            return (qx3)new mx3(kym.g1(s, "PROJECT:"));
        }
        throw new IllegalStateException("Unknown ChatIdListSource: ".concat(s).toString());
    }
    
    public static ihn r(final gva gva) {
        return x(((e8e)gva.j((sei)h8e.a)).a, (gnn)gva.j((sei)hnn.a));
    }
    
    public static ihn t(long h, long h2, long h3, long h4, long h5, long h6, long h7, long h8, long h9, long h10, gnn gnn, long h11, long h12, long h13, long h14, long h15, long h16, long h17, long h18, long h19, long h20, long h21, long h22, long h23, long h24, long h25, long h26, long h27, long h28, long h29, long h30, long n, long n2, long n3, long n4, long n5, long n6, long n7, long n8, final gva gva, final int n9, final int n10) {
        long h31;
        if ((n9 & 0x1) != 0x0) {
            h31 = j86.h;
        }
        else {
            h31 = h;
        }
        if ((n9 & 0x2) != 0x0) {
            h2 = j86.h;
        }
        if ((n9 & 0x4) != 0x0) {
            h3 = j86.h;
        }
        if ((n9 & 0x8) != 0x0) {
            h4 = j86.h;
        }
        if ((n9 & 0x10) != 0x0) {
            h5 = j86.h;
        }
        if ((n9 & 0x20) != 0x0) {
            h6 = j86.h;
        }
        if ((n9 & 0x40) != 0x0) {
            h7 = j86.h;
        }
        if ((n9 & 0x80) != 0x0) {
            h8 = j86.h;
        }
        if ((n9 & 0x100) != 0x0) {
            h9 = j86.h;
        }
        if ((n9 & 0x200) != 0x0) {
            h10 = j86.h;
        }
        if ((n9 & 0x400) != 0x0) {
            gnn = null;
        }
        if ((n9 & 0x800) != 0x0) {
            h11 = j86.h;
        }
        if ((n9 & 0x1000) != 0x0) {
            h12 = j86.h;
        }
        if ((n9 & 0x2000) != 0x0) {
            h13 = j86.h;
        }
        if ((n9 & 0x4000) != 0x0) {
            h14 = j86.h;
        }
        if ((0x8000 & n9) != 0x0) {
            h15 = j86.h;
        }
        if ((0x10000 & n9) != 0x0) {
            h16 = j86.h;
        }
        if ((0x20000 & n9) != 0x0) {
            h17 = j86.h;
        }
        if ((0x40000 & n9) != 0x0) {
            h18 = j86.h;
        }
        if ((0x80000 & n9) != 0x0) {
            h19 = j86.h;
        }
        if ((0x100000 & n9) != 0x0) {
            h20 = j86.h;
        }
        if ((0x200000 & n9) != 0x0) {
            h21 = j86.h;
        }
        if ((0x400000 & n9) != 0x0) {
            h22 = j86.h;
        }
        if ((0x800000 & n9) != 0x0) {
            h23 = j86.h;
        }
        if ((0x1000000 & n9) != 0x0) {
            h24 = j86.h;
        }
        if ((0x2000000 & n9) != 0x0) {
            h25 = j86.h;
        }
        if ((0x4000000 & n9) != 0x0) {
            h26 = j86.h;
        }
        if ((0x8000000 & n9) != 0x0) {
            h27 = j86.h;
        }
        if ((0x10000000 & n9) != 0x0) {
            h28 = j86.h;
        }
        if ((0x20000000 & n9) != 0x0) {
            h29 = j86.h;
        }
        if ((n9 & 0x40000000) != 0x0) {
            h30 = j86.h;
        }
        h = j86.h;
        if ((n10 & 0x10) != 0x0) {
            n = h;
        }
        if ((n10 & 0x20) != 0x0) {
            n2 = h;
        }
        if ((n10 & 0x40) != 0x0) {
            n3 = h;
        }
        if ((n10 & 0x80) != 0x0) {
            n4 = h;
        }
        if ((n10 & 0x100) != 0x0) {
            n5 = h;
        }
        if ((n10 & 0x200) != 0x0) {
            n6 = h;
        }
        if ((n10 & 0x400) != 0x0) {
            n7 = h;
        }
        if ((n10 & 0x800) != 0x0) {
            n8 = h;
        }
        return x(((e8e)gva.j((sei)h8e.a)).a, (gnn)gva.j((sei)hnn.a)).a(h31, h2, h3, h4, h5, h6, h7, h8, h9, h10, gnn, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21, h22, h23, h24, h25, h26, h27, h28, h29, h30, h, h, h, h, n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public static wej u(final String s, final ire ire) {
        Charset charset2;
        final Charset charset = charset2 = ui3.a;
        ire t = ire;
        if (ire != null) {
            final w6j e = ire.e;
            charset2 = ire.a((Charset)null);
            if (charset2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)ire);
                sb.append("; charset=utf-8");
                final String string = sb.toString();
                try {
                    t = k8e.t(string);
                    charset2 = charset;
                }
                catch (final IllegalArgumentException ex) {
                    t = null;
                    charset2 = charset;
                }
            }
            else {
                t = ire;
            }
        }
        final byte[] bytes = s.getBytes(charset2);
        bytes.getClass();
        final int length = bytes.length;
        gcq.a((long)bytes.length, 0L, (long)length);
        return new wej(length, t, bytes);
    }
    
    public static wej v(int length, ire ire, final byte[] array) {
        if ((length & 0x1) != 0x0) {
            ire = null;
        }
        length = array.length;
        gcq.a((long)array.length, 0L, (long)length);
        return new wej(length, ire, array);
    }
    
    public static Typeface w(final String s, final zoa zoa, final int n) {
        if (n == 0 && mlc.q((Object)zoa, (Object)zoa.A) && (s == null || s.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (n == 0 && mlc.q((Object)zoa, (Object)zoa.D) && (s == null || s.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        boolean b = false;
        Typeface typeface;
        if (s == null) {
            typeface = Typeface.DEFAULT;
        }
        else {
            typeface = Typeface.create(s, 0);
        }
        final int v = zoa.v;
        if (n == 1) {
            b = true;
        }
        return roe.e(typeface, v, b);
    }
    
    public static ihn x(final r86 r86, final gnn gnn) {
        final ihn l0 = r86.l0;
        if (l0 == null) {
            return r86.l0 = new ihn(s86.c(r86, 17), s86.c(r86, 17), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 17), s86.c(r86, 38), s86.c(r86, 38), s86.c(r86, 38), s86.c(r86, 38), s86.c(r86, 25), s86.c(r86, 1), gnn, s86.c(r86, 25), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 1), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 18), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 1), s86.c(r86, 25), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 1), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 18), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 1), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 18)), s86.c(r86, 18), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 18)), s86.c(r86, 18));
        }
        if (mlc.q((Object)l0.k, (Object)gnn)) {
            return l0;
        }
        return r86.l0 = ihn.b(l0, gnn);
    }
    
    public static String y(final qx3 qx3) {
        if (qx3.equals(nx3.a)) {
            return "RECENT";
        }
        if (qx3.equals(px3.a)) {
            return "STARRED";
        }
        if (qx3 instanceof mx3) {
            return smk.s("PROJECT:", ((mx3)qx3).b());
        }
        if (qx3.equals(ox3.a)) {
            en9.q("Search is view-only and should not be persisted");
            return null;
        }
        en9.r();
        return null;
    }
    
    public static String z(String c1) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("SHA-256");
            final byte[] bytes = c1.getBytes(ui3.a);
            bytes.getClass();
            instance.update(bytes);
            final byte[] digest = instance.digest();
            digest.getClass();
            c1 = iw0.c1(digest, "", (lta)l0k.y, 30);
            return c1;
        }
        catch (final NoSuchAlgorithmException ex) {
            c5q.E((rjc)s2k.a, 5, qjc.v, (jta)s0k.K, (Throwable)ex, false, 48);
            return null;
        }
    }
    
    public Object A(ArrayList v, final wu7 wu7, final h07 h07) {
        Object o = null;
        Label_0056: {
            if (h07 instanceof st7) {
                final st7 st7 = (st7)h07;
                final int b = st7.B;
                if ((b & Integer.MIN_VALUE) != 0x0) {
                    st7.B = b + Integer.MIN_VALUE;
                    o = st7;
                    break Label_0056;
                }
            }
            o = new st7(this, h07);
        }
        final Object z = ((st7)o).z;
        final int b2 = ((st7)o).B;
        final pc7 v2 = pc7.v;
        Object w = null;
    Label_0424:
        while (true) {
            Label_0152: {
                if (b2 == 0) {
                    break Label_0152;
                }
                Label_0139: {
                    if (b2 == 1) {
                        break Label_0139;
                    }
                    Label_0131: {
                        if (b2 != 2) {
                            break Label_0131;
                        }
                        int y = ((st7)o).y;
                        Iterator x = ((st7)o).x;
                        w = ((st7)o).w;
                        final st7 st8 = (st7)o;
                        final int n = y;
                        final Iterator iterator = x;
                        final b4j b4j = (b4j)w;
                        try {
                            vt4.g0(z);
                            break Label_0224;
                        }
                        finally {
                            final Object v3 = b4j.v;
                            if (v3 == null) {
                                final Throwable v4;
                                b4j.v = v4;
                                o = st8;
                                y = n;
                                x = iterator;
                                w = b4j;
                            }
                            else {
                                final Throwable v4;
                                soh.j((Throwable)v3, v4);
                                o = st8;
                                y = n;
                                x = iterator;
                                w = b4j;
                            }
                            while (x.hasNext()) {
                                final lta lta = (lta)x.next();
                                ((st7)o).v = null;
                                ((st7)o).w = (b4j)w;
                                ((st7)o).x = x;
                                ((st7)o).y = y;
                                ((st7)o).B = 2;
                                if (lta.b(o) == v2) {
                                    return v2;
                                }
                            }
                            break Label_0424;
                            v = ((st7)o).v;
                            vt4.g0(z);
                            Label_0206: {
                                break Label_0206;
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                                Label_0203: {
                                    final ArrayList v5;
                                    v = v5;
                                }
                            }
                            w = new Object();
                            x = ((Iterable)v).iterator();
                            y = 0;
                            continue;
                            vt4.g0(z);
                            final ArrayList v5 = new ArrayList();
                            final tt7 tt7 = new tt7((List)v, v5, (f07)null);
                            ((st7)o).v = v5;
                            ((st7)o).B = 1;
                            iftrue(Label_0203:)(wu7.a(tt7, (h07)o) != v2);
                            return v2;
                        }
                    }
                }
            }
            continue;
        }
        final Throwable t = (Throwable)((b4j)w).v;
        if (t == null) {
            return lqo.a;
        }
        throw t;
    }
    
    public Object B(final Context context, final h07 h07) {
        azp azp2 = null;
        Label_0053: {
            if (h07 instanceof azp) {
                final azp azp = (azp)h07;
                final int x = azp.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    azp.x = x + Integer.MIN_VALUE;
                    azp2 = azp;
                    break Label_0053;
                }
            }
            azp2 = new azp(this, h07);
        }
        final Object v = azp2.v;
        final int x2 = azp2.x;
        boolean b = true;
        Object o;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            o = v;
        }
        else {
            vt4.g0(v);
            final r1b r1b = new r1b(context);
            final us4 a = v4j.a((Class)ClaudeAppWidgetReceiver.class);
            azp2.x = 1;
            final Object e = r1b.e(r1b, a, azp2);
            final pc7 v2 = pc7.v;
            if ((o = e) == v2) {
                return v2;
            }
        }
        if (((Number)o).intValue() != 0) {
            b = false;
        }
        return b;
    }
    
    public Typeface a(final zoa zoa, final int n) {
        return w(null, zoa, n);
    }
    
    public void b() {
    }
    
    public b9c c() {
        return (b9c)new hp8((Float)null);
    }
    
    public void d(final String s, final String s2, final Map map) {
    }
    
    public void e(final Map map) {
    }
    
    public void f(final efp efp) {
    }
    
    public void g(final efp efp) {
    }
    
    public void h(final String s) {
    }
    
    public l2p i() {
        return new l2p((String)null, 31);
    }
    
    public void j(final lqd lqd) {
        final StringBuilder sb = new StringBuilder("[Segment ");
        sb.append(guc.u(lqd.a));
        sb.append(' ');
        sb.append(lqd.b);
        System.out.println((Object)sb.toString());
    }
    
    public Object k(final uy7 uy7) {
        switch (this.v) {
            default: {
                final daf daf = (daf)uy7.d((Class)daf.class);
                ger.k();
                return new vzq((byte)0);
            }
            case 8: {
                final daf daf2 = (daf)uy7.d((Class)daf.class);
                return new def((byte)0);
            }
        }
    }
    
    public Typeface l(final cxa cxa, final zoa zoa, final int n) {
        return w(cxa.A, zoa, n);
    }
    
    @Override
    public Object m(final g6b g6b, final f07 f07) {
        return l4.d(new izc(g6b));
    }
    
    public void n(final double n) {
    }
    
    public void o(final boolean b, final llf llf, final ihn ihn, final aql aql, final gva gva, final int n) {
        gva.i0(-818661242);
        int n2;
        if (gva.g(b)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.g(false)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.f((Object)llf)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.f((Object)ihn)) {
            n5 = 16384;
        }
        else {
            n5 = 8192;
        }
        int n6;
        if (gva.f((Object)aql)) {
            n6 = 131072;
        }
        else {
            n6 = 65536;
        }
        final int n7 = n | n2 | n3 | n4 | n5 | n6;
        if (gva.W(n7 & 0x1, (0x2492493 & n7) != 0x2492492)) {
            gva.b0();
            if ((n & 0x1) != 0x0) {
                if (!gva.C()) {
                    gva.Z();
                }
            }
            gva.r();
            final boolean booleanValue = (boolean)((xom)t08.t(llf, gva, n7 >> 6 & 0xE)).getValue();
            long n8;
            if (!b) {
                n8 = ihn.g;
            }
            else if (booleanValue) {
                n8 = ihn.e;
            }
            else {
                n8 = ihn.f;
            }
            rj2.a(t08.F((igf)fgf.v, (lta)new tyl((Object)aql, (Object)new ain((adi)new y41(tzl.a(n8, (bfa)zrn.X(4, gva), (String)null, gva, 0, 12))), (byte)6)).E((igf)new b8c(b, llf, ihn, aql)), gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ry((byte)21, n, (Object)this, (Object)llf, (Object)ihn, (Object)aql, b);
        }
    }
    
    public sed p(int i, int n, final String s) {
        int j = i - 1;
        int n2 = 1;
        int n3 = -1;
    Label_0222:
        while (j >= n) {
            final char char1 = s.charAt(j);
            Label_0216: {
                Label_0209: {
                    if (!tjq.g(char1)) {
                        if (!tjq.j(char1)) {
                            if (char1 != '!' && char1 != '-' && char1 != '/' && char1 != '=' && char1 != '?' && char1 != '*' && char1 != '+') {
                                switch (char1) {
                                    default: {
                                        switch (char1) {
                                            default: {
                                                switch (char1) {
                                                    default: {
                                                        if (char1 != '.') {
                                                            break Label_0222;
                                                        }
                                                        if (n2 != 0) {
                                                            break Label_0222;
                                                        }
                                                        n2 = 1;
                                                        break Label_0216;
                                                    }
                                                    case '{':
                                                    case '|':
                                                    case '}':
                                                    case '~': {
                                                        break Label_0209;
                                                    }
                                                }
                                                break;
                                            }
                                            case '^':
                                            case '_':
                                            case '`': {
                                                break Label_0209;
                                            }
                                        }
                                        break;
                                    }
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'': {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                n3 = j;
                n2 = 0;
            }
            --j;
        }
        if (n3 != -1) {
            ++i;
            int n4 = 1;
            int n5 = -1;
            int n6 = -1;
            int n7 = 0;
            while (i < s.length()) {
                final char char2 = s.charAt(i);
                if (n4 != 0) {
                    if (!tjq.g(char2) && !tjq.j(char2)) {
                        break;
                    }
                    n6 = i;
                    n = 1;
                    n4 = 0;
                }
                else if (char2 == '.') {
                    if (n7 == 0) {
                        break;
                    }
                    if ((n = n5) == -1) {
                        n = i;
                    }
                    n4 = 1;
                    n5 = n;
                    n = n7;
                }
                else if (char2 == '-') {
                    n = 0;
                }
                else {
                    if (!tjq.g(char2) && !tjq.j(char2)) {
                        break;
                    }
                    n6 = i;
                    n = 1;
                }
                ++i;
                n7 = n;
            }
            if (n5 == -1 || n5 > (i = n6)) {
                i = -1;
            }
            if (i != -1) {
                return new sed(ued.w, n3, i + 1);
            }
        }
        return null;
    }
    
    public void q(final String s, final zta zta, final boolean b, final boolean b2, final lep lep, final llf llf, final zta zta2, final zta zta3, final zta zta4, final zta zta5, final aql aql, final ihn ihn, dng dng, zta zta6, final gva gva, final int n) {
        gva.i0(1806980801);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)s)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n & 0x30) == 0x0) {
            int n4;
            if (gva.h((Object)zta)) {
                n4 = 32;
            }
            else {
                n4 = 16;
            }
            n3 |= n4;
        }
        int n5 = 128;
        int n6 = n3;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.g(b)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n3 | n7);
        }
        int n8 = 1024;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.g(b2)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n6 |= n9;
        }
        int n10 = 8192;
        int n11 = n6;
        if ((n & 0x6000) == 0x0) {
            int n12;
            if (gva.f((Object)lep)) {
                n12 = 16384;
            }
            else {
                n12 = 8192;
            }
            n11 = (n6 | n12);
        }
        int n13 = 131072;
        int n14 = n11;
        if ((0x30000 & n) == 0x0) {
            int n15;
            if (gva.f((Object)llf)) {
                n15 = 131072;
            }
            else {
                n15 = 65536;
            }
            n14 = (n11 | n15);
        }
        int n16 = n14;
        if ((n & 0x180000) == 0x0) {
            int n17;
            if (gva.g(false)) {
                n17 = 1048576;
            }
            else {
                n17 = 524288;
            }
            n16 = (n14 | n17);
        }
        int n18 = n16;
        if ((n & 0xC00000) == 0x0) {
            int n19;
            if (gva.h((Object)zta2)) {
                n19 = 8388608;
            }
            else {
                n19 = 4194304;
            }
            n18 = (n16 | n19);
        }
        int n20 = n18;
        if ((n & 0x6000000) == 0x0) {
            int n21;
            if (gva.h((Object)zta3)) {
                n21 = 67108864;
            }
            else {
                n21 = 33554432;
            }
            n20 = (n18 | n21);
        }
        int n22 = n20;
        if ((n & 0x30000000) == 0x0) {
            int n23;
            if (gva.h((Object)zta4)) {
                n23 = 536870912;
            }
            else {
                n23 = 268435456;
            }
            n22 = (n20 | n23);
        }
        int n24;
        if (gva.h((Object)zta5)) {
            n24 = 4;
        }
        else {
            n24 = 2;
        }
        int n25;
        if (gva.h((Object)null)) {
            n25 = 32;
        }
        else {
            n25 = 16;
        }
        if (gva.h((Object)null)) {
            n5 = 256;
        }
        if (gva.h((Object)null)) {
            n8 = 2048;
        }
        if (gva.f((Object)aql)) {
            n10 = 16384;
        }
        if (!gva.f((Object)ihn)) {
            n13 = 65536;
        }
        final int n26 = 0x6000000 | n24 | n25 | n5 | n8 | n10 | n13 | 0xC80000;
        boolean b3 = true;
        if (gva.W(n22 & 0x1, (n22 & 0x12492493) != 0x12492492 || (n26 & 0x2492493) != 0x2492492)) {
            gva.b0();
            int n27;
            zta zta7;
            dng dng3;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n27 = (n26 & 0xFFC7FFFF);
                final dng dng2 = dng;
                zta7 = zta6;
                dng3 = dng2;
            }
            else {
                hng hng;
                if (zta2 == null) {
                    hng = new hng(16.0f, 16.0f, 16.0f, 16.0f);
                }
                else {
                    hng = new hng(16.0f, 8.0f, 16.0f, 8.0f);
                }
                n27 = (n26 & 0xFFC7FFFF);
                final ye6 t0 = uuj.t0(417908150, (aua)new jyj(b, llf, ihn, aql), gva);
                dng3 = hng;
                zta7 = (zta)t0;
            }
            gva.r();
            final boolean b4 = (n22 & 0xE) == 0x4;
            if ((n22 & 0xE000) != 0x4000) {
                b3 = false;
            }
            final Object r = gva.R();
            leo a;
            if ((b4 | b3) || (a = (leo)r) == bi6.a) {
                a = lep.a(new og0(s));
                gva.q0((Object)a);
            }
            final String w = a.a.w;
            final win win = new win();
            Object t2;
            if (zta2 == null) {
                gva.g0(-1353189719);
                gva.q(false);
                t2 = null;
            }
            else {
                gva.g0(-1353189718);
                t2 = uuj.t0(1243762560, (aua)new g42(zta2, (byte)10), gva);
                gva.q(false);
            }
            final int n28 = n22 >> 12;
            final int n29 = n27 << 18;
            ao2.h((CharSequence)w, zta, (riq)win, (bua)t2, zta3, zta4, zta5, (zta)null, (zta)null, b2, b, false, llf, dng3, ihn, zta7, gva, (n22 & 0x70) | (n28 & 0xE000) | (n28 & 0x70000) | (n29 & 0x380000) | (n29 & 0x1C00000) | (n29 & 0xE000000) | (n29 & 0x70000000), (n22 >> 9 & 0xE) | (n22 >> 3 & 0x70) | (n28 & 0x380) | (n22 >> 6 & 0x1C00) | (n27 & 0x70000) | 0x180000);
            final dng dng4 = dng3;
            zta6 = zta7;
            dng = dng4;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new zhn(this, s, zta, b, b2, lep, llf, zta2, zta3, zta4, zta5, aql, ihn, dng, zta6, n);
        }
    }
    
    public void s() {
    }
}
