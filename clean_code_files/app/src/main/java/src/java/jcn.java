public final class jcn implements xf0
{
    public final o6p a;
    public final dlo b;
    public Object c;
    public Object d;
    public ig0 e;
    public ig0 f;
    public final ig0 g;
    public long h;
    public ig0 i;
    
    public jcn(final cg0 cg0, final dlo b, final Object d, final Object c, final ig0 ig0) {
        final o6p a = cg0.a(b);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (ig0)b.a().b(d);
        this.f = (ig0)b.a().b(c);
        ig0 g;
        if (ig0 != null) {
            g = rml.n(ig0);
        }
        else {
            g = ((ig0)b.a().b(d)).c();
        }
        this.g = g;
        this.h = -1L;
    }
    
    @Override
    public final boolean a() {
        return this.a.a();
    }
    
    @Override
    public final long b() {
        long h;
        if ((h = this.h) < 0L) {
            h = this.a.d(this.e, this.f, this.g);
            this.h = h;
        }
        return h;
    }
    
    @Override
    public final dlo c() {
        return this.b;
    }
    
    @Override
    public final ig0 d(final long n) {
        if (!this.e(n)) {
            return this.a.e(n, this.e, this.f, this.g);
        }
        ig0 i;
        if ((i = this.i) == null) {
            i = this.a.k(this.e, this.f, this.g);
            this.i = i;
        }
        return i;
    }
    
    @Override
    public final Object f(final long n) {
        if (!this.e(n)) {
            final ig0 i = this.a.i(n, this.e, this.f, this.g);
            for (int b = i.b(), j = 0; j < b; ++j) {
                if (Float.isNaN(i.a(j))) {
                    final StringBuilder sb = new StringBuilder("AnimationVector cannot contain a NaN. ");
                    sb.append((Object)i);
                    sb.append(". Animation: ");
                    sb.append((Object)this);
                    sb.append(", playTimeNanos: ");
                    sb.append(n);
                    rih.b(sb.toString());
                }
            }
            return this.b.b().b(i);
        }
        return this.c;
    }
    
    @Override
    public final Object g() {
        return this.c;
    }
    
    public final void h(final Object d) {
        if (!mlc.q(d, this.d)) {
            this.d = d;
            this.e = (ig0)this.b.a().b(d);
            this.i = null;
            this.h = -1L;
        }
    }
    
    public final void i(final Object c) {
        if (!mlc.q(this.c, c)) {
            this.c = c;
            this.f = (ig0)this.b.a().b(c);
            this.i = null;
            this.h = -1L;
        }
    }
    
    @Override
    public final String toString() {
        final Object d = this.d;
        final Object c = this.c;
        final long n = this.b() / 1000000L;
        final StringBuilder sb = new StringBuilder("TargetBasedAnimation: ");
        sb.append(d);
        sb.append(" -> ");
        sb.append(c);
        sb.append(",initial velocity: ");
        sb.append((Object)this.g);
        sb.append(", duration: ");
        sb.append(n);
        sb.append(" ms,animationSpec: ");
        sb.append((Object)this.a);
        return sb.toString();
    }
}
