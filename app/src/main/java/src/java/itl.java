import java.util.Collection;
import java.util.Map;
import java.util.List;
import java.util.Iterator;

public final class itl implements cyd
{
    public nzc A;
    public nzc B;
    public final hsg C;
    public final emf D;
    public final x8m E;
    public int F;
    public final cyd v;
    public final oc7 w;
    public ve x;
    public final ksg y;
    public final ve z;
    
    public itl(final cyd v, final oc7 w) {
        this.v = v;
        this.w = w;
        this.y = o50.Q(Boolean.FALSE);
        this.z = new ve(this, (byte)10);
        this.C = new hsg(0);
        this.D = new emf();
        this.E = new x8m();
        this.F = -1;
    }
    
    public static etl b(final Object o, final gva gva) {
        gva.g0(800730162);
        gva.g0(-148945892);
        final boolean f = gva.f(o);
        final Object r = gva.R();
        etl etl;
        if (f || (etl = (etl)r) == bi6.a) {
            etl = new etl(o);
            gva.q0((Object)etl);
        }
        final etl etl2 = etl;
        etl2.b.setValue((Object)ysl.a);
        gva.q(false);
        gva.q(false);
        return etl2;
    }
    
    public static igf c(final itl itl, final igf igf, final etl etl, final af0 af0, final int n) {
        vf0 vf0 = lq6.a;
        if ((n & 0x4) != 0x0) {
            vf0 = eqi.d;
        }
        ctl.a.getClass();
        return ien.l(igf, (bua)new htl(etl, af0.a(), l0k.z, itl, btl.b, true, ntl.b, 0.0f, (kj2)vf0));
    }
    
    public final boolean a() {
        return (boolean)this.y.getValue();
    }
    
    @Override
    public final nzc d(final nzc nzc) {
        return this.v.d(nzc);
    }
    
    public final void e() {
        final Iterable iterable = (Iterable)((Map)this.E.g().c).values();
        final Iterator iterator = iterable.iterator();
        boolean b = false;
    Label_0029:
        while (true) {
            b = false;
            while (iterator.hasNext()) {
                final url url = (url)iterator.next();
                url.f();
                if (!b && (!url.a() || (!url.d() && !url.e()))) {
                    continue Label_0029;
                }
                b = true;
            }
            break;
        }
        if (b != this.a()) {
            this.y.setValue((Object)b);
            if (!b) {
                Label_0123:
                for (final url url2 : iterable) {
                    if (url2.c().size() > 1) {
                        final List c = url2.c();
                        final int a = wrl.a;
                        for (int size = ((Collection)c).size(), i = 0; i < size; ++i) {
                            if (((vrl)c.get(i)).g().b()) {
                                continue Label_0123;
                            }
                        }
                    }
                    final rtl c2 = url2.c;
                    c2.e = 1;
                    c2.c = c2.d.h();
                    c2.b.setValue((Object)qwf.a);
                }
            }
        }
    }
    
    @Override
    public final long f(final nzc nzc, final nzc nzc2) {
        return this.v.f(nzc, nzc2);
    }
    
    @Override
    public final nzc j(final n8h n8h) {
        return this.v.j(n8h);
    }
}
