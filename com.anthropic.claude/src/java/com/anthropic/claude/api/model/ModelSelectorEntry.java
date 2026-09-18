package com.anthropic.claude.api.model;

import java.util.Collection;
import java.util.Iterator;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ModelId;
import java.util.List;
import java.util.Map;
import com.anthropic.claude.api.notice.Notice;
import com.anthropic.claude.types.strings._ServerLocalizedString;

@jzk
public final class ModelSelectorEntry
{
    public static final dff Companion;
    public static final d2d[] o;
    public final String a = a;
    public final String b = b;
    public final String c;
    public final String d;
    public final _ServerLocalizedString e;
    public final Notice f;
    public final Notice g;
    public final ModelSection h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final Map l;
    public final ThinkingOptions m;
    public final Badge n;
    
    static {
        Companion = (dff)new Object();
        o = new d2d[] { null, null, null, null, ncq.F(2, (jta)new v0e((byte)27)), null, null, null, null, null, null, ncq.F(2, (jta)new v0e((byte)28)), null, null };
    }
    
    public ModelSelectorEntry(final String a, final String b, final String c, final String d, final _ServerLocalizedString e, final Notice f, final Notice g, final ModelSection h, final boolean i, final boolean j, final String k, final Map l, final ThinkingOptions m, final Badge n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public final List a() {
        final ThinkingOptions m = this.m;
        List a;
        if (m != null) {
            a = m.a;
        }
        else {
            a = null;
        }
        Object v = a;
        if (a == null) {
            v = r89.v;
        }
        return (List)v;
    }
    
    public final List b() {
        final ThinkingOptions m = this.m;
        List b;
        if (m != null) {
            b = m.b;
        }
        else {
            b = null;
        }
        Object v = b;
        if (b == null) {
            v = r89.v;
        }
        return (List)v;
    }
    
    public final String c() {
        Object c = this.c;
        if (c != null) {
            if (kym.Y0((CharSequence)c)) {
                c = null;
            }
            if (c != null) {
                return (String)c;
            }
        }
        return this.b;
    }
    
    public final String d() {
        final String d = this.d;
        if (d != null) {
            ModelId modelId = new ModelId(d);
            final boolean y0 = kym.Y0((CharSequence)d);
            String a = null;
            if (y0) {
                modelId = null;
            }
            if (modelId != null) {
                a = modelId.a;
            }
            if (a != null) {
                return a;
            }
        }
        return this.a;
    }
    
    public final k0j e(String a, final String s) {
        final String s2 = null;
        Label_0101: {
            if (a != null) {
                final ThinkingEffort thinkingEffort = new ThinkingEffort(a);
                final List a2 = this.a();
                ThinkingEffort thinkingEffort2 = null;
                Label_0087: {
                    if (!((Collection)a2).isEmpty()) {
                        final Iterator iterator = ((Iterable)a2).iterator();
                        while (iterator.hasNext()) {
                            if (mlc.q((Object)((ThinkingEffort)((ThinkingOption)iterator.next()).a).a, (Object)a)) {
                                thinkingEffort2 = thinkingEffort;
                                break Label_0087;
                            }
                        }
                    }
                    thinkingEffort2 = null;
                }
                if (thinkingEffort2 != null) {
                    a = thinkingEffort2.a;
                    break Label_0101;
                }
            }
            a = null;
        }
        String a3 = s2;
        if (s != null) {
            final ThinkingMode thinkingMode = new ThinkingMode(s);
            ThinkingMode.Companion.getClass();
            ThinkingMode thinkingMode2 = thinkingMode;
            Label_0204: {
                if (!s.equals("off")) {
                    final List b = this.b();
                    if (!((Collection)b).isEmpty()) {
                        final Iterator iterator2 = ((Iterable)b).iterator();
                        while (iterator2.hasNext()) {
                            if (mlc.q((Object)((ThinkingMode)((ThinkingOption)iterator2.next()).a).a, (Object)s)) {
                                thinkingMode2 = thinkingMode;
                                break Label_0204;
                            }
                        }
                    }
                    thinkingMode2 = null;
                }
            }
            a3 = s2;
            if (thinkingMode2 != null) {
                a3 = thinkingMode2.a;
            }
        }
        return new k0j(a, a3, 0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelSelectorEntry)) {
            return false;
        }
        final ModelSelectorEntry modelSelectorEntry = (ModelSelectorEntry)o;
        if (!mlc.q((Object)this.a, (Object)modelSelectorEntry.a)) {
            return false;
        }
        if (!mlc.q((Object)this.b, (Object)modelSelectorEntry.b)) {
            return false;
        }
        if (!mlc.q((Object)this.c, (Object)modelSelectorEntry.c)) {
            return false;
        }
        final String d = modelSelectorEntry.d;
        final String d2 = this.d;
        if (d2 == null) {
            if (d == null) {
                final boolean equals = true;
                return equals && mlc.q((Object)this.e, (Object)modelSelectorEntry.e) && mlc.q((Object)this.f, (Object)modelSelectorEntry.f) && mlc.q((Object)this.g, (Object)modelSelectorEntry.g) && this.h == modelSelectorEntry.h && this.i == modelSelectorEntry.i && this.j == modelSelectorEntry.j && mlc.q((Object)this.k, (Object)modelSelectorEntry.k) && mlc.q((Object)this.l, (Object)modelSelectorEntry.l) && mlc.q((Object)this.m, (Object)modelSelectorEntry.m) && mlc.q((Object)this.n, (Object)modelSelectorEntry.n);
            }
        }
        else if (d != null) {
            final boolean equals = d2.equals(d);
            return equals && mlc.q((Object)this.e, (Object)modelSelectorEntry.e) && mlc.q((Object)this.f, (Object)modelSelectorEntry.f) && mlc.q((Object)this.g, (Object)modelSelectorEntry.g) && this.h == modelSelectorEntry.h && this.i == modelSelectorEntry.i && this.j == modelSelectorEntry.j && mlc.q((Object)this.k, (Object)modelSelectorEntry.k) && mlc.q((Object)this.l, (Object)modelSelectorEntry.l) && mlc.q((Object)this.m, (Object)modelSelectorEntry.m) && mlc.q((Object)this.n, (Object)modelSelectorEntry.n);
        }
        final boolean equals = false;
        return equals && mlc.q((Object)this.e, (Object)modelSelectorEntry.e) && mlc.q((Object)this.f, (Object)modelSelectorEntry.f) && mlc.q((Object)this.g, (Object)modelSelectorEntry.g) && this.h == modelSelectorEntry.h && this.i == modelSelectorEntry.i && this.j == modelSelectorEntry.j && mlc.q((Object)this.k, (Object)modelSelectorEntry.k) && mlc.q((Object)this.l, (Object)modelSelectorEntry.l) && mlc.q((Object)this.m, (Object)modelSelectorEntry.m) && mlc.q((Object)this.n, (Object)modelSelectorEntry.n);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(this.a.hashCode() * 31, 31, this.b);
        final int n = 0;
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final String d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final _ServerLocalizedString e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        final Notice f = this.f;
        int hashCode4;
        if (f == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = f.hashCode();
        }
        final Notice g = this.g;
        int hashCode5;
        if (g == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = g.hashCode();
        }
        final int l = smk.l(smk.l((this.h.hashCode() + (((((j + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31) * 31, 31, this.i), 31, this.j);
        final String k = this.k;
        int hashCode6;
        if (k == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = k.hashCode();
        }
        final int f2 = t.f((l + hashCode6) * 31, 31, this.l);
        final ThinkingOptions m = this.m;
        int hashCode7;
        if (m == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = m.hashCode();
        }
        final Badge n2 = this.n;
        int hashCode8;
        if (n2 == null) {
            hashCode8 = n;
        }
        else {
            hashCode8 = n2.hashCode();
        }
        return (f2 + hashCode7) * 31 + hashCode8;
    }
    
    @Override
    public final String toString() {
        final String a = ModelId.a(this.a);
        final String d = this.d;
        String a2;
        if (d == null) {
            a2 = "null";
        }
        else {
            a2 = ModelId.a(d);
        }
        final StringBuilder t = oz1.t("ModelSelectorEntry(id=", a, ", name=", this.b, ", short_name=");
        oz1.A(t, this.c, ", voice_model=", a2, ", description=");
        t.append((Object)this.e);
        t.append(", notice=");
        t.append((Object)this.f);
        t.append(", selection_notice=");
        t.append((Object)this.g);
        t.append(", section=");
        t.append((Object)this.h);
        t.append(", disabled=");
        p3g.i(t, this.i, ", requires_auto_mode=", this.j, ", min_claude_code_version=");
        t.append(this.k);
        t.append(", capabilities=");
        t.append((Object)this.l);
        t.append(", thinking=");
        t.append((Object)this.m);
        t.append(", badge=");
        t.append((Object)this.n);
        t.append(")");
        return t.toString();
    }
}
