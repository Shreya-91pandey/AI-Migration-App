package com.anthropic.claude.app;

import java.util.Iterator;
import java.util.ArrayList;

public final class u2 implements jja
{
    public final frg v;
    public final v5a w;
    public final krf x;
    
    public u2(final frg v, final v5a w, final krf x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final Object l(final Object o, final f07 f07) {
        final boolean booleanValue = (boolean)o;
        final tqd l = uqd.l;
        final lqo a = lqo.a;
        if (!booleanValue) {
            final frg v = this.v;
            final rp4 rp4 = (rp4)v.w.getValue();
            final ArrayList a2 = rp4.a;
            Label_0161: {
                if (!a2.isEmpty()) {
                    final Iterator iterator = a2.iterator();
                    while (iterator.hasNext()) {
                        if (((ClaudeAppDestination.List)((fp4)iterator.next()).a).f()) {
                            break Label_0161;
                        }
                    }
                }
                final ArrayList b = rp4.b;
                if (b.isEmpty()) {
                    return a;
                }
                final Iterator iterator2 = b.iterator();
                while (iterator2.hasNext()) {
                    if (((ClaudeAppDestination.Detail)((fp4)iterator2.next()).a).f()) {
                        break Label_0161;
                    }
                }
                return a;
            }
            final ClaudeAppDestination.List a3 = com.anthropic.claude.app.a3.a(this.w, this.x);
            final tqd i = uqd.l;
            v.b((lta)new go3(a3, v, (byte)18), (zta)t5a.w);
        }
        return a;
    }
}
