package com.anthropic.claude.api.mcp;

@jzk(with = nx2.class)
public enum CaiMcpFlag
{
    A("SESSION_AUTHENTICATED", 4);
    
    public static final CaiMcpFlag[] B;
    public static final mx2 Companion;
    public static final d2d v;
    
    w("UNKNOWN", 0), 
    x("AUTO_ACCEPT_PERMISSIONS", 1), 
    y("HIDE_TOOL_CHROME_IN_CHAT", 2), 
    z("HIDE_FROM_CONNECTORS_LIST", 3);
    
    static {
        Companion = (mx2)new Object();
        v = ncq.F(2, (jta)new kc2((byte)3));
    }
}
