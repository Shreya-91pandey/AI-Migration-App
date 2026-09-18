import java.lang.annotation.Annotation;
import com.anthropic.claude.api.chat.tool.UnknownDisplayContent;
import com.anthropic.claude.api.chat.tool.TextDisplayContent;
import com.anthropic.claude.api.chat.tool.MarkdownDisplayContent;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.tool.FileDisplayContent;
import com.anthropic.claude.api.chat.tool.RichLinkDisplayContent;
import com.anthropic.claude.api.chat.tool.RichItemsDisplayContent;
import com.anthropic.claude.api.chat.tool.TableDisplayContent;
import com.anthropic.claude.api.chat.tool.JsonBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.CodeBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import kotlinx.serialization.modules.a;

public final class i4o
{
    public static final i4o a;
    public static final vee b;
    
    static {
        a = (i4o)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)ToolDisplayContent.class));
        tze.m(v4j.a((Class)CodeBlockDisplayContent.class), CodeBlockDisplayContent.Companion.serializer());
        tze.m(v4j.a((Class)JsonBlockDisplayContent.class), JsonBlockDisplayContent.Companion.serializer());
        tze.m(v4j.a((Class)TableDisplayContent.class), TableDisplayContent.Companion.serializer());
        tze.m(v4j.a((Class)RichItemsDisplayContent.class), RichItemsDisplayContent.Companion.serializer());
        tze.m(v4j.a((Class)RichLinkDisplayContent.class), RichLinkDisplayContent.Companion.serializer());
        tze.m(v4j.a((Class)FileDisplayContent.class), FileDisplayContent.Companion.serializer());
        t08.D(tze, "ToolDisplayContent", (lta)new jkn((byte)14));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.chat.tool.ToolDisplayContent", v4j.a((Class)ToolDisplayContent.class), new rtc[] { (rtc)v4j.a((Class)CodeBlockDisplayContent.class), (rtc)v4j.a((Class)FileDisplayContent.class), (rtc)v4j.a((Class)JsonBlockDisplayContent.class), (rtc)v4j.a((Class)MarkdownDisplayContent.class), (rtc)v4j.a((Class)RichItemsDisplayContent.class), (rtc)v4j.a((Class)RichLinkDisplayContent.class), (rtc)v4j.a((Class)TableDisplayContent.class), (rtc)v4j.a((Class)TextDisplayContent.class), (rtc)v4j.a((Class)UnknownDisplayContent.class) }, new KSerializer[] { (KSerializer)a75.a, (KSerializer)bba.a, (KSerializer)tqc.a, (KSerializer)f6e.a, (KSerializer)hsj.a, (KSerializer)jsj.a, (KSerializer)nan.a, (KSerializer)bhn.a, (KSerializer)tqo.a }, new Annotation[] { (Annotation)new fz2((byte)9) });
    }
}
