import java.util.Collection;
import java.util.List;

public final class rtl
{
    public final url a;
    public final ksg b;
    public int c;
    public final hsg d;
    public int e;
    public zql f;
    public final hsg g;
    public int h;
    
    public rtl(final url a) {
        this.a = a;
        this.b = o50.Q(qwf.a);
        this.d = new hsg(0);
        this.e = 1;
        this.g = new hsg(0);
    }
    
    public final qtl a() {
        return (qtl)this.b.getValue();
    }
    
    public final void b() {
        final List c = this.a.c();
        final int size = ((Collection)c).size();
        int n = 0;
        Object o;
        Object value;
        while (true) {
            o = null;
            if (n >= size) {
                value = null;
                break;
            }
            value = c.get(n);
            if (((vrl)value).k()) {
                break;
            }
            ++n;
        }
        final vrl vrl = (vrl)value;
        if (vrl != null || this.f != null) {
            Object h = o;
            if (vrl != null) {
                h = vrl.H;
            }
            if (!mlc.q(h, this.f)) {
                this.g.i(this.h + 1);
            }
        }
    }
    
    public final void c() {
        final hsg d = this.d;
        final int h = d.h();
        final int c = this.c;
        final int n = 0;
        final int n2 = 0;
        final url a = this.a;
        if (h != c) {
            this.c = d.h();
            final int d2 = ge9.D(this.e);
            qtl value = null;
            Label_0173: {
                if (d2 != 0) {
                    if (d2 != 1) {
                        value = qwf.a;
                        if (d2 != 2) {
                            if (d2 != 3) {
                                en9.r();
                                return;
                            }
                        }
                        else {
                            final List c2 = a.c();
                            for (int size = ((Collection)c2).size(), i = 0; i < size; ++i) {
                                if (mlc.q(((vrl)c2.get(i)).H, this.f)) {
                                    break Label_0173;
                                }
                            }
                            value = this.a().h();
                        }
                    }
                    else {
                        value = this.a().g(this.f);
                    }
                }
                else {
                    value = this.a();
                }
            }
            this.b.setValue((Object)value);
            this.e = 1;
        }
        final hsg g = this.g;
        if (g.h() != this.h) {
            final boolean a2 = a.b.a();
            final zql zql = null;
            zql f = null;
            Label_0382: {
                if (a2) {
                    final List c3 = a.c();
                    final int size2 = ((Collection)c3).size();
                    int j = n2;
                    while (true) {
                        while (j < size2) {
                            final Object value2 = c3.get(j);
                            if (((vrl)value2).k()) {
                                final vrl vrl = (vrl)value2;
                                f = zql;
                                if (vrl != null) {
                                    f = vrl.H;
                                }
                                break Label_0382;
                            }
                            else {
                                ++j;
                            }
                        }
                        final Object value2 = null;
                        continue;
                    }
                }
                final List b = a.b();
                final int size3 = ((Collection)b).size();
                int k = n;
                while (true) {
                    while (k < size3) {
                        final Object value3 = b.get(k);
                        if (((vrl)value3).k()) {
                            final vrl vrl2 = (vrl)value3;
                            f = zql;
                            if (vrl2 != null) {
                                f = vrl2.H;
                            }
                            break Label_0382;
                        }
                        else {
                            ++k;
                        }
                    }
                    final Object value3 = null;
                    continue;
                }
            }
            if (!mlc.q(f, this.f)) {
                this.f = f;
            }
            this.h = g.h();
        }
    }
}
