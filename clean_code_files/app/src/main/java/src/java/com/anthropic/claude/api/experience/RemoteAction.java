package com.anthropic.claude.api.experience;

import kotlinx.serialization.json.JsonObject;

@jzk
public final class RemoteAction implements ExperienceClientAction
{
    public static final k8j Companion;
    public final String a;
    public final JsonObject b;
    public final boolean c;
    
    static {
        Companion = new k8j();
    }
    
    public RemoteAction(final String a, final JsonObject b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static RemoteAction a(final RemoteAction remoteAction, String a, JsonObject b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = remoteAction.a;
        }
        if ((n & 0x2) != 0x0) {
            b = remoteAction.b;
        }
        final boolean c = remoteAction.c;
        remoteAction.getClass();
        return new RemoteAction(a, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoteAction)) {
            return false;
        }
        final RemoteAction remoteAction = (RemoteAction)o;
        return mlc.q((Object)this.a, (Object)remoteAction.a) && mlc.q((Object)this.b, (Object)remoteAction.b) && this.c == remoteAction.c;
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
        final JsonObject b = this.b;
        if (b != null) {
            hashCode = b.v.hashCode();
        }
        return Boolean.hashCode(this.c) + (hashCode2 * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RemoteAction(id=");
        sb.append(this.a);
        sb.append(", params=");
        sb.append((Object)this.b);
        sb.append(", blocking=");
        return ge9.t(sb, this.c, ")");
    }
}
