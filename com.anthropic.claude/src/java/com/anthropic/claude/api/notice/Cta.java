package com.anthropic.claude.api.notice;

import java.util.List;

@jzk
public final class Cta
{
    public static final rq7 Companion;
    public static final d2d[] h;
    public final String a;
    public final CtaIntent b;
    public final RedirectHint c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    
    static {
        Companion = (rq7)new Object();
        h = new d2d[] { null, null, null, null, ncq.F(2, (jta)new cm6((byte)19)), ncq.F(2, (jta)new cm6((byte)20)), ncq.F(2, (jta)new cm6((byte)21)) };
    }
    
    public Cta(final String a, final CtaIntent b, RedirectHint c, List v, final int n) {
        String g = null;
        if ((n & 0x4) != 0x0) {
            c = null;
        }
        if ((n & 0x8) != 0x0) {
            v = (List)r89.v;
        }
        String e;
        if ((n & 0x10) != 0x0) {
            e = null;
        }
        else {
            e = "credits_required";
        }
        String f;
        if ((n & 0x20) != 0x0) {
            f = null;
        }
        else {
            f = "Your request has been sent to your admin.";
        }
        if ((n & 0x40) == 0x0) {
            g = "Request sent to admin";
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = v;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cta)) {
            return false;
        }
        final Cta cta = (Cta)o;
        return mlc.q((Object)this.a, (Object)cta.a) && this.b == cta.b && this.c == cta.c && mlc.q((Object)this.d, (Object)cta.d) && mlc.q((Object)this.e, (Object)cta.e) && mlc.q((Object)this.f, (Object)cta.f) && mlc.q((Object)this.g, (Object)cta.g);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int hashCode3 = 0;
        final RedirectHint c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final int k = smk.k(((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31, 31, this.d);
        final String e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final String f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final String g = this.g;
        if (g != null) {
            hashCode3 = g.hashCode();
        }
        return ((k + hashCode5) * 31 + hashCode6) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Cta(copy=");
        sb.append(this.a);
        sb.append(", intent=");
        sb.append((Object)this.b);
        sb.append(", redirectHint=");
        sb.append((Object)this.c);
        sb.append(", actions=");
        sb.append((Object)this.d);
        sb.append(", analytics_id=");
        oz1.A(sb, this.e, ", success_toast=", this.f, ", completed_label=");
        return oz1.p(sb, this.g, ")");
    }
}
