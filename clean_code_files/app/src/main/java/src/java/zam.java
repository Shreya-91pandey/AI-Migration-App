import java.lang.annotation.Annotation;
import com.anthropic.claude.api.chat.tool.UnknownSourceMetadata;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.tool.GenericSourceMetadata;
import com.anthropic.claude.api.chat.tool.WebpageMetadata;
import com.anthropic.claude.api.chat.tool.GoogleDocMetadata;
import com.anthropic.claude.api.chat.tool.SourceMetadata;
import kotlinx.serialization.modules.a;

public final class zam
{
    public static final zam a;
    public static final vee b;
    
    static {
        a = (zam)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)SourceMetadata.class));
        tze.m(v4j.a((Class)GoogleDocMetadata.class), GoogleDocMetadata.Companion.serializer());
        tze.m(v4j.a((Class)WebpageMetadata.class), WebpageMetadata.Companion.serializer());
        tze.m(v4j.a((Class)GenericSourceMetadata.class), GenericSourceMetadata.Companion.serializer());
        t08.D(tze, "SourceMetadata", (lta)new cyl((byte)4));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.chat.tool.SourceMetadata", v4j.a((Class)SourceMetadata.class), new rtc[] { (rtc)v4j.a((Class)GenericSourceMetadata.class), (rtc)v4j.a((Class)GoogleDocMetadata.class), (rtc)v4j.a((Class)UnknownSourceMetadata.class), (rtc)v4j.a((Class)WebpageMetadata.class) }, new KSerializer[] { (KSerializer)exa.a, (KSerializer)u3b.a, (KSerializer)xqo.a, (KSerializer)hup.a }, new Annotation[] { (Annotation)new fz2((byte)7) });
    }
}
