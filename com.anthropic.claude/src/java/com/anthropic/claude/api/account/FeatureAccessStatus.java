package com.anthropic.claude.api.account;

@jzk(with = x5a.class)
public enum FeatureAccessStatus
{
    public static final w5a Companion;
    public static final d2d w;
    
    x("AVAILABLE", 0, "available"), 
    y("UNKNOWN", 5, "unknown");
    
    public static final FeatureAccessStatus[] z;
    public final String v;
    
    static {
        Companion = (w5a)new Object();
        w = ncq.F(2, (jta)new ux8((byte)13));
    }
    
    public FeatureAccessStatus(final String s, final int n, final String v) {
        this.v = v;
    }
    
    public final String toString() {
        return this.v;
    }
}
