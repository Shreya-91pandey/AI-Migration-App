package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.types.strings.LocalizedText;
import java.util.List;

@jzk
public final class ComposerNotice implements StreamEvent
{
    public static final yi6 Companion;
    public static final d2d[] i;
    public final String a = a;
    public final String b;
    public final String c;
    public final hfc d;
    public final Long e;
    public final List f;
    public final ComposerNoticeBodyLink g;
    public final Long h;
    
    static {
        Companion = (yi6)new Object();
        i = new d2d[] { null, null, null, null, null, ncq.F(2, (jta)new lv4((byte)16)), null, null };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComposerNotice)) {
            return false;
        }
        final ComposerNotice composerNotice = (ComposerNotice)o;
        if (!mlc.q((Object)this.a, (Object)composerNotice.a)) {
            return false;
        }
        final String b = composerNotice.b;
        final String b2 = this.b;
        if (b2 == null) {
            if (b == null) {
                final boolean equals = true;
                return equals && mlc.q((Object)this.c, (Object)composerNotice.c) && mlc.q((Object)this.d, (Object)composerNotice.d) && mlc.q((Object)this.e, (Object)composerNotice.e) && mlc.q((Object)this.f, (Object)composerNotice.f) && mlc.q((Object)this.g, (Object)composerNotice.g) && mlc.q((Object)this.h, (Object)composerNotice.h);
            }
        }
        else if (b != null) {
            final boolean equals = b2.equals(b);
            return equals && mlc.q((Object)this.c, (Object)composerNotice.c) && mlc.q((Object)this.d, (Object)composerNotice.d) && mlc.q((Object)this.e, (Object)composerNotice.e) && mlc.q((Object)this.f, (Object)composerNotice.f) && mlc.q((Object)this.g, (Object)composerNotice.g) && mlc.q((Object)this.h, (Object)composerNotice.h);
        }
        final boolean equals = false;
        return equals && mlc.q((Object)this.c, (Object)composerNotice.c) && mlc.q((Object)this.d, (Object)composerNotice.d) && mlc.q((Object)this.e, (Object)composerNotice.e) && mlc.q((Object)this.f, (Object)composerNotice.f) && mlc.q((Object)this.g, (Object)composerNotice.g) && mlc.q((Object)this.h, (Object)composerNotice.h);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int e = t.e(smk.j((hashCode * 31 + hashCode3) * 31, 31, this.c), 31, this.d);
        final Long e2 = this.e;
        int hashCode4;
        if (e2 == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e2.hashCode();
        }
        final int k = smk.k((e + hashCode4) * 31, 31, this.f);
        final ComposerNoticeBodyLink g = this.g;
        int hashCode5;
        if (g == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = g.hashCode();
        }
        final Long h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        return (k + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        String a;
        if (b == null) {
            a = "null";
        }
        else {
            a = LocalizedText.a(b);
        }
        final String a2 = LocalizedText.a(this.c);
        final StringBuilder t = oz1.t("ComposerNotice(notice_id=", this.a, ", title=", a, ", body=");
        t.append(a2);
        t.append(", created_at=");
        t.append((Object)this.d);
        t.append(", ordinal=");
        t.append((Object)this.e);
        t.append(", actions=");
        t.append((Object)this.f);
        t.append(", body_link=");
        t.append((Object)this.g);
        t.append(", expires_in_seconds=");
        t.append((Object)this.h);
        t.append(")");
        return t.toString();
    }
}
