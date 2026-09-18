package com.anthropic.claude.app;

public abstract class y2
{
    public static final void a(final frg frg, final v5a v5a, final krf krf, final gva gva, final int n) {
        gva.i0(1805432200);
        int n2;
        if (gva.f((Object)frg)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)v5a)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)krf)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n2 | n | n3 | n4;
        boolean b = false;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            final boolean b2 = (n5 & 0x70) == 0x20;
            final boolean h = gva.h((Object)krf);
            if ((n5 & 0xE) == 0x4) {
                b = true;
            }
            final Object r = gva.R();
            Object o;
            if ((b2 | h | b) || (o = r) == bi6.a) {
                o = new v2(null, v5a, krf, frg);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)lqo.a);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new r5a(frg, v5a, krf, n, (byte)1);
        }
    }
    
    public static final void b(final frg frg, final v5a v5a, final krf krf, final gva gva, final int n) {
        gva.i0(245668262);
        int n2;
        if (gva.f((Object)frg)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)v5a)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)krf)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n2 | n | n3 | n4;
        boolean b = false;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            final boolean h = gva.h((Object)krf);
            final boolean b2 = (n5 & 0xE) == 0x4;
            if ((n5 & 0x70) == 0x20) {
                b = true;
            }
            final Object r = gva.R();
            Object o;
            if ((b2 | h | b) || (o = r) == bi6.a) {
                o = new x2(null, v5a, krf, frg);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)lqo.a);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new r5a(frg, v5a, krf, n, (byte)0);
        }
    }
}
