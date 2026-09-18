public final class un0 implements ija
{
    public final byte v;
    public final Object w;
    
    public final Object a(final jja jja, final f07 f07) {
        final byte v = this.v;
        Object a = lqo.a;
        final pc7 v2 = pc7.v;
        final Object w = this.w;
        switch (v) {
            default: {
                final ija[] array = (ija[])w;
                final Object m = k8e.m(f07, jja, (jta)new nr((Object)array, (byte)14), (bua)new m6n(3, (f07)null), array);
                if (m == v2) {
                    a = m;
                }
                return a;
            }
            case 2: {
                final o10 o10 = new o10((Object)w, (Object)jja, (f07)null, (byte)20);
                final mdk mdk = new mdk(f07, f07.getContext());
                final Object m2 = t08.m0(mdk, true, (Object)mdk, (zta)o10);
                if (m2 == v2) {
                    a = m2;
                }
                return a;
            }
            case 1: {
                Object o11 = null;
                Label_0198: {
                    if (f07 instanceof p47) {
                        final p47 p2 = (p47)f07;
                        final int w2 = p2.w;
                        if ((w2 & Integer.MIN_VALUE) != 0x0) {
                            p2.w = w2 + Integer.MIN_VALUE;
                            o11 = p2;
                            break Label_0198;
                        }
                    }
                    o11 = new p47(this, f07);
                }
                final Object v3 = ((p47)o11).v;
                final int w3 = ((p47)o11).w;
                if (w3 != 0) {
                    if (w3 == 1) {
                        vt4.g0(v3);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v3);
                    final ae3 ae3 = (ae3)w;
                    final bd0 bd0 = new bd0(jja, (byte)13);
                    ((p47)o11).w = 1;
                    if (ae3.a((jja)bd0, (f07)o11) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 0: {
                sn0 sn2 = null;
                Label_0335: {
                    if (f07 instanceof sn0) {
                        final sn0 sn0 = (sn0)f07;
                        final int w4 = sn0.w;
                        if ((w4 & Integer.MIN_VALUE) != 0x0) {
                            sn0.w = w4 + Integer.MIN_VALUE;
                            sn2 = sn0;
                            break Label_0335;
                        }
                    }
                    sn2 = new sn0(this, f07);
                }
                final Object v4 = sn2.v;
                final int w5 = sn2.w;
                if (w5 != 0) {
                    if (w5 == 1) {
                        vt4.g0(v4);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v4);
                    final apm apm = (apm)w;
                    final bd0 bd2 = new bd0(jja, (byte)1);
                    sn2.w = 1;
                    apm.a((jja)bd2, (f07)sn2);
                    a = v2;
                }
                return a;
            }
        }
    }
}
