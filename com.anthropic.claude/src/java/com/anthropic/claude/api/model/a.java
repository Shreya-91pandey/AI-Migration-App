package com.anthropic.claude.api.model;

import java.util.Iterator;
import java.util.List;

public abstract class a
{
    public static final ModelSelectorEntry a(final String s, final List list) {
        final String e = e(s);
        final Iterator iterator = ((Iterable)list).iterator();
        while (true) {
            Object next;
            do {
                final boolean hasNext = iterator.hasNext();
                final ModelSelectorEntry modelSelectorEntry = null;
                if (hasNext) {
                    next = iterator.next();
                }
                else {
                    final ModelSelectorEntry modelSelectorEntry2 = null;
                    final ModelSelectorEntry modelSelectorEntry3 = modelSelectorEntry2;
                    if (modelSelectorEntry3 == null) {
                        final Iterator iterator2 = ((Iterable)list).iterator();
                        Object next2;
                        do {
                            next2 = modelSelectorEntry;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            next2 = iterator2.next();
                        } while (!mlc.q((Object)((ModelSelectorEntry)next2).a, (Object)e));
                        return (ModelSelectorEntry)next2;
                    }
                    return modelSelectorEntry3;
                }
            } while (!mlc.q((Object)((ModelSelectorEntry)next).a, (Object)s));
            final ModelSelectorEntry modelSelectorEntry2 = (ModelSelectorEntry)next;
            continue;
        }
    }
    
    public static final String b(String substring) {
        if (kym.O0(substring, ']')) {
            final int a1 = kym.a1((CharSequence)substring, '[', 0, 6);
            Integer value = a1;
            if (a1 < 0) {
                value = null;
            }
            if (value != null) {
                substring = substring.substring(value + 1, kym.R0((CharSequence)substring));
                if (substring.length() > 0) {
                    return substring;
                }
            }
        }
        return null;
    }
    
    public static final String c(final ThinkingState thinkingState) {
        if (thinkingState instanceof ThinkingState.EffortAndMode) {
            return ((ThinkingState.EffortAndMode)thinkingState).a;
        }
        if (thinkingState instanceof ThinkingState.Effort) {
            return ((ThinkingState.Effort)thinkingState).a;
        }
        if (!(thinkingState instanceof ThinkingState.Mode)) {
            if (!thinkingState.equals(ThinkingState.Unknown.INSTANCE)) {
                en9.r();
            }
        }
        return null;
    }
    
    public static final String d(final ThinkingState thinkingState) {
        if (thinkingState instanceof ThinkingState.EffortAndMode) {
            return ((ThinkingState.EffortAndMode)thinkingState).b;
        }
        if (thinkingState instanceof ThinkingState.Mode) {
            return ((ThinkingState.Mode)thinkingState).a;
        }
        if (!(thinkingState instanceof ThinkingState.Effort)) {
            if (!thinkingState.equals(ThinkingState.Unknown.INSTANCE)) {
                en9.r();
            }
        }
        return null;
    }
    
    public static final String e(final String s) {
        if (b(s) == null) {
            return s;
        }
        return s.substring(0, kym.a1((CharSequence)s, '[', 0, 6));
    }
}
