public final class rd3
{
    public final gx a;
    public final lta b;
    public final bfa c;
    public final boolean d;
    
    public rd3(final gx a, final bfa c, final lta b, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rd3)) {
            return false;
        }
        final rd3 rd3 = (rd3)o;
        return mlc.q(this.a, rd3.a) && mlc.q(this.b, rd3.b) && mlc.q(this.c, rd3.c) && this.d == rd3.d;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() + xc2.i(this.a.hashCode() * 31, 31, this.b)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append((Object)this.a);
        sb.append(", size=");
        sb.append((Object)this.b);
        sb.append(", animationSpec=");
        sb.append((Object)this.c);
        sb.append(", clip=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
