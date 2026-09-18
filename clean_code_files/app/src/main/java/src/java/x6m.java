public final class x6m
{
    public final cof a;
    public final ksg b;
    
    public x6m() {
        this.a = new cof();
        this.b = o50.Q((Object)null);
    }
    
    public static Object b(final x6m x6m, final String s, final f07 f07) {
        x6m.getClass();
        return x6m.a((e7m)new v6m(s, (String)null, false, r6m.v), f07);
    }
    
    public final Object a(e7m v, final f07 f07) {
        w6m w6m = null;
        Label_0049: {
            if (f07 instanceof w6m) {
                w6m = (w6m)f07;
                final int z = w6m.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    w6m.z = z + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            w6m = new w6m(this, f07);
        }
        final Object x = w6m.x;
        final int z2 = w6m.z;
        final ksg b = this.b;
        final pc7 v2 = pc7.v;
        aof aof = null;
        Label_0140: {
            if (z2 == 0) {
                break Label_0140;
            }
            Label_0117: {
                if (z2 == 1) {
                    break Label_0117;
                }
                Label_0110: {
                    if (z2 != 2) {
                        break Label_0110;
                    }
                    Object w = v = (e7m)w6m.w;
                    Label_0292: {
                        try {
                            vt4.g0(x);
                            v = (e7m)x;
                            break Label_0292;
                        }
                        finally {
                            b.setValue((Object)null);
                            return v2;
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                            while (true) {
                                e7m v3 = null;
                                w6m.v = v3;
                                w6m.w = (aof)w;
                                w6m.z = 2;
                                final l13 l13 = new l13(1, ljq.K((f07)w6m));
                                l13.r();
                                b.setValue((Object)new u6m(v3, l13));
                                iftrue(Label_0292:)((v = (e7m)l13.p()) != v2);
                                return v2;
                                vt4.g0(x);
                                w6m.v = v;
                                final cof a = this.a;
                                w6m.w = (aof)a;
                                w6m.z = 1;
                                w = a;
                                v3 = v;
                                iftrue(Label_0191:)(a.c((f07)w6m) != v2);
                                return v2;
                                aof = (aof)w;
                                try {
                                    b.setValue((Object)null);
                                    ((aof)w).g((Object)null);
                                    return v;
                                }
                                finally {
                                    break Label_0140;
                                }
                                w = w6m.w;
                                v = w6m.v;
                                vt4.g0(x);
                                v3 = v;
                                continue;
                            }
                        }
                    }
                }
            }
        }
        aof.g((Object)null);
    }
}
