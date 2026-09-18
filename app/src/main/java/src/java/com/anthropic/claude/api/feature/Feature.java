package com.anthropic.claude.api.feature;

@jzk(with = k6a.class)
public enum Feature
{
    A("WIGGLE", 3, "wiggle"), 
    B("DITTOS", 4, "dittos"), 
    C("CHAT", 5, "chat");
    
    public static final m5a Companion;
    
    D("CLAUDE_CODE_WEB", 6, "claude_code_web"), 
    E("CLAUDE_CODE_AUTO_PERMISSIONS", 7, "claude_code_desktop_auto_permissions"), 
    F("PUBLIC_PROJECTS", 8, "public_projects"), 
    G("CONVERSATION_SEARCH", 10, "conversation_search"), 
    H("DRAMATIC_SHRIMP", 11, "dramatic_shrimp"), 
    I("THIRD_PARTY_ANALYTICS", 12, "third_party_analytics"), 
    J("MARBLE_HERON", 13, "marble_heron"), 
    K("COBALT_PLINTH", 14, "cobalt_plinth"), 
    L("SKILLS", 15, "skills"), 
    M("SKILL_CREATION", 16, "skill_creation"), 
    N("COWORK_PRODUCT_FEEDBACK", 17, "cowork_product_feedback"), 
    O("CLAUDE_CODE_SELF_HOSTED_RUNNERS", 18, "claude_code_self_hosted_runners"), 
    P("CLAUDE_CODE_ROUTINES", 19, "claude_code_routines");
    
    public static final Feature[] Q;
    public static final d2d w;
    
    x("UNKNOWN", 0, "unknown"), 
    y("WEB_SEARCH", 1, "web_search"), 
    z("SAFFRON", 2, "saffron");
    
    public final String v;
    
    static {
        Companion = (m5a)new Object();
        w = ncq.F(2, (jta)new ux8((byte)12));
    }
    
    public Feature(final String s, final int n, final String v) {
        this.v = v;
    }
}
