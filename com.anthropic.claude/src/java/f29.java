public final class f29
{
    public final rm0 a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    public f29(final og0 og0, final long n) {
        final String w = og0.w;
        final rm0 a = new rm0((byte)2);
        a.d = w;
        a.b = -1;
        a.c = -1;
        this.a = a;
        this.b = dnn.g(n);
        this.c = dnn.f(n);
        this.d = -1;
        this.e = -1;
        final int g = dnn.g(n);
        final int f = dnn.f(n);
        if (g < 0 || g > w.length()) {
            en9.j(smk.o(g, w.length(), "start (", ") offset is outside of text region "));
            throw null;
        }
        if (f < 0 || f > w.length()) {
            en9.j(smk.o(f, w.length(), "end (", ") offset is outside of text region "));
            throw null;
        }
        if (g <= f) {
            return;
        }
        en9.s(smk.o(g, f, "Do not set reversed range: ", " > "));
        throw null;
    }
    
    public final void a(int d, final int n) {
        final long c = rhc.c(d, n);
        this.a.O(d, n, "");
        final long m = car.m(rhc.c(this.b, this.c), c);
        this.h(dnn.g(m));
        this.g(dnn.f(m));
        d = this.d;
        if (d != -1) {
            final long i = car.m(rhc.c(d, this.e), c);
            if (dnn.d(i)) {
                this.d = -1;
                this.e = -1;
                return;
            }
            this.d = dnn.g(i);
            this.e = dnn.f(i);
        }
    }
    
    public final char b(final int n) {
        final rm0 a = this.a;
        final cva cva = (cva)a.e;
        if (cva == null) {
            return ((String)a.d).charAt(n);
        }
        if (n < a.b) {
            return ((String)a.d).charAt(n);
        }
        final int d = cva.d();
        final int b = a.b;
        if (n < d + b) {
            return cva.c(n - b);
        }
        return ((String)a.d).charAt(n - (d - a.c + b));
    }
    
    public final dnn c() {
        final int d = this.d;
        if (d != -1) {
            return new dnn(rhc.c(d, this.e));
        }
        return null;
    }
    
    public final void d(final int n, final int n2, final String s) {
        final rm0 a = this.a;
        if (n < 0 || n > a.s()) {
            en9.j(smk.o(n, a.s(), "start (", ") offset is outside of text region "));
            return;
        }
        if (n2 < 0 || n2 > a.s()) {
            en9.j(smk.o(n2, a.s(), "end (", ") offset is outside of text region "));
            return;
        }
        if (n <= n2) {
            a.O(n, n2, s);
            this.h(s.length() + n);
            this.g(s.length() + n);
            this.d = -1;
            this.e = -1;
            return;
        }
        en9.s(smk.o(n, n2, "Do not set reversed range: ", " > "));
    }
    
    public final void e(final int d, final int e) {
        final rm0 a = this.a;
        if (d < 0 || d > a.s()) {
            en9.j(smk.o(d, a.s(), "start (", ") offset is outside of text region "));
            return;
        }
        if (e < 0 || e > a.s()) {
            en9.j(smk.o(e, a.s(), "end (", ") offset is outside of text region "));
            return;
        }
        if (d < e) {
            this.d = d;
            this.e = e;
            return;
        }
        en9.s(smk.o(d, e, "Do not set reversed or empty range: ", " > "));
    }
    
    public final void f(final int n, final int n2) {
        final rm0 a = this.a;
        if (n < 0 || n > a.s()) {
            en9.j(smk.o(n, a.s(), "start (", ") offset is outside of text region "));
            return;
        }
        if (n2 < 0 || n2 > a.s()) {
            en9.j(smk.o(n2, a.s(), "end (", ") offset is outside of text region "));
            return;
        }
        if (n <= n2) {
            this.h(n);
            this.g(n2);
            return;
        }
        en9.s(smk.o(n, n2, "Do not set reversed range: ", " > "));
    }
    
    public final void g(final int c) {
        if (c < 0) {
            final StringBuilder sb = new StringBuilder("Cannot set selectionEnd to a negative value: ");
            sb.append(c);
            hac.a(sb.toString());
        }
        this.c = c;
    }
    
    public final void h(final int b) {
        if (b < 0) {
            final StringBuilder sb = new StringBuilder("Cannot set selectionStart to a negative value: ");
            sb.append(b);
            hac.a(sb.toString());
        }
        this.b = b;
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
