import com.anthropic.claude.analytics.events.CodeEvents$EnrollmentSource;

public final class yo3
{
    public final l7n a;
    public final iyl b;
    
    public yo3(final l7n a, final iyl b, final wo8 wo8) {
        this.a = a;
        this.b = b;
    }
    
    public final Enum a(zta v, final h07 h07) {
        vo3 vo3 = null;
        Label_0049: {
            if (h07 instanceof vo3) {
                vo3 = (vo3)h07;
                final int a = vo3.A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    vo3.A = a + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            vo3 = new vo3(this, h07);
        }
        Object o = vo3.y;
        final int a2 = vo3.A;
        final pc7 v2 = pc7.v;
        Object o2 = null;
        cjo w2 = null;
        Label_0338: {
            cjo w = null;
            Label_0263: {
                if (a2 != 0) {
                    if (a2 != 1) {
                        if (a2 == 2) {
                            w = vo3.w;
                            v = vo3.v;
                            vt4.g0(o);
                            break Label_0263;
                        }
                        if (a2 == 3) {
                            o2 = vo3.x;
                            w2 = vo3.w;
                            v = vo3.v;
                            vt4.g0(o);
                            break Label_0338;
                        }
                        if (a2 == 4) {
                            vt4.g0(o);
                            return (Enum)n8r.b((nio)o);
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        v = vo3.v;
                        vt4.g0(o);
                    }
                }
                else {
                    vt4.g0(o);
                    vo3.v = v;
                    vo3.A = 1;
                    final o68 a3 = vo8.a;
                    if ((o = rhc.f0((hc7)d58.w, (zta)new np0((byte)12, (f07)null, (Object)this), (f07)vo3)) == v2) {
                        return (Enum)v2;
                    }
                }
                w = (cjo)o;
                vo3.v = v;
                vo3.w = w;
                vo3.A = 2;
                o = v.d((Object)w, (Object)vo3);
                if (o == v2) {
                    return (Enum)v2;
                }
            }
            final lh8 b = n8r.b((nio)o);
            if (uo3.a[((Enum)b).ordinal()] != 1) {
                return (Enum)b;
            }
            vo3.v = v;
            vo3.w = w;
            vo3.x = b;
            vo3.A = 3;
            o = this.b.a((h07)vo3);
            if (o == v2) {
                return (Enum)v2;
            }
            w2 = w;
            o2 = b;
        }
        if (!(boolean)o) {
            return (Enum)o2;
        }
        vo3.v = null;
        vo3.w = null;
        vo3.x = null;
        vo3.A = 4;
        if ((o = v.d((Object)w2, (Object)vo3)) != v2) {
            return (Enum)n8r.b((nio)o);
        }
        return (Enum)v2;
        o2 = n8r.b((nio)o);
        return (Enum)o2;
    }
    
    public final Enum b(final h07 h07) {
        wo3 wo4 = null;
        Label_0047: {
            if (h07 instanceof wo3) {
                final wo3 wo3 = (wo3)h07;
                final int x = wo3.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    wo3.x = x + Integer.MIN_VALUE;
                    wo4 = wo3;
                    break Label_0047;
                }
            }
            wo4 = new wo3(this, h07);
        }
        Object o = wo4.v;
        final int x2 = wo4.x;
        final pc7 v = pc7.v;
        if (x2 != 0) {
            if (x2 != 1) {
                if (x2 == 2) {
                    vt4.g0(o);
                    final Object c = o;
                    return (Enum)n8r.b((nio)c);
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                vt4.g0(o);
            }
        }
        else {
            vt4.g0(o);
            wo4.x = 1;
            final o68 a = vo8.a;
            if ((o = rhc.f0((hc7)d58.w, (zta)new np0((byte)12, (f07)null, (Object)this), (f07)wo4)) == v) {
                return (Enum)v;
            }
        }
        final cjo cjo = (cjo)o;
        final CodeEvents$EnrollmentSource z = CodeEvents$EnrollmentSource.z;
        wo4.x = 2;
        Object c;
        if ((c = cjo.c(cjo, z, (h07)wo4, 2)) != v) {
            return (Enum)n8r.b((nio)c);
        }
        return (Enum)v;
    }
}
