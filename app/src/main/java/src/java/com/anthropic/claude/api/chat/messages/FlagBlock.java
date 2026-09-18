package com.anthropic.claude.api.chat.messages;

import java.util.Set;

@jzk
public final class FlagBlock implements ContentBlock
{
    public static final eha Companion;
    public static final d2d[] f;
    public final hfc a;
    public final hfc b;
    public final MessageFlag c;
    public final ApiHelpline d;
    public final Set e;
    
    static {
        Companion = (eha)new Object();
        f = new d2d[] { null, null, null, null, ncq.F(2, (jta)new ux8((byte)14)) };
    }
    
    public FlagBlock(final hfc a, final hfc b, final MessageFlag c, final ApiHelpline d, final Set e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static FlagBlock d(final FlagBlock flagBlock, hfc a, hfc b, Set e, final int n) {
        if ((n & 0x1) != 0x0) {
            a = flagBlock.a;
        }
        if ((n & 0x2) != 0x0) {
            b = flagBlock.b;
        }
        final MessageFlag c = flagBlock.c;
        final ApiHelpline d = flagBlock.d;
        if ((n & 0x10) != 0x0) {
            e = flagBlock.e;
        }
        return new FlagBlock(a, b, c, d, e);
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
        if (!(o instanceof FlagBlock)) {
            return false;
        }
        final FlagBlock flagBlock = (FlagBlock)o;
        return mlc.q((Object)this.a, (Object)flagBlock.a) && mlc.q((Object)this.b, (Object)flagBlock.b) && mlc.q((Object)this.c, (Object)flagBlock.c) && mlc.q((Object)this.d, (Object)flagBlock.d) && mlc.q((Object)this.e, (Object)flagBlock.e);
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
        final int hashCode4 = this.c.hashCode();
        final ApiHelpline d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Set e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return ((hashCode4 + (hashCode2 * 31 + hashCode3) * 31) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FlagBlock(start_timestamp=");
        sb.append((Object)this.a);
        sb.append(", stop_timestamp=");
        sb.append((Object)this.b);
        sb.append(", flag=");
        sb.append((Object)this.c);
        sb.append(", helpline=");
        sb.append((Object)this.d);
        sb.append(", flags=");
        sb.append((Object)this.e);
        sb.append(")");
        return sb.toString();
    }
}
