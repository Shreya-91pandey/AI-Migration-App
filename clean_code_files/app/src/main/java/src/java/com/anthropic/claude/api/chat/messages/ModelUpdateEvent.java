package com.anthropic.claude.api.chat.messages;

import java.util.List;
import com.anthropic.claude.api.chat.ModelSelection;

@jzk
public final class ModelUpdateEvent implements StreamEvent
{
    public static final zff Companion;
    public static final d2d[] h;
    public final ModelSelection a = a;
    public final ModelSelection b = b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    
    static {
        Companion = (zff)new Object();
        h = new d2d[] { null, null, null, null, null, null, ncq.F(2, (jta)new mff((byte)2)) };
    }
    
    public ModelUpdateEvent(final ModelSelection a, final ModelSelection b, final String c, final String d, final String e, final String f, final List g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelUpdateEvent)) {
            return false;
        }
        final ModelUpdateEvent modelUpdateEvent = (ModelUpdateEvent)o;
        return mlc.q((Object)this.a, (Object)modelUpdateEvent.a) && mlc.q((Object)this.b, (Object)modelUpdateEvent.b) && mlc.q((Object)this.c, (Object)modelUpdateEvent.c) && mlc.q((Object)this.d, (Object)modelUpdateEvent.d) && mlc.q((Object)this.e, (Object)modelUpdateEvent.e) && mlc.q((Object)this.f, (Object)modelUpdateEvent.f) && mlc.q((Object)this.g, (Object)modelUpdateEvent.g);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int hashCode3 = 0;
        final String c = this.c;
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
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        if (f != null) {
            hashCode3 = f.hashCode();
        }
        return this.g.hashCode() + (((((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode3) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ModelUpdateEvent(from_model=");
        sb.append((Object)this.a);
        sb.append(", to_model=");
        sb.append((Object)this.b);
        sb.append(", reason=");
        oz1.A(sb, this.c, ", category=", this.d, ", explanation=");
        oz1.A(sb, this.e, ", learn_more_url=", this.f, ", urls=");
        return p3g.e(sb, this.g, ")");
    }
}
