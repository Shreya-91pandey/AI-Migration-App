package com.anthropic.claude.app;

public abstract class e3
{
    public static final void a(final gwj gwj, j7c j7c, ax3 ax3, ep0 ep0, final st4 st4, final u88 u88, final gva gva, final int n) {
        gva.i0(-341400297);
        int n2;
        if (gva.f((Object)gwj)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n | n2 | 0x12490;
        boolean b = true;
        st4 st7;
        u88 u90;
        if (gva.W(n3 & 0x1, (0x12493 & n3) != 0x12492)) {
            gva.b0();
            final cib a = bi6.a;
            int n4;
            ep0 ep2;
            st4 st5;
            u88 u89;
            Object o;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n4 = (n3 & 0xFFF8000F);
                final j7c j7c2 = j7c;
                ep2 = ep0;
                st5 = st4;
                u89 = u88;
                o = j7c2;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (j7c = (j7c)r) == a) {
                    j7c = (j7c)a2.d((Class)j7c.class, (emi)null);
                    gva.q0((Object)j7c);
                }
                o = j7c;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)ax3.class, (emi)null);
                    gva.q0(o2);
                }
                ax3 = (ax3)o2;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o3;
                if ((f5 | f6) || (o3 = r3) == a) {
                    o3 = a4.d((Class)ep0.class, (emi)null);
                    gva.q0(o3);
                }
                ep0 = (ep0)o3;
                final odk a5 = ii8.a(gva);
                final boolean f7 = gva.f((Object)null);
                final boolean f8 = gva.f((Object)a5);
                final Object r4 = gva.R();
                Object o4;
                if ((f7 | f8) || (o4 = r4) == a) {
                    o4 = a5.d((Class)st4.class, (emi)null);
                    gva.q0(o4);
                }
                final st4 st6 = (st4)o4;
                final odk a6 = ii8.a(gva);
                final boolean f9 = gva.f((Object)null);
                final boolean f10 = gva.f((Object)a6);
                final Object r5 = gva.R();
                Object o5;
                if ((f9 | f10) || (o5 = r5) == a) {
                    o5 = a6.d((Class)u88.class, (emi)null);
                    gva.q0(o5);
                }
                u89 = (u88)o5;
                n4 = (n3 & 0xFFF8000F);
                ep2 = ep0;
                st5 = st6;
            }
            gva.r();
            final boolean h = gva.h(o);
            if ((n4 & 0xE) != 0x4) {
                b = false;
            }
            final boolean h2 = gva.h((Object)ax3);
            final boolean h3 = gva.h((Object)ep2);
            final boolean h4 = gva.h((Object)st5);
            final boolean h5 = gva.h((Object)u89);
            final Object r6 = gva.R();
            Object o6 = null;
            ax3 ax4 = null;
            ep0 ep3 = null;
            Label_0640: {
                if (!(h | b | h2 | h3 | h4 | h5)) {
                    o6 = r6;
                    ax4 = ax3;
                    ep3 = ep2;
                    st7 = st5;
                    u90 = u89;
                    if (r6 != a) {
                        break Label_0640;
                    }
                }
                o6 = new ld0(o, (Object)gwj, (Object)ax3, (Object)ep2, (Object)st5, (Object)u89, (f07)null, (byte)2);
                ax4 = ax3;
                ep3 = ep2;
                st7 = st5;
                u90 = u89;
                gva.q0(o6);
            }
            mlc.i(new Object[] { gwj, o, ax3, ep2, st5, u89 }, (zta)o6, gva);
            ep0 = ep3;
            ax3 = ax4;
            j7c = (j7c)o;
        }
        else {
            gva.Z();
            u90 = u88;
            st7 = st4;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cf0((Object)gwj, (Object)j7c, (Object)ax3, (Object)ep0, (Object)st7, (Object)u90, n, (byte)5);
        }
    }
}
