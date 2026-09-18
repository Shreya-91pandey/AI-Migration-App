package com.anthropic.claude.api.experience;

@jzk
public final class OpenLinkAction implements ExperienceClientAction
{
    public static final cdg Companion;
    public final String a = a;
    
    static {
        Companion = new cdg();
    }
    
    public OpenLinkAction() {
        this.a = "claude://settings/guest-pass";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof OpenLinkAction && mlc.q((Object)this.a, (Object)((OpenLinkAction)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("OpenLinkAction(url=", this.a, ")");
    }
}
