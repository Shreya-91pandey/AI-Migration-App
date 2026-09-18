import kotlinx.serialization.json.JsonException;
import io.sentry.c2;
import java.util.Map$Entry;
import java.util.Iterator;

public abstract class g1
{
    public Object A;
    public final byte v;
    public int w;
    public final Object x;
    public final Object y;
    public Object z;
    
    public g1(final x8m x, final Iterator y) {
        this.v = 1;
        this.x = x;
        this.y = y;
        this.w = x.g().d;
        this.a();
    }
    
    public g1(final zqc x) {
        this.v = 0;
        this.x = x;
        this.y = new z48(x);
        this.A = new StringBuilder();
    }
    
    public static boolean A(final char c) {
        return c != ',' && c != ':' && c != ']' && c != '}';
    }
    
    public static /* synthetic */ void x(final g1 g1, final String s, int w, String s2, final int n) {
        if ((n & 0x2) != 0x0) {
            w = g1.w;
        }
        if ((n & 0x4) != 0x0) {
            s2 = null;
        }
        g1.w(w, s, s2);
        throw null;
    }
    
    public String B(final String s, final boolean b) {
        return null;
    }
    
    public byte C() {
        final CharSequence z = this.z();
        int n = this.w;
        while (true) {
            n = this.E(n);
            if (n == -1) {
                this.w = n;
                return 10;
            }
            final char char1 = z.charAt(n);
            if (char1 != '\t' && char1 != '\n' && char1 != '\r' && char1 != ' ') {
                this.w = n;
                return r6k.i(char1);
            }
            ++n;
        }
    }
    
    public String D(final boolean b) {
        final byte c = this.C();
        if (b) {
            if (c == 1 || c == 0) {
                final String s = this.s();
                return (String)(this.z = s);
            }
        }
        else if (c == 1) {
            final String s = this.q();
            return (String)(this.z = s);
        }
        return null;
    }
    
    public abstract int E(final int p0);
    
    public abstract int F();
    
    public String G(final int n, final int n2) {
        return this.z().subSequence(n, n2).toString();
    }
    
    public boolean H() {
        final int f = this.F();
        final CharSequence z = this.z();
        if (f < z.length()) {
            if (f != -1) {
                if (z.charAt(f) == ',') {
                    ++this.w;
                    return true;
                }
            }
        }
        return false;
    }
    
