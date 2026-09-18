import java.util.List;

public final class nmn
{
    public final og0 a;
    public final mnn b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final xc8 g;
    public final qzc h;
    public final tna i;
    public final long j;
    
    public nmn(final og0 a, final mnn b, final List c, final int d, final boolean e, final int f, final xc8 g, final qzc h, final tna i, final long j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof nmn) {
                final nmn nmn = (nmn)o;
                if (mlc.q((Object)this.a, (Object)nmn.a)) {
                    if (mlc.q((Object)this.b, (Object)nmn.b)) {
                        if (mlc.q((Object)this.c, (Object)nmn.c)) {
                            if (this.d == nmn.d) {
                                if (this.e == nmn.e) {
                                    if (this.f == nmn.f) {
                                        if (mlc.q((Object)this.g, (Object)nmn.g)) {
                                            if (this.h == nmn.h) {
                                                if (mlc.q((Object)this.i, (Object)nmn.i)) {
                                                    if (gv6.c(this.j, nmn.j)) {
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
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.j) + (this.i.hashCode() + (this.h.hashCode() + (this.g.hashCode() + hia.y(this.f, smk.l((smk.k(idn.l(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = zmn.a(this.f);
        final String m = gv6.m(this.j);
        final StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object)this.a);
        sb.append(", style=");
        sb.append((Object)this.b);
        sb.append(", placeholders=");
        sb.append((Object)this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        a6l.k(sb, this.e, ", overflow=", a, ", density=");
        sb.append((Object)this.g);
        sb.append(", layoutDirection=");
        sb.append((Object)this.h);
        sb.append(", fontFamilyResolver=");
        sb.append((Object)this.i);
        sb.append(", constraints=");
        sb.append(m);
        sb.append(")");
        return sb.toString();
    }
}
