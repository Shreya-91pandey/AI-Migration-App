import java.util.Arrays;

public final class qvc implements mz8
{
    public final pvc a;
    
    public qvc(final pvc a) {
        this.a = a;
    }
    
    public final u6p f(final dlo dlo) {
        final pvc a = this.a;
        final jlf b = a.b;
        final ilf ilf = new ilf(b.e + 2);
        final jlf jlf = new jlf(b.e);
        final int[] b2 = b.b;
        final Object[] c = b.c;
        final long[] a2 = b.a;
        final int n = a2.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a2[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8;
                    final int n5 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n5; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n6 = (n2 << 3) + i;
                            final int n7 = b2[n6];
                            final ovc ovc = (ovc)c[n6];
                            ilf.a(n7);
                            jlf.i(n7, new t6p((ig0)dlo.a().b(ovc.a), ovc.b));
                        }
                        n3 >>= n4;
                    }
                    if (n5 != n4) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        if (!b.a(0)) {
            final int b3 = ilf.b;
            if (b3 < 0) {
                qiq.t("Index must be between 0 and size");
                throw null;
            }
            ilf.b(b3 + 1);
            final int[] a3 = ilf.a;
            final int b4 = ilf.b;
            if (b4 != 0) {
                iw0.J0(1, 0, b4, a3, a3);
            }
            a3[0] = 0;
            ++ilf.b;
        }
        if (!b.a(a.a)) {
            ilf.a(a.a);
        }
        final int b5 = ilf.b;
        if (b5 != 0) {
            Arrays.sort(ilf.a, 0, b5);
        }
        return new u6p(ilf, jlf, a.a, (u09)x09.d);
    }
}
