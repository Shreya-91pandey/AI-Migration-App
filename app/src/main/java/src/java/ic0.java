import android.view.Choreographer$FrameCallback;
import java.util.ArrayList;
import android.view.Choreographer;

public final class ic0 implements ahf
{
    public final byte v;
    public final Object w;
    public final Object x;
    
    public ic0(final ahf w) {
        this.v = 2;
        this.w = w;
        this.x = new rfa();
    }
    
    public ic0(final Choreographer w, final gc0 x) {
        this.v = 0;
        this.w = w;
        this.x = x;
    }
    
    public ic0(final jta w) {
        this.v = 1;
        this.w = w;
        this.x = new uy7((byte)1);
    }
    
    public final hc7 F0(final hc7 hc7) {
        switch (this.v) {
            default: {
                return uuj.s0((hc7)this, hc7);
            }
            case 1: {
                return uuj.s0((hc7)this, hc7);
            }
            case 0: {
                return uuj.s0((hc7)this, hc7);
            }
        }
    }
    
    public final fc7 M0(final gc7 gc7) {
        switch (this.v) {
            default: {
                return r6k.s((fc7)this, gc7);
            }
            case 1: {
                return r6k.s((fc7)this, gc7);
            }
            case 0: {
                return r6k.s((fc7)this, gc7);
            }
        }
    }
    
    public final Object V(final zta zta, final Object o) {
        switch (this.v) {
            default: {
                return zta.d(o, (Object)this);
            }
            case 1: {
                return zta.d(o, (Object)this);
            }
            case 0: {
                return zta.d(o, (Object)this);
            }
        }
    }
    
    public final hc7 c0(final gc7 gc7) {
        switch (this.v) {
            default: {
                return r6k.J((fc7)this, gc7);
            }
            case 1: {
                return r6k.J((fc7)this, gc7);
            }
            case 0: {
                return r6k.J((fc7)this, gc7);
            }
        }
    }
    
    @Override
    public final Object p0(final f07 f07, lta v) {
        switch (this.v) {
            default: {
                hwg hwg = null;
                Label_0077: {
                    if (f07 instanceof hwg) {
                        hwg = (hwg)f07;
                        final int y = hwg.y;
                        if ((y & Integer.MIN_VALUE) != 0x0) {
                            hwg.y = y + Integer.MIN_VALUE;
                            break Label_0077;
                        }
                    }
                    hwg = new hwg(this, f07);
                }
                Object o = hwg.w;
                final pc7 v2 = pc7.v;
                final int y2 = hwg.y;
                Label_0288: {
                    if (y2 != 0) {
                        if (y2 == 1) {
                            v = hwg.v;
                            vt4.g0(o);
                            break Label_0288;
                        }
                        if (y2 == 2) {
                            vt4.g0(o);
                            return o;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                        return o;
                    }
                    vt4.g0(o);
                    final rfa rfa = (rfa)this.x;
                    hwg.v = v;
                    hwg.y = 1;
                    final Object b = rfa.b;
                    synchronized (b) {
                        final boolean a = rfa.a;
                        monitorexit(b);
                        Label_0279: {
                            if (a) {
                                final Object o2 = lqo.a;
                                break Label_0279;
                            }
                            final l13 l13 = new l13(1, ljq.K((f07)hwg));
                            l13.r();
                            synchronized (rfa.b) {
                                ((ArrayList)rfa.c).add((Object)l13);
                                monitorexit(b);
                                l13.v((lta)new dd6((Object)rfa, (Object)l13, (byte)16));
                                Object o2 = l13.p();
                                if (o2 != v2) {
                                    o2 = lqo.a;
                                }
                                if (o2 != v2) {
                                    final ahf ahf = (ahf)this.w;
                                    hwg.v = null;
                                    hwg.y = 2;
                                    if ((o = ahf.p0((f07)hwg, v)) != v2) {
                                        return o;
                                    }
                                }
                                o = v2;
                                return o;
                            }
                        }
                    }
                }
            }
            case 1: {
                final l13 a2 = new l13(1, ljq.K(f07));
                a2.r();
                final uy7 uy7 = (uy7)this.x;
                final Object o3 = new Object();
                ((cm2)o3).a = a2;
                ((cm2)o3).b = v;
                a2.v((lta)new dr0(uy7.B((rn1)o3, (jta)this.w), (byte)1));
                return a2.p();
            }
            case 0: {
                final gc0 gc0 = (gc0)this.x;
                final l13 l14 = new l13(1, ljq.K(f07));
                l14.r();
                final hc0 hc0 = new hc0(l14, this, v);
                if (mlc.q((Object)gc0.w, (Object)this.w)) {
                    final Object y3;
                    monitorenter(y3 = gc0.y);
                    Label_0556: {
                        try {
                            gc0.A.add((Object)hc0);
                            if (!gc0.D) {
                                gc0.D = true;
                                gc0.w.postFrameCallback((Choreographer$FrameCallback)gc0.E);
                            }
                        }
                        finally {
                            break Label_0556;
                        }
                        monitorexit(y3);
                        final Throwable t;
                        l14.v((lta)new n90((Object)gc0, (Object)t, (byte)1));
                        return l14.p();
                    }
                    monitorexit(y3);
                }
                else {
                    ((Choreographer)this.w).postFrameCallback((Choreographer$FrameCallback)hc0);
                    l14.v((lta)new p6((Object)this, (Object)hc0, (byte)4));
                }
                return l14.p();
            }
        }
    }
}
