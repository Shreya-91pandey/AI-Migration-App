public final class gun
{
    public final oun a;
    public final oun b;
    
    public gun(final oun a, final oun b) {
        this.a = a;
        this.b = b;
        final oun v = oun.v;
        if (a != v && v != b && a != b) {
            return;
        }
        final StringBuilder sb = new StringBuilder("invalid ThreePaneScaffoldHorizontalOrder(");
        sb.append((Object)a);
        sb.append(", ");
        sb.append((Object)v);
        sb.append(", ");
        sb.append((Object)b);
        sb.append(") - panes must be unique");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final void a(final zta zta) {
        zta.d((Object)0, (Object)this.a);
        zta.d((Object)1, (Object)oun.v);
        zta.d((Object)2, (Object)this.b);
    }
    
    public final int b(final oun oun) {
        if (oun == this.a) {
            return 0;
        }
        if (oun == oun.v) {
            return 1;
        }
        if (oun == this.b) {
            return 2;
        }
        return -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof gun) {
                final gun gun = (gun)o;
                if (this.a == gun.a) {
                    if (this.b == gun.b) {
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
        return this.b.hashCode() + (oun.v.hashCode() + this.a.hashCode() * 31) * 31;
    }
}
