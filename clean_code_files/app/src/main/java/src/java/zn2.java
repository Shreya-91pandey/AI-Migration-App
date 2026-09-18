import android.os.BaseBundle;
import java.util.NoSuchElementException;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.layout.b;
import kotlinx.serialization.json.JsonEncodingException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.io.InputStream;
import android.text.SpannableStringBuilder;
import android.os.Bundle;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.view.inputmethod.EditorInfo;
import java.security.MessageDigest;
import android.view.View;
import java.util.Collection;

public abstract class zn2
{
    public static final eg0 a;
    public static final fg0 b;
    public static final gg0 c;
    public static final hg0 d;
    public static final eg0 e;
    public static final fg0 f;
    public static final gg0 g;
    public static final hg0 h;
    public static final w8g i;
    public static final qm8 j;
    public static final ylb k;
    public static final def l;
    
    public static final String[] A(final hy6 hy6) {
        hy6.getClass();
        return (String[])((Collection)((v50)hy6).b).toArray((Object[])new String[0]);
    }
    
    public static final r28 B(final sei sei, final gva gva) {
        y50.a(0, gva);
        return (r28)gva.j(sei);
    }
    
    public static final ngh C(final View view) {
        ngh ngh;
        if ((ngh = (ngh)view.getTag(2131297022)) == null) {
            ngh = new ngh();
            view.setTag(2131297022, (Object)ngh);
        }
        return ngh;
    }
    
    public static String D(final String s) {
        final MessageDigest instance = MessageDigest.getInstance("SHA-256");
        final byte[] bytes = s.getBytes(ui3.a);
        bytes.getClass();
        final byte[] digest = instance.digest(bytes);
        digest.getClass();
        final int[] a = ljb.a;
        final ojb c = ojb.c;
        final int length = digest.length;
        final int length2 = digest.length;
        int i = 0;
        twl.k(0, length, length2);
        if (length == 0) {
            return "";
        }
        final int[] a2 = ljb.a;
        final mjb a3 = c.a;
        final boolean a4 = a3.a;
        final int n = 1;
        if (a4) {
            if (a3.b) {
                final char[] array = new char[ljb.a(length * 2L)];
                int b = 0;
                while (i < length) {
                    b = ljb.b(digest, i, a2, array, b);
                    ++i;
                }
                return new String(array);
            }
            if (length > 0) {
                final char[] array2 = new char[ljb.a(length * 2L)];
                int n2 = ljb.c("", array2, ljb.b(digest, 0, a2, array2, ljb.c("", array2, 0)));
                for (int j = n; j < length; ++j) {
                    n2 = ljb.c("", array2, ljb.b(digest, j, a2, array2, ljb.c("", array2, ljb.c("", array2, n2))));
                }
                return new String(array2);
            }
            en9.s("Failed requirement.");
            return null;
        }
        else {
            if (length <= 0) {
                en9.s("Failed requirement.");
                return null;
            }
            final int n3 = (length - 1) / Integer.MAX_VALUE;
            int n4;
            if ((n4 = length % Integer.MAX_VALUE) == 0) {
                n4 = Integer.MAX_VALUE;
            }
            final int a5 = ljb.a(2L * length + ((n4 - 1) / Integer.MAX_VALUE * 2L + n3));
            final char[] array3 = new char[a5];
            int k = 0;
            int c2 = 0;
            int n6;
            int n5 = n6 = c2;
            while (k < length) {
                int n7;
                int c3;
                int n8;
                if (n5 == Integer.MAX_VALUE) {
                    array3[c2] = '\n';
                    n7 = 0;
                    c3 = c2 + 1;
                    n8 = 0;
                }
                else {
                    c3 = c2;
                    n8 = n5;
                    if ((n7 = n6) == Integer.MAX_VALUE) {
                        c3 = ljb.c("  ", array3, c2);
                        n7 = 0;
                        n8 = n5;
                    }
                }
                int c4 = c3;
                if (n7 != 0) {
                    c4 = ljb.c("", array3, c3);
                }
                c2 = ljb.c("", array3, ljb.b(digest, k, a2, array3, ljb.c("", array3, c4)));
                n6 = n7 + 1;
                n5 = n8 + 1;
                ++k;
            }
            if (c2 == a5) {
                return new String(array3);
            }
            en9.q("Check failed.");
            return null;
        }
    }
    
