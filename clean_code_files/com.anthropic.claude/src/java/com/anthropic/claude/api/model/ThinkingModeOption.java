package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings._ServerLocalizedString;

@jzk
public final class ThinkingModeOption
{
    public static final cpn Companion;
    public static final d2d[] g;
    public final String a = a;
    public final _ServerLocalizedString b = b;
    public final _ServerLocalizedString c = c;
    public final String d;
    public final _ServerLocalizedString e;
    public final Boolean f;
    
    static {
        Companion = (cpn)new Object();
        g = new d2d[] { null, ncq.F(2, (jta)new smn((byte)8)), ncq.F(2, (jta)new smn((byte)9)), null, ncq.F(2, (jta)new smn((byte)10)), null };
    }
    
    public ThinkingModeOption(final String a, final _ServerLocalizedString b, final _ServerLocalizedString c, final String d, final _ServerLocalizedString e, final Boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThinkingModeOption)) {
            return false;
        }
        final ThinkingModeOption thinkingModeOption = (ThinkingModeOption)o;
        if (!mlc.q((Object)this.a, (Object)thinkingModeOption.a)) {
            return false;
        }
        if (!mlc.q((Object)this.b, (Object)thinkingModeOption.b)) {
            return false;
        }
        if (!mlc.q((Object)this.c, (Object)thinkingModeOption.c)) {
            return false;
        }
        final String d = thinkingModeOption.d;
        final String d2 = this.d;
        if (d2 == null) {
            if (d == null) {
                final boolean equals = true;
                return equals && mlc.q((Object)this.e, (Object)thinkingModeOption.e) && mlc.q((Object)this.f, (Object)thinkingModeOption.f);
            }
        }
        else if (d != null) {
            final boolean equals = d2.equals(d);
            return equals && mlc.q((Object)this.e, (Object)thinkingModeOption.e) && mlc.q((Object)this.f, (Object)thinkingModeOption.f);
        }
        final boolean equals = false;
        return equals && mlc.q((Object)this.e, (Object)thinkingModeOption.e) && mlc.q((Object)this.f, (Object)thinkingModeOption.f);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        int hashCode4 = 0;
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final _ServerLocalizedString e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Boolean f = this.f;
        if (f != null) {
            hashCode4 = f.hashCode();
        }
        return (((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode4;
    }
    
    @Override
    public final String toString() {
        final String d = this.d;
        String a;
        if (d == null) {
            a = "null";
        }
        else {
            a = ThinkingMode.a(d);
        }
        final StringBuilder sb = new StringBuilder("ThinkingModeOption(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object)this.b);
        sb.append(", description=");
        sb.append((Object)this.c);
        sb.append(", mode=");
        sb.append(a);
        sb.append(", selection_title=");
        sb.append((Object)this.e);
        sb.append(", is_default=");
        sb.append((Object)this.f);
        sb.append(")");
        return sb.toString();
    }
}
