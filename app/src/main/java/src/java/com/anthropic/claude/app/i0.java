package com.anthropic.claude.app;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

public final class i0
{
    public static final i0 a;
    
    static {
        a = (i0)new Object();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.app.ClaudeAppDestination.Extra", v4j.a((Class)ClaudeAppDestination.Extra.class), new rtc[0], new KSerializer[0], new Annotation[0]);
    }
}
