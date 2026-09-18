package com.anthropic.claude.api.account;

import java.util.List;

@jzk
public final class UpdateAccountRequest
{
    public static final sto Companion;
    public static final d2d[] f;
    public final String a;
    public final String b;
    public final List c;
    public final AccountSettings d;
    public final Boolean e;
    
    static {
        Companion = new sto();
        f = new d2d[] { null, null, ncq.F(2, (jta)new pho((byte)13)), null, null };
    }
    
    public UpdateAccountRequest(final int n, Boolean e, String a, String b) {
        if ((n & 0x1) != 0x0) {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = null;
        }
        if ((n & 0x10) != 0x0) {
            e = null;
        }
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAccountRequest)) {
            return false;
        }
        final UpdateAccountRequest updateAccountRequest = (UpdateAccountRequest)o;
        return mlc.q((Object)this.a, (Object)updateAccountRequest.a) && mlc.q((Object)this.b, (Object)updateAccountRequest.b) && mlc.q((Object)this.c, (Object)updateAccountRequest.c) && mlc.q((Object)this.d, (Object)updateAccountRequest.d) && mlc.q((Object)this.e, (Object)updateAccountRequest.e);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final List c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final AccountSettings d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Boolean e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("UpdateAccountRequest(full_name=", this.a, ", display_name=", this.b, ", accept_document_ids=");
        t.append((Object)this.c);
        t.append(", settings=");
        t.append((Object)this.d);
        t.append(", age_is_verified=");
        return xc2.j(t, this.e, ")");
    }
}