    public static final void E(final g1 g1, String concat) {
        concat = "Trailing comma before the end of JSON ".concat(concat);
        g1.w(g1.w - 1, concat, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }
    
    public static final boolean G(final k2j k2j, final k2j k2j2, final k2j k2j3, final int n) {
        if (H(n, k2j, k2j3)) {
            if (H(n, k2j2, k2j3)) {
                if (!j(k2j3, k2j, k2j2, n)) {
                    if (j(k2j3, k2j2, k2j, n)) {
                        return false;
                    }
                    if (I(n, k2j3, k2j) >= I(n, k2j3, k2j2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static final boolean H(final int n, final k2j k2j, final k2j k2j2) {
        if (n == 3) {
            final float c = k2j2.c;
            final float a = k2j2.a;
            final float c2 = k2j.c;
            return (c > c2 || a >= c2) && a > k2j.a;
        }
        if (n == 4) {
            final float a2 = k2j2.a;
            final float c3 = k2j2.c;
            final float a3 = k2j.a;
            return (a2 < a3 || c3 <= a3) && c3 < k2j.c;
        }
        if (n == 5) {
            final float d = k2j2.d;
            final float b = k2j2.b;
            final float d2 = k2j.d;
            return (d > d2 || b >= d2) && b > k2j.b;
        }
        if (n == 6) {
            final float b2 = k2j2.b;
            final float d3 = k2j2.d;
            final float b3 = k2j.b;
            return (b2 < b3 || d3 <= b3) && d3 < k2j.d;
        }
        en9.q("This function should only be used for 2-D focus search");
        return false;
    }
    
    public static final long I(final int n, final k2j k2j, final k2j k2j2) {
        float n2;
        float n3;
        if (n == 3) {
            n2 = k2j.a;
            n3 = k2j2.c;
        }
        else if (n == 4) {
            n2 = k2j2.a;
            n3 = k2j.c;
        }
        else if (n == 5) {
            n2 = k2j.b;
            n3 = k2j2.d;
        }
        else {
            if (n != 6) {
                en9.q("This function should only be used for 2-D focus search");
                return 0L;
            }
            n2 = k2j2.b;
            n3 = k2j.d;
        }
        float n4;
        if ((n4 = n2 - n3) < 0.0f) {
            n4 = 0.0f;
        }
        final long n5 = (long)n4;
        float n6 = 0.0f;
        float n7 = 0.0f;
        float n8 = 0.0f;
        Label_0140: {
            if (n != 3) {
                if (n != 4) {
                    if (n != 5) {
                        if (n != 6) {
                            en9.q("This function should only be used for 2-D focus search");
                            return 0L;
                        }
                    }
                    final float a = k2j.a;
                    n6 = (k2j.c - a) / 2.0f + a;
                    n7 = k2j2.a;
                    n8 = k2j2.c;
                    break Label_0140;
                }
            }
            final float b = k2j.b;
            n6 = (k2j.d - b) / 2.0f + b;
            n7 = k2j2.b;
            n8 = k2j2.d;
        }
        final long n9 = (long)(n6 - ((n8 - n7) / 2.0f + n7));
        return n9 * n9 + 13L * n5 * n5;
    }
    
    public static int J(final int n, final int n2, final int n3) {
        int n4 = n;
        if ((n2 & 0x8) != 0x0) {
            n4 = n - 1;
        }
        if (n3 <= n4) {
            return n4 - n3;
        }
        uy8.h(smk.o(n3, n4, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }
    
    public static final CharSequence K(int n, final CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            String s = ".....";
            if (n != -1) {
                final int n2 = n - 30;
                final int n3 = n + 30;
                String s2;
                if (n2 <= 0) {
                    s2 = "";
                }
                else {
                    s2 = ".....";
                }
                if (n3 >= charSequence.length()) {
                    s = "";
                }
                final StringBuilder sb = new StringBuilder(s2);
                if ((n = n2) < 0) {
                    n = 0;
                }
                final int length = charSequence.length();
                int n4;
                if ((n4 = n3) > length) {
                    n4 = length;
                }
                sb.append(charSequence.subSequence(n, n4).toString());
                sb.append(s);
                return (CharSequence)sb.toString();
            }
            n = charSequence.length() - 60;
            if (n > 0) {
                final StringBuilder sb2 = new StringBuilder(".....");
                sb2.append(charSequence.subSequence(n, charSequence.length()).toString());
                return (CharSequence)sb2.toString();
            }
        }
        return charSequence;
    }
    
    public static final String L(final Number n, final String s) {
        final StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append((Object)n);
        String k = ". ";
        if (s != null) {
            k = hia.k(" with key ", s, ". ");
        }
        return oz1.p(sb, k, "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }
    
    public static final boolean M(final int n, final z36 z36, gna u, final k2j k2j) {
        final inf inf = new inf(0, (Object[])new gna[16]);
        if (!((hgf)u).v.I) {
            gac.c("visitChildren called on an unattached node");
        }
        final inf inf2 = new inf(0, (Object[])new hgf[16]);
        final hgf v = ((hgf)u).v;
        final hgf a = v.A;
        if (a == null) {
            soh.i(inf2, v);
        }
        else {
            inf2.b((Object)a);
        }
        while (true) {
            final int x = inf2.x;
            if (x == 0) {
                break;
            }
            hgf hgf2;
            final hgf hgf = hgf2 = (hgf)inf2.l(x - 1);
            if ((hgf.y & 0x400) == 0x0) {
                soh.i(inf2, hgf);
            }
            else {
                while (hgf2 != null) {
                    if ((hgf2.x & 0x400) != 0x0) {
                        inf inf3 = null;
                        while (hgf2 != null) {
                            inf inf4;
                            if (hgf2 instanceof gna) {
                                final gna gna = (gna)hgf2;
                                inf4 = inf3;
                                if (((hgf)gna).I) {
                                    inf.b((Object)gna);
                                    inf4 = inf3;
                                }
                            }
                            else {
                                inf4 = inf3;
                                if ((hgf2.x & 0x400) != 0x0) {
                                    inf4 = inf3;
                                    if (hgf2 instanceof v98) {
                                        hgf hgf3 = ((v98)hgf2).K;
                                        int n2 = 0;
                                        while (hgf3 != null) {
                                            inf inf5 = inf3;
                                            int n3 = n2;
                                            hgf hgf4 = hgf2;
                                            if ((hgf3.x & 0x400) != 0x0) {
                                                n3 = n2 + 1;
                                                if (n3 == 1) {
                                                    hgf4 = hgf3;
                                                    inf5 = inf3;
                                                }
                                                else {
                                                    if ((inf5 = inf3) == null) {
                                                        inf5 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    if ((hgf4 = hgf2) != null) {
                                                        inf5.b((Object)hgf2);
                                                        hgf4 = null;
                                                    }
                                                    inf5.b((Object)hgf3);
                                                }
                                            }
                                            hgf3 = hgf3.A;
                                            inf3 = inf5;
                                            n2 = n3;
                                            hgf2 = hgf4;
                                        }
                                        inf4 = inf3;
                                        if (n2 == 1) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            hgf2 = soh.G(inf4);
                            inf3 = inf4;
                        }
                        break;
                    }
                    hgf2 = hgf2.A;
                }
            }
        }
        while (inf.x != 0) {
            u = u(inf, k2j, n);
            if (u == null) {
                break;
            }
            if (u.q1().a) {
                return (boolean)z36.b((Object)u);
            }
            if (z(n, z36, u, k2j)) {
                return true;
            }
            inf.k((Object)u);
        }
        return false;
    }
    
    public static void N(final EditorInfo editorInfo, CharSequence charSequence) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            r4.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (sdk_INT >= 30) {
            r4.g(editorInfo, charSequence);
            return;
        }
        int initialSelStart = editorInfo.initialSelStart;
        final int initialSelEnd = editorInfo.initialSelEnd;
        int n;
        if (initialSelStart > initialSelEnd) {
            n = initialSelEnd;
        }
        else {
            n = initialSelStart;
        }
        if (initialSelStart <= initialSelEnd) {
            initialSelStart = initialSelEnd;
        }
        final int length = charSequence.length();
        if (n < 0 || initialSelStart > length) {
            O(editorInfo, null, 0, 0);
            return;
        }
        final int n2 = editorInfo.inputType & 0xFFF;
        if (n2 == 129 || n2 == 225 || n2 == 18) {
            O(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            O(editorInfo, charSequence, n, initialSelStart);
            return;
        }
        final int n3 = initialSelStart - n;
        int n4;
        if (n3 > 1024) {
            n4 = 0;
        }
        else {
            n4 = n3;
        }
        final int length2 = charSequence.length();
        final int n5 = 2048 - n4;
        final int min = Math.min(length2 - initialSelStart, n5 - Math.min(n, (int)(n5 * 0.8)));
        final int min2 = Math.min(n, n5 - min);
        int n7;
        final int n6 = n7 = n - min2;
        int n8 = min2;
        if (Character.isLowSurrogate(charSequence.charAt(n6))) {
            n7 = n6 + 1;
            n8 = min2 - 1;
        }
        int n9 = min;
        if (Character.isHighSurrogate(charSequence.charAt(initialSelStart + min - 1))) {
            n9 = min - 1;
        }
        final int n10 = n8 + n4;
        if (n4 != n3) {
            charSequence = TextUtils.concat(new CharSequence[] { charSequence.subSequence(n7, n7 + n8), charSequence.subSequence(initialSelStart, n9 + initialSelStart) });
        }
        else {
            charSequence = charSequence.subSequence(n7, n10 + n9 + n7);
        }
        O(editorInfo, charSequence, n8, n10);
    }
    
    public static void O(final EditorInfo editorInfo, final CharSequence charSequence, final int n, final int n2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        Object o;
        if (charSequence != null) {
            o = new SpannableStringBuilder(charSequence);
        }
        else {
            o = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", (CharSequence)o);
        ((BaseBundle)editorInfo.extras).putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", n);
        ((BaseBundle)editorInfo.extras).putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", n2);
    }
    
    public static final long P(float max, final long n) {
        final float max2 = Math.max(0.0f, Float.intBitsToFloat((int)(n >> 32)) - max);
        max = Math.max(0.0f, Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) - max);
        return (long)Float.floatToRawIntBits(max2) << 32 | ((long)Float.floatToRawIntBits(max) & 0xFFFFFFFFL);
    }
    
    public static final jdc Q(final InputStream inputStream) {
        return new jdc(inputStream, (jzn)new Object());
    }
    
    public static final Object R(String s, yci yci, lta ex, final h07 h07) {
        Object o = null;
        Label_0049: {
            if (h07 instanceof sv7) {
                o = h07;
                final int e = ((sv7)o).E;
                if ((e & Integer.MIN_VALUE) != 0x0) {
                    ((sv7)o).E = e + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new h07(h07);
        }
        final Object d = ((sv7)o).D;
        final int e2 = ((sv7)o).E;
        final n89 v = n89.v;
        final TimeUnit days = TimeUnit.DAYS;
        final int n = 0;
        final int n2 = 0;
        int b = 0;
        final int n3 = 0;
        final pc7 v2 = pc7.v;
        while (true) {
            Label_0915: {
            Label_0767_Outer:
                while (true) {
                    while (true) {
                    Label_0598:
                        while (true) {
                            Label_0300: {
                                switch (e2) {
                                    default: {
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    case 7: {
                                        vt4.g0(d);
                                        return d;
                                    }
                                    case 5:
                                    case 6: {
                                        ex = (InterruptedException)((sv7)o).z;
                                        s = (String)((sv7)o).w;
                                        try {
                                            vt4.g0(d);
                                            s = (String)d;
                                            break Label_0300;
                                        }
                                        finally {
                                            break;
                                        }
                                    }
                                    case 4: {
                                        final int c = ((sv7)o).C;
                                        b = ((sv7)o).B;
                                        s = (String)((sv7)o).z;
                                        final String y = ((sv7)o).y;
                                        final String x = ((sv7)o).x;
                                        ex = (InterruptedException)((sv7)o).w;
                                        final lta lta = (lta)((sv7)o).v;
                                        vt4.g0(d);
                                        s = (String)d;
                                        s.getClass();
                                        try {
                                            ((sv7)o).v = null;
                                            ((sv7)o).w = (bco)ex;
                                            ((sv7)o).x = x;
                                            ((sv7)o).y = y;
                                            ((sv7)o).z = (tn9)s;
                                            ((sv7)o).B = b;
                                            ((sv7)o).C = c;
                                            ((sv7)o).E = 6;
                                            final Object b2 = lta.b(o);
                                            if (b2 == v2) {
                                                return v2;
                                            }
                                            ex = (InterruptedException)s;
                                            s = (String)b2;
                                            ex.getClass();
                                            if (v instanceof AutoCloseable) {
                                                ex = (InterruptedException)s;
                                                return ex;
                                            }
                                            if (!(v instanceof ExecutorService)) {
                                                fvd.w();
                                                return null;
                                            }
                                            yci = (yci)v;
                                            if (yci == ForkJoinPool.commonPool()) {
                                                ex = (InterruptedException)s;
                                                return ex;
                                            }
                                            int n4 = ((ExecutorService)yci).isTerminated() ? 1 : 0;
                                            ex = (InterruptedException)s;
                                            if (n4 != 0) {
                                                return ex;
                                            }
                                            ((ExecutorService)yci).shutdown();
                                            b = n3;
                                            while (true) {
                                                final int n5 = n4;
                                                if (n5 != 0) {
                                                    break;
                                                }
                                                try {
                                                    n4 = (((ExecutorService)yci).awaitTermination(1L, days) ? 1 : 0);
                                                }
                                                catch (final InterruptedException ex) {
                                                    n4 = n5;
                                                    if (b != 0) {
                                                        continue Label_0767_Outer;
                                                    }
                                                    ((ExecutorService)yci).shutdownNow();
                                                    b = 1;
                                                    n4 = n5;
                                                }
                                            }
                                            ex = (InterruptedException)s;
                                            if (b != 0) {
                                                Thread.currentThread().interrupt();
                                                ex = (InterruptedException)s;
                                                return ex;
                                            }
                                            return ex;
                                        }
                                        finally {
                                            final Object o2 = ex;
                                            ex = (InterruptedException)s;
                                            s = (String)o2;
                                        }
                                        break;
                                    }
                                    case 3: {
                                        s = (String)((sv7)o).A;
                                        final f07 f07 = (f07)((sv7)o).z;
                                        break Label_0598;
                                    }
                                    case 2: {
                                        s = (String)((sv7)o).A;
                                        final hc7 hc7 = (hc7)((sv7)o).z;
                                        break Label_0598;
                                    }
                                    case 1: {
                                        final int c2 = ((sv7)o).C;
                                        final int b3 = ((sv7)o).B;
                                        s = (String)((sv7)o).A;
                                        s = (String)((sv7)o).z;
                                        final String y2 = ((sv7)o).y;
                                        final String x2 = ((sv7)o).x;
                                        ex = (InterruptedException)((sv7)o).w;
                                        final lta lta2 = (lta)((sv7)o).v;
                                        vt4.g0(d);
                                        s = (String)d;
                                        s.getClass();
                                        try {
                                            ((sv7)o).v = null;
                                            ((sv7)o).w = (bco)ex;
                                            ((sv7)o).x = x2;
                                            ((sv7)o).y = y2;
                                            ((sv7)o).z = null;
                                            ((sv7)o).A = (tn9)s;
                                            ((sv7)o).B = b3;
                                            ((sv7)o).C = c2;
                                            ((sv7)o).E = 3;
                                            yci = (yci)lta2.b(o);
                                            if (yci == v2) {
                                                return v2;
                                            }
                                            s.getClass();
                                            if (v instanceof AutoCloseable) {
                                                ex = (InterruptedException)yci;
                                            }
                                            else {
                                                if (!(v instanceof ExecutorService)) {
                                                    fvd.w();
                                                    return null;
                                                }
                                                s = (String)v;
                                                if (s == ForkJoinPool.commonPool()) {
                                                    ex = (InterruptedException)yci;
                                                }
                                                else {
                                                    int n6 = ((ExecutorService)s).isTerminated() ? 1 : 0;
                                                    ex = (InterruptedException)yci;
                                                    if (n6 == 0) {
                                                        ((ExecutorService)s).shutdown();
                                                        b = n2;
                                                        while (true) {
                                                            final int n7 = n6;
                                                            if (n7 != 0) {
                                                                break;
                                                            }
                                                            try {
                                                                n6 = (((ExecutorService)s).awaitTermination(1L, days) ? 1 : 0);
                                                            }
                                                            catch (final InterruptedException ex) {
                                                                n6 = n7;
                                                                if (b != 0) {
                                                                    continue Label_0767_Outer;
                                                                }
                                                                ((ExecutorService)s).shutdownNow();
                                                                b = 1;
                                                                n6 = n7;
                                                            }
                                                        }
                                                        ex = (InterruptedException)yci;
                                                        if (b != 0) {
                                                            Thread.currentThread().interrupt();
                                                            ex = (InterruptedException)yci;
                                                        }
                                                    }
                                                }
                                            }
                                            return ex;
                                        }
                                        finally {
                                            final Object o3 = ex;
                                            final InterruptedException ex2;
                                            ex = ex2;
                                            yci = (yci)o3;
                                        }
                                        break Label_0767_Outer;
                                    }
                                    case 0: {
                                        vt4.g0(d);
                                        ((sv7)o).v = null;
                                        ((sv7)o).E = 7;
                                        final Object b4 = ((lta)ex).b(o);
                                        if (b4 == v2) {
                                            return v2;
                                        }
                                        return b4;
                                    }
                                }
                            }
                            try {
                                final Throwable t;
                                j1r.h((bco)s, t);
                                throw null;
                            }
                            finally {
                                ex.getClass();
                                if (!(v instanceof AutoCloseable)) {
                                    if (!(v instanceof ExecutorService)) {
                                        fvd.w();
                                        return null;
                                    }
                                    yci = (yci)v;
                                    if (yci != ForkJoinPool.commonPool()) {
                                        int n8 = ((ExecutorService)yci).isTerminated() ? 1 : 0;
                                        if (n8 == 0) {
                                            ((ExecutorService)yci).shutdown();
                                            int n9 = n;
                                            while (true) {
                                                final int n10 = n8;
                                                if (n10 != 0) {
                                                    break;
                                                }
                                                try {
                                                    n8 = (((ExecutorService)yci).awaitTermination(1L, days) ? 1 : 0);
                                                }
                                                catch (final InterruptedException ex3) {
                                                    n8 = n10;
                                                    if (n9 != 0) {
                                                        continue Label_0767_Outer;
                                                    }
                                                    ((ExecutorService)yci).shutdownNow();
                                                    n9 = 1;
                                                    n8 = n10;
                                                }
                                            }
                                            if (n9 != 0) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                }
                            }
                            continue Label_0767_Outer;
                        }
                        yci = (yci)((sv7)o).w;
                        try {
                            vt4.g0(d);
                            yci = (yci)d;
                            continue;
                        }
                        finally {
                            break Label_0915;
                        }
                        break;
                    }
                    continue Label_0767_Outer;
                }
                try {
                    j1r.h((bco)yci, (Throwable)ex);
                    throw null;
                }
                finally {
                    s.getClass();
                    if (!(v instanceof AutoCloseable)) {
                        if (!(v instanceof ExecutorService)) {
                            fvd.w();
                            return null;
                        }
                        ex = (InterruptedException)v;
                        if (ex != ForkJoinPool.commonPool()) {
                            int n11 = ((ExecutorService)ex).isTerminated() ? 1 : 0;
                            if (n11 == 0) {
                                ((ExecutorService)ex).shutdown();
                                while (true) {
                                    final int n12 = n11;
                                    if (n12 != 0) {
                                        break;
                                    }
                                    try {
                                        n11 = (((ExecutorService)ex).awaitTermination(1L, days) ? 1 : 0);
                                    }
                                    catch (final InterruptedException ex4) {
                                        n11 = n12;
                                        if (b != 0) {
                                            continue;
                                        }
                                        ((ExecutorService)ex).shutdownNow();
                                        b = 1;
                                        n11 = n12;
                                    }
                                }
                                if (b != 0) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                }
            }
            continue;
        }
    }
    
    public static final Boolean S(final int n, final z36 z36, final gna gna, final k2j k2j) {
        final int ordinal = ((Enum)gna.t1()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        en9.r();
                        return null;
                    }
                    if (gna.q1().a) {
                        return (Boolean)z36.b((Object)gna);
                    }
                    if (k2j == null) {
                        return v(gna, n, (lta)z36);
                    }
                    return M(n, z36, gna, k2j);
                }
            }
            else {
                final gna j = elq.j(gna);
                if (j != null) {
                    final int ordinal2 = ((Enum)j.t1()).ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    en9.r();
                                    return null;
                                }
                                en9.q("ActiveParent must have a focusedChild");
                                return null;
                            }
                        }
                        else {
                            final Boolean s = S(n, z36, j, k2j);
                            if (!mlc.q(s, Boolean.FALSE)) {
                                return s;
                            }
                            k2j g;
                            if ((g = k2j) == null) {
                                if (j.t1() != bna.w) {
                                    en9.q("Searching for active node in inactive hierarchy");
                                    return null;
                                }
                                final gna f = elq.f(j);
                                if (f == null) {
                                    en9.q("ActiveParent must have a focusedChild");
                                    return null;
                                }
                                g = elq.g(f);
                            }
                            return z(n, z36, gna, g);
                        }
                    }
                    k2j g2;
                    if ((g2 = k2j) == null) {
                        g2 = elq.g(j);
                    }
                    return z(n, z36, gna, g2);
                }
                en9.q("ActiveParent must have a focusedChild");
                return null;
            }
        }
        return v(gna, n, (lta)z36);
    }
    
    public static final Object T(hc7 x, Object v, Object c, final zta zta, final f07 f07) {
        ef3 ef4 = null;
        Label_0060: {
            if (f07 instanceof ef3) {
                final ef3 ef3 = (ef3)f07;
                final int z = ef3.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ef3.z = z + Integer.MIN_VALUE;
                    ef4 = ef3;
                    break Label_0060;
                }
            }
            ef4 = new ef3(f07);
        }
        final Object y = ef4.y;
        final int z2 = ef4.z;
        Object o = null;
        Throwable t = null;
        Label_0287: {
            if (z2 != 0) {
                if (z2 == 1) {
                    x = (hc7)ef4.x;
                    v = ef4.w;
                    try {
                        vt4.g0(y);
                    }
                    finally {
                        o = v;
                        final Throwable t2;
                        t = t2;
                        c = x;
                        break Label_0287;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(y);
            c = asn.c(x, c);
            try {
                ef4.v = v;
                ef4.w = x;
                ef4.x = c;
                ef4.z = 1;
                final zlm zlm = new zlm(ef4, x);
                if (zta == null) {
                    final hc7 context = zlm.getContext();
                    Object o2;
                    if (context == o89.v) {
                        o2 = new plc((f07)zlm);
                    }
                    else {
                        o2 = new qlc((f07)zlm, context);
                    }
                    omo.v(2, zta);
                    v = zta.d(v, o2);
                }
                else {
                    omo.v(2, zta);
                    v = zta.d(v, zlm);
                }
                final pc7 v2 = pc7.v;
                o = v;
                if (v == v2) {
                    return v2;
                }
                asn.a(x, c);
                return o;
            }
            finally {
                o = x;
            }
        }
        asn.a((hc7)o, c);
        throw t;
    }
    
    public static final Object U(final aof aof, final lta lta, final h07 h07) {
        final w3j w3j = new w3j(aof);
        if (h07.getContext().M0((gc7)w3j) != null) {
            return lta.b(h07);
        }
        return rhc.f0((hc7)new v3j(w3j), new l10(aof, lta, null, (byte)8), h07);
    }
    
    public static id0 a(final float n) {
        return new id0(n, yi2.e, 0.01f, 8);
    }
    
    public static final v50 b(final String s) {
        return new v50(rml.K(s));
    }
    
    public static final JsonEncodingException c(final SerialDescriptor serialDescriptor) {
        final StringBuilder sb = new StringBuilder("Value of type '");
        sb.append(serialDescriptor.a());
        sb.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        sb.append((Object)serialDescriptor.b());
        sb.append('\'');
        final String string = sb.toString();
        serialDescriptor.a();
        return new JsonEncodingException(string, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
    
    public static final void d(final nun nun, final ye6 ye6, final gva gva, final int n) {
        gva.i0(280292553);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)nun);
            }
            else {
                b = gva.h((Object)nun);
            }
            int n2;
            if (b) {
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
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)ye6)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            c5q.c(gqg.a.a((Object)g6k.a), (zta)uuj.t0(-13090807, (aua)new txf((Object)nun, (Object)ye6, (byte)5), gva), gva, 48);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6((Object)nun, ye6, n, (byte)10);
        }
    }
    
    public static final void e(final xom xom, final igf igf, int n, boolean b, final gva gva, final int n2, final int n3) {
        gva.i0(-1477068540);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            int n4;
            if (gva.f((Object)xom)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n2);
        }
        else {
            n5 = n2;
        }
        int n6 = n5;
        if ((n2 & 0x30) == 0x0) {
            int n7;
            if (gva.f((Object)igf)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n2 & 0x180) == 0x0) {
            int n9;
            if ((n3 & 0x4) == 0x0 && gva.d(n)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n6 | n9);
        }
        final int n10 = n3 & 0x8;
        int n13 = 0;
        Label_0206: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0xC00);
            }
            else {
                n11 = n8;
                if ((n2 & 0xC00) == 0x0) {
                    int n12;
                    if (gva.g(b)) {
                        n12 = 2048;
                    }
                    else {
                        n12 = 1024;
                    }
                    n13 = (n8 | n12);
                    break Label_0206;
                }
            }
            n13 = n11;
        }
        final boolean b2 = false;
        if (gva.W(n13 & 0x1, (n13 & 0x493) != 0x492)) {
            gva.b0();
            int n15 = 0;
            Label_0344: {
                int n14;
                if ((n2 & 0x1) != 0x0 && !gva.C()) {
                    gva.Z();
                    n14 = n13;
                    if ((n3 & 0x4) != 0x0) {
                        n14 = (n13 & 0xFFFFFC7F);
                    }
                    n15 = n;
                }
                else {
                    int n16;
                    if ((n3 & 0x4) != 0x0) {
                        n = (n13 & 0xFFFFFC7F);
                        n16 = 5;
                    }
                    else {
                        n16 = n;
                        n = n13;
                    }
                    n14 = n;
                    n15 = n16;
                    if (n10 != 0) {
                        b = true;
                        n15 = n16;
                        break Label_0344;
                    }
                }
                n = n14;
            }
            gva.r();
            final boolean b3 = (n & 0xE) == 0x4;
            final Object r = gva.R();
            Object q;
            if (b3 || (q = r) == bi6.a) {
                q = o50.Q("");
                gva.q0(q);
            }
            final bnf bnf = (bnf)q;
            final String value = (String)xom.getValue();
            if (value != null) {
                bnf.setValue((Object)value);
            }
            boolean b4 = b2;
            if (xom.getValue() != null) {
                b4 = true;
            }
            ljq.h(b4, igf, pc9.g(null, 3).a(pc9.f(null, null, 15)), pc9.h(null, 3).a(pc9.n(null, null, 15)), null, (bua)uuj.t0(1699339228, (aua)new gem(n15, b, bnf), gva), gva, (n & 0x70) | 0x30D80, 16);
            n = n15;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new hem(xom, igf, n, b, n2, n3);
        }
    }
    
    public static final void f(final int n, final int n2, final gva gva, igf igf, final String s, final boolean b) {
        gva.i0(-244555206);
        int n3;
        if (gva.f((Object)s)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.d(n)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.g(b)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        final int n6 = n2 | n3 | 0x30 | n4 | n5;
        if (gva.W(n6 & 0x1, (n6 & 0x493) != 0x492)) {
            gva.b0();
            final Object v = fgf.v;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                igf = (igf)v;
            }
            gva.r();
            final cy4 a = qy4.a;
            final mnn a2 = mnn.a((mnn)((uy4)qy4.c(gva).k.v).B, 0L, 0L, (zoa)null, new soa(1), (una)null, 0L, (wgn)null, 0, 0L, (idd)null, 0, 16777207);
            final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
            final long b2 = a2.a.b;
            final float c = vnn.c(a2.b.c);
            tsf.s(b2);
            final float i = xc8.I(tsf.Q(vnn.c(b2) * c, b2 & 0xFF00000000L));
            float n7;
            if (b) {
                n7 = i;
            }
            else {
                n7 = 0.0f;
            }
            final float n8 = 2.0f * i + i + n7;
            final float n9 = i / n8;
            final mb2 d = wab.D;
            final igf f = b.f(b.d(igf, 1.0f), n8);
            final Object r = gva.R();
            final cib a3 = bi6.a;
            Object o = r;
            if (r == a3) {
                o = new krl((byte)23);
                gva.q0(o);
            }
            final igf f2 = zrn.F(f, (lta)o);
            final boolean b3 = (n6 & 0x1C00) == 0x800;
            final boolean c2 = gva.c(n9);
            final Object r2 = gva.R();
            Object o2;
            if ((b3 | c2) || (o2 = r2) == a3) {
                o2 = new qvd(b, n9);
                gva.q0(o2);
            }
            final igf f3 = t08.F(f2, (lta)o2);
            final moe c3 = rj2.c((gx)d, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b4 = ien.B(gva, f3);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c3);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b4);
            lmn.b(s, omo.Y(b.x(b.d((igf)v, 1.0f), wab.I, true), 0.0f, i, 0.0f, n7, 5), qy4.a(gva).P, 0L, (zoa)null, (una)null, 0L, (wgn)null, new kfn(n), 0L, 0, false, 0, 0, (lta)null, a2, gva, n6 & 0xE, n6 >> 6 & 0xE, 130040);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new tj4(s, igf, n, b, n2);
        }
    }
    
    public static final og0 g(int i, Object[] array, final gva gva) {
        final String t = soh.T(i, Arrays.copyOf(array, array.length), gva);
        final j86 j86 = (j86)gva.j((sei)dx6.a);
        final long a = j86.a;
        final hdk hdk = new hdk(3);
        hdk.a(t);
        hdk.a(j86);
        hdk.c(array);
        final ArrayList list = (ArrayList)hdk.v;
        array = list.toArray(new Object[list.size()]);
        boolean d = gva.d(array.length);
        int length;
        for (length = array.length, i = 0; i < length; ++i) {
            d |= gva.f(array[i]);
        }
        final Object r = gva.R();
        og0 h;
        if (d || (h = (og0)r) == bi6.a) {
            h = h(a, t);
            gva.q0((Object)h);
        }
        return h;
    }
    
    public static final og0 h(final long n, final String s) {
        final n9k z = og0.z;
        return ncq.y(s, new vmn(new hcm(n, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, wgn.c, (rpl)null, 61438), (hcm)null, 14), 4);
    }
    
    public static final List i(final def def, int i, int j, final ArrayList list, final ilf ilf, final int n, final int n2, final int n3, final boolean b, final lta lta) {
        if (def != null && !list.isEmpty()) {
            final int b2 = ilf.b;
            if (b2 != 0) {
                ilf ilf2;
                if (j - i >= 0 && b2 != 0) {
                    final xgc t = ncq.T(0, b2);
                    int v = ((vgc)t).v;
                    final int w = ((vgc)t).w;
                    final int n4 = j = -1;
                    if (v <= w) {
                        j = n4;
                        while (ilf.c(v) <= i) {
                            final int n5 = j = ilf.c(v);
                            if (v == w) {
                                break;
                            }
                            ++v;
                            j = n5;
                        }
                    }
                    if (j == -1) {
                        ilf2 = qgc.a;
                    }
                    else {
                        final ilf a = qgc.a;
                        ilf2 = new ilf(1);
                        ilf2.a(j);
                    }
                }
                else {
                    ilf2 = qgc.a;
                }
                final ArrayList list2 = new ArrayList();
                final ArrayList list3 = new ArrayList(list.size());
                int size;
                Object value;
                int index;
                int[] a2;
                int b3;
                for (size = list.size(), i = 0; i < size; ++i) {
                    value = list.get(i);
                    index = ((g4d)value).getIndex();
                    a2 = ilf.a;
                    for (b3 = ilf.b, j = 0; j < b3; ++j) {
                        if (a2[j] == index) {
                            list3.add(value);
                            break;
                        }
                    }
                }
                final int[] a3 = ilf2.a;
                final int b4 = ilf2.b;
                j = 0;
            Label_0271:
                while (j < b4) {
                    final int n6 = a3[j];
                    final Iterator iterator = list.iterator();
                    i = 0;
                    while (true) {
                        while (iterator.hasNext()) {
                            if (((g4d)iterator.next()).getIndex() == n6) {
                                g4d g4d;
                                if (i == -1) {
                                    g4d = (g4d)lta.b(n6);
                                }
                                else {
                                    g4d = (g4d)list.remove(i);
                                }
                                final int s = mlc.S(g4d, b);
                                if (i == -1) {
                                    i = Integer.MIN_VALUE;
                                }
                                else {
                                    final long k = g4d.k(0);
                                    long n7;
                                    if (b) {
                                        n7 = (k & 0xFFFFFFFFL);
                                    }
                                    else {
                                        n7 = k >> 32;
                                    }
                                    i = (int)n7;
                                }
                                while (true) {
                                    for (int size2 = list3.size(), l = 0; l < size2; ++l) {
                                        final Object value2 = list3.get(l);
                                        if (((g4d)value2).getIndex() != n6) {
                                            final g4d g4d2 = (g4d)value2;
                                            int n9;
                                            if (g4d2 != null) {
                                                final long m = g4d2.k(0);
                                                long n8;
                                                if (b) {
                                                    n8 = (m & 0xFFFFFFFFL);
                                                }
                                                else {
                                                    n8 = m >> 32;
                                                }
                                                n9 = (int)n8;
                                            }
                                            else {
                                                n9 = Integer.MIN_VALUE;
                                            }
                                            if (i == Integer.MIN_VALUE) {
                                                i = -n;
                                            }
                                            else {
                                                i = Math.max(-n, i);
                                            }
                                            int min = i;
                                            if (n9 != Integer.MIN_VALUE) {
                                                min = Math.min(i, n9 - s);
                                            }
                                            g4d.n();
                                            g4d.e(min, 0, n2, n3);
                                            list2.add((Object)g4d);
                                            ++j;
                                            continue Label_0271;
                                        }
                                    }
                                    final Object value2 = null;
                                    continue;
                                }
                            }
                            ++i;
                        }
                        i = -1;
                        continue;
                    }
                }
                return (List)list2;
            }
        }
        return (List)r89.v;
    }
    
    public static final boolean j(final k2j k2j, final k2j k2j2, final k2j k2j3, final int n) {
        final boolean k = k(n, k2j3, k2j);
        final float b = k2j3.b;
        final float d = k2j3.d;
        final float a = k2j3.a;
        final float c = k2j3.c;
        final float d2 = k2j.d;
        final float b2 = k2j.b;
        final float c2 = k2j.c;
        final float a2 = k2j.a;
        if (!k) {
            if (k(n, k2j2, k2j)) {
                if (n == 3) {
                    if (a2 < c) {
                        return true;
                    }
                }
                else if (n == 4) {
                    if (c2 > a) {
                        return true;
                    }
                }
                else if (n == 5) {
                    if (b2 < d) {
                        return true;
                    }
                }
                else {
                    if (n != 6) {
                        en9.q("This function should only be used for 2-D focus search");
                        return false;
                    }
                    if (d2 > b) {
                        return true;
                    }
                }
                if (n != 3) {
                    if (n != 4) {
                        float n2;
                        if (n == 3) {
                            n2 = a2 - k2j2.c;
                        }
                        else if (n == 4) {
                            n2 = k2j2.a - c2;
                        }
                        else if (n == 5) {
                            n2 = b2 - k2j2.d;
                        }
                        else {
                            if (n != 6) {
                                en9.q("This function should only be used for 2-D focus search");
                                return false;
                            }
                            n2 = k2j2.b - d2;
                        }
                        float n3 = n2;
                        if (n2 < 0.0f) {
                            n3 = 0.0f;
                        }
                        float n4;
                        if (n == 3) {
                            n4 = a2 - a;
                        }
                        else if (n == 4) {
                            n4 = c - c2;
                        }
                        else if (n == 5) {
                            n4 = b2 - b;
                        }
                        else {
                            if (n != 6) {
                                en9.q("This function should only be used for 2-D focus search");
                                return false;
                            }
                            n4 = d - d2;
                        }
                        float n5 = n4;
                        if (n4 < 1.0f) {
                            n5 = 1.0f;
                        }
                        return n3 < n5;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public static final boolean k(final int n, final k2j k2j, final k2j k2j2) {
        if (n != 3) {
            if (n != 4) {
                if (n != 5) {
                    if (n != 6) {
                        en9.q("This function should only be used for 2-D focus search");
                        return false;
                    }
                }
                return k2j.c > k2j2.a && k2j.a < k2j2.c;
            }
        }
        return k2j.d > k2j2.b && k2j.b < k2j2.d;
    }
    
    public static final igf l(final igf igf, final float n, final long n2, final aql aql) {
        return m(igf, n, new cam(n2), aql);
    }
    
    public static final igf m(final igf igf, final float n, final cam cam, final aql aql) {
        return igf.E(new ai2(n, cam, aql));
    }
    
    public static long n(final boolean b, final int n, final int n2, long n3, final long n4, final int n5, final boolean b2, long n6, final long n7, final long n8, final long n9) {
        if (n9 != Long.MAX_VALUE && b2) {
            if (n5 != 0) {
                n3 = n4 + 900000L;
                if (n9 < n3) {
                    return n3;
                }
            }
            return n9;
        }
        if (b) {
            if (n2 == 2) {
                n3 *= n;
            }
            else {
                n3 = (long)Math.scalb((float)n3, n - 1);
            }
            n6 = n3;
            if (n3 > 18000000L) {
                n6 = 18000000L;
            }
            return n4 + n6;
        }
        if (b2) {
            if (n5 == 0) {
                n3 = n4 + n6;
            }
            else {
                n3 = n4 + n8;
            }
            if (n7 != n8 && n5 == 0) {
                return n8 - n7 + n3;
            }
            return n3;
        }
        else {
            if (n4 == -1L) {
                return Long.MAX_VALUE;
            }
            return n4 + n6;
        }
    }
    
    public static final void o(final View view) {
        final Iterator iterator = rcr.g(view).iterator();
        while (true) {
            final vyk vyk = (vyk)iterator;
            if (!vyk.hasNext()) {
                break;
            }
            final ArrayList a = C((View)vyk.next()).a;
            for (int p = lq6.P((List)a); -1 < p; --p) {
                ((hap)a.get(p)).a.e();
            }
        }
    }
    
    public static final Serializable p(final ija ija, jja v, h07 o) {
        Label_0052: {
            if (o instanceof yja) {
                final yja yja = (yja)o;
                final int x = yja.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    yja.x = x + Integer.MIN_VALUE;
                    o = yja;
                    break Label_0052;
                }
            }
            o = new h07((f07)o);
        }
        final Object w = ((yja)o).w;
        final int x2 = ((yja)o).x;
        Label_0155: {
            if (x2 != 0) {
                if (x2 == 1) {
                    v = (jja)((yja)o).v;
                    try {
                        vt4.g0(w);
                        return null;
                    }
                    finally {
                        break Label_0155;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            final b4j e = hia.e(w);
            try {
                final hb4 hb4 = new hb4((Object)v, (Object)e, (byte)3);
                ((yja)o).v = e;
                ((yja)o).x = 1;
                final Object a = ija.a((jja)hb4, (f07)o);
                final pc7 v2 = pc7.v;
                if (a == v2) {
                    return (Serializable)v2;
                }
                return null;
            }
            finally {
                v = (jja)e;
            }
        }
        final Throwable t = (Throwable)((b4j)v).v;
        final Throwable t2;
        if (t == null || !t.equals(t2)) {
            final opc opc = (opc)((f07)o).getContext().M0((gc7)o55.z);
            if (opc != null) {
                if (opc.isCancelled()) {
                    final CancellationException t3 = opc.T();
                    if (t3 != null) {
                        if (t3.equals(t2)) {
                            throw t2;
                        }
                    }
                }
            }
            if (t == null) {
                return (Serializable)t2;
            }
            if (t2 instanceof CancellationException) {
                soh.j(t, t2);
                throw t;
            }
            soh.j(t2, t);
            throw t2;
        }
        throw t2;
    }
    
    public static final int q(final float n) {
        return Math.round((float)Math.ceil((double)n));
    }
    
    public static final void r(final Closeable closeable, final Throwable t) {
        if (closeable != null) {
            if (t == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            }
            finally {
                final Throwable t2;
                soh.j(t, t2);
            }
        }
    }
    
    public static final void s(final gna gna, final inf inf) {
        if (!((hgf)gna).v.I) {
            gac.c("visitChildren called on an unattached node");
        }
        final inf inf2 = new inf(0, (Object[])new hgf[16]);
        final hgf v = ((hgf)gna).v;
        final hgf a = v.A;
        if (a == null) {
            soh.i(inf2, v);
        }
        else {
            inf2.b((Object)a);
        }
        while (true) {
            final int x = inf2.x;
            if (x == 0) {
                break;
            }
            hgf hgf2;
            final hgf hgf = hgf2 = (hgf)inf2.l(x - 1);
            if ((hgf.y & 0x400) == 0x0) {
                soh.i(inf2, hgf);
            }
            else {
                while (hgf2 != null) {
                    if ((hgf2.x & 0x400) != 0x0) {
                        inf inf3 = null;
                        while (hgf2 != null) {
                            inf inf4;
                            if (hgf2 instanceof gna) {
                                final gna gna2 = (gna)hgf2;
                                inf4 = inf3;
                                if (((hgf)gna2).I) {
                                    if (soh.L((t98)gna2).j0) {
                                        inf4 = inf3;
                                    }
                                    else if (gna2.q1().a) {
                                        inf.b((Object)gna2);
                                        inf4 = inf3;
                                    }
                                    else {
                                        s(gna2, inf);
                                        inf4 = inf3;
                                    }
                                }
                            }
                            else {
                                inf4 = inf3;
                                if ((hgf2.x & 0x400) != 0x0) {
                                    inf4 = inf3;
                                    if (hgf2 instanceof v98) {
                                        hgf hgf3 = ((v98)hgf2).K;
                                        int n = 0;
                                        while (hgf3 != null) {
                                            inf inf5 = inf3;
                                            int n2 = n;
                                            hgf hgf4 = hgf2;
                                            if ((hgf3.x & 0x400) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    hgf4 = hgf3;
                                                    inf5 = inf3;
                                                }
                                                else {
                                                    if ((inf5 = inf3) == null) {
                                                        inf5 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    if ((hgf4 = hgf2) != null) {
                                                        inf5.b((Object)hgf2);
                                                        hgf4 = null;
                                                    }
                                                    inf5.b((Object)hgf3);
                                                }
                                            }
                                            hgf3 = hgf3.A;
                                            inf3 = inf5;
                                            n = n2;
                                            hgf2 = hgf4;
                                        }
                                        inf4 = inf3;
                                        if (n == 1) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            hgf2 = soh.G(inf4);
                            inf3 = inf4;
                        }
                        break;
                    }
                    hgf2 = hgf2.A;
                }
            }
        }
    }
    
    public static final igf t(final igf igf, final xom xom, final gva gva, int n) {
        if ((((n & 0x70) ^ 0x30) > 32 && gva.f((Object)xom)) || (n & 0x30) == 0x20) {
            n = 1;
        }
        else {
            n = 0;
        }
        final Object r = gva.R();
        final cib a = bi6.a;
        sd8 b;
        if (n != 0 || (b = (sd8)r) == a) {
            b = r8m.b((jta)new iem(xom, (byte)0));
            gva.q0((Object)b);
        }
        float n2;
        if (((xom)b).getValue()) {
            n2 = 1.0f;
        }
        else {
            n2 = 0.0f;
        }
        final xom b2 = md0.b(n2, null, "dictation-caption-scrim", gva, 3072, 22);
        final cy4 a2 = qy4.a;
        final long q = qy4.a(gva).q;
        final qs8 qs8 = new qs8(32.0f);
        final boolean f = gva.f((Object)b2);
        final Object r2 = gva.R();
        Object o;
        if (f || (o = r2) == a) {
            o = new iem(b2, (byte)1);
            gva.q0(o);
        }
        return ien.l(igf, (bua)new i5a(q, qs8, (jta)o, true));
    }
    
    public static final gna u(final inf inf, final k2j k2j, final int n) {
        final gna gna = null;
        k2j k2j2;
        if (n == 3) {
            k2j2 = k2j.l(k2j.c - k2j.a + 1.0f, 0.0f);
        }
        else if (n == 4) {
            k2j2 = k2j.l(-(k2j.c - k2j.a + 1.0f), 0.0f);
        }
        else if (n == 5) {
            k2j2 = k2j.l(0.0f, k2j.d - k2j.b + 1.0f);
        }
        else {
            if (n != 6) {
                en9.q("This function should only be used for 2-D focus search");
                return null;
            }
            k2j2 = k2j.l(0.0f, -(k2j.d - k2j.b + 1.0f));
        }
        final Object[] v = inf.v;
        final int x = inf.x;
        int i = 0;
        gna gna2 = gna;
        k2j k2j3 = k2j2;
        while (i < x) {
            final gna gna3 = (gna)v[i];
            k2j k2j4 = k2j3;
            gna gna4 = gna2;
            if (elq.l(gna3)) {
                final k2j g = elq.g(gna3);
                k2j4 = k2j3;
                gna4 = gna2;
                if (G(g, k2j3, k2j, n)) {
                    gna4 = gna3;
                    k2j4 = g;
                }
            }
            ++i;
            k2j3 = k2j4;
            gna2 = gna4;
        }
        return gna2;
    }
    
    public static final boolean v(gna u, final int n, final lta lta) {
        final inf inf = new inf(0, (Object[])new gna[16]);
        s(u, inf);
        final int x = inf.x;
        if (x <= 1) {
            Object o;
            if (x == 0) {
                o = null;
            }
            else {
                o = inf.v[0];
            }
            u = (gna)o;
            if (u != null) {
                return (boolean)lta.b(u);
            }
        }
        else {
            int n2;
            if ((n2 = n) == 7) {
                n2 = 4;
            }
            k2j k2j = null;
            Label_0181: {
                if (n2 != 4) {
                    if (n2 != 6) {
                        if (n2 != 3) {
                            if (n2 != 5) {
                                en9.q("This function should only be used for 2-D focus search");
                                return false;
                            }
                        }
                        final k2j g = elq.g(u);
                        final float c = g.c;
                        final float d = g.d;
                        k2j = new k2j(c, d, c, d);
                        break Label_0181;
                    }
                }
                final k2j g2 = elq.g(u);
                final float a = g2.a;
                final float b = g2.b;
                k2j = new k2j(a, b, a, b);
            }
            u = u(inf, k2j, n2);
            if (u != null) {
                return (boolean)lta.b(u);
            }
        }
        return false;
    }
    
    public static final String w(final int n, final String s, final String s2, final String s3, final String s4) {
        final StringBuilder sb = new StringBuilder();
        if (n >= 0) {
            final StringBuilder sb2 = new StringBuilder("Unexpected JSON token at offset ");
            sb2.append(n);
            sb2.append(": ");
            sb.append(sb2.toString());
        }
        sb.append(s);
        if (s2 != null) {
            if (!kym.Y0((CharSequence)s2)) {
                sb.append(" at path: ");
                sb.append(s2);
            }
        }
        if (s3 != null) {
            if (!kym.Y0((CharSequence)s3)) {
                sb.append("\n".concat(s3));
            }
        }
        if (s4 != null) {
            sb.append("\nJSON input: ");
            sb.append(s4);
        }
        return sb.toString();
    }
    
    public static tb x(final zrc zrc) {
        Label_0169: {
            Label_0160: {
                Label_0151: {
                    bc k = null;
                    Label_0051: {
                        try {
                            final irc o = zrc.o("plan");
                            if (o != null) {
                                final String i = o.i();
                                if (i != null) {
                                    k = e6r.k(i);
                                    break Label_0051;
                                }
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0151;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0160;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0169;
                        }
                        k = null;
                    }
                    final irc o2 = zrc.o("session_precondition");
                    final int n = 0;
                    final int n2 = 0;
                    int n3 = n;
                    if (o2 != null) {
                        final String j = o2.i();
                        n3 = n;
                        if (j != null) {
                            final int[] f = ge9.F(7);
                            for (int length = f.length, l = n2; l < length; ++l) {
                                final int n4 = f[l];
                                if (ge9.i(n4).equals(j)) {
                                    n3 = n4;
                                    return new tb(k, n3);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    return new tb(k, n3);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type DdSession", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type DdSession", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type DdSession", (Throwable)ex3);
        return null;
    }
    
    public static rap y(final zrc zrc) {
        Label_0330: {
            Label_0321: {
                Label_0312: {
                    int n = 0;
                    int n3 = 0;
                    Object o2 = null;
                Label_0219:
                    while (true) {
                    Label_0216:
                        while (true) {
                            int n2 = 0;
                            Label_0293: {
                                while (true) {
                                    int n4;
                                    try {
                                        final String i = zrc.o("status").i();
                                        i.getClass();
                                        final int[] f = ge9.F(3);
                                        final int length = f.length;
                                        n = 0;
                                        n2 = 0;
                                        if (n2 >= length) {
                                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                                        }
                                        n3 = f[n2];
                                        if (!smk.c(n3).equals(i)) {
                                            break Label_0293;
                                        }
                                        final irc o = zrc.o("interfaces");
                                        if (o == null) {
                                            break Label_0216;
                                        }
                                        final ArrayList v = o.d().v;
                                        final ArrayList list = new ArrayList(v.size());
                                        final Iterator iterator = v.iterator();
                                        while (true) {
                                            o2 = list;
                                            if (!iterator.hasNext()) {
                                                break Label_0219;
                                            }
                                            final String j = ((irc)iterator.next()).i();
                                            j.getClass();
                                            final mbp[] values = mbp.values();
                                            final int length2 = values.length;
                                            n4 = 0;
                                            if (n4 >= length2) {
                                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                                            }
                                            final mbp mbp = values[n4];
                                            if (!mbp.v.equals(j)) {
                                                break;
                                            }
                                            list.add((Object)mbp);
                                        }
                                    }
                                    catch (final NullPointerException ex) {
                                        break Label_0312;
                                    }
                                    catch (final NumberFormatException ex2) {
                                        break Label_0321;
                                    }
                                    catch (final IllegalStateException ex3) {
                                        break Label_0330;
                                    }
                                    ++n4;
                                    continue;
                                }
                            }
                            ++n2;
                            continue;
                        }
                        o2 = null;
                        break;
                    }
                    final irc o3 = zrc.o("effective_type");
                    int c = n;
                    if (o3 != null) {
                        final String k = o3.i();
                        c = n;
                        if (k != null) {
                            c = jbr.c(k);
                        }
                    }
                    final irc o4 = zrc.o("cellular");
                    oap d;
                    if (o4 != null) {
                        d = bbr.d(o4.e());
                    }
                    else {
                        d = null;
                    }
                    return new rap(n3, (List)o2, c, d);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Connectivity", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Connectivity", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Connectivity", (Throwable)ex3);
        return null;
    }
    
    public static final boolean z(final int n, final z36 z36, final gna gna, final k2j k2j) {
        if (M(n, z36, gna, k2j)) {
            return true;
        }
        final Boolean b = (Boolean)pkq.k(gna, n, (lta)new a61((byte)9, n, (Object)((pma)soh.M((t98)gna).getFocusOwner()).h(), (Object)gna, (Object)k2j, (Object)z36));
        return b != null && b;
    }
}
