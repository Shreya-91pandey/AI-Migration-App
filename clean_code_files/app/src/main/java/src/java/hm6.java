import androidx.compose.ui.node.Owner;

public abstract class hm6
{
    public static final b09 a;
    public static final b09 b;
    public static final b09 c;
    public static final b09 d;
    public static final b09 e;
    public static final b09 f;
    public static final b09 g;
    public static final b09 h;
    public static final b09 i;
    public static final b09 j;
    public static final b09 k;
    public static final b09 l;
    public static final b09 m;
    public static final b09 n;
    public static final b09 o;
    public static final jm6 p;
    public static final b09 q;
    public static final b09 r;
    public static final b09 s;
    public static final b09 t;
    public static final b09 u;
    public static final b09 v;
    public static final b09 w;
    public static final b09 x;
    public static final b09 y;
    public static final b09 z;
    
    static {
        a = new b09((jta)new lv4((byte)17), (byte)1);
        b = new b09((jta)new lv4((byte)19), (byte)1);
        c = new b09((jta)new lv4((byte)24), (byte)1);
        d = new b09((jta)new lv4((byte)25), (byte)1);
        e = new b09((jta)new lv4((byte)26), (byte)1);
        f = new b09((jta)new lv4((byte)27), (byte)1);
        g = new b09((jta)new lv4((byte)29), (byte)1);
        h = new b09((jta)new cm6((byte)0), (byte)1);
        i = new b09((jta)new cm6((byte)1), (byte)1);
        j = new b09((jta)new cm6((byte)2), (byte)1);
        k = new b09((jta)new lv4((byte)28), (byte)1);
        l = new b09((jta)new cm6((byte)3), (byte)1);
        m = new b09((jta)new cm6((byte)4), (byte)1);
        n = new b09((jta)new cm6((byte)5), (byte)1);
        o = new b09((jta)new cm6((byte)6), (byte)1);
        p = new jm6((lta)new mz5((byte)25));
        q = new b09((jta)new cm6((byte)7), (byte)1);
        r = new b09((jta)new cm6((byte)8), (byte)1);
        s = new b09((jta)new cm6((byte)9), (byte)1);
        t = new b09((jta)new lv4((byte)18), (byte)1);
        u = new b09((jta)new lv4((byte)20), (byte)1);
        v = new b09((jta)new lv4((byte)21), (byte)1);
        w = new b09((jta)new lv4((byte)22), (byte)1);
        x = new b09((jta)new lv4((byte)23), (byte)1);
        y = new b09((jta)new lih((byte)0), (byte)0);
        z = new b09((jta)new cm6((byte)26), (byte)1);
    }
    
    public static final void a(final Owner owner, final vyo vyo, final ye6 ye6, final gva gva, final int n) {
        gva.i0(1925803616);
        int n2;
        if (gva.f((Object)owner)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)vyo)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)ye6)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n | n2 | n3 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            final ffi a = hm6.a.a((Object)owner.getAccessibilityManager());
            final ffi a2 = hm6.b.a((Object)owner.getAutofill());
            final ffi a3 = hm6.d.a((Object)owner.getAutofillManager());
            final ffi a4 = hm6.c.a((Object)owner.getAutofillTree());
            final ffi a5 = hm6.e.a((Object)owner.getClipboardManager());
            final ffi a6 = hm6.f.a((Object)owner.getClipboard());
            final ffi a7 = hm6.h.a((Object)owner.getDensity());
            final ffi a8 = hm6.i.a((Object)owner.getFocusOwner());
            final ffi a9 = hm6.j.a((Object)owner.getFontLoader());
            a9.g = false;
            final ffi a10 = hm6.k.a((Object)owner.getFontFamilyResolver());
            a10.g = false;
            final ffi a11 = hm6.l.a((Object)owner.getHapticFeedBack());
            final int n6 = n5 & 0xE;
            final boolean b = n6 == 4;
            Object r = gva.R();
            final cib a12 = bi6.a;
            if (b || r == a12) {
                r = new dm6(owner, (byte)0);
                gva.q0(r);
            }
            final ffi c = ((sei)hm6.m).c((lta)r);
            final ffi a13 = hm6.n.a((Object)owner.getLayoutDirection());
            final boolean b2 = n6 == 4;
            Object r2 = gva.R();
            if (b2 || r2 == a12) {
                r2 = new dm6(owner, (byte)1);
                gva.q0(r2);
            }
            final ffi c2 = ((sei)hm6.q).c((lta)r2);
            final boolean b3 = n6 == 4;
            final Object r3 = gva.R();
            Object o;
            if (b3 || (o = r3) == a12) {
                o = new dm6(owner, (byte)2);
                gva.q0(o);
            }
            final ffi c3 = ((sei)hm6.r).c((lta)o);
            final boolean b4 = n6 == 4;
            final Object r4 = gva.R();
            Object o2;
            if (b4 || (o2 = r4) == a12) {
                o2 = new dm6(owner, (byte)3);
                gva.q0(o2);
            }
            final ffi c4 = ((sei)hm6.s).c((lta)o2);
            final ffi a14 = hm6.t.a((Object)vyo);
            final ffi a15 = hm6.u.a((Object)owner.getViewConfiguration());
            final ffi a16 = hm6.v.a((Object)owner.getWindowInfo());
            final boolean b5 = n6 == 4;
            final Object r5 = gva.R();
            Object o3;
            if (b5 || (o3 = r5) == a12) {
                o3 = new dm6(owner, (byte)4);
                gva.q0(o3);
            }
            c5q.d(new ffi[] { a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, c, a13, c2, c3, c4, a14, a15, a16, ((sei)hm6.x).c((lta)o3), hm6.g.a((Object)owner.getGraphicsContext()), bpd.a.a((Object)owner.getRetainedValuesStore()), hm6.o.a((Object)owner.getLocaleList()) }, (zta)ye6, gva, (n5 >> 3 & 0x70) | 0x8);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)owner, (Object)vyo, (Object)ye6, (byte)7);
        }
    }
    
    public static final void b(final String s) {
        final StringBuilder sb = new StringBuilder("CompositionLocal ");
        sb.append(s);
        sb.append(" not present");
        throw new IllegalStateException(sb.toString().toString());
    }
}
