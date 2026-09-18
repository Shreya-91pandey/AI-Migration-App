import io.sentry.c2;

public final class ieo
{
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    
    public ieo(final double a, final double b, final double c, final double d, final double e, final double f, final double g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (!Double.isNaN(b) && !Double.isNaN(c) && !Double.isNaN(d) && !Double.isNaN(e) && !Double.isNaN(f) && !Double.isNaN(g) && !Double.isNaN(a)) {
            if (a != -2.0) {
                if (a != -3.0) {
                    if (e < 0.0 || e > 1.0) {
                        c2.d(e, "Parameter d must be in the range [0..1], was ");
                        throw null;
                    }
                    if (e == 0.0 && (b == 0.0 || a == 0.0)) {
                        en9.s("Parameter a or g is zero, the transfer function is constant");
                        throw null;
                    }
                    if (e >= 1.0 && d == 0.0) {
                        en9.s("Parameter c is zero, the transfer function is constant");
                        throw null;
                    }
                    Label_0217: {
                        if (b != 0.0) {
                            if (a != 0.0) {
                                break Label_0217;
                            }
                        }
                        if (d == 0.0) {
                            en9.s("Parameter a or g is zero, and c is zero, the transfer function is constant");
                            throw null;
                        }
                    }
                    if (d < 0.0) {
                        en9.s("The transfer function must be increasing");
                        throw null;
                    }
                    if (b >= 0.0 && a >= 0.0) {
                        return;
                    }
                    en9.s("The transfer function must be positive or increasing");
                    throw null;
                }
            }
            return;
        }
        en9.s("Parameters cannot be NaN");
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ieo)) {
            return false;
        }
        final ieo ieo = (ieo)o;
        return Double.compare(this.a, ieo.a) == 0 && Double.compare(this.b, ieo.b) == 0 && Double.compare(this.c, ieo.c) == 0 && Double.compare(this.d, ieo.d) == 0 && Double.compare(this.e, ieo.e) == 0 && Double.compare(this.f, ieo.f) == 0 && Double.compare(this.g, ieo.g) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Double.hashCode(this.g) + idn.k(this.f, idn.k(this.e, idn.k(this.d, idn.k(this.c, idn.k(this.b, Double.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TransferParameters(gamma=");
        sb.append(this.a);
        sb.append(", a=");
        sb.append(this.b);
        idn.o(sb, ", b=", this.c, ", c=");
        sb.append(this.d);
        idn.o(sb, ", d=", this.e, ", e=");
        sb.append(this.f);
        sb.append(", f=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
