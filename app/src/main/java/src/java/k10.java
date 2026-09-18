import java.util.Collection;
import java.util.Iterator;
import java.io.Closeable;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.io.File;
import com.datadog.android.rum.internal.domain.scope.p;
import java.util.Map;

public final class k10 extends qxc implements lta
{
    public final byte w;
    public final Object x;
    
    public k10(final k0d x, final k2j k2j, final zql zql) {
        this.w = 10;
        this.x = x;
        super(1);
    }
    
    @Override
    public final Object b(Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final Object x = this.x;
        switch (w) {
            default: {
                final oi9 oi9 = (oi9)o;
                o = x;
                final xv7 xv7 = (xv7)((hpb)o).g;
                final ak ak = (ak)((hpb)o).i;
                if (xv7 instanceof twf) {
                    c5q.E(((tjc)((hpb)o).e).v(), 3, qjc.v, (jta)g5q.C, null, false, 56);
                    if (ak != null) {
                        ((lta)((hpb)o).b).b(ak);
                    }
                }
                else {
                    Label_0239: {
                        try {
                            if (xv7.d(oi9, ((jta)((hpb)o).h).a(), ((hpb)o).d)) {
                                if (ak != null) {
                                    ((lta)((hpb)o).c).b(ak);
                                    return a;
                                }
                                return a;
                            }
                        }
                        catch (final Exception ex) {
                            break Label_0239;
                        }
                        ((hpb)o).e((Exception)null);
                        return a;
                    }
                    final Exception ex;
                    ((hpb)o).e(ex);
                }
                return a;
            }
            case 11: {
                final Map map = (Map)o;
                map.put((Object)"message", (Object)"added");
                final deh deh = (deh)x;
                if (deh instanceof lnk) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append((Object)ceh.x);
                    sb.append("-Segment.io");
                    map.put((Object)"plugin", (Object)sb.toString());
                }
                else {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object)deh.getType());
                    sb2.append('-');
                    sb2.append((Object)deh.getClass());
                    map.put((Object)"plugin", (Object)sb2.toString());
                }
                return a;
            }
            case 10: {
                final cw8 cw8 = (cw8)o;
                ((k0d)x).a();
                return a;
            }
            case 9: {
                ((Map)o).remove((Object)((p)x).z);
                return a;
            }
            case 8: {
                final cw8 cw9 = (cw8)o;
                final g6b g6b = (g6b)x;
                final g90 l = g6b.l;
                if (g6b.n && g6b.A && l != null) {
                    final zn0 b0 = cw9.B0();
                    final long a2 = b0.A();
                    b0.t().g();
                    try {
                        ((jy7)b0.v).k(l);
                        g6b.d(cw9);
                        return a;
                    }
                    finally {
                        oz1.w(b0, a2);
                    }
                }
                g6b.d(cw9);
                return a;
            }
            case 7: {
                final File file = (File)o;
                final Charset charset = (Charset)x;
                final ArrayList list = new ArrayList();
                o = new BufferedReader((Reader)new InputStreamReader((InputStream)new FileInputStream(file), charset));
                Label_0622: {
                    try {
                        final Iterator iterator = ((av6)mlc.R((BufferedReader)o)).iterator();
                        while (iterator.hasNext()) {
                            list.add((Object)iterator.next());
                        }
                        break Label_0622;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            zn2.r((Closeable)o, t);
                        }
                        ((BufferedReader)o).close();
                        return list;
                    }
                }
            }
            case 6: {
                final Map map2 = (Map)o;
                map2.clear();
                final f0k f0k = (f0k)x;
                if (f0k != null) {
                    map2.putAll(f0k.b());
                }
                return a;
            }
            case 5: {
                ((jqj)o).b(((Number)((xom)x).getValue()).floatValue());
                return a;
            }
            case 4: {
                return mlc.q(o, ((efo)x).d.getValue()) ^ true;
            }
            case 3: {
                final hg0 hg0 = (hg0)o;
                final float b2 = hg0.b;
                final float n = 0.0f;
                float n2 = b2;
                if (b2 < 0.0f) {
                    n2 = 0.0f;
                }
                final float n3 = 1.0f;
                float n4 = n2;
                if (n2 > 1.0f) {
                    n4 = 1.0f;
                }
                final float c = hg0.c;
                final float n5 = -0.5f;
                float n6 = c;
                if (c < -0.5f) {
                    n6 = -0.5f;
                }
                final float n7 = 0.5f;
                float n8 = n6;
                if (n6 > 0.5f) {
                    n8 = 0.5f;
                }
                float d = hg0.d;
                if (d < -0.5f) {
                    d = n5;
                }
                float n9;
                if (d > 0.5f) {
                    n9 = n7;
                }
                else {
                    n9 = d;
                }
                float a3 = hg0.a;
                if (a3 < 0.0f) {
                    a3 = n;
                }
                if (a3 > 1.0f) {
                    a3 = n3;
                }
                return new j86(j86.a(t08.b(n4, n8, n9, a3, (u86)x86.x), (u86)x));
            }
            case 2: {
                final n8h n8h = (n8h)o;
                final ArrayList list2 = (ArrayList)x;
                for (int size = list2.size(), i = 0; i < size; ++i) {
                    n8h.g(n8h, (o8h)list2.get(i), 0, 0);
                }
                return a;
            }
            case 1: {
                return mlc.q(o, x);
            }
            case 0: {
                final Map map3 = (Map)o;
                map3.put((Object)"message", (Object)"configured");
                final vn6 v = ((s10)x).v;
                map3.put((Object)"apihost", (Object)v.e);
                map3.put((Object)"cdnhost", (Object)v.f);
                final StringBuilder sb3 = new StringBuilder("at:3 int:10 pol:");
                sb3.append(((Collection)v.d).size());
                map3.put((Object)"flush", (Object)sb3.toString());
                map3.put((Object)"config", (Object)"seg:true");
                return a;
            }
        }
    }
}
