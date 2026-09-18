package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings.ToolSearchMode;
import com.anthropic.claude.types.strings.ResearchMode;
import com.anthropic.claude.types.strings.ChatMemoryMode;
import java.util.LinkedHashMap;
import java.util.Map;

@jzk
public final class ChatConversationSettings
{
    public static final no3 Companion;
    public static final d2d[] k;
    public final Map a;
    public final Boolean b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final String j;
    
    static {
        Companion = (no3)new Object();
        k = new d2d[] { ncq.F(2, (jta)new kc2((byte)9)), null, null, null, null, null, null, null, null, null };
    }
    
    public ChatConversationSettings(final Map a, final Boolean b, final Boolean c, final String d, final String e, final String f, final String g, final Boolean h, final Boolean i, final String j) {
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
    }
    
    public static ChatConversationSettings a(final ChatConversationSettings chatConversationSettings, Map a, Boolean b, String d, String e, String f, String g, final int n) {
        if ((n & 0x1) != 0x0) {
            a = chatConversationSettings.a;
        }
        if ((n & 0x2) != 0x0) {
            b = chatConversationSettings.b;
        }
        final Boolean c = chatConversationSettings.c;
        if ((n & 0x8) != 0x0) {
            d = chatConversationSettings.d;
        }
        if ((n & 0x10) != 0x0) {
            e = chatConversationSettings.e;
        }
        if ((n & 0x20) != 0x0) {
            f = chatConversationSettings.f;
        }
        if ((n & 0x40) != 0x0) {
            g = chatConversationSettings.g;
        }
        final Boolean h = chatConversationSettings.h;
        final Boolean i = chatConversationSettings.i;
        final String j = chatConversationSettings.j;
        chatConversationSettings.getClass();
        return new ChatConversationSettings(a, b, c, d, e, f, g, h, i, j);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatConversationSettings)) {
            return false;
        }
        final ChatConversationSettings chatConversationSettings = (ChatConversationSettings)o;
        if (!mlc.q((Object)this.a, (Object)chatConversationSettings.a)) {
            return false;
        }
        if (!mlc.q((Object)this.b, (Object)chatConversationSettings.b)) {
            return false;
        }
        if (!mlc.q((Object)this.c, (Object)chatConversationSettings.c)) {
            return false;
        }
        final String d = chatConversationSettings.d;
        final String d2 = this.d;
        boolean equals = false;
        Label_0114: {
            if (d2 == null) {
                if (d == null) {
                    equals = true;
                    break Label_0114;
                }
            }
            else if (d != null) {
                equals = d2.equals(d);
                break Label_0114;
            }
            equals = false;
        }
        if (!equals) {
            return false;
        }
        final String e = chatConversationSettings.e;
        final String e2 = this.e;
        boolean equals2 = false;
        Label_0165: {
            if (e2 == null) {
                if (e == null) {
                    equals2 = true;
                    break Label_0165;
                }
            }
            else if (e != null) {
                equals2 = e2.equals(e);
                break Label_0165;
            }
            equals2 = false;
        }
        if (!equals2) {
            return false;
        }
        final String f = chatConversationSettings.f;
        final String f2 = this.f;
        boolean equals3 = false;
        Label_0215: {
            if (f2 == null) {
                if (f == null) {
                    equals3 = true;
                    break Label_0215;
                }
            }
            else if (f != null) {
                equals3 = f2.equals(f);
                break Label_0215;
            }
            equals3 = false;
        }
        if (!equals3) {
            return false;
        }
        final String g = chatConversationSettings.g;
        final String g2 = this.g;
        boolean equals4 = false;
        Label_0266: {
            if (g2 == null) {
                if (g == null) {
                    equals4 = true;
                    break Label_0266;
                }
            }
            else if (g != null) {
                equals4 = g2.equals(g);
                break Label_0266;
            }
            equals4 = false;
        }
        if (!equals4) {
            return false;
        }
        if (!mlc.q((Object)this.h, (Object)chatConversationSettings.h)) {
            return false;
        }
        if (!mlc.q((Object)this.i, (Object)chatConversationSettings.i)) {
            return false;
        }
        final String j = chatConversationSettings.j;
        final String i = this.j;
        if (i == null) {
            if (j == null) {
                return true;
            }
        }
        else if (j != null) {
            return ChatMemoryMode.b(i, j);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int c = 0;
        final Map a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final Boolean c2 = this.c;
        int hashCode3;
        if (c2 == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c2.hashCode();
        }
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final String e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final String f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final String g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final Boolean h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final Boolean i = this.i;
        int hashCode9;
        if (i == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = i.hashCode();
        }
        final String j = this.j;
        if (j != null) {
            c = ChatMemoryMode.c(j);
        }
        return ((((((((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + c;
    }
    
    @Override
    public final String toString() {
        String d = "null";
        final String d2 = this.d;
        String a;
        if (d2 == null) {
            a = "null";
        }
        else {
            a = ResearchMode.a(d2);
        }
        final String e = this.e;
        String a2;
        if (e == null) {
            a2 = "null";
        }
        else {
            a2 = ToolSearchMode.a(e);
        }
        final String f = this.f;
        String a3;
        if (f == null) {
            a3 = "null";
        }
        else {
            a3 = ThinkingMode.a(f);
        }
        final String g = this.g;
        String a4;
        if (g == null) {
            a4 = "null";
        }
        else {
            a4 = ThinkingEffort.a(g);
        }
        final String j = this.j;
        if (j != null) {
            d = ChatMemoryMode.d(j);
        }
        final StringBuilder sb = new StringBuilder("ChatConversationSettings(enabled_mcp_tools=");
        sb.append((Object)this.a);
        sb.append(", enabled_web_search=");
        sb.append((Object)this.b);
        sb.append(", enabled_monkeys_in_a_barrel=");
        xc2.p(sb, this.c, ", compass_mode=", a, ", tool_search_mode=");
        oz1.A(sb, a2, ", thinking_mode=", a3, ", effort_level=");
        sb.append(a4);
        sb.append(", preview_feature_uses_artifacts=");
        sb.append((Object)this.h);
        sb.append(", enabled_turmeric=");
        sb.append((Object)this.i);
        sb.append(", chat_memory_mode=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
