package com.anthropic.claude.api.account;

@jzk
public final class SendProductEmailLinkRequest
{
    public static final yvk Companion;
    public final String a = a;
    
    static {
        Companion = new yvk();
    }
    
    public SendProductEmailLinkRequest() {
        this.a = "desktop";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof SendProductEmailLinkRequest && mlc.q((Object)this.a, (Object)((SendProductEmailLinkRequest)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("SendProductEmailLinkRequest(product=", this.a, ")");
    }
}
