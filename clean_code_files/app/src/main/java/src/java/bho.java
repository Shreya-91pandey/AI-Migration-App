public final class bho extends m6n implements zta
{
    public int A;
    public int B;
    public byte C;
    public final f5g[] D;
    public final dho E;
    public final eeo F;
    public f5g[] w;
    public dho x;
    public eeo y;
    public int z;
    
    public bho(final f5g[] d, final dho e, final eeo f, final f07 f2) {
        this.D = d;
        this.E = e;
        this.F = f;
        super(2, f2);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new bho(this.D, this.E, this.F, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((bho)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte c = this.C;
        while (true) {
            int a = 0;
            Label_0205: {
                int n;
                int z;
                dho dho;
                f5g[] array;
                eeo f;
                if (c != 0) {
                    if (c == 1 || c == 2) {
                        n = this.B;
                        a = this.A;
                        z = this.z;
                        final eeo y = this.y;
                        dho = this.x;
                        array = this.w;
                        vt4.g0(o);
                        f = y;
                        break Label_0205;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(o);
                    array = this.D;
                    n = array.length;
                    a = 0;
                    dho = this.E;
                    f = this.F;
                    z = 0;
                }
                if (a >= n) {
                    return lqo.a;
                }
                final f5g f5g = array[a];
                final int n2 = z + 1;
                final int ordinal = f5g.ordinal();
                if (ordinal != 0) {
                    final pc7 v = pc7.v;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            en9.r();
                            return null;
                        }
                        this.w = array;
                        this.x = dho;
                        this.y = f;
                        this.z = n2;
                        this.A = a;
                        this.B = n;
                        this.C = 2;
                        if (dho.e(f, z, (h07)this) == v) {
                            return v;
                        }
                    }
                    else {
                        this.w = array;
                        this.x = dho;
                        this.y = f;
                        this.z = n2;
                        this.A = a;
                        this.B = n;
                        this.C = 1;
                        if (dho.d(f, z, (h07)this) == v) {
                            return v;
                        }
                    }
                    z = n2;
                    break Label_0205;
                }
                z = n2;
            }
            ++a;
            continue;
        }
    }
}
