package com.anthropic.claude.app.main.loggedout;

import com.anthropic.claude.login.WelcomeNotice;

public abstract class b
{
    public static final void a(final jta jta, final jta jta2, final bua bua, final WelcomeNotice welcomeNotice, final gva gva, final int n) {
        gva.i0(-1744503558);
        int n2;
        if (gva.h((Object)jta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)jta2)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)bua)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int ordinal;
        if (welcomeNotice == null) {
            ordinal = -1;
        }
        else {
            ordinal = ((Enum)welcomeNotice).ordinal();
        }
        int n5;
        if (gva.d(ordinal)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        final int n6 = n2 | n | n3 | n4 | n5;
        if (gva.W(n6 & 0x1, (n6 & 0x493) != 0x492)) {
            ach.f(uuj.t0(228699758, (aua)new d4d((Object)jta, (Object)bua, (Object)jta2, (Object)welcomeNotice, (byte)1), gva), gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cj4((byte)5, n, (Object)jta, (Object)jta2, (Object)bua, (Object)welcomeNotice);
        }
    }
}
