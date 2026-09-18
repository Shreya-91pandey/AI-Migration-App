public final class a14 implements ija
{
    public final byte v;
    public final cd0 w;
    
    public final Object a(final jja jja, final f07 f07) {
        final byte v = this.v;
        Object a = lqo.a;
        final cd0 w = this.w;
        final pc7 v2 = pc7.v;
        switch (v) {
            default: {
                Object o = null;
                Label_0099: {
                    if (f07 instanceof p3p) {
                        final p3p p3p = (p3p)f07;
                        final int w2 = p3p.w;
                        if ((w2 & Integer.MIN_VALUE) != 0x0) {
                            p3p.w = w2 + Integer.MIN_VALUE;
                            o = p3p;
                            break Label_0099;
                        }
                    }
                    o = new p3p(this, f07);
                }
                final Object v3 = ((p3p)o).v;
                final int w3 = ((p3p)o).w;
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
                    final bd0 bd0 = new bd0(jja, (byte)23);
                    ((p3p)o).w = 1;
                    if (w.a((jja)bd0, (f07)o) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 2: {
                Object o2 = null;
                Label_0229: {
                    if (f07 instanceof gli) {
                        final gli gli = (gli)f07;
                        final int w4 = gli.w;
                        if ((w4 & Integer.MIN_VALUE) != 0x0) {
                            gli.w = w4 + Integer.MIN_VALUE;
                            o2 = gli;
                            break Label_0229;
                        }
                    }
                    o2 = new gli(this, f07);
                }
                final Object v4 = ((gli)o2).v;
                final int w5 = ((gli)o2).w;
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
                    final bd0 bd2 = new bd0(jja, (byte)20);
                    ((gli)o2).w = 1;
                    if (w.a((jja)bd2, (f07)o2) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 1: {
                Object o3 = null;
                Label_0359: {
                    if (f07 instanceof a05) {
                        final a05 a2 = (a05)f07;
                        final int w6 = a2.w;
                        if ((w6 & Integer.MIN_VALUE) != 0x0) {
                            a2.w = w6 + Integer.MIN_VALUE;
                            o3 = a2;
                            break Label_0359;
                        }
                    }
                    o3 = new a05(this, f07);
                }
                final Object v5 = ((a05)o3).v;
                final int w7 = ((a05)o3).w;
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
                    final bd0 bd3 = new bd0(jja, (byte)12);
                    ((a05)o3).w = 1;
                    if (w.a((jja)bd3, (f07)o3) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
            case 0: {
                Object o4 = null;
                Label_0489: {
                    if (f07 instanceof y04) {
                        final y04 y04 = (y04)f07;
                        final int w8 = y04.w;
                        if ((w8 & Integer.MIN_VALUE) != 0x0) {
                            y04.w = w8 + Integer.MIN_VALUE;
                            o4 = y04;
                            break Label_0489;
                        }
                    }
                    o4 = new y04(this, f07);
                }
                final Object v6 = ((y04)o4).v;
                final int w9 = ((y04)o4).w;
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
                    final bd0 bd4 = new bd0(jja, (byte)3);
                    ((y04)o4).w = 1;
                    if (w.a((jja)bd4, (f07)o4) == v2) {
                        a = v2;
                    }
                }
                return a;
            }
        }
    }
}
