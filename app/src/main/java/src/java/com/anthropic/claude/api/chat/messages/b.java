package com.anthropic.claude.api.chat.messages;

import kotlinx.serialization.KSerializer;

public final class b
{
    public final KSerializer serializer() {
        return (KSerializer)CompactionStatus.Status.v.getValue();
    }
}
