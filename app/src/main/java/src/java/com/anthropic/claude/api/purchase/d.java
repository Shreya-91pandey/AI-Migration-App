package com.anthropic.claude.api.purchase;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

public final class d
{
    public static final d a;
    public static final vee b;
    
    static {
        a = (d)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)IapUsageCreditUnavailableDetails.class));
        tze.m(v4j.a((Class)IapUsageCreditUnavailableDetails.RequiresAdmin.class), IapUsageCreditUnavailableDetails.RequiresAdmin.INSTANCE.serializer());
        tze.m(v4j.a((Class)IapUsageCreditUnavailableDetails.FeatureDisabled.class), IapUsageCreditUnavailableDetails.FeatureDisabled.INSTANCE.serializer());
        tze.m(v4j.a((Class)IapUsageCreditUnavailableDetails.CurrencyUnsupported.class), IapUsageCreditUnavailableDetails.CurrencyUnsupported.INSTANCE.serializer());
        tze.m(v4j.a((Class)IapUsageCreditUnavailableDetails.OrgTypeNotEligible.class), IapUsageCreditUnavailableDetails.OrgTypeNotEligible.INSTANCE.serializer());
        tze.m(v4j.a((Class)IapUsageCreditUnavailableDetails.PurchaseLimitExceeded.class), IapUsageCreditUnavailableDetails.PurchaseLimitExceeded.INSTANCE.serializer());
        t08.D(tze, "IapUsageCreditUnavailableDetails", (lta)new dqb((byte)8));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.purchase.IapUsageCreditUnavailableDetails", v4j.a((Class)IapUsageCreditUnavailableDetails.class), new rtc[] { (rtc)v4j.a((Class)IapUsageCreditUnavailableDetails.CurrencyUnsupported.class), (rtc)v4j.a((Class)IapUsageCreditUnavailableDetails.FeatureDisabled.class), (rtc)v4j.a((Class)IapUsageCreditUnavailableDetails.OrgTypeNotEligible.class), (rtc)v4j.a((Class)IapUsageCreditUnavailableDetails.PurchaseLimitExceeded.class), (rtc)v4j.a((Class)IapUsageCreditUnavailableDetails.RequiresAdmin.class), (rtc)v4j.a((Class)IapUsageCreditUnavailableDetails$Unknown.class) }, new KSerializer[] { (KSerializer)new xd9("currency_unsupported", (Object)IapUsageCreditUnavailableDetails.CurrencyUnsupported.INSTANCE, new Annotation[] { (Annotation)new qzb("reason") }), (KSerializer)new xd9("feature_disabled", (Object)IapUsageCreditUnavailableDetails.FeatureDisabled.INSTANCE, new Annotation[] { (Annotation)new qzb("reason") }), (KSerializer)new xd9("org_type_not_eligible", (Object)IapUsageCreditUnavailableDetails.OrgTypeNotEligible.INSTANCE, new Annotation[] { (Annotation)new qzb("reason") }), (KSerializer)new xd9("purchase_limit_exceeded", (Object)IapUsageCreditUnavailableDetails.PurchaseLimitExceeded.INSTANCE, new Annotation[] { (Annotation)new qzb("reason") }), (KSerializer)new xd9("requires_admin", (Object)IapUsageCreditUnavailableDetails.RequiresAdmin.INSTANCE, new Annotation[] { (Annotation)new qzb("reason") }), (KSerializer)new xd9("com.anthropic.claude.api.purchase.IapUsageCreditUnavailableDetails.Unknown", (Object)IapUsageCreditUnavailableDetails$Unknown.INSTANCE, new Annotation[] { (Annotation)new qzb("reason") }) }, new Annotation[] { (Annotation)new qzb("reason") });
    }
}
