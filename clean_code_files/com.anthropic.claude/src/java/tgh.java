public final class tgh
{
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final short f;
    
    public tgh(final int a, final boolean b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = true;
        this.f = 1002;
    }
    
    public tgh(boolean b, boolean b2, final int n) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        final boolean b3 = (n & 0x2) != 0x0;
        if ((n & 0x4) != 0x0) {
            b2 = true;
        }
        this(b, b3, b2, 1, (n & 0x8) != 0x0);
    }
    
    public tgh(final boolean b, final boolean b2, final boolean b3, final int n, final boolean b4) {
        final b09 a = w90.a;
        int n2;
        if (!b) {
            n2 = 262152;
        }
        else {
            n2 = 262144;
        }
        int n3 = n2;
        if (n == 2) {
            n3 = (n2 | 0x2000);
        }
        int n4 = n3;
        if (!b4) {
            n4 = (n3 | 0x200);
        }
        boolean b5 = true;
        if (n != 1) {
            b5 = false;
        }
        this(n4, b5, b2, b3);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof tgh) {
                final tgh tgh = (tgh)o;
                if (this.a == tgh.a) {
                    if (this.b == tgh.b) {
                        if (this.c == tgh.c) {
                            if (this.d == tgh.d) {
                                if (this.e == tgh.e) {
                                    if (this.f == tgh.f) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return (smk.l(smk.l(smk.l(smk.l(smk.l(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }
}
