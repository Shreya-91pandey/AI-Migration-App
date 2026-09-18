package com.anthropic.claude.api.mcp;

@jzk(with = yfe.class)
public enum McpAuthStatus
{
    public static final xfe Companion;
    public static final d2d v;
    
    w("UNKNOWN", 0);
    
    public static final McpAuthStatus[] x;
    
    static {
        Companion = (xfe)new Object();
        v = ncq.F(2, (jta)new v0e((byte)6));
    }
    
    public final boolean a() {
        final int ordinal = this.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return false;
        }
        if (ordinal != 4 && ordinal != 5) {
            en9.r();
            return false;
        }
        return true;
    }
}
