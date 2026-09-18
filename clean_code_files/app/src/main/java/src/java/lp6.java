public final class lp6 implements cp6
{
    public final long A;
    public final sfh v;
    public final sfh w;
    public final awp x;
    public final ThreadLocal y;
    public volatile boolean z;
    
    public lp6(final pw1 pw1) {
        this.x = new awp((byte)13);
        this.y = new ThreadLocal();
        final awp w = lz8.w;
        this.A = ri2.E0(30, pz8.z);
        final sfh sfh = new sfh(1, (lta)pw1);
        this.v = sfh;
        this.w = sfh;
    }
    
    public lp6(final pw1 pw1, final int n) {
        this.x = new awp((byte)13);
        this.y = new ThreadLocal();
        final awp w = lz8.w;
        this.A = ri2.E0(30, pz8.z);
        this.v = new sfh(4, (lta)new ip6(pw1, (f07)null));
        this.w = new sfh(1, (lta)pw1);
    }
    
    public final void close() {
        if (!this.z) {
            this.z = true;
            this.v.c();
            this.w.c();
        }
    }
    
    @Override
    public final Object h(boolean v, zta zta, h07 w) {
        final lqo a = lqo.a;
        Object o = null;
        Label_0057: {
            if (w instanceof jp6) {
                o = w;
                final int e = ((jp6)o).E;
                if ((e & Integer.MIN_VALUE) != 0x0) {
                    ((jp6)o).E = e + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            o = new jp6(this, w);
        }
        Object c = ((jp6)o).C;
        final pc7 v2 = pc7.v;
        final int e2 = ((jp6)o).E;
        final boolean b = true;
        Object o6 = null;
        while (true) {
            Object o3 = null;
            Label_1362: {
                Label_1296: {
                    sfh x2 = null;
                    switch (e2) {
                        default: {
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        case 6: {
                            final lgh lgh = (lgh)((jp6)o).z;
                            final Throwable t = (Throwable)((jp6)o).y;
                            final Object o2 = ((jp6)o).x;
                            final sfh sfh = (sfh)((jp6)o).w;
                            o3 = t;
                            w = (h07)o2;
                            try {
                                vt4.g0(c);
                                o = lgh;
                            }
                            finally {
                                zta = (zta)w;
                                break Label_1362;
                            }
                        }
                        case 5: {
                            final Object b2 = ((jp6)o).y;
                            final Object x = ((jp6)o).x;
                            w = (h07)((jp6)o).w;
                            vt4.g0(c);
                            break Label_1296;
                        }
                        case 4: {
                            zta = (zta)((jp6)o).x;
                            final Object b2 = ((jp6)o).w;
                            try {
                                vt4.g0(c);
                                final Object o4 = zta;
                            }
                            finally {
                                c = zta;
                                zta = (zta)w;
                                break Label_1362;
                            }
                        }
                        case 3: {
                            v = ((jp6)o).v;
                            final awp b3 = ((jp6)o).B;
                            final b4j a2 = ((jp6)o).A;
                            final hc7 context = (hc7)((jp6)o).z;
                            zta = (zta)((jp6)o).y;
                            final Object b2 = ((jp6)o).x;
                            final Object o5 = ((jp6)o).w;
                            try {
                                vt4.g0(c);
                            }
                            finally {
                                c = zta;
                                zta = (zta)w;
                                break Label_1362;
                            }
                        }
                        case 2: {
                            vt4.g0(c);
                            return c;
                        }
                        case 1: {
                            vt4.g0(c);
                            return c;
                        }
                        case 0: {
                            vt4.g0(c);
                            if (this.z) {
                                tiq.l(21, "Connection pool is closed");
                                throw null;
                            }
                            if ((w = (h07)this.y.get()) == null) {
                                final yo6 yo6 = (yo6)((f07)o).getContext().M0((gc7)this.x);
                                if (yo6 != null) {
                                    w = (h07)yo6.w;
                                }
                                else {
                                    w = null;
                                }
                            }
                            if (w != null) {
                                if (!v && ((lgh)w).c) {
                                    tiq.l(1, "Cannot upgrade connection from reader to writer");
                                    throw null;
                                }
                                if (((f07)o).getContext().M0((gc7)this.x) == null) {
                                    final hc7 s0 = uuj.s0((hc7)new yo6((gc7)this.x, (lgh)w), (hc7)new ksn((Object)w, this.y));
                                    final mu5 mu5 = new mu5((Object)zta, (Object)w, (f07)null, (byte)19);
                                    ((jp6)o).E = 1;
                                    zta = (zta)rhc.f0(s0, (zta)mu5, (f07)o);
                                    if (zta == v2) {
                                        return v2;
                                    }
                                    return zta;
                                }
                                else {
                                    ((jp6)o).E = 2;
                                    zta = (zta)zta.d((Object)w, o);
                                    if (zta == v2) {
                                        return v2;
                                    }
                                    return zta;
                                }
                            }
                            else {
                                if (v) {
                                    x2 = this.v;
                                    break;
                                }
                                x2 = this.w;
                                break;
                            }
                            break;
                        }
                    }
                    w = (h07)(c = new Object());
                    Object b2 = x2;
                    try {
                        final hc7 context = ((f07)o).getContext();
                        c = w;
                        b2 = x2;
                        final awp b3 = this.x;
                        c = w;
                        b2 = x2;
                        final long a3 = this.A;
                        c = w;
                        b2 = x2;
                        c = w;
                        b2 = x2;
                        final gp6 gp6 = new gp6(this, v, context);
                        c = w;
                        b2 = x2;
                        ((jp6)o).w = zta;
                        c = w;
                        b2 = x2;
                        ((jp6)o).x = x2;
                        c = w;
                        b2 = x2;
                        ((jp6)o).y = w;
                        c = w;
                        b2 = x2;
                        ((jp6)o).z = context;
                        c = w;
                        b2 = x2;
                        ((jp6)o).A = (b4j)w;
                        c = w;
                        b2 = x2;
                        ((jp6)o).B = b3;
                        c = w;
                        b2 = x2;
                        ((jp6)o).v = v;
                        c = w;
                        b2 = x2;
                        ((jp6)o).E = 3;
                        c = w;
                        b2 = x2;
                        final Object b4 = x2.b(a3, gp6, (h07)o);
                        if (b4 == v2) {
                            return v2;
                        }
                        b2 = w;
                        final Object o5 = zta;
                        zta = (zta)x2;
                        final b4j a2 = (b4j)b2;
                        c = w;
                        b2 = zta;
                        final dq6 dq6 = (dq6)b4;
                        c = w;
                        b2 = zta;
                        dq6.x = context;
                        c = w;
                        b2 = zta;
                        c = w;
                        b2 = zta;
                        final Throwable y = new Throwable();
                        c = w;
                        b2 = zta;
                        dq6.y = y;
                        c = w;
                        b2 = zta;
                        final boolean b5 = this.v != this.w && v && b;
                        c = w;
                        b2 = zta;
                        c = w;
                        b2 = zta;
                        final lgh v3 = new lgh(b3, dq6, b5);
                        c = w;
                        b2 = zta;
                        a2.v = v3;
                        c = w;
                        b2 = zta;
                        final Object v4 = ((b4j)w).v;
                        if (v4 != null) {
                            c = w;
                            b2 = zta;
                            final lgh lgh2 = (lgh)v4;
                            c = w;
                            b2 = zta;
                            c = w;
                            b2 = zta;
                            final yo6 yo7 = new yo6((gc7)this.x, lgh2);
                            c = w;
                            b2 = zta;
                            final ThreadLocal y2 = this.y;
                            c = w;
                            b2 = zta;
                            c = w;
                            b2 = zta;
                            final ksn ksn = new ksn((Object)lgh2, y2);
                            c = w;
                            b2 = zta;
                            final hc7 s2 = uuj.s0((hc7)yo7, (hc7)ksn);
                            c = w;
                            b2 = zta;
                            c = w;
                            b2 = zta;
                            final p10 p10 = new p10(o5, (Object)w, (f07)null, (byte)15);
                            c = w;
                            b2 = zta;
                            ((jp6)o).w = zta;
                            c = w;
                            b2 = zta;
                            ((jp6)o).x = w;
                            c = w;
                            b2 = zta;
                            ((jp6)o).y = null;
                            c = w;
                            b2 = zta;
                            ((jp6)o).z = null;
                            c = w;
                            b2 = zta;
                            ((jp6)o).A = null;
                            c = w;
                            b2 = zta;
                            ((jp6)o).B = null;
                            c = w;
                            b2 = zta;
                            ((jp6)o).E = 4;
                            c = w;
                            b2 = zta;
                            final Object f0 = rhc.f0(s2, (zta)p10, (f07)o);
                            if (f0 == v2) {
                                return v2;
                            }
                            b2 = w;
                            w = (h07)f0;
                            final Object o4 = b2;
                            c = ((b4j)o4).v;
                            if (c == null) {
                                return w;
                            }
                            ((jp6)o).w = zta;
                            ((jp6)o).x = w;
                            ((jp6)o).y = c;
                            ((jp6)o).E = 5;
                            ((lgh)c).g();
                            if (a == v2) {
                                return v2;
                            }
                            b2 = w;
                            w = (h07)zta;
                            final Object x = b2;
                            b2 = c;
                            b2 = ((lgh)b2).b;
                            ((dq6)b2).x = null;
                            ((dq6)b2).y = null;
                            ((sfh)w).e((dq6)b2);
                            return x;
                        }
                    }
                    finally {
                        break Label_1362;
                    }
                }
                throw new IllegalArgumentException("Required value was null.");
                try {
                    throw zta;
                }
                finally {
                    try {
                        final lgh z = (lgh)((b4j)c).v;
                        if (z == null) {
                            break Label_1362;
                        }
                        final Object b2;
                        ((jp6)o).w = b2;
                        ((jp6)o).x = zta;
                        ((jp6)o).y = w;
                        ((jp6)o).z = z;
                        ((jp6)o).A = null;
                        ((jp6)o).B = null;
                        ((jp6)o).E = 6;
                        z.g();
                        if (a == v2) {
                            return v2;
                        }
                        final Object o2 = b2;
                        o6 = zta;
                        zta = (zta)w;
                        o = z;
                        w = (h07)o6;
                        final dq6 b6 = ((lgh)o).b;
                        w = (h07)o6;
                        b6.x = null;
                        w = (h07)o6;
                        b6.y = null;
                        w = (h07)o6;
                        ((sfh)o2).e(b6);
                    }
                    finally {
                        o3 = w;
                    }
                }
            }
            if (zta != null) {
                soh.j((Throwable)zta, (Throwable)o6);
                zta = (zta)o3;
                continue;
            }
            break;
        }
        throw o6;
    }
}
