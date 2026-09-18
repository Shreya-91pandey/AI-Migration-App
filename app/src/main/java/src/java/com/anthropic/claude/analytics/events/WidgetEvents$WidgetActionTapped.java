package com.anthropic.claude.analytics.events;

@jzk
public final class WidgetEvents$WidgetActionTapped implements v10
{
    public static final nxp Companion;
    public static final d2d[] k;
    public final WidgetEvents$WidgetLayoutKind a = a;
    public final String b;
    public final Integer c;
    public final boolean d;
    public final Integer e;
    public final String f;
    public final Integer g;
    public final WidgetEvents$WidgetSizeOrientation h;
    public final WidgetEvents$WidgetTapTarget i;
    public final WidgetEvents$WidgetSessionSurface j;
    
    static {
        Companion = new nxp();
        k = new d2d[] { ncq.F(2, (jta)new omp((byte)20)), null, null, null, null, null, null, ncq.F(2, (jta)new omp((byte)21)), ncq.F(2, (jta)new omp((byte)22)), ncq.F(2, (jta)new omp((byte)23)) };
    }
    
    public WidgetEvents$WidgetActionTapped(final WidgetEvents$WidgetLayoutKind a, final String b, final Integer c, final boolean d, final Integer e, final WidgetEvents$WidgetSizeOrientation h, final WidgetEvents$WidgetTapTarget i, final WidgetEvents$WidgetSessionSurface j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = null;
        this.g = null;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final String a() {
        return "claudeai.widget.tapped";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WidgetEvents$WidgetActionTapped)) {
            return false;
        }
        final WidgetEvents$WidgetActionTapped widgetEvents$WidgetActionTapped = (WidgetEvents$WidgetActionTapped)o;
        return this.a == widgetEvents$WidgetActionTapped.a && mlc.q((Object)this.b, (Object)widgetEvents$WidgetActionTapped.b) && mlc.q((Object)this.c, (Object)widgetEvents$WidgetActionTapped.c) && this.d == widgetEvents$WidgetActionTapped.d && mlc.q((Object)this.e, (Object)widgetEvents$WidgetActionTapped.e) && mlc.q((Object)this.f, (Object)widgetEvents$WidgetActionTapped.f) && mlc.q((Object)this.g, (Object)widgetEvents$WidgetActionTapped.g) && this.h == widgetEvents$WidgetActionTapped.h && this.i == widgetEvents$WidgetActionTapped.i && this.j == widgetEvents$WidgetActionTapped.j;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final int l = smk.l(((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31, 31, this.d);
        final Integer e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final String f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final Integer g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final int hashCode8 = this.h.hashCode();
        final int hashCode9 = this.i.hashCode();
        final WidgetEvents$WidgetSessionSurface j = this.j;
        if (j != null) {
            hashCode2 = j.hashCode();
        }
        return (hashCode9 + (hashCode8 + (((l + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31) * 31) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("WidgetActionTapped(layout=");
        sb.append((Object)this.a);
        sb.append(", button=");
        sb.append(this.b);
        sb.append(", slot_index=");
        sb.append((Object)this.c);
        sb.append(", is_user_configured=");
        sb.append(this.d);
        sb.append(", widget_instance_id=");
        xc2.n(this.e, ", experiment_key=", this.f, ", variation_id=", sb);
        sb.append((Object)this.g);
        sb.append(", size_orientation=");
        sb.append((Object)this.h);
        sb.append(", target=");
        sb.append((Object)this.i);
        sb.append(", session_surface=");
        sb.append((Object)this.j);
        sb.append(")");
        return sb.toString();
    }
}
