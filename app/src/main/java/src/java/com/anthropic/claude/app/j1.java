package com.anthropic.claude.app;

import java.util.ListIterator;
import android.content.Context;

public abstract class j1
{
    public static final void a(final int n, final jta jta, final gva gva, final igf igf) {
        gva.i0(-168029993);
        int n2;
        if (gva.h((Object)jta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)igf)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final odk odk = (odk)gva.j((sei)ii8.a);
            final boolean h = gva.h((Object)odk);
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if (h || (o = r) == a) {
                o = new g64(odk, (byte)1);
                gva.q0(o);
            }
            final r3p r3p = (r3p)rhc.S(v4j.a((Class)r3p.class), (Object)tsf.E(v4j.a((Class)r3p.class)), (lta)o, gva);
            final odk a2 = ii8.a(gva);
            final boolean h2 = gva.h((Object)a2);
            final Object r2 = gva.R();
            Object o2;
            if (h2 || (o2 = r2) == a) {
                o2 = new g64(a2, (byte)2);
                gva.q0(o2);
            }
            final ew4 ew4 = (ew4)rhc.S(v4j.a((Class)ew4.class), (Object)tsf.E(v4j.a((Class)ew4.class)), (lta)o2, gva);
            ion.a(false, (w73)null, (vy4)null, (zta)uuj.t0(94407418, (aua)new av4(jta, (Context)gva.j((sei)q50.b), igf, (byte)0), gva), gva, 3072, 7);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new dv4(jta, igf, n);
        }
    }
    
    public static final void b(dg dg, l9o l9o, s3p s3p, final zta zta, final gva gva, final int n) {
        gva.i0(596781142);
        int n2;
        if (gva.h((Object)zta)) {
            n2 = 2048;
        }
        else {
            n2 = 1024;
        }
        final int n3 = n | 0x92 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x493) != 0x492)) {
            gva.b0();
            final cib a = bi6.a;
            Object o;
            s3p s3p3;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final s3p s3p2 = s3p;
                o = dg;
                s3p3 = s3p2;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (dg = (dg)r) == a) {
                    dg = (dg)a2.d((Class)dg.class, (emi)null);
                    gva.q0((Object)dg);
                }
                o = dg;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)l9o.class, (emi)null);
                    gva.q0(o2);
                }
                l9o = (l9o)o2;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o3;
                if ((f5 | f6) || (o3 = r3) == a) {
                    o3 = a4.d((Class)s3p.class, (emi)null);
                    gva.q0(o3);
                }
                s3p3 = (s3p)o3;
            }
            gva.r();
            final bnf w = o50.W((Object)zta, gva);
            if (((dg)o).a()) {
                gva.g0(1837765622);
                final boolean h = gva.h(o);
                final boolean f7 = gva.f((Object)w);
                final boolean h2 = gva.h((Object)l9o);
                final boolean f8 = gva.f((Object)s3p3);
                final Object r4 = gva.R();
                Object o4;
                if ((h | f7 | h2 | f8) || (o4 = r4) == a) {
                    o4 = new fd0(o, (Object)w, (Object)l9o, (Object)s3p3, (byte)4);
                    gva.q0(o4);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o4, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(1838032780);
                gva.q(false);
            }
            final s3p s3p4 = s3p3;
            dg = (dg)o;
            s3p = s3p4;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cj4((byte)1, n, (Object)dg, (Object)l9o, (Object)s3p, (Object)zta);
        }
    }
    
    public static final void c(a7e a7e, b7e b7e, final gva gva, final int n) {
        gva.i0(1233496985);
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
                if ((f | f2) || (a7e = (a7e)r) == a) {
                    a7e = (a7e)a2.d((Class)a7e.class, (emi)null);
                    gva.q0((Object)a7e);
                }
                final a7e a7e2 = a7e;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o;
                if ((f3 | f4) || (o = r2) == a) {
                    o = a3.d((Class)b7e.class, (emi)null);
                    gva.q0(o);
                }
                b7e = (b7e)o;
                a7e = a7e2;
            }
            gva.r();
            if (a7e.a.getValue() != null) {
                gva.g0(-631236909);
                final boolean h = gva.h((Object)a7e);
                final boolean h2 = gva.h((Object)b7e);
                final Object r3 = gva.R();
                Object o2;
                if ((h | h2) || (o2 = r3) == a) {
                    o2 = new e4((Object)a7e, (Object)b7e, (byte)20);
                    gva.q0(o2);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o2, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(-631000503);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)a7e, (Object)b7e, n, (byte)16);
        }
    }
    
    public static final void d(final zta zta, ubg ubg, tbg tbg, final gva gva, final int n) {
        gva.i0(-614688130);
        int n2;
        if (gva.h((Object)zta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n | n2 | 0x90;
        if (gva.W(n3 & 0x1, (n3 & 0x93) != 0x92)) {
            gva.b0();
            final cib a = bi6.a;
            tbg tbg2;
            Object o;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final ubg ubg2 = ubg;
                tbg2 = tbg;
                o = ubg2;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (ubg = (ubg)r) == a) {
                    ubg = (ubg)a2.d((Class)ubg.class, (emi)null);
                    gva.q0((Object)ubg);
                }
                o = ubg;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)tbg.class, (emi)null);
                    gva.q0(o2);
                }
                tbg2 = (tbg)o2;
            }
            gva.r();
            final Context context = (Context)gva.j((sei)q50.b);
            final bnf w = o50.W((Object)zta, gva);
            if (((ubg)o).a()) {
                gva.g0(1566956264);
                final boolean h = gva.h(o);
                final boolean h2 = gva.h((Object)tbg2);
                final boolean h3 = gva.h((Object)context);
                final boolean f5 = gva.f((Object)w);
                final Object r3 = gva.R();
                Object o3;
                if ((h | h2 | h3 | f5) || (o3 = r3) == a) {
                    o3 = new fd0(o, (Object)tbg2, (Object)context, (Object)w, (byte)3);
                    gva.q0(o3);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o3, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(1568428516);
                gva.q(false);
            }
            final tbg tbg3 = tbg2;
            ubg = (ubg)o;
            tbg = tbg3;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)zta, (Object)ubg, (Object)tbg, (byte)1);
        }
    }
    
    public static final void e(lcg lcg, st4 st4, final s3p s3p, u9 u9, final jj4 jj4, final lta lta, final gva gva, final int n) {
        gva.i0(-742673813);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 131072;
        }
        else {
            n2 = 65536;
        }
        final int n3 = n | 0x2492 | n2;
        jj4 jj6;
        s3p s3p4;
        if (gva.W(n3 & 0x1, (0x12493 & n3) != 0x12492)) {
            gva.b0();
            final cib a = bi6.a;
            jj4 jj5;
            Object o;
            st4 st5;
            s3p s3p2;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final lcg lcg2 = lcg;
                jj5 = jj4;
                o = lcg2;
                st5 = st4;
                s3p2 = s3p;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (lcg = (lcg)r) == a) {
                    lcg = (lcg)a2.d((Class)lcg.class, (emi)null);
                    gva.q0((Object)lcg);
                }
                o = lcg;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)st4.class, (emi)null);
                    gva.q0(o2);
                }
                st5 = (st4)o2;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o3;
                if ((f5 | f6) || (o3 = r3) == a) {
                    o3 = a4.d((Class)s3p.class, (emi)null);
                    gva.q0(o3);
                }
                s3p2 = (s3p)o3;
                final odk a5 = ii8.a(gva);
                final boolean f7 = gva.f((Object)null);
                final boolean f8 = gva.f((Object)a5);
                final Object r4 = gva.R();
                Object o4;
                if ((f7 | f8) || (o4 = r4) == a) {
                    o4 = a5.d((Class)u9.class, (emi)null);
                    gva.q0(o4);
                }
                u9 = (u9)o4;
                final odk a6 = ii8.a(gva);
                final boolean f9 = gva.f((Object)null);
                final boolean f10 = gva.f((Object)a6);
                final Object r5 = gva.R();
                Object o5;
                if ((f9 | f10) || (o5 = r5) == a) {
                    o5 = a6.d((Class)jj4.class, (emi)null);
                    gva.q0(o5);
                }
                jj5 = (jj4)o5;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (((lcg)o).a()) {
                gva.g0(-1618470453);
                final boolean h = gva.h(o);
                final boolean h2 = gva.h((Object)u9);
                final boolean h3 = gva.h((Object)st5);
                final boolean f11 = gva.f((Object)s3p2);
                final boolean f12 = gva.f((Object)w);
                final boolean h4 = gva.h((Object)jj5);
                Object r6 = gva.R();
                if ((h | h2 | h3 | f11 | f12 | h4) || r6 == a) {
                    r6 = new tj2(o, (Object)u9, (Object)st5, (Object)s3p2, (Object)w, (Object)jj5, (byte)1);
                    gva.q0(r6);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)r6, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(-1616460041);
                gva.q(false);
            }
            final st4 st6 = st5;
            final s3p s3p3 = s3p2;
            jj6 = jj5;
            lcg = (lcg)o;
            st4 = st6;
            s3p4 = s3p3;
        }
        else {
            gva.Z();
            jj6 = jj4;
            s3p4 = s3p;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cf0((Object)lcg, (Object)st4, (Object)s3p4, (Object)u9, (Object)jj6, (Object)lta, n, (byte)1);
        }
    }
    
    public static final void f(final gwj gwj, final gva gva, final int n) {
        gva.i0(1485192095);
        int n2;
        if (gva.f((Object)gwj)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final boolean b = (n3 & 0xE) == 0x4;
            final Object r = gva.R();
            Object o;
            if (b || (o = r) == bi6.a) {
                o = new tc4(gwj, (byte)1);
                gva.q0(o);
            }
            ao2.p((lta)o, gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cv4(gwj, n);
        }
    }
    
    public static final void g(pcg pcg, final lta lta, final gva gva, final int n) {
        gva.i0(1864225008);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | 0x2 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
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
                if ((f | f2) || (pcg = (pcg)r) == a) {
                    pcg = (pcg)a2.d((Class)pcg.class, (emi)null);
                    gva.q0((Object)pcg);
                }
                pcg = pcg;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (pcg.a()) {
                gva.g0(-1094630505);
                final boolean h = gva.h((Object)pcg);
                final boolean f3 = gva.f((Object)w);
                final Object r2 = gva.R();
                Object o;
                if ((h | f3) || (o = r2) == a) {
                    o = new e4((Object)pcg, (Object)w, (byte)14);
                    gva.q0(o);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(-1094450798);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)pcg, (Object)lta, n, (byte)9);
        }
    }
    
    public static final void h(tcg tcg, st4 st4, s3p s3p, final u9 u9, final lta lta, final gva gva, final int n) {
        gva.i0(1470842375);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 16384;
        }
        else {
            n2 = 8192;
        }
        final int n3 = n | 0x492 | n2;
        u9 u10;
        s3p s3p4;
        if (gva.W(n3 & 0x1, (n3 & 0x2493) != 0x2492)) {
            gva.b0();
            final cib a = bi6.a;
            st4 st5;
            s3p s3p2;
            Object o;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final tcg tcg2 = tcg;
                st5 = st4;
                s3p2 = s3p;
                u10 = u9;
                o = tcg2;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (tcg = (tcg)r) == a) {
                    tcg = (tcg)a2.d((Class)tcg.class, (emi)null);
                    gva.q0((Object)tcg);
                }
                o = tcg;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)st4.class, (emi)null);
                    gva.q0(o2);
                }
                st4 = (st4)o2;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o3;
                if ((f5 | f6) || (o3 = r3) == a) {
                    o3 = a4.d((Class)s3p.class, (emi)null);
                    gva.q0(o3);
                }
                s3p = (s3p)o3;
                final odk a5 = ii8.a(gva);
                final boolean f7 = gva.f((Object)null);
                final boolean f8 = gva.f((Object)a5);
                final Object r4 = gva.R();
                Object o4;
                if ((f7 | f8) || (o4 = r4) == a) {
                    o4 = a5.d((Class)u9.class, (emi)null);
                    gva.q0(o4);
                }
                final u9 u11 = (u9)o4;
                st5 = st4;
                s3p2 = s3p;
                u10 = u11;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (((tcg)o).a()) {
                gva.g0(609296868);
                final boolean h = gva.h(o);
                final boolean h2 = gva.h((Object)u10);
                final boolean f9 = gva.f((Object)s3p2);
                final boolean h3 = gva.h((Object)st5);
                final boolean f10 = gva.f((Object)w);
                final Object r5 = gva.R();
                Object o5;
                if ((h | h2 | f9 | h3 | f10) || (o5 = r5) == a) {
                    o5 = new qe(o, (Object)u10, (Object)s3p2, w, (Object)st5, (byte)2);
                    gva.q0(o5);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o5, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(609995515);
                gva.q(false);
            }
            final s3p s3p3 = s3p2;
            st4 = st5;
            tcg = (tcg)o;
            s3p4 = s3p3;
        }
        else {
            gva.Z();
            final s3p s3p5 = s3p;
            u10 = u9;
            s3p4 = s3p5;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new bv4((lrf)tcg, st4, s3p4, u10, lta, n, (byte)2);
        }
    }
    
    public static final void i(ucg ucg, final jta jta, final gva gva, final int n) {
        gva.i0(373479);
        int n2;
        if (gva.h((Object)jta)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | 0x2 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
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
                if ((f | f2) || (ucg = (ucg)r) == a) {
                    ucg = (ucg)a2.d((Class)ucg.class, (emi)null);
                    gva.q0((Object)ucg);
                }
                ucg = ucg;
            }
            gva.r();
            final bnf w = o50.W((Object)jta, gva);
            if (ucg.a()) {
                gva.g0(-1758365363);
                final boolean h = gva.h((Object)ucg);
                final boolean f3 = gva.f((Object)w);
                final Object r2 = gva.R();
                Object o;
                if ((h | f3) || (o = r2) == a) {
                    o = new e4((Object)ucg, (Object)w, (byte)15);
                    gva.q0(o);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(-1758198149);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)ucg, (Object)jta, n, (byte)10);
        }
    }
    
    public static final void j(wcg wcg, final lta lta, final gva gva, final int n) {
        gva.i0(-331030776);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | 0x2 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
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
                if ((f | f2) || (wcg = (wcg)r) == a) {
                    wcg = (wcg)a2.d((Class)wcg.class, (emi)null);
                    gva.q0((Object)wcg);
                }
                wcg = wcg;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (wcg.a()) {
                gva.g0(-492687516);
                final boolean h = gva.h((Object)wcg);
                final boolean f3 = gva.f((Object)w);
                final Object r2 = gva.R();
                Object o;
                if ((h | f3) || (o = r2) == a) {
                    o = new e4((Object)wcg, (Object)w, (byte)13);
                    gva.q0(o);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(-492451110);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)wcg, (Object)lta, n, (byte)8);
        }
    }
    
    public static final void k(ycg ycg, st4 st4, s3p s3p, final u9 u9, final lta lta, final gva gva, final int n) {
        gva.i0(-1785949715);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 16384;
        }
        else {
            n2 = 8192;
        }
        final int n3 = n | 0x492 | n2;
        u9 u10;
        s3p s3p4;
        if (gva.W(n3 & 0x1, (n3 & 0x2493) != 0x2492)) {
            gva.b0();
            final cib a = bi6.a;
            st4 st5;
            s3p s3p2;
            Object o;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final ycg ycg2 = ycg;
                st5 = st4;
                s3p2 = s3p;
                u10 = u9;
                o = ycg2;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (ycg = (ycg)r) == a) {
                    ycg = (ycg)a2.d((Class)ycg.class, (emi)null);
                    gva.q0((Object)ycg);
                }
                o = ycg;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)st4.class, (emi)null);
                    gva.q0(o2);
                }
                st4 = (st4)o2;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o3;
                if ((f5 | f6) || (o3 = r3) == a) {
                    o3 = a4.d((Class)s3p.class, (emi)null);
                    gva.q0(o3);
                }
                s3p = (s3p)o3;
                final odk a5 = ii8.a(gva);
                final boolean f7 = gva.f((Object)null);
                final boolean f8 = gva.f((Object)a5);
                final Object r4 = gva.R();
                Object o4;
                if ((f7 | f8) || (o4 = r4) == a) {
                    o4 = a5.d((Class)u9.class, (emi)null);
                    gva.q0(o4);
                }
                final u9 u11 = (u9)o4;
                st5 = st4;
                s3p2 = s3p;
                u10 = u11;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (((ycg)o).a()) {
                gva.g0(827369680);
                final boolean h = gva.h(o);
                final boolean h2 = gva.h((Object)u10);
                final boolean f9 = gva.f((Object)s3p2);
                final boolean h3 = gva.h((Object)st5);
                final boolean f10 = gva.f((Object)w);
                final Object r5 = gva.R();
                Object o5;
                if ((h | h2 | f9 | h3 | f10) || (o5 = r5) == a) {
                    o5 = new qe(o, (Object)u10, (Object)s3p2, w, (Object)st5, (byte)1);
                    gva.q0(o5);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o5, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(828204789);
                gva.q(false);
            }
            final s3p s3p3 = s3p2;
            st4 = st5;
            ycg = (ycg)o;
            s3p4 = s3p3;
        }
        else {
            gva.Z();
            final s3p s3p5 = s3p;
            u10 = u9;
            s3p4 = s3p5;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new bv4((lrf)ycg, st4, s3p4, u10, lta, n, (byte)1);
        }
    }
    
    public static final void l(adg adg, u9 u9, final zta zta, final gva gva, final int n) {
        gva.i0(2119956867);
        int n2;
        if (gva.h((Object)zta)) {
            n2 = 256;
        }
        else {
            n2 = 128;
        }
        final int n3 = n | 0x12 | n2;
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
                if ((f | f2) || (adg = (adg)r) == a) {
                    adg = (adg)a2.d((Class)adg.class, (emi)null);
                    gva.q0((Object)adg);
                }
                final adg adg2 = adg;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o;
                if ((f3 | f4) || (o = r2) == a) {
                    o = a3.d((Class)u9.class, (emi)null);
                    gva.q0(o);
                }
                u9 = (u9)o;
                adg = adg2;
            }
            gva.r();
            final bnf w = o50.W((Object)zta, gva);
            if (adg.a()) {
                gva.g0(-1858736358);
                final boolean h = gva.h((Object)adg);
                final boolean h2 = gva.h((Object)u9);
                final boolean f5 = gva.f((Object)w);
                final Object r3 = gva.R();
                Object o2;
                if ((h | h2 | f5) || (o2 = r3) == a) {
                    o2 = new rx1((Object)adg, (Object)u9, w, (byte)7);
                    gva.q0(o2);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o2, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(-1858239521);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)adg, (Object)u9, (Object)zta, (byte)4);
        }
    }
    
    public static final void m(gdg gdg, u9 u9, final lta lta, final gva gva, final int n) {
        gva.i0(1861270636);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 256;
        }
        else {
            n2 = 128;
        }
        final int n3 = n | 0x12 | n2;
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
                if ((f | f2) || (gdg = (gdg)r) == a) {
                    gdg = (gdg)a2.d((Class)gdg.class, (emi)null);
                    gva.q0((Object)gdg);
                }
                final gdg gdg2 = gdg;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o;
                if ((f3 | f4) || (o = r2) == a) {
                    o = a3.d((Class)u9.class, (emi)null);
                    gva.q0(o);
                }
                u9 = (u9)o;
                gdg = gdg2;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (gdg.a()) {
                gva.g0(1086052024);
                final boolean h = gva.h((Object)gdg);
                final boolean h2 = gva.h((Object)u9);
                final boolean f5 = gva.f((Object)w);
                final Object r3 = gva.R();
                Object o2;
                if ((h | h2 | f5) || (o2 = r3) == a) {
                    o2 = new rx1((Object)gdg, (Object)u9, w, (byte)5);
                    gva.q0(o2);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o2, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(1086572886);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)gdg, (Object)u9, (Object)lta, (byte)2);
        }
    }
    
    public static final void n(idg idg, final lta lta, final gva gva, final int n) {
        gva.i0(-1827773920);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | 0x2 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
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
                if ((f | f2) || (idg = (idg)r) == a) {
                    idg = (idg)a2.d((Class)idg.class, (emi)null);
                    gva.q0((Object)idg);
                }
                idg = idg;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (idg.a()) {
                gva.g0(382768747);
                final boolean h = gva.h((Object)idg);
                final boolean f3 = gva.f((Object)w);
                final Object r2 = gva.R();
                Object o;
                if ((h | f3) || (o = r2) == a) {
                    o = new e4((Object)idg, (Object)w, (byte)18);
                    gva.q0(o);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(382944610);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)idg, (Object)lta, n, (byte)13);
        }
    }
    
    public static final void o(qdg qdg, final lta lta, final gva gva, final int n) {
        gva.i0(194506202);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | 0x2 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
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
                if ((f | f2) || (qdg = (qdg)r) == a) {
                    qdg = (qdg)a2.d((Class)qdg.class, (emi)null);
                    gva.q0((Object)qdg);
                }
                qdg = qdg;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (qdg.a()) {
                gva.g0(623659550);
                final boolean h = gva.h((Object)qdg);
                final boolean f3 = gva.f((Object)w);
                final Object r2 = gva.R();
                Object o;
                if ((h | f3) || (o = r2) == a) {
                    o = new e4((Object)qdg, (Object)w, (byte)17);
                    gva.q0(o);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(623915176);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)qdg, (Object)lta, n, (byte)12);
        }
    }
    
    public static final void p(sdg sdg, final lta lta, final gva gva, final int n) {
        gva.i0(-254559718);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | 0x2 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
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
                if ((f | f2) || (sdg = (sdg)r) == a) {
                    sdg = (sdg)a2.d((Class)sdg.class, (emi)null);
                    gva.q0((Object)sdg);
                }
                sdg = sdg;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (sdg.a()) {
                gva.g0(1323990809);
                final boolean h = gva.h((Object)sdg);
                final boolean f3 = gva.f((Object)w);
                final Object r2 = gva.R();
                Object o;
                if ((h | f3) || (o = r2) == a) {
                    o = new e4((Object)sdg, (Object)w, (byte)16);
                    gva.q0(o);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(1324220488);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)sdg, (Object)lta, n, (byte)11);
        }
    }
    
    public static final void q(udg udg, final zta zta, final gva gva, final int n) {
        gva.i0(-53707928);
        int n2;
        if (gva.f((Object)zta)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | 0x2 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
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
                if ((f | f2) || (udg = (udg)r) == a) {
                    udg = (udg)a2.d((Class)udg.class, (emi)null);
                    gva.q0((Object)udg);
                }
                udg = udg;
            }
            gva.r();
            final bnf w = o50.W((Object)zta, gva);
            Object o;
            if ((o = gva.R()) == a) {
                o = mlc.z((hc7)o89.v, gva);
                gva.q0(o);
            }
            final oc7 oc7 = (oc7)o;
            if (udg.a()) {
                gva.g0(2010289246);
                final boolean h = gva.h((Object)udg);
                final boolean h2 = gva.h((Object)oc7);
                final boolean f3 = gva.f((Object)w);
                final Object r2 = gva.R();
                Object o2;
                if ((h | h2 | f3) || (o2 = r2) == a) {
                    o2 = new rx1((Object)udg, (Object)oc7, w, (byte)6);
                    gva.q0(o2);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o2, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(2010531418);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)udg, (Object)zta, n, (byte)14);
        }
    }
    
    public static final void r(j7c j7c, unm unm, final zta zta, final gva gva, final int n) {
        gva.i0(2115717100);
        int n2;
        if (gva.h((Object)zta)) {
            n2 = 256;
        }
        else {
            n2 = 128;
        }
        final int n3 = n | 0x12 | n2;
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
                if ((f | f2) || (j7c = (j7c)r) == a) {
                    j7c = (j7c)a2.d((Class)j7c.class, (emi)null);
                    gva.q0((Object)j7c);
                }
                final j7c j7c2 = j7c;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o;
                if ((f3 | f4) || (o = r2) == a) {
                    o = a3.d((Class)unm.class, (emi)null);
                    gva.q0(o);
                }
                final unm unm2 = (unm)o;
                j7c = j7c2;
                unm = unm2;
            }
            gva.r();
            final bnf w = o50.W((Object)zta, gva);
            final v8m a4 = j7c.a;
            boolean b = false;
            Label_0321: {
                Label_0270: {
                    if (!a4.isEmpty()) {
                        final ListIterator listIterator = a4.listIterator();
                        xgd xgd;
                        do {
                            xgd = (xgd)listIterator;
                            if (xgd.hasNext()) {
                                continue;
                            }
                            break Label_0270;
                        } while (mlc.q((Object)((i7c)xgd.next()).a(), (Object)jql.a));
                        b = true;
                        break Label_0321;
                    }
                }
                b = false;
            }
            final boolean a5 = unm.a();
            final wnm wnm = (wnm)unm.a.getValue();
            final iql c = j7c.c();
            final boolean b2 = b || a5;
            final boolean g = gva.g(b2);
            final boolean f5 = gva.f((Object)w);
            final boolean h = gva.h((Object)wnm);
            final boolean h2 = gva.h((Object)c);
            final Object r3 = gva.R();
            Object o2;
            if ((g | f5 | h | h2) || (o2 = r3) == a) {
                o2 = new fv4(b2, (Object)w, (Object)wnm, (Object)c, (byte)0);
                gva.q0(o2);
            }
            t08.h((Object)b2, (Object)c, (gbd)null, (lta)o2, gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)j7c, (Object)unm, (Object)zta, (byte)3);
        }
    }
    
    public static final void s(ihp ihp, final lta lta, final gva gva, final int n) {
        gva.i0(-1595449538);
        int n2;
        if (gva.h((Object)lta)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | 0x2 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
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
                if ((f | f2) || (ihp = (ihp)r) == a) {
                    ihp = (ihp)a2.d((Class)ihp.class, (emi)null);
                    gva.q0((Object)ihp);
                }
                ihp = ihp;
            }
            gva.r();
            final bnf w = o50.W((Object)lta, gva);
            if (ihp.a()) {
                gva.g0(-1928859341);
                final boolean h = gva.h((Object)ihp);
                final boolean f3 = gva.f((Object)w);
                final Object r2 = gva.R();
                Object o;
                if ((h | f3) || (o = r2) == a) {
                    o = new e4((Object)ihp, (Object)w, (byte)19);
                    gva.q0(o);
                }
                t08.g((Object)lqo.a, (gbd)null, (lta)o, gva, 6);
                gva.q(false);
            }
            else {
                gva.g0(-1928719996);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)ihp, (Object)lta, n, (byte)15);
        }
    }
    
    public static final int t(final String s) {
        if (s != null && s.equals("Widget")) {
            return 6;
        }
        return 5;
    }
}
