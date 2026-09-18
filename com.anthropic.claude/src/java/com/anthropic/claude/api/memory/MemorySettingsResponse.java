package com.anthropic.claude.api.memory;

import com.anthropic.claude.api.account.MemoryMode;

@jzk
public final class MemorySettingsResponse
{
    public static final pxe Companion;
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final MemoryMode d;
    public final Boolean e;
    public final Boolean f;
    
    static {
        Companion = (pxe)new Object();
    }
    
    public MemorySettingsResponse(final Boolean a, final Boolean b, final Boolean c, final MemoryMode d, final Boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemorySettingsResponse)) {
            return false;
        }
        final MemorySettingsResponse memorySettingsResponse = (MemorySettingsResponse)o;
        return mlc.q((Object)this.a, (Object)memorySettingsResponse.a) && mlc.q((Object)this.b, (Object)memorySettingsResponse.b) && mlc.q((Object)this.c, (Object)memorySettingsResponse.c) && this.d == memorySettingsResponse.d && mlc.q((Object)this.e, (Object)memorySettingsResponse.e) && mlc.q((Object)this.f, (Object)memorySettingsResponse.f);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Boolean a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final MemoryMode d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Boolean e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Boolean f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MemorySettingsResponse(enabled_melange=");
        sb.append((Object)this.a);
        sb.append(", enabled_saffron=");
        sb.append((Object)this.b);
        sb.append(", enabled_saffron_search=");
        sb.append((Object)this.c);
        sb.append(", memory_mode=");
        sb.append((Object)this.d);
        sb.append(", classic_mode_available=");
        sb.append((Object)this.e);
        sb.append(", sensitive_consent_recorded=");
        sb.append((Object)this.f);
        sb.append(")");
        return sb.toString();
    }
}
