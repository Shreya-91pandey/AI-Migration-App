import java.util.List;

public final class ypg
{
    public static final ygm p;
    public static final kmg q;
    public final lta a;
    public final ksg b;
    public final ksg c;
    public final ksg d;
    public final hsg e;
    public int f;
    public final ksg g;
    public qlf h;
    public bfa i;
    public gia j;
    public xc8 k;
    public qzc l;
    public final upg m;
    public final ynf n;
    public final vpg o;
    
    static {
        p = new ygm(0.8f, 380.0f, (Object)1.0f);
        q = new kmg((byte)7);
    }
    
    public ypg(final zpg zpg, final lta a) {
        this.a = a;
        this.b = o50.Q((Object)zpg);
        final Boolean booleanFalse = Boolean.FALSE;
        this.c = o50.Q((Object)false);
        this.d = o50.Q((Object)false);
        this.e = new hsg(-1);
        this.f = -1;
        this.g = o50.Q((Object)r89.v);
        this.h = new qlf(0);
        this.m = new upg(this);
        this.n = new ynf();
        this.o = new vpg(this);
    }
    
    public final Object a(final ppg value, final h07 h07) {
        Object o = null;
        Label_0051: {
            if (h07 instanceof spg) {
                final spg spg = (spg)h07;
                final int x = spg.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    spg.x = x + Integer.MIN_VALUE;
                    o = spg;
                    break Label_0051;
                }
            }
            o = new spg(this, h07);
        }
        final Object v = ((spg)o).v;
        final int x2 = ((spg)o).x;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            if (!this.c().contains((Object)value)) {
                uy8.m((Object)value, (Object)" is not in the anchor list!", "The provided ");
                return null;
            }
            this.e().d.setValue((Object)value);
            final xc8 k = this.k;
            if (k != null) {
                final int h8 = this.e.h();
                final qzc l = this.l;
                int c = value.c(h8, k);
                if (l == qzc.w) {
                    c = h8 - c;
                }
                ((spg)o).x = 1;
                final Object b = this.b(c, 0.0f, (h07)o);
                final pc7 v2 = pc7.v;
                if (b == v2) {
                    return v2;
                }
            }
        }
        return lqo.a;
    }
    
    public final Object b(int v, final float n, final h07 h07) {
        while (true) {
            Label_0044: {
                if (!(h07 instanceof tpg)) {
                    break Label_0044;
                }
                final tpg tpg = (tpg)h07;
                final int y = tpg.y;
                if ((y & Integer.MIN_VALUE) == 0x0) {
                    break Label_0044;
                }
                tpg.y = y + Integer.MIN_VALUE;
                final Object o = tpg;
                final Object w = ((tpg)o).w;
                final int y2 = ((tpg)o).y;
                Label_0214: {
                    if (y2 != 0) {
                        Label_0100: {
                            if (y2 == 1) {
                                final int v2;
                                v = (v2 = ((tpg)o).v);
                                Label_0241: {
                                    try {
                                        vt4.g0(w);
                                        break Label_0214;
                                    }
                                    finally {
                                        break Label_0241;
                                    }
                                    break Label_0100;
                                }
                                this.i(v2);
                                this.j(false);
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(w);
                    this.j(true);
                    final float n2 = (float)this.f;
                    final float n3 = (float)v;
                    final bfa i = this.i;
                    if (i == null) {
                        mlc.j0("anchoringAnimationSpec");
                        throw null;
                    }
                    final goc goc = new goc((Object)this, (byte)29);
                    ((tpg)o).v = v;
                    ((tpg)o).y = 1;
                    final Object k = uoo.k(n2, n3, n, (cg0)i, (zta)goc, (h07)o);
                    final pc7 v3 = pc7.v;
                    if (k == v3) {
                        return v3;
                    }
                }
                this.i(v);
                this.j(false);
                return lqo.a;
            }
            final Object o = new tpg(this, h07);
            continue;
        }
    }
    
    public final List c() {
        return (List)this.g.getValue();
    }
    
    public final int d() {
        return this.e().c.h();
    }
    
    public final zpg e() {
        return (zpg)this.b.getValue();
    }
    
    public final int f() {
        final hsg e = this.e;
        if (e.h() != -1 && this.e().a.h() != -1) {
            return ncq.o(this.e().a.h(), 0, e.h());
        }
        return -1;
    }
    
    public final long g(final qlf qlf, int i, final float n) {
        final int n2 = 1;
        Object o;
        if (n >= 200.0f) {
            o = new rpg(i, this, (byte)0);
        }
        else if (n <= -200.0f) {
            o = new rpg(i, this, (byte)1);
        }
        else {
            o = new q25(i, (byte)5);
        }
        if (qlf.b != 0) {
            long d = qlf.d(0);
            Comparable comparable = (Comparable)((lta)o).b((Object)y8r.m(d));
            int b;
            long d2;
            Comparable comparable2;
            Comparable comparable3;
            for (b = qlf.b, i = n2; i < b; ++i, comparable = comparable3) {
                d2 = qlf.d(i);
                comparable2 = (Comparable)((lta)o).b((Object)y8r.m(d2));
                comparable3 = comparable;
                if (comparable.compareTo((Object)comparable2) > 0) {
                    comparable3 = comparable2;
                    d = d2;
                }
            }
            return d;
        }
        oyl.r();
        return 0L;
    }
    
    public final boolean h() {
        return (boolean)this.c.getValue() || (boolean)this.d.getValue();
    }
    
    public final void i(int o) {
        o = ncq.o(o, 0, this.e.h());
        if (o == this.e().c.h()) {
            return;
        }
        this.e().c.i(o);
        this.f = o;
    }
    
    public final void j(final boolean b) {
        this.d.setValue((Object)b);
    }
}
