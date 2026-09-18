public final class d1e implements rpj
{
    public boolean v;
    public boolean w;
    public boolean x;
    public final tmf y;
    
    public d1e() {
        this.v = true;
        this.y = new tmf();
    }
    
    public final void a() {
        final tmf y = this.y;
        final Object[] c = y.c;
        final long[] a = y.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final Object o = c[(n2 << 3) + i];
                            if (o instanceof emf) {
                                final emf emf = (emf)o;
                                final Object[] a2 = emf.a;
                                for (int b = emf.b, j = 0; j < b; ++j) {
                                    final Object o2 = a2[j];
                                }
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        y.a();
    }
}
