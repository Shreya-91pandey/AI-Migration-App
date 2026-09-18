package com.anthropic.claude.analytics.events;

@jzk
public final class WidgetEvents$QuickActionOpened implements v10
{
    public static final jxp Companion;
    public static final d2d[] b;
    public final WidgetEvents$QuickActionType a = a;
    
    static {
        Companion = new jxp();
        b = new d2d[] { ncq.F(2, (jta)new omp((byte)18)) };
    }
    
    public WidgetEvents$QuickActionOpened(final WidgetEvents$QuickActionType a) {
        this.a = a;
    }
    
    public final String a() {
        return "claudeai.quick_action.opened";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof WidgetEvents$QuickActionOpened && this.a == ((WidgetEvents$QuickActionOpened)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("QuickActionOpened(action=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
