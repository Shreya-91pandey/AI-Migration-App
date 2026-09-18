package com.anthropic.claude.api.account;

import com.anthropic.claude.types.strings.ToolSearchMode;
import java.util.Map;
import java.util.List;

@jzk
public final class AccountSettings
{
    public static final d2d[] C;
    public static final u8 Companion;
    public static final AccountSettings D;
    public final String A;
    public final Boolean B;
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final List e;
    public final Boolean f;
    public final Map g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public final Boolean p;
    public final Boolean q;
    public final String r;
    public final Boolean s;
    public final hfc t;
    public final hfc u;
    public final VillageWeaverConsentState v;
    public final Boolean w;
    public final Boolean x;
    public final String y;
    public final Double z;
    
    static {
        Companion = (u8)new Object();
        C = new d2d[] { null, null, null, null, ncq.F(2, (jta)new y5((byte)1)), null, ncq.F(2, (jta)new y5((byte)2)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null };
        D = new AccountSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
    
    public AccountSettings(final Boolean a, final Boolean b, final Boolean c, final Boolean d, final List e, final Boolean f, final Map g, final Boolean h, final Boolean i, final Boolean j, final Boolean k, final Boolean l, final Boolean m, final Boolean n, final Boolean o, final Boolean p28, final Boolean q, final String r, final Boolean s, final hfc t, final hfc u, final VillageWeaverConsentState v, final Boolean w, final Boolean x, final String y, final Double z, final String a2, final Boolean b2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p28;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = b2;
    }
    
    public static AccountSettings a(final AccountSettings accountSettings, Map g, Boolean h, Boolean l, Boolean m, Boolean p17, Boolean q, String r, Boolean s, VillageWeaverConsentState v, Boolean w, Boolean x, String y, Double z, String a, Boolean b, final int n) {
        Boolean b2 = Boolean.TRUE;
        final Boolean a2 = accountSettings.a;
        final Boolean b3 = accountSettings.b;
        final Boolean c = accountSettings.c;
        if ((n & 0x8) != 0x0) {
            b2 = accountSettings.d;
        }
        final List e = accountSettings.e;
        final Boolean f = accountSettings.f;
        if ((n & 0x40) != 0x0) {
            g = accountSettings.g;
        }
        if ((n & 0x80) != 0x0) {
            h = accountSettings.h;
        }
        final Boolean i = accountSettings.i;
        final Boolean j = accountSettings.j;
        final Boolean k = accountSettings.k;
        if ((n & 0x800) != 0x0) {
            l = accountSettings.l;
        }
        if ((n & 0x1000) != 0x0) {
            m = accountSettings.m;
        }
        final Boolean n2 = accountSettings.n;
        final Boolean o = accountSettings.o;
        if ((n & 0x8000) != 0x0) {
            p17 = accountSettings.p;
        }
        if ((n & 0x10000) != 0x0) {
            q = accountSettings.q;
        }
        if ((n & 0x20000) != 0x0) {
            r = accountSettings.r;
        }
        if ((n & 0x40000) != 0x0) {
            s = accountSettings.s;
        }
        final hfc t = accountSettings.t;
        final hfc u = accountSettings.u;
        if ((n & 0x200000) != 0x0) {
            v = accountSettings.v;
        }
        if ((n & 0x400000) != 0x0) {
            w = accountSettings.w;
        }
        if ((n & 0x800000) != 0x0) {
            x = accountSettings.x;
        }
        if ((n & 0x1000000) != 0x0) {
            y = accountSettings.y;
        }
        if ((n & 0x2000000) != 0x0) {
            z = accountSettings.z;
        }
        if ((n & 0x4000000) != 0x0) {
            a = accountSettings.A;
        }
        if ((n & 0x8000000) != 0x0) {
            b = accountSettings.B;
        }
        accountSettings.getClass();
        return new AccountSettings(a2, b3, c, b2, e, f, g, h, i, j, k, l, m, n2, o, p17, q, r, s, t, u, v, w, x, y, z, a, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountSettings)) {
            return false;
        }
        final AccountSettings accountSettings = (AccountSettings)o;
        if (!mlc.q((Object)this.a, (Object)accountSettings.a)) {
            return false;
        }
        if (!mlc.q((Object)this.b, (Object)accountSettings.b)) {
            return false;
        }
        if (!mlc.q((Object)this.c, (Object)accountSettings.c)) {
            return false;
        }
        if (!mlc.q((Object)this.d, (Object)accountSettings.d)) {
            return false;
        }
        if (!mlc.q((Object)this.e, (Object)accountSettings.e)) {
            return false;
        }
        if (!mlc.q((Object)this.f, (Object)accountSettings.f)) {
            return false;
        }
        if (!mlc.q((Object)this.g, (Object)accountSettings.g)) {
            return false;
        }
        if (!mlc.q((Object)this.h, (Object)accountSettings.h)) {
            return false;
        }
        if (!mlc.q((Object)this.i, (Object)accountSettings.i)) {
            return false;
        }
        if (!mlc.q((Object)this.j, (Object)accountSettings.j)) {
            return false;
        }
        if (!mlc.q((Object)this.k, (Object)accountSettings.k)) {
            return false;
        }
        if (!mlc.q((Object)this.l, (Object)accountSettings.l)) {
            return false;
        }
        if (!mlc.q((Object)this.m, (Object)accountSettings.m)) {
            return false;
        }
        if (!mlc.q((Object)this.n, (Object)accountSettings.n)) {
            return false;
        }
        if (!mlc.q((Object)this.o, (Object)accountSettings.o)) {
            return false;
        }
        if (!mlc.q((Object)this.p, (Object)accountSettings.p)) {
            return false;
        }
        if (!mlc.q((Object)this.q, (Object)accountSettings.q)) {
            return false;
        }
        final String r = accountSettings.r;
        final String r2 = this.r;
        if (r2 == null) {
            if (r == null) {
                final boolean equals = true;
                return equals && mlc.q((Object)this.s, (Object)accountSettings.s) && mlc.q((Object)this.t, (Object)accountSettings.t) && mlc.q((Object)this.u, (Object)accountSettings.u) && this.v == accountSettings.v && mlc.q((Object)this.w, (Object)accountSettings.w) && mlc.q((Object)this.x, (Object)accountSettings.x) && mlc.q((Object)this.y, (Object)accountSettings.y) && mlc.q((Object)this.z, (Object)accountSettings.z) && mlc.q((Object)this.A, (Object)accountSettings.A) && mlc.q((Object)this.B, (Object)accountSettings.B);
            }
        }
        else if (r != null) {
            final boolean equals = r2.equals(r);
            return equals && mlc.q((Object)this.s, (Object)accountSettings.s) && mlc.q((Object)this.t, (Object)accountSettings.t) && mlc.q((Object)this.u, (Object)accountSettings.u) && this.v == accountSettings.v && mlc.q((Object)this.w, (Object)accountSettings.w) && mlc.q((Object)this.x, (Object)accountSettings.x) && mlc.q((Object)this.y, (Object)accountSettings.y) && mlc.q((Object)this.z, (Object)accountSettings.z) && mlc.q((Object)this.A, (Object)accountSettings.A) && mlc.q((Object)this.B, (Object)accountSettings.B);
        }
        final boolean equals = false;
        return equals && mlc.q((Object)this.s, (Object)accountSettings.s) && mlc.q((Object)this.t, (Object)accountSettings.t) && mlc.q((Object)this.u, (Object)accountSettings.u) && this.v == accountSettings.v && mlc.q((Object)this.w, (Object)accountSettings.w) && mlc.q((Object)this.x, (Object)accountSettings.x) && mlc.q((Object)this.y, (Object)accountSettings.y) && mlc.q((Object)this.z, (Object)accountSettings.z) && mlc.q((Object)this.A, (Object)accountSettings.A) && mlc.q((Object)this.B, (Object)accountSettings.B);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Boolean a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final List e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Boolean f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final Map g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final Boolean h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final Boolean i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final Boolean j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final Boolean k = this.k;
        int hashCode12;
        if (k == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = k.hashCode();
        }
        final Boolean l = this.l;
        int hashCode13;
        if (l == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = l.hashCode();
        }
        final Boolean m = this.m;
        int hashCode14;
        if (m == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = m.hashCode();
        }
        final Boolean n = this.n;
        int hashCode15;
        if (n == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = n.hashCode();
        }
        final Boolean o = this.o;
        int hashCode16;
        if (o == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = o.hashCode();
        }
        final Boolean p = this.p;
        int hashCode17;
        if (p == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = p.hashCode();
        }
        final Boolean q = this.q;
        int hashCode18;
        if (q == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = q.hashCode();
        }
        final String r = this.r;
        int hashCode19;
        if (r == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = r.hashCode();
        }
        final Boolean s = this.s;
        int hashCode20;
        if (s == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = s.hashCode();
        }
        final hfc t = this.t;
        int hashCode21;
        if (t == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = t.hashCode();
        }
        final hfc u = this.u;
        int hashCode22;
        if (u == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = u.hashCode();
        }
        final VillageWeaverConsentState v = this.v;
        int hashCode23;
        if (v == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = v.hashCode();
        }
        final Boolean w = this.w;
        int hashCode24;
        if (w == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = w.hashCode();
        }
        final Boolean x = this.x;
        int hashCode25;
        if (x == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = x.hashCode();
        }
        final String y = this.y;
        int hashCode26;
        if (y == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = y.hashCode();
        }
        final Double z = this.z;
        int hashCode27;
        if (z == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = z.hashCode();
        }
        final String a2 = this.A;
        int hashCode28;
        if (a2 == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = a2.hashCode();
        }
        final Boolean b2 = this.B;
        if (b2 != null) {
            hashCode = b2.hashCode();
        }
        return ((((((((((((((((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode20) * 31 + hashCode21) * 31 + hashCode22) * 31 + hashCode23) * 31 + hashCode24) * 31 + hashCode25) * 31 + hashCode26) * 31 + hashCode27) * 31 + hashCode28) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String r = this.r;
        String a;
        if (r == null) {
            a = "null";
        }
        else {
            a = ToolSearchMode.a(r);
        }
        final StringBuilder sb = new StringBuilder("AccountSettings(has_seen_mm_examples=");
        sb.append((Object)this.a);
        sb.append(", has_seen_starter_prompts=");
        sb.append((Object)this.b);
        sb.append(", has_started_claudeai_onboarding=");
        ju4.h(sb, this.c, ", has_finished_claudeai_onboarding=", this.d, ", dismissed_claudeai_banners=");
        sb.append((Object)this.e);
        sb.append(", dismissed_artifacts_announcement=");
        sb.append((Object)this.f);
        sb.append(", enabled_mcp_tools=");
        sb.append((Object)this.g);
        sb.append(", enabled_connector_suggestions=");
        sb.append((Object)this.h);
        sb.append(", enabled_saffron=");
        ju4.h(sb, this.i, ", enabled_melange=", this.j, ", enabled_saffron_search=");
        ju4.h(sb, this.k, ", enabled_web_search=", this.l, ", preview_feature_uses_artifacts=");
        ju4.h(sb, this.m, ", preview_feature_uses_latex=", this.n, ", preview_feature_uses_citations=");
        ju4.h(sb, this.o, ", enabled_turmeric=", this.p, ", enabled_monkeys_in_a_barrel=");
        xc2.p(sb, this.q, ", tool_search_mode=", a, ", grove_enabled=");
        sb.append((Object)this.s);
        sb.append(", grove_updated_at=");
        sb.append((Object)this.t);
        sb.append(", grove_notice_viewed_at=");
        sb.append((Object)this.u);
        sb.append(", village_weaver_consent_state=");
        sb.append((Object)this.v);
        sb.append(", village_weaver_eligible=");
        ju4.h(sb, this.w, ", has_village_weaver_recordings=", this.x, ", voice_preference=");
        sb.append(this.y);
        sb.append(", voice_speed=");
        sb.append((Object)this.z);
        sb.append(", voice_language_code=");
        sb.append(this.A);
        sb.append(", enabled_model_auto_fallback=");
        sb.append((Object)this.B);
        sb.append(")");
        return sb.toString();
    }
}
