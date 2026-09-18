import com.anthropic.claude.api.memory.MemorySettingsResponse;

public final class cgg implements fgg
{
    public final String a;
    public final rt7 b;
    public final f60 c;
    public final xca d;
    public final jqc e;
    public final wo8 f;
    public final cof g;
    public boolean h;
    
    public cgg(final String a, final rt7 b, final f60 c, final xca d, final jqc e, final wo8 f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = new cof();
    }
    
    public final nq a(final String s) {
        return new nq(((e60)this.b).a().h("org_memory_settings").h("acc_".concat(zrn.z(this.a))).h("org_".concat(zrn.z(s))), "OrgMemorySettingsDiskCache", MemorySettingsResponse.Companion.serializer(), this.c, this.d, this.e, this.f, 384);
    }
    
    public final Object b(h07 v) {
        Object o = null;
        Label_0045: {
            if (v instanceof agg) {
                o = v;
                final int y = ((agg)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((agg)o).y = y + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            o = new agg(this, v);
        }
        final Object w = ((agg)o).w;
        final int y2 = ((agg)o).y;
        final pc7 v2 = pc7.v;
        Label_0207: {
            if (y2 != 0) {
                if (y2 != 1) {
                    if (y2 == 2) {
                        v = (h07)((agg)o).v;
                        try {
                            vt4.g0(w);
                            break Label_0207;
                        }
                        finally {
                            break Label_0207;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v = (h07)((agg)o).v;
                vt4.g0(w);
            }
            else {
                vt4.g0(w);
                final cof g = this.g;
                ((agg)o).v = (aof)g;
                ((agg)o).y = 1;
                v = (h07)g;
                if (g.c((f07)o) == v2) {
                    return v2;
                }
            }
            try {
                this.h = true;
                final o68 a = vo8.a;
                final d58 w2 = d58.w;
                final nee nee = new nee((byte)4, (f07)null, (Object)this);
                ((agg)o).v = (aof)v;
                ((agg)o).y = 2;
                if (rhc.f0((hc7)w2, (zta)nee, (f07)o) == v2) {
                    return v2;
                }
                ((aof)v).g((Object)null);
                return lqo.a;
            }
            finally {}
        }
        ((aof)v).g((Object)null);
        throw;
    }
    
    public final Object c(String s, MemorySettingsResponse w, final h07 h07) {
        bgg bgg2 = null;
        Label_0054: {
            if (h07 instanceof bgg) {
                final bgg bgg = (bgg)h07;
                final int a = bgg.A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    bgg.A = a + Integer.MIN_VALUE;
                    bgg2 = bgg;
                    break Label_0054;
                }
            }
            bgg2 = new bgg(this, h07);
        }
        final Object y = bgg2.y;
        final int a2 = bgg2.A;
        final lqo a3 = lqo.a;
        final pc7 v = pc7.v;
        Object o = null;
        Label_0263: {
            String v2;
            if (a2 != 0) {
                if (a2 != 1) {
                    if (a2 == 2) {
                        s = (String)bgg2.x;
                        try {
                            vt4.g0(y);
                            break Label_0263;
                        }
                        finally {
                            o = s;
                            final String s2;
                            s = s2;
                            break Label_0263;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s = (String)bgg2.x;
                w = bgg2.w;
                v2 = bgg2.v;
                vt4.g0(y);
            }
            else {
                vt4.g0(y);
                bgg2.v = s;
                bgg2.w = w;
                final cof g = this.g;
                bgg2.x = (aof)g;
                bgg2.A = 1;
                if (g.c((f07)bgg2) == v) {
                    return v;
                }
                v2 = s;
                s = (String)g;
            }
            try {
                if (this.h) {
                    ((aof)s).g((Object)null);
                    return a3;
                }
                final nq a4 = this.a(v2);
                bgg2.v = null;
                bgg2.w = null;
                bgg2.x = (aof)s;
                bgg2.A = 2;
                if (a4.g(w, (h07)bgg2) == v) {
                    return v;
                }
                ((aof)s).g((Object)null);
                return a3;
            }
            finally {
                final String s3 = s;
                final String s4;
                s = s4;
                o = s3;
            }
        }
        ((aof)o).g((Object)null);
        throw s;
    }
}
