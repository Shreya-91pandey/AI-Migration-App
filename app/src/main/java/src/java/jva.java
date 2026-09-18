import java.util.ArrayList;

public final class jva
{
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final jlf e;
    public final l7n f;
    
    public jva(int b, final ArrayList a) {
        this.a = a;
        this.b = b;
        if (b < 0) {
            pih.a("Invalid start index");
        }
        this.d = new ArrayList();
        final jlf e = new jlf();
        final int size = a.size();
        int i = 0;
        b = 0;
        while (i < size) {
            final puc puc = (puc)this.a.get(i);
            final int c = puc.c;
            final int d = puc.d;
            e.i(c, (Object)new g7b(i, b, d));
            b += d;
            ++i;
        }
        this.e = e;
        this.f = new l7n((jta)new nr((Object)this, (byte)9));
    }
    
    public final boolean a(int n, int i) {
        final jlf e = this.e;
        final g7b g7b = (g7b)((sgc)e).b(n);
        if (g7b != null) {
            final int b = g7b.b;
            final int n2 = i - g7b.c;
            g7b.c = i;
            if (n2 != 0) {
                final Object[] c = ((sgc)e).c;
                final long[] a = ((sgc)e).a;
                final int n3 = a.length - 2;
                if (n3 >= 0) {
                    n = 0;
                    while (true) {
                        long n4 = a[n];
                        if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int n5;
                            g7b g7b2;
                            int b2;
                            int b3;
                            for (n5 = 8 - (~(n - n3) >>> 31), i = 0; i < n5; ++i) {
                                if ((0xFFL & n4) < 128L) {
                                    g7b2 = (g7b)c[(n << 3) + i];
                                    b2 = g7b2.b;
                                    if (b2 >= b && g7b2 != g7b) {
                                        b3 = b2 + n2;
                                        if (b3 >= 0) {
                                            g7b2.b = b3;
                                        }
                                    }
                                }
                                n4 >>= 8;
                            }
                            if (n5 != 8) {
                                break;
                            }
                        }
                        if (n == n3) {
                            break;
                        }
                        ++n;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
