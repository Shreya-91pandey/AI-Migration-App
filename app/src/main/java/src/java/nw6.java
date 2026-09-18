import java.lang.annotation.Annotation;
import com.anthropic.claude.api.chat.messages.BellNoteDelta;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.messages.FlagDelta;
import com.anthropic.claude.api.chat.messages.VoiceNoteDelta;
import com.anthropic.claude.api.chat.messages.ToolUseBlockUpdateDelta;
import com.anthropic.claude.api.chat.messages.ThinkingSummaryDelta;
import com.anthropic.claude.api.chat.messages.ThinkingDelta;
import com.anthropic.claude.api.chat.messages.InputJsonDelta;
import com.anthropic.claude.api.chat.messages.CitationEndDelta;
import com.anthropic.claude.api.chat.messages.CitationStartDelta;
import com.anthropic.claude.api.chat.messages.TextDelta;
import com.anthropic.claude.api.chat.messages.ContentBlockDelta;
import kotlinx.serialization.modules.a;

public final class nw6
{
    public static final nw6 a;
    public static final vee b;
    
    static {
        a = (nw6)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)ContentBlockDelta.class));
        tze.m(v4j.a((Class)TextDelta.class), TextDelta.Companion.serializer());
        tze.m(v4j.a((Class)CitationStartDelta.class), CitationStartDelta.Companion.serializer());
        tze.m(v4j.a((Class)CitationEndDelta.class), CitationEndDelta.Companion.serializer());
        tze.m(v4j.a((Class)InputJsonDelta.class), InputJsonDelta.Companion.serializer());
        tze.m(v4j.a((Class)ThinkingDelta.class), ThinkingDelta.Companion.serializer());
        tze.m(v4j.a((Class)ThinkingSummaryDelta.class), ThinkingSummaryDelta.Companion.serializer());
        tze.m(v4j.a((Class)ToolUseBlockUpdateDelta.class), ToolUseBlockUpdateDelta.Companion.serializer());
        tze.m(v4j.a((Class)VoiceNoteDelta.class), VoiceNoteDelta.Companion.serializer());
        tze.m(v4j.a((Class)FlagDelta.class), FlagDelta.Companion.serializer());
        t08.D(tze, "ContentBlockDelta", (lta)new ct6((byte)6));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.chat.messages.ContentBlockDelta", v4j.a((Class)ContentBlockDelta.class), new rtc[] { (rtc)v4j.a((Class)BellNoteDelta.class), (rtc)v4j.a((Class)CitationEndDelta.class), (rtc)v4j.a((Class)CitationStartDelta.class), (rtc)v4j.a((Class)FlagDelta.class), (rtc)v4j.a((Class)InputJsonDelta.class), (rtc)v4j.a((Class)TextDelta.class), (rtc)v4j.a((Class)ThinkingDelta.class), (rtc)v4j.a((Class)ThinkingSummaryDelta.class), (rtc)v4j.a((Class)ToolUseBlockUpdateDelta.class), (rtc)v4j.a((Class)VoiceNoteDelta.class) }, new KSerializer[] { (KSerializer)y62.a, (KSerializer)rr4.a, (KSerializer)gs4.a, (KSerializer)fha.a, (KSerializer)scc.a, (KSerializer)ygn.a, (KSerializer)ton.a, (KSerializer)vpn.a, (KSerializer)j9o.a, (KSerializer)pnp.a }, new Annotation[] { (Annotation)new fz2((byte)3) });
    }
}
