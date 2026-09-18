public final class d5d implements c4d
{
    public final v5d a;
    public final c5d b;
    public final j3d c;
    public final mlf d;
    
    public d5d(final v5d a, final c5d b, final j3d c, final mlf d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final int a() {
        return this.b.F().b;
    }
    
    @Override
    public final Object b(final int n) {
        final Object d = this.d.d(n);
        if (d == null) {
            return this.b.G(n);
        }
        return d;
    }
    
    @Override
    public final Object c(final int n) {
        return this.b.D(n);
    }
    
    @Override
    public final void d(final int n, final Object o, final gva gva, final int n2) {
        gva.i0(-462424778);
        int n3;
        if (gva.d(n)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.h(o)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        int n5;
        if (gva.f((Object)this)) {
            n5 = 256;
        }
        else {
            n5 = 128;
        }
        final int n6 = n3 | n2 | n4 | n5;
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            rml.c(o, n, this.a.s, uuj.t0(-824725566, (aua)new oj2((Object)this, n, (byte)3), gva), gva, (n6 >> 3 & 0xE) | 0xC00 | (n6 << 3 & 0x70));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6(this, n, o, n2);
        }
    }
    
    @Override
    public final int e(final Object o) {
        return this.d.c(o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof d5d && mlc.q((Object)this.b, (Object)((d5d)o).b));
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}
