public final class o4c
{
    public static int k;
    public static final p3 l;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final k6p f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;
    
    static {
        l = new p3((byte)17);
    }
    
    public o4c(final String a, final float b, final float c, final float d, final float e, final k6p f, final long g, final int h, final boolean i) {
        final p3 l = o4c.l;
        synchronized (l) {
            final int k = o4c.k;
            o4c.k = k + 1;
            monitorexit(l);
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = k;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof o4c) {
                final o4c o4c = (o4c)o;
                if (mlc.q((Object)this.a, (Object)o4c.a)) {
                    if (qs8.e(this.b, o4c.b)) {
                        if (qs8.e(this.c, o4c.c)) {
                            if (this.d == o4c.d && this.e == o4c.e) {
                                if (this.f.equals(o4c.f)) {
                                    final long g = o4c.g;
                                    final int i = j86.i;
                                    if (foo.a(this.g, g)) {
                                        if (this.h == o4c.h) {
                                            if (this.i == o4c.i) {
                                                return true;
                                            }
                                        }
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
        final int d = oz1.d(this.e, oz1.d(this.d, oz1.d(this.c, oz1.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        final int hashCode = this.f.hashCode();
        final int i = j86.i;
        return Boolean.hashCode(this.i) + hia.y(this.h, hia.d((hashCode + d) * 31, this.g, 31), 31);
    }
}
