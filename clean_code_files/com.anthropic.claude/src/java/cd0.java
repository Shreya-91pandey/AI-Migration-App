public final class cd0 implements ija
{
    public final byte v;
    public final ija w;
    
    @Override
    public final Object a(final jja jja, final f07 f07) {
        final byte v = this.v;
        final Object o = null;
        final Object o2 = null;
        final Object o3 = null;
        final Object o4 = null;
        final Object o5 = null;
        final Object o6 = null;
        Object a = lqo.a;
        final ija w = this.w;
        final pc7 v2 = pc7.v;
        switch (v) {
            default: {
                Object o7 = null;
                Label_0139: {
                    if (f07 instanceof mno) {
                        final mno mno = (mno)f07;
                        final int w2 = mno.w;
                        if ((w2 & Integer.MIN_VALUE) != 0x0) {
                            mno.w = w2 + Integer.MIN_VALUE;
                            o7 = mno;
                            break Label_0139;
                        }
                    }
                    o7 = new mno(this, f07);
                }
                final Object v3 = ((mno)o7).v;
                final int w3 = ((mno)o7).w;
                if (w3 != 0) {
                    if (w3 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o6;
                    }
                    vt4.g0(v3);
                }
                else {
                    vt4.g0(v3);
                    final bd0 bd0 = new bd0(jja, (byte)22);
                    ((mno)o7).w = 1;
                    if (w.a((jja)bd0, (f07)o7) == v2) {
                        return v2;
                    }
                }
                return a;
            }
            case 7: {
                Object o9 = null;
                Label_0275: {
                    if (f07 instanceof cyk) {
                        final cyk cyk = (cyk)f07;
                        final int w4 = cyk.w;
                        if ((w4 & Integer.MIN_VALUE) != 0x0) {
                            cyk.w = w4 + Integer.MIN_VALUE;
                            o9 = cyk;
                            break Label_0275;
                        }
                    }
                    o9 = new cyk(this, f07);
                }
                final Object v4 = ((cyk)o9).v;
                final int w5 = ((cyk)o9).w;
                if (w5 != 0) {
                    if (w5 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o;
                    }
                    vt4.g0(v4);
                }
                else {
                    vt4.g0(v4);
                    final bd0 bd2 = new bd0(jja, (byte)21);
                    ((cyk)o9).w = 1;
                    if (w.a((jja)bd2, (f07)o9) == v2) {
                        return v2;
                    }
                }
                return a;
            }
            case 6: {
                Object o11 = null;
                Label_0411: {
                    if (f07 instanceof cde) {
                        final cde cde = (cde)f07;
                        final int w6 = cde.w;
                        if ((w6 & Integer.MIN_VALUE) != 0x0) {
                            cde.w = w6 + Integer.MIN_VALUE;
                            o11 = cde;
                            break Label_0411;
                        }
                    }
                    o11 = new cde(this, f07);
                }
                final Object v5 = ((cde)o11).v;
                final int w7 = ((cde)o11).w;
                if (w7 != 0) {
                    if (w7 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o2;
                    }
                    vt4.g0(v5);
                }
                else {
                    vt4.g0(v5);
                    final bd0 bd3 = new bd0(jja, (byte)19);
                    ((cde)o11).w = 1;
                    if (w.a((jja)bd3, (f07)o11) == v2) {
                        return v2;
                    }
                }
                return a;
            }
            case 5: {
                Object o13 = null;
                Label_0547: {
                    if (f07 instanceof n0e) {
                        final n0e n0e = (n0e)f07;
                        final int w8 = n0e.w;
                        if ((w8 & Integer.MIN_VALUE) != 0x0) {
                            n0e.w = w8 + Integer.MIN_VALUE;
                            o13 = n0e;
                            break Label_0547;
                        }
                    }
                    o13 = new n0e(this, f07);
                }
                final Object v6 = ((n0e)o13).v;
                final int w9 = ((n0e)o13).w;
                if (w9 != 0) {
                    if (w9 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o3;
                    }
                    vt4.g0(v6);
                }
                else {
                    vt4.g0(v6);
                    final bd0 bd4 = new bd0(jja, (byte)18);
                    ((n0e)o13).w = 1;
                    if (w.a((jja)bd4, (f07)o13) == v2) {
                        return v2;
                    }
                }
                return a;
            }
            case 4: {
                Object o15 = null;
                Label_0683: {
                    if (f07 instanceof w9b) {
                        final w9b w9b = (w9b)f07;
                        final int w10 = w9b.w;
                        if ((w10 & Integer.MIN_VALUE) != 0x0) {
                            w9b.w = w10 + Integer.MIN_VALUE;
                            o15 = w9b;
                            break Label_0683;
                        }
                    }
                    o15 = new w9b(this, f07);
                }
                final Object v7 = ((w9b)o15).v;
                final int w11 = ((w9b)o15).w;
                if (w11 != 0) {
                    if (w11 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o4;
                    }
                    vt4.g0(v7);
                }
                else {
                    vt4.g0(v7);
                    final bd0 bd5 = new bd0(jja, (byte)17);
                    ((w9b)o15).w = 1;
                    if (w.a((jja)bd5, (f07)o15) == v2) {
                        return v2;
                    }
                }
                return a;
            }
            case 3: {
                final Object a2 = w.a((jja)new bd0(jja, (byte)16), f07);
                if (a2 == v2) {
                    a = a2;
                }
                return a;
            }
            case 2: {
                final Object a3 = w.a((jja)new hb4(new Object(), jja, (byte)4), f07);
                if (a3 == v2) {
                    a = a3;
                }
                return a;
            }
            case 1: {
                Object o17 = null;
                Label_0887: {
                    if (f07 instanceof zv4) {
                        final zv4 zv4 = (zv4)f07;
                        final int w12 = zv4.w;
                        if ((w12 & Integer.MIN_VALUE) != 0x0) {
                            zv4.w = w12 + Integer.MIN_VALUE;
                            o17 = zv4;
                            break Label_0887;
                        }
                    }
                    o17 = new zv4(this, f07);
                }
                final Object v8 = ((zv4)o17).v;
                final int w13 = ((zv4)o17).w;
                if (w13 != 0) {
                    if (w13 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o5;
                    }
                    vt4.g0(v8);
                }
                else {
                    vt4.g0(v8);
                    final bd0 bd6 = new bd0(jja, (byte)10);
                    ((zv4)o17).w = 1;
                    if (w.a((jja)bd6, (f07)o17) == v2) {
                        return v2;
                    }
                }
                return a;
            }
            case 0: {
                final Object a4 = w.a((jja)new bd0(jja, (byte)0), f07);
                if (a4 == v2) {
                    a = a4;
                }
                return a;
            }
        }
    }
}
