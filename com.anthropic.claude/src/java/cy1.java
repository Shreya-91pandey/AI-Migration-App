public final class cy1
{
    public final qnn a;
    public final oc7 b;
    
    public cy1(final qnn a, final oc7 b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final ykn y, k2j v, final f07 f07) {
        yx1 yx2 = null;
        Label_0054: {
            if (f07 instanceof yx1) {
                final yx1 yx1 = (yx1)f07;
                final int b = yx1.B;
                if ((b & Integer.MIN_VALUE) != 0x0) {
                    yx1.B = b + Integer.MIN_VALUE;
                    yx2 = yx1;
                    break Label_0054;
                }
            }
            yx2 = new yx1(this, f07);
        }
        final Object z = yx2.z;
        final int b2 = yx2.B;
        final lqo a = lqo.a;
        final jta jta = null;
        oc7 x;
        qnn w;
        ykn ykn;
        if (b2 != 0) {
            if (b2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            final ykn y2 = yx2.y;
            x = yx2.x;
            w = yx2.w;
            v = yx2.v;
            vt4.g0(z);
            ykn = y2;
        }
        else {
            vt4.g0(z);
            yx2.v = v;
            final qnn a2 = this.a;
            yx2.w = a2;
            x = this.b;
            yx2.x = x;
            yx2.y = y;
            yx2.B = 1;
            y.G();
            final pc7 v2 = pc7.v;
            if (a == v2) {
                return v2;
            }
            ykn = y;
            w = a2;
        }
        Object o;
        if (!ykn.c()) {
            o = null;
        }
        else {
            o = new ay1(ykn, x, ykn, (byte)0);
        }
        Object o2;
        if (!ykn.e()) {
            o2 = null;
        }
        else {
            o2 = new ay1(ykn, x, ykn, (byte)1);
        }
        Object o3;
        if (!ykn.d()) {
            o3 = null;
        }
        else {
            o3 = new ay1(ykn, x, ykn, (byte)2);
        }
        Object o4;
        if (!ykn.f()) {
            o4 = null;
        }
        else {
            o4 = new by1(ykn, ykn, (byte)0);
        }
        Object o5;
        if (!ykn.b()) {
            o5 = jta;
        }
        else {
            o5 = new by1(ykn, ykn, (byte)1);
        }
        w.c(v, (jta)o, (jta)o2, (jta)o3, (jta)o4, (jta)o5);
        return a;
    }
}
