package com.anthropic.claude.api.project;

@jzk(with = ixi.class)
public enum RecentSurface
{
    A("CODE", 3, "code"), 
    B("COWORK_CHAT", 4, "cowork_chat"), 
    C("ARTIFACT", 5, "artifact");
    
    public static final gxi Companion;
    
    D("UNKNOWN", 6, "unknown");
    
    public static final RecentSurface[] E;
    public static final d2d w;
    
    x("CHAT", 0, "chat"), 
    y("PROJECT", 1, "project"), 
    z("COWORK", 2, "cowork");
    
    public final String v;
    
    static {
        Companion = (gxi)new Object();
        w = ncq.F(2, (jta)new lih((byte)12));
    }
    
    public RecentSurface(final String s, final int n, final String v) {
        this.v = v;
    }
}
