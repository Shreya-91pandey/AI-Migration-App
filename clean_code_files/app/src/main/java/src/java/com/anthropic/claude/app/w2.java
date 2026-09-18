package com.anthropic.claude.app;

import java.util.Iterator;
import java.util.List;

public final class w2 implements jja
{
    public final frg v;
    public final v5a w;
    public final krf x;
    
    public w2(final frg v, final v5a w, final krf x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final Object l(final Object o, final f07 f07) {
        final yog yog = (yog)o;
        final boolean booleanValue = (boolean)yog.v;
        final List list = (List)yog.w;
        if (booleanValue) {
            if (!list.isEmpty()) {
                final tqd l = uqd.l;
                for (final ClaudeAppDestination claudeAppDestination : list) {
                    final boolean b = claudeAppDestination instanceof ClaudeAppDestination.Detail;
                    final frg v = this.v;
                    if (b) {
                        ox8.b(v, claudeAppDestination, (jta)new pv4(v, (byte)2));
                    }
                    else {
                        v.b((lta)new go3(a3.b(tx8.w, this.w, this.x), v, (byte)19), (zta)t5a.x);
                    }
                }
            }
        }
        return lqo.a;
    }
}
