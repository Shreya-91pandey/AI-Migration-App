package com.anthropic.claude.api.experience;

@jzk(with = tz9.class)
public enum ExperienceTooltipLocation
{
    public static final ExperienceTooltipLocation[] A;
    public static final sz9 Companion;
    public static final d2d v;
    
    w("UNKNOWN", 0), 
    x("MODEL_SELECTOR", 1), 
    y("VOICE_MODE_BUTTON", 2), 
    z("EARLY_ACCESS_CONTROL", 3);
    
    static {
        Companion = (sz9)new Object();
        v = ncq.F(2, (jta)new ux8((byte)8));
    }
}
