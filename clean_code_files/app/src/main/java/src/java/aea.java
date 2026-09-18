import com.anthropic.claude.api.result.ApiResult;

public final class aea implements yda
{
    public final vi0 a;
    
    public aea(final vi0 a) {
        this.a = a;
    }
    
    public final Object a(final String s, String a, final h07 h07) {
        while (true) {
            Label_0044: {
                if (!(h07 instanceof zda)) {
                    break Label_0044;
                }
                final zda zda = (zda)h07;
                final int x = zda.x;
                if ((x & Integer.MIN_VALUE) == 0x0) {
                    break Label_0044;
                }
                zda.x = x + Integer.MIN_VALUE;
                final Object o = zda;
                final Object v = ((zda)o).v;
                final int x2 = ((zda)o).x;
                final ire ire = null;
                Object o2;
                if (x2 != 0) {
                    if (x2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(v);
                    o2 = v;
                }
                else {
                    vt4.g0(v);
                    final lj0 p3 = lmf.p(1, "{organization}/files/{fileUuid}/preview", "organization", s);
                    p3.e("fileUuid", a);
                    final mj0 b = p3.b();
                    ((zda)o).x = 1;
                    final Object c = this.a.c(0, b, (lta)new p50((byte)4), (lta)new uz((byte)13), (f07)o);
                    final pc7 v2 = pc7.v;
                    if ((o2 = c) == v2) {
                        return v2;
                    }
                }
                final ApiResult apiResult = (ApiResult)o2;
                final int z = t.z(apiResult);
                if (z != 0) {
                    if (z == 1) {
                        return apiResult;
                    }
                    en9.r();
                    return null;
                }
                else {
                    final qj0 qj0 = (qj0)apiResult;
                    final int a2 = qj0.a;
                    final rpi rpi = (rpi)qj0.b;
                    final tnj v3 = unj.v;
                    a = (String)rpi.a();
                    final String b2 = rpi.b();
                    ire t = ire;
                    Label_0258: {
                        if (b2 == null) {
                            break Label_0258;
                        }
                        final w6j e = ire.e;
                        try {
                            t = k8e.t(b2);
                            return new qj0(a2, ao2.D((is2)a, t));
                        }
                        catch (final IllegalArgumentException ex) {
                            t = ire;
                            return new qj0(a2, ao2.D((is2)a, t));
                        }
                    }
                }
            }
            final Object o = new zda(this, h07);
            continue;
        }
    }
}
