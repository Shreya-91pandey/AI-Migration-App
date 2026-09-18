package com.anthropic.claude.api.chat.messages;

import java.util.Set;
import java.util.List;

@jzk
public final class ThinkingBlock implements ContentBlock
{
    public static final oon Companion;
    public static final d2d[] g;
    public final hfc a;
    public final hfc b;
    public final String c;
    public final List d;
    public final Set e;
    public final Boolean f;
    
    static {
        Companion = (oon)new Object();
        g = new d2d[] { null, null, null, ncq.F(2, (jta)new smn((byte)6)), ncq.F(2, (jta)new smn((byte)7)) };
    }
    
    public ThinkingBlock(final hfc a, final hfc b, final String c, final List d, final Set e, final Boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static ThinkingBlock d(final ThinkingBlock thinkingBlock, hfc b, String c, List d, Set e, Boolean f, final int n) {
        final hfc a = thinkingBlock.a;
        if ((n & 0x2) != 0x0) {
            b = thinkingBlock.b;
        }
        if ((n & 0x4) != 0x0) {
            c = thinkingBlock.c;
        }
        if ((n & 0x8) != 0x0) {
            d = thinkingBlock.d;
        }
        if ((n & 0x10) != 0x0) {
            e = thinkingBlock.e;
        }
        if ((n & 0x20) != 0x0) {
            f = thinkingBlock.f;
        }
        thinkingBlock.getClass();
        return new ThinkingBlock(a, b, c, d, e, f);
    }
    
    @Override
    public final Set a() {
        return this.e;
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
        if (!(o instanceof ThinkingBlock)) {
            return false;
        }
        final ThinkingBlock thinkingBlock = (ThinkingBlock)o;
        return mlc.q((Object)this.a, (Object)thinkingBlock.a) && mlc.q((Object)this.b, (Object)thinkingBlock.b) && mlc.q((Object)this.c, (Object)thinkingBlock.c) && mlc.q((Object)this.d, (Object)thinkingBlock.d) && mlc.q((Object)this.e, (Object)thinkingBlock.e) && mlc.q((Object)this.f, (Object)thinkingBlock.f);
    }
    
    @Override
    public final int hashCode() {
        final int n = 0;
        final hfc a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final hfc b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int k = smk.k(smk.j((hashCode * 31 + hashCode2) * 31, 31, this.c), 31, this.d);
        final Set e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        final Boolean f = this.f;
        int hashCode4;
        if (f == null) {
            hashCode4 = n;
        }
        else {
            hashCode4 = f.hashCode();
        }
        return (k + hashCode3) * 31 + hashCode4;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ThinkingBlock(start_timestamp=");
        sb.append((Object)this.a);
        sb.append(", stop_timestamp=");
        sb.append((Object)this.b);
        sb.append(", thinking=");
        p3g.h(this.c, ", summaries=", ", flags=", sb, this.d);
        sb.append((Object)this.e);
        sb.append(", summaryPending=");
        sb.append((Object)this.f);
        sb.append(")");
        return sb.toString();
    }
}
