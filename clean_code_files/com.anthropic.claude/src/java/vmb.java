import java.util.Collection;
import java.util.List;

public abstract class vmb extends hgf implements wfo, teh, zl6
{
    public vs8 J;
    public p90 K;
    public boolean L;
    
    public vmb(final p90 k, final vs8 j) {
        this.J = j;
        this.K = k;
    }
    
    public final void G(final jeh jeh, final keh keh, final long n) {
        if (keh == keh.w) {
            final List a = jeh.a;
            final int size = ((Collection)a).size();
            int i = 0;
            while (i < size) {
                if (this.r1(((peh)a.get(i)).j())) {
                    final int f = jeh.f;
                    if (f == 4) {
                        this.L = true;
                        this.q1();
                        return;
                    }
                    if (f == 5) {
                        this.s1();
                        return;
                    }
                    break;
                }
                else {
                    ++i;
                }
            }
        }
    }
    
    public final void V() {
        this.s1();
    }
    
    public final void h1() {
        this.s1();
    }
    
    public final void o1() {
        final Object o = new Object();
        o50.a0((wfo)this, (lta)new g9b((b4j)o));
        final vmb vmb = (vmb)((b4j)o).v;
        p90 p90;
        if (vmb == null || (p90 = vmb.K) == null) {
            p90 = this.K;
        }
        this.p1(p90);
    }
    
    public void p1(final neh a) {
        final oeh oeh = (oeh)uoo.z((zl6)this, (sei)hm6.x);
        if (oeh != null) {
            ((w40)oeh).a = a;
        }
    }
    
    public final void q1() {
        final Object o = new Object();
        ((x3j)o).v = true;
        o50.c0((wfo)this, (lta)new umb((x3j)o, (byte)0));
        if (((x3j)o).v) {
            this.o1();
        }
    }
    
    public boolean r1(final int n) {
        return !xeh.b(n, 3) && !xeh.b(n, 4);
    }
    
    public final void s1() {
        if (this.L) {
            this.L = false;
            if (super.I) {
                final Object o = new Object();
                o50.a0((wfo)this, (lta)new m40((b4j)o, (byte)4));
                final vmb vmb = (vmb)((b4j)o).v;
                if (vmb != null) {
                    vmb.o1();
                    return;
                }
                this.p1(null);
            }
        }
    }
    
    public final long w() {
        final vs8 j = this.J;
        if (j != null) {
            return j.a(soh.L((t98)this).U);
        }
        final int b = sbo.b;
        return wp7.j();
    }
}
