package com.anthropic.claude.app;

import java.util.List;

public abstract class t2
{
    public static final void a(final frg frg, final b3 b3, final f8 f8, final gva gva, final int n) {
        gva.i0(1218851213);
        int n2;
        if (gva.f((Object)frg)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)b3)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)f8)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n2 | n | n3 | n4;
        boolean b4 = false;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            final boolean b5 = (n5 & 0xE) == 0x4;
            if ((n5 & 0x70) == 0x20) {
                b4 = true;
            }
            final boolean h = gva.h((Object)f8);
            final Object r = gva.R();
            Object o;
            if ((b5 | b4 | h) || (o = r) == bi6.a) {
                o = new r2(b3, f8, frg, null);
                gva.q0(o);
            }
            mlc.g((Object)frg, (Object)f8, (zta)o, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new t28(n, (Object)frg, (Object)b3, (Object)f8, (byte)7);
        }
    }
    
    public static final b3 b(final frg frg) {
        final rp4 rp4 = (rp4)frg.w.getValue();
        final fp4 fp4 = (fp4)c86.R0((List)rp4.a);
        ClaudeAppDestination.Detail detail = null;
        ClaudeAppDestination.List list;
        if (fp4 != null) {
            list = (ClaudeAppDestination.List)fp4.a;
        }
        else {
            list = null;
        }
        final fp4 fp5 = (fp4)c86.R0((List)rp4.b);
        if (fp5 != null) {
            detail = (ClaudeAppDestination.Detail)fp5.a;
        }
        return new b3(list, detail, rp4.d);
    }
}
