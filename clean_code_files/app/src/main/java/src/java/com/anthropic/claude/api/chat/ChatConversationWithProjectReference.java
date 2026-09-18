package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ChatId;
import java.util.LinkedHashMap;
import java.util.Date;

@jzk
public final class ChatConversationWithProjectReference
{
    public static final ro3 Companion;
    public final String a = s;
    public final Date b = b;
    public final Date c = c;
    public final String d = d;
    public final String e;
    public final String f;
    public final ChatConversationSettings g;
    public final boolean h;
    public final String i;
    public final ProjectReference j;
    public final boolean k;
    public final String l;
    public final Boolean m;
    public final ChatNeedsInputKind n;
    public final ChatLiveStatus o;
    public final Boolean p;
    public final ProxiedSession q;
    
    static {
        Companion = (ro3)new Object();
    }
    
    public ChatConversationWithProjectReference(final String a, final Date b, final Date c, final String d, final String e, final String f, final ChatConversationSettings g, final boolean h, final String i, final ProjectReference j, final boolean k, final String l, final Boolean m, final ChatNeedsInputKind n, final ChatLiveStatus o, final Boolean p17, final ProxiedSession q) {
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
        this.o = o;
        this.p = p17;
        this.q = q;
    }
    
    public static ChatConversationWithProjectReference a(final ChatConversationWithProjectReference chatConversationWithProjectReference, Date c, String d, boolean h, String i, ProjectReference j, String l, final int n) {
        Boolean b = Boolean.TRUE;
        ChatLiveStatus chatLiveStatus = ChatLiveStatus.w;
        final String a = chatConversationWithProjectReference.a;
        final Date b2 = chatConversationWithProjectReference.b;
        if ((n & 0x4) != 0x0) {
            c = chatConversationWithProjectReference.c;
        }
        if ((n & 0x8) != 0x0) {
            d = chatConversationWithProjectReference.d;
        }
        final String e = chatConversationWithProjectReference.e;
        final String f = chatConversationWithProjectReference.f;
        final ChatConversationSettings g = chatConversationWithProjectReference.g;
        if ((n & 0x80) != 0x0) {
            h = chatConversationWithProjectReference.h;
        }
        if ((n & 0x100) != 0x0) {
            i = chatConversationWithProjectReference.i;
        }
        if ((n & 0x200) != 0x0) {
            j = chatConversationWithProjectReference.j;
        }
        final boolean k = chatConversationWithProjectReference.k;
        if ((n & 0x800) != 0x0) {
            l = chatConversationWithProjectReference.l;
        }
        Boolean m;
        if ((n & 0x1000) != 0x0) {
            m = chatConversationWithProjectReference.m;
        }
        else {
            m = b;
        }
        final ChatNeedsInputKind n2 = chatConversationWithProjectReference.n;
        if ((n & 0x4000) != 0x0) {
            chatLiveStatus = chatConversationWithProjectReference.o;
        }
        if ((n & 0x8000) != 0x0) {
            b = chatConversationWithProjectReference.p;
        }
        final ProxiedSession q = chatConversationWithProjectReference.q;
        chatConversationWithProjectReference.getClass();
        return new ChatConversationWithProjectReference(a, b2, c, d, e, f, g, h, i, j, k, l, m, n2, chatLiveStatus, b, q);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatConversationWithProjectReference)) {
            return false;
        }
        final ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference)o;
        if (!mlc.q((Object)this.a, (Object)chatConversationWithProjectReference.a)) {
            return false;
        }
        if (!mlc.q((Object)this.b, (Object)chatConversationWithProjectReference.b)) {
            return false;
        }
        if (!mlc.q((Object)this.c, (Object)chatConversationWithProjectReference.c)) {
            return false;
        }
        if (!mlc.q((Object)this.d, (Object)chatConversationWithProjectReference.d)) {
            return false;
        }
        if (!mlc.q((Object)this.e, (Object)chatConversationWithProjectReference.e)) {
            return false;
        }
        final String f = chatConversationWithProjectReference.f;
        final String f2 = this.f;
        boolean equals = false;
        Label_0146: {
            if (f2 == null) {
                if (f == null) {
                    equals = true;
                    break Label_0146;
                }
            }
            else if (f != null) {
                equals = f2.equals(f);
                break Label_0146;
            }
            equals = false;
        }
        if (!equals) {
            return false;
        }
        if (!mlc.q((Object)this.g, (Object)chatConversationWithProjectReference.g)) {
            return false;
        }
        if (this.h != chatConversationWithProjectReference.h) {
            return false;
        }
        final String i = chatConversationWithProjectReference.i;
        final String j = this.i;
        boolean equals2 = false;
        Label_0226: {
            if (j == null) {
                if (i == null) {
                    equals2 = true;
                    break Label_0226;
                }
            }
            else if (i != null) {
                equals2 = j.equals(i);
                break Label_0226;
            }
            equals2 = false;
        }
        if (!equals2) {
            return false;
        }
        if (!mlc.q((Object)this.j, (Object)chatConversationWithProjectReference.j)) {
            return false;
        }
        if (this.k != chatConversationWithProjectReference.k) {
            return false;
        }
        final String l = chatConversationWithProjectReference.l;
        final String k = this.l;
        if (k == null) {
            if (l == null) {
                final boolean equals3 = true;
                return equals3 && mlc.q((Object)this.m, (Object)chatConversationWithProjectReference.m) && this.n == chatConversationWithProjectReference.n && this.o == chatConversationWithProjectReference.o && mlc.q((Object)this.p, (Object)chatConversationWithProjectReference.p) && mlc.q((Object)this.q, (Object)chatConversationWithProjectReference.q);
            }
        }
        else if (l != null) {
            final boolean equals3 = k.equals(l);
            return equals3 && mlc.q((Object)this.m, (Object)chatConversationWithProjectReference.m) && this.n == chatConversationWithProjectReference.n && this.o == chatConversationWithProjectReference.o && mlc.q((Object)this.p, (Object)chatConversationWithProjectReference.p) && mlc.q((Object)this.q, (Object)chatConversationWithProjectReference.q);
        }
        final boolean equals3 = false;
        return equals3 && mlc.q((Object)this.m, (Object)chatConversationWithProjectReference.m) && this.n == chatConversationWithProjectReference.n && this.o == chatConversationWithProjectReference.o && mlc.q((Object)this.p, (Object)chatConversationWithProjectReference.p) && mlc.q((Object)this.q, (Object)chatConversationWithProjectReference.q);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(smk.j((this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31, 31, this.d), 31, this.e);
        int hashCode = 0;
        final String f = this.f;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final int l = smk.l((this.g.hashCode() + (j + hashCode2) * 31) * 31, 31, this.h);
        final String i = this.i;
        int hashCode3;
        if (i == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = i.hashCode();
        }
        final ProjectReference k = this.j;
        int hashCode4;
        if (k == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = k.hashCode();
        }
        final int m = smk.l(((l + hashCode3) * 31 + hashCode4) * 31, 31, this.k);
        final String l2 = this.l;
        int hashCode5;
        if (l2 == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = l2.hashCode();
        }
        final Boolean m2 = this.m;
        int hashCode6;
        if (m2 == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = m2.hashCode();
        }
        final ChatNeedsInputKind n = this.n;
        int hashCode7;
        if (n == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = n.hashCode();
        }
        final ChatLiveStatus o = this.o;
        int hashCode8;
        if (o == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = o.hashCode();
        }
        final Boolean p = this.p;
        int hashCode9;
        if (p == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = p.hashCode();
        }
        final ProxiedSession q = this.q;
        if (q != null) {
            hashCode = q.hashCode();
        }
        return (((((m + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode;
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
        final String l = this.l;
        if (l != null) {
            a = MessageId.a(l);
        }
        final StringBuilder sb = new StringBuilder("ChatConversationWithProjectReference(uuid=");
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
        sb.append(a3);
        sb.append(", project=");
        sb.append((Object)this.j);
        sb.append(", is_temporary=");
        a6l.k(sb, this.k, ", current_leaf_message_uuid=", a, ", needs_input=");
        sb.append((Object)this.m);
        sb.append(", needs_input_kind=");
        sb.append((Object)this.n);
        sb.append(", live_status=");
        sb.append((Object)this.o);
        sb.append(", unread=");
        sb.append((Object)this.p);
        sb.append(", proxied_session=");
        sb.append((Object)this.q);
        sb.append(")");
        return sb.toString();
    }
}
