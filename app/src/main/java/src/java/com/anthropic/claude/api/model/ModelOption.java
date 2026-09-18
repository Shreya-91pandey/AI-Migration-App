package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.ModelId;
import java.util.List;
import com.anthropic.claude.types.strings._ServerLocalizedString;

@jzk
public final class ModelOption
{
    public static final nef Companion;
    public static final d2d[] m;
    public static final ModelOption n;
    public final String a = a;
    public final String b = b;
    public final _ServerLocalizedString c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final List g;
    public final ModelCapabilities h;
    public final _ServerLocalizedString i;
    public final String j;
    public final String k;
    public final Integer l;
    
    static {
        Companion = (nef)new Object();
        m = new d2d[] { null, null, ncq.F(2, (jta)new v0e((byte)19)), null, null, null, ncq.F(2, (jta)new v0e((byte)20)), null, ncq.F(2, (jta)new v0e((byte)21)), null, null, null };
        n = new ModelOption("missing-model", "", null, null, null, Boolean.TRUE, null, null, null, null, null, null);
    }
    
    public ModelOption(final String a, final String b, final _ServerLocalizedString c, final String d, final Boolean e, final Boolean f, final List g, final ModelCapabilities h, final _ServerLocalizedString i, final String j, final String k, final Integer l) {
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
    }
    
    public final String a() {
        final String b = this.b;
        if (kym.I0((CharSequence)b, (CharSequence)"\ud83e\udd2b", false)) {
            return "\ud83e\udd2b";
        }
        return kym.g1(b, "Claude ");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelOption)) {
            return false;
        }
        final ModelOption modelOption = (ModelOption)o;
        return mlc.q((Object)this.a, (Object)modelOption.a) && mlc.q((Object)this.b, (Object)modelOption.b) && mlc.q((Object)this.c, (Object)modelOption.c) && mlc.q((Object)this.d, (Object)modelOption.d) && mlc.q((Object)this.e, (Object)modelOption.e) && mlc.q((Object)this.f, (Object)modelOption.f) && mlc.q((Object)this.g, (Object)modelOption.g) && mlc.q((Object)this.h, (Object)modelOption.h) && mlc.q((Object)this.i, (Object)modelOption.i) && mlc.q((Object)this.j, (Object)modelOption.j) && mlc.q((Object)this.k, (Object)modelOption.k) && mlc.q((Object)this.l, (Object)modelOption.l);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(this.a.hashCode() * 31, 31, this.b);
        int hashCode = 0;
        final _ServerLocalizedString c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final Boolean e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final Boolean f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final List g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final ModelCapabilities h = this.h;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final _ServerLocalizedString i = this.i;
        int hashCode8;
        if (i == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = i.hashCode();
        }
        final String k = this.j;
        int hashCode9;
        if (k == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = k.hashCode();
        }
        final String l = this.k;
        int hashCode10;
        if (l == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = l.hashCode();
        }
        final Integer m = this.l;
        if (m != null) {
            hashCode = m.hashCode();
        }
        return (((((((((j + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("ModelOption(model=", ModelId.a(this.a), ", name=", this.b, ", description=");
        t.append((Object)this.c);
        t.append(", description_i18n_key=");
        t.append(this.d);
        t.append(", overflow=");
        ju4.h(t, this.e, ", inactive=", this.f, ", thinking_modes=");
        t.append((Object)this.g);
        t.append(", capabilities=");
        t.append((Object)this.h);
        t.append(", notice_text=");
        t.append((Object)this.i);
        t.append(", notice_text_i18n_key=");
        t.append(this.j);
        t.append(", knowledgeCutoff=");
        t.append(this.k);
        t.append(", slow_kb_warning_threshold=");
        t.append((Object)this.l);
        t.append(")");
        return t.toString();
    }
}
