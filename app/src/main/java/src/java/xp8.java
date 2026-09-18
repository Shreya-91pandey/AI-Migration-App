import java.util.ArrayList;

public final class xp8 extends hgf implements bw8
{
    public z3d J;
    
    public final void I0(final k0d k0d) {
        final z13 v = k0d.v;
        final ArrayList i = this.J.i;
        final int size = i.size();
        int j = 0;
        while (j < size) {
            final v3d v3d = (v3d)i.get(j);
            final g6b f = v3d.f();
            Label_0150: {
                if (f == null) {
                    break Label_0150;
                }
                final float n = (float)(int)(v3d.i() >> 32);
                final float n2 = (float)(int)(v3d.i() & 0xFFFFFFFFL);
                final long t = f.t;
                final float n3 = n - (int)(t >> 32);
                final float n4 = n2 - (int)(t & 0xFFFFFFFFL);
                ((jy7)v.w.v).G(n3, n4);
                try {
                    r9n.p((cw8)k0d, f);
                    ((jy7)v.w.v).G(-n3, -n4);
                    ++j;
                    continue;
                }
                finally {
                    ((jy7)v.w.v).G(-n3, -n4);
                }
            }
            break;
        }
        k0d.a();
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof xp8 && mlc.q((Object)this.J, (Object)((xp8)o).J));
    }
    
    public final void g1() {
        this.J.j = this;
    }
    
    public final void h1() {
        final z3d j = this.J;
        j.e();
        j.b = null;
        j.c = -1;
    }
    
    public final int hashCode() {
        return this.J.hashCode();
    }
    
    public final String toString() {
        final z3d j = this.J;
        final StringBuilder sb = new StringBuilder("DisplayingDisappearingItemsNode(animator=");
        sb.append((Object)j);
        sb.append(")");
        return sb.toString();
    }
}
