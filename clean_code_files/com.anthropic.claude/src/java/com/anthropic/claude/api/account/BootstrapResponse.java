package com.anthropic.claude.api.account;

@jzk
public final class BootstrapResponse
{
    public static final th2 Companion;
    public final Account a;
    public final GrowthBookSchema b;
    
    static {
        Companion = (th2)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BootstrapResponse)) {
            return false;
        }
        final BootstrapResponse bootstrapResponse = (BootstrapResponse)o;
        return mlc.q((Object)this.a, (Object)bootstrapResponse.a) && mlc.q((Object)this.b, (Object)bootstrapResponse.b);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Account a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final GrowthBookSchema b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("BootstrapResponse(account=");
        sb.append((Object)this.a);
        sb.append(", growthbook=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
