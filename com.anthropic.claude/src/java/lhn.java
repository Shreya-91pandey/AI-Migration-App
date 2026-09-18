public final class lhn extends m6n implements zta
{
    public final boolean A;
    public final long B;
    public final k2j C;
    public float w;
    public byte x;
    public final float y;
    public final mhn z;
    
    public lhn(final float y, final mhn z, final boolean a, final long b, final k2j c, final f07 f07) {
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new lhn(this.y, this.z, this.A, this.B, this.C, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((lhn)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object p) {
        final byte x = this.x;
        final mhn z = this.z;
        final pc7 v = pc7.v;
        float w;
        if (x != 0) {
            if (x != 1) {
                if (x == 2) {
                    vt4.g0(p);
                    return lqo.a;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                w = this.w;
                vt4.g0(p);
            }
        }
        else {
            vt4.g0(p);
            final float n = w = this.y;
            if (!Float.isNaN(n)) {
                if (Float.isInfinite(n)) {
                    w = n;
                }
                else {
                    double n2;
                    if (n > 0.0f) {
                        n2 = Math.ceil((double)n);
                    }
                    else {
                        n2 = Math.floor((double)n);
                    }
                    w = (float)n2;
                }
            }
            final ufk s = z.S;
            this.w = w;
            this.x = 1;
            if ((p = soh.P((mgk)s, w, (h07)this)) == v) {
                return v;
            }
        }
        final float floatValue = ((Number)p).floatValue();
        if (!this.A) {
            return lqo.a;
        }
        final boolean d = dnn.d(this.B);
        k2j k2j2;
        final k2j k2j = k2j2 = this.C;
        if (d) {
            k2j2 = k2j;
            if (k2j.c - k2j.a <= 0.0f) {
                if (Math.abs(w - floatValue) < 1.0f) {
                    k2j2 = k2j;
                }
                else {
                    k2j2 = k2j.b(k2j, 0.0f, k2j.c + 1.0f, 0.0f, 11);
                }
            }
        }
        final rl2 h = z.N.h;
        this.x = 2;
        if (h.a(k2j2, (h07)this) != v) {
            return lqo.a;
        }
        return v;
    }
}
