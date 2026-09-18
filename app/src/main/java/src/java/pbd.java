public final class pbd extends tcp
{
    public final jlf b;
    
    public pbd() {
        final jlf a = tgc.a;
        this.b = new jlf();
    }
    
    @Override
    public final void d() {
        final jlf b = this.b;
        final int[] b2 = ((sgc)b).b;
        final Object[] c = ((sgc)b).c;
        final long[] a = ((sgc)b).a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            final int n6 = b2[n5];
                            final emf emf = (emf)c[n5];
                            final Object[] a2 = emf.a;
                            for (int b3 = emf.b, j = 0; j < b3; ++j) {
                                final obd obd = (obd)a2[j];
                                final q13 d = obd.d;
                                if (d != null) {
                                    d.cancel();
                                }
                                obd.d = null;
                                final d1e d1e = (d1e)obd.a.w;
                                d1e.w = true;
                                d1e.v = false;
                                d1e.a();
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
    }
}
