public final class c58 implements goe
{
    public final byte v;
    public final goe w;
    public final int x;
    public final int y;
    
    @Override
    public final int Q(final int n) {
        switch (this.v) {
            default: {
                return this.w.Q(n);
            }
            case 0: {
                return this.w.Q(n);
            }
        }
    }
    
    @Override
    public final int a(final int n) {
        switch (this.v) {
            default: {
                return this.w.a(n);
            }
            case 0: {
                return this.w.a(n);
            }
        }
    }
    
    @Override
    public final int n(final int n) {
        switch (this.v) {
            default: {
                return this.w.n(n);
            }
            case 0: {
                return this.w.n(n);
            }
        }
    }
    
    @Override
    public final int s(final int n) {
        switch (this.v) {
            default: {
                return this.w.s(n);
            }
            case 0: {
                return this.w.s(n);
            }
        }
    }
    
    @Override
    public final o8h u(final long n) {
        switch (this.v) {
            default: {
                int n2 = 32767;
                final goe w = this.w;
                final int y = this.y;
                final int x = this.x;
                uga uga;
                if (y == 1) {
                    int n3;
                    if (x == 2) {
                        n3 = w.s(gv6.h(n));
                    }
                    else {
                        n3 = w.n(gv6.h(n));
                    }
                    if (gv6.d(n)) {
                        n2 = gv6.h(n);
                    }
                    uga = new uga(n3, n2, (byte)1);
                }
                else {
                    int n4;
                    if (x == 2) {
                        n4 = w.a(gv6.i(n));
                    }
                    else {
                        n4 = w.Q(gv6.i(n));
                    }
                    if (gv6.e(n)) {
                        n2 = gv6.i(n);
                    }
                    uga = new uga(n2, n4, (byte)1);
                }
                return (o8h)uga;
            }
            case 0: {
                int n5 = 32767;
                final goe w2 = this.w;
                final int y2 = this.y;
                final int x2 = this.x;
                uga uga2;
                if (y2 == 1) {
                    int n6;
                    if (x2 == 2) {
                        n6 = w2.s(gv6.h(n));
                    }
                    else {
                        n6 = w2.n(gv6.h(n));
                    }
                    if (gv6.d(n)) {
                        n5 = gv6.h(n);
                    }
                    uga2 = new uga(n6, n5, (byte)0);
                }
                else {
                    int n7;
                    if (x2 == 2) {
                        n7 = w2.a(gv6.i(n));
                    }
                    else {
                        n7 = w2.Q(gv6.i(n));
                    }
                    if (gv6.e(n)) {
                        n5 = gv6.i(n);
                    }
                    uga2 = new uga(n5, n7, (byte)0);
                }
                return (o8h)uga2;
            }
        }
    }
    
    @Override
    public final Object z() {
        switch (this.v) {
            default: {
                return this.w.z();
            }
            case 0: {
                return this.w.z();
            }
        }
    }
}
