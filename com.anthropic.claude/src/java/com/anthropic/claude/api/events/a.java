package com.anthropic.claude.api.events;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

public final class a
{
    public static final a a;
    
    static {
        a = (a)new Object();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.events.EventLoggingRequest", v4j.a((Class)EventLoggingRequest.class), new rtc[] { (rtc)v4j.a((Class)EventLoggingRequest.ExperimentExposure.class), (rtc)v4j.a((Class)EventLoggingRequest.FeatureEvaluation.class), (rtc)v4j.a((Class)EventLoggingRequest.HealthMetric.class), (rtc)v4j.a((Class)EventLoggingRequest.ProductAnalytics.class) }, new KSerializer[] { (KSerializer)c.a, (KSerializer)e.a, (KSerializer)g.a, (KSerializer)i.a }, new Annotation[] { (Annotation)new Object() });
    }
}
