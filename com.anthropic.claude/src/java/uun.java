import androidx.compose.ui.node.LayoutNode;

public final class uun
{
    public final int a;
    public final byte b;
    public final hgf c;
    public final lta d;
    public uun e;
    public long f;
    public long g;
    public long h;
    public long i;
    public final vun j;
    
    public uun(final vun j, final int a, final long n, final hgf c, final lta d) {
        this.j = j;
        this.a = a;
        this.b = (byte)n;
        this.c = c;
        this.d = d;
        this.h = Long.MIN_VALUE;
        this.i = -1L;
    }
    
    public final void a(final long n, final long n2, final long n3, final long n4, final float[] array) {
        final w7j n5 = iwq.n(n, n2, n3, n4, this.j.f, this.c, array);
        if (n5 == null) {
            return;
        }
        this.d.b((Object)n5);
    }
    
    public final void b() {
        final vun j = this.j;
        final jlf a = j.a;
        final int a2 = this.a;
        uun uun = (uun)a.g(a2);
        Label_0084: {
            if (uun != null) {
                if (uun != this) {
                    final int d = a.d(a2);
                    final Object[] c = ((sgc)a).c;
                    final Object o = c[d];
                    ((sgc)a).b[d] = a2;
                    c[d] = uun;
                    while (true) {
                        final uun e = uun.e;
                        if (e == null) {
                            break Label_0084;
                        }
                        if (e == this) {
                            break;
                        }
                        uun = e;
                    }
                    uun.e = this.e;
                    this.e = null;
                    return;
                }
                final uun e2 = this.e;
                this.e = null;
                if (e2 != null) {
                    final int d2 = a.d(a2);
                    final Object[] c2 = ((sgc)a).c;
                    final Object o2 = c2[d2];
                    ((sgc)a).b[d2] = a2;
                    c2[d2] = e2;
                    return;
                }
                final LayoutNode l = soh.L((t98)this.c.v);
                if (!l.V()) {
                    return;
                }
                final m2j rectManager = l0d.a(l).getRectManager();
                rectManager.getClass();
                if (l.B != -4) {
                    final mlf c3 = rectManager.c;
                    int d3 = rectManager.d(l);
                    final long[] array = (long[])c3.c;
                    d3 += 2;
                    array[d3] &= 0x6FFFFFFFFFFFFFFFL;
                }
                return;
            }
        }
        uun b = j.b;
        if (b == this) {
            j.b = b.e;
            this.e = null;
            return;
        }
        uun uun2;
        if (b != null) {
            uun2 = b.e;
        }
        else {
            uun2 = null;
        }
        while (true) {
            final uun uun3 = b;
            b = uun2;
            if (b == null) {
                break;
            }
            if (b == this) {
                if (uun3 != null) {
                    uun3.e = b.e;
                }
                this.e = null;
                return;
            }
            uun2 = b.e;
        }
    }
}
