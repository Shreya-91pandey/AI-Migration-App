package com.anthropic.claude.api.account;

@jzk(with = aep.class)
public enum VillageWeaverConsentState
{
    A("UNKNOWN", 4);
    
    public static final VillageWeaverConsentState[] B;
    public static final zdp Companion;
    public static final d2d v;
    
    w("DECLINED", 0), 
    x("REQUEST_PER_SESSION", 1), 
    y("ALWAYS_SHARE", 2), 
    z("REQUESTED_DELETION", 3);
    
    static {
        Companion = (zdp)new Object();
        v = ncq.F(2, (jta)new axo((byte)5));
    }
}
