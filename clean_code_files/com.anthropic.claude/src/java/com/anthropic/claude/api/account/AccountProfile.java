package com.anthropic.claude.api.account;

@jzk
public final class AccountProfile
{
    public static final h8 Companion;
    public final String a;
    public final String b;
    
    static {
        Companion = (h8)new Object();
    }
    
    public AccountProfile(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountProfile)) {
            return false;
        }
        final AccountProfile accountProfile = (AccountProfile)o;
        return mlc.q((Object)this.a, (Object)accountProfile.a) && mlc.q((Object)this.b, (Object)accountProfile.b);
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
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return lmf.t("AccountProfile(conversation_preferences=", this.a, ", avatar_image_url=", this.b, ")");
    }
}
