package com.anthropic.claude.analytics.events;

@jzk
public enum CodeEvents$CodeSessionListEntrySource
{
    A("HOME_SCREEN", 4), 
    B("APP_LAUNCH", 5);
    
    public static final CodeEvents$CodeSessionListEntrySource[] C;
    public static final vd5 Companion;
    public static final d2d v;
    
    w("UNSPECIFIED", 0), 
    x("DRAWER", 1), 
    y("NOTIFICATION", 2), 
    z("DEEP_LINK", 3);
    
    static {
        Companion = (vd5)new Object();
        v = ncq.F(2, (jta)new lv4((byte)10));
    }
}
