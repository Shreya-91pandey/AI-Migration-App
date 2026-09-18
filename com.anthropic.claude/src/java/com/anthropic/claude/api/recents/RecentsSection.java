package com.anthropic.claude.api.recents;

import com.anthropic.claude.types.strings.ChatListSectionId;
import com.anthropic.claude.types.strings.PageCursor;
import java.util.ArrayList;
import java.util.List;

@jzk
public final class RecentsSection
{
    public static final eyi Companion;
    public final String a = a;
    public final String b = b;
    public final List c;
    public final String d;
    
    static {
        Companion = (eyi)new Object();
    }
    
    public RecentsSection(final String a, final String b, final String d, final ArrayList c) {
        this.a = a;
        this.b = b;
        this.c = (List)c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecentsSection)) {
            return false;
        }
        final RecentsSection recentsSection = (RecentsSection)o;
        if (!mlc.q((Object)this.a, (Object)recentsSection.a)) {
            return false;
        }
        if (!mlc.q((Object)this.b, (Object)recentsSection.b)) {
            return false;
        }
        if (!mlc.q((Object)this.c, (Object)recentsSection.c)) {
            return false;
        }
        final String d = recentsSection.d;
        final String d2 = this.d;
        if (d2 == null) {
            if (d == null) {
                return true;
            }
        }
        else if (d != null) {
            return PageCursor.b(d2, d);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int k = smk.k(smk.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        final String d = this.d;
        int c;
        if (d == null) {
            c = 0;
        }
        else {
            c = PageCursor.c(d);
        }
        return k + c;
    }
    
    @Override
    public final String toString() {
        final String a = ChatListSectionId.a(this.a);
        final String d = this.d;
        String d2;
        if (d == null) {
            d2 = "null";
        }
        else {
            d2 = PageCursor.d(d);
        }
        final StringBuilder t = oz1.t("RecentsSection(id=", a, ", title=", this.b, ", data=");
        t.append((Object)this.c);
        t.append(", next_cursor=");
        t.append(d2);
        t.append(")");
        return t.toString();
    }
}
