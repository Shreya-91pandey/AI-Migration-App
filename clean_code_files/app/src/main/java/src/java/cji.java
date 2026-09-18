public final class cji extends v98 implements xrf
{
    public boolean L;
    public jta M;
    public boolean N;
    public dji O;
    public float P;
    public final fsf Q;
    public final gsg R;
    public final gsg S;
    
    public cji(final boolean l, final jta m, final boolean n, final dji o, final float p5) {
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p5;
        this.Q = new fsf((xrf)this, null);
        this.R = new gsg(0.0f);
        this.S = new gsg(0.0f);
    }
    
    public final long K(long t1, final int n, final long n2) {
        if (!this.O.a.f()) {
            if (this.N) {
                if (n == 1) {
                    t1 = this.t1(n2);
                    rhc.G(((hgf)this).c1(), (hc7)null, 0, (zta)new drd((byte)29, (f07)null, (Object)this), 3);
                    return t1;
                }
            }
        }
        return 0L;
    }
    
    public final Object O0(final long n, final f07 f07) {
        Object o = null;
        Label_0057: {
            if (f07 instanceof aji) {
                final aji aji = (aji)f07;
                final int x = aji.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    aji.x = x + Integer.MIN_VALUE;
                    o = aji;
                    break Label_0057;
                }
            }
            o = new aji(this, (h07)f07);
        }
        final Object v = ((aji)o).v;
        final int x2 = ((aji)o).x;
        Object o2;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            o2 = v;
        }
        else {
            vt4.g0(v);
            final float e = f7p.e(n);
            ((aji)o).x = 1;
            final Object v2 = this.v1(e, (h07)o);
            final pc7 v3 = pc7.v;
            if ((o2 = v2) == v3) {
                return v3;
            }
        }
        return f7p.a(iar.g(0.0f, ((Number)o2).floatValue()));
    }
    
    public final long a0(final int n, final long n2) {
        if (!this.O.a.f()) {
            if (this.N) {
                if (n == 1 && Float.intBitsToFloat((int)(0xFFFFFFFFL & n2)) < 0.0f) {
                    return this.t1(n2);
                }
            }
        }
        return 0L;
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final void g1() {
        this.o1((t98)this.Q);
        rhc.G(((hgf)this).c1(), (hc7)null, 0, (zta)new pn((byte)26, (f07)null, (Object)this), 3);
        float n;
        if (this.L) {
            n = (float)this.u1();
        }
        else {
            n = 0.0f;
        }
        this.x1(n);
    }
    
    public final Object r1(final h07 h07) {
        while (true) {
            Label_0037: {
                if (!(h07 instanceof yii)) {
                    break Label_0037;
                }
                final yii yii = (yii)h07;
                final int x = yii.x;
                if ((x & Integer.MIN_VALUE) == 0x0) {
                    break Label_0037;
                }
                yii.x = x + Integer.MIN_VALUE;
                final Object o = yii;
                final Object v = ((yii)o).v;
                final int x2 = ((yii)o).x;
                final lqo a = lqo.a;
                Label_0165: {
                    if (x2 != 0) {
                        Label_0086: {
                            if (x2 == 1) {
                                Label_0177: {
                                    try {
                                        vt4.g0(v);
                                        break Label_0165;
                                    }
                                    finally {
                                        break Label_0177;
                                    }
                                    break Label_0086;
                                }
                                this.w1(0.0f);
                                this.x1(0.0f);
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(v);
                    final dji o2 = this.O;
                    ((yii)o).x = 1;
                    Object b = id0.b(o2.a, (Object)new Float(0.0f), (cg0)null, (lta)null, (f07)o, 14);
                    final pc7 v2 = pc7.v;
                    if (b != v2) {
                        b = a;
                    }
                    if (b == v2) {
                        return v2;
                    }
                }
                this.w1(0.0f);
                this.x1(0.0f);
                return a;
            }
            final Object o = new yii(this, h07);
            continue;
        }
    }
    
    public final Object s1(final h07 h07) {
        while (true) {
            Label_0037: {
                if (!(h07 instanceof zii)) {
                    break Label_0037;
                }
                final zii zii = (zii)h07;
                final int x = zii.x;
                if ((x & Integer.MIN_VALUE) == 0x0) {
                    break Label_0037;
                }
                zii.x = x + Integer.MIN_VALUE;
                final zii zii2 = zii;
                final Object v = zii2.v;
                final int x2 = zii2.x;
                final lqo a = lqo.a;
                Label_0093: {
                    if (x2 == 0) {
                        break Label_0093;
                    }
                    Label_0086: {
                        if (x2 != 1) {
                            break Label_0086;
                        }
                        Label_0165: {
                            try {
                                vt4.g0(v);
                                break Label_0165;
                            }
                            finally {
                                if (((hgf)this).I) {
                                    this.w1((float)this.u1());
                                    this.x1((float)this.u1());
                                }
                            Block_9_Outer:
                                while (true) {
                                    Object b = null;
                                    pc7 v2 = null;
                                    iftrue(Label_0165:)(b != v2);
                                    return v2;
                                    while (true) {
                                        this.w1((float)this.u1());
                                        this.x1((float)this.u1());
                                        return a;
                                        vt4.g0(v);
                                        final dji o = this.O;
                                        zii2.x = 1;
                                        b = id0.b(o.a, (Object)new Float(1.0f), (cg0)null, (lta)null, (f07)zii2, 14);
                                        v2 = pc7.v;
                                        iftrue(Label_0154:)(b != v2);
                                        continue Block_9_Outer;
                                        iftrue(Label_0190:)(!((hgf)this).I);
                                        continue;
                                    }
                                    Label_0154: {
                                        b = a;
                                    }
                                    continue Block_9_Outer;
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                                Label_0190: {
                                    return a;
                                }
                            }
                        }
                    }
                }
            }
            final zii zii2 = new zii(this, h07);
            continue;
        }
    }
    
    public final long t1(final long n) {
        float n2;
        if (this.L) {
            n2 = 0.0f;
        }
        else {
            final gsg s = this.S;
            float n3;
            if ((n3 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) + s.h()) < 0.0f) {
                n3 = 0.0f;
            }
            final float n4 = n3 - s.h();
            this.w1(n3);
            float n5;
            if (s.h() * 0.5f <= this.u1()) {
                n5 = s.h() * 0.5f;
            }
            else {
                final float n6 = ncq.n(Math.abs(s.h() * 0.5f / this.u1()) - 1.0f, 0.0f, 2.0f);
                n5 = this.u1() + this.u1() * (n6 - (float)Math.pow((double)n6, 2.0) / 4.0f);
            }
            this.x1(n5);
            n2 = n4;
        }
        return (long)Float.floatToRawIntBits(0.0f) << 32 | ((long)Float.floatToRawIntBits(n2) & 0xFFFFFFFFL);
    }
    
    public final int u1() {
        return soh.L((t98)this).U.L0(this.P);
    }
    
    public final Object v1(final float n, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof bji) {
                final bji bji = (bji)h07;
                final int y = bji.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    bji.y = y + Integer.MIN_VALUE;
                    o = bji;
                    break Label_0054;
                }
            }
            o = new bji(this, h07);
        }
        final Object w = ((bji)o).w;
        final int y2 = ((bji)o).y;
        float v = 0.0f;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((bji)o).v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            if (this.L) {
                return new Float(0.0f);
            }
            final gsg s = this.S;
            if (s.h() * 0.5f > this.u1()) {
                this.M.a();
            }
            Label_0177: {
                if (s.h() != 0.0f) {
                    v = n;
                    if (n >= 0.0f) {
                        break Label_0177;
                    }
                }
                v = 0.0f;
            }
            ((bji)o).v = v;
            ((bji)o).y = 1;
            final Object r1 = this.r1((h07)o);
            final pc7 v2 = pc7.v;
            if (r1 == v2) {
                return v2;
            }
        }
        this.w1(0.0f);
        return new Float(v);
    }
    
    public final void w1(final float n) {
        this.S.i(n);
    }
    
    public final void x1(final float n) {
        this.R.i(n);
    }
}
