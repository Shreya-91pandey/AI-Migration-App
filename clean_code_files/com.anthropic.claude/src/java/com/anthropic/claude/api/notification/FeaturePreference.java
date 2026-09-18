package com.anthropic.claude.api.notification;

@jzk
public final class FeaturePreference
{
    public static final i6a Companion;
    public final ChannelPreference a;
    public final ChannelPreference b;
    public final ChannelPreference c;
    public final ChannelPreference d;
    public final ChannelPreference e;
    public final ChannelPreference f;
    public final ChannelPreference g;
    
    static {
        Companion = (i6a)new Object();
    }
    
    public FeaturePreference(final ChannelPreference a, final ChannelPreference b, final ChannelPreference c, final ChannelPreference d, final ChannelPreference e, final ChannelPreference f, final ChannelPreference g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static FeaturePreference a(final FeaturePreference featurePreference, ChannelPreference a, ChannelPreference b, ChannelPreference c, ChannelPreference d, ChannelPreference e, ChannelPreference f, ChannelPreference g, final int n) {
        if ((n & 0x1) != 0x0) {
            a = featurePreference.a;
        }
        if ((n & 0x2) != 0x0) {
            b = featurePreference.b;
        }
        if ((n & 0x4) != 0x0) {
            c = featurePreference.c;
        }
        if ((n & 0x8) != 0x0) {
            d = featurePreference.d;
        }
        if ((n & 0x10) != 0x0) {
            e = featurePreference.e;
        }
        if ((n & 0x20) != 0x0) {
            f = featurePreference.f;
        }
        if ((n & 0x40) != 0x0) {
            g = featurePreference.g;
        }
        featurePreference.getClass();
        return new FeaturePreference(a, b, c, d, e, f, g);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FeaturePreference)) {
            return false;
        }
        final FeaturePreference featurePreference = (FeaturePreference)o;
        return mlc.q((Object)this.a, (Object)featurePreference.a) && mlc.q((Object)this.b, (Object)featurePreference.b) && mlc.q((Object)this.c, (Object)featurePreference.c) && mlc.q((Object)this.d, (Object)featurePreference.d) && mlc.q((Object)this.e, (Object)featurePreference.e) && mlc.q((Object)this.f, (Object)featurePreference.f) && mlc.q((Object)this.g, (Object)featurePreference.g);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final ChannelPreference a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final ChannelPreference b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final ChannelPreference c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final ChannelPreference d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final ChannelPreference e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final ChannelPreference f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final ChannelPreference g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FeaturePreference(compass=");
        sb.append((Object)this.a);
        sb.append(", completion=");
        sb.append((Object)this.b);
        sb.append(", bogosort=");
        sb.append((Object)this.c);
        sb.append(", code_requires_action=");
        sb.append((Object)this.d);
        sb.append(", dispatch=");
        sb.append((Object)this.e);
        sb.append(", marketing=");
        sb.append((Object)this.f);
        sb.append(", routines=");
        sb.append((Object)this.g);
        sb.append(")");
        return sb.toString();
    }
}
