package com.anthropic.claude.api.experience;

@jzk
public final class NewChatAction implements ExperienceClientAction
{
    public static final iuf Companion;
    public final String a;
    public final String b;
    public final boolean c;
    
    static {
        Companion = new iuf();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewChatAction)) {
            return false;
        }
        final NewChatAction newChatAction = (NewChatAction)o;
        return mlc.q((Object)this.a, (Object)newChatAction.a) && mlc.q((Object)this.b, (Object)newChatAction.b) && this.c == newChatAction.c;
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
        if (b != null) {
            hashCode = b.hashCode();
        }
        return Boolean.hashCode(this.c) + (hashCode2 * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        return ge9.t(oz1.t("NewChatAction(input_text=", this.a, ", model_id=", this.b, ", sticky="), this.c, ")");
    }
}
