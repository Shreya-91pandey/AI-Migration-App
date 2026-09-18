import java.util.Iterator;
import java.util.List;
import androidx.work.impl.WorkDatabase;

public final class z5q
{
    public final WorkDatabase a;
    public final fd8 b;
    
    public z5q(final WorkDatabase a) {
        this.a = a;
        this.b = new fd8((byte)4);
    }
    
    public final void a(t2k d1, final aw0 aw0) {
        final xv0 xv0 = (xv0)aw0.keySet();
        if (xv0.isEmpty()) {
            return;
        }
        if (((myl)aw0).x > 999) {
            c9r.h(aw0, (lta)new x5q(this, d1, (byte)0));
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        y9r.b(xv0.size(), sb);
        sb.append(")");
        d1 = (t2k)d1.d1(sb.toString());
        final Iterator iterator = xv0.iterator();
        int n = 1;
        while (true) {
            final r7c r7c = (r7c)iterator;
            if (!r7c.hasNext()) {
                break;
            }
            ((b3k)d1).U(n, (String)r7c.next());
            ++n;
        }
        Label_0225: {
            try {
                final int u = ri2.u((b3k)d1, "work_spec_id");
                if (u == -1) {
                    ((AutoCloseable)d1).close();
                    return;
                }
                while (((b3k)d1).Z0()) {
                    final List list = (List)((myl)aw0).get((Object)((b3k)d1).t0(u));
                    if (list != null) {
                        final byte[] blob = ((b3k)d1).getBlob(0);
                        final nt7 b = nt7.b;
                        list.add((Object)ri2.K(blob));
                    }
                }
            }
            finally {
                break Label_0225;
            }
            ((AutoCloseable)d1).close();
            return;
        }
        ((AutoCloseable)d1).close();
    }
    
    public final void b(t2k d1, final aw0 aw0) {
        final xv0 xv0 = (xv0)aw0.keySet();
        if (xv0.isEmpty()) {
            return;
        }
        if (((myl)aw0).x > 999) {
            c9r.h(aw0, (lta)new x5q(this, d1, (byte)1));
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        y9r.b(xv0.size(), sb);
        sb.append(")");
        d1 = (t2k)d1.d1(sb.toString());
        final Iterator iterator = xv0.iterator();
        int n = 1;
        while (true) {
            final r7c r7c = (r7c)iterator;
            if (!r7c.hasNext()) {
                break;
            }
            ((b3k)d1).U(n, (String)r7c.next());
            ++n;
        }
        Label_0213: {
            try {
                final int u = ri2.u((b3k)d1, "work_spec_id");
                if (u == -1) {
                    ((AutoCloseable)d1).close();
                    return;
                }
                while (((b3k)d1).Z0()) {
                    final List list = (List)((myl)aw0).get((Object)((b3k)d1).t0(u));
                    if (list != null) {
                        list.add((Object)((b3k)d1).t0(0));
                    }
                }
            }
            finally {
                break Label_0213;
            }
            ((AutoCloseable)d1).close();
            return;
        }
        ((AutoCloseable)d1).close();
    }
    
    public final x4q c(final String s) {
        return (x4q)xp7.L(this.a, true, false, (lta)new jy4(s, (byte)21));
    }
    
    public final v5q d(final String s) {
        return (v5q)xp7.L(this.a, true, false, (lta)new jy4(s, (byte)26));
    }
    
    public final List e(final String s) {
        return (List)xp7.L(this.a, true, false, (lta)new jy4(s, (byte)20));
    }
    
    public final void f(final long n, final String s) {
        ((Number)xp7.L(this.a, false, true, (lta)new knd(n, s))).intValue();
    }
    
    public final void g(final x4q x4q, final String s) {
        ((Number)xp7.L(this.a, false, true, (lta)new tyl((Object)x4q, (Object)s, (byte)21))).intValue();
    }
    
    public final void h(final int n, final String s) {
        xp7.L(this.a, false, true, (lta)new d8n(n, s));
    }
}
