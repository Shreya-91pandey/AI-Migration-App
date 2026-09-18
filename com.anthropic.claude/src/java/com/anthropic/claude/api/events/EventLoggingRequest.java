package com.anthropic.claude.api.events;

@jzk
@yqc(discriminator = "event_type")
public interface EventLoggingRequest
{
    public static final a Companion = a.a;
    
    @jzk
    public static final class ExperimentExposure implements EventLoggingRequest
    {
        public static final d Companion;
        public final GrowthBookExperimentEventData a = a;
        
        static {
            Companion = new d();
        }
        
        public ExperimentExposure(final GrowthBookExperimentEventData a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof ExperimentExposure && mlc.q((Object)this.a, (Object)((ExperimentExposure)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("ExperimentExposure(event_data=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @jzk
    public static final class FeatureEvaluation implements EventLoggingRequest
    {
        public static final f Companion;
        public final GrowthBookFeatureEvaluationEventData a = a;
        
        static {
            Companion = (f)new Object();
        }
        
        public FeatureEvaluation(final GrowthBookFeatureEvaluationEventData a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof FeatureEvaluation && mlc.q((Object)this.a, (Object)((FeatureEvaluation)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("FeatureEvaluation(event_data=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @jzk
    public static final class HealthMetric implements EventLoggingRequest
    {
        public static final h Companion;
        public final HealthMetricEventData a = a;
        
        static {
            Companion = (h)new Object();
        }
        
        public HealthMetric(final HealthMetricEventData a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof HealthMetric && mlc.q((Object)this.a, (Object)((HealthMetric)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("HealthMetric(event_data=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @jzk
    public static final class ProductAnalytics implements EventLoggingRequest
    {
        public static final j Companion;
        public final ProductAnalyticsEventData a = a;
        
        static {
            Companion = new j();
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof ProductAnalytics && mlc.q((Object)this.a, (Object)((ProductAnalytics)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("ProductAnalytics(event_data=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
}
