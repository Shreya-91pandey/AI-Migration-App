package com.anthropic.claude.api.model;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

public final class b
{
    public static final b a;
    public static final vee b;
    
    static {
        a = (b)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)ThinkingState.class));
        tze.m(v4j.a((Class)ThinkingState.EffortAndMode.class), ThinkingState.EffortAndMode.Companion.serializer());
        tze.m(v4j.a((Class)ThinkingState.Effort.class), ThinkingState.Effort.Companion.serializer());
        tze.m(v4j.a((Class)ThinkingState.Mode.class), ThinkingState.Mode.Companion.serializer());
        tze.m(v4j.a((Class)ThinkingState.Unknown.class), ThinkingState.Unknown.INSTANCE.serializer());
        tze.i((lta)new jkn((byte)7));
        tze.b(a2);
        b = a2.a();
    }
    
    public static ThinkingState a(final String s, final String s2) {
        if (s != null && s2 != null) {
            return new ThinkingState.EffortAndMode(s, s2);
        }
        if (s != null) {
            return new ThinkingState.Effort(s);
        }
        if (s2 != null) {
            return new ThinkingState.Mode(s2);
        }
        return null;
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.model.ThinkingState", v4j.a((Class)ThinkingState.class), new rtc[] { (rtc)v4j.a((Class)ThinkingState.Effort.class), (rtc)v4j.a((Class)ThinkingState.EffortAndMode.class), (rtc)v4j.a((Class)ThinkingState.Mode.class), (rtc)v4j.a((Class)ThinkingState.Unknown.class) }, new KSerializer[] { (KSerializer)c.a, (KSerializer)f.a, (KSerializer)h.a, (KSerializer)new xd9("unknown", (Object)ThinkingState.Unknown.INSTANCE, new Annotation[] { (Annotation)new Object() }) }, new Annotation[] { (Annotation)new Object() });
    }
}
