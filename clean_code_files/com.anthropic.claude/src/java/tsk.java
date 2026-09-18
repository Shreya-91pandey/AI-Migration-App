import java.util.Iterator;

public final class tsk implements itk, Iterable, stc
{
    public final tmf v;
    public k5e w;
    public boolean x;
    public boolean y;
    
    public tsk() {
        final long[] a = jak.a;
        this.v = new tmf();
    }
    
    public final void a(final htk htk, final Object o) {
        final boolean b = o instanceof t3;
        final tmf v = this.v;
        if (b && v.c((Object)htk)) {
            final Object g = v.g((Object)htk);
            g.getClass();
            final t3 t3 = (t3)g;
            final t3 t4 = (t3)o;
            String s;
            if ((s = t4.a) == null) {
                s = t3.a;
            }
            aua aua;
            if ((aua = t4.b) == null) {
                aua = t3.b;
            }
            v.m((Object)htk, (Object)new t3(s, aua));
        }
        else {
            v.m((Object)htk, o);
        }
        htk.getClass();
    }
    
    public final tsk d() {
        final tsk tsk = new tsk();
        tsk.x = this.x;
        tsk.y = this.y;
        final tmf v = this.v;
        final Object[] b = v.b;
        final Object[] c = v.c;
        final long[] a = v.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            tsk.v.m(b[n5], c[n5]);
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        return tsk;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof tsk) {
                final tsk tsk = (tsk)o;
                if (this.v.equals((Object)tsk.v)) {
                    if (this.x == tsk.x) {
                        if (this.y == tsk.y) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final Object f(final htk htk) {
        final Object g = this.v.g((Object)htk);
        if (g != null) {
            return g;
        }
        uy8.e((Object)htk, (Object)" - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.y) + smk.l(this.v.hashCode() * 31, 31, this.x);
    }
    
    public final Iterator iterator() {
        k5e k5e;
        if ((k5e = this.w) == null) {
            final tmf v = this.v;
            if ((k5e = v.f) == null) {
                k5e = new k5e(v);
                v.f = k5e;
            }
            this.w = k5e;
        }
        return ((od9)k5e.entrySet()).iterator();
    }
    
    public final void j(final tsk tsk) {
        final tmf v = tsk.v;
        final Object[] b = v.b;
        final Object[] c = v.c;
        final long[] a = v.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            final Object o = b[n5];
                            final Object o2 = c[n5];
                            final htk htk = (htk)o;
                            final tmf v2 = this.v;
                            final Object g = v2.g((Object)htk);
                            htk.getClass();
                            final Object d = htk.b.d(g, o2);
                            if (d != null) {
                                v2.m((Object)htk, d);
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        String s;
        if (this.x) {
            sb.append("mergeDescendants=true");
            s = ", ";
        }
        else {
            s = "";
        }
        String s2 = s;
        if (this.y) {
            sb.append(s);
            sb.append("isClearingSemantics=true");
            s2 = ", ";
        }
        final tmf v = this.v;
        final Object[] b = v.b;
        final Object[] c = v.c;
        final long[] a = v.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                String s3 = s2;
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    String s4;
                    for (int i = 0; i < n4; ++i, s2 = s4) {
                        s4 = s2;
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            final Object o = b[n5];
                            final Object o2 = c[n5];
                            final htk htk = (htk)o;
                            sb.append(s2);
                            sb.append(htk.a);
                            sb.append(" : ");
                            sb.append(o2);
                            s4 = ", ";
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                    s3 = s2;
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
                s2 = s3;
            }
        }
        final StringBuilder sb2 = new StringBuilder(var.y((Object)this));
        sb2.append("{ ");
        sb2.append((Object)sb);
        sb2.append(" }");
        return sb2.toString();
    }
}
