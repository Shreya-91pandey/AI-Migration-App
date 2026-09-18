public final class ev7 extends m6n implements lta
{
    public int w;
    public byte x;
    public final rv7 y;
    
    public ev7(final rv7 y, final f07 f07) {
        this.y = y;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        return ((ev7)this.create((f07)o)).invokeSuspend(lqo.a);
    }
    
    public final f07 create(final f07 f07) {
        return (f07)new ev7(this.y, f07);
    }
    
    public final Object invokeSuspend(Object o) {
        int w = this.x;
        final rv7 y = this.y;
        final pc7 v = pc7.v;
        Label_0201: {
            Label_0193: {
                Label_0144: {
                    if (w != 0) {
                        if (w != 1) {
                            if (w == 2) {
                                vt4.g0(o);
                                break Label_0144;
                            }
                            if (w != 3) {
                                if (w == 4) {
                                    w = this.w;
                                    try {
                                        vt4.g0(o);
                                        break Label_0201;
                                    }
                                    finally {
                                        break Label_0201;
                                    }
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vt4.g0(o);
                            break Label_0193;
                        }
                        else {
                            vt4.g0(o);
                        }
                    }
                    else {
                        vt4.g0(o);
                        if (!y.k.b()) {
                            this.x = 2;
                            o = null;
                            break Label_0144;
                        }
                        final ozl c = y.c();
                        this.x = 1;
                        if ((o = c.a()) == v) {
                            return v;
                        }
                    }
                    w = ((Number)o).intValue();
                    break Label_0201;
                }
                final yci yci = (yci)o;
                final hc7 v2 = y.c.v;
                final uu7 uu7 = new uu7(y, yci, null);
                this.x = 3;
                if ((o = rhc.f0(v2, (zta)uu7, (f07)this)) == v) {
                    return v;
                }
            }
            w = ((Number)o).intValue();
            try {
                final uy7 i = y.i;
                this.w = w;
                this.x = 4;
                o = i.V((h07)this);
                if (o == v) {
                    return v;
                }
                return lqo.a;
            }
            finally {}
        }
        final Throwable t;
        y.h.E((vom)new dsi(w, t));
        throw t;
    }
}
