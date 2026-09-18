import java.lang.annotation.Annotation;
import com.anthropic.claude.api.chat.tool.ToolResultUnknown;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.tool.ToolResultImage;
import com.anthropic.claude.api.chat.tool.ToolResultImageGallery;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import com.anthropic.claude.api.chat.tool.ToolResultText;
import com.anthropic.claude.api.chat.tool.ToolResultContent;
import kotlinx.serialization.modules.a;

public final class u6o
{
    public static final u6o a;
    public static final vee b;
    
    static {
        a = (u6o)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)ToolResultContent.class));
        tze.m(v4j.a((Class)ToolResultText.class), ToolResultText.Companion.serializer());
        tze.m(v4j.a((Class)ToolResultKnowledge.class), ToolResultKnowledge.Companion.serializer());
        tze.m(v4j.a((Class)ToolResultImageGallery.class), ToolResultImageGallery.Companion.serializer());
        tze.m(v4j.a((Class)ToolResultImage.class), ToolResultImage.Companion.serializer());
        t08.D(tze, "ToolResultContent", (lta)new jkn((byte)24));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.chat.tool.ToolResultContent", v4j.a((Class)ToolResultContent.class), new rtc[] { (rtc)v4j.a((Class)ToolResultImage.class), (rtc)v4j.a((Class)ToolResultImageGallery.class), (rtc)v4j.a((Class)ToolResultKnowledge.class), (rtc)v4j.a((Class)ToolResultText.class), (rtc)v4j.a((Class)ToolResultUnknown.class) }, new KSerializer[] { (KSerializer)z6o.a, (KSerializer)b7o.a, (KSerializer)e7o.a, (KSerializer)u7o.a, (KSerializer)w7o.a }, new Annotation[] { (Annotation)new fz2((byte)10) });
    }
}
