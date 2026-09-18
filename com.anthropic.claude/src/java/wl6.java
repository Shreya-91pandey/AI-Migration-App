import java.util.List;

public final class wl6 implements hfg, fc7
{
    public static final def w;
    public final gva v;
    
    static {
        w = new def((byte)13);
    }
    
    public wl6(final gva v) {
        this.v = v;
    }
    
    @Override
    public final boolean A() {
        return this.v.C;
    }
    
    public final hc7 F0(final hc7 hc7) {
        return uuj.s0((hc7)this, hc7);
    }
    
    public final /* bridge */ fc7 M0(final gc7 gc7) {
        return r6k.s((fc7)this, gc7);
    }
    
    public final Object V(final zta zta, final Object o) {
        return zta.d(o, (Object)this);
    }
    
    public final /* bridge */ hc7 c0(final gc7 gc7) {
        return r6k.J((fc7)this, gc7);
    }
    
    public final gc7 getKey() {
        return (gc7)wl6.w;
    }
    
    @Override
    public final List u(final Integer n) {
        return this.v.K();
    }
}
