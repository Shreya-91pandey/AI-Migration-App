import java.util.Iterator;

public final class dq6 implements t2k, aof
{
    public final t2k v;
    public final cof w;
    public hc7 x;
    public Throwable y;
    public final e3a z;
    
    public dq6(final t2k v) {
        final cof w = new cof();
        this.v = v;
        this.w = w;
        this.z = new e3a(v);
    }
    
    @Override
    public final boolean H0() {
        return this.v.H0();
    }
    
    @Override
    public final Object c(final f07 f07) {
        return this.w.c(f07);
    }
    
    public final void close() {
        final e3a z = this.z;
        if (z != null) {
            ((iw1)z.x).h(-1);
        }
        ((AutoCloseable)this.v).close();
    }
    
    @Override
    public final b3k d1(final String s) {
        final e3a z = this.z;
        if (z != null) {
            final iw1 iw1 = (iw1)z.x;
            b3k d1;
            if ((d1 = (b3k)iw1.c((Object)s)) == null) {
                d1 = ((t2k)z.w).d1(s);
                iw1.d((Object)s, (Object)d1);
            }
            return new hw1(d1);
        }
        return this.v.d1(s);
    }
    
    @Override
    public final void g(final Object o) {
        this.w.g((Object)null);
    }
    
    public final void n(final StringBuilder sb) {
        if (this.x == null && this.y == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        }
        else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            final hc7 x = this.x;
            if (x != null) {
                final StringBuilder sb2 = new StringBuilder("\t\tCoroutine: ");
                sb2.append((Object)x);
                sb.append(sb2.toString());
                sb.append('\n');
            }
            final Throwable y = this.y;
            if (y != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                for (final String s : c86.C0((Iterable)kym.c1((CharSequence)soh.Q(y)), 1)) {
                    final StringBuilder sb3 = new StringBuilder("\t\t");
                    sb3.append(s);
                    sb.append(sb3.toString());
                    sb.append('\n');
                }
            }
        }
        final e3a z = this.z;
        if (z != null) {
            final iw1 iw1 = (iw1)z.x;
            final wab c = iw1.c;
            synchronized (c) {
                final int d = iw1.d;
                monitorexit(c);
                final StringBuilder sb4 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
                sb4.append(d);
                sb.append(sb4.toString());
                sb.append('\n');
            }
        }
    }
    
    @Override
    public final String toString() {
        return this.v.toString();
    }
}
