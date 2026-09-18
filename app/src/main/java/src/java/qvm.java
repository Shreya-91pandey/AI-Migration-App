import java.lang.annotation.Annotation;
import com.anthropic.claude.api.chat.messages.c;
import com.anthropic.claude.api.chat.messages.UnknownStreamEvent;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.messages.McpAuthRequiredEvent;
import com.anthropic.claude.api.chat.messages.CompactionStatusEvent;
import com.anthropic.claude.api.chat.messages.ConversationReadyEvent;
import com.anthropic.claude.api.chat.messages.MemoryWriteFailureEvent;
import com.anthropic.claude.api.chat.messages.NoticePollHintEvent;
import com.anthropic.claude.api.chat.messages.ComposerNotice;
import com.anthropic.claude.api.chat.messages.ModelUpdateEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockRetractEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockStopEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockDeltaEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockStartEvent;
import com.anthropic.claude.api.chat.messages.MessageStopEvent;
import com.anthropic.claude.api.chat.messages.MessageLimitEvent;
import com.anthropic.claude.api.chat.messages.MessageDeltaEvent;
import com.anthropic.claude.api.chat.messages.MessageStartEvent;
import com.anthropic.claude.api.chat.messages.StreamEvent;
import kotlinx.serialization.modules.a;

public final class qvm
{
    public static final qvm a;
    public static final vee b;
    
    static {
        a = (qvm)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)StreamEvent.class));
        tze.m(v4j.a((Class)MessageStartEvent.class), MessageStartEvent.Companion.serializer());
        tze.m(v4j.a((Class)MessageDeltaEvent.class), MessageDeltaEvent.Companion.serializer());
        tze.m(v4j.a((Class)MessageLimitEvent.class), MessageLimitEvent.Companion.serializer());
        tze.m(v4j.a((Class)MessageStopEvent.class), MessageStopEvent.Companion.serializer());
        tze.m(v4j.a((Class)ContentBlockStartEvent.class), ContentBlockStartEvent.Companion.serializer());
        tze.m(v4j.a((Class)ContentBlockDeltaEvent.class), ContentBlockDeltaEvent.Companion.serializer());
        tze.m(v4j.a((Class)ContentBlockStopEvent.class), ContentBlockStopEvent.Companion.serializer());
        tze.m(v4j.a((Class)ContentBlockRetractEvent.class), ContentBlockRetractEvent.Companion.serializer());
        tze.m(v4j.a((Class)ModelUpdateEvent.class), ModelUpdateEvent.Companion.serializer());
        tze.m(v4j.a((Class)ComposerNotice.class), ComposerNotice.Companion.serializer());
        tze.m(v4j.a((Class)NoticePollHintEvent.class), NoticePollHintEvent.INSTANCE.serializer());
        tze.m(v4j.a((Class)MemoryWriteFailureEvent.class), MemoryWriteFailureEvent.Companion.serializer());
        tze.m(v4j.a((Class)ConversationReadyEvent.class), ConversationReadyEvent.Companion.serializer());
        tze.m(v4j.a((Class)CompactionStatusEvent.class), CompactionStatusEvent.Companion.serializer());
        tze.m(v4j.a((Class)McpAuthRequiredEvent.class), McpAuthRequiredEvent.Companion.serializer());
        t08.D(tze, "StreamEvent", (lta)new cyl((byte)19));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.chat.messages.StreamEvent", v4j.a((Class)StreamEvent.class), new rtc[] { (rtc)v4j.a((Class)CompactionStatusEvent.class), (rtc)v4j.a((Class)ComposerNotice.class), (rtc)v4j.a((Class)ContentBlockDeltaEvent.class), (rtc)v4j.a((Class)ContentBlockRetractEvent.class), (rtc)v4j.a((Class)ContentBlockStartEvent.class), (rtc)v4j.a((Class)ContentBlockStopEvent.class), (rtc)v4j.a((Class)ConversationReadyEvent.class), (rtc)v4j.a((Class)McpAuthRequiredEvent.class), (rtc)v4j.a((Class)MemoryWriteFailureEvent.class), (rtc)v4j.a((Class)MessageDeltaEvent.class), (rtc)v4j.a((Class)MessageLimitEvent.class), (rtc)v4j.a((Class)MessageStartEvent.class), (rtc)v4j.a((Class)MessageStopEvent.class), (rtc)v4j.a((Class)ModelUpdateEvent.class), (rtc)v4j.a((Class)NoticePollHintEvent.class), (rtc)v4j.a((Class)UnknownStreamEvent.class) }, new KSerializer[] { (KSerializer)c.a, (KSerializer)xi6.a, (KSerializer)ow6.a, (KSerializer)sw6.a, (KSerializer)uw6.a, (KSerializer)yw6.a, (KSerializer)h67.a, (KSerializer)vfe.a, (KSerializer)nye.a, (KSerializer)b3f.a, (KSerializer)x5f.a, (KSerializer)u7f.a, (KSerializer)w7f.a, (KSerializer)yff.a, (KSerializer)new xd9("notice_poll_hint", NoticePollHintEvent.INSTANCE, new Annotation[] { (Annotation)new fz2((byte)8) }), (KSerializer)zqo.a }, new Annotation[] { (Annotation)new fz2((byte)8) });
    }
}
