package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ChatId;
import java.util.Date;

@jzk
public final class ChatConversation
{
    public static final lo3 Companion;
    public final String a = a;
    public final Date b = b;
    public final Date c = c;
    public final String d = d;
    public final String e = e;
    public final String f;
    public final ChatConversationSettings g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final String k;
    
    static {
        Companion = new lo3();
    }
    
    public ChatConversation(final String a, final Date b, final Date c, final String d, final String e, final String f, final ChatConversationSettings g, final boolean h, final String i, final boolean j, final String k) {
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
    }
    
    public static ChatConversation a(final ChatConversation chatConversation, String d, String f, ChatConversationSettings g, final int n) {
        final String a = chatConversation.a;
        final Date b = chatConversation.b;
        final Date c = chatConversation.c;
        if ((n & 0x8) != 0x0) {
            d = chatConversation.d;
        }
        final String e = chatConversation.e;
        if ((n & 0x20) != 0x0) {
            f = chatConversation.f;
        }
        if ((n & 0x40) != 0x0) {
            g = chatConversation.g;
        }
        final boolean h = chatConversation.h;
        final String i = chatConversation.i;
        final boolean j = chatConversation.j;
        final String k = chatConversation.k;
        chatConversation.getClass();
        return new ChatConversation(a, b, c, d, e, f, g, h, i, j, k);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatConversation)) {
            return false;
        }
        final ChatConversation chatConversation = (ChatConversation)o;
        if (!mlc.q((Object)this.a, (Object)chatConversation.a)) {
            return false;
        }
        if (!mlc.q((Object)this.b, (Object)chatConversation.b)) {
            return false;
        }
        if (!mlc.q((Object)this.c, (Object)chatConversation.c)) {
            return false;
        }
        if (!mlc.q((Object)this.d, (Object)chatConversation.d)) {
            return false;
        }
        if (!mlc.q((Object)this.e, (Object)chatConversation.e)) {
            return false;
        }
        final String f = chatConversation.f;
        final String f2 = this.f;
        boolean equals = false;
        Label_0145: {
            if (f2 == null) {
                if (f == null) {
                    equals = true;
                    break Label_0145;
                }
            }
            else if (f != null) {
                equals = f2.equals(f);
                break Label_0145;
            }
            equals = false;
        }
        if (!equals) {
            return false;
        }
        if (!mlc.q((Object)this.g, (Object)chatConversation.g)) {
            return false;
        }
        if (this.h != chatConversation.h) {
            return false;
        }
        final String i = chatConversation.i;
        final String j = this.i;
        boolean equals2 = false;
        Label_0224: {
            if (j == null) {
                if (i == null) {
                    equals2 = true;
                    break Label_0224;
                }
            }
            else if (i != null) {
                equals2 = j.equals(i);
                break Label_0224;
            }
            equals2 = false;
        }
        if (!equals2) {
            return false;
        }
        if (this.j != chatConversation.j) {
            return false;
        }
        final String k = chatConversation.k;
        final String l = this.k;
        if (l == null) {
            if (k == null) {
                return true;
            }
        }
        else if (k != null) {
            return l.equals(k);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(smk.j((this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31, 31, this.d), 31, this.e);
        final int n = 0;
        final String f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        final int l = smk.l((this.g.hashCode() + (j + hashCode) * 31) * 31, 31, this.h);
        final String i = this.i;
        int hashCode2;
        if (i == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = i.hashCode();
        }
        final int k = smk.l((l + hashCode2) * 31, 31, this.j);
        final String m = this.k;
        int hashCode3;
        if (m == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = m.hashCode();
        }
        return k + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String b = ChatId.b(this.a);
        String a = "null";
        final String f = this.f;
        String a2;
        if (f == null) {
            a2 = "null";
        }
        else {
            a2 = ModelId.a(f);
        }
        final String i = this.i;
        String a3;
        if (i == null) {
            a3 = "null";
        }
        else {
            a3 = ProjectId.a(i);
        }
        final String k = this.k;
        if (k != null) {
            a = MessageId.a(k);
        }
        final StringBuilder sb = new StringBuilder("ChatConversation(uuid=");
        sb.append(b);
        sb.append(", created_at=");
        sb.append((Object)this.b);
        sb.append(", updated_at=");
        sb.append((Object)this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", summary=");
        oz1.A(sb, this.e, ", model=", a2, ", settings=");
        sb.append((Object)this.g);
        sb.append(", is_starred=");
        sb.append(this.h);
        sb.append(", project_uuid=");
        a6l.j(sb, a3, ", is_temporary=", this.j, ", current_leaf_message_uuid=");
        return oz1.p(sb, a, ")");
    }
}
