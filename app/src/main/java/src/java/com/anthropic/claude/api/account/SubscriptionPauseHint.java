package com.anthropic.claude.api.account;

@jzk(with = f2n.class)
public enum SubscriptionPauseHint
{
    public static final e2n Companion;
    
    v("ABSENT", 0), 
    w("NO_PAUSE", 1), 
    x("PAUSE", 2);
    
    public static final SubscriptionPauseHint[] y;
    
    static {
        Companion = (e2n)new Object();
    }
}
