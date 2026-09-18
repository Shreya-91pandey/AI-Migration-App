package com.anthropic.claude.analytics.events;

@jzk
public final class ChatEvents$AddAttachment implements v10
{
    public static final cp3 Companion;
    public static final d2d[] h;
    public final String a = a;
    public final String b = b;
    public final String c = c;
    public final ChatEvents$AttachmentSource d = d;
    public final ScreenSource e = e;
    public final Boolean f;
    public final String g;
    
    static {
        Companion = new cp3();
        h = new d2d[] { null, null, null, ncq.F(2, (jta)new rm3((byte)10)), ncq.F(2, (jta)new rm3((byte)11)), null, null };
    }
    
    public ChatEvents$AddAttachment(final String a, final String b, final String c, final ChatEvents$AttachmentSource d, final ScreenSource e, final Boolean f, final String g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final String a() {
        return "mobile_add_attachment_to_conversation";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatEvents$AddAttachment)) {
            return false;
        }
        final ChatEvents$AddAttachment chatEvents$AddAttachment = (ChatEvents$AddAttachment)o;
        return mlc.q((Object)this.a, (Object)chatEvents$AddAttachment.a) && mlc.q((Object)this.b, (Object)chatEvents$AddAttachment.b) && mlc.q((Object)this.c, (Object)chatEvents$AddAttachment.c) && this.d == chatEvents$AddAttachment.d && this.e == chatEvents$AddAttachment.e && mlc.q((Object)this.f, (Object)chatEvents$AddAttachment.f) && mlc.q((Object)this.g, (Object)chatEvents$AddAttachment.g);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(smk.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        final int hashCode = this.d.hashCode();
        final int hashCode2 = this.e.hashCode();
        int hashCode3 = 0;
        final Boolean f = this.f;
        int hashCode4;
        if (f == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = f.hashCode();
        }
        final String g = this.g;
        if (g != null) {
            hashCode3 = g.hashCode();
        }
        return ((hashCode2 + (hashCode + j) * 31) * 31 + hashCode4) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("AddAttachment(organization_uuid=", this.a, ", conversation_uuid=", this.b, ", uti=");
        t.append(this.c);
        t.append(", source=");
        t.append((Object)this.d);
        t.append(", screen_source=");
        t.append((Object)this.e);
        t.append(", is_wiggle_upload=");
        t.append((Object)this.f);
        t.append(", attachment_uuid=");
        return oz1.p(t, this.g, ")");
    }
}
