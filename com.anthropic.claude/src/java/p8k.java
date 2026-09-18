public final class p8k implements f8j
{
    public t8k A;
    public final lce B;
    public m9k v;
    public u8k w;
    public String x;
    public Object y;
    public Object[] z;
    
    public p8k(final m9k v, final u8k w, final String x, final Object y, final Object[] z) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.B = new lce((Object)this, (byte)25);
    }
    
    public final void a() {
        final t8k a = this.A;
        if (a != null) {
            ((tze)a).n();
        }
    }
    
    public final void b() {
        final t8k a = this.A;
        if (a != null) {
            ((tze)a).n();
        }
    }
    
    public final void c() {
        final u8k w = this.w;
        final t8k a = this.A;
        if (a == null) {
            if (w != null) {
                final lce b = this.B;
                final Object a2 = b.a();
                if (a2 != null && !w.b(a2)) {
                    String s;
                    if (a2 instanceof o8m) {
                        final o8m o8m = (o8m)a2;
                        if (o8m.c() != cib.A && o8m.c() != def.D && o8m.c() != awp.H) {
                            s = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        }
                        else {
                            s = lmf.r(((xom)o8m).getValue(), "MutableState containing ", " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().");
                        }
                    }
                    else {
                        s = mlc.H(a2);
                    }
                    throw new IllegalArgumentException(s);
                }
                this.A = w.a((jta)b, this.x);
            }
            return;
        }
        uy8.m((Object)a, (Object)") is not null", "entry(");
    }
    
    public final void d() {
        this.c();
    }
}
