package com.anthropic.claude.api.chat.messages;

import java.util.Set;
import java.util.List;

@jzk
public final class TextBlock implements ContentBlock
{
    public static final vfn Companion;
    public static final d2d[] h;
    public final hfc a;
    public final hfc b;
    public final String c;
    public final List d;
    public final Integer e;
    public final Set f;
    public final Boolean g;
    
    static {
        Companion = (vfn)new Object();
        h = new d2d[] { null, null, null, ncq.F(2, (jta)new s8k((byte)26)), null, ncq.F(2, (jta)new s8k((byte)27)), null };
    }
    
    public TextBlock(final hfc a, final hfc b, final String c, final List d, final Integer e, final Set f, final Boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static TextBlock d(final TextBlock textBlock, hfc a, hfc b, String c, List d, Set f, final int n) {
        Boolean b2 = Boolean.TRUE;
        if ((n & 0x1) != 0x0) {
            a = textBlock.a;
        }
        if ((n & 0x2) != 0x0) {
            b = textBlock.b;
        }
        if ((n & 0x4) != 0x0) {
            c = textBlock.c;
        }
        if ((n & 0x8) != 0x0) {
            d = textBlock.d;
        }
        final Integer e = textBlock.e;
        if ((n & 0x20) != 0x0) {
            f = textBlock.f;
        }
        if ((n & 0x40) != 0x0) {
            b2 = textBlock.g;
        }
        textBlock.getClass();
        return new TextBlock(a, b, c, d, e, f, b2);
    }
    
    @Override
    public final Set a() {
        return this.f;
    }
    
    @Override
    public final hfc b() {
        return this.b;
    }
    
    @Override
    public final hfc c() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TextBlock)) {
            return false;
        }
        final TextBlock textBlock = (TextBlock)o;
        return mlc.q((Object)this.a, (Object)textBlock.a) && mlc.q((Object)this.b, (Object)textBlock.b) && mlc.q((Object)this.c, (Object)textBlock.c) && mlc.q((Object)this.d, (Object)textBlock.d) && mlc.q((Object)this.e, (Object)textBlock.e) && mlc.q((Object)this.f, (Object)textBlock.f) && mlc.q((Object)this.g, (Object)textBlock.g);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final hfc a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final hfc b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int j = smk.j((hashCode2 * 31 + hashCode3) * 31, 31, this.c);
        final List d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final Integer e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final Set f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final Boolean g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return (((j + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TextBlock(start_timestamp=");
        sb.append((Object)this.a);
        sb.append(", stop_timestamp=");
        sb.append((Object)this.b);
        sb.append(", text=");
        p3g.h(this.c, ", citations=", ", voice_spoken_chars=", sb, this.d);
        sb.append((Object)this.e);
        sb.append(", flags=");
        sb.append((Object)this.f);
        sb.append(", collapsible=");
        return xc2.j(sb, this.g, ")");
    }
}
