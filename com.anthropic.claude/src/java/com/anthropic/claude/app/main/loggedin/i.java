package com.anthropic.claude.app.main.loggedin;

import com.anthropic.claude.types.strings.OrganizationId;
import android.content.Context;
import com.anthropic.claude.connector.auth.b;

public abstract class i
{
    public static final void a(b b, final gva gva, final int n) {
        gva.i0(-1043534312);
        final int n2 = n | 0x2;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (b = (b)r) == a) {
                    b = (b)a2.d((Class)b.class, (emi)null);
                    gva.q0((Object)b);
                }
                b = b;
            }
            gva.r();
            final boolean h = gva.h((Object)b);
            final Object r2 = gva.R();
            Object o;
            if (h || (o = r2) == a) {
                o = new er6(b, (f07)null, (byte)1);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)b);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new goc((Object)b, n, (byte)6);
        }
    }
    
    public static final void b(sza sza, final gva gva, final int n) {
        gva.i0(624275909);
        final int n2 = n | 0x2;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (sza = (sza)r) == a) {
                    sza = (sza)a2.d((Class)sza.class, (emi)null);
                    gva.q0((Object)sza);
                }
                sza = sza;
            }
            gva.r();
            final boolean f3 = gva.f((Object)sza);
            final Object r2 = gva.R();
            Object o;
            if (f3 || (o = r2) == a) {
                o = new h80((byte)9, (f07)null, (Object)sza);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)sza);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new l0((Object)sza, n, (byte)20);
        }
    }
    
    public static final void c(l2g l2g, final gva gva, final int n) {
        gva.i0(156614345);
        final int n2 = n | 0x2;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (l2g = (l2g)r) == a) {
                    l2g = (l2g)a2.d((Class)l2g.class, (emi)null);
                    gva.q0((Object)l2g);
                }
                l2g = l2g;
            }
            gva.r();
            final Context context = (Context)gva.j((sei)q50.b);
            final boolean h = gva.h((Object)context);
            final boolean h2 = gva.h((Object)l2g);
            final Object r2 = gva.R();
            Object o;
            if ((h | h2) || (o = r2) == a) {
                o = new rf0((Object)context, (Object)l2g, (f07)null, (byte)14);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)l2g);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new l0((Object)l2g, n, (byte)19);
        }
    }
    
    public static final void d(final jta jta, aj1 aj1, d7 d7, final gva gva, final int n) {
        gva.i0(-362336564);
        int n2;
        if (gva.h((Object)jta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n | 0x90;
        if (gva.W(n3 & 0x1, (n3 & 0x93) != 0x92)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (aj1 = (aj1)r) == a) {
                    aj1 = (aj1)a2.d((Class)aj1.class, (emi)null);
                    gva.q0((Object)aj1);
                }
                final aj1 aj2 = aj1;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o;
                if ((f3 | f4) || (o = r2) == a) {
                    o = a3.d((Class)d7.class, (emi)null);
                    gva.q0(o);
                }
                d7 = (d7)o;
                aj1 = aj2;
            }
            gva.r();
            final bnf w = o50.W((Object)jta, gva);
            final boolean h = gva.h((Object)aj1);
            final boolean f5 = gva.f((Object)w);
            final boolean h2 = gva.h((Object)d7);
            final Object r3 = gva.R();
            Object o2;
            if ((h | f5 | h2) || (o2 = r3) == a) {
                o2 = new kd0(aj1, d7, w, (f07)null);
                gva.q0(o2);
            }
            mlc.f((zta)o2, gva, (Object)aj1);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)jta, (Object)aj1, (Object)d7, (byte)13);
        }
    }
    
    public static final void e(final String s, final wn wn, final jta jta, final jta jta2, final jta jta3, final igf igf, uh2 uh2, final gva gva, final int n) {
        gva.i0(-426141838);
        OrganizationId organizationId;
        if (s != null) {
            organizationId = new OrganizationId(s);
        }
        else {
            organizationId = null;
        }
        int n2;
        if (gva.f((Object)organizationId)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.d(((Enum)wn).ordinal())) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)jta)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.h((Object)jta2)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        int n6;
        if (gva.h((Object)jta3)) {
            n6 = 16384;
        }
        else {
            n6 = 8192;
        }
        int n7;
        if (gva.f((Object)igf)) {
            n7 = 131072;
        }
        else {
            n7 = 65536;
        }
        final int n8 = n | n2 | n3 | n4 | n5 | n6 | n7 | 0x80000;
        final boolean b = true;
        if (gva.W(n8 & 0x1, (0x92493 & n8) != 0x92492)) {
            gva.b0();
            final cib a = bi6.a;
            int n9;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n9 = (n8 & 0xFFC7FFFF);
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (uh2 = (uh2)r) == a) {
                    uh2 = (uh2)a2.d((Class)uh2.class, (emi)null);
                    gva.q0((Object)uh2);
                }
                uh2 = uh2;
                n9 = (n8 & 0xFFC7FFFF);
            }
            gva.r();
            final boolean b2 = (n9 & 0xE) == 0x4;
            final boolean b3 = (n9 & 0x70) == 0x20 && b;
            Object r2 = gva.R();
            if ((b2 | b3) || r2 == a) {
                r2 = new nob((Object)s, (Object)wn, (byte)10);
                gva.q0(r2);
            }
            final gwj c0 = ach.c0(v4j.a((Class)BootstrapScreen.class), tsf.E(v4j.a((Class)BootstrapScreen.class)), true, yi2.U((rtc)v4j.a((Class)BootstrapScreen.class)), (jta)r2, gva);
            x90.M(c0, gva);
            final boolean h = gva.h((Object)c0);
            final boolean h2 = gva.h((Object)uh2);
            final Object r3 = gva.R();
            Object o;
            if ((h | h2) || (o = r3) == a) {
                o = new nob((Object)c0, (Object)uh2, (byte)12);
                gva.q0(o);
            }
            d((jta)o, null, null, gva, 0);
            mlc.k(c0, (igf)null, (vlm)ao2.c0((ylm)ien.q(), (lta)null, 6), uuj.t0(-1328786601, (aua)new zqd(uh2, jta, jta2, jta3, igf, c0, s), gva), gva, 3072, 2);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ard(s, wn, jta, jta2, jta3, igf, uh2, n);
        }
    }
    
    public static final void f(final wn wn, final jta jta, final jta jta2, final igf igf, s3p s3p, bvd bvd, final gva gva, final int n) {
        gva.i0(-826149050);
        int n2;
        if (gva.d(((Enum)wn).ordinal())) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)jta)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)jta2)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.f((Object)igf)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        final int n6 = n | n2 | n3 | n4 | n5 | 0x12000;
        final boolean b = true;
        s3p s3p3;
        bvd bvd2;
        if (gva.W(n6 & 0x1, (0x12493 & n6) != 0x12492)) {
            gva.b0();
            final cib a = bi6.a;
            int n7;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n7 = (n6 & 0xFFF81FFF);
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (s3p = (s3p)r) == a) {
                    s3p = (s3p)a2.d((Class)s3p.class, (emi)null);
                    gva.q0((Object)s3p);
                }
                final s3p s3p2 = s3p;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o;
                if ((f3 | f4) || (o = r2) == a) {
                    o = a3.d((Class)bvd.class, (emi)null);
                    gva.q0(o);
                }
                bvd = (bvd)o;
                n7 = (n6 & 0xFFF81FFF);
                s3p = s3p2;
            }
            gva.r();
            Object o2;
            if ((o2 = gva.R()) == a) {
                o2 = mlc.z((hc7)o89.v, gva);
                gva.q0(o2);
            }
            final oc7 oc7 = (oc7)o2;
            final boolean f5 = gva.f((Object)s3p);
            final boolean b2 = (n7 & 0xE) == 0x4 && b;
            Object r3 = gva.R();
            if ((f5 | b2) || r3 == a) {
                r3 = new nob((Object)s3p, (Object)wn, (byte)11);
                gva.q0(r3);
            }
            final gwj c0 = ach.c0(v4j.a((Class)LoggedInScreens.class), tsf.E(v4j.a((Class)LoggedInScreens.class)), true, yi2.U((rtc)v4j.a((Class)LoggedInScreens.class)), (jta)r3, gva);
            x90.M(c0, gva);
            Object r4;
            if ((r4 = gva.R()) == a) {
                r4 = new hu4((byte)2);
                gva.q0(r4);
            }
            mlc.k(c0, (igf)null, (vlm)ao2.b0(3, (lta)null, (cua)r4), uuj.t0(-1591109893, (aua)new yqd(bvd, oc7, s3p, c0, wn, igf, jta2, jta), gva), gva, 3072, 2);
            s3p3 = s3p;
            bvd2 = bvd;
        }
        else {
            gva.Z();
            s3p3 = s3p;
            bvd2 = bvd;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cf0(wn, jta, jta2, igf, s3p3, bvd2, n);
        }
    }
    
    public static final void g(final ye6 ye6, final gva gva, final int n) {
        gva.i0(-813978306);
        if (gva.W(n & 0x1, (n & 0x3) != 0x2)) {
            final odk a = ii8.a(gva);
            final boolean f = gva.f((Object)null);
            final boolean f2 = gva.f((Object)a);
            final Object r = gva.R();
            Object o;
            if ((f | f2) || (o = r) == bi6.a) {
                o = a.d((Class)krf.class, (emi)null);
                gva.q0(o);
            }
            p37 p3;
            if (((krf)o).d.g()) {
                p3 = p37.B;
            }
            else {
                p3 = p37.A;
            }
            c5q.c(q37.a().a((Object)p3), (zta)ye6, gva, 56);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cz0(ye6, n, (byte)21);
        }
    }
    
    public static final void h(final s3p s3p, final ye6 ye6, final gva gva, final int n) {
        gva.i0(1268586615);
        int n2;
        if (gva.f((Object)s3p)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
            c5q.d(new ffi[] { y3p.a.a((Object)s3p), ul3.a.a((Object)new tl3(s3p.d, 2)) }, (zta)uuj.t0(-530326217, (aua)new bc3(ye6, (byte)8), gva), gva, 48);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)s3p, (Object)ye6, n, (byte)27);
        }
    }
    
    public static final void i(kgg kgg, final gva gva, final int n) {
        gva.i0(213627109);
        final int n2 = n | 0x2;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (kgg = (kgg)r) == a) {
                    kgg = (kgg)a2.d((Class)kgg.class, (emi)null);
                    gva.q0((Object)kgg);
                }
                kgg = kgg;
            }
            gva.r();
            final boolean h = gva.h((Object)kgg);
            final Object r2 = gva.R();
            Object o;
            if (h || (o = r2) == a) {
                o = new h80((byte)10, (f07)null, (Object)kgg);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)kgg);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new l0((Object)kgg, n, (byte)22);
        }
    }
    
    public static final void j(c2p c2p, final gva gva, final int n) {
        gva.i0(-878232869);
        final int n2 = n | 0x2;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (c2p = (c2p)r) == a) {
                    c2p = (c2p)a2.d((Class)c2p.class, (emi)null);
                    gva.q0((Object)c2p);
                }
                c2p = c2p;
            }
            gva.r();
            final boolean h = gva.h((Object)c2p);
            final Object r2 = gva.R();
            Object o;
            if (h || (o = r2) == a) {
                o = new pn((byte)22, (f07)null, (Object)c2p);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)c2p);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new l0((Object)c2p, n, (byte)21);
        }
    }
    
    public static final void k(ywp ywp, final gva gva, final int n) {
        gva.i0(-397102258);
        final int n2 = n | 0x2;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (ywp = (ywp)r) == a) {
                    ywp = (ywp)a2.d((Class)ywp.class, (emi)null);
                    gva.q0((Object)ywp);
                }
                ywp = ywp;
            }
            gva.r();
            final boolean h = gva.h((Object)ywp);
            final Object r2 = gva.R();
            Object o;
            if (h || (o = r2) == a) {
                o = new h80((byte)11, (f07)null, (Object)ywp);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)ywp);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new l0((Object)ywp, n, (byte)18);
        }
    }
    
    public static final void l(final s3p s3p, final lta lta, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-1323192555);
        int n2;
        if (gva.f((Object)s3p)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)lta)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        if (gva.W(n4 & 0x1, (n4 & 0x93) != 0x92)) {
            h(s3p, uuj.t0(-304359442, (aua)new xqd(s3p, lta, ye6), gva), gva, (n4 & 0xE) | 0x30);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new xqd(s3p, lta, ye6, n);
        }
    }
    
    public static final void m(l9o l9o, ede ede, final gva gva, final int n) {
        gva.i0(1878732986);
        final int n2 = n | 0x12;
        if (gva.W(n2 & 0x1, (n2 & 0x13) != 0x12)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (l9o = (l9o)r) == a) {
                    l9o = (l9o)a2.d((Class)l9o.class, (emi)null);
                    gva.q0((Object)l9o);
                }
                final l9o l9o2 = l9o;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o;
                if ((f3 | f4) || (o = r2) == a) {
                    o = a3.d((Class)ede.class, (emi)null);
                    gva.q0(o);
                }
                ede = (ede)o;
                l9o = l9o2;
            }
            gva.r();
            final boolean h = gva.h((Object)ede);
            final boolean h2 = gva.h((Object)l9o);
            final Object r3 = gva.R();
            Object o2;
            if ((h | h2) || (o2 = r3) == a) {
                o2 = new frd((Object)ede, (Object)l9o, (f07)null, (byte)0);
                gva.q0(o2);
            }
            mlc.f((zta)o2, gva, (Object)ede);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)l9o, (Object)ede, n, (byte)26);
        }
    }
}
