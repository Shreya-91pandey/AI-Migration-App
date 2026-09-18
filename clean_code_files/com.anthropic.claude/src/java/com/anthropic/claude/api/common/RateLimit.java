package com.anthropic.claude.api.common;

import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.api.notice.Notice;

@jzk(with = l.class)
public interface RateLimit
{
    public static final noi Companion = noi.a;
    
    @jzk
    public static final class ExceedsLimit implements Limited
    {
        public static final g Companion;
        public final hfc a;
        public final Boolean b;
        public final String c;
        public final String d;
        public final Notice e;
        public final ResolvedLimit f;
        public final boolean g;
        
        static {
            Companion = new g();
        }
        
        public ExceedsLimit(hfc a, Boolean b, String c, String d, Notice e, ResolvedLimit f, boolean g, final int n) {
            if ((n & 0x1) != 0x0) {
                a = null;
            }
            if ((n & 0x2) != 0x0) {
                b = null;
            }
            if ((n & 0x4) != 0x0) {
                c = null;
            }
            if ((n & 0x8) != 0x0) {
                d = null;
            }
            if ((n & 0x10) != 0x0) {
                e = null;
            }
            if ((n & 0x20) != 0x0) {
                f = null;
            }
            if ((n & 0x40) != 0x0) {
                g = false;
            }
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final Notice a() {
            return this.e;
        }
        
        @Override
        public final String b() {
            return this.c;
        }
        
        @Override
        public final ResolvedLimit c() {
            return this.f;
        }
        
        @Override
        public final Boolean d() {
            return this.b;
        }
        
        @Override
        public final hfc e() {
            return this.a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ExceedsLimit)) {
                return false;
            }
            final ExceedsLimit exceedsLimit = (ExceedsLimit)o;
            if (!mlc.q((Object)this.a, (Object)exceedsLimit.a)) {
                return false;
            }
            if (!mlc.q((Object)this.b, (Object)exceedsLimit.b)) {
                return false;
            }
            final String c = exceedsLimit.c;
            final String c2 = this.c;
            if (c2 == null) {
                if (c == null) {
                    final boolean equals = true;
                    return equals && mlc.q((Object)this.d, (Object)exceedsLimit.d) && mlc.q((Object)this.e, (Object)exceedsLimit.e) && mlc.q((Object)this.f, (Object)exceedsLimit.f) && this.g == exceedsLimit.g;
                }
            }
            else if (c != null) {
                final boolean equals = c2.equals(c);
                return equals && mlc.q((Object)this.d, (Object)exceedsLimit.d) && mlc.q((Object)this.e, (Object)exceedsLimit.e) && mlc.q((Object)this.f, (Object)exceedsLimit.f) && this.g == exceedsLimit.g;
            }
            final boolean equals = false;
            return equals && mlc.q((Object)this.d, (Object)exceedsLimit.d) && mlc.q((Object)this.e, (Object)exceedsLimit.e) && mlc.q((Object)this.f, (Object)exceedsLimit.f) && this.g == exceedsLimit.g;
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
            final Boolean b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final String c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final String d = this.d;
            int hashCode5;
            if (d == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = d.hashCode();
            }
            final Notice e = this.e;
            int hashCode6;
            if (e == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = e.hashCode();
            }
            final ResolvedLimit f = this.f;
            if (f != null) {
                hashCode = f.hashCode();
            }
            return Boolean.hashCode(this.g) + (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode) * 31;
        }
        
        @Override
        public final String toString() {
            final String c = this.c;
            String a;
            if (c == null) {
                a = "null";
            }
            else {
                a = ModelId.a(c);
            }
            final StringBuilder sb = new StringBuilder("ExceedsLimit(resetsAt=");
            sb.append((Object)this.a);
            sb.append(", perModelLimit=");
            sb.append((Object)this.b);
            sb.append(", model=");
            oz1.A(sb, a, ", message=", this.d, ", notice=");
            sb.append((Object)this.e);
            sb.append(", resolved=");
            sb.append((Object)this.f);
            sb.append(", isUsingOverage=");
            return ge9.t(sb, this.g, ")");
        }
    }
    
    @jzk
    public interface Limited extends RateLimit
    {
        public static final h Companion = h.a;
        
        Notice a();
        
        String b();
        
        ResolvedLimit c();
        
        Boolean d();
        
        hfc e();
    }
    
    @jzk
    public static final class WithinLimit implements RateLimit
    {
        public static final j Companion;
        public final Notice a;
        
        static {
            Companion = (j)new Object();
        }
        
        public WithinLimit(final Notice a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof WithinLimit && mlc.q((Object)this.a, (Object)((WithinLimit)o).a));
        }
        
        @Override
        public final int hashCode() {
            final Notice a = this.a;
            if (a == null) {
                return 0;
            }
            return a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("WithinLimit(notice=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
}
