import java.util.Collection;
import android.content.Context;
import android.content.res.Resources$NotFoundException;
import java.io.File;
import android.net.Uri;
import java.util.List;

public final class se6
{
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final l7n f;
    public final l7n g;
    
    public se6(final List a, final List b, final List c, final List d, final List e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new l7n((jta)new qe6(this, (byte)0));
        this.g = new l7n((jta)new qe6(this, (byte)1));
    }
    
    public final Object a(Object o, final pfg pfg) {
        final List b = this.b;
        final int size = ((Collection)b).size();
        int n = 0;
        Object o2 = o;
    Label_0251_Outer:
        while (true) {
            if (n >= size) {
                return o2;
            }
            final yog yog = (yog)b.get(n);
            final kc0 kc0 = (kc0)yog.v;
            Object o3 = o2;
            Label_0262: {
                if (!((us4)yog.w).d(o2)) {
                    break Label_0262;
                }
                kc0.getClass();
            Label_0204_Outer:
                while (true) {
                    Label_0242: {
                        switch (kc0.a) {
                            default: {
                                final Object o4 = k8r.o((String)o2);
                                break Label_0251;
                            }
                            case 3: {
                                break;
                            }
                            case 2: {
                                break Label_0242;
                            }
                            case 1: {
                                break Label_0242;
                            }
                            case 0: {
                                break Label_0242;
                            }
                        }
                        final int intValue = ((Number)o2).intValue();
                        final Context b2 = pfg.b();
                        while (true) {
                            try {
                                Object o4;
                                if (b2.getResources().getResourceEntryName(intValue) != null) {
                                    final String packageName = pfg.b().getPackageName();
                                    o = new StringBuilder("android.resource://");
                                    ((StringBuilder)o).append(packageName);
                                    ((StringBuilder)o).append("/");
                                    ((StringBuilder)o).append(intValue);
                                    o4 = k8r.o(((StringBuilder)o).toString());
                                }
                                else {
                                    o4 = null;
                                }
                                o3 = o2;
                                if (o4 != null) {
                                    o3 = o4;
                                }
                                ++n;
                                o2 = o3;
                                continue Label_0251_Outer;
                                o4 = n8r.i((Uri)o2);
                                continue Label_0204_Outer;
                                o4 = k8r.g(((fvg)o2).v.w());
                                continue Label_0204_Outer;
                                o4 = k8r.g(((File)o2).getPath());
                                continue Label_0204_Outer;
                            }
                            catch (final Resources$NotFoundException ex) {
                                continue;
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public final yog b(final Object o, final pfg pfg, final oti oti, int i) {
        for (l7n f = this.f; i < ((List)f.getValue()).size(); ++i) {
            final yog yog = (yog)((List)f.getValue()).get(i);
            final l8a l8a = (l8a)yog.v;
            if (((us4)yog.w).d(o)) {
                l8a.getClass();
                final m8a a = l8a.a(o, pfg, oti);
                if (a != null) {
                    return new yog((Object)a, (Object)i);
                }
            }
        }
        return null;
    }
}
