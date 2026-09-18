package com.anthropic.claude.api.experience;

@jzk
public final class ChatTooltipContent implements ExperienceContent
{
    public static final bn4 Companion;
    public final String a = a;
    public final ExperienceTooltipLocation b = b;
    public final ExperienceTooltipActionType c;
    public final String d;
    public final String e;
    
    static {
        Companion = (bn4)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatTooltipContent)) {
            return false;
        }
        final ChatTooltipContent chatTooltipContent = (ChatTooltipContent)o;
        return mlc.q((Object)this.a, (Object)chatTooltipContent.a) && this.b == chatTooltipContent.b && this.c == chatTooltipContent.c && mlc.q((Object)this.d, (Object)chatTooltipContent.d) && mlc.q((Object)this.e, (Object)chatTooltipContent.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int hashCode3 = 0;
        final ExperienceTooltipActionType c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode3 = e.hashCode();
        }
        return (((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ChatTooltipContent(text=");
        sb.append(this.a);
        sb.append(", location_id=");
        sb.append((Object)this.b);
        sb.append(", action_type=");
        sb.append((Object)this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", footnote=");
        return oz1.p(sb, this.e, ")");
    }
}
