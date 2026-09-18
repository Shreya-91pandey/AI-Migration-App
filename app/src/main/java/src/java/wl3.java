import com.anthropic.claude.api.chat.ChatConversationWithNestedMessage;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.RenderingMode;

public interface wl3
{
    default Object a(final wl3 wl3, final String s, final String s2, final Boolean b, final h07 h07) {
        final RenderingMode x = RenderingMode.x;
        final vi0 a = ((xl3)wl3).a;
        final lj0 p5 = lmf.p(1, "organizations/{organization}/chat_conversations/{chat}", "organization", s);
        p5.e("chat", s2);
        p5.h("rendering_mode", x.a());
        p5.f(Boolean.valueOf(true), "render_all_mobile_tools");
        p5.f(b, "return_dangling_human_message");
        p5.f(Boolean.valueOf(false), "include_extracted_content");
        return a.a(p5.b(), (KSerializer)ChatConversationWithNestedMessage.Companion.serializer(), (f07)h07);
    }
}
