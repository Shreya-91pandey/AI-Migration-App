package com.anthropic.claude.app;

import com.anthropic.claude.analytics.events.CodeEvents$CodeSessionListEntrySource;

public final class f1 implements zta
{
    public final frg v;
    public final v5a w;
    public final krf x;
    public final t46 y;
    
    public f1(final t46 y, final v5a w, final krf x, final frg v) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final Object d(final Object o, final Object o2) {
        final tx8 tx8 = (tx8)o;
        final mcg mcg = (mcg)o2;
        String a;
        if (mcg != null) {
            a = mcg.a;
        }
        else {
            a = null;
        }
        final v5a w = this.w;
        final krf x = this.x;
        final ClaudeAppDestination.List b = a3.b(tx8, w, x);
        CodeEvents$CodeSessionListEntrySource codeEvents$CodeSessionListEntrySource;
        if (a == null || (codeEvents$CodeSessionListEntrySource = mal.d(a)) == null) {
            codeEvents$CodeSessionListEntrySource = CodeEvents$CodeSessionListEntrySource.w;
        }
        mal.a(this.v, b, this.y, codeEvents$CodeSessionListEntrySource, x);
        return lqo.a;
    }
}