    public void I(final char c) {
        final int w = this.w;
        if (w > 0 && c == '\"') {
            try {
                this.w = w - 1;
                final String s = this.s();
                this.w = w;
                if (mlc.q((Object)s, (Object)"null")) {
                    this.w(this.w - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            }
            finally {
                this.w = w;
            }
        }
        final String f0 = r6k.f0(r6k.i(c));
        final int w2 = this.w;
        int n;
        if (w2 > 0) {
            n = w2 - 1;
        }
        else {
            n = w2;
        }
        String value;
        if (w2 != this.z().length() && n >= 0) {
            value = String.valueOf(this.z().charAt(n));
        }
        else {
            value = "EOF";
        }
        x(this, lmf.t("Expected ", f0, ", but had '", value, "' instead"), n, null, 4);
        throw null;
    }
    
    public void a() {
        this.z = this.A;
        final Iterator iterator = (Iterator)this.y;
        Map$Entry a;
        if (iterator.hasNext()) {
            a = (Map$Entry)iterator.next();
        }
        else {
            a = null;
        }
        this.A = a;
    }
    
    public int c(final int w, final CharSequence charSequence) {
        final int n = w + 4;
        if (n < charSequence.length()) {
            ((StringBuilder)this.A).append((char)(this.y(w + 3, charSequence) + ((this.y(w, charSequence) << 12) + (this.y(w + 1, charSequence) << 8) + (this.y(w + 2, charSequence) << 4))));
            return n;
        }
        this.w = w;
        this.u();
        if (this.w + 4 < charSequence.length()) {
            return this.c(this.w, charSequence);
        }
        x(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }
    
    public void d(final int n, final int n2) {
        ((StringBuilder)this.A).append(this.z(), n, n2);
    }
    
    public abstract boolean f();
    
    public void g(final int n, final String s) {
        if (this.z().length() - n >= s.length()) {
            for (int length = s.length(), i = 0; i < length; ++i) {
                if (s.charAt(i) != (this.z().charAt(n + i) | ' ')) {
                    final StringBuilder sb = new StringBuilder("Expected valid boolean literal prefix, but had '");
                    sb.append(this.s());
                    sb.append('\'');
                    x(this, sb.toString(), 0, null, 6);
                    throw null;
                }
            }
            this.w = s.length() + n;
            return;
        }
        x(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }
    
    public boolean hasNext() {
        return this.A != null;
    }
    
    public abstract String j();
    
    public abstract byte m();
    
    public byte n(final byte b) {
        final byte m = this.m();
        if (m != b) {
            final String f0 = r6k.f0(b);
            final int w = this.w;
            int n;
            if (w > 0) {
                n = w - 1;
            }
            else {
                n = w;
            }
            String value;
            if (w != this.z().length() && n >= 0) {
                value = String.valueOf(this.z().charAt(n));
            }
            else {
                value = "EOF";
            }
            x(this, lmf.t("Expected ", f0, ", but had '", value, "' instead"), n, null, 4);
            throw null;
        }
        return m;
    }
    
    public abstract void o(final char p0);
    
    public long p() {
        int e = this.E(this.F());
        if (e >= this.z().length() || e == -1) {
            x(this, "EOF", 0, null, 6);
            throw null;
        }
        boolean b;
        if (this.z().charAt(e) == '\"') {
            if (++e == this.z().length()) {
                x(this, "EOF", 0, null, 6);
                throw null;
            }
            b = true;
        }
        else {
            b = false;
        }
        int i = e;
        boolean b2 = false;
        int n2;
        int n = n2 = 0;
        long n3 = 0L;
        long n4 = 0L;
        while (i != this.z().length()) {
            final char char1 = this.z().charAt(i);
            if ((char1 == 'e' || char1 == 'E') && n == 0) {
                if (i == e) {
                    final StringBuilder sb = new StringBuilder("Unexpected symbol '");
                    sb.append(char1);
                    sb.append("' in numeric literal");
                    x(this, sb.toString(), i, null, 4);
                    throw null;
                }
                ++i;
                b2 = true;
                n = 1;
            }
            else if (char1 == '-' && n != 0) {
                if (i == e) {
                    x(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                    throw null;
                }
                ++i;
                b2 = false;
            }
            else if (char1 == '+' && n != 0) {
                if (i == e) {
                    x(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                    throw null;
                }
                ++i;
                b2 = true;
            }
            else if (char1 == '-') {
                if (i != e) {
                    x(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                    throw null;
                }
                ++i;
                n2 = 1;
            }
            else {
                if (r6k.i(char1) != 0) {
                    break;
                }
                final int n5 = char1 - '0';
                if (n5 < 0 || n5 >= 10) {
                    final StringBuilder sb2 = new StringBuilder("Unexpected symbol '");
                    sb2.append(char1);
                    sb2.append("' in numeric literal");
                    x(this, sb2.toString(), i, null, 4);
                    throw null;
                }
                if (n != 0) {
                    n3 = n3 * 10L + n5;
                }
                else {
                    n4 = n4 * 10L - n5;
                    if (n4 > 0L) {
                        x(this, "Numeric value overflow", 0, null, 6);
                        throw null;
                    }
                }
                ++i;
            }
        }
        final boolean b3 = i != e;
        if (e == i || (n2 != 0 && e == i - 1)) {
            x(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        int w = i;
        if (b) {
            if (!b3) {
                x(this, "EOF", 0, null, 6);
                throw null;
            }
            if (this.z().charAt(i) != '\"') {
                x(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            w = i + 1;
        }
        this.w = w;
        long n6 = n4;
        if (n != 0) {
            final double n7 = (double)n4;
            double n8;
            if (!b2) {
                n8 = Math.pow(10.0, -(double)n3);
            }
            else {
                if (!b2) {
                    en9.r();
                    return 0L;
                }
                n8 = Math.pow(10.0, (double)n3);
            }
            final double n9 = n7 * n8;
            if (n9 > 9.223372036854776E18 || n9 < -9.223372036854776E18) {
                x(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(n9) != n9) {
                final StringBuilder sb3 = new StringBuilder("Can't convert ");
                sb3.append(n9);
                sb3.append(" to Long");
                x(this, sb3.toString(), 0, null, 6);
                throw null;
            }
            n6 = (long)n9;
        }
        if (n2 != 0) {
            return n6;
        }
        if (n6 != Long.MIN_VALUE) {
            return -n6;
        }
        x(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }
    
    public String q() {
        final String s = (String)this.z;
        if (s != null) {
            s.getClass();
            this.z = null;
            return s;
        }
        return this.j();
    }
    
    public String r(int n, int e, final CharSequence charSequence) {
        final StringBuilder sb = (StringBuilder)this.A;
        char c = charSequence.charAt(e);
        boolean b = false;
        int n2 = e;
        e = n;
        while (c != '\"') {
            int n4 = 0;
            Label_0280: {
                if (c == '\\') {
                    this.d(e, n2);
                    e = this.E(n2 + 1);
                    if (e == -1) {
                        x(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                        throw null;
                    }
                    final CharSequence z = this.z();
                    n = e + 1;
                    final char char1 = z.charAt(e);
                    if (char1 == 'u') {
                        n = this.c(n, this.z());
                    }
                    else {
                        char c2;
                        if (char1 < 'u') {
                            c2 = di3.a[char1];
                        }
                        else {
                            c2 = '\0';
                        }
                        if (c2 == '\0') {
                            final StringBuilder sb2 = new StringBuilder("Invalid escaped char '");
                            sb2.append(char1);
                            sb2.append('\'');
                            x(this, sb2.toString(), 0, null, 6);
                            throw null;
                        }
                        sb.append(c2);
                    }
                    n = this.E(n);
                    if (n == -1) {
                        x(this, "Unexpected EOF", n, null, 4);
                        throw null;
                    }
                }
                else {
                    final int n3 = n2 + 1;
                    n4 = e;
                    if ((n = n3) < charSequence.length()) {
                        break Label_0280;
                    }
                    this.d(e, n3);
                    n = this.E(n3);
                    if (n == -1) {
                        x(this, "Unexpected EOF", n, null, 4);
                        throw null;
                    }
                }
                e = n;
                b = true;
                n4 = n;
                n = e;
            }
            c = charSequence.charAt(n);
            e = n4;
            n2 = n;
        }
        String s;
        if (!b) {
            s = this.G(e, n2);
        }
        else {
            this.d(e, n2);
            s = sb.toString();
            sb.setLength(0);
        }
        this.w = n2 + 1;
        return s;
    }
    
    public void remove() {
        final x8m x8m = (x8m)this.x;
        if (x8m.g().d != this.w) {
            en9.c();
            return;
        }
        final Map$Entry map$Entry = (Map$Entry)this.z;
        if (map$Entry != null) {
            x8m.remove(map$Entry.getKey());
            this.z = null;
            this.w = x8m.g().d;
            return;
        }
        c2.c();
    }
    
    public String s() {
        final StringBuilder sb = (StringBuilder)this.A;
        final String s = (String)this.z;
        if (s != null) {
            s.getClass();
            this.z = null;
            return s;
        }
        int w = this.F();
        if (w >= this.z().length() || w == -1) {
            x(this, "EOF", w, null, 4);
            throw null;
        }
        final byte i = r6k.i(this.z().charAt(w));
        if (i == 1) {
            return this.q();
        }
        if (i == 0) {
            boolean b = false;
            while (r6k.i(this.z().charAt(w)) == 0) {
                final int w2 = w + 1;
                if ((w = w2) >= this.z().length()) {
                    this.d(this.w, w2);
                    w = this.E(w2);
                    if (w == -1) {
                        this.w = w2;
                        this.d(0, 0);
                        final String string = sb.toString();
                        sb.setLength(0);
                        return string;
                    }
                    b = true;
                }
            }
            final int w3 = this.w;
            String s2;
            if (!b) {
                s2 = this.G(w3, w);
            }
            else {
                this.d(w3, w);
                s2 = sb.toString();
                sb.setLength(0);
            }
            this.w = w;
            return s2;
        }
        final StringBuilder sb2 = new StringBuilder("Expected beginning of the string, but got ");
        sb2.append(this.z().charAt(w));
        x(this, sb2.toString(), 0, null, 6);
        throw null;
    }
    
    public String t() {
        final String s = this.s();
        if (mlc.q((Object)s, (Object)"null") && this.z().charAt(this.w - 1) != '\"') {
            x(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
            throw null;
        }
        return s;
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 0: {
                final StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object)this.z());
                sb.append("', currentPosition=");
                return hia.m(sb, this.w, ')');
            }
        }
    }
    
    public void u() {
    }
    
    public void v() {
        if (this.m() == 10) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Expected EOF after parsing, but had ");
        sb.append(this.z().charAt(this.w - 1));
        sb.append(" instead");
        x(this, sb.toString(), 0, null, 6);
        throw null;
    }
    
    public void w(final int n, final String s, final String s2) {
        final String k = ((z48)this.y).k();
        final CharSequence z = this.z();
        String string;
        if (((zqc)this.x).l) {
            string = zn2.K(n, z).toString();
        }
        else {
            string = null;
        }
        throw new JsonException(zn2.w(n, s, k, s2, string));
    }
    
    public int y(final int n, final CharSequence charSequence) {
        final char char1 = charSequence.charAt(n);
        if ('0' <= char1 && char1 < ':') {
            return char1 - '0';
        }
        if ('a' <= char1 && char1 < 'g') {
            return char1 - 'W';
        }
        if ('A' <= char1 && char1 < 'G') {
            return char1 - '7';
        }
        final StringBuilder sb = new StringBuilder("Invalid toHexChar char '");
        sb.append(char1);
        sb.append("' in unicode escape");
        x(this, sb.toString(), 0, null, 6);
        throw null;
    }
    
    public abstract CharSequence z();
}
