import java.util.Map;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.Set;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import com.anthropic.claude.types.strings.MessageId;
import java.util.List;

public final class m45 extends m6n implements bua
{
    public final byte w;
    public Object x;
    public Object y;
    
    public m45(final gme y, final f07 f07) {
        this.w = 3;
        this.y = y;
        super(3, f07);
    }
    
    public final Object h(final Object o, Object o2, final Object o3) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                final rsl x = (rsl)o;
                final mmf y = (mmf)o2;
                final m45 m45 = new m45(3, (f07)o3, (byte)4);
                m45.x = x;
                m45.y = y;
                return m45.invokeSuspend(a);
            }
            case 3: {
                final jja jja = (jja)o;
                final Throwable x2 = (Throwable)o2;
                final m45 m46 = new m45((gme)this.y, (f07)o3);
                m46.x = x2;
                m46.invokeSuspend(a);
                return a;
            }
            case 2: {
                final m27 x3 = (m27)o;
                final cio y2 = (cio)o2;
                final m45 m47 = new m45(3, (f07)o3, (byte)2);
                m47.x = x3;
                m47.y = y2;
                return m47.invokeSuspend(a);
            }
            case 1: {
                final yog x4 = (yog)o;
                final p9c y3 = (p9c)o2;
                final m45 m48 = new m45(3, (f07)o3, (byte)1);
                m48.x = x4;
                m48.y = y3;
                return m48.invokeSuspend(a);
            }
            case 0: {
                final List x5 = (List)o;
                final MessageId messageId = (MessageId)o2;
                String a2;
                if (messageId != null) {
                    a2 = messageId.a;
                }
                else {
                    a2 = null;
                }
                o2 = new m45(3, (f07)o3, (byte)0);
                ((m45)o2).x = x5;
                ((m45)o2).y = a2;
                return ((m45)o2).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final Object o2 = null;
        final d4h d4h = null;
        switch (w) {
            default: {
                final rsl rsl = (rsl)this.x;
                final mmf mmf = (mmf)this.y;
                vt4.g0(o);
                final Iterable iterable = (Iterable)mmf.a().keySet();
                final ArrayList list = new ArrayList(d86.p0(iterable, 10));
                final Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    list.add((Object)((kjh)iterator.next()).a);
                }
                final LinkedHashMap a = rsl.a();
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (final Map$Entry map$Entry : a.entrySet()) {
                    if (!list.contains((Object)map$Entry.getKey())) {
                        ((Map)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
                    }
                }
                final mmf f = mmf.f();
                for (final Map$Entry map$Entry2 : linkedHashMap.entrySet()) {
                    final String s = (String)map$Entry2.getKey();
                    final Object value = map$Entry2.getValue();
                    if (value instanceof Boolean) {
                        f.e(new kjh(s), value);
                    }
                    else if (value instanceof Float) {
                        f.e(new kjh(s), value);
                    }
                    else if (value instanceof Integer) {
                        f.e(new kjh(s), value);
                    }
                    else if (value instanceof Long) {
                        f.e(new kjh(s), value);
                    }
                    else if (value instanceof String) {
                        f.e(new kjh(s), value);
                    }
                    else {
                        if (!(value instanceof Set)) {
                            continue;
                        }
                        f.e(new kjh(s), value);
                    }
                }
                return f.g();
            }
            case 3: {
                final Throwable t = (Throwable)this.x;
                vt4.g0(o);
                if (!(t instanceof CancellationException)) {
                    ((gme)this.y).a.r.setValue((Object)Boolean.FALSE);
                }
                return lqo.a;
            }
            case 2: {
                final m27 m27 = (m27)this.x;
                final cio cio = (cio)this.y;
                vt4.g0(o);
                final d4h d4h2 = (d4h)cio.v;
                final i27 i27 = (i27)cio.w;
                final k57 k57 = (k57)cio.x;
                d4h b = d4h;
                if (m27 != null) {
                    b = m27.b;
                }
                return new m27(b, d4h2, i27, k57);
            }
            case 1: {
                final yog yog = (yog)this.x;
                final p9c p9c = (p9c)this.y;
                vt4.g0(o);
                return new yog((Object)yog.w, (Object)p9c);
            }
            case 0: {
                final List list2 = (List)this.x;
                final String s2 = (String)this.y;
                vt4.g0(o);
                Object o3 = o2;
                if (s2 != null) {
                    o3 = new MessageId(s2);
                }
                return new yog((Object)list2, o3);
            }
        }
    }
}
