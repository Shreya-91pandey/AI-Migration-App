package com.anthropic.claude.api.purchase;

import kotlinx.serialization.KSerializer;

@jzk
@yqc(discriminator = "reason")
public interface IapUsageCreditUnavailableDetails
{
    public static final d Companion = d.a;
    
    @jzk
    public static final class CurrencyUnsupported implements IapUsageCreditUnavailableDetails
    {
        public static final CurrencyUnsupported INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (CurrencyUnsupported)new Object();
            a = ncq.F(2, (jta)new geb((byte)10));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof CurrencyUnsupported;
        }
        
        @Override
        public final int hashCode() {
            return -466255902;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)CurrencyUnsupported.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "CurrencyUnsupported";
        }
    }
    
    @jzk
    public static final class FeatureDisabled implements IapUsageCreditUnavailableDetails
    {
        public static final FeatureDisabled INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (FeatureDisabled)new Object();
            a = ncq.F(2, (jta)new geb((byte)11));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof FeatureDisabled;
        }
        
        @Override
        public final int hashCode() {
            return 982277392;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)FeatureDisabled.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "FeatureDisabled";
        }
    }
    
    @jzk
    public static final class OrgTypeNotEligible implements IapUsageCreditUnavailableDetails
    {
        public static final OrgTypeNotEligible INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (OrgTypeNotEligible)new Object();
            a = ncq.F(2, (jta)new geb((byte)12));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof OrgTypeNotEligible;
        }
        
        @Override
        public final int hashCode() {
            return -591599506;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)OrgTypeNotEligible.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "OrgTypeNotEligible";
        }
    }
    
    @jzk
    public static final class PurchaseLimitExceeded implements IapUsageCreditUnavailableDetails
    {
        public static final PurchaseLimitExceeded INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (PurchaseLimitExceeded)new Object();
            a = ncq.F(2, (jta)new geb((byte)13));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof PurchaseLimitExceeded;
        }
        
        @Override
        public final int hashCode() {
            return 1745866667;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)PurchaseLimitExceeded.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "PurchaseLimitExceeded";
        }
    }
    
    @jzk
    public static final class RequiresAdmin implements IapUsageCreditUnavailableDetails
    {
        public static final RequiresAdmin INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (RequiresAdmin)new Object();
            a = ncq.F(2, (jta)new geb((byte)14));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof RequiresAdmin;
        }
        
        @Override
        public final int hashCode() {
            return 219473215;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)RequiresAdmin.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "RequiresAdmin";
        }
    }
}
