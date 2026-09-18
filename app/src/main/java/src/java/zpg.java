public final class zpg
{
    public final hsg a;
    public final gsg b;
    public final hsg c;
    public final ksg d;
    
    public zpg(final int n, final float n2, final int n3, final ppg ppg) {
        this.a = new hsg(n);
        this.b = new gsg(n2);
        this.c = new hsg(n3);
        this.d = o50.Q((Object)ppg);
    }
    
    public final ppg a() {
        return (ppg)this.d.getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final r7m a = q7m.a();
        lta e;
        if (a != null) {
            e = a.e();
        }
        else {
            e = null;
        }
        final r7m b = q7m.b(a);
        if (this == o) {
            q7m.d(a, b, e);
            return true;
        }
        Label_0217: {
            try {
                if (!(o instanceof zpg)) {
                    q7m.d(a, b, e);
                    return false;
                }
                if (this.a.h() != ((zpg)o).a.h()) {
                    q7m.d(a, b, e);
                    return false;
                }
                if (this.b.h() == ((zpg)o).b.h()) {
                    if (this.c.h() != ((zpg)o).c.h()) {
                        q7m.d(a, b, e);
                        return false;
                    }
                    if (!mlc.q((Object)this.a(), (Object)((zpg)o).a())) {
                        q7m.d(a, b, e);
                        return false;
                    }
                    q7m.d(a, b, e);
                    return true;
                }
            }
            finally {
                break Label_0217;
            }
            q7m.d(a, b, e);
            return false;
        }
        q7m.d(a, b, e);
    }
    
    @Override
    public final int hashCode() {
        final r7m a = q7m.a();
        lta e;
        if (a != null) {
            e = a.e();
        }
        else {
            e = null;
        }
        final r7m b = q7m.b(a);
        Label_0112: {
            int h = 0;
            int hashCode = 0;
            int h2 = 0;
            int hashCode2 = 0;
            Label_0085: {
                try {
                    h = this.a.h();
                    hashCode = Float.hashCode(this.b.h());
                    h2 = this.c.h();
                    final ppg a2 = this.a();
                    if (a2 != null) {
                        hashCode2 = a2.hashCode();
                        break Label_0085;
                    }
                }
                finally {
                    break Label_0112;
                }
                hashCode2 = 0;
            }
            q7m.d(a, b, e);
            return ((h * 31 + hashCode) * 31 + h2) * 31 + hashCode2;
        }
        q7m.d(a, b, e);
    }
}
