public final class asf
{
    public fsf a;
    public fsf b;
    public jta c;
    public oc7 d;
    
    public asf() {
        this.c = (jta)new lce((Object)this, (byte)4);
    }
    
    public final Object a(final long n, final long n2, final h07 h07) {
        while (true) {
            Label_0047: {
                if (!(h07 instanceof yrf)) {
                    break Label_0047;
                }
                final yrf yrf = (yrf)h07;
                final int x = yrf.x;
                if ((x & Integer.MIN_VALUE) == 0x0) {
                    break Label_0047;
                }
                yrf.x = x + Integer.MIN_VALUE;
                final Object o = yrf;
                final Object v = ((yrf)o).v;
                final int x2 = ((yrf)o).x;
                final fsf fsf = null;
                Object i = null;
                Label_0282: {
                    Object l = null;
                    Label_0211: {
                        if (x2 == 0) {
                            vt4.g0(v);
                            final fsf a = this.a;
                            fsf p3;
                            if (a != null) {
                                p3 = a.p1();
                            }
                            else {
                                p3 = null;
                            }
                            final long n3 = 0L;
                            final pc7 v2 = pc7.v;
                            if (p3 == null) {
                                final fsf b = this.b;
                                if (b == null) {
                                    return f7p.a(n3);
                                }
                                ((yrf)o).x = 1;
                                if ((l = b.L(n, n2, (f07)o)) != v2) {
                                    break Label_0211;
                                }
                            }
                            else {
                                final fsf a2 = this.a;
                                fsf p4 = fsf;
                                if (a2 != null) {
                                    p4 = a2.p1();
                                }
                                if (p4 == null) {
                                    return f7p.a(n3);
                                }
                                ((yrf)o).x = 2;
                                if ((i = p4.L(n, n2, (f07)o)) != v2) {
                                    break Label_0282;
                                }
                            }
                            return v2;
                        }
                        if (x2 != 1) {
                            if (x2 == 2) {
                                vt4.g0(v);
                                i = v;
                                break Label_0282;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        else {
                            vt4.g0(v);
                            l = v;
                        }
                    }
                    final long n3 = ((f7p)l).j();
                    return f7p.a(n3);
                }
                final long n3 = ((f7p)i).j();
                return f7p.a(n3);
            }
            final Object o = new yrf(this, h07);
            continue;
        }
    }
    
    public final Object b(long j, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof zrf) {
                final zrf zrf = (zrf)h07;
                final int x = zrf.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    zrf.x = x + Integer.MIN_VALUE;
                    o = zrf;
                    break Label_0054;
                }
            }
            o = new zrf(this, h07);
        }
        final Object v = ((zrf)o).v;
        final int x2 = ((zrf)o).x;
        fsf p2 = null;
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
            final fsf a = this.a;
            if (a != null) {
                p2 = a.p1();
            }
            if (p2 == null) {
                j = 0L;
                return f7p.a(j);
            }
            ((zrf)o).x = 1;
            final Object o3 = p2.O0(j, (f07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = o3) == v2) {
                return v2;
            }
        }
        j = ((f7p)o2).j();
        return f7p.a(j);
    }
    
    public final oc7 c() {
        final oc7 oc7 = (oc7)this.c.a();
        if (oc7 != null) {
            return oc7;
        }
        en9.q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
