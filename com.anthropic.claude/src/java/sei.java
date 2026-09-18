public abstract class sei
{
    public final m6d a;
    
    public sei(final jta jta) {
        this.a = new m6d(jta);
    }
    
    public ffi a(final Object o) {
        return new ffi(this, o, o == null, null, null, true);
    }
    
    public a6p b() {
        return this.a;
    }
    
    public final ffi c(final lta lta) {
        return new ffi(this, null, false, null, lta, false);
    }
    
    public final a6p d(final ffi ffi, final a6p a6p) {
        final boolean b = a6p instanceof f09;
        final f09 f09 = null;
        a6p a6p2 = null;
        Label_0151: {
            if (b) {
                a6p2 = f09;
                if (ffi.e) {
                    a6p2 = a6p;
                    ((f09)a6p2).a.setValue(ffi.a());
                }
            }
            else {
                a6p a6p3;
                if (a6p instanceof zpm) {
                    if (!ffi.b) {
                        a6p2 = f09;
                        if (ffi.f == null) {
                            break Label_0151;
                        }
                    }
                    a6p2 = f09;
                    if (ffi.e) {
                        break Label_0151;
                    }
                    final Object a = ffi.a();
                    a6p3 = a6p;
                    a6p2 = f09;
                    if (!mlc.q(a, ((zpm)a6p3).a)) {
                        break Label_0151;
                    }
                }
                else {
                    a6p2 = f09;
                    if (!(a6p instanceof km6)) {
                        break Label_0151;
                    }
                    final lta d = ffi.d;
                    a6p3 = a6p;
                    a6p2 = f09;
                    if (d != ((km6)a6p3).a) {
                        break Label_0151;
                    }
                }
                a6p2 = a6p3;
            }
        }
        if (a6p2 != null) {
            return a6p2;
        }
        if (ffi.e) {
            final Object f10 = ffi.f;
            Object o;
            if ((o = ffi.c) == null) {
                o = def.D;
            }
            return new f09(new ksg(f10, (q8m)o));
        }
        final lta d2 = ffi.d;
        if (d2 != null) {
            return new km6(d2);
        }
        return new zpm(ffi.a());
    }
}
