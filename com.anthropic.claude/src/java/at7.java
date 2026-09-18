import androidx.work.impl.WorkDatabase;

public final class at7 extends m6n implements zta
{
    public final boolean A;
    public final aua B;
    public final byte w;
    public boolean x;
    public final Object y;
    public final boolean z;
    
    public at7(final f07 f07, final WorkDatabase y, final boolean z, final boolean a, final lta b) {
        this.w = 1;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = (aua)b;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final aua b = this.B;
        final Object y = this.y;
        switch (w) {
            default: {
                return (f07)new at7(y, this.z, this.A, b, f07, (byte)2);
            }
            case 1: {
                return (f07)new at7(f07, (WorkDatabase)y, this.z, this.A, (lta)b);
            }
            case 0: {
                return (f07)new at7(y, this.z, this.A, b, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final oc7 oc7 = (oc7)o;
        final f07 f07 = (f07)o2;
        switch (w) {
            default: {
                return ((at7)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 1: {
                return ((at7)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((at7)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final aua b = this.B;
        final pc7 v = pc7.v;
        final Object y = this.y;
        switch (w) {
            default: {
                final boolean x = this.x;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final quj quj = (quj)y;
                    final zta zta = (zta)b;
                    final boolean a = this.A;
                    final boolean z = this.z;
                    final v94 v2 = new v94(null, zta, quj, a, z);
                    this.x = true;
                    if ((o = quj.i(z, (zta)v2, (h07)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
            case 1: {
                final boolean x2 = this.x;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final WorkDatabase workDatabase = (WorkDatabase)y;
                    final lta lta = (lta)b;
                    final boolean a2 = this.A;
                    final boolean z2 = this.z;
                    final zs7 zs7 = new zs7(a2, z2, workDatabase, null, lta, (byte)1);
                    this.x = true;
                    if ((o = workDatabase.s(z2, (zta)zs7, (h07)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
            case 0: {
                final WorkDatabase workDatabase2 = (WorkDatabase)y;
                final boolean x3 = this.x;
                if (x3) {
                    if (x3) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final boolean b2 = (!workDatabase2.k() || !workDatabase2.l()) && this.z;
                    final WorkDatabase workDatabase3 = (WorkDatabase)y;
                    final lta lta2 = (lta)b;
                    final boolean a3 = this.A;
                    final zs7 zs8 = new zs7(b2, a3, workDatabase3, null, lta2, (byte)0);
                    this.x = true;
                    if ((o = workDatabase3.s(a3, (zta)zs8, (h07)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
        }
    }
}
