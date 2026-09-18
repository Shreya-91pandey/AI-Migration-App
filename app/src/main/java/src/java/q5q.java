import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public abstract class q5q
{
    public boolean a;
    public UUID b;
    public v5q c;
    public final Set d;
    
    public q5q(final Class clazz) {
        final UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        final String string = this.b.toString();
        string.getClass();
        this.c = new v5q(string, null, clazz.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, null, null, 33554426);
        final String name = clazz.getName();
        final LinkedHashSet d = new LinkedHashSet(z5e.V(1));
        ((Collection)d).add((Object)(new String[] { name })[0]);
        this.d = (Set)d;
    }
    
    public final q5q a(final String s) {
        this.d.add((Object)s);
        return this.d();
    }
    
    public final r5q b() {
        final r5q c = this.c();
        final fv6 j = this.c.j;
        final boolean b = !((Collection)j.i).isEmpty() || j.e || j.c || j.d;
        final v5q c2 = this.c;
        if (c2.q) {
            if (b) {
                en9.s("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (c2.g > 0L) {
                en9.s("Expedited jobs cannot be delayed");
                return null;
            }
        }
        final String x = c2.x;
        if (x == null) {
            final List m1 = kym.m1((CharSequence)c2.c, new String[] { "." }, 0, 6);
            String z1;
            if (m1.size() == 1) {
                z1 = (String)m1.get(0);
            }
            else {
                z1 = (String)c86.P0(m1);
            }
            if (z1.length() > 127) {
                z1 = kym.z1(127, z1);
            }
            c2.x = z1;
        }
        else if (x.length() > 127) {
            this.c.x = kym.z1(127, x);
        }
        final UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        final String string = randomUUID.toString();
        string.getClass();
        final v5q c3 = this.c;
        this.c = new v5q(string, c3.b, c3.c, c3.d, new nt7(c3.e), new nt7(c3.f), c3.g, c3.h, c3.i, new fv6(c3.j), c3.k, c3.l, c3.m, c3.n, c3.o, c3.p, c3.q, c3.r, c3.s, c3.u, c3.v, c3.w, c3.x, c3.y, 524288);
        return c;
    }
    
    public r5q c() {
        if (this.a && this.c.j.d) {
            en9.s("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        return new r5q(this.b, this.c, this.d);
    }
    
    public q5q d() {
        return this;
    }
    
    public final q5q e(final int l, long millis, final TimeUnit timeUnit) {
        this.a = true;
        final v5q c = this.c;
        c.l = l;
        millis = timeUnit.toMillis(millis);
        final String z = v5q.z;
        if (millis > 18000000L) {
            krd.c().f(z, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000L) {
            krd.c().f(z, "Backoff delay duration less than minimum value");
        }
        c.m = ncq.q(millis, 10000L, 18000000L);
        return this.d();
    }
    
    public final q5q f(final fv6 j) {
        this.c.j = j;
        return this.d();
    }
    
    public final q5q g() {
        final v5q c = this.c;
        c.q = true;
        c.r = 1;
        return this.d();
    }
    
    public final q5q h(final long n, final TimeUnit timeUnit) {
        this.c.g = timeUnit.toMillis(n);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
            return this.d();
        }
        en9.s("The given initial delay is too large and will cause an overflow!");
        return null;
    }
    
    public final q5q i(final nt7 e) {
        this.c.e = e;
        return this.d();
    }
}
