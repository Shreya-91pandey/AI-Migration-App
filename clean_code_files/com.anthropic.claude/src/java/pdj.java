public final class pdj implements jta
{
    public final hta v;
    public final jta w;
    public final z8m x;
    public final a0 y;
    
    public pdj(final hta v, final jta w) {
        this.v = v;
        this.w = w;
        final z8m x = new z8m((lta)new njh((byte)26));
        x.e();
        this.x = x;
        final a0 y = new a0(1, this, pdj.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0, (byte)22);
        this.y = y;
        final Object c = v.c;
        synchronized (c) {
            boolean b;
            if (v.f) {
                b = true;
            }
            else {
                v.g.add((Object)this);
                b = false;
            }
            monitorexit(c);
            if (b) {
                this.a();
            }
            synchronized (v.c) {
                final boolean f = v.f;
                monitorexit(c);
                if (!f) {
                    monitorenter(v.c);
                    try {
                        if (!v.f) {
                            ++v.d;
                        }
                    }
                    finally {
                        return;
                    }
                    monitorexit(c);
                    final Object o = new Object();
                    x.d((Object)w, (lta)y, (jta)new nob(o, (Object)w, (byte)27));
                    if (((x3j)o).v) {
                        this.c();
                    }
                }
            }
        }
    }
    
    @Override
    public final Object a() {
        final z8m x = this.x;
        x.a();
        final re h = x.h;
        if (h != null) {
            h.i();
        }
        return lqo.a;
    }
    
    public final void c() {
        this.x.b((Object)this.w);
        final hta v = this.v;
        final Object c = v.c;
        synchronized (c) {
            final boolean f = v.f;
            monitorexit(c);
            Label_0138: {
                if (!f) {
                    final hta v2 = this.v;
                    monitorenter(v2.c);
                    Label_0132: {
                        try {
                            if (!v2.f) {
                                int d = v2.d;
                                if (d > 0) {
                                    --d;
                                    v2.d = d;
                                    if (!v2.e && d == 0) {
                                        v2.e = true;
                                        v2.a.execute((Runnable)v2.h);
                                    }
                                }
                            }
                        }
                        finally {
                            break Label_0132;
                        }
                        monitorexit(c);
                        break Label_0138;
                    }
                    monitorexit(c);
                }
            }
            final z8m x = this.x;
            x.a();
            final re h = x.h;
            if (h != null) {
                h.i();
            }
        }
    }
}
