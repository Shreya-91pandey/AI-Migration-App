public final class mvc
{
    public static final mvc g;
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final jpd f;
    
    static {
        g = new mvc(0, 0, 0, 127);
    }
    
    public mvc(int n, int n2, int n3, final int n4) {
        Boolean booleanFalse = Boolean.FALSE;
        if ((n4 & 0x1) != 0x0) {
            n = -1;
        }
        if ((n4 & 0x2) != 0x0) {
            false = null;
        }
        if ((n4 & 0x4) != 0x0) {
            n2 = 0;
        }
        if ((n4 & 0x8) != 0x0) {
            n3 = -1;
        }
        this(n, false, n2, n3, null, null);
    }
    
    public mvc(final int a, final Boolean b, final int c, final int d, final Boolean e, final jpd f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static mvc a() {
        final mvc g = mvc.g;
        return new mvc(3, g.b, g.c, g.d, null, null);
    }
    
    public final mvc b(final mvc mvc) {
        if (mvc == null || mvc.d() || mvc.equals(this)) {
            return this;
        }
        if (this.d()) {
            return mvc;
        }
        final int a = this.a;
        hvc hvc = new hvc(a);
        final t4c t4c = null;
        if (a == -1) {
            hvc = null;
        }
        int n;
        if (hvc != null) {
            n = hvc.a;
        }
        else {
            n = mvc.a;
        }
        Boolean b;
        if ((b = this.b) == null) {
            b = mvc.b;
        }
        final int c = this.c;
        nvc nvc = new nvc(c);
        if (c == 0) {
            nvc = null;
        }
        int n2;
        if (nvc != null) {
            n2 = nvc.a;
        }
        else {
            n2 = mvc.c;
        }
        final int d = this.d;
        t4c t4c2 = new t4c(d);
        if (d == -1) {
            t4c2 = t4c;
        }
        int n3;
        if (t4c2 != null) {
            n3 = t4c2.a;
        }
        else {
            n3 = mvc.d;
        }
        Boolean b2;
        if ((b2 = this.e) == null) {
            b2 = mvc.e;
        }
        jpd jpd;
        if ((jpd = this.f) == null) {
            jpd = mvc.f;
        }
        return new mvc(n, b, n2, n3, b2, jpd);
    }
    
    public final int c() {
        final int d = this.d;
        t4c t4c = new t4c(d);
        if (d == -1) {
            t4c = null;
        }
        if (t4c != null) {
            return t4c.a;
        }
        return 1;
    }
    
    public final boolean d() {
        return this.a == -1 && this.b == null && this.c == 0 && this.d == -1 && this.e == null && this.f == null;
    }
    
    public final y4c e(final boolean b) {
        final int a = this.a;
        hvc hvc = new hvc(a);
        final nvc nvc = null;
        if (a == -1) {
            hvc = null;
        }
        int a2;
        if (hvc != null) {
            a2 = hvc.a;
        }
        else {
            a2 = 0;
        }
        int a3 = 1;
        final Boolean b2 = this.b;
        final boolean b3 = b2 == null || b2;
        final int c = this.c;
        nvc nvc2 = new nvc(c);
        if (c == 0) {
            nvc2 = nvc;
        }
        if (nvc2 != null) {
            a3 = nvc2.a;
        }
        final int c2 = this.c();
        jpd jpd;
        if ((jpd = this.f) == null) {
            jpd = jpd.x;
        }
        return new y4c(b, a2, b3, a3, c2, jpd);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mvc)) {
            return false;
        }
        final mvc mvc = (mvc)o;
        if (this.a == mvc.a) {
            if (!mlc.q((Object)this.b, (Object)mvc.b)) {
                return false;
            }
            if (this.c == mvc.c && this.d == mvc.d) {
                return mlc.q((Object)this.e, (Object)mvc.e) && mlc.q((Object)this.f, (Object)mvc.f);
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = Integer.hashCode(this.a);
        int hashCode2 = 0;
        final Boolean b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int y = hia.y(this.d, hia.y(this.c, (hashCode * 31 + hashCode3) * 31, 31), 961);
        final Boolean e = this.e;
        int hashCode4;
        if (e != null) {
            hashCode4 = e.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final jpd f = this.f;
        if (f != null) {
            hashCode2 = f.v.hashCode();
        }
        return (y + hashCode4) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = hvc.a(this.a);
        final String a2 = nvc.a(this.c);
        final String a3 = t4c.a(this.d);
        final StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(a);
        sb.append(", autoCorrectEnabled=");
        sb.append((Object)this.b);
        sb.append(", keyboardType=");
        oz1.A(sb, a2, ", imeAction=", a3, ", platformImeOptions=nullshowKeyboardOnFocus=");
        sb.append((Object)this.e);
        sb.append(", hintLocales=");
        sb.append((Object)this.f);
        sb.append(")");
        return sb.toString();
    }
}
