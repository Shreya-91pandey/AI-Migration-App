import com.anthropic.claude.app.d3;
import java.util.List;

public final class ld0 extends m6n implements zta
{
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final byte w;
    public boolean x;
    public Object y;
    public Object z;
    
    public ld0(final xd3 a, final id0 b, final bnf c, final bnf d, final f07 f07) {
        this.w = 0;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        super(2, f07);
    }
    
    @Override
    public final f07 create(final Object z, final f07 f07) {
        final byte w = this.w;
        final Object d = this.D;
        final Object c = this.C;
        final Object b = this.B;
        final Object a = this.A;
        switch (w) {
            default: {
                return new ld0(this.y, this.z, a, b, c, d, f07, (byte)2);
            }
            case 1: {
                return new ld0(this.y, this.z, a, b, c, d, f07, (byte)1);
            }
            case 0: {
                final ld0 ld0 = new ld0((xd3)a, (id0)b, (bnf)c, (bnf)d, f07);
                ld0.z = z;
                return ld0;
            }
        }
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final oc7 oc7 = (oc7)o;
        final f07 f07 = (f07)o2;
        switch (w) {
            default: {
                return ((ld0)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 1: {
                return ((ld0)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((ld0)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    @Override
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        Object a = lqo.a;
        final Object d = this.D;
        final Object c = this.C;
        final Object b = this.B;
        final Object a2 = this.A;
        final pc7 v = pc7.v;
        switch (w) {
            default: {
                final gwj gwj = (gwj)this.z;
                final boolean x = this.x;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final n6k a3 = ljq.a0((jta)new kkk((Object)this.y, (Object)gwj, (byte)1));
                    final d3 d2 = new d3((ax3)a2, (j7c)this.y, (ep0)b, gwj, (st4)c, (u88)d);
                    this.x = true;
                    if (a3.a((jja)d2, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 1: {
                final boolean x2 = this.x;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ypg ypg = (ypg)this.y;
                    final zpg zpg = (zpg)this.z;
                    final List list = (List)a2;
                    final bfa bfa = (bfa)b;
                    final gia gia = (gia)c;
                    final ppg ppg = (ppg)d;
                    this.x = true;
                    o = ypg.n.a(lnf.x, (lta)new wpg(ypg, zpg, list, ppg, bfa, gia, (f07)null), this);
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 0: {
                final xd3 xd3 = (xd3)a2;
                final boolean x3 = this.x;
                Object o2;
                while (true) {
                    en2 iterator = null;
                    oc7 z = null;
                    Object b2 = null;
                    Label_0460: {
                        if (x3) {
                            if (x3) {
                                iterator = (en2)this.y;
                                z = (oc7)this.z;
                                vt4.g0(o);
                                b2 = o;
                                break Label_0460;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            o2 = null;
                            return o2;
                        }
                        else {
                            vt4.g0(o);
                            z = (oc7)this.z;
                            iterator = xd3.iterator();
                        }
                        this.z = z;
                        this.y = iterator;
                        this.x = true;
                        o = (b2 = iterator.b((f07)this));
                        if (o == v) {
                            o2 = v;
                            return o2;
                        }
                    }
                    o2 = a;
                    if (b2) {
                        final Object c2 = iterator.c();
                        o = pg3.b(xd3.k());
                        if (o == null) {
                            o = c2;
                        }
                        rhc.G(z, null, 0, new kd0(o, b, c, d, null, (byte)0), 3);
                        continue;
                    }
                    break;
                }
                return o2;
            }
        }
    }
}
