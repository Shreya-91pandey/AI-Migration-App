import java.util.List;
import java.util.Collection;

public final class efo
{
    public final r1 a;
    public final efo b;
    public final String c;
    public final ksg d;
    public final ksg e;
    public final ksg f;
    public final isg g;
    public final isg h;
    public final ksg i;
    public final v8m j;
    public final v8m k;
    public final ksg l;
    public final sd8 m;
    
    public efo(final r1 a, final efo b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = o50.Q(a.i());
        this.e = o50.Q(null);
        this.f = o50.Q(new yeo(a.i(), a.i()));
        this.g = new isg(0L);
        this.h = new isg(Long.MIN_VALUE);
        final Boolean false = Boolean.FALSE;
        this.i = o50.Q(false);
        this.j = new v8m();
        this.k = new v8m();
        this.l = o50.Q(false);
        this.m = r8m.b((jta)new teo(this, (byte)1));
        a.p(this);
    }
    
    public final void a(final Object o, final gva gva, final int n) {
        gva.i0(-1493585151);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f(o);
            }
            else {
                b = gva.h(o);
            }
            int n2;
            if (b) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.f((Object)this)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        final boolean b2 = true;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            if (!this.h()) {
                gva.g0(466062241);
                this.s(o);
                final int n6 = n4 & 0x70;
                final boolean b3 = n6 == 32;
                final Object r = gva.R();
                final cib a = bi6.a;
                sd8 b4;
                if (b3 || (b4 = (sd8)r) == a) {
                    b4 = r8m.b((jta)new teo(this, (byte)0));
                    gva.q0((Object)b4);
                }
                if (((xom)b4).getValue()) {
                    gva.g0(466470356);
                    Object o2;
                    if ((o2 = gva.R()) == a) {
                        o2 = mlc.z((hc7)o89.v, gva);
                        gva.q0(o2);
                    }
                    final oc7 oc7 = (oc7)o2;
                    final boolean h = gva.h((Object)oc7);
                    final boolean b5 = n6 == 32 && b2;
                    final Object r2 = gva.R();
                    Object o3;
                    if ((h | b5) || (o3 = r2) == a) {
                        o3 = new tyl((Object)oc7, (Object)this, (byte)12);
                        gva.q0(o3);
                    }
                    mlc.b(oc7, this, (lta)o3, gva);
                    gva.q(false);
                }
                else {
                    gva.g0(467712929);
                    gva.q(false);
                }
                gva.q(false);
            }
            else {
                gva.g0(467722849);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6((Object)this, o, n, (byte)12);
        }
    }
    
    public final long b() {
        final v8m j = this.j;
        final int size = j.size();
        long n = 0L;
        final int n2 = 0;
        for (int i = 0; i < size; ++i) {
            n = Math.max(n, ((zeo)j.get(i)).G.h());
        }
        final v8m k = this.k;
        for (int size2 = k.size(), l = n2; l < size2; ++l) {
            n = Math.max(n, ((efo)k.get(l)).b());
        }
        return n;
    }
    
    public final void c() {
        final v8m j = this.j;
        final int size = ((Collection)j).size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final zeo zeo = (zeo)((List)j).get(i);
            zeo.A = null;
            zeo.z = null;
            zeo.D = false;
        }
        final v8m k = this.k;
        for (int size2 = ((Collection)k).size(), l = n; l < size2; ++l) {
            ((efo)((List)k).get(l)).c();
        }
    }
    
    public final boolean d() {
        final v8m j = this.j;
        for (int size = ((Collection)j).size(), i = 0; i < size; ++i) {
            if (((zeo)((List)j).get(i)).z != null) {
                return true;
            }
        }
        final v8m k = this.k;
        for (int size2 = ((Collection)k).size(), l = 0; l < size2; ++l) {
            if (((efo)((List)k).get(l)).d()) {
                return true;
            }
        }
        return false;
    }
    
    public final long e() {
        final efo b = this.b;
        if (b != null) {
            return b.e();
        }
        return this.g.h();
    }
    
    public final xeo f() {
        return (xeo)this.f.getValue();
    }
    
    public final boolean g() {
        return this.h.h() != Long.MIN_VALUE;
    }
    
    public final boolean h() {
        return (boolean)this.l.getValue();
    }
    
    public final void i(final long n, final boolean b) {
        final isg h = this.h;
        final long h2 = h.h();
        final r1 a = this.a;
        if (h2 == Long.MIN_VALUE) {
            h.i(n);
            ((ksg)a.w).setValue((Object)Boolean.TRUE);
        }
        else if (!(boolean)((ksg)a.w).getValue()) {
            ((ksg)a.w).setValue((Object)Boolean.TRUE);
        }
        this.p(false);
        final v8m j = this.j;
        final int size = j.size();
        boolean b2 = true;
        for (int i = 0; i < size; ++i) {
            final zeo zeo = (zeo)j.get(i);
            final ksg b3 = zeo.B;
            final ksg b4 = zeo.B;
            if (!(boolean)b3.getValue()) {
                long b5;
                if (b) {
                    b5 = zeo.a().b();
                }
                else {
                    b5 = n;
                }
                zeo.e(zeo.a().f(b5));
                zeo.F = zeo.a().d(b5);
                if (zeo.a().e(b5)) {
                    b4.setValue((Object)Boolean.TRUE);
                }
            }
            if (!(boolean)b4.getValue()) {
                b2 = false;
            }
        }
        final v8m k = this.k;
        for (int size2 = k.size(), l = 0; l < size2; ++l) {
            final efo efo = (efo)k.get(l);
            final ksg d = efo.d;
            final r1 a2 = efo.a;
            if (!mlc.q(d.getValue(), a2.i())) {
                efo.i(n, b);
            }
            if (!mlc.q(efo.d.getValue(), a2.i())) {
                b2 = false;
            }
        }
        if (b2) {
            this.j();
        }
    }
    
    public final void j() {
        this.h.i(Long.MIN_VALUE);
        final r1 a = this.a;
        if (a instanceof enf) {
            a.o(this.d.getValue());
        }
        this.o(0L);
        ((ksg)a.w).setValue((Object)Boolean.FALSE);
        final v8m k = this.k;
        for (int size = k.size(), i = 0; i < size; ++i) {
            ((efo)k.get(i)).j();
        }
    }
    
    public final void k(final float n) {
        final v8m j = this.j;
        final int size = j.size();
        final int n2 = 0;
        for (int i = 0; i < size; ++i) {
            final zeo zeo = (zeo)j.get(i);
            zeo.getClass();
            final float n3 = fcmpg(n, -4.0f);
            if (n3 != 0) {
                if (n != -5.0f) {
                    zeo.C.i(n);
                    continue;
                }
            }
            final jcn a = zeo.A;
            if (a != null) {
                zeo.a().h(a.c);
                zeo.z = null;
                zeo.A = null;
            }
            Object o;
            if (n3 == 0) {
                o = zeo.a().d;
            }
            else {
                o = zeo.a().c;
            }
            zeo.a().h(o);
            zeo.a().i(o);
            zeo.e(o);
            zeo.G.i(zeo.a().b());
        }
        final v8m k = this.k;
        for (int size2 = k.size(), l = n2; l < size2; ++l) {
            ((efo)k.get(l)).k(n);
        }
    }
    
    public final void l(final Object o, final Object value) {
        this.h.i(Long.MIN_VALUE);
        final r1 a = this.a;
        ((ksg)a.w).setValue((Object)Boolean.FALSE);
        final boolean h = this.h();
        final ksg d = this.d;
        if (!h || !mlc.q(a.i(), o) || !mlc.q(d.getValue(), value)) {
            if (!mlc.q(a.i(), o)) {
                if (a instanceof enf) {
                    a.o(o);
                }
            }
            d.setValue(value);
            this.l.setValue((Object)Boolean.TRUE);
            this.f.setValue((Object)new yeo(o, value));
        }
        final v8m k = this.k;
        final int size = k.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final efo efo = (efo)k.get(i);
            efo.getClass();
            if (efo.h()) {
                efo.l(efo.a.i(), efo.d.getValue());
            }
        }
        final v8m j = this.j;
        for (int size2 = j.size(), l = n; l < size2; ++l) {
            ((zeo)j.get(l)).d(0L);
        }
    }
    
    public final void m(final long n) {
        final isg h = this.h;
        if (h.h() == Long.MIN_VALUE) {
            h.i(n);
        }
        this.o(n);
        final int n2 = 0;
        this.p(false);
        final v8m j = this.j;
        for (int size = j.size(), i = 0; i < size; ++i) {
            ((zeo)j.get(i)).d(n);
        }
        final v8m k = this.k;
        for (int size2 = k.size(), l = n2; l < size2; ++l) {
            final efo efo = (efo)k.get(l);
            if (!mlc.q(efo.d.getValue(), efo.a.i())) {
                efo.m(n);
            }
        }
    }
    
    public final void n(final tmk z) {
        final v8m j = this.j;
        final int size = j.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final zeo zeo = (zeo)j.get(i);
            final ksg e = zeo.E;
            if (!mlc.q(zeo.a().c, zeo.a().d)) {
                zeo.A = zeo.a();
                zeo.z = z;
            }
            zeo.y.setValue((Object)new jcn(zeo.I, zeo.v, e.getValue(), e.getValue(), zeo.F.c()));
            zeo.G.i(zeo.a().b());
            zeo.D = true;
        }
        final v8m k = this.k;
        for (int size2 = k.size(), l = n; l < size2; ++l) {
            ((efo)k.get(l)).n(z);
        }
    }
    
    public final void o(final long n) {
        if (this.b == null) {
            this.g.i(n);
        }
    }
    
    public final void p(final boolean b) {
        this.i.setValue((Object)b);
    }
    
    public final void q() {
        final v8m j = this.j;
        final int size = j.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final zeo zeo = (zeo)j.get(i);
            final tmk z = zeo.z;
            if (z != null) {
                final jcn a = zeo.A;
                if (a != null) {
                    final long k = k8e.I(z.c() * (double)z.g());
                    final Object f = a.f(k);
                    if (zeo.D) {
                        zeo.a().i(f);
                    }
                    zeo.a().h(f);
                    zeo.G.i(zeo.a().b());
                    Label_0186: {
                        if (zeo.C.h() != -2.0f) {
                            if (!zeo.D) {
                                zeo.d(zeo.J.e());
                                break Label_0186;
                            }
                        }
                        zeo.e(f);
                    }
                    if (k >= z.c()) {
                        zeo.z = null;
                        zeo.A = null;
                    }
                    else {
                        z.k(false);
                    }
                }
            }
        }
        final v8m l = this.k;
        for (int size2 = l.size(), n2 = n; n2 < size2; ++n2) {
            ((efo)l.get(n2)).q();
        }
    }
    
    public final void r(Object o) {
        final ksg e = this.e;
        final Object value = e.getValue();
        final int n = 0;
        final r1 a = this.a;
        final ksg d = this.d;
        final boolean b = value != null && o == null && mlc.q(d.getValue(), a.i());
        e.setValue(o);
        if (b) {
            o = new yeo(value, d.getValue());
            this.f.setValue(o);
            a.o(value);
            if (!this.g()) {
                this.p(true);
            }
            final v8m j = this.j;
            for (int size = j.size(), i = n; i < size; ++i) {
                ((zeo)j.get(i)).C.i(-2.0f);
            }
        }
    }
    
    public final void s(final Object value) {
        final ksg d = this.d;
        if (!mlc.q(d.getValue(), value)) {
            this.f.setValue((Object)new yeo(d.getValue(), value));
            final r1 a = this.a;
            if (!mlc.q(a.i(), d.getValue())) {
                a.o(d.getValue());
            }
            d.setValue(value);
            if (!this.g()) {
                this.p(true);
            }
            final v8m j = this.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                ((zeo)j.get(i)).C.i(-2.0f);
            }
        }
    }
    
    @Override
    public final String toString() {
        final v8m j = this.j;
        final int size = ((Collection)j).size();
        String string = "Transition animation values: ";
        for (int i = 0; i < size; ++i) {
            final zeo zeo = (zeo)j.get(i);
            final StringBuilder sb = new StringBuilder(string);
            sb.append((Object)zeo);
            sb.append(", ");
            string = sb.toString();
        }
        return string;
    }
}
