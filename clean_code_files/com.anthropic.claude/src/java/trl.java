import java.util.Collection;
import java.util.List;

public final class trl extends qxc implements jta
{
    public final byte w;
    public final url x;
    
    @Override
    public final Object a() {
        final byte w = this.w;
        int i = 0;
        final url x = this.x;
        switch (w) {
            default: {
                for (List b = x.b(); i < ((Collection)b).size(); ++i) {
                    final vrl vrl = (vrl)b.get(i);
                    if (vrl.k() && vrl.m()) {
                        break;
                    }
                }
                return lqo.a;
            }
            case 0: {
                final boolean g = x.g;
                final id0 f = x.f;
                final itl b2 = x.b;
                Label_0304: {
                    if (!g && b2.a() && f.f()) {
                        final List c = x.c();
                        final int size = ((Collection)c).size();
                        int j = 0;
                        while (true) {
                            while (j < size) {
                                final Object value = c.get(j);
                                if (((vrl)value).k()) {
                                    final vrl vrl2 = (vrl)value;
                                    if (vrl2 != null) {
                                        final bfa f2 = vrl2.g().f;
                                        if (f2 instanceof ygm) {
                                            final ygm ygm = (ygm)f2;
                                            rhc.G(b2.w, null, 0, (zta)new mdl((Object)x, (Object)new ygm(ygm.a, ygm.b, new l6g((long)Float.floatToRawIntBits(1.0f) << 32 | ((long)Float.floatToRawIntBits(1.0f) & 0xFFFFFFFFL))), (f07)null, (byte)11), 3);
                                        }
                                        x.g = true;
                                    }
                                    break Label_0304;
                                }
                                else {
                                    ++j;
                                }
                            }
                            final Object value = null;
                            continue;
                        }
                    }
                }
                final l6g l6g = (l6g)f.e();
                final long a = l6g.a;
                return l6g;
            }
        }
    }
}
