public final class j7d
{
    public final ksg A;
    public final ksg B;
    public kce a;
    public final b0j b;
    public final z9m c;
    public final vcc d;
    public dmn e;
    public final ksg f;
    public final ksg g;
    public nzc h;
    public final ksg i;
    public og0 j;
    public final ksg k;
    public final ksg l;
    public final ksg m;
    public final ksg n;
    public final ksg o;
    public boolean p;
    public final ksg q;
    public final fvc r;
    public final ksg s;
    public final ksg t;
    public lta u;
    public final gb7 v;
    public final gb7 w;
    public final gb7 x;
    public final y80 y;
    public long z;
    
    public j7d(final kce a, final b0j b, final z9m c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final vcc d = new vcc((byte)28, false);
        final og0 a2 = pg0.a;
        final long b2 = dnn.b;
        final mln w = new mln(a2, b2, (dnn)null);
        d.w = w;
        d.x = new f29(a2, w.b);
        this.d = d;
        final Boolean booleanFalse = Boolean.FALSE;
        this.f = o50.Q((Object)false);
        this.g = o50.Q((Object)new qs8(0.0f));
        this.i = o50.Q((Object)null);
        this.k = o50.Q((Object)tbb.v);
        this.l = o50.Q((Object)false);
        this.m = o50.Q((Object)false);
        this.n = o50.Q((Object)false);
        this.o = o50.Q((Object)false);
        this.p = true;
        this.q = o50.Q((Object)Boolean.TRUE);
        this.r = new fvc(c);
        this.s = o50.Q((Object)false);
        this.t = o50.Q((Object)false);
        this.u = (lta)new shc((byte)14);
        this.v = new gb7(this, (byte)1);
        this.w = new gb7(this, (byte)2);
        this.x = new gb7(this, (byte)3);
        this.y = uoo.d();
        this.z = j86.h;
        this.A = o50.Q((Object)new dnn(b2));
        this.B = o50.Q((Object)new dnn(b2));
    }
    
    public final tbb a() {
        return (tbb)this.k.getValue();
    }
    
    public final boolean b() {
        return (boolean)this.f.getValue();
    }
    
    public final nzc c() {
        final nzc h = this.h;
        if (h != null && h.p()) {
            return h;
        }
        return null;
    }
    
    public final pmn d() {
        return (pmn)this.i.getValue();
    }
    
    public final void e(final long n) {
        this.B.setValue((Object)new dnn(n));
    }
    
    public final void f(final long n) {
        this.A.setValue((Object)new dnn(n));
    }
}
