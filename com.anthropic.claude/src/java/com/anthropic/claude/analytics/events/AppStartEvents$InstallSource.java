package com.anthropic.claude.analytics.events;

@jzk
public enum AppStartEvents$InstallSource
{
    A("HUAWEI_APPGALLERY", 4), 
    B("XIAOMI_GETAPPS", 5), 
    C("PACKAGE_INSTALLER_OR_SIDELOAD", 6);
    
    public static final jq0 Companion;
    
    D("OTHER_STORE", 7);
    
    public static final AppStartEvents$InstallSource[] E;
    public static final d2d v;
    
    w("UNSPECIFIED", 0), 
    x("PLAY_STORE", 1), 
    y("AMAZON_APPSTORE", 2), 
    z("SAMSUNG_GALAXY_STORE", 3);
    
    static {
        Companion = (jq0)new Object();
        v = ncq.F(2, (jta)new kh0((byte)12));
    }
}
