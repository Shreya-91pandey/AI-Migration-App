package com.anthropic.claude.api.chat;

@jzk(with = uw3.class)
public enum ChatFeedbackType
{
    A("FLAG_HARMFUL", 3, "flag/harmful"), 
    B("FLAG_REFUSAL", 4, "flag/refusal"), 
    C("FLAG_FILE", 5, "flag/file");
    
    public static final tw3 Companion;
    
    D("FLAG_INSTRUCTIONS", 6, "flag/instructions"), 
    E("FLAG_FACTS", 7, "flag/facts"), 
    F("FLAG_INCOMPLETE", 8, "flag/incomplete"), 
    G("FLAG_MEMORY", 9, "flag/memory"), 
    H("FLAG_SAFETY_CLASSIFIER_FALSE_POSITIVE", 10, "sc/false_positive"), 
    I("FLAG_OTHER", 11, "flag/other");
    
    public static final ChatFeedbackType[] J;
    public static final td9 K;
    public static final d2d w;
    
    x("UPVOTE", 0, "upvote"), 
    y("FLAG", 1, "flag"), 
    z("FLAG_BUG", 2, "flag/bug");
    
    public final String v;
    
    static {
        Companion = (tw3)new Object();
        w = ncq.F(2, (jta)new kc2((byte)11));
    }
    
    public ChatFeedbackType(final String s, final int n, final String v) {
        this.v = v;
    }
    
    public final String toString() {
        return this.v;
    }
}
