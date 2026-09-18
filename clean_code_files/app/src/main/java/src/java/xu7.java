import java.util.List;
import java.util.Iterator;

public final class xu7 extends m6n implements lta
{
    public Object A;
    public Iterator B;
    public int C;
    public byte D;
    public final rv7 E;
    public final uu7 F;
    public final uy7 G;
    public aof w;
    public x3j x;
    public b4j y;
    public Object z;
    
    public xu7(final rv7 e, final uu7 f, final uy7 g, final f07 f2) {
        this.E = e;
        this.F = f;
        this.G = g;
        super(1, f2);
    }
    
    public final Object b(final Object o) {
        return ((xu7)this.create((f07)o)).invokeSuspend(lqo.a);
    }
    
    public final f07 create(final f07 f07) {
        return (f07)new xu7(this.E, this.F, this.G, f07);
    }
    
    public final Object invokeSuspend(Object a) {
        final byte d = this.D;
        final uy7 g = this.G;
        final rv7 e = this.E;
        final int n = 0;
        final pc7 v = pc7.v;
        Label_0663: {
            Object o2 = null;
            Object x2 = null;
            Object y4 = null;
            Label_0506: {
                while (true) {
                    Object o = null;
                    Label_0474: {
                        Object o3;
                        Object w;
                        Object f;
                        if (d != 0) {
                            if (d != 1) {
                                if (d == 2) {
                                    final int c = this.C;
                                    final Iterator b = this.B;
                                    final Iterable iterable = (Iterable)this.A;
                                    o = this.z;
                                    final b4j y = this.y;
                                    final x3j x = this.x;
                                    o2 = this.w;
                                    vt4.g0(a);
                                    a = x;
                                    break Label_0474;
                                }
                                if (d == 3) {
                                    o2 = this.A;
                                    final wu7 wu7 = (wu7)this.z;
                                    final b4j y2 = this.y;
                                    x2 = this.x;
                                    vt4.g0(a);
                                    a = y2;
                                    break Label_0663;
                                }
                                if (d == 4) {
                                    final int c2 = this.C;
                                    o2 = this.A;
                                    final wu7 wu8 = (wu7)this.z;
                                    vt4.g0(a);
                                    break Label_0663;
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            else {
                                o3 = this.z;
                                final b4j y3 = this.y;
                                o2 = this.x;
                                w = this.w;
                                vt4.g0(a);
                                f = a;
                                a = y3;
                            }
                        }
                        else {
                            vt4.g0(a);
                            w = new cof();
                            o2 = new Object();
                            o3 = new Object();
                            this.w = (aof)w;
                            this.x = (x3j)o2;
                            this.y = (b4j)o3;
                            this.z = o3;
                            this.D = 1;
                            f = e.f(true, (zta)this.F, (h07)this);
                            if (f == v) {
                                return v;
                            }
                            a = o3;
                        }
                        ((b4j)o3).v = ((ot7)f).b;
                        final Object z = new wu7((aof)w, (x3j)o2, (b4j)a, e);
                        final List list = (List)g.y;
                        if (list == null) {
                            final aof aof = (aof)w;
                            x2 = o2;
                            y4 = a;
                            o2 = aof;
                            break Label_0506;
                        }
                        final Iterator iterator = ((Iterable)list).iterator();
                        final aof aof2 = (aof)w;
                        final Object o4 = o2;
                        final Object o5 = a;
                        final int c = 0;
                        o2 = aof2;
                        a = o4;
                        final b4j y = (b4j)o5;
                        final Iterator b = iterator;
                        if (!b.hasNext()) {
                            y4 = y;
                            x2 = a;
                            break Label_0506;
                        }
                        final zta zta = (zta)b.next();
                        this.w = (aof)o2;
                        this.x = (x3j)a;
                        this.y = y;
                        this.z = z;
                        this.A = null;
                        this.B = b;
                        this.C = c;
                        this.D = 2;
                        o = z;
                        if (zta.d(z, (Object)this) == v) {
                            return v;
                        }
                    }
                    final Object z = o;
                    continue;
                }
            }
            g.y = null;
            this.w = null;
            this.x = (x3j)x2;
            this.y = (b4j)y4;
            this.z = null;
            this.A = o2;
            this.B = null;
            this.C = 0;
            this.D = 3;
            if (((aof)o2).c((f07)this) == v) {
                return v;
            }
            a = y4;
            try {
                ((x3j)x2).v = true;
                ((aof)o2).g((Object)null);
                o2 = ((b4j)a).v;
                int c2 = n;
                if (o2 != null) {
                    c2 = o2.hashCode();
                }
                final ozl c3 = e.c();
                this.w = null;
                this.x = null;
                this.y = null;
                this.z = null;
                this.A = o2;
                this.C = c2;
                this.D = 4;
                a = c3.a();
                if (a == v) {
                    return v;
                }
                return new ot7(c2, ((Number)a).intValue(), o2);
            }
            finally {
                ((aof)o2).g((Object)null);
            }
        }
    }
}
