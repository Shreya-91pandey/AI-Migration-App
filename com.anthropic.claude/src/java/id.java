import java.util.Collection;
import java.util.List;

public final class id extends qtl
{
    public zql a;
    public final ksg b;
    
    public id(final zql a, final k2j k2j) {
        this.a = a;
        this.b = o50.Q(k2j);
    }
    
    @Override
    public final qtl a(final url url, final zql zql, final long n, final long n2, final long n3) {
        final c2l c2l = new c2l(n, l6g.h(n2, n3), n3);
        k2j k2j;
        if ((k2j = this.c()) == null) {
            zql zql2 = null;
            Label_0143: {
                if ((zql2 = this.a) == null) {
                    final List b = url.b();
                    final int size = ((Collection)b).size();
                    int i = 0;
                    while (true) {
                        while (i < size) {
                            final Object value = b.get(i);
                            if (url.c().contains((Object)value)) {
                                final vrl vrl = (vrl)value;
                                if (vrl != null) {
                                    zql2 = vrl.H;
                                    break Label_0143;
                                }
                                zql2 = null;
                                break Label_0143;
                            }
                            else {
                                ++i;
                            }
                        }
                        final Object value = null;
                        continue;
                    }
                }
            }
            if ((k2j = qt7.L(url, zql2)) == null) {
                k2j = rml.f(n2, n);
            }
        }
        qt7.Y(c2l, n, n2, n3, true);
        return new hd(c2l, zql, k2j);
    }
    
    @Override
    public final boolean b() {
        return true;
    }
    
    @Override
    public final k2j c() {
        return (k2j)this.b.getValue();
    }
    
    @Override
    public final c2l e() {
        return null;
    }
    
    @Override
    public final k2j f(final url url) {
        final k2j c = this.c();
        if (c != null) {
            return c;
        }
        if (this.c() == null) {
            zql zql = null;
            Label_0125: {
                if ((zql = this.a) == null) {
                    final List b = url.b();
                    final int size = ((Collection)b).size();
                    int i = 0;
                    while (true) {
                        while (i < size) {
                            final Object value = b.get(i);
                            if (url.c().contains((Object)value)) {
                                final vrl vrl = (vrl)value;
                                if (vrl != null) {
                                    zql = vrl.H;
                                    break Label_0125;
                                }
                                zql = null;
                                break Label_0125;
                            }
                            else {
                                ++i;
                            }
                        }
                        final Object value = null;
                        continue;
                    }
                }
            }
            final k2j l = qt7.L(url, zql);
            if (l != null) {
                this.b.setValue((Object)l);
            }
        }
        return this.c();
    }
    
    @Override
    public final qtl g(final zql a) {
        if (this.a == null) {
            this.a = a;
        }
        return this;
    }
    
    @Override
    public final void i(final k2j value) {
        this.b.setValue((Object)value);
    }
}
