import java.util.Map;

public final class r8k implements q8k
{
    public static final n9k z;
    public final Map v;
    public final tmf w;
    public u8k x;
    public final e0j y;
    
    static {
        z = new n9k((lta)new drj((byte)14), (zta)new cqg((byte)17));
    }
    
    public r8k(final Map v) {
        this.v = v;
        final long[] a = jak.a;
        this.w = new tmf();
        this.y = new e0j((Object)this, (byte)3);
    }
    
    public final void d(final Object o, final ye6 ye6, final gva gva, final int n) {
        gva.i0(533563200);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h(o)) {
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
            if (gva.h(ye6)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.h(this)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            gva.j0(o);
            final Object r = gva.R();
            final cib a = bi6.a;
            x8k x8k;
            if ((x8k = (x8k)r) == a) {
                final e0j y = this.y;
                if (!(boolean)y.b(o)) {
                    oyl.g((Object)lmf.r(o, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                    return;
                }
                final Map map = (Map)this.v.get(o);
                final b09 a2 = w8k.a;
                x8k = new x8k(new v8k(map, (lta)y));
                gva.q0(x8k);
            }
            final x8k x8k2 = x8k;
            c5q.d(new ffi[] { w8k.a.a(x8k2), cpd.a.a(x8k2) }, (zta)ye6, gva, (n6 & 0x70) | 0x8);
            final boolean h = gva.h(this);
            final boolean h2 = gva.h(o);
            final boolean h3 = gva.h(x8k2);
            final Object r2 = gva.R();
            Object o2;
            if ((h | h2 | h3) || (o2 = r2) == a) {
                o2 = new rx1((Object)this, o, (Object)x8k2, (byte)24);
                gva.q0(o2);
            }
            mlc.a((Object)lqo.a, (lta)o2, gva);
            if (gva.y && gva.G.i == gva.z) {
                gva.z = -1;
                gva.y = false;
            }
            gva.q(false);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0(n, (Object)this, o, (Object)ye6, (byte)12);
        }
    }
    
    public final void e(final Object o) {
        if (this.w.k(o) == null) {
            this.v.remove(o);
        }
    }
}
