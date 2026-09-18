import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

public final class v5m implements vl6, Iterable, stc
{
    public final Object A;
    public boolean B;
    public int C;
    public ArrayList D;
    public HashMap E;
    public jlf F;
    public int[] v;
    public int w;
    public Object[] x;
    public int y;
    public int z;
    
    public v5m() {
        this.v = new int[0];
        this.x = new Object[0];
        this.A = new Object();
        this.D = new ArrayList();
    }
    
    public static final void j(final y5m y5m, final int n) {
        while (y5m.v >= 0 && y5m.u <= n) {
            y5m.N();
            y5m.i();
        }
    }
    
    public final int a(final bva bva) {
        if (this.B) {
            ti6.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!bva.a()) {
            pih.a("Anchor refers to a group that was removed");
        }
        return bva.a;
    }
    
    public final void d() {
        this.E = new HashMap();
    }
    
    public final tmf f(final it0 it0, emf o) {
        final Object[] a = o.a;
        final int b = o.b;
        int n = 0;
        emf emf;
        while (true) {
            emf = o;
            if (n >= b) {
                break;
            }
            if (!this.r(r6k.f(((iif)a[n]).a()))) {
                emf = new emf();
                final Object[] a2 = o.a;
                for (int b2 = o.b, i = 0; i < b2; ++i) {
                    final Object o2 = a2[i];
                    if (this.r(r6k.f(((iif)o2).a()))) {
                        emf.b(o2);
                    }
                }
                break;
            }
            ++n;
        }
        final emf l = rjq.l(emf, new jwj((Object)this, (byte)19));
        if (l.i()) {
            final tmf b3 = jak.b;
            b3.getClass();
            return b3;
        }
        final long[] a3 = jak.a;
        final tmf tmf = new tmf();
        o = (emf)this.o();
        Label_0365: {
            try {
                final Object[] a4 = l.a;
                for (int b4 = l.b, j = 0; j < b4; ++j) {
                    final iif iif = (iif)a4[j];
                    final int c = ((y5m)o).c(r6k.f(iif.a()));
                    final int f = ((y5m)o).F(((y5m)o).b, c);
                    j((y5m)o, f);
                    j((y5m)o, f);
                    int t;
                    while (true) {
                        t = ((y5m)o).t;
                        if (t == f || t == ((y5m)o).u) {
                            break;
                        }
                        if (f < ((y5m)o).t(t) + t) {
                            ((y5m)o).Q();
                        }
                        else {
                            ((y5m)o).M();
                        }
                    }
                    if (t != f) {
                        ti6.a("Unexpected slot table structure");
                    }
                    ((y5m)o).Q();
                    ((y5m)o).a(c - ((y5m)o).t);
                    tmf.m((Object)iif, (Object)ti6.c(iif.b(), iif, (y5m)o, it0));
                }
            }
            finally {
                break Label_0365;
            }
            j((y5m)o, Integer.MAX_VALUE);
            ((y5m)o).e(true);
            return tmf;
        }
        ((y5m)o).e(false);
    }
    
    public final Iterator iterator() {
        return (Iterator)new h7b(this, 0, this.w);
    }
    
    public final u5m m() {
        if (!this.B) {
            ++this.z;
            return new u5m(this);
        }
        en9.q("Cannot read while a writer is pending");
        return null;
    }
    
    public final y5m o() {
        if (this.B) {
            ti6.a("Cannot start a writer when another writer is pending");
        }
        if (this.z > 0) {
            ti6.a("Cannot start a writer when a reader is pending");
        }
        this.B = true;
        ++this.C;
        return new y5m(this);
    }
    
    public final boolean r(final bva bva) {
        if (bva.a()) {
            final int c = x5m.c(this.D, bva.a, this.w);
            if (c >= 0 && mlc.q(this.D.get(c), (Object)bva)) {
                return true;
            }
        }
        return false;
    }
    
    public final iva s(int c) {
        final HashMap e = this.E;
        if (e != null) {
            if (this.B) {
                ti6.a("use active SlotWriter to crate an anchor for location instead");
            }
            bva bva = null;
            Label_0067: {
                if (c >= 0) {
                    final int w = this.w;
                    if (c < w) {
                        final ArrayList d = this.D;
                        c = x5m.c(d, c, w);
                        if (c >= 0) {
                            bva = (bva)d.get(c);
                            break Label_0067;
                        }
                    }
                }
                bva = null;
            }
            if (bva != null) {
                return (iva)e.get((Object)bva);
            }
        }
        return null;
    }
}
