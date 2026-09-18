package com.anthropic.claude.app.main.loggedin;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

public final class j
{
    public static final j a;
    
    static {
        a = (j)new Object();
    }
    
    public static LoggedInScreens a(final s3p s3p, final wn wn) {
        if (wn.a()) {
            return LoggedInScreens.MinorBlocked.INSTANCE;
        }
        if (s3p.g.getValue()) {
            return LoggedInScreens.Onboarding.INSTANCE;
        }
        if (!s3p.a.a().i) {
            return LoggedInScreens.AccountVerification.INSTANCE;
        }
        return LoggedInScreens.ClaudeApp.INSTANCE;
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.app.main.loggedin.LoggedInScreens", v4j.a((Class)LoggedInScreens.class), new rtc[] { (rtc)v4j.a((Class)LoggedInScreens.AccountVerification.class), (rtc)v4j.a((Class)LoggedInScreens.ClaudeApp.class), (rtc)v4j.a((Class)LoggedInScreens.MinorBlocked.class), (rtc)v4j.a((Class)LoggedInScreens.Onboarding.class) }, new KSerializer[] { (KSerializer)new xd9("com.anthropic.claude.app.main.loggedin.LoggedInScreens.AccountVerification", (Object)LoggedInScreens.AccountVerification.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.main.loggedin.LoggedInScreens.ClaudeApp", (Object)LoggedInScreens.ClaudeApp.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.main.loggedin.LoggedInScreens.MinorBlocked", (Object)LoggedInScreens.MinorBlocked.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.main.loggedin.LoggedInScreens.Onboarding", (Object)LoggedInScreens.Onboarding.INSTANCE, new Annotation[0]) }, new Annotation[0]);
    }
}
