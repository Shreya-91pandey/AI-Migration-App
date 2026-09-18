public final class jn3 implements ija
{
    public final byte v;
    public final n6k w;
    
    public final Object a(final jja jja, final f07 f07) {
        final byte v = this.v;
        Object a = lqo.a;
        final n6k w = this.w;
        final pc7 v2 = pc7.v;
        switch (v) {
            default: {
                Object o = null;
                Label_0111: {
                    if (f07 instanceof bw4) {
                        final bw4 bw4 = (bw4)f07;
                        final int w2 = bw4.w;
                        if ((w2 & Integer.MIN_VALUE) != 0x0) {
                            bw4.w = w2 + Integer.MIN_VALUE;
                            o = bw4;
                            break Label_0111;
                        }
                    }
                    o = new bw4(this, f07);
                }
                final Object v3 = ((bw4)o).v;
                final int w3 = ((bw4)o).w;
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
                    final bd0 bd0 = new bd0(jja, (byte)11);
                    ((bw4)o).w = 1;
                    if (w.a((jja)bd0, (f07)o) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 5: {
                Object o2 = null;
                Label_0241: {
                    if (f07 instanceof ib4) {
                        final ib4 ib4 = (ib4)f07;
                        final int w4 = ib4.w;
                        if ((w4 & Integer.MIN_VALUE) != 0x0) {
                            ib4.w = w4 + Integer.MIN_VALUE;
                            o2 = ib4;
                            break Label_0241;
                        }
                    }
                    o2 = new ib4(this, f07);
                }
                final Object v4 = ((ib4)o2).v;
                final int w5 = ((ib4)o2).w;
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
                    final bd0 bd2 = new bd0(jja, (byte)8);
                    ((ib4)o2).w = 1;
                    if (w.a((jja)bd2, (f07)o2) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 4: {
                Object o3 = null;
                Label_0371: {
                    if (f07 instanceof h14) {
                        final h14 h14 = (h14)f07;
                        final int w6 = h14.w;
                        if ((w6 & Integer.MIN_VALUE) != 0x0) {
                            h14.w = w6 + Integer.MIN_VALUE;
                            o3 = h14;
                            break Label_0371;
                        }
                    }
                    o3 = new h14(this, f07);
                }
                final Object v5 = ((h14)o3).v;
                final int w7 = ((h14)o3).w;
                if (w7 != 0) {
                    if (w7 == 1) {
                        vt4.g0(v5);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v5);
                    final bd0 bd3 = new bd0(jja, (byte)7);
                    ((h14)o3).w = 1;
                    if (w.a((jja)bd3, (f07)o3) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 3: {
                Object o4 = null;
                Label_0501: {
                    if (f07 instanceof f14) {
                        final f14 f8 = (f14)f07;
                        final int w8 = f8.w;
                        if ((w8 & Integer.MIN_VALUE) != 0x0) {
                            f8.w = w8 + Integer.MIN_VALUE;
                            o4 = f8;
                            break Label_0501;
                        }
                    }
                    o4 = new f14(this, f07);
                }
                final Object v6 = ((f14)o4).v;
                final int w9 = ((f14)o4).w;
                if (w9 != 0) {
                    if (w9 == 1) {
                        vt4.g0(v6);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v6);
                    final bd0 bd4 = new bd0(jja, (byte)6);
                    ((f14)o4).w = 1;
                    if (w.a((jja)bd4, (f07)o4) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 2: {
                Object o5 = null;
                Label_0631: {
                    if (f07 instanceof d14) {
                        final d14 d14 = (d14)f07;
                        final int w10 = d14.w;
                        if ((w10 & Integer.MIN_VALUE) != 0x0) {
                            d14.w = w10 + Integer.MIN_VALUE;
                            o5 = d14;
                            break Label_0631;
                        }
                    }
                    o5 = new d14(this, f07);
                }
                final Object v7 = ((d14)o5).v;
                final int w11 = ((d14)o5).w;
                if (w11 != 0) {
                    if (w11 == 1) {
                        vt4.g0(v7);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v7);
                    final bd0 bd5 = new bd0(jja, (byte)5);
                    ((d14)o5).w = 1;
                    if (w.a((jja)bd5, (f07)o5) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 1: {
                Object o6 = null;
                Label_0760: {
                    if (f07 instanceof b14) {
                        final b14 b14 = (b14)f07;
                        final int w12 = b14.w;
                        if ((w12 & Integer.MIN_VALUE) != 0x0) {
                            b14.w = w12 + Integer.MIN_VALUE;
                            o6 = b14;
                            break Label_0760;
                        }
                    }
                    o6 = new b14(this, f07);
                }
                final Object v8 = ((b14)o6).v;
                final int w13 = ((b14)o6).w;
                if (w13 != 0) {
                    if (w13 == 1) {
                        vt4.g0(v8);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v8);
                    final bd0 bd6 = new bd0(jja, (byte)4);
                    ((b14)o6).w = 1;
                    if (w.a((jja)bd6, (f07)o6) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 0: {
                Object o7 = null;
                Label_0889: {
                    if (f07 instanceof hn3) {
                        final hn3 hn3 = (hn3)f07;
                        final int w14 = hn3.w;
                        if ((w14 & Integer.MIN_VALUE) != 0x0) {
                            hn3.w = w14 + Integer.MIN_VALUE;
                            o7 = hn3;
                            break Label_0889;
                        }
                    }
                    o7 = new hn3(this, f07);
                }
                final Object v9 = ((hn3)o7).v;
                final int w15 = ((hn3)o7).w;
                if (w15 != 0) {
                    if (w15 == 1) {
                        vt4.g0(v9);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v9);
                    final bd0 bd7 = new bd0(jja, (byte)2);
                    ((hn3)o7).w = 1;
                    if (w.a((jja)bd7, (f07)o7) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
        }
    }
}
