import java.lang.annotation.Annotation;
import com.anthropic.claude.api.chat.messages.UnknownContentBlock;
import com.anthropic.claude.api.chat.messages.BellNoteBlock;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.messages.FlagBlock;
import com.anthropic.claude.api.chat.messages.VoiceNoteBlock;
import com.anthropic.claude.api.chat.messages.ThinkingBlock;
import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.chat.messages.TextBlock;
import com.anthropic.claude.api.chat.messages.ContentBlock;
import kotlinx.serialization.modules.a;

public final class jw6
{
    public static final jw6 a;
    public static final vee b;
    
    static {
        a = (jw6)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)ContentBlock.class));
        tze.m(v4j.a((Class)TextBlock.class), TextBlock.Companion.serializer());
        tze.m(v4j.a((Class)ToolUseBlock.class), ToolUseBlock.Companion.serializer());
        tze.m(v4j.a((Class)ToolResultBlock.class), ToolResultBlock.Companion.serializer());
        tze.m(v4j.a((Class)ThinkingBlock.class), ThinkingBlock.Companion.serializer());
        tze.m(v4j.a((Class)VoiceNoteBlock.class), VoiceNoteBlock.Companion.serializer());
        tze.m(v4j.a((Class)FlagBlock.class), FlagBlock.Companion.serializer());
        t08.D(tze, "ContentBlock", (lta)new ct6((byte)5));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.chat.messages.ContentBlock", v4j.a((Class)ContentBlock.class), new rtc[] { (rtc)v4j.a((Class)BellNoteBlock.class), (rtc)v4j.a((Class)FlagBlock.class), (rtc)v4j.a((Class)TextBlock.class), (rtc)v4j.a((Class)ThinkingBlock.class), (rtc)v4j.a((Class)ToolResultBlock.class), (rtc)v4j.a((Class)ToolUseBlock.class), (rtc)v4j.a((Class)UnknownContentBlock.class), (rtc)v4j.a((Class)VoiceNoteBlock.class) }, new KSerializer[] { (KSerializer)w62.a, (KSerializer)dha.a, (KSerializer)ufn.a, (KSerializer)non.a, (KSerializer)s6o.a, (KSerializer)h9o.a, (KSerializer)pqo.a, (KSerializer)nnp.a }, new Annotation[] { (Annotation)new fz2((byte)2) });
    }
}
