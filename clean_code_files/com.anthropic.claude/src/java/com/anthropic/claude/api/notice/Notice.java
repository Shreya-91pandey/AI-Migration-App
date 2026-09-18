package com.anthropic.claude.api.notice;

@jzk
public final class Notice
{
    public static final nzf Companion;
    public final String a;
    public final String b;
    public final Cta c;
    public final Boolean d;
    
    static {
        Companion = (nzf)new Object();
    }
    
    public Notice(final String a, final String b, final Cta c, final Boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static Notice a(final Notice notice, String b, Cta c, final int n) {
        final String a = notice.a;
        if ((n & 0x2) != 0x0) {
            b = notice.b;
        }
        if ((n & 0x4) != 0x0) {
            c = notice.c;
        }
        return new Notice(a, b, c, notice.d);
    }
    
    public final String b() {
        final String b = this.b;
        final Cta c = this.c;
        final String a = this.a;
        if (a != null || c != null) {
            final String s = null;
            String a2;
            if (c != null) {
                a2 = c.a;
            }
            else {
                a2 = null;
            }
            String name = s;
            if (c != null) {
                final CtaIntent b2 = c.b;
                name = s;
                if (b2 != null) {
                    name = b2.name();
                }
            }
            return c86.N0((Iterable)lq6.Y((Object[])new String[] { a, b, a2, name }), (CharSequence)"\u001f", (String)null, (String)null, (lta)new ryf((byte)1), 30);
        }
        if (b == null) {
            return "";
        }
        return b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Notice)) {
            return false;
        }
        final Notice notice = (Notice)o;
        return mlc.q((Object)this.a, (Object)notice.a) && mlc.q((Object)this.b, (Object)notice.b) && mlc.q((Object)this.c, (Object)notice.c) && mlc.q((Object)this.d, (Object)notice.d);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Cta c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("Notice(title=", this.a, ", text=", this.b, ", cta=");
        t.append((Object)this.c);
        t.append(", is_dismissible=");
        t.append((Object)this.d);
        t.append(")");
        return t.toString();
    }
}
