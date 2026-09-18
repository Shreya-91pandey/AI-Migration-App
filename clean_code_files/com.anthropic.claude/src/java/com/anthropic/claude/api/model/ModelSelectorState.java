package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.ModelId;
import java.util.Iterator;
import java.util.List;

@jzk
public final class ModelSelectorState
{
    public static final off Companion;
    public static final d2d[] e;
    public final String a = a;
    public final String b = b;
    public final ThinkingState c;
    public final List d;
    
    static {
        Companion = (off)new Object();
        e = new d2d[] { null, null, ncq.F(2, (jta)new v0e((byte)29)), ncq.F(2, (jta)new mff((byte)0)) };
    }
    
    public ModelSelectorState(final String a, final String b, final ThinkingState c, final List d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static ModelSelectorState a(final ModelSelectorState modelSelectorState, String b, ThinkingState c, List d, final int n) {
        final String a = modelSelectorState.a;
        if ((n & 0x2) != 0x0) {
            b = modelSelectorState.b;
        }
        if ((n & 0x4) != 0x0) {
            c = modelSelectorState.c;
        }
        if ((n & 0x8) != 0x0) {
            d = modelSelectorState.d;
        }
        return new ModelSelectorState(a, b, c, d);
    }
    
    public final ThinkingState b(final String s) {
        final List d = this.d;
        if (d != null) {
            while (true) {
                for (final Object next : d) {
                    if (mlc.q((Object)((ModelThinkingDefault)next).a, (Object)s)) {
                        final ModelThinkingDefault modelThinkingDefault = (ModelThinkingDefault)next;
                        final ModelThinkingDefault modelThinkingDefault2 = modelThinkingDefault;
                        if (modelThinkingDefault2 != null) {
                            return modelThinkingDefault2.b;
                        }
                        return null;
                    }
                }
                final ModelThinkingDefault modelThinkingDefault = null;
                continue;
            }
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelSelectorState)) {
            return false;
        }
        final ModelSelectorState modelSelectorState = (ModelSelectorState)o;
        return mlc.q((Object)this.a, (Object)modelSelectorState.a) && mlc.q((Object)this.b, (Object)modelSelectorState.b) && mlc.q((Object)this.c, (Object)modelSelectorState.c) && mlc.q((Object)this.d, (Object)modelSelectorState.d);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(this.a.hashCode() * 31, 31, this.b);
        int hashCode = 0;
        final ThinkingState c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final List d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return (j + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("ModelSelectorState(id=", ModelSelectorSurface.a(this.a), ", model=", ModelId.a(this.b), ", thinking=");
        t.append((Object)this.c);
        t.append(", thinking_by_model=");
        t.append((Object)this.d);
        t.append(")");
        return t.toString();
    }
}
