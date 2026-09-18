public abstract class t5p
{
    public static final fc2 a;
    
    static {
        a = new fc2((o6g)n6g.a, 0, 0);
    }
    
    public static final leo a(final lep lep, final og0 og0) {
        final leo a = lep.a(og0);
        final int length = og0.w.length();
        final og0 a2 = a.a;
        final o6g b = a.b;
        final int length2 = a2.w.length();
        final int min = Math.min(length, 100);
        final int n = 0;
        for (int i = 0; i < min; ++i) {
            b(b.G(i), length2, i);
        }
        b(b.G(length), length2, length);
        for (int min2 = Math.min(length2, 100), j = n; j < min2; ++j) {
            c(b.n(j), length, j);
        }
        c(b.n(length2), length, length2);
        return new leo(a2, (o6g)new fc2(b, og0.w.length(), a2.w.length()));
    }
    
    public static final void b(final int n, final int n2, final int n3) {
        int n4 = 0;
        if (n >= 0) {
            n4 = n4;
            if (n <= n2) {
                n4 = 1;
            }
        }
        if (n4 == 0) {
            final StringBuilder o = hia.o(n3, n, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
            o.append(n2);
            o.append("]");
            jac.c(o.toString());
        }
    }
    
    public static final void c(final int n, final int n2, final int n3) {
        int n4 = 0;
        if (n >= 0) {
            n4 = n4;
            if (n <= n2) {
                n4 = 1;
            }
        }
        if (n4 == 0) {
            final StringBuilder o = hia.o(n3, n, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
            o.append(n2);
            o.append("]");
            jac.c(o.toString());
        }
    }
}
