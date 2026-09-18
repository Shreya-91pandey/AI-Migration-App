package com.anthropic.claude.api.purchase;

@jzk
@yqc(discriminator = "kind")
public interface IapTransactionResult
{
    public static final a Companion = a.a;
    
    @jzk
    public static final class UsageCredits implements IapTransactionResult
    {
        public static final c Companion;
        public final IapTransactionStatus a = a;
        public final int b = b;
        public final Integer c;
        
        static {
            Companion = (c)new Object();
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof UsageCredits)) {
                return false;
            }
            final UsageCredits usageCredits = (UsageCredits)o;
            return this.a == usageCredits.a && this.b == usageCredits.b && mlc.q((Object)this.c, (Object)usageCredits.c);
        }
        
        @Override
        public final int hashCode() {
            final int y = hia.y(this.b, this.a.hashCode() * 31, 31);
            final Integer c = this.c;
            int hashCode;
            if (c == null) {
                hashCode = 0;
            }
            else {
                hashCode = c.hashCode();
            }
            return y + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("UsageCredits(status=");
            sb.append((Object)this.a);
            sb.append(", granted_credits=");
            sb.append(this.b);
            sb.append(", balance_credits=");
            return ju4.c(sb, this.c, ")");
        }
    }
}
