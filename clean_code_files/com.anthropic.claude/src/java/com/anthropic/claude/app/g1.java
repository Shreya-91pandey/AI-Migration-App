package com.anthropic.claude.app;

import java.util.ListIterator;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;

public final class g1 implements lta
{
    public final krf v;
    public final frg w;
    public final vq x;
    
    public g1(final krf v, final frg w, final vq x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final Object b(final Object o) {
        final SessionId sessionId = (SessionId)o;
        String a;
        if (sessionId != null) {
            a = sessionId.a;
        }
        else {
            a = null;
        }
        if (this.v.f()) {
            Label_0187: {
                if (a != null) {
                    final vr vr = (vr)this.x;
                    vr.getClass();
                    final tqd l = uqd.l;
                    final SessionResource e = vr.e();
                    String d;
                    if (e != null) {
                        d = e.d();
                    }
                    else {
                        d = null;
                    }
                    if (d == null || !d.equals(a)) {
                        final ListIterator listIterator = vr.r.listIterator();
                        while (true) {
                            Object next;
                            do {
                                final xgd xgd = (xgd)listIterator;
                                if (xgd.hasNext()) {
                                    next = xgd.next();
                                }
                                else {
                                    next = null;
                                    final SessionResource sessionResource = (SessionResource)next;
                                    if (sessionResource != null) {
                                        rhc.G((oc7)vr.k, (hc7)null, 0, (zta)new z((Object)vr, (Object)sessionResource, (f07)null, (byte)9), 3);
                                        break Label_0187;
                                    }
                                    vr.q = a;
                                    break Label_0187;
                                }
                            } while (!mlc.q((Object)((SessionResource)next).d(), (Object)a));
                            continue;
                        }
                    }
                }
            }
            final ClaudeAppDestination.List.AgentChat instance = ClaudeAppDestination.List.AgentChat.INSTANCE;
            final fo3 m = fo3.M;
            final frg w = this.w;
            w.b((lta)new go3((ClaudeAppDestination.List)instance, w, (byte)10), (zta)m);
        }
        return lqo.a;
    }
}
