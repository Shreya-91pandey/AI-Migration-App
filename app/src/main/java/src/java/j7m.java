public final class j7m implements gia
{
    public final n7m a;
    public final v08 b;
    public final cg0 c;
    public final zfk d;
    
    public j7m(final n7m a, final v08 b, final cg0 c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = dgk.b;
    }
    
    @Override
    public Object a(final tfk tfk, final float n, final f07 f07) {
        return this.c(tfk, n, (lta)r1r.b, (h07)f07);
    }
    
    public final Object b(final tfk tfk, final float n, final lta v, final h07 h07) {
        f7m f7m2 = null;
        Label_0059: {
            if (h07 instanceof f7m) {
                final f7m f7m = (f7m)h07;
                final int y = f7m.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    f7m.y = y + Integer.MIN_VALUE;
                    f7m2 = f7m;
                    break Label_0059;
                }
            }
            f7m2 = new f7m(this, h07);
        }
        final Object w = f7m2.w;
        final int y2 = f7m2.y;
        lta v2;
        Object o;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2 = f7m2.v;
            vt4.g0(w);
            o = w;
        }
        else {
            vt4.g0(w);
            final q53 q53 = new q53(this, n, v, tfk, (f07)null);
            f7m2.v = v;
            f7m2.y = 1;
            final Object f0 = rhc.f0((hc7)this.d, (zta)q53, (f07)f7m2);
            final pc7 v3 = pc7.v;
            if (f0 == v3) {
                return v3;
            }
            v2 = v;
            o = f0;
        }
        final zf0 zf0 = (zf0)o;
        v2.b((Object)new Float(0.0f));
        return zf0;
    }
    
    public final Object c(final tfk tfk, float floatValue, final lta lta, final h07 h07) {
        Object o = null;
        Label_0059: {
            if (h07 instanceof h7m) {
                final h7m h7m = (h7m)h07;
                final int x = h7m.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    h7m.x = x + Integer.MIN_VALUE;
                    o = h7m;
                    break Label_0059;
                }
            }
            o = new h7m(this, h07);
        }
        final Object v = ((h7m)o).v;
        final int x2 = ((h7m)o).x;
        zf0 zf0;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            zf0 = (zf0)v;
        }
        else {
            vt4.g0(v);
            ((h7m)o).x = 1;
            final Object b = this.b(tfk, floatValue, lta, (h07)o);
            final pc7 v2 = pc7.v;
            if ((zf0 = (zf0)b) == v2) {
                return v2;
            }
        }
        final zf0 zf2 = zf0;
        final float floatValue2 = ((Number)zf2.a()).floatValue();
        final dg0 b2 = zf2.b();
        floatValue = 0.0f;
        if (floatValue2 != 0.0f) {
            floatValue = ((Number)b2.a()).floatValue();
        }
        return new Float(floatValue);
    }
    
    public final Object d(final tfk tfk, final float n, final float n2, final g7m g7m, final h07 h07) {
        while (true) {
            Label_0047: {
                if (!(h07 instanceof i7m)) {
                    break Label_0047;
                }
                final i7m i7m = (i7m)h07;
                final int x = i7m.x;
                if ((x & Integer.MIN_VALUE) == 0x0) {
                    break Label_0047;
                }
                i7m.x = x + Integer.MIN_VALUE;
                final i7m i7m2 = i7m;
                final Object v = i7m2.v;
                final int x2 = i7m2.x;
                if (x2 == 0) {
                    vt4.g0(v);
                    if (Math.abs(n) != 0.0f) {
                        if (Math.abs(n2) != 0.0f) {
                            i7m2.x = 1;
                            final v08 b = this.b;
                            Object o;
                            if (Math.abs(qt7.m(b, 0.0f, n2)) >= Math.abs(n)) {
                                o = new r70((Object)b, (byte)19);
                            }
                            else {
                                o = new zzc((Object)this.c);
                            }
                            final Object k = ((mt0)o).k(tfk, new Float(n), new Float(n2), (lta)g7m, i7m2);
                            final pc7 v2 = pc7.v;
                            final Object o2 = k;
                            if (k == v2) {
                                return v2;
                            }
                            return ((zf0)o2).c();
                        }
                    }
                    return yi2.a(n, n2, 28);
                }
                if (x2 != 1) {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vt4.g0(v);
                final Object o2 = v;
                return ((zf0)o2).c();
            }
            final i7m i7m2 = new i7m(this, h07);
            continue;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof j7m) {
            final j7m j7m = (j7m)o;
            if (mlc.q((Object)j7m.c, (Object)this.c) && mlc.q((Object)j7m.b, (Object)this.b) && j7m.a.equals(this.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() + this.c.hashCode() * 31) * 31;
    }
}
