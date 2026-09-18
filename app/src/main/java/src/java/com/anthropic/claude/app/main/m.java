package com.anthropic.claude.app.main;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

public final class m
{
    public static final m a;
    
    static {
        a = (m)new Object();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.app.main.MainAppScreens", v4j.a((Class)MainAppScreens.class), new rtc[] { (rtc)v4j.a((Class)MainAppScreens.AddAccount.class), (rtc)v4j.a((Class)MainAppScreens.InternalSettings.class), (rtc)v4j.a((Class)MainAppScreens.LoggedIn.class), (rtc)v4j.a((Class)MainAppScreens.LoggedOut.class), (rtc)v4j.a((Class)MainAppScreens.RequiredUpdate.class), (rtc)v4j.a((Class)MainAppScreens.StepUpReauth.class), (rtc)v4j.a((Class)MainAppScreens.UiDemoApp.class) }, new KSerializer[] { (KSerializer)new xd9("com.anthropic.claude.app.main.MainAppScreens.AddAccount", (Object)MainAppScreens.AddAccount.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.main.MainAppScreens.InternalSettings", (Object)MainAppScreens.InternalSettings.INSTANCE, new Annotation[0]), (KSerializer)n.a, (KSerializer)p.a, (KSerializer)new xd9("com.anthropic.claude.app.main.MainAppScreens.RequiredUpdate", (Object)MainAppScreens.RequiredUpdate.INSTANCE, new Annotation[0]), (KSerializer)r.a, (KSerializer)new xd9("com.anthropic.claude.app.main.MainAppScreens.UiDemoApp", (Object)MainAppScreens.UiDemoApp.INSTANCE, new Annotation[0]) }, new Annotation[0]);
    }
}
