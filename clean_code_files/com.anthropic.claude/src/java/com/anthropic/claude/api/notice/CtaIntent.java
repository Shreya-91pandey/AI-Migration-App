package com.anthropic.claude.api.notice;

@jzk(with = vq7.class)
public enum CtaIntent
{
    A("REMOTE_ACTION", 4), 
    B("UNKNOWN", 5);
    
    public static final CtaIntent[] C;
    public static final uq7 Companion;
    public static final d2d v;
    
    w("UPGRADE", 0), 
    x("BUY_CREDIT", 1), 
    y("SWITCH_MODEL", 2), 
    z("VIEW_USAGE", 3);
    
    static {
        Companion = (uq7)new Object();
        v = ncq.F(2, (jta)new cm6((byte)22));
    }
}
