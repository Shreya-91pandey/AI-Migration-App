public final class rl2
{
    public final inf a;
    
    public rl2() {
        this.a = new inf(0, (Object[])new sl2[16]);
    }
    
    public final Object a(k2j v, final h07 h07) {
        ql2 ql3 = null;
        Label_0051: {
            if (h07 instanceof ql2) {
                final ql2 ql2 = (ql2)h07;
                final int b = ql2.B;
                if ((b & Integer.MIN_VALUE) != 0x0) {
                    ql2.B = b + Integer.MIN_VALUE;
                    ql3 = ql2;
                    break Label_0051;
                }
            }
            ql3 = new ql2(this, h07);
        }
        final Object z = ql3.z;
        final int b2 = ql3.B;
        while (true) {
            int x = 0;
            Label_0214: {
                int y;
                Object[] w;
                if (b2 != 0) {
                    if (b2 == 1) {
                        y = ql3.y;
                        x = ql3.x;
                        w = ql3.w;
                        v = ql3.v;
                        vt4.g0(z);
                        break Label_0214;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(z);
                    final inf a = this.a;
                    w = a.v;
                    y = a.x;
                    x = 0;
                }
                if (x >= y) {
                    return lqo.a;
                }
                final sl2 sl2 = (sl2)w[x];
                final p1 p2 = new p1((Object)v, (byte)8);
                ql3.v = v;
                ql3.w = w;
                ql3.x = x;
                ql3.y = y;
                ql3.B = 1;
                final Object m = lq6.m((t98)sl2, (jta)p2, (h07)ql3);
                final pc7 v2 = pc7.v;
                if (m == v2) {
                    return v2;
                }
            }
            ++x;
            continue;
        }
    }
}
