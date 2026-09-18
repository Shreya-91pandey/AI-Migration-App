package com.anthropic.claude.app;

import java.time.format.DateTimeFormatter;

public abstract class f3
{
    public static final void a(final gwj gwj, uvn uvn, vn0 vn0, final gva gva, final int n) {
        gva.i0(2098447310);
        int n2;
        if (gva.f((Object)gwj)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n | n2 | 0x90;
        boolean b = false;
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
                if ((f | f2) || (uvn = (uvn)r) == a) {
                    uvn = (uvn)a2.d((Class)uvn.class, (emi)null);
                    gva.q0((Object)uvn);
                }
                final uvn uvn2 = uvn;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o;
                if ((f3 | f4) || (o = r2) == a) {
                    o = a3.d((Class)vn0.class, (emi)null);
                    gva.q0(o);
                }
                final vn0 vn2 = (vn0)o;
                uvn = uvn2;
                vn0 = vn2;
            }
            gva.r();
            if ((n3 & 0xFFFFFC0F & 0xE) == 0x4) {
                b = true;
            }
            final boolean h = gva.h((Object)vn0);
            final boolean h2 = gva.h((Object)uvn);
            final Object r3 = gva.R();
            Object o2;
            if ((h | b | h2) || (o2 = r3) == a) {
                o2 = new djh((Object)gwj, (Object)vn0, (Object)uvn, (f07)null, (byte)11);
                gva.q0(o2);
            }
            final zta zta = (zta)o2;
            final DateTimeFormatter q = uvn.q;
            mlc.h((Object)gwj, (Object)uvn, (Object)vn0, zta, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)gwj, (Object)uvn, (Object)vn0, (byte)20);
        }
    }
}
