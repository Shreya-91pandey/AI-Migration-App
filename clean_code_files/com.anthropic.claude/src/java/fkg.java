public final class fkg
{
    public final long a;
    public final hng b;
    
    public fkg() {
        final long e = t08.e(4284900966L);
        final hng l = omo.l(0.0f, 0.0f, 3);
        this.a = e;
        this.b = l;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            Class<?> class1;
            if (o != null) {
                class1 = o.getClass();
            }
            else {
                class1 = null;
            }
            if (fkg.class.equals(class1)) {
                o.getClass();
                final fkg fkg = (fkg)o;
                final long a = fkg.a;
                final int i = j86.i;
                if (foo.a(this.a, a)) {
                    if (this.b.equals((Object)fkg.b)) {
                        return true;
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
        return this.b.hashCode() + Long.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final String h = j86.h(this.a);
        final StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        sb.append(h);
        sb.append(", drawPadding=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
