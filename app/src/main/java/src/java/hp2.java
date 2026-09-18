public final class hp2 extends m6n implements zta
{
    public final ip2 A;
    public final eic B;
    public byte w;
    public final id0 x;
    public final float y;
    public final boolean z;
    
    public hp2(final id0 x, final float y, final boolean z, final ip2 a, final eic b, final f07 f07) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new hp2(this.x, this.y, this.z, this.A, this.B, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((hp2)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final Object o2 = null;
        if (w != 0) {
            if (w != 1 && w != 2) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(o);
        }
        else {
            vt4.g0(o);
            final id0 x = this.x;
            final float v = ((qs8)x.e.getValue()).v;
            final float y = this.y;
            if (!qs8.e(v, y)) {
                final boolean z = this.z;
                final pc7 v2 = pc7.v;
                if (!z) {
                    final qs8 qs8 = new qs8(y);
                    this.w = 1;
                    if (x.g((f07)this, (Object)qs8) != v2) {
                        return lqo.a;
                    }
                }
                else {
                    final float v3 = ((qs8)x.e.getValue()).v;
                    if (qs8.e(v3, this.A.b)) {
                        o = new vlh(0L);
                    }
                    else if (qs8.e(v3, 1.0f)) {
                        o = new Object();
                    }
                    else {
                        o = o2;
                        if (qs8.e(v3, 0.0f)) {
                            o = new Object();
                        }
                    }
                    this.w = 2;
                    if (h39.a(x, y, (eic)o, this.B, (h07)this) != v2) {
                        return lqo.a;
                    }
                }
                return v2;
            }
        }
        return lqo.a;
    }
}
