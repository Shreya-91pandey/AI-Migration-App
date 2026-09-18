import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;

public final class jo1 extends z7g
{
    public final byte d;
    public final Object e;
    
    public jo1(final d38 e) {
        this.d = 2;
        super(e.e());
        this.e = e;
        e.c = (Set)rml.I(e.c, new p8a((Object)this, (byte)21));
    }
    
    public static fo1 g(final go1 go1) {
        final float a = go1.a();
        final int b = go1.b();
        eo1 eo1;
        if (b != 0) {
            if (b != 1) {
                eo1 = eo1.v;
            }
            else {
                eo1 = eo1.x;
            }
        }
        else {
            eo1 = eo1.w;
        }
        return new fo1(a, eo1, go1.c(), go1.d());
    }
    
    @Override
    public final void a() {
        final byte d = this.d;
        final Object e = this.e;
        switch (d) {
            default: {
                final d38 d2 = (d38)e;
                final xr5 b = d2.b;
                if (b != null) {
                    final co1 j = b.j();
                    if (j != null) {
                        j.b();
                    }
                }
                d2.b = null;
                return;
            }
            case 1: {
                final vra vra = (vra)e;
                if (vra.I(3)) {
                    Objects.toString((Object)vra);
                }
                vra.d();
                return;
            }
            case 0: {
                ((ko1)e).c();
            }
        }
    }
    
    @Override
    public final void b() {
        final byte d = this.d;
        final Object e = this.e;
        switch (d) {
            default: {
                ((d38)e).d();
                return;
            }
            case 1: {
                final vra vra = (vra)e;
                if (vra.I(3)) {
                    Objects.toString((Object)vra);
                }
                final jo1 j = vra.j;
                final ArrayList n = vra.n;
                vra.A(vra.i = true);
                vra.i = false;
                if (vra.h != null) {
                    if (!n.isEmpty()) {
                        final LinkedHashSet set = new LinkedHashSet((Collection)vra.E(vra.h));
                        final Iterator iterator = n.iterator();
                        while (iterator.hasNext()) {
                            ge9.C(iterator.next());
                            final Iterator iterator2 = ((Set)set).iterator();
                            if (!iterator2.hasNext()) {
                                continue;
                            }
                            final hra hra = (hra)iterator2.next();
                            throw null;
                        }
                    }
                    final Iterator iterator3 = vra.h.a.iterator();
                    while (iterator3.hasNext()) {
                        final hra b = ((dsa)iterator3.next()).b;
                        if (b != null) {
                            b.H = false;
                        }
                    }
                    final Iterator iterator4 = vra.g(new ArrayList((Collection)Collections.singletonList((Object)vra.h)), 0, 1).iterator();
                    while (iterator4.hasNext()) {
                        ((v68)iterator4.next()).b();
                    }
                    final Iterator iterator5 = vra.h.a.iterator();
                    while (iterator5.hasNext()) {
                        final hra b2 = ((dsa)iterator5.next()).b;
                        if (b2 != null && b2.a0 == null) {
                            vra.h(b2).k();
                        }
                    }
                    vra.h = null;
                    vra.e0();
                    if (vra.I(3)) {
                        final boolean b3 = j.b;
                        vra.toString();
                    }
                }
                else if (j.b) {
                    vra.I(3);
                    vra.Q();
                }
                else {
                    vra.I(3);
                    vra.g.b().a();
                }
                return;
            }
            case 0: {
                ((ko1)e).d();
            }
        }
    }
    
    @Override
    public final void c(final go1 go1) {
        final byte d = this.d;
        final Object e = this.e;
        switch (d) {
            default: {
                ((d38)e).g(g(go1));
                return;
            }
            case 1: {
                final vra vra = (vra)e;
                if (vra.I(2)) {
                    Objects.toString((Object)vra);
                }
                if (vra.h != null) {
                    final Iterator iterator = vra.g(new ArrayList((Collection)Collections.singletonList((Object)vra.h)), 0, 1).iterator();
                    while (iterator.hasNext()) {
                        ((v68)iterator.next()).i(go1);
                    }
                    final Iterator iterator2 = vra.n.iterator();
                    if (iterator2.hasNext()) {
                        ge9.C(iterator2.next());
                        throw null;
                    }
                }
                return;
            }
            case 0: {
                ((ko1)e).e(go1);
            }
        }
    }
    
    @Override
    public final void d(final go1 go1) {
        final byte d = this.d;
        final Object e = this.e;
        switch (d) {
            default: {
                final d38 d2 = (d38)e;
                final fo1 g = g(go1);
                final co1 e2 = w9r.e((Iterable)d2.a);
                if (e2 != null) {
                    d2.b = new xr5((Object)g, (Object)e2, (byte)22);
                    e2.d(g);
                }
                return;
            }
            case 1: {
                final vra vra = (vra)e;
                if (vra.I(3)) {
                    Objects.toString((Object)vra);
                }
                vra.x();
                vra.y((sra)new ura(vra), false);
                return;
            }
            case 0: {
                ((ko1)e).f();
            }
        }
    }
}
