package com.anthropic.claude.api.chat.messages;

import kotlinx.serialization.KSerializer;

@jzk
public final class NoticePollHintEvent implements StreamEvent
{
    public static final NoticePollHintEvent INSTANCE;
    public static final d2d a;
    
    static {
        INSTANCE = (NoticePollHintEvent)new Object();
        a = ncq.F(2, (jta)new mff((byte)6));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || o instanceof NoticePollHintEvent;
    }
    
    @Override
    public final int hashCode() {
        return 2019713947;
    }
    
    public final KSerializer serializer() {
        return (KSerializer)NoticePollHintEvent.a.getValue();
    }
    
    @Override
    public final String toString() {
        return "NoticePollHintEvent";
    }
}
