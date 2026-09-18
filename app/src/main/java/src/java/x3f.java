import java.lang.annotation.Annotation;
import com.anthropic.claude.api.chat.MessageUnknownFile;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.api.chat.MessageFile;
import kotlinx.serialization.modules.a;

public final class x3f
{
    public static final x3f a;
    public static final vee b;
    
    static {
        a = (x3f)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)MessageFile.class));
        tze.m(v4j.a((Class)MessageImageFile.class), MessageImageFile.Companion.serializer());
        tze.m(v4j.a((Class)MessageDocumentFile.class), MessageDocumentFile.Companion.serializer());
        tze.m(v4j.a((Class)MessageBlobFile.class), MessageBlobFile.Companion.serializer());
        t08.D(tze, "MessageFile", (lta)new gfe((byte)5));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.chat.MessageFile", v4j.a((Class)MessageFile.class), new rtc[] { (rtc)v4j.a((Class)MessageBlobFile.class), (rtc)v4j.a((Class)MessageDocumentFile.class), (rtc)v4j.a((Class)MessageImageFile.class), (rtc)v4j.a((Class)MessageUnknownFile.class) }, new KSerializer[] { (KSerializer)u1f.a, (KSerializer)f3f.a, (KSerializer)m5f.a, (KSerializer)a8f.a }, new Annotation[] { (Annotation)new fz2((byte)6) });
    }
}
