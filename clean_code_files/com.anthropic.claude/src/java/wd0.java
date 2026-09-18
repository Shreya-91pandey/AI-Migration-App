import java.util.Map;

public final class wd0 implements aq8
{
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    @Override
    public final void a() {
        final byte a = this.a;
        final Object d = this.d;
        final Object c = this.c;
        final Object b = this.b;
        switch (a) {
            default: {
                final r8k r8k = (r8k)b;
                final Object k = r8k.w.k(c);
                final x8k x8k = (x8k)d;
                if (k == x8k) {
                    final Map v = r8k.v;
                    final Map c2 = x8k.c();
                    if (c2.isEmpty()) {
                        v.remove(c);
                    }
                    else {
                        v.put(c, (Object)c2);
                    }
                }
                return;
            }
            case 3: {
                final kd kd = (kd)b;
                kd.c(c);
                kd.c(d);
                return;
            }
            case 2: {
                ((gbd)b).d().d((fbd)c);
                final rbd rbd = (rbd)((b4j)d).v;
                if (rbd != null) {
                    rbd.a();
                }
                return;
            }
            case 1: {
                ((gbd)b).d().d((fbd)c);
                final hbd hbd = (hbd)((b4j)d).v;
                if (hbd != null) {
                    hbd.a();
                }
                return;
            }
            case 0: {
                ((v8m)b).remove(c);
                ((le0)d).e.k(c);
            }
        }
    }
}
