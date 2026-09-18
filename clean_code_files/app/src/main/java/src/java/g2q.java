public abstract class g2q
{
    public static int a(final int n) {
        int n2 = 0;
        int n3;
        for (int i = 1; i <= 512; i <<= 1, n2 = n3) {
            n3 = n2;
            if ((n & i) != 0x0) {
                int n4;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 8) {
                                if (i != 16) {
                                    if (i != 32) {
                                        if (i != 64) {
                                            if (i != 128) {
                                                if (i != 512) {
                                                    n3 = n2;
                                                    continue;
                                                }
                                                n4 = ws4.a();
                                            }
                                            else {
                                                n4 = z1q.n();
                                            }
                                        }
                                        else {
                                            n4 = z1q.m();
                                        }
                                    }
                                    else {
                                        n4 = z1q.l();
                                    }
                                }
                                else {
                                    n4 = z1q.k();
                                }
                            }
                            else {
                                n4 = p4.b();
                            }
                        }
                        else {
                            n4 = z1q.j();
                        }
                    }
                    else {
                        n4 = z1q.g();
                    }
                }
                else {
                    n4 = z1q.a();
                }
                n3 = (n2 | n4);
            }
        }
        return n2;
    }
}
