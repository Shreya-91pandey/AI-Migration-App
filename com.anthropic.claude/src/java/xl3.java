import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.UpdateChatRequest;
import com.anthropic.claude.api.chat.RecordToolResultRequest;
import com.anthropic.claude.api.chat.RecordToolApprovalRequest;
import com.anthropic.claude.api.chat.MoveChatsResponse;
import com.anthropic.claude.api.chat.MoveChatsRequest;
import com.anthropic.claude.api.chat.ChatFeedback;
import com.anthropic.claude.api.chat.ChatFeedbackRequest;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.ChatCompletionRequest;

public final class xl3 implements wl3
{
    public final vi0 a;
    public final n7g b;
    
    public xl3(final vi0 a, final n7g b) {
        this.a = a;
        this.b = b;
    }
    
    public final sej b(final String s, final String s2, final String s3, final ChatCompletionRequest chatCompletionRequest) {
        final lj0 p4 = lmf.p(2, s, "organization", s2);
        p4.e("chat", s3);
        p4.c("Accept", "text/event-stream");
        p4.d((Object)chatCompletionRequest, (KSerializer)ChatCompletionRequest.Companion.serializer());
        return this.b.a(p4.b());
    }
    
    public final Object c(final String s, final String s2, final String s3, final ChatFeedbackRequest chatFeedbackRequest, final h07 h07) {
        final lj0 p5 = lmf.p(2, "organizations/{organization}/chat_conversations/{chat}/chat_messages/{message}/chat_feedback", "organization", s);
        p5.e("chat", s2);
        p5.e("message", s3);
        p5.d((Object)chatFeedbackRequest, (KSerializer)ChatFeedbackRequest.Companion.serializer());
        return this.a.a(p5.b(), (KSerializer)k8e.v(ChatFeedback.Companion.serializer()), (f07)h07);
    }
    
    public final Object d(final String s, final MoveChatsRequest moveChatsRequest, final h07 h07) {
        final lj0 p3 = lmf.p(2, "organizations/{organization}/chat_conversations/move_many", "organization", s);
        p3.d((Object)moveChatsRequest, (KSerializer)MoveChatsRequest.Companion.serializer());
        return this.a.a(p3.b(), (KSerializer)MoveChatsResponse.Companion.serializer(), (f07)h07);
    }
    
    public final Object e(final String s, final String s2, final RecordToolApprovalRequest recordToolApprovalRequest, final h07 h07) {
        final lj0 p4 = lmf.p(2, "organizations/{organization}/chat_conversations/{chat}/tool_approval", "organization", s);
        p4.e("chat", s2);
        p4.d((Object)recordToolApprovalRequest, (KSerializer)RecordToolApprovalRequest.Companion.serializer());
        return this.a.a(p4.b(), (KSerializer)mqo.b, (f07)h07);
    }
    
    public final Object f(final String s, final String s2, final RecordToolResultRequest recordToolResultRequest, final h07 h07) {
        final lj0 p4 = lmf.p(2, "organizations/{organization}/chat_conversations/{chat}/tool_result", "organization", s);
        p4.e("chat", s2);
        p4.d((Object)recordToolResultRequest, (KSerializer)RecordToolResultRequest.Companion.serializer());
        return this.a.a(p4.b(), (KSerializer)mqo.b, (f07)h07);
    }
    
    public final Object g(final String s, final String s2, final UpdateChatRequest updateChatRequest, final h07 h07) {
        final lj0 p4 = lmf.p(3, "organizations/{organization}/chat_conversations/{chat}", "organization", s);
        p4.e("chat", s2);
        p4.d((Object)updateChatRequest, (KSerializer)UpdateChatRequest.Companion.serializer());
        return this.a.a(p4.b(), (KSerializer)mqo.b, (f07)h07);
    }
    
    public final Object h(final String s, final okf okf, final h07 h07) {
        final lj0 p3 = lmf.p(2, "{organization}/upload", "organization", s);
        sbr.k(p3, lq6.X((Object)okf));
        return this.a.a(p3.b(), (KSerializer)MessageFile.Companion.serializer(), (f07)h07);
    }
}
