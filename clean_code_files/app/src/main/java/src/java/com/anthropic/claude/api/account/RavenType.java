package com.anthropic.claude.api.account;

@jzk(with = ppi.class)
public enum RavenType
{
    public static final opi Companion;
    public static final d2d w;
    
    x("TEAM", 0, "team"), 
    y("ENTERPRISE", 1, "enterprise");
    
    public static final RavenType[] z;
    public final String v;
    
    static {
        Companion = (opi)new Object();
        w = ncq.F(2, (jta)new lih((byte)6));
    }
    
    public RavenType(final String s, final int n, final String v) {
        this.v = v;
    }
    
    public final String toString() {
        return this.v;
    }
}
