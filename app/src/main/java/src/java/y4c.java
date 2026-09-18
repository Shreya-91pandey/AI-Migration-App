public final class y4c
{
    public static final y4c g;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final jpd f;
    
    static {
        g = new y4c(false, 0, true, 1, 1, jpd.x);
    }
    
    public y4c(final boolean a, final int b, final boolean c, final int d, final int e, final jpd f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y4c)) {
            return false;
        }
        final y4c y4c = (y4c)o;
        if (this.a != y4c.a) {
            return false;
        }
        if (this.b == y4c.b) {
            if (this.c != y4c.c) {
                return false;
            }
            if (this.d == y4c.d && this.e == y4c.e) {
                return mlc.q((Object)this.f, (Object)y4c.f);
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.f.v.hashCode() + hia.y(this.e, hia.y(this.d, smk.l(hia.y(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }
    
    @Override
    public final String toString() {
        final String a = hvc.a(this.b);
        final String a2 = nvc.a(this.d);
        final String a3 = t4c.a(this.e);
        final StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.a);
        sb.append(", capitalization=");
        sb.append(a);
        sb.append(", autoCorrect=");
        a6l.k(sb, this.c, ", keyboardType=", a2, ", imeAction=");
        sb.append(a3);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append((Object)this.f);
        sb.append(")");
        return sb.toString();
    }
}
