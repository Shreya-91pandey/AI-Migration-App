package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.LocalizedText;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@jzk
public final class ThinkingOption<ID>
{
    public static final epn Companion;
    public static final PluginGeneratedSerialDescriptor f;
    public final Object a = a;
    public final String b = b;
    public final String c;
    public final boolean d;
    public final Badge e;
    
    static {
        Companion = (epn)new Object();
        final PluginGeneratedSerialDescriptor f2 = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ThinkingOption", (axa)null, 5);
        f2.l("id", false);
        f2.l("name", false);
        f2.l("description", true);
        f2.l("recommended", true);
        f2.l("badge", true);
        f = f2;
    }
    
    public ThinkingOption(final Object a, final String b, final String c, final boolean d, final Badge e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThinkingOption)) {
            return false;
        }
        final ThinkingOption thinkingOption = (ThinkingOption)o;
        if (!mlc.q(this.a, thinkingOption.a)) {
            return false;
        }
        if (!mlc.q((Object)this.b, (Object)thinkingOption.b)) {
            return false;
        }
        final String c = thinkingOption.c;
        final String c2 = this.c;
        if (c2 == null) {
            if (c == null) {
                final boolean equals = true;
                return equals && this.d == thinkingOption.d && mlc.q((Object)this.e, (Object)thinkingOption.e);
            }
        }
        else if (c != null) {
            final boolean equals = c2.equals(c);
            return equals && this.d == thinkingOption.d && mlc.q((Object)this.e, (Object)thinkingOption.e);
        }
        final boolean equals = false;
        return equals && this.d == thinkingOption.d && mlc.q((Object)this.e, (Object)thinkingOption.e);
    }
    
    @Override
    public final int hashCode() {
        final int n = 0;
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int j = smk.j(hashCode * 31, 31, this.b);
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final int l = smk.l((j + hashCode2) * 31, 31, this.d);
        final Badge e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = e.hashCode();
        }
        return l + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String a = LocalizedText.a(this.b);
        final String c = this.c;
        String a2;
        if (c == null) {
            a2 = "null";
        }
        else {
            a2 = LocalizedText.a(c);
        }
        final StringBuilder sb = new StringBuilder("ThinkingOption(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(a);
        sb.append(", description=");
        a6l.j(sb, a2, ", recommended=", this.d, ", badge=");
        sb.append((Object)this.e);
        sb.append(")");
        return sb.toString();
    }
}
