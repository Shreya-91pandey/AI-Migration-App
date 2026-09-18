package com.anthropic.claude.api.experience;

@jzk(with = iy9.class)
public enum ExperiencePlacement
{
    public static final ExperiencePlacement[] A;
    public static final hy9 Companion;
    public static final d2d v;
    
    w("UNKNOWN", 0), 
    x("ANDROID_SPOTLIGHT", 1), 
    y("ANDROID_CHAT_TOOLTIP", 2), 
    z("ANDROID_CHAT_INPUT_BANNER", 4);
    
    static {
        Companion = (hy9)new Object();
        v = ncq.F(2, (jta)new ux8((byte)6));
    }
}
