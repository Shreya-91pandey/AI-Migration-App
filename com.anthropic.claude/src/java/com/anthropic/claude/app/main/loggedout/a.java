package com.anthropic.claude.app.main.loggedout;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

public final class a
{
    public static final a a;
    
    static {
        a = (a)new Object();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination", v4j.a((Class)LoggedOutAppDestination.class), new rtc[] { (rtc)v4j.a((Class)LoggedOutAppDestination.LoginApp.class) }, new KSerializer[] { (KSerializer)new xd9("com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination.LoginApp", (Object)LoggedOutAppDestination.LoginApp.INSTANCE, new Annotation[0]) }, new Annotation[0]);
    }
}
