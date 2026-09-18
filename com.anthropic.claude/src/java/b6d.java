import java.util.Map;

public final class b6d implements u8k, q8k
{
    public final v8k v;
    public final q8k w;
    public final umf x;
    
    public b6d(final u8k u8k, final Map map, final q8k w) {
        final p8a p8a = new p8a((Object)u8k, (byte)11);
        final b09 a = w8k.a;
        final v8k v = new v8k(map, (lta)p8a);
        this.v = v;
        this.w = w;
        final umf a2 = kak.a;
        this.x = new umf();
    }
    
    @Override
    public final t8k a(final jta jta, final String s) {
        return this.v.a(jta, s);
    }
    
    @Override
    public final boolean b(final Object o) {
        return this.v.b(o);
    }
    
    @Override
    public final Map c() {
        final umf x = this.x;
        final Object[] b = x.b;
        final long[] a = x.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            this.w.e(b[(n2 << 3) + i]);
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        return this.v.c();
    }
    
    @Override
    public final void d(final Object o, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-858296452);
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
            if (gva.h((Object)ye6)) {
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
            if (gva.h((Object)this)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            this.w.d(o, ye6, gva, n6 & 0x7E);
            final boolean h = gva.h((Object)this);
            final boolean h2 = gva.h(o);
            final Object r = gva.R();
            Object o2;
            if ((h | h2) || (o2 = r) == bi6.a) {
                o2 = new tt8((Object)this, o, (byte)8);
                gva.q0(o2);
            }
            mlc.a(o, (lta)o2, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0(n, (Object)this, o, (Object)ye6, (byte)7);
        }
    }
    
    @Override
    public final void e(final Object o) {
        this.w.e(o);
    }
    
    @Override
    public final Object f(final String s) {
        return this.v.f(s);
    }
}
