public final class wu8
{
    public final long a;
    public final long b;
    public final long c;
    
    public wu8(final long a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (o instanceof wu8) {
                    final wu8 wu8 = (wu8)o;
                    final long a = wu8.a;
                    final int i = j86.i;
                    if (foo.a(this.a, a)) {
                        if (foo.a(this.b, wu8.b)) {
                            if (foo.a(this.c, wu8.c)) {
                                return true;
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
        final int i = j86.i;
        return Long.hashCode(this.c) + hia.d(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
