package com.anthropic.claude.api.purchase;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

public final class a
{
    public static final a a;
    public static final vee b;
    
    static {
        a = (a)new Object();
        final kotlinx.serialization.modules.a a2 = new kotlinx.serialization.modules.a();
        final tze tze = new tze(v4j.a((Class)IapTransactionResult.class));
        tze.m(v4j.a((Class)IapTransactionResult.UsageCredits.class), IapTransactionResult.UsageCredits.Companion.serializer());
        t08.D(tze, "IapTransactionResult", (lta)new dqb((byte)7));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.purchase.IapTransactionResult", v4j.a((Class)IapTransactionResult.class), new rtc[] { (rtc)v4j.a((Class)IapTransactionResult$Unknown.class), (rtc)v4j.a((Class)IapTransactionResult.UsageCredits.class) }, new KSerializer[] { (KSerializer)new xd9("com.anthropic.claude.api.purchase.IapTransactionResult.Unknown", (Object)IapTransactionResult$Unknown.INSTANCE, new Annotation[] { (Annotation)new qzb("kind") }), (KSerializer)com.anthropic.claude.api.purchase.b.a }, new Annotation[] { (Annotation)new qzb("kind") });
    }
}
