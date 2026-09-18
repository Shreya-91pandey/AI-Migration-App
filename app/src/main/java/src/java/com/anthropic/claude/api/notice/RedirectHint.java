package com.anthropic.claude.api.notice;

@jzk(with = q3j.class)
public enum RedirectHint
{
    public static final RedirectHint[] A;
    public static final p3j Companion;
    public static final d2d v;
    
    w("APP_STORE", 0), 
    x("PLAY_STORE", 1), 
    y("WEB_CHECKOUT", 2), 
    z("UNKNOWN", 4);
    
    static {
        Companion = (p3j)new Object();
        v = ncq.F(2, (jta)new lih((byte)19));
    }
}
