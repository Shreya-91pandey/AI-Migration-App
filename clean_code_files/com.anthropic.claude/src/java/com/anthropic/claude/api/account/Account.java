package com.anthropic.claude.api.account;

import com.anthropic.claude.types.strings.EmailAddress;
import com.anthropic.claude.types.strings.AccountId;
import java.util.ArrayList;
import java.util.List;

@jzk
public final class Account
{
    public static final a6 Companion;
    public static final d2d[] j;
    public final String a = a;
    public final String b = b;
    public final String c;
    public final String d;
    public final hfc e;
    public final hfc f;
    public final List g;
    public final AccountSettings h;
    public final boolean i;
    
    static {
        Companion = (a6)new Object();
        j = new d2d[] { null, null, null, null, null, null, ncq.F(2, (jta)new y5((byte)0)), null, null };
    }
    
    public Account(final String a, final String b, final String c, final String d, final hfc e, final hfc f, final List g, final AccountSettings h, final boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static Account a(final Account account, String c, String d, ArrayList g, AccountSettings h, final int n) {
        final String a = account.a;
        final String b = account.b;
        if ((n & 0x4) != 0x0) {
            c = account.c;
        }
        if ((n & 0x8) != 0x0) {
            d = account.d;
        }
        final hfc e = account.e;
        final hfc f = account.f;
        if ((n & 0x40) != 0x0) {
            g = (ArrayList)account.g;
        }
        if ((n & 0x80) != 0x0) {
            h = account.h;
        }
        final boolean b2 = (n & 0x100) == 0x0 || account.i;
        account.getClass();
        return new Account(a, b, c, d, e, f, (List)g, h, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Account)) {
            return false;
        }
        final Account account = (Account)o;
        return mlc.q((Object)this.a, (Object)account.a) && mlc.q((Object)this.b, (Object)account.b) && mlc.q((Object)this.c, (Object)account.c) && mlc.q((Object)this.d, (Object)account.d) && mlc.q((Object)this.e, (Object)account.e) && mlc.q((Object)this.f, (Object)account.f) && mlc.q((Object)this.g, (Object)account.g) && mlc.q((Object)this.h, (Object)account.h) && this.i == account.i;
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(this.a.hashCode() * 31, 31, this.b);
        final int n = 0;
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final String d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final int k = smk.k(t.e(t.e(((j + hashCode) * 31 + hashCode2) * 31, 31, this.e), 31, this.f), 31, this.g);
        final AccountSettings h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = h.hashCode();
        }
        return Boolean.hashCode(this.i) + (k + hashCode3) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("Account(uuid=", AccountId.a(this.a), ", email_address=", EmailAddress.a(this.b), ", full_name=");
        oz1.A(t, this.c, ", display_name=", this.d, ", created_at=");
        t.append((Object)this.e);
        t.append(", updated_at=");
        t.append((Object)this.f);
        t.append(", memberships=");
        t.append((Object)this.g);
        t.append(", settings=");
        t.append((Object)this.h);
        t.append(", is_verified=");
        return ge9.t(t, this.i, ")");
    }
}
