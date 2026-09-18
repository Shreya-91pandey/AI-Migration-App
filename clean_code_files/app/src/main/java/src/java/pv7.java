import java.util.concurrent.atomic.AtomicInteger;

public final class pv7 extends m6n implements lta
{
    public final xda A;
    public final Object B;
    public final boolean C;
    public z3j w;
    public byte x;
    public final z3j y;
    public final rv7 z;
    
    public pv7(final z3j y, final rv7 z, final xda a, final Object b, final boolean c, final f07 f07) {
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        return ((pv7)this.create((f07)o)).invokeSuspend(lqo.a);
    }
    
    public final f07 create(final f07 f07) {
        return (f07)new pv7(this.y, this.z, this.A, this.B, this.C, f07);
    }
    
    public final Object invokeSuspend(Object n) {
        final byte x = this.x;
        final lqo a = lqo.a;
        final Object b = this.B;
        final rv7 z = this.z;
        final z3j y = this.y;
        final pc7 v = pc7.v;
        Label_0211: {
            z3j w;
            Object o;
            if (x != 0) {
                if (x != 1) {
                    if (x == 2) {
                        vt4.g0(n);
                        break Label_0211;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    w = this.w;
                    vt4.g0(n);
                    o = n;
                }
            }
            else {
                vt4.g0(n);
                final ozl c = z.c();
                this.w = y;
                this.x = 1;
                o = new Integer(((AtomicInteger)c.b.w).incrementAndGet());
                if (o == v) {
                    return v;
                }
                w = y;
            }
            w.v = ((Number)o).intValue();
            this.w = null;
            this.x = 2;
            final xda a2 = this.A;
            if (a2.c.get()) {
                en9.q("This scope has already been closed.");
                return null;
            }
            n = ncq.N(a2.a, (lta)new wda(a2, b, null), (h07)this);
            if (n != v) {
                n = a;
            }
            if (n != v) {
                break Label_0211;
            }
            return v;
        }
        if (this.C) {
            final j9j h = z.h;
            int hashCode;
            if (b != null) {
                hashCode = b.hashCode();
            }
            else {
                hashCode = 0;
            }
            h.E((vom)new ot7(hashCode, y.v, b));
        }
        return a;
    }
}
