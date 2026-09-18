package com.anthropic.claude.api.chat;

@jzk(with = b44.class)
public enum ChatLiveStatus
{
    public static final a44 Companion;
    public static final d2d v;
    
    w("RUNNING", 0), 
    x("UNKNOWN", 1);
    
    public static final ChatLiveStatus[] y;
    
    static {
        Companion = (a44)new Object();
        v = ncq.F(2, (jta)new kc2((byte)19));
    }
}
