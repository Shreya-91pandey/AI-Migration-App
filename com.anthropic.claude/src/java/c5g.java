import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import java.util.Date;
import java.util.Iterator;
import com.anthropic.claude.conversation.model.ServingWorkspace;
import com.anthropic.claude.conversation.model.WorkspaceUpgradePhase;
import com.anthropic.claude.api.chat.ChatMessage;
import java.util.ArrayList;
import java.util.List;
import com.anthropic.claude.api.chat.ChatConversationWithNestedMessage;

public final class c5g
{
    public final d5g a;
    public final String b;
    public final String c;
    public final nug d;
    
    public c5g(final d5g a, final String b, final String c, final nug d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static and d(final ChatConversationWithNestedMessage chatConversationWithNestedMessage, final List list) {
        final ArrayList list2 = new ArrayList(d86.p0((Iterable)list, 10));
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            list2.add((Object)ckq.d((ChatMessage)iterator.next()));
        }
        final boolean d = chatConversationWithNestedMessage.d();
        final String c = chatConversationWithNestedMessage.c();
        final String b = chatConversationWithNestedMessage.b();
        final ArrayList list3 = new ArrayList();
        final Iterator iterator2 = ((Iterable)list).iterator();
        while (iterator2.hasNext()) {
            final Date h = ((ChatMessage)iterator2.next()).h();
            Long value;
            if (h != null) {
                value = h.getTime();
            }
            else {
                value = null;
            }
            if (value != null) {
                list3.add((Object)value);
            }
        }
        return new and((List)list2, list, d, c, b, (Long)c86.S0((Iterable)list3), (WorkspaceUpgradePhase)null, (ServingWorkspace)null, (u5c)null, (String)null, 1984);
    }
    
    public final Object a(final h07 h07) {
        final Object a = gtf.a(this.a.l, h07);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public final Object b(f07 v) {
        final d5g a = this.a;
        final x27 e = a.e;
        Object o = null;
        Label_0060: {
            if (v instanceof z4g) {
                final z4g z4g = (z4g)v;
                final int z = z4g.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    z4g.z = z + Integer.MIN_VALUE;
                    o = z4g;
                    break Label_0060;
                }
            }
            o = new z4g(this, v);
        }
        final Object x = ((z4g)o).x;
        final int z2 = ((z4g)o).z;
        final String b = this.b;
        final String s = null;
        int w = 0;
        Object m = null;
        Label_0230: {
            if (z2 != 0) {
                if (z2 == 1) {
                    w = ((z4g)o).w;
                    v = (f07)((z4g)o).v;
                    try {
                        vt4.g0(x);
                        break Label_0230;
                    }
                    finally {
                        break Label_0230;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(x);
            final ChatConversationWithProjectReference v2 = e.v(b);
            if (v2 != null && v2.k) {
                return new i8a((pj0)null);
            }
            final String c = this.c;
            w = c.hashCode();
            final nug d = this.d;
            omo.w(w, "conversationStoreCacheRead");
            try {
                final o77 d2 = a.d;
                final String f = a.f;
                ((z4g)o).v = "conversationStoreCacheRead";
                ((z4g)o).w = w;
                ((z4g)o).z = 1;
                m = d2.m(f, c, d, (h07)o);
                final pc7 v3 = pc7.v;
                if (m == v3) {
                    return v3;
                }
                v = (f07)"conversationStoreCacheRead";
                omo.B(w, (String)v);
                final and and = (and)m;
                if (and == null) {
                    return new i8a((pj0)null);
                }
                if (and.d()) {
                    return new i8a((pj0)null);
                }
                final ChatConversationWithProjectReference v4 = e.v(b);
                String l = s;
                if (v4 != null) {
                    l = v4.l;
                }
                return new j8a(and.a(and, l));
            }
            finally {
                v = (f07)"conversationStoreCacheRead";
            }
        }
        omo.B(w, (String)v);
        throw m;
    }
    
    public final Object c(final h07 h07) {
        while (true) {
            Label_0037: {
                if (!(h07 instanceof a5g)) {
                    break Label_0037;
                }
                final a5g a5g = (a5g)h07;
                final int y = a5g.y;
                if ((y & Integer.MIN_VALUE) == 0x0) {
                    break Label_0037;
                }
                a5g.y = y + Integer.MIN_VALUE;
                final Object o = a5g;
                Object o2 = ((a5g)o).w;
                final int y2 = ((a5g)o).y;
                b4j v;
                if (y2 != 0) {
                    if (y2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v = ((a5g)o).v;
                    vt4.g0(o2);
                }
                else {
                    final b4j e = hia.e(o2);
                    final qo4 b = this.a.b;
                    final m40 m40 = new m40(e, (byte)7);
                    ((a5g)o).v = e;
                    ((a5g)o).y = 1;
                    o2 = b.g(this.b, true, true, (lta)m40, (h07)o);
                    final pc7 v2 = pc7.v;
                    if (o2 == v2) {
                        return v2;
                    }
                    v = e;
                }
                final ChatConversationWithNestedMessage chatConversationWithNestedMessage = (ChatConversationWithNestedMessage)o2;
                if (chatConversationWithNestedMessage == null) {
                    return new i8a((pj0)v.v);
                }
                Object o3;
                if ((o3 = chatConversationWithNestedMessage.a()) == null) {
                    o3 = r89.v;
                }
                return new j8a(d(chatConversationWithNestedMessage, (List)o3));
            }
            final Object o = new a5g(this, h07);
            continue;
        }
    }
    
    public final Object e(final h07 h07) {
        while (true) {
            Label_0037: {
                if (!(h07 instanceof b5g)) {
                    break Label_0037;
                }
                final b5g b5g = (b5g)h07;
                final int y = b5g.y;
                if ((y & Integer.MIN_VALUE) == 0x0) {
                    break Label_0037;
                }
                b5g.y = y + Integer.MIN_VALUE;
                final Object o = b5g;
                Object o2 = ((b5g)o).w;
                final int y2 = ((b5g)o).y;
                b4j v;
                if (y2 != 0) {
                    if (y2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v = ((b5g)o).v;
                    vt4.g0(o2);
                }
                else {
                    final b4j e = hia.e(o2);
                    final qo4 b = this.a.b;
                    final m40 m40 = new m40(e, (byte)6);
                    ((b5g)o).v = e;
                    ((b5g)o).y = 1;
                    final String g = qo4.G;
                    o2 = b.g(this.b, true, false, (lta)m40, (h07)o);
                    final pc7 v2 = pc7.v;
                    if (o2 == v2) {
                        return v2;
                    }
                    v = e;
                }
                final ChatConversationWithNestedMessage chatConversationWithNestedMessage = (ChatConversationWithNestedMessage)o2;
                if (chatConversationWithNestedMessage == null) {
                    return new i8a((pj0)v.v);
                }
                final List a = chatConversationWithNestedMessage.a();
                if (a == null) {
                    return new i8a((pj0)null);
                }
                return new j8a(d(chatConversationWithNestedMessage, a));
            }
            final Object o = new b5g(this, h07);
            continue;
        }
    }
}
