package com.anthropic.claude.api.account;

@jzk
public enum BillingType
{
    public static final lc2 Companion;
    public static final d2d w;
    public static final BillingType[] x;
    public final String v;
    
    static {
        x = new BillingType[] { new BillingType("NONE", 0, "none"), new BillingType("STRIPE_SELF_SERVE_SUBSCRIPTION", 1, "stripe_subscription"), new BillingType("STRIPE_SUBSCRIPTION_CONTRACTED", 2, "stripe_subscription_contracted"), new BillingType("STRIPE_SUBSCRIPTION_ENTERPRISE_SELF_SERVE", 3, "stripe_subscription_enterprise_self_serve"), new BillingType("EXTERNAL_SUBSCRIPTION_CONTRACTED", 4, "external_subscription_contracted"), new BillingType("AWS_MARKETPLACE", 5, "aws_marketplace"), new BillingType("AZURE_AI_FOUNDRY", 6, "azure_ai_foundry"), new BillingType("APPLE_SUBSCRIPTION", 7, "apple_subscription"), new BillingType("GOOGLE_PLAY_SUBSCRIPTION", 8, "google_play_subscription"), new BillingType("API_EVALUATION", 9, "api_evaluation"), new BillingType("PREPAID", 10, "prepaid"), new BillingType("USAGE_BASED", 11, "usage_based"), new BillingType("C4E_CONSUMPTION_TRIAL", 12, "c4e_consumption_trial") };
        Companion = (lc2)new Object();
        w = ncq.F(2, (jta)new kc2((byte)0));
    }
    
    public BillingType(final String s, final int n, final String v) {
        this.v = v;
    }
    
    public final String toString() {
        return this.v;
    }
}
