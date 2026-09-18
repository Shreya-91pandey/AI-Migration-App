import okhttp3.internal.ech.EchUntrustedException;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.io.Serializable;

public final class v4a implements at9
{
    public long v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Serializable z;
    
    public v4a(final cui w, final wcn x) {
        this.w = w;
        this.x = x;
        this.v = Long.MIN_VALUE;
        this.y = new CopyOnWriteArrayList();
        this.z = (Serializable)new LinkedBlockingDeque();
    }
    
    public v4a(final lun w, final lun x) {
        this.w = w;
        this.x = x;
        this.y = zn2.a(1.0f);
        this.z = l8e.a();
        this.v = jeo.b;
    }
    
    public void a() {
        final CopyOnWriteArrayList list = (CopyOnWriteArrayList)this.y;
        final Iterator iterator = list.iterator();
        iterator.getClass();
        while (iterator.hasNext()) {
            final svj svj = (svj)iterator.next();
            svj.cancel();
            final svj c = svj.c();
            if (c == null) {
                continue;
            }
            ((cui)this.w).q.addLast((Object)c);
        }
        list.clear();
    }
    
    @Override
    public eti b() {
        Object o = null;
        Label_0477: {
            Object o2;
            while (true) {
                try {
                    if (((CopyOnWriteArrayList)this.y).isEmpty()) {
                        o2 = o;
                        if (!((cui)this.w).a((eti)null)) {
                            break;
                        }
                    }
                }
                finally {
                    break Label_0477;
                }
                if (((cui)this.w).l.M) {
                    throw new IOException("Canceled");
                }
                final hdk a = ((wcn)this.x).a;
                final long nanoTime = System.nanoTime();
                long n = this.v - nanoTime;
                rvj e;
                if (!((CopyOnWriteArrayList)this.y).isEmpty() && n > 0L) {
                    e = null;
                }
                else {
                    e = this.e();
                    n = 250000000L;
                    this.v = nanoTime + 250000000L;
                }
                o2 = e;
                if (e == null) {
                    final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
                    final CopyOnWriteArrayList list = (CopyOnWriteArrayList)this.y;
                    Object o3 = null;
                    Label_0205: {
                        if (!list.isEmpty()) {
                            o3 = ((LinkedBlockingDeque)this.z).poll(n, nanoseconds);
                            if (o3 != null) {
                                list.remove((Object)((rvj)o3).a);
                                break Label_0205;
                            }
                        }
                        o3 = null;
                    }
                    o2 = o3;
                    if (o3 == null) {
                        continue;
                    }
                }
                final svj b = ((rvj)o2).b;
                final boolean b2 = false;
                final boolean b3 = b == null && ((rvj)o2).c == null;
                rvj rvj = (rvj)o2;
                if (b3) {
                    this.a();
                    rvj h = (rvj)o2;
                    if (!((rvj)o2).a.b()) {
                        h = ((rvj)o2).a.h();
                    }
                    int n2 = b2 ? 1 : 0;
                    if (h.b == null) {
                        n2 = (b2 ? 1 : 0);
                        if (h.c == null) {
                            n2 = 1;
                        }
                    }
                    rvj = h;
                    if (n2 != 0) {
                        final eti d = h.a.d();
                        this.a();
                        return d;
                    }
                }
                final Throwable c = rvj.c;
                o2 = o;
                if (c != null) {
                    if (!(c instanceof IOException)) {
                        throw c;
                    }
                    if (o == null) {
                        o = c;
                    }
                    else {
                        soh.j((Throwable)o, c);
                    }
                    final boolean b4 = ((IOException)c) instanceof EchUntrustedException;
                    o2 = o;
                    if (b4) {
                        break;
                    }
                    o2 = o;
                }
                final svj b5 = rvj.b;
                o = o2;
                if (b5 == null) {
                    continue;
                }
                ((cui)this.w).q.addFirst((Object)b5);
                o = o2;
            }
            this.a();
            o2.getClass();
            throw o2;
        }
        this.a();
    }
    
    public long c(long n) {
        final id0 id0 = (id0)this.y;
        final long v = this.v;
        if (((lun)this.x).a()) {
            final float[] array = (Object)this.z;
            final long a = ((chc)((lun)this.w).a()).a;
            final float n2 = (float)(int)(a >> 32);
            final int c = jeo.c;
            l8e.e(array, Float.intBitsToFloat((int)(v >> 32)) * n2, Float.intBitsToFloat((int)(v & 0xFFFFFFFFL)) * (int)(a & 0xFFFFFFFFL), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Number)id0.e()).floatValue(), ((Number)id0.e()).floatValue(), 1276);
            final float n3 = (float)(int)(n >> 32);
            final float n4 = (float)(int)(n & 0xFFFFFFFFL);
            n = Float.floatToRawIntBits(n3);
            return zrn.R(l8e.b(((long)Float.floatToRawIntBits(n4) & 0xFFFFFFFFL) | n << 32, array));
        }
        return n;
    }
    
    @Override
    public cui d() {
        return (cui)this.w;
    }
    
    public rvj e() {
        final cui cui = (cui)this.w;
        if (cui.a((eti)null)) {
            f4a f4a = null;
            try {
                cui.b();
            }
            finally {
                final Throwable t;
                f4a = new f4a(t);
            }
            if (((svj)f4a).b()) {
                return new rvj((svj)f4a, (Throwable)null, 6);
            }
            if (f4a instanceof f4a) {
                return f4a.a;
            }
            ((CopyOnWriteArrayList)this.y).add((Object)f4a);
            final StringBuilder sb = new StringBuilder();
            sb.append(icq.b);
            sb.append(" connect ");
            sb.append(cui.j.h.i());
            ((wcn)this.x).d().d((lcn)new u4a(sb.toString(), (svj)f4a, this), 0L);
        }
        return null;
    }
}
