package com.anthropic.claude.api.account;

@jzk(with = dxe.class)
public enum MemoryMode
{
    public static final MemoryMode[] A;
    public static final cxe Companion;
    public static final d2d v;
    
    w("MELANGE", 0), 
    x("CLASSIC", 1), 
    y("OFF", 2), 
    z("UNKNOWN", 3);
    
    static {
        Companion = (cxe)new Object();
        v = ncq.F(2, (jta)new v0e((byte)15));
    }
}
