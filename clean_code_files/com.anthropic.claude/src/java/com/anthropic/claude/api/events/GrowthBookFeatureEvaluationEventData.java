package com.anthropic.claude.api.events;

import com.anthropic.claude.types.environment.AppEnvironment;

@jzk
public final class GrowthBookFeatureEvaluationEventData
{
    public static final w8b Companion;
    public static final d2d[] k;
    public final String a = a;
    public final hfc b = b;
    public final String c = c;
    public final String d = d;
    public final String e = e;
    public final String f;
    public final AppEnvironment g;
    public final String h;
    public final String i;
    public final String j;
    
    static {
        Companion = (w8b)new Object();
        k = new d2d[] { null, null, null, null, null, null, ncq.F(2, (jta)new ux8((byte)28)), null, null, null };
    }
    
    public GrowthBookFeatureEvaluationEventData(final String a, final hfc b, final String c, final String d, final String e, final String f, final AppEnvironment g, final String i, final String j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = null;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrowthBookFeatureEvaluationEventData)) {
            return false;
        }
        final GrowthBookFeatureEvaluationEventData growthBookFeatureEvaluationEventData = (GrowthBookFeatureEvaluationEventData)o;
        return mlc.q((Object)this.a, (Object)growthBookFeatureEvaluationEventData.a) && mlc.q((Object)this.b, (Object)growthBookFeatureEvaluationEventData.b) && mlc.q((Object)this.c, (Object)growthBookFeatureEvaluationEventData.c) && mlc.q((Object)this.d, (Object)growthBookFeatureEvaluationEventData.d) && mlc.q((Object)this.e, (Object)growthBookFeatureEvaluationEventData.e) && mlc.q((Object)this.f, (Object)growthBookFeatureEvaluationEventData.f) && this.g == growthBookFeatureEvaluationEventData.g && mlc.q((Object)this.h, (Object)growthBookFeatureEvaluationEventData.h) && mlc.q((Object)this.i, (Object)growthBookFeatureEvaluationEventData.i) && mlc.q((Object)this.j, (Object)growthBookFeatureEvaluationEventData.j);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(smk.j(smk.j(t.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int hashCode = 0;
        final String f = this.f;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final AppEnvironment g = this.g;
        int hashCode3;
        if (g == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = g.hashCode();
        }
        final String h = this.h;
        int hashCode4;
        if (h == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = h.hashCode();
        }
        final String i = this.i;
        int hashCode5;
        if (i == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = i.hashCode();
        }
        final String k = this.j;
        if (k != null) {
            hashCode = k.hashCode();
        }
        return ((((j + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GrowthBookFeatureEvaluationEventData(event_id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append((Object)this.b);
        sb.append(", feature_key=");
        oz1.A(sb, this.c, ", value=", this.d, ", reason=");
        oz1.A(sb, this.e, ", unit_id=", this.f, ", environment=");
        sb.append((Object)this.g);
        sb.append(", project_id=");
        sb.append(this.h);
        sb.append(", rule_id=");
        return oz1.q(sb, this.i, ", user_attributes=", this.j, ")");
    }
}
