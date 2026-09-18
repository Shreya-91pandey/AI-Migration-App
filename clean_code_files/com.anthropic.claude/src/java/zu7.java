public final class zu7 implements ija
{
    public final byte v;
    public final wja w;
    
    public final Object a(final jja jja, final f07 f07) {
        final byte v = this.v;
        Object a = lqo.a;
        final wja w = this.w;
        final pc7 v2 = pc7.v;
        switch (v) {
            default: {
                Object o = null;
                Label_0091: {
                    if (f07 instanceof rx8) {
                        final rx8 rx8 = (rx8)f07;
                        final int w2 = rx8.w;
                        if ((w2 & Integer.MIN_VALUE) != 0x0) {
                            rx8.w = w2 + Integer.MIN_VALUE;
                            o = rx8;
                            break Label_0091;
                        }
                    }
                    o = new rx8(this, f07);
                }
                final Object v3 = ((rx8)o).v;
                final int w3 = ((rx8)o).w;
                Object o2;
                if (w3 != 0) {
                    if (w3 == 1) {
                        vt4.g0(v3);
                        o2 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o2 = null;
                    }
                }
                else {
                    vt4.g0(v3);
                    final bd0 bd0 = new bd0(jja, (byte)15);
                    ((rx8)o).w = 1;
                    o2 = a;
                    if (w.a((jja)bd0, (f07)o) == v2) {
                        o2 = v2;
                    }
                }
                return o2;
            }
            case 0: {
                final Object a2 = w.a((jja)new bd0(jja, (byte)14), f07);
                if (a2 == v2) {
                    a = a2;
                }
                return a;
            }
        }
    }
}
