package com.anthropic.claude.analytics.events;

@jzk
public final class DrawerEvents$DrawerItemSelected implements v10
{
    public static final xw8 Companion;
    public static final d2d[] b;
    public final DrawerEvents$DrawerItem a = a;
    
    static {
        Companion = new xw8();
        b = new d2d[] { ncq.F(2, (jta)new wl8((byte)18)) };
    }
    
    public DrawerEvents$DrawerItemSelected(final DrawerEvents$DrawerItem a) {
        this.a = a;
    }
    
    public final String a() {
        return "mobile_drawer_item_selected";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof DrawerEvents$DrawerItemSelected && this.a == ((DrawerEvents$DrawerItemSelected)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DrawerItemSelected(item=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
