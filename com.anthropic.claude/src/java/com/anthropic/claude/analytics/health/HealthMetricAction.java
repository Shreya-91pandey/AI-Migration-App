package com.anthropic.claude.analytics.health;

@jzk
public enum HealthMetricAction
{
    A("MESSAGE_SEND", 3, "chat.message_send"), 
    B("CONVERSATION_OPEN", 4, "chat.conversation_open"), 
    C("CONVERSATION_CREATE", 5, "chat.conversation_create");
    
    public static final bhb Companion;
    
    D("PROJECT_CREATE", 6, "chat.project_create"), 
    E("PROJECTS_LOAD", 7, "page.projects_load"), 
    F("PAID_CONVERSION", 8, "page.paid_conversion"), 
    G("ONBOARDING_COMPLETE", 9, "page.onboarding_complete"), 
    H("VOICE_DICTATION", 10, "voice.dictation"), 
    I("APP_BOOTSTRAP", 11, "app.bootstrap"), 
    J("PLAN_UPGRADE", 12, "billing.plan_upgrade"), 
    K("CONVERSATION_SEARCH", 13, "chat.conversation_search"), 
    L("COWORK_MESSAGE_SEND", 14, "cowork.message_send"), 
    M("COWORK_CONVERSATION_CREATE", 15, "cowork.conversation_create"), 
    N("COWORK_TAB_LOAD", 16, "cowork.tab_load"), 
    O("COWORK_CONVERSATION_OPEN", 17, "cowork.conversation_open"), 
    P("CODE_TAB_LOAD", 18, "code.tab_load"), 
    Q("MCP_APP_WIDGET_RENDER", 19, "mcp_app.widget_render"), 
    R("FILE_UPLOAD", 20, "chat.file_upload"), 
    S("UPGRADE_LOAD", 21, "page.upgrade_load"), 
    T("PHONE_CODE_SEND", 22, "auth.phone_code_send"), 
    U("INCOGNITO_CONVERSATION_CREATE", 23, "chat.incognito_conversation_create"), 
    V("PROJECT_FILE_UPLOAD", 24, "chat.project_file_upload"), 
    W("VOICE_SESSION_START", 26, "voice.session_start"), 
    X("VOICE_TURN_COMPLETE", 27, "voice.turn_complete"), 
    Y("VOICE_SESSION_END", 28, "voice.session_end"), 
    Z("VOICE_READ_ALOUD", 29, "voice.read_aloud"), 
    a0("COWORK_MESSAGE_REPLY", 30, "cowork.message_reply"), 
    b0("MESSAGE_STREAM_COMPLETE", 31, "chat.message_stream_complete"), 
    c0("CODE_TURN_COMPLETE", 32, "code.turn_complete"), 
    d0("COWORK_TURN_COMPLETE", 33, "cowork.turn_complete"), 
    e0("CODE_MESSAGE_REPLY", 34, "code.message_reply"), 
    f0("CODE_CHANNEL_MESSAGE_SEND", 35, "code.channel_message_send"), 
    g0("CODE_CHANNEL_STREAM_OPEN", 36, "code.channel_stream_open"), 
    h0("CODE_CHANNEL_THREAD_OPEN", 37, "code.channel_thread_open"), 
    i0("RECENTS_LOAD", 38, "page.recents_load"), 
    j0("VOICE_TURN_RESPONDED", 39, "voice.turn_responded"), 
    k0("ACCOUNT_SWITCH", 40, "auth.account_switch");
    
    public static final HealthMetricAction[] l0;
    public static final d2d w;
    
    x("UNSPECIFIED", 0, "unspecified"), 
    y("LOGIN", 1, "auth.login"), 
    z("SIGNUP", 2, "auth.signup");
    
    public final String v;
    
    static {
        Companion = (bhb)new Object();
        w = ncq.F(2, (jta)new geb((byte)2));
    }
    
    public HealthMetricAction(final String s, final int n, final String v) {
        this.v = v;
    }
}
