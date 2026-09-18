public final class peo
{
    public final iln a;
    public tdc b;
    public final cib c;
    public final na6 d;
    public final sd8 e;
    public final sd8 f;
    public final ksg g;
    
    public peo(final iln a, final tdc b, final cib c, final na6 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final sd8 sd8 = null;
        sd8 b2;
        if (d != null) {
            b2 = r8m.b((jta)new kkk((Object)this, (Object)d, (byte)8));
        }
        else {
            b2 = null;
        }
        this.e = b2;
        sd8 b3 = sd8;
        if (c != null) {
            b3 = r8m.b((jta)new kkk((Object)this, (Object)c, (byte)9));
        }
        this.f = b3;
        this.g = o50.Q((Object)new jrk(1, 1));
    }
    
    public static void k(final peo peo, final CharSequence charSequence, boolean b, boolean b2, int g) {
        final boolean b3 = (g & 0x2) == 0x0;
        int n;
        if ((g & 0x4) != 0x0) {
            n = 1;
        }
        else {
            n = 3;
        }
        if ((g & 0x8) != 0x0) {
            b = true;
        }
        if ((g & 0x10) != 0x0) {
            b2 = false;
        }
        final iln a = peo.a;
        final tdc b4 = peo.b;
        a.b.a().q();
        final ghn b5 = a.b;
        if (b3) {
            b5.g(null);
        }
        final long b6 = b5.B;
        ghn.d(b5, dnn.g(b6), dnn.f(b6), charSequence, 0, b2, 24);
        g = dnn.g(b6);
        zbq.s(b5, charSequence.length() + g);
        peo.o(b5);
        a.b(b4, b, n);
        a.g(true);
        a.f(a.b.z);
    }
    
    public static void l(final peo peo, final String s, long h, boolean b, boolean b2, int g) {
        if ((g & 0x8) != 0x0) {
            b = true;
        }
        if ((g & 0x10) != 0x0) {
            b2 = false;
        }
        final iln a = peo.a;
        final tdc b3 = peo.b;
        a.b.a().q();
        final ghn b4 = a.b;
        h = peo.h(h);
        ghn.d(b4, dnn.g(h), dnn.f(h), (CharSequence)s, 0, b2, 24);
        g = dnn.g(h);
        zbq.s(b4, s.length() + g);
        peo.o(b4);
        a.b(b3, b, 1);
        a.g(true);
        a.f(a.b.z);
    }
    
    public final void a() {
        final tdc b = this.b;
        final iln a = this.a;
        a.b.a().q();
        final ghn b2 = a.b;
        zbq.s(b2, dnn.f(b2.B));
        a.b(b, true, 1);
        a.g(true);
        a.f(a.b.z);
    }
    
    public final void b(final vb0 vb0, final h07 h07) {
        Object o = null;
        Label_0051: {
            if (h07 instanceof oeo) {
                final oeo oeo = (oeo)h07;
                final int x = oeo.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    oeo.x = x + Integer.MIN_VALUE;
                    o = oeo;
                    break Label_0051;
                }
            }
            o = new oeo(this, h07);
        }
        final Object v = ((oeo)o).v;
        final int x2 = ((oeo)o).x;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            Object o2 = vb0;
            if (this.d != null) {
                o2 = new meo((gln)vb0, this);
            }
            ((oeo)o).x = 1;
            final l13 l13 = new l13(1, ljq.K((f07)o));
            l13.r();
            this.a.h.b(o2);
            l13.v((lta)new n90(this, o2, (byte)10));
            if (l13.p() == pc7.v) {
                return;
            }
        }
        ebq.a();
    }
    
    public final void c(final boolean b) {
        final tdc b2 = this.b;
        final iln a = this.a;
        a.b.a().q();
        final ghn b3 = a.b;
        ghn.d(b3, dnn.g(b3.B), dnn.f(b3.B), (CharSequence)"", 0, b, 24);
        zbq.s(b3, dnn.g(b3.B));
        this.o(b3);
        a.b(b2, true, 3);
        a.g(true);
        a.f(a.b.z);
    }
    
    public final hhn d() {
        final sd8 e = this.e;
        if (e != null) {
            final neo neo = (neo)e.getValue();
            if (neo != null) {
                return neo.b();
            }
        }
        return this.a.d();
    }
    
    public final jrk e() {
        return (jrk)this.g.getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof peo)) {
            return false;
        }
        final peo peo = (peo)o;
        return mlc.q((Object)this.a, (Object)peo.a) && mlc.q((Object)this.c, (Object)peo.c) && mlc.q((Object)this.d, (Object)peo.d);
    }
    
    public final hhn f() {
        final sd8 f = this.f;
        if (f != null) {
            final neo neo = (neo)f.getValue();
            if (neo != null) {
                return neo.b();
            }
        }
        return this.d();
    }
    
    public final long g(final int n) {
        final dhc dhc = null;
        final sd8 e = this.e;
        dhc a = null;
        Label_0042: {
            if (e != null) {
                final neo neo = (neo)e.getValue();
                if (neo != null) {
                    a = neo.a();
                    break Label_0042;
                }
            }
            a = null;
        }
        final sd8 f = this.f;
        dhc a2 = dhc;
        if (f != null) {
            final neo neo2 = (neo)f.getValue();
            a2 = dhc;
            if (neo2 != null) {
                a2 = neo2.a();
            }
        }
        long n2;
        if (a2 != null) {
            n2 = a2.a(n, false);
        }
        else {
            n2 = rhc.c(n, n);
        }
        long m = n2;
        if (a != null) {
            m = ljq.M(n2, a);
        }
        return m;
    }
    
    public final long h(final long n) {
        final dhc dhc = null;
        final sd8 e = this.e;
        dhc a = null;
        Label_0042: {
            if (e != null) {
                final neo neo = (neo)e.getValue();
                if (neo != null) {
                    a = neo.a();
                    break Label_0042;
                }
            }
            a = null;
        }
        final sd8 f = this.f;
        dhc a2 = dhc;
        if (f != null) {
            final neo neo2 = (neo)f.getValue();
            a2 = dhc;
            if (neo2 != null) {
                a2 = neo2.a();
            }
        }
        long m = n;
        if (a2 != null) {
            m = ljq.M(n, a2);
        }
        if (a != null) {
            return ljq.M(m, a);
        }
        return m;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final cib c = this.c;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final na6 d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    public final long i(final long n) {
        final sd8 e = this.e;
        dhc a = null;
        Label_0039: {
            if (e != null) {
                final neo neo = (neo)e.getValue();
                if (neo != null) {
                    a = neo.a();
                    break Label_0039;
                }
            }
            a = null;
        }
        final sd8 f = this.f;
        dhc a2 = null;
        Label_0078: {
            if (f != null) {
                final neo neo2 = (neo)f.getValue();
                if (neo2 != null) {
                    a2 = neo2.a();
                    break Label_0078;
                }
            }
            a2 = null;
        }
        long n2 = n;
        if (a != null) {
            n2 = ljq.N(n, a, (jrk)null);
        }
        if (a2 != null) {
            return ljq.N(n2, a2, this.e());
        }
        return n2;
    }
    
    public final void j(final CharSequence charSequence) {
        final tdc b = this.b;
        final iln a = this.a;
        a.b.a().q();
        final ghn b2 = a.b;
        zbq.j(b2, b2.x.length());
        b2.append((CharSequence)charSequence.toString());
        this.o(b2);
        a.b(b, true, 1);
        a.g(true);
        a.f(a.b.z);
    }
    
    public final void m(final long n) {
        this.n(this.h(n));
    }
    
    public final void n(final long n) {
        final tdc b = this.b;
        final iln a = this.a;
        a.b.a().q();
        final ghn b2 = a.b;
        final int c = dnn.c;
        zbq.r(b2, (int)(n >> 32), (int)(n & 0xFFFFFFFFL));
        a.b(b, true, 1);
        a.g(true);
        a.f(a.b.z);
    }
    
    public final void o(final ghn ghn) {
        if (((inf)ghn.a().w).x > 0 && dnn.d(ghn.B)) {
            this.g.setValue((Object)new jrk(1, 1));
        }
    }
    
    @Override
    public final String toString() {
        final hhn d = this.d();
        final hhn f = this.f();
        final StringBuilder sb = new StringBuilder("TransformedTextFieldState(textFieldState=");
        sb.append((Object)this.a);
        sb.append(", outputTransformation=");
        sb.append((Object)this.d);
        sb.append(", outputTransformedText=");
        sb.append((Object)this.e);
        sb.append(", codepointTransformation=");
        sb.append((Object)this.c);
        sb.append(", codepointTransformedText=");
        sb.append((Object)this.f);
        sb.append(", outputText=\"");
        sb.append((Object)d);
        sb.append("\", visualText=\"");
        sb.append((Object)f);
        sb.append("\")");
        return sb.toString();
    }
}
