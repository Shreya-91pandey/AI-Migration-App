package com.anthropic.claude.api.account;

import java.util.List;

@jzk
public final class AcceptLegalDocsRequest
{
    public static final s3 Companion;
    public static final d2d[] b;
    public final List a = a;
    
    static {
        Companion = new s3();
        b = new d2d[] { ncq.F(2, (jta)new q3((byte)0)) };
    }
    
    public AcceptLegalDocsRequest(final List a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof AcceptLegalDocsRequest && mlc.q((Object)this.a, (Object)((AcceptLegalDocsRequest)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.l("AcceptLegalDocsRequest(acceptances=", ")", this.a);
    }
}
