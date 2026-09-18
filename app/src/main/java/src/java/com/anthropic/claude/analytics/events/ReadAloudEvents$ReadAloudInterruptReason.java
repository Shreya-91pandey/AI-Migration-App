package com.anthropic.claude.analytics.events;

@jzk
public enum ReadAloudEvents$ReadAloudInterruptReason
{
    A("FOCUS_LOSS", 4), 
    B("NEW_MESSAGE", 5), 
    C("USER_PAUSE", 6);
    
    public static final gri Companion;
    
    D("PREEMPTED", 7), 
    E("NAVIGATED_AWAY", 8);
    
    public static final ReadAloudEvents$ReadAloudInterruptReason[] F;
    public static final d2d v;
    
    w("UNSPECIFIED", 0), 
    x("USER_STOP", 1), 
    y("SYSTEM_INTERRUPTION", 2), 
    z("ROUTE_CHANGE", 3);
    
    static {
        Companion = (gri)new Object();
        v = ncq.F(2, (jta)new lih((byte)7));
    }
}
