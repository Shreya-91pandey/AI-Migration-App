package com.anthropic.claude.api.chat;

@jzk(with = y54.class)
public enum ChatNeedsInputKind
{
    public static final x54 Companion;
    public static final d2d v;
    
    w("PERMISSION", 0), 
    x("QUESTION", 1), 
    y("UNKNOWN", 2);
    
    public static final ChatNeedsInputKind[] z;
    
    static {
        Companion = (x54)new Object();
        v = ncq.F(2, (jta)new kc2((byte)20));
    }
}
