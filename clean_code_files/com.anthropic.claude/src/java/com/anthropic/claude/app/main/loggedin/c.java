package com.anthropic.claude.app.main.loggedin;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

public final class c
{
    public static final c a;
    
    static {
        a = (c)new Object();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.app.main.loggedin.BootstrapScreen", v4j.a((Class)BootstrapScreen.class), new rtc[] { (rtc)v4j.a((Class)BootstrapScreen.Bootstrapped.class), (rtc)v4j.a((Class)BootstrapScreen.NeedsBootstrap.class) }, new KSerializer[] { (KSerializer)com.anthropic.claude.app.main.loggedin.a.a, (KSerializer)d.a }, new Annotation[0]);
    }
}
