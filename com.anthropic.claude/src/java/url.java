import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class url
{
    public final Object a;
    public final itl b;
    public final rtl c;
    public final ksg d;
    public final ksg e;
    public final id0 f;
    public boolean g;
    public final trl h;
    public final trl i;
    
    public url(final Object a, final itl b) {
        this.a = a;
        this.b = b;
        this.c = new rtl(this);
        final r89 v = r89.v;
        this.d = o50.Q(v);
        this.e = o50.Q(v);
        this.f = new id0(new l6g(0L), yi2.j, null, 12);
        this.h = new trl(this, (byte)0);
        this.i = new trl(this, (byte)1);
    }
    
    public final boolean a() {
        final rtl c = this.c;
        return c.a().b() || c.a().d() || c.e == 2;
    }
    
    public final List b() {
        return (List)this.d.getValue();
    }
    
    public final List c() {
        return (List)this.e.getValue();
    }
    
    public final boolean d() {
        final List c = this.c();
        for (int size = ((Collection)c).size(), i = 0; i < size; ++i) {
            if (((vrl)c.get(i)).g().d()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean e() {
        final List c = this.c();
        for (int size = ((Collection)c).size(), i = 0; i < size; ++i) {
            final hsl f = ((vrl)c.get(i)).f();
            if (f != null && f.d()) {
                return true;
            }
        }
        return false;
    }
    
    public final void f() {
        final List b = this.b();
        final ArrayList value = new ArrayList();
        final int size = ((Collection)b).size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final vrl vrl = (vrl)b.get(i);
            int n2 = n;
            if (vrl.m()) {
                value.add((Object)vrl);
                n2 = n;
                if (vrl.g().b()) {
                    n2 = 1;
                }
            }
            ++i;
            n = n2;
        }
        this.e.setValue((Object)value);
        final rtl c = this.c;
        final url a = c.a;
        final hsg d = c.d;
        if (a.c().size() > 1 && n != 0) {
            c.e = 2;
            d.i(c.c + 1);
        }
        else if (a.b.a()) {
            if (n == 0) {
                c.e = 3;
                d.i(c.c + 1);
            }
        }
        else {
            c.e = 1;
            c.c = d.h();
            c.b.setValue((Object)qwf.a);
        }
        c.b();
    }
}
